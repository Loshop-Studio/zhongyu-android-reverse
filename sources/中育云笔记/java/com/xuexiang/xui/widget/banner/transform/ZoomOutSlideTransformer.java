package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes5.dex */
public class ZoomOutSlideTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f10) {
        if (f10 >= -1.0f || f10 <= 1.0f) {
            float height = view.getHeight();
            float fMax = Math.max(0.85f, 1.0f - Math.abs(f10));
            float f11 = 1.0f - fMax;
            float f12 = (height * f11) / 2.0f;
            float width = (view.getWidth() * f11) / 2.0f;
            view.setPivotY(height * 0.5f);
            if (f10 < 0.0f) {
                view.setTranslationX(width - (f12 / 2.0f));
            } else {
                view.setTranslationX((-width) + (f12 / 2.0f));
            }
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            view.setAlpha((((fMax - 0.85f) / 0.14999998f) * 0.100000024f) + 0.9f);
        }
    }
}
