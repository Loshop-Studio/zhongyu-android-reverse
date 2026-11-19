package p287w5;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.sketch.core.graph.GraphExtKt;
import kotlin.jvm.internal.AbstractC9133u;
import p276v5.C10247b;
import p276v5.C10248c;

/* renamed from: w5.f */
/* loaded from: classes5.dex */
public final class C10354f extends AbstractC10353e {

    /* renamed from: o */
    public final C10248c f20611o;

    /* renamed from: p */
    public final Matrix f20612p;

    /* renamed from: q */
    public final C10247b f20613q;

    /* renamed from: r */
    public final PointF f20614r;

    /* renamed from: s */
    public final PointF f20615s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10354f(C10248c boardConfig, Matrix cameraMatrix, C10247b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        AbstractC9133u.m16133g(cameraMatrix, "cameraMatrix");
        AbstractC9133u.m16133g(drawControl, "drawControl");
        this.f20611o = boardConfig;
        this.f20612p = cameraMatrix;
        this.f20613q = drawControl;
        this.f20614r = new PointF();
        this.f20615s = new PointF();
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: A */
    public void mo19272A(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        mo19291z(event);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: B */
    public void mo19273B(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20615s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20612p), this.f20615s);
        this.f20614r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f20613q.m19178j(this.f20614r);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: y */
    public void mo19290y(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        mo19273B(event);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: z */
    public void mo19291z(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20615s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.f20612p), this.f20615s);
        this.f20614r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f20613q.m19177i(this.f20614r);
    }
}
