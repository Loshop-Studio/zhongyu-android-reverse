package com.friday.common.camera;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.material3.MenuKt;
import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.R$dimen;

/* loaded from: classes3.dex */
public class ZoomControlView extends View {

    /* renamed from: c */
    public int f5752c;

    /* renamed from: d */
    public final int f5753d;

    /* renamed from: e */
    public int f5754e;

    /* renamed from: f */
    public int f5755f;

    /* renamed from: g */
    public float f5756g;

    /* renamed from: h */
    public int f5757h;

    /* renamed from: i */
    public int f5758i;

    /* renamed from: j */
    public int f5759j;

    /* renamed from: k */
    public int f5760k;

    /* renamed from: l */
    public float f5761l;

    /* renamed from: m */
    public float f5762m;

    /* renamed from: n */
    public Paint f5763n;

    /* renamed from: o */
    public RectF f5764o;

    /* renamed from: p */
    public Path f5765p;

    /* renamed from: q */
    public RectF f5766q;

    /* renamed from: r */
    public Rect f5767r;

    /* renamed from: s */
    public String[] f5768s;

    public ZoomControlView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final int m4891a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: b */
    public final void m4892b() {
        this.f5757h = m4891a(1);
        int iM4891a = m4891a(8) + this.f5757h;
        this.f5758i = iM4891a;
        this.f5759j = iM4891a + m4891a(2);
        Paint paint = new Paint();
        this.f5763n = paint;
        paint.setAntiAlias(true);
        this.f5763n.setStrokeCap(Paint.Cap.ROUND);
        this.f5764o = new RectF();
        this.f5765p = new Path();
        this.f5766q = new RectF();
        this.f5767r = new Rect();
        m4895e();
    }

    /* renamed from: c */
    public final int m4893c(int i10) {
        return (int) TypedValue.applyDimension(2, i10, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: d */
    public void m4894d(int i10) {
        if (this.f5754e <= 1) {
            return;
        }
        this.f5754e = i10;
        this.f5755f = i10 - 1;
        m4895e();
        invalidate();
    }

    /* renamed from: e */
    public final void m4895e() {
        this.f5768s = new String[this.f5755f + 1];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f5768s;
            if (i10 >= strArr.length) {
                return;
            }
            strArr[i10] = String.valueOf((((this.f5754e - 1) / this.f5755f) * i10) + 1);
            i10++;
        }
    }

    public float getRealTimeValue() {
        return Math.round(this.f5756g * 10.0f) / 10.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5763n.setColor(-1);
        this.f5763n.setStrokeWidth(1.0f);
        double d10 = -60;
        double dCos = Math.cos(Math.toRadians(d10));
        double dSin = Math.sin(Math.toRadians(d10));
        int i10 = this.f5760k;
        int i11 = this.f5757h;
        int i12 = this.f5752c;
        float f10 = (float) (i10 + i11 + (i12 * (1.0d - dCos)));
        float f11 = (float) (i10 + i11 + (i12 * (1.0d - dSin)));
        int i13 = this.f5758i;
        float f12 = (float) (((i10 + i11) + i12) - ((i12 - i13) * dCos));
        float f13 = (float) (((i10 + i11) + i12) - ((i12 - i13) * dSin));
        canvas.save();
        float f14 = f11;
        Canvas canvas2 = canvas;
        canvas2.drawLine(f10, f14, f12, f13, this.f5763n);
        float f15 = MenuKt.InTransitionDuration;
        float f16 = f15 * 1.0f;
        float f17 = f16 / this.f5755f;
        int i14 = 0;
        while (i14 < this.f5755f) {
            canvas2.rotate(f17, this.f5761l, this.f5762m);
            canvas2.drawLine(f10, f14, f12, f13, this.f5763n);
            i14++;
            canvas2 = canvas;
        }
        canvas.restore();
        canvas.save();
        this.f5763n.setStrokeWidth(1.0f);
        int i15 = this.f5760k;
        int i16 = this.f5757h;
        int i17 = this.f5752c;
        int i18 = this.f5758i;
        float f18 = (float) (((i15 + i16) + i17) - ((i17 - (i18 / 2.0f)) * dCos));
        float f19 = (float) (((i15 + i16) + i17) - ((i17 - (i18 / 2.0f)) * dSin));
        float f20 = f10;
        Canvas canvas3 = canvas;
        canvas3.drawLine(f20, f14, f18, f19, this.f5763n);
        float f21 = f16 / (this.f5755f * 10);
        int i19 = 1;
        for (int i20 = 10; i19 < this.f5755f * i20; i20 = 10) {
            canvas3.rotate(f21, this.f5761l, this.f5762m);
            if (i19 % 10 != 0) {
                canvas3.drawLine(f20, f14, f18, f19, this.f5763n);
            }
            i19++;
            canvas3 = canvas;
            f14 = f14;
            f20 = f20;
        }
        float f22 = f20;
        float f23 = f14;
        canvas.restore();
        this.f5763n.setTextSize(m4893c(10));
        this.f5763n.setTextAlign(Paint.Align.LEFT);
        this.f5763n.setStyle(Paint.Style.FILL);
        int i21 = 0;
        while (true) {
            String[] strArr = this.f5768s;
            if (i21 >= strArr.length) {
                this.f5763n.setColor(-256);
                String str = getRealTimeValue() + "x";
                this.f5763n.getTextBounds(str, 0, str.length(), this.f5767r);
                this.f5765p.reset();
                float f24 = 10;
                this.f5765p.addArc(this.f5766q, ((((f16 / (this.f5755f * 10)) * (this.f5756g - 1.0f)) * f24) + f15) - ((float) (((this.f5767r.width() * Opcodes.GETFIELD) / 2) / (((this.f5752c - this.f5759j) - this.f5767r.height()) * 3.141592653589793d))), f15);
                canvas.drawTextOnPath(str, this.f5765p, 0.0f, 0.0f, this.f5763n);
                canvas.save();
                this.f5763n.setStrokeWidth(4.0f);
                this.f5763n.setColor(-256);
                int i22 = this.f5760k;
                int i23 = this.f5757h;
                int i24 = this.f5752c;
                int i25 = this.f5758i;
                canvas.rotate((f16 / (this.f5755f * 10)) * (this.f5756g - 1.0f) * f24, this.f5761l, this.f5762m);
                canvas.drawLine(f22, f23, (float) (((i22 + i23) + i24) - ((i24 - i25) * dCos)), (float) (((i22 + i23) + i24) - ((i24 - i25) * dSin)), this.f5763n);
                canvas.restore();
                this.f5763n.setColor(-1);
                return;
            }
            if (Float.parseFloat(strArr[i21]) > getRealTimeValue() + 0.3f || Float.parseFloat(this.f5768s[i21]) < getRealTimeValue() - 0.3f) {
                Paint paint = this.f5763n;
                String str2 = this.f5768s[i21];
                paint.getTextBounds(str2, 0, str2.length(), this.f5767r);
                this.f5765p.reset();
                this.f5765p.addArc(this.f5766q, (MenuKt.InTransitionDuration + ((MenuKt.InTransitionDuration / this.f5755f) * i21)) - ((float) (((this.f5767r.width() * Opcodes.GETFIELD) / 2) / (((this.f5752c - this.f5759j) - this.f5767r.height()) * 3.141592653589793d))), f15);
                canvas.drawTextOnPath(this.f5768s[i21], this.f5765p, 0.0f, 0.0f, this.f5763n);
            }
            i21++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = Math.max(Math.max(getPaddingLeft(), getPaddingTop()), Math.max(getPaddingRight(), getPaddingBottom()));
        this.f5760k = iMax;
        setPadding(iMax, iMax, iMax, iMax);
        this.f5752c = ((View.resolveSize(getResources().getDimensionPixelSize(R$dimen.view_150), i10) - (this.f5760k * 2)) - (this.f5757h * 2)) / 2;
        this.f5763n.setTextSize(m4893c(16));
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.f5762m = measuredWidth;
        this.f5761l = measuredWidth;
        this.f5764o.set(getPaddingLeft() + this.f5757h, getPaddingTop() + this.f5757h, (getMeasuredWidth() - getPaddingRight()) - this.f5757h, (getMeasuredWidth() - getPaddingBottom()) - this.f5757h);
        this.f5763n.setTextSize(m4893c(10));
        this.f5763n.getTextBounds("0", 0, 1, this.f5767r);
        this.f5766q.set(getPaddingLeft() + this.f5759j + this.f5767r.height(), getPaddingTop() + this.f5759j + this.f5767r.height(), ((getMeasuredWidth() - getPaddingRight()) - this.f5759j) - this.f5767r.height(), ((getMeasuredWidth() - getPaddingBottom()) - this.f5759j) - this.f5767r.height());
    }

    public void setRealTimeValue(float f10) {
        if (this.f5756g == f10 || f10 < 1.0f || f10 > this.f5754e) {
            return;
        }
        this.f5756g = f10;
        postInvalidate();
    }

    public ZoomControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZoomControlView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5753d = 1;
        this.f5754e = 4;
        this.f5755f = 4 - 1;
        this.f5756g = 1.0f;
        m4892b();
    }
}
