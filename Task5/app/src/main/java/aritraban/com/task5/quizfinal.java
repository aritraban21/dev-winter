package aritraban.com.task5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class quizfinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizfinal);
        Bundle bundle =getIntent().getExtras();

        int score=bundle.getInt("score");
        String text=String.valueOf(score);
        text="Your final score is : "+text;

        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setText(text);

    }
}
