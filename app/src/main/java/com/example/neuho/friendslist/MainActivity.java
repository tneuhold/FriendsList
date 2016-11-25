package com.example.neuho.friendslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.neuho.friendslist.model.Friends;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //JAVA is better than SCALA

    private List<Friends> listFriends;
    private ListView myListView;
    private CostumAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.myFriendsList);

        listFriends = new ArrayList<>();
        listFriends.add(new Friends("David Crane", "Alte Poststrasse 147, 8020 Graz", "0123456", "Joey"));
        listFriends.add(new Friends("KEvin S. Bright", "Steyrgasse 99, 8020 Graz", "0123456", "Rachel"));
        listFriends.add(new Friends("Marta Kauffman", "Augasse 118, 8020 Graz", "0123456", "Monica"));

        myAdapter = new CostumAdapter(this, listFriends);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Friends selectedFriends = listFriends.get(i);
        Intent intent = new Intent(view.getContext(), FriendsShowActivity.class);
        intent.putExtra("user", selectedFriends);
        startActivity(intent);

    }
}



