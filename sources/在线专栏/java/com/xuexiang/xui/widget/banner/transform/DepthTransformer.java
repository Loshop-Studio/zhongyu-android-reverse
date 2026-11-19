package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class DepthTransformer implements ViewPager.InterfaceC0780j {
    private static final float MIN_SCALE_DEPTH = 0.75f;

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0780j
    public void transformPage(View view, float f4) {
        float fAbs;
        float width = IGoodView.DEFAULT_TO_ALPHA;
        float f5 = 1.0f;
        if (f4 <= IGoodView.DEFAULT_TO_ALPHA || f4 >= 1.0f) {
            fAbs = 1.0f;
        } else {
            float f6 = 1.0f - f4;
            width = (-f4) * view.getWidth();
            fAbs = ((1.0f - Math.abs(f4)) * 0.25f) + MIN_SCALE_DEPTH;
            f5 = f6;
        }
        view.setAlpha(f5);
        view.setTranslationX(width);
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
