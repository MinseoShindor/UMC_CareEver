package com.example.umc_careever

import androidx.room.*

@Dao
interface HelpDao {
    @Insert
    fun insert(help: Help)

    @Update
    fun update(help: Help)

    @Delete
    fun delete(help: Help)

    @Query("SELECT * FROM HelpTable")
    fun getHelps(): List<Help>

    @Query("SELECT * FROM HelpTable WHERE id = :id")
    fun getHelp(id: Int): Help

    @Query("SELECT * FROM HelpTable WHERE date = :date")
    fun getHelp(date: String): Help

    @Query("UPDATE HelpTable SET isLike= :isLike WHERE id = :id")
    fun updateIsLikeById(isLike: Boolean,id: Int)

    @Query("SELECT * FROM HelpTable WHERE isLike= :isLike")
    fun getLikedSongs(isLike: Boolean): List<Help>
}