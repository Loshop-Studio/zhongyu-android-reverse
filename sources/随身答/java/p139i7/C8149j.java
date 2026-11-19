package p139i7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.view.simpleBoard.C7719a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p129h7.C8107c;
import p263u5.AbstractC9695n;

/* renamed from: i7.j */
/* loaded from: classes5.dex */
public final class C8149j extends AbstractC8144e {

    /* renamed from: o */
    public final C8107c f13956o;

    /* renamed from: p */
    public final Matrix f13957p;

    /* renamed from: q */
    public final C7719a f13958q;

    /* renamed from: r */
    public float f13959r;

    /* renamed from: s */
    public float f13960s;

    /* renamed from: t */
    public final Path f13961t;

    /* renamed from: u */
    public final ArrayList f13962u;

    /* renamed from: v */
    public final PointF f13963v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8149j(C8107c boardConfig, Matrix cameraMatrix, C7719a drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f13956o = boardConfig;
        this.f13957p = cameraMatrix;
        this.f13958q = drawControl;
        this.f13961t = new Path();
        this.f13962u = new ArrayList();
        this.f13963v = new PointF();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: A */
    public void mo13055A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13963v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13957p), this.f13963v);
        this.f13962u.add(pointFMapPoint);
        Path path = this.f13961t;
        float f10 = this.f13959r;
        float f11 = this.f13960s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f13959r = pointFMapPoint.x;
        this.f13960s = pointFMapPoint.y;
        this.f13958q.m11938I(this.f13961t);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: B */
    public void mo13056B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13963v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13957p), this.f13963v);
        this.f13962u.add(pointFMapPoint);
        Path path = this.f13961t;
        float f10 = this.f13959r;
        float f11 = this.f13960s;
        float f12 = 2;
        path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
        this.f13961t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f13958q.m11940K(this.f13961t, this.f13962u);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: y */
    public void mo13073y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13958q.m11939J();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: z */
    public void mo13074z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13963v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13957p), this.f13963v);
        this.f13962u.clear();
        this.f13962u.add(pointFMapPoint);
        this.f13961t.reset();
        this.f13961t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f13961t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f13959r = pointFMapPoint.x;
        this.f13960s = pointFMapPoint.y;
        this.f13958q.m11938I(this.f13961t);
    }
}
