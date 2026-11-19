package p282w4;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p243s5.InterfaceC9476d;
import p263u5.AbstractC9695n;
import p263u5.C9690i;
import p263u5.C9696o;
import p272v4.C9763b;
import p272v4.C9765d;
import p312z4.C9998a;

/* renamed from: w4.d */
/* loaded from: classes4.dex */
public final class C9824d extends BaseTouchAction {

    /* renamed from: q */
    public static final a f17508q = new a(null);

    /* renamed from: k */
    public int f17515k;

    /* renamed from: p */
    public boolean f17520p;

    /* renamed from: e */
    public final PointF f17509e = new PointF();

    /* renamed from: f */
    public final PointF f17510f = new PointF();

    /* renamed from: g */
    public float f17511g = 1.0f;

    /* renamed from: h */
    public EzyMatrix.Matrix f17512h = EzyMatrix.Matrix.m8850x();

    /* renamed from: i */
    public final Matrix f17513i = new Matrix();

    /* renamed from: j */
    public final Matrix f17514j = new Matrix();

    /* renamed from: l */
    public final List f17516l = new ArrayList();

    /* renamed from: m */
    public final RectF f17517m = new RectF();

    /* renamed from: n */
    public final RectF f17518n = new RectF();

    /* renamed from: o */
    public float f17519o = 1.0f;

    /* renamed from: w4.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: A */
    private final Matrix m16709A(EzyTouchEvent.TouchEvent touchEvent) {
        PointF pointFM16714v;
        PointF pointF;
        float fWidth;
        Matrix matrix;
        Matrix matrix2;
        C9765d c9765dM16519z;
        C9765d c9765dM16519z2;
        C9765d c9765dM16519z3;
        int i9 = this.f17515k;
        if (i9 == 1) {
            this.f17513i.reset();
            pointFM16714v = m16714v(touchEvent.getX(), touchEvent.getY());
            pointF = this.f17509e;
        } else {
            if (i9 != 2) {
                return null;
            }
            this.f17513i.reset();
            PointF pointFM16714v2 = m16714v(touchEvent.m9711z(0).getX(), touchEvent.m9711z(0).getY());
            PointF pointFM16714v3 = m16714v(touchEvent.m9711z(1).getX(), touchEvent.m9711z(1).getY());
            C9763b c9763bM7082f = m7082f();
            if (c9763bM7082f != null && (c9765dM16519z3 = c9763bM7082f.m16519z()) != null && c9765dM16519z3.m16526e()) {
                float fMax = Float.max(m16730q(pointFM16714v2, pointFM16714v3) / this.f17511g, this.f17519o);
                Matrix matrix3 = this.f17513i;
                PointF pointF2 = this.f17510f;
                matrix3.postScale(fMax, fMax, pointF2.x, pointF2.y);
                m16718B(this.f17513i);
            }
            pointFM16714v = m16713s(pointFM16714v2, pointFM16714v3);
            pointF = this.f17510f;
        }
        C9763b c9763bM7082f2 = m7082f();
        float f10 = 0.0f;
        if (c9763bM7082f2 == null || (c9765dM16519z2 = c9763bM7082f2.m16519z()) == null || !c9765dM16519z2.m16522a()) {
            fWidth = 0.0f;
        } else {
            RectF rectF = this.f17518n;
            fWidth = rectF.left;
            float f11 = rectF.right;
            if (fWidth > f11) {
                InterfaceC0039c interfaceC0039cM7083g = m7083g();
                Intrinsics.checkNotNull(interfaceC0039cM7083g);
                fWidth = ((interfaceC0039cM7083g.mo213p().width() - this.f17517m.width()) / 2) - this.f17517m.left;
            } else {
                float f12 = pointFM16714v.x - pointF.x;
                if (f12 >= fWidth) {
                    fWidth = f12 > f11 ? f11 : f12;
                }
            }
            this.f17513i.postTranslate(fWidth, 0.0f);
        }
        C9763b c9763bM7082f3 = m7082f();
        if (c9763bM7082f3 != null && (c9765dM16519z = c9763bM7082f3.m16519z()) != null && c9765dM16519z.m16527f()) {
            RectF rectF2 = this.f17518n;
            float fHeight = rectF2.top;
            float f13 = rectF2.bottom;
            if (fHeight > f13) {
                InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
                Intrinsics.checkNotNull(interfaceC0039cM7083g2);
                fHeight = ((interfaceC0039cM7083g2.mo213p().height() - this.f17517m.height()) / 2) - this.f17517m.top;
            } else {
                float f14 = pointFM16714v.y - pointF.y;
                if (f14 >= fHeight) {
                    fHeight = f14 > f13 ? f13 : f14;
                }
            }
            this.f17513i.postTranslate(0.0f, fHeight);
            f10 = fHeight;
        }
        m16711H(fWidth, f10);
        Matrix matrix4 = new Matrix();
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i == null || (matrix = c9998aM7085i.m17347e()) == null) {
            matrix = new Matrix();
        }
        matrix4.postConcat(matrix);
        matrix4.postConcat(this.f17513i);
        C9998a c9998aM7085i2 = m7085i();
        if (c9998aM7085i2 == null || (matrix2 = c9998aM7085i2.m17347e()) == null) {
            matrix2 = new Matrix();
        }
        matrix4.postConcat(AbstractC9695n.m16200b(matrix2));
        return matrix4;
    }

    /* renamed from: C */
    public static /* synthetic */ void m16710C(C9824d c9824d, Matrix matrix, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            matrix = null;
        }
        c9824d.m16718B(matrix);
    }

    /* renamed from: H */
    private final void m16711H(float f10, float f11) {
        float fWidth;
        InterfaceC9476d interfaceC9476dMo16696o;
        C9765d c9765dM16519z;
        C9765d c9765dM16519z2;
        if (this.f17517m.isEmpty()) {
            return;
        }
        float fHeight = 0.0f;
        if (this.f17518n.width() > 0.0f) {
            RectF rectF = this.f17518n;
            fWidth = (rectF.right - f10) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.f17518n.height() > 0.0f) {
            RectF rectF2 = this.f17518n;
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

    /* renamed from: r */
    private final Matrix m16712r(Float f10, Float f11) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            RectF rectF = this.f17518n;
            fValueOf = Float.valueOf(rectF.right - (fFloatValue * rectF.width()));
        } else {
            fValueOf = null;
        }
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            RectF rectF2 = this.f17518n;
            fValueOf2 = Float.valueOf(rectF2.bottom - (fFloatValue2 * rectF2.height()));
        }
        Matrix matrix = this.f17513i;
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
        matrix2.postConcat(this.f17513i);
        C9998a c9998aM7085i2 = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i2);
        matrix2.postConcat(AbstractC9695n.m16200b(c9998aM7085i2.m17347e()));
        return matrix2;
    }

    /* renamed from: s */
    private final PointF m16713s(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    /* renamed from: v */
    private final PointF m16714v(float f10, float f11) {
        if (m7085i() == null) {
            return new PointF(f10, f11);
        }
        C9696o c9696o = C9696o.f17133a;
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        return c9696o.m16206d(f10, f11, c9998aM7085i.m17344b());
    }

    /* renamed from: x */
    private final void m16715x() {
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo211n();
        }
        this.f17516l.clear();
    }

    /* renamed from: y */
    private final void m16716y(Matrix matrix, long j9) {
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo214q(matrix);
        }
        m16726m(matrix, j9);
    }

    /* renamed from: z */
    private final void m16717z(Matrix matrix, Long l9) {
        if (matrix != null) {
            this.f17516l.add(AbstractC9695n.m16201c(matrix, l9 != null ? l9.longValue() : System.currentTimeMillis()));
        }
        if (this.f17516l.isEmpty()) {
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                InterfaceC0039c.a.m224a(interfaceC0039cM7083g, null, 1, null);
                return;
            }
            return;
        }
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo177D(AbstractC9695n.m16202d((EzyMatrix.Matrix) CollectionsKt.last(this.f17516l)));
        }
        m16724J();
    }

    /* renamed from: B */
    public final void m16718B(Matrix matrix) {
        Matrix matrix2;
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        Intrinsics.checkNotNull(interfaceC0039cM7083g);
        RectF rectFMo180G = interfaceC0039cM7083g.mo180G();
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        Intrinsics.checkNotNull(interfaceC0039cM7083g2);
        RectF rectFMo213p = interfaceC0039cM7083g2.mo213p();
        if (rectFMo180G.isEmpty()) {
            rectFMo180G = new RectF(rectFMo213p);
        }
        C9763b c9763bM7082f = m7082f();
        Intrinsics.checkNotNull(c9763bM7082f);
        C9765d c9765dM16519z = c9763bM7082f.m16519z();
        if (c9765dM16519z.m16523b() < 1 || c9765dM16519z.m16524c() < 1) {
            this.f17517m.setEmpty();
            return;
        }
        this.f17517m.set(0.0f, 0.0f, rectFMo180G.width() * c9765dM16519z.m16524c(), rectFMo180G.height() * c9765dM16519z.m16523b());
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i == null || (matrix2 = c9998aM7085i.m17344b()) == null) {
            matrix2 = new Matrix();
        }
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(this.f17517m);
        RectF rectF = this.f17518n;
        float f10 = rectFMo213p.right;
        RectF rectF2 = this.f17517m;
        rectF.set(f10 - rectF2.right, rectFMo213p.bottom - rectF2.bottom, rectFMo213p.left - rectF2.left, rectFMo213p.top - rectF2.top);
        if (matrix == null) {
            this.f17519o = Math.min(rectFMo213p.width() / this.f17517m.width(), rectFMo213p.height() / this.f17517m.height());
        }
        Log.i("MoveAction", "configRectF -> " + this.f17517m);
        Log.i("MoveAction", "limitRenderRectF -> " + this.f17518n);
    }

    /* renamed from: D */
    public final void m16719D() {
        Matrix matrixM17346d;
        C9998a c9998aM7085i = m7085i();
        this.f17512h = (c9998aM7085i == null || (matrixM17346d = c9998aM7085i.m17346d()) == null) ? null : AbstractC9695n.m16201c(matrixM17346d, System.currentTimeMillis());
    }

    /* renamed from: E */
    public final void m16720E(EzyTouchEvent.TouchEvent touchEvent) {
        PointF pointFM16714v = m16714v(touchEvent.m9711z(0).getX(), touchEvent.m9711z(0).getY());
        PointF pointFM16714v2 = m16714v(touchEvent.m9711z(1).getX(), touchEvent.m9711z(1).getY());
        this.f17510f.set(m16713s(pointFM16714v, pointFM16714v2));
        this.f17511g = m16730q(pointFM16714v, pointFM16714v2);
    }

    /* renamed from: F */
    public final void m16721F(EzyTouchEvent.TouchEvent touchEvent) {
        this.f17509e.set(m16714v(touchEvent.getX(), touchEvent.getY()));
    }

    /* renamed from: G */
    public final void m16722G() {
        C9690i c9690i = C9690i.f17127a;
        c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
    }

    /* renamed from: I */
    public void m16723I() {
        this.f17513i.reset();
        this.f17516l.clear();
        this.f17515k = 0;
        this.f17509e.set(0.0f, 0.0f);
        this.f17511g = 1.0f;
        this.f17510f.set(0.0f, 0.0f);
    }

    /* renamed from: J */
    public final void m16724J() {
        Matrix matrix;
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h != null) {
            EzyMatrix.Matrix originMatrix = this.f17512h;
            Intrinsics.checkNotNullExpressionValue(originMatrix, "originMatrix");
            C9998a c9998aM7085i = m7085i();
            if (c9998aM7085i == null || (matrix = c9998aM7085i.m17346d()) == null) {
                matrix = new Matrix();
            }
            interfaceC9822bM7084h.mo16683b(originMatrix, AbstractC9695n.m16201c(matrix, 0L), this.f17516l);
        }
    }

    /* renamed from: K */
    public final void m16725K(boolean z9) {
        this.f17520p = z9;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: a */
    public void mo7077a(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7077a(event);
        this.f17515k = 2;
        if (m16731t()) {
            m16720E(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: b */
    public void mo7078b(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7078b(event);
        this.f17515k = 0;
        if (m16731t()) {
            m16717z(m16709A(event), Long.valueOf(event.getEventTime()));
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: c */
    public void mo7079c(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7079c(event);
        this.f17515k = 0;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: d */
    public void mo7080d(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM16709A;
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7080d(event);
        if (m16731t() && (matrixM16709A = m16709A(event)) != null) {
            m16716y(matrixM16709A, event.getEventTime());
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, p282w4.InterfaceC9823c
    /* renamed from: e */
    public void mo7081e(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo7081e(event);
        this.f17515k = 1;
        if (m16731t()) {
            m16722G();
            m16710C(this, null, 1, null);
            m16721F(event);
            m16719D();
            m16715x();
        }
    }

    /* renamed from: m */
    public final void m16726m(Matrix matrix, long j9) {
        this.f17516l.add(AbstractC9695n.m16201c(matrix, j9));
    }

    /* renamed from: n */
    public final void m16727n(Float f10, Float f11) {
        if (this.f17517m.isEmpty()) {
            return;
        }
        m16717z(m16712r(f10, f11), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: o */
    public final void m16728o() {
        m16710C(this, null, 1, null);
        if (this.f17517m.isEmpty()) {
            return;
        }
        m16715x();
    }

    /* renamed from: p */
    public final void m16729p(Float f10, Float f11) {
        if (this.f17517m.isEmpty()) {
            return;
        }
        m16716y(m16712r(f10, f11), System.currentTimeMillis());
    }

    /* renamed from: q */
    public final float m16730q(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    /* renamed from: t */
    public final boolean m16731t() {
        C9763b c9763bM7082f;
        C9765d c9765dM16519z;
        return (this.f17520p || (c9763bM7082f = m7082f()) == null || (c9765dM16519z = c9763bM7082f.m16519z()) == null || !c9765dM16519z.m16528g()) ? false : true;
    }

    /* renamed from: u */
    public final float m16732u() {
        m16710C(this, null, 1, null);
        RectF rectF = this.f17518n;
        float f10 = rectF.right;
        if (f10 > rectF.left) {
            return f10 / rectF.width();
        }
        return 0.0f;
    }

    /* renamed from: w */
    public final float m16733w() {
        m16710C(this, null, 1, null);
        RectF rectF = this.f17518n;
        float f10 = rectF.bottom;
        if (f10 > rectF.top) {
            return f10 / rectF.height();
        }
        return 0.0f;
    }
}
