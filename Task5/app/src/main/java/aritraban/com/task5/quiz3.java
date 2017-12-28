package aritraban.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class quiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
    }

    public void toqfinal(View view) {
        Bundle bundle =getIntent().getExtras();

        int score=bundle.getInt("score");
        boolean c1 =((ToggleButton)findViewById(R.id.b1)).isChecked();
        boolean c2 =((ToggleButton)findViewById(R.id.b2)).isChecked();
        boolean c3 =((ToggleButton)findViewById(R.id.b3)).isChecked();
        boolean c4 =((ToggleButton)findViewById(R.id.b4)).isChecked();
        if((!c1)&&(c2)&&(!c3)&&(!c4))
        {
            score++;
        }
        Intent intent = new Intent(this, quizfinal.class);
        intent.putExtra("score",score);
        startActivity(intent);
    }
}
