package projeto.treino.app.com.br.treino2;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Adson on 31/10/2015.
 */
public class ExTabHostOpenActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TabHost tabHost = getTabHost();

        tabHost.addTab(tabHost.newTabSpec("0").
                setIndicator("Gallery").setContent(new Intent(this, ExGallery.class)));

        tabHost.addTab(tabHost.newTabSpec("1").
                setIndicator("GridView").setContent(new Intent(this, ExGridView.class)));

    }
}
