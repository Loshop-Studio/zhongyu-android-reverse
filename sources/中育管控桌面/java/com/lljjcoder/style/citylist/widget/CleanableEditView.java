package com.lljjcoder.style.citylist.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes3.dex */
public class CleanableEditView extends EditText implements TextWatcher, View.OnFocusChangeListener {
    private boolean hasFocus;
    private Drawable left;
    private Drawable right;
    private int xUp;

    public CleanableEditView(Context context) {
        this(context, null);
    }

    private void addListeners() {
        try {
            setOnFocusChangeListener(this);
            addTextChangedListener(this);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void initDatas() {
        try {
            setCompoundDrawablesWithIntrinsicBounds(this.left, (Drawable) null, (Drawable) null, (Drawable) null);
            addListeners();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void initWedgits(AttributeSet attributeSet) {
        try {
            this.left = getCompoundDrawables()[0];
            this.right = getCompoundDrawables()[2];
            initDatas();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z6) {
        try {
            this.hasFocus = z6;
            String string = getText().toString();
            if (z6) {
                if (string.equalsIgnoreCase("")) {
                    setCompoundDrawablesWithIntrinsicBounds(this.left, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds(this.left, (Drawable) null, this.right, (Drawable) null);
                }
            }
            if (z6) {
                return;
            }
            setCompoundDrawablesWithIntrinsicBounds(this.left, (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        if (this.hasFocus) {
            if (TextUtils.isEmpty(charSequence)) {
                setCompoundDrawablesWithIntrinsicBounds(this.left, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            if (this.right == null) {
                this.right = getCompoundDrawables()[2];
            }
            setCompoundDrawablesWithIntrinsicBounds(this.left, (Drawable) null, this.right, (Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.xUp = (int) motionEvent.getX();
                if (getWidth() - this.xUp <= getCompoundPaddingRight() && !TextUtils.isEmpty(getText().toString())) {
                    setText("");
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return super.onTouchEvent(motionEvent);
    }

    public String text_String() {
        return getText().toString();
    }

    public CleanableEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public CleanableEditView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.hasFocus = false;
        this.xUp = 0;
        initWedgits(attributeSet);
    }
}
