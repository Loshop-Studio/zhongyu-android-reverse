package p287w5;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC9133u;
import p276v5.C10247b;
import p276v5.C10248c;

/* renamed from: w5.h */
/* loaded from: classes5.dex */
public final class C10356h extends AbstractC10353e {

    /* renamed from: o */
    public final C10248c f20624o;

    /* renamed from: p */
    public final Matrix f20625p;

    /* renamed from: q */
    public final C10247b f20626q;

    /* renamed from: r */
    public final PointF f20627r;

    /* renamed from: s */
    public final Matrix f20628s;

    /* renamed from: t */
    public final Matrix f20629t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10356h(C10248c boardConfig, Matrix cameraMatrix, C10247b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        AbstractC9133u.m16133g(cameraMatrix, "cameraMatrix");
        AbstractC9133u.m16133g(drawControl, "drawControl");
        this.f20624o = boardConfig;
        this.f20625p = cameraMatrix;
        this.f20626q = drawControl;
        this.f20627r = new PointF();
        this.f20628s = new Matrix();
        this.f20629t = new Matrix();
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: A */
    public void mo19272A(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (!this.f20627r.equals(-1.0f, -1.0f)) {
            this.f20629t.set(this.f20628s);
            this.f20629t.postTranslate(event.getX() - this.f20627r.x, event.getY() - this.f20627r.y);
            this.f20626q.m19176h(this.f20629t);
        } else {
            this.f20627r.x = event.getX();
            this.f20627r.y = event.getY();
        }
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: B */
    public void mo19273B(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: v */
    public void mo19288v(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        super.mo19288v(event);
        m19285p(event);
        this.f20627r.set(-1.0f, -1.0f);
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: y */
    public void mo19290y(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // p287w5.AbstractC10353e
    /* renamed from: z */
    public void mo19291z(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20627r.set(event.getX(), event.getY());
        this.f20628s.set(this.f20625p);
    }
}
