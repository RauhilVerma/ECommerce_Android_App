package com.example.rauhilverma.book_mark;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by RauhilVerma on 01-04-2018.
 */

public class RegisterRequest extends StringRequest {

        private static final String REGISTER_REQUEST_URL = "http://4sa.esy.es/Register.php";
        private Map<String, String> params;

        public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> listener) {
            super(Method.POST, REGISTER_REQUEST_URL, listener, null);
            params = new HashMap<>();
            params.put("name", name);
            params.put("age", age + "");
            params.put("username", username);
            params.put("password", password);
        }

        @Override
        public Map<String, String> getParams() {
            return params;
        }
    }
