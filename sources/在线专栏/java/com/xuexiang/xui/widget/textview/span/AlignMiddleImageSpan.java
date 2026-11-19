package com.xuexiang.xui.widget.textview.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class AlignMiddleImageSpan extends ImageSpan {
    public static final int ALIGN_MIDDLE = -100;
    private boolean mAvoidSuperChangeFontMetrics;
    private float mFontWidthMultiple;
    private int mWidth;

    public AlignMiddleImageSpan(Drawable drawable, int i4) {
        super(drawable, i4);
        this.mFontWidthMultiple = -1.0f;
        this.mAvoidSuperChangeFontMetrics = false;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, Paint paint) {
        if (((ImageSpan) this).mVerticalAlignment != -100) {
            super.draw(canvas, charSequence, i4, i5, f4, i6, i7, i8, paint);
            return;
        }
        Drawable drawable = getDrawable();
        canvas.save();
        int i9 = paint.getFontMetricsInt().top;
        canvas.translate(f4, i7 + i9 + (((r5.bottom - i9) - (drawable.getBounds().bottom - drawable.getBounds().top)) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        if (this.mAvoidSuperChangeFontMetrics) {
            this.mWidth = getDrawable().getBounds().right;
        } else {
            this.mWidth = super.getSize(paint, charSequence, i4, i5, fontMetricsInt);
        }
        if (this.mFontWidthMultiple > IGoodView.DEFAULT_TO_ALPHA) {
            this.mWidth = (int) (paint.measureText("子") * this.mFontWidthMultiple);
        }
        return this.mWidth;
    }

    public void setAvoidSuperChangeFontMetrics(boolean z3) {
        this.mAvoidSuperChangeFontMetrics = z3;
    }

    public AlignMiddleImageSpan(Drawable drawable, int i4, float f4) {
        this(drawable, i4);
        if (f4 >= IGoodView.DEFAULT_TO_ALPHA) {
            this.mFontWidthMultiple = f4;
        }
    }
}
