package p071d2;

import android.graphics.Rect;
import com.xuexiang.xui.widget.imageview.crop.Edge;

/* renamed from: d2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC8282e {

    /* renamed from: a */
    public Edge f15685a;

    /* renamed from: b */
    public Edge f15686b;

    /* renamed from: c */
    public C8281d f15687c;

    public AbstractC8282e(Edge edge, Edge edge2) {
        this.f15685a = edge;
        this.f15686b = edge2;
        this.f15687c = new C8281d(edge, edge2);
    }

    /* renamed from: a */
    public C8281d m13440a() {
        return this.f15687c;
    }

    /* renamed from: b */
    public C8281d m13441b(float f10, float f11, float f12) {
        if (m13442c(f10, f11) > f12) {
            C8281d c8281d = this.f15687c;
            c8281d.f15683a = this.f15686b;
            c8281d.f15684b = this.f15685a;
        } else {
            C8281d c8281d2 = this.f15687c;
            c8281d2.f15683a = this.f15685a;
            c8281d2.f15684b = this.f15686b;
        }
        return this.f15687c;
    }

    /* renamed from: c */
    public final float m13442c(float f10, float f11) {
        Edge edge = this.f15686b;
        Edge edge2 = Edge.LEFT;
        float fM6878h = edge == edge2 ? f10 : edge2.m6878h();
        Edge edge3 = this.f15685a;
        Edge edge4 = Edge.TOP;
        float fM6878h2 = edge3 == edge4 ? f11 : edge4.m6878h();
        Edge edge5 = this.f15686b;
        Edge edge6 = Edge.RIGHT;
        if (edge5 != edge6) {
            f10 = edge6.m6878h();
        }
        Edge edge7 = this.f15685a;
        Edge edge8 = Edge.BOTTOM;
        if (edge7 != edge8) {
            f11 = edge8.m6878h();
        }
        return AbstractC8278a.m13430a(fM6878h, fM6878h2, f10, f11);
    }

    /* renamed from: d */
    public abstract void mo13438d(float f10, float f11, float f12, Rect rect, float f13);

    /* renamed from: e */
    public void mo13439e(float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        Rect rect2;
        float f15;
        C8281d c8281dM13440a = m13440a();
        Edge edge = c8281dM13440a.f15683a;
        Edge edge2 = c8281dM13440a.f15684b;
        if (edge != null) {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
            edge.m6877c(f13, f14, rect2, f15, 1.0f);
        } else {
            f13 = f10;
            f14 = f11;
            rect2 = rect;
            f15 = f12;
        }
        if (edge2 != null) {
            float f16 = f15;
            Rect rect3 = rect2;
            edge2.m6877c(f13, f14, rect3, f16, 1.0f);
        }
    }
}
