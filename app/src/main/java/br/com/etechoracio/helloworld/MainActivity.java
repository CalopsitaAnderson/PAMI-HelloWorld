package br.com.etechoracio.helloworld;

import android.arch.lifecycle.ViewModelStoreOwner;
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


public void onOK(View view){

    Toast msg = Toast.makeText(this,"victor para de fumar", Toast.LENGTH_LONG);
    msg.show();
}



}
