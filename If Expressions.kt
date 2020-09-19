fun main () {
    val NilaiDiatasKkm = 80
    val NilaiDibawahKkm = 60
    val nilai: String
    nilai = if (NilaiDibawahKkm > 68) {
        "Selamat ya! "
    } else if (NilaiDibawahKkm > NilaiDiatasKkm) {
        "Nilai kamu 80, selamat ya! "
    } else {
        "Nilai kamu 60, silahkan ikuti remidial."
    }
    print(nilai)
}