package com.bunbeauty.notes.domain

interface ILoginUseCase {
    fun login(username:String, password:String): Boolean
}