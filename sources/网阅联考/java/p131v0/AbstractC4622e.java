package p131v0;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;

/* renamed from: v0.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4622e {

    /* renamed from: a */
    public Edge f5829a;

    /* renamed from: b */
    public Edge f5830b;

    /* renamed from: c */
    public C4621d f5831c;

    public AbstractC4622e(Edge edge, Edge edge2) {
        this.f5829a = edge;
        this.f5830b = edge2;
        this.f5831c = new C4621d(edge, edge2);
    }

    /* renamed from: a */
    public C4621d m6398a() {
        return this.f5831c;
    }

    /* renamed from: b */
    public C4621d m6399b(float f4, float f5, float f6) {
        if (m6400c(f4, f5) > f6) {
            C4621d c4621d = this.f5831c;
            c4621d.f5827a = this.f5830b;
            c4621d.f5828b = this.f5829a;
        } else {
            C4621d c4621d2 = this.f5831c;
            c4621d2.f5827a = this.f5829a;
            c4621d2.f5828b = this.f5830b;
        }
        return this.f5831c;
    }

    /* renamed from: c */
    public final float m6400c(float f4, float f5) {
        Edge edge = this.f5830b;
        Edge edge2 = Edge.LEFT;
        float fM4326g = edge == edge2 ? f4 : edge2.m4326g();
        Edge edge3 = this.f5829a;
        Edge edge4 = Edge.TOP;
        float fM4326g2 = edge3 == edge4 ? f5 : edge4.m4326g();
        Edge edge5 = this.f5830b;
        Edge edge6 = Edge.RIGHT;
        if (edge5 != edge6) {
            f4 = edge6.m4326g();
        }
        Edge edge7 = this.f5829a;
        Edge edge8 = Edge.BOTTOM;
        if (edge7 != edge8) {
            f5 = edge8.m4326g();
        }
        return AbstractC4618a.m6388a(fM4326g, fM4326g2, f4, f5);
    }

    /* renamed from: d */
    public abstract void mo6396d(float f4, float f5, float f6, Rect rect, float f7);

    /* renamed from: e */
    public void mo6397e(float f4, float f5, Rect rect, float f6) {
        C4621d c4621dM6398a = m6398a();
        Edge edge = c4621dM6398a.f5827a;
        Edge edge2 = c4621dM6398a.f5828b;
        if (edge != null) {
            edge.m4325c(f4, f5, rect, f6, 1.0f);
        }
        if (edge2 != null) {
            edge2.m4325c(f4, f5, rect, f6, 1.0f);
        }
    }
}
