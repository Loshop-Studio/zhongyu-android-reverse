package p070b.p113c.p114a.p116e.p128f.p129a;

import android.graphics.Rect;
import p070b.p113c.p114a.C0787a;

/* renamed from: b.c.a.e.f.a.c */
/* loaded from: classes.dex */
public enum EnumC0811c {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;


    /* renamed from: b */
    public float f4530b;

    /* renamed from: a */
    public void m2512a(float f2) {
        float fM2470d;
        float f3 = LEFT.f4530b;
        float f4 = TOP.f4530b;
        float f5 = RIGHT.f4530b;
        float f6 = BOTTOM.f4530b;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            fM2470d = C0787a.m2470d(f4, f5, f6, f2);
        } else if (iOrdinal == 1) {
            fM2470d = C0787a.m2472f(f3, f5, f6, f2);
        } else if (iOrdinal == 2) {
            fM2470d = C0787a.m2471e(f3, f4, f6, f2);
        } else if (iOrdinal != 3) {
            return;
        } else {
            fM2470d = C0787a.m2469c(f3, f4, f5, f2);
        }
        this.f4530b = fM2470d;
    }

    /* renamed from: b */
    public void m2513b(float f2, float f3, Rect rect, float f4, float f5) {
        float fMin;
        float fMin2;
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fMin = rect.right;
                    if (fMin - f2 >= f4) {
                        float f6 = LEFT.f4530b;
                        float f7 = f6 + 40.0f;
                        if (f2 > f7) {
                            f7 = Float.NEGATIVE_INFINITY;
                        }
                        fMin = Math.max(f2, Math.max(f7, (f2 - f6) / f5 <= 40.0f ? (f5 * 40.0f) + f6 : Float.NEGATIVE_INFINITY));
                    }
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    fMin2 = rect.bottom;
                    if (fMin2 - f3 >= f4) {
                        float f8 = TOP.f4530b;
                        float f9 = f8 + 40.0f;
                        if (f3 > f9) {
                            f9 = Float.NEGATIVE_INFINITY;
                        }
                        fMin2 = Math.max(f3, Math.max((f3 - f8) * f5 <= 40.0f ? (40.0f / f5) + f8 : Float.NEGATIVE_INFINITY, f9));
                    }
                }
            } else {
                fMin2 = rect.top;
                if (f3 - fMin2 >= f4) {
                    float f10 = BOTTOM.f4530b;
                    float f11 = f10 - 40.0f;
                    if (f3 < f11) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    fMin2 = Math.min(f3, Math.min(f11, (f10 - f3) * f5 <= 40.0f ? f10 - (40.0f / f5) : Float.POSITIVE_INFINITY));
                }
            }
            this.f4530b = fMin2;
            return;
        }
        fMin = rect.left;
        if (f2 - fMin >= f4) {
            float f12 = RIGHT.f4530b;
            float f13 = f12 - 40.0f;
            if (f2 < f13) {
                f13 = Float.POSITIVE_INFINITY;
            }
            fMin = Math.min(f2, Math.min(f13, (f12 - f2) / f5 <= 40.0f ? f12 - (f5 * 40.0f) : Float.POSITIVE_INFINITY));
        }
        this.f4530b = fMin;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2514c(p070b.p113c.p114a.p116e.p128f.p129a.EnumC0811c r11, android.graphics.Rect r12, float r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p113c.p114a.p116e.p128f.p129a.EnumC0811c.m2514c(b.c.a.e.f.a.c, android.graphics.Rect, float):boolean");
    }

    /* renamed from: d */
    public final boolean m2515d(float f2, float f3, float f4, float f5, Rect rect) {
        return f2 < ((float) rect.top) || f3 < ((float) rect.left) || f4 > ((float) rect.bottom) || f5 > ((float) rect.right);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2516e(android.graphics.Rect r5, float r6) {
        /*
            r4 = this;
            int r0 = r4.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L32
            if (r0 == r1) goto L27
            r3 = 2
            if (r0 == r3) goto L1c
            r3 = 3
            if (r0 == r3) goto L11
            goto L3f
        L11:
            int r5 = r5.bottom
            float r5 = (float) r5
            float r0 = r4.f4530b
            float r5 = r5 - r0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L3d
            goto L3e
        L1c:
            int r5 = r5.right
            float r5 = (float) r5
            float r0 = r4.f4530b
            float r5 = r5 - r0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L3d
            goto L3e
        L27:
            float r0 = r4.f4530b
            int r5 = r5.top
            float r5 = (float) r5
            float r0 = r0 - r5
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L3d
            goto L3e
        L32:
            float r0 = r4.f4530b
            int r5 = r5.left
            float r5 = (float) r5
            float r0 = r0 - r5
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            r2 = r1
        L3f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p113c.p114a.p116e.p128f.p129a.EnumC0811c.m2516e(android.graphics.Rect, float):boolean");
    }

    /* renamed from: f */
    public void m2517f(float f2) {
        this.f4530b += f2;
    }

    /* renamed from: g */
    public float m2518g(Rect rect) {
        int i;
        float f2 = this.f4530b;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            i = rect.left;
        } else if (iOrdinal == 1) {
            i = rect.top;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    i = rect.bottom;
                }
                return this.f4530b - f2;
            }
            i = rect.right;
        }
        this.f4530b = i;
        return this.f4530b - f2;
    }
}
