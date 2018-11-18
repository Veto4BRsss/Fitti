package dopfer.fabian.com.fitti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.r0adkll.slidr.Slidr;

public class Nahrungsmittel extends AppCompatActivity {

    private int eiweißAmount;
    private int carbsAmount;
    private int fettAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nahrungsmittel);

        Slidr.attach(this);
    }


    public void openMainActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




}
