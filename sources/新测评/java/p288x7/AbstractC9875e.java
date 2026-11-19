package p288x7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p278w7.C9821b;
import p278w7.C9822c;

/* renamed from: x7.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9875e {

    /* renamed from: n */
    public static final a f17469n = new a(null);

    /* renamed from: a */
    public final C9822c f17470a;

    /* renamed from: b */
    public final Matrix f17471b;

    /* renamed from: c */
    public final C9821b f17472c;

    /* renamed from: d */
    public final PointF f17473d;

    /* renamed from: e */
    public float f17474e;

    /* renamed from: f */
    public int f17475f;

    /* renamed from: g */
    public long f17476g;

    /* renamed from: h */
    public final Matrix f17477h;

    /* renamed from: i */
    public final MotionEvent.PointerCoords f17478i;

    /* renamed from: j */
    public final PointF f17479j;

    /* renamed from: k */
    public final PointF f17480k;

    /* renamed from: l */
    public final PointF f17481l;

    /* renamed from: m */
    public final Matrix f17482m;

    /* renamed from: x7.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC9875e(C9822c boardConfig, Matrix cameraMatrix, C9821b drawControl) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f17470a = boardConfig;
        this.f17471b = cameraMatrix;
        this.f17472c = drawControl;
        this.f17473d = new PointF();
        this.f17474e = 1.0f;
        this.f17477h = new Matrix();
        this.f17478i = new MotionEvent.PointerCoords();
        this.f17479j = new PointF();
        this.f17480k = new PointF();
        this.f17481l = new PointF();
        this.f17482m = new Matrix();
    }

    /* renamed from: q */
    public static final Unit m16562q(AbstractC9875e abstractC9875e, MotionEvent motionEvent) {
        abstractC9875e.mo16585z(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m16563s(AbstractC9875e abstractC9875e, MotionEvent motionEvent) {
        abstractC9875e.mo16566A(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m16564u(AbstractC9875e abstractC9875e, MotionEvent motionEvent) {
        abstractC9875e.mo16567B(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m16565x(AbstractC9875e abstractC9875e, MotionEvent motionEvent) {
        abstractC9875e.mo16567B(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public abstract void mo16566A(MotionEvent motionEvent);

    /* renamed from: B */
    public abstract void mo16567B(MotionEvent motionEvent);

    /* renamed from: e */
    public final float m16568e(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    /* renamed from: f */
    public final PointF m16569f(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: g */
    public final void m16570g(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        motionEvent.getPointerCoords(0, this.f17478i);
        PointF pointF = this.f17479j;
        MotionEvent.PointerCoords pointerCoords = this.f17478i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f17478i);
        PointF pointF2 = this.f17480k;
        MotionEvent.PointerCoords pointerCoords2 = this.f17478i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f17473d.set(m16569f(this.f17479j, this.f17480k));
        this.f17474e = m16568e(this.f17479j, this.f17480k);
        m16573j();
    }

    /* renamed from: h */
    public final void m16571h(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m16574k(m16576m(motionEvent));
    }

    /* renamed from: i */
    public final void m16572i(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m16575l(m16576m(motionEvent));
    }

    /* renamed from: j */
    public final void m16573j() {
        this.f17477h.set(this.f17471b);
    }

    /* renamed from: k */
    public final void m16574k(Matrix matrix) {
        matrix.preConcat(this.f17477h);
        this.f17472c.m16417k(matrix);
    }

    /* renamed from: l */
    public final void m16575l(Matrix matrix) {
        m16574k(matrix);
    }

    /* renamed from: m */
    public final Matrix m16576m(MotionEvent motionEvent) {
        motionEvent.getPointerCoords(0, this.f17478i);
        PointF pointF = this.f17479j;
        MotionEvent.PointerCoords pointerCoords = this.f17478i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f17478i);
        PointF pointF2 = this.f17480k;
        MotionEvent.PointerCoords pointerCoords2 = this.f17478i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f17482m.reset();
        if (this.f17470a.m16432a()) {
            float fM16568e = m16568e(this.f17479j, this.f17480k) / this.f17474e;
            Matrix matrix = this.f17482m;
            PointF pointF3 = this.f17473d;
            matrix.postScale(fM16568e, fM16568e, pointF3.x, pointF3.y);
        }
        this.f17481l.set(m16569f(this.f17479j, this.f17480k));
        Matrix matrix2 = this.f17482m;
        PointF pointF4 = this.f17481l;
        float f10 = pointF4.x;
        PointF pointF5 = this.f17473d;
        matrix2.postTranslate(f10 - pointF5.x, pointF4.y - pointF5.y);
        return this.f17482m;
    }

    /* renamed from: n */
    public final boolean m16577n() {
        return System.currentTimeMillis() - this.f17476g <= 48;
    }

    /* renamed from: o */
    public final void m16578o(MotionEvent event, Function0 callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.f17470a.m16433b()) {
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
    public void m16579p(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17475f = 1;
        this.f17476g = System.currentTimeMillis();
        m16578o(event, new Function0() { // from class: x7.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC9875e.m16562q(this.f17461a, event);
            }
        });
    }

    /* renamed from: r */
    public void m16580r(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = this.f17475f;
        if (i10 == 1) {
            m16578o(event, new Function0() { // from class: x7.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC9875e.m16563s(this.f17463a, event);
                }
            });
        } else {
            if (i10 != 2) {
                return;
            }
            m16571h(event);
        }
    }

    /* renamed from: t */
    public void m16581t(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f17475f == 1) {
            this.f17475f = 2;
            if (m16577n()) {
                mo16584y(event);
            } else {
                m16578o(event, new Function0() { // from class: x7.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC9875e.m16564u(this.f17465a, event);
                    }
                });
            }
            m16570g(event);
        }
    }

    /* renamed from: v */
    public void mo16582v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f17475f == 2) {
            this.f17475f = 0;
            m16572i(event);
        }
    }

    /* renamed from: w */
    public void m16583w(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f17475f == 1) {
            m16578o(event, new Function0() { // from class: x7.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC9875e.m16565x(this.f17467a, event);
                }
            });
        }
    }

    /* renamed from: y */
    public abstract void mo16584y(MotionEvent motionEvent);

    /* renamed from: z */
    public abstract void mo16585z(MotionEvent motionEvent);
}
