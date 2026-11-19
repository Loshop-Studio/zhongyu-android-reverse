package com.blankj.utilcode.util;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public final class ToastUtils$UtilsMaxWidthRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    public static final int f2114a = AbstractC3383c0.m2323b(80.0f);

    public ToastUtils$UtilsMaxWidthRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        int i9;
        WindowManager windowManager = (WindowManager) AbstractC3382c.m2303d().getSystemService("window");
        if (windowManager == null) {
            i9 = -1;
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            i9 = point.x;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9 - f2114a, Integer.MIN_VALUE), i8);
    }

    public ToastUtils$UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ToastUtils$UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
