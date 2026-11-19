package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class RotateDownTransformer implements ViewPager.InterfaceC0780j {
    private static final float ROT_MOD = -15.0f;

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0780j
    public void transformPage(View view, float f4) {
        float width = view.getWidth();
        float height = view.getHeight();
        float f5 = f4 * ROT_MOD * (-1.25f);
        view.setPivotX(width * 0.5f);
        view.setPivotY(height);
        view.setRotation(f5);
    }
}
