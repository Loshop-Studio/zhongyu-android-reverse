package p288x7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.core.graph.GraphExtKt;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p278w7.C9821b;
import p278w7.C9822c;

/* renamed from: x7.f */
/* loaded from: classes5.dex */
public final class C9876f extends AbstractC9875e {

    /* renamed from: o */
    public final C9822c f17483o;

    /* renamed from: p */
    public final Matrix f17484p;

    /* renamed from: q */
    public final C9821b f17485q;

    /* renamed from: r */
    public final PointF f17486r;

    /* renamed from: s */
    public final PointF f17487s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9876f(C9822c boardConfig, Matrix cameraMatrix, C9821b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f17483o = boardConfig;
        this.f17484p = cameraMatrix;
        this.f17485q = drawControl;
        this.f17486r = new PointF();
        this.f17487s = new PointF();
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: A */
    public void mo16566A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mo16585z(event);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: B */
    public void mo16567B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17487s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17484p), this.f17487s);
        this.f17486r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f17485q.m16419m(this.f17486r);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: y */
    public void mo16584y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mo16567B(event);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: z */
    public void mo16585z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17487s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC7352m.m11777b(this.f17484p), this.f17487s);
        this.f17486r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f17485q.m16418l(this.f17486r);
    }
}
