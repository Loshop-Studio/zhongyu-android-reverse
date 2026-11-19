package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.luck.picture.lib.R$styleable;

/* loaded from: classes5.dex */
public class MediumBoldTextView extends AppCompatTextView {

    /* renamed from: d */
    public float f12619d;

    public MediumBoldTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        float strokeWidth = paint.getStrokeWidth();
        float f10 = this.f12619d;
        if (strokeWidth != f10) {
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        super.onDraw(canvas);
    }

    public void setStrokeWidth(float f10) {
        this.f12619d = f10;
        invalidate();
    }

    public MediumBoldTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediumBoldTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12619d = 0.6f;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PictureMediumBoldTextView, i10, 0);
        this.f12619d = typedArrayObtainStyledAttributes.getFloat(R$styleable.PictureMediumBoldTextView_stroke_Width, this.f12619d);
        typedArrayObtainStyledAttributes.recycle();
    }
}
