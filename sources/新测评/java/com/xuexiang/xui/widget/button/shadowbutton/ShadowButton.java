package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class ShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f5949g;

    /* renamed from: h */
    public Paint f5950h;

    /* renamed from: i */
    public int f5951i;

    public int getPressedColor() {
        return this.f5951i;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5933d == 0) {
            int i10 = this.f5930a;
            canvas.drawCircle(i10 / 2.0f, this.f5931b / 2.0f, i10 / 2.1038f, this.f5950h);
        } else {
            RectF rectF = this.f5935f;
            int i11 = this.f5934e;
            canvas.drawRoundRect(rectF, i11, i11, this.f5950h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5950h.setAlpha(this.f5949g);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f5950h.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i10) {
        this.f5950h.setColor(this.f5951i);
        invalidate();
    }
}
