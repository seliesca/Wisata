package com.example.constraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    //Deklarasikan variabel dengan jenis data context
    Context mContext;

    //deklarasikan variabel dengan jenis data Layout inflater
    LayoutInflater inflater;

    //deklarasikan variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arrayList;

    public ListViewAdapter(Context context ) {
        //memberi nilai mContext dengan context
        mContext = context;

        //mengatur LayoutInflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //memberikan nilai arrayList dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        //menambahkan semua elemen ke arraylist
        this.arrayList.addAll(Home_Activity.classNamaArrayList);
    }

    //membuat class untuk mendeklarasikan tempat untuk meletakkan isi kedalam listview
    public class ViewHolder {
        //mendeklarasikan variabel dengan jenis textview
        TextView name;
    }

    @Override
    public int getCount() {
        //mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }

    //fungsi ini digunakan untuk mendapatkan data item yang terkait dengan posisi
    //tertentu dalam kumpulan data untuk mendapatkan data yang sesuai dari lokasi
    //tertentu dalam pengumpulan data item
    @Override
    public Object getItem(int i) {
        //mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }

   //fungsi mengembalikan nilai dari posisi item adapter
    //ditampilkan atau akan ditampilkan
    @Override
    public long getItemId(int i) {
        return i;
    }

    //fungsi ini secara otomatis dipanggil ketika tampilan item list siap untuk
    //ditampilkan atau akan di tampilkan
    @Override
    public View getView(int i, View view, ViewGroup ViewGroup) {
        //deklarasi variabel dengan jenis data Viewholder
        final ViewHolder holder;

        //membuat kondisi apakah view null atau tidak
        if (view == null) {

            //membuat objek view holder
            holder = new ViewHolder();

            //mengatur layout untuk menampilkan item
            view = inflater.inflate(R.layout.item_listview,null);

            //set id untuk textview
            holder.name = (TextView)view.findViewById(R.id.tvnama_item);

            //menyimpan data dalam tampilan tanpa mengggunakan struktur data lain
            view.setTag(holder);
        }else {
            //mengatur holder untuk mengembalikan nilai dari view tag
            holder = (ViewHolder) view.getTag();
        }
        //set item ke TextViews
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());

        //mengembalikan nilai ke variabel view
        return view;

    }
}
