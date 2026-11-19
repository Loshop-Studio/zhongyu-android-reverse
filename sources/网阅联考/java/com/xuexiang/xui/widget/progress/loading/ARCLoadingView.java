package com.xuexiang.xui.widget.progress.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC3527b;
import com.xuexiang.xui.utils.AbstractC3530e;
import com.xuexiang.xui.utils.AbstractC3531f;
import com.xuexiang.xui.utils.AbstractC3532g;
import p077j0.C3798a;

/* loaded from: classes2.dex */
public class ARCLoadingView extends View {

    /* renamed from: a */
    public boolean f3811a;

    /* renamed from: b */
    public boolean f3812b;

    /* renamed from: c */
    public Paint f3813c;

    /* renamed from: d */
    public int f3814d;

    /* renamed from: e */
    public int f3815e;

    /* renamed from: f */
    public RectF f3816f;

    /* renamed from: g */
    public int f3817g;

    /* renamed from: h */
    public float f3818h;

    /* renamed from: i */
    public int f3819i;

    /* renamed from: j */
    public Bitmap f3820j;

    /* renamed from: k */
    public float f3821k;

    /* renamed from: l */
    public Paint f3822l;

    /* renamed from: m */
    public int[] f3823m;

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3812b = true;
        this.f3817g = 10;
        m4525d(context, attributeSet);
    }

    /* renamed from: a */
    public final void m4522a(Canvas canvas) {
        Bitmap bitmap = this.f3820j;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, m4523b(bitmap), this.f3822l);
        }
        this.f3813c.setShader(m4524c(canvas));
        canvas.drawArc(this.f3816f, this.f3817g, this.f3818h, false, this.f3813c);
        int i4 = this.f3817g + this.f3819i;
        this.f3817g = i4;
        if (i4 > 360) {
            this.f3817g = i4 - 360;
        }
    }

    /* renamed from: b */
    public RectF m4523b(Bitmap bitmap) {
        float height;
        float height2;
        float width = bitmap.getWidth();
        float height3 = bitmap.getHeight();
        if (width >= height3) {
            height2 = (getWidth() / width) * height3;
            height = getWidth();
        } else {
            height = (getHeight() / height3) * width;
            height2 = getHeight();
        }
        float width2 = (getWidth() - (height * this.f3821k)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f3821k)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: c */
    public final SweepGradient m4524c(Canvas canvas) {
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f3823m, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f3817g, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    /* renamed from: d */
    public final void m4525d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f3815e = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC3531f.m4071d(context, R$attr.colorAccent));
        this.f3818h = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_arc_degree, 315);
        this.f3823m = new int[]{0, this.f3815e};
        this.f3814d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC3527b.m4048b(getContext(), 6.0f));
        this.f3819i = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        this.f3812b = z3;
        this.f3811a = z3;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableM4064e = AbstractC3530e.m4064e(getContext(), typedArrayObtainStyledAttributes, R$styleable.LoadingView_lv_icon);
            if (drawableM4064e != null) {
                this.f3820j = AbstractC3532g.m4083e(drawableM4064e);
            } else {
                Drawable drawableM4957a = C3798a.m4956b().m4957a();
                if (drawableM4957a != null) {
                    this.f3820j = AbstractC3532g.m4083e(drawableM4957a);
                }
            }
            this.f3821k = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        m4526e();
    }

    /* renamed from: e */
    public final void m4526e() {
        Paint paint = new Paint();
        this.f3813c = paint;
        paint.setColor(this.f3815e);
        this.f3813c.setAntiAlias(true);
        this.f3813c.setStyle(Paint.Style.STROKE);
        this.f3813c.setStrokeWidth(this.f3814d);
        Paint paint2 = new Paint();
        this.f3822l = paint2;
        paint2.setColor(this.f3815e);
        this.f3822l.setAntiAlias(true);
        this.f3822l.setFilterBitmap(true);
        this.f3822l.setStyle(Paint.Style.STROKE);
        this.f3822l.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: f */
    public final void m4527f() {
        this.f3811a = false;
        invalidate();
    }

    /* renamed from: g */
    public void m4528g() {
        if (this.f3812b) {
            return;
        }
        this.f3811a = true;
        invalidate();
    }

    public float getIconScale() {
        return this.f3821k;
    }

    public int getLoadingColor() {
        return this.f3815e;
    }

    /* renamed from: h */
    public void m4529h() {
        if (this.f3812b) {
            return;
        }
        m4527f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3811a) {
            m4522a(canvas);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        int i8 = this.f3814d;
        this.f3816f = new RectF(i8 * 2, i8 * 2, i4 - (i8 * 2), i5 - (i8 * 2));
    }
}
