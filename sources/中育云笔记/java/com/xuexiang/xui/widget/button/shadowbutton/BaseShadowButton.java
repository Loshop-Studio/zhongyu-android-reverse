package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes5.dex */
public class BaseShadowButton extends AppCompatButton {

    /* renamed from: c */
    public int f15630c;

    /* renamed from: d */
    public int f15631d;

    /* renamed from: e */
    public Paint f15632e;

    /* renamed from: f */
    public int f15633f;

    /* renamed from: g */
    public int f15634g;

    /* renamed from: h */
    public RectF f15635h;

    public BaseShadowButton(Context context) {
        super(context);
        init(context, null);
    }

    /* renamed from: a */
    public void m12477a(int i10) {
        if (i10 != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.f15634g;
    }

    public int getShapeType() {
        return this.f15633f;
    }

    public void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f15633f = typedArrayObtainStyledAttributes.getInt(R$styleable.ShadowButton_sb_shape_type, 1);
        this.f15634g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(R$dimen.default_shadow_button_radius));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_color_unpressed, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f15632e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f15632e.setAlpha(Color.alpha(color));
        this.f15632e.setColor(color);
        this.f15632e.setAntiAlias(true);
        setWillNotDraw(false);
        setDrawingCacheEnabled(true);
        setClickable(true);
        m12477a(color);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = this.f15632e;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f15633f == 0) {
            int i10 = this.f15630c;
            canvas.drawCircle(i10 / 2.0f, this.f15631d / 2.0f, i10 / 2.0f, paint);
        } else {
            RectF rectF = this.f15635h;
            int i11 = this.f15634g;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f15630c = i10;
        this.f15631d = i11;
        this.f15635h = new RectF(0.0f, 0.0f, this.f15630c, this.f15631d);
    }

    public void setRadius(int i10) {
        this.f15634g = i10;
        invalidate();
    }

    public void setShapeType(int i10) {
        this.f15633f = i10;
        invalidate();
    }

    public void setUnpressedColor(int i10) {
        this.f15632e.setAlpha(Color.alpha(i10));
        this.f15632e.setColor(i10);
        m12477a(i10);
        invalidate();
    }

    public BaseShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public BaseShadowButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context, attributeSet);
    }
}
