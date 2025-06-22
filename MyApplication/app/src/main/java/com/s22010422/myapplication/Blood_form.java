package com.s22010422.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Blood_form extends AppCompatActivity {

    DatabaseHelper myDb;

    EditText editname, editage, editbirth, editphone, editemail, editaddress, editcity, edittype, editterm, editillness;

    Button btnregister;
    Button btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blood_form);

        myDb = new DatabaseHelper(this);

        editname = findViewById(R.id.editname);
        editage = findViewById(R.id.editage);
        editbirth = findViewById(R.id.editbirth);
        editphone = findViewById(R.id.editphone);
        editemail = findViewById(R.id.editemail);
        editaddress = findViewById(R.id.editaddress);
        editcity = findViewById((R.id.editcity);
        edittype = findViewById((R.id.edittype);
        editterm = findViewById((R.id.editterm);
        editillness = findViewById((R.id.editillness);
        btnregister = findViewById(R.id.buttonregister);
        btncancel = findViewById((R.id.buttoncancel);
    }
}