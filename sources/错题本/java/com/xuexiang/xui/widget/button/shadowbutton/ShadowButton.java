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

/* loaded from: classes3.dex */
public class ShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f4158g;

    /* renamed from: h */
    public Paint f4159h;

    /* renamed from: i */
    public int f4160i;

    public ShadowButton(Context context) {
        super(context);
        this.f4158g = 48;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton
    /* renamed from: a */
    public final void mo3470a(Context context, AttributeSet attributeSet) {
        super.mo3470a(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f4158g = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_alpha_pressed, this.f4158g);
        this.f4160i = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_color_pressed, getResources().getColor(R$color.default_shadow_button_color_pressed));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f4159h = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4159h.setColor(this.f4160i);
        this.f4159h.setAlpha(0);
        this.f4159h.setAntiAlias(true);
    }

    public int getPressedColor() {
        return this.f4160i;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4143d == 0) {
            int i = this.f4140a;
            canvas.drawCircle(i / 2.0f, this.f4141b / 2.0f, i / 2.1038f, this.f4159h);
        } else {
            RectF rectF = this.f4145f;
            int i8 = this.f4144e;
            canvas.drawRoundRect(rectF, i8, i8, this.f4159h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4159h.setAlpha(this.f4158g);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f4159h.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i) {
        this.f4159h.setColor(this.f4160i);
        invalidate();
    }

    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4158g = 48;
    }

    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4158g = 48;
    }
}
