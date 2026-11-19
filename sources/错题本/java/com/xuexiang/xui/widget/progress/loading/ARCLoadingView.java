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
import androidx.compose.material3.AbstractC1923c;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;
import p073h4.AbstractC5625a;
import p169t6.AbstractC6600a;

/* loaded from: classes3.dex */
public class ARCLoadingView extends View {

    /* renamed from: a */
    public boolean f4683a;

    /* renamed from: b */
    public Paint f4684b;

    /* renamed from: c */
    public int f4685c;

    /* renamed from: d */
    public int f4686d;

    /* renamed from: e */
    public RectF f4687e;

    /* renamed from: f */
    public int f4688f;

    /* renamed from: g */
    public float f4689g;

    /* renamed from: h */
    public int f4690h;

    /* renamed from: i */
    public Bitmap f4691i;

    /* renamed from: j */
    public float f4692j;

    /* renamed from: k */
    public Paint f4693k;

    /* renamed from: l */
    public int[] f4694l;

    public ARCLoadingView(Context context) {
        super(context);
        this.f4688f = 10;
        m3540a(context, null);
    }

    /* renamed from: a */
    public final void m3540a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f4686d = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC5806u.m5252F(context, R$attr.colorAccent, 0));
        this.f4689g = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_arc_degree, 315);
        this.f4694l = new int[]{0, this.f4686d};
        this.f4685c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC5625a.m4948h(getContext(), 6.0f));
        this.f4690h = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        this.f4683a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            getContext();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.LoadingView_lv_icon);
            if (drawable == null) {
                AbstractC5806u.m5281t();
                throw null;
            }
            this.f4691i = AbstractC6600a.m6232c(drawable);
            this.f4692j = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f4684b = paint;
        paint.setColor(this.f4686d);
        this.f4684b.setAntiAlias(true);
        Paint paint2 = this.f4684b;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f4684b.setStrokeWidth(this.f4685c);
        Paint paint3 = new Paint();
        this.f4693k = paint3;
        paint3.setColor(this.f4686d);
        this.f4693k.setAntiAlias(true);
        this.f4693k.setFilterBitmap(true);
        this.f4693k.setStyle(style);
        this.f4693k.setStrokeCap(Paint.Cap.ROUND);
    }

    public float getIconScale() {
        return this.f4692j;
    }

    public int getLoadingColor() {
        return this.f4686d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height;
        float height2;
        super.onDraw(canvas);
        if (this.f4683a) {
            Bitmap bitmap = this.f4691i;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                float height3 = bitmap.getHeight();
                if (width >= height3) {
                    height2 = (getWidth() / width) * height3;
                    height = getWidth();
                } else {
                    height = width * (getHeight() / height3);
                    height2 = getHeight();
                }
                float fM1037a = AbstractC1923c.m1037a(height, this.f4692j, getWidth(), 2.0f);
                float fM1037a2 = AbstractC1923c.m1037a(height2, this.f4692j, getHeight(), 2.0f);
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(fM1037a, fM1037a2, getWidth() - fM1037a, getHeight() - fM1037a2), this.f4693k);
            }
            Paint paint = this.f4684b;
            SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f4694l, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f4688f, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            canvas.drawArc(this.f4687e, this.f4688f, this.f4689g, false, this.f4684b);
            int i = this.f4688f + this.f4690h;
            this.f4688f = i;
            if (i > 360) {
                this.f4688f = i - 360;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        int i11 = this.f4685c;
        this.f4687e = new RectF(i11 * 2, i11 * 2, i - (i11 * 2), i8 - (i11 * 2));
    }

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4688f = 10;
        m3540a(context, attributeSet);
    }

    public ARCLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4688f = 10;
        m3540a(context, attributeSet);
    }
}
