package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;
import p261u3.AbstractC9676e;

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
    public static final Handle f7588b;

    /* renamed from: c */
    public static final Handle f7589c;

    /* renamed from: d */
    public static final Handle f7590d;

    /* renamed from: e */
    public static final Handle f7591e;

    /* renamed from: f */
    public static final Handle f7592f;

    /* renamed from: g */
    public static final Handle f7593g;

    /* renamed from: h */
    public static final Handle f7594h;

    /* renamed from: i */
    public static final Handle f7595i;

    /* renamed from: j */
    public static final Handle f7596j;

    /* renamed from: k */
    public static final /* synthetic */ Handle[] f7597k;

    /* renamed from: a */
    public AbstractC9676e f7598a;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        Handle handle = new Handle("TOP_LEFT", 0, new AbstractC9676e(edge, edge2) { // from class: u3.c
            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                C9675d c9675dM16142b = m16142b(f10, f11, f12);
                Edge edge3 = c9675dM16142b.f17107a;
                Edge edge4 = c9675dM16142b.f17108b;
                edge3.m6792g(f10, f11, rect, f13, f12);
                edge4.m6791c(f12);
                if (edge4.m6796y(rect, f13)) {
                    edge4.m6790C(rect);
                    edge3.m6791c(f12);
                }
            }
        });
        f7588b = handle;
        final Edge edge3 = Edge.RIGHT;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new AbstractC9676e(edge, edge3) { // from class: u3.c
            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                C9675d c9675dM16142b = m16142b(f10, f11, f12);
                Edge edge32 = c9675dM16142b.f17107a;
                Edge edge4 = c9675dM16142b.f17108b;
                edge32.m6792g(f10, f11, rect, f13, f12);
                edge4.m6791c(f12);
                if (edge4.m6796y(rect, f13)) {
                    edge4.m6790C(rect);
                    edge32.m6791c(f12);
                }
            }
        });
        f7589c = handle2;
        final Edge edge4 = Edge.BOTTOM;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new AbstractC9676e(edge4, edge2) { // from class: u3.c
            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                C9675d c9675dM16142b = m16142b(f10, f11, f12);
                Edge edge32 = c9675dM16142b.f17107a;
                Edge edge42 = c9675dM16142b.f17108b;
                edge32.m6792g(f10, f11, rect, f13, f12);
                edge42.m6791c(f12);
                if (edge42.m6796y(rect, f13)) {
                    edge42.m6790C(rect);
                    edge32.m6791c(f12);
                }
            }
        });
        f7590d = handle3;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new AbstractC9676e(edge4, edge3) { // from class: u3.c
            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                C9675d c9675dM16142b = m16142b(f10, f11, f12);
                Edge edge32 = c9675dM16142b.f17107a;
                Edge edge42 = c9675dM16142b.f17108b;
                edge32.m6792g(f10, f11, rect, f13, f12);
                edge42.m6791c(f12);
                if (edge42.m6796y(rect, f13)) {
                    edge42.m6790C(rect);
                    edge32.m6791c(f12);
                }
            }
        });
        f7591e = handle4;
        Handle handle5 = new Handle("LEFT", 4, new AbstractC9676e(edge2) { // from class: u3.i

            /* renamed from: d */
            public Edge f17114d;

            {
                super(null, edge2);
                this.f17114d = edge2;
            }

            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f17114d.m6792g(f10, f11, rect, f13, f12);
                float fM6793t = Edge.LEFT.m6793t();
                Edge edge5 = Edge.TOP;
                float fM6793t2 = edge5.m6793t();
                float fM6793t3 = Edge.RIGHT.m6793t();
                Edge edge6 = Edge.BOTTOM;
                float fM6793t4 = edge6.m6793t();
                float fM16134d = (AbstractC9672a.m16134d(fM6793t, fM6793t3, f12) - (fM6793t4 - fM6793t2)) / 2.0f;
                edge5.m6788A(fM6793t2 - fM16134d);
                edge6.m6788A(fM6793t4 + fM16134d);
                if (edge5.m6796y(rect, f13) && !this.f17114d.m6794w(edge5, rect, f12)) {
                    edge6.m6797z(-edge5.m6790C(rect));
                    this.f17114d.m6791c(f12);
                }
                if (!edge6.m6796y(rect, f13) || this.f17114d.m6794w(edge6, rect, f12)) {
                    return;
                }
                edge5.m6797z(-edge6.m6790C(rect));
                this.f17114d.m6791c(f12);
            }
        });
        f7592f = handle5;
        Handle handle6 = new Handle("TOP", 5, new AbstractC9676e(edge) { // from class: u3.g

            /* renamed from: d */
            public Edge f17113d;

            {
                super(edge, null);
                this.f17113d = edge;
            }

            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f17113d.m6792g(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM6793t = edge5.m6793t();
                float fM6793t2 = Edge.TOP.m6793t();
                Edge edge6 = Edge.RIGHT;
                float fM6793t3 = edge6.m6793t();
                float fM16138h = (AbstractC9672a.m16138h(fM6793t2, Edge.BOTTOM.m6793t(), f12) - (fM6793t3 - fM6793t)) / 2.0f;
                edge5.m6788A(fM6793t - fM16138h);
                edge6.m6788A(fM6793t3 + fM16138h);
                if (edge5.m6796y(rect, f13) && !this.f17113d.m6794w(edge5, rect, f12)) {
                    edge6.m6797z(-edge5.m6790C(rect));
                    this.f17113d.m6791c(f12);
                }
                if (!edge6.m6796y(rect, f13) || this.f17113d.m6794w(edge6, rect, f12)) {
                    return;
                }
                edge5.m6797z(-edge6.m6790C(rect));
                this.f17113d.m6791c(f12);
            }
        });
        f7593g = handle6;
        Handle handle7 = new Handle("RIGHT", 6, new AbstractC9676e(edge3) { // from class: u3.i

            /* renamed from: d */
            public Edge f17114d;

            {
                super(null, edge3);
                this.f17114d = edge3;
            }

            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f17114d.m6792g(f10, f11, rect, f13, f12);
                float fM6793t = Edge.LEFT.m6793t();
                Edge edge5 = Edge.TOP;
                float fM6793t2 = edge5.m6793t();
                float fM6793t3 = Edge.RIGHT.m6793t();
                Edge edge6 = Edge.BOTTOM;
                float fM6793t4 = edge6.m6793t();
                float fM16134d = (AbstractC9672a.m16134d(fM6793t, fM6793t3, f12) - (fM6793t4 - fM6793t2)) / 2.0f;
                edge5.m6788A(fM6793t2 - fM16134d);
                edge6.m6788A(fM6793t4 + fM16134d);
                if (edge5.m6796y(rect, f13) && !this.f17114d.m6794w(edge5, rect, f12)) {
                    edge6.m6797z(-edge5.m6790C(rect));
                    this.f17114d.m6791c(f12);
                }
                if (!edge6.m6796y(rect, f13) || this.f17114d.m6794w(edge6, rect, f12)) {
                    return;
                }
                edge5.m6797z(-edge6.m6790C(rect));
                this.f17114d.m6791c(f12);
            }
        });
        f7594h = handle7;
        Handle handle8 = new Handle("BOTTOM", 7, new AbstractC9676e(edge4) { // from class: u3.g

            /* renamed from: d */
            public Edge f17113d;

            {
                super(edge4, null);
                this.f17113d = edge4;
            }

            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                this.f17113d.m6792g(f10, f11, rect, f13, f12);
                Edge edge5 = Edge.LEFT;
                float fM6793t = edge5.m6793t();
                float fM6793t2 = Edge.TOP.m6793t();
                Edge edge6 = Edge.RIGHT;
                float fM6793t3 = edge6.m6793t();
                float fM16138h = (AbstractC9672a.m16138h(fM6793t2, Edge.BOTTOM.m6793t(), f12) - (fM6793t3 - fM6793t)) / 2.0f;
                edge5.m6788A(fM6793t - fM16138h);
                edge6.m6788A(fM6793t3 + fM16138h);
                if (edge5.m6796y(rect, f13) && !this.f17113d.m6794w(edge5, rect, f12)) {
                    edge6.m6797z(-edge5.m6790C(rect));
                    this.f17113d.m6791c(f12);
                }
                if (!edge6.m6796y(rect, f13) || this.f17113d.m6794w(edge6, rect, f12)) {
                    return;
                }
                edge5.m6797z(-edge6.m6790C(rect));
                this.f17113d.m6791c(f12);
            }
        });
        f7595i = handle8;
        Handle handle9 = new Handle("CENTER", 8, new AbstractC9676e() { // from class: u3.b
            @Override // p261u3.AbstractC9676e
            /* renamed from: d */
            public void mo16139d(float f10, float f11, float f12, Rect rect, float f13) {
                mo16140e(f10, f11, rect, f13);
            }

            @Override // p261u3.AbstractC9676e
            /* renamed from: e */
            public void mo16140e(float f10, float f11, Rect rect, float f12) {
                Edge edge5 = Edge.LEFT;
                float fM6793t = edge5.m6793t();
                Edge edge6 = Edge.TOP;
                float fM6793t2 = edge6.m6793t();
                Edge edge7 = Edge.RIGHT;
                float fM6793t3 = edge7.m6793t();
                Edge edge8 = Edge.BOTTOM;
                float f13 = f10 - ((fM6793t + fM6793t3) / 2.0f);
                float fM6793t4 = f11 - ((fM6793t2 + edge8.m6793t()) / 2.0f);
                edge5.m6797z(f13);
                edge6.m6797z(fM6793t4);
                edge7.m6797z(f13);
                edge8.m6797z(fM6793t4);
                if (edge5.m6796y(rect, f12)) {
                    edge7.m6797z(edge5.m6790C(rect));
                } else if (edge7.m6796y(rect, f12)) {
                    edge5.m6797z(edge7.m6790C(rect));
                }
                if (edge6.m6796y(rect, f12)) {
                    edge8.m6797z(edge6.m6790C(rect));
                } else if (edge8.m6796y(rect, f12)) {
                    edge6.m6797z(edge8.m6790C(rect));
                }
            }
        });
        f7596j = handle9;
        f7597k = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    public Handle(String str, int i9, AbstractC9676e abstractC9676e) {
        this.f7598a = abstractC9676e;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f7597k.clone();
    }

    /* renamed from: a */
    public void m6798a(float f10, float f11, float f12, Rect rect, float f13) {
        this.f7598a.mo16139d(f10, f11, f12, rect, f13);
    }

    /* renamed from: c */
    public void m6799c(float f10, float f11, Rect rect, float f12) {
        this.f7598a.mo16140e(f10, f11, rect, f12);
    }
}
