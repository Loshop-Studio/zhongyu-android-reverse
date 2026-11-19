package com.xuexiang.xui.widget.textview;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class BadgeView extends AppCompatTextView {

    /* renamed from: b */
    public boolean f3959b;

    /* renamed from: b */
    public final int m4582b(float f4) {
        return (int) ((f4 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public boolean m4583c() {
        return this.f3959b;
    }

    /* renamed from: d */
    public void m4584d(int i4, int i5, int i6, int i7) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = m4582b(i4);
        layoutParams.topMargin = m4582b(i5);
        layoutParams.rightMargin = m4582b(i6);
        layoutParams.bottomMargin = m4582b(i7);
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

    public void setBadgeCount(int i4) {
        setText(String.valueOf(i4));
    }

    public void setBadgeGravity(int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = i4;
        setLayoutParams(layoutParams);
    }

    public void setBadgeMargin(int i4) {
        m4584d(i4, i4, i4, i4);
    }

    public void setHideOnNull(boolean z3) {
        this.f3959b = z3;
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
        if (m4583c() && (charSequence == null || "0".equalsIgnoreCase(charSequence.toString()))) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }
}
