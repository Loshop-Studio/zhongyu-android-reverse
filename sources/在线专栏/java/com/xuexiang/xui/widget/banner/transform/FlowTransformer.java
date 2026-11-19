package com.xuexiang.xui.widget.banner.transform;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class FlowTransformer implements ViewPager.InterfaceC0780j {
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0780j
    public void transformPage(View view, float f4) {
        view.setRotationY(f4 * (-30.0f));
    }
}
