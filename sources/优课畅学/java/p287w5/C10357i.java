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

/* renamed from: w5.i */
/* loaded from: classes5.dex */
public final class C10357i extends AbstractC10353e {

    /* renamed from: o */
    public final C10248c f20630o;

    /* renamed from: p */
    public final Matrix f20631p;

    /* renamed from: q */
    public final C10247b f20632q;

    /* renamed from: r */
    public float f20633r;

    /* renamed from: s */
    public float f20634s;

    /* renamed from: t */
    public final Path f20635t;

    /* renamed from: u */
    public final ArrayList f20636u;

    /* renamed from: v */
    public final PointF f20637v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10357i(C10248c boardConfig, Matrix cameraMatrix, C10247b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        AbstractC9133u.m16133g(cameraMatrix, "cameraMatrix");
        AbstractC9133u.m16133g(drawControl, "drawControl");
        this.f20630o = boardConfig;
        this.f20631p = cameraMatrix;
        this.f20632q = drawControl;
        this.f20635t = new Path();
        this.f20636u = new ArrayList();
        this.f20637v = new PointF();
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: A */
    public void mo19272A(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20637v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20631p), this.f20637v);
        this.f20636u.add(pointFMapPoint);
        Path path = this.f20635t;
        float f10 = this.f20633r;
        float f11 = this.f20634s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f20633r = pointFMapPoint.x;
        this.f20634s = pointFMapPoint.y;
        this.f20632q.m19179k(this.f20635t);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: B */
    public void mo19273B(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20637v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20631p), this.f20637v);
        this.f20636u.add(pointFMapPoint);
        Path path = this.f20635t;
        float f10 = this.f20633r;
        float f11 = this.f20634s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f20635t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f20632q.m19181m(this.f20635t, this.f20636u);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: y */
    public void mo19290y(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20632q.m19180l();
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: z */
    public void mo19291z(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20637v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20631p), this.f20637v);
        this.f20636u.clear();
        this.f20636u.add(pointFMapPoint);
        this.f20635t.reset();
        this.f20635t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f20635t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f20633r = pointFMapPoint.x;
        this.f20634s = pointFMapPoint.y;
        this.f20632q.m19179k(this.f20635t);
    }
}
