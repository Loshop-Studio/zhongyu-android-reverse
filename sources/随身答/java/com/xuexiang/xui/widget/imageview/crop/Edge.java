package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import p261u3.AbstractC9672a;

/* loaded from: classes4.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;


    /* renamed from: a */
    public float f7586a;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.Edge$a */
    public static /* synthetic */ class C6846a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7587a;

        static {
            int[] iArr = new int[Edge.values().length];
            f7587a = iArr;
            try {
                iArr[Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7587a[Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7587a[Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7587a[Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static float m6782a(float f10, Rect rect, float f11, float f12) {
        int i9 = rect.bottom;
        if (i9 - f10 < f11) {
            return i9;
        }
        Edge edge = TOP;
        return Math.max(f10, Math.max((f10 - edge.m6793t()) * f12 <= 40.0f ? edge.m6793t() + (40.0f / f12) : Float.NEGATIVE_INFINITY, f10 <= edge.m6793t() + 40.0f ? edge.m6793t() + 40.0f : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: k */
    public static float m6783k(float f10, Rect rect, float f11, float f12) {
        int i9 = rect.left;
        if (f10 - i9 < f11) {
            return i9;
        }
        Edge edge = RIGHT;
        return Math.min(f10, Math.min(f10 >= edge.m6793t() - 40.0f ? edge.m6793t() - 40.0f : Float.POSITIVE_INFINITY, (edge.m6793t() - f10) / f12 <= 40.0f ? edge.m6793t() - (f12 * 40.0f) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: n */
    public static float m6784n(float f10, Rect rect, float f11, float f12) {
        int i9 = rect.right;
        if (i9 - f10 < f11) {
            return i9;
        }
        Edge edge = LEFT;
        return Math.max(f10, Math.max(f10 <= edge.m6793t() + 40.0f ? edge.m6793t() + 40.0f : Float.NEGATIVE_INFINITY, (f10 - edge.m6793t()) / f12 <= 40.0f ? edge.m6793t() + (f12 * 40.0f) : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: q */
    public static float m6785q(float f10, Rect rect, float f11, float f12) {
        int i9 = rect.top;
        if (f10 - i9 < f11) {
            return i9;
        }
        Edge edge = BOTTOM;
        return Math.min(f10, Math.min(f10 >= edge.m6793t() - 40.0f ? edge.m6793t() - 40.0f : Float.POSITIVE_INFINITY, (edge.m6793t() - f10) * f12 <= 40.0f ? edge.m6793t() - (40.0f / f12) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: u */
    public static float m6786u() {
        return BOTTOM.m6793t() - TOP.m6793t();
    }

    /* renamed from: v */
    public static float m6787v() {
        return RIGHT.m6793t() - LEFT.m6793t();
    }

    /* renamed from: A */
    public void m6788A(float f10) {
        this.f7586a = f10;
    }

    /* renamed from: B */
    public float m6789B(Rect rect) {
        int i9;
        float f10;
        float f11 = this.f7586a;
        int i10 = C6846a.f7587a[ordinal()];
        if (i10 == 1) {
            i9 = rect.left;
        } else if (i10 == 2) {
            i9 = rect.top;
        } else if (i10 == 3) {
            i9 = rect.right;
        } else {
            if (i10 != 4) {
                f10 = f11;
                return f10 - f11;
            }
            i9 = rect.bottom;
        }
        f10 = i9;
        return f10 - f11;
    }

    /* renamed from: C */
    public float m6790C(Rect rect) {
        float f10 = this.f7586a;
        int i9 = C6846a.f7587a[ordinal()];
        if (i9 == 1) {
            this.f7586a = rect.left;
        } else if (i9 == 2) {
            this.f7586a = rect.top;
        } else if (i9 == 3) {
            this.f7586a = rect.right;
        } else if (i9 == 4) {
            this.f7586a = rect.bottom;
        }
        return this.f7586a - f10;
    }

    /* renamed from: c */
    public void m6791c(float f10) {
        float fM6793t = LEFT.m6793t();
        float fM6793t2 = TOP.m6793t();
        float fM6793t3 = RIGHT.m6793t();
        float fM6793t4 = BOTTOM.m6793t();
        int i9 = C6846a.f7587a[ordinal()];
        if (i9 == 1) {
            this.f7586a = AbstractC9672a.m16135e(fM6793t2, fM6793t3, fM6793t4, f10);
            return;
        }
        if (i9 == 2) {
            this.f7586a = AbstractC9672a.m16137g(fM6793t, fM6793t3, fM6793t4, f10);
        } else if (i9 == 3) {
            this.f7586a = AbstractC9672a.m16136f(fM6793t, fM6793t2, fM6793t4, f10);
        } else {
            if (i9 != 4) {
                return;
            }
            this.f7586a = AbstractC9672a.m16133c(fM6793t, fM6793t2, fM6793t3, f10);
        }
    }

    /* renamed from: g */
    public void m6792g(float f10, float f11, Rect rect, float f12, float f13) {
        int i9 = C6846a.f7587a[ordinal()];
        if (i9 == 1) {
            this.f7586a = m6783k(f10, rect, f12, f13);
            return;
        }
        if (i9 == 2) {
            this.f7586a = m6785q(f11, rect, f12, f13);
        } else if (i9 == 3) {
            this.f7586a = m6784n(f10, rect, f12, f13);
        } else {
            if (i9 != 4) {
                return;
            }
            this.f7586a = m6782a(f11, rect, f12, f13);
        }
    }

    /* renamed from: t */
    public float m6793t() {
        return this.f7586a;
    }

    /* renamed from: w */
    public boolean m6794w(Edge edge, Rect rect, float f10) {
        float fM6789B = edge.m6789B(rect);
        int i9 = C6846a.f7587a[ordinal()];
        if (i9 == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f11 = rect.top;
                float fM6793t = BOTTOM.m6793t() - fM6789B;
                float fM6793t2 = RIGHT.m6793t();
                return m6795x(f11, AbstractC9672a.m16135e(f11, fM6793t2, fM6793t, f10), fM6793t, fM6793t2, rect);
            }
            if (edge.equals(BOTTOM)) {
                float f12 = rect.bottom;
                float fM6793t3 = edge2.m6793t() - fM6789B;
                float fM6793t4 = RIGHT.m6793t();
                return m6795x(fM6793t3, AbstractC9672a.m16135e(fM6793t3, fM6793t4, f12, f10), f12, fM6793t4, rect);
            }
        } else if (i9 == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f13 = rect.left;
                float fM6793t5 = RIGHT.m6793t() - fM6789B;
                float fM6793t6 = BOTTOM.m6793t();
                return m6795x(AbstractC9672a.m16137g(f13, fM6793t5, fM6793t6, f10), f13, fM6793t6, fM6793t5, rect);
            }
            if (edge.equals(RIGHT)) {
                float f14 = rect.right;
                float fM6793t7 = edge3.m6793t() - fM6789B;
                float fM6793t8 = BOTTOM.m6793t();
                return m6795x(AbstractC9672a.m16137g(fM6793t7, f14, fM6793t8, f10), fM6793t7, fM6793t8, f14, rect);
            }
        } else if (i9 == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f15 = rect.top;
                float fM6793t9 = BOTTOM.m6793t() - fM6789B;
                float fM6793t10 = LEFT.m6793t();
                return m6795x(f15, fM6793t10, fM6793t9, AbstractC9672a.m16136f(fM6793t10, f15, fM6793t9, f10), rect);
            }
            if (edge.equals(BOTTOM)) {
                float f16 = rect.bottom;
                float fM6793t11 = edge4.m6793t() - fM6789B;
                float fM6793t12 = LEFT.m6793t();
                return m6795x(fM6793t11, fM6793t12, f16, AbstractC9672a.m16136f(fM6793t12, fM6793t11, f16, f10), rect);
            }
        } else if (i9 == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f17 = rect.left;
                float fM6793t13 = RIGHT.m6793t() - fM6789B;
                float fM6793t14 = TOP.m6793t();
                return m6795x(fM6793t14, f17, AbstractC9672a.m16133c(f17, fM6793t14, fM6793t13, f10), fM6793t13, rect);
            }
            if (edge.equals(RIGHT)) {
                float f18 = rect.right;
                float fM6793t15 = edge5.m6793t() - fM6789B;
                float fM6793t16 = TOP.m6793t();
                return m6795x(fM6793t16, fM6793t15, AbstractC9672a.m16133c(fM6793t15, fM6793t16, f18, f10), f18, rect);
            }
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m6795x(float f10, float f11, float f12, float f13, Rect rect) {
        return f10 < ((float) rect.top) || f11 < ((float) rect.left) || f12 > ((float) rect.bottom) || f13 > ((float) rect.right);
    }

    /* renamed from: y */
    public boolean m6796y(Rect rect, float f10) {
        int i9 = C6846a.f7587a[ordinal()];
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 == 4 && ((float) rect.bottom) - this.f7586a < f10 : ((float) rect.right) - this.f7586a < f10 : this.f7586a - ((float) rect.top) < f10 : this.f7586a - ((float) rect.left) < f10;
    }

    /* renamed from: z */
    public void m6797z(float f10) {
        this.f7586a += f10;
    }
}
