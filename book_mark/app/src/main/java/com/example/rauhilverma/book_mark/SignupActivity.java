package com.example.rauhilverma.book_mark;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        final EditText age = (EditText) findViewById(R.id.editText6);
        final EditText name = (EditText) findViewById(R.id.editText5);
        final EditText username = (EditText) findViewById(R.id.editText3);
        final EditText password = (EditText) findViewById(R.id.editText4);
        final Button Bregister = (Button) findViewById(R.id.button12);

        Bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String etname = name.getText().toString();
                final String etusername = username.getText().toString();
                final int etage = Integer.parseInt(age.getText().toString());
                final String etpassword = password.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Log.i("rauhil","reached");
                                Intent intent=new Intent(SignupActivity.this, MainActivity.class);
                                SignupActivity.this.startActivity(intent);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this);
                                builder.setMessage("Registeration Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                                Log.i("rauhil","else error");

                            }
                        } catch (JSONException e) {
                            Log.i("rauhil","php not reached");
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(etname, etusername, etage, etpassword, responseListener);
                RequestQueue queue = Volley.newRequestQueue(SignupActivity.this);
                queue.add(registerRequest);
            }
        });

    }
}






