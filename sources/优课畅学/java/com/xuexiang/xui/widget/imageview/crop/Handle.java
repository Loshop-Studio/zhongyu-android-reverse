package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;
import p071d2.AbstractC8282e;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class Handle {

    /* renamed from: b */
    public static final Handle f7747b;

    /* renamed from: c */
    public static final Handle f7748c;

    /* renamed from: d */
    public static final Handle f7749d;

    /* renamed from: e */
    public static final Handle f7750e;

    /* renamed from: f */
    public static final Handle f7751f;

    /* renamed from: g */
    public static final Handle f7752g;

    /* renamed from: h */
    public static final Handle f7753h;

    /* renamed from: i */
    public static final Handle f7754i;

    /* renamed from: j */
    public static final Handle f7755j;

    /* renamed from: k */
    public static final /* synthetic */ Handle[] f7756k;

    /* renamed from: a */
    public AbstractC8282e f7757a;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        Handle handle = new Handle("TOP_LEFT", 0, new AbstractC8282e(edge, edge2) { // from class: d2.c
            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                C8281d c8281dM13441b = m13441b(f10, f11, f12);
                Edge edge3 = c8281dM13441b.f15683a;
                Edge edge4 = c8281dM13441b.f15684b;
                edge3.m6877c(f10, f11, rect, f13, f12);
                edge4.m6876b(f12);
                if (edge4.m6881m(rect, f13)) {
                    edge4.m6885q(rect);
                    edge3.m6876b(f12);
                }
            }
        });
        f7747b = handle;
        final Edge edge3 = Edge.RIGHT;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new AbstractC8282e(edge, edge3) { // from class: d2.c
            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                C8281d c8281dM13441b = m13441b(f10, f11, f12);
                Edge edge32 = c8281dM13441b.f15683a;
                Edge edge4 = c8281dM13441b.f15684b;
                edge32.m6877c(f10, f11, rect, f13, f12);
                edge4.m6876b(f12);
                if (edge4.m6881m(rect, f13)) {
                    edge4.m6885q(rect);
                    edge32.m6876b(f12);
                }
            }
        });
        f7748c = handle2;
        final Edge edge4 = Edge.BOTTOM;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new AbstractC8282e(edge4, edge2) { // from class: d2.c
            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                C8281d c8281dM13441b = m13441b(f10, f11, f12);
                Edge edge32 = c8281dM13441b.f15683a;
                Edge edge42 = c8281dM13441b.f15684b;
                edge32.m6877c(f10, f11, rect, f13, f12);
                edge42.m6876b(f12);
                if (edge42.m6881m(rect, f13)) {
                    edge42.m6885q(rect);
                    edge32.m6876b(f12);
                }
            }
        });
        f7749d = handle3;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new AbstractC8282e(edge4, edge3) { // from class: d2.c
            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                C8281d c8281dM13441b = m13441b(f10, f11, f12);
                Edge edge32 = c8281dM13441b.f15683a;
                Edge edge42 = c8281dM13441b.f15684b;
                edge32.m6877c(f10, f11, rect, f13, f12);
                edge42.m6876b(f12);
                if (edge42.m6881m(rect, f13)) {
                    edge42.m6885q(rect);
                    edge32.m6876b(f12);
                }
            }
        });
        f7750e = handle4;
        Handle handle5 = new Handle("LEFT", 4, new AbstractC8282e(edge2) { // from class: d2.j

            /* renamed from: d */
            public Edge f15690d;

            {
                super(null, edge2);
                this.f15690d = edge2;
            }

            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f15690d.m6877c(f10, f11, rect, f13, f12);
                float fM6878h = Edge.LEFT.m6878h();
                Edge edge5 = Edge.TOP;
                float fM6878h2 = edge5.m6878h();
                float fM6878h3 = Edge.RIGHT.m6878h();
                Edge edge6 = Edge.BOTTOM;
                float fM6878h4 = edge6.m6878h();
                float fM13433d = (AbstractC8278a.m13433d(fM6878h, fM6878h3, f12) - (fM6878h4 - fM6878h2)) / 2.0f;
                edge5.m6883o(fM6878h2 - fM13433d);
                edge6.m6883o(fM6878h4 + fM13433d);
                if (edge5.m6881m(rect, f13) && !this.f15690d.m6879k(edge5, rect, f12)) {
                    edge6.m6882n(-edge5.m6885q(rect));
                    this.f15690d.m6876b(f12);
                }
                if (!edge6.m6881m(rect, f13) || this.f15690d.m6879k(edge6, rect, f12)) {
                    return;
                }
                edge5.m6882n(-edge6.m6885q(rect));
                this.f15690d.m6876b(f12);
            }
        });
        f7751f = handle5;
        Handle handle6 = new Handle("TOP", 5, new AbstractC8282e(edge) { // from class: d2.g

            /* renamed from: d */
            public Edge f15689d;

            {
                super(edge, null);
                this.f15689d = edge;
            }

            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f15689d.m6877c(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM6878h = edge5.m6878h();
                float fM6878h2 = Edge.TOP.m6878h();
                Edge edge6 = Edge.RIGHT;
                float fM6878h3 = edge6.m6878h();
                float fM13437h = (AbstractC8278a.m13437h(fM6878h2, Edge.BOTTOM.m6878h(), f12) - (fM6878h3 - fM6878h)) / 2.0f;
                edge5.m6883o(fM6878h - fM13437h);
                edge6.m6883o(fM6878h3 + fM13437h);
                if (edge5.m6881m(rect, f13) && !this.f15689d.m6879k(edge5, rect, f12)) {
                    edge6.m6882n(-edge5.m6885q(rect));
                    this.f15689d.m6876b(f12);
                }
                if (!edge6.m6881m(rect, f13) || this.f15689d.m6879k(edge6, rect, f12)) {
                    return;
                }
                edge5.m6882n(-edge6.m6885q(rect));
                this.f15689d.m6876b(f12);
            }
        });
        f7752g = handle6;
        Handle handle7 = new Handle("RIGHT", 6, new AbstractC8282e(edge3) { // from class: d2.j

            /* renamed from: d */
            public Edge f15690d;

            {
                super(null, edge3);
                this.f15690d = edge3;
            }

            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f15690d.m6877c(f10, f11, rect, f13, f12);
                float fM6878h = Edge.LEFT.m6878h();
                Edge edge5 = Edge.TOP;
                float fM6878h2 = edge5.m6878h();
                float fM6878h3 = Edge.RIGHT.m6878h();
                Edge edge6 = Edge.BOTTOM;
                float fM6878h4 = edge6.m6878h();
                float fM13433d = (AbstractC8278a.m13433d(fM6878h, fM6878h3, f12) - (fM6878h4 - fM6878h2)) / 2.0f;
                edge5.m6883o(fM6878h2 - fM13433d);
                edge6.m6883o(fM6878h4 + fM13433d);
                if (edge5.m6881m(rect, f13) && !this.f15690d.m6879k(edge5, rect, f12)) {
                    edge6.m6882n(-edge5.m6885q(rect));
                    this.f15690d.m6876b(f12);
                }
                if (!edge6.m6881m(rect, f13) || this.f15690d.m6879k(edge6, rect, f12)) {
                    return;
                }
                edge5.m6882n(-edge6.m6885q(rect));
                this.f15690d.m6876b(f12);
            }
        });
        f7753h = handle7;
        Handle handle8 = new Handle("BOTTOM", 7, new AbstractC8282e(edge4) { // from class: d2.g

            /* renamed from: d */
            public Edge f15689d;

            {
                super(edge4, null);
                this.f15689d = edge4;
            }

            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f15689d.m6877c(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM6878h = edge5.m6878h();
                float fM6878h2 = Edge.TOP.m6878h();
                Edge edge6 = Edge.RIGHT;
                float fM6878h3 = edge6.m6878h();
                float fM13437h = (AbstractC8278a.m13437h(fM6878h2, Edge.BOTTOM.m6878h(), f12) - (fM6878h3 - fM6878h)) / 2.0f;
                edge5.m6883o(fM6878h - fM13437h);
                edge6.m6883o(fM6878h3 + fM13437h);
                if (edge5.m6881m(rect, f13) && !this.f15689d.m6879k(edge5, rect, f12)) {
                    edge6.m6882n(-edge5.m6885q(rect));
                    this.f15689d.m6876b(f12);
                }
                if (!edge6.m6881m(rect, f13) || this.f15689d.m6879k(edge6, rect, f12)) {
                    return;
                }
                edge5.m6882n(-edge6.m6885q(rect));
                this.f15689d.m6876b(f12);
            }
        });
        f7754i = handle8;
        Handle handle9 = new Handle("CENTER", 8, new AbstractC8282e() { // from class: d2.b
            @Override // p071d2.AbstractC8282e
            /* renamed from: d */
            public void mo13438d(float f10, float f11, float f12, Rect rect, float f13) {
                mo13439e(f10, f11, rect, f13);
            }

            @Override // p071d2.AbstractC8282e
            /* renamed from: e */
            public void mo13439e(float f10, float f11, Rect rect, float f12) {
                Edge edge5 = Edge.LEFT;
                float fM6878h = edge5.m6878h();
                Edge edge6 = Edge.TOP;
                float fM6878h2 = edge6.m6878h();
                Edge edge7 = Edge.RIGHT;
                float fM6878h3 = edge7.m6878h();
                Edge edge8 = Edge.BOTTOM;
                float f13 = f10 - ((fM6878h + fM6878h3) / 2.0f);
                float fM6878h4 = f11 - ((fM6878h2 + edge8.m6878h()) / 2.0f);
                edge5.m6882n(f13);
                edge6.m6882n(fM6878h4);
                edge7.m6882n(f13);
                edge8.m6882n(fM6878h4);
                if (edge5.m6881m(rect, f12)) {
                    edge7.m6882n(edge5.m6885q(rect));
                } else if (edge7.m6881m(rect, f12)) {
                    edge5.m6882n(edge7.m6885q(rect));
                }
                if (edge6.m6881m(rect, f12)) {
                    edge8.m6882n(edge6.m6885q(rect));
                } else if (edge8.m6881m(rect, f12)) {
                    edge6.m6882n(edge8.m6885q(rect));
                }
            }
        });
        f7755j = handle9;
        f7756k = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    public Handle(String str, int i10, AbstractC8282e abstractC8282e) {
        this.f7757a = abstractC8282e;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f7756k.clone();
    }

    /* renamed from: a */
    public void m6886a(float f10, float f11, float f12, Rect rect, float f13) {
        this.f7757a.mo13438d(f10, f11, f12, rect, f13);
    }

    /* renamed from: b */
    public void m6887b(float f10, float f11, Rect rect, float f12) {
        this.f7757a.mo13439e(f10, f11, rect, f12);
    }
}
