package p120i4;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction;
import com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction;
import com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction;
import com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p098g4.InterfaceC7522b;
import p210q4.InterfaceC8888c;
import p221r4.C9006b;
import p221r4.C9008d;
import p243t4.AbstractC9384c;

/* renamed from: i4.d */
/* loaded from: classes4.dex */
public final class C7664d {

    /* renamed from: a */
    public final C7662b f12950a;

    /* renamed from: b */
    public final WriteFunction f12951b;

    /* renamed from: c */
    public final TextFunction f12952c;

    /* renamed from: d */
    public final GeometryFunction f12953d;

    /* renamed from: e */
    public final ImageFunction f12954e;

    /* renamed from: f */
    public AbstractC7661a f12955f;

    public C7664d(InterfaceC7522b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12950a = new C7662b(listener);
        this.f12951b = new WriteFunction(listener);
        this.f12952c = new TextFunction(listener);
        this.f12953d = new GeometryFunction(listener);
        this.f12954e = new ImageFunction(listener);
    }

    /* renamed from: a */
    public final boolean m12778a(float f10, float f11) {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            return abstractC7661a.mo6132A(f10, f11);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m12779b(float f10, float f11) {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            return abstractC7661a.mo6171B(f10, f11);
        }
        return false;
    }

    /* renamed from: c */
    public final void m12780c(float f10, float f11) {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.mo6133C(f10, f11);
        }
    }

    /* renamed from: d */
    public final void m12781d(float f10, float f11) {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.mo6134D(f10, f11);
        }
    }

    /* renamed from: e */
    public final void m12782e(float f10, float f11) {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.mo6135E(f10, f11);
        }
    }

    /* renamed from: f */
    public final void m12783f(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Object obj = this.f12955f;
        InterfaceC7666f interfaceC7666f = obj instanceof InterfaceC7666f ? (InterfaceC7666f) obj : null;
        if (interfaceC7666f != null) {
            interfaceC7666f.mo6142a(motionEvent);
        }
    }

    /* renamed from: g */
    public final void m12784g(List graphList) {
        AbstractC7661a abstractC7661a;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Iterator it = graphList.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it.next();
            if (interfaceC8888c instanceof C9008d) {
                i12++;
            } else if (interfaceC8888c instanceof C9006b) {
                i13++;
            } else if (interfaceC8888c instanceof ImageGraph) {
                i14++;
            }
            for (InterfaceC8888c interfaceC8888c2 : interfaceC8888c.mo14995f()) {
                if (interfaceC8888c2 instanceof AbstractC9384c) {
                    if (((AbstractC9384c) interfaceC8888c2).m15691I()) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
            }
        }
        int i15 = i10 + i11 + i12 + i13 + i14;
        if (i15 == 0) {
            C7662b c7662b = this.f12950a;
            c7662b.m12772a0(false);
            abstractC7661a = c7662b;
        } else if (i15 == i10) {
            WriteFunction writeFunction = this.f12951b;
            writeFunction.m6184e0(false);
            abstractC7661a = writeFunction;
        } else if (i15 == i11) {
            WriteFunction writeFunction2 = this.f12951b;
            writeFunction2.m6184e0(true);
            abstractC7661a = writeFunction2;
        } else if (i15 == i12) {
            abstractC7661a = this.f12952c;
        } else if (i15 == i13) {
            abstractC7661a = this.f12953d;
        } else if (i15 == i14) {
            abstractC7661a = i15 == 1 ? this.f12954e : this.f12950a;
        } else {
            C7662b c7662b2 = this.f12950a;
            c7662b2.m12772a0(i12 > 0);
            abstractC7661a = c7662b2;
        }
        this.f12955f = abstractC7661a;
    }

    /* renamed from: h */
    public final void m12785h() {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.m12739I();
        }
    }

    /* renamed from: i */
    public final boolean m12786i(float f10, float f11) {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            return abstractC7661a.mo6136J(f10, f11);
        }
        return false;
    }

    /* renamed from: j */
    public final void m12787j() {
        Object obj = this.f12955f;
        InterfaceC7666f interfaceC7666f = obj instanceof InterfaceC7666f ? (InterfaceC7666f) obj : null;
        if (interfaceC7666f != null) {
            interfaceC7666f.mo6144b();
        }
        this.f12950a.mo6137L();
        this.f12951b.mo6137L();
        this.f12952c.mo6137L();
        this.f12953d.mo6137L();
        this.f12955f = null;
    }

    /* renamed from: k */
    public final void m12788k(float f10, float f11) {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.m12743O(f10, f11);
        }
    }

    /* renamed from: l */
    public final void m12789l(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.mo6138P(graphList);
        }
    }

    /* renamed from: m */
    public final void m12790m(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.m12744Q(rectF);
        }
    }

    /* renamed from: n */
    public final void m12791n(RectF rectF, Matrix matrix, PointF pointF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            abstractC7661a.m12746S(rectF, matrix, pointF);
        }
    }

    /* renamed from: o */
    public final void m12792o() {
        AbstractC7661a abstractC7661a = this.f12955f;
        if (abstractC7661a != null) {
            AbstractC7661a.m12733V(abstractC7661a, false, 1, null);
        }
    }
}
