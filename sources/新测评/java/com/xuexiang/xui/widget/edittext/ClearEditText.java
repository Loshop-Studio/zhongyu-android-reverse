package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes4.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {

    /* renamed from: a */
    public int f6244a;

    /* renamed from: b */
    public Drawable f6245b;

    /* renamed from: a */
    private boolean m5642a() {
        return getLayoutDirection() == 1;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public final boolean m5643b(MotionEvent motionEvent) {
        return m5642a() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f6244a)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f6245b.getIntrinsicWidth()) + this.f6244a)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f6245b.getIntrinsicWidth()) - this.f6244a)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f6244a));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z9) {
        if (z9) {
            setClearIconVisible((getText() != null ? getText().length() : 0) > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        setClearIconVisible(charSequence.length() > 0);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m5643b(motionEvent)) {
            setText("");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearIconVisible(boolean z9) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], z9 ? this.f6245b : null, getCompoundDrawablesRelative()[3]);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        setClearIconVisible(false);
    }
}
