 package com.example.excersice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



 public class MainActivity extends AppCompatActivity {
     Button slogin;
     EditText edemail, edpassword;
     String nama, password;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);


         slogin = findViewById(R.id.login);
         edemail = findViewById(R.id.temail);
         edpassword = findViewById(R.id.pass);

         slogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 String nama = edemail.getText().toString();

                 String password = edpassword.getText().toString();

                 String email = "admin@mail.com";
                 String pass = "123456";

                 //mangacek apakah edittext email dan password terdapat isi atau tidak
                 if (nama.isEmpty() || password.isEmpty()) {
                     //membuat variabel toast dan menampilkan pesan "edittext tidak boleh kosong"
                     Toast t = Toast.makeText(getApplicationContext(),
                             "Email dan Password Wajib di isi !!!",
                             Toast.LENGTH_LONG);
                     //menampilkan toast
                     t.show();
                 } else {

                     //mengecek apakah isi dari email dan password sudah sama dengan email dan
                     //password yang sudah di set
                     if (nama.equals(email) && password.equals(pass)) {

                         Toast t = Toast.makeText(getApplicationContext(),
                                 "Login Sukses",
                                 Toast.LENGTH_LONG);

                         t.show();

                     } else {

                         Toast t = Toast.makeText(getApplicationContext(),
                                 "Login Gagal", Toast.LENGTH_LONG);

                         t.show();
                     }
                 }
             }
         });
     }
 }
