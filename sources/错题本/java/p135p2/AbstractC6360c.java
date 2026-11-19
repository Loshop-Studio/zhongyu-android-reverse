package p135p2;

import android.graphics.Rect;
import android.support.v4.media.C0039h;
import com.xuexiang.xui.widget.imageview.crop.Edge;

/* renamed from: p2.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6360c {

    /* renamed from: a */
    public final Edge f10398a;

    /* renamed from: b */
    public final Edge f10399b;

    /* renamed from: c */
    public final C0039h f10400c;

    public AbstractC6360c(Edge edge, Edge edge2) {
        this.f10398a = edge;
        this.f10399b = edge2;
        C0039h c0039h = new C0039h(21, false);
        c0039h.f96b = edge;
        c0039h.f97c = edge2;
        this.f10400c = c0039h;
    }

    /* renamed from: a */
    public abstract void mo6026a(float f, float f7, float f8, Rect rect, float f9);

    /* renamed from: b */
    public void mo6027b(float f, float f7, Rect rect, float f8) {
        float f9;
        float f10;
        Rect rect2;
        float f11;
        C0039h c0039h = this.f10400c;
        Edge edge = (Edge) c0039h.f96b;
        Edge edge2 = (Edge) c0039h.f97c;
        if (edge != null) {
            f9 = f;
            f10 = f7;
            rect2 = rect;
            f11 = f8;
            edge.adjustCoordinate(f9, f10, rect2, f11, 1.0f);
        } else {
            f9 = f;
            f10 = f7;
            rect2 = rect;
            f11 = f8;
        }
        if (edge2 != null) {
            float f12 = f11;
            Rect rect3 = rect2;
            edge2.adjustCoordinate(f9, f10, rect3, f12, 1.0f);
        }
    }
}
