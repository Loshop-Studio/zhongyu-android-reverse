package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import p262n8.AbstractC10327a;

/* loaded from: classes5.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;


    /* renamed from: c */
    public float f16116c;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.Edge$a */
    public static /* synthetic */ class C8129a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16117a;

        static {
            int[] iArr = new int[Edge.values().length];
            f16117a = iArr;
            try {
                iArr[Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16117a[Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16117a[Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16117a[Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static float m12721a(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.bottom;
        if (i10 - f10 < f11) {
            return i10;
        }
        Edge edge = TOP;
        return Math.max(f10, Math.max((f10 - edge.m12729k()) * f12 <= 40.0f ? edge.m12729k() + (40.0f / f12) : Float.NEGATIVE_INFINITY, f10 <= edge.m12729k() + 40.0f ? edge.m12729k() + 40.0f : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: e */
    public static float m12722e(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.left;
        if (f10 - i10 < f11) {
            return i10;
        }
        Edge edge = RIGHT;
        return Math.min(f10, Math.min(f10 >= edge.m12729k() - 40.0f ? edge.m12729k() - 40.0f : Float.POSITIVE_INFINITY, (edge.m12729k() - f10) / f12 <= 40.0f ? edge.m12729k() - (f12 * 40.0f) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: f */
    public static float m12723f(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.right;
        if (i10 - f10 < f11) {
            return i10;
        }
        Edge edge = LEFT;
        return Math.max(f10, Math.max(f10 <= edge.m12729k() + 40.0f ? edge.m12729k() + 40.0f : Float.NEGATIVE_INFINITY, (f10 - edge.m12729k()) / f12 <= 40.0f ? edge.m12729k() + (f12 * 40.0f) : Float.NEGATIVE_INFINITY));
    }

    /* renamed from: g */
    public static float m12724g(float f10, Rect rect, float f11, float f12) {
        int i10 = rect.top;
        if (f10 - i10 < f11) {
            return i10;
        }
        Edge edge = BOTTOM;
        return Math.min(f10, Math.min(f10 >= edge.m12729k() - 40.0f ? edge.m12729k() - 40.0f : Float.POSITIVE_INFINITY, (edge.m12729k() - f10) * f12 <= 40.0f ? edge.m12729k() - (40.0f / f12) : Float.POSITIVE_INFINITY));
    }

    /* renamed from: m */
    public static float m12725m() {
        return BOTTOM.m12729k() - TOP.m12729k();
    }

    /* renamed from: n */
    public static float m12726n() {
        return RIGHT.m12729k() - LEFT.m12729k();
    }

    /* renamed from: c */
    public void m12727c(float f10) {
        float fM12729k = LEFT.m12729k();
        float fM12729k2 = TOP.m12729k();
        float fM12729k3 = RIGHT.m12729k();
        float fM12729k4 = BOTTOM.m12729k();
        int i10 = C8129a.f16117a[ordinal()];
        if (i10 == 1) {
            this.f16116c = AbstractC10327a.m21566e(fM12729k2, fM12729k3, fM12729k4, f10);
            return;
        }
        if (i10 == 2) {
            this.f16116c = AbstractC10327a.m21568g(fM12729k, fM12729k3, fM12729k4, f10);
        } else if (i10 == 3) {
            this.f16116c = AbstractC10327a.m21567f(fM12729k, fM12729k2, fM12729k4, f10);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f16116c = AbstractC10327a.m21564c(fM12729k, fM12729k2, fM12729k3, f10);
        }
    }

    /* renamed from: d */
    public void m12728d(float f10, float f11, Rect rect, float f12, float f13) {
        int i10 = C8129a.f16117a[ordinal()];
        if (i10 == 1) {
            this.f16116c = m12722e(f10, rect, f12, f13);
            return;
        }
        if (i10 == 2) {
            this.f16116c = m12724g(f11, rect, f12, f13);
        } else if (i10 == 3) {
            this.f16116c = m12723f(f10, rect, f12, f13);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f16116c = m12721a(f11, rect, f12, f13);
        }
    }

    /* renamed from: k */
    public float m12729k() {
        return this.f16116c;
    }

    /* renamed from: o */
    public boolean m12730o(Edge edge, Rect rect, float f10) {
        float fM12735v = edge.m12735v(rect);
        int i10 = C8129a.f16117a[ordinal()];
        if (i10 == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f11 = rect.top;
                float fM12729k = BOTTOM.m12729k() - fM12735v;
                float fM12729k2 = RIGHT.m12729k();
                return m12731p(f11, AbstractC10327a.m21566e(f11, fM12729k2, fM12729k, f10), fM12729k, fM12729k2, rect);
            }
            if (edge.equals(BOTTOM)) {
                float f12 = rect.bottom;
                float fM12729k3 = edge2.m12729k() - fM12735v;
                float fM12729k4 = RIGHT.m12729k();
                return m12731p(fM12729k3, AbstractC10327a.m21566e(fM12729k3, fM12729k4, f12, f10), f12, fM12729k4, rect);
            }
        } else if (i10 == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f13 = rect.left;
                float fM12729k5 = RIGHT.m12729k() - fM12735v;
                float fM12729k6 = BOTTOM.m12729k();
                return m12731p(AbstractC10327a.m21568g(f13, fM12729k5, fM12729k6, f10), f13, fM12729k6, fM12729k5, rect);
            }
            if (edge.equals(RIGHT)) {
                float f14 = rect.right;
                float fM12729k7 = edge3.m12729k() - fM12735v;
                float fM12729k8 = BOTTOM.m12729k();
                return m12731p(AbstractC10327a.m21568g(fM12729k7, f14, fM12729k8, f10), fM12729k7, fM12729k8, f14, rect);
            }
        } else if (i10 == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f15 = rect.top;
                float fM12729k9 = BOTTOM.m12729k() - fM12735v;
                float fM12729k10 = LEFT.m12729k();
                return m12731p(f15, fM12729k10, fM12729k9, AbstractC10327a.m21567f(fM12729k10, f15, fM12729k9, f10), rect);
            }
            if (edge.equals(BOTTOM)) {
                float f16 = rect.bottom;
                float fM12729k11 = edge4.m12729k() - fM12735v;
                float fM12729k12 = LEFT.m12729k();
                return m12731p(fM12729k11, fM12729k12, f16, AbstractC10327a.m21567f(fM12729k12, fM12729k11, f16, f10), rect);
            }
        } else if (i10 == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f17 = rect.left;
                float fM12729k13 = RIGHT.m12729k() - fM12735v;
                float fM12729k14 = TOP.m12729k();
                return m12731p(fM12729k14, f17, AbstractC10327a.m21564c(f17, fM12729k14, fM12729k13, f10), fM12729k13, rect);
            }
            if (edge.equals(RIGHT)) {
                float f18 = rect.right;
                float fM12729k15 = edge5.m12729k() - fM12735v;
                float fM12729k16 = TOP.m12729k();
                return m12731p(fM12729k16, fM12729k15, AbstractC10327a.m21564c(fM12729k15, fM12729k16, f18, f10), f18, rect);
            }
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m12731p(float f10, float f11, float f12, float f13, Rect rect) {
        return f10 < ((float) rect.top) || f11 < ((float) rect.left) || f12 > ((float) rect.bottom) || f13 > ((float) rect.right);
    }

    /* renamed from: r */
    public boolean m12732r(Rect rect, float f10) {
        int i10 = C8129a.f16117a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 && ((float) rect.bottom) - this.f16116c < f10 : ((float) rect.right) - this.f16116c < f10 : this.f16116c - ((float) rect.top) < f10 : this.f16116c - ((float) rect.left) < f10;
    }

    /* renamed from: t */
    public void m12733t(float f10) {
        this.f16116c += f10;
    }

    /* renamed from: u */
    public void m12734u(float f10) {
        this.f16116c = f10;
    }

    /* renamed from: v */
    public float m12735v(Rect rect) {
        int i10;
        float f10;
        float f11 = this.f16116c;
        int i11 = C8129a.f16117a[ordinal()];
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

    /* renamed from: y */
    public float m12736y(Rect rect) {
        float f10 = this.f16116c;
        int i10 = C8129a.f16117a[ordinal()];
        if (i10 == 1) {
            this.f16116c = rect.left;
        } else if (i10 == 2) {
            this.f16116c = rect.top;
        } else if (i10 == 3) {
            this.f16116c = rect.right;
        } else if (i10 == 4) {
            this.f16116c = rect.bottom;
        }
        return this.f16116c - f10;
    }
}
