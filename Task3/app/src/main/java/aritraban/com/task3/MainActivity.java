package aritraban.com.task3;

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

        Toast.makeText(getApplicationContext(),"Application Started", Toast.LENGTH_SHORT).show();
    }
    public void sendMesaage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);


    }
}
