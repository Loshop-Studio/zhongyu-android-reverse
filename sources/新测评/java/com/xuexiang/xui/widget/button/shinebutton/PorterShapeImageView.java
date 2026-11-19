package com.xuexiang.xui.widget.button.shinebutton;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public class PorterShapeImageView extends PorterImageView {

    /* renamed from: j */
    public Drawable f5969j;

    /* renamed from: k */
    public Matrix f5970k;

    /* renamed from: l */
    public Matrix f5971l;

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    /* renamed from: b */
    public void mo5538b(Canvas canvas, Paint paint, int i10, int i11) {
        Drawable drawable = this.f5969j;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                m5539c(getWidth(), getHeight());
                if (this.f5971l != null) {
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    canvas.concat(this.f5970k);
                    this.f5969j.draw(canvas);
                    canvas.restoreToCount(saveCount);
                    return;
                }
            }
            this.f5969j.setBounds(0, 0, getWidth(), getHeight());
            this.f5969j.draw(canvas);
        }
    }

    /* renamed from: c */
    public final void m5539c(int i10, int i11) {
        this.f5971l = null;
        int intrinsicWidth = this.f5969j.getIntrinsicWidth();
        int intrinsicHeight = this.f5969j.getIntrinsicHeight();
        boolean z9 = i10 == intrinsicWidth && i11 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z9) {
            return;
        }
        this.f5969j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float fMin = Math.min(i10 / intrinsicWidth, i11 / intrinsicHeight);
        this.f5970k.setScale(fMin, fMin);
        this.f5970k.postTranslate((int) (((r5 - (r0 * fMin)) * 0.5f) + 0.5f), (int) (((r6 - (r1 * fMin)) * 0.5f) + 0.5f));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f5969j = drawable;
        invalidate();
    }
}
