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
import p042d3.InterfaceC5418c;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class XSeekBar extends View {

    /* renamed from: a */
    public final Paint f4583a;

    /* renamed from: b */
    public int f4584b;

    /* renamed from: c */
    public final Rect f4585c;

    /* renamed from: d */
    public final HashSet f4586d;

    /* renamed from: e */
    public final HashSet f4587e;

    /* renamed from: f */
    public int f4588f;

    /* renamed from: g */
    public int f4589g;

    public XSeekBar(Context context) {
        this(context, null);
    }

    private void setSelectedValue(int i) {
        this.f4584b = Math.round(((i - this.f4589g) / 0.0f) + 0);
    }

    /* renamed from: a */
    public final boolean m3532a(MotionEvent motionEvent, int i) {
        if (motionEvent.getX(i) > this.f4584b && motionEvent.getX(i) < this.f4584b) {
            float f = 0;
            if (motionEvent.getY(i) > f && motionEvent.getY(i) < f) {
                this.f4587e.add(Integer.valueOf(motionEvent.getPointerId(i)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m3533b(MotionEvent motionEvent, int i) {
        if (motionEvent.getX(i) > this.f4584b && motionEvent.getX(i) <= 0) {
            this.f4584b = (int) motionEvent.getX(i);
            invalidate();
        } else {
            if (motionEvent.getX(i) >= this.f4584b || motionEvent.getX(i) < 0) {
                return;
            }
            this.f4584b = (int) motionEvent.getX(i);
            invalidate();
        }
    }

    /* renamed from: c */
    public final void m3534c(boolean z8) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z8);
        }
    }

    public int getMax() {
        return this.f4588f;
    }

    public int getMin() {
        return this.f4589g;
    }

    public int getSelectedNumber() {
        return Math.round((this.f4584b * 0.0f) + this.f4589g);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f4583a;
        paint.setColor(0);
        paint.setStrokeWidth(0.0f);
        float f = 0;
        canvas.drawLine(f, f, f, f, paint);
        paint.setStrokeWidth(0.0f);
        paint.setColor(0);
        canvas.drawLine(f, f, this.f4584b, f, paint);
        paint.setColor(0);
        AbstractC6582a.m6217a();
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getMode(i8);
        View.MeasureSpec.getSize(i8);
        String strValueOf = String.valueOf(this.f4588f);
        Paint paint = this.f4583a;
        paint.setTextSize(0.0f);
        paint.getTextBounds(strValueOf, 0, strValueOf.length(), this.f4585c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r3 != 6) goto L25;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r2 = r11.isEnabled()
            if (r2 != 0) goto Lc
            return r0
        Lc:
            int r2 = r12.getActionIndex()
            int r3 = r12.getActionMasked()
            r4 = 1
            if (r3 == 0) goto Lee
            java.util.HashSet r5 = r11.f4587e
            java.util.HashSet r6 = r11.f4586d
            if (r3 == r4) goto Ld1
            r7 = 2
            if (r3 == r7) goto L4d
            r1 = 3
            if (r3 == r1) goto L40
            r1 = 5
            if (r3 == r1) goto L2a
            r1 = 6
            if (r3 == r1) goto Ld1
            goto L3f
        L2a:
            r11.m3534c(r4)
        L2d:
            int r1 = r12.getPointerCount()
            if (r0 >= r1) goto L3f
            boolean r1 = r11.m3532a(r12, r0)
            if (r1 != 0) goto L3c
            r11.m3533b(r12, r0)
        L3c:
            int r0 = r0 + 1
            goto L2d
        L3f:
            return r4
        L40:
            r11.m3534c(r0)
            r6.clear()
            r5.clear()
            r11.invalidate()
            return r4
        L4d:
            r11.m3534c(r4)
        L50:
            int r2 = r12.getPointerCount()
            if (r0 >= r2) goto Lcd
            int r2 = r12.getPointerId(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L92
            float r2 = r12.getX(r0)
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            double r7 = r2.doubleValue()
            double r9 = r1.doubleValue()
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L7b
        L79:
            r2 = r1
            goto L88
        L7b:
            double r7 = r2.doubleValue()
            double r9 = r1.doubleValue()
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L88
            goto L79
        L88:
            int r2 = r2.intValue()
            int r3 = r11.f4584b
            if (r2 < r3) goto L92
            r11.f4584b = r2
        L92:
            int r2 = r12.getPointerId(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto Lca
            float r2 = r12.getX(r0)
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            double r7 = r2.doubleValue()
            double r9 = r1.doubleValue()
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto Lb7
        Lb5:
            r2 = r1
            goto Lc4
        Lb7:
            double r7 = r2.doubleValue()
            double r9 = r1.doubleValue()
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto Lc4
            goto Lb5
        Lc4:
            int r2 = r2.intValue()
            r11.f4584b = r2
        Lca:
            int r0 = r0 + 1
            goto L50
        Lcd:
            r11.invalidate()
            return r4
        Ld1:
            r11.m3534c(r0)
            int r0 = r12.getPointerId(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.remove(r0)
            int r12 = r12.getPointerId(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r5.remove(r12)
            r11.invalidate()
            return r4
        Lee:
            r11.m3534c(r4)
            boolean r0 = r11.m3532a(r12, r2)
            if (r0 != 0) goto Lfa
            r11.m3533b(r12, r2)
        Lfa:
            r11.invalidate()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.XSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDefaultValue(int i) {
        setSelectedValue(i);
        invalidate();
    }

    public void setInterval(int i) {
        invalidate();
    }

    public void setMax(int i) {
        this.f4588f = i;
    }

    public void setMin(int i) {
        this.f4589g = i;
    }

    public XSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XSeekBarStyle);
    }

    public XSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4583a = new Paint(1);
        this.f4584b = 0;
        this.f4585c = new Rect();
        new Rect();
        this.f4586d = new HashSet();
        this.f4587e = new HashSet();
        this.f4588f = 100;
        this.f4589g = 0;
        AbstractC6582a.m6217a();
        throw null;
    }

    public void setOnSeekBarListener(InterfaceC5418c interfaceC5418c) {
    }
}
