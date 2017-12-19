package br.com.avalove.avalove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Tab2 extends AppCompatActivity {

    private Button btnTab1, btnTab3, btnTab4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnTab1 = (Button) findViewById(R.id.btn_tab2_to_tab1);
        btnTab3 = (Button) findViewById(R.id.btn_tab2_to_tab3);
        btnTab4 = (Button) findViewById(R.id.btn_tab2_to_tab4);

        this.goToTab1();
        this.goToTab3();
        this.goToTab4();
    }

    private void goToTab1(){
        btnTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab1 = new Intent(Tab2.this,Tab1.class);
                startActivity(goToTab1);
                finish();
            }
        });
    }

    private void goToTab3(){
        btnTab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab3 = new Intent(Tab2.this,Tab3.class);
                startActivity(goToTab3);
                finish();
            }
        });
    }

    private void goToTab4(){
        btnTab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab4 = new Intent(Tab2.this,Tab4.class);
                startActivity(goToTab4);
                finish();
            }
        });
    }
}
