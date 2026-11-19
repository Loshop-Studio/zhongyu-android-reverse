package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class ShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f7274g;

    /* renamed from: h */
    public Paint f7275h;

    /* renamed from: i */
    public int f7276i;

    public int getPressedColor() {
        return this.f7276i;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7258d == 0) {
            int i10 = this.f7255a;
            canvas.drawCircle(i10 / 2.0f, this.f7256b / 2.0f, i10 / 2.1038f, this.f7275h);
        } else {
            RectF rectF = this.f7260f;
            int i11 = this.f7259e;
            canvas.drawRoundRect(rectF, i11, i11, this.f7275h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7275h.setAlpha(this.f7274g);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f7275h.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i10) {
        this.f7275h.setColor(this.f7276i);
        invalidate();
    }
}
