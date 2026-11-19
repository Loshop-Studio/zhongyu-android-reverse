package com.xuexiang.xui.widget.button.shinebutton;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public abstract class PorterImageView extends AppCompatImageView {

    /* renamed from: i */
    public static final PorterDuffXfermode f4169i = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: a */
    public Canvas f4170a;

    /* renamed from: b */
    public Bitmap f4171b;

    /* renamed from: c */
    public Paint f4172c;

    /* renamed from: d */
    public Canvas f4173d;

    /* renamed from: e */
    public Bitmap f4174e;

    /* renamed from: f */
    public Paint f4175f;

    /* renamed from: g */
    public int f4176g;

    /* renamed from: h */
    public boolean f4177h;

    public PorterImageView(Context context) {
        super(context);
        this.f4176g = -7829368;
        this.f4177h = true;
        m3472a();
    }

    /* renamed from: a */
    public final void m3472a() {
        if (getScaleType() == ImageView.ScaleType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        Paint paint = new Paint(1);
        this.f4172c = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: b */
    public abstract void mo3473b(Canvas canvas);

    @Override // android.view.View
    public final void invalidate() {
        this.f4177h = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f4177h && (drawable = getDrawable()) != null) {
                    this.f4177h = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f4173d);
                    } else {
                        int saveCount = this.f4173d.getSaveCount();
                        this.f4173d.save();
                        this.f4173d.concat(imageMatrix);
                        drawable.draw(this.f4173d);
                        this.f4173d.restoreToCount(saveCount);
                    }
                    this.f4175f.reset();
                    this.f4175f.setFilterBitmap(false);
                    this.f4175f.setXfermode(f4169i);
                    this.f4173d.drawBitmap(this.f4171b, 0.0f, 0.0f, this.f4175f);
                }
                if (!this.f4177h) {
                    this.f4175f.setXfermode(null);
                    canvas.drawBitmap(this.f4174e, 0.0f, 0.0f, this.f4175f);
                }
                canvas.restoreToCount(iSaveLayer);
            } catch (Exception e) {
                e.printStackTrace();
                canvas.restoreToCount(iSaveLayer);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSaveLayer);
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i8) {
        if (i == 0) {
            i = 50;
        }
        if (i8 == 0) {
            i8 = 50;
        }
        super.onMeasure(i, i8);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        boolean z8 = (i == i9 && i8 == i10) ? false : true;
        if (i <= 0 || i8 <= 0) {
            return;
        }
        if (this.f4170a == null || z8) {
            this.f4170a = new Canvas();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i8, config);
            this.f4171b = bitmapCreateBitmap;
            this.f4170a.setBitmap(bitmapCreateBitmap);
            this.f4172c.reset();
            mo3473b(this.f4170a);
            this.f4173d = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i8, config);
            this.f4174e = bitmapCreateBitmap2;
            this.f4173d.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.f4175f = paint;
            paint.setColor(this.f4176g);
            this.f4177h = true;
        }
    }

    public void setTintColor(int i) {
        this.f4176g = i;
        setImageDrawable(new ColorDrawable(i));
        Paint paint = this.f4175f;
        if (paint != null) {
            paint.setColor(i);
            invalidate();
        }
    }

    public PorterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4176g = -7829368;
        this.f4177h = true;
        m3472a();
    }

    public PorterImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4176g = -7829368;
        this.f4177h = true;
        m3472a();
    }
}
