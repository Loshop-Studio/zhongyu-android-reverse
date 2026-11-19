package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public class ShadowImageView extends AppCompatImageView {

    /* renamed from: a */
    public int f3292a;

    /* renamed from: b */
    public int f3293b;

    /* renamed from: c */
    public int f3294c;

    /* renamed from: d */
    public int f3295d;

    /* renamed from: e */
    public Paint f3296e;

    /* renamed from: f */
    public int f3297f;

    /* renamed from: g */
    public int f3298g;

    /* renamed from: h */
    public RectF f3299h;

    public int getPressedColor() {
        return this.f3295d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f3296e;
        if (paint == null) {
            return;
        }
        if (this.f3297f == 0) {
            int i4 = this.f3292a;
            canvas.drawCircle(i4 / 2.0f, this.f3293b / 2.0f, i4 / 2.1038f, paint);
        } else {
            RectF rectF = this.f3299h;
            int i5 = this.f3298g;
            canvas.drawRoundRect(rectF, i5, i5, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f3292a = i4;
        this.f3293b = i5;
        this.f3299h = new RectF(0.0f, 0.0f, this.f3292a, this.f3293b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3296e.setAlpha(this.f3294c);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f3296e.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i4) {
        this.f3296e.setColor(this.f3295d);
        invalidate();
    }
}
