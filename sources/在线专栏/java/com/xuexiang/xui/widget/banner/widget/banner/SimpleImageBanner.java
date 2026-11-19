package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner;

/* loaded from: classes.dex */
public class SimpleImageBanner extends BaseImageBanner<SimpleImageBanner> {
    public SimpleImageBanner(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner
    protected int getImageViewId() {
        return C2042R.id.f9656iv;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner
    protected int getItemLayoutId() {
        return C2042R.layout.xui_adapter_simple_image;
    }

    public SimpleImageBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleImageBanner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
