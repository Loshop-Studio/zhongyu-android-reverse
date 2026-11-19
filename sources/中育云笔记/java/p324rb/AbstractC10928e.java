package p324rb;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p308qb.C10768b;
import p308qb.C10769c;
import p309qc.C10786q;

/* renamed from: rb.e */
/* loaded from: classes6.dex */
public abstract class AbstractC10928e {

    /* renamed from: n */
    public static final a f26397n = new a(null);

    /* renamed from: a */
    public final C10769c f26398a;

    /* renamed from: b */
    public final Matrix f26399b;

    /* renamed from: c */
    public final C10768b f26400c;

    /* renamed from: d */
    public final PointF f26401d;

    /* renamed from: e */
    public float f26402e;

    /* renamed from: f */
    public int f26403f;

    /* renamed from: g */
    public long f26404g;

    /* renamed from: h */
    public final Matrix f26405h;

    /* renamed from: i */
    public final MotionEvent.PointerCoords f26406i;

    /* renamed from: j */
    public final PointF f26407j;

    /* renamed from: k */
    public final PointF f26408k;

    /* renamed from: l */
    public final PointF f26409l;

    /* renamed from: m */
    public final Matrix f26410m;

    /* renamed from: rb.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public AbstractC10928e(C10769c boardConfig, Matrix cameraMatrix, C10768b drawControl) {
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        AbstractC9979u.m20294g(cameraMatrix, "cameraMatrix");
        AbstractC9979u.m20294g(drawControl, "drawControl");
        this.f26398a = boardConfig;
        this.f26399b = cameraMatrix;
        this.f26400c = drawControl;
        this.f26401d = new PointF();
        this.f26402e = 1.0f;
        this.f26405h = new Matrix();
        this.f26406i = new MotionEvent.PointerCoords();
        this.f26407j = new PointF();
        this.f26408k = new PointF();
        this.f26409l = new PointF();
        this.f26410m = new Matrix();
    }

    /* renamed from: q */
    public static final C10786q m23825q(AbstractC10928e abstractC10928e, MotionEvent motionEvent) {
        abstractC10928e.mo23848z(motionEvent);
        return C10786q.f26013a;
    }

    /* renamed from: s */
    public static final C10786q m23826s(AbstractC10928e abstractC10928e, MotionEvent motionEvent) {
        abstractC10928e.mo23829A(motionEvent);
        return C10786q.f26013a;
    }

    /* renamed from: u */
    public static final C10786q m23827u(AbstractC10928e abstractC10928e, MotionEvent motionEvent) {
        abstractC10928e.mo23830B(motionEvent);
        return C10786q.f26013a;
    }

    /* renamed from: x */
    public static final C10786q m23828x(AbstractC10928e abstractC10928e, MotionEvent motionEvent) {
        abstractC10928e.mo23830B(motionEvent);
        return C10786q.f26013a;
    }

    /* renamed from: A */
    public abstract void mo23829A(MotionEvent motionEvent);

    /* renamed from: B */
    public abstract void mo23830B(MotionEvent motionEvent);

    /* renamed from: e */
    public final float m23831e(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    /* renamed from: f */
    public final PointF m23832f(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: g */
    public final void m23833g(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        motionEvent.getPointerCoords(0, this.f26406i);
        PointF pointF = this.f26407j;
        MotionEvent.PointerCoords pointerCoords = this.f26406i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f26406i);
        PointF pointF2 = this.f26408k;
        MotionEvent.PointerCoords pointerCoords2 = this.f26406i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f26401d.set(m23832f(this.f26407j, this.f26408k));
        this.f26402e = m23831e(this.f26407j, this.f26408k);
        m23836j();
    }

    /* renamed from: h */
    public final void m23834h(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m23837k(m23839m(motionEvent));
    }

    /* renamed from: i */
    public final void m23835i(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m23838l(m23839m(motionEvent));
    }

    /* renamed from: j */
    public final void m23836j() {
        this.f26405h.set(this.f26399b);
    }

    /* renamed from: k */
    public final void m23837k(Matrix matrix) {
        matrix.preConcat(this.f26405h);
        this.f26400c.m22949h(matrix);
    }

    /* renamed from: l */
    public final void m23838l(Matrix matrix) {
        m23837k(matrix);
    }

    /* renamed from: m */
    public final Matrix m23839m(MotionEvent motionEvent) {
        motionEvent.getPointerCoords(0, this.f26406i);
        PointF pointF = this.f26407j;
        MotionEvent.PointerCoords pointerCoords = this.f26406i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f26406i);
        PointF pointF2 = this.f26408k;
        MotionEvent.PointerCoords pointerCoords2 = this.f26406i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f26410m.reset();
        if (this.f26398a.m22960a()) {
            float fM23831e = m23831e(this.f26407j, this.f26408k) / this.f26402e;
            Matrix matrix = this.f26410m;
            PointF pointF3 = this.f26401d;
            matrix.postScale(fM23831e, fM23831e, pointF3.x, pointF3.y);
        }
        this.f26409l.set(m23832f(this.f26407j, this.f26408k));
        Matrix matrix2 = this.f26410m;
        PointF pointF4 = this.f26409l;
        float f10 = pointF4.x;
        PointF pointF5 = this.f26401d;
        matrix2.postTranslate(f10 - pointF5.x, pointF4.y - pointF5.y);
        return this.f26410m;
    }

    /* renamed from: n */
    public final boolean m23840n() {
        return System.currentTimeMillis() - this.f26404g <= 48;
    }

    /* renamed from: o */
    public final void m23841o(MotionEvent event, InterfaceC9529a callback) {
        AbstractC9979u.m20294g(event, "event");
        AbstractC9979u.m20294g(callback, "callback");
        if (!this.f26398a.m22961b()) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            int pointerCount = event.getPointerCount();
            for (int i10 = 0; i10 < pointerCount; i10++) {
                event.getPointerProperties(i10, pointerProperties);
                if (pointerProperties.toolType == 1) {
                    return;
                }
            }
        }
        if (event.getPointerCount() == 1) {
            callback.invoke();
        }
    }

    /* renamed from: p */
    public void m23842p(final MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f26403f = 1;
        this.f26404g = System.currentTimeMillis();
        m23841o(event, new InterfaceC9529a() { // from class: rb.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return AbstractC10928e.m23825q(this.f26389c, event);
            }
        });
    }

    /* renamed from: r */
    public void m23843r(final MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        int i10 = this.f26403f;
        if (i10 == 1) {
            m23841o(event, new InterfaceC9529a() { // from class: rb.b
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AbstractC10928e.m23826s(this.f26391c, event);
                }
            });
        } else {
            if (i10 != 2) {
                return;
            }
            m23834h(event);
        }
    }

    /* renamed from: t */
    public void m23844t(final MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (this.f26403f == 1) {
            this.f26403f = 2;
            if (m23840n()) {
                mo23847y(event);
            } else {
                m23841o(event, new InterfaceC9529a() { // from class: rb.c
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return AbstractC10928e.m23827u(this.f26393c, event);
                    }
                });
            }
            m23833g(event);
        }
    }

    /* renamed from: v */
    public void mo23845v(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (this.f26403f == 2) {
            this.f26403f = 0;
            m23835i(event);
        }
    }

    /* renamed from: w */
    public void m23846w(final MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (this.f26403f == 1) {
            m23841o(event, new InterfaceC9529a() { // from class: rb.d
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AbstractC10928e.m23828x(this.f26395c, event);
                }
            });
        }
    }

    /* renamed from: y */
    public abstract void mo23847y(MotionEvent motionEvent);

    /* renamed from: z */
    public abstract void mo23848z(MotionEvent motionEvent);
}
