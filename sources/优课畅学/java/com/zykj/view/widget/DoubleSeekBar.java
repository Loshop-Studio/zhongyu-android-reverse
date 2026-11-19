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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes5.dex */
public final class DoubleSeekBar extends View {

    /* renamed from: A */
    public int f15569A;

    /* renamed from: B */
    public float f15570B;

    /* renamed from: C */
    public int f15571C;

    /* renamed from: D */
    public RectF f15572D;

    /* renamed from: E */
    public int f15573E;

    /* renamed from: F */
    public int f15574F;

    /* renamed from: G */
    public final RectF f15575G;

    /* renamed from: H */
    public final Path f15576H;

    /* renamed from: I */
    public final Path f15577I;

    /* renamed from: J */
    public final Path f15578J;

    /* renamed from: K */
    public final Path f15579K;

    /* renamed from: L */
    public float f15580L;

    /* renamed from: M */
    public float f15581M;

    /* renamed from: N */
    public float f15582N;

    /* renamed from: O */
    public float f15583O;

    /* renamed from: a */
    public final int f15584a;

    /* renamed from: b */
    public final Paint f15585b;

    /* renamed from: c */
    public InterfaceC8260b f15586c;

    /* renamed from: d */
    public InterfaceC8259a f15587d;

    /* renamed from: e */
    public int f15588e;

    /* renamed from: f */
    public List f15589f;

    /* renamed from: g */
    public final List f15590g;

    /* renamed from: h */
    public int f15591h;

    /* renamed from: i */
    public int f15592i;

    /* renamed from: j */
    public float f15593j;

    /* renamed from: k */
    public float f15594k;

    /* renamed from: l */
    public int f15595l;

    /* renamed from: m */
    public float f15596m;

    /* renamed from: n */
    public boolean f15597n;

    /* renamed from: o */
    public RectF f15598o;

    /* renamed from: p */
    public float f15599p;

    /* renamed from: q */
    public int f15600q;

    /* renamed from: r */
    public RectF f15601r;

    /* renamed from: s */
    public int f15602s;

    /* renamed from: t */
    public int f15603t;

    /* renamed from: u */
    public int f15604u;

    /* renamed from: v */
    public float f15605v;

    /* renamed from: w */
    public float f15606w;

    /* renamed from: x */
    public final RectF f15607x;

    /* renamed from: y */
    public int f15608y;

    /* renamed from: z */
    public float f15609z;

    /* renamed from: com.zykj.view.widget.DoubleSeekBar$a */
    public interface InterfaceC8259a {
        /* renamed from: a */
        void mo12990a(DoubleSeekBar doubleSeekBar);

        /* renamed from: b */
        void mo12991b(DoubleSeekBar doubleSeekBar, float f10);

        /* renamed from: c */
        void mo12992c(DoubleSeekBar doubleSeekBar);
    }

    /* renamed from: com.zykj.view.widget.DoubleSeekBar$b */
    public interface InterfaceC8260b {
        /* renamed from: a */
        void mo12981a(DoubleSeekBar doubleSeekBar);

        /* renamed from: b */
        void mo12982b(DoubleSeekBar doubleSeekBar, float f10);

        /* renamed from: c */
        void mo12983c(DoubleSeekBar doubleSeekBar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    /* renamed from: a */
    public final void m13323a() {
        ArrayList arrayList = new ArrayList();
        for (long[] jArr : this.f15589f) {
            if (jArr[0] < this.f15594k || jArr[1] > this.f15593j) {
                return;
            }
            RectF rectF = new RectF();
            float f10 = this.f15580L;
            float f11 = jArr[0];
            float f12 = this.f15594k;
            float f13 = this.f15596m;
            float f14 = this.f15593j;
            rectF.left = (((f11 - f12) * f13) / (f14 - f12)) + f10;
            rectF.right = f10 + (((jArr[1] - f12) * f13) / (f14 - f12));
            float f15 = this.f15581M;
            int i10 = this.f15571C;
            int i11 = this.f15602s;
            float f16 = f15 + ((i10 - i11) / 2);
            rectF.top = f16;
            rectF.bottom = f16 + i11;
            arrayList.add(rectF);
        }
        this.f15590g.clear();
        this.f15590g.addAll(arrayList);
    }

    /* renamed from: b */
    public final Path m13324b(RectF rectF) {
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
    public final void m13325c() {
        RectF rectF = this.f15572D;
        float f10 = this.f15580L;
        float f11 = this.f15609z;
        float f12 = this.f15594k;
        float f13 = this.f15596m;
        float f14 = (((f11 - f12) * f13) / (this.f15593j - f12)) + f10;
        rectF.left = f14;
        float f15 = this.f15581M;
        rectF.top = f15;
        rectF.right = f10 + f13;
        float f16 = this.f15571C + f15;
        rectF.bottom = f16;
        float f17 = this.f15570B;
        float f18 = (f14 - (f17 * 0.5f)) - this.f15573E;
        float f19 = f14 - (f17 * 0.5f);
        Path path = this.f15576H;
        path.reset();
        path.moveTo(f19, f15);
        path.lineTo(f19, f16);
        path.lineTo(this.f15574F + f18, f16);
        RectF rectF2 = this.f15575G;
        int i10 = this.f15574F;
        rectF2.set(f18, f16 - (i10 * 2), (i10 * 2) + f18, f16);
        path.arcTo(this.f15575G, 90.0f, 90.0f);
        path.lineTo(f18, this.f15574F + f15);
        RectF rectF3 = this.f15575G;
        int i11 = this.f15574F;
        rectF3.set(f18, f15, (i11 * 2) + f18, (i11 * 2) + f15);
        path.arcTo(this.f15575G, 180.0f, 90.0f);
        path.lineTo(f19, f15);
        Path path2 = this.f15577I;
        path2.reset();
        path2.moveTo(f19 - (this.f15573E / 4), this.f15572D.centerY() - (this.f15573E / 2));
        path2.lineTo(f18 + (this.f15573E / 4), this.f15572D.centerY());
        path2.lineTo(f19 - (this.f15573E / 4), this.f15572D.centerY() + (this.f15573E / 2));
        RectF rectF4 = this.f15572D;
        float f20 = rectF4.right;
        float f21 = this.f15570B;
        float f22 = (f21 * 0.5f) + f20;
        float f23 = rectF4.top;
        float f24 = f20 + (f21 * 0.5f) + this.f15573E;
        float f25 = rectF4.bottom;
        Path path3 = this.f15578J;
        path3.reset();
        path3.moveTo(f22, f23);
        path3.lineTo(f22, f25);
        path3.lineTo(f24 - this.f15574F, f25);
        RectF rectF5 = this.f15575G;
        int i12 = this.f15574F;
        rectF5.set(f24 - (i12 * 2), f25 - (i12 * 2), f24, f25);
        path3.arcTo(this.f15575G, 90.0f, -90.0f);
        path3.lineTo(f24, this.f15574F + f23);
        RectF rectF6 = this.f15575G;
        int i13 = this.f15574F;
        rectF6.set(f24 - (i13 * 2), f23, f24, (i13 * 2) + f23);
        path3.arcTo(this.f15575G, 0.0f, -90.0f);
        path3.lineTo(f22, f23);
        Path path4 = this.f15579K;
        path4.reset();
        path4.set(m13324b(new RectF(f22, f23, f24, f25)));
    }

    /* renamed from: d */
    public final void m13326d() {
        RectF rectF = this.f15607x;
        float f10 = this.f15580L;
        float f11 = this.f15599p;
        float f12 = this.f15594k;
        float f13 = f10 + (((f11 - f12) * this.f15596m) / (this.f15593j - f12));
        float f14 = this.f15605v;
        float f15 = f13 - f14;
        rectF.left = f15;
        rectF.right = f15 + (f14 * 2);
        float f16 = this.f15581M;
        rectF.top = f16;
        rectF.bottom = f16 + this.f15608y;
    }

    /* renamed from: e */
    public final void m13327e() {
        RectF rectF = this.f15601r;
        float f10 = this.f15580L;
        rectF.left = f10;
        float f11 = this.f15599p;
        float f12 = this.f15594k;
        float f13 = this.f15596m;
        float f14 = f10 + (((f11 - f12) * f13) / (this.f15593j - f12));
        rectF.right = f14;
        float f15 = this.f15581M;
        int i10 = this.f15571C;
        int i11 = this.f15602s;
        float f16 = f15 + ((i10 - i11) / 2);
        rectF.top = f16;
        float f17 = i11 + f16;
        rectF.bottom = f17;
        RectF rectF2 = this.f15598o;
        rectF2.left = f14;
        rectF2.right = rectF.left + f13;
        rectF2.top = f16;
        rectF2.bottom = f17;
    }

    /* renamed from: f */
    public final void m13328f(Canvas canvas) {
        this.f15585b.setStyle(Paint.Style.FILL);
        this.f15585b.setColor(this.f15591h);
        Iterator it = this.f15590g.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.f15585b);
        }
    }

    /* renamed from: g */
    public final void m13329g(Canvas canvas) {
        this.f15585b.setColor(this.f15569A);
        this.f15585b.setStrokeWidth(this.f15570B);
        Paint paint = this.f15585b;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        canvas.drawRect(this.f15572D, this.f15585b);
        this.f15585b.setStrokeWidth(this.f15570B);
        this.f15585b.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawPath(this.f15576H, this.f15585b);
        this.f15585b.setColor(-1);
        float f10 = 2;
        this.f15585b.setStrokeWidth(this.f15570B / f10);
        this.f15585b.setStyle(style);
        canvas.drawPath(this.f15577I, this.f15585b);
        this.f15585b.setColor(this.f15569A);
        this.f15585b.setStrokeWidth(this.f15570B);
        this.f15585b.setStyle(style);
        canvas.drawPath(this.f15578J, this.f15585b);
        this.f15585b.setStrokeWidth(this.f15570B / f10);
        this.f15585b.setStyle(style);
        canvas.drawPath(this.f15579K, this.f15585b);
    }

    public final int getBarSize() {
        return this.f15592i;
    }

    public final int getKeyPointColor() {
        return this.f15591h;
    }

    public final List<long[]> getKeyPointList() {
        return this.f15589f;
    }

    public final InterfaceC8259a getMaskChangeListener() {
        return this.f15587d;
    }

    public final int getMaskColor() {
        return this.f15569A;
    }

    public final float getMaskProgress() {
        return this.f15609z;
    }

    public final float getMax() {
        return this.f15593j;
    }

    public final float getMin() {
        return this.f15594k;
    }

    public final float getProgress() {
        return this.f15599p;
    }

    public final int getSeekBarColor() {
        return this.f15595l;
    }

    public final InterfaceC8260b getSeekChangeListener() {
        return this.f15586c;
    }

    public final int getThumbColor() {
        return this.f15604u;
    }

    public final int getThumbSize() {
        return this.f15603t;
    }

    public final int getTrackColor() {
        return this.f15600q;
    }

    /* renamed from: h */
    public final void m13330h(Canvas canvas) {
        this.f15585b.setColor(this.f15604u);
        this.f15585b.setStyle(Paint.Style.FILL);
        Log.i("drawThumb", "rect -> " + this.f15607x);
        RectF rectF = this.f15607x;
        float f10 = this.f15605v;
        canvas.drawRoundRect(rectF, f10, f10, this.f15585b);
    }

    /* renamed from: i */
    public final void m13331i(Canvas canvas) {
        this.f15585b.setStyle(Paint.Style.FILL);
        if (this.f15572D.left <= this.f15601r.right) {
            RectF rectF = new RectF(this.f15601r);
            rectF.right = this.f15572D.left;
            this.f15585b.setColor(this.f15595l);
            canvas.drawRect(rectF, this.f15585b);
            RectF rectF2 = new RectF(this.f15601r);
            rectF2.left = this.f15572D.left;
            this.f15585b.setColor(this.f15600q);
            canvas.drawRect(rectF2, this.f15585b);
        } else {
            this.f15585b.setColor(this.f15600q);
            canvas.drawRect(this.f15601r, this.f15585b);
        }
        this.f15585b.setColor(this.f15595l);
        canvas.drawRect(this.f15598o, this.f15585b);
    }

    /* renamed from: j */
    public final int m13332j(float f10, float f11) {
        RectF rectF = new RectF();
        float f12 = this.f15580L;
        int i10 = this.f15584a;
        rectF.left = f12 - i10;
        float f13 = this.f15581M;
        rectF.top = f13 - i10;
        rectF.right = f12 + this.f15596m + i10;
        rectF.bottom = f13 + this.f15608y + i10;
        RectF rectF2 = new RectF();
        RectF rectF3 = this.f15572D;
        float f14 = rectF3.left;
        int i11 = this.f15584a;
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
    public final void m13333k() {
        Paint paint = this.f15585b;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
    }

    /* renamed from: l */
    public final void m13334l(float f10) {
        RectF rectF = this.f15601r;
        float f11 = rectF.left;
        if (f10 >= f11 && f10 <= this.f15598o.right) {
            float f12 = this.f15594k;
            setMaskProgress(f12 + (((f10 - f11) * (this.f15593j - f12)) / this.f15596m));
        } else if (f10 < f11) {
            setMaskProgress(this.f15594k);
        } else if (f10 > rectF.right) {
            setMaskProgress(this.f15593j);
        }
    }

    /* renamed from: m */
    public final void m13335m(float f10) {
        RectF rectF = this.f15601r;
        float f11 = rectF.left;
        if (f10 >= f11 && f10 <= this.f15598o.right) {
            float f12 = this.f15594k;
            setProgress(f12 + (((f10 - f11) * (this.f15593j - f12)) / this.f15596m));
        } else if (f10 < f11) {
            setProgress(this.f15594k);
        } else if (f10 > rectF.right) {
            setProgress(this.f15593j);
        }
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        m13331i(canvas);
        m13328f(canvas);
        m13329g(canvas);
        m13330h(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            this.f15580L = Math.max(this.f15580L, getPaddingStart());
            this.f15581M = Math.max(this.f15581M, getPaddingTop());
            this.f15582N = Math.max(this.f15582N, getPaddingRight());
            float fMax = Math.max(this.f15583O, getPaddingBottom());
            this.f15583O = fMax;
            this.f15596m = (size - this.f15580L) - this.f15582N;
            int i12 = (int) (this.f15581M + fMax);
            if (mode == 1073741824) {
                this.f15571C = Math.max(this.f15571C, size2 - i12);
            }
            int i13 = this.f15571C;
            this.f15608y = i13;
            setMeasuredDimension(size, i13 + i12);
            m13327e();
            m13326d();
            m13325c();
            m13323a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        AbstractC9133u.m16133g(state, "state");
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
        bundle.putFloat("seek_bar_progress", this.f15599p);
        bundle.putFloat("seek_bar_mask_progress", this.f15609z);
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
            kotlin.jvm.internal.AbstractC9133u.m16133g(r4, r0)
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
            int r0 = r3.f15588e
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L1c
            goto L78
        L1c:
            float r0 = r4.getX()
            r3.m13334l(r0)
            com.zykj.view.widget.DoubleSeekBar$a r0 = r3.f15587d
            if (r0 == 0) goto L78
            float r1 = r3.f15599p
            r0.mo12991b(r3, r1)
            goto L78
        L2d:
            float r0 = r4.getX()
            r3.m13335m(r0)
            com.zykj.view.widget.DoubleSeekBar$b r0 = r3.f15586c
            if (r0 == 0) goto L78
            float r1 = r3.f15599p
            r0.mo12982b(r3, r1)
            goto L78
        L3e:
            int r0 = r3.f15588e
            if (r0 == 0) goto L54
            if (r0 == r1) goto L45
            goto L78
        L45:
            float r0 = r4.getX()
            r3.m13334l(r0)
            com.zykj.view.widget.DoubleSeekBar$a r0 = r3.f15587d
            if (r0 == 0) goto L78
            r0.mo12990a(r3)
            goto L78
        L54:
            r0 = 0
            r3.f15597n = r0
            float r0 = r4.getX()
            r3.m13335m(r0)
            com.zykj.view.widget.DoubleSeekBar$b r0 = r3.f15586c
            if (r0 == 0) goto L78
            r0.mo12981a(r3)
            goto L78
        L66:
            float r0 = r4.getX()
            float r2 = r4.getY()
            int r0 = r3.m13332j(r0, r2)
            r3.f15588e = r0
            if (r0 == 0) goto L8c
            if (r0 == r1) goto L7d
        L78:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L7d:
            float r4 = r4.getX()
            r3.m13334l(r4)
            com.zykj.view.widget.DoubleSeekBar$a r4 = r3.f15587d
            if (r4 == 0) goto L8b
            r4.mo12992c(r3)
        L8b:
            return r1
        L8c:
            r3.f15597n = r1
            float r4 = r4.getX()
            r3.m13335m(r4)
            com.zykj.view.widget.DoubleSeekBar$b r4 = r3.f15586c
            if (r4 == 0) goto L9c
            r4.mo12983c(r3)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.DoubleSeekBar.onTouchEvent(android.view.MotionEvent):boolean"); // DEX body: android/优课畅学/smali_classes5/com/zykj/view/widget/DoubleSeekBar.smali:3429
    }

    public final void setBarSize(int i10) {
        this.f15592i = i10;
        this.f15602s = i10;
        m13327e();
        m13323a();
        invalidate();
    }

    public final void setKeyPointColor(int i10) {
        this.f15591h = i10;
        invalidate();
    }

    public final void setKeyPointList(List<long[]> value) {
        AbstractC9133u.m16133g(value, "value");
        this.f15589f = value;
        m13327e();
        invalidate();
    }

    public final void setMaskChangeListener(InterfaceC8259a interfaceC8259a) {
        this.f15587d = interfaceC8259a;
    }

    public final void setMaskColor(int i10) {
        this.f15569A = i10;
        invalidate();
    }

    public final void setMaskProgress(float f10) {
        this.f15609z = f10;
        m13325c();
        invalidate();
    }

    public final void setMax(float f10) {
        if (this.f15593j > this.f15594k) {
            this.f15593j = f10;
            m13327e();
            m13326d();
            m13323a();
            invalidate();
        }
    }

    public final void setMin(float f10) {
        if (this.f15593j > this.f15594k) {
            this.f15594k = f10;
            m13327e();
            m13326d();
            m13323a();
            invalidate();
        }
    }

    public final void setProgress(float f10) {
        this.f15599p = f10;
        m13327e();
        m13326d();
        invalidate();
    }

    public final void setSeekBarColor(int i10) {
        this.f15595l = i10;
        invalidate();
    }

    public final void setSeekChangeListener(InterfaceC8260b interfaceC8260b) {
        this.f15586c = interfaceC8260b;
    }

    public final void setThumbColor(int i10) {
        this.f15604u = i10;
        invalidate();
    }

    public final void setThumbSize(int i10) {
        this.f15603t = i10;
        float f10 = i10 * 0.5f;
        this.f15605v = f10;
        this.f15606w = f10 * 1.2f;
        m13326d();
        invalidate();
    }

    public final void setTrackColor(int i10) {
        this.f15600q = i10;
        invalidate();
    }

    public /* synthetic */ DoubleSeekBar(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        this.f15584a = 25;
        this.f15585b = new Paint();
        this.f15588e = -1;
        this.f15589f = AbstractC8809v.m14771n();
        this.f15590g = new ArrayList();
        this.f15591h = Color.parseColor("#C8C9CC");
        this.f15592i = 6;
        this.f15593j = 100.0f;
        this.f15595l = Color.parseColor("#EBEDF0");
        this.f15598o = new RectF();
        this.f15600q = Color.parseColor("#EBEDF0");
        this.f15601r = new RectF();
        this.f15602s = this.f15592i;
        this.f15603t = 9;
        this.f15604u = Color.parseColor("#54576A");
        float f10 = this.f15603t * 0.5f;
        this.f15605v = f10;
        this.f15606w = f10 * 1.2f;
        this.f15607x = new RectF();
        this.f15608y = 47;
        this.f15569A = Color.parseColor("#FF3B30");
        this.f15570B = 3.0f;
        this.f15571C = 47;
        this.f15572D = new RectF();
        this.f15573E = 16;
        this.f15574F = 3;
        this.f15575G = new RectF();
        this.f15576H = new Path();
        this.f15577I = new Path();
        this.f15578J = new Path();
        this.f15579K = new Path();
        int i11 = this.f15573E;
        float f11 = this.f15570B;
        this.f15580L = i11 + f11;
        this.f15581M = f11 * 0.5f;
        this.f15582N = i11 + f11;
        this.f15583O = f11 * 0.5f;
        m13333k();
    }
}
