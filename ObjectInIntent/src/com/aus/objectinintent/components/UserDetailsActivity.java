package com.aus.objectinintent.components;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class UserDetailsActivity extends Activity {

	TextView userText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_details);
		
		userText = (TextView) findViewById(R.id.userText);
		
		User user = (User) getIntent().getSerializableExtra("user");
		
		userText.setText(user.getId()+" - "+user.getName());
	}
	
}
