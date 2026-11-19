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
import p115r0.C4493a;
import p119s0.InterpolatorC4543a;

/* renamed from: com.xuexiang.xui.widget.button.shinebutton.a */
/* loaded from: classes2.dex */
public class C3549a extends View {

    /* renamed from: D */
    public static int[] f3320D = new int[10];

    /* renamed from: A */
    public float f3321A;

    /* renamed from: B */
    public boolean f3322B;

    /* renamed from: C */
    public float f3323C;

    /* renamed from: a */
    public C4493a f3324a;

    /* renamed from: b */
    public ValueAnimator f3325b;

    /* renamed from: c */
    public WeakReference f3326c;

    /* renamed from: d */
    public Paint f3327d;

    /* renamed from: e */
    public Paint f3328e;

    /* renamed from: f */
    public Paint f3329f;

    /* renamed from: g */
    public int f3330g;

    /* renamed from: h */
    public int f3331h;

    /* renamed from: i */
    public float f3332i;

    /* renamed from: j */
    public float f3333j;

    /* renamed from: k */
    public long f3334k;

    /* renamed from: l */
    public long f3335l;

    /* renamed from: m */
    public float f3336m;

    /* renamed from: n */
    public int f3337n;

    /* renamed from: o */
    public int f3338o;

    /* renamed from: p */
    public int f3339p;

    /* renamed from: q */
    public boolean f3340q;

    /* renamed from: r */
    public boolean f3341r;

    /* renamed from: s */
    public RectF f3342s;

    /* renamed from: t */
    public RectF f3343t;

    /* renamed from: u */
    public Random f3344u;

    /* renamed from: v */
    public int f3345v;

    /* renamed from: w */
    public int f3346w;

    /* renamed from: x */
    public int f3347x;

    /* renamed from: y */
    public int f3348y;

    /* renamed from: z */
    public float f3349z;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3549a.this.f3321A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3549a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3549a.this.f3321A = 0.0f;
            C3549a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C3549a.this.f3326c == null || C3549a.this.f3326c.get() == null) {
                return;
            }
            ((ShineButton) C3549a.this.f3326c.get()).m4231i(C3549a.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3549a.this.f3349z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (C3549a.this.f3339p == 0 || C3549a.this.f3339p <= 0) {
                C3549a.this.f3327d.setStrokeWidth((C3549a.this.f3347x / 2.0f) * (C3549a.this.f3336m - C3549a.this.f3349z));
                C3549a.this.f3329f.setStrokeWidth((C3549a.this.f3347x / 3.0f) * (C3549a.this.f3336m - C3549a.this.f3349z));
            } else {
                C3549a.this.f3327d.setStrokeWidth(C3549a.this.f3339p * (C3549a.this.f3336m - C3549a.this.f3349z));
                C3549a.this.f3329f.setStrokeWidth((C3549a.this.f3339p / 3.0f) * 2.0f * (C3549a.this.f3336m - C3549a.this.f3349z));
            }
            C3549a.this.f3342s.set(C3549a.this.f3345v - ((C3549a.this.f3347x / (3.0f - C3549a.this.f3336m)) * C3549a.this.f3349z), C3549a.this.f3346w - ((C3549a.this.f3348y / (3.0f - C3549a.this.f3336m)) * C3549a.this.f3349z), C3549a.this.f3345v + ((C3549a.this.f3347x / (3.0f - C3549a.this.f3336m)) * C3549a.this.f3349z), C3549a.this.f3346w + ((C3549a.this.f3348y / (3.0f - C3549a.this.f3336m)) * C3549a.this.f3349z));
            C3549a.this.f3343t.set(C3549a.this.f3345v - ((C3549a.this.f3347x / ((3.0f - C3549a.this.f3336m) + C3549a.this.f3323C)) * C3549a.this.f3349z), C3549a.this.f3346w - ((C3549a.this.f3348y / ((3.0f - C3549a.this.f3336m) + C3549a.this.f3323C)) * C3549a.this.f3349z), C3549a.this.f3345v + ((C3549a.this.f3347x / ((3.0f - C3549a.this.f3336m) + C3549a.this.f3323C)) * C3549a.this.f3349z), C3549a.this.f3346w + ((C3549a.this.f3348y / ((3.0f - C3549a.this.f3336m) + C3549a.this.f3323C)) * C3549a.this.f3349z));
            C3549a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$e */
    public static class e {
    }

    public C3549a(Context context, ShineButton shineButton, e eVar) {
        super(context);
        this.f3330g = 10;
        int[] iArr = f3320D;
        this.f3337n = iArr[0];
        this.f3338o = iArr[1];
        this.f3339p = 0;
        this.f3340q = false;
        this.f3341r = false;
        this.f3342s = new RectF();
        this.f3343t = new RectF();
        this.f3344u = new Random();
        this.f3321A = 0.0f;
        this.f3322B = false;
        this.f3323C = 0.2f;
        m4251q(eVar, shineButton);
        this.f3326c = new WeakReference(shineButton);
        this.f3324a = new C4493a(this.f3334k, this.f3336m, this.f3335l);
        ValueAnimator.setFrameDelay(25L);
        Paint paint = new Paint();
        this.f3327d = paint;
        paint.setColor(this.f3338o);
        this.f3327d.setStrokeWidth(20.0f);
        this.f3327d.setStyle(Paint.Style.STROKE);
        this.f3327d.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f3328e = paint2;
        paint2.setColor(-1);
        this.f3328e.setStrokeWidth(20.0f);
        this.f3328e.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint();
        this.f3329f = paint3;
        paint3.setColor(this.f3337n);
        this.f3329f.setStrokeWidth(10.0f);
        this.f3329f.setStyle(Paint.Style.STROKE);
        this.f3329f.setStrokeCap(Paint.Cap.ROUND);
        this.f3325b = ValueAnimator.ofFloat(0.0f, 1.1f);
        ValueAnimator.setFrameDelay(25L);
        this.f3325b.setDuration(this.f3335l);
        this.f3325b.setInterpolator(new InterpolatorC4543a(Ease.QUART_OUT));
        this.f3325b.addUpdateListener(new a());
        this.f3325b.addListener(new b());
        this.f3324a.addListener(new c());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i4 = 0; i4 < this.f3331h; i4++) {
            if (this.f3340q) {
                Paint paint = this.f3327d;
                int[] iArr = f3320D;
                int iAbs = Math.abs((this.f3330g / 2) - i4);
                int i5 = this.f3330g;
                paint.setColor(iArr[iAbs >= i5 ? i5 - 1 : Math.abs((i5 / 2) - i4)]);
            }
            canvas.drawArc(this.f3342s, ((360.0f / this.f3331h) * i4) + 1.0f + ((this.f3349z - 1.0f) * this.f3333j), 0.1f, false, m4250p(this.f3327d));
        }
        for (int i6 = 0; i6 < this.f3331h; i6++) {
            if (this.f3340q) {
                Paint paint2 = this.f3327d;
                int[] iArr2 = f3320D;
                int iAbs2 = Math.abs((this.f3330g / 2) - i6);
                int i7 = this.f3330g;
                paint2.setColor(iArr2[iAbs2 >= i7 ? i7 - 1 : Math.abs((i7 / 2) - i6)]);
            }
            canvas.drawArc(this.f3343t, ((((360.0f / this.f3331h) * i6) + 1.0f) - this.f3332i) + ((this.f3349z - 1.0f) * this.f3333j), 0.1f, false, m4250p(this.f3329f));
        }
        this.f3327d.setStrokeWidth(this.f3347x * this.f3321A * (this.f3336m - this.f3323C));
        float f4 = this.f3321A;
        if (f4 != 0.0f) {
            this.f3328e.setStrokeWidth(((this.f3347x * f4) * (this.f3336m - this.f3323C)) - 8.0f);
        } else {
            this.f3328e.setStrokeWidth(0.0f);
        }
        canvas.drawPoint(this.f3345v, this.f3346w, this.f3327d);
        canvas.drawPoint(this.f3345v, this.f3346w, this.f3328e);
        if (this.f3324a == null || this.f3322B) {
            return;
        }
        this.f3322B = true;
        m4252r((ShineButton) this.f3326c.get());
    }

    /* renamed from: p */
    public final Paint m4250p(Paint paint) {
        if (this.f3341r) {
            paint.setColor(f3320D[this.f3344u.nextInt(this.f3330g - 1)]);
        }
        return paint;
    }

    /* renamed from: q */
    public final void m4251q(e eVar, ShineButton shineButton) {
        throw null;
    }

    /* renamed from: r */
    public void m4252r(ShineButton shineButton) {
        if (shineButton == null) {
            return;
        }
        this.f3347x = shineButton.getWidth();
        this.f3348y = shineButton.getHeight();
        int[] iArr = new int[2];
        shineButton.getLocationInWindow(iArr);
        this.f3345v = iArr[0] + (shineButton.getWidth() / 2);
        this.f3346w = iArr[1] + (shineButton.getHeight() / 2);
        if (shineButton.getWindow() != null) {
            View decorView = shineButton.getWindow().getDecorView();
            this.f3345v -= decorView.getPaddingLeft();
            this.f3346w -= decorView.getPaddingTop();
        }
        this.f3324a.addUpdateListener(new d());
        this.f3324a.start();
        this.f3325b.start();
    }
}
