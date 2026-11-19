package com.canhub.cropper;

import android.graphics.RectF;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.CropWindowMoveHandler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: com.canhub.cropper.d */
/* loaded from: classes3.dex */
public final class C5906d {

    /* renamed from: c */
    public float f5387c;

    /* renamed from: d */
    public float f5388d;

    /* renamed from: e */
    public float f5389e;

    /* renamed from: f */
    public float f5390f;

    /* renamed from: g */
    public float f5391g;

    /* renamed from: h */
    public float f5392h;

    /* renamed from: i */
    public float f5393i;

    /* renamed from: j */
    public float f5394j;

    /* renamed from: a */
    public final RectF f5385a = new RectF();

    /* renamed from: b */
    public final RectF f5386b = new RectF();

    /* renamed from: k */
    public float f5395k = 1.0f;

    /* renamed from: l */
    public float f5396l = 1.0f;

    /* renamed from: com.canhub.cropper.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5397a;

        static {
            int[] iArr = new int[CropImageView.CropShape.values().length];
            try {
                iArr[CropImageView.CropShape.f5265c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.CropShape.f5266d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.CropShape.f5267e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.CropShape.f5268f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5397a = iArr;
        }
    }

    /* renamed from: a */
    public final float m4609a(float f10, float f11, float f12, float f13) {
        return Math.max(Math.abs(f10 - f12), Math.abs(f11 - f13));
    }

    /* renamed from: b */
    public final boolean m4610b() {
        return !m4632x();
    }

    /* renamed from: c */
    public final float m4611c() {
        return AbstractC10410o.m21755h(this.f5390f, this.f5394j / this.f5396l);
    }

    /* renamed from: d */
    public final float m4612d() {
        return AbstractC10410o.m21755h(this.f5389e, this.f5393i / this.f5395k);
    }

    /* renamed from: e */
    public final float m4613e() {
        return AbstractC10410o.m21751d(this.f5388d, this.f5392h / this.f5396l);
    }

    /* renamed from: f */
    public final float m4614f() {
        return AbstractC10410o.m21751d(this.f5387c, this.f5391g / this.f5395k);
    }

    /* renamed from: g */
    public final CropWindowMoveHandler m4615g(float f10, float f11, float f12, CropImageView.CropShape cropShape, boolean z10) {
        CropWindowMoveHandler.Type typeM4619k;
        AbstractC9979u.m20294g(cropShape, "cropShape");
        int i10 = a.f5397a[cropShape.ordinal()];
        if (i10 == 1) {
            typeM4619k = m4619k(f10, f11, f12, z10);
        } else if (i10 == 2) {
            typeM4619k = m4616h(f10, f11, z10);
        } else if (i10 == 3) {
            typeM4619k = m4620l(f10, f11, f12, z10);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            typeM4619k = m4618j(f10, f11, f12, z10);
        }
        if (typeM4619k != null) {
            return new CropWindowMoveHandler(typeM4619k, this, f10, f11);
        }
        return null;
    }

    /* renamed from: h */
    public final CropWindowMoveHandler.Type m4616h(float f10, float f11, boolean z10) {
        float f12 = 6;
        float fWidth = this.f5385a.width() / f12;
        RectF rectF = this.f5385a;
        float f13 = rectF.left;
        float f14 = f13 + fWidth;
        float f15 = 5;
        float f16 = f13 + (fWidth * f15);
        float fHeight = rectF.height() / f12;
        float f17 = this.f5385a.top;
        float f18 = f17 + fHeight;
        float f19 = f17 + (f15 * fHeight);
        if (f10 < f14) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f5349c : f11 < f19 ? CropWindowMoveHandler.Type.f5353g : CropWindowMoveHandler.Type.f5351e;
        }
        if (f10 >= f16) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f5350d : f11 < f19 ? CropWindowMoveHandler.Type.f5355i : CropWindowMoveHandler.Type.f5352f;
        }
        if (f11 < f18) {
            return CropWindowMoveHandler.Type.f5354h;
        }
        if (f11 >= f19) {
            return CropWindowMoveHandler.Type.f5356j;
        }
        if (z10) {
            return CropWindowMoveHandler.Type.f5357k;
        }
        return null;
    }

    /* renamed from: i */
    public final RectF m4617i() {
        this.f5386b.set(this.f5385a);
        return this.f5386b;
    }

    /* renamed from: j */
    public final CropWindowMoveHandler.Type m4618j(float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        RectF rectF = this.f5385a;
        if (m4609a(f10, f11, rectF.left, rectF.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f5353g;
        }
        RectF rectF2 = this.f5385a;
        if (m4609a(f10, f11, rectF2.right, rectF2.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f5355i;
        }
        if (z10) {
            RectF rectF3 = this.f5385a;
            f13 = f10;
            f14 = f11;
            if (m4623o(f13, f14, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return CropWindowMoveHandler.Type.f5357k;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m4616h(f13, f14, z10);
    }

    /* renamed from: k */
    public final CropWindowMoveHandler.Type m4619k(float f10, float f11, float f12, boolean z10) {
        RectF rectF = this.f5385a;
        if (m4624p(f10, f11, rectF.left, rectF.top, f12)) {
            return CropWindowMoveHandler.Type.f5349c;
        }
        RectF rectF2 = this.f5385a;
        if (m4624p(f10, f11, rectF2.right, rectF2.top, f12)) {
            return CropWindowMoveHandler.Type.f5350d;
        }
        RectF rectF3 = this.f5385a;
        if (m4624p(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return CropWindowMoveHandler.Type.f5351e;
        }
        RectF rectF4 = this.f5385a;
        if (m4624p(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return CropWindowMoveHandler.Type.f5352f;
        }
        if (z10) {
            RectF rectF5 = this.f5385a;
            if (m4623o(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m4610b()) {
                return CropWindowMoveHandler.Type.f5357k;
            }
        }
        RectF rectF6 = this.f5385a;
        if (m4625q(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return CropWindowMoveHandler.Type.f5354h;
        }
        RectF rectF7 = this.f5385a;
        if (m4625q(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return CropWindowMoveHandler.Type.f5356j;
        }
        RectF rectF8 = this.f5385a;
        if (m4626r(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return CropWindowMoveHandler.Type.f5353g;
        }
        RectF rectF9 = this.f5385a;
        if (m4626r(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return CropWindowMoveHandler.Type.f5355i;
        }
        if (z10) {
            RectF rectF10 = this.f5385a;
            if (m4623o(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !m4610b()) {
                return CropWindowMoveHandler.Type.f5357k;
            }
        }
        return m4616h(f10, f11, z10);
    }

    /* renamed from: l */
    public final CropWindowMoveHandler.Type m4620l(float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        if (m4609a(f10, f11, this.f5385a.centerX(), this.f5385a.top) <= f12) {
            return CropWindowMoveHandler.Type.f5354h;
        }
        if (m4609a(f10, f11, this.f5385a.centerX(), this.f5385a.bottom) <= f12) {
            return CropWindowMoveHandler.Type.f5356j;
        }
        if (z10) {
            RectF rectF = this.f5385a;
            f13 = f10;
            f14 = f11;
            if (m4623o(f13, f14, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return CropWindowMoveHandler.Type.f5357k;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m4616h(f13, f14, z10);
    }

    /* renamed from: m */
    public final float m4621m() {
        return this.f5396l;
    }

    /* renamed from: n */
    public final float m4622n() {
        return this.f5395k;
    }

    /* renamed from: o */
    public final boolean m4623o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: p */
    public final boolean m4624p(float f10, float f11, float f12, float f13, float f14) {
        return m4609a(f10, f11, f12, f13) <= f14;
    }

    /* renamed from: q */
    public final boolean m4625q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: r */
    public final boolean m4626r(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    /* renamed from: s */
    public final void m4627s(float f10, float f11, float f12, float f13) {
        this.f5389e = f10;
        this.f5390f = f11;
        this.f5395k = f12;
        this.f5396l = f13;
    }

    /* renamed from: t */
    public final void m4628t(CropImageOptions options) {
        AbstractC9979u.m20294g(options, "options");
        this.f5387c = options.f5159I;
        this.f5388d = options.f5160J;
        this.f5391g = options.f5161K;
        this.f5392h = options.f5162L;
        this.f5393i = options.f5163M;
        this.f5394j = options.f5164N;
    }

    /* renamed from: u */
    public final void m4629u(int i10, int i11) {
        this.f5393i = i10;
        this.f5394j = i11;
    }

    /* renamed from: v */
    public final void m4630v(int i10, int i11) {
        this.f5391g = i10;
        this.f5392h = i11;
    }

    /* renamed from: w */
    public final void m4631w(RectF rect) {
        AbstractC9979u.m20294g(rect, "rect");
        this.f5385a.set(rect);
    }

    /* renamed from: x */
    public final boolean m4632x() {
        return this.f5385a.width() >= 100.0f && this.f5385a.height() >= 100.0f;
    }
}
