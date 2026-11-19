package com.canhub.cropper;

import android.graphics.RectF;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.CropWindowMoveHandler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: com.canhub.cropper.d */
/* loaded from: classes3.dex */
public final class C5487d {

    /* renamed from: c */
    public float f3617c;

    /* renamed from: d */
    public float f3618d;

    /* renamed from: e */
    public float f3619e;

    /* renamed from: f */
    public float f3620f;

    /* renamed from: g */
    public float f3621g;

    /* renamed from: h */
    public float f3622h;

    /* renamed from: i */
    public float f3623i;

    /* renamed from: j */
    public float f3624j;

    /* renamed from: a */
    public final RectF f3615a = new RectF();

    /* renamed from: b */
    public final RectF f3616b = new RectF();

    /* renamed from: k */
    public float f3625k = 1.0f;

    /* renamed from: l */
    public float f3626l = 1.0f;

    /* renamed from: com.canhub.cropper.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3627a;

        static {
            int[] iArr = new int[CropImageView.CropShape.values().length];
            try {
                iArr[CropImageView.CropShape.f3495a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.CropShape.f3496b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.CropShape.f3497c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.CropShape.f3498d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3627a = iArr;
        }
    }

    /* renamed from: a */
    public final float m3407a(float f10, float f11, float f12, float f13) {
        return Math.max(Math.abs(f10 - f12), Math.abs(f11 - f13));
    }

    /* renamed from: b */
    public final boolean m3408b() {
        return !m3430x();
    }

    /* renamed from: c */
    public final float m3409c() {
        return AbstractC8323h.m13512g(this.f3620f, this.f3624j / this.f3626l);
    }

    /* renamed from: d */
    public final float m3410d() {
        return AbstractC8323h.m13512g(this.f3619e, this.f3623i / this.f3625k);
    }

    /* renamed from: e */
    public final float m3411e() {
        return AbstractC8323h.m13509d(this.f3618d, this.f3622h / this.f3626l);
    }

    /* renamed from: f */
    public final float m3412f() {
        return AbstractC8323h.m13509d(this.f3617c, this.f3621g / this.f3625k);
    }

    /* renamed from: g */
    public final CropWindowMoveHandler m3413g(float f10, float f11, float f12, CropImageView.CropShape cropShape, boolean z10) {
        CropWindowMoveHandler.Type typeM3417k;
        AbstractC9133u.m16133g(cropShape, "cropShape");
        int i10 = a.f3627a[cropShape.ordinal()];
        if (i10 == 1) {
            typeM3417k = m3417k(f10, f11, f12, z10);
        } else if (i10 == 2) {
            typeM3417k = m3414h(f10, f11, z10);
        } else if (i10 == 3) {
            typeM3417k = m3418l(f10, f11, f12, z10);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            typeM3417k = m3416j(f10, f11, f12, z10);
        }
        if (typeM3417k != null) {
            return new CropWindowMoveHandler(typeM3417k, this, f10, f11);
        }
        return null;
    }

    /* renamed from: h */
    public final CropWindowMoveHandler.Type m3414h(float f10, float f11, boolean z10) {
        float f12 = 6;
        float fWidth = this.f3615a.width() / f12;
        RectF rectF = this.f3615a;
        float f13 = rectF.left;
        float f14 = f13 + fWidth;
        float f15 = 5;
        float f16 = f13 + (fWidth * f15);
        float fHeight = rectF.height() / f12;
        float f17 = this.f3615a.top;
        float f18 = f17 + fHeight;
        float f19 = f17 + (f15 * fHeight);
        if (f10 < f14) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f3579a : f11 < f19 ? CropWindowMoveHandler.Type.f3583e : CropWindowMoveHandler.Type.f3581c;
        }
        if (f10 >= f16) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f3580b : f11 < f19 ? CropWindowMoveHandler.Type.f3585g : CropWindowMoveHandler.Type.f3582d;
        }
        if (f11 < f18) {
            return CropWindowMoveHandler.Type.f3584f;
        }
        if (f11 >= f19) {
            return CropWindowMoveHandler.Type.f3586h;
        }
        if (z10) {
            return CropWindowMoveHandler.Type.f3587i;
        }
        return null;
    }

    /* renamed from: i */
    public final RectF m3415i() {
        this.f3616b.set(this.f3615a);
        return this.f3616b;
    }

    /* renamed from: j */
    public final CropWindowMoveHandler.Type m3416j(float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        RectF rectF = this.f3615a;
        if (m3407a(f10, f11, rectF.left, rectF.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f3583e;
        }
        RectF rectF2 = this.f3615a;
        if (m3407a(f10, f11, rectF2.right, rectF2.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f3585g;
        }
        if (z10) {
            RectF rectF3 = this.f3615a;
            f13 = f10;
            f14 = f11;
            if (m3421o(f13, f14, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return CropWindowMoveHandler.Type.f3587i;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m3414h(f13, f14, z10);
    }

    /* renamed from: k */
    public final CropWindowMoveHandler.Type m3417k(float f10, float f11, float f12, boolean z10) {
        RectF rectF = this.f3615a;
        if (m3422p(f10, f11, rectF.left, rectF.top, f12)) {
            return CropWindowMoveHandler.Type.f3579a;
        }
        RectF rectF2 = this.f3615a;
        if (m3422p(f10, f11, rectF2.right, rectF2.top, f12)) {
            return CropWindowMoveHandler.Type.f3580b;
        }
        RectF rectF3 = this.f3615a;
        if (m3422p(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3581c;
        }
        RectF rectF4 = this.f3615a;
        if (m3422p(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3582d;
        }
        if (z10) {
            RectF rectF5 = this.f3615a;
            if (m3421o(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m3408b()) {
                return CropWindowMoveHandler.Type.f3587i;
            }
        }
        RectF rectF6 = this.f3615a;
        if (m3423q(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return CropWindowMoveHandler.Type.f3584f;
        }
        RectF rectF7 = this.f3615a;
        if (m3423q(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3586h;
        }
        RectF rectF8 = this.f3615a;
        if (m3424r(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3583e;
        }
        RectF rectF9 = this.f3615a;
        if (m3424r(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3585g;
        }
        if (z10) {
            RectF rectF10 = this.f3615a;
            if (m3421o(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !m3408b()) {
                return CropWindowMoveHandler.Type.f3587i;
            }
        }
        return m3414h(f10, f11, z10);
    }

    /* renamed from: l */
    public final CropWindowMoveHandler.Type m3418l(float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        if (m3407a(f10, f11, this.f3615a.centerX(), this.f3615a.top) <= f12) {
            return CropWindowMoveHandler.Type.f3584f;
        }
        if (m3407a(f10, f11, this.f3615a.centerX(), this.f3615a.bottom) <= f12) {
            return CropWindowMoveHandler.Type.f3586h;
        }
        if (z10) {
            RectF rectF = this.f3615a;
            f13 = f10;
            f14 = f11;
            if (m3421o(f13, f14, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return CropWindowMoveHandler.Type.f3587i;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m3414h(f13, f14, z10);
    }

    /* renamed from: m */
    public final float m3419m() {
        return this.f3626l;
    }

    /* renamed from: n */
    public final float m3420n() {
        return this.f3625k;
    }

    /* renamed from: o */
    public final boolean m3421o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: p */
    public final boolean m3422p(float f10, float f11, float f12, float f13, float f14) {
        return m3407a(f10, f11, f12, f13) <= f14;
    }

    /* renamed from: q */
    public final boolean m3423q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: r */
    public final boolean m3424r(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    /* renamed from: s */
    public final void m3425s(float f10, float f11, float f12, float f13) {
        this.f3619e = f10;
        this.f3620f = f11;
        this.f3625k = f12;
        this.f3626l = f13;
    }

    /* renamed from: t */
    public final void m3426t(CropImageOptions options) {
        AbstractC9133u.m16133g(options, "options");
        this.f3617c = options.f3387G;
        this.f3618d = options.f3388H;
        this.f3621g = options.f3389I;
        this.f3622h = options.f3390J;
        this.f3623i = options.f3391K;
        this.f3624j = options.f3392L;
    }

    /* renamed from: u */
    public final void m3427u(int i10, int i11) {
        this.f3623i = i10;
        this.f3624j = i11;
    }

    /* renamed from: v */
    public final void m3428v(int i10, int i11) {
        this.f3621g = i10;
        this.f3622h = i11;
    }

    /* renamed from: w */
    public final void m3429w(RectF rect) {
        AbstractC9133u.m16133g(rect, "rect");
        this.f3615a.set(rect);
    }

    /* renamed from: x */
    public final boolean m3430x() {
        return this.f3615a.width() >= 100.0f && this.f3615a.height() >= 100.0f;
    }
}
