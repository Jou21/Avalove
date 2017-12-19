package br.com.avalove.avalove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Tab3 extends AppCompatActivity {

    private Button btnTab1, btnTab2, btnTab4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnTab1 = (Button) findViewById(R.id.btn_tab3_to_tab1);
        btnTab2 = (Button) findViewById(R.id.btn_tab3_to_tab2);
        btnTab4 = (Button) findViewById(R.id.btn_tab3_to_tab4);

        this.goToTab1();
        this.goToTab2();
        this.goToTab4();
    }

    private void goToTab1(){
        btnTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab1 = new Intent(Tab3.this,Tab1.class);
                startActivity(goToTab1);
                finish();
            }
        });
    }

    private void goToTab2(){
        btnTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab2 = new Intent(Tab3.this,Tab2.class);
                startActivity(goToTab2);
                finish();
            }
        });
    }

    private void goToTab4(){
        btnTab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab4 = new Intent(Tab3.this,Tab4.class);
                startActivity(goToTab4);
                finish();
            }
        });
    }
}
