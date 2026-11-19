package p302y4;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p263u5.AbstractC9695n;
import p263u5.C9696o;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;
import p292x4.AbstractC9878b;
import p312z4.C9998a;

/* renamed from: y4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9948a {

    /* renamed from: t */
    public static final a f17885t = new a(null);

    /* renamed from: a */
    public final InterfaceC9822b f17886a;

    /* renamed from: b */
    public final InterfaceC0039c f17887b;

    /* renamed from: c */
    public final C9763b f17888c;

    /* renamed from: d */
    public final C9998a f17889d;

    /* renamed from: e */
    public final Matrix f17890e;

    /* renamed from: f */
    public final Matrix f17891f;

    /* renamed from: g */
    public final RectF f17892g;

    /* renamed from: h */
    public final RectF f17893h;

    /* renamed from: i */
    public Pair f17894i;

    /* renamed from: j */
    public boolean f17895j;

    /* renamed from: k */
    public final ArrayList f17896k;

    /* renamed from: l */
    public AbstractC9878b f17897l;

    /* renamed from: m */
    public C9952e f17898m;

    /* renamed from: n */
    public C9950c f17899n;

    /* renamed from: o */
    public float f17900o;

    /* renamed from: p */
    public float f17901p;

    /* renamed from: q */
    public boolean f17902q;

    /* renamed from: r */
    public final List f17903r;

    /* renamed from: s */
    public PointF f17904s;

    /* renamed from: y4.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC9948a(InterfaceC9822b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17886a = listener;
        this.f17887b = listener.mo16682a();
        this.f17888c = listener.mo16692k();
        this.f17889d = listener.mo16690i();
        this.f17890e = new Matrix();
        this.f17891f = new Matrix();
        this.f17892g = new RectF();
        this.f17893h = new RectF();
        Float fValueOf = Float.valueOf(0.0f);
        this.f17894i = new Pair(fValueOf, fValueOf);
        this.f17895j = true;
        this.f17896k = new ArrayList();
        this.f17897l = AbstractC9878b.g.f17643a;
        this.f17898m = new C9952e(null, null, null, null, null, null, null, null, null, null, 1023, null);
        this.f17899n = new C9950c(null, null, null, null, null, 31, null);
        this.f17903r = new ArrayList();
    }

    /* renamed from: V */
    public static /* synthetic */ void m17155V(AbstractC9948a abstractC9948a, boolean z9, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSelectRectF");
        }
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        abstractC9948a.m17170U(z9);
    }

    /* renamed from: c */
    private final float m17156c(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: d */
    private final float m17157d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m17156c(f12 - f10, f13 - f11) - m17156c(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: A */
    public boolean mo7228A(float f10, float f11) {
        return true;
    }

    /* renamed from: B */
    public boolean mo7267B(float f10, float f11) {
        return false;
    }

    /* renamed from: C */
    public boolean mo7229C(float f10, float f11) {
        AbstractC9878b abstractC9878b = this.f17897l;
        if (Intrinsics.areEqual(abstractC9878b, AbstractC9878b.h.f17644a)) {
            m17158F(f10, f11);
        } else if (Intrinsics.areEqual(abstractC9878b, AbstractC9878b.i.f17645a)) {
            m17159G(f10, f11);
        } else {
            if (!Intrinsics.areEqual(abstractC9878b, AbstractC9878b.b.f17635a)) {
                return false;
            }
            m17160H(f10, f11);
        }
        this.f17890e.postConcat(this.f17891f);
        Matrix matrixM17172e = m17172e(this.f17891f);
        this.f17891f.reset();
        this.f17887b.mo223z(this.f17896k, matrixM17172e);
        this.f17902q = false;
        m17155V(this, false, 1, null);
        this.f17903r.add(AbstractC9695n.m16201c(matrixM17172e, System.currentTimeMillis()));
        this.f17886a.mo16684c(this.f17896k, this.f17903r);
        this.f17886a.mo16693l();
        return true;
    }

    /* renamed from: D */
    public boolean mo7230D(float f10, float f11) {
        return true;
    }

    /* renamed from: E */
    public boolean mo7231E(float f10, float f11) {
        AbstractC9878b abstractC9878b = this.f17897l;
        if (Intrinsics.areEqual(abstractC9878b, AbstractC9878b.h.f17644a)) {
            m17158F(f10, f11);
        } else if (Intrinsics.areEqual(abstractC9878b, AbstractC9878b.i.f17645a)) {
            m17159G(f10, f11);
        } else {
            if (!Intrinsics.areEqual(abstractC9878b, AbstractC9878b.b.f17635a)) {
                return false;
            }
            m17160H(f10, f11);
        }
        if (!this.f17902q) {
            this.f17887b.mo201d();
            this.f17887b.mo218u(this.f17896k);
            this.f17902q = true;
        }
        Matrix matrixM17172e = m17172e(this.f17891f);
        this.f17903r.add(AbstractC9695n.m16201c(matrixM17172e, System.currentTimeMillis()));
        this.f17887b.mo206i(this.f17896k, matrixM17172e);
        return true;
    }

    /* renamed from: F */
    public final void m17158F(float f10, float f11) {
        PointF pointFM16206d = C9696o.f17133a.m16206d(this.f17892g.centerX(), this.f17892g.centerY(), this.f17890e);
        this.f17891f.setRotate((float) Math.toDegrees(m17156c(f10 - pointFM16206d.x, f11 - pointFM16206d.y) - m17156c(this.f17900o - pointFM16206d.x, this.f17901p - pointFM16206d.y)), pointFM16206d.x, pointFM16206d.y);
    }

    /* renamed from: G */
    public final void m17159G(float f10, float f11) {
        C9696o c9696o = C9696o.f17133a;
        PointF pointFM16206d = c9696o.m16206d(this.f17892g.centerX(), this.f17892g.centerY(), this.f17890e);
        RectF rectF = this.f17892g;
        PointF pointFM16206d2 = c9696o.m16206d(rectF.right, rectF.bottom, this.f17890e);
        float fM17157d = m17157d(pointFM16206d.x, pointFM16206d.y, pointFM16206d2.x, pointFM16206d2.y, this.f17900o, this.f17901p, f10, f11);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM16206d.x - pointFM16206d2.x, d10)) + ((float) Math.pow(pointFM16206d.y - pointFM16206d2.y, d10)));
        float f12 = fM17157d + fSqrt;
        float fM16459J = ((this.f17888c.m16459J() * fSqrt) * 2) / this.f17890e.mapRadius(Math.min(this.f17892g.width(), this.f17892g.height()));
        if (f12 < fM16459J) {
            f12 = fM16459J;
        }
        float f13 = f12 / fSqrt;
        this.f17891f.setScale(f13, f13, pointFM16206d.x, pointFM16206d.y);
    }

    /* renamed from: H */
    public final void m17160H(float f10, float f11) {
        this.f17891f.setTranslate(f10 - this.f17900o, f11 - this.f17901p);
    }

    /* renamed from: I */
    public void m17161I() {
        this.f17891f.reset();
        this.f17903r.clear();
    }

    /* renamed from: J */
    public abstract boolean mo7232J(float f10, float f11);

    /* renamed from: K */
    public final boolean m17162K() {
        return this.f17895j;
    }

    /* renamed from: L */
    public void mo7233L() {
        this.f17892g.setEmpty();
        this.f17890e.reset();
        this.f17891f.reset();
        this.f17896k.clear();
        this.f17897l = AbstractC9878b.g.f17643a;
        this.f17904s = null;
    }

    /* renamed from: M */
    public final void m17163M(AbstractC9878b abstractC9878b) {
        Intrinsics.checkNotNullParameter(abstractC9878b, "<set-?>");
        this.f17897l = abstractC9878b;
    }

    /* renamed from: N */
    public final void m17164N(boolean z9) {
        this.f17895j = z9;
    }

    /* renamed from: O */
    public final void m17165O(float f10, float f11) {
        this.f17900o = f10;
        this.f17901p = f11;
    }

    /* renamed from: P */
    public void mo7234P(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        this.f17896k.clear();
        this.f17896k.addAll(graphList);
    }

    /* renamed from: Q */
    public final void m17166Q(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        this.f17892g.set(rectF);
    }

    /* renamed from: R */
    public final void m17167R(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<set-?>");
        this.f17894i = pair;
    }

    /* renamed from: S */
    public final void m17168S(RectF rectF, Matrix matrix, PointF pointF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f17892g.set(rectF);
        this.f17890e.set(matrix);
        this.f17904s = pointF;
    }

    /* renamed from: T */
    public final void m17169T(PointF pointF) {
        this.f17904s = pointF;
    }

    /* renamed from: U */
    public final void m17170U(boolean z9) {
        if (z9) {
            this.f17893h.set(mo7252s());
            this.f17895j = m17180n(this.f17893h, m17188w(), m17182p(), this.f17894i);
            mo7235X();
            m17171W();
        }
        PointF pointF = this.f17904s;
        this.f17887b.mo205h(this.f17892g, m17175i(), this.f17893h, this.f17898m, this.f17899n, mo7249h(), pointF != null ? C9696o.f17133a.m16207e(pointF, m17175i()) : null);
    }

    /* renamed from: W */
    public final void m17171W() {
        C9952e c9952e = this.f17898m;
        C9950c c9950c = this.f17899n;
        RectF rectFM17197c = c9950c.m17197c();
        rectFM17197c.setEmpty();
        rectFM17197c.union(c9952e.m17223i());
        rectFM17197c.union(c9952e.m17220f());
        rectFM17197c.union(c9952e.m17218d());
        rectFM17197c.union(c9952e.m17219e());
        rectFM17197c.union(c9952e.m17217c());
        rectFM17197c.left -= 8.0f;
        rectFM17197c.right += 8.0f;
        ArrayList arrayListM17224j = c9952e.m17224j();
        if (!arrayListM17224j.isEmpty()) {
            c9950c.m17199e().set(((RectF) CollectionsKt.first((List) arrayListM17224j)).left - 16.0f, ((RectF) CollectionsKt.first((List) arrayListM17224j)).top, ((RectF) CollectionsKt.last((List) arrayListM17224j)).right + 16.0f, ((RectF) CollectionsKt.first((List) arrayListM17224j)).bottom);
        }
        c9950c.m17198d().set(c9952e.m17222h().left, c9952e.m17222h().top, c9952e.m17221g().right, c9952e.m17221g().bottom);
        if (!c9952e.m17215a().isEmpty()) {
            float fM16455F = (this.f17888c.m16455F() - 38.0f) / 2;
            c9950c.m17195a().set(((RectF) CollectionsKt.first((List) c9952e.m17215a())).left - 23.0f, ((RectF) CollectionsKt.first((List) c9952e.m17215a())).top - fM16455F, ((RectF) CollectionsKt.last((List) c9952e.m17215a())).right + 23.0f, ((RectF) CollectionsKt.last((List) c9952e.m17215a())).bottom + fM16455F);
        }
        c9950c.m17196b().set(c9952e.m17216b());
    }

    /* renamed from: X */
    public abstract void mo7235X();

    /* renamed from: e */
    public final Matrix m17172e(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f17889d.m17344b());
        matrix2.postConcat(matrix);
        matrix2.postConcat(AbstractC9695n.m16200b(this.f17889d.m17344b()));
        return matrix2;
    }

    /* renamed from: f */
    public final C9763b m17173f() {
        return this.f17888c;
    }

    /* renamed from: g */
    public final AbstractC9878b m17174g() {
        return this.f17897l;
    }

    /* renamed from: h */
    public abstract List mo7249h();

    /* renamed from: i */
    public final Matrix m17175i() {
        Matrix matrix = new Matrix(this.f17890e);
        matrix.postConcat(this.f17891f);
        return matrix;
    }

    /* renamed from: j */
    public final float m17176j() {
        return this.f17900o;
    }

    /* renamed from: k */
    public final float m17177k() {
        return this.f17901p;
    }

    /* renamed from: l */
    public final C9950c m17178l() {
        return this.f17899n;
    }

    /* renamed from: m */
    public final C9952e m17179m() {
        return this.f17898m;
    }

    /* renamed from: n */
    public final boolean m17180n(RectF functionRectF, RectF selectRectF, RectF limitRectF, Pair pair) {
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(limitRectF, "limitRectF");
        Intrinsics.checkNotNullParameter(pair, "pair");
        float f10 = selectRectF.left;
        float fM16455F = selectRectF.bottom + 14.0f;
        if (fM16455F > limitRectF.bottom - ((Number) pair.getSecond()).floatValue()) {
            fM16455F = (selectRectF.top - this.f17888c.m16455F()) - 14.0f;
        }
        float f11 = limitRectF.top;
        if (fM16455F < f11) {
            fM16455F = f11;
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
        functionRectF.top = fM16455F;
        functionRectF.right += f10;
        functionRectF.bottom += fM16455F;
        return z9;
    }

    /* renamed from: o */
    public final InterfaceC0039c m17181o() {
        return this.f17887b;
    }

    /* renamed from: p */
    public final RectF m17182p() {
        RectF rectFMo213p = this.f17887b.mo213p();
        RectF rectF = new RectF(rectFMo213p);
        if (this.f17888c.m16519z().m16528g()) {
            RectF rectF2 = new RectF(0.0f, 0.0f, rectFMo213p.width() * this.f17888c.m16519z().m16524c(), rectFMo213p.height() * this.f17888c.m16519z().m16523b());
            this.f17889d.m17344b().mapRect(rectF2);
            rectF.intersect(rectF2);
        }
        return rectF;
    }

    /* renamed from: q */
    public final InterfaceC9822b m17183q() {
        return this.f17886a;
    }

    /* renamed from: r */
    public final C9998a m17184r() {
        return this.f17889d;
    }

    /* renamed from: s */
    public abstract RectF mo7252s();

    /* renamed from: t */
    public final RectF m17185t() {
        return this.f17893h;
    }

    /* renamed from: u */
    public final ArrayList m17186u() {
        return this.f17896k;
    }

    /* renamed from: v */
    public final RectF m17187v() {
        return this.f17892g;
    }

    /* renamed from: w */
    public final RectF m17188w() {
        RectF rectF = new RectF(this.f17892g);
        m17175i().mapRect(rectF);
        return rectF;
    }

    /* renamed from: x */
    public final Pair m17189x() {
        return this.f17894i;
    }

    /* renamed from: y */
    public final Matrix m17190y() {
        return this.f17890e;
    }

    /* renamed from: z */
    public final PointF m17191z() {
        return this.f17904s;
    }
}
