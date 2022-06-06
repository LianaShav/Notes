package com.bunbeauty.notes.domain.login

class LoginUseCase : ILoginUseCase {
    private val correctUsername:String="Liana228"
    private val correctPassword:String="fm19002"
    override fun invoke(username: String, password: String) : Boolean{
        return correctUsername==username && correctPassword==password
    }
}