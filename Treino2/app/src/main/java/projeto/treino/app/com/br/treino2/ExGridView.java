package projeto.treino.app.com.br.treino2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adson on 31/10/2015.
 */
public class ExGridView extends Activity implements
        AdapterView.OnItemClickListener {

    private List<Item> listItem;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_layout);

        listItem = new ArrayList<>();

        listItem.add(new  Item("Toad", R.drawable.img_1));
        listItem.add(new  Item("Enemy", R.drawable.img_2));
        listItem.add(new  Item("Flamer", R.drawable.img_3));
        listItem.add(new  Item("Ghost", R.drawable.img_4));

        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setNumColumns(2);
        gridView.setAdapter(new ListItensAdapter(this, listItem));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapter, View arg1, int pos, long arg3) {
        Item item = listItem.get(pos);
        Toast.makeText(this, item.nome, Toast.
                LENGTH_LONG).show();
    }
}
