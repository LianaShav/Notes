package com.bunbeauty.notes.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
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

}