package com.canhub.cropper;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.collection.AbstractC0584a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.canhub.cropper.g0 */
/* loaded from: classes2.dex */
public final class C3436g0 {

    /* renamed from: a */
    public final CropWindowMoveHandler$Type f2597a;

    /* renamed from: b */
    public final float f2598b;

    /* renamed from: c */
    public final float f2599c;

    /* renamed from: d */
    public final float f2600d;

    /* renamed from: e */
    public final float f2601e;

    /* renamed from: f */
    public final PointF f2602f;

    public C3436g0(CropWindowMoveHandler$Type cropWindowMoveHandler$Type, C3432e0 cropWindowHandler, float f, float f7) {
        float fCenterY;
        float f8;
        float f9;
        AbstractC5830k.m5330g(cropWindowHandler, "cropWindowHandler");
        this.f2597a = cropWindowMoveHandler$Type;
        this.f2598b = cropWindowHandler.m2460e();
        this.f2599c = cropWindowHandler.m2459d();
        this.f2600d = cropWindowHandler.m2458c();
        this.f2601e = cropWindowHandler.m2457b();
        float fCenterX = 0.0f;
        PointF pointF = new PointF(0.0f, 0.0f);
        this.f2602f = pointF;
        RectF rectFM2462g = cropWindowHandler.m2462g();
        switch (AbstractC3434f0.f2595a[cropWindowMoveHandler$Type.ordinal()]) {
            case 1:
                fCenterX = rectFM2462g.left - f;
                fCenterY = rectFM2462g.top;
                f9 = fCenterY - f7;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 2:
                fCenterX = rectFM2462g.right - f;
                fCenterY = rectFM2462g.top;
                f9 = fCenterY - f7;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 3:
                fCenterX = rectFM2462g.left - f;
                fCenterY = rectFM2462g.bottom;
                f9 = fCenterY - f7;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 4:
                fCenterX = rectFM2462g.right - f;
                fCenterY = rectFM2462g.bottom;
                f9 = fCenterY - f7;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 5:
                f8 = rectFM2462g.left;
                fCenterX = f8 - f;
                f9 = 0.0f;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 6:
                fCenterY = rectFM2462g.top;
                f9 = fCenterY - f7;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 7:
                f8 = rectFM2462g.right;
                fCenterX = f8 - f;
                f9 = 0.0f;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 8:
                fCenterY = rectFM2462g.bottom;
                f9 = fCenterY - f7;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            case 9:
                fCenterX = rectFM2462g.centerX() - f;
                fCenterY = rectFM2462g.centerY();
                f9 = fCenterY - f7;
                pointF.x = fCenterX;
                pointF.y = f9;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public static void m2464c(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2, 0.0f);
        float f7 = rectF.left;
        float f8 = rectF2.left;
        if (f7 < f8) {
            rectF.offset(f8 - f7, 0.0f);
        }
        float f9 = rectF.right;
        float f10 = rectF2.right;
        if (f9 > f10) {
            rectF.offset(f10 - f9, 0.0f);
        }
    }

    /* renamed from: f */
    public static void m2465f(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2);
        float f7 = rectF.top;
        float f8 = rectF2.top;
        if (f7 < f8) {
            rectF.offset(0.0f, f8 - f7);
        }
        float f9 = rectF.bottom;
        float f10 = rectF2.bottom;
        if (f9 > f10) {
            rectF.offset(0.0f, f10 - f9);
        }
    }

    /* renamed from: a */
    public final void m2466a(RectF rectF, float f, RectF rectF2, int i, float f7, float f8, boolean z8, boolean z9) {
        float f9 = i;
        PointF pointF = this.f2602f;
        if (f > f9) {
            f = AbstractC0584a.m900a(f, f9, 1.05f, f9);
            pointF.y -= (f - f9) / 1.1f;
        }
        float f10 = rectF2.bottom;
        if (f > f10) {
            pointF.y -= (f - f10) / 2.0f;
        }
        if (f10 - f < f7) {
            f = f10;
        }
        float f11 = rectF.top;
        float f12 = f - f11;
        float f13 = this.f2599c;
        if (f12 < f13) {
            f = f11 + f13;
        }
        float f14 = f - f11;
        float f15 = this.f2601e;
        if (f14 > f15) {
            f = f11 + f15;
        }
        if (f10 - f < f7) {
            f = f10;
        }
        if (f8 > 0.0f) {
            float f16 = (f - f11) * f8;
            float f17 = this.f2598b;
            if (f16 < f17) {
                f = Math.min(f10, (f17 / f8) + f11);
                f16 = (f - rectF.top) * f8;
            }
            float f18 = this.f2600d;
            if (f16 > f18) {
                f = Math.min(rectF2.bottom, (f18 / f8) + rectF.top);
                f16 = (f - rectF.top) * f8;
            }
            if (z8 && z9) {
                f = Math.min(f, Math.min(rectF2.bottom, (rectF2.width() / f8) + rectF.top));
            } else {
                if (z8) {
                    float f19 = rectF.right;
                    float f20 = f19 - f16;
                    float f21 = rectF2.left;
                    if (f20 < f21) {
                        f = Math.min(rectF2.bottom, ((f19 - f21) / f8) + rectF.top);
                        f16 = (f - rectF.top) * f8;
                    }
                }
                if (z9) {
                    float f22 = rectF.left;
                    float f23 = f16 + f22;
                    float f24 = rectF2.right;
                    if (f23 > f24) {
                        f = Math.min(f, Math.min(rectF2.bottom, ((f24 - f22) / f8) + rectF.top));
                    }
                }
            }
        }
        rectF.bottom = f;
    }

    /* renamed from: b */
    public final void m2467b(RectF rectF, float f, RectF rectF2, float f7, float f8, boolean z8, boolean z9) {
        PointF pointF = this.f2602f;
        if (f < 0.0f) {
            f /= 1.05f;
            pointF.x -= f / 1.1f;
        }
        float f9 = rectF2.left;
        if (f < f9) {
            pointF.x -= (f - f9) / 2.0f;
        }
        if (f - f9 < f7) {
            f = f9;
        }
        float f10 = rectF.right;
        float f11 = f10 - f;
        float f12 = this.f2598b;
        if (f11 < f12) {
            f = f10 - f12;
        }
        float f13 = f10 - f;
        float f14 = this.f2600d;
        if (f13 > f14) {
            f = f10 - f14;
        }
        if (f - f9 < f7) {
            f = f9;
        }
        if (f8 > 0.0f) {
            float f15 = (f10 - f) / f8;
            float f16 = this.f2599c;
            if (f15 < f16) {
                f = Math.max(f9, f10 - (f16 * f8));
                f15 = (rectF.right - f) / f8;
            }
            float f17 = this.f2601e;
            if (f15 > f17) {
                f = Math.max(rectF2.left, rectF.right - (f17 * f8));
                f15 = (rectF.right - f) / f8;
            }
            if (z8 && z9) {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f8)));
            } else {
                if (z8) {
                    float f18 = rectF.bottom;
                    float f19 = f18 - f15;
                    float f20 = rectF2.top;
                    if (f19 < f20) {
                        f = Math.max(rectF2.left, rectF.right - ((f18 - f20) * f8));
                        f15 = (rectF.right - f) / f8;
                    }
                }
                if (z9) {
                    float f21 = rectF.top;
                    float f22 = f15 + f21;
                    float f23 = rectF2.bottom;
                    if (f22 > f23) {
                        f = Math.max(f, Math.max(rectF2.left, rectF.right - ((f23 - f21) * f8)));
                    }
                }
            }
        }
        rectF.left = f;
    }

    /* renamed from: d */
    public final void m2468d(RectF rectF, float f, RectF rectF2, int i, float f7, float f8, boolean z8, boolean z9) {
        float f9 = i;
        PointF pointF = this.f2602f;
        if (f > f9) {
            f = AbstractC0584a.m900a(f, f9, 1.05f, f9);
            pointF.x -= (f - f9) / 1.1f;
        }
        float f10 = rectF2.right;
        if (f > f10) {
            pointF.x -= (f - f10) / 2.0f;
        }
        if (f10 - f < f7) {
            f = f10;
        }
        float f11 = rectF.left;
        float f12 = f - f11;
        float f13 = this.f2598b;
        if (f12 < f13) {
            f = f11 + f13;
        }
        float f14 = f - f11;
        float f15 = this.f2600d;
        if (f14 > f15) {
            f = f11 + f15;
        }
        if (f10 - f < f7) {
            f = f10;
        }
        if (f8 > 0.0f) {
            float f16 = (f - f11) / f8;
            float f17 = this.f2599c;
            if (f16 < f17) {
                f = Math.min(f10, (f17 * f8) + f11);
                f16 = (f - rectF.left) / f8;
            }
            float f18 = this.f2601e;
            if (f16 > f18) {
                f = Math.min(rectF2.right, (f18 * f8) + rectF.left);
                f16 = (f - rectF.left) / f8;
            }
            if (z8 && z9) {
                f = Math.min(f, Math.min(rectF2.right, (rectF2.height() * f8) + rectF.left));
            } else {
                if (z8) {
                    float f19 = rectF.bottom;
                    float f20 = f19 - f16;
                    float f21 = rectF2.top;
                    if (f20 < f21) {
                        f = Math.min(rectF2.right, ((f19 - f21) * f8) + rectF.left);
                        f16 = (f - rectF.left) / f8;
                    }
                }
                if (z9) {
                    float f22 = rectF.top;
                    float f23 = f16 + f22;
                    float f24 = rectF2.bottom;
                    if (f23 > f24) {
                        f = Math.min(f, Math.min(rectF2.right, ((f24 - f22) * f8) + rectF.left));
                    }
                }
            }
        }
        rectF.right = f;
    }

    /* renamed from: e */
    public final void m2469e(RectF rectF, float f, RectF rectF2, float f7, float f8, boolean z8, boolean z9) {
        PointF pointF = this.f2602f;
        if (f < 0.0f) {
            f /= 1.05f;
            pointF.y -= f / 1.1f;
        }
        float f9 = rectF2.top;
        if (f < f9) {
            pointF.y -= (f - f9) / 2.0f;
        }
        if (f - f9 < f7) {
            f = f9;
        }
        float f10 = rectF.bottom;
        float f11 = f10 - f;
        float f12 = this.f2599c;
        if (f11 < f12) {
            f = f10 - f12;
        }
        float f13 = f10 - f;
        float f14 = this.f2601e;
        if (f13 > f14) {
            f = f10 - f14;
        }
        if (f - f9 < f7) {
            f = f9;
        }
        if (f8 > 0.0f) {
            float f15 = (f10 - f) * f8;
            float f16 = this.f2598b;
            if (f15 < f16) {
                f = Math.max(f9, f10 - (f16 / f8));
                f15 = (rectF.bottom - f) * f8;
            }
            float f17 = this.f2600d;
            if (f15 > f17) {
                f = Math.max(rectF2.top, rectF.bottom - (f17 / f8));
                f15 = (rectF.bottom - f) * f8;
            }
            if (z8 && z9) {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f8)));
            } else {
                if (z8) {
                    float f18 = rectF.right;
                    float f19 = f18 - f15;
                    float f20 = rectF2.left;
                    if (f19 < f20) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f18 - f20) / f8));
                        f15 = (rectF.bottom - f) * f8;
                    }
                }
                if (z9) {
                    float f21 = rectF.left;
                    float f22 = f15 + f21;
                    float f23 = rectF2.right;
                    if (f22 > f23) {
                        f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((f23 - f21) / f8)));
                    }
                }
            }
        }
        rectF.top = f;
    }
}
