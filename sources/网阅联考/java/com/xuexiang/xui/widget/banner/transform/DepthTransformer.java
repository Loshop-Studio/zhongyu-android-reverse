package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class DepthTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f4) {
        float fAbs;
        float width = 0.0f;
        float f5 = 1.0f;
        if (f4 <= 0.0f || f4 >= 1.0f) {
            fAbs = 1.0f;
        } else {
            float f6 = 1.0f - f4;
            width = (-f4) * view.getWidth();
            fAbs = ((1.0f - Math.abs(f4)) * 0.25f) + 0.75f;
            f5 = f6;
        }
        view.setAlpha(f5);
        view.setTranslationX(width);
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
