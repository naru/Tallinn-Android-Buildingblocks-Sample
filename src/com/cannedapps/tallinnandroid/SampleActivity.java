package com.cannedapps.tallinnandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleActivity extends Activity {

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {

    // Main initialization, Create UI etc.
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    initUI();
  }
  
  @Override
  protected void onResume() {
    
    // Start the processes needed for the Activity
    
    super.onResume();
  }

  @Override
  protected void onPause() {
    
    // Persist critical data to the Data Store
    // Pause unneeded processes: e.g. polling the GPS etc.
    
    super.onPause();
  }

  private void initUI() {
    Button button = (Button) findViewById(R.id.button);
    
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(SampleActivity.this, OtherActivity.class);
        intent.putExtra("message", "Hello!! I'm a Message");
        startActivity(intent);
      }
    });
  }
 
  
  
}