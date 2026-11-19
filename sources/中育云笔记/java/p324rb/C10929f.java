package p324rb;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.core.graph.GraphExtKt;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p308qb.C10768b;
import p308qb.C10769c;

/* renamed from: rb.f */
/* loaded from: classes6.dex */
public final class C10929f extends AbstractC10928e {

    /* renamed from: o */
    public final C10769c f26411o;

    /* renamed from: p */
    public final Matrix f26412p;

    /* renamed from: q */
    public final C10768b f26413q;

    /* renamed from: r */
    public final PointF f26414r;

    /* renamed from: s */
    public final PointF f26415s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10929f(C10769c boardConfig, Matrix cameraMatrix, C10768b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        AbstractC9979u.m20294g(cameraMatrix, "cameraMatrix");
        AbstractC9979u.m20294g(drawControl, "drawControl");
        this.f26411o = boardConfig;
        this.f26412p = cameraMatrix;
        this.f26413q = drawControl;
        this.f26414r = new PointF();
        this.f26415s = new PointF();
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: A */
    public void mo23829A(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        mo23848z(event);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: B */
    public void mo23830B(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26415s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26412p), this.f26415s);
        this.f26414r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f26413q.m22951j(this.f26414r);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: y */
    public void mo23847y(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        mo23830B(event);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: z */
    public void mo23848z(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26415s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26412p), this.f26415s);
        this.f26414r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f26413q.m22950i(this.f26414r);
    }
}
