package p348t9;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.InterfaceC5181c;
import ca.C5412b;
import ca.C5414d;
import com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction;
import com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p134ea.AbstractC9113c;
import p322r9.InterfaceC10918b;

/* renamed from: t9.c */
/* loaded from: classes5.dex */
public final class C11256c {

    /* renamed from: a */
    public final C11255b f27042a;

    /* renamed from: b */
    public final C11259f f27043b;

    /* renamed from: c */
    public final TextFunction f27044c;

    /* renamed from: d */
    public final C11258e f27045d;

    /* renamed from: e */
    public final ImageFunction f27046e;

    /* renamed from: f */
    public AbstractC11254a f27047f;

    public C11256c(InterfaceC10918b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f27042a = new C11255b(listener);
        this.f27043b = new C11259f(listener);
        this.f27044c = new TextFunction(listener);
        this.f27045d = new C11258e(listener);
        this.f27046e = new ImageFunction(listener);
    }

    /* renamed from: a */
    public final boolean m25155a(float f10, float f11) {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            return abstractC11254a.mo13879w(f10, f11);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m25156b(float f10, float f11) {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            return abstractC11254a.mo13892x(f10, f11);
        }
        return false;
    }

    /* renamed from: c */
    public final void m25157c(float f10, float f11) {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.mo13893y(f10, f11);
        }
    }

    /* renamed from: d */
    public final void m25158d(float f10, float f11) {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.mo13894z(f10, f11);
        }
    }

    /* renamed from: e */
    public final void m25159e(float f10, float f11) {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.mo13886A(f10, f11);
        }
    }

    /* renamed from: f */
    public final void m25160f(List graphList) {
        AbstractC11254a abstractC11254a;
        AbstractC9979u.m20294g(graphList, "graphList");
        Iterator it = graphList.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
            if (interfaceC5181c instanceof C5414d) {
                i12++;
            } else if (interfaceC5181c instanceof C5412b) {
                i13++;
            } else if (interfaceC5181c instanceof ImageGraph) {
                i14++;
            }
            for (InterfaceC5181c interfaceC5181c2 : interfaceC5181c.mo2717f()) {
                if (interfaceC5181c2 instanceof AbstractC9113c) {
                    if (((AbstractC9113c) interfaceC5181c2).m17920I()) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
            }
        }
        int i15 = i10 + i11 + i12 + i13 + i14;
        if (i15 == 0) {
            C11255b c11255b = this.f27042a;
            c11255b.m25154U(false);
            abstractC11254a = c11255b;
        } else if (i15 == i10) {
            C11259f c11259f = this.f27043b;
            c11259f.m25189U(false);
            abstractC11254a = c11259f;
        } else if (i15 == i11) {
            C11259f c11259f2 = this.f27043b;
            c11259f2.m25189U(true);
            abstractC11254a = c11259f2;
        } else if (i15 == i12) {
            abstractC11254a = this.f27044c;
        } else if (i15 == i13) {
            abstractC11254a = this.f27045d;
        } else if (i15 == i14) {
            abstractC11254a = i15 == 1 ? this.f27046e : this.f27042a;
        } else {
            C11255b c11255b2 = this.f27042a;
            c11255b2.m25154U(i12 > 0);
            abstractC11254a = c11255b2;
        }
        this.f27047f = abstractC11254a;
    }

    /* renamed from: g */
    public final void m25161g() {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.m25125E();
        }
    }

    /* renamed from: h */
    public final boolean m25162h(float f10, float f11) {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            return abstractC11254a.mo13874F(f10, f11);
        }
        return false;
    }

    /* renamed from: i */
    public final void m25163i() {
        this.f27042a.mo13875H();
        this.f27043b.mo13875H();
        this.f27044c.mo13875H();
        this.f27045d.mo13875H();
        this.f27047f = null;
    }

    /* renamed from: j */
    public final void m25164j(float f10, float f11) {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.m25129K(f10, f11);
        }
    }

    /* renamed from: k */
    public final void m25165k(List graphList) {
        AbstractC9979u.m20294g(graphList, "graphList");
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.mo13887L(graphList);
        }
    }

    /* renamed from: l */
    public final void m25166l(RectF rectF) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.m25130M(rectF);
        }
    }

    /* renamed from: m */
    public final void m25167m(RectF rectF, Matrix matrix, PointF pointF) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            abstractC11254a.m25131N(rectF, matrix, pointF);
        }
    }

    /* renamed from: n */
    public final void m25168n() {
        AbstractC11254a abstractC11254a = this.f27047f;
        if (abstractC11254a != null) {
            AbstractC11254a.m25119Q(abstractC11254a, false, 1, null);
        }
    }
}
