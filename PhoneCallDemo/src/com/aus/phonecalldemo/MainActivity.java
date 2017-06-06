package com.aus.phonecalldemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button abc, pqr, xyz;
	Intent phoneCallIntent;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abc = (Button) findViewById(R.id.button1);
        abc.setOnClickListener(this);
        
        pqr = (Button) findViewById(R.id.button2);
        pqr.setOnClickListener(this);
        
        xyz = (Button) findViewById(R.id.button3);
        xyz.setOnClickListener(this);
        
        phoneCallIntent = new Intent(Intent.ACTION_CALL);
    }

	@Override
	public void onClick(View v) {
		
		if(v.getId() == R.id.button1){
			phoneCallIntent.setData(Uri.parse("tel:9876543210"));
		}
		else if(pqr.isPressed()){
			phoneCallIntent.setData(Uri.parse("tel:1111111111"));
		}
		else if(v.getId() == R.id.button3){
			//for STD numbers
			phoneCallIntent.setData(Uri.parse("tel:05555555555"));
		}
		
		startActivity(phoneCallIntent);
	}
}
