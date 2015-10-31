package projeto.treino.app.com.br.treino2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Adson on 31/10/2015.
 */
public class TelaBoasVindas extends Activity
        implements View.OnClickListener {

    private Button btVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_boas_vindas);

        String login = (String) getIntent().getSerializableExtra("login_key");

        TextView textLogin = (TextView) findViewById(R.id.labelLogin);
        textLogin.setText("Bem vindo, " + login + "!");

        btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btVoltar){
            finish();
        }
    }

    public void gridview(View view){startActivity(new Intent(this, ExGridView.class));}

    public  void gallery(View view){
        startActivity(new Intent(this, ExGallery.class));
    }

    public  void host(View view){startActivity(new Intent(this, MostrarHostActivity.class));}
}
