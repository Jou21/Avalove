package br.com.avalove.avalove;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private Button btnSignIn;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Editando fonte do password
        edtPassword = (EditText) findViewById(R.id.edt_password);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/comic.ttf");
        edtPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        TypefaceSpan typefaceSpan = new CustomTypefaceSpan(custom_font);
        SpannableString spannableString = new SpannableString("");
        spannableString.setSpan(typefaceSpan, 0, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        edtPassword.setHint(spannableString);
        edtPassword.setTypeface(custom_font);

        btnSignIn = (Button) findViewById(R.id.btn_sign_in);

        //this.goToSingIn();
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSignIn = new Intent(Login.this,Cadastro.class);
                startActivity(goToSignIn);
            }
        });

    }
/*
    private void goToSingIn(){
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSignIn = new Intent(Login.this,Cadastro.class);
                startActivity(goToSignIn);
            }
        });
    }*/
}
