package mx.edu.tesoem.isc.tlgr.p5tlgr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensaje(View view)
    {
        Toast.makeText(this,"MENSAJE EMERGENTE", Toast.LENGTH_LONG).show();
    }
}
