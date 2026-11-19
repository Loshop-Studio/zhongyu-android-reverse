package p287w5;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p276v5.C10247b;
import p276v5.C10248c;
import p300x7.InterfaceC10559a;

/* renamed from: w5.e */
/* loaded from: classes5.dex */
public abstract class AbstractC10353e {

    /* renamed from: n */
    public static final a f20597n = new a(null);

    /* renamed from: a */
    public final C10248c f20598a;

    /* renamed from: b */
    public final Matrix f20599b;

    /* renamed from: c */
    public final C10247b f20600c;

    /* renamed from: d */
    public final PointF f20601d;

    /* renamed from: e */
    public float f20602e;

    /* renamed from: f */
    public int f20603f;

    /* renamed from: g */
    public long f20604g;

    /* renamed from: h */
    public final Matrix f20605h;

    /* renamed from: i */
    public final MotionEvent.PointerCoords f20606i;

    /* renamed from: j */
    public final PointF f20607j;

    /* renamed from: k */
    public final PointF f20608k;

    /* renamed from: l */
    public final PointF f20609l;

    /* renamed from: m */
    public final Matrix f20610m;

    /* renamed from: w5.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public AbstractC10353e(C10248c boardConfig, Matrix cameraMatrix, C10247b drawControl) {
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        AbstractC9133u.m16133g(cameraMatrix, "cameraMatrix");
        AbstractC9133u.m16133g(drawControl, "drawControl");
        this.f20598a = boardConfig;
        this.f20599b = cameraMatrix;
        this.f20600c = drawControl;
        this.f20601d = new PointF();
        this.f20602e = 1.0f;
        this.f20605h = new Matrix();
        this.f20606i = new MotionEvent.PointerCoords();
        this.f20607j = new PointF();
        this.f20608k = new PointF();
        this.f20609l = new PointF();
        this.f20610m = new Matrix();
    }

    /* renamed from: q */
    public static final C8736p m19268q(AbstractC10353e abstractC10353e, MotionEvent motionEvent) {
        abstractC10353e.mo19291z(motionEvent);
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final C8736p m19269s(AbstractC10353e abstractC10353e, MotionEvent motionEvent) {
        abstractC10353e.mo19272A(motionEvent);
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final C8736p m19270u(AbstractC10353e abstractC10353e, MotionEvent motionEvent) {
        abstractC10353e.mo19273B(motionEvent);
        return C8736p.f16368a;
    }

    /* renamed from: x */
    public static final C8736p m19271x(AbstractC10353e abstractC10353e, MotionEvent motionEvent) {
        abstractC10353e.mo19273B(motionEvent);
        return C8736p.f16368a;
    }

    /* renamed from: A */
    public abstract void mo19272A(MotionEvent motionEvent);

    /* renamed from: B */
    public abstract void mo19273B(MotionEvent motionEvent);

    /* renamed from: e */
    public final float m19274e(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    /* renamed from: f */
    public final PointF m19275f(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: g */
    public final void m19276g(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        motionEvent.getPointerCoords(0, this.f20606i);
        PointF pointF = this.f20607j;
        MotionEvent.PointerCoords pointerCoords = this.f20606i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f20606i);
        PointF pointF2 = this.f20608k;
        MotionEvent.PointerCoords pointerCoords2 = this.f20606i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f20601d.set(m19275f(this.f20607j, this.f20608k));
        this.f20602e = m19274e(this.f20607j, this.f20608k);
        m19279j();
    }

    /* renamed from: h */
    public final void m19277h(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m19280k(m19282m(motionEvent));
    }

    /* renamed from: i */
    public final void m19278i(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m19281l(m19282m(motionEvent));
    }

    /* renamed from: j */
    public final void m19279j() {
        this.f20605h.set(this.f20599b);
    }

    /* renamed from: k */
    public final void m19280k(Matrix matrix) {
        matrix.preConcat(this.f20605h);
        this.f20600c.m19176h(matrix);
    }

    /* renamed from: l */
    public final void m19281l(Matrix matrix) {
        m19280k(matrix);
    }

    /* renamed from: m */
    public final Matrix m19282m(MotionEvent motionEvent) {
        motionEvent.getPointerCoords(0, this.f20606i);
        PointF pointF = this.f20607j;
        MotionEvent.PointerCoords pointerCoords = this.f20606i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f20606i);
        PointF pointF2 = this.f20608k;
        MotionEvent.PointerCoords pointerCoords2 = this.f20606i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f20610m.reset();
        if (this.f20598a.m19187a()) {
            float fM19274e = m19274e(this.f20607j, this.f20608k) / this.f20602e;
            Matrix matrix = this.f20610m;
            PointF pointF3 = this.f20601d;
            matrix.postScale(fM19274e, fM19274e, pointF3.x, pointF3.y);
        }
        this.f20609l.set(m19275f(this.f20607j, this.f20608k));
        Matrix matrix2 = this.f20610m;
        PointF pointF4 = this.f20609l;
        float f10 = pointF4.x;
        PointF pointF5 = this.f20601d;
        matrix2.postTranslate(f10 - pointF5.x, pointF4.y - pointF5.y);
        return this.f20610m;
    }

    /* renamed from: n */
    public final boolean m19283n() {
        return System.currentTimeMillis() - this.f20604g <= 48;
    }

    /* renamed from: o */
    public final void m19284o(MotionEvent event, InterfaceC10559a callback) {
        AbstractC9133u.m16133g(event, "event");
        AbstractC9133u.m16133g(callback, "callback");
        if (!this.f20598a.m19188b()) {
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
    public void m19285p(final MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f20603f = 1;
        this.f20604g = System.currentTimeMillis();
        m19284o(event, new InterfaceC10559a() { // from class: w5.a
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AbstractC10353e.m19268q(this.f20589a, event);
            }
        });
    }

    /* renamed from: r */
    public void m19286r(final MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        int i10 = this.f20603f;
        if (i10 == 1) {
            m19284o(event, new InterfaceC10559a() { // from class: w5.b
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return AbstractC10353e.m19269s(this.f20591a, event);
                }
            });
        } else {
            if (i10 != 2) {
                return;
            }
            m19277h(event);
        }
    }

    /* renamed from: t */
    public void m19287t(final MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (this.f20603f == 1) {
            this.f20603f = 2;
            if (m19283n()) {
                mo19290y(event);
            } else {
                m19284o(event, new InterfaceC10559a() { // from class: w5.c
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return AbstractC10353e.m19270u(this.f20593a, event);
                    }
                });
            }
            m19276g(event);
        }
    }

    /* renamed from: v */
    public void mo19288v(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (this.f20603f == 2) {
            this.f20603f = 0;
            m19278i(event);
        }
    }

    /* renamed from: w */
    public void m19289w(final MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (this.f20603f == 1) {
            m19284o(event, new InterfaceC10559a() { // from class: w5.d
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return AbstractC10353e.m19271x(this.f20595a, event);
                }
            });
        }
    }

    /* renamed from: y */
    public abstract void mo19290y(MotionEvent motionEvent);

    /* renamed from: z */
    public abstract void mo19291z(MotionEvent motionEvent);
}
