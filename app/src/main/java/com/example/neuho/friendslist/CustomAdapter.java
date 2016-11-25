package com.example.neuho.friendslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import com.example.neuho.friendslist.model.Friends;

class CostumAdapter extends BaseAdapter {

    List<Friends> listFriends;
    Context context;
    LayoutInflater inflter;

    public CostumAdapter(Context applicationContext, List<Friends> listFriends) {
        this.context = applicationContext;
        this.listFriends= listFriends;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listFriends.size();
    }

    @Override
    public Object getItem(int i) {
        return listFriends.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewOrderId=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewChefName=(TextView)view.findViewById(R.id.textViewListPhone);

        Friends friends = listFriends.get(i);
        viewOrderId.setText("Actor: "+friends.getFavouriteActor());
        viewAddress.setText(friends.getAddress());
        viewChefName.setText(friends.getWriter());

        return view;
    }
}