package p120i4;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BoardConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p077e5.C7353n;
import p098g4.InterfaceC7522b;
import p109h4.AbstractC7624b;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;

/* renamed from: i4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7661a {

    /* renamed from: t */
    public static final a f12922t = new a(null);

    /* renamed from: a */
    public final InterfaceC7522b f12923a;

    /* renamed from: b */
    public final InterfaceC7880c f12924b;

    /* renamed from: c */
    public final BoardConfig f12925c;

    /* renamed from: d */
    public final C7792a f12926d;

    /* renamed from: e */
    public final Matrix f12927e;

    /* renamed from: f */
    public final Matrix f12928f;

    /* renamed from: g */
    public final RectF f12929g;

    /* renamed from: h */
    public final RectF f12930h;

    /* renamed from: i */
    public Pair f12931i;

    /* renamed from: j */
    public boolean f12932j;

    /* renamed from: k */
    public final ArrayList f12933k;

    /* renamed from: l */
    public AbstractC7624b f12934l;

    /* renamed from: m */
    public C7665e f12935m;

    /* renamed from: n */
    public C7663c f12936n;

    /* renamed from: o */
    public float f12937o;

    /* renamed from: p */
    public float f12938p;

    /* renamed from: q */
    public boolean f12939q;

    /* renamed from: r */
    public final List f12940r;

    /* renamed from: s */
    public PointF f12941s;

    /* renamed from: i4.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC7661a(InterfaceC7522b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12923a = listener;
        this.f12924b = listener.mo12236a();
        this.f12925c = listener.mo12246k();
        this.f12926d = listener.mo12243h();
        this.f12927e = new Matrix();
        this.f12928f = new Matrix();
        this.f12929g = new RectF();
        this.f12930h = new RectF();
        Float fValueOf = Float.valueOf(0.0f);
        this.f12931i = new Pair(fValueOf, fValueOf);
        this.f12932j = true;
        this.f12933k = new ArrayList();
        this.f12934l = AbstractC7624b.g.f12794a;
        this.f12935m = new C7665e(null, null, null, null, null, null, null, null, null, null, 1023, null);
        this.f12936n = new C7663c(null, null, null, null, null, 31, null);
        this.f12940r = new ArrayList();
    }

    /* renamed from: V */
    public static /* synthetic */ void m12733V(AbstractC7661a abstractC7661a, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSelectRectF");
        }
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        abstractC7661a.m12748U(z9);
    }

    /* renamed from: c */
    private final float m12734c(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: d */
    private final float m12735d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m12734c(f12 - f10, f13 - f11) - m12734c(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: A */
    public boolean mo6132A(float f10, float f11) {
        return true;
    }

    /* renamed from: B */
    public boolean mo6171B(float f10, float f11) {
        return false;
    }

    /* renamed from: C */
    public boolean mo6133C(float f10, float f11) {
        AbstractC7624b abstractC7624b = this.f12934l;
        if (Intrinsics.areEqual(abstractC7624b, AbstractC7624b.h.f12795a)) {
            m12736F(f10, f11);
        } else if (Intrinsics.areEqual(abstractC7624b, AbstractC7624b.i.f12796a)) {
            m12737G(f10, f11);
        } else {
            if (!Intrinsics.areEqual(abstractC7624b, AbstractC7624b.b.f12786a)) {
                return false;
            }
            m12738H(f10, f11);
        }
        this.f12927e.postConcat(this.f12928f);
        Matrix matrixM12750e = m12750e(this.f12928f);
        this.f12928f.reset();
        this.f12924b.mo13459x(this.f12933k, matrixM12750e);
        this.f12939q = false;
        m12733V(this, false, 1, null);
        this.f12940r.add(AbstractC7352m.m11778c(matrixM12750e, System.currentTimeMillis()));
        this.f12923a.mo12238c(this.f12933k, this.f12940r);
        this.f12923a.mo12247l();
        return true;
    }

    /* renamed from: D */
    public boolean mo6134D(float f10, float f11) {
        return true;
    }

    /* renamed from: E */
    public boolean mo6135E(float f10, float f11) {
        AbstractC7624b abstractC7624b = this.f12934l;
        if (Intrinsics.areEqual(abstractC7624b, AbstractC7624b.h.f12795a)) {
            m12736F(f10, f11);
        } else if (Intrinsics.areEqual(abstractC7624b, AbstractC7624b.i.f12796a)) {
            m12737G(f10, f11);
        } else {
            if (!Intrinsics.areEqual(abstractC7624b, AbstractC7624b.b.f12786a)) {
                return false;
            }
            m12738H(f10, f11);
        }
        if (!this.f12939q) {
            this.f12924b.mo13439d();
            this.f12924b.mo13457v(this.f12933k);
            this.f12939q = true;
        }
        Matrix matrixM12750e = m12750e(this.f12928f);
        this.f12940r.add(AbstractC7352m.m11778c(matrixM12750e, System.currentTimeMillis()));
        this.f12924b.mo13443h(this.f12933k, matrixM12750e);
        return true;
    }

    /* renamed from: F */
    public final void m12736F(float f10, float f11) {
        PointF pointFM11783d = C7353n.f11920a.m11783d(this.f12929g.centerX(), this.f12929g.centerY(), this.f12927e);
        this.f12928f.setRotate((float) Math.toDegrees(m12734c(f10 - pointFM11783d.x, f11 - pointFM11783d.y) - m12734c(this.f12937o - pointFM11783d.x, this.f12938p - pointFM11783d.y)), pointFM11783d.x, pointFM11783d.y);
    }

    /* renamed from: G */
    public final void m12737G(float f10, float f11) {
        C7353n c7353n = C7353n.f11920a;
        PointF pointFM11783d = c7353n.m11783d(this.f12929g.centerX(), this.f12929g.centerY(), this.f12927e);
        RectF rectF = this.f12929g;
        PointF pointFM11783d2 = c7353n.m11783d(rectF.right, rectF.bottom, this.f12927e);
        float fM12735d = m12735d(pointFM11783d.x, pointFM11783d.y, pointFM11783d2.x, pointFM11783d2.y, this.f12937o, this.f12938p, f10, f11);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM11783d.x - pointFM11783d2.x, d10)) + ((float) Math.pow(pointFM11783d.y - pointFM11783d2.y, d10)));
        float f12 = fM12735d + fSqrt;
        float selectIconWidth = ((this.f12925c.getSelectIconWidth() * fSqrt) * 2) / this.f12927e.mapRadius(Math.min(this.f12929g.width(), this.f12929g.height()));
        if (f12 < selectIconWidth) {
            f12 = selectIconWidth;
        }
        float f13 = f12 / fSqrt;
        this.f12928f.setScale(f13, f13, pointFM11783d.x, pointFM11783d.y);
    }

    /* renamed from: H */
    public final void m12738H(float f10, float f11) {
        this.f12928f.setTranslate(f10 - this.f12937o, f11 - this.f12938p);
    }

    /* renamed from: I */
    public void m12739I() {
        this.f12928f.reset();
        this.f12940r.clear();
    }

    /* renamed from: J */
    public abstract boolean mo6136J(float f10, float f11);

    /* renamed from: K */
    public final boolean m12740K() {
        return this.f12932j;
    }

    /* renamed from: L */
    public void mo6137L() {
        this.f12929g.setEmpty();
        this.f12927e.reset();
        this.f12928f.reset();
        this.f12933k.clear();
        this.f12934l = AbstractC7624b.g.f12794a;
        this.f12941s = null;
    }

    /* renamed from: M */
    public final void m12741M(AbstractC7624b abstractC7624b) {
        Intrinsics.checkNotNullParameter(abstractC7624b, "<set-?>");
        this.f12934l = abstractC7624b;
    }

    /* renamed from: N */
    public final void m12742N(boolean z9) {
        this.f12932j = z9;
    }

    /* renamed from: O */
    public final void m12743O(float f10, float f11) {
        this.f12937o = f10;
        this.f12938p = f11;
    }

    /* renamed from: P */
    public void mo6138P(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        this.f12933k.clear();
        this.f12933k.addAll(graphList);
    }

    /* renamed from: Q */
    public final void m12744Q(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        this.f12929g.set(rectF);
    }

    /* renamed from: R */
    public final void m12745R(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<set-?>");
        this.f12931i = pair;
    }

    /* renamed from: S */
    public final void m12746S(RectF rectF, Matrix matrix, PointF pointF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f12929g.set(rectF);
        this.f12927e.set(matrix);
        this.f12941s = pointF;
    }

    /* renamed from: T */
    public final void m12747T(PointF pointF) {
        this.f12941s = pointF;
    }

    /* renamed from: U */
    public final void m12748U(boolean z9) {
        if (z9) {
            this.f12930h.set(mo6156s());
            this.f12932j = m12758n(this.f12930h, m12766w(), m12760p(), this.f12931i);
            mo6139X();
            m12749W();
        }
        PointF pointF = this.f12941s;
        this.f12924b.mo13461z(this.f12929g, m12753i(), this.f12930h, this.f12935m, this.f12936n, mo6153h(), pointF != null ? C7353n.f11920a.m11784e(pointF, m12753i()) : null);
    }

    /* renamed from: W */
    public final void m12749W() {
        C7665e c7665e = this.f12935m;
        C7663c c7663c = this.f12936n;
        RectF rectFM12775c = c7663c.m12775c();
        rectFM12775c.setEmpty();
        rectFM12775c.union(c7665e.m12801i());
        rectFM12775c.union(c7665e.m12798f());
        rectFM12775c.union(c7665e.m12796d());
        rectFM12775c.union(c7665e.m12797e());
        rectFM12775c.union(c7665e.m12795c());
        rectFM12775c.left -= 8.0f;
        rectFM12775c.right += 8.0f;
        ArrayList arrayListM12802j = c7665e.m12802j();
        if (!arrayListM12802j.isEmpty()) {
            c7663c.m12777e().set(((RectF) CollectionsKt.first((List) arrayListM12802j)).left - 16.0f, ((RectF) CollectionsKt.first((List) arrayListM12802j)).top, ((RectF) CollectionsKt.last((List) arrayListM12802j)).right + 16.0f, ((RectF) CollectionsKt.first((List) arrayListM12802j)).bottom);
        }
        c7663c.m12776d().set(c7665e.m12800h().left, c7665e.m12800h().top, c7665e.m12799g().right, c7665e.m12799g().bottom);
        if (!c7665e.m12793a().isEmpty()) {
            float selectButtonHeight = (this.f12925c.getSelectButtonHeight() - 38.0f) / 2;
            c7663c.m12773a().set(((RectF) CollectionsKt.first((List) c7665e.m12793a())).left - 23.0f, ((RectF) CollectionsKt.first((List) c7665e.m12793a())).top - selectButtonHeight, ((RectF) CollectionsKt.last((List) c7665e.m12793a())).right + 23.0f, ((RectF) CollectionsKt.last((List) c7665e.m12793a())).bottom + selectButtonHeight);
        }
        c7663c.m12774b().set(c7665e.m12794b());
    }

    /* renamed from: X */
    public abstract void mo6139X();

    /* renamed from: e */
    public final Matrix m12750e(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f12926d.m13188b());
        matrix2.postConcat(matrix);
        matrix2.postConcat(AbstractC7352m.m11777b(this.f12926d.m13188b()));
        return matrix2;
    }

    /* renamed from: f */
    public final BoardConfig m12751f() {
        return this.f12925c;
    }

    /* renamed from: g */
    public final AbstractC7624b m12752g() {
        return this.f12934l;
    }

    /* renamed from: h */
    public abstract List mo6153h();

    /* renamed from: i */
    public final Matrix m12753i() {
        Matrix matrix = new Matrix(this.f12927e);
        matrix.postConcat(this.f12928f);
        return matrix;
    }

    /* renamed from: j */
    public final float m12754j() {
        return this.f12937o;
    }

    /* renamed from: k */
    public final float m12755k() {
        return this.f12938p;
    }

    /* renamed from: l */
    public final C7663c m12756l() {
        return this.f12936n;
    }

    /* renamed from: m */
    public final C7665e m12757m() {
        return this.f12935m;
    }

    /* renamed from: n */
    public final boolean m12758n(RectF functionRectF, RectF selectRectF, RectF limitRectF, Pair pair) {
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(limitRectF, "limitRectF");
        Intrinsics.checkNotNullParameter(pair, "pair");
        float f10 = selectRectF.left;
        float selectButtonHeight = selectRectF.bottom + 14.0f;
        if (selectButtonHeight > limitRectF.bottom - ((Number) pair.getSecond()).floatValue()) {
            selectButtonHeight = (selectRectF.top - this.f12925c.getSelectButtonHeight()) - 14.0f;
        }
        float f11 = limitRectF.top;
        if (selectButtonHeight < f11) {
            selectButtonHeight = f11;
        }
        float fWidth = functionRectF.width();
        boolean z9 = true;
        if (fWidth < limitRectF.width()) {
            float f12 = selectRectF.right;
            float f13 = limitRectF.right;
            if (f12 > f13) {
                f10 = f13 - fWidth;
                z9 = false;
            }
            float f14 = limitRectF.left;
            if (f10 < f14) {
                f10 = f14;
            }
        }
        functionRectF.left = f10;
        functionRectF.top = selectButtonHeight;
        functionRectF.right += f10;
        functionRectF.bottom += selectButtonHeight;
        return z9;
    }

    /* renamed from: o */
    public final InterfaceC7880c m12759o() {
        return this.f12924b;
    }

    /* renamed from: p */
    public final RectF m12760p() {
        RectF rectFMo13453r = this.f12924b.mo13453r();
        RectF rectF = new RectF(rectFMo13453r);
        if (this.f12925c.getMoveActionConfig().m11999g()) {
            RectF rectF2 = new RectF(0.0f, 0.0f, rectFMo13453r.width() * this.f12925c.getMoveActionConfig().m11995c(), rectFMo13453r.height() * this.f12925c.getMoveActionConfig().m11994b());
            this.f12926d.m13188b().mapRect(rectF2);
            rectF.intersect(rectF2);
        }
        return rectF;
    }

    /* renamed from: q */
    public final InterfaceC7522b m12761q() {
        return this.f12923a;
    }

    /* renamed from: r */
    public final C7792a m12762r() {
        return this.f12926d;
    }

    /* renamed from: s */
    public abstract RectF mo6156s();

    /* renamed from: t */
    public final RectF m12763t() {
        return this.f12930h;
    }

    /* renamed from: u */
    public final ArrayList m12764u() {
        return this.f12933k;
    }

    /* renamed from: v */
    public final RectF m12765v() {
        return this.f12929g;
    }

    /* renamed from: w */
    public final RectF m12766w() {
        RectF rectF = new RectF(this.f12929g);
        m12753i().mapRect(rectF);
        return rectF;
    }

    /* renamed from: x */
    public final Pair m12767x() {
        return this.f12931i;
    }

    /* renamed from: y */
    public final Matrix m12768y() {
        return this.f12927e;
    }

    /* renamed from: z */
    public final PointF m12769z() {
        return this.f12941s;
    }
}
