package p287w5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.sketch.core.graph.GraphExtKt;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p276v5.C10247b;
import p276v5.C10248c;

/* renamed from: w5.g */
/* loaded from: classes5.dex */
public final class C10355g extends AbstractC10353e {

    /* renamed from: o */
    public final C10248c f20616o;

    /* renamed from: p */
    public final Matrix f20617p;

    /* renamed from: q */
    public final C10247b f20618q;

    /* renamed from: r */
    public float f20619r;

    /* renamed from: s */
    public float f20620s;

    /* renamed from: t */
    public final Path f20621t;

    /* renamed from: u */
    public final ArrayList f20622u;

    /* renamed from: v */
    public final PointF f20623v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10355g(C10248c boardConfig, Matrix cameraMatrix, C10247b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        AbstractC9133u.m16133g(cameraMatrix, "cameraMatrix");
        AbstractC9133u.m16133g(drawControl, "drawControl");
        this.f20616o = boardConfig;
        this.f20617p = cameraMatrix;
        this.f20618q = drawControl;
        this.f20621t = new Path();
        this.f20622u = new ArrayList();
        this.f20623v = new PointF();
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: A */
    public void mo19272A(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20623v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20617p), this.f20623v);
        this.f20621t.reset();
        this.f20621t.moveTo(this.f20619r, this.f20620s);
        this.f20621t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f20618q.m19179k(this.f20621t);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: B */
    public void mo19273B(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20623v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20617p), this.f20623v);
        this.f20622u.add(pointFMapPoint);
        this.f20621t.reset();
        this.f20621t.moveTo(this.f20619r, this.f20620s);
        this.f20621t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f20618q.m19181m(this.f20621t, this.f20622u);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: y */
    public void mo19290y(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20618q.m19180l();
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: z */
    public void mo19291z(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20623v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20617p), this.f20623v);
        this.f20622u.clear();
        this.f20622u.add(pointFMapPoint);
        this.f20621t.reset();
        this.f20621t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f20621t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f20619r = pointFMapPoint.x;
        this.f20620s = pointFMapPoint.y;
        this.f20618q.m19179k(this.f20621t);
    }
}
