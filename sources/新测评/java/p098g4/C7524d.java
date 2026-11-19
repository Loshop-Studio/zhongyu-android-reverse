package p098g4;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.BaseTouchAction;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5121d;
import p077e5.AbstractC7352m;
import p077e5.C7347h;
import p077e5.C7353n;
import p087f4.C7438c;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;

/* renamed from: g4.d */
/* loaded from: classes4.dex */
public final class C7524d extends BaseTouchAction {

    /* renamed from: q */
    public static final a f12396q = new a(null);

    /* renamed from: k */
    public int f12403k;

    /* renamed from: p */
    public boolean f12408p;

    /* renamed from: e */
    public final PointF f12397e = new PointF();

    /* renamed from: f */
    public final PointF f12398f = new PointF();

    /* renamed from: g */
    public float f12399g = 1.0f;

    /* renamed from: h */
    public EzyMatrix.Matrix f12400h = EzyMatrix.Matrix.m7721u();

    /* renamed from: i */
    public final Matrix f12401i = new Matrix();

    /* renamed from: j */
    public final Matrix f12402j = new Matrix();

    /* renamed from: l */
    public final List f12404l = new ArrayList();

    /* renamed from: m */
    public final RectF f12405m = new RectF();

    /* renamed from: n */
    public final RectF f12406n = new RectF();

    /* renamed from: o */
    public float f12407o = 1.0f;

    /* renamed from: g4.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: A */
    private final Matrix m12263A(EzyTouchEvent.TouchEvent touchEvent) {
        PointF pointFM12268v;
        PointF pointF;
        float fWidth;
        Matrix matrix;
        Matrix matrix2;
        C7438c moveActionConfig;
        C7438c moveActionConfig2;
        C7438c moveActionConfig3;
        int i10 = this.f12403k;
        if (i10 == 1) {
            this.f12401i.reset();
            pointFM12268v = m12268v(touchEvent.getX(), touchEvent.getY());
            pointF = this.f12397e;
        } else {
            if (i10 != 2) {
                return null;
            }
            this.f12401i.reset();
            PointF pointFM12268v2 = m12268v(touchEvent.m8550w(0).getX(), touchEvent.m8550w(0).getY());
            PointF pointFM12268v3 = m12268v(touchEvent.m8550w(1).getX(), touchEvent.m8550w(1).getY());
            BoardConfig boardConfigM5987f = m5987f();
            if (boardConfigM5987f != null && (moveActionConfig3 = boardConfigM5987f.getMoveActionConfig()) != null && moveActionConfig3.m11997e()) {
                float fMax = Float.max(m12284q(pointFM12268v2, pointFM12268v3) / this.f12399g, this.f12407o);
                Matrix matrix3 = this.f12401i;
                PointF pointF2 = this.f12398f;
                matrix3.postScale(fMax, fMax, pointF2.x, pointF2.y);
                m12272B(this.f12401i);
            }
            pointFM12268v = m12267s(pointFM12268v2, pointFM12268v3);
            pointF = this.f12398f;
        }
        BoardConfig boardConfigM5987f2 = m5987f();
        float f10 = 0.0f;
        if (boardConfigM5987f2 == null || (moveActionConfig2 = boardConfigM5987f2.getMoveActionConfig()) == null || !moveActionConfig2.m11993a()) {
            fWidth = 0.0f;
        } else {
            RectF rectF = this.f12406n;
            fWidth = rectF.left;
            float f11 = rectF.right;
            if (fWidth > f11) {
                InterfaceC7880c interfaceC7880cM5988g = m5988g();
                Intrinsics.checkNotNull(interfaceC7880cM5988g);
                fWidth = ((interfaceC7880cM5988g.mo13453r().width() - this.f12405m.width()) / 2) - this.f12405m.left;
            } else {
                float f12 = pointFM12268v.x - pointF.x;
                if (f12 >= fWidth) {
                    fWidth = f12 > f11 ? f11 : f12;
                }
            }
            this.f12401i.postTranslate(fWidth, 0.0f);
        }
        BoardConfig boardConfigM5987f3 = m5987f();
        if (boardConfigM5987f3 != null && (moveActionConfig = boardConfigM5987f3.getMoveActionConfig()) != null && moveActionConfig.m11998f()) {
            RectF rectF2 = this.f12406n;
            float fHeight = rectF2.top;
            float f13 = rectF2.bottom;
            if (fHeight > f13) {
                InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
                Intrinsics.checkNotNull(interfaceC7880cM5988g2);
                fHeight = ((interfaceC7880cM5988g2.mo13453r().height() - this.f12405m.height()) / 2) - this.f12405m.top;
            } else {
                float f14 = pointFM12268v.y - pointF.y;
                if (f14 >= fHeight) {
                    fHeight = f14 > f13 ? f13 : f14;
                }
            }
            this.f12401i.postTranslate(0.0f, fHeight);
            f10 = fHeight;
        }
        m12265H(fWidth, f10);
        Matrix matrix4 = new Matrix();
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i == null || (matrix = c7792aM5990i.m13191e()) == null) {
            matrix = new Matrix();
        }
        matrix4.postConcat(matrix);
        matrix4.postConcat(this.f12401i);
        C7792a c7792aM5990i2 = m5990i();
        if (c7792aM5990i2 == null || (matrix2 = c7792aM5990i2.m13191e()) == null) {
            matrix2 = new Matrix();
        }
        matrix4.postConcat(AbstractC7352m.m11777b(matrix2));
        return matrix4;
    }

    /* renamed from: C */
    public static /* synthetic */ void m12264C(C7524d c7524d, Matrix matrix, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = null;
        }
        c7524d.m12272B(matrix);
    }

    /* renamed from: H */
    private final void m12265H(float f10, float f11) {
        float fWidth;
        InterfaceC5121d interfaceC5121dMo12250o;
        C7438c moveActionConfig;
        C7438c moveActionConfig2;
        if (this.f12405m.isEmpty()) {
            return;
        }
        float fHeight = 0.0f;
        if (this.f12406n.width() > 0.0f) {
            RectF rectF = this.f12406n;
            fWidth = (rectF.right - f10) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.f12406n.height() > 0.0f) {
            RectF rectF2 = this.f12406n;
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

    /* renamed from: r */
    private final Matrix m12266r(Float f10, Float f11) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            RectF rectF = this.f12406n;
            fValueOf = Float.valueOf(rectF.right - (fFloatValue * rectF.width()));
        } else {
            fValueOf = null;
        }
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            RectF rectF2 = this.f12406n;
            fValueOf2 = Float.valueOf(rectF2.bottom - (fFloatValue2 * rectF2.height()));
        }
        Matrix matrix = this.f12401i;
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
        matrix2.postConcat(this.f12401i);
        C7792a c7792aM5990i2 = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i2);
        matrix2.postConcat(AbstractC7352m.m11777b(c7792aM5990i2.m13191e()));
        return matrix2;
    }

    /* renamed from: s */
    private final PointF m12267s(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: v */
    private final PointF m12268v(float f10, float f11) {
        if (m5990i() == null) {
            return new PointF(f10, f11);
        }
        C7353n c7353n = C7353n.f11920a;
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        return c7353n.m11783d(f10, f11, c7792aM5990i.m13188b());
    }

    /* renamed from: x */
    private final void m12269x() {
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13450o();
        }
        this.f12404l.clear();
    }

    /* renamed from: y */
    private final void m12270y(Matrix matrix, long j10) {
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13454s(matrix);
        }
        m12280m(matrix, j10);
    }

    /* renamed from: z */
    private final void m12271z(Matrix matrix, Long l10) {
        if (matrix != null) {
            this.f12404l.add(AbstractC7352m.m11778c(matrix, l10 != null ? l10.longValue() : System.currentTimeMillis()));
        }
        if (this.f12404l.isEmpty()) {
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                InterfaceC7880c.a.m13462a(interfaceC7880cM5988g, null, 1, null);
                return;
            }
            return;
        }
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13417D(AbstractC7352m.m11779d((EzyMatrix.Matrix) CollectionsKt.last(this.f12404l)));
        }
        m12278J();
    }

    /* renamed from: B */
    public final void m12272B(Matrix matrix) {
        Matrix matrix2;
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        Intrinsics.checkNotNull(interfaceC7880cM5988g);
        RectF rectFMo13420G = interfaceC7880cM5988g.mo13420G();
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        Intrinsics.checkNotNull(interfaceC7880cM5988g2);
        RectF rectFMo13453r = interfaceC7880cM5988g2.mo13453r();
        if (rectFMo13420G.isEmpty()) {
            rectFMo13420G = new RectF(rectFMo13453r);
        }
        BoardConfig boardConfigM5987f = m5987f();
        Intrinsics.checkNotNull(boardConfigM5987f);
        C7438c moveActionConfig = boardConfigM5987f.getMoveActionConfig();
        if (moveActionConfig.m11994b() < 1 || moveActionConfig.m11995c() < 1) {
            this.f12405m.setEmpty();
            return;
        }
        this.f12405m.set(0.0f, 0.0f, rectFMo13420G.width() * moveActionConfig.m11995c(), rectFMo13420G.height() * moveActionConfig.m11994b());
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i == null || (matrix2 = c7792aM5990i.m13188b()) == null) {
            matrix2 = new Matrix();
        }
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(this.f12405m);
        RectF rectF = this.f12406n;
        float f10 = rectFMo13453r.right;
        RectF rectF2 = this.f12405m;
        rectF.set(f10 - rectF2.right, rectFMo13453r.bottom - rectF2.bottom, rectFMo13453r.left - rectF2.left, rectFMo13453r.top - rectF2.top);
        if (matrix == null) {
            this.f12407o = Math.min(rectFMo13453r.width() / this.f12405m.width(), rectFMo13453r.height() / this.f12405m.height());
        }
        Log.i("MoveAction", "configRectF -> " + this.f12405m);
        Log.i("MoveAction", "limitRenderRectF -> " + this.f12406n);
    }

    /* renamed from: D */
    public final void m12273D() {
        Matrix matrixM13190d;
        C7792a c7792aM5990i = m5990i();
        this.f12400h = (c7792aM5990i == null || (matrixM13190d = c7792aM5990i.m13190d()) == null) ? null : AbstractC7352m.m11778c(matrixM13190d, System.currentTimeMillis());
    }

    /* renamed from: E */
    public final void m12274E(EzyTouchEvent.TouchEvent touchEvent) {
        PointF pointFM12268v = m12268v(touchEvent.m8550w(0).getX(), touchEvent.m8550w(0).getY());
        PointF pointFM12268v2 = m12268v(touchEvent.m8550w(1).getX(), touchEvent.m8550w(1).getY());
        this.f12398f.set(m12267s(pointFM12268v, pointFM12268v2));
        this.f12399g = m12284q(pointFM12268v, pointFM12268v2);
    }

    /* renamed from: F */
    public final void m12275F(EzyTouchEvent.TouchEvent touchEvent) {
        this.f12397e.set(m12268v(touchEvent.getX(), touchEvent.getY()));
    }

    /* renamed from: G */
    public final void m12276G() {
        C7347h c7347h = C7347h.f11914a;
        c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
    }

    /* renamed from: I */
    public void m12277I() {
        this.f12401i.reset();
        this.f12404l.clear();
        this.f12403k = 0;
        this.f12397e.set(0.0f, 0.0f);
        this.f12399g = 1.0f;
        this.f12398f.set(0.0f, 0.0f);
    }

    /* renamed from: J */
    public final void m12278J() {
        Matrix matrix;
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h != null) {
            EzyMatrix.Matrix originMatrix = this.f12400h;
            Intrinsics.checkNotNullExpressionValue(originMatrix, "originMatrix");
            C7792a c7792aM5990i = m5990i();
            if (c7792aM5990i == null || (matrix = c7792aM5990i.m13190d()) == null) {
                matrix = new Matrix();
            }
            interfaceC7522bM5989h.mo12237b(originMatrix, AbstractC7352m.m11778c(matrix, 0L), this.f12404l);
        }
    }

    /* renamed from: K */
    public final void m12279K(boolean z9) {
        this.f12408p = z9;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: a */
    public void mo5982a(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5982a(event);
        this.f12403k = 2;
        if (m12285t()) {
            m12274E(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: b */
    public void mo5983b(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5983b(event);
        this.f12403k = 0;
        if (m12285t()) {
            m12271z(m12263A(event), Long.valueOf(event.getEventTime()));
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: c */
    public void mo5984c(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5984c(event);
        this.f12403k = 0;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: d */
    public void mo5985d(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM12263A;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5985d(event);
        if (m12285t() && (matrixM12263A = m12263A(event)) != null) {
            m12270y(matrixM12263A, event.getEventTime());
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p098g4.InterfaceC7523c
    /* renamed from: e */
    public void mo5986e(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo5986e(event);
        this.f12403k = 1;
        if (m12285t()) {
            m12276G();
            m12264C(this, null, 1, null);
            m12275F(event);
            m12273D();
            m12269x();
        }
    }

    /* renamed from: m */
    public final void m12280m(Matrix matrix, long j10) {
        this.f12404l.add(AbstractC7352m.m11778c(matrix, j10));
    }

    /* renamed from: n */
    public final void m12281n(Float f10, Float f11) {
        if (this.f12405m.isEmpty()) {
            return;
        }
        m12271z(m12266r(f10, f11), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: o */
    public final void m12282o() {
        m12264C(this, null, 1, null);
        if (this.f12405m.isEmpty()) {
            return;
        }
        m12269x();
    }

    /* renamed from: p */
    public final void m12283p(Float f10, Float f11) {
        if (this.f12405m.isEmpty()) {
            return;
        }
        m12270y(m12266r(f10, f11), System.currentTimeMillis());
    }

    /* renamed from: q */
    public final float m12284q(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    /* renamed from: t */
    public final boolean m12285t() {
        BoardConfig boardConfigM5987f;
        C7438c moveActionConfig;
        return (this.f12408p || (boardConfigM5987f = m5987f()) == null || (moveActionConfig = boardConfigM5987f.getMoveActionConfig()) == null || !moveActionConfig.m11999g()) ? false : true;
    }

    /* renamed from: u */
    public final float m12286u() {
        m12264C(this, null, 1, null);
        RectF rectF = this.f12406n;
        float f10 = rectF.right;
        if (f10 > rectF.left) {
            return f10 / rectF.width();
        }
        return 0.0f;
    }

    /* renamed from: w */
    public final float m12287w() {
        m12264C(this, null, 1, null);
        RectF rectF = this.f12406n;
        float f10 = rectF.bottom;
        if (f10 > rectF.top) {
            return f10 / rectF.height();
        }
        return 0.0f;
    }
}
