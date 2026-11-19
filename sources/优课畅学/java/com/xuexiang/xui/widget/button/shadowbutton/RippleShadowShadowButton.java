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

/* loaded from: classes4.dex */
public class RippleShadowShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f7261g;

    /* renamed from: h */
    public int f7262h;

    /* renamed from: i */
    public int f7263i;

    /* renamed from: j */
    public int f7264j;

    /* renamed from: k */
    public float f7265k;

    /* renamed from: l */
    public float f7266l;

    /* renamed from: m */
    public Paint f7267m;

    /* renamed from: n */
    public RectF f7268n;

    /* renamed from: o */
    public Path f7269o;

    /* renamed from: p */
    public Timer f7270p;

    /* renamed from: q */
    public TimerTask f7271q;

    /* renamed from: r */
    public int f7272r;

    /* renamed from: com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton$a */
    public class C6896a extends TimerTask {
        public C6896a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RippleShadowShadowButton.this.postInvalidate();
        }
    }

    /* renamed from: b */
    public final void m6655b(Canvas canvas) {
        if (canvas == null || this.f7265k < 0.0f || this.f7266l < 0.0f) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f10 = this.f7265k;
        float fMax = Math.max(f10, Math.abs(width - f10));
        float f11 = this.f7266l;
        float fMax2 = Math.max(f11, Math.abs(height - f11));
        float fSqrt = (float) Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
        int i10 = this.f7264j;
        if (i10 > fSqrt) {
            m6656c();
            return;
        }
        this.f7264j = (int) (i10 + ((fSqrt / this.f7263i) * 35.0f));
        canvas.save();
        this.f7269o.reset();
        canvas.clipPath(this.f7269o);
        if (this.f7258d == 0) {
            this.f7269o.addCircle(width >> 1, height >> 1, this.f7255a >> 1, Path.Direction.CCW);
        } else {
            this.f7268n.set(0.0f, 0.0f, this.f7255a, this.f7256b);
            Path path = this.f7269o;
            RectF rectF = this.f7268n;
            int i11 = this.f7261g;
            path.addRoundRect(rectF, i11, i11, Path.Direction.CCW);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f7269o);
        } else {
            canvas.clipPath(this.f7269o, Region.Op.REPLACE);
        }
        canvas.drawCircle(this.f7265k, this.f7266l, this.f7264j, this.f7267m);
        canvas.restore();
    }

    /* renamed from: c */
    public final void m6656c() {
        if (this.f7270p != null) {
            TimerTask timerTask = this.f7271q;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f7270p.cancel();
        }
        this.f7264j = 0;
    }

    /* renamed from: d */
    public final void m6657d() {
        m6656c();
        this.f7271q = new C6896a();
        Timer timer = new Timer();
        this.f7270p = timer;
        timer.schedule(this.f7271q, 0L, 30L);
    }

    public int getRippleAlpha() {
        return this.f7272r;
    }

    public int getRippleColor() {
        return this.f7262h;
    }

    public int getRippleDuration() {
        return this.f7263i;
    }

    public int getRippleRadius() {
        return this.f7264j;
    }

    public int getRoundRadius() {
        return this.f7261g;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m6656c();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7267m == null) {
            return;
        }
        m6655b(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7265k = motionEvent.getX();
            this.f7266l = motionEvent.getY();
            m6657d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i10) {
        this.f7272r = i10;
    }

    public void setRippleColor(int i10) {
        this.f7262h = i10;
    }

    public void setRippleDuration(int i10) {
        this.f7263i = i10;
    }

    public void setRippleRadius(int i10) {
        this.f7264j = i10;
    }

    public void setRoundRadius(int i10) {
        this.f7261g = i10;
        invalidate();
    }
}
