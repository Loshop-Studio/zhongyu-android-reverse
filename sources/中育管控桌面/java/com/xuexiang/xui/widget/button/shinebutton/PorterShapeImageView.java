package com.xuexiang.xui.widget.button.shinebutton;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class PorterShapeImageView extends PorterImageView {

    /* renamed from: j */
    public Drawable f4693j;

    /* renamed from: k */
    public Matrix f4694k;

    /* renamed from: l */
    public Matrix f4695l;

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    /* renamed from: b */
    public void mo4548b(Canvas canvas, Paint paint, int i6, int i7) {
        Drawable drawable = this.f4693j;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                m4549c(getWidth(), getHeight());
                if (this.f4695l != null) {
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    canvas.concat(this.f4694k);
                    this.f4693j.draw(canvas);
                    canvas.restoreToCount(saveCount);
                    return;
                }
            }
            this.f4693j.setBounds(0, 0, getWidth(), getHeight());
            this.f4693j.draw(canvas);
        }
    }

    /* renamed from: c */
    public final void m4549c(int i6, int i7) {
        this.f4695l = null;
        int intrinsicWidth = this.f4693j.getIntrinsicWidth();
        int intrinsicHeight = this.f4693j.getIntrinsicHeight();
        boolean z6 = i6 == intrinsicWidth && i7 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z6) {
            return;
        }
        this.f4693j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float fMin = Math.min(i6 / intrinsicWidth, i7 / intrinsicHeight);
        this.f4694k.setScale(fMin, fMin);
        this.f4694k.postTranslate((int) (((r5 - (r0 * fMin)) * 0.5f) + 0.5f), (int) (((r6 - (r1 * fMin)) * 0.5f) + 0.5f));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f4693j = drawable;
        invalidate();
    }
}
