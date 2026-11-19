package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class ShadowImageView extends AppCompatImageView {

    /* renamed from: a */
    public int f5952a;

    /* renamed from: b */
    public int f5953b;

    /* renamed from: c */
    public int f5954c;

    /* renamed from: d */
    public int f5955d;

    /* renamed from: e */
    public Paint f5956e;

    /* renamed from: f */
    public int f5957f;

    /* renamed from: g */
    public int f5958g;

    /* renamed from: h */
    public RectF f5959h;

    public int getPressedColor() {
        return this.f5955d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f5956e;
        if (paint == null) {
            return;
        }
        if (this.f5957f == 0) {
            int i10 = this.f5952a;
            canvas.drawCircle(i10 / 2.0f, this.f5953b / 2.0f, i10 / 2.1038f, paint);
        } else {
            RectF rectF = this.f5959h;
            int i11 = this.f5958g;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5952a = i10;
        this.f5953b = i11;
        this.f5959h = new RectF(0.0f, 0.0f, this.f5952a, this.f5953b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5956e.setAlpha(this.f5954c);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f5956e.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i10) {
        this.f5956e.setColor(this.f5955d);
        invalidate();
    }
}
