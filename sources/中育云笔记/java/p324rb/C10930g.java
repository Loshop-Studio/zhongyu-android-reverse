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

/* renamed from: rb.g */
/* loaded from: classes6.dex */
public final class C10930g extends AbstractC10928e {

    /* renamed from: o */
    public final C10769c f26416o;

    /* renamed from: p */
    public final Matrix f26417p;

    /* renamed from: q */
    public final C10768b f26418q;

    /* renamed from: r */
    public float f26419r;

    /* renamed from: s */
    public float f26420s;

    /* renamed from: t */
    public final Path f26421t;

    /* renamed from: u */
    public final ArrayList f26422u;

    /* renamed from: v */
    public final PointF f26423v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10930g(C10769c boardConfig, Matrix cameraMatrix, C10768b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        AbstractC9979u.m20294g(cameraMatrix, "cameraMatrix");
        AbstractC9979u.m20294g(drawControl, "drawControl");
        this.f26416o = boardConfig;
        this.f26417p = cameraMatrix;
        this.f26418q = drawControl;
        this.f26421t = new Path();
        this.f26422u = new ArrayList();
        this.f26423v = new PointF();
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: A */
    public void mo23829A(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26423v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26417p), this.f26423v);
        this.f26421t.reset();
        this.f26421t.moveTo(this.f26419r, this.f26420s);
        this.f26421t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f26418q.m22952k(this.f26421t);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: B */
    public void mo23830B(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26423v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26417p), this.f26423v);
        this.f26422u.add(pointFMapPoint);
        this.f26421t.reset();
        this.f26421t.moveTo(this.f26419r, this.f26420s);
        this.f26421t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f26418q.m22954m(this.f26421t, this.f26422u);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: y */
    public void mo23847y(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26418q.m22953l();
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: z */
    public void mo23848z(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26423v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC10351n.m21660b(this.f26417p), this.f26423v);
        this.f26422u.clear();
        this.f26422u.add(pointFMapPoint);
        this.f26421t.reset();
        this.f26421t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f26421t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f26419r = pointFMapPoint.x;
        this.f26420s = pointFMapPoint.y;
        this.f26418q.m22952k(this.f26421t);
    }
}
