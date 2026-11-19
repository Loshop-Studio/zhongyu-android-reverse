package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import p075e3.AbstractC7330a;

/* loaded from: classes4.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;


    /* renamed from: a */
    public float f6328a;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.Edge$a */
    public static /* synthetic */ class C6526a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6329a;

        static {
            int[] iArr = new int[Edge.values().length];
            f6329a = iArr;
            try {
                iArr[Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6329a[Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6329a[Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6329a[Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static float m5676a(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.bottom;
        if (i10 - f10 < f11) {
            return i10;
        }
        Edge edge = TOP;
        return Math.max(f10, Math.max((f10 - edge.m5684q()) * f12 <= 40.0f ? edge.m5684q() + (40.0f / f12) : Float.NEGATIVE_INFINITY, f10 <= edge.m5684q() + 40.0f ? edge.m5684q() + 40.0f : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: k */
    public static float m5677k(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.left;
        if (f10 - i10 < f11) {
            return i10;
        }
        Edge edge = RIGHT;
        return Math.min(f10, Math.min(f10 >= edge.m5684q() - 40.0f ? edge.m5684q() - 40.0f : Float.POSITIVE_INFINITY, (edge.m5684q() - f10) / f12 <= 40.0f ? edge.m5684q() - (f12 * 40.0f) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: m */
    public static float m5678m(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.right;
        if (i10 - f10 < f11) {
            return i10;
        }
        Edge edge = LEFT;
        return Math.max(f10, Math.max(f10 <= edge.m5684q() + 40.0f ? edge.m5684q() + 40.0f : Float.NEGATIVE_INFINITY, (f10 - edge.m5684q()) / f12 <= 40.0f ? edge.m5684q() + (f12 * 40.0f) : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: o */
    public static float m5679o(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.top;
        if (f10 - i10 < f11) {
            return i10;
        }
        Edge edge = BOTTOM;
        return Math.min(f10, Math.min(f10 >= edge.m5684q() - 40.0f ? edge.m5684q() - 40.0f : Float.POSITIVE_INFINITY, (edge.m5684q() - f10) * f12 <= 40.0f ? edge.m5684q() - (40.0f / f12) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: r */
    public static float m5680r() {
        return BOTTOM.m5684q() - TOP.m5684q();
    }

    /* renamed from: s */
    public static float m5681s() {
        return RIGHT.m5684q() - LEFT.m5684q();
    }

    /* renamed from: f */
    public void m5682f(float f10) {
        float fM5684q = LEFT.m5684q();
        float fM5684q2 = TOP.m5684q();
        float fM5684q3 = RIGHT.m5684q();
        float fM5684q4 = BOTTOM.m5684q();
        int i10 = C6526a.f6329a[ordinal()];
        if (i10 == 1) {
            this.f6328a = AbstractC7330a.m11718e(fM5684q2, fM5684q3, fM5684q4, f10);
            return;
        }
        if (i10 == 2) {
            this.f6328a = AbstractC7330a.m11720g(fM5684q, fM5684q3, fM5684q4, f10);
        } else if (i10 == 3) {
            this.f6328a = AbstractC7330a.m11719f(fM5684q, fM5684q2, fM5684q4, f10);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f6328a = AbstractC7330a.m11716c(fM5684q, fM5684q2, fM5684q3, f10);
        }
    }

    /* renamed from: j */
    public void m5683j(float f10, float f11, Rect rect, float f12, float f13) {
        int i10 = C6526a.f6329a[ordinal()];
        if (i10 == 1) {
            this.f6328a = m5677k(f10, rect, f12, f13);
            return;
        }
        if (i10 == 2) {
            this.f6328a = m5679o(f11, rect, f12, f13);
        } else if (i10 == 3) {
            this.f6328a = m5678m(f10, rect, f12, f13);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f6328a = m5676a(f11, rect, f12, f13);
        }
    }

    /* renamed from: q */
    public float m5684q() {
        return this.f6328a;
    }

    /* renamed from: t */
    public boolean m5685t(Edge edge, Rect rect, float f10) {
        float fM5690y = edge.m5690y(rect);
        int i10 = C6526a.f6329a[ordinal()];
        if (i10 == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f11 = rect.top;
                float fM5684q = BOTTOM.m5684q() - fM5690y;
                float fM5684q2 = RIGHT.m5684q();
                return m5686u(f11, AbstractC7330a.m11718e(f11, fM5684q2, fM5684q, f10), fM5684q, fM5684q2, rect);
            }
            if (edge.equals(BOTTOM)) {
                float f12 = rect.bottom;
                float fM5684q3 = edge2.m5684q() - fM5690y;
                float fM5684q4 = RIGHT.m5684q();
                return m5686u(fM5684q3, AbstractC7330a.m11718e(fM5684q3, fM5684q4, f12, f10), f12, fM5684q4, rect);
            }
        } else if (i10 == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f13 = rect.left;
                float fM5684q5 = RIGHT.m5684q() - fM5690y;
                float fM5684q6 = BOTTOM.m5684q();
                return m5686u(AbstractC7330a.m11720g(f13, fM5684q5, fM5684q6, f10), f13, fM5684q6, fM5684q5, rect);
            }
            if (edge.equals(RIGHT)) {
                float f14 = rect.right;
                float fM5684q7 = edge3.m5684q() - fM5690y;
                float fM5684q8 = BOTTOM.m5684q();
                return m5686u(AbstractC7330a.m11720g(fM5684q7, f14, fM5684q8, f10), fM5684q7, fM5684q8, f14, rect);
            }
        } else if (i10 == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f15 = rect.top;
                float fM5684q9 = BOTTOM.m5684q() - fM5690y;
                float fM5684q10 = LEFT.m5684q();
                return m5686u(f15, fM5684q10, fM5684q9, AbstractC7330a.m11719f(fM5684q10, f15, fM5684q9, f10), rect);
            }
            if (edge.equals(BOTTOM)) {
                float f16 = rect.bottom;
                float fM5684q11 = edge4.m5684q() - fM5690y;
                float fM5684q12 = LEFT.m5684q();
                return m5686u(fM5684q11, fM5684q12, f16, AbstractC7330a.m11719f(fM5684q12, fM5684q11, f16, f10), rect);
            }
        } else if (i10 == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f17 = rect.left;
                float fM5684q13 = RIGHT.m5684q() - fM5690y;
                float fM5684q14 = TOP.m5684q();
                return m5686u(fM5684q14, f17, AbstractC7330a.m11716c(f17, fM5684q14, fM5684q13, f10), fM5684q13, rect);
            }
            if (edge.equals(RIGHT)) {
                float f18 = rect.right;
                float fM5684q15 = edge5.m5684q() - fM5690y;
                float fM5684q16 = TOP.m5684q();
                return m5686u(fM5684q16, fM5684q15, AbstractC7330a.m11716c(fM5684q15, fM5684q16, f18, f10), f18, rect);
            }
        }
        return true;
    }

    /* renamed from: u */
    public final boolean m5686u(float f10, float f11, float f12, float f13, Rect rect) {
        return f10 < ((float) rect.top) || f11 < ((float) rect.left) || f12 > ((float) rect.bottom) || f13 > ((float) rect.right);
    }

    /* renamed from: v */
    public boolean m5687v(Rect rect, float f10) {
        int i10 = C6526a.f6329a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 && ((float) rect.bottom) - this.f6328a < f10 : ((float) rect.right) - this.f6328a < f10 : this.f6328a - ((float) rect.top) < f10 : this.f6328a - ((float) rect.left) < f10;
    }

    /* renamed from: w */
    public void m5688w(float f10) {
        this.f6328a += f10;
    }

    /* renamed from: x */
    public void m5689x(float f10) {
        this.f6328a = f10;
    }

    /* renamed from: y */
    public float m5690y(Rect rect) {
        int i10;
        float f10;
        float f11 = this.f6328a;
        int i11 = C6526a.f6329a[ordinal()];
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

    /* renamed from: z */
    public float m5691z(Rect rect) {
        float f10 = this.f6328a;
        int i10 = C6526a.f6329a[ordinal()];
        if (i10 == 1) {
            this.f6328a = rect.left;
        } else if (i10 == 2) {
            this.f6328a = rect.top;
        } else if (i10 == 3) {
            this.f6328a = rect.right;
        } else if (i10 == 4) {
            this.f6328a = rect.bottom;
        }
        return this.f6328a - f10;
    }
}
