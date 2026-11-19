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
import com.xuexiang.xui.utils.AbstractC6796b;
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.utils.AbstractC6802h;
import p093e3.C7842a;

/* loaded from: classes4.dex */
public class ARCLoadingView extends View {

    /* renamed from: a */
    public boolean f7881a;

    /* renamed from: b */
    public boolean f7882b;

    /* renamed from: c */
    public Paint f7883c;

    /* renamed from: d */
    public int f7884d;

    /* renamed from: e */
    public int f7885e;

    /* renamed from: f */
    public RectF f7886f;

    /* renamed from: g */
    public int f7887g;

    /* renamed from: h */
    public float f7888h;

    /* renamed from: i */
    public int f7889i;

    /* renamed from: j */
    public Bitmap f7890j;

    /* renamed from: k */
    public float f7891k;

    /* renamed from: l */
    public Paint f7892l;

    /* renamed from: m */
    public int[] f7893m;

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7882b = true;
        this.f7887g = 10;
        m6992d(context, attributeSet);
    }

    /* renamed from: a */
    public final void m6989a(Canvas canvas) {
        Bitmap bitmap = this.f7890j;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, m6990b(bitmap), this.f7892l);
        }
        this.f7883c.setShader(m6991c(canvas));
        canvas.drawArc(this.f7886f, this.f7887g, this.f7888h, false, this.f7883c);
        int i9 = this.f7887g + this.f7889i;
        this.f7887g = i9;
        if (i9 > 360) {
            this.f7887g = i9 - 360;
        }
    }

    /* renamed from: b */
    public RectF m6990b(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f7891k)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f7891k)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: c */
    public final SweepGradient m6991c(Canvas canvas) {
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f7893m, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f7887g, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    /* renamed from: d */
    public final void m6992d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f7885e = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC6801g.m6479l(context, R$attr.colorAccent));
        this.f7888h = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_arc_degree, 315);
        this.f7893m = new int[]{0, this.f7885e};
        this.f7884d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC6796b.m6442b(getContext(), 6.0f));
        this.f7889i = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        this.f7882b = z9;
        this.f7881a = z9;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableM6461f = AbstractC6799e.m6461f(getContext(), typedArrayObtainStyledAttributes, R$styleable.LoadingView_lv_icon);
            if (drawableM6461f != null) {
                this.f7890j = AbstractC6802h.m6493e(drawableM6461f);
            } else {
                Drawable drawableM12289a = C7842a.m12288b().m12289a();
                if (drawableM12289a != null) {
                    this.f7890j = AbstractC6802h.m6493e(drawableM12289a);
                }
            }
            this.f7891k = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        m6993e();
    }

    /* renamed from: e */
    public final void m6993e() {
        Paint paint = new Paint();
        this.f7883c = paint;
        paint.setColor(this.f7885e);
        this.f7883c.setAntiAlias(true);
        Paint paint2 = this.f7883c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f7883c.setStrokeWidth(this.f7884d);
        Paint paint3 = new Paint();
        this.f7892l = paint3;
        paint3.setColor(this.f7885e);
        this.f7892l.setAntiAlias(true);
        this.f7892l.setFilterBitmap(true);
        this.f7892l.setStyle(style);
        this.f7892l.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: f */
    public final void m6994f() {
        this.f7881a = false;
        invalidate();
    }

    /* renamed from: g */
    public void m6995g() {
        if (this.f7882b) {
            return;
        }
        this.f7881a = true;
        invalidate();
    }

    public float getIconScale() {
        return this.f7891k;
    }

    public int getLoadingColor() {
        return this.f7885e;
    }

    /* renamed from: h */
    public void m6996h() {
        if (this.f7882b) {
            return;
        }
        m6994f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7881a) {
            m6989a(canvas);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        int i13 = this.f7884d;
        this.f7886f = new RectF(i13 * 2, i13 * 2, i9 - (i13 * 2), i10 - (i13 * 2));
    }
}
