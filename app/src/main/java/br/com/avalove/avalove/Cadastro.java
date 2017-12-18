package br.com.avalove.avalove;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;
import android.view.WindowManager;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {

    private EditText edtPassword1,edtPassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Editando fonte do password
        edtPassword1 = (EditText) findViewById(R.id.edt_cadastro_password1);
        edtPassword2 = (EditText) findViewById(R.id.edt_cadastro_password2);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/comic.ttf");
        edtPassword1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        edtPassword2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        TypefaceSpan typefaceSpan = new CustomTypefaceSpan(custom_font);
        SpannableString spannableString = new SpannableString("");
        spannableString.setSpan(typefaceSpan, 0, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        edtPassword1.setHint(spannableString);
        edtPassword2.setHint(spannableString);
        edtPassword1.setTypeface(custom_font);
        edtPassword2.setTypeface(custom_font);
    }
}
