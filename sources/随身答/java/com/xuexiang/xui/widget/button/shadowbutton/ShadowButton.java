package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class ShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f7204g;

    /* renamed from: h */
    public Paint f7205h;

    /* renamed from: i */
    public int f7206i;

    public int getPressedColor() {
        return this.f7206i;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7188d == 0) {
            int i9 = this.f7185a;
            canvas.drawCircle(i9 / 2.0f, this.f7186b / 2.0f, i9 / 2.1038f, this.f7205h);
        } else {
            RectF rectF = this.f7190f;
            int i10 = this.f7189e;
            canvas.drawRoundRect(rectF, i10, i10, this.f7205h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7205h.setAlpha(this.f7204g);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f7205h.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i9) {
        this.f7205h.setColor(this.f7206i);
        invalidate();
    }
}
