package com.example.hostel_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

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
                temp.setEmail(text.getText().toString());
                text=findViewById(R.id.name);
                temp.setName(text.getText().toString());
                text=findViewById(R.id.mobile);
                temp.setMobile(text.getText().toString());
                temp.setResident(false);
                temp.setRoom("");
                db.collection("users").add(temp);
//                Toast.makeText(getApplicationContext(),temp.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
