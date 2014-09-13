package com.sushant2603.customarrayadapterdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class UsersActivity extends Activity {

	private ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        users = new ArrayList<User>();
        users.add(new User("Sally", "Baltimore"));
        UsersAdapter adapter = new UsersAdapter(this, users);
        ListView lvItems = (ListView) findViewById(R.id.lvItems);
        lvItems.setAdapter(adapter);
    }
}
