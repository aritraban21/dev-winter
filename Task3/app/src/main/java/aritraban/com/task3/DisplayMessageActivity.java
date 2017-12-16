package aritraban.com.task3;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import static android.support.design.widget.Snackbar.*;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        make(findViewById(android.R.id.content), "SecondActivity", LENGTH_LONG)
                .setAction("Action",null).show();
    }
}
