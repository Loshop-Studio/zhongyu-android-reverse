package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6875e;

/* loaded from: classes4.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {

    /* renamed from: a */
    public int f7631a;

    /* renamed from: b */
    public Drawable f7632b;

    public ClearEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m6806a(Context context, AttributeSet attributeSet, int i10) {
        this.f7631a = AbstractC6872b.m6425a(context, 20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClearEditText, i10, 0);
        this.f7632b = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.ClearEditText_cet_clearIcon);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClearEditText_cet_clearIconSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f7632b == null) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            this.f7632b = drawable;
            if (drawable == null) {
                this.f7632b = AbstractC6875e.m6459o(context, R$drawable.xui_ic_default_clear_btn);
            }
        }
        if (dimensionPixelSize != 0) {
            this.f7632b.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            Drawable drawable2 = this.f7632b;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f7632b.getIntrinsicHeight());
        }
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    /* renamed from: b */
    private boolean m6807b() {
        return getLayoutDirection() == 1;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: c */
    public final boolean m6808c(MotionEvent motionEvent) {
        return m6807b() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f7631a)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f7632b.getIntrinsicWidth()) + this.f7631a)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f7632b.getIntrinsicWidth()) - this.f7631a)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f7631a));
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (z10) {
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
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m6808c(motionEvent)) {
            setText("");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearIconVisible(boolean z10) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], z10 ? this.f7632b : null, getCompoundDrawablesRelative()[3]);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        setClearIconVisible(false);
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ClearEditTextStyle);
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m6806a(context, attributeSet, i10);
    }
}
