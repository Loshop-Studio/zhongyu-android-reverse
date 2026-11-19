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
import com.xuexiang.xui.utils.AbstractC5854b;
import com.xuexiang.xui.utils.AbstractC5857e;
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.utils.AbstractC5860h;
import p126p1.C7590a;

/* loaded from: classes3.dex */
public class ARCLoadingView extends View {

    /* renamed from: a */
    public boolean f5332a;

    /* renamed from: b */
    public boolean f5333b;

    /* renamed from: c */
    public Paint f5334c;

    /* renamed from: d */
    public int f5335d;

    /* renamed from: e */
    public int f5336e;

    /* renamed from: f */
    public RectF f5337f;

    /* renamed from: g */
    public int f5338g;

    /* renamed from: h */
    public float f5339h;

    /* renamed from: i */
    public int f5340i;

    /* renamed from: j */
    public Bitmap f5341j;

    /* renamed from: k */
    public float f5342k;

    /* renamed from: l */
    public Paint f5343l;

    /* renamed from: m */
    public int[] f5344m;

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5333b = true;
        this.f5338g = 10;
        m4903d(context, attributeSet);
    }

    /* renamed from: a */
    public final void m4900a(Canvas canvas) {
        Bitmap bitmap = this.f5341j;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, m4901b(bitmap), this.f5343l);
        }
        this.f5334c.setShader(m4902c(canvas));
        canvas.drawArc(this.f5337f, this.f5338g, this.f5339h, false, this.f5334c);
        int i6 = this.f5338g + this.f5340i;
        this.f5338g = i6;
        if (i6 > 360) {
            this.f5338g = i6 - 360;
        }
    }

    /* renamed from: b */
    public RectF m4901b(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f5342k)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f5342k)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: c */
    public final SweepGradient m4902c(Canvas canvas) {
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f5344m, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.f5338g, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    /* renamed from: d */
    public final void m4903d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f5336e = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC5859g.m4380f(context));
        this.f5339h = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_arc_degree, 315);
        this.f5344m = new int[]{0, this.f5336e};
        this.f5335d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC5854b.m4346a(getContext(), 6.0f));
        this.f5340i = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        this.f5333b = z6;
        this.f5332a = z6;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableM4366g = AbstractC5857e.m4366g(context, typedArrayObtainStyledAttributes, R$styleable.LoadingView_lv_icon);
            if (drawableM4366g != null) {
                this.f5341j = AbstractC5860h.m4402f(drawableM4366g);
            } else {
                Drawable drawableM8997a = C7590a.m8996b(context).m8997a();
                if (drawableM8997a != null) {
                    this.f5341j = AbstractC5860h.m4402f(drawableM8997a);
                }
            }
            this.f5342k = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        m4904e();
    }

    /* renamed from: e */
    public final void m4904e() {
        Paint paint = new Paint();
        this.f5334c = paint;
        paint.setColor(this.f5336e);
        this.f5334c.setAntiAlias(true);
        Paint paint2 = this.f5334c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f5334c.setStrokeWidth(this.f5335d);
        Paint paint3 = new Paint();
        this.f5343l = paint3;
        paint3.setColor(this.f5336e);
        this.f5343l.setAntiAlias(true);
        this.f5343l.setFilterBitmap(true);
        this.f5343l.setStyle(style);
        this.f5343l.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: f */
    public final void m4905f() {
        this.f5332a = false;
        invalidate();
    }

    /* renamed from: g */
    public void m4906g() {
        if (this.f5333b) {
            return;
        }
        this.f5332a = true;
        invalidate();
    }

    public float getIconScale() {
        return this.f5342k;
    }

    public int getLoadingColor() {
        return this.f5336e;
    }

    /* renamed from: h */
    public void m4907h() {
        if (this.f5333b) {
            return;
        }
        m4905f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5332a) {
            m4900a(canvas);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        int i10 = this.f5335d;
        this.f5337f = new RectF(i10 * 2, i10 * 2, i6 - (i10 * 2), i7 - (i10 * 2));
    }
}
