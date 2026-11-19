package com.xuexiang.xui.widget.button.shinebutton;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public class PorterShapeImageView extends PorterImageView {

    /* renamed from: j */
    public Drawable f7294j;

    /* renamed from: k */
    public Matrix f7295k;

    /* renamed from: l */
    public Matrix f7296l;

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    /* renamed from: b */
    public void mo6659b(Canvas canvas, Paint paint, int i10, int i11) {
        Drawable drawable = this.f7294j;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                m6660c(getWidth(), getHeight());
                if (this.f7296l != null) {
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    canvas.concat(this.f7295k);
                    this.f7294j.draw(canvas);
                    canvas.restoreToCount(saveCount);
                    return;
                }
            }
            this.f7294j.setBounds(0, 0, getWidth(), getHeight());
            this.f7294j.draw(canvas);
        }
    }

    /* renamed from: c */
    public final void m6660c(int i10, int i11) {
        this.f7296l = null;
        int intrinsicWidth = this.f7294j.getIntrinsicWidth();
        int intrinsicHeight = this.f7294j.getIntrinsicHeight();
        boolean z10 = i10 == intrinsicWidth && i11 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z10) {
            return;
        }
        this.f7294j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float fMin = Math.min(i10 / intrinsicWidth, i11 / intrinsicHeight);
        this.f7295k.setScale(fMin, fMin);
        this.f7295k.postTranslate((int) (((r5 - (r0 * fMin)) * 0.5f) + 0.5f), (int) (((r6 - (r1 * fMin)) * 0.5f) + 0.5f));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f7294j = drawable;
        invalidate();
    }
}
