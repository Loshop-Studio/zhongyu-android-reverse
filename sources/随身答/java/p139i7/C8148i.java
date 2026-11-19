package p139i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.view.simpleBoard.C7719a;
import kotlin.jvm.internal.Intrinsics;
import p129h7.C8107c;
import p263u5.AbstractC9695n;

/* renamed from: i7.i */
/* loaded from: classes5.dex */
public final class C8148i extends AbstractC8144e {

    /* renamed from: o */
    public final Matrix f13953o;

    /* renamed from: p */
    public final C7719a f13954p;

    /* renamed from: q */
    public final PointF f13955q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8148i(C8107c boardConfig, Matrix cameraMatrix, C7719a drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f13953o = cameraMatrix;
        this.f13954p = drawControl;
        this.f13955q = new PointF();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: A */
    public void mo13055A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13954p.m11936G(m13075C(event));
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: B */
    public void mo13056B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13954p.m11935F(m13075C(event));
    }

    /* renamed from: C */
    public final PointF m13075C(MotionEvent motionEvent) {
        this.f13955q.set(motionEvent.getX(), motionEvent.getY());
        return GraphExtKt.mapPoint(AbstractC9695n.m16200b(this.f13953o), this.f13955q);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: y */
    public void mo13073y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13954p.m11933D();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: z */
    public void mo13074z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13954p.m11934E(m13075C(event), new PointF(event.getX(), event.getY()));
    }
}
