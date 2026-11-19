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
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.utils.AbstractC6878h;
import p150k1.C9050a;

/* loaded from: classes4.dex */
public class ARCLoadingView extends View {

    /* renamed from: a */
    public boolean f8045a;

    /* renamed from: b */
    public boolean f8046b;

    /* renamed from: c */
    public Paint f8047c;

    /* renamed from: d */
    public int f8048d;

    /* renamed from: e */
    public int f8049e;

    /* renamed from: f */
    public RectF f8050f;

    /* renamed from: g */
    public int f8051g;

    /* renamed from: h */
    public float f8052h;

    /* renamed from: i */
    public int f8053i;

    /* renamed from: j */
    public Bitmap f8054j;

    /* renamed from: k */
    public float f8055k;

    /* renamed from: l */
    public Paint f8056l;

    /* renamed from: m */
    public int[] f8057m;

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8046b = true;
        this.f8051g = 10;
        m7084d(context, attributeSet);
    }

    /* renamed from: a */
    public final void m7081a(Canvas canvas) {
        Bitmap bitmap = this.f8054j;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, m7082b(bitmap), this.f8056l);
        }
        this.f8047c.setShader(m7083c(canvas));
        canvas.drawArc(this.f8050f, this.f8051g, this.f8052h, false, this.f8047c);
        int i10 = this.f8051g + this.f8053i;
        this.f8051g = i10;
        if (i10 > 360) {
            this.f8051g = i10 - 360;
        }
    }

    /* renamed from: b */
    public RectF m7082b(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f8055k)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f8055k)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: c */
    public final SweepGradient m7083c(Canvas canvas) {
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f8057m, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f8051g, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    /* renamed from: d */
    public final void m7084d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f8049e = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC6877g.m6472f(context));
        this.f8052h = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_arc_degree, 315);
        this.f8057m = new int[]{0, this.f8049e};
        this.f8048d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC6872b.m6425a(getContext(), 6.0f));
        this.f8053i = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        this.f8046b = z10;
        this.f8045a = z10;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableM6453i = AbstractC6875e.m6453i(context, typedArrayObtainStyledAttributes, R$styleable.LoadingView_lv_icon);
            if (drawableM6453i != null) {
                this.f8054j = AbstractC6878h.m6495f(drawableM6453i);
            } else {
                Drawable drawableM15845a = C9050a.m15844b(context).m15845a();
                if (drawableM15845a != null) {
                    this.f8054j = AbstractC6878h.m6495f(drawableM15845a);
                }
            }
            this.f8055k = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        m7085e();
    }

    /* renamed from: e */
    public final void m7085e() {
        Paint paint = new Paint();
        this.f8047c = paint;
        paint.setColor(this.f8049e);
        this.f8047c.setAntiAlias(true);
        Paint paint2 = this.f8047c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f8047c.setStrokeWidth(this.f8048d);
        Paint paint3 = new Paint();
        this.f8056l = paint3;
        paint3.setColor(this.f8049e);
        this.f8056l.setAntiAlias(true);
        this.f8056l.setFilterBitmap(true);
        this.f8056l.setStyle(style);
        this.f8056l.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: f */
    public final void m7086f() {
        this.f8045a = false;
        invalidate();
    }

    /* renamed from: g */
    public void m7087g() {
        if (this.f8046b) {
            return;
        }
        this.f8045a = true;
        invalidate();
    }

    public float getIconScale() {
        return this.f8055k;
    }

    public int getLoadingColor() {
        return this.f8049e;
    }

    /* renamed from: h */
    public void m7088h() {
        if (this.f8046b) {
            return;
        }
        m7086f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8045a) {
            m7081a(canvas);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = this.f8048d;
        this.f8050f = new RectF(i14 * 2, i14 * 2, i10 - (i14 * 2), i11 - (i14 * 2));
    }
}
