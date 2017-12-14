package br.com.avalove.avalove;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class FontePersonalizada extends android.support.v7.widget.AppCompatEditText {

    public FontePersonalizada(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public FontePersonalizada(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public FontePersonalizada(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        if (attrs!=null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.FontePersonalizada);
            String minhaFonte = a.getString(R.styleable.FontePersonalizada_minhaFonte);

            if (minhaFonte!=null) {
                Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/"+minhaFonte);
                setTypeface(myTypeface);
            }

            a.recycle();
        }
    }
}