package com.styephenwilliam.gd3_1_e_9590;

import java.util.ArrayList;

public class DaftarMahasiswa {

    public ArrayList<Mahasiswa> MAHASISWA;

    public DaftarMahasiswa(){
        MAHASISWA = new ArrayList();
        MAHASISWA.add(PANDE);
        MAHASISWA.add(NATTE);
        MAHASISWA.add(ANDRE);
    }

    public static final Mahasiswa PANDE = new Mahasiswa("170709153",
            "Pande Nyoman Pradnya Darsana", "FTI", "Informatika",
            3.1, "Adventure");
    public static final Mahasiswa NATTE = new Mahasiswa("170709186",
            "Natte Vagonting Omang", "FTI", "Teknik Industri",
            3.3, "Hiking");
    public static final Mahasiswa ANDRE = new Mahasiswa("170709115",
            "Andre Rossi Mandiri", "FT", "Teknik Arsitektur",
            3.2, "Desain");
}
