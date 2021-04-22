package com.example.constraintlayout;

import android.os.Bundle;
import android.widget.TextView;
import  androidx.appcompat.app.AppCompatActivity;


public class ActivityKedua extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data textview
    TextView txemail, txpassword;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan variabel txEmail dengan componen TextView pada Layout
        txemail = findViewById(R.id.tvemail);

        //menghubungkan variabel txemail dengan Componen textview pada layout
        txpassword = findViewById(R.id.tvpassword);

        //mendelkarasikan variabel bundle yang akan di gunakan untuk mengambil
        //pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunkaan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txemail.setText(email);

        //menampilkan value dari variabel pass kedalam txPassword
        txpassword.setText(pass);
    }
}