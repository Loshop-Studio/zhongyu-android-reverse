package p348t9;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10352o;
import p307q9.C10762b;
import p322r9.InterfaceC10918b;
import p337s9.AbstractC11081b;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* renamed from: t9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11254a {

    /* renamed from: r */
    public static final a f27021r = new a(null);

    /* renamed from: a */
    public final InterfaceC10918b f27022a;

    /* renamed from: b */
    public final InterfaceC11552c f27023b;

    /* renamed from: c */
    public final C10762b f27024c;

    /* renamed from: d */
    public final C11373a f27025d;

    /* renamed from: e */
    public final Matrix f27026e;

    /* renamed from: f */
    public final Matrix f27027f;

    /* renamed from: g */
    public final RectF f27028g;

    /* renamed from: h */
    public final RectF f27029h;

    /* renamed from: i */
    public boolean f27030i;

    /* renamed from: j */
    public final ArrayList f27031j;

    /* renamed from: k */
    public AbstractC11081b f27032k;

    /* renamed from: l */
    public C11257d f27033l;

    /* renamed from: m */
    public float f27034m;

    /* renamed from: n */
    public float f27035n;

    /* renamed from: o */
    public boolean f27036o;

    /* renamed from: p */
    public final List f27037p;

    /* renamed from: q */
    public PointF f27038q;

    /* renamed from: t9.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public AbstractC11254a(InterfaceC10918b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f27022a = listener;
        this.f27023b = listener.mo23761a();
        this.f27024c = listener.mo23770j();
        this.f27025d = listener.mo23767g();
        this.f27026e = new Matrix();
        this.f27027f = new Matrix();
        this.f27028g = new RectF();
        this.f27029h = new RectF();
        this.f27030i = true;
        this.f27031j = new ArrayList();
        this.f27032k = AbstractC11081b.f.f26749a;
        this.f27033l = new C11257d(null, null, null, null, null, null, null, null, null, 511, null);
        this.f27037p = new ArrayList();
    }

    /* renamed from: Q */
    public static /* synthetic */ void m25119Q(AbstractC11254a abstractC11254a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSelectRectF");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        abstractC11254a.m25133P(z10);
    }

    /* renamed from: a */
    private final float m25120a(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: b */
    private final float m25121b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m25120a(f12 - f10, f13 - f11) - m25120a(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: A */
    public boolean mo13886A(float f10, float f11) {
        AbstractC11081b abstractC11081b = this.f27032k;
        if (AbstractC9979u.m20289b(abstractC11081b, AbstractC11081b.g.f26750a)) {
            m25122B(f10, f11);
        } else if (AbstractC9979u.m20289b(abstractC11081b, AbstractC11081b.h.f26751a)) {
            m25123C(f10, f11);
        } else {
            if (!AbstractC9979u.m20289b(abstractC11081b, AbstractC11081b.b.f26742a)) {
                return false;
            }
            m25124D(f10, f11);
        }
        if (!this.f27036o) {
            this.f27023b.mo25445e();
            this.f27023b.mo25464x(this.f27031j);
            this.f27036o = true;
        }
        Matrix matrixM25134c = m25134c(this.f27027f);
        this.f27037p.add(AbstractC10351n.m21664f(matrixM25134c, System.currentTimeMillis()));
        this.f27023b.mo25451k(this.f27031j, matrixM25134c);
        return true;
    }

    /* renamed from: B */
    public final void m25122B(float f10, float f11) {
        PointF pointFM21671d = C10352o.f24660a.m21671d(this.f27028g.centerX(), this.f27028g.centerY(), this.f27026e);
        this.f27027f.setRotate((float) Math.toDegrees(m25120a(f10 - pointFM21671d.x, f11 - pointFM21671d.y) - m25120a(this.f27034m - pointFM21671d.x, this.f27035n - pointFM21671d.y)), pointFM21671d.x, pointFM21671d.y);
    }

    /* renamed from: C */
    public final void m25123C(float f10, float f11) {
        C10352o c10352o = C10352o.f24660a;
        PointF pointFM21671d = c10352o.m21671d(this.f27028g.centerX(), this.f27028g.centerY(), this.f27026e);
        RectF rectF = this.f27028g;
        PointF pointFM21671d2 = c10352o.m21671d(rectF.right, rectF.bottom, this.f27026e);
        float fM25121b = m25121b(pointFM21671d.x, pointFM21671d.y, pointFM21671d2.x, pointFM21671d2.y, this.f27034m, this.f27035n, f10, f11);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM21671d.x - pointFM21671d2.x, d10)) + ((float) Math.pow(pointFM21671d.y - pointFM21671d2.y, d10)));
        float f12 = fM25121b + fSqrt;
        float fM22864H = ((this.f27024c.m22864H() * fSqrt) * 2) / this.f27026e.mapRadius(Math.min(this.f27028g.width(), this.f27028g.height()));
        if (f12 < fM22864H) {
            f12 = fM22864H;
        }
        float f13 = f12 / fSqrt;
        this.f27027f.setScale(f13, f13, pointFM21671d.x, pointFM21671d.y);
    }

    /* renamed from: D */
    public final void m25124D(float f10, float f11) {
        this.f27027f.setTranslate(f10 - this.f27034m, f11 - this.f27035n);
    }

    /* renamed from: E */
    public void m25125E() {
        this.f27027f.reset();
        this.f27037p.clear();
    }

    /* renamed from: F */
    public abstract boolean mo13874F(float f10, float f11);

    /* renamed from: G */
    public final boolean m25126G() {
        return this.f27030i;
    }

    /* renamed from: H */
    public void mo13875H() {
        this.f27028g.setEmpty();
        this.f27026e.reset();
        this.f27027f.reset();
        this.f27031j.clear();
        this.f27032k = AbstractC11081b.f.f26749a;
        this.f27038q = null;
    }

    /* renamed from: I */
    public final void m25127I(AbstractC11081b abstractC11081b) {
        AbstractC9979u.m20294g(abstractC11081b, "<set-?>");
        this.f27032k = abstractC11081b;
    }

    /* renamed from: J */
    public final void m25128J(boolean z10) {
        this.f27030i = z10;
    }

    /* renamed from: K */
    public final void m25129K(float f10, float f11) {
        this.f27034m = f10;
        this.f27035n = f11;
    }

    /* renamed from: L */
    public void mo13887L(List graphList) {
        AbstractC9979u.m20294g(graphList, "graphList");
        this.f27031j.clear();
        this.f27031j.addAll(graphList);
    }

    /* renamed from: M */
    public final void m25130M(RectF rectF) {
        AbstractC9979u.m20294g(rectF, "rectF");
        this.f27028g.set(rectF);
    }

    /* renamed from: N */
    public final void m25131N(RectF rectF, Matrix matrix, PointF pointF) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        this.f27028g.set(rectF);
        this.f27026e.set(matrix);
        this.f27038q = pointF;
    }

    /* renamed from: O */
    public final void m25132O(PointF pointF) {
        this.f27038q = pointF;
    }

    /* renamed from: P */
    public final void m25133P(boolean z10) {
        if (z10) {
            this.f27029h.set(mo13878p());
            this.f27030i = m25141k(this.f27029h, m25149t(), m25143m());
            mo13876R();
        }
        PointF pointF = this.f27038q;
        this.f27023b.mo25460t(this.f27028g, m25137g(), this.f27029h, this.f27033l, mo13877f(), pointF != null ? C10352o.f24660a.m21672e(pointF, m25137g()) : null);
    }

    /* renamed from: R */
    public abstract void mo13876R();

    /* renamed from: c */
    public final Matrix m25134c(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f27025d.m25311b());
        matrix2.postConcat(matrix);
        matrix2.postConcat(AbstractC10351n.m21660b(this.f27025d.m25311b()));
        return matrix2;
    }

    /* renamed from: d */
    public final C10762b m25135d() {
        return this.f27024c;
    }

    /* renamed from: e */
    public final AbstractC11081b m25136e() {
        return this.f27032k;
    }

    /* renamed from: f */
    public abstract List mo13877f();

    /* renamed from: g */
    public final Matrix m25137g() {
        Matrix matrix = new Matrix(this.f27026e);
        matrix.postConcat(this.f27027f);
        return matrix;
    }

    /* renamed from: h */
    public final float m25138h() {
        return this.f27034m;
    }

    /* renamed from: i */
    public final float m25139i() {
        return this.f27035n;
    }

    /* renamed from: j */
    public final C11257d m25140j() {
        return this.f27033l;
    }

    /* renamed from: k */
    public final boolean m25141k(RectF functionRectF, RectF selectRectF, RectF limitRectF) {
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(limitRectF, "limitRectF");
        float fWidth = selectRectF.left;
        float fM22861E = selectRectF.bottom + 14.0f;
        if (fM22861E > limitRectF.bottom - functionRectF.height()) {
            fM22861E = (selectRectF.top - this.f27024c.m22861E()) - 14.0f;
        }
        float f10 = limitRectF.top;
        if (fM22861E < f10) {
            fM22861E = f10;
        }
        boolean z10 = true;
        if (functionRectF.width() < limitRectF.width()) {
            float f11 = limitRectF.left;
            if (fWidth < f11) {
                fWidth = f11;
            } else if (fWidth > limitRectF.right - functionRectF.width()) {
                fWidth = limitRectF.right - functionRectF.width();
                z10 = false;
            }
        }
        functionRectF.left = fWidth;
        functionRectF.top = fM22861E;
        functionRectF.right += fWidth;
        functionRectF.bottom += fM22861E;
        return z10;
    }

    /* renamed from: l */
    public final InterfaceC11552c m25142l() {
        return this.f27023b;
    }

    /* renamed from: m */
    public final RectF m25143m() {
        RectF rectFMo25457q = this.f27023b.mo25457q();
        RectF rectF = new RectF(rectFMo25457q);
        if (this.f27024c.m22919z().m22928g()) {
            RectF rectF2 = new RectF(0.0f, 0.0f, rectFMo25457q.width() * this.f27024c.m22919z().m22924c(), rectFMo25457q.height() * this.f27024c.m22919z().m22923b());
            this.f27025d.m25311b().mapRect(rectF2);
            rectF.intersect(rectF2);
        }
        return rectF;
    }

    /* renamed from: n */
    public final InterfaceC10918b m25144n() {
        return this.f27022a;
    }

    /* renamed from: o */
    public final C11373a m25145o() {
        return this.f27025d;
    }

    /* renamed from: p */
    public abstract RectF mo13878p();

    /* renamed from: q */
    public final RectF m25146q() {
        return this.f27029h;
    }

    /* renamed from: r */
    public final ArrayList m25147r() {
        return this.f27031j;
    }

    /* renamed from: s */
    public final RectF m25148s() {
        return this.f27028g;
    }

    /* renamed from: t */
    public final RectF m25149t() {
        RectF rectF = new RectF(this.f27028g);
        m25137g().mapRect(rectF);
        return rectF;
    }

    /* renamed from: u */
    public final Matrix m25150u() {
        return this.f27026e;
    }

    /* renamed from: v */
    public final PointF m25151v() {
        return this.f27038q;
    }

    /* renamed from: w */
    public boolean mo13879w(float f10, float f11) {
        return true;
    }

    /* renamed from: x */
    public boolean mo13892x(float f10, float f11) {
        return false;
    }

    /* renamed from: y */
    public boolean mo13893y(float f10, float f11) {
        AbstractC11081b abstractC11081b = this.f27032k;
        if (AbstractC9979u.m20289b(abstractC11081b, AbstractC11081b.g.f26750a)) {
            m25122B(f10, f11);
        } else if (AbstractC9979u.m20289b(abstractC11081b, AbstractC11081b.h.f26751a)) {
            m25123C(f10, f11);
        } else {
            if (!AbstractC9979u.m20289b(abstractC11081b, AbstractC11081b.b.f26742a)) {
                return false;
            }
            m25124D(f10, f11);
        }
        this.f27026e.postConcat(this.f27027f);
        Matrix matrixM25134c = m25134c(this.f27027f);
        this.f27027f.reset();
        this.f27023b.mo25466z(this.f27031j, matrixM25134c);
        this.f27036o = false;
        m25119Q(this, false, 1, null);
        this.f27037p.add(AbstractC10351n.m21664f(matrixM25134c, System.currentTimeMillis()));
        this.f27022a.mo23763c(this.f27031j, this.f27037p);
        this.f27022a.mo23772l();
        return true;
    }

    /* renamed from: z */
    public boolean mo13894z(float f10, float f11) {
        return true;
    }
}
