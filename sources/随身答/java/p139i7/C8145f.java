package p139i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.view.simpleBoard.C7719a;
import kotlin.jvm.internal.Intrinsics;
import p129h7.C8107c;
import p263u5.AbstractC9695n;

/* renamed from: i7.f */
/* loaded from: classes5.dex */
public final class C8145f extends AbstractC8144e {

    /* renamed from: o */
    public final C8107c f13934o;

    /* renamed from: p */
    public final Matrix f13935p;

    /* renamed from: q */
    public final C7719a f13936q;

    /* renamed from: r */
    public final PointF f13937r;

    /* renamed from: s */
    public final PointF f13938s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8145f(C8107c boardConfig, Matrix cameraMatrix, C7719a drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f13934o = boardConfig;
        this.f13935p = cameraMatrix;
        this.f13936q = drawControl;
        this.f13937r = new PointF();
        this.f13938s = new PointF();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: A */
    public void mo13055A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mo13074z(event);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: B */
    public void mo13056B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13938s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13935p), this.f13938s);
        this.f13937r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f13936q.m11932C(this.f13937r);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: y */
    public void mo13073y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mo13056B(event);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: z */
    public void mo13074z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13938s.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13935p), this.f13938s);
        this.f13937r.set(pointFMapPoint.x, pointFMapPoint.y);
        this.f13936q.m11931B(this.f13937r);
    }
}
