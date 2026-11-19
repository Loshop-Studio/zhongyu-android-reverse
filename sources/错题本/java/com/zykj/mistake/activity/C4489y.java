package com.zykj.mistake.activity;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC5830k;
import p006a5.ViewOnClickListenerC0015f;
import p155s0.AbstractC6547f;

/* renamed from: com.zykj.mistake.activity.y */
/* loaded from: classes3.dex */
public final class C4489y extends AbstractC6547f {

    /* renamed from: d */
    public final /* synthetic */ ImageView f5954d;

    /* renamed from: e */
    public final /* synthetic */ MistakeDetailActivity f5955e;

    /* renamed from: f */
    public final /* synthetic */ String f5956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4489y(ImageView imageView, MistakeDetailActivity mistakeDetailActivity, String str) {
        super(imageView);
        this.f5954d = imageView;
        this.f5955e = mistakeDetailActivity;
        this.f5956f = str;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: c */
    public final void mo2380c(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        ImageView imageView = this.f5954d;
        float width2 = imageView.getWidth() / width;
        Matrix matrix = new Matrix();
        matrix.postScale(width2, width2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        AbstractC5830k.m5329f(bitmapCreateBitmap, "createBitmap(...)");
        imageView.setImageBitmap(bitmapCreateBitmap);
        imageView.setOnClickListener(new ViewOnClickListenerC0015f(5, this.f5955e, this.f5956f));
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: h */
    public final void mo2381h(Drawable drawable) {
        this.f5954d.setImageDrawable(drawable);
    }

    @Override // p155s0.AbstractC6547f
    /* renamed from: i */
    public final void mo2382i(Drawable drawable) {
    }
}
