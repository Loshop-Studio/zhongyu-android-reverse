package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes2.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {

    /* renamed from: a */
    public int f3448a;

    /* renamed from: b */
    public Drawable f3449b;

    /* renamed from: a */
    public final boolean m4284a() {
        return getLayoutDirection() == 1;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public final boolean m4285b(MotionEvent motionEvent) {
        return m4284a() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f3448a)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f3449b.getIntrinsicWidth()) + this.f3448a)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f3449b.getIntrinsicWidth()) - this.f3448a)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f3448a));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z3) {
        if (z3) {
            setClearIconVisible((getText() != null ? getText().length() : 0) > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        setClearIconVisible(charSequence.length() > 0);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m4285b(motionEvent)) {
            setText("");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearIconVisible(boolean z3) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], z3 ? this.f3449b : null, getCompoundDrawablesRelative()[3]);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        setClearIconVisible(false);
    }
}
