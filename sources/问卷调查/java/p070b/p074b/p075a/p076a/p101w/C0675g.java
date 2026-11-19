package p070b.p074b.p075a.p076a.p101w;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import p000a.p031h.p035d.C0202a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p093o.C0636a;
import p070b.p074b.p075a.p076a.p100v.C0667a;
import p070b.p074b.p075a.p076a.p101w.C0679k;
import p070b.p074b.p075a.p076a.p101w.C0681m;

/* renamed from: b.b.a.a.w.g */
/* loaded from: classes.dex */
public class C0675g extends Drawable implements InterfaceC0682n {

    /* renamed from: x */
    public static final String f3996x = C0675g.class.getSimpleName();

    /* renamed from: y */
    public static final Paint f3997y = new Paint(1);

    /* renamed from: b */
    public b f3998b;

    /* renamed from: c */
    public final C0681m.f[] f3999c;

    /* renamed from: d */
    public final C0681m.f[] f4000d;

    /* renamed from: e */
    public final BitSet f4001e;

    /* renamed from: f */
    public boolean f4002f;

    /* renamed from: g */
    public final Matrix f4003g;

    /* renamed from: h */
    public final Path f4004h;

    /* renamed from: i */
    public final Path f4005i;

    /* renamed from: j */
    public final RectF f4006j;

    /* renamed from: k */
    public final RectF f4007k;

    /* renamed from: l */
    public final Region f4008l;

    /* renamed from: m */
    public final Region f4009m;

    /* renamed from: n */
    public C0678j f4010n;

    /* renamed from: o */
    public final Paint f4011o;

    /* renamed from: p */
    public final Paint f4012p;

    /* renamed from: q */
    public final C0667a f4013q;

    /* renamed from: r */
    public final C0679k.a f4014r;

    /* renamed from: s */
    public final C0679k f4015s;

    /* renamed from: t */
    public PorterDuffColorFilter f4016t;

    /* renamed from: u */
    public PorterDuffColorFilter f4017u;

    /* renamed from: v */
    public final RectF f4018v;

    /* renamed from: w */
    public boolean f4019w;

    /* renamed from: b.b.a.a.w.g$a */
    public class a implements C0679k.a {
        public a() {
        }
    }

    /* renamed from: b.b.a.a.w.g$b */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        public C0678j f4021a;

        /* renamed from: b */
        public C0636a f4022b;

        /* renamed from: c */
        public ColorFilter f4023c;

        /* renamed from: d */
        public ColorStateList f4024d;

        /* renamed from: e */
        public ColorStateList f4025e;

        /* renamed from: f */
        public ColorStateList f4026f;

        /* renamed from: g */
        public ColorStateList f4027g;

        /* renamed from: h */
        public PorterDuff.Mode f4028h;

        /* renamed from: i */
        public Rect f4029i;

        /* renamed from: j */
        public float f4030j;

        /* renamed from: k */
        public float f4031k;

        /* renamed from: l */
        public float f4032l;

        /* renamed from: m */
        public int f4033m;

        /* renamed from: n */
        public float f4034n;

        /* renamed from: o */
        public float f4035o;

        /* renamed from: p */
        public float f4036p;

        /* renamed from: q */
        public int f4037q;

        /* renamed from: r */
        public int f4038r;

        /* renamed from: s */
        public int f4039s;

        /* renamed from: t */
        public int f4040t;

        /* renamed from: u */
        public boolean f4041u;

        /* renamed from: v */
        public Paint.Style f4042v;

        public b(b bVar) {
            this.f4024d = null;
            this.f4025e = null;
            this.f4026f = null;
            this.f4027g = null;
            this.f4028h = PorterDuff.Mode.SRC_IN;
            this.f4029i = null;
            this.f4030j = 1.0f;
            this.f4031k = 1.0f;
            this.f4033m = 255;
            this.f4034n = 0.0f;
            this.f4035o = 0.0f;
            this.f4036p = 0.0f;
            this.f4037q = 0;
            this.f4038r = 0;
            this.f4039s = 0;
            this.f4040t = 0;
            this.f4041u = false;
            this.f4042v = Paint.Style.FILL_AND_STROKE;
            this.f4021a = bVar.f4021a;
            this.f4022b = bVar.f4022b;
            this.f4032l = bVar.f4032l;
            this.f4023c = bVar.f4023c;
            this.f4024d = bVar.f4024d;
            this.f4025e = bVar.f4025e;
            this.f4028h = bVar.f4028h;
            this.f4027g = bVar.f4027g;
            this.f4033m = bVar.f4033m;
            this.f4030j = bVar.f4030j;
            this.f4039s = bVar.f4039s;
            this.f4037q = bVar.f4037q;
            this.f4041u = bVar.f4041u;
            this.f4031k = bVar.f4031k;
            this.f4034n = bVar.f4034n;
            this.f4035o = bVar.f4035o;
            this.f4036p = bVar.f4036p;
            this.f4038r = bVar.f4038r;
            this.f4040t = bVar.f4040t;
            this.f4026f = bVar.f4026f;
            this.f4042v = bVar.f4042v;
            if (bVar.f4029i != null) {
                this.f4029i = new Rect(bVar.f4029i);
            }
        }

        public b(C0678j c0678j, C0636a c0636a) {
            this.f4024d = null;
            this.f4025e = null;
            this.f4026f = null;
            this.f4027g = null;
            this.f4028h = PorterDuff.Mode.SRC_IN;
            this.f4029i = null;
            this.f4030j = 1.0f;
            this.f4031k = 1.0f;
            this.f4033m = 255;
            this.f4034n = 0.0f;
            this.f4035o = 0.0f;
            this.f4036p = 0.0f;
            this.f4037q = 0;
            this.f4038r = 0;
            this.f4039s = 0;
            this.f4040t = 0;
            this.f4041u = false;
            this.f4042v = Paint.Style.FILL_AND_STROKE;
            this.f4021a = c0678j;
            this.f4022b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0675g c0675g = new C0675g(this);
            c0675g.f4002f = true;
            return c0675g;
        }
    }

    public C0675g() {
        this(new C0678j());
    }

    public C0675g(b bVar) {
        this.f3999c = new C0681m.f[4];
        this.f4000d = new C0681m.f[4];
        this.f4001e = new BitSet(8);
        this.f4003g = new Matrix();
        this.f4004h = new Path();
        this.f4005i = new Path();
        this.f4006j = new RectF();
        this.f4007k = new RectF();
        this.f4008l = new Region();
        this.f4009m = new Region();
        Paint paint = new Paint(1);
        this.f4011o = paint;
        Paint paint2 = new Paint(1);
        this.f4012p = paint2;
        this.f4013q = new C0667a();
        this.f4015s = new C0679k();
        this.f4018v = new RectF();
        this.f4019w = true;
        this.f3998b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f3997y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m2302v();
        m2301u(getState());
        this.f4014r = new a();
    }

    public C0675g(C0678j c0678j) {
        this(new b(c0678j, null));
    }

    /* renamed from: b */
    public final void m2282b(RectF rectF, Path path) {
        m2283c(rectF, path);
        if (this.f3998b.f4030j != 1.0f) {
            this.f4003g.reset();
            Matrix matrix = this.f4003g;
            float f2 = this.f3998b.f4030j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4003g);
        }
        path.computeBounds(this.f4018v, true);
    }

    /* renamed from: c */
    public final void m2283c(RectF rectF, Path path) {
        C0679k c0679k = this.f4015s;
        b bVar = this.f3998b;
        c0679k.m2315a(bVar.f4021a, bVar.f4031k, rectF, this.f4014r, path);
    }

    /* renamed from: d */
    public final PorterDuffColorFilter m2284d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iM2285e;
        if (colorStateList == null || mode == null) {
            return (!z || (iM2285e = m2285e((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iM2285e, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m2285e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p075a.p076a.p101w.C0675g.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final int m2285e(int i) {
        b bVar = this.f3998b;
        float f2 = bVar.f4035o + bVar.f4036p + bVar.f4034n;
        C0636a c0636a = bVar.f4022b;
        if (c0636a == null || !c0636a.f3822a) {
            return i;
        }
        if (!(C0202a.m757c(i, 255) == c0636a.f3824c)) {
            return i;
        }
        float fMin = 0.0f;
        if (c0636a.f3825d > 0.0f && f2 > 0.0f) {
            fMin = Math.min(((((float) Math.log1p(f2 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return C0202a.m757c(C0562a.m2090k(C0202a.m757c(i, 255), c0636a.f3823b, fMin), Color.alpha(i));
    }

    /* renamed from: f */
    public final void m2286f(Canvas canvas) {
        if (this.f4001e.cardinality() > 0) {
            Log.w(f3996x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f3998b.f4039s != 0) {
            canvas.drawPath(this.f4004h, this.f4013q.f3985a);
        }
        for (int i = 0; i < 4; i++) {
            C0681m.f fVar = this.f3999c[i];
            C0667a c0667a = this.f4013q;
            int i2 = this.f3998b.f4038r;
            Matrix matrix = C0681m.f.f4102a;
            fVar.mo2317a(matrix, c0667a, i2, canvas);
            this.f4000d[i].mo2317a(matrix, this.f4013q, this.f3998b.f4038r, canvas);
        }
        if (this.f4019w) {
            int iM2289i = m2289i();
            int iM2290j = m2290j();
            canvas.translate(-iM2289i, -iM2290j);
            canvas.drawPath(this.f4004h, f3997y);
            canvas.translate(iM2289i, iM2290j);
        }
    }

    /* renamed from: g */
    public final void m2287g(Canvas canvas, Paint paint, Path path, C0678j c0678j, RectF rectF) {
        if (!c0678j.m2307d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo2279a = c0678j.f4049f.mo2279a(rectF) * this.f3998b.f4031k;
            canvas.drawRoundRect(rectF, fMo2279a, fMo2279a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3998b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f3998b;
        if (bVar.f4037q == 2) {
            return;
        }
        if (bVar.f4021a.m2307d(m2288h())) {
            outline.setRoundRect(getBounds(), m2292l() * this.f3998b.f4031k);
            return;
        }
        m2282b(m2288h(), this.f4004h);
        if (this.f4004h.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f4004h);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f3998b.f4029i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f4008l.set(getBounds());
        m2282b(m2288h(), this.f4004h);
        this.f4009m.setPath(this.f4004h, this.f4008l);
        this.f4008l.op(this.f4009m, Region.Op.DIFFERENCE);
        return this.f4008l;
    }

    /* renamed from: h */
    public RectF m2288h() {
        this.f4006j.set(getBounds());
        return this.f4006j;
    }

    /* renamed from: i */
    public int m2289i() {
        b bVar = this.f3998b;
        return (int) (Math.sin(Math.toRadians(bVar.f4040t)) * bVar.f4039s);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f4002f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f3998b.f4027g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f3998b.f4026f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f3998b.f4025e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f3998b.f4024d) != null && colorStateList4.isStateful())));
    }

    /* renamed from: j */
    public int m2290j() {
        b bVar = this.f3998b;
        return (int) (Math.cos(Math.toRadians(bVar.f4040t)) * bVar.f4039s);
    }

    /* renamed from: k */
    public final float m2291k() {
        if (m2293m()) {
            return this.f4012p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: l */
    public float m2292l() {
        return this.f3998b.f4021a.f4048e.mo2279a(m2288h());
    }

    /* renamed from: m */
    public final boolean m2293m() {
        Paint.Style style = this.f3998b.f4042v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f4012p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3998b = new b(this.f3998b);
        return this;
    }

    /* renamed from: n */
    public void m2294n(Context context) {
        this.f3998b.f4022b = new C0636a(context);
        m2303w();
    }

    /* renamed from: o */
    public void m2295o(float f2) {
        b bVar = this.f3998b;
        if (bVar.f4035o != f2) {
            bVar.f4035o = f2;
            m2303w();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f4002f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p070b.p074b.p075a.p076a.p096r.C0654i.b
    public boolean onStateChange(int[] iArr) {
        boolean z = m2301u(iArr) || m2302v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public void m2296p(ColorStateList colorStateList) {
        b bVar = this.f3998b;
        if (bVar.f4024d != colorStateList) {
            bVar.f4024d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: q */
    public void m2297q(float f2) {
        b bVar = this.f3998b;
        if (bVar.f4031k != f2) {
            bVar.f4031k = f2;
            this.f4002f = true;
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void m2298r(float f2, int i) {
        this.f3998b.f4032l = f2;
        invalidateSelf();
        m2300t(ColorStateList.valueOf(i));
    }

    /* renamed from: s */
    public void m2299s(float f2, ColorStateList colorStateList) {
        this.f3998b.f4032l = f2;
        invalidateSelf();
        m2300t(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.f3998b;
        if (bVar.f4033m != i) {
            bVar.f4033m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3998b.f4023c = colorFilter;
        super.invalidateSelf();
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0682n
    public void setShapeAppearanceModel(C0678j c0678j) {
        this.f3998b.f4021a = c0678j;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3998b.f4027g = colorStateList;
        m2302v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f3998b;
        if (bVar.f4028h != mode) {
            bVar.f4028h = mode;
            m2302v();
            super.invalidateSelf();
        }
    }

    /* renamed from: t */
    public void m2300t(ColorStateList colorStateList) {
        b bVar = this.f3998b;
        if (bVar.f4025e != colorStateList) {
            bVar.f4025e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: u */
    public final boolean m2301u(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f3998b.f4024d == null || color2 == (colorForState2 = this.f3998b.f4024d.getColorForState(iArr, (color2 = this.f4011o.getColor())))) {
            z = false;
        } else {
            this.f4011o.setColor(colorForState2);
            z = true;
        }
        if (this.f3998b.f4025e == null || color == (colorForState = this.f3998b.f4025e.getColorForState(iArr, (color = this.f4012p.getColor())))) {
            return z;
        }
        this.f4012p.setColor(colorForState);
        return true;
    }

    /* renamed from: v */
    public final boolean m2302v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4016t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4017u;
        b bVar = this.f3998b;
        this.f4016t = m2284d(bVar.f4027g, bVar.f4028h, this.f4011o, true);
        b bVar2 = this.f3998b;
        this.f4017u = m2284d(bVar2.f4026f, bVar2.f4028h, this.f4012p, false);
        b bVar3 = this.f3998b;
        if (bVar3.f4041u) {
            this.f4013q.m2278a(bVar3.f4027g.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.f4016t) && Objects.equals(porterDuffColorFilter2, this.f4017u)) ? false : true;
    }

    /* renamed from: w */
    public final void m2303w() {
        b bVar = this.f3998b;
        float f2 = bVar.f4035o + bVar.f4036p;
        bVar.f4038r = (int) Math.ceil(0.75f * f2);
        this.f3998b.f4039s = (int) Math.ceil(f2 * 0.25f);
        m2302v();
        super.invalidateSelf();
    }
}
