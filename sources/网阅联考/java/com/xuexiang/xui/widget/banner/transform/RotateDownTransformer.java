package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class RotateDownTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f4) {
        float width = view.getWidth();
        float height = view.getHeight();
        view.setPivotX(width * 0.5f);
        view.setPivotY(height);
        view.setRotation(f4 * (-15.0f) * (-1.25f));
    }
}
