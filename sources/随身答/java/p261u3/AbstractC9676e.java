package p261u3;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;

/* renamed from: u3.e */
/* loaded from: classes4.dex */
public abstract class AbstractC9676e {

    /* renamed from: a */
    public Edge f17109a;

    /* renamed from: b */
    public Edge f17110b;

    /* renamed from: c */
    public C9675d f17111c;

    public AbstractC9676e(Edge edge, Edge edge2) {
        this.f17109a = edge;
        this.f17110b = edge2;
        this.f17111c = new C9675d(edge, edge2);
    }

    /* renamed from: a */
    public C9675d m16141a() {
        return this.f17111c;
    }

    /* renamed from: b */
    public C9675d m16142b(float f10, float f11, float f12) {
        if (m16143c(f10, f11) > f12) {
            C9675d c9675d = this.f17111c;
            c9675d.f17107a = this.f17110b;
            c9675d.f17108b = this.f17109a;
        } else {
            C9675d c9675d2 = this.f17111c;
            c9675d2.f17107a = this.f17109a;
            c9675d2.f17108b = this.f17110b;
        }
        return this.f17111c;
    }

    /* renamed from: c */
    public final float m16143c(float f10, float f11) {
        Edge edge = this.f17110b;
        Edge edge2 = Edge.LEFT;
        float fM6793t = edge == edge2 ? f10 : edge2.m6793t();
        Edge edge3 = this.f17109a;
        Edge edge4 = Edge.TOP;
        float fM6793t2 = edge3 == edge4 ? f11 : edge4.m6793t();
        Edge edge5 = this.f17110b;
        Edge edge6 = Edge.RIGHT;
        if (edge5 != edge6) {
            f10 = edge6.m6793t();
        }
        Edge edge7 = this.f17109a;
        Edge edge8 = Edge.BOTTOM;
        if (edge7 != edge8) {
            f11 = edge8.m6793t();
        }
        return AbstractC9672a.m16131a(fM6793t, fM6793t2, f10, f11);
    }

    /* renamed from: d */
    public abstract void mo16139d(float f10, float f11, float f12, Rect rect, float f13);

    /* renamed from: e */
    public void mo16140e(float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        Rect rect2;
        float f15;
        C9675d c9675dM16141a = m16141a();
        Edge edge = c9675dM16141a.f17107a;
        Edge edge2 = c9675dM16141a.f17108b;
        if (edge != null) {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
            edge.m6792g(f13, f14, rect2, f15, 1.0f);
        } else {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
        }
        if (edge2 != null) {
            float f16 = f15;
            Rect rect3 = rect2;
            edge2.m6792g(f13, f14, rect3, f16, 1.0f);
        }
    }
}
