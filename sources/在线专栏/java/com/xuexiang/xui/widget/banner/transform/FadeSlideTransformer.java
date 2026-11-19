package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class FadeSlideTransformer implements ViewPager.InterfaceC0780j {
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0780j
    public void transformPage(View view, float f4) {
        view.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
        if (f4 <= -1.0f || f4 >= 1.0f) {
            view.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
        } else if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(1.0f - Math.abs(f4));
        }
    }
}
