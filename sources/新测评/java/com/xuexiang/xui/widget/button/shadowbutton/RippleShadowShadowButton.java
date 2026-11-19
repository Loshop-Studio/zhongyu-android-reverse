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
    public int f5936g;

    /* renamed from: h */
    public int f5937h;

    /* renamed from: i */
    public int f5938i;

    /* renamed from: j */
    public int f5939j;

    /* renamed from: k */
    public float f5940k;

    /* renamed from: l */
    public float f5941l;

    /* renamed from: m */
    public Paint f5942m;

    /* renamed from: n */
    public RectF f5943n;

    /* renamed from: o */
    public Path f5944o;

    /* renamed from: p */
    public Timer f5945p;

    /* renamed from: q */
    public TimerTask f5946q;

    /* renamed from: r */
    public int f5947r;

    /* renamed from: com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton$a */
    public class C6497a extends TimerTask {
        public C6497a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RippleShadowShadowButton.this.postInvalidate();
        }
    }

    /* renamed from: b */
    public final void m5534b(Canvas canvas) {
        if (canvas == null || this.f5940k < 0.0f || this.f5941l < 0.0f) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f10 = this.f5940k;
        float fMax = Math.max(f10, Math.abs(width - f10));
        float f11 = this.f5941l;
        float fMax2 = Math.max(f11, Math.abs(height - f11));
        float fSqrt = (float) Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
        int i10 = this.f5939j;
        if (i10 > fSqrt) {
            m5535c();
            return;
        }
        this.f5939j = (int) (i10 + ((fSqrt / this.f5938i) * 35.0f));
        canvas.save();
        this.f5944o.reset();
        canvas.clipPath(this.f5944o);
        if (this.f5933d == 0) {
            this.f5944o.addCircle(width >> 1, height >> 1, this.f5930a >> 1, Path.Direction.CCW);
        } else {
            this.f5943n.set(0.0f, 0.0f, this.f5930a, this.f5931b);
            Path path = this.f5944o;
            RectF rectF = this.f5943n;
            int i11 = this.f5936g;
            path.addRoundRect(rectF, i11, i11, Path.Direction.CCW);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f5944o);
        } else {
            canvas.clipPath(this.f5944o, Region.Op.REPLACE);
        }
        canvas.drawCircle(this.f5940k, this.f5941l, this.f5939j, this.f5942m);
        canvas.restore();
    }

    /* renamed from: c */
    public final void m5535c() {
        if (this.f5945p != null) {
            TimerTask timerTask = this.f5946q;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f5945p.cancel();
        }
        this.f5939j = 0;
    }

    /* renamed from: d */
    public final void m5536d() {
        m5535c();
        this.f5946q = new C6497a();
        Timer timer = new Timer();
        this.f5945p = timer;
        timer.schedule(this.f5946q, 0L, 30L);
    }

    public int getRippleAlpha() {
        return this.f5947r;
    }

    public int getRippleColor() {
        return this.f5937h;
    }

    public int getRippleDuration() {
        return this.f5938i;
    }

    public int getRippleRadius() {
        return this.f5939j;
    }

    public int getRoundRadius() {
        return this.f5936g;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m5535c();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5942m == null) {
            return;
        }
        m5534b(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5940k = motionEvent.getX();
            this.f5941l = motionEvent.getY();
            m5536d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i10) {
        this.f5947r = i10;
    }

    public void setRippleColor(int i10) {
        this.f5937h = i10;
    }

    public void setRippleDuration(int i10) {
        this.f5938i = i10;
    }

    public void setRippleRadius(int i10) {
        this.f5939j = i10;
    }

    public void setRoundRadius(int i10) {
        this.f5936g = i10;
        invalidate();
    }
}
