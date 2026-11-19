package com.xuexiang.xui.widget.button.shinebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class PorterShapeImageView extends PorterImageView {
    private Matrix mDrawMatrix;
    private Drawable mIconDrawable;
    private Matrix mMatrix;

    public PorterShapeImageView(Context context) {
        this(context, null);
    }

    private void configureBitmapBounds(int i4, int i5) {
        this.mDrawMatrix = null;
        int intrinsicWidth = this.mIconDrawable.getIntrinsicWidth();
        int intrinsicHeight = this.mIconDrawable.getIntrinsicHeight();
        boolean z3 = i4 == intrinsicWidth && i5 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z3) {
            return;
        }
        this.mIconDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float fMin = Math.min(i4 / intrinsicWidth, i5 / intrinsicHeight);
        this.mMatrix.setScale(fMin, fMin);
        this.mMatrix.postTranslate((int) (((r5 - (r0 * fMin)) * 0.5f) + 0.5f), (int) (((r6 - (r1 * fMin)) * 0.5f) + 0.5f));
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.PorterShapeImageView, i4, 0);
            this.mIconDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.PorterShapeImageView_sb_icon_image);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mMatrix = new Matrix();
    }

    @Override // com.xuexiang.xui.widget.button.shinebutton.PorterImageView
    protected void paintMaskCanvas(Canvas canvas, Paint paint, int i4, int i5) {
        Drawable drawable = this.mIconDrawable;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                configureBitmapBounds(getWidth(), getHeight());
                if (this.mDrawMatrix != null) {
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    canvas.concat(this.mMatrix);
                    this.mIconDrawable.draw(canvas);
                    canvas.restoreToCount(saveCount);
                    return;
                }
            }
            this.mIconDrawable.setBounds(0, 0, getWidth(), getHeight());
            this.mIconDrawable.draw(canvas);
        }
    }

    public void setIconDrawable(Drawable drawable) {
        this.mIconDrawable = drawable;
        invalidate();
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initAttrs(context, attributeSet, i4);
    }
}
