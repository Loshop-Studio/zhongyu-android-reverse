package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes4.dex */
public class FadeSlideTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f10) {
        view.setTranslationX(0.0f);
        if (f10 <= -1.0f || f10 >= 1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 == 0.0f) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(1.0f - Math.abs(f10));
        }
    }
}
