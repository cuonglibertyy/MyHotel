package com.example.acer.myhotel.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.acer.myhotel.R;
import com.example.acer.myhotel.RestAPI.Server;
import com.example.acer.myhotel.activity.RoomsActivity;
import com.example.acer.myhotel.model.Hotel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ItemHolder> {
    Context context;
    ArrayList<Hotel> arrayHotel;
    Server server;

    public HotelAdapter(Context context, ArrayList<Hotel> arrayHotel) {
        this.context = context;
        this.arrayHotel = arrayHotel;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dong_hotels,null);
        ItemHolder itemHolder = new ItemHolder(view);
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {
        Hotel hotel = arrayHotel.get(i);
        itemHolder.tvTenHotel.setText(hotel.getName());
        itemHolder.tvDiaChi.setText("Địa Chỉ: "+hotel.getAddress());
        itemHolder.tvTenquanly.setText("Thành Phố: "+hotel.getCity());
        itemHolder.tvSDT.setText("Số Điện Thoại: "+"0"+ hotel.getLicense_number());

        Picasso.get().load(Server.localhostimg+hotel.getImage())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(itemHolder.imghotel);
    }

    @Override
    public int getItemCount() {
        return arrayHotel.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        public ImageView imghotel;
        public TextView tvTenHotel,tvTenquanly,tvDiaChi,tvSDT;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            imghotel = itemView.findViewById(R.id.imghotels);
            tvTenHotel = itemView.findViewById(R.id.tvtenhotels);
            tvTenquanly = itemView.findViewById(R.id.tvthanhpho);
            tvDiaChi = itemView.findViewById(R.id.tvDiachi);
            tvSDT = itemView.findViewById(R.id.tvSDT);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, RoomsActivity.class);
                    intent.putExtra("manhinhrooms",arrayHotel.get(getPosition()));
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });

        }
    }
}
