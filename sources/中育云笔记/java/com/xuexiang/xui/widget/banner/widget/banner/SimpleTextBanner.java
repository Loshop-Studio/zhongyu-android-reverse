package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;

/* loaded from: classes5.dex */
public class SimpleTextBanner extends BaseIndicatorBanner<String, SimpleTextBanner> {
    public SimpleTextBanner(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m12393r();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: p */
    public View mo12372p(int i10) {
        View viewInflate = View.inflate(this.f15476d, R$layout.xui_adapter_simple_text, null);
        ((TextView) viewInflate.findViewById(R$id.f15175tv)).setText((CharSequence) this.f15479g.get(i10));
        return viewInflate;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: q */
    public void mo12373q(TextView textView, int i10) {
    }

    public SimpleTextBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleTextBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
