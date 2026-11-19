package com.xuexiang.xui.widget.button.shinebutton;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class PorterShapeImageView extends PorterImageView {

    /* renamed from: j */
    public Drawable f3309j;

    /* renamed from: k */
    public Matrix f3310k;

    /* renamed from: l */
    public Matrix f3311l;

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    /* renamed from: b */
    public void mo4224b(Canvas canvas, Paint paint, int i4, int i5) {
        Drawable drawable = this.f3309j;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                m4225c(getWidth(), getHeight());
                if (this.f3311l != null) {
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    canvas.concat(this.f3310k);
                    this.f3309j.draw(canvas);
                    canvas.restoreToCount(saveCount);
                    return;
                }
            }
            this.f3309j.setBounds(0, 0, getWidth(), getHeight());
            this.f3309j.draw(canvas);
        }
    }

    /* renamed from: c */
    public final void m4225c(int i4, int i5) {
        this.f3311l = null;
        int intrinsicWidth = this.f3309j.getIntrinsicWidth();
        int intrinsicHeight = this.f3309j.getIntrinsicHeight();
        boolean z3 = i4 == intrinsicWidth && i5 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z3) {
            return;
        }
        this.f3309j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float fMin = Math.min(i4 / intrinsicWidth, i5 / intrinsicHeight);
        this.f3310k.setScale(fMin, fMin);
        this.f3310k.postTranslate((int) (((r5 - (r0 * fMin)) * 0.5f) + 0.5f), (int) (((r6 - (r1 * fMin)) * 0.5f) + 0.5f));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f3309j = drawable;
        invalidate();
    }
}
