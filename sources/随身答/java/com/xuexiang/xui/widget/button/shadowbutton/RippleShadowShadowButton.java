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
    public int f7191g;

    /* renamed from: h */
    public int f7192h;

    /* renamed from: i */
    public int f7193i;

    /* renamed from: j */
    public int f7194j;

    /* renamed from: k */
    public float f7195k;

    /* renamed from: l */
    public float f7196l;

    /* renamed from: m */
    public Paint f7197m;

    /* renamed from: n */
    public RectF f7198n;

    /* renamed from: o */
    public Path f7199o;

    /* renamed from: p */
    public Timer f7200p;

    /* renamed from: q */
    public TimerTask f7201q;

    /* renamed from: r */
    public int f7202r;

    /* renamed from: com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton$a */
    public class C6816a extends TimerTask {
        public C6816a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RippleShadowShadowButton.this.postInvalidate();
        }
    }

    /* renamed from: b */
    public final void m6630b(Canvas canvas) {
        if (canvas == null || this.f7195k < 0.0f || this.f7196l < 0.0f) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f10 = this.f7195k;
        float fMax = Math.max(f10, Math.abs(width - f10));
        float f11 = this.f7196l;
        float fMax2 = Math.max(f11, Math.abs(height - f11));
        float fSqrt = (float) Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
        int i9 = this.f7194j;
        if (i9 > fSqrt) {
            m6631c();
            return;
        }
        this.f7194j = (int) (i9 + ((fSqrt / this.f7193i) * 35.0f));
        canvas.save();
        this.f7199o.reset();
        canvas.clipPath(this.f7199o);
        if (this.f7188d == 0) {
            this.f7199o.addCircle(width >> 1, height >> 1, this.f7185a >> 1, Path.Direction.CCW);
        } else {
            this.f7198n.set(0.0f, 0.0f, this.f7185a, this.f7186b);
            Path path = this.f7199o;
            RectF rectF = this.f7198n;
            int i10 = this.f7191g;
            path.addRoundRect(rectF, i10, i10, Path.Direction.CCW);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f7199o);
        } else {
            canvas.clipPath(this.f7199o, Region.Op.REPLACE);
        }
        canvas.drawCircle(this.f7195k, this.f7196l, this.f7194j, this.f7197m);
        canvas.restore();
    }

    /* renamed from: c */
    public final void m6631c() {
        if (this.f7200p != null) {
            TimerTask timerTask = this.f7201q;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f7200p.cancel();
        }
        this.f7194j = 0;
    }

    /* renamed from: d */
    public final void m6632d() {
        m6631c();
        this.f7201q = new C6816a();
        Timer timer = new Timer();
        this.f7200p = timer;
        timer.schedule(this.f7201q, 0L, 30L);
    }

    public int getRippleAlpha() {
        return this.f7202r;
    }

    public int getRippleColor() {
        return this.f7192h;
    }

    public int getRippleDuration() {
        return this.f7193i;
    }

    public int getRippleRadius() {
        return this.f7194j;
    }

    public int getRoundRadius() {
        return this.f7191g;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m6631c();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7197m == null) {
            return;
        }
        m6630b(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7195k = motionEvent.getX();
            this.f7196l = motionEvent.getY();
            m6632d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i9) {
        this.f7202r = i9;
    }

    public void setRippleColor(int i9) {
        this.f7192h = i9;
    }

    public void setRippleDuration(int i9) {
        this.f7193i = i9;
    }

    public void setRippleRadius(int i9) {
        this.f7194j = i9;
    }

    public void setRoundRadius(int i9) {
        this.f7191g = i9;
        invalidate();
    }
}
