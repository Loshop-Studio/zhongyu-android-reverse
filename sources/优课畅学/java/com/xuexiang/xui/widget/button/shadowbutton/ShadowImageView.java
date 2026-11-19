package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class ShadowImageView extends AppCompatImageView {

    /* renamed from: a */
    public int f7277a;

    /* renamed from: b */
    public int f7278b;

    /* renamed from: c */
    public int f7279c;

    /* renamed from: d */
    public int f7280d;

    /* renamed from: e */
    public Paint f7281e;

    /* renamed from: f */
    public int f7282f;

    /* renamed from: g */
    public int f7283g;

    /* renamed from: h */
    public RectF f7284h;

    public int getPressedColor() {
        return this.f7280d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f7281e;
        if (paint == null) {
            return;
        }
        if (this.f7282f == 0) {
            int i10 = this.f7277a;
            canvas.drawCircle(i10 / 2.0f, this.f7278b / 2.0f, i10 / 2.1038f, paint);
        } else {
            RectF rectF = this.f7284h;
            int i11 = this.f7283g;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7277a = i10;
        this.f7278b = i11;
        this.f7284h = new RectF(0.0f, 0.0f, this.f7277a, this.f7278b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7281e.setAlpha(this.f7279c);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f7281e.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i10) {
        this.f7281e.setColor(this.f7280d);
        invalidate();
    }
}
