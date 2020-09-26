package kau.edu.stugpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;
    EditText send_text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button=(Button)findViewById(R.id.button);
        send_text=(EditText)findViewById(R.id.editTextTextPersonName);
        send_text2=(EditText)findViewById(R.id.editTextNumber);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                // get the value which input by user in EditText
                // and convert it to string
                String str = "Welcome "+send_text.getText().toString()+"\n your GPA is :"+send_text2.getText().toString();

                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(getApplicationContext(), show_gpa.class);

                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                intent.putExtra("message_key", str);

                // start the Intent
                startActivity(intent);
            }
        });
    }
}