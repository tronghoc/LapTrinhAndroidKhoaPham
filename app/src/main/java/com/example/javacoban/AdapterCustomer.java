package com.example.javacoban;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterCustomer extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TimKiemHA> hinhAnhListTimKiem;

    public AdapterCustomer(Context context, int layout, List<TimKiemHA> hinhAnhList) {
        this.context = context;
        this.layout = layout;
        this.hinhAnhListTimKiem = hinhAnhList;
    }

    @Override
    public int getCount() {
        return hinhAnhListTimKiem.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        //phần hệ thống
        convertView = inflater.inflate(layout, null); //chứa layout, hiển thị trên mỗi dòng

        //ánh xá view
        TextView txtNam = (TextView) convertView.findViewById(R.id.tvName);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.tvDesc);
        ImageView imgHinhTK  = (ImageView) convertView.findViewById(R.id.imgViewTK);

        //gán giá trị
        TimKiemHA timKiemImg = hinhAnhListTimKiem.get(position);
        txtNam.setText(timKiemImg.getName());
        txtDesc.setText(timKiemImg.getDesc());
        imgHinhTK.setImageResource(timKiemImg.getImages());
        return convertView;
    }
}
