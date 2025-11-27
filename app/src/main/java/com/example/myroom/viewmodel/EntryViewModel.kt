package com.example.myroom.viewmodel



class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    /**
     * Berisi status Siswa saat ini
     */
    var uiStateSiswa by mutableStateOf(value = UIStateSiswa())
        private set

    /* Fungsi untuk memvalidasi input */
    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa) : Boolean {
        return with(receiver = uiState) {
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }
