package p302y4;

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
import p117g5.InterfaceC8055c;
import p127h5.C8099b;
import p127h5.C8101d;
import p147j5.AbstractC8216c;
import p282w4.InterfaceC9822b;

/* renamed from: y4.d */
/* loaded from: classes4.dex */
public final class C9951d {

    /* renamed from: a */
    public final C9949b f17913a;

    /* renamed from: b */
    public final WriteFunction f17914b;

    /* renamed from: c */
    public final TextFunction f17915c;

    /* renamed from: d */
    public final GeometryFunction f17916d;

    /* renamed from: e */
    public final ImageFunction f17917e;

    /* renamed from: f */
    public AbstractC9948a f17918f;

    public C9951d(InterfaceC9822b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17913a = new C9949b(listener);
        this.f17914b = new WriteFunction(listener);
        this.f17915c = new TextFunction(listener);
        this.f17916d = new GeometryFunction(listener);
        this.f17917e = new ImageFunction(listener);
    }

    /* renamed from: a */
    public final boolean m17200a(float f10, float f11) {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            return abstractC9948a.mo7228A(f10, f11);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m17201b(float f10, float f11) {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            return abstractC9948a.mo7267B(f10, f11);
        }
        return false;
    }

    /* renamed from: c */
    public final void m17202c(float f10, float f11) {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.mo7229C(f10, f11);
        }
    }

    /* renamed from: d */
    public final void m17203d(float f10, float f11) {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.mo7230D(f10, f11);
        }
    }

    /* renamed from: e */
    public final void m17204e(float f10, float f11) {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.mo7231E(f10, f11);
        }
    }

    /* renamed from: f */
    public final void m17205f(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Object obj = this.f17918f;
        InterfaceC9953f interfaceC9953f = obj instanceof InterfaceC9953f ? (InterfaceC9953f) obj : null;
        if (interfaceC9953f != null) {
            interfaceC9953f.mo7238a(motionEvent);
        }
    }

    /* renamed from: g */
    public final void m17206g(List graphList) {
        AbstractC9948a abstractC9948a;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Iterator it = graphList.iterator();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
            if (interfaceC8055c instanceof C8101d) {
                i11++;
            } else if (interfaceC8055c instanceof C8099b) {
                i12++;
            } else if (interfaceC8055c instanceof ImageGraph) {
                i13++;
            }
            for (InterfaceC8055c interfaceC8055c2 : interfaceC8055c.mo12796e()) {
                if (interfaceC8055c2 instanceof AbstractC8216c) {
                    if (((AbstractC8216c) interfaceC8055c2).m13242H()) {
                        i10++;
                    } else {
                        i9++;
                    }
                }
            }
        }
        int i14 = i9 + i10 + i11 + i12 + i13;
        if (i14 == 0) {
            C9949b c9949b = this.f17913a;
            c9949b.m17194a0(false);
            abstractC9948a = c9949b;
        } else if (i14 == i9) {
            WriteFunction writeFunction = this.f17914b;
            writeFunction.m7280e0(false);
            abstractC9948a = writeFunction;
        } else if (i14 == i10) {
            WriteFunction writeFunction2 = this.f17914b;
            writeFunction2.m7280e0(true);
            abstractC9948a = writeFunction2;
        } else if (i14 == i11) {
            abstractC9948a = this.f17915c;
        } else if (i14 == i12) {
            abstractC9948a = this.f17916d;
        } else if (i14 == i13) {
            abstractC9948a = i14 == 1 ? this.f17917e : this.f17913a;
        } else {
            C9949b c9949b2 = this.f17913a;
            c9949b2.m17194a0(i11 > 0);
            abstractC9948a = c9949b2;
        }
        this.f17918f = abstractC9948a;
    }

    /* renamed from: h */
    public final void m17207h() {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.m17161I();
        }
    }

    /* renamed from: i */
    public final boolean m17208i(float f10, float f11) {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            return abstractC9948a.mo7232J(f10, f11);
        }
        return false;
    }

    /* renamed from: j */
    public final void m17209j() {
        Object obj = this.f17918f;
        InterfaceC9953f interfaceC9953f = obj instanceof InterfaceC9953f ? (InterfaceC9953f) obj : null;
        if (interfaceC9953f != null) {
            interfaceC9953f.mo7240b();
        }
        this.f17913a.mo7233L();
        this.f17914b.mo7233L();
        this.f17915c.mo7233L();
        this.f17916d.mo7233L();
        this.f17918f = null;
    }

    /* renamed from: k */
    public final void m17210k(float f10, float f11) {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.m17165O(f10, f11);
        }
    }

    /* renamed from: l */
    public final void m17211l(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.mo7234P(graphList);
        }
    }

    /* renamed from: m */
    public final void m17212m(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.m17166Q(rectF);
        }
    }

    /* renamed from: n */
    public final void m17213n(RectF rectF, Matrix matrix, PointF pointF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            abstractC9948a.m17168S(rectF, matrix, pointF);
        }
    }

    /* renamed from: o */
    public final void m17214o() {
        AbstractC9948a abstractC9948a = this.f17918f;
        if (abstractC9948a != null) {
            AbstractC9948a.m17155V(abstractC9948a, false, 1, null);
        }
    }
}
