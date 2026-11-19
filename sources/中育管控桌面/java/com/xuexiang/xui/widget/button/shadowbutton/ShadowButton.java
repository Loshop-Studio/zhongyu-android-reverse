package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public class ShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f4673g;

    /* renamed from: h */
    public Paint f4674h;

    /* renamed from: i */
    public int f4675i;

    public int getPressedColor() {
        return this.f4675i;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4657d == 0) {
            int i6 = this.f4654a;
            canvas.drawCircle(i6 / 2.0f, this.f4655b / 2.0f, i6 / 2.1038f, this.f4674h);
        } else {
            RectF rectF = this.f4659f;
            int i7 = this.f4658e;
            canvas.drawRoundRect(rectF, i7, i7, this.f4674h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4674h.setAlpha(this.f4673g);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f4674h.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i6) {
        this.f4674h.setColor(this.f4675i);
        invalidate();
    }
}
