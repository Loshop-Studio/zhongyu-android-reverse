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

/* loaded from: classes5.dex */
public abstract class PorterImageView extends AppCompatImageView {

    /* renamed from: k */
    public static final PorterDuffXfermode f15660k = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: c */
    public Canvas f15661c;

    /* renamed from: d */
    public Bitmap f15662d;

    /* renamed from: e */
    public Paint f15663e;

    /* renamed from: f */
    public Canvas f15664f;

    /* renamed from: g */
    public Bitmap f15665g;

    /* renamed from: h */
    public Paint f15666h;

    /* renamed from: i */
    public int f15667i;

    /* renamed from: j */
    public boolean f15668j;

    public PorterImageView(Context context) {
        super(context);
        this.f15667i = -7829368;
        this.f15668j = true;
        m12481b();
    }

    /* renamed from: b */
    private void m12481b() {
        if (getScaleType() == ImageView.ScaleType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        Paint paint = new Paint(1);
        this.f15663e = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: a */
    public final void m12482a(int i10, int i11, int i12, int i13) {
        boolean z10 = (i10 == i12 && i11 == i13) ? false : true;
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        if (this.f15661c == null || z10) {
            this.f15661c = new Canvas();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
            this.f15662d = bitmapCreateBitmap;
            this.f15661c.setBitmap(bitmapCreateBitmap);
            this.f15663e.reset();
            mo12483c(this.f15661c, this.f15663e, i10, i11);
            this.f15664f = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, config);
            this.f15665g = bitmapCreateBitmap2;
            this.f15664f.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.f15666h = paint;
            paint.setColor(this.f15667i);
            this.f15668j = true;
        }
    }

    /* renamed from: c */
    public abstract void mo12483c(Canvas canvas, Paint paint, int i10, int i11);

    @Override // android.view.View
    public void invalidate() {
        this.f15668j = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f15668j && (drawable = getDrawable()) != null) {
                    this.f15668j = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f15664f);
                    } else {
                        int saveCount = this.f15664f.getSaveCount();
                        this.f15664f.save();
                        this.f15664f.concat(imageMatrix);
                        drawable.draw(this.f15664f);
                        this.f15664f.restoreToCount(saveCount);
                    }
                    this.f15666h.reset();
                    this.f15666h.setFilterBitmap(false);
                    this.f15666h.setXfermode(f15660k);
                    this.f15664f.drawBitmap(this.f15662d, 0.0f, 0.0f, this.f15666h);
                }
                if (!this.f15668j) {
                    this.f15666h.setXfermode(null);
                    canvas.drawBitmap(this.f15665g, 0.0f, 0.0f, this.f15666h);
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
        m12482a(i10, i11, i12, i13);
    }

    public void setTintColor(int i10) {
        this.f15667i = i10;
        setImageDrawable(new ColorDrawable(i10));
        Paint paint = this.f15666h;
        if (paint != null) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public PorterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15667i = -7829368;
        this.f15668j = true;
        m12481b();
    }

    public PorterImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15667i = -7829368;
        this.f15668j = true;
        m12481b();
    }
}
