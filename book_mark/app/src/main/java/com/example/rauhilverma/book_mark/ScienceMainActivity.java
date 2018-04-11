package com.example.rauhilverma.book_mark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rauhilverma.book_mark.ProductAdapter;
import com.example.rauhilverma.book_mark.Constant;
import com.example.rauhilverma.book_mark.Product;

public class ScienceMainActivity extends AppCompatActivity {
    private static final String TAG = "ScienceMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_main);

        TextView tvViewShoppingCart = (TextView)findViewById(R.id.tvViewShoppingCart);
        SpannableString content = new SpannableString(getText(R.string.science_detail));
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        tvViewShoppingCart.setText(content);
        tvViewShoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScienceMainActivity.this, ShoppingCartActivity.class);
                startActivity(intent);
            }
        });

        ListView lvProducts = (ListView) findViewById(R.id.lvProducts);
        lvProducts.addHeaderView(getLayoutInflater().inflate(R.layout.product_list_header, lvProducts, false));

        ProductAdapter productAdapter = new ProductAdapter(this);
        productAdapter.updateProducts(Constant2.PRODUCT_LIST);

        lvProducts.setAdapter(productAdapter);

        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Product product = Constant2.PRODUCT_LIST.get(position - 1);
                Intent intent = new Intent(ScienceMainActivity.this, ProductActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("product", product);
                Log.d(TAG, "View product: " + product.getName());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
