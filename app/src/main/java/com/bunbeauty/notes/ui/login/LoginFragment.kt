package com.bunbeauty.notes.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bunbeauty.notes.R
import com.bunbeauty.notes.databinding.FragmentLoginBinding
import com.bunbeauty.notes.ui.base.BaseFragment

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    val loginViewModel: LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentLoginBtnLogin.setOnClickListener {
           if (binding.fragmentLoginEtLogin.text.toString().isEmpty()) {
               showSnackbar("empty username", R.color.white, R.color.red)
               return@setOnClickListener
           }
            if (binding.fragmentLoginEtPassword.text.toString().isEmpty()) {
               showSnackbar("empty password", R.color.white, R.color.red)
                return@setOnClickListener
           }


            val isLogin = loginViewModel.login(
                binding.fragmentLoginEtLogin.text.toString(),
                binding.fragmentLoginEtPassword.text.toString()
            )

            if (isLogin)
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToNotesFragment())
            else
                showSnackbar("invalid username or password", R.color.white, R.color.red)
        }

    }


}