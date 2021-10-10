package com.example.seminar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //bundle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("tagCautare","Found.");
        Log.e("tagCautare","Found. Error");
        Log.i("tagCautare","Found. Info");
        Log.d("tagCautare","Found. Debug");

        //clasa Toast trimite mesaje pe telefon
        //parametrii: context(activitate), mesaj, durata mesajului
        Toast.makeText(this,"Prima mea aplicatie", Toast.LENGTH_LONG).show();
    }
}