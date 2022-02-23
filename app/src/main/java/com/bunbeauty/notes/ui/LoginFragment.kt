package com.bunbeauty.notes.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bunbeauty.notes.databinding.FragmentLoginBinding
import com.bunbeauty.notes.ui.base.BaseFragment
import com.bunbeauty.notes.view_model.LoginViewModel

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    val loginViewModel:LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    
}