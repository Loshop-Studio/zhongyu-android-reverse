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
import com.alibaba.fastjson.asm.Opcodes;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.utils.AbstractC8042h;
import p420y7.C11915a;

/* loaded from: classes5.dex */
public class RotateLoadingView extends View {

    /* renamed from: c */
    public boolean f16760c;

    /* renamed from: d */
    public boolean f16761d;

    /* renamed from: e */
    public Paint f16762e;

    /* renamed from: f */
    public int f16763f;

    /* renamed from: g */
    public int f16764g;

    /* renamed from: h */
    public boolean f16765h;

    /* renamed from: i */
    public RectF f16766i;

    /* renamed from: j */
    public int f16767j;

    /* renamed from: k */
    public int f16768k;

    /* renamed from: l */
    public float f16769l;

    /* renamed from: m */
    public int f16770m;

    /* renamed from: n */
    public int f16771n;

    /* renamed from: o */
    public float f16772o;

    /* renamed from: p */
    public boolean f16773p;

    /* renamed from: q */
    public Bitmap f16774q;

    /* renamed from: r */
    public float f16775r;

    /* renamed from: s */
    public Paint f16776s;

    public RotateLoadingView(Context context) {
        super(context);
        this.f16761d = true;
        this.f16767j = 10;
        this.f16768k = 190;
        this.f16773p = true;
        m13118f(context, null);
    }

    /* renamed from: a */
    public final void m13113a() {
        boolean z10 = this.f16773p;
        if (z10) {
            float f10 = this.f16769l;
            if (f10 < this.f16770m) {
                this.f16769l = f10 + this.f16772o;
            }
        } else {
            float f11 = this.f16769l;
            if (f11 > this.f16771n) {
                this.f16769l = f11 - (this.f16772o * 2.0f);
            }
        }
        float f12 = this.f16769l;
        if (f12 >= this.f16770m || f12 <= this.f16771n) {
            this.f16773p = !z10;
        }
    }

    /* renamed from: b */
    public final void m13114b(Canvas canvas) {
        Bitmap bitmap = this.f16774q;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, m13117e(bitmap), this.f16776s);
        }
        m13116d(canvas);
        if (this.f16765h) {
            return;
        }
        m13115c(canvas);
    }

    /* renamed from: c */
    public final void m13115c(Canvas canvas) {
        canvas.drawArc(this.f16766i, this.f16768k, this.f16769l, false, this.f16762e);
        int i10 = this.f16768k + this.f16771n;
        this.f16768k = i10;
        if (i10 > 360) {
            this.f16768k = i10 - 360;
        }
    }

    /* renamed from: d */
    public final void m13116d(Canvas canvas) {
        canvas.drawArc(this.f16766i, this.f16767j, this.f16769l, false, this.f16762e);
        int i10 = this.f16767j + this.f16771n;
        this.f16767j = i10;
        if (i10 > 360) {
            this.f16767j = i10 - 360;
        }
    }

    /* renamed from: e */
    public RectF m13117e(Bitmap bitmap) {
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
        float width2 = (getWidth() - (height * this.f16775r)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.f16775r)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    /* renamed from: f */
    public final void m13118f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingView);
        this.f16764g = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingView_lv_color, AbstractC8041g.m12217d(context, R$attr.colorAccent));
        this.f16763f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingView_lv_width, AbstractC8037c.m12188b(getContext(), 6.0f));
        this.f16771n = typedArrayObtainStyledAttributes.getInt(R$styleable.LoadingView_lv_speed, 5);
        this.f16772o = r3 >> 2;
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_auto, true);
        this.f16761d = z10;
        this.f16760c = z10;
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_arc_single, false);
        this.f16765h = z11;
        this.f16770m = z11 ? 280 : Opcodes.IF_ICMPNE;
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.LoadingView_lv_icon);
            if (drawableM12206g != null) {
                this.f16774q = AbstractC8042h.m12229c(drawableM12206g);
            } else {
                Drawable drawableM26455a = C11915a.m26454b().m26455a();
                if (drawableM26455a != null) {
                    this.f16774q = AbstractC8042h.m12229c(drawableM26455a);
                }
            }
            this.f16775r = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        m13119g();
    }

    /* renamed from: g */
    public final void m13119g() {
        Paint paint = new Paint();
        this.f16762e = paint;
        paint.setColor(this.f16764g);
        this.f16762e.setAntiAlias(true);
        Paint paint2 = this.f16762e;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f16762e.setStrokeWidth(this.f16763f);
        Paint paint3 = this.f16762e;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f16776s = paint4;
        paint4.setColor(this.f16764g);
        this.f16776s.setAntiAlias(true);
        this.f16776s.setStyle(style);
        this.f16776s.setStrokeCap(cap);
    }

    public int getLoadingColor() {
        return this.f16764g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16760c) {
            m13114b(canvas);
            m13113a();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f16769l = 10.0f;
        int i14 = this.f16763f;
        this.f16766i = new RectF(i14 * 2, i14 * 2, i10 - (i14 * 2), i11 - (i14 * 2));
    }

    public RotateLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16761d = true;
        this.f16767j = 10;
        this.f16768k = 190;
        this.f16773p = true;
        m13118f(context, attributeSet);
    }

    public RotateLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16761d = true;
        this.f16767j = 10;
        this.f16768k = 190;
        this.f16773p = true;
        m13118f(context, attributeSet);
    }
}
