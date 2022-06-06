package com.bunbeauty.notes.domain.login

interface ILoginUseCase {
    fun invoke(username:String, password:String): Boolean
}