package com.fauzy.homepay.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by Tisto on 1/20/2021.
 */

@Entity(tableName = "alamat")
class Alamat {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idTb")
    var idTb = 0

    var id = 0
    var name = ""
    var phone = ""
    var type = ""
    var alamat = ""

    var id_provinsi = 0
    var id_kota = 0
    var id_kecamatan = 0
    var provinsi = ""
    var kota = ""
    var kecamatan = ""
    var kodepos = ""
    var isSelected = false
}