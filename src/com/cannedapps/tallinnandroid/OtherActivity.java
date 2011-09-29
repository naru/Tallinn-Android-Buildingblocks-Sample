package com.cannedapps.tallinnandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    setContentView(R.layout.other);
    
    String message = getIntent().getExtras().getString("message");
    
    ((TextView) findViewById(R.id.message)).setText(message);
  }

  
  
}
