package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public class RippleShadowShadowButton extends BaseShadowButton {

    /* renamed from: i */
    public int f15636i;

    /* renamed from: j */
    public int f15637j;

    /* renamed from: k */
    public int f15638k;

    /* renamed from: l */
    public int f15639l;

    /* renamed from: m */
    public float f15640m;

    /* renamed from: n */
    public float f15641n;

    /* renamed from: o */
    public Paint f15642o;

    /* renamed from: p */
    public RectF f15643p;

    /* renamed from: q */
    public Path f15644q;

    /* renamed from: r */
    public Timer f15645r;

    /* renamed from: s */
    public TimerTask f15646s;

    /* renamed from: t */
    public int f15647t;

    /* renamed from: com.xuexiang.xui.widget.button.shadowbutton.RippleShadowShadowButton$a */
    public class C8083a extends TimerTask {
        public C8083a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RippleShadowShadowButton.this.postInvalidate();
        }
    }

    public RippleShadowShadowButton(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void m12478b(Canvas canvas) {
        if (canvas == null || this.f15640m < 0.0f || this.f15641n < 0.0f) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f10 = this.f15640m;
        float fMax = Math.max(f10, Math.abs(width - f10));
        float f11 = this.f15641n;
        float fMax2 = Math.max(f11, Math.abs(height - f11));
        float fSqrt = (float) Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
        int i10 = this.f15639l;
        if (i10 > fSqrt) {
            m12479c();
            return;
        }
        this.f15639l = (int) (i10 + ((fSqrt / this.f15638k) * 35.0f));
        canvas.save();
        this.f15644q.reset();
        canvas.clipPath(this.f15644q);
        if (this.f15633f == 0) {
            this.f15644q.addCircle(width >> 1, height >> 1, this.f15630c >> 1, Path.Direction.CCW);
        } else {
            this.f15643p.set(0.0f, 0.0f, this.f15630c, this.f15631d);
            Path path = this.f15644q;
            RectF rectF = this.f15643p;
            int i11 = this.f15636i;
            path.addRoundRect(rectF, i11, i11, Path.Direction.CCW);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f15644q);
        } else {
            canvas.clipPath(this.f15644q, Region.Op.REPLACE);
        }
        canvas.drawCircle(this.f15640m, this.f15641n, this.f15639l, this.f15642o);
        canvas.restore();
    }

    /* renamed from: c */
    public final void m12479c() {
        if (this.f15645r != null) {
            TimerTask timerTask = this.f15646s;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f15645r.cancel();
        }
        this.f15639l = 0;
    }

    /* renamed from: d */
    public final void m12480d() {
        m12479c();
        this.f15646s = new C8083a();
        Timer timer = new Timer();
        this.f15645r = timer;
        timer.schedule(this.f15646s, 0L, 30L);
    }

    public int getRippleAlpha() {
        return this.f15647t;
    }

    public int getRippleColor() {
        return this.f15637j;
    }

    public int getRippleDuration() {
        return this.f15638k;
    }

    public int getRippleRadius() {
        return this.f15639l;
    }

    public int getRoundRadius() {
        return this.f15636i;
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton
    public void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f15637j = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_ripple_color, getResources().getColor(R$color.default_shadow_button_ripple_color));
        this.f15647t = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_ripple_alpha, 47);
        this.f15638k = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_ripple_duration, 1000);
        this.f15633f = typedArrayObtainStyledAttributes.getInt(R$styleable.ShadowButton_sb_shape_type, 1);
        this.f15636i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(R$dimen.default_shadow_button_radius));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f15642o = paint;
        paint.setColor(this.f15637j);
        this.f15642o.setAlpha(this.f15647t);
        this.f15642o.setStyle(Paint.Style.FILL);
        this.f15642o.setAntiAlias(true);
        this.f15644q = new Path();
        this.f15643p = new RectF();
        this.f15640m = -1.0f;
        this.f15641n = -1.0f;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m12479c();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15642o == null) {
            return;
        }
        m12478b(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15640m = motionEvent.getX();
            this.f15641n = motionEvent.getY();
            m12480d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i10) {
        this.f15647t = i10;
    }

    public void setRippleColor(int i10) {
        this.f15637j = i10;
    }

    public void setRippleDuration(int i10) {
        this.f15638k = i10;
    }

    public void setRippleRadius(int i10) {
        this.f15639l = i10;
    }

    public void setRoundRadius(int i10) {
        this.f15636i = i10;
        invalidate();
    }

    public RippleShadowShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public RippleShadowShadowButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
