package com.polarity.summerproject.polarity;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Malzberry on 1/15/2016.
 */
public class InstructionsActivity extends Activity {
    TextView para1, title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.instructions);

        para1 = (TextView) findViewById(R.id.para1);
        title = (TextView) findViewById(R.id.title);

        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/minecraft.ttf");

        para1.setTypeface(myCustomFont);
        title.setTypeface(myCustomFont);
    }
}
