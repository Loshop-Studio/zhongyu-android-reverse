package com.xuexiang.xui.widget.button.shinebutton;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public abstract class PorterImageView extends AppCompatImageView {

    /* renamed from: i */
    public static final PorterDuffXfermode f5960i = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: a */
    public Canvas f5961a;

    /* renamed from: b */
    public Bitmap f5962b;

    /* renamed from: c */
    public Paint f5963c;

    /* renamed from: d */
    public Canvas f5964d;

    /* renamed from: e */
    public Bitmap f5965e;

    /* renamed from: f */
    public Paint f5966f;

    /* renamed from: g */
    public int f5967g;

    /* renamed from: h */
    public boolean f5968h;

    /* renamed from: a */
    public final void m5537a(int i10, int i11, int i12, int i13) {
        boolean z9 = (i10 == i12 && i11 == i13) ? false : true;
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        if (this.f5961a == null || z9) {
            this.f5961a = new Canvas();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
            this.f5962b = bitmapCreateBitmap;
            this.f5961a.setBitmap(bitmapCreateBitmap);
            this.f5963c.reset();
            mo5538b(this.f5961a, this.f5963c, i10, i11);
            this.f5964d = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, config);
            this.f5965e = bitmapCreateBitmap2;
            this.f5964d.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.f5966f = paint;
            paint.setColor(this.f5967g);
            this.f5968h = true;
        }
    }

    /* renamed from: b */
    public abstract void mo5538b(Canvas canvas, Paint paint, int i10, int i11);

    @Override // android.view.View
    public void invalidate() {
        this.f5968h = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f5968h && (drawable = getDrawable()) != null) {
                    this.f5968h = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f5964d);
                    } else {
                        int saveCount = this.f5964d.getSaveCount();
                        this.f5964d.save();
                        this.f5964d.concat(imageMatrix);
                        drawable.draw(this.f5964d);
                        this.f5964d.restoreToCount(saveCount);
                    }
                    this.f5966f.reset();
                    this.f5966f.setFilterBitmap(false);
                    this.f5966f.setXfermode(f5960i);
                    this.f5964d.drawBitmap(this.f5962b, 0.0f, 0.0f, this.f5966f);
                }
                if (!this.f5968h) {
                    this.f5966f.setXfermode(null);
                    canvas.drawBitmap(this.f5965e, 0.0f, 0.0f, this.f5966f);
                }
                canvas.restoreToCount(iSaveLayer);
            } catch (Exception e10) {
                e10.printStackTrace();
                canvas.restoreToCount(iSaveLayer);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSaveLayer);
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (i10 == 0) {
            i10 = 50;
        }
        if (i11 == 0) {
            i11 = 50;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m5537a(i10, i11, i12, i13);
    }

    public void setTintColor(int i10) {
        this.f5967g = i10;
        setImageDrawable(new ColorDrawable(i10));
        Paint paint = this.f5966f;
        if (paint != null) {
            paint.setColor(i10);
            invalidate();
        }
    }
}
