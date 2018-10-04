package eliz.estacio.com.estacioelizexam1;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_act);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.button2) {
            // doStuff
            Intent intentMain = new Intent(MainActivity.this,
                    Main2Activity.class);
            MainActivity.this.startActivity(intentMain);
            Log.i("Content "," Screen 2 ");
        }  else if (v.getId() == R.id.button) {
            Intent intentMain = new Intent(Intent.ACTION_VIEW);
            intentMain.setData(Uri.parse("geo:14.6097, 120.9896"));
            intentMain.setPackage("com.google.android.apps.maps");
            startActivity(intentMain);
        }
    }
}