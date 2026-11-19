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

/* renamed from: x7.g */
/* loaded from: classes5.dex */
public final class C9877g extends AbstractC9875e {

    /* renamed from: o */
    public final C9822c f17488o;

    /* renamed from: p */
    public final Matrix f17489p;

    /* renamed from: q */
    public final C9821b f17490q;

    /* renamed from: r */
    public float f17491r;

    /* renamed from: s */
    public float f17492s;

    /* renamed from: t */
    public final Path f17493t;

    /* renamed from: u */
    public final ArrayList f17494u;

    /* renamed from: v */
    public final PointF f17495v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9877g(C9822c boardConfig, Matrix cameraMatrix, C9821b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f17488o = boardConfig;
        this.f17489p = cameraMatrix;
        this.f17490q = drawControl;
        this.f17493t = new Path();
        this.f17494u = new ArrayList();
        this.f17495v = new PointF();
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: A */
    public void mo16566A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17495v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17489p), this.f17495v);
        this.f17493t.reset();
        this.f17493t.moveTo(this.f17491r, this.f17492s);
        this.f17493t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f17490q.m16420n(this.f17493t);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: B */
    public void mo16567B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17495v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17489p), this.f17495v);
        this.f17494u.add(pointFMapPoint);
        this.f17493t.reset();
        this.f17493t.moveTo(this.f17491r, this.f17492s);
        this.f17493t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f17490q.m16422p(this.f17493t, this.f17494u);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: y */
    public void mo16584y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17490q.m16421o();
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: z */
    public void mo16585z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17495v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17489p), this.f17495v);
        this.f17494u.clear();
        this.f17494u.add(pointFMapPoint);
        this.f17493t.reset();
        this.f17493t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f17493t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f17491r = pointFMapPoint.x;
        this.f17492s = pointFMapPoint.y;
        this.f17490q.m16420n(this.f17493t);
    }
}
