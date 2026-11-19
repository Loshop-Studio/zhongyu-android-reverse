package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import p071d2.AbstractC8278a;

/* loaded from: classes4.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;


    /* renamed from: a */
    public float f7745a;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.Edge$a */
    public static /* synthetic */ class C6932a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7746a;

        static {
            int[] iArr = new int[Edge.values().length];
            f7746a = iArr;
            try {
                iArr[Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7746a[Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7746a[Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7746a[Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static float m6870a(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.bottom;
        if (i10 - f10 < f11) {
            return i10;
        }
        Edge edge = TOP;
        return Math.max(f10, Math.max((f10 - edge.m6878h()) * f12 <= 40.0f ? edge.m6878h() + (40.0f / f12) : Float.NEGATIVE_INFINITY, f10 <= edge.m6878h() + 40.0f ? edge.m6878h() + 40.0f : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: d */
    public static float m6871d(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.left;
        if (f10 - i10 < f11) {
            return i10;
        }
        Edge edge = RIGHT;
        return Math.min(f10, Math.min(f10 >= edge.m6878h() - 40.0f ? edge.m6878h() - 40.0f : Float.POSITIVE_INFINITY, (edge.m6878h() - f10) / f12 <= 40.0f ? edge.m6878h() - (f12 * 40.0f) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: e */
    public static float m6872e(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.right;
        if (i10 - f10 < f11) {
            return i10;
        }
        Edge edge = LEFT;
        return Math.max(f10, Math.max(f10 <= edge.m6878h() + 40.0f ? edge.m6878h() + 40.0f : Float.NEGATIVE_INFINITY, (f10 - edge.m6878h()) / f12 <= 40.0f ? edge.m6878h() + (f12 * 40.0f) : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: g */
    public static float m6873g(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.top;
        if (f10 - i10 < f11) {
            return i10;
        }
        Edge edge = BOTTOM;
        return Math.min(f10, Math.min(f10 >= edge.m6878h() - 40.0f ? edge.m6878h() - 40.0f : Float.POSITIVE_INFINITY, (edge.m6878h() - f10) * f12 <= 40.0f ? edge.m6878h() - (40.0f / f12) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: i */
    public static float m6874i() {
        return BOTTOM.m6878h() - TOP.m6878h();
    }

    /* renamed from: j */
    public static float m6875j() {
        return RIGHT.m6878h() - LEFT.m6878h();
    }

    /* renamed from: b */
    public void m6876b(float f10) {
        float fM6878h = LEFT.m6878h();
        float fM6878h2 = TOP.m6878h();
        float fM6878h3 = RIGHT.m6878h();
        float fM6878h4 = BOTTOM.m6878h();
        int i10 = C6932a.f7746a[ordinal()];
        if (i10 == 1) {
            this.f7745a = AbstractC8278a.m13434e(fM6878h2, fM6878h3, fM6878h4, f10);
            return;
        }
        if (i10 == 2) {
            this.f7745a = AbstractC8278a.m13436g(fM6878h, fM6878h3, fM6878h4, f10);
        } else if (i10 == 3) {
            this.f7745a = AbstractC8278a.m13435f(fM6878h, fM6878h2, fM6878h4, f10);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f7745a = AbstractC8278a.m13432c(fM6878h, fM6878h2, fM6878h3, f10);
        }
    }

    /* renamed from: c */
    public void m6877c(float f10, float f11, Rect rect, float f12, float f13) {
        int i10 = C6932a.f7746a[ordinal()];
        if (i10 == 1) {
            this.f7745a = m6871d(f10, rect, f12, f13);
            return;
        }
        if (i10 == 2) {
            this.f7745a = m6873g(f11, rect, f12, f13);
        } else if (i10 == 3) {
            this.f7745a = m6872e(f10, rect, f12, f13);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f7745a = m6870a(f11, rect, f12, f13);
        }
    }

    /* renamed from: h */
    public float m6878h() {
        return this.f7745a;
    }

    /* renamed from: k */
    public boolean m6879k(Edge edge, Rect rect, float f10) {
        float fM6884p = edge.m6884p(rect);
        int i10 = C6932a.f7746a[ordinal()];
        if (i10 == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f11 = rect.top;
                float fM6878h = BOTTOM.m6878h() - fM6884p;
                float fM6878h2 = RIGHT.m6878h();
                return m6880l(f11, AbstractC8278a.m13434e(f11, fM6878h2, fM6878h, f10), fM6878h, fM6878h2, rect);
            }
            if (edge.equals(BOTTOM)) {
                float f12 = rect.bottom;
                float fM6878h3 = edge2.m6878h() - fM6884p;
                float fM6878h4 = RIGHT.m6878h();
                return m6880l(fM6878h3, AbstractC8278a.m13434e(fM6878h3, fM6878h4, f12, f10), f12, fM6878h4, rect);
            }
        } else if (i10 == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f13 = rect.left;
                float fM6878h5 = RIGHT.m6878h() - fM6884p;
                float fM6878h6 = BOTTOM.m6878h();
                return m6880l(AbstractC8278a.m13436g(f13, fM6878h5, fM6878h6, f10), f13, fM6878h6, fM6878h5, rect);
            }
            if (edge.equals(RIGHT)) {
                float f14 = rect.right;
                float fM6878h7 = edge3.m6878h() - fM6884p;
                float fM6878h8 = BOTTOM.m6878h();
                return m6880l(AbstractC8278a.m13436g(fM6878h7, f14, fM6878h8, f10), fM6878h7, fM6878h8, f14, rect);
            }
        } else if (i10 == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f15 = rect.top;
                float fM6878h9 = BOTTOM.m6878h() - fM6884p;
                float fM6878h10 = LEFT.m6878h();
                return m6880l(f15, fM6878h10, fM6878h9, AbstractC8278a.m13435f(fM6878h10, f15, fM6878h9, f10), rect);
            }
            if (edge.equals(BOTTOM)) {
                float f16 = rect.bottom;
                float fM6878h11 = edge4.m6878h() - fM6884p;
                float fM6878h12 = LEFT.m6878h();
                return m6880l(fM6878h11, fM6878h12, f16, AbstractC8278a.m13435f(fM6878h12, fM6878h11, f16, f10), rect);
            }
        } else if (i10 == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f17 = rect.left;
                float fM6878h13 = RIGHT.m6878h() - fM6884p;
                float fM6878h14 = TOP.m6878h();
                return m6880l(fM6878h14, f17, AbstractC8278a.m13432c(f17, fM6878h14, fM6878h13, f10), fM6878h13, rect);
            }
            if (edge.equals(RIGHT)) {
                float f18 = rect.right;
                float fM6878h15 = edge5.m6878h() - fM6884p;
                float fM6878h16 = TOP.m6878h();
                return m6880l(fM6878h16, fM6878h15, AbstractC8278a.m13432c(fM6878h15, fM6878h16, f18, f10), f18, rect);
            }
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m6880l(float f10, float f11, float f12, float f13, Rect rect) {
        return f10 < ((float) rect.top) || f11 < ((float) rect.left) || f12 > ((float) rect.bottom) || f13 > ((float) rect.right);
    }

    /* renamed from: m */
    public boolean m6881m(Rect rect, float f10) {
        int i10 = C6932a.f7746a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 && ((float) rect.bottom) - this.f7745a < f10 : ((float) rect.right) - this.f7745a < f10 : this.f7745a - ((float) rect.top) < f10 : this.f7745a - ((float) rect.left) < f10;
    }

    /* renamed from: n */
    public void m6882n(float f10) {
        this.f7745a += f10;
    }

    /* renamed from: o */
    public void m6883o(float f10) {
        this.f7745a = f10;
    }

    /* renamed from: p */
    public float m6884p(Rect rect) {
        int i10;
        float f10;
        float f11 = this.f7745a;
        int i11 = C6932a.f7746a[ordinal()];
        if (i11 == 1) {
            i10 = rect.left;
        } else if (i11 == 2) {
            i10 = rect.top;
        } else if (i11 == 3) {
            i10 = rect.right;
        } else {
            if (i11 != 4) {
                f10 = f11;
                return f10 - f11;
            }
            i10 = rect.bottom;
        }
        f10 = i10;
        return f10 - f11;
    }

    /* renamed from: q */
    public float m6885q(Rect rect) {
        float f10 = this.f7745a;
        int i10 = C6932a.f7746a[ordinal()];
        if (i10 == 1) {
            this.f7745a = rect.left;
        } else if (i10 == 2) {
            this.f7745a = rect.top;
        } else if (i10 == 3) {
            this.f7745a = rect.right;
        } else if (i10 == 4) {
            this.f7745a = rect.bottom;
        }
        return this.f7745a - f10;
    }
}
