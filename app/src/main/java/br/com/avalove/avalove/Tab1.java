package br.com.avalove.avalove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Tab1 extends AppCompatActivity {

    private Button btnTab2, btnTab3, btnTab4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnTab2 = (Button) findViewById(R.id.btn_tab1_to_tab2);
        btnTab3 = (Button) findViewById(R.id.btn_tab1_to_tab3);
        btnTab4 = (Button) findViewById(R.id.btn_tab1_to_tab4);

        this.goToTab2();
        this.goToTab3();
        this.goToTab4();
    }

    private void goToTab2(){
        btnTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab2 = new Intent(Tab1.this,Tab2.class);
                startActivity(goToTab2);
                finish();
            }
        });
    }

    private void goToTab3(){
        btnTab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab3 = new Intent(Tab1.this,Tab3.class);
                startActivity(goToTab3);
                finish();
            }
        });
    }

    private void goToTab4(){
        btnTab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTab4 = new Intent(Tab1.this,Tab4.class);
                startActivity(goToTab4);
                finish();
            }
        });
    }
}
