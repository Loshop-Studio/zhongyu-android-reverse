package p075e3;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;

/* renamed from: e3.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7334e {

    /* renamed from: a */
    public Edge f11899a;

    /* renamed from: b */
    public Edge f11900b;

    /* renamed from: c */
    public C7333d f11901c;

    public AbstractC7334e(Edge edge, Edge edge2) {
        this.f11899a = edge;
        this.f11900b = edge2;
        this.f11901c = new C7333d(edge, edge2);
    }

    /* renamed from: a */
    public C7333d m11724a() {
        return this.f11901c;
    }

    /* renamed from: b */
    public C7333d m11725b(float f10, float f11, float f12) {
        if (m11726c(f10, f11) > f12) {
            C7333d c7333d = this.f11901c;
            c7333d.f11897a = this.f11900b;
            c7333d.f11898b = this.f11899a;
        } else {
            C7333d c7333d2 = this.f11901c;
            c7333d2.f11897a = this.f11899a;
            c7333d2.f11898b = this.f11900b;
        }
        return this.f11901c;
    }

    /* renamed from: c */
    public final float m11726c(float f10, float f11) {
        Edge edge = this.f11900b;
        Edge edge2 = Edge.LEFT;
        float fM5684q = edge == edge2 ? f10 : edge2.m5684q();
        Edge edge3 = this.f11899a;
        Edge edge4 = Edge.TOP;
        float fM5684q2 = edge3 == edge4 ? f11 : edge4.m5684q();
        Edge edge5 = this.f11900b;
        Edge edge6 = Edge.RIGHT;
        if (edge5 != edge6) {
            f10 = edge6.m5684q();
        }
        Edge edge7 = this.f11899a;
        Edge edge8 = Edge.BOTTOM;
        if (edge7 != edge8) {
            f11 = edge8.m5684q();
        }
        return AbstractC7330a.m11714a(fM5684q, fM5684q2, f10, f11);
    }

    /* renamed from: d */
    public abstract void mo11722d(float f10, float f11, float f12, Rect rect, float f13);

    /* renamed from: e */
    public void mo11723e(float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        Rect rect2;
        float f15;
        C7333d c7333dM11724a = m11724a();
        Edge edge = c7333dM11724a.f11897a;
        Edge edge2 = c7333dM11724a.f11898b;
        if (edge != null) {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
            edge.m5683j(f13, f14, rect2, f15, 1.0f);
        } else {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
        }
        if (edge2 != null) {
            float f16 = f15;
            Rect rect3 = rect2;
            edge2.m5683j(f13, f14, rect3, f16, 1.0f);
        }
    }
}
