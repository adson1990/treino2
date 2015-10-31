package projeto.treino.app.com.br.treino2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Adson on 31/10/2015.
 */
public class LoginActivity extends Activity
        implements View.OnClickListener {

    private Button btLogin;
    private EditText textLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        textLogin = (EditText) findViewById(R.id.textLogin);

        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btLogin){
            abrirTela(this, TelaBoasVindas.class);
        }
    }

    private void abrirTela(Activity context, Class<? extends Activity> clazz) {

        Bundle param = new Bundle();

        String login = textLogin.getText().toString();
        param.putString("login_key", login);

        Intent intent = new Intent(context,clazz);
        intent.putExtras(param);

        context.startActivity(intent);
    }
}