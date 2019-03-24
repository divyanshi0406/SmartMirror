package vaisahli.agrawal.smartmirror;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MirrorView extends AppCompatActivity {

TextView CTime;
TextView note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirror_view);
        CTime = findViewById(R.id.curTime);
        note = findViewById(R.id.Notes);
        Intent next = getIntent();
        String data = next.getStringExtra("message");

        note.setText(data);

        Date currentTime = Calendar.getInstance().getTime();

        //CTime.setText((CharSequence) currentTime);
    }
}