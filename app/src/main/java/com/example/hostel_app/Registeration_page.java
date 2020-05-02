package com.example.hostel_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class Registeration_page extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Button submit;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hosteluser temp = new Hosteluser();
                text=findViewById(R.id.email);
                temp.setEmail(text.getText().toString().trim());
                text=findViewById(R.id.name);
                temp.setName(text.getText().toString().trim());
                text=findViewById(R.id.mobile);
                temp.setMobile(text.getText().toString().trim());
                temp.setResident(false);
                temp.setRoom("");
                text=findViewById(R.id.store_pass);
                temp.setPassword(text.getText().toString());
                db.collection("users").add(temp);
                HashMap <String,String> xxx=new HashMap<>();
                xxx.put("Password",temp.getPassword());
                db.collection("credentials").document(temp.getEmail()).set(xxx);
                finish();
            }
        });
    }
}
