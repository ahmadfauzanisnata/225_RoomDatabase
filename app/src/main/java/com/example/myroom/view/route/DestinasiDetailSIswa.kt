package com.example.myroom.view.route

import com.example.myroom.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "item_detail"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}