package sv.edu.utec.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //CREACION DE L METODO 1
    public void Siguiente(View view){
        //creacion del objrto de tipo Intent
        Intent Siguiente=new Intent(this,SegundoActivity.class);
        startActivity(Siguiente);

    }
}