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
import p056f2.C5522a;

/* loaded from: classes3.dex */
public class RippleShadowShadowButton extends BaseShadowButton {

    /* renamed from: g */
    public int f4146g;

    /* renamed from: h */
    public int f4147h;

    /* renamed from: i */
    public int f4148i;

    /* renamed from: j */
    public int f4149j;

    /* renamed from: k */
    public float f4150k;

    /* renamed from: l */
    public float f4151l;

    /* renamed from: m */
    public Paint f4152m;

    /* renamed from: n */
    public RectF f4153n;

    /* renamed from: o */
    public Path f4154o;

    /* renamed from: p */
    public Timer f4155p;

    /* renamed from: q */
    public C5522a f4156q;

    /* renamed from: r */
    public int f4157r;

    public RippleShadowShadowButton(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton
    /* renamed from: a */
    public final void mo3470a(Context context, AttributeSet attributeSet) {
        super.mo3470a(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowButton);
        this.f4147h = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowButton_sb_ripple_color, getResources().getColor(R$color.default_shadow_button_ripple_color));
        this.f4157r = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_ripple_alpha, 47);
        this.f4148i = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShadowButton_sb_ripple_duration, 1000);
        this.f4143d = typedArrayObtainStyledAttributes.getInt(R$styleable.ShadowButton_sb_shape_type, 1);
        this.f4146g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowButton_sb_radius, getResources().getDimensionPixelSize(R$dimen.default_shadow_button_radius));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f4152m = paint;
        paint.setColor(this.f4147h);
        this.f4152m.setAlpha(this.f4157r);
        this.f4152m.setStyle(Paint.Style.FILL);
        this.f4152m.setAntiAlias(true);
        this.f4154o = new Path();
        this.f4153n = new RectF();
        this.f4150k = -1.0f;
        this.f4151l = -1.0f;
    }

    /* renamed from: b */
    public final void m3471b() {
        if (this.f4155p != null) {
            C5522a c5522a = this.f4156q;
            if (c5522a != null) {
                c5522a.cancel();
            }
            this.f4155p.cancel();
        }
        this.f4149j = 0;
    }

    public int getRippleAlpha() {
        return this.f4157r;
    }

    public int getRippleColor() {
        return this.f4147h;
    }

    public int getRippleDuration() {
        return this.f4148i;
    }

    public int getRippleRadius() {
        return this.f4149j;
    }

    public int getRoundRadius() {
        return this.f4146g;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        m3471b();
        super.onDetachedFromWindow();
    }

    @Override // com.xuexiang.xui.widget.button.shadowbutton.BaseShadowButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4152m != null && canvas != null && this.f4150k >= 0.0f && this.f4151l >= 0.0f) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            float f = this.f4150k;
            float fMax = Math.max(f, Math.abs(width - f));
            float f7 = this.f4151l;
            float fMax2 = Math.max(f7, Math.abs(height - f7));
            float fSqrt = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
            float f8 = this.f4149j;
            if (f8 > fSqrt) {
                m3471b();
                return;
            }
            this.f4149j = (int) (((fSqrt / this.f4148i) * 35.0f) + f8);
            canvas.save();
            this.f4154o.reset();
            canvas.clipPath(this.f4154o);
            if (this.f4143d == 0) {
                this.f4154o.addCircle(width >> 1, height >> 1, this.f4140a >> 1, Path.Direction.CCW);
            } else {
                this.f4153n.set(0.0f, 0.0f, this.f4140a, this.f4141b);
                Path path = this.f4154o;
                RectF rectF = this.f4153n;
                float f9 = this.f4146g;
                path.addRoundRect(rectF, f9, f9, Path.Direction.CCW);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipPath(this.f4154o);
            } else {
                canvas.clipPath(this.f4154o, Region.Op.REPLACE);
            }
            canvas.drawCircle(this.f4150k, this.f4151l, this.f4149j, this.f4152m);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4150k = motionEvent.getX();
            this.f4151l = motionEvent.getY();
            m3471b();
            this.f4156q = new C5522a(this);
            Timer timer = new Timer();
            this.f4155p = timer;
            timer.schedule(this.f4156q, 0L, 30L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRippleAlpha(int i) {
        this.f4157r = i;
    }

    public void setRippleColor(int i) {
        this.f4147h = i;
    }

    public void setRippleDuration(int i) {
        this.f4148i = i;
    }

    public void setRippleRadius(int i) {
        this.f4149j = i;
    }

    public void setRoundRadius(int i) {
        this.f4146g = i;
        invalidate();
    }

    public RippleShadowShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public RippleShadowShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
