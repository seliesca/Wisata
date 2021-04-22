package com.example.constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk edittext
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Membuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar) {
            //Method untuk memanggil activity "ActivityDaftar"
            Intent i = new Intent(getApplicationContext(), ActivityDaftar.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnlogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignIn);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //mengeset email yang benar
                String email = "seliesca@mail.com";

                //mengeset password yang benar
                String pass = "123";

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
                        //membuat variabel toast dan menampilkan pesan "login Sukses"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);

                        //menampilkan toast
                        t.show();

                        //membuat objek bundle
                        Bundle b = new Bundle();

                        //memasukkan value dari variabel nama dengan kunci "a"
                        // dan di masukkan ke dalam bundle
                        b.putString("a", nama.trim());

                        //memasukkan value dari variabel password dengan kunci "b"
                        //dan di masukkan ke dalam bundle
                        b.putString("b", password.trim());

                        //membuat objek intent berpindah activity dari mainactivity ke Home_activity
                        Intent i = new Intent(getApplicationContext(), Home_Activity.class);

                        //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                        //Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                        //memasukkan bundle kedalam intent untuk di kirimkan ke ActivityHasil
                        i.putExtras(b);

                        //berpindah ke activity hasil
                        startActivity(i);
                    } else {
                        //membuat variabel toast dan membuat toast dan menampilan "Login Gagal"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        //menampilkan toast
                        t.show();
                    }




                }
            }
        });
    }
}