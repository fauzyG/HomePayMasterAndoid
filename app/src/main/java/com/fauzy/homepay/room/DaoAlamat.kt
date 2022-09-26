package com.fauzy.homepay.room

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.fauzy.homepay.model.Alamat
import androidx.room.Query as Query1



@Dao
interface DaoAlamat {

    @Insert(onConflict = REPLACE)
    fun insert(data: Alamat)

    @Delete
    fun delete(data: Alamat)

    @Update
    fun update(data: Alamat): Int

    @Query1("SELECT * from alamat ORDER BY id ASC")
    fun getAll(): List<Alamat>

    @Query1("SELECT * FROM alamat WHERE id = :id LIMIT 1")
    fun getProduk(id: Int): Alamat

    @Query1("SELECT * FROM alamat WHERE isSelected = :status LIMIT 1")
    fun getByStatus(status: Boolean): Alamat?

    @Query1("DELETE FROM alamat")
    fun deleteAll(): Int
}