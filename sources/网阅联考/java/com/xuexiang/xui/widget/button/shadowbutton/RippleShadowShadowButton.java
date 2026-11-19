package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.MotionEvent;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class RippleShadowShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f3276g;

    /* renamed from: h */
    public int f3277h;

    /* renamed from: i */
    public int f3278i;

    /* renamed from: j */
    public int f3279j;

    /* renamed from: k */
    public float f3280k;

    /* renamed from: l */
    public float f3281l;

    /* renamed from: m */
    public Paint f3282m;

    /* renamed from: n */
    public RectF f3283n;

    /* renamed from: o */
    public Path f3284o;

    /* renamed from: p */
    public Timer f3285p;

    /* renamed from: q */
    public TimerTask f3286q;

    /* renamed from: r */
    public int f3287r;

    /* renamed from: com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton$a */
    public class C3546a extends TimerTask {
        public C3546a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RippleShadowShadowButton.this.postInvalidate();
        }
    }

    /* renamed from: b */
    public final void m4220b(Canvas canvas) {
        if (canvas == null || this.f3280k < 0.0f || this.f3281l < 0.0f) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f4 = this.f3280k;
        float fMax = Math.max(f4, Math.abs(width - f4));
        float f5 = this.f3281l;
        float fMax2 = Math.max(f5, Math.abs(height - f5));
        float fSqrt = (float) Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
        int i4 = this.f3279j;
        if (i4 > fSqrt) {
            m4221c();
            return;
        }
        this.f3279j = (int) (i4 + ((fSqrt / this.f3278i) * 35.0f));
        canvas.save();
        this.f3284o.reset();
        canvas.clipPath(this.f3284o);
        if (this.f3273d == 0) {
            this.f3284o.addCircle(width >> 1, height >> 1, this.f3270a >> 1, Path.Direction.CCW);
        } else {
            this.f3283n.set(0.0f, 0.0f, this.f3270a, this.f3271b);
            Path path = this.f3284o;
            RectF rectF = this.f3283n;
            int i5 = this.f3276g;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CCW);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f3284o);
        } else {
            canvas.clipPath(this.f3284o, Region.Op.REPLACE);
        }
        canvas.drawCircle(this.f3280k, this.f3281l, this.f3279j, this.f3282m);
        canvas.restore();
    }

    /* renamed from: c */
    public final void m4221c() {
        if (this.f3285p != null) {
            TimerTask timerTask = this.f3286q;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f3285p.cancel();
        }
        this.f3279j = 0;
    }

    /* renamed from: d */
    public final void m4222d() {
        m4221c();
        this.f3286q = new C3546a();
        Timer timer = new Timer();
        this.f3285p = timer;
        timer.schedule(this.f3286q, 0L, 30L);
    }

    public int getRippleAlpha() {
        return this.f3287r;
    }

    public int getRippleColor() {
        return this.f3277h;
    }

    public int getRippleDuration() {
        return this.f3278i;
    }

    public int getRippleRadius() {
        return this.f3279j;
    }

    public int getRoundRadius() {
        return this.f3276g;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m4221c();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3282m == null) {
            return;
        }
        m4220b(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3280k = motionEvent.getX();
            this.f3281l = motionEvent.getY();
            m4222d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i4) {
        this.f3287r = i4;
    }

    public void setRippleColor(int i4) {
        this.f3277h = i4;
    }

    public void setRippleDuration(int i4) {
        this.f3278i = i4;
    }

    public void setRippleRadius(int i4) {
        this.f3279j = i4;
    }

    public void setRoundRadius(int i4) {
        this.f3276g = i4;
        invalidate();
    }
}
