package p070b.p074b.p075a.p076a.p088k;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000a.p031h.p035d.C0202a;
import p000a.p031h.p035d.p036l.InterfaceC0213a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p080c.C0576g;
import p070b.p074b.p075a.p076a.p093o.C0636a;
import p070b.p074b.p075a.p076a.p096r.C0654i;
import p070b.p074b.p075a.p076a.p098t.AbstractC0665d;
import p070b.p074b.p075a.p076a.p098t.C0663b;
import p070b.p074b.p075a.p076a.p098t.C0664c;
import p070b.p074b.p075a.p076a.p099u.C0666a;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;

/* renamed from: b.b.a.a.k.b */
/* loaded from: classes.dex */
public class C0601b extends C0675g implements Drawable.Callback, C0654i.b {

    /* renamed from: I0 */
    public static final int[] f3631I0 = {R.attr.state_enabled};

    /* renamed from: J0 */
    public static final ShapeDrawable f3632J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public ColorStateList f3633A;

    /* renamed from: A0 */
    public int[] f3634A0;

    /* renamed from: B */
    public float f3635B;

    /* renamed from: B0 */
    public boolean f3636B0;

    /* renamed from: C */
    public float f3637C;

    /* renamed from: C0 */
    public ColorStateList f3638C0;

    /* renamed from: D */
    public ColorStateList f3639D;

    /* renamed from: D0 */
    public WeakReference<a> f3640D0;

    /* renamed from: E */
    public float f3641E;

    /* renamed from: E0 */
    public TextUtils.TruncateAt f3642E0;

    /* renamed from: F */
    public ColorStateList f3643F;

    /* renamed from: F0 */
    public boolean f3644F0;

    /* renamed from: G */
    public CharSequence f3645G;

    /* renamed from: G0 */
    public int f3646G0;

    /* renamed from: H */
    public boolean f3647H;

    /* renamed from: H0 */
    public boolean f3648H0;

    /* renamed from: I */
    public Drawable f3649I;

    /* renamed from: J */
    public ColorStateList f3650J;

    /* renamed from: K */
    public float f3651K;

    /* renamed from: L */
    public boolean f3652L;

    /* renamed from: M */
    public boolean f3653M;

    /* renamed from: N */
    public Drawable f3654N;

    /* renamed from: O */
    public Drawable f3655O;

    /* renamed from: P */
    public ColorStateList f3656P;

    /* renamed from: Q */
    public float f3657Q;

    /* renamed from: R */
    public CharSequence f3658R;

    /* renamed from: S */
    public boolean f3659S;

    /* renamed from: T */
    public boolean f3660T;

    /* renamed from: U */
    public Drawable f3661U;

    /* renamed from: V */
    public ColorStateList f3662V;

    /* renamed from: W */
    public C0576g f3663W;

    /* renamed from: X */
    public C0576g f3664X;

    /* renamed from: Y */
    public float f3665Y;

    /* renamed from: Z */
    public float f3666Z;

    /* renamed from: a0 */
    public float f3667a0;

    /* renamed from: b0 */
    public float f3668b0;

    /* renamed from: c0 */
    public float f3669c0;

    /* renamed from: d0 */
    public float f3670d0;

    /* renamed from: e0 */
    public float f3671e0;

    /* renamed from: f0 */
    public float f3672f0;

    /* renamed from: g0 */
    public final Context f3673g0;

    /* renamed from: h0 */
    public final Paint f3674h0;

    /* renamed from: i0 */
    public final Paint.FontMetrics f3675i0;

    /* renamed from: j0 */
    public final RectF f3676j0;

    /* renamed from: k0 */
    public final PointF f3677k0;

    /* renamed from: l0 */
    public final Path f3678l0;

    /* renamed from: m0 */
    public final C0654i f3679m0;

    /* renamed from: n0 */
    public int f3680n0;

    /* renamed from: o0 */
    public int f3681o0;

    /* renamed from: p0 */
    public int f3682p0;

    /* renamed from: q0 */
    public int f3683q0;

    /* renamed from: r0 */
    public int f3684r0;

    /* renamed from: s0 */
    public int f3685s0;

    /* renamed from: t0 */
    public boolean f3686t0;

    /* renamed from: u0 */
    public int f3687u0;

    /* renamed from: v0 */
    public int f3688v0;

    /* renamed from: w0 */
    public ColorFilter f3689w0;

    /* renamed from: x0 */
    public PorterDuffColorFilter f3690x0;

    /* renamed from: y0 */
    public ColorStateList f3691y0;

    /* renamed from: z */
    public ColorStateList f3692z;

    /* renamed from: z0 */
    public PorterDuff.Mode f3693z0;

    /* renamed from: b.b.a.a.k.b$a */
    public interface a {
        /* renamed from: a */
        void mo2173a();
    }

    public C0601b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C0678j.m2305b(context, attributeSet, i, i2).m2310a());
        this.f3637C = -1.0f;
        this.f3674h0 = new Paint(1);
        this.f3675i0 = new Paint.FontMetrics();
        this.f3676j0 = new RectF();
        this.f3677k0 = new PointF();
        this.f3678l0 = new Path();
        this.f3688v0 = 255;
        this.f3693z0 = PorterDuff.Mode.SRC_IN;
        this.f3640D0 = new WeakReference<>(null);
        this.f3998b.f4022b = new C0636a(context);
        m2303w();
        this.f3673g0 = context;
        C0654i c0654i = new C0654i(this);
        this.f3679m0 = c0654i;
        this.f3645G = BuildConfig.FLAVOR;
        c0654i.f3940a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f3631I0;
        setState(iArr);
        m2155c0(iArr);
        this.f3644F0 = true;
        int[] iArr2 = C0666a.f3979a;
        f3632J0.setTint(-1);
    }

    /* renamed from: F */
    public static boolean m2126F(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: G */
    public static boolean m2127G(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m2128A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2168p0()) {
            float f2 = this.f3672f0 + this.f3671e0;
            if (getLayoutDirection() == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.f3657Q;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.f3657Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.f3657Q;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    /* renamed from: B */
    public final void m2129B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2168p0()) {
            float f2 = this.f3672f0 + this.f3671e0 + this.f3657Q + this.f3670d0 + this.f3669c0;
            if (getLayoutDirection() == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: C */
    public float m2130C() {
        if (m2168p0()) {
            return this.f3670d0 + this.f3657Q + this.f3671e0;
        }
        return 0.0f;
    }

    /* renamed from: D */
    public float m2131D() {
        return this.f3648H0 ? m2292l() : this.f3637C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public Drawable m2132E() {
        Drawable drawable = this.f3654N;
        if (drawable != 0) {
            return drawable instanceof InterfaceC0213a ? ((InterfaceC0213a) drawable).m786a() : drawable;
        }
        return null;
    }

    /* renamed from: H */
    public void m2133H() {
        a aVar = this.f3640D0.get();
        if (aVar != null) {
            aVar.mo2173a();
        }
    }

    /* renamed from: I */
    public final boolean m2134I(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f3692z;
        int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f3680n0) : 0;
        boolean state = true;
        if (this.f3680n0 != colorForState) {
            this.f3680n0 = colorForState;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f3633A;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f3681o0) : 0;
        if (this.f3681o0 != colorForState2) {
            this.f3681o0 = colorForState2;
            zOnStateChange = true;
        }
        int iM755a = C0202a.m755a(colorForState2, colorForState);
        if ((this.f3682p0 != iM755a) | (this.f3998b.f4024d == null)) {
            this.f3682p0 = iM755a;
            m2296p(ColorStateList.valueOf(iM755a));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f3639D;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f3683q0) : 0;
        if (this.f3683q0 != colorForState3) {
            this.f3683q0 = colorForState3;
            zOnStateChange = true;
        }
        int colorForState4 = (this.f3638C0 == null || !C0666a.m2277b(iArr)) ? 0 : this.f3638C0.getColorForState(iArr, this.f3684r0);
        if (this.f3684r0 != colorForState4) {
            this.f3684r0 = colorForState4;
            if (this.f3636B0) {
                zOnStateChange = true;
            }
        }
        C0663b c0663b = this.f3679m0.f3945f;
        int colorForState5 = (c0663b == null || (colorStateList = c0663b.f3963b) == null) ? 0 : colorStateList.getColorForState(iArr, this.f3685s0);
        if (this.f3685s0 != colorForState5) {
            this.f3685s0 = colorForState5;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            for (int i : state2) {
                if (i == 16842912) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z3 = z && this.f3659S;
        if (this.f3686t0 == z3 || this.f3661U == null) {
            z2 = false;
        } else {
            float fM2172z = m2172z();
            this.f3686t0 = z3;
            if (fM2172z != m2172z()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f3691y0;
        int colorForState6 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f3687u0) : 0;
        if (this.f3687u0 != colorForState6) {
            this.f3687u0 = colorForState6;
            this.f3690x0 = C0562a.m2099t(this, this.f3691y0, this.f3693z0);
        } else {
            state = zOnStateChange;
        }
        if (m2127G(this.f3649I)) {
            state |= this.f3649I.setState(iArr);
        }
        if (m2127G(this.f3661U)) {
            state |= this.f3661U.setState(iArr);
        }
        if (m2127G(this.f3654N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f3654N.setState(iArr3);
        }
        int[] iArr4 = C0666a.f3979a;
        if (m2127G(this.f3655O)) {
            state |= this.f3655O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m2133H();
        }
        return state;
    }

    /* renamed from: J */
    public void m2135J(boolean z) {
        if (this.f3659S != z) {
            this.f3659S = z;
            float fM2172z = m2172z();
            if (!z && this.f3686t0) {
                this.f3686t0 = false;
            }
            float fM2172z2 = m2172z();
            invalidateSelf();
            if (fM2172z != fM2172z2) {
                m2133H();
            }
        }
    }

    /* renamed from: K */
    public void m2136K(Drawable drawable) {
        if (this.f3661U != drawable) {
            float fM2172z = m2172z();
            this.f3661U = drawable;
            float fM2172z2 = m2172z();
            m2169q0(this.f3661U);
            m2170x(this.f3661U);
            invalidateSelf();
            if (fM2172z != fM2172z2) {
                m2133H();
            }
        }
    }

    /* renamed from: L */
    public void m2137L(ColorStateList colorStateList) {
        if (this.f3662V != colorStateList) {
            this.f3662V = colorStateList;
            if (this.f3660T && this.f3661U != null && this.f3659S) {
                this.f3661U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public void m2138M(boolean z) {
        if (this.f3660T != z) {
            boolean zM2166n0 = m2166n0();
            this.f3660T = z;
            boolean zM2166n02 = m2166n0();
            if (zM2166n0 != zM2166n02) {
                if (zM2166n02) {
                    m2170x(this.f3661U);
                } else {
                    m2169q0(this.f3661U);
                }
                invalidateSelf();
                m2133H();
            }
        }
    }

    /* renamed from: N */
    public void m2139N(ColorStateList colorStateList) {
        if (this.f3633A != colorStateList) {
            this.f3633A = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* renamed from: O */
    public void m2140O(float f2) {
        if (this.f3637C != f2) {
            this.f3637C = f2;
            this.f3998b.f4021a = this.f3998b.f4021a.m2308e(f2);
            invalidateSelf();
        }
    }

    /* renamed from: P */
    public void m2141P(float f2) {
        if (this.f3672f0 != f2) {
            this.f3672f0 = f2;
            invalidateSelf();
            m2133H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public void m2142Q(Drawable drawable) {
        Drawable drawableM786a;
        Drawable drawable2 = this.f3649I;
        if (drawable2 != 0) {
            boolean z = drawable2 instanceof InterfaceC0213a;
            drawableM786a = drawable2;
            if (z) {
                drawableM786a = ((InterfaceC0213a) drawable2).m786a();
            }
        } else {
            drawableM786a = null;
        }
        if (drawableM786a != drawable) {
            float fM2172z = m2172z();
            this.f3649I = drawable != null ? drawable.mutate() : null;
            float fM2172z2 = m2172z();
            m2169q0(drawableM786a);
            if (m2167o0()) {
                m2170x(this.f3649I);
            }
            invalidateSelf();
            if (fM2172z != fM2172z2) {
                m2133H();
            }
        }
    }

    /* renamed from: R */
    public void m2143R(float f2) {
        if (this.f3651K != f2) {
            float fM2172z = m2172z();
            this.f3651K = f2;
            float fM2172z2 = m2172z();
            invalidateSelf();
            if (fM2172z != fM2172z2) {
                m2133H();
            }
        }
    }

    /* renamed from: S */
    public void m2144S(ColorStateList colorStateList) {
        this.f3652L = true;
        if (this.f3650J != colorStateList) {
            this.f3650J = colorStateList;
            if (m2167o0()) {
                this.f3649I.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: T */
    public void m2145T(boolean z) {
        if (this.f3647H != z) {
            boolean zM2167o0 = m2167o0();
            this.f3647H = z;
            boolean zM2167o02 = m2167o0();
            if (zM2167o0 != zM2167o02) {
                if (zM2167o02) {
                    m2170x(this.f3649I);
                } else {
                    m2169q0(this.f3649I);
                }
                invalidateSelf();
                m2133H();
            }
        }
    }

    /* renamed from: U */
    public void m2146U(float f2) {
        if (this.f3635B != f2) {
            this.f3635B = f2;
            invalidateSelf();
            m2133H();
        }
    }

    /* renamed from: V */
    public void m2147V(float f2) {
        if (this.f3665Y != f2) {
            this.f3665Y = f2;
            invalidateSelf();
            m2133H();
        }
    }

    /* renamed from: W */
    public void m2148W(ColorStateList colorStateList) {
        if (this.f3639D != colorStateList) {
            this.f3639D = colorStateList;
            if (this.f3648H0) {
                m2300t(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: X */
    public void m2149X(float f2) {
        if (this.f3641E != f2) {
            this.f3641E = f2;
            this.f3674h0.setStrokeWidth(f2);
            if (this.f3648H0) {
                this.f3998b.f4032l = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: Y */
    public void m2150Y(Drawable drawable) {
        Drawable drawableM2132E = m2132E();
        if (drawableM2132E != drawable) {
            float fM2130C = m2130C();
            this.f3654N = drawable != null ? drawable.mutate() : null;
            int[] iArr = C0666a.f3979a;
            this.f3655O = new RippleDrawable(C0666a.m2276a(this.f3643F), this.f3654N, f3632J0);
            float fM2130C2 = m2130C();
            m2169q0(drawableM2132E);
            if (m2168p0()) {
                m2170x(this.f3654N);
            }
            invalidateSelf();
            if (fM2130C != fM2130C2) {
                m2133H();
            }
        }
    }

    /* renamed from: Z */
    public void m2151Z(float f2) {
        if (this.f3671e0 != f2) {
            this.f3671e0 = f2;
            invalidateSelf();
            if (m2168p0()) {
                m2133H();
            }
        }
    }

    @Override // p070b.p074b.p075a.p076a.p096r.C0654i.b
    /* renamed from: a */
    public void mo2152a() {
        m2133H();
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void m2153a0(float f2) {
        if (this.f3657Q != f2) {
            this.f3657Q = f2;
            invalidateSelf();
            if (m2168p0()) {
                m2133H();
            }
        }
    }

    /* renamed from: b0 */
    public void m2154b0(float f2) {
        if (this.f3670d0 != f2) {
            this.f3670d0 = f2;
            invalidateSelf();
            if (m2168p0()) {
                m2133H();
            }
        }
    }

    /* renamed from: c0 */
    public boolean m2155c0(int[] iArr) {
        if (Arrays.equals(this.f3634A0, iArr)) {
            return false;
        }
        this.f3634A0 = iArr;
        if (m2168p0()) {
            return m2134I(getState(), iArr);
        }
        return false;
    }

    /* renamed from: d0 */
    public void m2156d0(ColorStateList colorStateList) {
        if (this.f3656P != colorStateList) {
            this.f3656P = colorStateList;
            if (m2168p0()) {
                this.f3654N.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int iSave;
        float f2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f3688v0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        if (!this.f3648H0) {
            this.f3674h0.setColor(this.f3680n0);
            this.f3674h0.setStyle(Paint.Style.FILL);
            this.f3676j0.set(bounds);
            canvas.drawRoundRect(this.f3676j0, m2131D(), m2131D(), this.f3674h0);
        }
        if (!this.f3648H0) {
            this.f3674h0.setColor(this.f3681o0);
            this.f3674h0.setStyle(Paint.Style.FILL);
            Paint paint = this.f3674h0;
            ColorFilter colorFilter = this.f3689w0;
            if (colorFilter == null) {
                colorFilter = this.f3690x0;
            }
            paint.setColorFilter(colorFilter);
            this.f3676j0.set(bounds);
            canvas.drawRoundRect(this.f3676j0, m2131D(), m2131D(), this.f3674h0);
        }
        if (this.f3648H0) {
            super.draw(canvas);
        }
        if (this.f3641E > 0.0f && !this.f3648H0) {
            this.f3674h0.setColor(this.f3683q0);
            this.f3674h0.setStyle(Paint.Style.STROKE);
            if (!this.f3648H0) {
                Paint paint2 = this.f3674h0;
                ColorFilter colorFilter2 = this.f3689w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f3690x0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f3676j0;
            float f3 = bounds.left;
            float f4 = this.f3641E / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.f3637C - (this.f3641E / 2.0f);
            canvas.drawRoundRect(this.f3676j0, f5, f5, this.f3674h0);
        }
        this.f3674h0.setColor(this.f3684r0);
        this.f3674h0.setStyle(Paint.Style.FILL);
        this.f3676j0.set(bounds);
        if (this.f3648H0) {
            m2283c(new RectF(bounds), this.f3678l0);
            m2287g(canvas, this.f3674h0, this.f3678l0, this.f3998b.f4021a, m2288h());
        } else {
            canvas.drawRoundRect(this.f3676j0, m2131D(), m2131D(), this.f3674h0);
        }
        if (m2167o0()) {
            m2171y(bounds, this.f3676j0);
            RectF rectF2 = this.f3676j0;
            float f6 = rectF2.left;
            float f7 = rectF2.top;
            canvas.translate(f6, f7);
            this.f3649I.setBounds(0, 0, (int) this.f3676j0.width(), (int) this.f3676j0.height());
            this.f3649I.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (m2166n0()) {
            m2171y(bounds, this.f3676j0);
            RectF rectF3 = this.f3676j0;
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f3661U.setBounds(0, 0, (int) this.f3676j0.width(), (int) this.f3676j0.height());
            this.f3661U.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.f3644F0 || this.f3645G == null) {
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f3677k0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f3645G != null) {
                float fM2172z = m2172z() + this.f3665Y + this.f3668b0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM2172z;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fM2172z;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                this.f3679m0.f3940a.getFontMetrics(this.f3675i0);
                Paint.FontMetrics fontMetrics = this.f3675i0;
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.f3676j0;
            rectF4.setEmpty();
            if (this.f3645G != null) {
                float fM2172z2 = m2172z() + this.f3665Y + this.f3668b0;
                float fM2130C = m2130C() + this.f3672f0 + this.f3669c0;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + fM2172z2;
                    f2 = bounds.right - fM2130C;
                } else {
                    rectF4.left = bounds.left + fM2130C;
                    f2 = bounds.right - fM2172z2;
                }
                rectF4.right = f2;
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            C0654i c0654i = this.f3679m0;
            if (c0654i.f3945f != null) {
                c0654i.f3940a.drawableState = getState();
                C0654i c0654i2 = this.f3679m0;
                c0654i2.f3945f.m2274c(this.f3673g0, c0654i2.f3940a, c0654i2.f3941b);
            }
            this.f3679m0.f3940a.setTextAlign(align);
            boolean z = Math.round(this.f3679m0.m2263a(this.f3645G.toString())) > Math.round(this.f3676j0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.f3676j0);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f3645G;
            if (z && this.f3642E0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f3679m0.f3940a, this.f3676j0.width(), this.f3642E0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF2 = this.f3677k0;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.f3679m0.f3940a);
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
        if (m2168p0()) {
            m2128A(bounds, this.f3676j0);
            RectF rectF5 = this.f3676j0;
            float f10 = rectF5.left;
            float f11 = rectF5.top;
            canvas.translate(f10, f11);
            this.f3654N.setBounds(i3, i3, (int) this.f3676j0.width(), (int) this.f3676j0.height());
            int[] iArr = C0666a.f3979a;
            this.f3655O.setBounds(this.f3654N.getBounds());
            this.f3655O.jumpToCurrentState();
            this.f3655O.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (this.f3688v0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    /* renamed from: e0 */
    public void m2157e0(boolean z) {
        if (this.f3653M != z) {
            boolean zM2168p0 = m2168p0();
            this.f3653M = z;
            boolean zM2168p02 = m2168p0();
            if (zM2168p0 != zM2168p02) {
                if (zM2168p02) {
                    m2170x(this.f3654N);
                } else {
                    m2169q0(this.f3654N);
                }
                invalidateSelf();
                m2133H();
            }
        }
    }

    /* renamed from: f0 */
    public void m2158f0(float f2) {
        if (this.f3667a0 != f2) {
            float fM2172z = m2172z();
            this.f3667a0 = f2;
            float fM2172z2 = m2172z();
            invalidateSelf();
            if (fM2172z != fM2172z2) {
                m2133H();
            }
        }
    }

    /* renamed from: g0 */
    public void m2159g0(float f2) {
        if (this.f3666Z != f2) {
            float fM2172z = m2172z();
            this.f3666Z = f2;
            float fM2172z2 = m2172z();
            invalidateSelf();
            if (fM2172z != fM2172z2) {
                m2133H();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3688v0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f3689w0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f3635B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(m2130C() + this.f3679m0.m2263a(this.f3645G.toString()) + m2172z() + this.f3665Y + this.f3668b0 + this.f3669c0 + this.f3672f0), this.f3646G0);
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f3648H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f3635B, this.f3637C);
        } else {
            outline.setRoundRect(bounds, this.f3637C);
        }
        outline.setAlpha(this.f3688v0 / 255.0f);
    }

    /* renamed from: h0 */
    public void m2160h0(ColorStateList colorStateList) {
        if (this.f3643F != colorStateList) {
            this.f3643F = colorStateList;
            this.f3638C0 = this.f3636B0 ? C0666a.m2276a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: i0 */
    public void m2161i0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.f3645G, charSequence)) {
            return;
        }
        this.f3645G = charSequence;
        this.f3679m0.f3943d = true;
        invalidateSelf();
        m2133H();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!m2126F(this.f3692z) && !m2126F(this.f3633A) && !m2126F(this.f3639D) && (!this.f3636B0 || !m2126F(this.f3638C0))) {
            C0663b c0663b = this.f3679m0.f3945f;
            if (!((c0663b == null || (colorStateList = c0663b.f3963b) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.f3660T && this.f3661U != null && this.f3659S) && !m2127G(this.f3649I) && !m2127G(this.f3661U) && !m2126F(this.f3691y0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: j0 */
    public void m2162j0(C0663b c0663b) {
        C0654i c0654i = this.f3679m0;
        Context context = this.f3673g0;
        if (c0654i.f3945f != c0663b) {
            c0654i.f3945f = c0663b;
            if (c0663b != null) {
                TextPaint textPaint = c0654i.f3940a;
                AbstractC0665d abstractC0665d = c0654i.f3941b;
                c0663b.m2272a();
                c0663b.m2275d(textPaint, c0663b.f3973l);
                c0663b.m2273b(context, new C0664c(c0663b, textPaint, abstractC0665d));
                C0654i.b bVar = c0654i.f3944e.get();
                if (bVar != null) {
                    c0654i.f3940a.drawableState = bVar.getState();
                }
                c0663b.m2274c(context, c0654i.f3940a, c0654i.f3941b);
                c0654i.f3943d = true;
            }
            C0654i.b bVar2 = c0654i.f3944e.get();
            if (bVar2 != null) {
                bVar2.mo2152a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: k0 */
    public void m2163k0(float f2) {
        if (this.f3669c0 != f2) {
            this.f3669c0 = f2;
            invalidateSelf();
            m2133H();
        }
    }

    /* renamed from: l0 */
    public void m2164l0(float f2) {
        if (this.f3668b0 != f2) {
            this.f3668b0 = f2;
            invalidateSelf();
            m2133H();
        }
    }

    /* renamed from: m0 */
    public void m2165m0(boolean z) {
        if (this.f3636B0 != z) {
            this.f3636B0 = z;
            this.f3638C0 = z ? C0666a.m2276a(this.f3643F) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: n0 */
    public final boolean m2166n0() {
        return this.f3660T && this.f3661U != null && this.f3686t0;
    }

    /* renamed from: o0 */
    public final boolean m2167o0() {
        return this.f3647H && this.f3649I != null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m2167o0()) {
            zOnLayoutDirectionChanged |= this.f3649I.setLayoutDirection(i);
        }
        if (m2166n0()) {
            zOnLayoutDirectionChanged |= this.f3661U.setLayoutDirection(i);
        }
        if (m2168p0()) {
            zOnLayoutDirectionChanged |= this.f3654N.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m2167o0()) {
            zOnLevelChange |= this.f3649I.setLevel(i);
        }
        if (m2166n0()) {
            zOnLevelChange |= this.f3661U.setLevel(i);
        }
        if (m2168p0()) {
            zOnLevelChange |= this.f3654N.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable, p070b.p074b.p075a.p076a.p096r.C0654i.b
    public boolean onStateChange(int[] iArr) {
        if (this.f3648H0) {
            super.onStateChange(iArr);
        }
        return m2134I(iArr, this.f3634A0);
    }

    /* renamed from: p0 */
    public final boolean m2168p0() {
        return this.f3653M && this.f3654N != null;
    }

    /* renamed from: q0 */
    public final void m2169q0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f3688v0 != i) {
            this.f3688v0 = i;
            invalidateSelf();
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f3689w0 != colorFilter) {
            this.f3689w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f3691y0 != colorStateList) {
            this.f3691y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f3693z0 != mode) {
            this.f3693z0 = mode;
            this.f3690x0 = C0562a.m2099t(this, this.f3691y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m2167o0()) {
            visible |= this.f3649I.setVisible(z, z2);
        }
        if (m2166n0()) {
            visible |= this.f3661U.setVisible(z, z2);
        }
        if (m2168p0()) {
            visible |= this.f3654N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: x */
    public final void m2170x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f3654N) {
            if (drawable.isStateful()) {
                drawable.setState(this.f3634A0);
            }
            drawable.setTintList(this.f3656P);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f3649I;
        if (drawable == drawable2 && this.f3652L) {
            drawable2.setTintList(this.f3650J);
        }
    }

    /* renamed from: y */
    public final void m2171y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2167o0() || m2166n0()) {
            float f2 = this.f3665Y + this.f3666Z;
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + this.f3651K;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - this.f3651K;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.f3651K;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    /* renamed from: z */
    public float m2172z() {
        if (m2167o0() || m2166n0()) {
            return this.f3666Z + this.f3651K + this.f3667a0;
        }
        return 0.0f;
    }
}
