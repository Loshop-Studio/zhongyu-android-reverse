package com.canhub.cropper;

import android.graphics.RectF;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.CropWindowMoveHandler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.canhub.cropper.d */
/* loaded from: classes3.dex */
public final class C5543d {

    /* renamed from: c */
    public float f3972c;

    /* renamed from: d */
    public float f3973d;

    /* renamed from: e */
    public float f3974e;

    /* renamed from: f */
    public float f3975f;

    /* renamed from: g */
    public float f3976g;

    /* renamed from: h */
    public float f3977h;

    /* renamed from: i */
    public float f3978i;

    /* renamed from: j */
    public float f3979j;

    /* renamed from: a */
    public final RectF f3970a = new RectF();

    /* renamed from: b */
    public final RectF f3971b = new RectF();

    /* renamed from: k */
    public float f3980k = 1.0f;

    /* renamed from: l */
    public float f3981l = 1.0f;

    /* renamed from: com.canhub.cropper.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3982a;

        static {
            int[] iArr = new int[CropImageView.CropShape.values().length];
            try {
                iArr[CropImageView.CropShape.f3850a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.CropShape.f3851b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.CropShape.f3852c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.CropShape.f3853d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3982a = iArr;
        }
    }

    /* renamed from: a */
    public final float m3589a(float f10, float f11, float f12, float f13) {
        return Math.max(Math.abs(f10 - f12), Math.abs(f11 - f13));
    }

    /* renamed from: b */
    public final boolean m3590b() {
        return !m3612x();
    }

    /* renamed from: c */
    public final float m3591c() {
        return RangesKt.coerceAtMost(this.f3975f, this.f3979j / this.f3981l);
    }

    /* renamed from: d */
    public final float m3592d() {
        return RangesKt.coerceAtMost(this.f3974e, this.f3978i / this.f3980k);
    }

    /* renamed from: e */
    public final float m3593e() {
        return RangesKt.coerceAtLeast(this.f3973d, this.f3977h / this.f3981l);
    }

    /* renamed from: f */
    public final float m3594f() {
        return RangesKt.coerceAtLeast(this.f3972c, this.f3976g / this.f3980k);
    }

    /* renamed from: g */
    public final CropWindowMoveHandler m3595g(float f10, float f11, float f12, CropImageView.CropShape cropShape, boolean z9) {
        CropWindowMoveHandler.Type typeM3599k;
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        int i9 = a.f3982a[cropShape.ordinal()];
        if (i9 == 1) {
            typeM3599k = m3599k(f10, f11, f12, z9);
        } else if (i9 == 2) {
            typeM3599k = m3596h(f10, f11, z9);
        } else if (i9 == 3) {
            typeM3599k = m3600l(f10, f11, f12, z9);
        } else {
            if (i9 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            typeM3599k = m3598j(f10, f11, f12, z9);
        }
        if (typeM3599k != null) {
            return new CropWindowMoveHandler(typeM3599k, this, f10, f11);
        }
        return null;
    }

    /* renamed from: h */
    public final CropWindowMoveHandler.Type m3596h(float f10, float f11, boolean z9) {
        float f12 = 6;
        float fWidth = this.f3970a.width() / f12;
        RectF rectF = this.f3970a;
        float f13 = rectF.left;
        float f14 = f13 + fWidth;
        float f15 = 5;
        float f16 = f13 + (fWidth * f15);
        float fHeight = rectF.height() / f12;
        float f17 = this.f3970a.top;
        float f18 = f17 + fHeight;
        float f19 = f17 + (f15 * fHeight);
        if (f10 < f14) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f3934a : f11 < f19 ? CropWindowMoveHandler.Type.f3938e : CropWindowMoveHandler.Type.f3936c;
        }
        if (f10 >= f16) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f3935b : f11 < f19 ? CropWindowMoveHandler.Type.f3940g : CropWindowMoveHandler.Type.f3937d;
        }
        if (f11 < f18) {
            return CropWindowMoveHandler.Type.f3939f;
        }
        if (f11 >= f19) {
            return CropWindowMoveHandler.Type.f3941h;
        }
        if (z9) {
            return CropWindowMoveHandler.Type.f3942i;
        }
        return null;
    }

    /* renamed from: i */
    public final RectF m3597i() {
        this.f3971b.set(this.f3970a);
        return this.f3971b;
    }

    /* renamed from: j */
    public final CropWindowMoveHandler.Type m3598j(float f10, float f11, float f12, boolean z9) {
        float f13;
        float f14;
        RectF rectF = this.f3970a;
        if (m3589a(f10, f11, rectF.left, rectF.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f3938e;
        }
        RectF rectF2 = this.f3970a;
        if (m3589a(f10, f11, rectF2.right, rectF2.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f3940g;
        }
        if (z9) {
            RectF rectF3 = this.f3970a;
            f13 = f10;
            f14 = f11;
            if (m3603o(f13, f14, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return CropWindowMoveHandler.Type.f3942i;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m3596h(f13, f14, z9);
    }

    /* renamed from: k */
    public final CropWindowMoveHandler.Type m3599k(float f10, float f11, float f12, boolean z9) {
        RectF rectF = this.f3970a;
        if (m3604p(f10, f11, rectF.left, rectF.top, f12)) {
            return CropWindowMoveHandler.Type.f3934a;
        }
        RectF rectF2 = this.f3970a;
        if (m3604p(f10, f11, rectF2.right, rectF2.top, f12)) {
            return CropWindowMoveHandler.Type.f3935b;
        }
        RectF rectF3 = this.f3970a;
        if (m3604p(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3936c;
        }
        RectF rectF4 = this.f3970a;
        if (m3604p(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3937d;
        }
        if (z9) {
            RectF rectF5 = this.f3970a;
            if (m3603o(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m3590b()) {
                return CropWindowMoveHandler.Type.f3942i;
            }
        }
        RectF rectF6 = this.f3970a;
        if (m3605q(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return CropWindowMoveHandler.Type.f3939f;
        }
        RectF rectF7 = this.f3970a;
        if (m3605q(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3941h;
        }
        RectF rectF8 = this.f3970a;
        if (m3606r(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3938e;
        }
        RectF rectF9 = this.f3970a;
        if (m3606r(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return CropWindowMoveHandler.Type.f3940g;
        }
        if (z9) {
            RectF rectF10 = this.f3970a;
            if (m3603o(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !m3590b()) {
                return CropWindowMoveHandler.Type.f3942i;
            }
        }
        return m3596h(f10, f11, z9);
    }

    /* renamed from: l */
    public final CropWindowMoveHandler.Type m3600l(float f10, float f11, float f12, boolean z9) {
        float f13;
        float f14;
        if (m3589a(f10, f11, this.f3970a.centerX(), this.f3970a.top) <= f12) {
            return CropWindowMoveHandler.Type.f3939f;
        }
        if (m3589a(f10, f11, this.f3970a.centerX(), this.f3970a.bottom) <= f12) {
            return CropWindowMoveHandler.Type.f3941h;
        }
        if (z9) {
            RectF rectF = this.f3970a;
            f13 = f10;
            f14 = f11;
            if (m3603o(f13, f14, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return CropWindowMoveHandler.Type.f3942i;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m3596h(f13, f14, z9);
    }

    /* renamed from: m */
    public final float m3601m() {
        return this.f3981l;
    }

    /* renamed from: n */
    public final float m3602n() {
        return this.f3980k;
    }

    /* renamed from: o */
    public final boolean m3603o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: p */
    public final boolean m3604p(float f10, float f11, float f12, float f13, float f14) {
        return m3589a(f10, f11, f12, f13) <= f14;
    }

    /* renamed from: q */
    public final boolean m3605q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: r */
    public final boolean m3606r(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    /* renamed from: s */
    public final void m3607s(float f10, float f11, float f12, float f13) {
        this.f3974e = f10;
        this.f3975f = f11;
        this.f3980k = f12;
        this.f3981l = f13;
    }

    /* renamed from: t */
    public final void m3608t(CropImageOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f3972c = options.minCropWindowWidth;
        this.f3973d = options.minCropWindowHeight;
        this.f3976g = options.minCropResultWidth;
        this.f3977h = options.minCropResultHeight;
        this.f3978i = options.maxCropResultWidth;
        this.f3979j = options.maxCropResultHeight;
    }

    /* renamed from: u */
    public final void m3609u(int i9, int i10) {
        this.f3978i = i9;
        this.f3979j = i10;
    }

    /* renamed from: v */
    public final void m3610v(int i9, int i10) {
        this.f3976g = i9;
        this.f3977h = i10;
    }

    /* renamed from: w */
    public final void m3611w(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f3970a.set(rect);
    }

    /* renamed from: x */
    public final boolean m3612x() {
        return this.f3970a.width() >= 100.0f && this.f3970a.height() >= 100.0f;
    }
}
