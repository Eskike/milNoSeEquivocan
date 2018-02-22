package es.alcazardesanjuan.milnoseequivocan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class valoracionVino1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoracion_vino1);

        Button b = (Button) findViewById(R.id.bPop);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(valoracionVino1.this,PopLeyenda.class));
            }
        });
        ImageView i = (ImageView) findViewById(R.id.image_vista);
        i.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     startActivity(new Intent(valoracionVino1.this,PopVista.class));

                                 }
                             }
        );
    }
}
