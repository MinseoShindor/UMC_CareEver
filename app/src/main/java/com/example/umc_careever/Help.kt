package com.example.umc_careever

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "HelpTable")
data class Help(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var title: String? = "",
    var group: String? = "",
    var date: String? = "",
//    var isLike: Boolean? = false,
)
