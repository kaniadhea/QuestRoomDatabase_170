package com.example.roomlocaldb.ui.navigation

interface AlamatNavigasi {
    val route : String
}

object DestinasiHome : AlamatNavigasi {
    override val route = "home"
}

object  DestinasiUpdate : AlamatNavigasi{
    override val route ="update"
    const val NIM ="nim"
    val routesWithArg = "$route/{$NIM}"
}