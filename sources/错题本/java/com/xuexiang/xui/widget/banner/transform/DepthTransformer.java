package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class DepthTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public final void transformPage(View view, float f) {
        float fAbs;
        float width = 0.0f;
        float f7 = 1.0f;
        if (f <= 0.0f || f >= 1.0f) {
            fAbs = 1.0f;
        } else {
            float f8 = 1.0f - f;
            width = (-f) * view.getWidth();
            fAbs = ((1.0f - Math.abs(f)) * 0.25f) + 0.75f;
            f7 = f8;
        }
        view.setAlpha(f7);
        view.setTranslationX(width);
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
