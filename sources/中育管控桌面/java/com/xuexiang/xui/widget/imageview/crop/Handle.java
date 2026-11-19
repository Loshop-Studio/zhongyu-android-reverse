package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;
import p055f2.AbstractC6300e;

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
/* loaded from: classes3.dex */
public final class Handle {

    /* renamed from: b */
    public static final Handle f5055b;

    /* renamed from: c */
    public static final Handle f5056c;

    /* renamed from: d */
    public static final Handle f5057d;

    /* renamed from: e */
    public static final Handle f5058e;

    /* renamed from: f */
    public static final Handle f5059f;

    /* renamed from: g */
    public static final Handle f5060g;

    /* renamed from: h */
    public static final Handle f5061h;

    /* renamed from: i */
    public static final Handle f5062i;

    /* renamed from: j */
    public static final Handle f5063j;

    /* renamed from: k */
    public static final /* synthetic */ Handle[] f5064k;

    /* renamed from: a */
    public AbstractC6300e f5065a;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        Handle handle = new Handle("TOP_LEFT", 0, new AbstractC6300e(edge, edge2) { // from class: f2.c
            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                C6299d c6299dM6457b = m6457b(f6, f7, f8);
                Edge edge3 = c6299dM6457b.f7671a;
                Edge edge4 = c6299dM6457b.f7672b;
                edge3.m4702c(f6, f7, rect, f9, f8);
                edge4.m4701b(f8);
                if (edge4.m4706l(rect, f9)) {
                    edge4.m4710p(rect);
                    edge3.m4701b(f8);
                }
            }
        });
        f5055b = handle;
        final Edge edge3 = Edge.RIGHT;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new AbstractC6300e(edge, edge3) { // from class: f2.c
            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                C6299d c6299dM6457b = m6457b(f6, f7, f8);
                Edge edge32 = c6299dM6457b.f7671a;
                Edge edge4 = c6299dM6457b.f7672b;
                edge32.m4702c(f6, f7, rect, f9, f8);
                edge4.m4701b(f8);
                if (edge4.m4706l(rect, f9)) {
                    edge4.m4710p(rect);
                    edge32.m4701b(f8);
                }
            }
        });
        f5056c = handle2;
        final Edge edge4 = Edge.BOTTOM;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new AbstractC6300e(edge4, edge2) { // from class: f2.c
            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                C6299d c6299dM6457b = m6457b(f6, f7, f8);
                Edge edge32 = c6299dM6457b.f7671a;
                Edge edge42 = c6299dM6457b.f7672b;
                edge32.m4702c(f6, f7, rect, f9, f8);
                edge42.m4701b(f8);
                if (edge42.m4706l(rect, f9)) {
                    edge42.m4710p(rect);
                    edge32.m4701b(f8);
                }
            }
        });
        f5057d = handle3;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new AbstractC6300e(edge4, edge3) { // from class: f2.c
            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                C6299d c6299dM6457b = m6457b(f6, f7, f8);
                Edge edge32 = c6299dM6457b.f7671a;
                Edge edge42 = c6299dM6457b.f7672b;
                edge32.m4702c(f6, f7, rect, f9, f8);
                edge42.m4701b(f8);
                if (edge42.m4706l(rect, f9)) {
                    edge42.m4710p(rect);
                    edge32.m4701b(f8);
                }
            }
        });
        f5058e = handle4;
        Handle handle5 = new Handle("LEFT", 4, new AbstractC6300e(edge2) { // from class: f2.i

            /* renamed from: d */
            public Edge f7678d;

            {
                super(null, edge2);
                this.f7678d = edge2;
            }

            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                this.f7678d.m4702c(f6, f7, rect, f9, f8);
                float fM4703g = Edge.LEFT.m4703g();
                Edge edge5 = Edge.TOP;
                float fM4703g2 = edge5.m4703g();
                float fM4703g3 = Edge.RIGHT.m4703g();
                Edge edge6 = Edge.BOTTOM;
                float fM4703g4 = edge6.m4703g();
                float fM6449d = (AbstractC6296a.m6449d(fM4703g, fM4703g3, f8) - (fM4703g4 - fM4703g2)) / 2.0f;
                edge5.m4708n(fM4703g2 - fM6449d);
                edge6.m4708n(fM4703g4 + fM6449d);
                if (edge5.m4706l(rect, f9) && !this.f7678d.m4704j(edge5, rect, f8)) {
                    edge6.m4707m(-edge5.m4710p(rect));
                    this.f7678d.m4701b(f8);
                }
                if (!edge6.m4706l(rect, f9) || this.f7678d.m4704j(edge6, rect, f8)) {
                    return;
                }
                edge5.m4707m(-edge6.m4710p(rect));
                this.f7678d.m4701b(f8);
            }
        });
        f5059f = handle5;
        Handle handle6 = new Handle("TOP", 5, new AbstractC6300e(edge) { // from class: f2.g

            /* renamed from: d */
            public Edge f7677d;

            {
                super(edge, null);
                this.f7677d = edge;
            }

            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                this.f7677d.m4702c(f6, f7, rect, f9, f8);
                Edge edge5 = Edge.LEFT;
                float fM4703g = edge5.m4703g();
                float fM4703g2 = Edge.TOP.m4703g();
                Edge edge6 = Edge.RIGHT;
                float fM4703g3 = edge6.m4703g();
                float fM6453h = (AbstractC6296a.m6453h(fM4703g2, Edge.BOTTOM.m4703g(), f8) - (fM4703g3 - fM4703g)) / 2.0f;
                edge5.m4708n(fM4703g - fM6453h);
                edge6.m4708n(fM4703g3 + fM6453h);
                if (edge5.m4706l(rect, f9) && !this.f7677d.m4704j(edge5, rect, f8)) {
                    edge6.m4707m(-edge5.m4710p(rect));
                    this.f7677d.m4701b(f8);
                }
                if (!edge6.m4706l(rect, f9) || this.f7677d.m4704j(edge6, rect, f8)) {
                    return;
                }
                edge5.m4707m(-edge6.m4710p(rect));
                this.f7677d.m4701b(f8);
            }
        });
        f5060g = handle6;
        Handle handle7 = new Handle("RIGHT", 6, new AbstractC6300e(edge3) { // from class: f2.i

            /* renamed from: d */
            public Edge f7678d;

            {
                super(null, edge3);
                this.f7678d = edge3;
            }

            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                this.f7678d.m4702c(f6, f7, rect, f9, f8);
                float fM4703g = Edge.LEFT.m4703g();
                Edge edge5 = Edge.TOP;
                float fM4703g2 = edge5.m4703g();
                float fM4703g3 = Edge.RIGHT.m4703g();
                Edge edge6 = Edge.BOTTOM;
                float fM4703g4 = edge6.m4703g();
                float fM6449d = (AbstractC6296a.m6449d(fM4703g, fM4703g3, f8) - (fM4703g4 - fM4703g2)) / 2.0f;
                edge5.m4708n(fM4703g2 - fM6449d);
                edge6.m4708n(fM4703g4 + fM6449d);
                if (edge5.m4706l(rect, f9) && !this.f7678d.m4704j(edge5, rect, f8)) {
                    edge6.m4707m(-edge5.m4710p(rect));
                    this.f7678d.m4701b(f8);
                }
                if (!edge6.m4706l(rect, f9) || this.f7678d.m4704j(edge6, rect, f8)) {
                    return;
                }
                edge5.m4707m(-edge6.m4710p(rect));
                this.f7678d.m4701b(f8);
            }
        });
        f5061h = handle7;
        Handle handle8 = new Handle("BOTTOM", 7, new AbstractC6300e(edge4) { // from class: f2.g

            /* renamed from: d */
            public Edge f7677d;

            {
                super(edge4, null);
                this.f7677d = edge4;
            }

            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                this.f7677d.m4702c(f6, f7, rect, f9, f8);
                Edge edge5 = Edge.LEFT;
                float fM4703g = edge5.m4703g();
                float fM4703g2 = Edge.TOP.m4703g();
                Edge edge6 = Edge.RIGHT;
                float fM4703g3 = edge6.m4703g();
                float fM6453h = (AbstractC6296a.m6453h(fM4703g2, Edge.BOTTOM.m4703g(), f8) - (fM4703g3 - fM4703g)) / 2.0f;
                edge5.m4708n(fM4703g - fM6453h);
                edge6.m4708n(fM4703g3 + fM6453h);
                if (edge5.m4706l(rect, f9) && !this.f7677d.m4704j(edge5, rect, f8)) {
                    edge6.m4707m(-edge5.m4710p(rect));
                    this.f7677d.m4701b(f8);
                }
                if (!edge6.m4706l(rect, f9) || this.f7677d.m4704j(edge6, rect, f8)) {
                    return;
                }
                edge5.m4707m(-edge6.m4710p(rect));
                this.f7677d.m4701b(f8);
            }
        });
        f5062i = handle8;
        Handle handle9 = new Handle("CENTER", 8, new AbstractC6300e() { // from class: f2.b
            @Override // p055f2.AbstractC6300e
            /* renamed from: d */
            public void mo6454d(float f6, float f7, float f8, Rect rect, float f9) {
                mo6455e(f6, f7, rect, f9);
            }

            @Override // p055f2.AbstractC6300e
            /* renamed from: e */
            public void mo6455e(float f6, float f7, Rect rect, float f8) {
                Edge edge5 = Edge.LEFT;
                float fM4703g = edge5.m4703g();
                Edge edge6 = Edge.TOP;
                float fM4703g2 = edge6.m4703g();
                Edge edge7 = Edge.RIGHT;
                float fM4703g3 = edge7.m4703g();
                Edge edge8 = Edge.BOTTOM;
                float f9 = f6 - ((fM4703g + fM4703g3) / 2.0f);
                float fM4703g4 = f7 - ((fM4703g2 + edge8.m4703g()) / 2.0f);
                edge5.m4707m(f9);
                edge6.m4707m(fM4703g4);
                edge7.m4707m(f9);
                edge8.m4707m(fM4703g4);
                if (edge5.m4706l(rect, f8)) {
                    edge7.m4707m(edge5.m4710p(rect));
                } else if (edge7.m4706l(rect, f8)) {
                    edge5.m4707m(edge7.m4710p(rect));
                }
                if (edge6.m4706l(rect, f8)) {
                    edge8.m4707m(edge6.m4710p(rect));
                } else if (edge8.m4706l(rect, f8)) {
                    edge6.m4707m(edge8.m4710p(rect));
                }
            }
        });
        f5063j = handle9;
        f5064k = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    public Handle(String str, int i6, AbstractC6300e abstractC6300e) {
        this.f5065a = abstractC6300e;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f5064k.clone();
    }

    /* renamed from: a */
    public void m4711a(float f6, float f7, float f8, Rect rect, float f9) {
        this.f5065a.mo6454d(f6, f7, f8, rect, f9);
    }

    /* renamed from: b */
    public void m4712b(float f6, float f7, Rect rect, float f8) {
        this.f5065a.mo6455e(f6, f7, rect, f8);
    }
}
