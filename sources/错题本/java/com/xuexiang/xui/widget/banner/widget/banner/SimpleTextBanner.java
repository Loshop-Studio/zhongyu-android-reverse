package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;

/* loaded from: classes3.dex */
public class SimpleTextBanner extends BaseIndicatorBanner<String, SimpleTextBanner> {
    public SimpleTextBanner(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m3456f();
        super.onDetachedFromWindow();
    }

    public SimpleTextBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleTextBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: e */
    public final void mo3451e(int i) {
    }
}
