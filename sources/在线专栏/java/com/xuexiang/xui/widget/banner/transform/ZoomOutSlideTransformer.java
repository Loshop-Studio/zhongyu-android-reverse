package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ZoomOutSlideTransformer implements ViewPager.InterfaceC0780j {
    private static final float MIN_ALPHA = 0.9f;
    private static final float MIN_SCALE = 0.85f;

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0780j
    public void transformPage(View view, float f4) {
        if (f4 >= -1.0f || f4 <= 1.0f) {
            float height = view.getHeight();
            float fMax = Math.max(MIN_SCALE, 1.0f - Math.abs(f4));
            float f5 = 1.0f - fMax;
            float f6 = (height * f5) / 2.0f;
            float width = (view.getWidth() * f5) / 2.0f;
            view.setPivotY(height * 0.5f);
            if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
                view.setTranslationX(width - (f6 / 2.0f));
            } else {
                view.setTranslationX((-width) + (f6 / 2.0f));
            }
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            view.setAlpha((((fMax - MIN_SCALE) / 0.14999998f) * 0.100000024f) + MIN_ALPHA);
        }
    }
}
