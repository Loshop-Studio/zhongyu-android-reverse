package com.canhub.cropper;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CropWindowMoveHandler {

    /* renamed from: g */
    public static final C5433a f4139g = new C5433a(null);

    /* renamed from: a */
    public final Type f4140a;

    /* renamed from: b */
    public final float f4141b;

    /* renamed from: c */
    public final float f4142c;

    /* renamed from: d */
    public final float f4143d;

    /* renamed from: e */
    public final float f4144e;

    /* renamed from: f */
    public final PointF f4145f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m13558d2 = {"Lcom/canhub/cropper/CropWindowMoveHandler$Type;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Type {

        /* renamed from: a */
        public static final Type f4146a = new Type("TOP_LEFT", 0);

        /* renamed from: b */
        public static final Type f4147b = new Type("TOP_RIGHT", 1);

        /* renamed from: c */
        public static final Type f4148c = new Type("BOTTOM_LEFT", 2);

        /* renamed from: d */
        public static final Type f4149d = new Type("BOTTOM_RIGHT", 3);

        /* renamed from: e */
        public static final Type f4150e = new Type("LEFT", 4);

        /* renamed from: f */
        public static final Type f4151f = new Type("TOP", 5);

        /* renamed from: g */
        public static final Type f4152g = new Type("RIGHT", 6);

        /* renamed from: h */
        public static final Type f4153h = new Type("BOTTOM", 7);

        /* renamed from: i */
        public static final Type f4154i = new Type("CENTER", 8);

        /* renamed from: j */
        public static final /* synthetic */ Type[] f4155j;

        /* renamed from: k */
        public static final /* synthetic */ EnumEntries f4156k;

        static {
            Type[] typeArrM3909a = m3909a();
            f4155j = typeArrM3909a;
            f4156k = EnumEntriesKt.enumEntries(typeArrM3909a);
        }

        public Type(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Type[] m3909a() {
            return new Type[]{f4146a, f4147b, f4148c, f4149d, f4150e, f4151f, f4152g, f4153h, f4154i};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f4155j.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropWindowMoveHandler$a */
    public static final class C5433a {
        public /* synthetic */ C5433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float m3910a(float f10, float f11, float f12, float f13) {
            return (f12 - f10) / (f13 - f11);
        }

        public C5433a() {
        }
    }

    /* renamed from: com.canhub.cropper.CropWindowMoveHandler$b */
    public /* synthetic */ class C5434b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4157a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.f4146a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.f4147b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.f4148c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.f4149d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.f4150e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.f4151f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Type.f4152g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Type.f4153h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Type.f4154i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f4157a = iArr;
        }
    }

    public CropWindowMoveHandler(Type type, C5438d cropWindowHandler, float f10, float f11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cropWindowHandler, "cropWindowHandler");
        this.f4140a = type;
        this.f4141b = cropWindowHandler.m3968f();
        this.f4142c = cropWindowHandler.m3967e();
        this.f4143d = cropWindowHandler.m3966d();
        this.f4144e = cropWindowHandler.m3965c();
        this.f4145f = new PointF(0.0f, 0.0f);
        m3903k(cropWindowHandler.m3971i(), f10, f11);
    }

    /* renamed from: a */
    public final void m3893a(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z9, boolean z10) {
        float f13 = i10;
        if (f10 > f13) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            this.f4145f.y -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.bottom;
        if (f10 > f14) {
            this.f4145f.y -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.top;
        float f16 = f10 - f15;
        float f17 = this.f4142c;
        if (f16 < f17) {
            f10 = f15 + f17;
        }
        float f18 = f10 - f15;
        float f19 = this.f4144e;
        if (f18 > f19) {
            f10 = f15 + f19;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f20 = (f10 - f15) * f12;
            float f21 = this.f4141b;
            if (f20 < f21) {
                f10 = Math.min(f14, f15 + (f21 / f12));
                f20 = (f10 - rectF.top) * f12;
            }
            float f22 = this.f4143d;
            if (f20 > f22) {
                f10 = Math.min(rectF2.bottom, rectF.top + (f22 / f12));
                f20 = (f10 - rectF.top) * f12;
            }
            if (z9 && z10) {
                f10 = Math.min(f10, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f12)));
            } else {
                if (z9) {
                    float f23 = rectF.right;
                    float f24 = f23 - f20;
                    float f25 = rectF2.left;
                    if (f24 < f25) {
                        f10 = Math.min(rectF2.bottom, rectF.top + ((f23 - f25) / f12));
                        f20 = (f10 - rectF.top) * f12;
                    }
                }
                if (z10) {
                    float f26 = rectF.left;
                    float f27 = f20 + f26;
                    float f28 = rectF2.right;
                    if (f27 > f28) {
                        f10 = Math.min(f10, Math.min(rectF2.bottom, rectF.top + ((f28 - f26) / f12)));
                    }
                }
            }
        }
        rectF.bottom = f10;
    }

    /* renamed from: b */
    public final void m3894b(RectF rectF, float f10) {
        rectF.bottom = rectF.top + (rectF.width() / f10);
    }

    /* renamed from: c */
    public final void m3895c(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z9, boolean z10) {
        if (f10 < 0.0f) {
            f10 /= 1.05f;
            this.f4145f.x -= f10 / 1.1f;
        }
        float f13 = rectF2.left;
        if (f10 < f13) {
            this.f4145f.x -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.right;
        float f15 = f14 - f10;
        float f16 = this.f4141b;
        if (f15 < f16) {
            f10 = f14 - f16;
        }
        float f17 = f14 - f10;
        float f18 = this.f4143d;
        if (f17 > f18) {
            f10 = f14 - f18;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f19 = (f14 - f10) / f12;
            float f20 = this.f4142c;
            if (f19 < f20) {
                f10 = Math.max(f13, f14 - (f20 * f12));
                f19 = (rectF.right - f10) / f12;
            }
            float f21 = this.f4144e;
            if (f19 > f21) {
                f10 = Math.max(rectF2.left, rectF.right - (f21 * f12));
                f19 = (rectF.right - f10) / f12;
            }
            if (z9 && z10) {
                f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - (rectF2.height() * f12)));
            } else {
                if (z9) {
                    float f22 = rectF.bottom;
                    float f23 = f22 - f19;
                    float f24 = rectF2.top;
                    if (f23 < f24) {
                        f10 = Math.max(rectF2.left, rectF.right - ((f22 - f24) * f12));
                        f19 = (rectF.right - f10) / f12;
                    }
                }
                if (z10) {
                    float f25 = rectF.top;
                    float f26 = f19 + f25;
                    float f27 = rectF2.bottom;
                    if (f26 > f27) {
                        f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - ((f27 - f25) * f12)));
                    }
                }
            }
        }
        rectF.left = f10;
    }

    /* renamed from: d */
    public final void m3896d(RectF rectF, float f10) {
        rectF.left = rectF.right - (rectF.height() * f10);
    }

    /* renamed from: e */
    public final void m3897e(RectF rectF, RectF rectF2, float f10) {
        rectF.inset((rectF.width() - (rectF.height() * f10)) / 2, 0.0f);
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.right;
        float f14 = rectF2.right;
        if (f13 > f14) {
            rectF.offset(f14 - f13, 0.0f);
        }
    }

    /* renamed from: f */
    public final void m3898f(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z9, boolean z10) {
        float f13 = i10;
        if (f10 > f13) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            this.f4145f.x -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.right;
        if (f10 > f14) {
            this.f4145f.x -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.left;
        float f16 = f10 - f15;
        float f17 = this.f4141b;
        if (f16 < f17) {
            f10 = f15 + f17;
        }
        float f18 = f10 - f15;
        float f19 = this.f4143d;
        if (f18 > f19) {
            f10 = f15 + f19;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f20 = (f10 - f15) / f12;
            float f21 = this.f4142c;
            if (f20 < f21) {
                f10 = Math.min(f14, f15 + (f21 * f12));
                f20 = (f10 - rectF.left) / f12;
            }
            float f22 = this.f4144e;
            if (f20 > f22) {
                f10 = Math.min(rectF2.right, rectF.left + (f22 * f12));
                f20 = (f10 - rectF.left) / f12;
            }
            if (z9 && z10) {
                f10 = Math.min(f10, Math.min(rectF2.right, rectF.left + (rectF2.height() * f12)));
            } else {
                if (z9) {
                    float f23 = rectF.bottom;
                    float f24 = f23 - f20;
                    float f25 = rectF2.top;
                    if (f24 < f25) {
                        f10 = Math.min(rectF2.right, rectF.left + ((f23 - f25) * f12));
                        f20 = (f10 - rectF.left) / f12;
                    }
                }
                if (z10) {
                    float f26 = rectF.top;
                    float f27 = f20 + f26;
                    float f28 = rectF2.bottom;
                    if (f27 > f28) {
                        f10 = Math.min(f10, Math.min(rectF2.right, rectF.left + ((f28 - f26) * f12)));
                    }
                }
            }
        }
        rectF.right = f10;
    }

    /* renamed from: g */
    public final void m3899g(RectF rectF, float f10) {
        rectF.right = rectF.left + (rectF.height() * f10);
    }

    /* renamed from: h */
    public final void m3900h(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z9, boolean z10) {
        if (f10 < 0.0f) {
            f10 /= 1.05f;
            this.f4145f.y -= f10 / 1.1f;
        }
        float f13 = rectF2.top;
        if (f10 < f13) {
            this.f4145f.y -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.bottom;
        float f15 = f14 - f10;
        float f16 = this.f4142c;
        if (f15 < f16) {
            f10 = f14 - f16;
        }
        float f17 = f14 - f10;
        float f18 = this.f4144e;
        if (f17 > f18) {
            f10 = f14 - f18;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f19 = (f14 - f10) * f12;
            float f20 = this.f4141b;
            if (f19 < f20) {
                f10 = Math.max(f13, f14 - (f20 / f12));
                f19 = (rectF.bottom - f10) * f12;
            }
            float f21 = this.f4143d;
            if (f19 > f21) {
                f10 = Math.max(rectF2.top, rectF.bottom - (f21 / f12));
                f19 = (rectF.bottom - f10) * f12;
            }
            if (z9 && z10) {
                f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f12)));
            } else {
                if (z9) {
                    float f22 = rectF.right;
                    float f23 = f22 - f19;
                    float f24 = rectF2.left;
                    if (f23 < f24) {
                        f10 = Math.max(rectF2.top, rectF.bottom - ((f22 - f24) / f12));
                        f19 = (rectF.bottom - f10) * f12;
                    }
                }
                if (z10) {
                    float f25 = rectF.left;
                    float f26 = f19 + f25;
                    float f27 = rectF2.right;
                    if (f26 > f27) {
                        f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - ((f27 - f25) / f12)));
                    }
                }
            }
        }
        rectF.top = f10;
    }

    /* renamed from: i */
    public final void m3901i(RectF rectF, RectF rectF2, float f10) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f10)) / 2);
        float f11 = rectF.top;
        float f12 = rectF2.top;
        if (f11 < f12) {
            rectF.offset(0.0f, f12 - f11);
        }
        float f13 = rectF.bottom;
        float f14 = rectF2.bottom;
        if (f13 > f14) {
            rectF.offset(0.0f, f14 - f13);
        }
    }

    /* renamed from: j */
    public final void m3902j(RectF rectF, float f10) {
        rectF.top = rectF.bottom - (rectF.width() / f10);
    }

    /* renamed from: k */
    public final void m3903k(RectF rectF, float f10, float f11) {
        float fCenterY;
        float f12;
        float f13;
        float fCenterX = 0.0f;
        switch (C5434b.f4157a[this.f4140a.ordinal()]) {
            case 1:
                fCenterX = rectF.left - f10;
                fCenterY = rectF.top;
                f13 = fCenterY - f11;
                PointF pointF = this.f4145f;
                pointF.x = fCenterX;
                pointF.y = f13;
                return;
            case 2:
                fCenterX = rectF.right - f10;
                fCenterY = rectF.top;
                f13 = fCenterY - f11;
                PointF pointF2 = this.f4145f;
                pointF2.x = fCenterX;
                pointF2.y = f13;
                return;
            case 3:
                fCenterX = rectF.left - f10;
                fCenterY = rectF.bottom;
                f13 = fCenterY - f11;
                PointF pointF22 = this.f4145f;
                pointF22.x = fCenterX;
                pointF22.y = f13;
                return;
            case 4:
                fCenterX = rectF.right - f10;
                fCenterY = rectF.bottom;
                f13 = fCenterY - f11;
                PointF pointF222 = this.f4145f;
                pointF222.x = fCenterX;
                pointF222.y = f13;
                return;
            case 5:
                f12 = rectF.left;
                fCenterX = f12 - f10;
                f13 = 0.0f;
                PointF pointF2222 = this.f4145f;
                pointF2222.x = fCenterX;
                pointF2222.y = f13;
                return;
            case 6:
                fCenterY = rectF.top;
                f13 = fCenterY - f11;
                PointF pointF22222 = this.f4145f;
                pointF22222.x = fCenterX;
                pointF22222.y = f13;
                return;
            case 7:
                f12 = rectF.right;
                fCenterX = f12 - f10;
                f13 = 0.0f;
                PointF pointF222222 = this.f4145f;
                pointF222222.x = fCenterX;
                pointF222222.y = f13;
                return;
            case 8:
                fCenterY = rectF.bottom;
                f13 = fCenterY - f11;
                PointF pointF2222222 = this.f4145f;
                pointF2222222.x = fCenterX;
                pointF2222222.y = f13;
                return;
            case 9:
                fCenterX = rectF.centerX() - f10;
                fCenterY = rectF.centerY();
                f13 = fCenterY - f11;
                PointF pointF22222222 = this.f4145f;
                pointF22222222.x = fCenterX;
                pointF22222222.y = f13;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: l */
    public final void m3904l(RectF rect, float f10, float f11, RectF bounds, int i10, int i11, float f12, boolean z9, float f13) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        PointF pointF = this.f4145f;
        float f14 = pointF.x + f10;
        float f15 = pointF.y + f11;
        if (this.f4140a == Type.f4154i) {
            m3905m(rect, f14, f15, bounds, i10, i11, f12);
        } else if (z9) {
            m3906n(rect, f14, f15, bounds, i10, i11, f12, f13);
        } else {
            m3907o(rect, f14, f15, bounds, i10, i11, f12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3905m(android.graphics.RectF r7, float r8, float r9, android.graphics.RectF r10, int r11, int r12, float r13) {
        /*
            r6 = this;
            float r0 = r7.centerX()
            float r8 = r8 - r0
            float r0 = r7.centerY()
            float r9 = r9 - r0
            float r0 = r7.left
            float r1 = r0 + r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 2
            r4 = 1065772646(0x3f866666, float:1.05)
            if (r1 < 0) goto L2e
            float r1 = r7.right
            float r5 = r1 + r8
            float r11 = (float) r11
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 > 0) goto L2e
            float r0 = r0 + r8
            float r11 = r10.left
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 < 0) goto L2e
            float r1 = r1 + r8
            float r11 = r10.right
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 <= 0) goto L39
        L2e:
            float r8 = r8 / r4
            android.graphics.PointF r11 = r6.f4145f
            float r0 = r11.x
            float r1 = (float) r3
            float r1 = r8 / r1
            float r0 = r0 - r1
            r11.x = r0
        L39:
            float r11 = r7.top
            float r0 = r11 + r9
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L58
            float r0 = r7.bottom
            float r1 = r0 + r9
            float r12 = (float) r12
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 > 0) goto L58
            float r11 = r11 + r9
            float r12 = r10.top
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto L58
            float r0 = r0 + r9
            float r11 = r10.bottom
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L63
        L58:
            float r9 = r9 / r4
            android.graphics.PointF r11 = r6.f4145f
            float r12 = r11.y
            float r0 = (float) r3
            float r0 = r9 / r0
            float r12 = r12 - r0
            r11.y = r12
        L63:
            r7.offset(r8, r9)
            r6.m3908p(r7, r10, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropWindowMoveHandler.m3905m(android.graphics.RectF, float, float, android.graphics.RectF, int, int, float):void");
    }

    /* renamed from: n */
    public final void m3906n(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12, float f13) {
        switch (C5434b.f4157a[this.f4140a.ordinal()]) {
            case 1:
                if (f4139g.m3910a(f10, f11, rectF.right, rectF.bottom) < f13) {
                    m3900h(rectF, f11, rectF2, f12, f13, true, false);
                    m3896d(rectF, f13);
                    return;
                } else {
                    m3895c(rectF, f10, rectF2, f12, f13, true, false);
                    m3902j(rectF, f13);
                    return;
                }
            case 2:
                if (f4139g.m3910a(rectF.left, f11, f10, rectF.bottom) < f13) {
                    m3900h(rectF, f11, rectF2, f12, f13, false, true);
                    m3899g(rectF, f13);
                    return;
                } else {
                    m3898f(rectF, f10, rectF2, i10, f12, f13, true, false);
                    m3902j(rectF, f13);
                    return;
                }
            case 3:
                if (f4139g.m3910a(f10, rectF.top, rectF.right, f11) < f13) {
                    m3893a(rectF, f11, rectF2, i11, f12, f13, true, false);
                    m3896d(rectF, f13);
                    return;
                } else {
                    m3895c(rectF, f10, rectF2, f12, f13, false, true);
                    m3894b(rectF, f13);
                    return;
                }
            case 4:
                if (f4139g.m3910a(rectF.left, rectF.top, f10, f11) < f13) {
                    m3893a(rectF, f11, rectF2, i11, f12, f13, false, true);
                    m3899g(rectF, f13);
                    return;
                } else {
                    m3898f(rectF, f10, rectF2, i10, f12, f13, false, true);
                    m3894b(rectF, f13);
                    return;
                }
            case 5:
                m3895c(rectF, f10, rectF2, f12, f13, true, true);
                m3901i(rectF, rectF2, f13);
                return;
            case 6:
                m3900h(rectF, f11, rectF2, f12, f13, true, true);
                m3897e(rectF, rectF2, f13);
                return;
            case 7:
                m3898f(rectF, f10, rectF2, i10, f12, f13, true, true);
                m3901i(rectF, rectF2, f13);
                return;
            case 8:
                m3893a(rectF, f11, rectF2, i11, f12, f13, true, true);
                m3897e(rectF, rectF2, f13);
                return;
            case 9:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: o */
    public final void m3907o(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12) {
        switch (C5434b.f4157a[this.f4140a.ordinal()]) {
            case 1:
                m3900h(rectF, f11, rectF2, f12, 0.0f, false, false);
                m3895c(rectF, f10, rectF2, f12, 0.0f, false, false);
                return;
            case 2:
                m3900h(rectF, f11, rectF2, f12, 0.0f, false, false);
                m3898f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                return;
            case 3:
                m3893a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                m3895c(rectF, f10, rectF2, f12, 0.0f, false, false);
                return;
            case 4:
                m3893a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                m3898f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                return;
            case 5:
                m3895c(rectF, f10, rectF2, f12, 0.0f, false, false);
                return;
            case 6:
                m3900h(rectF, f11, rectF2, f12, 0.0f, false, false);
                return;
            case 7:
                m3898f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                return;
            case 8:
                m3893a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                return;
            case 9:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p */
    public final void m3908p(RectF rectF, RectF rectF2, float f10) {
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12 + f10) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.top;
        float f14 = rectF2.top;
        if (f13 < f14 + f10) {
            rectF.offset(0.0f, f14 - f13);
        }
        float f15 = rectF.right;
        float f16 = rectF2.right;
        if (f15 > f16 - f10) {
            rectF.offset(f16 - f15, 0.0f);
        }
        float f17 = rectF.bottom;
        float f18 = rectF2.bottom;
        if (f17 > f18 - f10) {
            rectF.offset(0.0f, f18 - f17);
        }
    }
}
