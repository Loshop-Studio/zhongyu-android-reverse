package com.xuexiang.xui.widget.button.shinebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;

/* loaded from: classes5.dex */
public class PorterShapeImageView extends PorterImageView {

    /* renamed from: l */
    public Drawable f15669l;

    /* renamed from: m */
    public Matrix f15670m;

    /* renamed from: n */
    public Matrix f15671n;

    public PorterShapeImageView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m12484e(Context context, AttributeSet attributeSet, int i10) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PorterShapeImageView, i10, 0);
            this.f15669l = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.PorterShapeImageView_sb_icon_image);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15670m = new Matrix();
    }

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    /* renamed from: c */
    public void mo12483c(Canvas canvas, Paint paint, int i10, int i11) {
        Drawable drawable = this.f15669l;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                m12485d(getWidth(), getHeight());
                if (this.f15671n != null) {
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    canvas.concat(this.f15670m);
                    this.f15669l.draw(canvas);
                    canvas.restoreToCount(saveCount);
                    return;
                }
            }
            this.f15669l.setBounds(0, 0, getWidth(), getHeight());
            this.f15669l.draw(canvas);
        }
    }

    /* renamed from: d */
    public final void m12485d(int i10, int i11) {
        this.f15671n = null;
        int intrinsicWidth = this.f15669l.getIntrinsicWidth();
        int intrinsicHeight = this.f15669l.getIntrinsicHeight();
        boolean z10 = i10 == intrinsicWidth && i11 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z10) {
            return;
        }
        this.f15669l.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float fMin = Math.min(i10 / intrinsicWidth, i11 / intrinsicHeight);
        this.f15670m.setScale(fMin, fMin);
        this.f15670m.postTranslate((int) (((r5 - (r0 * fMin)) * 0.5f) + 0.5f), (int) (((r6 - (r1 * fMin)) * 0.5f) + 0.5f));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f15669l = drawable;
        invalidate();
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12484e(context, attributeSet, i10);
    }
}
