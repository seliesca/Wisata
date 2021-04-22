package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data textView
    TextView txemail, txpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //menghubungkan variabel txEmail dengan componen textview pada layout
        txemail = findViewById(R.id.tvemail);

        //menghubungkan variabel txEmail dengan componen textview pada layout
        txpassword = findViewById(R.id.tvpassword);

        //membuat objek bundle dan mengambil data yang di kirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunkan untuk menyimpan  data yang
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



