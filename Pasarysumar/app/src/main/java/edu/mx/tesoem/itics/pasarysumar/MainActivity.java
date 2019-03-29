package edu.mx.tesoem.itics.pasarysumar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button saludosbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saludosbtn = (Button) findViewById(R.id.btnsaludos);

        saludosbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Bienvenido a tu primer programa",Toast.LENGTH_LONG).show();
        saludosbtn.setEnabled(false);
    }

    public void saludosdos(View v){
        Toast.makeText(this,"Segundo saludo....",Toast.LENGTH_LONG).show();
        saludosbtn.setEnabled(true);
    }

    public void llamarbtn(View v){
        Intent cargar = new Intent(this,SegundaActivity.class);
        startActivity(cargar);
    }
}
