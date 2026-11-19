package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class ValidatorEditText extends AppCompatEditText implements View.OnFocusChangeListener {

    /* renamed from: a */
    public CharSequence f4300a;

    /* renamed from: b */
    public final boolean f4301b;

    public ValidatorEditText(Context context) {
        this(context, null);
    }

    private void setErrorIconVisible(boolean z8) {
        if (z8) {
            boolean z9 = this.f4301b;
        }
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], null, getCompoundDrawablesRelative()[3]);
    }

    public CharSequence getErrorMsg() {
        return this.f4300a;
    }

    public String getInputValue() {
        return getEditableText().toString().trim();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1) {
            if (getLayoutDirection() != 1) {
                motionEvent.getX();
                getWidth();
                getPaddingEnd();
                throw null;
            }
            if (motionEvent.getX() > getPaddingStart()) {
                motionEvent.getX();
                getPaddingStart();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setFocusable(z8);
        super.setFocusableInTouchMode(z8);
        super.setEnabled(z8);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f4300a = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            setErrorIconVisible(false);
            setBackground(getContext().getDrawable(R$drawable.xui_config_bg_edittext));
        } else {
            charSequence.toString();
            setErrorIconVisible(true);
            setBackground(getContext().getDrawable(R$drawable.xui_config_color_edittext_error));
        }
    }

    public ValidatorEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ValidatorEditTextStyle);
    }

    public ValidatorEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4301b = true;
        AbstractC6582a.m6217a();
        throw null;
    }
}
