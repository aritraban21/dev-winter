package aritraban.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Application Started", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, quiz1.class);
        startActivity(intent);


    }
}

