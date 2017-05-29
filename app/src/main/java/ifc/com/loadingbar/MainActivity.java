package ifc.com.loadingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ifc.com.loadingbar.indicators.CustomProgress;

public class MainActivity extends AppCompatActivity {
    CustomProgress customProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customProgress = CustomProgress.getInstance();
        customProgress.showProgress(MainActivity.this);
    }
}
