package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner;
import p212k.AbstractC9764r;

/* loaded from: classes5.dex */
public abstract class BaseImageBanner<T extends BaseImageBanner<T>> extends BaseIndicatorBanner<Object, T> {

    /* renamed from: N */
    public Drawable f15505N;

    /* renamed from: O */
    public boolean f15506O;

    /* renamed from: P */
    public double f15507P;

    public BaseImageBanner(Context context) {
        super(context);
        m12402L(context);
    }

    /* renamed from: L */
    public void m12402L(Context context) {
        this.f15505N = new ColorDrawable(AbstractC8040f.m12202c(R$color.default_image_banner_placeholder_color));
        this.f15506O = true;
        this.f15507P = getContainerScale();
    }

    public boolean getEnableCache() {
        return this.f15506O;
    }

    public abstract int getImageViewId();

    public abstract int getItemLayoutId();

    public Drawable getPlaceHolderDrawable() {
        return this.f15505N;
    }

    public double getScale() {
        return this.f15507P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m12393r();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: p */
    public View mo12372p(int i10) {
        View viewInflate = View.inflate(getContext(), getItemLayoutId(), null);
        AbstractC9764r.m19682a(m12388j(i10));
        return viewInflate;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: q */
    public void mo12373q(TextView textView, int i10) {
        AbstractC9764r.m19682a(m12388j(i10));
    }

    public BaseImageBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12402L(context);
    }

    public BaseImageBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12402L(context);
    }
}
