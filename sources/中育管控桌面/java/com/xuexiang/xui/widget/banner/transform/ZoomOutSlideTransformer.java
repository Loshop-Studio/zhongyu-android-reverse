package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class ZoomOutSlideTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f6) {
        if (f6 >= -1.0f || f6 <= 1.0f) {
            float height = view.getHeight();
            float fMax = Math.max(0.85f, 1.0f - Math.abs(f6));
            float f7 = 1.0f - fMax;
            float f8 = (height * f7) / 2.0f;
            float width = (view.getWidth() * f7) / 2.0f;
            view.setPivotY(height * 0.5f);
            if (f6 < 0.0f) {
                view.setTranslationX(width - (f8 / 2.0f));
            } else {
                view.setTranslationX((-width) + (f8 / 2.0f));
            }
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            view.setAlpha((((fMax - 0.85f) / 0.14999998f) * 0.100000024f) + 0.9f);
        }
    }
}
