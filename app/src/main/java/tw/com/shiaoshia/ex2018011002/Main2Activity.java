package tw.com.shiaoshia.ex2018011002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent it = getIntent();
        Bundle bundle = it.getExtras();
        String str = bundle.getString("DATA");
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(str);
    }
}
