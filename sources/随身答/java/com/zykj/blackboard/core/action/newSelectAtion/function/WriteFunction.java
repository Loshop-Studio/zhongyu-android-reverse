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
import p127h5.InterfaceC8100c;
import p147j5.AbstractC8216c;
import p253t5.InterfaceC9615a;
import p263u5.AbstractC9695n;
import p263u5.C9687f;
import p282w4.InterfaceC9822b;
import p292x4.AbstractC9878b;
import p292x4.AbstractC9879c;
import p292x4.AbstractC9880d;
import p292x4.AbstractC9882f;
import p302y4.AbstractC9948a;
import p302y4.C9952e;
import p302y4.InterfaceC9953f;

/* loaded from: classes4.dex */
public final class WriteFunction extends AbstractC9948a implements InterfaceC9953f {

    /* renamed from: u */
    public Integer f8377u;

    /* renamed from: v */
    public boolean f8378v;

    /* renamed from: w */
    public final ArrayList f8379w;

    /* renamed from: x */
    public final ArrayList f8380x;

    /* renamed from: y */
    public final ArrayList f8381y;

    /* renamed from: z */
    public final ArrayList f8382z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteFunction(InterfaceC9822b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8379w = new ArrayList();
        this.f8380x = new ArrayList();
        this.f8381y = new ArrayList();
        this.f8382z = new ArrayList();
        m7276b0();
        m7275a0();
    }

    /* renamed from: Y */
    private final List m7274Y() {
        AbstractC9879c.g gVarM16913f = AbstractC9880d.m16913f(this.f8379w);
        if (gVarM16913f != null) {
            return gVarM16913f.m16902d();
        }
        return null;
    }

    /* renamed from: a0 */
    private final void m7275a0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM16455F = (m17173f().m16455F() - f10) / f11;
        float fM16455F2 = ((m17173f().m16455F() - f10) / f11) + f10;
        ArrayList arrayList = this.f8379w;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (((AbstractC9879c) obj).m16891a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            float fMeasureText = paint.measureText(((AbstractC9879c) obj2).m16891a());
            this.f8380x.add(new RectF(f12, fM16455F, f12 + fMeasureText, fM16455F2));
            f12 += fMeasureText + 30.0f;
        }
        int size3 = m17173f().m16463N().size();
        float f13 = 16.0f;
        for (int i11 = 0; i11 < size3; i11++) {
            float f14 = (((i11 * 3.0f) + 8.0f) / f11) + 19.0f;
            float f15 = f13 + f14;
            this.f8381y.add(new PointF(f15, m17173f().m16455F() / f11));
            f13 = f15 + f14;
        }
        m7277d0();
    }

    /* renamed from: b0 */
    private final void m7276b0() {
        this.f8379w.clear();
        this.f8379w.add(AbstractC9879c.d.f17654c);
        this.f8379w.add(AbstractC9879c.e.f17655c);
        this.f8379w.add(new AbstractC9879c.g(false, ((Number) m17173f().m16463N().get(0)).floatValue(), AbstractC9880d.m16908a(m17173f().m16458I())));
        this.f8379w.add(AbstractC9879c.a.f17651c);
    }

    /* renamed from: d0 */
    private final void m7277d0() {
        this.f8382z.clear();
        float f10 = 2;
        float fM16455F = (m17173f().m16455F() - 38.0f) / f10;
        float fM16455F2 = ((m17173f().m16455F() - 38.0f) / f10) + 38.0f;
        int size = AbstractC9880d.m16908a(m17173f().m16458I()).size();
        for (int i9 = 0; i9 < size; i9++) {
            float f11 = (i9 * 61.0f) + 23.0f;
            this.f8382z.add(new RectF(f11, fM16455F, f11 + 38.0f, fM16455F2));
        }
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: A */
    public boolean mo7228A(float f10, float f11) {
        Paint paintM13254y;
        if (!super.mo7228A(f10, f11)) {
            return false;
        }
        AbstractC9878b abstractC9878bM17174g = m17174g();
        if (abstractC9878bM17174g instanceof AbstractC9878b.d) {
            AbstractC9878b abstractC9878bM17174g2 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM16889a = ((AbstractC9878b.d) abstractC9878bM17174g2).m16889a();
            if (iM16889a == 0) {
                AbstractC9879c.g gVarM16913f = AbstractC9880d.m16913f(this.f8379w);
                if (gVarM16913f != null) {
                    gVarM16913f.m16893c(!gVarM16913f.m16892b());
                    m17170U(false);
                }
            } else if (iM16889a == 1) {
                m17181o().mo212o(m17186u());
                m17181o().mo201d();
                m17183q().mo16695n(m17186u(), System.currentTimeMillis());
                m17183q().mo16693l();
                mo7233L();
            }
        } else if (abstractC9878bM17174g instanceof AbstractC9878b.k) {
            AbstractC9878b abstractC9878bM17174g3 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize");
            float fFloatValue = ((Number) m17173f().m16462M(this.f8378v).get(((AbstractC9878b.k) abstractC9878bM17174g3).m16890a())).floatValue();
            ArrayList arrayListM17186u = m17186u();
            int size = arrayListM17186u.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayListM17186u.get(i9);
                i9++;
                InterfaceC8055c interfaceC8055c = (InterfaceC8055c) obj;
                for (InterfaceC8055c interfaceC8055c2 : interfaceC8055c.mo12796e()) {
                    if ((interfaceC8055c2 instanceof AbstractC8216c) && (paintM13254y = ((AbstractC8216c) interfaceC8055c2).m13254y()) != null) {
                        paintM13254y.setStrokeWidth(fFloatValue);
                        InterfaceC9822b.a.m16708a(m17183q(), interfaceC8055c2, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(paintM13254y), null, null, null, 236, null);
                    }
                    if (interfaceC8055c instanceof InterfaceC8100c) {
                        ((InterfaceC8100c) interfaceC8055c).mo7860k(true);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("WriteFunction:WriteSize -> size:");
            sb.append(fFloatValue);
            sb.append(" list: ");
            ArrayList arrayListM17186u2 = m17186u();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM17186u2, 10));
            int size2 = arrayListM17186u2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayListM17186u2.get(i10);
                i10++;
                arrayList.add(((InterfaceC8055c) obj2).getId());
            }
            sb.append(arrayList);
            LogUtils.m2956i(sb.toString());
            m17181o().mo202e();
            m17183q().mo16693l();
            AbstractC9879c.g gVarM16913f2 = AbstractC9880d.m16913f(this.f8379w);
            if (gVarM16913f2 != null) {
                gVarM16913f2.m16907i(fFloatValue);
            }
            m17170U(false);
        } else if (abstractC9878bM17174g instanceof AbstractC9878b.a) {
            AbstractC9878b abstractC9878bM17174g4 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g4, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iM16888a = ((AbstractC9878b.a) abstractC9878bM17174g4).m16888a();
            final List listM7274Y = m7274Y();
            if (listM7274Y == null) {
                return true;
            }
            Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction$handleClick$changeColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i11) {
                    Paint paintM13254y2;
                    int iM16169a = this.f8383a.m7279c0() ? C9687f.f17124a.m16169a(i11, this.f8383a.m17173f().m16515v()) : i11;
                    ArrayList arrayListM17186u3 = this.f8383a.m17186u();
                    WriteFunction writeFunction = this.f8383a;
                    int size3 = arrayListM17186u3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayListM17186u3.get(i12);
                        i12++;
                        InterfaceC8055c interfaceC8055c3 = (InterfaceC8055c) obj3;
                        for (InterfaceC8055c interfaceC8055c4 : interfaceC8055c3.mo12796e()) {
                            if ((interfaceC8055c4 instanceof AbstractC8216c) && (paintM13254y2 = ((AbstractC8216c) interfaceC8055c4).m13254y()) != null) {
                                paintM13254y2.setColor(iM16169a);
                                InterfaceC9822b.a.m16708a(writeFunction.m17183q(), interfaceC8055c4, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(paintM13254y2), null, null, null, 236, null);
                            }
                        }
                        if (interfaceC8055c3 instanceof InterfaceC8100c) {
                            ((InterfaceC8100c) interfaceC8055c3).mo7860k(true);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WriteFunction:Color -> color:");
                    sb2.append(iM16169a);
                    sb2.append(" list: ");
                    ArrayList arrayListM17186u4 = this.f8383a.m17186u();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM17186u4, 10));
                    int size4 = arrayListM17186u4.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        Object obj4 = arrayListM17186u4.get(i13);
                        i13++;
                        arrayList2.add(((InterfaceC8055c) obj4).getId());
                    }
                    sb2.append(arrayList2);
                    LogUtils.m2956i(sb2.toString());
                    Function1 function1M16457H = this.f8383a.m17173f().m16457H();
                    if (function1M16457H != null) {
                        function1M16457H.invoke(Integer.valueOf(i11));
                    }
                    this.f8383a.m17181o().mo202e();
                    this.f8383a.m17183q().mo16693l();
                    List list = listM7274Y;
                    final WriteFunction writeFunction2 = this.f8383a;
                    AbstractC9880d.m16914g(list, i11, new Function1<Integer, Boolean>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Boolean invoke(int i14) {
                            InterfaceC9615a interfaceC9615aM16456G = writeFunction2.m17173f().m16456G();
                            return Boolean.valueOf(interfaceC9615aM16456G != null ? interfaceC9615aM16456G.mo11224c(i14) : false);
                        }
                    });
                    WriteFunction writeFunction3 = this.f8383a;
                    AbstractC9882f.b bVarM16910c = AbstractC9880d.m16910c(listM7274Y);
                    writeFunction3.m7281f0(bVarM16910c != null ? Integer.valueOf(bVarM16910c.m16921a()) : null);
                    this.f8383a.m17170U(false);
                }
            };
            if (listM7274Y.get(iM16888a) instanceof AbstractC9882f.b) {
                AbstractC9882f.b bVarM16910c = AbstractC9880d.m16910c(listM7274Y);
                if (bVarM16910c == null || !bVarM16910c.m16925e()) {
                    if (bVarM16910c != null) {
                        bVarM16910c.m16926f(true);
                    }
                    InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
                    if (interfaceC9615aM16456G != null) {
                        interfaceC9615aM16456G.mo11225d(function1);
                    }
                    int iM16921a = bVarM16910c != null ? bVarM16910c.m16921a() : 0;
                    InterfaceC9615a interfaceC9615aM16456G2 = m17173f().m16456G();
                    if (interfaceC9615aM16456G2 == null || !interfaceC9615aM16456G2.mo11224c(iM16921a)) {
                        AbstractC9880d.m16915h(listM7274Y);
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
                function1.invoke(Integer.valueOf(((AbstractC9882f) listM7274Y.get(iM16888a)).m16921a()));
            }
        }
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: J */
    public boolean mo7232J(float f10, float f11) {
        AbstractC9882f.b bVarM16910c;
        if (m17179m().m17223i().contains(f10, f11)) {
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
        AbstractC9879c.g gVarM16913f = AbstractC9880d.m16913f(this.f8379w);
        if (gVarM16913f != null && gVarM16913f.m16892b()) {
            int size = m17179m().m17224j().size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((RectF) m17179m().m17224j().get(i9)).contains(f10, f11)) {
                    m17163M(new AbstractC9878b.k(i9));
                    return true;
                }
            }
            if (m17178l().m17199e().contains(f10, f11)) {
                m17163M(AbstractC9878b.e.f17641a);
                return true;
            }
            int size2 = m17179m().m17215a().size();
            for (int i10 = 0; i10 < size2; i10++) {
                if (((RectF) m17179m().m17215a().get(i10)).contains(f10, f11)) {
                    m17163M(new AbstractC9878b.a(i10));
                    return true;
                }
            }
            if (m17178l().m17195a().contains(f10, f11)) {
                m17163M(AbstractC9878b.e.f17641a);
                return true;
            }
            List listM7274Y = m7274Y();
            if (listM7274Y != null && (bVarM16910c = AbstractC9880d.m16910c(listM7274Y)) != null && bVarM16910c.m16925e()) {
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
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(m17187v().centerX() - f15, m17187v().top - ((5 * fMapRadius) / f14), m17187v().centerX() + f15, m17187v().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            m17163M(AbstractC9878b.h.f17644a);
            return true;
        }
        if (new RectF(m17187v().right - f15, m17187v().bottom - f15, m17187v().right + f15, m17187v().bottom + f15).contains(f12, f13)) {
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
        m7276b0();
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            interfaceC9615aM16456G.mo11225d(null);
        }
        m7281f0(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    @Override // p302y4.AbstractC9948a
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7234P(java.util.List r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction.mo7234P(java.util.List):void"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali:2803
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: X */
    public void mo7235X() {
        C9952e c9952eM17179m = m17179m();
        c9952eM17179m.m17223i().set((m17185t().left + ((RectF) this.f8380x.get(0)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8380x.get(0)).right + 15.0f, m17185t().top + m17173f().m16455F());
        c9952eM17179m.m17217c().set((m17185t().left + ((RectF) this.f8380x.get(1)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8380x.get(1)).right + 15.0f, m17185t().top + m17173f().m16455F());
        c9952eM17179m.m17224j().clear();
        ArrayList arrayList = this.f8381y;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PointF pointF = (PointF) obj;
            float f10 = 2;
            float f11 = ((i9 * 3.0f) + 8.0f) / f10;
            c9952eM17179m.m17224j().add(new RectF(((m17185t().left + pointF.x) - f11) - 19.0f, m17185t().top + m17173f().m16455F() + 13.0f, m17185t().left + pointF.x + f11 + 19.0f, m17185t().top + (m17173f().m16455F() * f10) + 13.0f));
            i9 = i11;
        }
        float f12 = ((RectF) CollectionsKt.last((List) m17179m().m17224j())).right + 16.0f + 13.0f;
        c9952eM17179m.m17215a().clear();
        ArrayList arrayList2 = this.f8382z;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            RectF rectF = (RectF) obj2;
            c9952eM17179m.m17215a().add(new RectF(rectF.left + f12, m17185t().top + m17173f().m16455F() + 13.0f + rectF.top, rectF.right + f12, m17185t().top + m17173f().m16455F() + 13.0f + rectF.bottom));
        }
        m17179m().m17216b().setEmpty();
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            List listM7274Y = m7274Y();
            if ((listM7274Y != null ? AbstractC9880d.m16910c(listM7274Y) : null) == null) {
                interfaceC9615aM16456G = null;
            }
            if (interfaceC9615aM16456G != null) {
                float f13 = 2;
                c9952eM17179m.m17216b().set(m17185t().left, m17185t().top + ((m17173f().m16455F() + 13.0f) * f13), m17185t().left + interfaceC9615aM16456G.getWidth(), m17185t().top + ((m17173f().m16455F() + 13.0f) * f13) + interfaceC9615aM16456G.getHeight());
            }
        }
        if (m17162K()) {
            return;
        }
        float f14 = (c9952eM17179m.m17217c().right - c9952eM17179m.m17223i().left) + 16.0f;
        c9952eM17179m.m17223i().offset(m17185t().width() - f14, 0.0f);
        c9952eM17179m.m17217c().offset(m17185t().width() - f14, 0.0f);
        float fWidth = m17185t().width() - ((((((RectF) CollectionsKt.last((List) c9952eM17179m.m17224j())).right - ((RectF) CollectionsKt.first((List) c9952eM17179m.m17224j())).left) + 32.0f) + 13.0f) + ((((RectF) CollectionsKt.last((List) c9952eM17179m.m17215a())).right - ((RectF) CollectionsKt.first((List) c9952eM17179m.m17215a())).left) + 46.0f));
        ArrayList arrayListM17224j = c9952eM17179m.m17224j();
        int size3 = arrayListM17224j.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayListM17224j.get(i13);
            i13++;
            ((RectF) obj3).offset(fWidth, 0.0f);
        }
        ArrayList arrayListM17215a = c9952eM17179m.m17215a();
        int size4 = arrayListM17215a.size();
        int i14 = 0;
        while (i14 < size4) {
            Object obj4 = arrayListM17215a.get(i14);
            i14++;
            ((RectF) obj4).offset(fWidth, 0.0f);
        }
        c9952eM17179m.m17216b().offset(m17185t().width() - c9952eM17179m.m17216b().width(), 0.0f);
    }

    /* renamed from: Z */
    public Integer m7278Z() {
        return this.f8377u;
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

    @Override // p302y4.InterfaceC9953f
    /* renamed from: b */
    public void mo7240b() {
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            interfaceC9615aM16456G.mo11223b(m7278Z());
        }
    }

    /* renamed from: c0 */
    public final boolean m7279c0() {
        return this.f8378v;
    }

    /* renamed from: e0 */
    public final void m7280e0(boolean z9) {
        this.f8378v = z9;
    }

    /* renamed from: f0 */
    public void m7281f0(Integer num) {
        this.f8377u = num;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: h */
    public List mo7249h() {
        return this.f8379w;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    @Override // p302y4.AbstractC9948a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF mo7252s() {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f8380x
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList r2 = r9.f8381y
            java.lang.Object r2 = kotlin.collections.CollectionsKt.last(r2)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            java.util.ArrayList r3 = r9.f8381y
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
            float r3 = (float) r3
            r5 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 * r5
            float r3 = r3 + r1
            r1 = 2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r2 = r2 + r3
            r3 = 1100480512(0x41980000, float:19.0)
            float r2 = r2 + r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 + r3
            java.util.ArrayList r3 = r9.f8382z
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r3)
            android.graphics.RectF r3 = (android.graphics.RectF) r3
            float r3 = r3.right
            r5 = 1102577664(0x41b80000, float:23.0)
            float r3 = r3 + r5
            r5 = 1095761920(0x41500000, float:13.0)
            float r2 = r2 + r5
            float r2 = r2 + r3
            java.util.List r3 = r9.m7274Y()
            r6 = 0
            if (r3 == 0) goto L4e
            x4.f$b r3 = p292x4.AbstractC9880d.m16910c(r3)
            goto L4f
        L4e:
            r3 = r6
        L4f:
            if (r3 == 0) goto L52
            goto L53
        L52:
            r4 = 0
        L53:
            v4.b r3 = r9.m17173f()
            t5.a r3 = r3.m16456G()
            r7 = 0
            if (r3 == 0) goto L69
            if (r4 == 0) goto L61
            goto L62
        L61:
            r3 = r6
        L62:
            if (r3 == 0) goto L69
            float r3 = r3.getWidth()
            goto L6a
        L69:
            r3 = r7
        L6a:
            v4.b r8 = r9.m17173f()
            t5.a r8 = r8.m16456G()
            if (r8 == 0) goto L7f
            if (r4 == 0) goto L77
            r6 = r8
        L77:
            if (r6 == 0) goto L7f
            float r4 = r6.getHeight()
            float r4 = r4 + r5
            goto L80
        L7f:
            r4 = r7
        L80:
            kotlin.Pair r6 = new kotlin.Pair
            float r0 = java.lang.Math.max(r0, r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            v4.b r2 = r9.m17173f()
            float r2 = r2.m16455F()
            float r2 = r2 * r1
            float r2 = r2 + r5
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r6.<init>(r0, r1)
            r9.m17167R(r6)
            kotlin.Pair r0 = r9.m17189x()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r3)
            kotlin.Pair r1 = r9.m17189x()
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r4
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r7, r7, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction.mo7252s():android.graphics.RectF"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali:5314
    }
}
