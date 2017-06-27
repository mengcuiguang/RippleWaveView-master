package com.meng.ripplewaveview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

public class RippleSpreadTextView extends FrameLayout {

    private TextView textView;
    private RippleSpreadView rippleSpreadView;

    public RippleSpreadTextView(@NonNull Context context) {
        super(context);
    }

    public RippleSpreadTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.img_text_bt, this, true);

        this.rippleSpreadView = (RippleSpreadView) findViewById(R.id.rsv);
        this.textView = (TextView) findViewById(R.id.textview);

    }

    public void setText(String text) {
        this.textView.setText(text);
    }

    public void setTextColor(int color) {
        this.textView.setTextColor(color);
    }

    public void setTextSize(float size) {
        this.textView.setTextSize(size);
    }

    public void setStartLayoutAnim() {
        this.rippleSpreadView.setStartAnim();
    }

    public void setCloseLayoutAnim() {
        this.rippleSpreadView.setCloseAnim();
    }
}
