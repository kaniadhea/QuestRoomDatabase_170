package com.example.roomlocaldb.ui.viewmodel

import com.example.praktikum8.ui.viewmodel.MahasiswaEvent
import com.example.roomlocaldb.data.entity.Mahasiswa


class DetailMhsViewModel(

)

fun Mahasiswa.toDetailUiEvent() : MahasiswaEvent {
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}



