package p055f2;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;

/* renamed from: f2.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6300e {

    /* renamed from: a */
    public Edge f7673a;

    /* renamed from: b */
    public Edge f7674b;

    /* renamed from: c */
    public C6299d f7675c;

    public AbstractC6300e(Edge edge, Edge edge2) {
        this.f7673a = edge;
        this.f7674b = edge2;
        this.f7675c = new C6299d(edge, edge2);
    }

    /* renamed from: a */
    public C6299d m6456a() {
        return this.f7675c;
    }

    /* renamed from: b */
    public C6299d m6457b(float f6, float f7, float f8) {
        if (m6458c(f6, f7) > f8) {
            C6299d c6299d = this.f7675c;
            c6299d.f7671a = this.f7674b;
            c6299d.f7672b = this.f7673a;
        } else {
            C6299d c6299d2 = this.f7675c;
            c6299d2.f7671a = this.f7673a;
            c6299d2.f7672b = this.f7674b;
        }
        return this.f7675c;
    }

    /* renamed from: c */
    public final float m6458c(float f6, float f7) {
        Edge edge = this.f7674b;
        Edge edge2 = Edge.LEFT;
        float fM4703g = edge == edge2 ? f6 : edge2.m4703g();
        Edge edge3 = this.f7673a;
        Edge edge4 = Edge.TOP;
        float fM4703g2 = edge3 == edge4 ? f7 : edge4.m4703g();
        Edge edge5 = this.f7674b;
        Edge edge6 = Edge.RIGHT;
        if (edge5 != edge6) {
            f6 = edge6.m4703g();
        }
        Edge edge7 = this.f7673a;
        Edge edge8 = Edge.BOTTOM;
        if (edge7 != edge8) {
            f7 = edge8.m4703g();
        }
        return AbstractC6296a.m6446a(fM4703g, fM4703g2, f6, f7);
    }

    /* renamed from: d */
    public abstract void mo6454d(float f6, float f7, float f8, Rect rect, float f9);

    /* renamed from: e */
    public void mo6455e(float f6, float f7, Rect rect, float f8) {
        float f9;
        float f10;
        Rect rect2;
        float f11;
        C6299d c6299dM6456a = m6456a();
        Edge edge = c6299dM6456a.f7671a;
        Edge edge2 = c6299dM6456a.f7672b;
        if (edge != null) {
            f9 = f6;
            f10 = f7;
            rect2 = rect;
            f11 = f8;
            edge.m4702c(f9, f10, rect2, f11, 1.0f);
        } else {
            f9 = f6;
            f10 = f7;
            rect2 = rect;
            f11 = f8;
        }
        if (edge2 != null) {
            float f12 = f11;
            Rect rect3 = rect2;
            edge2.m4702c(f9, f10, rect3, f12, 1.0f);
        }
    }
}
