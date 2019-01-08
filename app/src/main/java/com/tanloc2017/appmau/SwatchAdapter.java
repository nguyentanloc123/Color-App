package com.tanloc2017.appmau;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Map;

public class SwatchAdapter extends ArrayAdapter {

    public SwatchAdapter(Context context, Object [] swatches) {
        super(context, 0, swatches);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.swatch_view, parent, false);
        }

        View colorView = convertView.findViewById(R.id.color_swatch);
        TextView colorTitle = (TextView)convertView.findViewById(R.id.color_title);
        colorView.setBackgroundColor(entry.getValue());
        colorTitle.setText(entry.getKey() + "\t"+" (#"+ Integer.toHexString(entry.getValue()).toUpperCase()+")");

        return convertView;
    }
}
