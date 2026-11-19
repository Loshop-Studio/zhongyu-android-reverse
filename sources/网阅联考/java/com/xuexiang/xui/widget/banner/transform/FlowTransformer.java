package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class FlowTransformer implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f4) {
        view.setRotationY(f4 * (-30.0f));
    }
}
