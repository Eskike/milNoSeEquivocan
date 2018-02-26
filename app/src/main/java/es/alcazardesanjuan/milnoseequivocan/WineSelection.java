package es.alcazardesanjuan.milnoseequivocan;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class WineSelection extends AppCompatActivity  {

    private TextView user;
    private ImageButton bInfor;
    private ImageButton bInfor2;
    private ImageButton bInfor3;
    private ImageButton bInfor4;
    private ImageButton bInfor5;
    private ImageButton bInfor6;
    private ImageButton bInfor7;
    private ImageButton bInfor8;
    private ImageButton bInfor9;
    private ImageButton bInfor10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_selection);
        user = (TextView) findViewById( R.id.eti_nombreA );
        bInfor = (ImageButton) findViewById(R.id.Corcho1);
        bInfor2 = (ImageButton) findViewById(R.id.Corcho2);
        bInfor3 = (ImageButton) findViewById(R.id.Corcho3);
        bInfor4 = (ImageButton) findViewById(R.id.Corcho4);
        bInfor5 = (ImageButton) findViewById(R.id.Corcho5);
        bInfor6 = (ImageButton) findViewById(R.id.Corcho6);
        bInfor7 = (ImageButton) findViewById(R.id.Corcho7);
        bInfor8 = (ImageButton) findViewById(R.id.Corcho8);
        bInfor9 = (ImageButton) findViewById(R.id.Corcho9);
        bInfor10 = (ImageButton) findViewById(R.id.Corcho10);

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoUsuario=(String)extras.get("nombre");//Obtengo el nombre

            user.setText(datoUsuario);
        }
    }

    //Cambiar los estados de los botones de los corchos
    public void bInfor (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        //initialize image view object
        ImageButton im=(ImageButton) findViewById(R.id.Corcho1);
        //get clicked button id from view object
        switch(view.getId())
        {
            case R.id.Corcho1:
                //if Corcho1 is clicked than set image1
                im.setImageResource(R.drawable.corchochecked1xhdpi);
                break;
        }
    }

    public void bInfor2 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho2);
        switch(view.getId())
        {
            case R.id.Corcho2:
                im.setImageResource(R.drawable.corchochecked2xhdpi);
                break;
        }
    }

    public void bInfor3 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho3);
        switch(view.getId())
        {
            case R.id.Corcho3:
                im.setImageResource(R.drawable.corchochecked3xhdpi);
                break;
        }
    }

    public void bInfor4 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho4);
        switch(view.getId())
        {
            case R.id.Corcho4:
                im.setImageResource(R.drawable.corchochecked4xhdpi);
                break;
        }
    }

    public void bInfor5 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho5);
        switch(view.getId())
        {
            case R.id.Corcho5:
                im.setImageResource(R.drawable.corchochecked5xhdpi);
                break;
        }
    }

    public void bInfor6 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho6);
        switch(view.getId())
        {
            case R.id.Corcho6:
                im.setImageResource(R.drawable.corchochecked6xhdpi);
                break;
        }
    }

    public void bInfor7 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho7);
        switch(view.getId())
        {
            case R.id.Corcho7:
                im.setImageResource(R.drawable.corchochecked7xhdpi);
                break;
        }
    }

    public void bInfor8 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho8);
        switch(view.getId())
        {
            case R.id.Corcho8:
                im.setImageResource(R.drawable.corchochecked8xhdpi);
                break;
        }
    }

    public void bInfor9 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho9);
        switch(view.getId())
        {
            case R.id.Corcho9:
                im.setImageResource(R.drawable.corchochecked9xhdpi);
                break;
        }
    }

    public void bInfor10 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVino1.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho10);
        switch(view.getId())
        {
            case R.id.Corcho10:
                im.setImageResource(R.drawable.corchochecked10xhdpi);
                break;
        }
    }
}
