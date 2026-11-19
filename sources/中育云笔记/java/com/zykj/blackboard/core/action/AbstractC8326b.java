package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10216d;
import na.AbstractC10351n;
import na.C10346i;
import na.C10347j;
import na.C10352o;
import p307q9.C10762b;
import p307q9.C10764d;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* renamed from: com.zykj.blackboard.core.action.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8326b extends BaseTouchAction {

    /* renamed from: o */
    public static final a f17874o = new a(null);

    /* renamed from: i */
    public int f17879i;

    /* renamed from: j */
    public long f17880j;

    /* renamed from: n */
    public boolean f17884n;

    /* renamed from: e */
    public final ArrayList f17875e = new ArrayList();

    /* renamed from: f */
    public final Matrix f17876f = new Matrix();

    /* renamed from: g */
    public final Matrix f17877g = new Matrix();

    /* renamed from: h */
    public final PointF f17878h = new PointF();

    /* renamed from: k */
    public EzyMatrix.Matrix f17881k = EzyMatrix.Matrix.m15466p();

    /* renamed from: l */
    public final RectF f17882l = new RectF();

    /* renamed from: m */
    public final RectF f17883m = new RectF();

    /* renamed from: com.zykj.blackboard.core.action.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: v */
    private final PointF m13836v(float f10, float f11) {
        if (m13727i() == null) {
            return new PointF(f10, f11);
        }
        C10352o c10352o = C10352o.f24660a;
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        return c10352o.m21671d(f10, f11, c11373aM13727i.m25311b());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix m13837A(com.zykj.board.EzyTouchEvent.TouchEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getPointerCoordsCount()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            return r1
        L9:
            q9.b r0 = r8.m13724f()
            if (r0 == 0) goto Ld9
            q9.d r0 = r0.m22919z()
            if (r0 == 0) goto Ld9
            r3 = 0
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m16337t(r3)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r3 = r9.m16337t(r3)
            float r3 = r3.getY()
            android.graphics.PointF r3 = r8.m13836v(r4, r3)
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m16337t(r2)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r9 = r9.m16337t(r2)
            float r9 = r9.getY()
            android.graphics.PointF r9 = r8.m13836v(r4, r9)
            android.graphics.Matrix r2 = r8.f17876f
            r2.reset()
            boolean r2 = r0.m22922a()
            r4 = 0
            if (r2 == 0) goto L76
            android.graphics.RectF r2 = r8.f17883m
            float r5 = r2.left
            float r2 = r2.right
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L76
            android.graphics.PointF r1 = r8.m13845q(r3, r9)
            float r2 = r1.x
            android.graphics.PointF r5 = r8.f17878h
            float r5 = r5.x
            float r2 = r2 - r5
            android.graphics.RectF r5 = r8.f17883m
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
            android.graphics.Matrix r5 = r8.f17876f
            r5.postTranslate(r2, r4)
            goto L77
        L76:
            r2 = r4
        L77:
            boolean r0 = r0.m22927f()
            if (r0 == 0) goto Lab
            android.graphics.RectF r0 = r8.f17883m
            float r5 = r0.top
            float r0 = r0.bottom
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lab
            if (r1 != 0) goto L8d
            android.graphics.PointF r1 = r8.m13845q(r3, r9)
        L8d:
            float r9 = r1.y
            android.graphics.PointF r0 = r8.f17878h
            float r0 = r0.y
            float r9 = r9 - r0
            android.graphics.RectF r0 = r8.f17883m
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
            android.graphics.Matrix r0 = r8.f17876f
            r0.postTranslate(r4, r9)
            r4 = r9
        Lab:
            r8.m13840D(r2, r4)
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            u9.a r0 = r8.m13727i()
            kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
            android.graphics.Matrix r0 = r0.m25314e()
            r9.postConcat(r0)
            android.graphics.Matrix r0 = r8.f17876f
            r9.postConcat(r0)
            u9.a r0 = r8.m13727i()
            kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
            android.graphics.Matrix r0 = r0.m25314e()
            android.graphics.Matrix r0 = na.AbstractC10351n.m21660b(r0)
            r9.postConcat(r0)
            return r9
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.AbstractC8326b.m13837A(com.zykj.board.EzyTouchEvent$TouchEvent):android.graphics.Matrix"); // DEX body: android/中育云笔记/smali_classes5/com/zykj/blackboard/core/action/b.smali:224
    }

    /* renamed from: B */
    public final void m13838B() {
        Matrix matrix;
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        AbstractC9979u.m20291d(interfaceC11552cM13725g);
        RectF rectFMo25457q = interfaceC11552cM13725g.mo25457q();
        C10762b c10762bM13724f = m13724f();
        AbstractC9979u.m20291d(c10762bM13724f);
        C10764d c10764dM22919z = c10762bM13724f.m22919z();
        if (c10764dM22919z.m22923b() < 1 || c10764dM22919z.m22924c() < 1) {
            this.f17882l.setEmpty();
            return;
        }
        this.f17882l.set(0.0f, 0.0f, rectFMo25457q.width() * c10764dM22919z.m22924c(), rectFMo25457q.height() * c10764dM22919z.m22923b());
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i == null || (matrix = c11373aM13727i.m25313d()) == null) {
            matrix = new Matrix();
        }
        matrix.mapRect(this.f17882l);
        RectF rectF = this.f17883m;
        float f10 = rectFMo25457q.right;
        RectF rectF2 = this.f17882l;
        rectF.set(f10 - rectF2.right, rectFMo25457q.bottom - rectF2.bottom, rectFMo25457q.left - rectF2.left, rectFMo25457q.top - rectF2.top);
        Log.i("MoveAction", "configRectF -> " + this.f17882l);
        Log.i("MoveAction", "limitRenderRectF -> " + this.f17883m);
    }

    /* renamed from: C */
    public final boolean m13839C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17880j;
        Log.i("MoveAction", "time -> " + jCurrentTimeMillis);
        return jCurrentTimeMillis <= 48;
    }

    /* renamed from: D */
    public final void m13840D(float f10, float f11) {
        float fWidth;
        InterfaceC10216d interfaceC10216dMo23776p;
        C10764d c10764dM22919z;
        C10764d c10764dM22919z2;
        if (this.f17882l.isEmpty()) {
            return;
        }
        Log.i("MoveAction", "horizontal->" + f10 + "  vertical->" + f11);
        float fHeight = 0.0f;
        if (this.f17883m.width() > 0.0f) {
            RectF rectF = this.f17883m;
            fWidth = (rectF.right - f10) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.f17883m.height() > 0.0f) {
            RectF rectF2 = this.f17883m;
            fHeight = (rectF2.bottom - f11) / rectF2.height();
        }
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h == null || (interfaceC10216dMo23776p = interfaceC10918bM13726h.mo23776p()) == null) {
            return;
        }
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f != null && (c10764dM22919z2 = c10762bM13724f.m22919z()) != null && c10764dM22919z2.m22922a()) {
            interfaceC10216dMo23776p.mo17143a(fWidth);
        }
        C10762b c10762bM13724f2 = m13724f();
        if (c10762bM13724f2 == null || (c10764dM22919z = c10762bM13724f2.m22919z()) == null || !c10764dM22919z.m22927f()) {
            return;
        }
        interfaceC10216dMo23776p.mo17144b(fHeight);
    }

    /* renamed from: E */
    public abstract void mo13739E(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: F */
    public abstract void mo13740F(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: G */
    public abstract void mo13741G(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: H */
    public abstract void mo13742H(EzyTouchEvent.TouchEvent touchEvent);

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: a */
    public void mo13719a(EzyTouchEvent.TouchEvent event) {
        C10764d c10764dM22919z;
        AbstractC9979u.m20294g(event, "event");
        super.mo13719a(event);
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f == null || (c10764dM22919z = c10762bM13724f.m22919z()) == null || !c10764dM22919z.m22928g() || this.f17884n || this.f17879i != 1) {
            return;
        }
        this.f17879i = 2;
        if (m13839C()) {
            mo13739E(event);
        } else {
            mo13742H(event);
        }
        m13846r(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: b */
    public void mo13720b(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.mo13720b(event);
        if (this.f17879i == 1) {
            mo13742H(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: c */
    public void mo13721c(EzyTouchEvent.TouchEvent event) {
        C10764d c10764dM22919z;
        AbstractC9979u.m20294g(event, "event");
        super.mo13721c(event);
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f == null || (c10764dM22919z = c10762bM13724f.m22919z()) == null || !c10764dM22919z.m22928g() || this.f17879i != 2) {
            return;
        }
        this.f17879i = 0;
        m13848t(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: d */
    public void mo13722d(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.mo13722d(event);
        int i10 = this.f17879i;
        if (i10 == 1) {
            mo13741G(event);
        } else {
            if (i10 != 2) {
                return;
            }
            m13847s(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: e */
    public void mo13723e(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM25311b;
        AbstractC9979u.m20294g(event, "event");
        super.mo13723e(event);
        if (this.f17879i == 2) {
            C11373a c11373aM13727i = m13727i();
            Matrix matrix = null;
            Matrix matrixM25311b2 = c11373aM13727i != null ? c11373aM13727i.m25311b() : null;
            m13848t(event);
            C11373a c11373aM13727i2 = m13727i();
            Matrix matrixM21660b = (c11373aM13727i2 == null || (matrixM25311b = c11373aM13727i2.m25311b()) == null) ? null : AbstractC10351n.m21660b(matrixM25311b);
            C10347j c10347j = C10347j.f24654a;
            if (matrixM25311b2 != null) {
                matrixM25311b2.postConcat(matrixM21660b);
                C10786q c10786q = C10786q.f26013a;
                matrix = matrixM25311b2;
            }
            event = c10347j.m21644c(event, matrix);
        }
        this.f17879i = 1;
        this.f17880j = System.currentTimeMillis();
        mo13740F(event);
    }

    /* renamed from: m */
    public final void m13841m(Float f10, Float f11) {
        if (!this.f17882l.isEmpty()) {
            m13853z(m13844p(f10, f11), Long.valueOf(System.currentTimeMillis()));
        }
        this.f17884n = false;
    }

    /* renamed from: n */
    public final void m13842n() {
        Matrix matrixM25313d;
        EzyMatrix.Matrix matrixM21664f;
        this.f17884n = true;
        m13838B();
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i != null && (matrixM25313d = c11373aM13727i.m25313d()) != null && (matrixM21664f = AbstractC10351n.m21664f(matrixM25313d, System.currentTimeMillis())) != null) {
            this.f17881k = matrixM21664f;
        }
        if (this.f17882l.isEmpty()) {
            return;
        }
        m13851x();
    }

    /* renamed from: o */
    public final void m13843o(Float f10, Float f11) {
        if (this.f17882l.isEmpty()) {
            return;
        }
        m13852y(m13844p(f10, f11), System.currentTimeMillis());
    }

    /* renamed from: p */
    public final Matrix m13844p(Float f10, Float f11) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            RectF rectF = this.f17883m;
            fValueOf = Float.valueOf(rectF.right - (fFloatValue * rectF.width()));
        } else {
            fValueOf = null;
        }
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            RectF rectF2 = this.f17883m;
            fValueOf2 = Float.valueOf(rectF2.bottom - (fFloatValue2 * rectF2.height()));
        }
        Matrix matrix = this.f17876f;
        matrix.reset();
        if (fValueOf != null) {
            matrix.postTranslate(fValueOf.floatValue(), 0.0f);
        }
        if (fValueOf2 != null) {
            matrix.postTranslate(0.0f, fValueOf2.floatValue());
        }
        Matrix matrix2 = new Matrix();
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        matrix2.postConcat(c11373aM13727i.m25314e());
        matrix2.postConcat(this.f17876f);
        C11373a c11373aM13727i2 = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i2);
        matrix2.postConcat(AbstractC10351n.m21660b(c11373aM13727i2.m25314e()));
        return matrix2;
    }

    /* renamed from: q */
    public final PointF m13845q(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: r */
    public final void m13846r(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM25313d;
        EzyMatrix.Matrix matrixM21664f;
        InterfaceC10216d interfaceC10216dMo23776p;
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h != null && (interfaceC10216dMo23776p = interfaceC10918bM13726h.mo23776p()) != null) {
            interfaceC10216dMo23776p.mo17146d();
        }
        this.f17878h.set(m13845q(m13836v(touchEvent.m16337t(0).getX(), touchEvent.m16337t(0).getY()), m13836v(touchEvent.m16337t(1).getX(), touchEvent.m16337t(1).getY())));
        m13838B();
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i != null && (matrixM25313d = c11373aM13727i.m25313d()) != null && (matrixM21664f = AbstractC10351n.m21664f(matrixM25313d, System.currentTimeMillis())) != null) {
            this.f17881k = matrixM21664f;
        }
        m13851x();
    }

    /* renamed from: s */
    public final void m13847s(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM13837A = m13837A(touchEvent);
        if (matrixM13837A != null) {
            m13852y(matrixM13837A, touchEvent.getEventTime());
        }
    }

    /* renamed from: t */
    public final void m13848t(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC10216d interfaceC10216dMo23776p;
        m13853z(m13837A(touchEvent), Long.valueOf(touchEvent.getEventTime()));
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h == null || (interfaceC10216dMo23776p = interfaceC10918bM13726h.mo23776p()) == null) {
            return;
        }
        interfaceC10216dMo23776p.mo17145c();
    }

    /* renamed from: u */
    public final float m13849u() {
        m13838B();
        if (this.f17882l.isEmpty() || this.f17883m.width() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.f17883m;
        return rectF.right / rectF.width();
    }

    /* renamed from: w */
    public final float m13850w() {
        m13838B();
        if (this.f17882l.isEmpty() || this.f17883m.height() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.f17883m;
        return rectF.bottom / rectF.height();
    }

    /* renamed from: x */
    public final void m13851x() {
        this.f17875e.clear();
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25455o();
        }
    }

    /* renamed from: y */
    public final void m13852y(Matrix matrix, long j10) {
        if (AbstractC10351n.m21661c(matrix)) {
            this.f17875e.add(AbstractC10351n.m21664f(matrix, j10));
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25458r(matrix);
            }
        }
    }

    /* renamed from: z */
    public final void m13853z(Matrix matrix, Long l10) {
        Matrix matrix2;
        if (matrix != null && AbstractC10351n.m21661c(matrix)) {
            ArrayList arrayList = this.f17875e;
            AbstractC9979u.m20291d(l10);
            arrayList.add(AbstractC10351n.m21664f(matrix, l10.longValue()));
        }
        if (this.f17875e.isEmpty()) {
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                InterfaceC11552c.a.m25467a(interfaceC11552cM13725g, null, 1, null);
                return;
            }
            return;
        }
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25418D(AbstractC10351n.m21665g((EzyMatrix.Matrix) AbstractC10947g0.m23956y0(this.f17875e)));
        }
        C10346i.f24652a.m21640b(EventKey.DELETE_ACTION);
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h != null) {
            EzyMatrix.Matrix originMatrix = this.f17881k;
            AbstractC9979u.m20293f(originMatrix, "originMatrix");
            C11373a c11373aM13727i = m13727i();
            if (c11373aM13727i == null || (matrix2 = c11373aM13727i.m25313d()) == null) {
                matrix2 = new Matrix();
            }
            interfaceC10918bM13726h.mo23762b(originMatrix, AbstractC10351n.m21664f(matrix2, 0L), this.f17875e);
        }
    }
}
