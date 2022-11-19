package ue.project.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btnClear = findViewById(R.id.btnClear);
//        btnClear.setOnClickListener(this);
    }

    public void onClick(View view) {
        EditText txtFirstName = findViewById(R.id.txtFirstName);
        EditText txtLastName = findViewById(R.id.txtLastName);
        EditText txtEmail = findViewById(R.id.txtEmail);

        TextView tvFirstName = findViewById(R.id.tvFirstName);
        TextView tvLastName = findViewById(R.id.tvLastName);
        TextView tvEmail = findViewById(R.id.tvEmail);

        Button btnClear = findViewById(R.id.btnClear);

        // N:B You can use if or switch to implement all buttons
//        tvFirstName.setText("First Name: " + txtFirstName.getText());
//        tvLastName.setText("Last Name: " + txtLastName.getText());
//        tvEmail.setText("Email: " + txtEmail.getText());

//        if (view.getId() == R.id.btnClear) {
//            tvFirstName.setText("First Name");
//            tvLastName.setText("Last Name");
//            tvEmail.setText("Email");
//        }
//        else if(view.getId() == R.id.btnRegister){
//            tvFirstName.setText("First Name: " + txtFirstName.getText());
//            tvLastName.setText("Last Name: " + txtLastName.getText());
//            tvEmail.setText("Email: " + txtEmail.getText());
//        }


        switch (view.getId()){
            case R.id.btnClear:
                tvFirstName.setText("First Name");
                tvLastName.setText("Last Name");
                tvEmail.setText("Email");
                break;
            case R.id.btnRegister:
                tvFirstName.setText("First Name: " + txtFirstName.getText());
                tvLastName.setText("Last Name: " + txtLastName.getText());
                tvEmail.setText("Email: " + txtEmail.getText());
                break;
            default:
                break;
        }
    }
}
