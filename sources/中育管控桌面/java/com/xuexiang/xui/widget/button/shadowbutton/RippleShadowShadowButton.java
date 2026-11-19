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

/* loaded from: classes3.dex */
public class RippleShadowShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f4660g;

    /* renamed from: h */
    public int f4661h;

    /* renamed from: i */
    public int f4662i;

    /* renamed from: j */
    public int f4663j;

    /* renamed from: k */
    public float f4664k;

    /* renamed from: l */
    public float f4665l;

    /* renamed from: m */
    public Paint f4666m;

    /* renamed from: n */
    public RectF f4667n;

    /* renamed from: o */
    public Path f4668o;

    /* renamed from: p */
    public Timer f4669p;

    /* renamed from: q */
    public TimerTask f4670q;

    /* renamed from: r */
    public int f4671r;

    /* renamed from: com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton$a */
    public class C5875a extends TimerTask {
        public C5875a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RippleShadowShadowButton.this.postInvalidate();
        }
    }

    /* renamed from: b */
    public final void m4544b(Canvas canvas) {
        if (canvas == null || this.f4664k < 0.0f || this.f4665l < 0.0f) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f6 = this.f4664k;
        float fMax = Math.max(f6, Math.abs(width - f6));
        float f7 = this.f4665l;
        float fMax2 = Math.max(f7, Math.abs(height - f7));
        float fSqrt = (float) Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
        int i6 = this.f4663j;
        if (i6 > fSqrt) {
            m4545c();
            return;
        }
        this.f4663j = (int) (i6 + ((fSqrt / this.f4662i) * 35.0f));
        canvas.save();
        this.f4668o.reset();
        canvas.clipPath(this.f4668o);
        if (this.f4657d == 0) {
            this.f4668o.addCircle(width >> 1, height >> 1, this.f4654a >> 1, Path.Direction.CCW);
        } else {
            this.f4667n.set(0.0f, 0.0f, this.f4654a, this.f4655b);
            Path path = this.f4668o;
            RectF rectF = this.f4667n;
            int i7 = this.f4660g;
            path.addRoundRect(rectF, i7, i7, Path.Direction.CCW);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f4668o);
        } else {
            canvas.clipPath(this.f4668o, Region.Op.REPLACE);
        }
        canvas.drawCircle(this.f4664k, this.f4665l, this.f4663j, this.f4666m);
        canvas.restore();
    }

    /* renamed from: c */
    public final void m4545c() {
        if (this.f4669p != null) {
            TimerTask timerTask = this.f4670q;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f4669p.cancel();
        }
        this.f4663j = 0;
    }

    /* renamed from: d */
    public final void m4546d() {
        m4545c();
        this.f4670q = new C5875a();
        Timer timer = new Timer();
        this.f4669p = timer;
        timer.schedule(this.f4670q, 0L, 30L);
    }

    public int getRippleAlpha() {
        return this.f4671r;
    }

    public int getRippleColor() {
        return this.f4661h;
    }

    public int getRippleDuration() {
        return this.f4662i;
    }

    public int getRippleRadius() {
        return this.f4663j;
    }

    public int getRoundRadius() {
        return this.f4660g;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m4545c();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4666m == null) {
            return;
        }
        m4544b(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4664k = motionEvent.getX();
            this.f4665l = motionEvent.getY();
            m4546d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i6) {
        this.f4671r = i6;
    }

    public void setRippleColor(int i6) {
        this.f4661h = i6;
    }

    public void setRippleDuration(int i6) {
        this.f4662i = i6;
    }

    public void setRippleRadius(int i6) {
        this.f4663j = i6;
    }

    public void setRoundRadius(int i6) {
        this.f4660g = i6;
        invalidate();
    }
}
