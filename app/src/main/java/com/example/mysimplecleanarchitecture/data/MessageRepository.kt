package com.example.mysimplecleanarchitecture.data

import com.example.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
    override fun getOtherMessage(name: String, num: Int) =
        messageDataSource.getMessageFromSource(name + num.toString())
}
