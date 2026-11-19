package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;
import p075e3.AbstractC7334e;

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
    public static final Handle f6330b;

    /* renamed from: c */
    public static final Handle f6331c;

    /* renamed from: d */
    public static final Handle f6332d;

    /* renamed from: e */
    public static final Handle f6333e;

    /* renamed from: f */
    public static final Handle f6334f;

    /* renamed from: g */
    public static final Handle f6335g;

    /* renamed from: h */
    public static final Handle f6336h;

    /* renamed from: i */
    public static final Handle f6337i;

    /* renamed from: j */
    public static final Handle f6338j;

    /* renamed from: k */
    public static final /* synthetic */ Handle[] f6339k;

    /* renamed from: a */
    public AbstractC7334e f6340a;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        Handle handle = new Handle("TOP_LEFT", 0, new AbstractC7334e(edge, edge2) { // from class: e3.c
            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                C7333d c7333dM11725b = m11725b(f10, f11, f12);
                Edge edge3 = c7333dM11725b.f11897a;
                Edge edge4 = c7333dM11725b.f11898b;
                edge3.m5683j(f10, f11, rect, f13, f12);
                edge4.m5682f(f12);
                if (edge4.m5687v(rect, f13)) {
                    edge4.m5691z(rect);
                    edge3.m5682f(f12);
                }
            }
        });
        f6330b = handle;
        final Edge edge3 = Edge.RIGHT;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new AbstractC7334e(edge, edge3) { // from class: e3.c
            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                C7333d c7333dM11725b = m11725b(f10, f11, f12);
                Edge edge32 = c7333dM11725b.f11897a;
                Edge edge4 = c7333dM11725b.f11898b;
                edge32.m5683j(f10, f11, rect, f13, f12);
                edge4.m5682f(f12);
                if (edge4.m5687v(rect, f13)) {
                    edge4.m5691z(rect);
                    edge32.m5682f(f12);
                }
            }
        });
        f6331c = handle2;
        final Edge edge4 = Edge.BOTTOM;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new AbstractC7334e(edge4, edge2) { // from class: e3.c
            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                C7333d c7333dM11725b = m11725b(f10, f11, f12);
                Edge edge32 = c7333dM11725b.f11897a;
                Edge edge42 = c7333dM11725b.f11898b;
                edge32.m5683j(f10, f11, rect, f13, f12);
                edge42.m5682f(f12);
                if (edge42.m5687v(rect, f13)) {
                    edge42.m5691z(rect);
                    edge32.m5682f(f12);
                }
            }
        });
        f6332d = handle3;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new AbstractC7334e(edge4, edge3) { // from class: e3.c
            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                C7333d c7333dM11725b = m11725b(f10, f11, f12);
                Edge edge32 = c7333dM11725b.f11897a;
                Edge edge42 = c7333dM11725b.f11898b;
                edge32.m5683j(f10, f11, rect, f13, f12);
                edge42.m5682f(f12);
                if (edge42.m5687v(rect, f13)) {
                    edge42.m5691z(rect);
                    edge32.m5682f(f12);
                }
            }
        });
        f6333e = handle4;
        Handle handle5 = new Handle("LEFT", 4, new AbstractC7334e(edge2) { // from class: e3.i

            /* renamed from: d */
            public Edge f11904d;

            {
                super(null, edge2);
                this.f11904d = edge2;
            }

            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f11904d.m5683j(f10, f11, rect, f13, f12);
                float fM5684q = Edge.LEFT.m5684q();
                Edge edge5 = Edge.TOP;
                float fM5684q2 = edge5.m5684q();
                float fM5684q3 = Edge.RIGHT.m5684q();
                Edge edge6 = Edge.BOTTOM;
                float fM5684q4 = edge6.m5684q();
                float fM11717d = (AbstractC7330a.m11717d(fM5684q, fM5684q3, f12) - (fM5684q4 - fM5684q2)) / 2.0f;
                edge5.m5689x(fM5684q2 - fM11717d);
                edge6.m5689x(fM5684q4 + fM11717d);
                if (edge5.m5687v(rect, f13) && !this.f11904d.m5685t(edge5, rect, f12)) {
                    edge6.m5688w(-edge5.m5691z(rect));
                    this.f11904d.m5682f(f12);
                }
                if (!edge6.m5687v(rect, f13) || this.f11904d.m5685t(edge6, rect, f12)) {
                    return;
                }
                edge5.m5688w(-edge6.m5691z(rect));
                this.f11904d.m5682f(f12);
            }
        });
        f6334f = handle5;
        Handle handle6 = new Handle("TOP", 5, new AbstractC7334e(edge) { // from class: e3.g

            /* renamed from: d */
            public Edge f11903d;

            {
                super(edge, null);
                this.f11903d = edge;
            }

            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f11903d.m5683j(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM5684q = edge5.m5684q();
                float fM5684q2 = Edge.TOP.m5684q();
                Edge edge6 = Edge.RIGHT;
                float fM5684q3 = edge6.m5684q();
                float fM11721h = (AbstractC7330a.m11721h(fM5684q2, Edge.BOTTOM.m5684q(), f12) - (fM5684q3 - fM5684q)) / 2.0f;
                edge5.m5689x(fM5684q - fM11721h);
                edge6.m5689x(fM5684q3 + fM11721h);
                if (edge5.m5687v(rect, f13) && !this.f11903d.m5685t(edge5, rect, f12)) {
                    edge6.m5688w(-edge5.m5691z(rect));
                    this.f11903d.m5682f(f12);
                }
                if (!edge6.m5687v(rect, f13) || this.f11903d.m5685t(edge6, rect, f12)) {
                    return;
                }
                edge5.m5688w(-edge6.m5691z(rect));
                this.f11903d.m5682f(f12);
            }
        });
        f6335g = handle6;
        Handle handle7 = new Handle("RIGHT", 6, new AbstractC7334e(edge3) { // from class: e3.i

            /* renamed from: d */
            public Edge f11904d;

            {
                super(null, edge3);
                this.f11904d = edge3;
            }

            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f11904d.m5683j(f10, f11, rect, f13, f12);
                float fM5684q = Edge.LEFT.m5684q();
                Edge edge5 = Edge.TOP;
                float fM5684q2 = edge5.m5684q();
                float fM5684q3 = Edge.RIGHT.m5684q();
                Edge edge6 = Edge.BOTTOM;
                float fM5684q4 = edge6.m5684q();
                float fM11717d = (AbstractC7330a.m11717d(fM5684q, fM5684q3, f12) - (fM5684q4 - fM5684q2)) / 2.0f;
                edge5.m5689x(fM5684q2 - fM11717d);
                edge6.m5689x(fM5684q4 + fM11717d);
                if (edge5.m5687v(rect, f13) && !this.f11904d.m5685t(edge5, rect, f12)) {
                    edge6.m5688w(-edge5.m5691z(rect));
                    this.f11904d.m5682f(f12);
                }
                if (!edge6.m5687v(rect, f13) || this.f11904d.m5685t(edge6, rect, f12)) {
                    return;
                }
                edge5.m5688w(-edge6.m5691z(rect));
                this.f11904d.m5682f(f12);
            }
        });
        f6336h = handle7;
        Handle handle8 = new Handle("BOTTOM", 7, new AbstractC7334e(edge4) { // from class: e3.g

            /* renamed from: d */
            public Edge f11903d;

            {
                super(edge4, null);
                this.f11903d = edge4;
            }

            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f11903d.m5683j(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM5684q = edge5.m5684q();
                float fM5684q2 = Edge.TOP.m5684q();
                Edge edge6 = Edge.RIGHT;
                float fM5684q3 = edge6.m5684q();
                float fM11721h = (AbstractC7330a.m11721h(fM5684q2, Edge.BOTTOM.m5684q(), f12) - (fM5684q3 - fM5684q)) / 2.0f;
                edge5.m5689x(fM5684q - fM11721h);
                edge6.m5689x(fM5684q3 + fM11721h);
                if (edge5.m5687v(rect, f13) && !this.f11903d.m5685t(edge5, rect, f12)) {
                    edge6.m5688w(-edge5.m5691z(rect));
                    this.f11903d.m5682f(f12);
                }
                if (!edge6.m5687v(rect, f13) || this.f11903d.m5685t(edge6, rect, f12)) {
                    return;
                }
                edge5.m5688w(-edge6.m5691z(rect));
                this.f11903d.m5682f(f12);
            }
        });
        f6337i = handle8;
        Handle handle9 = new Handle("CENTER", 8, new AbstractC7334e() { // from class: e3.b
            @Override // p075e3.AbstractC7334e
            /* renamed from: d */
            public void mo11722d(float f10, float f11, float f12, Rect rect, float f13) {
                mo11723e(f10, f11, rect, f13);
            }

            @Override // p075e3.AbstractC7334e
            /* renamed from: e */
            public void mo11723e(float f10, float f11, Rect rect, float f12) {
                Edge edge5 = Edge.LEFT;
                float fM5684q = edge5.m5684q();
                Edge edge6 = Edge.TOP;
                float fM5684q2 = edge6.m5684q();
                Edge edge7 = Edge.RIGHT;
                float fM5684q3 = edge7.m5684q();
                Edge edge8 = Edge.BOTTOM;
                float f13 = f10 - ((fM5684q + fM5684q3) / 2.0f);
                float fM5684q4 = f11 - ((fM5684q2 + edge8.m5684q()) / 2.0f);
                edge5.m5688w(f13);
                edge6.m5688w(fM5684q4);
                edge7.m5688w(f13);
                edge8.m5688w(fM5684q4);
                if (edge5.m5687v(rect, f12)) {
                    edge7.m5688w(edge5.m5691z(rect));
                } else if (edge7.m5687v(rect, f12)) {
                    edge5.m5688w(edge7.m5691z(rect));
                }
                if (edge6.m5687v(rect, f12)) {
                    edge8.m5688w(edge6.m5691z(rect));
                } else if (edge8.m5687v(rect, f12)) {
                    edge6.m5688w(edge8.m5691z(rect));
                }
            }
        });
        f6338j = handle9;
        f6339k = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    public Handle(String str, int i10, AbstractC7334e abstractC7334e) {
        this.f6340a = abstractC7334e;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f6339k.clone();
    }

    /* renamed from: a */
    public void m5692a(float f10, float f11, float f12, Rect rect, float f13) {
        this.f6340a.mo11722d(f10, f11, f12, rect, f13);
    }

    /* renamed from: f */
    public void m5693f(float f10, float f11, Rect rect, float f12) {
        this.f6340a.mo11723e(f10, f11, rect, f12);
    }
}
