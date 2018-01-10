package tw.com.shiaoshia.ex2018011002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click01(View v) {
        Intent it = new Intent(MainActivity.this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("DATA","MyDATA");
        it.putExtras(bundle);
        startActivity(it);
    }
}
