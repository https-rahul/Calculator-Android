package application.rahul.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button plus, minus, multiply, divide;
    TextView result;
    EditText value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        result = findViewById(R.id.result);
        value1 = findViewById(R.id.value_1);
        value2 = findViewById(R.id.value_2);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int valueOne = Integer.parseInt(value1.getText().toString());
        int valueTwo = Integer.parseInt(value2.getText().toString());

        switch (v.getId()) {
            case R.id.plus:
                result.setText(valueOne + valueTwo + "");
                break;
            case R.id.minus:
                result.setText(valueOne - valueTwo + "");
                break;
            case R.id.multiply:
                result.setText(valueOne * valueTwo + "");
                break;
            case R.id.divide:
                result.setText(valueOne / valueTwo + "");
                break;
        }
    }
}
