package br.unicamp.apiretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    private List<Dog> listaDog;
    Context context;

    public GridViewAdapter(Context context, List<Dog> parametrosListaDog){
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaDog.size();
    }

    @Override
    public Object getItem(int posicao) {
        return listaDog.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.layout_gridview);
        }

        return null;

    }
}
