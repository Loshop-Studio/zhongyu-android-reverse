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

/* loaded from: classes3.dex */
public abstract class PorterImageView extends AppCompatImageView {

    /* renamed from: i */
    public static final PorterDuffXfermode f4684i = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: a */
    public Canvas f4685a;

    /* renamed from: b */
    public Bitmap f4686b;

    /* renamed from: c */
    public Paint f4687c;

    /* renamed from: d */
    public Canvas f4688d;

    /* renamed from: e */
    public Bitmap f4689e;

    /* renamed from: f */
    public Paint f4690f;

    /* renamed from: g */
    public int f4691g;

    /* renamed from: h */
    public boolean f4692h;

    /* renamed from: a */
    public final void m4547a(int i6, int i7, int i8, int i9) {
        boolean z6 = (i6 == i8 && i7 == i9) ? false : true;
        if (i6 <= 0 || i7 <= 0) {
            return;
        }
        if (this.f4685a == null || z6) {
            this.f4685a = new Canvas();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i7, config);
            this.f4686b = bitmapCreateBitmap;
            this.f4685a.setBitmap(bitmapCreateBitmap);
            this.f4687c.reset();
            mo4548b(this.f4685a, this.f4687c, i6, i7);
            this.f4688d = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i6, i7, config);
            this.f4689e = bitmapCreateBitmap2;
            this.f4688d.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.f4690f = paint;
            paint.setColor(this.f4691g);
            this.f4692h = true;
        }
    }

    /* renamed from: b */
    public abstract void mo4548b(Canvas canvas, Paint paint, int i6, int i7);

    @Override // android.view.View
    public void invalidate() {
        this.f4692h = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f4692h && (drawable = getDrawable()) != null) {
                    this.f4692h = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f4688d);
                    } else {
                        int saveCount = this.f4688d.getSaveCount();
                        this.f4688d.save();
                        this.f4688d.concat(imageMatrix);
                        drawable.draw(this.f4688d);
                        this.f4688d.restoreToCount(saveCount);
                    }
                    this.f4690f.reset();
                    this.f4690f.setFilterBitmap(false);
                    this.f4690f.setXfermode(f4684i);
                    this.f4688d.drawBitmap(this.f4686b, 0.0f, 0.0f, this.f4690f);
                }
                if (!this.f4692h) {
                    this.f4690f.setXfermode(null);
                    canvas.drawBitmap(this.f4689e, 0.0f, 0.0f, this.f4690f);
                }
                canvas.restoreToCount(iSaveLayer);
            } catch (Exception e6) {
                e6.printStackTrace();
                canvas.restoreToCount(iSaveLayer);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSaveLayer);
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i6, int i7) {
        if (i6 == 0) {
            i6 = 50;
        }
        if (i7 == 0) {
            i7 = 50;
        }
        super.onMeasure(i6, i7);
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        m4547a(i6, i7, i8, i9);
    }

    public void setTintColor(int i6) {
        this.f4691g = i6;
        setImageDrawable(new ColorDrawable(i6));
        Paint paint = this.f4690f;
        if (paint != null) {
            paint.setColor(i6);
            invalidate();
        }
    }
}
