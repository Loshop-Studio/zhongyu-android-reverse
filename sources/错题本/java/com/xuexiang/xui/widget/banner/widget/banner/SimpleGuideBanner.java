package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;
import p003a2.InterfaceC0007b;

/* loaded from: classes3.dex */
public class SimpleGuideBanner extends BaseIndicatorBanner<Object, SimpleGuideBanner> {

    /* renamed from: L */
    public InterfaceC0007b f4024L;

    public SimpleGuideBanner(Context context) {
        super(context);
        this.f4042q = true;
        this.f4035j = false;
    }

    public void setOnJumpClickListener(InterfaceC0007b interfaceC0007b) {
        this.f4024L = interfaceC0007b;
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4042q = true;
        this.f4035j = false;
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4042q = true;
        this.f4035j = false;
    }
}
