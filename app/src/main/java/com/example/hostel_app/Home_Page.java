package com.example.hostel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class Home_Page extends AppCompatActivity {
    FirebaseFirestore db=FirebaseFirestore.getInstance();
    Button button;
    TextView textView,textView2;
    Intent intent;
    String room;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        intent=getIntent();
        button=findViewById(R.id.button2);
        textView=findViewById(R.id.welcome_text);
        textView2=findViewById(R.id.room);
//        Toast.makeText(getApplicationContext(),intent.getCharSequenceExtra("User")+" love Sakura Airi.",Toast.LENGTH_SHORT).show();
        Task<DocumentSnapshot> xxx=db.collection("users").document(intent.getStringExtra("User")).get();
        xxx.addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                textView.setText("Hello "+documentSnapshot.get("name").toString());
                textView2.setText(documentSnapshot.get("room").toString());
                room=documentSnapshot.get("room").toString();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Complaints_Activity.class);
                intent.putExtra("room",room);
                startActivity(intent);
            }
        });
    }
}
