package p262n8;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;

/* renamed from: n8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC10331e {

    /* renamed from: a */
    public Edge f24614a;

    /* renamed from: b */
    public Edge f24615b;

    /* renamed from: c */
    public C10330d f24616c;

    public AbstractC10331e(Edge edge, Edge edge2) {
        this.f24614a = edge;
        this.f24615b = edge2;
        this.f24616c = new C10330d(edge, edge2);
    }

    /* renamed from: a */
    public C10330d m21572a() {
        return this.f24616c;
    }

    /* renamed from: b */
    public C10330d m21573b(float f10, float f11, float f12) {
        if (m21574c(f10, f11) > f12) {
            C10330d c10330d = this.f24616c;
            c10330d.f24612a = this.f24615b;
            c10330d.f24613b = this.f24614a;
        } else {
            C10330d c10330d2 = this.f24616c;
            c10330d2.f24612a = this.f24614a;
            c10330d2.f24613b = this.f24615b;
        }
        return this.f24616c;
    }

    /* renamed from: c */
    public final float m21574c(float f10, float f11) {
        Edge edge = this.f24615b;
        Edge edge2 = Edge.LEFT;
        float fM12729k = edge == edge2 ? f10 : edge2.m12729k();
        Edge edge3 = this.f24614a;
        Edge edge4 = Edge.TOP;
        float fM12729k2 = edge3 == edge4 ? f11 : edge4.m12729k();
        Edge edge5 = this.f24615b;
        Edge edge6 = Edge.RIGHT;
        if (edge5 != edge6) {
            f10 = edge6.m12729k();
        }
        Edge edge7 = this.f24614a;
        Edge edge8 = Edge.BOTTOM;
        if (edge7 != edge8) {
            f11 = edge8.m12729k();
        }
        return AbstractC10327a.m21562a(fM12729k, fM12729k2, f10, f11);
    }

    /* renamed from: d */
    public abstract void mo21570d(float f10, float f11, float f12, Rect rect, float f13);

    /* renamed from: e */
    public void mo21571e(float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        Rect rect2;
        float f15;
        C10330d c10330dM21572a = m21572a();
        Edge edge = c10330dM21572a.f24612a;
        Edge edge2 = c10330dM21572a.f24613b;
        if (edge != null) {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
            edge.m12728d(f13, f14, rect2, f15, 1.0f);
        } else {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
        }
        if (edge2 != null) {
            float f16 = f15;
            Rect rect3 = rect2;
            edge2.m12728d(f13, f14, rect3, f16, 1.0f);
        }
    }
}
