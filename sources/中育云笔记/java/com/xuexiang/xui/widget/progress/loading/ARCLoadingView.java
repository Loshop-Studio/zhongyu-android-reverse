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
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.utils.AbstractC8042h;
import p420y7.C11915a;

/* loaded from: classes5.dex */
public class ARCLoadingView extends View {

    /* renamed from: c */
    public boolean f16738c;

    /* renamed from: d */
    public boolean f16739d;

    /* renamed from: e */
    public Paint f16740e;

    /* renamed from: f */
    public int f16741f;

    /* renamed from: g */
    public int f16742g;

    /* renamed from: h */
    public RectF f16743h;

    /* renamed from: i */
    public int f16744i;

    /* renamed from: j */
    public float f16745j;

    /* renamed from: k */
    public int f16746k;

    /* renamed from: l */
    public Bitmap f16747l;

    /* renamed from: m */
    public float f16748m;

    /* renamed from: n */
    public Paint f16749n;

    /* renamed from: o */
    public int[] f16750o;

    public ARCLoadingView(Context context) {
        super(context);
        this.f16739d = true;
        this.f16744i = 10;
        m13096d(context, null);
    }

    /* renamed from: a */
    public final void m13093a(Canvas canvas) {
        Bitmap bitmap = this.f16747l;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, m13094b(bitmap), this.f16749n);
        }
        this.f16740e.setShader(m13095c(canvas));
        canvas.drawArc(this.f16743h, this.f16744i, this.f16745j, false, this.f16740e);
        int i10 = this.f16744i + this.f16746k;
        this.f16744i = i10;
        if (i10 > 360) {
            this.f16744i = i10 - 360;
        }
    }

    /* renamed from: b */
    public RectF m13094b(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f16748m)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f16748m)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: c */
    public final SweepGradient m13095c(Canvas canvas) {
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f16750o, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f16744i, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    /* renamed from: d */
    public final void m13096d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f16742g = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC8041g.m12217d(context, R$attr.colorAccent));
        this.f16745j = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_arc_degree, 315);
        this.f16750o = new int[]{0, this.f16742g};
        this.f16741f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC8037c.m12188b(getContext(), 6.0f));
        this.f16746k = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        this.f16739d = z10;
        this.f16738c = z10;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.LoadingView_lv_icon);
            if (drawableM12206g != null) {
                this.f16747l = AbstractC8042h.m12229c(drawableM12206g);
            } else {
                Drawable drawableM26455a = C11915a.m26454b().m26455a();
                if (drawableM26455a != null) {
                    this.f16747l = AbstractC8042h.m12229c(drawableM26455a);
                }
            }
            this.f16748m = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        m13097e();
    }

    /* renamed from: e */
    public final void m13097e() {
        Paint paint = new Paint();
        this.f16740e = paint;
        paint.setColor(this.f16742g);
        this.f16740e.setAntiAlias(true);
        Paint paint2 = this.f16740e;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f16740e.setStrokeWidth(this.f16741f);
        Paint paint3 = new Paint();
        this.f16749n = paint3;
        paint3.setColor(this.f16742g);
        this.f16749n.setAntiAlias(true);
        this.f16749n.setFilterBitmap(true);
        this.f16749n.setStyle(style);
        this.f16749n.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: f */
    public final void m13098f() {
        this.f16738c = false;
        invalidate();
    }

    /* renamed from: g */
    public ARCLoadingView m13099g(Drawable drawable) {
        if (drawable != null) {
            this.f16747l = AbstractC8042h.m12229c(drawable);
        }
        return this;
    }

    public float getIconScale() {
        return this.f16748m;
    }

    public int getLoadingColor() {
        return this.f16742g;
    }

    /* renamed from: h */
    public void m13100h() {
        if (this.f16739d) {
            return;
        }
        this.f16738c = true;
        invalidate();
    }

    /* renamed from: i */
    public void m13101i() {
        if (this.f16739d) {
            return;
        }
        m13098f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16738c) {
            m13093a(canvas);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = this.f16741f;
        this.f16743h = new RectF(i14 * 2, i14 * 2, i10 - (i14 * 2), i11 - (i14 * 2));
    }

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16739d = true;
        this.f16744i = 10;
        m13096d(context, attributeSet);
    }

    public ARCLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16739d = true;
        this.f16744i = 10;
        m13096d(context, attributeSet);
    }
}
