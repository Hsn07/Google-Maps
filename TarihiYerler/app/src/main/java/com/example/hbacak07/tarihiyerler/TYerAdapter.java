package com.example.hbacak07.tarihiyerler;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hasan on 11.8.2017.
 */

public class TYerAdapter extends BaseAdapter {
    Activity activity;
    LayoutInflater inflater;
    ArrayList<TYer> tliste;

    public TYerAdapter(Activity activity, ArrayList<TYer> tliste) {
        this.activity = activity;
        inflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.tliste = tliste;
    }

    @Override
    public int getCount() {
        return tliste.size();
    }

    @Override
    public Object getItem(int i) {
        return tliste.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.tarihiyerlersatirduzeni,null);

        TextView tvisim=view.findViewById(R.id.tvisim);
        TextView tvkonum=view.findViewById(R.id.tvkonum);
        TextView tvmesafe=view.findViewById(R.id.tvmesafe);
        TextView tvsure=view.findViewById(R.id.tvsure);

        TYer tyer=tliste.get(i);

        tvisim.setText(tyer.getIsim());
        tvkonum.setText(tyer.getX()+" - "+tyer.getY());
        tvmesafe.setText(tyer.getMesafe());
        tvsure.setText(tyer.getSure());



        return view;
    }
}
