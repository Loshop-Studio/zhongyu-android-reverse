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
import p035c5.InterfaceC5122e;
import p066d5.InterfaceC7289a;
import p077e5.AbstractC7352m;
import p077e5.C7353n;
import p098g4.InterfaceC7522b;
import p109h4.AbstractC7624b;
import p109h4.AbstractC7625c;
import p109h4.AbstractC7626d;
import p109h4.AbstractC7628f;
import p120i4.AbstractC7661a;
import p120i4.C7665e;
import p120i4.InterfaceC7666f;
import p210q4.InterfaceC8888c;
import p221r4.C9006b;

/* loaded from: classes4.dex */
public final class GeometryFunction extends AbstractC7661a implements InterfaceC7666f {

    /* renamed from: A */
    public final PointF f7051A;

    /* renamed from: B */
    public final PointF f7052B;

    /* renamed from: u */
    public Integer f7053u;

    /* renamed from: v */
    public final ArrayList f7054v;

    /* renamed from: w */
    public final ArrayList f7055w;

    /* renamed from: x */
    public final ArrayList f7056x;

    /* renamed from: y */
    public float f7057y;

    /* renamed from: z */
    public float f7058z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeometryFunction(InterfaceC7522b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7054v = new ArrayList();
        this.f7055w = new ArrayList();
        this.f7056x = new ArrayList();
        this.f7051A = new PointF();
        this.f7052B = new PointF();
        m6151f0();
        m6150e0();
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: A */
    public boolean mo6132A(float f10, float f11) {
        if (!super.mo6132A(f10, f11)) {
            return false;
        }
        AbstractC7624b abstractC7624bM12752g = m12752g();
        if (abstractC7624bM12752g instanceof AbstractC7624b.d) {
            AbstractC7624b abstractC7624bM12752g2 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM12562a = ((AbstractC7624b.d) abstractC7624bM12752g2).m12562a();
            if (iM12562a == 0) {
                AbstractC7625c.b bVarM12584d = AbstractC7626d.m12584d(this.f7054v);
                if (bVarM12584d != null) {
                    bVarM12584d.m12566c(!bVarM12584d.m12565b());
                    m12748U(false);
                }
            } else if (iM12562a == 1) {
                m12759o().mo13452q(m12764u());
                m12759o().mo13439d();
                m12761q().mo12249n(m12764u(), System.currentTimeMillis());
                m12761q().mo12247l();
                mo6137L();
            }
        } else if (abstractC7624bM12752g instanceof AbstractC7624b.a) {
            AbstractC7624b abstractC7624bM12752g3 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iM12561a = ((AbstractC7624b.a) abstractC7624bM12752g3).m12561a();
            final List listM6141Z = m6141Z();
            if (listM6141Z == null) {
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

                public final void invoke(int i10) {
                    C9006b c9006b;
                    Paint paintM15154J;
                    ArrayList arrayListM12764u = this.f7059a.m12764u();
                    GeometryFunction geometryFunction = this.f7059a;
                    int size = arrayListM12764u.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayListM12764u.get(i11);
                        i11++;
                        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) obj;
                        if ((interfaceC8888c instanceof C9006b) && (paintM15154J = (c9006b = (C9006b) interfaceC8888c).m15154J()) != null) {
                            paintM15154J.setColor(i10);
                            c9006b.m15157M(paintM15154J);
                            InterfaceC7522b.a.m12262a(geometryFunction.m12761q(), interfaceC8888c, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, new Paint(paintM15154J), null, null, null, 236, null);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("GeometryFunction:GeometryColor -> color:");
                    sb.append(i10);
                    sb.append(" list: ");
                    ArrayList arrayListM12764u2 = this.f7059a.m12764u();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM12764u2, 10));
                    int size2 = arrayListM12764u2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayListM12764u2.get(i12);
                        i12++;
                        arrayList.add(((InterfaceC8888c) obj2).getId());
                    }
                    sb.append(arrayList);
                    LogUtils.m3239i(sb.toString());
                    InterfaceC5122e interfaceC5122eMo12239d = this.f7059a.m12761q().mo12239d();
                    if (interfaceC5122eMo12239d != null) {
                        interfaceC5122eMo12239d.mo2780a(i10);
                    }
                    this.f7059a.m12759o().mo13440e();
                    this.f7059a.m12761q().mo12247l();
                    List list = listM6141Z;
                    final GeometryFunction geometryFunction2 = this.f7059a;
                    AbstractC7626d.m12587g(list, i10, new Function1<Integer, Boolean>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Boolean invoke(int i13) {
                            InterfaceC7289a selectCustomColorView = geometryFunction2.m12751f().getSelectCustomColorView();
                            return Boolean.valueOf(selectCustomColorView != null ? selectCustomColorView.mo10825c(i13) : false);
                        }
                    });
                    GeometryFunction geometryFunction3 = this.f7059a;
                    AbstractC7628f.b bVarM12583c = AbstractC7626d.m12583c(listM6141Z);
                    geometryFunction3.m6154h0(bVarM12583c != null ? Integer.valueOf(bVarM12583c.m12594a()) : null);
                    this.f7059a.m12748U(false);
                }
            };
            if (listM6141Z.get(iM12561a) instanceof AbstractC7628f.b) {
                AbstractC7628f.b bVarM12583c = AbstractC7626d.m12583c(listM6141Z);
                if (bVarM12583c == null || !bVarM12583c.m12598e()) {
                    if (bVarM12583c != null) {
                        bVarM12583c.m12599f(true);
                    }
                    InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
                    if (selectCustomColorView != null) {
                        selectCustomColorView.mo10826d(function1);
                    }
                    AbstractC7628f.b bVarM12583c2 = AbstractC7626d.m12583c(listM6141Z);
                    int iM12594a = bVarM12583c2 != null ? bVarM12583c2.m12594a() : 0;
                    InterfaceC7289a selectCustomColorView2 = m12751f().getSelectCustomColorView();
                    if (selectCustomColorView2 == null || !selectCustomColorView2.mo10825c(iM12594a)) {
                        AbstractC7626d.m12588h(listM6141Z);
                        m12748U(false);
                    } else {
                        function1.invoke(Integer.valueOf(iM12594a));
                    }
                } else {
                    bVarM12583c.m12599f(false);
                    InterfaceC7289a selectCustomColorView3 = m12751f().getSelectCustomColorView();
                    if (selectCustomColorView3 != null) {
                        selectCustomColorView3.mo10826d(null);
                    }
                    m12748U(false);
                }
            } else {
                function1.invoke(Integer.valueOf(((AbstractC7628f) listM6141Z.get(iM12561a)).m12594a()));
            }
        }
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: C */
    public boolean mo6133C(float f10, float f11) {
        if (super.mo6133C(f10, f11)) {
            return true;
        }
        AbstractC7624b abstractC7624bM12752g = m12752g();
        if (abstractC7624bM12752g instanceof AbstractC7624b.c) {
            AbstractC7624b abstractC7624bM12752g2 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            m6149d0((AbstractC7624b.c) abstractC7624bM12752g2, f10, f11);
            m6155i0();
            m6140Y();
            PointF pointFM12769z = m12769z();
            PointF pointFM11784e = pointFM12769z != null ? C7353n.f11920a.m11784e(pointFM12769z, m12753i()) : null;
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
            if (interfaceC8888c != null) {
                m12759o().mo13416C(m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), pointFM11784e);
                InterfaceC7522b.a.m12262a(m12761q(), interfaceC8888c, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, interfaceC8888c.mo14996g(), null, null, null, null, null, 248, null);
            }
            m12761q().mo12247l();
        } else {
            if (!(abstractC7624bM12752g instanceof AbstractC7624b.f)) {
                return false;
            }
            m6147c0(f10, f11);
            PointF pointFM12769z2 = m12769z();
            PointF pointFM11784e2 = pointFM12769z2 != null ? C7353n.f11920a.m11784e(pointFM12769z2, m12753i()) : null;
            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
            if (interfaceC8888c2 != null) {
                m12759o().mo13416C(m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), pointFM11784e2);
                InterfaceC7522b.a.m12262a(m12761q(), interfaceC8888c2, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, null, ((C9006b) interfaceC8888c2).m15155K(), null, null, 220, null);
            }
            m12761q().mo12247l();
        }
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: D */
    public boolean mo6134D(float f10, float f11) {
        AbstractC7624b abstractC7624bM12752g = m12752g();
        if (!(abstractC7624bM12752g instanceof AbstractC7624b.c)) {
            if (!(abstractC7624bM12752g instanceof AbstractC7624b.f)) {
                return true;
            }
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
            if (interfaceC8888c == null) {
                return false;
            }
            C9006b c9006b = (C9006b) interfaceC8888c;
            Matrix matrix = new Matrix();
            matrix.postConcat(c9006b.mo14993b());
            matrix.postConcat(m12762r().m13188b());
            PointF pointF = this.f7051A;
            C7353n c7353n = C7353n.f11920a;
            pointF.set(c7353n.m11783d(c9006b.mo14996g().left, c9006b.mo14996g().top, matrix));
            this.f7052B.set(c7353n.m11783d(c9006b.mo14996g().right, c9006b.mo14996g().top, matrix));
            PointF pointFM12769z = m12769z();
            PointF pointFM11784e = pointFM12769z != null ? c7353n.m11784e(pointFM12769z, m12753i()) : null;
            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
            if (interfaceC8888c2 == null) {
                return true;
            }
            m12759o().mo13447l((C9006b) interfaceC8888c2, m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), pointFM11784e);
            return true;
        }
        InterfaceC8888c interfaceC8888c3 = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c3 == null) {
            return false;
        }
        C9006b c9006b2 = (C9006b) interfaceC8888c3;
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(c9006b2.mo14993b());
        matrix2.postConcat(m12762r().m13188b());
        this.f7057y = matrix2.mapRadius(c9006b2.mo14996g().width());
        this.f7058z = matrix2.mapRadius(c9006b2.mo14996g().height());
        LogUtils.m3239i("GeometryFunction:changeFrame -> start graph:" + c9006b2.getId());
        m6155i0();
        m6140Y();
        PointF pointFM12769z2 = m12769z();
        PointF pointFM11784e2 = pointFM12769z2 != null ? C7353n.f11920a.m11784e(pointFM12769z2, m12753i()) : null;
        InterfaceC8888c interfaceC8888c4 = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c4 == null) {
            return true;
        }
        m12759o().mo13447l((C9006b) interfaceC8888c4, m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), pointFM11784e2);
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: E */
    public boolean mo6135E(float f10, float f11) {
        if (super.mo6135E(f10, f11)) {
            return true;
        }
        AbstractC7624b abstractC7624bM12752g = m12752g();
        if (abstractC7624bM12752g instanceof AbstractC7624b.c) {
            AbstractC7624b abstractC7624bM12752g2 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            m6149d0((AbstractC7624b.c) abstractC7624bM12752g2, f10, f11);
            m6155i0();
            m6140Y();
            PointF pointFM12769z = m12769z();
            PointF pointFM11784e = pointFM12769z != null ? C7353n.f11920a.m11784e(pointFM12769z, m12753i()) : null;
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
            if (interfaceC8888c != null) {
                m12759o().mo13446k((C9006b) interfaceC8888c, m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), pointFM11784e);
            }
        } else {
            if (!(abstractC7624bM12752g instanceof AbstractC7624b.f)) {
                return false;
            }
            m6147c0(f10, f11);
            PointF pointFM12769z2 = m12769z();
            PointF pointFM11784e2 = pointFM12769z2 != null ? C7353n.f11920a.m11784e(pointFM12769z2, m12753i()) : null;
            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
            if (interfaceC8888c2 != null) {
                m12759o().mo13446k((C9006b) interfaceC8888c2, m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), pointFM11784e2);
            }
        }
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: J */
    public boolean mo6136J(float f10, float f11) {
        AbstractC7628f.b bVarM12583c;
        if (m12757m().m12796d().contains(f10, f11)) {
            m12741M(new AbstractC7624b.d(0));
            return true;
        }
        if (m12757m().m12795c().contains(f10, f11)) {
            m12741M(new AbstractC7624b.d(1));
            return true;
        }
        if (m12756l().m12775c().contains(f10, f11)) {
            m12741M(AbstractC7624b.e.f12792a);
            return true;
        }
        AbstractC7625c.b bVarM12584d = AbstractC7626d.m12584d(this.f7054v);
        if (bVarM12584d != null && bVarM12584d.m12565b()) {
            int size = m12757m().m12793a().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((RectF) m12757m().m12793a().get(i10)).contains(f10, f11)) {
                    m12741M(new AbstractC7624b.a(i10));
                    return true;
                }
            }
            if (m12756l().m12773a().contains(f10, f11)) {
                m12741M(AbstractC7624b.e.f12792a);
                return true;
            }
            List listM6141Z = m6141Z();
            if (listM6141Z != null && (bVarM12583c = AbstractC7626d.m12583c(listM6141Z)) != null && bVarM12583c.m12598e()) {
                if (m12757m().m12794b().contains(f10, f11)) {
                    m12741M(AbstractC7624b.e.f12792a);
                    return true;
                }
                if (m12756l().m12774b().contains(f10, f11)) {
                    m12741M(AbstractC7624b.e.f12792a);
                    return true;
                }
            }
        }
        Matrix matrixM11777b = AbstractC7352m.m11777b(m12753i());
        float[] fArr = {f10, f11};
        matrixM11777b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM11777b.mapRadius(m12751f().getSelectIconWidth());
        if (m6145b0()) {
            PointF pointFM12769z = m12769z();
            if (pointFM12769z != null) {
                float f14 = pointFM12769z.x;
                float f15 = fMapRadius / 2;
                float f16 = pointFM12769z.y;
                if (new RectF(f14 - f15, f16 - f15, f14 + f15, f16 + f15).contains(f12, f13)) {
                    m12741M(AbstractC7624b.f.f12793a);
                    return true;
                }
            }
            float f17 = fMapRadius / 2;
            if (new RectF(m12765v().left - f17, m12765v().centerY() - f17, m12765v().left + f17, m12765v().centerY() + f17).contains(f12, f13)) {
                m12741M(AbstractC7624b.c.b.f12788a);
                return true;
            }
            if (new RectF(m12765v().centerX() - f17, m12765v().top - f17, m12765v().centerX() + f17, m12765v().top + f17).contains(f12, f13)) {
                m12741M(AbstractC7624b.c.d.f12790a);
                return true;
            }
            if (new RectF(m12765v().right - f17, m12765v().centerY() - f17, m12765v().right + f17, m12765v().centerY() + f17).contains(f12, f13)) {
                m12741M(AbstractC7624b.c.C10145c.f12789a);
                return true;
            }
            if (new RectF(m12765v().centerX() - f17, m12765v().bottom - f17, m12765v().centerX() + f17, m12765v().bottom + f17).contains(f12, f13)) {
                m12741M(AbstractC7624b.c.a.f12787a);
                return true;
            }
        }
        float f18 = 2;
        float f19 = fMapRadius / f18;
        if (new RectF(m12765v().centerX() - f19, m12765v().top - ((5 * fMapRadius) / f18), m12765v().centerX() + f19, m12765v().top - ((fMapRadius * 3) / f18)).contains(f12, f13)) {
            m12741M(AbstractC7624b.h.f12795a);
            return true;
        }
        if (new RectF(m12765v().right - f19, m12765v().bottom - f19, m12765v().right + f19, m12765v().bottom + f19).contains(f12, f13)) {
            m12741M(AbstractC7624b.i.f12796a);
            return true;
        }
        if (m12765v().contains(f12, f13)) {
            m12741M(AbstractC7624b.b.f12786a);
            return true;
        }
        m12741M(AbstractC7624b.g.f12794a);
        return false;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: L */
    public void mo6137L() {
        super.mo6137L();
        m6151f0();
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.mo10826d(null);
        }
        m6154h0(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // p120i4.AbstractC7661a
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo6138P(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.mo6138P(java.util.List):void"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:3522
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: X */
    public void mo6139X() {
        C7665e c7665eM12757m = m12757m();
        int i10 = 0;
        c7665eM12757m.m12796d().set((m12763t().left + ((RectF) this.f7055w.get(0)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7055w.get(0)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        c7665eM12757m.m12795c().set((m12763t().left + ((RectF) this.f7055w.get(1)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7055w.get(1)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        c7665eM12757m.m12793a().clear();
        ArrayList arrayList = this.f7056x;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            RectF rectF = (RectF) obj;
            c7665eM12757m.m12793a().add(new RectF(m12763t().left + rectF.left, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f + rectF.top, m12763t().left + rectF.right, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f + rectF.bottom));
        }
        m12757m().m12794b().setEmpty();
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            List listM6141Z = m6141Z();
            if ((listM6141Z != null ? AbstractC7626d.m12583c(listM6141Z) : null) == null) {
                selectCustomColorView = null;
            }
            if (selectCustomColorView != null) {
                float f10 = 2;
                c7665eM12757m.m12794b().set(m12763t().left, m12763t().top + ((m12751f().getSelectButtonHeight() + 13.0f) * f10), m12763t().left + selectCustomColorView.getWidth(), m12763t().top + ((m12751f().getSelectButtonHeight() + 13.0f) * f10) + selectCustomColorView.getHeight());
            }
        }
        if (m12740K()) {
            return;
        }
        float f11 = (c7665eM12757m.m12795c().right - c7665eM12757m.m12796d().left) + 16.0f;
        c7665eM12757m.m12796d().offset(m12763t().width() - f11, 0.0f);
        c7665eM12757m.m12795c().offset(m12763t().width() - f11, 0.0f);
        float f12 = (((RectF) CollectionsKt.last((List) c7665eM12757m.m12793a())).right - ((RectF) CollectionsKt.first((List) c7665eM12757m.m12793a())).left) + 46.0f;
        ArrayList arrayListM12793a = c7665eM12757m.m12793a();
        int size2 = arrayListM12793a.size();
        while (i10 < size2) {
            Object obj2 = arrayListM12793a.get(i10);
            i10++;
            ((RectF) obj2).offset(m12763t().width() - f12, 0.0f);
        }
        c7665eM12757m.m12794b().offset(m12763t().width() - c7665eM12757m.m12794b().width(), 0.0f);
    }

    /* renamed from: Y */
    public final void m6140Y() {
        m12763t().set(mo6156s());
        m12742N(m12758n(m12763t(), m12766w(), m12760p(), m12767x()));
        mo6139X();
        m12749W();
    }

    /* renamed from: Z */
    public final List m6141Z() {
        AbstractC7625c.b bVarM12584d = AbstractC7626d.m12584d(this.f7054v);
        if (bVarM12584d != null) {
            return bVarM12584d.m12567d();
        }
        return null;
    }

    @Override // p120i4.InterfaceC7666f
    /* renamed from: a */
    public void mo6142a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            motionEvent.setLocation(motionEvent.getX() - m12757m().m12794b().left, motionEvent.getY() - m12757m().m12794b().top);
            selectCustomColorView.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a0 */
    public Integer m6143a0() {
        return this.f7053u;
    }

    @Override // p120i4.InterfaceC7666f
    /* renamed from: b */
    public void mo6144b() {
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.mo10824b(m6143a0());
        }
    }

    /* renamed from: b0 */
    public final boolean m6145b0() {
        return m12764u().size() == 1;
    }

    /* renamed from: c */
    public final float m6146c(float f10, float f11) {
        if (f10 == 0.0f) {
            return (float) Math.toRadians(f11 > 0.0f ? 90.0d : -90.0d);
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: c0 */
    public final void m6147c0(float f10, float f11) {
        PointF pointF = new PointF();
        PointF pointF2 = this.f7051A;
        float f12 = pointF2.x;
        float f13 = pointF2.y;
        PointF pointF3 = this.f7052B;
        float fM6148d = m6148d(f12, f13, pointF3.x, pointF3.y, f12, f13, f10, f11);
        if (fM6148d < 0.0f) {
            pointF.set(this.f7051A);
        } else {
            PointF pointF4 = this.f7051A;
            float f14 = pointF4.x;
            PointF pointF5 = this.f7052B;
            float f15 = pointF5.x;
            float f16 = (f14 - f15) * (f14 - f15);
            float f17 = pointF4.y;
            float f18 = pointF5.y;
            float fSqrt = (float) Math.sqrt(f16 + ((f17 - f18) * (f17 - f18)));
            if (fM6148d > fSqrt) {
                pointF.set(this.f7052B);
            } else {
                float f19 = fM6148d / fSqrt;
                PointF pointF6 = this.f7051A;
                float f20 = pointF6.x;
                PointF pointF7 = this.f7052B;
                float f21 = f20 + ((pointF7.x - f20) * f19);
                float f22 = pointF6.y;
                pointF.set(f21, f22 + ((pointF7.y - f22) * f19));
            }
        }
        pointF.set(C7353n.f11920a.m11784e(pointF, AbstractC7352m.m11777b(m12753i())));
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c != null) {
            C9006b c9006b = (C9006b) interfaceC8888c;
            c9006b.m15158N(CollectionsKt.listOf((Object[]) new PointF[]{pointF, new PointF(c9006b.mo14996g().left, c9006b.mo14996g().bottom), new PointF(c9006b.mo14996g().right, c9006b.mo14996g().bottom)}));
            PointF pointFM12769z = m12769z();
            if (pointFM12769z != null) {
                pointFM12769z.set(pointF);
            }
        }
    }

    /* renamed from: d */
    public final float m6148d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m6146c(f12 - f10, f13 - f11) - m6146c(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
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
    public final void m6149d0(p109h4.AbstractC7624b.c r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.m6149d0(h4.b$c, float, float):void"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:6101
    }

    /* renamed from: e0 */
    public final void m6150e0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float selectButtonHeight = (m12751f().getSelectButtonHeight() - f10) / f11;
        float selectButtonHeight2 = ((m12751f().getSelectButtonHeight() - f10) / f11) + f10;
        ArrayList arrayList = this.f7054v;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((AbstractC7625c) obj).m12564a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            float fMeasureText = paint.measureText(((AbstractC7625c) obj2).m12564a());
            this.f7055w.add(new RectF(f12, selectButtonHeight, f12 + fMeasureText, selectButtonHeight2));
            f12 += fMeasureText + 30.0f;
        }
        m6152g0();
    }

    /* renamed from: f0 */
    public final void m6151f0() {
        this.f7054v.clear();
        this.f7054v.add(AbstractC7625c.d.f12805c);
        this.f7054v.add(AbstractC7625c.e.f12806c);
        this.f7054v.add(new AbstractC7625c.b(m6145b0(), AbstractC7626d.m12581a(m12751f().getSelectEditColorList())));
        this.f7054v.add(AbstractC7625c.a.f12802c);
    }

    /* renamed from: g0 */
    public final void m6152g0() {
        this.f7056x.clear();
        float f10 = 2;
        float selectButtonHeight = (m12751f().getSelectButtonHeight() - 38.0f) / f10;
        float selectButtonHeight2 = ((m12751f().getSelectButtonHeight() - 38.0f) / f10) + 38.0f;
        int size = AbstractC7626d.m12581a(m12751f().getSelectEditColorList()).size();
        for (int i10 = 0; i10 < size; i10++) {
            float f11 = (i10 * 61.0f) + 23.0f;
            this.f7056x.add(new RectF(f11, selectButtonHeight, f11 + 38.0f, selectButtonHeight2));
        }
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: h */
    public List mo6153h() {
        return this.f7054v;
    }

    /* renamed from: h0 */
    public void m6154h0(Integer num) {
        this.f7053u = num;
    }

    /* renamed from: i0 */
    public final void m6155i0() {
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c != null) {
            m12765v().set(interfaceC8888c.mo14996g());
            Matrix matrixM12768y = m12768y();
            matrixM12768y.reset();
            matrixM12768y.postConcat(interfaceC8888c.mo14993b());
            matrixM12768y.postConcat(m12762r().m13188b());
            m12747T((PointF) CollectionsKt.firstOrNull(((C9006b) interfaceC8888c).m15153I()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @Override // p120i4.AbstractC7661a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF mo6156s() {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f7055w
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList r1 = r8.f7056x
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r1)
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            float r1 = r1.right
            r2 = 1102577664(0x41b80000, float:23.0)
            float r1 = r1 + r2
            java.util.List r2 = r8.m6141Z()
            r3 = 0
            if (r2 == 0) goto L29
            h4.f$b r2 = p109h4.AbstractC7626d.m12583c(r2)
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
            com.zykj.blackboard.bean.BoardConfig r4 = r8.m12751f()
            d5.a r4 = r4.getSelectCustomColorView()
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
            com.zykj.blackboard.bean.BoardConfig r6 = r8.m12751f()
            d5.a r6 = r6.getSelectCustomColorView()
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
            com.zykj.blackboard.bean.BoardConfig r1 = r8.m12751f()
            float r1 = r1.getSelectButtonHeight()
            r6 = 2
            float r6 = (float) r6
            float r1 = r1 * r6
            float r1 = r1 + r7
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.<init>(r0, r1)
            r8.m12745R(r3)
            kotlin.Pair r0 = r8.m12767x()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r4)
            kotlin.Pair r1 = r8.m12767x()
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.mo6156s():android.graphics.RectF"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:7421
    }
}
