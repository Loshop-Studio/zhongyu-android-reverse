package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class PartialView extends RelativeLayout {

    /* renamed from: a */
    public ImageView f4803a;

    /* renamed from: b */
    public ImageView f4804b;

    /* renamed from: c */
    public int f4805c;

    /* renamed from: d */
    public int f4806d;

    public PartialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4805c = 0;
        this.f4806d = 0;
        m3561a();
    }

    /* renamed from: a */
    public final void m3561a() {
        int i = this.f4805c;
        if (i == 0) {
            i = -2;
        }
        int i8 = this.f4806d;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i, i8 != 0 ? i8 : -2);
        ImageView imageView = new ImageView(getContext());
        this.f4803a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        addView(this.f4803a, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.f4804b = imageView2;
        imageView2.setScaleType(scaleType);
        addView(this.f4804b, layoutParams);
        m3562b();
    }

    /* renamed from: b */
    public final void m3562b() {
        this.f4803a.setImageLevel(0);
        this.f4804b.setImageLevel(10000);
    }

    /* renamed from: c */
    public final void m3563c(float f) {
        int i = (int) ((f % 1.0f) * 10000.0f);
        if (i == 0) {
            i = 10000;
        }
        this.f4803a.setImageLevel(i);
        this.f4804b.setImageLevel(10000 - i);
    }

    public PartialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4805c = 0;
        this.f4806d = 0;
        m3561a();
    }
}
