package com.xuexiang.xui.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import android.util.Log;
import java.lang.ref.WeakReference;
import p164t1.AbstractC6582a;

/* renamed from: com.xuexiang.xui.utils.d */
/* loaded from: classes3.dex */
public final class C4154d extends ReplacementSpan {

    /* renamed from: a */
    public final int f3936a;

    /* renamed from: b */
    public WeakReference f3937b;

    /* renamed from: c */
    public Drawable f3938c;

    /* renamed from: d */
    public int f3939d;

    public C4154d(int i) {
        this.f3936a = i;
    }

    /* renamed from: a */
    public final Drawable m3431a() {
        Drawable drawable = this.f3938c;
        if (drawable != null) {
            return drawable;
        }
        try {
            AbstractC6582a.m6217a();
            throw null;
        } catch (Exception unused) {
            Log.e("sms", "Unable to find resource: " + this.f3939d);
            return null;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i8, float f, int i9, int i10, int i11, Paint paint) {
        float f7;
        float fHeight;
        WeakReference weakReference = this.f3937b;
        if ((weakReference != null ? (Drawable) weakReference.get() : null) == null) {
            this.f3937b = new WeakReference(m3431a());
        }
        Drawable drawableM3431a = m3431a();
        Rect bounds = drawableM3431a.getBounds();
        canvas.save();
        float f8 = paint.getFontMetrics().descent - paint.getFontMetrics().ascent;
        int i12 = i11 - bounds.bottom;
        if (bounds.height() < f8) {
            int i13 = this.f3936a;
            if (i13 == 1) {
                i12 -= paint.getFontMetricsInt().descent;
            } else {
                if (i13 == 2) {
                    f7 = i12;
                    fHeight = (f8 - bounds.height()) / 2.0f;
                } else if (i13 == 3) {
                    f7 = i12;
                    fHeight = f8 - bounds.height();
                }
                i12 = (int) (f7 - fHeight);
            }
        }
        canvas.translate(f, i12);
        drawableM3431a.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i8, Paint.FontMetricsInt fontMetricsInt) {
        WeakReference weakReference = this.f3937b;
        if ((weakReference != null ? (Drawable) weakReference.get() : null) == null) {
            this.f3937b = new WeakReference(m3431a());
        }
        Rect bounds = m3431a().getBounds();
        int i9 = (int) (paint.getFontMetrics().descent - paint.getFontMetrics().ascent);
        if (fontMetricsInt != null && bounds.height() > i9) {
            int i10 = this.f3936a;
            if (i10 == 3) {
                fontMetricsInt.descent = (bounds.height() - i9) + fontMetricsInt.descent;
            } else if (i10 == 2) {
                fontMetricsInt.ascent -= (bounds.height() - i9) / 2;
                fontMetricsInt.descent = ((bounds.height() - i9) / 2) + fontMetricsInt.descent;
            } else {
                fontMetricsInt.ascent -= bounds.height() - i9;
            }
        }
        return bounds.right;
    }
}
