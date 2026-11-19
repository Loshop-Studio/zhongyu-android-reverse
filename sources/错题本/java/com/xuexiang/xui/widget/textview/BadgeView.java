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

/* loaded from: classes3.dex */
public class BadgeView extends AppCompatTextView {

    /* renamed from: b */
    public boolean f4997b;

    public BadgeView(Context context) {
        super(context);
        this.f4997b = true;
        m3611c();
    }

    /* renamed from: b */
    public final int m3610b(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public final void m3611c() {
        if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
        }
        setTextColor(-1);
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(2, 11.0f);
        setPadding(m3610b(5.0f), m3610b(1.0f), m3610b(5.0f), m3610b(1.0f));
        int color = Color.parseColor("#d3321b");
        float fM3610b = m3610b(9);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fM3610b, fM3610b, fM3610b, fM3610b, fM3610b, fM3610b, fM3610b, fM3610b}, null, null));
        shapeDrawable.getPaint().setColor(color);
        setBackgroundDrawable(shapeDrawable);
        setGravity(17);
        setHideOnNull(true);
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

    public void setBadgeCount(int i) {
        setText(String.valueOf(i));
    }

    public void setBadgeGravity(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = i;
        setLayoutParams(layoutParams);
    }

    public void setBadgeMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float f = i;
        layoutParams.leftMargin = m3610b(f);
        layoutParams.topMargin = m3610b(f);
        layoutParams.rightMargin = m3610b(f);
        layoutParams.bottomMargin = m3610b(f);
        setLayoutParams(layoutParams);
    }

    public void setHideOnNull(boolean z8) {
        this.f4997b = z8;
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
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f4997b && (charSequence == null || "0".equalsIgnoreCase(charSequence.toString()))) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.f4997b = true;
        m3611c();
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4997b = true;
        m3611c();
    }
}
