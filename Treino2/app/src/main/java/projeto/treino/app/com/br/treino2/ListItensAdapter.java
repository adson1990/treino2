package projeto.treino.app.com.br.treino2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Adson on 31/10/2015.
 */
public class ListItensAdapter extends BaseAdapter {

    private List<Item> listItem;
    private LayoutInflater mInflater;

    public ListItensAdapter(Activity context, List<Item> listString) {
        this.listItem = listString;
        mInflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Item getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup parent) {
        ViewHolder holder;

        if (view == null) {
            view = mInflater.inflate(R.layout.list_item_adapter, null);
            holder = new ViewHolder();
            holder.text = (TextView) view.findViewById(R.id.tText);
            holder.imagem = (ImageView) view.findViewById(R.id.img);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Item item = listItem.get(posicao);
        holder.text.setText(item.nome);
        holder.imagem.setImageResource(item.imagem);

        return view;
    }

    static class ViewHolder {
        TextView text;
        ImageView imagem;
    }
}
