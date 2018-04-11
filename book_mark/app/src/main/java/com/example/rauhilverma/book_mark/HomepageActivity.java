package com.example.rauhilverma.book_mark;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,View view,int position,long id){

                if(position==0){
                    Intent intent0 =new Intent(HomepageActivity.this,SearchFunctionalityActivity.class);
                    startActivity(intent0);
                }
                if(position==1){
                    Intent intent1 =new Intent(HomepageActivity.this,ThrillerMainActivity.class);
                    startActivity(intent1);
                }
                if(position==2) {
                    Intent intent2 = new Intent(HomepageActivity.this,ScienceMainActivity.class);
                    startActivity(intent2);
                }
                if(position==3){
                    Intent intent3 = new Intent(HomepageActivity.this,AutobiographyMainActivity.class);
                    startActivity(intent3);
                }
            }

        };
        ListView listView=(ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
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
