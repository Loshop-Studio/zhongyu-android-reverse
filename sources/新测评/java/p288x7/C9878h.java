package p288x7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import p278w7.C9821b;
import p278w7.C9822c;

/* renamed from: x7.h */
/* loaded from: classes5.dex */
public final class C9878h extends AbstractC9875e {

    /* renamed from: o */
    public final C9822c f17496o;

    /* renamed from: p */
    public final Matrix f17497p;

    /* renamed from: q */
    public final C9821b f17498q;

    /* renamed from: r */
    public final PointF f17499r;

    /* renamed from: s */
    public final Matrix f17500s;

    /* renamed from: t */
    public final Matrix f17501t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9878h(C9822c boardConfig, Matrix cameraMatrix, C9821b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f17496o = boardConfig;
        this.f17497p = cameraMatrix;
        this.f17498q = drawControl;
        this.f17499r = new PointF();
        this.f17500s = new Matrix();
        this.f17501t = new Matrix();
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: A */
    public void mo16566A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f17499r.equals(-1.0f, -1.0f)) {
            this.f17501t.set(this.f17500s);
            this.f17501t.postTranslate(event.getX() - this.f17499r.x, event.getY() - this.f17499r.y);
            this.f17498q.m16417k(this.f17501t);
        } else {
            this.f17499r.x = event.getX();
            this.f17499r.y = event.getY();
        }
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: B */
    public void mo16567B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: v */
    public void mo16582v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo16582v(event);
        m16579p(event);
        this.f17499r.set(-1.0f, -1.0f);
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: y */
    public void mo16584y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p288x7.AbstractC9875e
    /* renamed from: z */
    public void mo16585z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17499r.set(event.getX(), event.getY());
        this.f17500s.set(this.f17497p);
    }
}
