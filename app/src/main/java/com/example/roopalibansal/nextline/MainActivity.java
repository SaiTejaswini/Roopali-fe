package com.example.roopalibansal.nextline;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText userName =(EditText)findViewById(R.id.editText);
        final EditText password =(EditText)findViewById(R.id.editText2);
        final Button logIn = (Button) findViewById(R.id.button);
        final Button restrarantOwner = (Button) findViewById(R.id.button1);
        final Intent i=new Intent(this , HomeActivity.class);
        final Intent i1=new Intent(this , HomeActivity.class);
            logIn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(userName.getText().toString().trim().equals("roopali") && password.getText().toString().trim().equals("1234")) {
                        startActivity(i);
                    }
                }
            });
        restrarantOwner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    startActivity(i1);
                }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
