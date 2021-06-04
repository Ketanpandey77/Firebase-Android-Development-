package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button btnSave;
    EditText etText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave=findViewById(R.id.btnSave);
        etText=findViewById(R.id.etText);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String note=etText.getText().toString();
                Log.d("Fire",FirebaseDatabase.getInstance().getReference().toString());
                FirebaseDatabase.getInstance().getReference(note);
            }
        });
    }
}