package es.alcazardesanjuan.milnoseequivocan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WineSelection extends AppCompatActivity  {

    private TextView user;
    private ImageView bInfor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_selection);
        user = (TextView) findViewById( R.id.eti_nombreA );
        bInfor = (ImageView) findViewById(R.id.Corcho1);

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoUsuario=(String)extras.get("nombre");//Obtengo el nombre

            user.setText(datoUsuario);
        }
    }
    public void bInfor (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);
    }
}
