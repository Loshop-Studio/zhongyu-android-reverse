package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {
    private Drawable mClearDrawable;
    private int mExtraClickArea;

    public ClearEditText(Context context) {
        this(context, null);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        this.mExtraClickArea = DensityUtils.dp2px(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ClearEditText, i4, 0);
        this.mClearDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.ClearEditText_cet_clearIcon);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ClearEditText_cet_clearIconSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (this.mClearDrawable == null) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            this.mClearDrawable = drawable;
            if (drawable == null) {
                this.mClearDrawable = ResUtils.getVectorDrawable(context, C2042R.drawable.xui_ic_default_clear_btn);
            }
        }
        if (dimensionPixelSize != 0) {
            this.mClearDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            Drawable drawable2 = this.mClearDrawable;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.mClearDrawable.getIntrinsicHeight());
        }
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private boolean isTouchable(MotionEvent motionEvent) {
        return isRtl() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.mExtraClickArea)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.mClearDrawable.getIntrinsicWidth()) + this.mExtraClickArea)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.mClearDrawable.getIntrinsicWidth()) - this.mExtraClickArea)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.mExtraClickArea));
    }

    public static Animation shakeAnimation(int i4) {
        TranslateAnimation translateAnimation = new TranslateAnimation(IGoodView.DEFAULT_TO_ALPHA, 10.0f, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
        translateAnimation.setInterpolator(new CycleInterpolator(i4));
        translateAnimation.setDuration(1000L);
        return translateAnimation;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
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
        if (getCompoundDrawablesRelative()[2] != null && motionEvent.getAction() == 1 && isTouchable(motionEvent)) {
            setText("");
        }
        return super.onTouchEvent(motionEvent);
    }

    protected void setClearIconVisible(boolean z3) {
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], z3 ? this.mClearDrawable : null, getCompoundDrawablesRelative()[3]);
    }

    public ClearEditText setExtraClickAreaSize(int i4) {
        this.mExtraClickArea = i4;
        return this;
    }

    public void setShakeAnimation() {
        setAnimation(shakeAnimation(5));
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        setClearIconVisible(false);
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.ClearEditTextStyle);
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initAttrs(context, attributeSet, i4);
    }
}
