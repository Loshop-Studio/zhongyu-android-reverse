package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class FadeSlideTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public final void transformPage(View view, float f) {
        view.setTranslationX(0.0f);
        if (f <= -1.0f || f >= 1.0f) {
            view.setAlpha(0.0f);
        } else if (f == 0.0f) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(1.0f - Math.abs(f));
        }
    }
}
