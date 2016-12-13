package com.example.ofir.bopo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class Test1Activity extends AppCompatActivity {

    private Button mAdd;
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        Firebase.setAndroidContext(this);
        mRef = new Firebase("https://bopo-152112.firebaseio.com/");

        mAdd = (Button) findViewById(R.id.bAdd);
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firebase mRefChild = mRef.child("name");
                mRefChild.setValue("Ofir" +
                        "9");
            }
        });
    }
}
