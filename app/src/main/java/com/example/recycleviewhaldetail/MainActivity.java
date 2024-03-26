package com.example.recycleviewhaldetail;

import static com.example.recycleviewhaldetail.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);




        List<student> items = new ArrayList<>();
        items.add(new student("Abmi Sukma Edri","1205012o0341","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.abmi));
        items.add(new student("Ahmad Kurniawan","12250111514","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.ahmad));
        items.add(new student("Aufa Hajati","12250120338","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.aufa));
        items.add(new student("Daffa Finanda","12250111603","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.dafin));
        items.add(new student("Daffa Ikhwan Nurfauzan","12250110979","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.daffa));
        items.add(new student("Dwi Jelita Adhliyah","12250120331","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.jelita));
        items.add(new student("Dwi Mahdini","12250111298","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.mahdi));
        items.add(new student("Fajri ","12250110382","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.fajri));
        items.add(new student("Fakhri","12250111381","Mahasiswa Uin Suska Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.fakhri));
        items.add(new student("Farras Lathief","12250111328","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.faras));
        items.add(new student("Gilang Ramadhan Indra","12250111323","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.gilang));
        items.add(new student("Hafidz Alhadid Rahman","12250111794","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.hafiz));
        items.add(new student("Haritsah Naufaldy","12250110361","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.aldy));
        items.add(new student("M. Nabil Dawami ","12250111527","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.nabil));
        items.add(new student("Muh. Zaki Erbai Syas","12250111134","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.zaki));
        items.add(new student("Muhammad Aditya Rinaldi ","12250111048","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.adit));
        items.add(new student("Muhammad Dhimas Hadid Fahrezi","12250111231","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.dimas));
        items.add(new student("Muhammad Faruq","12250111791","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.faruq));
        items.add(new student("Muhammad Rafly Wirayudha","12250111489","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.rafly));
        items.add(new student("Nurika Dwi Wahyuni","12250120360","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.nurika));
        items.add(new student("Ogya Secio Noegroho.s ","12250111346","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.ogik));
        items.add(new student("Rahma Laksita","12250124357","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.rahma));
        items.add(new student("Surya Hidayatullah Firdaus","2250111759","Mahasiswa Universitas Islam Negeri Sultan Syarif Kasim Riau Jurusan Teknik Informatika dan sekarang menempuh pendidikan di semester 4", drawable.surya));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        liststudentadapter liststudentadapter= new liststudentadapter(this, items);
        recyclerView.setAdapter(liststudentadapter);
        liststudentadapter.setOnItemClickCallback(new liststudentadapter.OnItemClickCallback() {

            @Override
            public void onItemClicked (student student) {
                Intent moveIntent = new Intent(MainActivity.this, haldetail.class);
                moveIntent.putExtra(haldetail.ITEM_EXTRA, student);
                startActivity(moveIntent);
            }
        });
    }
}


