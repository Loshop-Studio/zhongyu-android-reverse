package p139i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.view.simpleBoard.C7719a;
import kotlin.jvm.internal.Intrinsics;
import p129h7.C8107c;

/* renamed from: i7.h */
/* loaded from: classes5.dex */
public final class C8147h extends AbstractC8144e {

    /* renamed from: o */
    public final C8107c f13947o;

    /* renamed from: p */
    public final Matrix f13948p;

    /* renamed from: q */
    public final C7719a f13949q;

    /* renamed from: r */
    public final PointF f13950r;

    /* renamed from: s */
    public final Matrix f13951s;

    /* renamed from: t */
    public final Matrix f13952t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8147h(C8107c boardConfig, Matrix cameraMatrix, C7719a drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f13947o = boardConfig;
        this.f13948p = cameraMatrix;
        this.f13949q = drawControl;
        this.f13950r = new PointF();
        this.f13951s = new Matrix();
        this.f13952t = new Matrix();
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: A */
    public void mo13055A(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f13950r.equals(-1.0f, -1.0f)) {
            this.f13952t.set(this.f13951s);
            this.f13952t.postTranslate(event.getX() - this.f13950r.x, event.getY() - this.f13950r.y);
            this.f13949q.m11930A(this.f13952t);
        } else {
            this.f13950r.x = event.getX();
            this.f13950r.y = event.getY();
        }
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: B */
    public void mo13056B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: v */
    public void mo13071v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo13071v(event);
        m13068p(event);
        this.f13950r.set(-1.0f, -1.0f);
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: y */
    public void mo13073y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p139i7.AbstractC8144e
    /* renamed from: z */
    public void mo13074z(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13950r.set(event.getX(), event.getY());
        this.f13951s.set(this.f13948p);
    }
}
