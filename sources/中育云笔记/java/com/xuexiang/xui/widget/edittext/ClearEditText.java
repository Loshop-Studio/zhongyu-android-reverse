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
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;

/* loaded from: classes5.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {

    /* renamed from: c */
    public int f15879c;

    /* renamed from: d */
    public Drawable f15880d;

    public ClearEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m12563a(Context context, AttributeSet attributeSet, int i10) {
        this.f15879c = AbstractC8037c.m12187a(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClearEditText, i10, 0);
        this.f15880d = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.ClearEditText_cet_clearIcon);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClearEditText_cet_clearIconSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f15880d == null) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            this.f15880d = drawable;
            if (drawable == null) {
                this.f15880d = AbstractC8040f.m12211l(context, R$drawable.xui_ic_default_clear_btn);
            }
        }
        if (dimensionPixelSize != 0) {
            this.f15880d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            Drawable drawable2 = this.f15880d;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f15880d.getIntrinsicHeight());
        }
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    /* renamed from: b */
    private boolean m12564b() {
        return getLayoutDirection() == 1;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: c */
    public final boolean m12565c(MotionEvent motionEvent) {
        return m12564b() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f15879c)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f15880d.getIntrinsicWidth()) + this.f15879c)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f15880d.getIntrinsicWidth()) - this.f15879c)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f15879c));
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
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && m12565c(motionEvent)) {
            setText("");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearIconVisible(boolean z10) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], z10 ? this.f15880d : null, getCompoundDrawablesRelative()[3]);
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
        m12563a(context, attributeSet, i10);
    }
}
