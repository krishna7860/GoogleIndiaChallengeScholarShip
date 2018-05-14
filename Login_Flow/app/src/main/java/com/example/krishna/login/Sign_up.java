package com.example.krishna.login;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Sign_up extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



    }
    public void login(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void add_data(View view)
    {
        if(username.getText().length()==0||name.getText().length()==0||email.getText().length()==0||password.getText().length()==0){
           Toast.makeText(this,"Required Field",Toast.LENGTH_LONG);
        }
        addNewData(username.getText().toString(),name.getText().toString(),email.getText().toString(),password.getText().toString());



    }


    private long addNewData(String username,String name,String email,String password)
    {
        ContentValues contentValues=new ContentValues();
        contentValues.put(database_contract.database_entry.USER_NAME,username);
        contentValues.put(database_contract.database_entry.USER_FIRST_NAME,name);
        contentValues.put(database_contract.database_entry.USER_EMAIL,email);
        contentValues.put(database_contract.database_entry.USER_PASSWORD,password);

        return mDb.insert(database_contract.database_entry.TABLE_NAME,null,contentValues);
    }


}
