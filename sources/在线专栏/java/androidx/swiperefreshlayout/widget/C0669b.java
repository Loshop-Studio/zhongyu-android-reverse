package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p011b0.C1025h;
import p104j0.C2687b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes.dex */
public class C0669b extends Drawable implements Animatable {

    /* renamed from: g */
    private static final Interpolator f4223g = new LinearInterpolator();

    /* renamed from: h */
    private static final Interpolator f4224h = new C2687b();

    /* renamed from: i */
    private static final int[] f4225i = {IGoodView.DEFAULT_TEXT_COLOR};

    /* renamed from: a */
    private final c f4226a;

    /* renamed from: b */
    private float f4227b;

    /* renamed from: c */
    private Resources f4228c;

    /* renamed from: d */
    private Animator f4229d;

    /* renamed from: e */
    float f4230e;

    /* renamed from: f */
    boolean f4231f;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ c f4232a;

        a(c cVar) {
            this.f4232a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0669b.this.m3732n(fFloatValue, this.f4232a);
            C0669b.this.m3724b(fFloatValue, this.f4232a, false);
            C0669b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    class b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ c f4234a;

        b(c cVar) {
            this.f4234a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C0669b.this.m3724b(1.0f, this.f4234a, true);
            this.f4234a.m3733A();
            this.f4234a.m3745l();
            C0669b c0669b = C0669b.this;
            if (!c0669b.f4231f) {
                c0669b.f4230e += 1.0f;
                return;
            }
            c0669b.f4231f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f4234a.m3757x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0669b.this.f4230e = IGoodView.DEFAULT_TO_ALPHA;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    private static class c {

        /* renamed from: a */
        final RectF f4236a = new RectF();

        /* renamed from: b */
        final Paint f4237b;

        /* renamed from: c */
        final Paint f4238c;

        /* renamed from: d */
        final Paint f4239d;

        /* renamed from: e */
        float f4240e;

        /* renamed from: f */
        float f4241f;

        /* renamed from: g */
        float f4242g;

        /* renamed from: h */
        float f4243h;

        /* renamed from: i */
        int[] f4244i;

        /* renamed from: j */
        int f4245j;

        /* renamed from: k */
        float f4246k;

        /* renamed from: l */
        float f4247l;

        /* renamed from: m */
        float f4248m;

        /* renamed from: n */
        boolean f4249n;

        /* renamed from: o */
        Path f4250o;

        /* renamed from: p */
        float f4251p;

        /* renamed from: q */
        float f4252q;

        /* renamed from: r */
        int f4253r;

        /* renamed from: s */
        int f4254s;

        /* renamed from: t */
        int f4255t;

        /* renamed from: u */
        int f4256u;

        c() {
            Paint paint = new Paint();
            this.f4237b = paint;
            Paint paint2 = new Paint();
            this.f4238c = paint2;
            Paint paint3 = new Paint();
            this.f4239d = paint3;
            this.f4240e = IGoodView.DEFAULT_TO_ALPHA;
            this.f4241f = IGoodView.DEFAULT_TO_ALPHA;
            this.f4242g = IGoodView.DEFAULT_TO_ALPHA;
            this.f4243h = 5.0f;
            this.f4251p = 1.0f;
            this.f4255t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m3733A() {
            this.f4246k = this.f4240e;
            this.f4247l = this.f4241f;
            this.f4248m = this.f4242g;
        }

        /* renamed from: a */
        void m3734a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4236a;
            float f4 = this.f4252q;
            float fMin = (this.f4243h / 2.0f) + f4;
            if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f4253r * this.f4251p) / 2.0f, this.f4243h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f5 = this.f4240e;
            float f6 = this.f4242g;
            float f7 = (f5 + f6) * 360.0f;
            float f8 = ((this.f4241f + f6) * 360.0f) - f7;
            this.f4237b.setColor(this.f4256u);
            this.f4237b.setAlpha(this.f4255t);
            float f9 = this.f4243h / 2.0f;
            rectF.inset(f9, f9);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4239d);
            float f10 = -f9;
            rectF.inset(f10, f10);
            canvas.drawArc(rectF, f7, f8, false, this.f4237b);
            m3735b(canvas, f7, f8, rectF);
        }

        /* renamed from: b */
        void m3735b(Canvas canvas, float f4, float f5, RectF rectF) {
            if (this.f4249n) {
                Path path = this.f4250o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4250o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f6 = (this.f4253r * this.f4251p) / 2.0f;
                this.f4250o.moveTo(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
                this.f4250o.lineTo(this.f4253r * this.f4251p, IGoodView.DEFAULT_TO_ALPHA);
                Path path3 = this.f4250o;
                float f7 = this.f4253r;
                float f8 = this.f4251p;
                path3.lineTo((f7 * f8) / 2.0f, this.f4254s * f8);
                this.f4250o.offset((fMin + rectF.centerX()) - f6, rectF.centerY() + (this.f4243h / 2.0f));
                this.f4250o.close();
                this.f4238c.setColor(this.f4256u);
                this.f4238c.setAlpha(this.f4255t);
                canvas.save();
                canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4250o, this.f4238c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m3736c() {
            return this.f4255t;
        }

        /* renamed from: d */
        float m3737d() {
            return this.f4241f;
        }

        /* renamed from: e */
        int m3738e() {
            return this.f4244i[m3739f()];
        }

        /* renamed from: f */
        int m3739f() {
            return (this.f4245j + 1) % this.f4244i.length;
        }

        /* renamed from: g */
        float m3740g() {
            return this.f4240e;
        }

        /* renamed from: h */
        int m3741h() {
            return this.f4244i[this.f4245j];
        }

        /* renamed from: i */
        float m3742i() {
            return this.f4247l;
        }

        /* renamed from: j */
        float m3743j() {
            return this.f4248m;
        }

        /* renamed from: k */
        float m3744k() {
            return this.f4246k;
        }

        /* renamed from: l */
        void m3745l() {
            m3753t(m3739f());
        }

        /* renamed from: m */
        void m3746m() {
            this.f4246k = IGoodView.DEFAULT_TO_ALPHA;
            this.f4247l = IGoodView.DEFAULT_TO_ALPHA;
            this.f4248m = IGoodView.DEFAULT_TO_ALPHA;
            m3758y(IGoodView.DEFAULT_TO_ALPHA);
            m3755v(IGoodView.DEFAULT_TO_ALPHA);
            m3756w(IGoodView.DEFAULT_TO_ALPHA);
        }

        /* renamed from: n */
        void m3747n(int i4) {
            this.f4255t = i4;
        }

        /* renamed from: o */
        void m3748o(float f4, float f5) {
            this.f4253r = (int) f4;
            this.f4254s = (int) f5;
        }

        /* renamed from: p */
        void m3749p(float f4) {
            if (f4 != this.f4251p) {
                this.f4251p = f4;
            }
        }

        /* renamed from: q */
        void m3750q(float f4) {
            this.f4252q = f4;
        }

        /* renamed from: r */
        void m3751r(int i4) {
            this.f4256u = i4;
        }

        /* renamed from: s */
        void m3752s(ColorFilter colorFilter) {
            this.f4237b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m3753t(int i4) {
            this.f4245j = i4;
            this.f4256u = this.f4244i[i4];
        }

        /* renamed from: u */
        void m3754u(int[] iArr) {
            this.f4244i = iArr;
            m3753t(0);
        }

        /* renamed from: v */
        void m3755v(float f4) {
            this.f4241f = f4;
        }

        /* renamed from: w */
        void m3756w(float f4) {
            this.f4242g = f4;
        }

        /* renamed from: x */
        void m3757x(boolean z3) {
            if (this.f4249n != z3) {
                this.f4249n = z3;
            }
        }

        /* renamed from: y */
        void m3758y(float f4) {
            this.f4240e = f4;
        }

        /* renamed from: z */
        void m3759z(float f4) {
            this.f4243h = f4;
            this.f4237b.setStrokeWidth(f4);
        }
    }

    public C0669b(Context context) {
        this.f4228c = ((Context) C1025h.m4782f(context)).getResources();
        c cVar = new c();
        this.f4226a = cVar;
        cVar.m3754u(f4225i);
        m3730k(2.5f);
        m3723m();
    }

    /* renamed from: a */
    private void m3719a(float f4, c cVar) {
        m3732n(f4, cVar);
        float fFloor = (float) (Math.floor(cVar.m3743j() / 0.8f) + 1.0d);
        cVar.m3758y(cVar.m3744k() + (((cVar.m3742i() - 0.01f) - cVar.m3744k()) * f4));
        cVar.m3755v(cVar.m3742i());
        cVar.m3756w(cVar.m3743j() + ((fFloor - cVar.m3743j()) * f4));
    }

    /* renamed from: c */
    private int m3720c(float f4, int i4, int i5) {
        return ((((i4 >> 24) & 255) + ((int) ((((i5 >> 24) & 255) - r0) * f4))) << 24) | ((((i4 >> 16) & 255) + ((int) ((((i5 >> 16) & 255) - r1) * f4))) << 16) | ((((i4 >> 8) & 255) + ((int) ((((i5 >> 8) & 255) - r2) * f4))) << 8) | ((i4 & 255) + ((int) (f4 * ((i5 & 255) - r8))));
    }

    /* renamed from: h */
    private void m3721h(float f4) {
        this.f4227b = f4;
    }

    /* renamed from: i */
    private void m3722i(float f4, float f5, float f6, float f7) {
        c cVar = this.f4226a;
        float f8 = this.f4228c.getDisplayMetrics().density;
        cVar.m3759z(f5 * f8);
        cVar.m3750q(f4 * f8);
        cVar.m3753t(0);
        cVar.m3748o(f6 * f8, f7 * f8);
    }

    /* renamed from: m */
    private void m3723m() {
        c cVar = this.f4226a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f4223g);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f4229d = valueAnimatorOfFloat;
    }

    /* renamed from: b */
    void m3724b(float f4, c cVar, boolean z3) {
        float interpolation;
        float interpolation2;
        if (this.f4231f) {
            m3719a(f4, cVar);
            return;
        }
        if (f4 != 1.0f || z3) {
            float fM3743j = cVar.m3743j();
            if (f4 < 0.5f) {
                interpolation = cVar.m3744k();
                interpolation2 = (f4224h.getInterpolation(f4 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM3744k = cVar.m3744k() + 0.79f;
                interpolation = fM3744k - (((1.0f - f4224h.getInterpolation((f4 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM3744k;
            }
            float f5 = fM3743j + (0.20999998f * f4);
            float f6 = (f4 + this.f4230e) * 216.0f;
            cVar.m3758y(interpolation);
            cVar.m3755v(interpolation2);
            cVar.m3756w(f5);
            m3721h(f6);
        }
    }

    /* renamed from: d */
    public void m3725d(boolean z3) {
        this.f4226a.m3757x(z3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4227b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4226a.m3734a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m3726e(float f4) {
        this.f4226a.m3749p(f4);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m3727f(int... iArr) {
        this.f4226a.m3754u(iArr);
        this.f4226a.m3753t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m3728g(float f4) {
        this.f4226a.m3756w(f4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4226a.m3736c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4229d.isRunning();
    }

    /* renamed from: j */
    public void m3729j(float f4, float f5) {
        this.f4226a.m3758y(f4);
        this.f4226a.m3755v(f5);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m3730k(float f4) {
        this.f4226a.m3759z(f4);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m3731l(int i4) {
        if (i4 == 0) {
            m3722i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m3722i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: n */
    void m3732n(float f4, c cVar) {
        if (f4 > 0.75f) {
            cVar.m3751r(m3720c((f4 - 0.75f) / 0.25f, cVar.m3741h(), cVar.m3738e()));
        } else {
            cVar.m3751r(cVar.m3741h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f4226a.m3747n(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4226a.m3752s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4229d.cancel();
        this.f4226a.m3733A();
        if (this.f4226a.m3737d() != this.f4226a.m3740g()) {
            this.f4231f = true;
            this.f4229d.setDuration(666L);
            this.f4229d.start();
        } else {
            this.f4226a.m3753t(0);
            this.f4226a.m3746m();
            this.f4229d.setDuration(1332L);
            this.f4229d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4229d.cancel();
        m3721h(IGoodView.DEFAULT_TO_ALPHA);
        this.f4226a.m3757x(false);
        this.f4226a.m3753t(0);
        this.f4226a.m3746m();
        invalidateSelf();
    }
}
