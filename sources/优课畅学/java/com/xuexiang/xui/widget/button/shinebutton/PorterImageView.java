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
    public static final PorterDuffXfermode f7285i = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: a */
    public Canvas f7286a;

    /* renamed from: b */
    public Bitmap f7287b;

    /* renamed from: c */
    public Paint f7288c;

    /* renamed from: d */
    public Canvas f7289d;

    /* renamed from: e */
    public Bitmap f7290e;

    /* renamed from: f */
    public Paint f7291f;

    /* renamed from: g */
    public int f7292g;

    /* renamed from: h */
    public boolean f7293h;

    /* renamed from: a */
    public final void m6658a(int i10, int i11, int i12, int i13) {
        boolean z10 = (i10 == i12 && i11 == i13) ? false : true;
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        if (this.f7286a == null || z10) {
            this.f7286a = new Canvas();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
            this.f7287b = bitmapCreateBitmap;
            this.f7286a.setBitmap(bitmapCreateBitmap);
            this.f7288c.reset();
            mo6659b(this.f7286a, this.f7288c, i10, i11);
            this.f7289d = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, config);
            this.f7290e = bitmapCreateBitmap2;
            this.f7289d.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.f7291f = paint;
            paint.setColor(this.f7292g);
            this.f7293h = true;
        }
    }

    /* renamed from: b */
    public abstract void mo6659b(Canvas canvas, Paint paint, int i10, int i11);

    @Override // android.view.View
    public void invalidate() {
        this.f7293h = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f7293h && (drawable = getDrawable()) != null) {
                    this.f7293h = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f7289d);
                    } else {
                        int saveCount = this.f7289d.getSaveCount();
                        this.f7289d.save();
                        this.f7289d.concat(imageMatrix);
                        drawable.draw(this.f7289d);
                        this.f7289d.restoreToCount(saveCount);
                    }
                    this.f7291f.reset();
                    this.f7291f.setFilterBitmap(false);
                    this.f7291f.setXfermode(f7285i);
                    this.f7289d.drawBitmap(this.f7287b, 0.0f, 0.0f, this.f7291f);
                }
                if (!this.f7293h) {
                    this.f7291f.setXfermode(null);
                    canvas.drawBitmap(this.f7290e, 0.0f, 0.0f, this.f7291f);
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
        m6658a(i10, i11, i12, i13);
    }

    public void setTintColor(int i10) {
        this.f7292g = i10;
        setImageDrawable(new ColorDrawable(i10));
        Paint paint = this.f7291f;
        if (paint != null) {
            paint.setColor(i10);
            invalidate();
        }
    }
}
