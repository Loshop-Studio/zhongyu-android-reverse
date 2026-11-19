package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5121d;
import p077e5.AbstractC7352m;
import p077e5.C7347h;
import p077e5.C7348i;
import p077e5.C7353n;
import p087f4.C7438c;
import p098g4.InterfaceC7522b;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;

/* renamed from: com.zykj.blackboard.core.action.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6626b extends BaseTouchAction {

    /* renamed from: o */
    public static final a f7026o = new a(null);

    /* renamed from: i */
    public int f7031i;

    /* renamed from: j */
    public long f7032j;

    /* renamed from: n */
    public boolean f7036n;

    /* renamed from: e */
    public final ArrayList f7027e = new ArrayList();

    /* renamed from: f */
    public final Matrix f7028f = new Matrix();

    /* renamed from: g */
    public final Matrix f7029g = new Matrix();

    /* renamed from: h */
    public final PointF f7030h = new PointF();

    /* renamed from: k */
    public EzyMatrix.Matrix f7033k = EzyMatrix.Matrix.m7721u();

    /* renamed from: l */
    public final RectF f7034l = new RectF();

    /* renamed from: m */
    public final RectF f7035m = new RectF();

    /* renamed from: com.zykj.blackboard.core.action.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: v */
    private final PointF m6099v(float f10, float f11) {
        if (m5990i() == null) {
            return new PointF(f10, f11);
        }
        C7353n c7353n = C7353n.f11920a;
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        return c7353n.m11783d(f10, f11, c7792aM5990i.m13188b());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix m6100A(com.zykj.board.EzyTouchEvent.TouchEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getPointerCoordsCount()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            return r1
        L9:
            com.zykj.blackboard.bean.BoardConfig r0 = r8.m5987f()
            if (r0 == 0) goto Ld9
            f4.c r0 = r0.getMoveActionConfig()
            if (r0 == 0) goto Ld9
            r3 = 0
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m8550w(r3)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r3 = r9.m8550w(r3)
            float r3 = r3.getY()
            android.graphics.PointF r3 = r8.m6099v(r4, r3)
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m8550w(r2)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r9 = r9.m8550w(r2)
            float r9 = r9.getY()
            android.graphics.PointF r9 = r8.m6099v(r4, r9)
            android.graphics.Matrix r2 = r8.f7028f
            r2.reset()
            boolean r2 = r0.m11993a()
            r4 = 0
            if (r2 == 0) goto L76
            android.graphics.RectF r2 = r8.f7035m
            float r5 = r2.left
            float r2 = r2.right
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L76
            android.graphics.PointF r1 = r8.m6108q(r3, r9)
            float r2 = r1.x
            android.graphics.PointF r5 = r8.f7030h
            float r5 = r5.x
            float r2 = r2 - r5
            android.graphics.RectF r5 = r8.f7035m
            float r6 = r5.left
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L69
            r2 = r6
            goto L70
        L69:
            float r5 = r5.right
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L70
            r2 = r5
        L70:
            android.graphics.Matrix r5 = r8.f7028f
            r5.postTranslate(r2, r4)
            goto L77
        L76:
            r2 = r4
        L77:
            boolean r0 = r0.m11998f()
            if (r0 == 0) goto Lab
            android.graphics.RectF r0 = r8.f7035m
            float r5 = r0.top
            float r0 = r0.bottom
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lab
            if (r1 != 0) goto L8d
            android.graphics.PointF r1 = r8.m6108q(r3, r9)
        L8d:
            float r9 = r1.y
            android.graphics.PointF r0 = r8.f7030h
            float r0 = r0.y
            float r9 = r9 - r0
            android.graphics.RectF r0 = r8.f7035m
            float r1 = r0.top
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L9e
            r9 = r1
            goto La5
        L9e:
            float r0 = r0.bottom
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto La5
            r9 = r0
        La5:
            android.graphics.Matrix r0 = r8.f7028f
            r0.postTranslate(r4, r9)
            r4 = r9
        Lab:
            r8.m6103D(r2, r4)
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            j4.a r0 = r8.m5990i()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.graphics.Matrix r0 = r0.m13191e()
            r9.postConcat(r0)
            android.graphics.Matrix r0 = r8.f7028f
            r9.postConcat(r0)
            j4.a r0 = r8.m5990i()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.graphics.Matrix r0 = r0.m13191e()
            android.graphics.Matrix r0 = p077e5.AbstractC7352m.m11777b(r0)
            r9.postConcat(r0)
            return r9
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.AbstractC6626b.m6100A(com.zykj.board.EzyTouchEvent$TouchEvent):android.graphics.Matrix"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/b.smali:224
    }

    /* renamed from: B */
    public final void m6101B() {
        Matrix matrix;
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        Intrinsics.checkNotNull(interfaceC7880cM5988g);
        RectF rectFMo13453r = interfaceC7880cM5988g.mo13453r();
        BoardConfig boardConfigM5987f = m5987f();
        Intrinsics.checkNotNull(boardConfigM5987f);
        C7438c moveActionConfig = boardConfigM5987f.getMoveActionConfig();
        if (moveActionConfig.m11994b() < 1 || moveActionConfig.m11995c() < 1) {
            this.f7034l.setEmpty();
            return;
        }
        this.f7034l.set(0.0f, 0.0f, rectFMo13453r.width() * moveActionConfig.m11995c(), rectFMo13453r.height() * moveActionConfig.m11994b());
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i == null || (matrix = c7792aM5990i.m13190d()) == null) {
            matrix = new Matrix();
        }
        matrix.mapRect(this.f7034l);
        RectF rectF = this.f7035m;
        float f10 = rectFMo13453r.right;
        RectF rectF2 = this.f7034l;
        rectF.set(f10 - rectF2.right, rectFMo13453r.bottom - rectF2.bottom, rectFMo13453r.left - rectF2.left, rectFMo13453r.top - rectF2.top);
        Log.i("MoveAction", "configRectF -> " + this.f7034l);
        Log.i("MoveAction", "limitRenderRectF -> " + this.f7035m);
    }

    /* renamed from: C */
    public final boolean m6102C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f7032j;
        Log.i("MoveAction", "time -> " + jCurrentTimeMillis);
        return jCurrentTimeMillis <= 48;
    }

    /* renamed from: D */
    public final void m6103D(float f10, float f11) {
        float fWidth;
        InterfaceC5121d interfaceC5121dMo12250o;
        C7438c moveActionConfig;
        C7438c moveActionConfig2;
        if (this.f7034l.isEmpty()) {
            return;
        }
        Log.i("MoveAction", "horizontal->" + f10 + "  vertical->" + f11);
        float fHeight = 0.0f;
        if (this.f7035m.width() > 0.0f) {
            RectF rectF = this.f7035m;
            fWidth = (rectF.right - f10) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.f7035m.height() > 0.0f) {
            RectF rectF2 = this.f7035m;
            fHeight = (rectF2.bottom - f11) / rectF2.height();
        }
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h == null || (interfaceC5121dMo12250o = interfaceC7522bM5989h.mo12250o()) == null) {
            return;
        }
        BoardConfig boardConfigM5987f = m5987f();
        if (boardConfigM5987f != null && (moveActionConfig2 = boardConfigM5987f.getMoveActionConfig()) != null && moveActionConfig2.m11993a()) {
            interfaceC5121dMo12250o.mo2776a(fWidth);
        }
        BoardConfig boardConfigM5987f2 = m5987f();
        if (boardConfigM5987f2 == null || (moveActionConfig = boardConfigM5987f2.getMoveActionConfig()) == null || !moveActionConfig.m11998f()) {
            return;
        }
        interfaceC5121dMo12250o.mo2777b(fHeight);
    }

    /* renamed from: E */
    public abstract void mo6002E(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: F */
    public abstract void mo6003F(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: G */
    public abstract void mo6004G(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: H */
    public abstract void mo6005H(EzyTouchEvent.TouchEvent touchEvent);

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: a */
    public void mo5982a(EzyTouchEvent.TouchEvent event) {
        C7438c moveActionConfig;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5982a(event);
        BoardConfig boardConfigM5987f = m5987f();
        if (boardConfigM5987f == null || (moveActionConfig = boardConfigM5987f.getMoveActionConfig()) == null || !moveActionConfig.m11999g() || this.f7036n || this.f7031i != 1) {
            return;
        }
        this.f7031i = 2;
        if (m6102C()) {
            mo6002E(event);
        } else {
            mo6005H(event);
        }
        m6109r(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: b */
    public void mo5983b(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5983b(event);
        if (this.f7031i == 1) {
            mo6005H(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: c */
    public void mo5984c(EzyTouchEvent.TouchEvent event) {
        C7438c moveActionConfig;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5984c(event);
        BoardConfig boardConfigM5987f = m5987f();
        if (boardConfigM5987f == null || (moveActionConfig = boardConfigM5987f.getMoveActionConfig()) == null || !moveActionConfig.m11999g() || this.f7031i != 2) {
            return;
        }
        this.f7031i = 0;
        m6111t(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: d */
    public void mo5985d(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5985d(event);
        int i10 = this.f7031i;
        if (i10 == 1) {
            mo6004G(event);
        } else {
            if (i10 != 2) {
                return;
            }
            m6110s(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: e */
    public void mo5986e(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM13188b;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5986e(event);
        if (this.f7031i == 2) {
            C7792a c7792aM5990i = m5990i();
            Matrix matrix = null;
            Matrix matrixM13188b2 = c7792aM5990i != null ? c7792aM5990i.m13188b() : null;
            m6111t(event);
            C7792a c7792aM5990i2 = m5990i();
            Matrix matrixM11777b = (c7792aM5990i2 == null || (matrixM13188b = c7792aM5990i2.m13188b()) == null) ? null : AbstractC7352m.m11777b(matrixM13188b);
            C7348i c7348i = C7348i.f11916a;
            if (matrixM13188b2 != null) {
                matrixM13188b2.postConcat(matrixM11777b);
                Unit unit = Unit.INSTANCE;
                matrix = matrixM13188b2;
            }
            event = c7348i.m11762c(event, matrix);
        }
        this.f7031i = 1;
        this.f7032j = System.currentTimeMillis();
        mo6003F(event);
    }

    /* renamed from: m */
    public final void m6104m(Float f10, Float f11) {
        if (!this.f7034l.isEmpty()) {
            m6116z(m6107p(f10, f11), Long.valueOf(System.currentTimeMillis()));
        }
        this.f7036n = false;
    }

    /* renamed from: n */
    public final void m6105n() {
        Matrix matrixM13190d;
        EzyMatrix.Matrix matrixM11778c;
        this.f7036n = true;
        m6101B();
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i != null && (matrixM13190d = c7792aM5990i.m13190d()) != null && (matrixM11778c = AbstractC7352m.m11778c(matrixM13190d, System.currentTimeMillis())) != null) {
            this.f7033k = matrixM11778c;
        }
        if (this.f7034l.isEmpty()) {
            return;
        }
        m6114x();
    }

    /* renamed from: o */
    public final void m6106o(Float f10, Float f11) {
        if (this.f7034l.isEmpty()) {
            return;
        }
        m6115y(m6107p(f10, f11), System.currentTimeMillis());
    }

    /* renamed from: p */
    public final Matrix m6107p(Float f10, Float f11) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            RectF rectF = this.f7035m;
            fValueOf = Float.valueOf(rectF.right - (fFloatValue * rectF.width()));
        } else {
            fValueOf = null;
        }
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            RectF rectF2 = this.f7035m;
            fValueOf2 = Float.valueOf(rectF2.bottom - (fFloatValue2 * rectF2.height()));
        }
        Matrix matrix = this.f7028f;
        matrix.reset();
        if (fValueOf != null) {
            matrix.postTranslate(fValueOf.floatValue(), 0.0f);
        }
        if (fValueOf2 != null) {
            matrix.postTranslate(0.0f, fValueOf2.floatValue());
        }
        Matrix matrix2 = new Matrix();
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        matrix2.postConcat(c7792aM5990i.m13191e());
        matrix2.postConcat(this.f7028f);
        C7792a c7792aM5990i2 = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i2);
        matrix2.postConcat(AbstractC7352m.m11777b(c7792aM5990i2.m13191e()));
        return matrix2;
    }

    /* renamed from: q */
    public final PointF m6108q(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: r */
    public final void m6109r(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM13190d;
        EzyMatrix.Matrix matrixM11778c;
        InterfaceC5121d interfaceC5121dMo12250o;
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h != null && (interfaceC5121dMo12250o = interfaceC7522bM5989h.mo12250o()) != null) {
            interfaceC5121dMo12250o.mo2779d();
        }
        this.f7030h.set(m6108q(m6099v(touchEvent.m8550w(0).getX(), touchEvent.m8550w(0).getY()), m6099v(touchEvent.m8550w(1).getX(), touchEvent.m8550w(1).getY())));
        m6101B();
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i != null && (matrixM13190d = c7792aM5990i.m13190d()) != null && (matrixM11778c = AbstractC7352m.m11778c(matrixM13190d, System.currentTimeMillis())) != null) {
            this.f7033k = matrixM11778c;
        }
        m6114x();
    }

    /* renamed from: s */
    public final void m6110s(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM6100A = m6100A(touchEvent);
        if (matrixM6100A != null) {
            m6115y(matrixM6100A, touchEvent.getEventTime());
        }
    }

    /* renamed from: t */
    public final void m6111t(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC5121d interfaceC5121dMo12250o;
        m6116z(m6100A(touchEvent), Long.valueOf(touchEvent.getEventTime()));
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h == null || (interfaceC5121dMo12250o = interfaceC7522bM5989h.mo12250o()) == null) {
            return;
        }
        interfaceC5121dMo12250o.mo2778c();
    }

    /* renamed from: u */
    public final float m6112u() {
        m6101B();
        if (this.f7034l.isEmpty() || this.f7035m.width() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.f7035m;
        return rectF.right / rectF.width();
    }

    /* renamed from: w */
    public final float m6113w() {
        m6101B();
        if (this.f7034l.isEmpty() || this.f7035m.height() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.f7035m;
        return rectF.bottom / rectF.height();
    }

    /* renamed from: x */
    public final void m6114x() {
        this.f7027e.clear();
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13450o();
        }
    }

    /* renamed from: y */
    public final void m6115y(Matrix matrix, long j10) {
        this.f7027e.add(AbstractC7352m.m11778c(matrix, j10));
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13454s(matrix);
        }
    }

    /* renamed from: z */
    public final void m6116z(Matrix matrix, Long l10) {
        Matrix matrix2;
        if (matrix != null) {
            ArrayList arrayList = this.f7027e;
            Intrinsics.checkNotNull(l10);
            arrayList.add(AbstractC7352m.m11778c(matrix, l10.longValue()));
        }
        if (this.f7027e.isEmpty()) {
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                InterfaceC7880c.a.m13462a(interfaceC7880cM5988g, null, 1, null);
                return;
            }
            return;
        }
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13417D(AbstractC7352m.m11779d((EzyMatrix.Matrix) CollectionsKt.last((List) this.f7027e)));
        }
        C7347h.f11914a.m11758b(EventKey.DELETE_ACTION);
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h != null) {
            EzyMatrix.Matrix originMatrix = this.f7033k;
            Intrinsics.checkNotNullExpressionValue(originMatrix, "originMatrix");
            C7792a c7792aM5990i = m5990i();
            if (c7792aM5990i == null || (matrix2 = c7792aM5990i.m13190d()) == null) {
                matrix2 = new Matrix();
            }
            interfaceC7522bM5989h.mo12237b(originMatrix, AbstractC7352m.m11778c(matrix2, 0L), this.f7027e);
        }
    }
}
