package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;
import p131v0.AbstractC4622e;

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
/* loaded from: classes2.dex */
public final class Handle {

    /* renamed from: b */
    public static final Handle f3534b;

    /* renamed from: c */
    public static final Handle f3535c;

    /* renamed from: d */
    public static final Handle f3536d;

    /* renamed from: e */
    public static final Handle f3537e;

    /* renamed from: f */
    public static final Handle f3538f;

    /* renamed from: g */
    public static final Handle f3539g;

    /* renamed from: h */
    public static final Handle f3540h;

    /* renamed from: i */
    public static final Handle f3541i;

    /* renamed from: j */
    public static final Handle f3542j;

    /* renamed from: k */
    public static final /* synthetic */ Handle[] f3543k;

    /* renamed from: a */
    public AbstractC4622e f3544a;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        Handle handle = new Handle("TOP_LEFT", 0, new AbstractC4622e(edge, edge2) { // from class: v0.c
            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                C4621d c4621dM6399b = m6399b(f4, f5, f6);
                Edge edge3 = c4621dM6399b.f5827a;
                Edge edge4 = c4621dM6399b.f5828b;
                edge3.m4325c(f4, f5, rect, f7, f6);
                edge4.m4324b(f6);
                if (edge4.m4329l(rect, f7)) {
                    edge4.m4333p(rect);
                    edge3.m4324b(f6);
                }
            }
        });
        f3534b = handle;
        final Edge edge3 = Edge.RIGHT;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new AbstractC4622e(edge, edge3) { // from class: v0.c
            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                C4621d c4621dM6399b = m6399b(f4, f5, f6);
                Edge edge32 = c4621dM6399b.f5827a;
                Edge edge4 = c4621dM6399b.f5828b;
                edge32.m4325c(f4, f5, rect, f7, f6);
                edge4.m4324b(f6);
                if (edge4.m4329l(rect, f7)) {
                    edge4.m4333p(rect);
                    edge32.m4324b(f6);
                }
            }
        });
        f3535c = handle2;
        final Edge edge4 = Edge.BOTTOM;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new AbstractC4622e(edge4, edge2) { // from class: v0.c
            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                C4621d c4621dM6399b = m6399b(f4, f5, f6);
                Edge edge32 = c4621dM6399b.f5827a;
                Edge edge42 = c4621dM6399b.f5828b;
                edge32.m4325c(f4, f5, rect, f7, f6);
                edge42.m4324b(f6);
                if (edge42.m4329l(rect, f7)) {
                    edge42.m4333p(rect);
                    edge32.m4324b(f6);
                }
            }
        });
        f3536d = handle3;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new AbstractC4622e(edge4, edge3) { // from class: v0.c
            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                C4621d c4621dM6399b = m6399b(f4, f5, f6);
                Edge edge32 = c4621dM6399b.f5827a;
                Edge edge42 = c4621dM6399b.f5828b;
                edge32.m4325c(f4, f5, rect, f7, f6);
                edge42.m4324b(f6);
                if (edge42.m4329l(rect, f7)) {
                    edge42.m4333p(rect);
                    edge32.m4324b(f6);
                }
            }
        });
        f3537e = handle4;
        Handle handle5 = new Handle("LEFT", 4, new AbstractC4622e(edge2) { // from class: v0.i

            /* renamed from: d */
            public Edge f5834d;

            {
                super(null, edge2);
                this.f5834d = edge2;
            }

            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                this.f5834d.m4325c(f4, f5, rect, f7, f6);
                float fM4326g = Edge.LEFT.m4326g();
                Edge edge5 = Edge.TOP;
                float fM4326g2 = edge5.m4326g();
                float fM4326g3 = Edge.RIGHT.m4326g();
                Edge edge6 = Edge.BOTTOM;
                float fM4326g4 = edge6.m4326g();
                float fM6391d = (AbstractC4618a.m6391d(fM4326g, fM4326g3, f6) - (fM4326g4 - fM4326g2)) / 2.0f;
                edge5.m4331n(fM4326g2 - fM6391d);
                edge6.m4331n(fM4326g4 + fM6391d);
                if (edge5.m4329l(rect, f7) && !this.f5834d.m4327j(edge5, rect, f6)) {
                    edge6.m4330m(-edge5.m4333p(rect));
                    this.f5834d.m4324b(f6);
                }
                if (!edge6.m4329l(rect, f7) || this.f5834d.m4327j(edge6, rect, f6)) {
                    return;
                }
                edge5.m4330m(-edge6.m4333p(rect));
                this.f5834d.m4324b(f6);
            }
        });
        f3538f = handle5;
        Handle handle6 = new Handle("TOP", 5, new AbstractC4622e(edge) { // from class: v0.g

            /* renamed from: d */
            public Edge f5833d;

            {
                super(edge, null);
                this.f5833d = edge;
            }

            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                this.f5833d.m4325c(f4, f5, rect, f7, f6);
                Edge edge5 = Edge.LEFT;
                float fM4326g = edge5.m4326g();
                float fM4326g2 = Edge.TOP.m4326g();
                Edge edge6 = Edge.RIGHT;
                float fM4326g3 = edge6.m4326g();
                float fM6395h = (AbstractC4618a.m6395h(fM4326g2, Edge.BOTTOM.m4326g(), f6) - (fM4326g3 - fM4326g)) / 2.0f;
                edge5.m4331n(fM4326g - fM6395h);
                edge6.m4331n(fM4326g3 + fM6395h);
                if (edge5.m4329l(rect, f7) && !this.f5833d.m4327j(edge5, rect, f6)) {
                    edge6.m4330m(-edge5.m4333p(rect));
                    this.f5833d.m4324b(f6);
                }
                if (!edge6.m4329l(rect, f7) || this.f5833d.m4327j(edge6, rect, f6)) {
                    return;
                }
                edge5.m4330m(-edge6.m4333p(rect));
                this.f5833d.m4324b(f6);
            }
        });
        f3539g = handle6;
        Handle handle7 = new Handle("RIGHT", 6, new AbstractC4622e(edge3) { // from class: v0.i

            /* renamed from: d */
            public Edge f5834d;

            {
                super(null, edge3);
                this.f5834d = edge3;
            }

            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                this.f5834d.m4325c(f4, f5, rect, f7, f6);
                float fM4326g = Edge.LEFT.m4326g();
                Edge edge5 = Edge.TOP;
                float fM4326g2 = edge5.m4326g();
                float fM4326g3 = Edge.RIGHT.m4326g();
                Edge edge6 = Edge.BOTTOM;
                float fM4326g4 = edge6.m4326g();
                float fM6391d = (AbstractC4618a.m6391d(fM4326g, fM4326g3, f6) - (fM4326g4 - fM4326g2)) / 2.0f;
                edge5.m4331n(fM4326g2 - fM6391d);
                edge6.m4331n(fM4326g4 + fM6391d);
                if (edge5.m4329l(rect, f7) && !this.f5834d.m4327j(edge5, rect, f6)) {
                    edge6.m4330m(-edge5.m4333p(rect));
                    this.f5834d.m4324b(f6);
                }
                if (!edge6.m4329l(rect, f7) || this.f5834d.m4327j(edge6, rect, f6)) {
                    return;
                }
                edge5.m4330m(-edge6.m4333p(rect));
                this.f5834d.m4324b(f6);
            }
        });
        f3540h = handle7;
        Handle handle8 = new Handle("BOTTOM", 7, new AbstractC4622e(edge4) { // from class: v0.g

            /* renamed from: d */
            public Edge f5833d;

            {
                super(edge4, null);
                this.f5833d = edge4;
            }

            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                this.f5833d.m4325c(f4, f5, rect, f7, f6);
                Edge edge5 = Edge.LEFT;
                float fM4326g = edge5.m4326g();
                float fM4326g2 = Edge.TOP.m4326g();
                Edge edge6 = Edge.RIGHT;
                float fM4326g3 = edge6.m4326g();
                float fM6395h = (AbstractC4618a.m6395h(fM4326g2, Edge.BOTTOM.m4326g(), f6) - (fM4326g3 - fM4326g)) / 2.0f;
                edge5.m4331n(fM4326g - fM6395h);
                edge6.m4331n(fM4326g3 + fM6395h);
                if (edge5.m4329l(rect, f7) && !this.f5833d.m4327j(edge5, rect, f6)) {
                    edge6.m4330m(-edge5.m4333p(rect));
                    this.f5833d.m4324b(f6);
                }
                if (!edge6.m4329l(rect, f7) || this.f5833d.m4327j(edge6, rect, f6)) {
                    return;
                }
                edge5.m4330m(-edge6.m4333p(rect));
                this.f5833d.m4324b(f6);
            }
        });
        f3541i = handle8;
        Handle handle9 = new Handle("CENTER", 8, new AbstractC4622e() { // from class: v0.b
            @Override // p131v0.AbstractC4622e
            /* renamed from: d */
            public void mo6396d(float f4, float f5, float f6, Rect rect, float f7) {
                mo6397e(f4, f5, rect, f7);
            }

            @Override // p131v0.AbstractC4622e
            /* renamed from: e */
            public void mo6397e(float f4, float f5, Rect rect, float f6) {
                Edge edge5 = Edge.LEFT;
                float fM4326g = edge5.m4326g();
                Edge edge6 = Edge.TOP;
                float fM4326g2 = edge6.m4326g();
                Edge edge7 = Edge.RIGHT;
                float fM4326g3 = edge7.m4326g();
                Edge edge8 = Edge.BOTTOM;
                float f7 = f4 - ((fM4326g + fM4326g3) / 2.0f);
                float fM4326g4 = f5 - ((fM4326g2 + edge8.m4326g()) / 2.0f);
                edge5.m4330m(f7);
                edge6.m4330m(fM4326g4);
                edge7.m4330m(f7);
                edge8.m4330m(fM4326g4);
                if (edge5.m4329l(rect, f6)) {
                    edge7.m4330m(edge5.m4333p(rect));
                } else if (edge7.m4329l(rect, f6)) {
                    edge5.m4330m(edge7.m4333p(rect));
                }
                if (edge6.m4329l(rect, f6)) {
                    edge8.m4330m(edge6.m4333p(rect));
                } else if (edge8.m4329l(rect, f6)) {
                    edge6.m4330m(edge8.m4333p(rect));
                }
            }
        });
        f3542j = handle9;
        f3543k = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    public Handle(String str, int i4, AbstractC4622e abstractC4622e) {
        this.f3544a = abstractC4622e;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f3543k.clone();
    }

    /* renamed from: a */
    public void m4334a(float f4, float f5, float f6, Rect rect, float f7) {
        this.f3544a.mo6396d(f4, f5, f6, rect, f7);
    }

    /* renamed from: b */
    public void m4335b(float f4, float f5, Rect rect, float f6) {
        this.f3544a.mo6397e(f4, f5, rect, f6);
    }
}
