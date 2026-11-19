package com.zykj.mistake.adapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.zykj.mistake.adapter.MistakeListAdapter;
import p155s0.AbstractC6547f;

/* renamed from: com.zykj.mistake.adapter.a */
/* loaded from: classes3.dex */
public final class C4491a extends AbstractC6547f {

    /* renamed from: d */
    public final /* synthetic */ MistakeListAdapter.ViewHolder f5987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4491a(MistakeListAdapter.ViewHolder viewHolder, ImageView imageView) {
        super(imageView);
        this.f5987d = viewHolder;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: c */
    public final void mo2380c(Object obj) {
        MistakeListAdapter.ViewHolder viewHolder = this.f5987d;
        viewHolder.f5978c.setScaleType(ImageView.ScaleType.MATRIX);
        viewHolder.f5978c.setImageDrawable((Drawable) obj);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: h */
    public final void mo2381h(Drawable drawable) {
        MistakeListAdapter.ViewHolder viewHolder = this.f5987d;
        viewHolder.f5978c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewHolder.f5978c.setImageDrawable(drawable);
    }

    @Override // p155s0.AbstractC6547f
    /* renamed from: i */
    public final void mo2382i(Drawable drawable) {
        this.f5987d.f5978c.setImageDrawable(drawable);
    }
}
