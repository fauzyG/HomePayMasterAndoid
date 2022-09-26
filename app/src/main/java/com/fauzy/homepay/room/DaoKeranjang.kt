package com.fauzy.homepay.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Update
import com.fauzy.homepay.model.Produk
import androidx.room.Query as Query1



@Dao
interface DaoKeranjang {

    @Insert(onConflict = REPLACE)
    fun insert(data: Produk)

    @Delete
    fun delete(data: Produk)

    @Delete
    fun delete(data: List<Produk>)

    @Update
    fun update(data: Produk): Int

    @Query1("SELECT * from keranjang  ORDER BY id ASC")
    fun getAll(): List<Produk>

    @Query1("SELECT * from keranjang WHERE id = :id LIMIT 1")
    fun getProduk(id: Int): Produk

    @Query1("DELETE FROM keranjang WHERE id = :id")
    fun deleteById(id: String): Int

    @Query1("DELETE FROM keranjang")
    fun deleteAll(): Int
}