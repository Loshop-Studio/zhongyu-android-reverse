package com.zykj.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.zxing.ResultPoint;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ViewfinderView extends View {

    /* renamed from: a */
    public final Paint f9802a;

    /* renamed from: b */
    public final Paint f9803b;

    /* renamed from: c */
    public int f9804c;

    /* renamed from: d */
    public int f9805d;

    /* renamed from: e */
    public int f9806e;

    /* renamed from: f */
    public Bitmap f9807f;

    /* renamed from: g */
    public Collection f9808g;

    /* renamed from: h */
    public Collection f9809h;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9802a = new Paint();
        this.f9803b = new Paint();
        this.f9804c = 20;
        this.f9805d = 20;
        this.f9808g = new HashSet(5);
        this.f9809h = new HashSet(5);
        m9239d(context);
    }

    /* renamed from: a */
    public final void m9236a(ResultPoint resultPoint) {
        if (resultPoint == null) {
            return;
        }
        this.f9808g.add(resultPoint);
        Log.i("addPossibleResultPoint", String.valueOf(resultPoint));
    }

    /* renamed from: b */
    public final void m9237b(Canvas canvas, Rect rect) {
        canvas.drawRect(rect.left, rect.top, r0 + this.f9805d, r1 + this.f9804c, this.f9802a);
        canvas.drawRect(rect.left, rect.top, r14 + this.f9804c, r0 + this.f9805d, this.f9802a);
        int i10 = rect.right;
        canvas.drawRect(i10 - this.f9805d, rect.top, i10, r0 + this.f9804c, this.f9802a);
        int i11 = rect.right;
        canvas.drawRect(i11 - this.f9804c, rect.top, i11, r0 + this.f9805d, this.f9802a);
        canvas.drawRect(rect.left, r0 - this.f9804c, r14 + this.f9805d, rect.bottom, this.f9802a);
        canvas.drawRect(rect.left, r0 - this.f9805d, r14 + this.f9804c, rect.bottom, this.f9802a);
        int i12 = rect.right;
        canvas.drawRect(i12 - this.f9805d, r0 - this.f9804c, i12, rect.bottom, this.f9802a);
        int i13 = rect.right;
        canvas.drawRect(i13 - this.f9804c, r15 - this.f9805d, i13, rect.bottom, this.f9802a);
    }

    /* renamed from: c */
    public final void m9238c(Canvas canvas, Rect rect) {
        if (this.f9806e == 0) {
            this.f9806e = rect.top + 10;
        }
        int i10 = this.f9806e;
        if (i10 >= rect.bottom - 10) {
            this.f9806e = rect.top;
        } else {
            this.f9806e = i10 + 10;
        }
        int i11 = rect.left;
        int i12 = this.f9806e;
        canvas.drawBitmap(this.f9807f, (Rect) null, new Rect(i11, i12, rect.right, i12 + 10), this.f9802a);
    }

    /* renamed from: d */
    public final void m9239d(Context context) {
        if (context == null) {
            return;
        }
        this.f9802a.setColor(context.getResources().getColor(R$color.colorPrimary));
        Paint paint = this.f9802a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f9803b.setColor(context.getResources().getColor(R$color.xui_config_color_pure_yellow));
        this.f9802a.setStyle(style);
        this.f9804c = context.getResources().getDimensionPixelSize(R$dimen.view_25);
        this.f9805d = context.getResources().getDimensionPixelSize(R$dimen.view_2);
        this.f9807f = BitmapFactory.decodeResource(context.getResources(), R$drawable.xqrcode_ic_scan_light);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        Rect rect = new Rect(0, 0, getWidth(), getHeight());
        m9237b(canvas, rect);
        m9238c(canvas, rect);
        Collection<ResultPoint> collection = this.f9808g;
        Collection<ResultPoint> collection2 = this.f9809h;
        if (collection.isEmpty()) {
            this.f9809h = null;
        } else {
            this.f9808g = new HashSet(5);
            this.f9809h = collection;
            this.f9803b.setAlpha(255);
            for (ResultPoint resultPoint : collection) {
                canvas.drawCircle(resultPoint.getX(), resultPoint.getY(), 6.0f, this.f9803b);
            }
        }
        if (collection2 != null) {
            this.f9803b.setAlpha(127);
            for (ResultPoint resultPoint2 : collection2) {
                canvas.drawCircle(resultPoint2.getX(), resultPoint2.getY(), 3.0f, this.f9803b);
            }
        }
        postInvalidateDelayed(24L, rect.left, rect.top, rect.right, rect.bottom);
    }
}
