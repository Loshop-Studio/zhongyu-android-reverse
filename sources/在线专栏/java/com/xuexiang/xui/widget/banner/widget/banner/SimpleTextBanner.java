package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;

/* loaded from: classes.dex */
public class SimpleTextBanner extends BaseIndicatorBanner<String, SimpleTextBanner> {
    public SimpleTextBanner(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public View onCreateItemView(int i4) {
        View viewInflate = View.inflate(this.mContext, C2042R.layout.xui_adapter_simple_text, null);
        ((TextView) viewInflate.findViewById(C2042R.id.f9658tv)).setText((CharSequence) this.mDatas.get(i4));
        return viewInflate;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        pauseScroll();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public void onTitleSelect(TextView textView, int i4) {
    }

    public SimpleTextBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleTextBanner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
