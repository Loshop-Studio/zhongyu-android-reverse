package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes5.dex */
public class ShadowButton extends BaseShadowButton {

    /* renamed from: i */
    public int f15649i;

    /* renamed from: j */
    public Paint f15650j;

    /* renamed from: k */
    public int f15651k;

    public ShadowButton(Context context) {
        super(context);
        this.f15649i = 48;
    }

    public int getPressedColor() {
        return this.f15651k;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton
    public void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f15649i = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_alpha_pressed, this.f15649i);
        this.f15651k = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_color_pressed, getResources().getColor(R$color.default_shadow_button_color_pressed));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f15650j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f15650j.setColor(this.f15651k);
        this.f15650j.setAlpha(0);
        this.f15650j.setAntiAlias(true);
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15633f == 0) {
            int i10 = this.f15630c;
            canvas.drawCircle(i10 / 2.0f, this.f15631d / 2.0f, i10 / 2.1038f, this.f15650j);
        } else {
            RectF rectF = this.f15635h;
            int i11 = this.f15634g;
            canvas.drawRoundRect(rectF, i11, i11, this.f15650j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15650j.setAlpha(this.f15649i);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f15650j.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i10) {
        this.f15650j.setColor(this.f15651k);
        invalidate();
    }

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15649i = 48;
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15649i = 48;
    }
}
