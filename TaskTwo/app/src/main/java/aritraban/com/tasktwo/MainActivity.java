package aritraban.com.tasktwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView)findViewById(R.id.result_text);
    }
    public void Change_State(View view)
    {
        boolean checked =((ToggleButton)view).isChecked();
        if(checked)
        {
            textView.setText("Goodbye World");
        }
        else
        {
            textView.setText("Hello World");
        }
    }
}
