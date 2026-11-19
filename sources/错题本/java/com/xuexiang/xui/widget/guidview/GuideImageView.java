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

/* loaded from: classes3.dex */
class GuideImageView extends AppCompatImageView {

    /* renamed from: a */
    public Bitmap f4320a;

    /* renamed from: b */
    public Paint f4321b;

    /* renamed from: c */
    public Paint f4322c;

    /* renamed from: d */
    public Paint f4323d;

    public GuideImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3489a();
    }

    /* renamed from: a */
    public final void m3489a() {
        setLayerType(2, null);
        setWillNotDraw(false);
        setBackgroundColor(0);
        Paint paint = new Paint();
        this.f4321b = paint;
        paint.setAntiAlias(true);
        this.f4321b.setColor(0);
        this.f4321b.setAlpha(255);
        Paint paint2 = new Paint();
        this.f4322c = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f4322c.setAlpha(255);
        this.f4322c.setAntiAlias(true);
        new Path();
        Paint paint3 = new Paint();
        this.f4323d = paint3;
        paint3.setAntiAlias(true);
        this.f4323d.setColor(0);
        this.f4323d.setStrokeWidth(0);
        this.f4323d.setStyle(Paint.Style.STROKE);
        new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4320a == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f4320a = bitmapCreateBitmap;
            bitmapCreateBitmap.eraseColor(0);
        }
        canvas.drawBitmap(this.f4320a, 0.0f, 0.0f, this.f4321b);
        throw null;
    }

    public GuideImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3489a();
    }
}
