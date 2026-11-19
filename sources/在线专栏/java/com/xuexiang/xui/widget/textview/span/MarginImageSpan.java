package com.xuexiang.xui.widget.textview.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class MarginImageSpan extends AlignMiddleImageSpan {
    private int mOffsetY;
    private int mSpanMarginLeft;
    private int mSpanMarginRight;

    public MarginImageSpan(Drawable drawable, int i4, int i5, int i6) {
        super(drawable, i4);
        this.mOffsetY = 0;
        this.mSpanMarginLeft = i5;
        this.mSpanMarginRight = i6;
    }

    @Override // com.xuexiang.xui.widget.textview.span.AlignMiddleImageSpan, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, Paint paint) {
        canvas.save();
        canvas.translate(IGoodView.DEFAULT_TO_ALPHA, this.mOffsetY);
        super.draw(canvas, charSequence, i4, i5, f4 + this.mSpanMarginLeft, i6, i7, i8, paint);
        canvas.restore();
    }

    @Override // com.xuexiang.xui.widget.textview.span.AlignMiddleImageSpan, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        if (this.mSpanMarginLeft == 0 && this.mSpanMarginRight == 0) {
            return super.getSize(paint, charSequence, i4, i5, fontMetricsInt);
        }
        super.getSize(paint, charSequence, i4, i5, fontMetricsInt);
        return getDrawable().getIntrinsicWidth() + this.mSpanMarginLeft + this.mSpanMarginRight;
    }

    public MarginImageSpan(Drawable drawable, int i4, int i5, int i6, int i7) {
        this(drawable, i4, i5, i6);
        this.mOffsetY = i7;
    }
}
