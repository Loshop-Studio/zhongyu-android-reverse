package com.xuexiang.xui.widget.button.shinebutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import java.lang.ref.WeakReference;
import java.util.Random;
import p192i8.C9614a;
import p206j8.InterpolatorC9687a;

/* loaded from: classes5.dex */
public class ShineView extends View {

    /* renamed from: F */
    public static int[] f15684F = new int[10];

    /* renamed from: A */
    public int f15685A;

    /* renamed from: B */
    public float f15686B;

    /* renamed from: C */
    public float f15687C;

    /* renamed from: D */
    public boolean f15688D;

    /* renamed from: E */
    public float f15689E;

    /* renamed from: c */
    public C9614a f15690c;

    /* renamed from: d */
    public ValueAnimator f15691d;

    /* renamed from: e */
    public WeakReference f15692e;

    /* renamed from: f */
    public Paint f15693f;

    /* renamed from: g */
    public Paint f15694g;

    /* renamed from: h */
    public Paint f15695h;

    /* renamed from: i */
    public int f15696i;

    /* renamed from: j */
    public int f15697j;

    /* renamed from: k */
    public float f15698k;

    /* renamed from: l */
    public float f15699l;

    /* renamed from: m */
    public long f15700m;

    /* renamed from: n */
    public long f15701n;

    /* renamed from: o */
    public float f15702o;

    /* renamed from: p */
    public int f15703p;

    /* renamed from: q */
    public int f15704q;

    /* renamed from: r */
    public int f15705r;

    /* renamed from: s */
    public boolean f15706s;

    /* renamed from: t */
    public boolean f15707t;

    /* renamed from: u */
    public RectF f15708u;

    /* renamed from: v */
    public RectF f15709v;

    /* renamed from: w */
    public Random f15710w;

    /* renamed from: x */
    public int f15711x;

    /* renamed from: y */
    public int f15712y;

    /* renamed from: z */
    public int f15713z;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineView$a */
    public class C8087a implements ValueAnimator.AnimatorUpdateListener {
        public C8087a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineView.this.f15687C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShineView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineView$b */
    public class C8088b extends AnimatorListenerAdapter {
        public C8088b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShineView.this.f15687C = 0.0f;
            ShineView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineView$c */
    public class C8089c extends AnimatorListenerAdapter {
        public C8089c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ShineView.this.f15692e == null || ShineView.this.f15692e.get() == null) {
                return;
            }
            ((ShineButton) ShineView.this.f15692e.get()).m12496p(ShineView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineView$d */
    public class C8090d implements ValueAnimator.AnimatorUpdateListener {
        public C8090d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineView.this.f15686B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (ShineView.this.f15705r == 0 || ShineView.this.f15705r <= 0) {
                ShineView.this.f15693f.setStrokeWidth((ShineView.this.f15713z / 2.0f) * (ShineView.this.f15702o - ShineView.this.f15686B));
                ShineView.this.f15695h.setStrokeWidth((ShineView.this.f15713z / 3.0f) * (ShineView.this.f15702o - ShineView.this.f15686B));
            } else {
                ShineView.this.f15693f.setStrokeWidth(ShineView.this.f15705r * (ShineView.this.f15702o - ShineView.this.f15686B));
                ShineView.this.f15695h.setStrokeWidth((ShineView.this.f15705r / 3.0f) * 2.0f * (ShineView.this.f15702o - ShineView.this.f15686B));
            }
            ShineView.this.f15708u.set(ShineView.this.f15711x - ((ShineView.this.f15713z / (3.0f - ShineView.this.f15702o)) * ShineView.this.f15686B), ShineView.this.f15712y - ((ShineView.this.f15685A / (3.0f - ShineView.this.f15702o)) * ShineView.this.f15686B), ShineView.this.f15711x + ((ShineView.this.f15713z / (3.0f - ShineView.this.f15702o)) * ShineView.this.f15686B), ShineView.this.f15712y + ((ShineView.this.f15685A / (3.0f - ShineView.this.f15702o)) * ShineView.this.f15686B));
            ShineView.this.f15709v.set(ShineView.this.f15711x - ((ShineView.this.f15713z / ((3.0f - ShineView.this.f15702o) + ShineView.this.f15689E)) * ShineView.this.f15686B), ShineView.this.f15712y - ((ShineView.this.f15685A / ((3.0f - ShineView.this.f15702o) + ShineView.this.f15689E)) * ShineView.this.f15686B), ShineView.this.f15711x + ((ShineView.this.f15713z / ((3.0f - ShineView.this.f15702o) + ShineView.this.f15689E)) * ShineView.this.f15686B), ShineView.this.f15712y + ((ShineView.this.f15685A / ((3.0f - ShineView.this.f15702o) + ShineView.this.f15689E)) * ShineView.this.f15686B));
            ShineView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineView$e */
    public static class C8091e {

        /* renamed from: a */
        public boolean f15718a = false;

        /* renamed from: b */
        public long f15719b = 1500;

        /* renamed from: c */
        public int f15720c = 0;

        /* renamed from: d */
        public long f15721d = 200;

        /* renamed from: e */
        public boolean f15722e = false;

        /* renamed from: f */
        public int f15723f = 7;

        /* renamed from: g */
        public float f15724g = 20.0f;

        /* renamed from: h */
        public float f15725h = 1.5f;

        /* renamed from: i */
        public float f15726i = 20.0f;

        /* renamed from: j */
        public int f15727j = 0;

        /* renamed from: k */
        public int f15728k = 0;

        public C8091e() {
            ShineView.f15684F[0] = Color.parseColor("#FFFF99");
            ShineView.f15684F[1] = Color.parseColor("#FFCCCC");
            ShineView.f15684F[2] = Color.parseColor("#996699");
            ShineView.f15684F[3] = Color.parseColor("#FF6666");
            ShineView.f15684F[4] = Color.parseColor("#FFFF66");
            ShineView.f15684F[5] = Color.parseColor("#F44336");
            ShineView.f15684F[6] = Color.parseColor("#666666");
            ShineView.f15684F[7] = Color.parseColor("#CCCC00");
            ShineView.f15684F[8] = Color.parseColor("#666666");
            ShineView.f15684F[9] = Color.parseColor("#999933");
        }
    }

    public ShineView(Context context) {
        super(context);
        this.f15696i = 10;
        int[] iArr = f15684F;
        this.f15703p = iArr[0];
        this.f15704q = iArr[1];
        this.f15705r = 0;
        this.f15706s = false;
        this.f15707t = false;
        this.f15708u = new RectF();
        this.f15709v = new RectF();
        this.f15710w = new Random();
        this.f15687C = 0.0f;
        this.f15688D = false;
        this.f15689E = 0.2f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i10 = 0; i10 < this.f15697j; i10++) {
            if (this.f15706s) {
                Paint paint = this.f15693f;
                int[] iArr = f15684F;
                int iAbs = Math.abs((this.f15696i / 2) - i10);
                int i11 = this.f15696i;
                paint.setColor(iArr[iAbs >= i11 ? i11 - 1 : Math.abs((i11 / 2) - i10)]);
            }
            canvas.drawArc(this.f15708u, ((360.0f / this.f15697j) * i10) + 1.0f + ((this.f15686B - 1.0f) * this.f15699l), 0.1f, false, m12517q(this.f15693f));
        }
        for (int i12 = 0; i12 < this.f15697j; i12++) {
            if (this.f15706s) {
                Paint paint2 = this.f15693f;
                int[] iArr2 = f15684F;
                int iAbs2 = Math.abs((this.f15696i / 2) - i12);
                int i13 = this.f15696i;
                paint2.setColor(iArr2[iAbs2 >= i13 ? i13 - 1 : Math.abs((i13 / 2) - i12)]);
            }
            canvas.drawArc(this.f15709v, ((this.f15686B - 1.0f) * this.f15699l) + ((((360.0f / this.f15697j) * i12) + 1.0f) - this.f15698k), 0.1f, false, m12517q(this.f15695h));
        }
        this.f15693f.setStrokeWidth(this.f15713z * this.f15687C * (this.f15702o - this.f15689E));
        float f10 = this.f15687C;
        if (f10 != 0.0f) {
            this.f15694g.setStrokeWidth(((this.f15713z * f10) * (this.f15702o - this.f15689E)) - 8.0f);
        } else {
            this.f15694g.setStrokeWidth(0.0f);
        }
        canvas.drawPoint(this.f15711x, this.f15712y, this.f15693f);
        canvas.drawPoint(this.f15711x, this.f15712y, this.f15694g);
        if (this.f15690c == null || this.f15688D) {
            return;
        }
        this.f15688D = true;
        m12519s((ShineButton) this.f15692e.get());
    }

    /* renamed from: q */
    public final Paint m12517q(Paint paint) {
        if (this.f15707t) {
            paint.setColor(f15684F[this.f15710w.nextInt(this.f15696i - 1)]);
        }
        return paint;
    }

    /* renamed from: r */
    public final void m12518r(C8091e c8091e, ShineButton shineButton) {
        this.f15697j = c8091e.f15723f;
        this.f15699l = c8091e.f15724g;
        this.f15698k = c8091e.f15726i;
        this.f15707t = c8091e.f15722e;
        this.f15706s = c8091e.f15718a;
        this.f15702o = c8091e.f15725h;
        this.f15700m = c8091e.f15719b;
        this.f15701n = c8091e.f15721d;
        int i10 = c8091e.f15727j;
        this.f15703p = i10;
        int i11 = c8091e.f15720c;
        this.f15704q = i11;
        this.f15705r = c8091e.f15728k;
        if (i10 == 0) {
            this.f15703p = f15684F[6];
        }
        if (i11 == 0) {
            this.f15704q = shineButton.getColor();
        }
    }

    /* renamed from: s */
    public void m12519s(ShineButton shineButton) {
        if (shineButton == null) {
            return;
        }
        this.f15713z = shineButton.getWidth();
        this.f15685A = shineButton.getHeight();
        int[] iArr = new int[2];
        shineButton.getLocationInWindow(iArr);
        this.f15711x = iArr[0] + (shineButton.getWidth() / 2);
        this.f15712y = iArr[1] + (shineButton.getHeight() / 2);
        if (shineButton.getWindow() != null) {
            View decorView = shineButton.getWindow().getDecorView();
            this.f15711x -= decorView.getPaddingLeft();
            this.f15712y -= decorView.getPaddingTop();
        }
        this.f15690c.addUpdateListener(new C8090d());
        this.f15690c.start();
        this.f15691d.start();
    }

    public ShineView(Context context, ShineButton shineButton, C8091e c8091e) {
        super(context);
        this.f15696i = 10;
        int[] iArr = f15684F;
        this.f15703p = iArr[0];
        this.f15704q = iArr[1];
        this.f15705r = 0;
        this.f15706s = false;
        this.f15707t = false;
        this.f15708u = new RectF();
        this.f15709v = new RectF();
        this.f15710w = new Random();
        this.f15687C = 0.0f;
        this.f15688D = false;
        this.f15689E = 0.2f;
        m12518r(c8091e, shineButton);
        this.f15692e = new WeakReference(shineButton);
        this.f15690c = new C9614a(this.f15700m, this.f15702o, this.f15701n);
        ValueAnimator.setFrameDelay(25L);
        Paint paint = new Paint();
        this.f15693f = paint;
        paint.setColor(this.f15704q);
        this.f15693f.setStrokeWidth(20.0f);
        Paint paint2 = this.f15693f;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.f15693f;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f15694g = paint4;
        paint4.setColor(-1);
        this.f15694g.setStrokeWidth(20.0f);
        this.f15694g.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f15695h = paint5;
        paint5.setColor(this.f15703p);
        this.f15695h.setStrokeWidth(10.0f);
        this.f15695h.setStyle(style);
        this.f15695h.setStrokeCap(cap);
        this.f15691d = ValueAnimator.ofFloat(0.0f, 1.1f);
        ValueAnimator.setFrameDelay(25L);
        this.f15691d.setDuration(this.f15701n);
        this.f15691d.setInterpolator(new InterpolatorC9687a(Ease.QUART_OUT));
        this.f15691d.addUpdateListener(new C8087a());
        this.f15691d.addListener(new C8088b());
        this.f15690c.addListener(new C8089c());
    }

    public ShineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15696i = 10;
        int[] iArr = f15684F;
        this.f15703p = iArr[0];
        this.f15704q = iArr[1];
        this.f15705r = 0;
        this.f15706s = false;
        this.f15707t = false;
        this.f15708u = new RectF();
        this.f15709v = new RectF();
        this.f15710w = new Random();
        this.f15687C = 0.0f;
        this.f15688D = false;
        this.f15689E = 0.2f;
    }

    public ShineView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15696i = 10;
        int[] iArr = f15684F;
        this.f15703p = iArr[0];
        this.f15704q = iArr[1];
        this.f15705r = 0;
        this.f15706s = false;
        this.f15707t = false;
        this.f15708u = new RectF();
        this.f15709v = new RectF();
        this.f15710w = new Random();
        this.f15687C = 0.0f;
        this.f15688D = false;
        this.f15689E = 0.2f;
    }
}
