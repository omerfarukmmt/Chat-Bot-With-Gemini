package com.example.chatbotwithgemini

import android.graphics.Bitmap
import com.example.chatbotwithgemini.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)