package com.example.myroom.view.route

import com.example.myroom.R // <-- Import the R class

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"

    // Use the integer ID from R.string instead of a hardcoded string
    override val titleRes = R.string.entry_siswa
}
