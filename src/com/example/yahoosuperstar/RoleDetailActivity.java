package com.example.yahoosuperstar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RoleDetailActivity extends Activity {
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_role_detail);
		
		
		button =(Button) findViewById(R.id.button1);
		button.setOnClickListener( new OnClickListener() {
			
			public void onClick(View v) {
				try{
				Intent intent2 = new Intent(v.getContext(), ApplyActivity.class);
				//Intent intent = new Intent(v.getContext(), MovieList.class);
				//intent.putExtra("JSONData", mBlogData.toString());
				startActivity(intent2);
				}catch(Exception e){
					System.out.println(e);
				}
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.role_detail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		return super.onOptionsItemSelected(item);
	}
}
