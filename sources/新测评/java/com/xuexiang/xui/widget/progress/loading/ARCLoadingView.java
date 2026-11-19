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
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6477b;
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.utils.AbstractC6483h;
import p186o2.C8696a;

/* loaded from: classes4.dex */
public class ARCLoadingView extends View {

    /* renamed from: a */
    public boolean f6623a;

    /* renamed from: b */
    public boolean f6624b;

    /* renamed from: c */
    public Paint f6625c;

    /* renamed from: d */
    public int f6626d;

    /* renamed from: e */
    public int f6627e;

    /* renamed from: f */
    public RectF f6628f;

    /* renamed from: g */
    public int f6629g;

    /* renamed from: h */
    public float f6630h;

    /* renamed from: i */
    public int f6631i;

    /* renamed from: j */
    public Bitmap f6632j;

    /* renamed from: k */
    public float f6633k;

    /* renamed from: l */
    public Paint f6634l;

    /* renamed from: m */
    public int[] f6635m;

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6624b = true;
        this.f6629g = 10;
        m5894d(context, attributeSet);
    }

    /* renamed from: a */
    public final void m5891a(Canvas canvas) {
        Bitmap bitmap = this.f6632j;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, m5892b(bitmap), this.f6634l);
        }
        this.f6625c.setShader(m5893c(canvas));
        canvas.drawArc(this.f6628f, this.f6629g, this.f6630h, false, this.f6625c);
        int i10 = this.f6629g + this.f6631i;
        this.f6629g = i10;
        if (i10 > 360) {
            this.f6629g = i10 - 360;
        }
    }

    /* renamed from: b */
    public RectF m5892b(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f6633k)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f6633k)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: c */
    public final SweepGradient m5893c(Canvas canvas) {
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f6635m, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f6629g, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    /* renamed from: d */
    public final void m5894d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f6627e = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC6482g.m5375f(context));
        this.f6630h = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_arc_degree, 315);
        this.f6635m = new int[]{0, this.f6627e};
        this.f6626d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC6477b.m5341a(getContext(), 6.0f));
        this.f6631i = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        this.f6624b = z9;
        this.f6623a = z9;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableM5361g = AbstractC6480e.m5361g(context, typedArrayObtainStyledAttributes, R$styleable.LoadingView_lv_icon);
            if (drawableM5361g != null) {
                this.f6632j = AbstractC6483h.m5396e(drawableM5361g);
            } else {
                Drawable drawableM14298a = C8696a.m14297b(context).m14298a();
                if (drawableM14298a != null) {
                    this.f6632j = AbstractC6483h.m5396e(drawableM14298a);
                }
            }
            this.f6633k = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        m5895e();
    }

    /* renamed from: e */
    public final void m5895e() {
        Paint paint = new Paint();
        this.f6625c = paint;
        paint.setColor(this.f6627e);
        this.f6625c.setAntiAlias(true);
        Paint paint2 = this.f6625c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f6625c.setStrokeWidth(this.f6626d);
        Paint paint3 = new Paint();
        this.f6634l = paint3;
        paint3.setColor(this.f6627e);
        this.f6634l.setAntiAlias(true);
        this.f6634l.setFilterBitmap(true);
        this.f6634l.setStyle(style);
        this.f6634l.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: f */
    public final void m5896f() {
        this.f6623a = false;
        invalidate();
    }

    /* renamed from: g */
    public void m5897g() {
        if (this.f6624b) {
            return;
        }
        this.f6623a = true;
        invalidate();
    }

    public float getIconScale() {
        return this.f6633k;
    }

    public int getLoadingColor() {
        return this.f6627e;
    }

    /* renamed from: h */
    public void m5898h() {
        if (this.f6624b) {
            return;
        }
        m5896f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6623a) {
            m5891a(canvas);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = this.f6626d;
        this.f6628f = new RectF(i14 * 2, i14 * 2, i10 - (i14 * 2), i11 - (i14 * 2));
    }
}
