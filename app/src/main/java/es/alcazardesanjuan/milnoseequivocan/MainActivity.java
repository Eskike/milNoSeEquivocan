package es.alcazardesanjuan.milnoseequivocan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bInfo;
    Button bIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bInfo = (Button) findViewById(R.id.buttonInfo);
        bIniciar = (Button) findViewById(R.id.buttonIniciar);

    }
    public void bInfo (View view){
        Intent activity=new Intent(getApplicationContext(),activity_aboutus.class);
        startActivity(activity);
    }

    public void bIniciar (View view){
        Intent activity=new Intent(getApplicationContext(),WineSelection.class);
        startActivity(activity);
    }
}
