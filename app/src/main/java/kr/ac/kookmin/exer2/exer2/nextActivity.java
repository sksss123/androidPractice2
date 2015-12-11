package kr.ac.kookmin.exer2.exer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class nextActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("실행", "되니");
        setContentView(R.layout.activity_next);

        Intent in = this.getIntent();
        Toast.makeText(getApplicationContext(), "name : " + in.getStringExtra("name"), Toast.LENGTH_LONG).show();

        bt = (Button)findViewById(R.id.quit);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
