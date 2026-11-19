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

/* loaded from: classes2.dex */
public abstract class PorterImageView extends AppCompatImageView {

    /* renamed from: i */
    public static final PorterDuffXfermode f3300i = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: a */
    public Canvas f3301a;

    /* renamed from: b */
    public Bitmap f3302b;

    /* renamed from: c */
    public Paint f3303c;

    /* renamed from: d */
    public Canvas f3304d;

    /* renamed from: e */
    public Bitmap f3305e;

    /* renamed from: f */
    public Paint f3306f;

    /* renamed from: g */
    public int f3307g;

    /* renamed from: h */
    public boolean f3308h;

    /* renamed from: a */
    public final void m4223a(int i4, int i5, int i6, int i7) {
        boolean z3 = (i4 == i6 && i5 == i7) ? false : true;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        if (this.f3301a == null || z3) {
            this.f3301a = new Canvas();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            this.f3302b = bitmapCreateBitmap;
            this.f3301a.setBitmap(bitmapCreateBitmap);
            this.f3303c.reset();
            mo4224b(this.f3301a, this.f3303c, i4, i5);
            this.f3304d = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            this.f3305e = bitmapCreateBitmap2;
            this.f3304d.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.f3306f = paint;
            paint.setColor(this.f3307g);
            this.f3308h = true;
        }
    }

    /* renamed from: b */
    public abstract void mo4224b(Canvas canvas, Paint paint, int i4, int i5);

    @Override // android.view.View
    public void invalidate() {
        this.f3308h = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f3308h && (drawable = getDrawable()) != null) {
                    this.f3308h = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f3304d);
                    } else {
                        int saveCount = this.f3304d.getSaveCount();
                        this.f3304d.save();
                        this.f3304d.concat(imageMatrix);
                        drawable.draw(this.f3304d);
                        this.f3304d.restoreToCount(saveCount);
                    }
                    this.f3306f.reset();
                    this.f3306f.setFilterBitmap(false);
                    this.f3306f.setXfermode(f3300i);
                    this.f3304d.drawBitmap(this.f3302b, 0.0f, 0.0f, this.f3306f);
                }
                if (!this.f3308h) {
                    this.f3306f.setXfermode(null);
                    canvas.drawBitmap(this.f3305e, 0.0f, 0.0f, this.f3306f);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i5) {
        if (i4 == 0) {
            i4 = 50;
        }
        if (i5 == 0) {
            i5 = 50;
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        m4223a(i4, i5, i6, i7);
    }

    public void setTintColor(int i4) {
        this.f3307g = i4;
        setImageDrawable(new ColorDrawable(i4));
        Paint paint = this.f3306f;
        if (paint != null) {
            paint.setColor(i4);
            invalidate();
        }
    }
}
