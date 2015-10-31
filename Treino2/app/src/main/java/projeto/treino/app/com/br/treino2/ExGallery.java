package projeto.treino.app.com.br.treino2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adson on 31/10/2015.
 */
public class ExGallery extends Activity
        implements AdapterView.OnItemClickListener {

    private List<Item> listItem;
    private Gallery gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallary_layout);

        listItem = new ArrayList<Item>();
        listItem.add(new Item("Toad", R.drawable.img_4));
        listItem.add(new Item("Enemy", R.drawable.img_5));
        listItem.add(new Item("Flamer", R.drawable.img_6));
        listItem.add(new Item("Ghost", R.drawable.img_1));

        gallery = (Gallery) findViewById(R.id.gallery);
        gallery.setAdapter(new ListItensAdapter(this, listItem));
        gallery.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapter, View arg1, int pos, long arg3) {
        Item item = listItem.get(pos);
        Toast.makeText(this, item.nome, Toast.LENGTH_LONG).show();
    }
}