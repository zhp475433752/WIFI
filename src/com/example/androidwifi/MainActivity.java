package com.example.androidwifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	private WifiManager manager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button)findViewById(R.id.button1);
		Button button2 = (Button)findViewById(R.id.button2);
		Button button3 = (Button)findViewById(R.id.button3);
		//´ò¿ªWIFI
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					// TODO Auto-generated method stub
					manager = (WifiManager) MainActivity.this.getSystemService(Context.WIFI_SERVICE);
					manager.setWifiEnabled(true);
					System.out.println("WIFI×´Ì¬="+manager.getWifiState());
					Toast.makeText(MainActivity.this, "WIFI×´Ì¬="+manager.getWifiState(), Toast.LENGTH_SHORT).show();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("³ö´í£º"+e);
				}
				
			}
		});
		
		//¹Ø±ÕWIFI
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manager = (WifiManager) MainActivity.this.getSystemService(Context.WIFI_SERVICE);
				manager.setWifiEnabled(false);
				System.out.println("WIFI×´Ì¬="+manager.getWifiState());
				Toast.makeText(MainActivity.this, "WIFI×´Ì¬="+manager.getWifiState(), Toast.LENGTH_SHORT).show();
			}
		});
		
		//²é¿´WIFI×´Ì¬
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manager = (WifiManager) MainActivity.this.getSystemService(Context.WIFI_SERVICE);
				//manager.setWifiEnabled(true);
				System.out.println("WIFI×´Ì¬="+manager.getWifiState());
				Toast.makeText(MainActivity.this, "WIFI×´Ì¬="+manager.getWifiState(), Toast.LENGTH_SHORT).show();
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
