package com.example.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
    fun getOtherMessage(name: String, num: Int): MessageEntity
}
