package com.xuexiang.xui.widget.button.shinebutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import java.lang.ref.WeakReference;
import java.util.Random;
import p187n3.C9091a;
import p197o3.InterpolatorC9162a;

/* renamed from: com.xuexiang.xui.widget.button.shinebutton.a */
/* loaded from: classes4.dex */
public class C6819a extends View {

    /* renamed from: D */
    public static int[] f7235D = new int[10];

    /* renamed from: A */
    public float f7236A;

    /* renamed from: B */
    public boolean f7237B;

    /* renamed from: C */
    public float f7238C;

    /* renamed from: a */
    public C9091a f7239a;

    /* renamed from: b */
    public ValueAnimator f7240b;

    /* renamed from: c */
    public WeakReference f7241c;

    /* renamed from: d */
    public Paint f7242d;

    /* renamed from: e */
    public Paint f7243e;

    /* renamed from: f */
    public Paint f7244f;

    /* renamed from: g */
    public int f7245g;

    /* renamed from: h */
    public int f7246h;

    /* renamed from: i */
    public float f7247i;

    /* renamed from: j */
    public float f7248j;

    /* renamed from: k */
    public long f7249k;

    /* renamed from: l */
    public long f7250l;

    /* renamed from: m */
    public float f7251m;

    /* renamed from: n */
    public int f7252n;

    /* renamed from: o */
    public int f7253o;

    /* renamed from: p */
    public int f7254p;

    /* renamed from: q */
    public boolean f7255q;

    /* renamed from: r */
    public boolean f7256r;

    /* renamed from: s */
    public RectF f7257s;

    /* renamed from: t */
    public RectF f7258t;

    /* renamed from: u */
    public Random f7259u;

    /* renamed from: v */
    public int f7260v;

    /* renamed from: w */
    public int f7261w;

    /* renamed from: x */
    public int f7262x;

    /* renamed from: y */
    public int f7263y;

    /* renamed from: z */
    public float f7264z;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6819a.this.f7236A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C6819a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6819a.this.f7236A = 0.0f;
            C6819a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C6819a.this.f7241c == null || C6819a.this.f7241c.get() == null) {
                return;
            }
            ((ShineButton) C6819a.this.f7241c.get()).m6641i(C6819a.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6819a.this.f7264z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (C6819a.this.f7254p == 0 || C6819a.this.f7254p <= 0) {
                C6819a.this.f7242d.setStrokeWidth((C6819a.this.f7262x / 2.0f) * (C6819a.this.f7251m - C6819a.this.f7264z));
                C6819a.this.f7244f.setStrokeWidth((C6819a.this.f7262x / 3.0f) * (C6819a.this.f7251m - C6819a.this.f7264z));
            } else {
                C6819a.this.f7242d.setStrokeWidth(C6819a.this.f7254p * (C6819a.this.f7251m - C6819a.this.f7264z));
                C6819a.this.f7244f.setStrokeWidth((C6819a.this.f7254p / 3.0f) * 2.0f * (C6819a.this.f7251m - C6819a.this.f7264z));
            }
            C6819a.this.f7257s.set(C6819a.this.f7260v - ((C6819a.this.f7262x / (3.0f - C6819a.this.f7251m)) * C6819a.this.f7264z), C6819a.this.f7261w - ((C6819a.this.f7263y / (3.0f - C6819a.this.f7251m)) * C6819a.this.f7264z), C6819a.this.f7260v + ((C6819a.this.f7262x / (3.0f - C6819a.this.f7251m)) * C6819a.this.f7264z), C6819a.this.f7261w + ((C6819a.this.f7263y / (3.0f - C6819a.this.f7251m)) * C6819a.this.f7264z));
            C6819a.this.f7258t.set(C6819a.this.f7260v - ((C6819a.this.f7262x / ((3.0f - C6819a.this.f7251m) + C6819a.this.f7238C)) * C6819a.this.f7264z), C6819a.this.f7261w - ((C6819a.this.f7263y / ((3.0f - C6819a.this.f7251m) + C6819a.this.f7238C)) * C6819a.this.f7264z), C6819a.this.f7260v + ((C6819a.this.f7262x / ((3.0f - C6819a.this.f7251m) + C6819a.this.f7238C)) * C6819a.this.f7264z), C6819a.this.f7261w + ((C6819a.this.f7263y / ((3.0f - C6819a.this.f7251m) + C6819a.this.f7238C)) * C6819a.this.f7264z));
            C6819a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$e */
    public static class e {
    }

    public C6819a(Context context, ShineButton shineButton, e eVar) {
        super(context);
        this.f7245g = 10;
        int[] iArr = f7235D;
        this.f7252n = iArr[0];
        this.f7253o = iArr[1];
        this.f7254p = 0;
        this.f7255q = false;
        this.f7256r = false;
        this.f7257s = new RectF();
        this.f7258t = new RectF();
        this.f7259u = new Random();
        this.f7236A = 0.0f;
        this.f7237B = false;
        this.f7238C = 0.2f;
        m6661q(eVar, shineButton);
        this.f7241c = new WeakReference(shineButton);
        this.f7239a = new C9091a(this.f7249k, this.f7251m, this.f7250l);
        ValueAnimator.setFrameDelay(25L);
        Paint paint = new Paint();
        this.f7242d = paint;
        paint.setColor(this.f7253o);
        this.f7242d.setStrokeWidth(20.0f);
        Paint paint2 = this.f7242d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.f7242d;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f7243e = paint4;
        paint4.setColor(-1);
        this.f7243e.setStrokeWidth(20.0f);
        this.f7243e.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f7244f = paint5;
        paint5.setColor(this.f7252n);
        this.f7244f.setStrokeWidth(10.0f);
        this.f7244f.setStyle(style);
        this.f7244f.setStrokeCap(cap);
        this.f7240b = ValueAnimator.ofFloat(0.0f, 1.1f);
        ValueAnimator.setFrameDelay(25L);
        this.f7240b.setDuration(this.f7250l);
        this.f7240b.setInterpolator(new InterpolatorC9162a(Ease.QUART_OUT));
        this.f7240b.addUpdateListener(new a());
        this.f7240b.addListener(new b());
        this.f7239a.addListener(new c());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i9 = 0; i9 < this.f7246h; i9++) {
            if (this.f7255q) {
                Paint paint = this.f7242d;
                int[] iArr = f7235D;
                int iAbs = Math.abs((this.f7245g / 2) - i9);
                int i10 = this.f7245g;
                paint.setColor(iArr[iAbs >= i10 ? i10 - 1 : Math.abs((i10 / 2) - i9)]);
            }
            canvas.drawArc(this.f7257s, ((360.0f / this.f7246h) * i9) + 1.0f + ((this.f7264z - 1.0f) * this.f7248j), 0.1f, false, m6660p(this.f7242d));
        }
        for (int i11 = 0; i11 < this.f7246h; i11++) {
            if (this.f7255q) {
                Paint paint2 = this.f7242d;
                int[] iArr2 = f7235D;
                int iAbs2 = Math.abs((this.f7245g / 2) - i11);
                int i12 = this.f7245g;
                paint2.setColor(iArr2[iAbs2 >= i12 ? i12 - 1 : Math.abs((i12 / 2) - i11)]);
            }
            canvas.drawArc(this.f7258t, ((this.f7264z - 1.0f) * this.f7248j) + ((((360.0f / this.f7246h) * i11) + 1.0f) - this.f7247i), 0.1f, false, m6660p(this.f7244f));
        }
        this.f7242d.setStrokeWidth(this.f7262x * this.f7236A * (this.f7251m - this.f7238C));
        float f10 = this.f7236A;
        if (f10 != 0.0f) {
            this.f7243e.setStrokeWidth(((this.f7262x * f10) * (this.f7251m - this.f7238C)) - 8.0f);
        } else {
            this.f7243e.setStrokeWidth(0.0f);
        }
        canvas.drawPoint(this.f7260v, this.f7261w, this.f7242d);
        canvas.drawPoint(this.f7260v, this.f7261w, this.f7243e);
        if (this.f7239a == null || this.f7237B) {
            return;
        }
        this.f7237B = true;
        m6662r((ShineButton) this.f7241c.get());
    }

    /* renamed from: p */
    public final Paint m6660p(Paint paint) {
        if (this.f7256r) {
            paint.setColor(f7235D[this.f7259u.nextInt(this.f7245g - 1)]);
        }
        return paint;
    }

    /* renamed from: q */
    public final void m6661q(e eVar, ShineButton shineButton) {
        throw null;
    }

    /* renamed from: r */
    public void m6662r(ShineButton shineButton) {
        if (shineButton == null) {
            return;
        }
        this.f7262x = shineButton.getWidth();
        this.f7263y = shineButton.getHeight();
        int[] iArr = new int[2];
        shineButton.getLocationInWindow(iArr);
        this.f7260v = iArr[0] + (shineButton.getWidth() / 2);
        this.f7261w = iArr[1] + (shineButton.getHeight() / 2);
        if (shineButton.getWindow() != null) {
            View decorView = shineButton.getWindow().getDecorView();
            this.f7260v -= decorView.getPaddingLeft();
            this.f7261w -= decorView.getPaddingTop();
        }
        this.f7239a.addUpdateListener(new d());
        this.f7239a.start();
        this.f7240b.start();
    }
}
