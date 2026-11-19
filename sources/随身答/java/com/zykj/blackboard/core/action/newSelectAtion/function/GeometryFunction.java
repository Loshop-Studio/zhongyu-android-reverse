package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p117g5.InterfaceC8055c;
import p127h5.C8099b;
import p243s5.InterfaceC9477e;
import p253t5.InterfaceC9615a;
import p263u5.AbstractC9695n;
import p263u5.C9696o;
import p282w4.InterfaceC9822b;
import p292x4.AbstractC9878b;
import p292x4.AbstractC9879c;
import p292x4.AbstractC9880d;
import p292x4.AbstractC9882f;
import p302y4.AbstractC9948a;
import p302y4.C9952e;
import p302y4.InterfaceC9953f;

/* loaded from: classes4.dex */
public final class GeometryFunction extends AbstractC9948a implements InterfaceC9953f {

    /* renamed from: A */
    public final PointF f8334A;

    /* renamed from: B */
    public final PointF f8335B;

    /* renamed from: u */
    public Integer f8336u;

    /* renamed from: v */
    public final ArrayList f8337v;

    /* renamed from: w */
    public final ArrayList f8338w;

    /* renamed from: x */
    public final ArrayList f8339x;

    /* renamed from: y */
    public float f8340y;

    /* renamed from: z */
    public float f8341z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeometryFunction(InterfaceC9822b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8337v = new ArrayList();
        this.f8338w = new ArrayList();
        this.f8339x = new ArrayList();
        this.f8334A = new PointF();
        this.f8335B = new PointF();
        m7247f0();
        m7246e0();
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: A */
    public boolean mo7228A(float f10, float f11) {
        if (!super.mo7228A(f10, f11)) {
            return false;
        }
        AbstractC9878b abstractC9878bM17174g = m17174g();
        if (abstractC9878bM17174g instanceof AbstractC9878b.d) {
            AbstractC9878b abstractC9878bM17174g2 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM16889a = ((AbstractC9878b.d) abstractC9878bM17174g2).m16889a();
            if (iM16889a == 0) {
                AbstractC9879c.b bVarM16911d = AbstractC9880d.m16911d(this.f8337v);
                if (bVarM16911d != null) {
                    bVarM16911d.m16893c(!bVarM16911d.m16892b());
                    m17170U(false);
                }
            } else if (iM16889a == 1) {
                m17181o().mo212o(m17186u());
                m17181o().mo201d();
                m17183q().mo16695n(m17186u(), System.currentTimeMillis());
                m17183q().mo16693l();
                mo7233L();
            }
        } else if (abstractC9878bM17174g instanceof AbstractC9878b.a) {
            AbstractC9878b abstractC9878bM17174g3 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iM16888a = ((AbstractC9878b.a) abstractC9878bM17174g3).m16888a();
            final List listM7237Z = m7237Z();
            if (listM7237Z == null) {
                return true;
            }
            Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction$handleClick$changeColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i9) {
                    C8099b c8099b;
                    Paint paintM12937I;
                    ArrayList arrayListM17186u = this.f8342a.m17186u();
                    GeometryFunction geometryFunction = this.f8342a;
                    int size = arrayListM17186u.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListM17186u.get(i10);
                        i10++;
                        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) obj;
                        if ((interfaceC8055c instanceof C8099b) && (paintM12937I = (c8099b = (C8099b) interfaceC8055c).m12937I()) != null) {
                            paintM12937I.setColor(i9);
                            c8099b.m12940L(paintM12937I);
                            InterfaceC9822b.a.m16708a(geometryFunction.m17183q(), interfaceC8055c, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, new Paint(paintM12937I), null, null, null, 236, null);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("GeometryFunction:GeometryColor -> color:");
                    sb.append(i9);
                    sb.append(" list: ");
                    ArrayList arrayListM17186u2 = this.f8342a.m17186u();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM17186u2, 10));
                    int size2 = arrayListM17186u2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayListM17186u2.get(i11);
                        i11++;
                        arrayList.add(((InterfaceC8055c) obj2).getId());
                    }
                    sb.append(arrayList);
                    LogUtils.m2956i(sb.toString());
                    InterfaceC9477e interfaceC9477eMo16685d = this.f8342a.m17183q().mo16685d();
                    if (interfaceC9477eMo16685d != null) {
                        interfaceC9477eMo16685d.mo2220a(i9);
                    }
                    this.f8342a.m17181o().mo202e();
                    this.f8342a.m17183q().mo16693l();
                    List list = listM7237Z;
                    final GeometryFunction geometryFunction2 = this.f8342a;
                    AbstractC9880d.m16914g(list, i9, new Function1<Integer, Boolean>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Boolean invoke(int i12) {
                            InterfaceC9615a interfaceC9615aM16456G = geometryFunction2.m17173f().m16456G();
                            return Boolean.valueOf(interfaceC9615aM16456G != null ? interfaceC9615aM16456G.mo11224c(i12) : false);
                        }
                    });
                    GeometryFunction geometryFunction3 = this.f8342a;
                    AbstractC9882f.b bVarM16910c = AbstractC9880d.m16910c(listM7237Z);
                    geometryFunction3.m7250h0(bVarM16910c != null ? Integer.valueOf(bVarM16910c.m16921a()) : null);
                    this.f8342a.m17170U(false);
                }
            };
            if (listM7237Z.get(iM16888a) instanceof AbstractC9882f.b) {
                AbstractC9882f.b bVarM16910c = AbstractC9880d.m16910c(listM7237Z);
                if (bVarM16910c == null || !bVarM16910c.m16925e()) {
                    if (bVarM16910c != null) {
                        bVarM16910c.m16926f(true);
                    }
                    InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
                    if (interfaceC9615aM16456G != null) {
                        interfaceC9615aM16456G.mo11225d(function1);
                    }
                    AbstractC9882f.b bVarM16910c2 = AbstractC9880d.m16910c(listM7237Z);
                    int iM16921a = bVarM16910c2 != null ? bVarM16910c2.m16921a() : 0;
                    InterfaceC9615a interfaceC9615aM16456G2 = m17173f().m16456G();
                    if (interfaceC9615aM16456G2 == null || !interfaceC9615aM16456G2.mo11224c(iM16921a)) {
                        AbstractC9880d.m16915h(listM7237Z);
                        m17170U(false);
                    } else {
                        function1.invoke(Integer.valueOf(iM16921a));
                    }
                } else {
                    bVarM16910c.m16926f(false);
                    InterfaceC9615a interfaceC9615aM16456G3 = m17173f().m16456G();
                    if (interfaceC9615aM16456G3 != null) {
                        interfaceC9615aM16456G3.mo11225d(null);
                    }
                    m17170U(false);
                }
            } else {
                function1.invoke(Integer.valueOf(((AbstractC9882f) listM7237Z.get(iM16888a)).m16921a()));
            }
        }
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: C */
    public boolean mo7229C(float f10, float f11) {
        if (super.mo7229C(f10, f11)) {
            return true;
        }
        AbstractC9878b abstractC9878bM17174g = m17174g();
        if (abstractC9878bM17174g instanceof AbstractC9878b.c) {
            AbstractC9878b abstractC9878bM17174g2 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            m7245d0((AbstractC9878b.c) abstractC9878bM17174g2, f10, f11);
            m7251i0();
            m7236Y();
            PointF pointFM17191z = m17191z();
            PointF pointFM16207e = pointFM17191z != null ? C9696o.f17133a.m16207e(pointFM17191z, m17175i()) : null;
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
            if (interfaceC8055c != null) {
                m17181o().mo219v(m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), pointFM16207e);
                InterfaceC9822b.a.m16708a(m17183q(), interfaceC8055c, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, interfaceC8055c.mo12797f(), null, null, null, null, null, 248, null);
            }
            m17183q().mo16693l();
        } else {
            if (!(abstractC9878bM17174g instanceof AbstractC9878b.f)) {
                return false;
            }
            m7243c0(f10, f11);
            PointF pointFM17191z2 = m17191z();
            PointF pointFM16207e2 = pointFM17191z2 != null ? C9696o.f17133a.m16207e(pointFM17191z2, m17175i()) : null;
            InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
            if (interfaceC8055c2 != null) {
                m17181o().mo219v(m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), pointFM16207e2);
                InterfaceC9822b.a.m16708a(m17183q(), interfaceC8055c2, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, null, ((C8099b) interfaceC8055c2).m12938J(), null, null, 220, null);
            }
            m17183q().mo16693l();
        }
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: D */
    public boolean mo7230D(float f10, float f11) {
        AbstractC9878b abstractC9878bM17174g = m17174g();
        if (!(abstractC9878bM17174g instanceof AbstractC9878b.c)) {
            if (!(abstractC9878bM17174g instanceof AbstractC9878b.f)) {
                return true;
            }
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
            if (interfaceC8055c == null) {
                return false;
            }
            C8099b c8099b = (C8099b) interfaceC8055c;
            Matrix matrix = new Matrix();
            matrix.postConcat(c8099b.mo12794b());
            matrix.postConcat(m17184r().m17344b());
            PointF pointF = this.f8334A;
            C9696o c9696o = C9696o.f17133a;
            pointF.set(c9696o.m16206d(c8099b.mo12797f().left, c8099b.mo12797f().top, matrix));
            this.f8335B.set(c9696o.m16206d(c8099b.mo12797f().right, c8099b.mo12797f().top, matrix));
            PointF pointFM17191z = m17191z();
            PointF pointFM16207e = pointFM17191z != null ? c9696o.m16207e(pointFM17191z, m17175i()) : null;
            InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
            if (interfaceC8055c2 == null) {
                return true;
            }
            m17181o().mo208k((C8099b) interfaceC8055c2, m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), pointFM16207e);
            return true;
        }
        InterfaceC8055c interfaceC8055c3 = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c3 == null) {
            return false;
        }
        C8099b c8099b2 = (C8099b) interfaceC8055c3;
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(c8099b2.mo12794b());
        matrix2.postConcat(m17184r().m17344b());
        this.f8340y = matrix2.mapRadius(c8099b2.mo12797f().width());
        this.f8341z = matrix2.mapRadius(c8099b2.mo12797f().height());
        LogUtils.m2956i("GeometryFunction:changeFrame -> start graph:" + c8099b2.getId());
        m7251i0();
        m7236Y();
        PointF pointFM17191z2 = m17191z();
        PointF pointFM16207e2 = pointFM17191z2 != null ? C9696o.f17133a.m16207e(pointFM17191z2, m17175i()) : null;
        InterfaceC8055c interfaceC8055c4 = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c4 == null) {
            return true;
        }
        m17181o().mo208k((C8099b) interfaceC8055c4, m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), pointFM16207e2);
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: E */
    public boolean mo7231E(float f10, float f11) {
        if (super.mo7231E(f10, f11)) {
            return true;
        }
        AbstractC9878b abstractC9878bM17174g = m17174g();
        if (abstractC9878bM17174g instanceof AbstractC9878b.c) {
            AbstractC9878b abstractC9878bM17174g2 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            m7245d0((AbstractC9878b.c) abstractC9878bM17174g2, f10, f11);
            m7251i0();
            m7236Y();
            PointF pointFM17191z = m17191z();
            PointF pointFM16207e = pointFM17191z != null ? C9696o.f17133a.m16207e(pointFM17191z, m17175i()) : null;
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
            if (interfaceC8055c != null) {
                m17181o().mo174A((C8099b) interfaceC8055c, m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), pointFM16207e);
            }
        } else {
            if (!(abstractC9878bM17174g instanceof AbstractC9878b.f)) {
                return false;
            }
            m7243c0(f10, f11);
            PointF pointFM17191z2 = m17191z();
            PointF pointFM16207e2 = pointFM17191z2 != null ? C9696o.f17133a.m16207e(pointFM17191z2, m17175i()) : null;
            InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
            if (interfaceC8055c2 != null) {
                m17181o().mo174A((C8099b) interfaceC8055c2, m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), pointFM16207e2);
            }
        }
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: J */
    public boolean mo7232J(float f10, float f11) {
        AbstractC9882f.b bVarM16910c;
        if (m17179m().m17218d().contains(f10, f11)) {
            m17163M(new AbstractC9878b.d(0));
            return true;
        }
        if (m17179m().m17217c().contains(f10, f11)) {
            m17163M(new AbstractC9878b.d(1));
            return true;
        }
        if (m17178l().m17197c().contains(f10, f11)) {
            m17163M(AbstractC9878b.e.f17641a);
            return true;
        }
        AbstractC9879c.b bVarM16911d = AbstractC9880d.m16911d(this.f8337v);
        if (bVarM16911d != null && bVarM16911d.m16892b()) {
            int size = m17179m().m17215a().size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((RectF) m17179m().m17215a().get(i9)).contains(f10, f11)) {
                    m17163M(new AbstractC9878b.a(i9));
                    return true;
                }
            }
            if (m17178l().m17195a().contains(f10, f11)) {
                m17163M(AbstractC9878b.e.f17641a);
                return true;
            }
            List listM7237Z = m7237Z();
            if (listM7237Z != null && (bVarM16910c = AbstractC9880d.m16910c(listM7237Z)) != null && bVarM16910c.m16925e()) {
                if (m17179m().m17216b().contains(f10, f11)) {
                    m17163M(AbstractC9878b.e.f17641a);
                    return true;
                }
                if (m17178l().m17196b().contains(f10, f11)) {
                    m17163M(AbstractC9878b.e.f17641a);
                    return true;
                }
            }
        }
        Matrix matrixM16200b = AbstractC9695n.m16200b(m17175i());
        float[] fArr = {f10, f11};
        matrixM16200b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM16200b.mapRadius(m17173f().m16459J());
        if (m7241b0()) {
            PointF pointFM17191z = m17191z();
            if (pointFM17191z != null) {
                float f14 = pointFM17191z.x;
                float f15 = fMapRadius / 2;
                float f16 = pointFM17191z.y;
                if (new RectF(f14 - f15, f16 - f15, f14 + f15, f16 + f15).contains(f12, f13)) {
                    m17163M(AbstractC9878b.f.f17642a);
                    return true;
                }
            }
            float f17 = fMapRadius / 2;
            if (new RectF(m17187v().left - f17, m17187v().centerY() - f17, m17187v().left + f17, m17187v().centerY() + f17).contains(f12, f13)) {
                m17163M(AbstractC9878b.c.b.f17637a);
                return true;
            }
            if (new RectF(m17187v().centerX() - f17, m17187v().top - f17, m17187v().centerX() + f17, m17187v().top + f17).contains(f12, f13)) {
                m17163M(AbstractC9878b.c.d.f17639a);
                return true;
            }
            if (new RectF(m17187v().right - f17, m17187v().centerY() - f17, m17187v().right + f17, m17187v().centerY() + f17).contains(f12, f13)) {
                m17163M(AbstractC9878b.c.C10090c.f17638a);
                return true;
            }
            if (new RectF(m17187v().centerX() - f17, m17187v().bottom - f17, m17187v().centerX() + f17, m17187v().bottom + f17).contains(f12, f13)) {
                m17163M(AbstractC9878b.c.a.f17636a);
                return true;
            }
        }
        float f18 = 2;
        float f19 = fMapRadius / f18;
        if (new RectF(m17187v().centerX() - f19, m17187v().top - ((5 * fMapRadius) / f18), m17187v().centerX() + f19, m17187v().top - ((fMapRadius * 3) / f18)).contains(f12, f13)) {
            m17163M(AbstractC9878b.h.f17644a);
            return true;
        }
        if (new RectF(m17187v().right - f19, m17187v().bottom - f19, m17187v().right + f19, m17187v().bottom + f19).contains(f12, f13)) {
            m17163M(AbstractC9878b.i.f17645a);
            return true;
        }
        if (m17187v().contains(f12, f13)) {
            m17163M(AbstractC9878b.b.f17635a);
            return true;
        }
        m17163M(AbstractC9878b.g.f17643a);
        return false;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: L */
    public void mo7233L() {
        super.mo7233L();
        m7247f0();
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            interfaceC9615aM16456G.mo11225d(null);
        }
        m7250h0(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // p302y4.AbstractC9948a
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7234P(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.mo7234P(java.util.List):void"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:3522
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: X */
    public void mo7235X() {
        C9952e c9952eM17179m = m17179m();
        int i9 = 0;
        c9952eM17179m.m17218d().set((m17185t().left + ((RectF) this.f8338w.get(0)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8338w.get(0)).right + 15.0f, m17185t().top + m17173f().m16455F());
        c9952eM17179m.m17217c().set((m17185t().left + ((RectF) this.f8338w.get(1)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8338w.get(1)).right + 15.0f, m17185t().top + m17173f().m16455F());
        c9952eM17179m.m17215a().clear();
        ArrayList arrayList = this.f8339x;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            RectF rectF = (RectF) obj;
            c9952eM17179m.m17215a().add(new RectF(m17185t().left + rectF.left, m17185t().top + m17173f().m16455F() + 13.0f + rectF.top, m17185t().left + rectF.right, m17185t().top + m17173f().m16455F() + 13.0f + rectF.bottom));
        }
        m17179m().m17216b().setEmpty();
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            List listM7237Z = m7237Z();
            if ((listM7237Z != null ? AbstractC9880d.m16910c(listM7237Z) : null) == null) {
                interfaceC9615aM16456G = null;
            }
            if (interfaceC9615aM16456G != null) {
                float f10 = 2;
                c9952eM17179m.m17216b().set(m17185t().left, m17185t().top + ((m17173f().m16455F() + 13.0f) * f10), m17185t().left + interfaceC9615aM16456G.getWidth(), m17185t().top + ((m17173f().m16455F() + 13.0f) * f10) + interfaceC9615aM16456G.getHeight());
            }
        }
        if (m17162K()) {
            return;
        }
        float f11 = (c9952eM17179m.m17217c().right - c9952eM17179m.m17218d().left) + 16.0f;
        c9952eM17179m.m17218d().offset(m17185t().width() - f11, 0.0f);
        c9952eM17179m.m17217c().offset(m17185t().width() - f11, 0.0f);
        float f12 = (((RectF) CollectionsKt.last((List) c9952eM17179m.m17215a())).right - ((RectF) CollectionsKt.first((List) c9952eM17179m.m17215a())).left) + 46.0f;
        ArrayList arrayListM17215a = c9952eM17179m.m17215a();
        int size2 = arrayListM17215a.size();
        while (i9 < size2) {
            Object obj2 = arrayListM17215a.get(i9);
            i9++;
            ((RectF) obj2).offset(m17185t().width() - f12, 0.0f);
        }
        c9952eM17179m.m17216b().offset(m17185t().width() - c9952eM17179m.m17216b().width(), 0.0f);
    }

    /* renamed from: Y */
    public final void m7236Y() {
        m17185t().set(mo7252s());
        m17164N(m17180n(m17185t(), m17188w(), m17182p(), m17189x()));
        mo7235X();
        m17171W();
    }

    /* renamed from: Z */
    public final List m7237Z() {
        AbstractC9879c.b bVarM16911d = AbstractC9880d.m16911d(this.f8337v);
        if (bVarM16911d != null) {
            return bVarM16911d.m16894d();
        }
        return null;
    }

    @Override // p302y4.InterfaceC9953f
    /* renamed from: a */
    public void mo7238a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            motionEvent.setLocation(motionEvent.getX() - m17179m().m17216b().left, motionEvent.getY() - m17179m().m17216b().top);
            interfaceC9615aM16456G.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a0 */
    public Integer m7239a0() {
        return this.f8336u;
    }

    @Override // p302y4.InterfaceC9953f
    /* renamed from: b */
    public void mo7240b() {
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            interfaceC9615aM16456G.mo11223b(m7239a0());
        }
    }

    /* renamed from: b0 */
    public final boolean m7241b0() {
        return m17186u().size() == 1;
    }

    /* renamed from: c */
    public final float m7242c(float f10, float f11) {
        if (f10 == 0.0f) {
            return (float) Math.toRadians(f11 > 0.0f ? 90.0d : -90.0d);
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: c0 */
    public final void m7243c0(float f10, float f11) {
        PointF pointF = new PointF();
        PointF pointF2 = this.f8334A;
        float f12 = pointF2.x;
        float f13 = pointF2.y;
        PointF pointF3 = this.f8335B;
        float fM7244d = m7244d(f12, f13, pointF3.x, pointF3.y, f12, f13, f10, f11);
        if (fM7244d < 0.0f) {
            pointF.set(this.f8334A);
        } else {
            PointF pointF4 = this.f8334A;
            float f14 = pointF4.x;
            PointF pointF5 = this.f8335B;
            float f15 = pointF5.x;
            float f16 = (f14 - f15) * (f14 - f15);
            float f17 = pointF4.y;
            float f18 = pointF5.y;
            float fSqrt = (float) Math.sqrt(f16 + ((f17 - f18) * (f17 - f18)));
            if (fM7244d > fSqrt) {
                pointF.set(this.f8335B);
            } else {
                float f19 = fM7244d / fSqrt;
                PointF pointF6 = this.f8334A;
                float f20 = pointF6.x;
                PointF pointF7 = this.f8335B;
                float f21 = f20 + ((pointF7.x - f20) * f19);
                float f22 = pointF6.y;
                pointF.set(f21, f22 + ((pointF7.y - f22) * f19));
            }
        }
        pointF.set(C9696o.f17133a.m16207e(pointF, AbstractC9695n.m16200b(m17175i())));
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c != null) {
            C8099b c8099b = (C8099b) interfaceC8055c;
            c8099b.m12941M(CollectionsKt.listOf((Object[]) new PointF[]{pointF, new PointF(c8099b.mo12797f().left, c8099b.mo12797f().bottom), new PointF(c8099b.mo12797f().right, c8099b.mo12797f().bottom)}));
            PointF pointFM17191z = m17191z();
            if (pointFM17191z != null) {
                pointFM17191z.set(pointF);
            }
        }
    }

    /* renamed from: d */
    public final float m7244d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m7242c(f12 - f10, f13 - f11) - m7242c(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7245d0(p292x4.AbstractC9878b.c r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.m7245d0(x4.b$c, float, float):void"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:6101
    }

    /* renamed from: e0 */
    public final void m7246e0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM16455F = (m17173f().m16455F() - f10) / f11;
        float fM16455F2 = ((m17173f().m16455F() - f10) / f11) + f10;
        ArrayList arrayList = this.f8337v;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((AbstractC9879c) obj).m16891a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            float fMeasureText = paint.measureText(((AbstractC9879c) obj2).m16891a());
            this.f8338w.add(new RectF(f12, fM16455F, f12 + fMeasureText, fM16455F2));
            f12 += fMeasureText + 30.0f;
        }
        m7248g0();
    }

    /* renamed from: f0 */
    public final void m7247f0() {
        this.f8337v.clear();
        this.f8337v.add(AbstractC9879c.d.f17654c);
        this.f8337v.add(AbstractC9879c.e.f17655c);
        this.f8337v.add(new AbstractC9879c.b(m7241b0(), AbstractC9880d.m16908a(m17173f().m16458I())));
        this.f8337v.add(AbstractC9879c.a.f17651c);
    }

    /* renamed from: g0 */
    public final void m7248g0() {
        this.f8339x.clear();
        float f10 = 2;
        float fM16455F = (m17173f().m16455F() - 38.0f) / f10;
        float fM16455F2 = ((m17173f().m16455F() - 38.0f) / f10) + 38.0f;
        int size = AbstractC9880d.m16908a(m17173f().m16458I()).size();
        for (int i9 = 0; i9 < size; i9++) {
            float f11 = (i9 * 61.0f) + 23.0f;
            this.f8339x.add(new RectF(f11, fM16455F, f11 + 38.0f, fM16455F2));
        }
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: h */
    public List mo7249h() {
        return this.f8337v;
    }

    /* renamed from: h0 */
    public void m7250h0(Integer num) {
        this.f8336u = num;
    }

    /* renamed from: i0 */
    public final void m7251i0() {
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c != null) {
            m17187v().set(interfaceC8055c.mo12797f());
            Matrix matrixM17190y = m17190y();
            matrixM17190y.reset();
            matrixM17190y.postConcat(interfaceC8055c.mo12794b());
            matrixM17190y.postConcat(m17184r().m17344b());
            m17169T((PointF) CollectionsKt.firstOrNull(((C8099b) interfaceC8055c).m12936H()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @Override // p302y4.AbstractC9948a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF mo7252s() {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f8338w
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList r1 = r8.f8339x
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r1)
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            float r1 = r1.right
            r2 = 1102577664(0x41b80000, float:23.0)
            float r1 = r1 + r2
            java.util.List r2 = r8.m7237Z()
            r3 = 0
            if (r2 == 0) goto L29
            x4.f$b r2 = p292x4.AbstractC9880d.m16910c(r2)
            goto L2a
        L29:
            r2 = r3
        L2a:
            if (r2 == 0) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            v4.b r4 = r8.m17173f()
            t5.a r4 = r4.m16456G()
            r5 = 0
            if (r4 == 0) goto L45
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L45
            float r4 = r4.getWidth()
            goto L46
        L45:
            r4 = r5
        L46:
            v4.b r6 = r8.m17173f()
            t5.a r6 = r6.m16456G()
            r7 = 1095761920(0x41500000, float:13.0)
            if (r6 == 0) goto L5d
            if (r2 == 0) goto L55
            r3 = r6
        L55:
            if (r3 == 0) goto L5d
            float r2 = r3.getHeight()
            float r2 = r2 + r7
            goto L5e
        L5d:
            r2 = r5
        L5e:
            kotlin.Pair r3 = new kotlin.Pair
            float r0 = java.lang.Math.max(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            v4.b r1 = r8.m17173f()
            float r1 = r1.m16455F()
            r6 = 2
            float r6 = (float) r6
            float r1 = r1 * r6
            float r1 = r1 + r7
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.<init>(r0, r1)
            r8.m17167R(r3)
            kotlin.Pair r0 = r8.m17189x()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r4)
            kotlin.Pair r1 = r8.m17189x()
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.mo7252s():android.graphics.RectF"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:7421
    }
}
