package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;
import p262n8.AbstractC10331e;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class Handle {

    /* renamed from: d */
    public static final Handle f16118d;

    /* renamed from: e */
    public static final Handle f16119e;

    /* renamed from: f */
    public static final Handle f16120f;

    /* renamed from: g */
    public static final Handle f16121g;

    /* renamed from: h */
    public static final Handle f16122h;

    /* renamed from: i */
    public static final Handle f16123i;

    /* renamed from: j */
    public static final Handle f16124j;

    /* renamed from: k */
    public static final Handle f16125k;

    /* renamed from: l */
    public static final Handle f16126l;

    /* renamed from: m */
    public static final /* synthetic */ Handle[] f16127m;

    /* renamed from: c */
    public AbstractC10331e f16128c;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        Handle handle = new Handle("TOP_LEFT", 0, new AbstractC10331e(edge, edge2) { // from class: n8.c
            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                C10330d c10330dM21573b = m21573b(f10, f11, f12);
                Edge edge3 = c10330dM21573b.f24612a;
                Edge edge4 = c10330dM21573b.f24613b;
                edge3.m12728d(f10, f11, rect, f13, f12);
                edge4.m12727c(f12);
                if (edge4.m12732r(rect, f13)) {
                    edge4.m12736y(rect);
                    edge3.m12727c(f12);
                }
            }
        });
        f16118d = handle;
        final Edge edge3 = Edge.RIGHT;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new AbstractC10331e(edge, edge3) { // from class: n8.c
            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                C10330d c10330dM21573b = m21573b(f10, f11, f12);
                Edge edge32 = c10330dM21573b.f24612a;
                Edge edge4 = c10330dM21573b.f24613b;
                edge32.m12728d(f10, f11, rect, f13, f12);
                edge4.m12727c(f12);
                if (edge4.m12732r(rect, f13)) {
                    edge4.m12736y(rect);
                    edge32.m12727c(f12);
                }
            }
        });
        f16119e = handle2;
        final Edge edge4 = Edge.BOTTOM;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new AbstractC10331e(edge4, edge2) { // from class: n8.c
            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                C10330d c10330dM21573b = m21573b(f10, f11, f12);
                Edge edge32 = c10330dM21573b.f24612a;
                Edge edge42 = c10330dM21573b.f24613b;
                edge32.m12728d(f10, f11, rect, f13, f12);
                edge42.m12727c(f12);
                if (edge42.m12732r(rect, f13)) {
                    edge42.m12736y(rect);
                    edge32.m12727c(f12);
                }
            }
        });
        f16120f = handle3;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new AbstractC10331e(edge4, edge3) { // from class: n8.c
            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                C10330d c10330dM21573b = m21573b(f10, f11, f12);
                Edge edge32 = c10330dM21573b.f24612a;
                Edge edge42 = c10330dM21573b.f24613b;
                edge32.m12728d(f10, f11, rect, f13, f12);
                edge42.m12727c(f12);
                if (edge42.m12732r(rect, f13)) {
                    edge42.m12736y(rect);
                    edge32.m12727c(f12);
                }
            }
        });
        f16121g = handle4;
        Handle handle5 = new Handle("LEFT", 4, new AbstractC10331e(edge2) { // from class: n8.j

            /* renamed from: d */
            public Edge f24619d;

            {
                super(null, edge2);
                this.f24619d = edge2;
            }

            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f24619d.m12728d(f10, f11, rect, f13, f12);
                float fM12729k = Edge.LEFT.m12729k();
                Edge edge5 = Edge.TOP;
                float fM12729k2 = edge5.m12729k();
                float fM12729k3 = Edge.RIGHT.m12729k();
                Edge edge6 = Edge.BOTTOM;
                float fM12729k4 = edge6.m12729k();
                float fM21565d = (AbstractC10327a.m21565d(fM12729k, fM12729k3, f12) - (fM12729k4 - fM12729k2)) / 2.0f;
                edge5.m12734u(fM12729k2 - fM21565d);
                edge6.m12734u(fM12729k4 + fM21565d);
                if (edge5.m12732r(rect, f13) && !this.f24619d.m12730o(edge5, rect, f12)) {
                    edge6.m12733t(-edge5.m12736y(rect));
                    this.f24619d.m12727c(f12);
                }
                if (!edge6.m12732r(rect, f13) || this.f24619d.m12730o(edge6, rect, f12)) {
                    return;
                }
                edge5.m12733t(-edge6.m12736y(rect));
                this.f24619d.m12727c(f12);
            }
        });
        f16122h = handle5;
        Handle handle6 = new Handle("TOP", 5, new AbstractC10331e(edge) { // from class: n8.g

            /* renamed from: d */
            public Edge f24618d;

            {
                super(edge, null);
                this.f24618d = edge;
            }

            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f24618d.m12728d(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM12729k = edge5.m12729k();
                float fM12729k2 = Edge.TOP.m12729k();
                Edge edge6 = Edge.RIGHT;
                float fM12729k3 = edge6.m12729k();
                float fM21569h = (AbstractC10327a.m21569h(fM12729k2, Edge.BOTTOM.m12729k(), f12) - (fM12729k3 - fM12729k)) / 2.0f;
                edge5.m12734u(fM12729k - fM21569h);
                edge6.m12734u(fM12729k3 + fM21569h);
                if (edge5.m12732r(rect, f13) && !this.f24618d.m12730o(edge5, rect, f12)) {
                    edge6.m12733t(-edge5.m12736y(rect));
                    this.f24618d.m12727c(f12);
                }
                if (!edge6.m12732r(rect, f13) || this.f24618d.m12730o(edge6, rect, f12)) {
                    return;
                }
                edge5.m12733t(-edge6.m12736y(rect));
                this.f24618d.m12727c(f12);
            }
        });
        f16123i = handle6;
        Handle handle7 = new Handle("RIGHT", 6, new AbstractC10331e(edge3) { // from class: n8.j

            /* renamed from: d */
            public Edge f24619d;

            {
                super(null, edge3);
                this.f24619d = edge3;
            }

            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f24619d.m12728d(f10, f11, rect, f13, f12);
                float fM12729k = Edge.LEFT.m12729k();
                Edge edge5 = Edge.TOP;
                float fM12729k2 = edge5.m12729k();
                float fM12729k3 = Edge.RIGHT.m12729k();
                Edge edge6 = Edge.BOTTOM;
                float fM12729k4 = edge6.m12729k();
                float fM21565d = (AbstractC10327a.m21565d(fM12729k, fM12729k3, f12) - (fM12729k4 - fM12729k2)) / 2.0f;
                edge5.m12734u(fM12729k2 - fM21565d);
                edge6.m12734u(fM12729k4 + fM21565d);
                if (edge5.m12732r(rect, f13) && !this.f24619d.m12730o(edge5, rect, f12)) {
                    edge6.m12733t(-edge5.m12736y(rect));
                    this.f24619d.m12727c(f12);
                }
                if (!edge6.m12732r(rect, f13) || this.f24619d.m12730o(edge6, rect, f12)) {
                    return;
                }
                edge5.m12733t(-edge6.m12736y(rect));
                this.f24619d.m12727c(f12);
            }
        });
        f16124j = handle7;
        Handle handle8 = new Handle("BOTTOM", 7, new AbstractC10331e(edge4) { // from class: n8.g

            /* renamed from: d */
            public Edge f24618d;

            {
                super(edge4, null);
                this.f24618d = edge4;
            }

            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f24618d.m12728d(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM12729k = edge5.m12729k();
                float fM12729k2 = Edge.TOP.m12729k();
                Edge edge6 = Edge.RIGHT;
                float fM12729k3 = edge6.m12729k();
                float fM21569h = (AbstractC10327a.m21569h(fM12729k2, Edge.BOTTOM.m12729k(), f12) - (fM12729k3 - fM12729k)) / 2.0f;
                edge5.m12734u(fM12729k - fM21569h);
                edge6.m12734u(fM12729k3 + fM21569h);
                if (edge5.m12732r(rect, f13) && !this.f24618d.m12730o(edge5, rect, f12)) {
                    edge6.m12733t(-edge5.m12736y(rect));
                    this.f24618d.m12727c(f12);
                }
                if (!edge6.m12732r(rect, f13) || this.f24618d.m12730o(edge6, rect, f12)) {
                    return;
                }
                edge5.m12733t(-edge6.m12736y(rect));
                this.f24618d.m12727c(f12);
            }
        });
        f16125k = handle8;
        Handle handle9 = new Handle("CENTER", 8, new AbstractC10331e() { // from class: n8.b
            @Override // p262n8.AbstractC10331e
            /* renamed from: d */
            public void mo21570d(float f10, float f11, float f12, Rect rect, float f13) {
                mo21571e(f10, f11, rect, f13);
            }

            @Override // p262n8.AbstractC10331e
            /* renamed from: e */
            public void mo21571e(float f10, float f11, Rect rect, float f12) {
                Edge edge5 = Edge.LEFT;
                float fM12729k = edge5.m12729k();
                Edge edge6 = Edge.TOP;
                float fM12729k2 = edge6.m12729k();
                Edge edge7 = Edge.RIGHT;
                float fM12729k3 = edge7.m12729k();
                Edge edge8 = Edge.BOTTOM;
                float f13 = f10 - ((fM12729k + fM12729k3) / 2.0f);
                float fM12729k4 = f11 - ((fM12729k2 + edge8.m12729k()) / 2.0f);
                edge5.m12733t(f13);
                edge6.m12733t(fM12729k4);
                edge7.m12733t(f13);
                edge8.m12733t(fM12729k4);
                if (edge5.m12732r(rect, f12)) {
                    edge7.m12733t(edge5.m12736y(rect));
                } else if (edge7.m12732r(rect, f12)) {
                    edge5.m12733t(edge7.m12736y(rect));
                }
                if (edge6.m12732r(rect, f12)) {
                    edge8.m12733t(edge6.m12736y(rect));
                } else if (edge8.m12732r(rect, f12)) {
                    edge6.m12733t(edge8.m12736y(rect));
                }
            }
        });
        f16126l = handle9;
        f16127m = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    public Handle(String str, int i10, AbstractC10331e abstractC10331e) {
        this.f16128c = abstractC10331e;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f16127m.clone();
    }

    /* renamed from: a */
    public void m12737a(float f10, float f11, float f12, Rect rect, float f13) {
        this.f16128c.mo21570d(f10, f11, f12, rect, f13);
    }

    /* renamed from: c */
    public void m12738c(float f10, float f11, Rect rect, float f12) {
        this.f16128c.mo21571e(f10, f11, rect, f12);
    }
}
