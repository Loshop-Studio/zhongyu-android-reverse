package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner;

/* loaded from: classes5.dex */
public class SimpleImageBanner extends BaseImageBanner<SimpleImageBanner> {
    public SimpleImageBanner(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner
    public int getImageViewId() {
        return R$id.f15173iv;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner
    public int getItemLayoutId() {
        return R$layout.xui_adapter_simple_image;
    }

    public SimpleImageBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleImageBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
