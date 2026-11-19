package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes5.dex */
public class RotateUpTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f10) {
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(f10 * (-15.0f));
    }
}
