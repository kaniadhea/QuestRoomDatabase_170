package com.example.roomlocaldb.repository

import com.example.roomlocaldb.data.dao.MahasiswaDao
import com.example.roomlocaldb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
    //getAllMhs
    override fun getAllMhs() : Flow<List<Mahasiswa>>{
        return mahasiswaDao.getAllMahasiswa()
    }
    override fun getMhs(nim: String) : Flow<Mahasiswa>{
        return mahasiswaDao.getMhs(nim)
    }
    override suspend fun deleteMhs(mahasiswa: Mahasiswa){
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }
    override suspend fun  updateMhs(mahasiswa:Mahasiswa){
        mahasiswaDao.updateMahasiswa(mahasiswa)
    }
}

