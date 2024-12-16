package com.example.roomlocaldb.ui.viewmodel


import com.example.roomlocaldb.data.entity.Mahasiswa
import com.example.roomlocaldb.repository.RepositoryMhs


class HomeMhsViewModel (
    private val repositoryMhs: RepositoryMhs
)

data class HomeUiState (
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading : Boolean = false,
    val isError: Boolean = false,
    val errorMessage : String = ""

)

