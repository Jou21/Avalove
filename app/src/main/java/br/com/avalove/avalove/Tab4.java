package br.com.avalove.avalove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Tab4 extends AppCompatActivity {

    private Button btnTab1, btnTab2, btnTab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab4);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnTab1 = (Button) findViewById(R.id.btn_tab4_to_tab1);
        btnTab2 = (Button) findViewById(R.id.btn_tab4_to_tab2);
        btnTab3 = (Button) findViewById(R.id.btn_tab4_to_tab3);

        this.goToTab1();
        this.goToTab2();
        this.goToTab3();
    }

    private void goToTab1(){
        btnTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab1 = new Intent(Tab4.this,Tab1.class);
                startActivity(goToTab1);
                finish();
            }
        });
    }

    private void goToTab2(){
        btnTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab2 = new Intent(Tab4.this,Tab2.class);
                startActivity(goToTab2);
                finish();
            }
        });
    }

    private void goToTab3(){
        btnTab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab3 = new Intent(Tab4.this,Tab3.class);
                startActivity(goToTab3);
                finish();
            }
        });
    }
}
