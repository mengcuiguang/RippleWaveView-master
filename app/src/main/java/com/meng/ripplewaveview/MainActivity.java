package com.meng.ripplewaveview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RippleSpreadTextView xiu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xiu = (RippleSpreadTextView) findViewById(R.id.xiu);

        xiu.setText("咻啊咻");
        xiu.setTextSize(15);
        xiu.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.red));

        xiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "咻 咻咻 咻咻咻", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (xiu != null) {
            xiu.setCloseLayoutAnim();
        }
    }
}
