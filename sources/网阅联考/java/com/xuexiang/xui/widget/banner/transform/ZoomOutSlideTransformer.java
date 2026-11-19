package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class ZoomOutSlideTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f4) {
        if (f4 >= -1.0f || f4 <= 1.0f) {
            float height = view.getHeight();
            float fMax = Math.max(0.85f, 1.0f - Math.abs(f4));
            float f5 = 1.0f - fMax;
            float f6 = (height * f5) / 2.0f;
            float width = (view.getWidth() * f5) / 2.0f;
            view.setPivotY(height * 0.5f);
            if (f4 < 0.0f) {
                view.setTranslationX(width - (f6 / 2.0f));
            } else {
                view.setTranslationX((-width) + (f6 / 2.0f));
            }
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            view.setAlpha((((fMax - 0.85f) / 0.14999998f) * 0.100000024f) + 0.9f);
        }
    }
}
