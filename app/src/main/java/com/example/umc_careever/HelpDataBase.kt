package com.example.umc_careever

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Help::class], version = 1)
abstract class HelpDataBase: RoomDatabase() {
    abstract fun HelpDao() : HelpDao

    companion object {
        private var instance: HelpDataBase? = null

        @InternalCoroutinesApi
        @Synchronized
        fun getInstance(context: Context): HelpDataBase? {
            if(instance == null) {
                synchronized(HelpDataBase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HelpDataBase::class.java,
                        "help-database"
                    ).allowMainThreadQueries().build()
                }
            }
            return instance
        }
    }
}