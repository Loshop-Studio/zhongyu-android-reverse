package p322r9;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.core.action.BaseTouchAction;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10216d;
import na.AbstractC10351n;
import na.C10346i;
import na.C10352o;
import p307q9.C10762b;
import p307q9.C10764d;
import p325rc.AbstractC10947g0;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* renamed from: r9.d */
/* loaded from: classes5.dex */
public final class C10920d extends BaseTouchAction {

    /* renamed from: q */
    public static final a f26360q = new a(null);

    /* renamed from: k */
    public int f26367k;

    /* renamed from: p */
    public boolean f26372p;

    /* renamed from: e */
    public final PointF f26361e = new PointF();

    /* renamed from: f */
    public final PointF f26362f = new PointF();

    /* renamed from: g */
    public float f26363g = 1.0f;

    /* renamed from: h */
    public EzyMatrix.Matrix f26364h = EzyMatrix.Matrix.m15466p();

    /* renamed from: i */
    public final Matrix f26365i = new Matrix();

    /* renamed from: j */
    public final Matrix f26366j = new Matrix();

    /* renamed from: l */
    public final List f26368l = new ArrayList();

    /* renamed from: m */
    public final RectF f26369m = new RectF();

    /* renamed from: n */
    public final RectF f26370n = new RectF();

    /* renamed from: o */
    public float f26371o = 1.0f;

    /* renamed from: r9.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: A */
    private final Matrix m23786A(EzyTouchEvent.TouchEvent touchEvent) {
        PointF pointFM23791v;
        PointF pointF;
        float fWidth;
        Matrix matrix;
        Matrix matrix2;
        C10764d c10764dM22919z;
        C10764d c10764dM22919z2;
        C10764d c10764dM22919z3;
        int i10 = this.f26367k;
        if (i10 == 1) {
            this.f26365i.reset();
            pointFM23791v = m23791v(touchEvent.getX(), touchEvent.getY());
            pointF = this.f26361e;
        } else {
            if (i10 != 2) {
                return null;
            }
            this.f26365i.reset();
            PointF pointFM23791v2 = m23791v(touchEvent.m16337t(0).getX(), touchEvent.m16337t(0).getY());
            PointF pointFM23791v3 = m23791v(touchEvent.m16337t(1).getX(), touchEvent.m16337t(1).getY());
            C10762b c10762bM13724f = m13724f();
            if (c10762bM13724f != null && (c10764dM22919z3 = c10762bM13724f.m22919z()) != null && c10764dM22919z3.m22926e()) {
                float f10 = this.f26363g;
                float fMax = (Float.isInfinite(f10) || Float.isNaN(f10) || this.f26363g <= 1.0E-4f) ? 1.0f : Float.max(m23807q(pointFM23791v2, pointFM23791v3) / this.f26363g, this.f26371o);
                if (!Float.isInfinite(fMax) && !Float.isNaN(fMax) && fMax > 1.0E-4f) {
                    Matrix matrix3 = this.f26365i;
                    PointF pointF2 = this.f26362f;
                    matrix3.postScale(fMax, fMax, pointF2.x, pointF2.y);
                }
                m23795B(this.f26365i);
            }
            pointFM23791v = m23790s(pointFM23791v2, pointFM23791v3);
            pointF = this.f26362f;
        }
        C10762b c10762bM13724f2 = m13724f();
        float f11 = 0.0f;
        if (c10762bM13724f2 == null || (c10764dM22919z2 = c10762bM13724f2.m22919z()) == null || !c10764dM22919z2.m22922a()) {
            fWidth = 0.0f;
        } else {
            RectF rectF = this.f26370n;
            fWidth = rectF.left;
            float f12 = rectF.right;
            if (fWidth > f12) {
                InterfaceC11552c interfaceC11552cM13725g = m13725g();
                AbstractC9979u.m20291d(interfaceC11552cM13725g);
                fWidth = ((interfaceC11552cM13725g.mo25457q().width() - this.f26369m.width()) / 2) - this.f26369m.left;
            } else {
                float f13 = pointFM23791v.x - pointF.x;
                if (f13 >= fWidth) {
                    fWidth = f13 > f12 ? f12 : f13;
                }
            }
            this.f26365i.postTranslate(fWidth, 0.0f);
        }
        C10762b c10762bM13724f3 = m13724f();
        if (c10762bM13724f3 != null && (c10764dM22919z = c10762bM13724f3.m22919z()) != null && c10764dM22919z.m22927f()) {
            RectF rectF2 = this.f26370n;
            float fHeight = rectF2.top;
            float f14 = rectF2.bottom;
            if (fHeight > f14) {
                InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
                AbstractC9979u.m20291d(interfaceC11552cM13725g2);
                fHeight = ((interfaceC11552cM13725g2.mo25457q().height() - this.f26369m.height()) / 2) - this.f26369m.top;
            } else {
                float f15 = pointFM23791v.y - pointF.y;
                if (f15 >= fHeight) {
                    fHeight = f15 > f14 ? f14 : f15;
                }
            }
            this.f26365i.postTranslate(0.0f, fHeight);
            f11 = fHeight;
        }
        m23788H(fWidth, f11);
        Matrix matrix4 = new Matrix();
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i == null || (matrix = c11373aM13727i.m25314e()) == null) {
            matrix = new Matrix();
        }
        matrix4.postConcat(matrix);
        matrix4.postConcat(this.f26365i);
        C11373a c11373aM13727i2 = m13727i();
        if (c11373aM13727i2 == null || (matrix2 = c11373aM13727i2.m25314e()) == null) {
            matrix2 = new Matrix();
        }
        matrix4.postConcat(AbstractC10351n.m21660b(matrix2));
        return matrix4;
    }

    /* renamed from: C */
    public static /* synthetic */ void m23787C(C10920d c10920d, Matrix matrix, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = null;
        }
        c10920d.m23795B(matrix);
    }

    /* renamed from: H */
    private final void m23788H(float f10, float f11) {
        float fWidth;
        InterfaceC10216d interfaceC10216dMo23776p;
        C10764d c10764dM22919z;
        C10764d c10764dM22919z2;
        if (this.f26369m.isEmpty()) {
            return;
        }
        float fHeight = 0.0f;
        if (this.f26370n.width() > 0.0f) {
            RectF rectF = this.f26370n;
            fWidth = (rectF.right - f10) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.f26370n.height() > 0.0f) {
            RectF rectF2 = this.f26370n;
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

    /* renamed from: r */
    private final Matrix m23789r(Float f10, Float f11) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            RectF rectF = this.f26370n;
            fValueOf = Float.valueOf(rectF.right - (fFloatValue * rectF.width()));
        } else {
            fValueOf = null;
        }
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            RectF rectF2 = this.f26370n;
            fValueOf2 = Float.valueOf(rectF2.bottom - (fFloatValue2 * rectF2.height()));
        }
        Matrix matrix = this.f26365i;
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
        matrix2.postConcat(this.f26365i);
        C11373a c11373aM13727i2 = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i2);
        matrix2.postConcat(AbstractC10351n.m21660b(c11373aM13727i2.m25314e()));
        return matrix2;
    }

    /* renamed from: s */
    private final PointF m23790s(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: v */
    private final PointF m23791v(float f10, float f11) {
        if (m13727i() == null) {
            return new PointF(f10, f11);
        }
        C10352o c10352o = C10352o.f24660a;
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        return c10352o.m21671d(f10, f11, c11373aM13727i.m25311b());
    }

    /* renamed from: x */
    private final void m23792x() {
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25455o();
        }
        this.f26368l.clear();
    }

    /* renamed from: y */
    private final void m23793y(Matrix matrix, long j10) {
        if (AbstractC10351n.m21661c(matrix)) {
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25458r(matrix);
            }
            m23803m(matrix, j10);
        }
    }

    /* renamed from: z */
    private final void m23794z(Matrix matrix, Long l10) {
        if (matrix != null) {
            m23803m(matrix, l10 != null ? l10.longValue() : System.currentTimeMillis());
        }
        if (this.f26368l.isEmpty()) {
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                InterfaceC11552c.a.m25467a(interfaceC11552cM13725g, null, 1, null);
                return;
            }
            return;
        }
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25418D(AbstractC10351n.m21665g((EzyMatrix.Matrix) AbstractC10947g0.m23956y0(this.f26368l)));
        }
        m23801J();
    }

    /* renamed from: B */
    public final void m23795B(Matrix matrix) {
        Matrix matrix2;
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        AbstractC9979u.m20291d(interfaceC11552cM13725g);
        RectF rectFMo25421G = interfaceC11552cM13725g.mo25421G();
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        AbstractC9979u.m20291d(interfaceC11552cM13725g2);
        RectF rectFMo25457q = interfaceC11552cM13725g2.mo25457q();
        if (rectFMo25421G.isEmpty()) {
            rectFMo25421G = new RectF(rectFMo25457q);
        }
        C10762b c10762bM13724f = m13724f();
        AbstractC9979u.m20291d(c10762bM13724f);
        C10764d c10764dM22919z = c10762bM13724f.m22919z();
        if (c10764dM22919z.m22923b() < 1 || c10764dM22919z.m22924c() < 1) {
            this.f26369m.setEmpty();
            return;
        }
        this.f26369m.set(0.0f, 0.0f, rectFMo25421G.width() * c10764dM22919z.m22924c(), rectFMo25421G.height() * c10764dM22919z.m22923b());
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i == null || (matrix2 = c11373aM13727i.m25311b()) == null) {
            matrix2 = new Matrix();
        }
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(this.f26369m);
        RectF rectF = this.f26370n;
        float f10 = rectFMo25457q.right;
        RectF rectF2 = this.f26369m;
        rectF.set(f10 - rectF2.right, rectFMo25457q.bottom - rectF2.bottom, rectFMo25457q.left - rectF2.left, rectFMo25457q.top - rectF2.top);
        if (matrix == null) {
            this.f26371o = Math.min(rectFMo25457q.width() / this.f26369m.width(), rectFMo25457q.height() / this.f26369m.height());
        }
        Log.i("MoveAction", "configRectF -> " + this.f26369m);
        Log.i("MoveAction", "limitRenderRectF -> " + this.f26370n);
    }

    /* renamed from: D */
    public final void m23796D() {
        Matrix matrixM25313d;
        C11373a c11373aM13727i = m13727i();
        this.f26364h = (c11373aM13727i == null || (matrixM25313d = c11373aM13727i.m25313d()) == null) ? null : AbstractC10351n.m21664f(matrixM25313d, System.currentTimeMillis());
    }

    /* renamed from: E */
    public final void m23797E(EzyTouchEvent.TouchEvent touchEvent) {
        PointF pointFM23791v = m23791v(touchEvent.m16337t(0).getX(), touchEvent.m16337t(0).getY());
        PointF pointFM23791v2 = m23791v(touchEvent.m16337t(1).getX(), touchEvent.m16337t(1).getY());
        this.f26362f.set(m23790s(pointFM23791v, pointFM23791v2));
        this.f26363g = m23807q(pointFM23791v, pointFM23791v2);
    }

    /* renamed from: F */
    public final void m23798F(EzyTouchEvent.TouchEvent touchEvent) {
        this.f26361e.set(m23791v(touchEvent.getX(), touchEvent.getY()));
    }

    /* renamed from: G */
    public final void m23799G() {
        C10346i c10346i = C10346i.f24652a;
        c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
    }

    /* renamed from: I */
    public void m23800I() {
        this.f26365i.reset();
        this.f26368l.clear();
        this.f26367k = 0;
        this.f26361e.set(0.0f, 0.0f);
        this.f26363g = 1.0f;
        this.f26362f.set(0.0f, 0.0f);
    }

    /* renamed from: J */
    public final void m23801J() {
        Matrix matrix;
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h != null) {
            EzyMatrix.Matrix originMatrix = this.f26364h;
            AbstractC9979u.m20293f(originMatrix, "originMatrix");
            C11373a c11373aM13727i = m13727i();
            if (c11373aM13727i == null || (matrix = c11373aM13727i.m25313d()) == null) {
                matrix = new Matrix();
            }
            interfaceC10918bM13726h.mo23762b(originMatrix, AbstractC10351n.m21664f(matrix, 0L), this.f26368l);
        }
    }

    /* renamed from: K */
    public final void m23802K(boolean z10) {
        this.f26372p = z10;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: a */
    public void mo13719a(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.mo13719a(event);
        this.f26367k = 2;
        if (m23808t()) {
            m23797E(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: b */
    public void mo13720b(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.mo13720b(event);
        this.f26367k = 0;
        if (m23808t()) {
            m23794z(m23786A(event), Long.valueOf(event.getEventTime()));
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: c */
    public void mo13721c(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.mo13721c(event);
        this.f26367k = 0;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: d */
    public void mo13722d(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM23786A;
        AbstractC9979u.m20294g(event, "event");
        super.mo13722d(event);
        if (m23808t() && (matrixM23786A = m23786A(event)) != null) {
            m23793y(matrixM23786A, event.getEventTime());
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p322r9.InterfaceC10919c
    /* renamed from: e */
    public void mo13723e(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.mo13723e(event);
        this.f26367k = 1;
        if (m23808t()) {
            m23799G();
            m23787C(this, null, 1, null);
            m23798F(event);
            m23796D();
            m23792x();
        }
    }

    /* renamed from: m */
    public final void m23803m(Matrix matrix, long j10) {
        if (AbstractC10351n.m21661c(matrix)) {
            this.f26368l.add(AbstractC10351n.m21664f(matrix, j10));
        }
    }

    /* renamed from: n */
    public final void m23804n(Float f10, Float f11) {
        if (this.f26369m.isEmpty()) {
            return;
        }
        m23794z(m23789r(f10, f11), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: o */
    public final void m23805o() {
        m23787C(this, null, 1, null);
        if (this.f26369m.isEmpty()) {
            return;
        }
        m23792x();
    }

    /* renamed from: p */
    public final void m23806p(Float f10, Float f11) {
        if (this.f26369m.isEmpty()) {
            return;
        }
        m23793y(m23789r(f10, f11), System.currentTimeMillis());
    }

    /* renamed from: q */
    public final float m23807q(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    /* renamed from: t */
    public final boolean m23808t() {
        C10762b c10762bM13724f;
        C10764d c10764dM22919z;
        return (this.f26372p || (c10762bM13724f = m13724f()) == null || (c10764dM22919z = c10762bM13724f.m22919z()) == null || !c10764dM22919z.m22928g()) ? false : true;
    }

    /* renamed from: u */
    public final float m23809u() {
        m23787C(this, null, 1, null);
        RectF rectF = this.f26370n;
        float f10 = rectF.right;
        if (f10 > rectF.left) {
            return f10 / rectF.width();
        }
        return 0.0f;
    }

    /* renamed from: w */
    public final float m23810w() {
        m23787C(this, null, 1, null);
        RectF rectF = this.f26370n;
        float f10 = rectF.bottom;
        if (f10 > rectF.top) {
            return f10 / rectF.height();
        }
        return 0.0f;
    }
}
