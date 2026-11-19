package com.xuexiang.xui.widget.textview;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class BadgeView extends AppCompatTextView {

    /* renamed from: b */
    public boolean f6773b;

    /* renamed from: b */
    public final int m5951b(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public boolean m5952c() {
        return this.f6773b;
    }

    /* renamed from: d */
    public void m5953d(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = m5951b(i10);
        layoutParams.topMargin = m5951b(i11);
        layoutParams.rightMargin = m5951b(i12);
        layoutParams.bottomMargin = m5951b(i13);
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
        m5953d(i10, i10, i10, i10);
    }

    public void setHideOnNull(boolean z9) {
        this.f6773b = z9;
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
        if (m5952c() && (charSequence == null || "0".equalsIgnoreCase(charSequence.toString()))) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }
}
