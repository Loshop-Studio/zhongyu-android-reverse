package p324rb;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC9979u;
import p308qb.C10768b;
import p308qb.C10769c;

/* renamed from: rb.h */
/* loaded from: classes6.dex */
public final class C10931h extends AbstractC10928e {

    /* renamed from: o */
    public final C10769c f26424o;

    /* renamed from: p */
    public final Matrix f26425p;

    /* renamed from: q */
    public final C10768b f26426q;

    /* renamed from: r */
    public final PointF f26427r;

    /* renamed from: s */
    public final Matrix f26428s;

    /* renamed from: t */
    public final Matrix f26429t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10931h(C10769c boardConfig, Matrix cameraMatrix, C10768b drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        AbstractC9979u.m20294g(cameraMatrix, "cameraMatrix");
        AbstractC9979u.m20294g(drawControl, "drawControl");
        this.f26424o = boardConfig;
        this.f26425p = cameraMatrix;
        this.f26426q = drawControl;
        this.f26427r = new PointF();
        this.f26428s = new Matrix();
        this.f26429t = new Matrix();
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: A */
    public void mo23829A(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (!this.f26427r.equals(-1.0f, -1.0f)) {
            this.f26429t.set(this.f26428s);
            this.f26429t.postTranslate(event.getX() - this.f26427r.x, event.getY() - this.f26427r.y);
            this.f26426q.m22949h(this.f26429t);
        } else {
            this.f26427r.x = event.getX();
            this.f26427r.y = event.getY();
        }
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: B */
    public void mo23830B(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: v */
    public void mo23845v(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.mo23845v(event);
        m23842p(event);
        this.f26427r.set(-1.0f, -1.0f);
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: y */
    public void mo23847y(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // p324rb.AbstractC10928e
    /* renamed from: z */
    public void mo23848z(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26427r.set(event.getX(), event.getY());
        this.f26428s.set(this.f26425p);
    }
}
