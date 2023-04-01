package ru.mirea.gorkoun.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItsNotMe;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = findViewById(R.id.tvOut);
        btnItsNotMe = findViewById(R.id.btnItsNotMe);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener oclWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Мой номер по списку №86");
                if (checkBox.isChecked()){
                    checkBox.setChecked(false);
                }
                else{
                    checkBox.setChecked(true);
                }
            }
        };
        btnWhoAmI.setOnClickListener(oclWhoAmI);
    }
    public void onMyButtonClick(View view){
        tvOut.setText("Это не я");
        if (checkBox.isChecked()){
            checkBox.setChecked(false);
        }
        else{
            checkBox.setChecked(true);
        }
    }
}