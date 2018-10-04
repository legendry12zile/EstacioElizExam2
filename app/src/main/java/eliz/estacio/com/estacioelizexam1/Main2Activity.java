package eliz.estacio.com.estacioelizexam1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.button3){
            // doStuff
            Intent intentMain = new Intent(Main2Activity.this,
                    MainActivity.class);
            Main2Activity.this.startActivity(intentMain);
            Log.i("Content View "," GO to Main layout ");
        }

    }
}