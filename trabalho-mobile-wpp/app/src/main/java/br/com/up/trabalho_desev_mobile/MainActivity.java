package br.com.up.trabalho_desev_mobile;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout input_layout_phone;
    private TextInputLayout input_layout_msg;

    private TextInputEditText input_text_phone;
    private TextInputEditText input_text_msg;

    private Button buttonSendMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_layout_phone = findViewById(R.id.input_layout_phone);
        input_layout_msg = findViewById(R.id.input_layout_msg);

        input_text_msg = findViewById(R.id.input_text_msg);
        input_text_phone = findViewById(R.id.input_text_phone);

        buttonSendMsg = findViewById(R.id.button_send_msg);
        buttonSendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMsg();
            }
        });
    }

    private void sendMsg(){
        String phone =  input_text_phone.getText().toString();
        String msg =  input_text_msg.getText().toString();

        
    }
}