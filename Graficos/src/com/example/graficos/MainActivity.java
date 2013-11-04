package com.example.graficos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button button1, button2, button3, button4;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    

    button1 = (Button)
    		findViewById(R.id.button1);
    button2 = (Button)
    		findViewById(R.id.button2);
    button3 = (Button)
    		findViewById(R.id.button3);
    button4 = (Button)
    		findViewById(R.id.button4);
    
    button1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent Trocadetela1 = new
			Intent(MainActivity.this,Screen1Activity.class);
			MainActivity.this.startActivity(Trocadetela1);
			MainActivity.this.finish();
			
		}
		});
 button2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent Trocadetela2 = new
			Intent(MainActivity.this,Screen2Activity.class);
			MainActivity.this.startActivity(Trocadetela2);
			MainActivity.this.finish();
			
		}
		});
 button3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent Trocadetela3 = new
			Intent(MainActivity.this,Screen3Activity.class);
			MainActivity.this.startActivity(Trocadetela3);
			MainActivity.this.finish();
			
		}
		});
 button4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent Trocadetela4 = new
			Intent(MainActivity.this,Screen4Activity.class);
			MainActivity.this.startActivity(Trocadetela4);
			MainActivity.this.finish();
			
		}
		});
    		
    		} 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
