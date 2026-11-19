package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {
    public ClearEditText(Context context) {
        this(context, null);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        if (z8) {
            setClearIconVisible((getText() != null ? getText().length() : 0) > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        setClearIconVisible(charSequence.length() > 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1) {
            if (getLayoutDirection() != 1) {
                motionEvent.getX();
                getWidth();
                getPaddingRight();
                throw null;
            }
            if (motionEvent.getX() > getPaddingLeft()) {
                motionEvent.getX();
                getPaddingLeft();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearIconVisible(boolean z8) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], null, getCompoundDrawablesRelative()[3]);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        setClearIconVisible(false);
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ClearEditTextStyle);
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC6582a.m6217a();
        throw null;
    }
}
