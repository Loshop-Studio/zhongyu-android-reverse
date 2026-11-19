package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import p131v0.AbstractC4618a;

/* loaded from: classes2.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;


    /* renamed from: a */
    public float f3532a;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.Edge$a */
    public static /* synthetic */ class C3566a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3533a;

        static {
            int[] iArr = new int[Edge.values().length];
            f3533a = iArr;
            try {
                iArr[Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3533a[Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3533a[Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3533a[Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static float m4318a(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.bottom;
        if (i4 - f4 < f5) {
            return i4;
        }
        Edge edge = TOP;
        return Math.max(f4, Math.max((f4 - edge.m4326g()) * f6 <= 40.0f ? edge.m4326g() + (40.0f / f6) : Float.NEGATIVE_INFINITY, f4 <= edge.m4326g() + 40.0f ? edge.m4326g() + 40.0f : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: d */
    public static float m4319d(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.left;
        if (f4 - i4 < f5) {
            return i4;
        }
        Edge edge = RIGHT;
        return Math.min(f4, Math.min(f4 >= edge.m4326g() - 40.0f ? edge.m4326g() - 40.0f : Float.POSITIVE_INFINITY, (edge.m4326g() - f4) / f6 <= 40.0f ? edge.m4326g() - (f6 * 40.0f) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: e */
    public static float m4320e(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.right;
        if (i4 - f4 < f5) {
            return i4;
        }
        Edge edge = LEFT;
        return Math.max(f4, Math.max(f4 <= edge.m4326g() + 40.0f ? edge.m4326g() + 40.0f : Float.NEGATIVE_INFINITY, (f4 - edge.m4326g()) / f6 <= 40.0f ? edge.m4326g() + (f6 * 40.0f) : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: f */
    public static float m4321f(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.top;
        if (f4 - i4 < f5) {
            return i4;
        }
        Edge edge = BOTTOM;
        return Math.min(f4, Math.min(f4 >= edge.m4326g() - 40.0f ? edge.m4326g() - 40.0f : Float.POSITIVE_INFINITY, (edge.m4326g() - f4) * f6 <= 40.0f ? edge.m4326g() - (40.0f / f6) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: h */
    public static float m4322h() {
        return BOTTOM.m4326g() - TOP.m4326g();
    }

    /* renamed from: i */
    public static float m4323i() {
        return RIGHT.m4326g() - LEFT.m4326g();
    }

    /* renamed from: b */
    public void m4324b(float f4) {
        float fM4326g = LEFT.m4326g();
        float fM4326g2 = TOP.m4326g();
        float fM4326g3 = RIGHT.m4326g();
        float fM4326g4 = BOTTOM.m4326g();
        int i4 = C3566a.f3533a[ordinal()];
        if (i4 == 1) {
            this.f3532a = AbstractC4618a.m6392e(fM4326g2, fM4326g3, fM4326g4, f4);
            return;
        }
        if (i4 == 2) {
            this.f3532a = AbstractC4618a.m6394g(fM4326g, fM4326g3, fM4326g4, f4);
        } else if (i4 == 3) {
            this.f3532a = AbstractC4618a.m6393f(fM4326g, fM4326g2, fM4326g4, f4);
        } else {
            if (i4 != 4) {
                return;
            }
            this.f3532a = AbstractC4618a.m6390c(fM4326g, fM4326g2, fM4326g3, f4);
        }
    }

    /* renamed from: c */
    public void m4325c(float f4, float f5, Rect rect, float f6, float f7) {
        int i4 = C3566a.f3533a[ordinal()];
        if (i4 == 1) {
            this.f3532a = m4319d(f4, rect, f6, f7);
            return;
        }
        if (i4 == 2) {
            this.f3532a = m4321f(f5, rect, f6, f7);
        } else if (i4 == 3) {
            this.f3532a = m4320e(f4, rect, f6, f7);
        } else {
            if (i4 != 4) {
                return;
            }
            this.f3532a = m4318a(f5, rect, f6, f7);
        }
    }

    /* renamed from: g */
    public float m4326g() {
        return this.f3532a;
    }

    /* renamed from: j */
    public boolean m4327j(Edge edge, Rect rect, float f4) {
        float fM4332o = edge.m4332o(rect);
        int i4 = C3566a.f3533a[ordinal()];
        if (i4 == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f5 = rect.top;
                float fM4326g = BOTTOM.m4326g() - fM4332o;
                float fM4326g2 = RIGHT.m4326g();
                return m4328k(f5, AbstractC4618a.m6392e(f5, fM4326g2, fM4326g, f4), fM4326g, fM4326g2, rect);
            }
            if (edge.equals(BOTTOM)) {
                float f6 = rect.bottom;
                float fM4326g3 = edge2.m4326g() - fM4332o;
                float fM4326g4 = RIGHT.m4326g();
                return m4328k(fM4326g3, AbstractC4618a.m6392e(fM4326g3, fM4326g4, f6, f4), f6, fM4326g4, rect);
            }
        } else if (i4 == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f7 = rect.left;
                float fM4326g5 = RIGHT.m4326g() - fM4332o;
                float fM4326g6 = BOTTOM.m4326g();
                return m4328k(AbstractC4618a.m6394g(f7, fM4326g5, fM4326g6, f4), f7, fM4326g6, fM4326g5, rect);
            }
            if (edge.equals(RIGHT)) {
                float f8 = rect.right;
                float fM4326g7 = edge3.m4326g() - fM4332o;
                float fM4326g8 = BOTTOM.m4326g();
                return m4328k(AbstractC4618a.m6394g(fM4326g7, f8, fM4326g8, f4), fM4326g7, fM4326g8, f8, rect);
            }
        } else if (i4 == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f9 = rect.top;
                float fM4326g9 = BOTTOM.m4326g() - fM4332o;
                float fM4326g10 = LEFT.m4326g();
                return m4328k(f9, fM4326g10, fM4326g9, AbstractC4618a.m6393f(fM4326g10, f9, fM4326g9, f4), rect);
            }
            if (edge.equals(BOTTOM)) {
                float f10 = rect.bottom;
                float fM4326g11 = edge4.m4326g() - fM4332o;
                float fM4326g12 = LEFT.m4326g();
                return m4328k(fM4326g11, fM4326g12, f10, AbstractC4618a.m6393f(fM4326g12, fM4326g11, f10, f4), rect);
            }
        } else if (i4 == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f11 = rect.left;
                float fM4326g13 = RIGHT.m4326g() - fM4332o;
                float fM4326g14 = TOP.m4326g();
                return m4328k(fM4326g14, f11, AbstractC4618a.m6390c(f11, fM4326g14, fM4326g13, f4), fM4326g13, rect);
            }
            if (edge.equals(RIGHT)) {
                float f12 = rect.right;
                float fM4326g15 = edge5.m4326g() - fM4332o;
                float fM4326g16 = TOP.m4326g();
                return m4328k(fM4326g16, fM4326g15, AbstractC4618a.m6390c(fM4326g15, fM4326g16, f12, f4), f12, rect);
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m4328k(float f4, float f5, float f6, float f7, Rect rect) {
        return f4 < ((float) rect.top) || f5 < ((float) rect.left) || f6 > ((float) rect.bottom) || f7 > ((float) rect.right);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m4329l(android.graphics.Rect r5, float r6) {
        /*
            r4 = this;
            int[] r0 = com.xuexiang.xui.widget.imageview.crop.Edge.C3566a.f3533a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L37
            r3 = 2
            if (r0 == r3) goto L2c
            r3 = 3
            if (r0 == r3) goto L21
            r3 = 4
            if (r0 == r3) goto L16
            goto L44
        L16:
            int r5 = r5.bottom
            float r5 = (float) r5
            float r0 = r4.f3532a
            float r5 = r5 - r0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L21:
            int r5 = r5.right
            float r5 = (float) r5
            float r0 = r4.f3532a
            float r5 = r5 - r0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L2c:
            float r0 = r4.f3532a
            int r5 = r5.top
            float r5 = (float) r5
            float r0 = r0 - r5
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L37:
            float r0 = r4.f3532a
            int r5 = r5.left
            float r5 = (float) r5
            float r0 = r0 - r5
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            r2 = r1
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.crop.Edge.m4329l(android.graphics.Rect, float):boolean");
    }

    /* renamed from: m */
    public void m4330m(float f4) {
        this.f3532a += f4;
    }

    /* renamed from: n */
    public void m4331n(float f4) {
        this.f3532a = f4;
    }

    /* renamed from: o */
    public float m4332o(Rect rect) {
        int i4;
        float f4;
        float f5 = this.f3532a;
        int i5 = C3566a.f3533a[ordinal()];
        if (i5 == 1) {
            i4 = rect.left;
        } else if (i5 == 2) {
            i4 = rect.top;
        } else if (i5 == 3) {
            i4 = rect.right;
        } else {
            if (i5 != 4) {
                f4 = f5;
                return f4 - f5;
            }
            i4 = rect.bottom;
        }
        f4 = i4;
        return f4 - f5;
    }

    /* renamed from: p */
    public float m4333p(Rect rect) {
        float f4 = this.f3532a;
        int i4 = C3566a.f3533a[ordinal()];
        if (i4 == 1) {
            this.f3532a = rect.left;
        } else if (i4 == 2) {
            this.f3532a = rect.top;
        } else if (i4 == 3) {
            this.f3532a = rect.right;
        } else if (i4 == 4) {
            this.f3532a = rect.bottom;
        }
        return this.f3532a - f4;
    }
}
