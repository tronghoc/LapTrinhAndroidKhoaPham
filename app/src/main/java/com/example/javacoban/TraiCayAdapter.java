package com.example.javacoban;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
   private Context context;//màn hình nào truyền context cho màn hình đó
   private int layout; //truyền dữ liệu vào layout nào
   private List<TraiCay> traiCayList; //danh sách chứa đối tượng để đổ ra listview
   //Tạo Contructor
    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() { //trả về số doanh
        return traiCayList.size(); //trả về toàn bộ dữ liêu listview - return 3; trả về 3 gt
    } //trỏ vào TraiCayAdapter atl+enter

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { //trả về mỗi dòng trên item của mình
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        //phần hệ thống
        convertView = inflater.inflate(layout, null); //chứa layout, hiển thị trên mỗi dòng

        //ánh xá view
        TextView txtTen = (TextView) convertView.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView) convertView.findViewById(R.id.textviewMoTa);
        ImageView imgHinh  = (ImageView) convertView.findViewById(R.id.imageviewHinh);

        //gán giá trị
        TraiCay traiCay = traiCayList.get(position);
        txtTen.setText(traiCay.getTen());
        txtTen.setText(traiCay.getMoTa());
        imgHinh.setImageResource(traiCay.getHinh());
        return convertView;
    }
}
