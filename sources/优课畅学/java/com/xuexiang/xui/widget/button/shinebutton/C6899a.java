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
import p283w1.C10272a;
import p294x1.InterpolatorC10489a;

/* renamed from: com.xuexiang.xui.widget.button.shinebutton.a */
/* loaded from: classes4.dex */
public class C6899a extends View {

    /* renamed from: D */
    public static int[] f7305D = new int[10];

    /* renamed from: A */
    public float f7306A;

    /* renamed from: B */
    public boolean f7307B;

    /* renamed from: C */
    public float f7308C;

    /* renamed from: a */
    public C10272a f7309a;

    /* renamed from: b */
    public ValueAnimator f7310b;

    /* renamed from: c */
    public WeakReference f7311c;

    /* renamed from: d */
    public Paint f7312d;

    /* renamed from: e */
    public Paint f7313e;

    /* renamed from: f */
    public Paint f7314f;

    /* renamed from: g */
    public int f7315g;

    /* renamed from: h */
    public int f7316h;

    /* renamed from: i */
    public float f7317i;

    /* renamed from: j */
    public float f7318j;

    /* renamed from: k */
    public long f7319k;

    /* renamed from: l */
    public long f7320l;

    /* renamed from: m */
    public float f7321m;

    /* renamed from: n */
    public int f7322n;

    /* renamed from: o */
    public int f7323o;

    /* renamed from: p */
    public int f7324p;

    /* renamed from: q */
    public boolean f7325q;

    /* renamed from: r */
    public boolean f7326r;

    /* renamed from: s */
    public RectF f7327s;

    /* renamed from: t */
    public RectF f7328t;

    /* renamed from: u */
    public Random f7329u;

    /* renamed from: v */
    public int f7330v;

    /* renamed from: w */
    public int f7331w;

    /* renamed from: x */
    public int f7332x;

    /* renamed from: y */
    public int f7333y;

    /* renamed from: z */
    public float f7334z;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6899a.this.f7306A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C6899a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6899a.this.f7306A = 0.0f;
            C6899a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C6899a.this.f7311c == null || C6899a.this.f7311c.get() == null) {
                return;
            }
            ((ShineButton) C6899a.this.f7311c.get()).m6666i(C6899a.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6899a.this.f7334z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (C6899a.this.f7324p == 0 || C6899a.this.f7324p <= 0) {
                C6899a.this.f7312d.setStrokeWidth((C6899a.this.f7332x / 2.0f) * (C6899a.this.f7321m - C6899a.this.f7334z));
                C6899a.this.f7314f.setStrokeWidth((C6899a.this.f7332x / 3.0f) * (C6899a.this.f7321m - C6899a.this.f7334z));
            } else {
                C6899a.this.f7312d.setStrokeWidth(C6899a.this.f7324p * (C6899a.this.f7321m - C6899a.this.f7334z));
                C6899a.this.f7314f.setStrokeWidth((C6899a.this.f7324p / 3.0f) * 2.0f * (C6899a.this.f7321m - C6899a.this.f7334z));
            }
            C6899a.this.f7327s.set(C6899a.this.f7330v - ((C6899a.this.f7332x / (3.0f - C6899a.this.f7321m)) * C6899a.this.f7334z), C6899a.this.f7331w - ((C6899a.this.f7333y / (3.0f - C6899a.this.f7321m)) * C6899a.this.f7334z), C6899a.this.f7330v + ((C6899a.this.f7332x / (3.0f - C6899a.this.f7321m)) * C6899a.this.f7334z), C6899a.this.f7331w + ((C6899a.this.f7333y / (3.0f - C6899a.this.f7321m)) * C6899a.this.f7334z));
            C6899a.this.f7328t.set(C6899a.this.f7330v - ((C6899a.this.f7332x / ((3.0f - C6899a.this.f7321m) + C6899a.this.f7308C)) * C6899a.this.f7334z), C6899a.this.f7331w - ((C6899a.this.f7333y / ((3.0f - C6899a.this.f7321m) + C6899a.this.f7308C)) * C6899a.this.f7334z), C6899a.this.f7330v + ((C6899a.this.f7332x / ((3.0f - C6899a.this.f7321m) + C6899a.this.f7308C)) * C6899a.this.f7334z), C6899a.this.f7331w + ((C6899a.this.f7333y / ((3.0f - C6899a.this.f7321m) + C6899a.this.f7308C)) * C6899a.this.f7334z));
            C6899a.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.a$e */
    public static class e {
    }

    public C6899a(Context context, ShineButton shineButton, e eVar) {
        super(context);
        this.f7315g = 10;
        int[] iArr = f7305D;
        this.f7322n = iArr[0];
        this.f7323o = iArr[1];
        this.f7324p = 0;
        this.f7325q = false;
        this.f7326r = false;
        this.f7327s = new RectF();
        this.f7328t = new RectF();
        this.f7329u = new Random();
        this.f7306A = 0.0f;
        this.f7307B = false;
        this.f7308C = 0.2f;
        m6686q(eVar, shineButton);
        this.f7311c = new WeakReference(shineButton);
        this.f7309a = new C10272a(this.f7319k, this.f7321m, this.f7320l);
        ValueAnimator.setFrameDelay(25L);
        Paint paint = new Paint();
        this.f7312d = paint;
        paint.setColor(this.f7323o);
        this.f7312d.setStrokeWidth(20.0f);
        Paint paint2 = this.f7312d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.f7312d;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f7313e = paint4;
        paint4.setColor(-1);
        this.f7313e.setStrokeWidth(20.0f);
        this.f7313e.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f7314f = paint5;
        paint5.setColor(this.f7322n);
        this.f7314f.setStrokeWidth(10.0f);
        this.f7314f.setStyle(style);
        this.f7314f.setStrokeCap(cap);
        this.f7310b = ValueAnimator.ofFloat(0.0f, 1.1f);
        ValueAnimator.setFrameDelay(25L);
        this.f7310b.setDuration(this.f7320l);
        this.f7310b.setInterpolator(new InterpolatorC10489a(Ease.QUART_OUT));
        this.f7310b.addUpdateListener(new a());
        this.f7310b.addListener(new b());
        this.f7309a.addListener(new c());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i10 = 0; i10 < this.f7316h; i10++) {
            if (this.f7325q) {
                Paint paint = this.f7312d;
                int[] iArr = f7305D;
                int iAbs = Math.abs((this.f7315g / 2) - i10);
                int i11 = this.f7315g;
                paint.setColor(iArr[iAbs >= i11 ? i11 - 1 : Math.abs((i11 / 2) - i10)]);
            }
            canvas.drawArc(this.f7327s, ((360.0f / this.f7316h) * i10) + 1.0f + ((this.f7334z - 1.0f) * this.f7318j), 0.1f, false, m6685p(this.f7312d));
        }
        for (int i12 = 0; i12 < this.f7316h; i12++) {
            if (this.f7325q) {
                Paint paint2 = this.f7312d;
                int[] iArr2 = f7305D;
                int iAbs2 = Math.abs((this.f7315g / 2) - i12);
                int i13 = this.f7315g;
                paint2.setColor(iArr2[iAbs2 >= i13 ? i13 - 1 : Math.abs((i13 / 2) - i12)]);
            }
            canvas.drawArc(this.f7328t, ((this.f7334z - 1.0f) * this.f7318j) + ((((360.0f / this.f7316h) * i12) + 1.0f) - this.f7317i), 0.1f, false, m6685p(this.f7314f));
        }
        this.f7312d.setStrokeWidth(this.f7332x * this.f7306A * (this.f7321m - this.f7308C));
        float f10 = this.f7306A;
        if (f10 != 0.0f) {
            this.f7313e.setStrokeWidth(((this.f7332x * f10) * (this.f7321m - this.f7308C)) - 8.0f);
        } else {
            this.f7313e.setStrokeWidth(0.0f);
        }
        canvas.drawPoint(this.f7330v, this.f7331w, this.f7312d);
        canvas.drawPoint(this.f7330v, this.f7331w, this.f7313e);
        if (this.f7309a == null || this.f7307B) {
            return;
        }
        this.f7307B = true;
        m6687r((ShineButton) this.f7311c.get());
    }

    /* renamed from: p */
    public final Paint m6685p(Paint paint) {
        if (this.f7326r) {
            paint.setColor(f7305D[this.f7329u.nextInt(this.f7315g - 1)]);
        }
        return paint;
    }

    /* renamed from: q */
    public final void m6686q(e eVar, ShineButton shineButton) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder, w1.a] */
    /* renamed from: r */
    public void m6687r(ShineButton shineButton) {
        if (shineButton == null) {
            return;
        }
        this.f7332x = shineButton.getWidth();
        this.f7333y = shineButton.getHeight();
        int[] iArr = new int[2];
        shineButton.getLocationInWindow(iArr);
        this.f7330v = iArr[0] + (shineButton.getWidth() / 2);
        this.f7331w = iArr[1] + (shineButton.getHeight() / 2);
        if (shineButton.getWindow() != null) {
            View decorView = shineButton.getWindow().getDecorView();
            this.f7330v -= decorView.getPaddingLeft();
            this.f7331w -= decorView.getPaddingTop();
        }
        this.f7309a.addUpdateListener(new d());
        this.f7309a.show();
        this.f7310b.start();
    }
}
