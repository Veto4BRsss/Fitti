package dopfer.fabian.com.fitti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.r0adkll.slidr.Slidr;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Slidr.attach(this);
    }

    public void openActivity1(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
