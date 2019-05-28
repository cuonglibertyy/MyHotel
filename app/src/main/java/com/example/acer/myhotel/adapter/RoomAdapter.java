package com.example.acer.myhotel.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.acer.myhotel.R;
import com.example.acer.myhotel.RestAPI.Server;
import com.example.acer.myhotel.model.Room;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class RoomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Room> arrayRoom;
    Server server;

    public RoomAdapter(Context context, ArrayList<Room> arrayRoom) {
        this.context = context;
        this.arrayRoom = arrayRoom;
    }
    @Override
    public int getCount() {
        return arrayRoom.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayRoom.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public  class ViewHolder{
        public TextView tvRoom,tvGiaRoom,tvMota;
        public ImageView imgroom;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.dong_rooms,null);
            viewHolder.imgroom = convertView.findViewById(R.id.imgrooms);
            viewHolder.tvRoom = convertView.findViewById(R.id.tvRooms);
            viewHolder.tvGiaRoom = convertView.findViewById(R.id.tvGiaRooms);
            viewHolder.tvMota = convertView.findViewById(R.id.tvMota);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Room room = (Room) getItem(position);
        viewHolder.tvRoom.setText("Tên Phòng:"+room.getRoom_Number());
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        viewHolder.tvGiaRoom.setText("Giá:" + decimalFormat.format(room.getPrice())+" VNĐ");
        viewHolder.tvMota.setMaxLines(2);
        // dấu 3 chấm ở phía sau
        viewHolder.tvMota.setEllipsize(TextUtils.TruncateAt.END);
        viewHolder.tvMota.setText("Mô tả:"+room.getDetail());
        Picasso.get().load(Server.localhostimg+room.getImage())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(viewHolder.imgroom);


        return convertView;
    }
}
