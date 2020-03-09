package test.test2.com.listApp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("log tag","log test");


        findViewById(R.id.btnListAllPack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intentTest = new Intent(MainActivity.this, LaunchOtherAppActivity.class);//refer to https://qiita.com/xu1718191411/items/25faefe055ebb315d041
                startActivity(intentTest);


                Intent intent = new Intent();
                //intent.setClassName("com.google.android.youtube", "com.google.android.youtube.app.honeycomb.ShellSHomeActivity");
                intent.setClassName("com.google.android.youtube", "com.google.android.youtube.app.honeycomb.Shell$HomeActivity");
                //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                //startActivity(intent);
            }
        });

    }

}
