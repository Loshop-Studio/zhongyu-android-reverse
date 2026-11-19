package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class ShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f3289g;

    /* renamed from: h */
    public Paint f3290h;

    /* renamed from: i */
    public int f3291i;

    public int getPressedColor() {
        return this.f3291i;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3273d == 0) {
            int i4 = this.f3270a;
            canvas.drawCircle(i4 / 2.0f, this.f3271b / 2.0f, i4 / 2.1038f, this.f3290h);
        } else {
            RectF rectF = this.f3275f;
            int i5 = this.f3274e;
            canvas.drawRoundRect(rectF, i5, i5, this.f3290h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3290h.setAlpha(this.f3289g);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f3290h.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i4) {
        this.f3290h.setColor(this.f3291i);
        invalidate();
    }
}
