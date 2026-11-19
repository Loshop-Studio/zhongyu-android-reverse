package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class RotateUpTransformer implements ViewPager.InterfaceC0780j {
    private static final float ROT_MOD = -15.0f;

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0780j
    public void transformPage(View view, float f4) {
        float width = view.getWidth();
        float f5 = f4 * ROT_MOD;
        view.setPivotX(width * 0.5f);
        view.setPivotY(IGoodView.DEFAULT_TO_ALPHA);
        view.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
        view.setRotation(f5);
    }
}
