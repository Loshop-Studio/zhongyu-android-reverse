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

/* loaded from: classes3.dex */
public class BaseShadowButton extends AppCompatButton {

    /* renamed from: a */
    public int f4140a;

    /* renamed from: b */
    public int f4141b;

    /* renamed from: c */
    public Paint f4142c;

    /* renamed from: d */
    public int f4143d;

    /* renamed from: e */
    public int f4144e;

    /* renamed from: f */
    public RectF f4145f;

    public BaseShadowButton(Context context) {
        super(context);
        mo3470a(context, null);
    }

    /* renamed from: a */
    public void mo3470a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f4143d = typedArrayObtainStyledAttributes.getInt(R$styleable.ShadowButton_sb_shape_type, 1);
        this.f4144e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(R$dimen.default_shadow_button_radius));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_color_unpressed, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f4142c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4142c.setAlpha(Color.alpha(color));
        this.f4142c.setColor(color);
        this.f4142c.setAntiAlias(true);
        setWillNotDraw(false);
        setDrawingCacheEnabled(true);
        setClickable(true);
        if (color != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.f4144e;
    }

    public int getShapeType() {
        return this.f4143d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = this.f4142c;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f4143d == 0) {
            int i = this.f4140a;
            canvas.drawCircle(i / 2.0f, this.f4141b / 2.0f, i / 2.0f, paint);
        } else {
            RectF rectF = this.f4145f;
            int i8 = this.f4144e;
            canvas.drawRoundRect(rectF, i8, i8, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f4140a = i;
        this.f4141b = i8;
        this.f4145f = new RectF(0.0f, 0.0f, this.f4140a, this.f4141b);
    }

    public void setRadius(int i) {
        this.f4144e = i;
        invalidate();
    }

    public void setShapeType(int i) {
        this.f4143d = i;
        invalidate();
    }

    public void setUnpressedColor(int i) {
        this.f4142c.setAlpha(Color.alpha(i));
        this.f4142c.setColor(i);
        if (i != 0) {
            setBackgroundColor(0);
        }
        invalidate();
    }

    public BaseShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3470a(context, attributeSet);
    }

    public BaseShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3470a(context, attributeSet);
    }
}
