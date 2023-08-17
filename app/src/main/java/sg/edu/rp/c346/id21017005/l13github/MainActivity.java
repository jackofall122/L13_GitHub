package sg.edu.rp.c346.id21017005.l13github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnRecord;
    Button btnRetrieveTv;
    Button btnRetrieveLv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRecord = findViewById(R.id.button);
        btnRetrieveTv = findViewById(R.id.button2);
        btnRetrieveLv = findViewById(R.id.button3);

        // This links the insert record button to InsertRecord.java
        btnRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InsertRecord.class);
                startActivity(intent);
            }
        });
        // This links the retrieve textview button to RetrieveTextView.java
        btnRetrieveTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RetrieveTextView.class);
                startActivity(intent);
            }
        });
        // This links the retrieve listview button to RetrieveListView.java
        btnRetrieveLv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RetrieveListView.class);
                startActivity(intent);
            }
        });

    }
}