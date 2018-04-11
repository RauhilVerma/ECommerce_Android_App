package com.example.rauhilverma.book_mark;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Debug;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {



    String LOGIN_REQUEST_URL = "http://4sa.esy.es/Login.php";
    RequestQueue rer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences ah = getSharedPreferences("userdata", Context.MODE_PRIVATE);
        if (ah.getBoolean("loggedin",false) )
        {

            Intent i = new Intent(this,HomepageActivity.class);
            startActivity(i);

        }


        rer = Volley.newRequestQueue(MainActivity.this);

        final EditText etUsername = (EditText) findViewById(R.id.editText);
        final EditText etPassword = (EditText) findViewById(R.id.editText2);
        final Button bLogin = (Button) findViewById(R.id.button10);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();

                if(username=="" && password=="")
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username and Password required!")
                            .setNegativeButton("Retry", null)
                            .create()
                            .show();

                }
            /*
                // Response received from the server
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {

                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {
                                pb.setVisibility(View.INVISIBLE);
                                String name = jsonResponse.getString("name");
                                int age = jsonResponse.getInt("age");
                                SharedPreferences ahs = getSharedPreferences("userdata", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = ahs.edit();
                                editor.putBoolean("loggedin",true);
                                editor.commit();
                                Intent intent = new Intent(SigninActivity.this, FirstActivity.class);
                                intent.putExtra("name", name);
                                intent.putExtra("age", age);
                                intent.putExtra("password", password);
                                intent.putExtra("username", username);
                                SigninActivity.this.startActivity(intent);
                            } else {
                                pb.setVisibility(View.INVISIBLE);
                                AlertDialog.Builder builder = new AlertDialog.Builder(SigninActivity.this);
                                builder.setMessage("Incorrect Username or Password")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {

                            e.printStackTrace();
                        }
                    }
                };



                SigninRequest loginRequest = new SigninRequest(username, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(SigninActivity.this);
                queue.add(loginRequest);
                */
                StringRequest str = new StringRequest(Request.Method.POST, LOGIN_REQUEST_URL,new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {

                                String name = jsonResponse.getString("name");
                                int age = jsonResponse.getInt("age");
                                SharedPreferences ahs = getSharedPreferences("userdata", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = ahs.edit();
                                editor.putBoolean("loggedin",true);
                                editor.commit();
                                Intent intent = new Intent(MainActivity.this, HomepageActivity.class);
                                intent.putExtra("name", name);
                                intent.putExtra("age", age);
                                intent.putExtra("password", password);
                                intent.putExtra("username", username);
                                MainActivity.this.startActivity(intent);
                            } else {

                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setMessage("Incorrect Username or Password")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {

                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(MainActivity.this, "No internet", Toast.LENGTH_SHORT).show();

                    }
                }){

                    protected Map<String,String> getParams(){
                        Map<String,String> params = new HashMap<String, String>();
                        params.put("username",username);
                        params.put("password",password);
                        return params;
                    }

                };

                rer.add(str);



            }
        });
    }
    public void ButtonClick2(View view){
        Intent intent=new Intent(this,SignupActivity.class);
        startActivity(intent);

    }
}

