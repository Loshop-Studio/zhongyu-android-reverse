package p324rb;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.core.graph.GraphExtKt;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p308qb.C10768b;
import p308qb.C10769c;

/* renamed from: rb.i */
/* loaded from: classes6.dex */
public final class C10932i extends AbstractC10928e {

    /* renamed from: o */
    public final C10769c f26430o;

    /* renamed from: p */
    public final Matrix f26431p;

    /* renamed from: q */
    public final C10768b f26432q;

    /* renamed from: r */
    public float f26433r;

    /* renamed from: s */
    public float f26434s;

    /* renamed from: t */
    public final Path f26435t;

    /* renamed from: u */
    public final ArrayList f26436u;

    /* renamed from: v */
    public final PointF f26437v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10932i(C10769c boardConfig, Matrix cameraMatrix, C10768b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        AbstractC9979u.m20294g(cameraMatrix, "cameraMatrix");
        AbstractC9979u.m20294g(drawControl, "drawControl");
        this.f26430o = boardConfig;
        this.f26431p = cameraMatrix;
        this.f26432q = drawControl;
        this.f26435t = new Path();
        this.f26436u = new ArrayList();
        this.f26437v = new PointF();
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: A */
    public void mo23829A(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26437v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26431p), this.f26437v);
        this.f26436u.add(pointFMapPoint);
        Path path = this.f26435t;
        float f10 = this.f26433r;
        float f11 = this.f26434s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f26433r = pointFMapPoint.x;
        this.f26434s = pointFMapPoint.y;
        this.f26432q.m22952k(this.f26435t);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: B */
    public void mo23830B(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26437v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26431p), this.f26437v);
        this.f26436u.add(pointFMapPoint);
        Path path = this.f26435t;
        float f10 = this.f26433r;
        float f11 = this.f26434s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f26435t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f26432q.m22954m(this.f26435t, this.f26436u);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: y */
    public void mo23847y(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26432q.m22953l();
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: z */
    public void mo23848z(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26437v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26431p), this.f26437v);
        this.f26436u.clear();
        this.f26436u.add(pointFMapPoint);
        this.f26435t.reset();
        this.f26435t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f26435t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f26433r = pointFMapPoint.x;
        this.f26434s = pointFMapPoint.y;
        this.f26432q.m22952k(this.f26435t);
    }
}
