package com.styephenwilliam.gd3_1_e_9590;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.styephenwilliam.gd3_1_e_9590.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mahasiswa> ListMahasiswa;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ListMahasiswa = new DaftarMahasiswa().MAHASISWA;
        binding.setMhs(ListMahasiswa.get(0));
    }
}