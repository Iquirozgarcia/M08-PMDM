package Ivan.Quiroz.myapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tx_acum;
private Button btsuma;
private Button btresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx_acum = findViewById(R.id.tx_ac);
        btsuma = findViewById(R.id.bt1);
        btresta = findViewById(R.id.bt2);
    }

    public void suma(View view) {
        int acum = Integer.parseInt((String) tx_acum.getText());
        acum++;
        tx_acum.setText(Integer.toString(acum));
    }
    public void resta(View view) {
        int acum = Integer.parseInt((String) tx_acum.getText());
        acum--;
        tx_acum.setText(Integer.toString(acum));
    }

    public void mostra(View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);

    }
}