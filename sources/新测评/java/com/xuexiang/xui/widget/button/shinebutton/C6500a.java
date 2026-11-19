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
import p283x2.C9844a;
import p293y2.InterpolatorC9903a;

/* renamed from: com.xuexiang.xui.widget.button.shinebutton.a */
/* loaded from: classes4.dex */
public class C6500a extends View {

    /* renamed from: D */
    public static int[] f5980D = new int[10];

    /* renamed from: A */
    public float f5981A;

    /* renamed from: B */
    public boolean f5982B;

    /* renamed from: C */
    public float f5983C;

    /* renamed from: a */
    public C9844a f5984a;

    /* renamed from: b */
    public ValueAnimator f5985b;

    /* renamed from: c */
    public WeakReference f5986c;

    /* renamed from: d */
    public Paint f5987d;

    /* renamed from: e */
    public Paint f5988e;

    /* renamed from: f */
    public Paint f5989f;

    /* renamed from: g */
    public int f5990g;

    /* renamed from: h */
    public int f5991h;

    /* renamed from: i */
    public float f5992i;

    /* renamed from: j */
    public float f5993j;

    /* renamed from: k */
    public long f5994k;

    /* renamed from: l */
    public long f5995l;

    /* renamed from: m */
    public float f5996m;

    /* renamed from: n */
    public int f5997n;

    /* renamed from: o */
    public int f5998o;

    /* renamed from: p */
    public int f5999p;

    /* renamed from: q */
    public boolean f6000q;

    /* renamed from: r */
    public boolean f6001r;

    /* renamed from: s */
    public RectF f6002s;

    /* renamed from: t */
    public RectF f6003t;

    /* renamed from: u */
    public Random f6004u;

    /* renamed from: v */
    public int f6005v;

    /* renamed from: w */
    public int f6006w;

    /* renamed from: x */
    public int f6007x;

    /* renamed from: y */
    public int f6008y;

    /* renamed from: z */
    public float f6009z;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6500a.this.f5981A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C6500a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6500a.this.f5981A = 0.0f;
            C6500a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C6500a.this.f5986c == null || C6500a.this.f5986c.get() == null) {
                return;
            }
            ((ShineButton) C6500a.this.f5986c.get()).m5545i(C6500a.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6500a.this.f6009z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (C6500a.this.f5999p == 0 || C6500a.this.f5999p <= 0) {
                C6500a.this.f5987d.setStrokeWidth((C6500a.this.f6007x / 2.0f) * (C6500a.this.f5996m - C6500a.this.f6009z));
                C6500a.this.f5989f.setStrokeWidth((C6500a.this.f6007x / 3.0f) * (C6500a.this.f5996m - C6500a.this.f6009z));
            } else {
                C6500a.this.f5987d.setStrokeWidth(C6500a.this.f5999p * (C6500a.this.f5996m - C6500a.this.f6009z));
                C6500a.this.f5989f.setStrokeWidth((C6500a.this.f5999p / 3.0f) * 2.0f * (C6500a.this.f5996m - C6500a.this.f6009z));
            }
            C6500a.this.f6002s.set(C6500a.this.f6005v - ((C6500a.this.f6007x / (3.0f - C6500a.this.f5996m)) * C6500a.this.f6009z), C6500a.this.f6006w - ((C6500a.this.f6008y / (3.0f - C6500a.this.f5996m)) * C6500a.this.f6009z), C6500a.this.f6005v + ((C6500a.this.f6007x / (3.0f - C6500a.this.f5996m)) * C6500a.this.f6009z), C6500a.this.f6006w + ((C6500a.this.f6008y / (3.0f - C6500a.this.f5996m)) * C6500a.this.f6009z));
            C6500a.this.f6003t.set(C6500a.this.f6005v - ((C6500a.this.f6007x / ((3.0f - C6500a.this.f5996m) + C6500a.this.f5983C)) * C6500a.this.f6009z), C6500a.this.f6006w - ((C6500a.this.f6008y / ((3.0f - C6500a.this.f5996m) + C6500a.this.f5983C)) * C6500a.this.f6009z), C6500a.this.f6005v + ((C6500a.this.f6007x / ((3.0f - C6500a.this.f5996m) + C6500a.this.f5983C)) * C6500a.this.f6009z), C6500a.this.f6006w + ((C6500a.this.f6008y / ((3.0f - C6500a.this.f5996m) + C6500a.this.f5983C)) * C6500a.this.f6009z));
            C6500a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$e */
    public static class e {
    }

    public C6500a(Context context, ShineButton shineButton, e eVar) {
        super(context);
        this.f5990g = 10;
        int[] iArr = f5980D;
        this.f5997n = iArr[0];
        this.f5998o = iArr[1];
        this.f5999p = 0;
        this.f6000q = false;
        this.f6001r = false;
        this.f6002s = new RectF();
        this.f6003t = new RectF();
        this.f6004u = new Random();
        this.f5981A = 0.0f;
        this.f5982B = false;
        this.f5983C = 0.2f;
        m5565q(eVar, shineButton);
        this.f5986c = new WeakReference(shineButton);
        this.f5984a = new C9844a(this.f5994k, this.f5996m, this.f5995l);
        ValueAnimator.setFrameDelay(25L);
        Paint paint = new Paint();
        this.f5987d = paint;
        paint.setColor(this.f5998o);
        this.f5987d.setStrokeWidth(20.0f);
        Paint paint2 = this.f5987d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.f5987d;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f5988e = paint4;
        paint4.setColor(-1);
        this.f5988e.setStrokeWidth(20.0f);
        this.f5988e.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f5989f = paint5;
        paint5.setColor(this.f5997n);
        this.f5989f.setStrokeWidth(10.0f);
        this.f5989f.setStyle(style);
        this.f5989f.setStrokeCap(cap);
        this.f5985b = ValueAnimator.ofFloat(0.0f, 1.1f);
        ValueAnimator.setFrameDelay(25L);
        this.f5985b.setDuration(this.f5995l);
        this.f5985b.setInterpolator(new InterpolatorC9903a(Ease.QUART_OUT));
        this.f5985b.addUpdateListener(new a());
        this.f5985b.addListener(new b());
        this.f5984a.addListener(new c());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i10 = 0; i10 < this.f5991h; i10++) {
            if (this.f6000q) {
                Paint paint = this.f5987d;
                int[] iArr = f5980D;
                int iAbs = Math.abs((this.f5990g / 2) - i10);
                int i11 = this.f5990g;
                paint.setColor(iArr[iAbs >= i11 ? i11 - 1 : Math.abs((i11 / 2) - i10)]);
            }
            canvas.drawArc(this.f6002s, ((360.0f / this.f5991h) * i10) + 1.0f + ((this.f6009z - 1.0f) * this.f5993j), 0.1f, false, m5564p(this.f5987d));
        }
        for (int i12 = 0; i12 < this.f5991h; i12++) {
            if (this.f6000q) {
                Paint paint2 = this.f5987d;
                int[] iArr2 = f5980D;
                int iAbs2 = Math.abs((this.f5990g / 2) - i12);
                int i13 = this.f5990g;
                paint2.setColor(iArr2[iAbs2 >= i13 ? i13 - 1 : Math.abs((i13 / 2) - i12)]);
            }
            canvas.drawArc(this.f6003t, ((this.f6009z - 1.0f) * this.f5993j) + ((((360.0f / this.f5991h) * i12) + 1.0f) - this.f5992i), 0.1f, false, m5564p(this.f5989f));
        }
        this.f5987d.setStrokeWidth(this.f6007x * this.f5981A * (this.f5996m - this.f5983C));
        float f10 = this.f5981A;
        if (f10 != 0.0f) {
            this.f5988e.setStrokeWidth(((this.f6007x * f10) * (this.f5996m - this.f5983C)) - 8.0f);
        } else {
            this.f5988e.setStrokeWidth(0.0f);
        }
        canvas.drawPoint(this.f6005v, this.f6006w, this.f5987d);
        canvas.drawPoint(this.f6005v, this.f6006w, this.f5988e);
        if (this.f5984a == null || this.f5982B) {
            return;
        }
        this.f5982B = true;
        m5566r((ShineButton) this.f5986c.get());
    }

    /* renamed from: p */
    public final Paint m5564p(Paint paint) {
        if (this.f6001r) {
            paint.setColor(f5980D[this.f6004u.nextInt(this.f5990g - 1)]);
        }
        return paint;
    }

    /* renamed from: q */
    public final void m5565q(e eVar, ShineButton shineButton) {
        throw null;
    }

    /* renamed from: r */
    public void m5566r(ShineButton shineButton) {
        if (shineButton == null) {
            return;
        }
        this.f6007x = shineButton.getWidth();
        this.f6008y = shineButton.getHeight();
        int[] iArr = new int[2];
        shineButton.getLocationInWindow(iArr);
        this.f6005v = iArr[0] + (shineButton.getWidth() / 2);
        this.f6006w = iArr[1] + (shineButton.getHeight() / 2);
        if (shineButton.getWindow() != null) {
            View decorView = shineButton.getWindow().getDecorView();
            this.f6005v -= decorView.getPaddingLeft();
            this.f6006w -= decorView.getPaddingTop();
        }
        this.f5984a.addUpdateListener(new d());
        this.f5984a.start();
        this.f5985b.start();
    }
}
