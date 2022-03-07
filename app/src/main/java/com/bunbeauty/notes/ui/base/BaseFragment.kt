package com.bunbeauty.notes.ui.base

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.View.TEXT_ALIGNMENT_CENTER
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.bunbeauty.notes.R
import com.google.android.material.snackbar.Snackbar
import java.lang.reflect.ParameterizedType

abstract class BaseFragment<B : ViewBinding> : Fragment() {
    var fragment: String = ""
    private var mutableBinding: B? = null
    val binding: B
        get() = checkNotNull(mutableBinding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mutableBinding = createBindingInstance(inflater, container)
        return mutableBinding?.root

    }
    @Suppress("UNCHECKED_CAST")
    protected open fun createBindingInstance(inflater: LayoutInflater, container: ViewGroup?): B {
        val viewBindingClass =
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<B>
        val method = viewBindingClass.getMethod(
            "inflate",
            LayoutInflater::class.java,
            ViewGroup::class.java,
            Boolean::class.java
        )

        return method.invoke(null, inflater, container, false) as B
    }

    fun showSnackbar(errorMessage: String, textColorId: Int, backgroundColorId: Int) {
        val snack = Snackbar.make(binding.root, errorMessage, Snackbar.LENGTH_SHORT)
            .setBackgroundTint(ContextCompat.getColor(requireContext(), backgroundColorId))
            .setTextColor(ContextCompat.getColor(requireContext(), textColorId))
            .setActionTextColor(ContextCompat.getColor(requireContext(), textColorId))
        val layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
            gravity = Gravity.TOP
            setMargins(16, 16, 16, 0)
        }
        with(snack) {
            view.layoutParams = layoutParams
            view.findViewById<TextView>(R.id.snackbar_text).textAlignment = TEXT_ALIGNMENT_CENTER
            show()
        }
    }
}