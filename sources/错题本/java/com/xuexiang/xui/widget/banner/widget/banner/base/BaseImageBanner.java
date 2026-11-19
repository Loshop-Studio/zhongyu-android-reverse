package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.camera.video.AudioStats;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseImageBanner;
import java.util.List;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public abstract class BaseImageBanner<T extends BaseImageBanner<T>> extends BaseIndicatorBanner<Object, T> {
    public BaseImageBanner(Context context) {
        super(context);
        AbstractC6582a.m6217a();
        throw null;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: e */
    public final void mo3451e(int i) {
        List list = this.f4030e;
        if (((list != null ? list.size() : 0) > 0 ? this.f4030e.get(i) : null) != null) {
            throw new ClassCastException();
        }
    }

    public boolean getEnableCache() {
        return false;
    }

    public abstract int getImageViewId();

    public abstract int getItemLayoutId();

    public Drawable getPlaceHolderDrawable() {
        return null;
    }

    public double getScale() {
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m3456f();
        super.onDetachedFromWindow();
    }

    public BaseImageBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC6582a.m6217a();
        throw null;
    }

    public BaseImageBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC6582a.m6217a();
        throw null;
    }
}
