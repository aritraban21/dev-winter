package aritraban.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Enter details...", Toast.LENGTH_SHORT).show();
    }
    public void sendMesaage(View view){
        EditText edit_1 =(EditText)findViewById(R.id.text1);
        EditText edit_2 = (EditText)findViewById(R.id.text2);
        String text_1 = edit_1.getText().toString();
        String text_2 = edit_2.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("text_1",text_1);
        intent.putExtra("text_2",text_2);
        startActivity(intent);


    }
}
