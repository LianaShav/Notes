package com.bunbeauty.notes.view_model

import androidx.lifecycle.ViewModel
import com.bunbeauty.notes.domain.ILoginUseCase
import com.bunbeauty.notes.domain.LoginUseCase

class LoginViewModel :ViewModel() {

   private var iLoginUseCase: ILoginUseCase=LoginUseCase()

    fun login(username:String, password:String):Boolean{
        return iLoginUseCase.login(username, password)
    }
}