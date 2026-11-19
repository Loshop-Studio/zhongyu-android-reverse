package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p243s5.InterfaceC9476d;
import p263u5.AbstractC9695n;
import p263u5.C9690i;
import p263u5.C9691j;
import p263u5.C9696o;
import p272v4.C9763b;
import p272v4.C9765d;
import p282w4.InterfaceC9822b;
import p312z4.C9998a;

/* renamed from: com.zykj.blackboard.core.action.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6943b extends BaseTouchAction {

    /* renamed from: o */
    public static final a f8309o = new a(null);

    /* renamed from: i */
    public int f8314i;

    /* renamed from: j */
    public long f8315j;

    /* renamed from: n */
    public boolean f8319n;

    /* renamed from: e */
    public final ArrayList f8310e = new ArrayList();

    /* renamed from: f */
    public final Matrix f8311f = new Matrix();

    /* renamed from: g */
    public final Matrix f8312g = new Matrix();

    /* renamed from: h */
    public final PointF f8313h = new PointF();

    /* renamed from: k */
    public EzyMatrix.Matrix f8316k = EzyMatrix.Matrix.m8850x();

    /* renamed from: l */
    public final RectF f8317l = new RectF();

    /* renamed from: m */
    public final RectF f8318m = new RectF();

    /* renamed from: com.zykj.blackboard.core.action.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: v */
    private final PointF m7195v(float f10, float f11) {
        if (m7085i() == null) {
            return new PointF(f10, f11);
        }
        C9696o c9696o = C9696o.f17133a;
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        return c9696o.m16206d(f10, f11, c9998aM7085i.m17344b());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix m7196A(com.zykj.board.EzyTouchEvent.TouchEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getPointerCoordsCount()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            return r1
        L9:
            v4.b r0 = r8.m7082f()
            if (r0 == 0) goto Ld9
            v4.d r0 = r0.m16519z()
            if (r0 == 0) goto Ld9
            r3 = 0
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m9711z(r3)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r3 = r9.m9711z(r3)
            float r3 = r3.getY()
            android.graphics.PointF r3 = r8.m7195v(r4, r3)
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m9711z(r2)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r9 = r9.m9711z(r2)
            float r9 = r9.getY()
            android.graphics.PointF r9 = r8.m7195v(r4, r9)
            android.graphics.Matrix r2 = r8.f8311f
            r2.reset()
            boolean r2 = r0.m16522a()
            r4 = 0
            if (r2 == 0) goto L76
            android.graphics.RectF r2 = r8.f8318m
            float r5 = r2.left
            float r2 = r2.right
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L76
            android.graphics.PointF r1 = r8.m7204q(r3, r9)
            float r2 = r1.x
            android.graphics.PointF r5 = r8.f8313h
            float r5 = r5.x
            float r2 = r2 - r5
            android.graphics.RectF r5 = r8.f8318m
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
            android.graphics.Matrix r5 = r8.f8311f
            r5.postTranslate(r2, r4)
            goto L77
        L76:
            r2 = r4
        L77:
            boolean r0 = r0.m16527f()
            if (r0 == 0) goto Lab
            android.graphics.RectF r0 = r8.f8318m
            float r5 = r0.top
            float r0 = r0.bottom
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lab
            if (r1 != 0) goto L8d
            android.graphics.PointF r1 = r8.m7204q(r3, r9)
        L8d:
            float r9 = r1.y
            android.graphics.PointF r0 = r8.f8313h
            float r0 = r0.y
            float r9 = r9 - r0
            android.graphics.RectF r0 = r8.f8318m
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
            android.graphics.Matrix r0 = r8.f8311f
            r0.postTranslate(r4, r9)
            r4 = r9
        Lab:
            r8.m7199D(r2, r4)
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            z4.a r0 = r8.m7085i()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.graphics.Matrix r0 = r0.m17347e()
            r9.postConcat(r0)
            android.graphics.Matrix r0 = r8.f8311f
            r9.postConcat(r0)
            z4.a r0 = r8.m7085i()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.graphics.Matrix r0 = r0.m17347e()
            android.graphics.Matrix r0 = p263u5.AbstractC9695n.m16200b(r0)
            r9.postConcat(r0)
            return r9
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.AbstractC6943b.m7196A(com.zykj.board.EzyTouchEvent$TouchEvent):android.graphics.Matrix"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/b.smali:224
    }

    /* renamed from: B */
    public final void m7197B() {
        Matrix matrix;
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        Intrinsics.checkNotNull(interfaceC0039cM7083g);
        RectF rectFMo213p = interfaceC0039cM7083g.mo213p();
        C9763b c9763bM7082f = m7082f();
        Intrinsics.checkNotNull(c9763bM7082f);
        C9765d c9765dM16519z = c9763bM7082f.m16519z();
        if (c9765dM16519z.m16523b() < 1 || c9765dM16519z.m16524c() < 1) {
            this.f8317l.setEmpty();
            return;
        }
        this.f8317l.set(0.0f, 0.0f, rectFMo213p.width() * c9765dM16519z.m16524c(), rectFMo213p.height() * c9765dM16519z.m16523b());
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i == null || (matrix = c9998aM7085i.m17346d()) == null) {
            matrix = new Matrix();
        }
        matrix.mapRect(this.f8317l);
        RectF rectF = this.f8318m;
        float f10 = rectFMo213p.right;
        RectF rectF2 = this.f8317l;
        rectF.set(f10 - rectF2.right, rectFMo213p.bottom - rectF2.bottom, rectFMo213p.left - rectF2.left, rectFMo213p.top - rectF2.top);
        Log.i("MoveAction", "configRectF -> " + this.f8317l);
        Log.i("MoveAction", "limitRenderRectF -> " + this.f8318m);
    }

    /* renamed from: C */
    public final boolean m7198C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f8315j;
        Log.i("MoveAction", "time -> " + jCurrentTimeMillis);
        return jCurrentTimeMillis <= 48;
    }

    /* renamed from: D */
    public final void m7199D(float f10, float f11) {
        float fWidth;
        InterfaceC9476d interfaceC9476dMo16696o;
        C9765d c9765dM16519z;
        C9765d c9765dM16519z2;
        if (this.f8317l.isEmpty()) {
            return;
        }
        Log.i("MoveAction", "horizontal->" + f10 + "  vertical->" + f11);
        float fHeight = 0.0f;
        if (this.f8318m.width() > 0.0f) {
            RectF rectF = this.f8318m;
            fWidth = (rectF.right - f10) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.f8318m.height() > 0.0f) {
            RectF rectF2 = this.f8318m;
            fHeight = (rectF2.bottom - f11) / rectF2.height();
        }
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h == null || (interfaceC9476dMo16696o = interfaceC9822bM7084h.mo16696o()) == null) {
            return;
        }
        C9763b c9763bM7082f = m7082f();
        if (c9763bM7082f != null && (c9765dM16519z2 = c9763bM7082f.m16519z()) != null && c9765dM16519z2.m16522a()) {
            interfaceC9476dMo16696o.mo2221a(fWidth);
        }
        C9763b c9763bM7082f2 = m7082f();
        if (c9763bM7082f2 == null || (c9765dM16519z = c9763bM7082f2.m16519z()) == null || !c9765dM16519z.m16527f()) {
            return;
        }
        interfaceC9476dMo16696o.mo2222b(fHeight);
    }

    /* renamed from: E */
    public abstract void mo7097E(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: F */
    public abstract void mo7098F(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: G */
    public abstract void mo7099G(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: H */
    public abstract void mo7100H(EzyTouchEvent.TouchEvent touchEvent);

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: a */
    public void mo7077a(EzyTouchEvent.TouchEvent event) {
        C9765d c9765dM16519z;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7077a(event);
        C9763b c9763bM7082f = m7082f();
        if (c9763bM7082f == null || (c9765dM16519z = c9763bM7082f.m16519z()) == null || !c9765dM16519z.m16528g() || this.f8319n || this.f8314i != 1) {
            return;
        }
        this.f8314i = 2;
        if (m7198C()) {
            mo7097E(event);
        } else {
            mo7100H(event);
        }
        m7205r(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: b */
    public void mo7078b(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7078b(event);
        if (this.f8314i == 1) {
            mo7100H(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: c */
    public void mo7079c(EzyTouchEvent.TouchEvent event) {
        C9765d c9765dM16519z;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7079c(event);
        C9763b c9763bM7082f = m7082f();
        if (c9763bM7082f == null || (c9765dM16519z = c9763bM7082f.m16519z()) == null || !c9765dM16519z.m16528g() || this.f8314i != 2) {
            return;
        }
        this.f8314i = 0;
        m7207t(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: d */
    public void mo7080d(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7080d(event);
        int i9 = this.f8314i;
        if (i9 == 1) {
            mo7099G(event);
        } else {
            if (i9 != 2) {
                return;
            }
            m7206s(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: e */
    public void mo7081e(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM17344b;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7081e(event);
        if (this.f8314i == 2) {
            C9998a c9998aM7085i = m7085i();
            Matrix matrix = null;
            Matrix matrixM17344b2 = c9998aM7085i != null ? c9998aM7085i.m17344b() : null;
            m7207t(event);
            C9998a c9998aM7085i2 = m7085i();
            Matrix matrixM16200b = (c9998aM7085i2 == null || (matrixM17344b = c9998aM7085i2.m17344b()) == null) ? null : AbstractC9695n.m16200b(matrixM17344b);
            C9691j c9691j = C9691j.f17129a;
            if (matrixM17344b2 != null) {
                matrixM17344b2.postConcat(matrixM16200b);
                Unit unit = Unit.INSTANCE;
                matrix = matrixM17344b2;
            }
            event = c9691j.m16183c(event, matrix);
        }
        this.f8314i = 1;
        this.f8315j = System.currentTimeMillis();
        mo7098F(event);
    }

    /* renamed from: m */
    public final void m7200m(Float f10, Float f11) {
        if (!this.f8317l.isEmpty()) {
            m7212z(m7203p(f10, f11), Long.valueOf(System.currentTimeMillis()));
        }
        this.f8319n = false;
    }

    /* renamed from: n */
    public final void m7201n() {
        Matrix matrixM17346d;
        EzyMatrix.Matrix matrixM16201c;
        this.f8319n = true;
        m7197B();
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i != null && (matrixM17346d = c9998aM7085i.m17346d()) != null && (matrixM16201c = AbstractC9695n.m16201c(matrixM17346d, System.currentTimeMillis())) != null) {
            this.f8316k = matrixM16201c;
        }
        if (this.f8317l.isEmpty()) {
            return;
        }
        m7210x();
    }

    /* renamed from: o */
    public final void m7202o(Float f10, Float f11) {
        if (this.f8317l.isEmpty()) {
            return;
        }
        m7211y(m7203p(f10, f11), System.currentTimeMillis());
    }

    /* renamed from: p */
    public final Matrix m7203p(Float f10, Float f11) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            RectF rectF = this.f8318m;
            fValueOf = Float.valueOf(rectF.right - (fFloatValue * rectF.width()));
        } else {
            fValueOf = null;
        }
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            RectF rectF2 = this.f8318m;
            fValueOf2 = Float.valueOf(rectF2.bottom - (fFloatValue2 * rectF2.height()));
        }
        Matrix matrix = this.f8311f;
        matrix.reset();
        if (fValueOf != null) {
            matrix.postTranslate(fValueOf.floatValue(), 0.0f);
        }
        if (fValueOf2 != null) {
            matrix.postTranslate(0.0f, fValueOf2.floatValue());
        }
        Matrix matrix2 = new Matrix();
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        matrix2.postConcat(c9998aM7085i.m17347e());
        matrix2.postConcat(this.f8311f);
        C9998a c9998aM7085i2 = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i2);
        matrix2.postConcat(AbstractC9695n.m16200b(c9998aM7085i2.m17347e()));
        return matrix2;
    }

    /* renamed from: q */
    public final PointF m7204q(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: r */
    public final void m7205r(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM17346d;
        EzyMatrix.Matrix matrixM16201c;
        InterfaceC9476d interfaceC9476dMo16696o;
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h != null && (interfaceC9476dMo16696o = interfaceC9822bM7084h.mo16696o()) != null) {
            interfaceC9476dMo16696o.mo2224d();
        }
        this.f8313h.set(m7204q(m7195v(touchEvent.m9711z(0).getX(), touchEvent.m9711z(0).getY()), m7195v(touchEvent.m9711z(1).getX(), touchEvent.m9711z(1).getY())));
        m7197B();
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i != null && (matrixM17346d = c9998aM7085i.m17346d()) != null && (matrixM16201c = AbstractC9695n.m16201c(matrixM17346d, System.currentTimeMillis())) != null) {
            this.f8316k = matrixM16201c;
        }
        m7210x();
    }

    /* renamed from: s */
    public final void m7206s(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM7196A = m7196A(touchEvent);
        if (matrixM7196A != null) {
            m7211y(matrixM7196A, touchEvent.getEventTime());
        }
    }

    /* renamed from: t */
    public final void m7207t(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC9476d interfaceC9476dMo16696o;
        m7212z(m7196A(touchEvent), Long.valueOf(touchEvent.getEventTime()));
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h == null || (interfaceC9476dMo16696o = interfaceC9822bM7084h.mo16696o()) == null) {
            return;
        }
        interfaceC9476dMo16696o.mo2223c();
    }

    /* renamed from: u */
    public final float m7208u() {
        m7197B();
        if (this.f8317l.isEmpty() || this.f8318m.width() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.f8318m;
        return rectF.right / rectF.width();
    }

    /* renamed from: w */
    public final float m7209w() {
        m7197B();
        if (this.f8317l.isEmpty() || this.f8318m.height() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.f8318m;
        return rectF.bottom / rectF.height();
    }

    /* renamed from: x */
    public final void m7210x() {
        this.f8310e.clear();
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo211n();
        }
    }

    /* renamed from: y */
    public final void m7211y(Matrix matrix, long j9) {
        this.f8310e.add(AbstractC9695n.m16201c(matrix, j9));
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo214q(matrix);
        }
    }

    /* renamed from: z */
    public final void m7212z(Matrix matrix, Long l9) {
        Matrix matrix2;
        if (matrix != null) {
            ArrayList arrayList = this.f8310e;
            Intrinsics.checkNotNull(l9);
            arrayList.add(AbstractC9695n.m16201c(matrix, l9.longValue()));
        }
        if (this.f8310e.isEmpty()) {
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                InterfaceC0039c.a.m224a(interfaceC0039cM7083g, null, 1, null);
                return;
            }
            return;
        }
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo177D(AbstractC9695n.m16202d((EzyMatrix.Matrix) CollectionsKt.last((List) this.f8310e)));
        }
        C9690i.f17127a.m16179b(EventKey.DELETE_ACTION);
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h != null) {
            EzyMatrix.Matrix originMatrix = this.f8316k;
            Intrinsics.checkNotNullExpressionValue(originMatrix, "originMatrix");
            C9998a c9998aM7085i = m7085i();
            if (c9998aM7085i == null || (matrix2 = c9998aM7085i.m17346d()) == null) {
                matrix2 = new Matrix();
            }
            interfaceC9822bM7084h.mo16683b(originMatrix, AbstractC9695n.m16201c(matrix2, 0L), this.f8310e);
        }
    }
}
