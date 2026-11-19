package com.canhub.cropper;

import android.graphics.RectF;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.CropWindowMoveHandler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.canhub.cropper.d */
/* loaded from: classes3.dex */
public final class C5438d {

    /* renamed from: c */
    public float f4184c;

    /* renamed from: d */
    public float f4185d;

    /* renamed from: e */
    public float f4186e;

    /* renamed from: f */
    public float f4187f;

    /* renamed from: g */
    public float f4188g;

    /* renamed from: h */
    public float f4189h;

    /* renamed from: i */
    public float f4190i;

    /* renamed from: j */
    public float f4191j;

    /* renamed from: a */
    public final RectF f4182a = new RectF();

    /* renamed from: b */
    public final RectF f4183b = new RectF();

    /* renamed from: k */
    public float f4192k = 1.0f;

    /* renamed from: l */
    public float f4193l = 1.0f;

    /* renamed from: com.canhub.cropper.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4194a;

        static {
            int[] iArr = new int[CropImageView.CropShape.values().length];
            try {
                iArr[CropImageView.CropShape.f4062a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.CropShape.f4063b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.CropShape.f4064c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.CropShape.f4065d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4194a = iArr;
        }
    }

    /* renamed from: a */
    public final float m3963a(float f10, float f11, float f12, float f13) {
        return Math.max(Math.abs(f10 - f12), Math.abs(f11 - f13));
    }

    /* renamed from: b */
    public final boolean m3964b() {
        return !m3986x();
    }

    /* renamed from: c */
    public final float m3965c() {
        return RangesKt.coerceAtMost(this.f4187f, this.f4191j / this.f4193l);
    }

    /* renamed from: d */
    public final float m3966d() {
        return RangesKt.coerceAtMost(this.f4186e, this.f4190i / this.f4192k);
    }

    /* renamed from: e */
    public final float m3967e() {
        return RangesKt.coerceAtLeast(this.f4185d, this.f4189h / this.f4193l);
    }

    /* renamed from: f */
    public final float m3968f() {
        return RangesKt.coerceAtLeast(this.f4184c, this.f4188g / this.f4192k);
    }

    /* renamed from: g */
    public final CropWindowMoveHandler m3969g(float f10, float f11, float f12, CropImageView.CropShape cropShape, boolean z9) {
        CropWindowMoveHandler.Type typeM3973k;
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        int i10 = a.f4194a[cropShape.ordinal()];
        if (i10 == 1) {
            typeM3973k = m3973k(f10, f11, f12, z9);
        } else if (i10 == 2) {
            typeM3973k = m3970h(f10, f11, z9);
        } else if (i10 == 3) {
            typeM3973k = m3974l(f10, f11, f12, z9);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            typeM3973k = m3972j(f10, f11, f12, z9);
        }
        if (typeM3973k != null) {
            return new CropWindowMoveHandler(typeM3973k, this, f10, f11);
        }
        return null;
    }

    /* renamed from: h */
    public final CropWindowMoveHandler.Type m3970h(float f10, float f11, boolean z9) {
        float f12 = 6;
        float fWidth = this.f4182a.width() / f12;
        RectF rectF = this.f4182a;
        float f13 = rectF.left;
        float f14 = f13 + fWidth;
        float f15 = 5;
        float f16 = f13 + (fWidth * f15);
        float fHeight = rectF.height() / f12;
        float f17 = this.f4182a.top;
        float f18 = f17 + fHeight;
        float f19 = f17 + (f15 * fHeight);
        if (f10 < f14) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f4146a : f11 < f19 ? CropWindowMoveHandler.Type.f4150e : CropWindowMoveHandler.Type.f4148c;
        }
        if (f10 >= f16) {
            return f11 < f18 ? CropWindowMoveHandler.Type.f4147b : f11 < f19 ? CropWindowMoveHandler.Type.f4152g : CropWindowMoveHandler.Type.f4149d;
        }
        if (f11 < f18) {
            return CropWindowMoveHandler.Type.f4151f;
        }
        if (f11 >= f19) {
            return CropWindowMoveHandler.Type.f4153h;
        }
        if (z9) {
            return CropWindowMoveHandler.Type.f4154i;
        }
        return null;
    }

    /* renamed from: i */
    public final RectF m3971i() {
        this.f4183b.set(this.f4182a);
        return this.f4183b;
    }

    /* renamed from: j */
    public final CropWindowMoveHandler.Type m3972j(float f10, float f11, float f12, boolean z9) {
        float f13;
        float f14;
        RectF rectF = this.f4182a;
        if (m3963a(f10, f11, rectF.left, rectF.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f4150e;
        }
        RectF rectF2 = this.f4182a;
        if (m3963a(f10, f11, rectF2.right, rectF2.centerY()) <= f12) {
            return CropWindowMoveHandler.Type.f4152g;
        }
        if (z9) {
            RectF rectF3 = this.f4182a;
            f13 = f10;
            f14 = f11;
            if (m3977o(f13, f14, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return CropWindowMoveHandler.Type.f4154i;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m3970h(f13, f14, z9);
    }

    /* renamed from: k */
    public final CropWindowMoveHandler.Type m3973k(float f10, float f11, float f12, boolean z9) {
        RectF rectF = this.f4182a;
        if (m3978p(f10, f11, rectF.left, rectF.top, f12)) {
            return CropWindowMoveHandler.Type.f4146a;
        }
        RectF rectF2 = this.f4182a;
        if (m3978p(f10, f11, rectF2.right, rectF2.top, f12)) {
            return CropWindowMoveHandler.Type.f4147b;
        }
        RectF rectF3 = this.f4182a;
        if (m3978p(f10, f11, rectF3.left, rectF3.bottom, f12)) {
            return CropWindowMoveHandler.Type.f4148c;
        }
        RectF rectF4 = this.f4182a;
        if (m3978p(f10, f11, rectF4.right, rectF4.bottom, f12)) {
            return CropWindowMoveHandler.Type.f4149d;
        }
        if (z9) {
            RectF rectF5 = this.f4182a;
            if (m3977o(f10, f11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m3964b()) {
                return CropWindowMoveHandler.Type.f4154i;
            }
        }
        RectF rectF6 = this.f4182a;
        if (m3979q(f10, f11, rectF6.left, rectF6.right, rectF6.top, f12)) {
            return CropWindowMoveHandler.Type.f4151f;
        }
        RectF rectF7 = this.f4182a;
        if (m3979q(f10, f11, rectF7.left, rectF7.right, rectF7.bottom, f12)) {
            return CropWindowMoveHandler.Type.f4153h;
        }
        RectF rectF8 = this.f4182a;
        if (m3980r(f10, f11, rectF8.left, rectF8.top, rectF8.bottom, f12)) {
            return CropWindowMoveHandler.Type.f4150e;
        }
        RectF rectF9 = this.f4182a;
        if (m3980r(f10, f11, rectF9.right, rectF9.top, rectF9.bottom, f12)) {
            return CropWindowMoveHandler.Type.f4152g;
        }
        if (z9) {
            RectF rectF10 = this.f4182a;
            if (m3977o(f10, f11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !m3964b()) {
                return CropWindowMoveHandler.Type.f4154i;
            }
        }
        return m3970h(f10, f11, z9);
    }

    /* renamed from: l */
    public final CropWindowMoveHandler.Type m3974l(float f10, float f11, float f12, boolean z9) {
        float f13;
        float f14;
        if (m3963a(f10, f11, this.f4182a.centerX(), this.f4182a.top) <= f12) {
            return CropWindowMoveHandler.Type.f4151f;
        }
        if (m3963a(f10, f11, this.f4182a.centerX(), this.f4182a.bottom) <= f12) {
            return CropWindowMoveHandler.Type.f4153h;
        }
        if (z9) {
            RectF rectF = this.f4182a;
            f13 = f10;
            f14 = f11;
            if (m3977o(f13, f14, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return CropWindowMoveHandler.Type.f4154i;
            }
        } else {
            f13 = f10;
            f14 = f11;
        }
        return m3970h(f13, f14, z9);
    }

    /* renamed from: m */
    public final float m3975m() {
        return this.f4193l;
    }

    /* renamed from: n */
    public final float m3976n() {
        return this.f4192k;
    }

    /* renamed from: o */
    public final boolean m3977o(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: p */
    public final boolean m3978p(float f10, float f11, float f12, float f13, float f14) {
        return m3963a(f10, f11, f12, f13) <= f14;
    }

    /* renamed from: q */
    public final boolean m3979q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: r */
    public final boolean m3980r(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }

    /* renamed from: s */
    public final void m3981s(float f10, float f11, float f12, float f13) {
        this.f4186e = f10;
        this.f4187f = f11;
        this.f4192k = f12;
        this.f4193l = f13;
    }

    /* renamed from: t */
    public final void m3982t(CropImageOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f4184c = options.minCropWindowWidth;
        this.f4185d = options.minCropWindowHeight;
        this.f4188g = options.minCropResultWidth;
        this.f4189h = options.minCropResultHeight;
        this.f4190i = options.maxCropResultWidth;
        this.f4191j = options.maxCropResultHeight;
    }

    /* renamed from: u */
    public final void m3983u(int i10, int i11) {
        this.f4190i = i10;
        this.f4191j = i11;
    }

    /* renamed from: v */
    public final void m3984v(int i10, int i11) {
        this.f4188g = i10;
        this.f4189h = i11;
    }

    /* renamed from: w */
    public final void m3985w(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f4182a.set(rect);
    }

    /* renamed from: x */
    public final boolean m3986x() {
        return this.f4182a.width() >= 100.0f && this.f4182a.height() >= 100.0f;
    }
}
