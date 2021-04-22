package com.example.excersice1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.os.PersistableBundle;

import com.example.excersice1.R;

public class LihatData {
    public class ActivityLihatData extends AppCompatActivity {

        //Deklarasi variabel dengan jenis data TextView
        TextView tvnama, tvnomor;

        String nama;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.'activity_data');

            Bundle bundle = getIntent().getExtras();
            nama = bundle.getString("a");

            //menghubungkan variabel txEmail dengan componen TextView pada Layout
            tvnama = (TextView) findViewById(R.id.tvNamaKontak);

            //menghubungkan variabel txemail dengan Componen textview pada layout
            tvnomor = (TextView) findViewById(R.id.tvNomorTelepon);

            switch (nama) {
                case "Inayah":
                    tvnama.setText("Inayah M");
                    tvnomor.setText("082168978978");
                    break;
                case "Ilham":
                    tvnama.setText("Ilham R");
                    tvnomor.setText("085267536124");
                    break;
                case "Aris":
                    tvnama.setText("Aris J");
                    tvnomor.setText("081235467589");
                    break;
                case "Fikri":
                    tvnama.setText("M Fikri");
                    tvnomor.setText("081246789024");
                    break;
                case "Maul":
                    tvnama.setText("Maul M");
                    tvnomor.setText("081245678290");
                    break;
                case "Intan":
                    tvnama.setText("Intan S");
                    tvnomor.setText("082145367489");
                    break;
                case "Vina":
                    tvnama.setText("Vina R");
                    tvnomor.setText("082134697845");
                    break;
                case "Gita":
                    tvnama.setText("Gita S");
                    tvnomor.setText("082256413867");
                    break;
                case "Lutfi":
                    tvnama.setText("Lutfi M");
                    tvnomor.setText("082145321567");
                    break;
                case "Vian":
                    tvnama.setText("Vian M");
                    tvnomor.setText("082145637892");
                    break;
            }

        }
    }
}
