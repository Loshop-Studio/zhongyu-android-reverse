package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes5.dex */
public class DepthTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f10) {
        float fAbs;
        float width = 0.0f;
        float f11 = 1.0f;
        if (f10 <= 0.0f || f10 >= 1.0f) {
            fAbs = 1.0f;
        } else {
            float f12 = 1.0f - f10;
            width = (-f10) * view.getWidth();
            fAbs = ((1.0f - Math.abs(f10)) * 0.25f) + 0.75f;
            f11 = f12;
        }
        view.setAlpha(f11);
        view.setTranslationX(width);
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
