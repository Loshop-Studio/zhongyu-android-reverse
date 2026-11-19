package com.xuexiang.xui.widget.guidview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes5.dex */
class GuideImageView extends AppCompatImageView {

    /* renamed from: c */
    public Bitmap f16020c;

    /* renamed from: d */
    public Paint f16021d;

    /* renamed from: e */
    public Paint f16022e;

    /* renamed from: f */
    public Paint f16023f;

    /* renamed from: g */
    public int f16024g;

    /* renamed from: h */
    public int f16025h;

    /* renamed from: i */
    public int f16026i;

    /* renamed from: j */
    public C8125a f16027j;

    /* renamed from: k */
    public int f16028k;

    /* renamed from: l */
    public int f16029l;

    /* renamed from: m */
    public double f16030m;

    /* renamed from: n */
    public boolean f16031n;

    /* renamed from: o */
    public Path f16032o;

    /* renamed from: p */
    public RectF f16033p;

    /* renamed from: q */
    public int f16034q;

    /* renamed from: r */
    public int f16035r;

    public GuideImageView(Context context) {
        super(context);
        this.f16024g = 0;
        this.f16026i = 20;
        this.f16029l = 1;
        this.f16030m = 1.0d;
        this.f16031n = true;
        m12674c();
    }

    /* renamed from: c */
    private void m12674c() {
        setLayerType(2, null);
        setWillNotDraw(false);
        setBackgroundColor(0);
        Paint paint = new Paint();
        this.f16021d = paint;
        paint.setAntiAlias(true);
        this.f16021d.setColor(this.f16024g);
        this.f16021d.setAlpha(255);
        Paint paint2 = new Paint();
        this.f16022e = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f16022e.setAlpha(255);
        this.f16022e.setAntiAlias(true);
        this.f16032o = new Path();
        Paint paint3 = new Paint();
        this.f16023f = paint3;
        paint3.setAntiAlias(true);
        this.f16023f.setColor(0);
        this.f16023f.setStrokeWidth(this.f16025h);
        this.f16023f.setStyle(Paint.Style.STROKE);
        this.f16033p = new RectF();
    }

    /* renamed from: a */
    public final void m12675a(Canvas canvas) {
        canvas.drawCircle(this.f16027j.m12683b(), this.f16027j.m12684c(), this.f16027j.m12682a(this.f16028k, this.f16030m), this.f16022e);
        if (this.f16025h > 0) {
            this.f16032o.reset();
            this.f16032o.moveTo(this.f16027j.m12683b(), this.f16027j.m12684c());
            this.f16032o.addCircle(this.f16027j.m12683b(), this.f16027j.m12684c(), this.f16027j.m12682a(this.f16028k, this.f16030m), Path.Direction.CW);
            canvas.drawPath(this.f16032o, this.f16023f);
        }
    }

    /* renamed from: b */
    public final void m12676b(Canvas canvas) {
        this.f16033p.set(this.f16027j.m12690i(this.f16028k, this.f16030m), this.f16027j.m12692k(this.f16028k, this.f16030m), this.f16027j.m12691j(this.f16028k, this.f16030m), this.f16027j.m12689h(this.f16028k, this.f16030m));
        RectF rectF = this.f16033p;
        int i10 = this.f16026i;
        canvas.drawRoundRect(rectF, i10, i10, this.f16022e);
        if (this.f16025h > 0) {
            this.f16032o.reset();
            this.f16032o.moveTo(this.f16027j.m12683b(), this.f16027j.m12684c());
            Path path = this.f16032o;
            RectF rectF2 = this.f16033p;
            int i11 = this.f16026i;
            path.addRoundRect(rectF2, i11, i11, Path.Direction.CW);
            canvas.drawPath(this.f16032o, this.f16023f);
        }
    }

    /* renamed from: d */
    public void m12677d(boolean z10) {
        this.f16031n = z10;
        this.f16028k = z10 ? 20 : 0;
    }

    /* renamed from: e */
    public void m12678e(int i10, int i11) {
        this.f16025h = i11;
        this.f16023f.setColor(i10);
        this.f16023f.setStrokeWidth(i11);
    }

    /* renamed from: f */
    public void m12679f(int i10, int i11) {
        this.f16034q = i10;
        this.f16035r = i11;
    }

    /* renamed from: g */
    public void m12680g(int i10, C8125a c8125a) {
        this.f16024g = i10;
        this.f16030m = 1.0d;
        this.f16027j = c8125a;
    }

    /* renamed from: h */
    public void m12681h(int i10) {
        this.f16026i = i10;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16020c == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f16020c = bitmapCreateBitmap;
            bitmapCreateBitmap.eraseColor(this.f16024g);
        }
        canvas.drawBitmap(this.f16020c, 0.0f, 0.0f, this.f16021d);
        if (this.f16027j.m12688g()) {
            if (this.f16027j.m12686e().equals(FocusShape.CIRCLE)) {
                m12675a(canvas);
            } else {
                m12676b(canvas);
            }
            if (this.f16031n) {
                int i10 = this.f16028k;
                if (i10 == this.f16034q) {
                    this.f16029l = this.f16035r * (-1);
                } else if (i10 == 0) {
                    this.f16029l = this.f16035r;
                }
                this.f16028k = i10 + this.f16029l;
                postInvalidate();
            }
        }
    }

    public GuideImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16024g = 0;
        this.f16026i = 20;
        this.f16029l = 1;
        this.f16030m = 1.0d;
        this.f16031n = true;
        m12674c();
    }

    public GuideImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16024g = 0;
        this.f16026i = 20;
        this.f16029l = 1;
        this.f16030m = 1.0d;
        this.f16031n = true;
        m12674c();
    }
}
