package p139i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.view.simpleBoard.C7719a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p129h7.C8107c;

/* renamed from: i7.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8144e {

    /* renamed from: n */
    public static final a f13920n = new a(null);

    /* renamed from: a */
    public final C8107c f13921a;

    /* renamed from: b */
    public final Matrix f13922b;

    /* renamed from: c */
    public final C7719a f13923c;

    /* renamed from: d */
    public final PointF f13924d;

    /* renamed from: e */
    public float f13925e;

    /* renamed from: f */
    public int f13926f;

    /* renamed from: g */
    public long f13927g;

    /* renamed from: h */
    public final Matrix f13928h;

    /* renamed from: i */
    public final MotionEvent.PointerCoords f13929i;

    /* renamed from: j */
    public final PointF f13930j;

    /* renamed from: k */
    public final PointF f13931k;

    /* renamed from: l */
    public final PointF f13932l;

    /* renamed from: m */
    public final Matrix f13933m;

    /* renamed from: i7.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC8144e(C8107c boardConfig, Matrix cameraMatrix, C7719a drawControl) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(cameraMatrix, "cameraMatrix");
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f13921a = boardConfig;
        this.f13922b = cameraMatrix;
        this.f13923c = drawControl;
        this.f13924d = new PointF();
        this.f13925e = 1.0f;
        this.f13928h = new Matrix();
        this.f13929i = new MotionEvent.PointerCoords();
        this.f13930j = new PointF();
        this.f13931k = new PointF();
        this.f13932l = new PointF();
        this.f13933m = new Matrix();
    }

    /* renamed from: q */
    public static final Unit m13051q(AbstractC8144e abstractC8144e, MotionEvent motionEvent) {
        abstractC8144e.mo13074z(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m13052s(AbstractC8144e abstractC8144e, MotionEvent motionEvent) {
        abstractC8144e.mo13055A(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m13053u(AbstractC8144e abstractC8144e, MotionEvent motionEvent) {
        abstractC8144e.mo13056B(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m13054x(AbstractC8144e abstractC8144e, MotionEvent motionEvent) {
        abstractC8144e.mo13056B(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public abstract void mo13055A(MotionEvent motionEvent);

    /* renamed from: B */
    public abstract void mo13056B(MotionEvent motionEvent);

    /* renamed from: e */
    public final float m13057e(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    /* renamed from: f */
    public final PointF m13058f(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: g */
    public final void m13059g(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        motionEvent.getPointerCoords(0, this.f13929i);
        PointF pointF = this.f13930j;
        MotionEvent.PointerCoords pointerCoords = this.f13929i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f13929i);
        PointF pointF2 = this.f13931k;
        MotionEvent.PointerCoords pointerCoords2 = this.f13929i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f13924d.set(m13058f(this.f13930j, this.f13931k));
        this.f13925e = m13057e(this.f13930j, this.f13931k);
        m13062j();
    }

    /* renamed from: h */
    public final void m13060h(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m13063k(m13065m(motionEvent));
    }

    /* renamed from: i */
    public final void m13061i(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return;
        }
        m13064l(m13065m(motionEvent));
    }

    /* renamed from: j */
    public final void m13062j() {
        this.f13928h.set(this.f13922b);
    }

    /* renamed from: k */
    public final void m13063k(Matrix matrix) {
        matrix.preConcat(this.f13928h);
        this.f13923c.m11930A(matrix);
    }

    /* renamed from: l */
    public final void m13064l(Matrix matrix) {
        m13063k(matrix);
    }

    /* renamed from: m */
    public final Matrix m13065m(MotionEvent motionEvent) {
        motionEvent.getPointerCoords(0, this.f13929i);
        PointF pointF = this.f13930j;
        MotionEvent.PointerCoords pointerCoords = this.f13929i;
        pointF.set(pointerCoords.x, pointerCoords.y);
        motionEvent.getPointerCoords(1, this.f13929i);
        PointF pointF2 = this.f13931k;
        MotionEvent.PointerCoords pointerCoords2 = this.f13929i;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.f13933m.reset();
        if (this.f13921a.m12956a()) {
            float fM13057e = m13057e(this.f13930j, this.f13931k) / this.f13925e;
            Matrix matrix = this.f13933m;
            PointF pointF3 = this.f13924d;
            matrix.postScale(fM13057e, fM13057e, pointF3.x, pointF3.y);
        }
        this.f13932l.set(m13058f(this.f13930j, this.f13931k));
        Matrix matrix2 = this.f13933m;
        PointF pointF4 = this.f13932l;
        float f10 = pointF4.x;
        PointF pointF5 = this.f13924d;
        matrix2.postTranslate(f10 - pointF5.x, pointF4.y - pointF5.y);
        return this.f13933m;
    }

    /* renamed from: n */
    public final boolean m13066n() {
        return System.currentTimeMillis() - this.f13927g <= 48;
    }

    /* renamed from: o */
    public final void m13067o(MotionEvent event, Function0 callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.f13921a.m12957b()) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            int pointerCount = event.getPointerCount();
            for (int i9 = 0; i9 < pointerCount; i9++) {
                event.getPointerProperties(i9, pointerProperties);
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
    public void m13068p(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13926f = 1;
        this.f13927g = System.currentTimeMillis();
        m13067o(event, new Function0() { // from class: i7.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC8144e.m13051q(this.f13912a, event);
            }
        });
    }

    /* renamed from: r */
    public void m13069r(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i9 = this.f13926f;
        if (i9 == 1) {
            m13067o(event, new Function0() { // from class: i7.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC8144e.m13052s(this.f13914a, event);
                }
            });
        } else {
            if (i9 != 2) {
                return;
            }
            m13060h(event);
        }
    }

    /* renamed from: t */
    public void m13070t(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f13926f == 1) {
            this.f13926f = 2;
            if (m13066n()) {
                mo13073y(event);
            } else {
                m13067o(event, new Function0() { // from class: i7.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC8144e.m13053u(this.f13916a, event);
                    }
                });
            }
            m13059g(event);
        }
    }

    /* renamed from: v */
    public void mo13071v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f13926f == 2) {
            this.f13926f = 0;
            m13061i(event);
        }
    }

    /* renamed from: w */
    public void m13072w(final MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f13926f == 1) {
            m13067o(event, new Function0() { // from class: i7.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC8144e.m13054x(this.f13918a, event);
                }
            });
        }
    }

    /* renamed from: y */
    public abstract void mo13073y(MotionEvent motionEvent);

    /* renamed from: z */
    public abstract void mo13074z(MotionEvent motionEvent);
}
