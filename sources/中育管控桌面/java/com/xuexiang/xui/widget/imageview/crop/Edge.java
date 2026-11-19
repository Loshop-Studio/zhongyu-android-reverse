package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import p055f2.AbstractC6296a;

/* loaded from: classes3.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;


    /* renamed from: a */
    public float f5053a;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.Edge$a */
    public static /* synthetic */ class C5905a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5054a;

        static {
            int[] iArr = new int[Edge.values().length];
            f5054a = iArr;
            try {
                iArr[Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5054a[Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5054a[Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5054a[Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static float m4695a(float f6, Rect rect, float f7, float f8) {
        int i6 = rect.bottom;
        if (i6 - f6 < f7) {
            return i6;
        }
        Edge edge = TOP;
        return Math.max(f6, Math.max((f6 - edge.m4703g()) * f8 <= 40.0f ? edge.m4703g() + (40.0f / f8) : Float.NEGATIVE_INFINITY, f6 <= edge.m4703g() + 40.0f ? edge.m4703g() + 40.0f : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: d */
    public static float m4696d(float f6, Rect rect, float f7, float f8) {
        int i6 = rect.left;
        if (f6 - i6 < f7) {
            return i6;
        }
        Edge edge = RIGHT;
        return Math.min(f6, Math.min(f6 >= edge.m4703g() - 40.0f ? edge.m4703g() - 40.0f : Float.POSITIVE_INFINITY, (edge.m4703g() - f6) / f8 <= 40.0f ? edge.m4703g() - (f8 * 40.0f) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: e */
    public static float m4697e(float f6, Rect rect, float f7, float f8) {
        int i6 = rect.right;
        if (i6 - f6 < f7) {
            return i6;
        }
        Edge edge = LEFT;
        return Math.max(f6, Math.max(f6 <= edge.m4703g() + 40.0f ? edge.m4703g() + 40.0f : Float.NEGATIVE_INFINITY, (f6 - edge.m4703g()) / f8 <= 40.0f ? edge.m4703g() + (f8 * 40.0f) : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: f */
    public static float m4698f(float f6, Rect rect, float f7, float f8) {
        int i6 = rect.top;
        if (f6 - i6 < f7) {
            return i6;
        }
        Edge edge = BOTTOM;
        return Math.min(f6, Math.min(f6 >= edge.m4703g() - 40.0f ? edge.m4703g() - 40.0f : Float.POSITIVE_INFINITY, (edge.m4703g() - f6) * f8 <= 40.0f ? edge.m4703g() - (40.0f / f8) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: h */
    public static float m4699h() {
        return BOTTOM.m4703g() - TOP.m4703g();
    }

    /* renamed from: i */
    public static float m4700i() {
        return RIGHT.m4703g() - LEFT.m4703g();
    }

    /* renamed from: b */
    public void m4701b(float f6) {
        float fM4703g = LEFT.m4703g();
        float fM4703g2 = TOP.m4703g();
        float fM4703g3 = RIGHT.m4703g();
        float fM4703g4 = BOTTOM.m4703g();
        int i6 = C5905a.f5054a[ordinal()];
        if (i6 == 1) {
            this.f5053a = AbstractC6296a.m6450e(fM4703g2, fM4703g3, fM4703g4, f6);
            return;
        }
        if (i6 == 2) {
            this.f5053a = AbstractC6296a.m6452g(fM4703g, fM4703g3, fM4703g4, f6);
        } else if (i6 == 3) {
            this.f5053a = AbstractC6296a.m6451f(fM4703g, fM4703g2, fM4703g4, f6);
        } else {
            if (i6 != 4) {
                return;
            }
            this.f5053a = AbstractC6296a.m6448c(fM4703g, fM4703g2, fM4703g3, f6);
        }
    }

    /* renamed from: c */
    public void m4702c(float f6, float f7, Rect rect, float f8, float f9) {
        int i6 = C5905a.f5054a[ordinal()];
        if (i6 == 1) {
            this.f5053a = m4696d(f6, rect, f8, f9);
            return;
        }
        if (i6 == 2) {
            this.f5053a = m4698f(f7, rect, f8, f9);
        } else if (i6 == 3) {
            this.f5053a = m4697e(f6, rect, f8, f9);
        } else {
            if (i6 != 4) {
                return;
            }
            this.f5053a = m4695a(f7, rect, f8, f9);
        }
    }

    /* renamed from: g */
    public float m4703g() {
        return this.f5053a;
    }

    /* renamed from: j */
    public boolean m4704j(Edge edge, Rect rect, float f6) {
        float fM4709o = edge.m4709o(rect);
        int i6 = C5905a.f5054a[ordinal()];
        if (i6 == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f7 = rect.top;
                float fM4703g = BOTTOM.m4703g() - fM4709o;
                float fM4703g2 = RIGHT.m4703g();
                return m4705k(f7, AbstractC6296a.m6450e(f7, fM4703g2, fM4703g, f6), fM4703g, fM4703g2, rect);
            }
            if (edge.equals(BOTTOM)) {
                float f8 = rect.bottom;
                float fM4703g3 = edge2.m4703g() - fM4709o;
                float fM4703g4 = RIGHT.m4703g();
                return m4705k(fM4703g3, AbstractC6296a.m6450e(fM4703g3, fM4703g4, f8, f6), f8, fM4703g4, rect);
            }
        } else if (i6 == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f9 = rect.left;
                float fM4703g5 = RIGHT.m4703g() - fM4709o;
                float fM4703g6 = BOTTOM.m4703g();
                return m4705k(AbstractC6296a.m6452g(f9, fM4703g5, fM4703g6, f6), f9, fM4703g6, fM4703g5, rect);
            }
            if (edge.equals(RIGHT)) {
                float f10 = rect.right;
                float fM4703g7 = edge3.m4703g() - fM4709o;
                float fM4703g8 = BOTTOM.m4703g();
                return m4705k(AbstractC6296a.m6452g(fM4703g7, f10, fM4703g8, f6), fM4703g7, fM4703g8, f10, rect);
            }
        } else if (i6 == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f11 = rect.top;
                float fM4703g9 = BOTTOM.m4703g() - fM4709o;
                float fM4703g10 = LEFT.m4703g();
                return m4705k(f11, fM4703g10, fM4703g9, AbstractC6296a.m6451f(fM4703g10, f11, fM4703g9, f6), rect);
            }
            if (edge.equals(BOTTOM)) {
                float f12 = rect.bottom;
                float fM4703g11 = edge4.m4703g() - fM4709o;
                float fM4703g12 = LEFT.m4703g();
                return m4705k(fM4703g11, fM4703g12, f12, AbstractC6296a.m6451f(fM4703g12, fM4703g11, f12, f6), rect);
            }
        } else if (i6 == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f13 = rect.left;
                float fM4703g13 = RIGHT.m4703g() - fM4709o;
                float fM4703g14 = TOP.m4703g();
                return m4705k(fM4703g14, f13, AbstractC6296a.m6448c(f13, fM4703g14, fM4703g13, f6), fM4703g13, rect);
            }
            if (edge.equals(RIGHT)) {
                float f14 = rect.right;
                float fM4703g15 = edge5.m4703g() - fM4709o;
                float fM4703g16 = TOP.m4703g();
                return m4705k(fM4703g16, fM4703g15, AbstractC6296a.m6448c(fM4703g15, fM4703g16, f14, f6), f14, rect);
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m4705k(float f6, float f7, float f8, float f9, Rect rect) {
        return f6 < ((float) rect.top) || f7 < ((float) rect.left) || f8 > ((float) rect.bottom) || f9 > ((float) rect.right);
    }

    /* renamed from: l */
    public boolean m4706l(Rect rect, float f6) {
        int i6 = C5905a.f5054a[ordinal()];
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 == 4 && ((float) rect.bottom) - this.f5053a < f6 : ((float) rect.right) - this.f5053a < f6 : this.f5053a - ((float) rect.top) < f6 : this.f5053a - ((float) rect.left) < f6;
    }

    /* renamed from: m */
    public void m4707m(float f6) {
        this.f5053a += f6;
    }

    /* renamed from: n */
    public void m4708n(float f6) {
        this.f5053a = f6;
    }

    /* renamed from: o */
    public float m4709o(Rect rect) {
        int i6;
        float f6;
        float f7 = this.f5053a;
        int i7 = C5905a.f5054a[ordinal()];
        if (i7 == 1) {
            i6 = rect.left;
        } else if (i7 == 2) {
            i6 = rect.top;
        } else if (i7 == 3) {
            i6 = rect.right;
        } else {
            if (i7 != 4) {
                f6 = f7;
                return f6 - f7;
            }
            i6 = rect.bottom;
        }
        f6 = i6;
        return f6 - f7;
    }

    /* renamed from: p */
    public float m4710p(Rect rect) {
        float f6 = this.f5053a;
        int i6 = C5905a.f5054a[ordinal()];
        if (i6 == 1) {
            this.f5053a = rect.left;
        } else if (i6 == 2) {
            this.f5053a = rect.top;
        } else if (i6 == 3) {
            this.f5053a = rect.right;
        } else if (i6 == 4) {
            this.f5053a = rect.bottom;
        }
        return this.f5053a - f6;
    }
}
