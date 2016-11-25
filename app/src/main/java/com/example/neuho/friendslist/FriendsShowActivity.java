package com.example.neuho.friendslist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.neuho.friendslist.R;
import com.example.neuho.friendslist.model.Friends;

/**
 * Created by neuho on 25.11.2016.
 */

public class FriendsShowActivity {

    private Friends friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_friends);

        Intent intent = getIntent();
        friends = (Friends) intent.getExtras().get("user");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        TextView viewLastName = (TextView) findViewById(R.id.textViewLastName);
        TextView viewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);

        viewFirstName.setText(friends.getFirstName());
        viewLastName.setText(friends.getLastName());
        viewAddress.setText(friends.getAddress());
        viewPhone.setText(friends.getPhoneNumber());

    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+friends.getAddress());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+user.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
}
