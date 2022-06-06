package com.bunbeauty.notes.ui.login

import androidx.lifecycle.ViewModel
import com.bunbeauty.notes.domain.login.ILoginUseCase
import com.bunbeauty.notes.domain.login.LoginUseCase

class LoginViewModel :ViewModel() {

   private var iLoginUseCase: ILoginUseCase = LoginUseCase()

    fun login(username:String, password:String):Boolean{
        return iLoginUseCase.invoke(username, password)
    }
}