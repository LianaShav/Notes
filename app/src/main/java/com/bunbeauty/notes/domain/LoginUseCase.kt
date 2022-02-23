package com.bunbeauty.notes.domain

class LoginUseCase :ILoginUseCase{
    private val correctUsername:String="Liana228"
    private val correctPassword:String="fm19002"
    override fun login(username: String, password: String) : Boolean{
        return correctUsername==username && correctPassword==password
    }
}