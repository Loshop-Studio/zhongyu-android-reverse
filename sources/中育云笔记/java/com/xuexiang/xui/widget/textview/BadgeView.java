package com.xuexiang.xui.widget.textview;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes5.dex */
public class BadgeView extends AppCompatTextView {

    /* renamed from: d */
    public boolean f17242d;

    public BadgeView(Context context) {
        super(context);
        this.f17242d = true;
        m13487d();
    }

    /* renamed from: d */
    private void m13487d() {
        if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
        }
        setTextColor(-1);
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(2, 11.0f);
        setPadding(m13488c(5.0f), m13488c(1.0f), m13488c(5.0f), m13488c(1.0f));
        m13490f(9, Color.parseColor("#d3321b"));
        setGravity(17);
        setHideOnNull(true);
    }

    /* renamed from: c */
    public final int m13488c(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: e */
    public boolean m13489e() {
        return this.f17242d;
    }

    /* renamed from: f */
    public void m13490f(int i10, int i11) {
        float fM13488c = m13488c(i10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fM13488c, fM13488c, fM13488c, fM13488c, fM13488c, fM13488c, fM13488c, fM13488c}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        setBackgroundDrawable(shapeDrawable);
    }

    /* renamed from: g */
    public void m13491g(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = m13488c(i10);
        layoutParams.topMargin = m13488c(i11);
        layoutParams.rightMargin = m13488c(i12);
        layoutParams.bottomMargin = m13488c(i13);
        setLayoutParams(layoutParams);
    }

    public Integer getBadgeCount() {
        if (getText() == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(getText().toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int getBadgeGravity() {
        return ((FrameLayout.LayoutParams) getLayoutParams()).gravity;
    }

    public int[] getBadgeMargin() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        return new int[]{layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin};
    }

    public void setBadgeCount(int i10) {
        setText(String.valueOf(i10));
    }

    public void setBadgeGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = i10;
        setLayoutParams(layoutParams);
    }

    public void setBadgeMargin(int i10) {
        m13491g(i10, i10, i10, i10);
    }

    public void setHideOnNull(boolean z10) {
        this.f17242d = z10;
        setText(getText());
    }

    public void setTargetView(View view) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (view == null) {
            return;
        }
        if (view.getParent() instanceof FrameLayout) {
            ((FrameLayout) view.getParent()).addView(this);
            return;
        }
        if (!(view.getParent() instanceof ViewGroup)) {
            if (view.getParent() == null) {
                Log.e(getClass().getSimpleName(), "ParentView is needed");
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        frameLayout.setLayoutParams(layoutParams);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(frameLayout, iIndexOfChild, layoutParams);
        frameLayout.addView(view);
        frameLayout.addView(this);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (m13489e() && (charSequence == null || "0".equalsIgnoreCase(charSequence.toString()))) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.f17242d = true;
        m13487d();
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17242d = true;
        m13487d();
    }
}
