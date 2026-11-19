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
import p189y1.C7896a;
import p196z1.InterpolatorC7932a;

/* renamed from: com.xuexiang.xui.widget.button.shinebutton.a */
/* loaded from: classes3.dex */
public class C5878a extends View {

    /* renamed from: D */
    public static int[] f4704D = new int[10];

    /* renamed from: A */
    public float f4705A;

    /* renamed from: B */
    public boolean f4706B;

    /* renamed from: C */
    public float f4707C;

    /* renamed from: a */
    public C7896a f4708a;

    /* renamed from: b */
    public ValueAnimator f4709b;

    /* renamed from: c */
    public WeakReference f4710c;

    /* renamed from: d */
    public Paint f4711d;

    /* renamed from: e */
    public Paint f4712e;

    /* renamed from: f */
    public Paint f4713f;

    /* renamed from: g */
    public int f4714g;

    /* renamed from: h */
    public int f4715h;

    /* renamed from: i */
    public float f4716i;

    /* renamed from: j */
    public float f4717j;

    /* renamed from: k */
    public long f4718k;

    /* renamed from: l */
    public long f4719l;

    /* renamed from: m */
    public float f4720m;

    /* renamed from: n */
    public int f4721n;

    /* renamed from: o */
    public int f4722o;

    /* renamed from: p */
    public int f4723p;

    /* renamed from: q */
    public boolean f4724q;

    /* renamed from: r */
    public boolean f4725r;

    /* renamed from: s */
    public RectF f4726s;

    /* renamed from: t */
    public RectF f4727t;

    /* renamed from: u */
    public Random f4728u;

    /* renamed from: v */
    public int f4729v;

    /* renamed from: w */
    public int f4730w;

    /* renamed from: x */
    public int f4731x;

    /* renamed from: y */
    public int f4732y;

    /* renamed from: z */
    public float f4733z;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5878a.this.f4705A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C5878a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5878a.this.f4705A = 0.0f;
            C5878a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C5878a.this.f4710c == null || C5878a.this.f4710c.get() == null) {
                return;
            }
            ((ShineButton) C5878a.this.f4710c.get()).m4555i(C5878a.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5878a.this.f4733z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (C5878a.this.f4723p == 0 || C5878a.this.f4723p <= 0) {
                C5878a.this.f4711d.setStrokeWidth((C5878a.this.f4731x / 2.0f) * (C5878a.this.f4720m - C5878a.this.f4733z));
                C5878a.this.f4713f.setStrokeWidth((C5878a.this.f4731x / 3.0f) * (C5878a.this.f4720m - C5878a.this.f4733z));
            } else {
                C5878a.this.f4711d.setStrokeWidth(C5878a.this.f4723p * (C5878a.this.f4720m - C5878a.this.f4733z));
                C5878a.this.f4713f.setStrokeWidth((C5878a.this.f4723p / 3.0f) * 2.0f * (C5878a.this.f4720m - C5878a.this.f4733z));
            }
            C5878a.this.f4726s.set(C5878a.this.f4729v - ((C5878a.this.f4731x / (3.0f - C5878a.this.f4720m)) * C5878a.this.f4733z), C5878a.this.f4730w - ((C5878a.this.f4732y / (3.0f - C5878a.this.f4720m)) * C5878a.this.f4733z), C5878a.this.f4729v + ((C5878a.this.f4731x / (3.0f - C5878a.this.f4720m)) * C5878a.this.f4733z), C5878a.this.f4730w + ((C5878a.this.f4732y / (3.0f - C5878a.this.f4720m)) * C5878a.this.f4733z));
            C5878a.this.f4727t.set(C5878a.this.f4729v - ((C5878a.this.f4731x / ((3.0f - C5878a.this.f4720m) + C5878a.this.f4707C)) * C5878a.this.f4733z), C5878a.this.f4730w - ((C5878a.this.f4732y / ((3.0f - C5878a.this.f4720m) + C5878a.this.f4707C)) * C5878a.this.f4733z), C5878a.this.f4729v + ((C5878a.this.f4731x / ((3.0f - C5878a.this.f4720m) + C5878a.this.f4707C)) * C5878a.this.f4733z), C5878a.this.f4730w + ((C5878a.this.f4732y / ((3.0f - C5878a.this.f4720m) + C5878a.this.f4707C)) * C5878a.this.f4733z));
            C5878a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$e */
    public static class e {
    }

    public C5878a(Context context, ShineButton shineButton, e eVar) {
        super(context);
        this.f4714g = 10;
        int[] iArr = f4704D;
        this.f4721n = iArr[0];
        this.f4722o = iArr[1];
        this.f4723p = 0;
        this.f4724q = false;
        this.f4725r = false;
        this.f4726s = new RectF();
        this.f4727t = new RectF();
        this.f4728u = new Random();
        this.f4705A = 0.0f;
        this.f4706B = false;
        this.f4707C = 0.2f;
        m4575q(eVar, shineButton);
        this.f4710c = new WeakReference(shineButton);
        this.f4708a = new C7896a(this.f4718k, this.f4720m, this.f4719l);
        ValueAnimator.setFrameDelay(25L);
        Paint paint = new Paint();
        this.f4711d = paint;
        paint.setColor(this.f4722o);
        this.f4711d.setStrokeWidth(20.0f);
        Paint paint2 = this.f4711d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.f4711d;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f4712e = paint4;
        paint4.setColor(-1);
        this.f4712e.setStrokeWidth(20.0f);
        this.f4712e.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f4713f = paint5;
        paint5.setColor(this.f4721n);
        this.f4713f.setStrokeWidth(10.0f);
        this.f4713f.setStyle(style);
        this.f4713f.setStrokeCap(cap);
        this.f4709b = ValueAnimator.ofFloat(0.0f, 1.1f);
        ValueAnimator.setFrameDelay(25L);
        this.f4709b.setDuration(this.f4719l);
        this.f4709b.setInterpolator(new InterpolatorC7932a(Ease.QUART_OUT));
        this.f4709b.addUpdateListener(new a());
        this.f4709b.addListener(new b());
        this.f4708a.addListener(new c());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i6 = 0; i6 < this.f4715h; i6++) {
            if (this.f4724q) {
                Paint paint = this.f4711d;
                int[] iArr = f4704D;
                int iAbs = Math.abs((this.f4714g / 2) - i6);
                int i7 = this.f4714g;
                paint.setColor(iArr[iAbs >= i7 ? i7 - 1 : Math.abs((i7 / 2) - i6)]);
            }
            canvas.drawArc(this.f4726s, ((360.0f / this.f4715h) * i6) + 1.0f + ((this.f4733z - 1.0f) * this.f4717j), 0.1f, false, m4574p(this.f4711d));
        }
        for (int i8 = 0; i8 < this.f4715h; i8++) {
            if (this.f4724q) {
                Paint paint2 = this.f4711d;
                int[] iArr2 = f4704D;
                int iAbs2 = Math.abs((this.f4714g / 2) - i8);
                int i9 = this.f4714g;
                paint2.setColor(iArr2[iAbs2 >= i9 ? i9 - 1 : Math.abs((i9 / 2) - i8)]);
            }
            canvas.drawArc(this.f4727t, ((this.f4733z - 1.0f) * this.f4717j) + ((((360.0f / this.f4715h) * i8) + 1.0f) - this.f4716i), 0.1f, false, m4574p(this.f4713f));
        }
        this.f4711d.setStrokeWidth(this.f4731x * this.f4705A * (this.f4720m - this.f4707C));
        float f6 = this.f4705A;
        if (f6 != 0.0f) {
            this.f4712e.setStrokeWidth(((this.f4731x * f6) * (this.f4720m - this.f4707C)) - 8.0f);
        } else {
            this.f4712e.setStrokeWidth(0.0f);
        }
        canvas.drawPoint(this.f4729v, this.f4730w, this.f4711d);
        canvas.drawPoint(this.f4729v, this.f4730w, this.f4712e);
        if (this.f4708a == null || this.f4706B) {
            return;
        }
        this.f4706B = true;
        m4576r((ShineButton) this.f4710c.get());
    }

    /* renamed from: p */
    public final Paint m4574p(Paint paint) {
        if (this.f4725r) {
            paint.setColor(f4704D[this.f4728u.nextInt(this.f4714g - 1)]);
        }
        return paint;
    }

    /* renamed from: q */
    public final void m4575q(e eVar, ShineButton shineButton) {
        throw null;
    }

    /* renamed from: r */
    public void m4576r(ShineButton shineButton) {
        if (shineButton == null) {
            return;
        }
        this.f4731x = shineButton.getWidth();
        this.f4732y = shineButton.getHeight();
        int[] iArr = new int[2];
        shineButton.getLocationInWindow(iArr);
        this.f4729v = iArr[0] + (shineButton.getWidth() / 2);
        this.f4730w = iArr[1] + (shineButton.getHeight() / 2);
        if (shineButton.getWindow() != null) {
            View decorView = shineButton.getWindow().getDecorView();
            this.f4729v -= decorView.getPaddingLeft();
            this.f4730w -= decorView.getPaddingTop();
        }
        this.f4708a.addUpdateListener(new d());
        this.f4708a.start();
        this.f4709b.start();
    }
}
