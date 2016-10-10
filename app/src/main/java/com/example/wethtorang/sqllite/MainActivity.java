package com.example.wethtorang.sqllite;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDatabase myDatabase = new MyDatabase(getApplicationContext());
        String[] args = {};
        Cursor cursor = myDatabase.getReadableDatabase().rawQuery("SELECT * FROM Departement ",null);
//        cursor.moveToNext();
//        String product = cursor.getString(0);
        Log.d("Count_Data : ",cursor.getCount()+"T");
//        MyDatabase myDatabase = new MyDatabase(getApplicationContext()); // open database
//        String[] args = {};
//        Cursor cursor = myDatabase.getReadableDatabase().rawQuery("SELECT * FROM test", args);  // query
//// use query, get first record
//        cursor.moveToNext();
//        String productId = cursor.getString(0); // 0 here is the column index
//        String productName = cursor.getString(1);
//        int qty = cursor.getInt(2);
//// loop all row
//        while(!cursor.isLast()) {
//            cursor.moveToNext();
//            productId = cursor.getString(0);
//            productName = cursor.getString(1);
//            qty = cursor.getInt(2);
//            Log.d("Database", "id: " + productId + ", name: " + productName);
//        }

    }
}
