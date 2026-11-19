package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;

/* loaded from: classes5.dex */
class PartialView extends RelativeLayout {

    /* renamed from: c */
    public ImageView f16867c;

    /* renamed from: d */
    public ImageView f16868d;

    /* renamed from: e */
    public int f16869e;

    /* renamed from: f */
    public int f16870f;

    public PartialView(Context context, int i10, int i11, int i12, int i13) {
        super(context);
        this.f16869e = i11;
        this.f16870f = i12;
        setTag(Integer.valueOf(i10));
        setPadding(i13, i13, i13, i13);
        m13155a();
    }

    /* renamed from: a */
    public final void m13155a() {
        int i10 = this.f16869e;
        if (i10 == 0) {
            i10 = -2;
        }
        int i11 = this.f16870f;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i10, i11 != 0 ? i11 : -2);
        ImageView imageView = new ImageView(getContext());
        this.f16867c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        addView(this.f16867c, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.f16868d = imageView2;
        imageView2.setScaleType(scaleType);
        addView(this.f16868d, layoutParams);
        m13156b();
    }

    /* renamed from: b */
    public void m13156b() {
        this.f16867c.setImageLevel(0);
        this.f16868d.setImageLevel(10000);
    }

    /* renamed from: c */
    public void m13157c(Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }
        this.f16868d.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), GravityCompat.END, 1));
    }

    /* renamed from: d */
    public void m13158d() {
        this.f16867c.setImageLevel(10000);
        this.f16868d.setImageLevel(0);
    }

    /* renamed from: e */
    public void m13159e(Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }
        this.f16867c.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), GravityCompat.START, 1));
    }

    /* renamed from: f */
    public void m13160f(float f10) {
        int i10 = (int) ((f10 % 1.0f) * 10000.0f);
        if (i10 == 0) {
            i10 = 10000;
        }
        this.f16867c.setImageLevel(i10);
        this.f16868d.setImageLevel(10000 - i10);
    }

    /* renamed from: g */
    public void m13161g(int i10) {
        this.f16870f = i10;
        ViewGroup.LayoutParams layoutParams = this.f16867c.getLayoutParams();
        layoutParams.height = this.f16870f;
        this.f16867c.setLayoutParams(layoutParams);
        this.f16868d.setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public void m13162h(int i10) {
        this.f16869e = i10;
        ViewGroup.LayoutParams layoutParams = this.f16867c.getLayoutParams();
        layoutParams.width = this.f16869e;
        this.f16867c.setLayoutParams(layoutParams);
        this.f16868d.setLayoutParams(layoutParams);
    }

    public PartialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16869e = 0;
        this.f16870f = 0;
        m13155a();
    }

    public PartialView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16869e = 0;
        this.f16870f = 0;
        m13155a();
    }
}
