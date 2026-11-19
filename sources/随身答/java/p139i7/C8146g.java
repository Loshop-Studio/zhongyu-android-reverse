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

/* renamed from: i7.g */
/* loaded from: classes5.dex */
public final class C8146g extends AbstractC8144e {

    /* renamed from: o */
    public final C8107c f13939o;

    /* renamed from: p */
    public final Matrix f13940p;

    /* renamed from: q */
    public final C7719a f13941q;

    /* renamed from: r */
    public float f13942r;

    /* renamed from: s */
    public float f13943s;

    /* renamed from: t */
    public final Path f13944t;

    /* renamed from: u */
    public final ArrayList f13945u;

    /* renamed from: v */
    public final PointF f13946v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8146g(C8107c boardConfig, Matrix cameraMatrix, C7719a drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f13939o = boardConfig;
        this.f13940p = cameraMatrix;
        this.f13941q = drawControl;
        this.f13944t = new Path();
        this.f13945u = new ArrayList();
        this.f13946v = new PointF();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: A */
    public void mo13055A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13946v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13940p), this.f13946v);
        this.f13944t.reset();
        this.f13944t.moveTo(this.f13942r, this.f13943s);
        this.f13944t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f13941q.m11938I(this.f13944t);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: B */
    public void mo13056B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13946v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13940p), this.f13946v);
        this.f13945u.add(pointFMapPoint);
        this.f13944t.reset();
        this.f13944t.moveTo(this.f13942r, this.f13943s);
        this.f13944t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f13941q.m11940K(this.f13944t, this.f13945u);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: y */
    public void mo13073y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13941q.m11939J();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: z */
    public void mo13074z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13946v.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13940p), this.f13946v);
        this.f13945u.clear();
        this.f13945u.add(pointFMapPoint);
        this.f13944t.reset();
        this.f13944t.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f13944t.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.f13942r = pointFMapPoint.x;
        this.f13943s = pointFMapPoint.y;
        this.f13941q.m11938I(this.f13944t);
    }
}
