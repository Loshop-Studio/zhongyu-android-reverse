package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class FadeSlideTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f4) {
        view.setTranslationX(0.0f);
        if (f4 <= -1.0f || f4 >= 1.0f) {
            view.setAlpha(0.0f);
        } else if (f4 == 0.0f) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(1.0f - Math.abs(f4));
        }
    }
}
