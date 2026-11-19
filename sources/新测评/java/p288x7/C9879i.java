package p288x7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.core.graph.GraphExtKt;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p278w7.C9821b;
import p278w7.C9822c;

/* renamed from: x7.i */
/* loaded from: classes5.dex */
public final class C9879i extends AbstractC9875e {

    /* renamed from: o */
    public final C9822c f17502o;

    /* renamed from: p */
    public final Matrix f17503p;

    /* renamed from: q */
    public final C9821b f17504q;

    /* renamed from: r */
    public float f17505r;

    /* renamed from: s */
    public float f17506s;

    /* renamed from: t */
    public final Path f17507t;

    /* renamed from: u */
    public final ArrayList f17508u;

    /* renamed from: v */
    public final PointF f17509v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9879i(C9822c boardConfig, Matrix cameraMatrix, C9821b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f17502o = boardConfig;
        this.f17503p = cameraMatrix;
        this.f17504q = drawControl;
        this.f17507t = new Path();
        this.f17508u = new ArrayList();
        this.f17509v = new PointF();
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: A */
    public void mo16566A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17509v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17503p), this.f17509v);
        this.f17508u.add(pointFMapPoint);
        Path path = this.f17507t;
        float f10 = this.f17505r;
        float f11 = this.f17506s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f17505r = pointFMapPoint.x;
        this.f17506s = pointFMapPoint.y;
        this.f17504q.m16420n(this.f17507t);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: B */
    public void mo16567B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17509v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17503p), this.f17509v);
        this.f17508u.add(pointFMapPoint);
        Path path = this.f17507t;
        float f10 = this.f17505r;
        float f11 = this.f17506s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f17507t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f17504q.m16422p(this.f17507t, this.f17508u);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: y */
    public void mo16584y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17504q.m16421o();
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: z */
    public void mo16585z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17509v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17503p), this.f17509v);
        this.f17508u.clear();
        this.f17508u.add(pointFMapPoint);
        this.f17507t.reset();
        this.f17507t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f17507t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f17505r = pointFMapPoint.x;
        this.f17506s = pointFMapPoint.y;
        this.f17504q.m16420n(this.f17507t);
    }
}
