package com.xuexiang.xui.widget.button.shinebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes3.dex */
public class PorterShapeImageView extends PorterImageView {

    /* renamed from: j */
    public Drawable f4178j;

    /* renamed from: k */
    public final Matrix f4179k;

    public PorterShapeImageView(Context context) {
        this(context, null);
    }

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    /* renamed from: b */
    public final void mo3473b(Canvas canvas) {
        Drawable drawable = this.f4178j;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                int width = getWidth();
                int height = getHeight();
                int intrinsicWidth = this.f4178j.getIntrinsicWidth();
                int intrinsicHeight = this.f4178j.getIntrinsicHeight();
                boolean z8 = width == intrinsicWidth && height == intrinsicHeight;
                if (intrinsicWidth > 0 && intrinsicHeight > 0 && !z8) {
                    this.f4178j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    float fMin = Math.min(width / intrinsicWidth, height / intrinsicHeight);
                    this.f4179k.setScale(fMin, fMin);
                    this.f4179k.postTranslate((int) (((r0 - (r3 * fMin)) * 0.5f) + 0.5f), (int) (((r2 - (r4 * fMin)) * 0.5f) + 0.5f));
                }
            }
            this.f4178j.setBounds(0, 0, getWidth(), getHeight());
            this.f4178j.draw(canvas);
        }
    }

    public void setIconDrawable(Drawable drawable) {
        this.f4178j = drawable;
        invalidate();
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PorterShapeImageView, i, 0);
            getContext();
            this.f4178j = typedArrayObtainStyledAttributes.getDrawable(R$styleable.PorterShapeImageView_sb_icon_image);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4179k = new Matrix();
    }
}
