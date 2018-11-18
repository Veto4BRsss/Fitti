package dopfer.fabian.com.fitti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openActivity2(View v) {
        Intent intent = new Intent(this,Nahrungsmittel.class);
        startActivity(intent);
    }

}
