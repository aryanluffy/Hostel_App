package com.example.hostel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Complaints_Activity extends AppCompatActivity {
    public boolean isInternetAvailable() {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
            // Log error
        }
        return false;
    }
    Button button;
    EditText text;
    FirebaseFirestore db=FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaints_);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable()==false){
                    Toast.makeText(getApplicationContext(),"Please check your internet connection.",Toast.LENGTH_SHORT);
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Your response has been taken. Your query will be resolved within a week.",
                            Toast.LENGTH_SHORT).show();
                    Complaint temp=new Complaint();
                    text=findViewById(R.id.textView5);
                    temp.setSubject(text.getText().toString().trim());
                    text=findViewById(R.id.textView6);
                    temp.setDescription(text.getText().toString().trim());
                    db.collection("complaints").add(temp);
                    finish();
                }
            }
        });
    }
}
