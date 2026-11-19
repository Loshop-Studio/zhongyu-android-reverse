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
import android.widget.TabWidget;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class BadgeView extends AppCompatTextView {
    private boolean mHideOnNull;

    public BadgeView(Context context) {
        super(context);
        this.mHideOnNull = true;
        init();
    }

    private int dip2Px(float f4) {
        return (int) ((f4 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void init() {
        if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
        }
        setTextColor(-1);
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(2, 11.0f);
        setPadding(dip2Px(5.0f), dip2Px(1.0f), dip2Px(5.0f), dip2Px(1.0f));
        setBackground(9, Color.parseColor("#d3321b"));
        setGravity(17);
        setHideOnNull(true);
    }

    public void decrementBadgeCount(int i4) {
        incrementBadgeCount(-i4);
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

    public void hide() {
        setVisibility(8);
    }

    public void incrementBadgeCount(int i4) {
        Integer badgeCount = getBadgeCount();
        if (badgeCount == null) {
            setBadgeCount(i4);
        } else {
            setBadgeCount(i4 + badgeCount.intValue());
        }
    }

    public boolean isHideOnNull() {
        return this.mHideOnNull;
    }

    public void setBackground(int i4, int i5) {
        float fDip2Px = dip2Px(i4);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fDip2Px, fDip2Px, fDip2Px, fDip2Px, fDip2Px, fDip2Px, fDip2Px, fDip2Px}, null, null));
        shapeDrawable.getPaint().setColor(i5);
        setBackgroundDrawable(shapeDrawable);
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
        setBadgeMargin(i4, i4, i4, i4);
    }

    public void setHideOnNull(boolean z3) {
        this.mHideOnNull = z3;
        setText(getText());
    }

    public void setTargetView(TabWidget tabWidget, int i4) {
        setTargetView(tabWidget.getChildTabViewAt(i4));
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (isHideOnNull() && (charSequence == null || MessageService.MSG_DB_READY_REPORT.equalsIgnoreCase(charSequence.toString()))) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }

    public void show() {
        setVisibility(0);
    }

    public void setBadgeMargin(int i4, int i5, int i6, int i7) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = dip2Px(i4);
        layoutParams.topMargin = dip2Px(i5);
        layoutParams.rightMargin = dip2Px(i6);
        layoutParams.bottomMargin = dip2Px(i7);
        setLayoutParams(layoutParams);
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
        if (view.getParent() instanceof ViewGroup) {
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
            return;
        }
        if (view.getParent() == null) {
            Log.e(getClass().getSimpleName(), "ParentView is needed");
        }
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.mHideOnNull = true;
        init();
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mHideOnNull = true;
        init();
    }
}
