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
    public static final PorterDuffXfermode f7215i = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: a */
    public Canvas f7216a;

    /* renamed from: b */
    public Bitmap f7217b;

    /* renamed from: c */
    public Paint f7218c;

    /* renamed from: d */
    public Canvas f7219d;

    /* renamed from: e */
    public Bitmap f7220e;

    /* renamed from: f */
    public Paint f7221f;

    /* renamed from: g */
    public int f7222g;

    /* renamed from: h */
    public boolean f7223h;

    /* renamed from: a */
    public final void m6633a(int i9, int i10, int i11, int i12) {
        boolean z9 = (i9 == i11 && i10 == i12) ? false : true;
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        if (this.f7216a == null || z9) {
            this.f7216a = new Canvas();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, config);
            this.f7217b = bitmapCreateBitmap;
            this.f7216a.setBitmap(bitmapCreateBitmap);
            this.f7218c.reset();
            mo6634b(this.f7216a, this.f7218c, i9, i10);
            this.f7219d = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i9, i10, config);
            this.f7220e = bitmapCreateBitmap2;
            this.f7219d.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.f7221f = paint;
            paint.setColor(this.f7222g);
            this.f7223h = true;
        }
    }

    /* renamed from: b */
    public abstract void mo6634b(Canvas canvas, Paint paint, int i9, int i10);

    @Override // android.view.View
    public void invalidate() {
        this.f7223h = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f7223h && (drawable = getDrawable()) != null) {
                    this.f7223h = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f7219d);
                    } else {
                        int saveCount = this.f7219d.getSaveCount();
                        this.f7219d.save();
                        this.f7219d.concat(imageMatrix);
                        drawable.draw(this.f7219d);
                        this.f7219d.restoreToCount(saveCount);
                    }
                    this.f7221f.reset();
                    this.f7221f.setFilterBitmap(false);
                    this.f7221f.setXfermode(f7215i);
                    this.f7219d.drawBitmap(this.f7217b, 0.0f, 0.0f, this.f7221f);
                }
                if (!this.f7223h) {
                    this.f7221f.setXfermode(null);
                    canvas.drawBitmap(this.f7220e, 0.0f, 0.0f, this.f7221f);
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
    public void onMeasure(int i9, int i10) {
        if (i9 == 0) {
            i9 = 50;
        }
        if (i10 == 0) {
            i10 = 50;
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        m6633a(i9, i10, i11, i12);
    }

    public void setTintColor(int i9) {
        this.f7222g = i9;
        setImageDrawable(new ColorDrawable(i9));
        Paint paint = this.f7221f;
        if (paint != null) {
            paint.setColor(i9);
            invalidate();
        }
    }
}
