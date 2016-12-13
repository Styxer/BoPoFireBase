package com.example.ofir.bopo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class sendMultipleObjectsTestActivity extends AppCompatActivity {

    private EditText mValueField, mKeyValue;
    private Button mBadd;

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_multiple_objects_test);

        mRootRef = new Firebase("https://bopo-152112.firebaseio.com/Users");

        mValueField = (EditText) findViewById(R.id.etValueField);
        mKeyValue = (EditText) findViewById(R.id.etKeyValue);
        mBadd = (Button) findViewById(R.id.bAdd);

        mBadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mValueField.getText().toString().trim();
                String key = mKeyValue.getText().toString().trim();
                Firebase childRef = mRootRef.child(key);
               // childRef.setValue(value);

                childRef.setValue(value);
            }
        });

    }


}
