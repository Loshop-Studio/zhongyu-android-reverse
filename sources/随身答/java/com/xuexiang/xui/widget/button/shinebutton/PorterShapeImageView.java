package com.xuexiang.xui.widget.button.shinebutton;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public class PorterShapeImageView extends PorterImageView {

    /* renamed from: j */
    public Drawable f7224j;

    /* renamed from: k */
    public Matrix f7225k;

    /* renamed from: l */
    public Matrix f7226l;

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    /* renamed from: b */
    public void mo6634b(Canvas canvas, Paint paint, int i9, int i10) {
        Drawable drawable = this.f7224j;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                m6635c(getWidth(), getHeight());
                if (this.f7226l != null) {
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    canvas.concat(this.f7225k);
                    this.f7224j.draw(canvas);
                    canvas.restoreToCount(saveCount);
                    return;
                }
            }
            this.f7224j.setBounds(0, 0, getWidth(), getHeight());
            this.f7224j.draw(canvas);
        }
    }

    /* renamed from: c */
    public final void m6635c(int i9, int i10) {
        this.f7226l = null;
        int intrinsicWidth = this.f7224j.getIntrinsicWidth();
        int intrinsicHeight = this.f7224j.getIntrinsicHeight();
        boolean z9 = i9 == intrinsicWidth && i10 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z9) {
            return;
        }
        this.f7224j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float fMin = Math.min(i9 / intrinsicWidth, i10 / intrinsicHeight);
        this.f7225k.setScale(fMin, fMin);
        this.f7225k.postTranslate((int) (((r5 - (r0 * fMin)) * 0.5f) + 0.5f), (int) (((r6 - (r1 * fMin)) * 0.5f) + 0.5f));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f7224j = drawable;
        invalidate();
    }
}
