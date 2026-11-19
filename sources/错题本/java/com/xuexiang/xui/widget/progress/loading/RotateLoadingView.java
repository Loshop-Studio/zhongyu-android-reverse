package com.xuexiang.xui.widget.progress.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
public class RotateLoadingView extends View {

    /* renamed from: a */
    public boolean f4703a;

    /* renamed from: b */
    public Paint f4704b;

    /* renamed from: c */
    public int f4705c;

    /* renamed from: d */
    public int f4706d;

    /* renamed from: e */
    public boolean f4707e;

    /* renamed from: f */
    public RectF f4708f;

    /* renamed from: g */
    public int f4709g;

    /* renamed from: h */
    public int f4710h;

    /* renamed from: i */
    public float f4711i;

    /* renamed from: j */
    public int f4712j;

    /* renamed from: k */
    public int f4713k;

    /* renamed from: l */
    public float f4714l;

    /* renamed from: m */
    public boolean f4715m;

    /* renamed from: n */
    public Bitmap f4716n;

    /* renamed from: o */
    public float f4717o;

    /* renamed from: p */
    public Paint f4718p;

    public RotateLoadingView(Context context) {
        super(context);
        this.f4709g = 10;
        this.f4710h = 190;
        this.f4715m = true;
        m3544a(context, null);
    }

    /* renamed from: a */
    public final void m3544a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f4706d = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC5806u.m5252F(context, R$attr.colorAccent, 0));
        this.f4705c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC5625a.m4948h(getContext(), 6.0f));
        this.f4713k = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        this.f4714l = r4 >> 2;
        this.f4703a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_arc_single, false);
        this.f4707e = z8;
        this.f4712j = z8 ? 280 : 160;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            getContext();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.LoadingView_lv_icon);
            if (drawable == null) {
                AbstractC5806u.m5281t();
                throw null;
            }
            this.f4716n = AbstractC6600a.m6232c(drawable);
            this.f4717o = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f4704b = paint;
        paint.setColor(this.f4706d);
        this.f4704b.setAntiAlias(true);
        Paint paint2 = this.f4704b;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f4704b.setStrokeWidth(this.f4705c);
        Paint paint3 = this.f4704b;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f4718p = paint4;
        paint4.setColor(this.f4706d);
        this.f4718p.setAntiAlias(true);
        this.f4718p.setStyle(style);
        this.f4718p.setStrokeCap(cap);
    }

    public int getLoadingColor() {
        return this.f4706d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height;
        float height2;
        super.onDraw(canvas);
        if (this.f4703a) {
            Bitmap bitmap = this.f4716n;
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
                float fM1037a = AbstractC1923c.m1037a(height, this.f4717o, getWidth(), 2.0f);
                float fM1037a2 = AbstractC1923c.m1037a(height2, this.f4717o, getHeight(), 2.0f);
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(fM1037a, fM1037a2, getWidth() - fM1037a, getHeight() - fM1037a2), this.f4718p);
            }
            canvas.drawArc(this.f4708f, this.f4709g, this.f4711i, false, this.f4704b);
            int i = this.f4709g + this.f4713k;
            this.f4709g = i;
            if (i > 360) {
                this.f4709g = i - 360;
            }
            if (!this.f4707e) {
                canvas.drawArc(this.f4708f, this.f4710h, this.f4711i, false, this.f4704b);
                int i8 = this.f4710h + this.f4713k;
                this.f4710h = i8;
                if (i8 > 360) {
                    this.f4710h = i8 - 360;
                }
            }
            boolean z8 = this.f4715m;
            if (z8) {
                float f = this.f4711i;
                if (f < this.f4712j) {
                    this.f4711i = f + this.f4714l;
                }
            } else {
                float f7 = this.f4711i;
                if (f7 > this.f4713k) {
                    this.f4711i = f7 - (this.f4714l * 2.0f);
                }
            }
            float f8 = this.f4711i;
            if (f8 >= this.f4712j || f8 <= this.f4713k) {
                this.f4715m = !z8;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f4711i = 10.0f;
        int i11 = this.f4705c;
        this.f4708f = new RectF(i11 * 2, i11 * 2, i - (i11 * 2), i8 - (i11 * 2));
    }

    public RotateLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4709g = 10;
        this.f4710h = 190;
        this.f4715m = true;
        m3544a(context, attributeSet);
    }

    public RotateLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4709g = 10;
        this.f4710h = 190;
        this.f4715m = true;
        m3544a(context, attributeSet);
    }
}
