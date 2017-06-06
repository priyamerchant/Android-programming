package com.aus.objectinintent.components;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button show;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		show = (Button) findViewById(R.id.button1);
		show.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, UserDetailsActivity.class);
		User user = new User();
		Bundle userBundle = new Bundle();
		userBundle.putSerializable("user", user);
		intent.putExtras(userBundle);
		startActivity(intent);
	}
}
