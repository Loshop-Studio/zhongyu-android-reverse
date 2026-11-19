package com.zykj.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* loaded from: classes6.dex */
public final class DoubleSeekBar extends View {

    /* renamed from: A */
    public int f20783A;

    /* renamed from: B */
    public float f20784B;

    /* renamed from: C */
    public int f20785C;

    /* renamed from: D */
    public float f20786D;

    /* renamed from: E */
    public int f20787E;

    /* renamed from: F */
    public RectF f20788F;

    /* renamed from: G */
    public int f20789G;

    /* renamed from: H */
    public int f20790H;

    /* renamed from: I */
    public final RectF f20791I;

    /* renamed from: J */
    public final Path f20792J;

    /* renamed from: K */
    public final Path f20793K;

    /* renamed from: L */
    public final Path f20794L;

    /* renamed from: M */
    public final Path f20795M;

    /* renamed from: N */
    public float f20796N;

    /* renamed from: O */
    public float f20797O;

    /* renamed from: P */
    public float f20798P;

    /* renamed from: Q */
    public float f20799Q;

    /* renamed from: c */
    public final int f20800c;

    /* renamed from: d */
    public final Paint f20801d;

    /* renamed from: e */
    public InterfaceC8892b f20802e;

    /* renamed from: f */
    public InterfaceC8891a f20803f;

    /* renamed from: g */
    public int f20804g;

    /* renamed from: h */
    public List f20805h;

    /* renamed from: i */
    public final List f20806i;

    /* renamed from: j */
    public int f20807j;

    /* renamed from: k */
    public int f20808k;

    /* renamed from: l */
    public float f20809l;

    /* renamed from: m */
    public float f20810m;

    /* renamed from: n */
    public int f20811n;

    /* renamed from: o */
    public float f20812o;

    /* renamed from: p */
    public boolean f20813p;

    /* renamed from: q */
    public RectF f20814q;

    /* renamed from: r */
    public float f20815r;

    /* renamed from: s */
    public int f20816s;

    /* renamed from: t */
    public RectF f20817t;

    /* renamed from: u */
    public int f20818u;

    /* renamed from: v */
    public int f20819v;

    /* renamed from: w */
    public int f20820w;

    /* renamed from: x */
    public float f20821x;

    /* renamed from: y */
    public float f20822y;

    /* renamed from: z */
    public final RectF f20823z;

    /* renamed from: com.zykj.view.widget.DoubleSeekBar$a */
    public interface InterfaceC8891a {
        /* renamed from: a */
        void mo17077a(DoubleSeekBar doubleSeekBar);

        /* renamed from: b */
        void mo17078b(DoubleSeekBar doubleSeekBar, float f10);

        /* renamed from: c */
        void mo17079c(DoubleSeekBar doubleSeekBar);
    }

    /* renamed from: com.zykj.view.widget.DoubleSeekBar$b */
    public interface InterfaceC8892b {
        /* renamed from: a */
        void mo17074a(DoubleSeekBar doubleSeekBar);

        /* renamed from: b */
        void mo17075b(DoubleSeekBar doubleSeekBar, float f10);

        /* renamed from: c */
        void mo17076c(DoubleSeekBar doubleSeekBar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleSeekBar(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* renamed from: a */
    public final void m17398a() {
        ArrayList arrayList = new ArrayList();
        for (long[] jArr : this.f20805h) {
            if (jArr[0] < this.f20810m || jArr[1] > this.f20809l) {
                return;
            }
            RectF rectF = new RectF();
            float f10 = this.f20796N;
            float f11 = jArr[0];
            float f12 = this.f20810m;
            float f13 = this.f20812o;
            float f14 = this.f20809l;
            rectF.left = (((f11 - f12) * f13) / (f14 - f12)) + f10;
            rectF.right = f10 + (((jArr[1] - f12) * f13) / (f14 - f12));
            float f15 = this.f20797O;
            int i10 = this.f20787E;
            int i11 = this.f20818u;
            float f16 = f15 + ((i10 - i11) / 2);
            rectF.top = f16;
            rectF.bottom = f16 + i11;
            arrayList.add(rectF);
        }
        this.f20806i.clear();
        this.f20806i.addAll(arrayList);
    }

    /* renamed from: b */
    public final Path m17399b(RectF rectF) {
        Path path = new Path();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f10 = fWidth + fHeight;
        int i10 = 10;
        while (true) {
            float f11 = i10;
            if (f11 >= f10) {
                return path;
            }
            if (f11 > fWidth && f11 < fHeight) {
                path.moveTo(rectF.left, rectF.bottom - (f11 - fWidth));
                path.lineTo(rectF.right, rectF.bottom - f11);
            } else if (f11 < fHeight) {
                path.moveTo(rectF.right - f11, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom - f11);
            } else if (f11 > fWidth) {
                path.moveTo(rectF.left, rectF.bottom - (f11 - fWidth));
                path.lineTo(rectF.right - (f11 - fHeight), rectF.top);
            } else {
                path.moveTo(rectF.right - f11, rectF.bottom);
                path.lineTo(rectF.right - (f11 - fHeight), rectF.top);
            }
            i10 += 10;
        }
    }

    /* renamed from: c */
    public final void m17400c() {
        RectF rectF = this.f20788F;
        float f10 = this.f20796N;
        float f11 = this.f20784B;
        float f12 = this.f20810m;
        float f13 = this.f20812o;
        float f14 = (((f11 - f12) * f13) / (this.f20809l - f12)) + f10;
        rectF.left = f14;
        float f15 = this.f20797O;
        rectF.top = f15;
        rectF.right = f10 + f13;
        float f16 = this.f20787E + f15;
        rectF.bottom = f16;
        float f17 = this.f20786D;
        float f18 = (f14 - (f17 * 0.5f)) - this.f20789G;
        float f19 = f14 - (f17 * 0.5f);
        Path path = this.f20792J;
        path.reset();
        path.moveTo(f19, f15);
        path.lineTo(f19, f16);
        path.lineTo(this.f20790H + f18, f16);
        RectF rectF2 = this.f20791I;
        int i10 = this.f20790H;
        rectF2.set(f18, f16 - (i10 * 2), (i10 * 2) + f18, f16);
        path.arcTo(this.f20791I, 90.0f, 90.0f);
        path.lineTo(f18, this.f20790H + f15);
        RectF rectF3 = this.f20791I;
        int i11 = this.f20790H;
        rectF3.set(f18, f15, (i11 * 2) + f18, (i11 * 2) + f15);
        path.arcTo(this.f20791I, 180.0f, 90.0f);
        path.lineTo(f19, f15);
        Path path2 = this.f20793K;
        path2.reset();
        path2.moveTo(f19 - (this.f20789G / 4), this.f20788F.centerY() - (this.f20789G / 2));
        path2.lineTo(f18 + (this.f20789G / 4), this.f20788F.centerY());
        path2.lineTo(f19 - (this.f20789G / 4), this.f20788F.centerY() + (this.f20789G / 2));
        RectF rectF4 = this.f20788F;
        float f20 = rectF4.right;
        float f21 = this.f20786D;
        float f22 = (f21 * 0.5f) + f20;
        float f23 = rectF4.top;
        float f24 = f20 + (f21 * 0.5f) + this.f20789G;
        float f25 = rectF4.bottom;
        Path path3 = this.f20794L;
        path3.reset();
        path3.moveTo(f22, f23);
        path3.lineTo(f22, f25);
        path3.lineTo(f24 - this.f20790H, f25);
        RectF rectF5 = this.f20791I;
        int i12 = this.f20790H;
        rectF5.set(f24 - (i12 * 2), f25 - (i12 * 2), f24, f25);
        path3.arcTo(this.f20791I, 90.0f, -90.0f);
        path3.lineTo(f24, this.f20790H + f23);
        RectF rectF6 = this.f20791I;
        int i13 = this.f20790H;
        rectF6.set(f24 - (i13 * 2), f23, f24, (i13 * 2) + f23);
        path3.arcTo(this.f20791I, 0.0f, -90.0f);
        path3.lineTo(f22, f23);
        Path path4 = this.f20795M;
        path4.reset();
        path4.set(m17399b(new RectF(f22, f23, f24, f25)));
    }

    /* renamed from: d */
    public final void m17401d() {
        RectF rectF = this.f20823z;
        float f10 = this.f20796N;
        float f11 = this.f20815r;
        float f12 = this.f20810m;
        float f13 = f10 + (((f11 - f12) * this.f20812o) / (this.f20809l - f12));
        float f14 = this.f20821x;
        float f15 = f13 - f14;
        rectF.left = f15;
        rectF.right = f15 + (f14 * 2);
        float f16 = this.f20797O;
        rectF.top = f16;
        rectF.bottom = f16 + this.f20783A;
    }

    /* renamed from: e */
    public final void m17402e() {
        RectF rectF = this.f20817t;
        float f10 = this.f20796N;
        rectF.left = f10;
        float f11 = this.f20815r;
        float f12 = this.f20810m;
        float f13 = this.f20812o;
        float f14 = f10 + (((f11 - f12) * f13) / (this.f20809l - f12));
        rectF.right = f14;
        float f15 = this.f20797O;
        int i10 = this.f20787E;
        int i11 = this.f20818u;
        float f16 = f15 + ((i10 - i11) / 2);
        rectF.top = f16;
        float f17 = i11 + f16;
        rectF.bottom = f17;
        RectF rectF2 = this.f20814q;
        rectF2.left = f14;
        rectF2.right = rectF.left + f13;
        rectF2.top = f16;
        rectF2.bottom = f17;
    }

    /* renamed from: f */
    public final void m17403f(Canvas canvas) {
        this.f20801d.setStyle(Paint.Style.FILL);
        this.f20801d.setColor(this.f20807j);
        Iterator it = this.f20806i.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.f20801d);
        }
    }

    /* renamed from: g */
    public final void m17404g(Canvas canvas) {
        this.f20801d.setColor(this.f20785C);
        this.f20801d.setStrokeWidth(this.f20786D);
        Paint paint = this.f20801d;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        canvas.drawRect(this.f20788F, this.f20801d);
        this.f20801d.setStrokeWidth(this.f20786D);
        this.f20801d.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawPath(this.f20792J, this.f20801d);
        this.f20801d.setColor(-1);
        float f10 = 2;
        this.f20801d.setStrokeWidth(this.f20786D / f10);
        this.f20801d.setStyle(style);
        canvas.drawPath(this.f20793K, this.f20801d);
        this.f20801d.setColor(this.f20785C);
        this.f20801d.setStrokeWidth(this.f20786D);
        this.f20801d.setStyle(style);
        canvas.drawPath(this.f20794L, this.f20801d);
        this.f20801d.setStrokeWidth(this.f20786D / f10);
        this.f20801d.setStyle(style);
        canvas.drawPath(this.f20795M, this.f20801d);
    }

    public final int getBarSize() {
        return this.f20808k;
    }

    public final int getKeyPointColor() {
        return this.f20807j;
    }

    public final List<long[]> getKeyPointList() {
        return this.f20805h;
    }

    public final InterfaceC8891a getMaskChangeListener() {
        return this.f20803f;
    }

    public final int getMaskColor() {
        return this.f20785C;
    }

    public final float getMaskProgress() {
        return this.f20784B;
    }

    public final float getMax() {
        return this.f20809l;
    }

    public final float getMin() {
        return this.f20810m;
    }

    public final float getProgress() {
        return this.f20815r;
    }

    public final int getSeekBarColor() {
        return this.f20811n;
    }

    public final InterfaceC8892b getSeekChangeListener() {
        return this.f20802e;
    }

    public final int getThumbColor() {
        return this.f20820w;
    }

    public final int getThumbSize() {
        return this.f20819v;
    }

    public final int getTrackColor() {
        return this.f20816s;
    }

    /* renamed from: h */
    public final void m17405h(Canvas canvas) {
        this.f20801d.setColor(this.f20820w);
        this.f20801d.setStyle(Paint.Style.FILL);
        Log.i("drawThumb", "rect -> " + this.f20823z);
        RectF rectF = this.f20823z;
        float f10 = this.f20821x;
        canvas.drawRoundRect(rectF, f10, f10, this.f20801d);
    }

    /* renamed from: i */
    public final void m17406i(Canvas canvas) {
        this.f20801d.setStyle(Paint.Style.FILL);
        if (this.f20788F.left <= this.f20817t.right) {
            RectF rectF = new RectF(this.f20817t);
            rectF.right = this.f20788F.left;
            this.f20801d.setColor(this.f20811n);
            canvas.drawRect(rectF, this.f20801d);
            RectF rectF2 = new RectF(this.f20817t);
            rectF2.left = this.f20788F.left;
            this.f20801d.setColor(this.f20816s);
            canvas.drawRect(rectF2, this.f20801d);
        } else {
            this.f20801d.setColor(this.f20816s);
            canvas.drawRect(this.f20817t, this.f20801d);
        }
        this.f20801d.setColor(this.f20811n);
        canvas.drawRect(this.f20814q, this.f20801d);
    }

    /* renamed from: j */
    public final int m17407j(float f10, float f11) {
        RectF rectF = new RectF();
        float f12 = this.f20796N;
        int i10 = this.f20800c;
        rectF.left = f12 - i10;
        float f13 = this.f20797O;
        rectF.top = f13 - i10;
        rectF.right = f12 + this.f20812o + i10;
        rectF.bottom = f13 + this.f20783A + i10;
        RectF rectF2 = new RectF();
        RectF rectF3 = this.f20788F;
        float f14 = rectF3.left;
        int i11 = this.f20800c;
        rectF2.left = f14 - i11;
        rectF2.top = rectF3.top - i11;
        rectF2.right = rectF3.left + i11;
        rectF2.bottom = rectF3.bottom + i11;
        if (rectF2.contains(f10, f11)) {
            return 1;
        }
        return rectF.contains(f10, f11) ? 0 : -1;
    }

    /* renamed from: k */
    public final void m17408k() {
        Paint paint = this.f20801d;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
    }

    /* renamed from: l */
    public final void m17409l(float f10) {
        RectF rectF = this.f20817t;
        float f11 = rectF.left;
        if (f10 >= f11 && f10 <= this.f20814q.right) {
            float f12 = this.f20810m;
            setMaskProgress(f12 + (((f10 - f11) * (this.f20809l - f12)) / this.f20812o));
        } else if (f10 < f11) {
            setMaskProgress(this.f20810m);
        } else if (f10 > rectF.right) {
            setMaskProgress(this.f20809l);
        }
    }

    /* renamed from: m */
    public final void m17410m(float f10) {
        RectF rectF = this.f20817t;
        float f11 = rectF.left;
        if (f10 >= f11 && f10 <= this.f20814q.right) {
            float f12 = this.f20810m;
            setProgress(f12 + (((f10 - f11) * (this.f20809l - f12)) / this.f20812o));
        } else if (f10 < f11) {
            setProgress(this.f20810m);
        } else if (f10 > rectF.right) {
            setProgress(this.f20809l);
        }
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        m17406i(canvas);
        m17403f(canvas);
        m17404g(canvas);
        m17405h(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            this.f20796N = Math.max(this.f20796N, getPaddingStart());
            this.f20797O = Math.max(this.f20797O, getPaddingTop());
            this.f20798P = Math.max(this.f20798P, getPaddingRight());
            float fMax = Math.max(this.f20799Q, getPaddingBottom());
            this.f20799Q = fMax;
            this.f20812o = (size - this.f20796N) - this.f20798P;
            int i12 = (int) (this.f20797O + fMax);
            if (mode == 1073741824) {
                this.f20787E = Math.max(this.f20787E, size2 - i12);
            }
            int i13 = this.f20787E;
            this.f20783A = i13;
            setMeasuredDimension(size, i13 + i12);
            m17402e();
            m17401d();
            m17400c();
            m17398a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        AbstractC9979u.m20294g(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        setProgress(bundle.getFloat("seek_bar_progress"));
        setMaskProgress(bundle.getFloat("seek_bar_mask_progress"));
        super.onRestoreInstanceState(bundle.getParcelable("seek_bar_state"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("seek_bar_state", super.onSaveInstanceState());
        bundle.putFloat("seek_bar_progress", this.f20815r);
        bundle.putFloat("seek_bar_mask_progress", this.f20784B);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r4, r0)
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 == r1) goto L3e
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L3e
            goto L78
        L15:
            int r0 = r3.f20804g
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L1c
            goto L78
        L1c:
            float r0 = r4.getX()
            r3.m17409l(r0)
            com.zykj.view.widget.DoubleSeekBar$a r0 = r3.f20803f
            if (r0 == 0) goto L78
            float r1 = r3.f20815r
            r0.mo17078b(r3, r1)
            goto L78
        L2d:
            float r0 = r4.getX()
            r3.m17410m(r0)
            com.zykj.view.widget.DoubleSeekBar$b r0 = r3.f20802e
            if (r0 == 0) goto L78
            float r1 = r3.f20815r
            r0.mo17075b(r3, r1)
            goto L78
        L3e:
            int r0 = r3.f20804g
            if (r0 == 0) goto L54
            if (r0 == r1) goto L45
            goto L78
        L45:
            float r0 = r4.getX()
            r3.m17409l(r0)
            com.zykj.view.widget.DoubleSeekBar$a r0 = r3.f20803f
            if (r0 == 0) goto L78
            r0.mo17077a(r3)
            goto L78
        L54:
            r0 = 0
            r3.f20813p = r0
            float r0 = r4.getX()
            r3.m17410m(r0)
            com.zykj.view.widget.DoubleSeekBar$b r0 = r3.f20802e
            if (r0 == 0) goto L78
            r0.mo17074a(r3)
            goto L78
        L66:
            float r0 = r4.getX()
            float r2 = r4.getY()
            int r0 = r3.m17407j(r0, r2)
            r3.f20804g = r0
            if (r0 == 0) goto L8c
            if (r0 == r1) goto L7d
        L78:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L7d:
            float r4 = r4.getX()
            r3.m17409l(r4)
            com.zykj.view.widget.DoubleSeekBar$a r4 = r3.f20803f
            if (r4 == 0) goto L8b
            r4.mo17079c(r3)
        L8b:
            return r1
        L8c:
            r3.f20813p = r1
            float r4 = r4.getX()
            r3.m17410m(r4)
            com.zykj.view.widget.DoubleSeekBar$b r4 = r3.f20802e
            if (r4 == 0) goto L9c
            r4.mo17076c(r3)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.DoubleSeekBar.onTouchEvent(android.view.MotionEvent):boolean"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/view/widget/DoubleSeekBar.smali:3462
    }

    public final void setBarSize(int i10) {
        this.f20808k = i10;
        this.f20818u = i10;
        m17402e();
        m17398a();
        invalidate();
    }

    public final void setKeyPointColor(int i10) {
        this.f20807j = i10;
        invalidate();
    }

    public final void setKeyPointList(List<long[]> value) {
        AbstractC9979u.m20294g(value, "value");
        this.f20805h = value;
        m17402e();
        invalidate();
    }

    public final void setMaskChangeListener(InterfaceC8891a interfaceC8891a) {
        this.f20803f = interfaceC8891a;
    }

    public final void setMaskColor(int i10) {
        this.f20785C = i10;
        invalidate();
    }

    public final void setMaskProgress(float f10) {
        this.f20784B = f10;
        m17400c();
        invalidate();
    }

    public final void setMax(float f10) {
        if (this.f20809l > this.f20810m) {
            this.f20809l = f10;
            m17402e();
            m17401d();
            m17398a();
            invalidate();
        }
    }

    public final void setMin(float f10) {
        if (this.f20809l > this.f20810m) {
            this.f20810m = f10;
            m17402e();
            m17401d();
            m17398a();
            invalidate();
        }
    }

    public final void setProgress(float f10) {
        this.f20815r = f10;
        m17402e();
        m17401d();
        invalidate();
    }

    public final void setSeekBarColor(int i10) {
        this.f20811n = i10;
        invalidate();
    }

    public final void setSeekChangeListener(InterfaceC8892b interfaceC8892b) {
        this.f20802e = interfaceC8892b;
    }

    public final void setThumbColor(int i10) {
        this.f20820w = i10;
        invalidate();
    }

    public final void setThumbSize(int i10) {
        this.f20819v = i10;
        float f10 = i10 * 0.5f;
        this.f20821x = f10;
        this.f20822y = f10 * 1.2f;
        m17401d();
        invalidate();
    }

    public final void setTrackColor(int i10) {
        this.f20816s = i10;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public /* synthetic */ DoubleSeekBar(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f20800c = 25;
        this.f20801d = new Paint();
        this.f20804g = -1;
        this.f20805h = AbstractC10978w.m24136n();
        this.f20806i = new ArrayList();
        this.f20807j = Color.parseColor("#C8C9CC");
        this.f20808k = 6;
        this.f20809l = 100.0f;
        this.f20811n = Color.parseColor("#EBEDF0");
        this.f20814q = new RectF();
        this.f20816s = Color.parseColor("#EBEDF0");
        this.f20817t = new RectF();
        this.f20818u = this.f20808k;
        this.f20819v = 9;
        this.f20820w = Color.parseColor("#54576A");
        float f10 = this.f20819v * 0.5f;
        this.f20821x = f10;
        this.f20822y = f10 * 1.2f;
        this.f20823z = new RectF();
        this.f20783A = 47;
        this.f20785C = Color.parseColor("#FF3B30");
        this.f20786D = 3.0f;
        this.f20787E = 47;
        this.f20788F = new RectF();
        this.f20789G = 16;
        this.f20790H = 3;
        this.f20791I = new RectF();
        this.f20792J = new Path();
        this.f20793K = new Path();
        this.f20794L = new Path();
        this.f20795M = new Path();
        int i11 = this.f20789G;
        float f11 = this.f20786D;
        this.f20796N = i11 + f11;
        this.f20797O = f11 * 0.5f;
        this.f20798P = i11 + f11;
        this.f20799Q = f11 * 0.5f;
        m17408k();
    }
}
