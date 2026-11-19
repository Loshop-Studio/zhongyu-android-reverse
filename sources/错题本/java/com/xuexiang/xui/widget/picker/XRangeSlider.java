package com.xuexiang.xui.widget.picker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.xuexiang.xui.R$attr;
import java.util.HashSet;
import p042d3.InterfaceC5417b;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class XRangeSlider extends View {

    /* renamed from: a */
    public final Paint f4573a;

    /* renamed from: b */
    public int f4574b;

    /* renamed from: c */
    public int f4575c;

    /* renamed from: d */
    public boolean f4576d;

    /* renamed from: e */
    public final Rect f4577e;

    /* renamed from: f */
    public final Rect f4578f;

    /* renamed from: g */
    public final HashSet f4579g;

    /* renamed from: h */
    public final HashSet f4580h;

    /* renamed from: i */
    public int f4581i;

    /* renamed from: j */
    public int f4582j;

    public XRangeSlider(Context context) {
        this(context, null);
    }

    private int getMaxTextLength() {
        String strValueOf = String.valueOf(this.f4582j);
        Rect rect = this.f4578f;
        m3529c(strValueOf, rect);
        return rect.width();
    }

    private int getMinTextLength() {
        String strValueOf = String.valueOf(this.f4581i);
        Rect rect = this.f4577e;
        m3529c(strValueOf, rect);
        return rect.width();
    }

    private void setSelectedMax(int i) {
        this.f4575c = Math.round(((i - this.f4581i) / 0.0f) + 0);
    }

    private void setSelectedMin(int i) {
        this.f4574b = Math.round(((i - this.f4581i) / 0.0f) + 0);
    }

    /* renamed from: a */
    public final boolean m3527a(MotionEvent motionEvent, int i) {
        if (motionEvent.getX(i) > this.f4575c && motionEvent.getX(i) < this.f4575c) {
            float f = 0;
            if (motionEvent.getY(i) > f && motionEvent.getY(i) < f) {
                this.f4576d = false;
                this.f4580h.add(Integer.valueOf(motionEvent.getPointerId(i)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m3528b(MotionEvent motionEvent, int i) {
        if (motionEvent.getX(i) > this.f4574b && motionEvent.getX(i) < this.f4574b) {
            float f = 0;
            if (motionEvent.getY(i) > f && motionEvent.getY(i) < f) {
                this.f4576d = true;
                this.f4579g.add(Integer.valueOf(motionEvent.getPointerId(i)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m3529c(String str, Rect rect) {
        Paint paint = this.f4573a;
        paint.setTextSize(0.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
    }

    /* renamed from: d */
    public final void m3530d(MotionEvent motionEvent, int i) {
        if (motionEvent.getX(i) > this.f4575c && motionEvent.getX(i) <= 0) {
            this.f4575c = (int) motionEvent.getX(i);
            invalidate();
        } else {
            if (motionEvent.getX(i) >= this.f4574b || motionEvent.getX(i) < 0) {
                return;
            }
            this.f4574b = (int) motionEvent.getX(i);
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m3531e(boolean z8) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z8);
        }
    }

    public int getMax() {
        return this.f4582j;
    }

    public int getMin() {
        return this.f4581i;
    }

    public int getSelectedMax() {
        return Math.round((this.f4575c * 0.0f) + this.f4581i);
    }

    public int getSelectedMin() {
        return Math.round((this.f4574b * 0.0f) + this.f4581i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f4573a;
        paint.setColor(0);
        paint.setStrokeWidth(0.0f);
        float f = 0;
        canvas.drawLine(f, f, f, f, paint);
        paint.setStrokeWidth(0.0f);
        paint.setColor(0);
        canvas.drawLine(this.f4574b, f, this.f4575c, f, paint);
        String strValueOf = String.valueOf(getSelectedMin());
        String strValueOf2 = String.valueOf(getSelectedMax());
        m3529c(strValueOf, this.f4577e);
        m3529c(strValueOf2, this.f4578f);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getMode(i8);
        View.MeasureSpec.getSize(i8);
        m3529c(String.valueOf(this.f4581i), this.f4577e);
        m3529c(String.valueOf(this.f4582j), this.f4578f);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r3 != 6) goto L81;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.XRangeSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMax(int i) {
        this.f4582j = i;
    }

    public void setMin(int i) {
        this.f4581i = i;
    }

    public XRangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XRangeSliderStyle);
    }

    public XRangeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4573a = new Paint(1);
        this.f4574b = 0;
        this.f4575c = 0;
        this.f4577e = new Rect();
        this.f4578f = new Rect();
        new Rect();
        this.f4579g = new HashSet();
        this.f4580h = new HashSet();
        this.f4581i = 0;
        this.f4582j = 100;
        AbstractC6582a.m6217a();
        throw null;
    }

    public void setOnRangeSliderListener(InterfaceC5417b interfaceC5417b) {
    }
}
