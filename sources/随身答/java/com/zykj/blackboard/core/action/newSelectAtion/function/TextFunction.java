package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p006a5.InterfaceC0039c;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p243s5.InterfaceC9478f;
import p253t5.InterfaceC9615a;
import p253t5.InterfaceC9617c;
import p263u5.AbstractC9695n;
import p263u5.C9701t;
import p282w4.InterfaceC9822b;
import p292x4.AbstractC9878b;
import p292x4.AbstractC9879c;
import p292x4.AbstractC9880d;
import p292x4.AbstractC9882f;
import p302y4.AbstractC9948a;
import p302y4.C9952e;
import p302y4.InterfaceC9953f;

/* loaded from: classes4.dex */
public final class TextFunction extends AbstractC9948a implements InterfaceC9953f {

    /* renamed from: A */
    public float f8359A;

    /* renamed from: u */
    public Integer f8360u;

    /* renamed from: v */
    public final ArrayList f8361v;

    /* renamed from: w */
    public final ArrayList f8362w;

    /* renamed from: x */
    public final RectF f8363x;

    /* renamed from: y */
    public final RectF f8364y;

    /* renamed from: z */
    public final ArrayList f8365z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFunction(InterfaceC9822b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8361v = new ArrayList();
        this.f8362w = new ArrayList();
        this.f8363x = new RectF();
        this.f8364y = new RectF();
        this.f8365z = new ArrayList();
        m7265i0();
        m7264h0();
    }

    /* renamed from: a0 */
    private final void m7261a0() {
        m17185t().set(mo7252s());
        m17164N(m17180n(m17185t(), m17188w(), m17182p(), m17189x()));
        mo7235X();
        m17171W();
    }

    /* renamed from: c0 */
    private final List m7262c0() {
        AbstractC9879c.f fVarM16912e = AbstractC9880d.m16912e(this.f8361v);
        if (fVarM16912e != null) {
            return fVarM16912e.m16898d();
        }
        return null;
    }

    /* renamed from: e0 */
    private final boolean m7263e0() {
        return m17186u().size() == 1;
    }

    /* renamed from: h0 */
    private final void m7264h0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM16455F = (m17173f().m16455F() - f10) / f11;
        float fM16455F2 = ((m17173f().m16455F() - f10) / f11) + f10;
        ArrayList arrayList = this.f8361v;
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
            this.f8362w.add(new RectF(f12, fM16455F, f12 + fMeasureText, fM16455F2));
            f12 += fMeasureText + 30.0f;
        }
        this.f8364y.set(32.0f, (m17173f().m16455F() - 24.0f) / f11, 56.0f, ((m17173f().m16455F() - 24.0f) / f11) + 24.0f);
        this.f8363x.set(122.0f, (m17173f().m16455F() - 24.0f) / f11, 146.0f, ((m17173f().m16455F() - 24.0f) / f11) + 24.0f);
        m7266j0();
    }

    /* renamed from: i0 */
    private final void m7265i0() {
        this.f8361v.clear();
        this.f8361v.add(new AbstractC9879c.f(m7263e0(), AbstractC9880d.m16908a(m17173f().m16458I())));
        this.f8361v.add(AbstractC9879c.a.f17651c);
    }

    /* renamed from: j0 */
    private final void m7266j0() {
        this.f8365z.clear();
        float f10 = 2;
        float fM16455F = (m17173f().m16455F() - 38.0f) / f10;
        float fM16455F2 = ((m17173f().m16455F() - 38.0f) / f10) + 38.0f;
        int size = AbstractC9880d.m16908a(m17173f().m16458I()).size();
        for (int i9 = 0; i9 < size; i9++) {
            float f11 = (i9 * 61.0f) + 23.0f;
            this.f8365z.add(new RectF(f11, fM16455F, f11 + 38.0f, fM16455F2));
        }
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
                AbstractC9879c.f fVarM16912e = AbstractC9880d.m16912e(this.f8361v);
                if (fVarM16912e != null) {
                    fVarM16912e.m16893c(!fVarM16912e.m16892b());
                    m17170U(false);
                }
            } else if (iM16889a == 1) {
                m17181o().mo212o(m17186u());
                m17181o().mo201d();
                m17183q().mo16695n(m17186u(), System.currentTimeMillis());
                m17183q().mo16693l();
                mo7233L();
            }
        } else if (abstractC9878bM17174g instanceof AbstractC9878b.j.a) {
            m7271g0(4.0f);
        } else if (abstractC9878bM17174g instanceof AbstractC9878b.j.b) {
            m7271g0(-4.0f);
        } else if (abstractC9878bM17174g instanceof AbstractC9878b.a) {
            AbstractC9878b abstractC9878bM17174g3 = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iM16888a = ((AbstractC9878b.a) abstractC9878bM17174g3).m16888a();
            final List listM7262c0 = m7262c0();
            if (listM7262c0 == null) {
                return true;
            }
            Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleClick$changeColor$1
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
                    C8101d c8101d;
                    Paint paintM12943I;
                    ArrayList arrayListM17186u = this.f8366a.m17186u();
                    TextFunction textFunction = this.f8366a;
                    int size = arrayListM17186u.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListM17186u.get(i10);
                        i10++;
                        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) obj;
                        if ((interfaceC8055c instanceof C8101d) && (paintM12943I = (c8101d = (C8101d) interfaceC8055c).m12943I()) != null) {
                            paintM12943I.setColor(i9);
                            c8101d.m12945K(paintM12943I);
                            InterfaceC9822b.a.m16708a(textFunction.m17183q(), interfaceC8055c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, null, new Paint(paintM12943I), null, null, null, 236, null);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("TextFunction:TextColor -> color:");
                    sb.append(i9);
                    sb.append(" list: ");
                    ArrayList arrayListM17186u2 = this.f8366a.m17186u();
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
                    InterfaceC9478f interfaceC9478fMo16686e = this.f8366a.m17183q().mo16686e();
                    if (interfaceC9478fMo16686e != null) {
                        interfaceC9478fMo16686e.mo2230d(i9);
                    }
                    this.f8366a.m17181o().mo202e();
                    this.f8366a.m17183q().mo16693l();
                    List list = listM7262c0;
                    final TextFunction textFunction2 = this.f8366a;
                    AbstractC9880d.m16914g(list, i9, new Function1<Integer, Boolean>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Boolean invoke(int i12) {
                            InterfaceC9615a interfaceC9615aM16456G = textFunction2.m17173f().m16456G();
                            return Boolean.valueOf(interfaceC9615aM16456G != null ? interfaceC9615aM16456G.mo11224c(i12) : false);
                        }
                    });
                    TextFunction textFunction3 = this.f8366a;
                    AbstractC9882f.b bVarM16910c = AbstractC9880d.m16910c(listM7262c0);
                    textFunction3.m7272k0(bVarM16910c != null ? Integer.valueOf(bVarM16910c.m16921a()) : null);
                    this.f8366a.m17170U(false);
                }
            };
            if (listM7262c0.get(iM16888a) instanceof AbstractC9882f.b) {
                AbstractC9882f.b bVarM16910c = AbstractC9880d.m16910c(listM7262c0);
                if (bVarM16910c == null || !bVarM16910c.m16925e()) {
                    if (bVarM16910c != null) {
                        bVarM16910c.m16926f(true);
                    }
                    InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
                    if (interfaceC9615aM16456G != null) {
                        interfaceC9615aM16456G.mo11225d(function1);
                    }
                    AbstractC9882f.b bVarM16910c2 = AbstractC9880d.m16910c(listM7262c0);
                    int iM16921a = bVarM16910c2 != null ? bVarM16910c2.m16921a() : 0;
                    InterfaceC9615a interfaceC9615aM16456G2 = m17173f().m16456G();
                    if (interfaceC9615aM16456G2 == null || !interfaceC9615aM16456G2.mo11224c(iM16921a)) {
                        AbstractC9880d.m16915h(listM7262c0);
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
                function1.invoke(Integer.valueOf(((AbstractC9882f) listM7262c0.get(iM16888a)).m16921a()));
            }
        }
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: B */
    public boolean mo7267B(float f10, float f11) {
        InterfaceC8055c interfaceC8055c;
        if (!Intrinsics.areEqual(m17174g(), AbstractC9878b.b.f17635a) || (interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u())) == null) {
            return false;
        }
        final C8101d c8101d = (C8101d) interfaceC8055c;
        final String strM12942H = c8101d.m12942H();
        if (strM12942H == null) {
            strM12942H = "";
        }
        final RectF rectF = new RectF(c8101d.mo12797f());
        InterfaceC9617c interfaceC9617cM16464O = m17173f().m16464O();
        if (interfaceC9617cM16464O == null) {
            return true;
        }
        interfaceC9617cM16464O.mo11218a(strM12942H, new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleDoubleClick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TextFunction textFunction = this.f8369a;
                Paint paintM12943I = c8101d.m12943I();
                Intrinsics.checkNotNull(paintM12943I);
                RectF rectFM7268b0 = textFunction.m7268b0(it, paintM12943I, new RectF(c8101d.mo12797f()));
                if (!Intrinsics.areEqual(rectFM7268b0, c8101d.mo12797f())) {
                    c8101d.mo7862n(rectFM7268b0);
                }
                c8101d.m12944J(it);
                InterfaceC0039c interfaceC0039cM17181o = this.f8369a.m17181o();
                String id = c8101d.getId();
                String strM12942H2 = c8101d.m12942H();
                if (strM12942H2 == null) {
                    strM12942H2 = "";
                }
                Paint paintM12943I2 = c8101d.m12943I();
                Intrinsics.checkNotNull(paintM12943I2);
                interfaceC0039cM17181o.mo176C(id, strM12942H2, paintM12943I2, c8101d.mo12797f());
                this.f8369a.m7273l0();
                AbstractC9948a.m17155V(this.f8369a, false, 1, null);
            }
        }, new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleDoubleClick$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC0039c interfaceC0039cM17181o = this.f8371a.m17181o();
                String id = c8101d.getId();
                String strM12942H2 = c8101d.m12942H();
                if (strM12942H2 == null) {
                    strM12942H2 = "";
                }
                Paint paintM12943I = c8101d.m12943I();
                Intrinsics.checkNotNull(paintM12943I);
                interfaceC0039cM17181o.mo176C(id, strM12942H2, paintM12943I, c8101d.mo12797f());
                this.f8371a.m7273l0();
                AbstractC9948a.m17155V(this.f8371a, false, 1, null);
                InterfaceC9822b interfaceC9822bM17183q = this.f8371a.m17183q();
                C8101d c8101d2 = c8101d;
                InterfaceC9822b.a.m16708a(interfaceC9822bM17183q, c8101d2, EzyGraphEnum.GraphEnum.TEXT_GRAPH, c8101d2.mo12797f(), c8101d.m12942H(), null, null, null, null, 240, null);
                this.f8371a.m17183q().mo16693l();
            }
        }, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleDoubleClick$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c8101d.m12944J(strM12942H);
                if (!Intrinsics.areEqual(rectF, c8101d.mo12797f())) {
                    c8101d.mo7862n(rectF);
                }
                InterfaceC0039c interfaceC0039cM17181o = this.m17181o();
                String id = c8101d.getId();
                String strM12942H2 = c8101d.m12942H();
                if (strM12942H2 == null) {
                    strM12942H2 = "";
                }
                Paint paintM12943I = c8101d.m12943I();
                Intrinsics.checkNotNull(paintM12943I);
                interfaceC0039cM17181o.mo176C(id, strM12942H2, paintM12943I, c8101d.mo12797f());
                this.m7273l0();
                AbstractC9948a.m17155V(this, false, 1, null);
            }
        });
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: C */
    public boolean mo7229C(float f10, float f11) {
        if (super.mo7229C(f10, f11)) {
            return true;
        }
        if (!Intrinsics.areEqual(m17174g(), AbstractC9878b.c.C10090c.f17638a)) {
            return false;
        }
        m7270f0(f10);
        m7273l0();
        m7261a0();
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c != null) {
            InterfaceC0039c.a.m225b(m17181o(), m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), null, 64, null);
            InterfaceC9822b.a.m16708a(m17183q(), interfaceC8055c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, interfaceC8055c.mo12797f(), null, null, null, null, null, 248, null);
        }
        m17183q().mo16693l();
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: D */
    public boolean mo7230D(float f10, float f11) {
        if (!Intrinsics.areEqual(m17174g(), AbstractC9878b.c.C10090c.f17638a)) {
            return true;
        }
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c == null) {
            return false;
        }
        C8101d c8101d = (C8101d) interfaceC8055c;
        Matrix matrix = new Matrix();
        matrix.postConcat(c8101d.mo12794b());
        matrix.postConcat(m17184r().m17344b());
        this.f8359A = matrix.mapRadius(c8101d.mo12797f().width());
        m7273l0();
        m7261a0();
        InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c2 == null) {
            return true;
        }
        InterfaceC0039c.a.m226c(m17181o(), (C8101d) interfaceC8055c2, m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), null, 128, null);
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: E */
    public boolean mo7231E(float f10, float f11) {
        if (super.mo7231E(f10, f11)) {
            return true;
        }
        if (!Intrinsics.areEqual(m17174g(), AbstractC9878b.c.C10090c.f17638a)) {
            return false;
        }
        m7270f0(f10);
        m7273l0();
        m7261a0();
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c != null) {
            InterfaceC0039c.a.m227d(m17181o(), (C8101d) interfaceC8055c, m17187v(), m17175i(), m17185t(), m17179m(), m17178l(), mo7249h(), null, 128, null);
        }
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: J */
    public boolean mo7232J(float f10, float f11) {
        AbstractC9882f.b bVarM16910c;
        if (m17179m().m17220f().contains(f10, f11)) {
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
        AbstractC9879c.f fVarM16912e = AbstractC9880d.m16912e(this.f8361v);
        if (fVarM16912e != null && fVarM16912e.m16892b()) {
            if (m17179m().m17221g().contains(f10, f11)) {
                m17163M(AbstractC9878b.j.a.f17646a);
                return true;
            }
            if (m17179m().m17222h().contains(f10, f11)) {
                m17163M(AbstractC9878b.j.b.f17647a);
                return true;
            }
            if (m17178l().m17198d().contains(f10, f11)) {
                m17163M(AbstractC9878b.e.f17641a);
                return true;
            }
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
            List listM7262c0 = m7262c0();
            if (listM7262c0 != null && (bVarM16910c = AbstractC9880d.m16910c(listM7262c0)) != null && bVarM16910c.m16925e()) {
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
        float fMapRadius = matrixM16200b.mapRadius(m17173f().m16459J()) / 2;
        RectF rectF = new RectF(m17187v().right - fMapRadius, m17187v().centerY() - fMapRadius, m17187v().right + fMapRadius, m17187v().centerY() + fMapRadius);
        if (m7263e0() && rectF.contains(f12, f13)) {
            m17163M(AbstractC9878b.c.C10090c.f17638a);
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
        m7265i0();
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            interfaceC9615aM16456G.mo11225d(null);
        }
        m7272k0(null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.mo7234P(java.util.List):void"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali:3201
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: X */
    public void mo7235X() {
        C9952e c9952eM17179m = m17179m();
        int i9 = 0;
        c9952eM17179m.m17220f().set((m17185t().left + ((RectF) this.f8362w.get(0)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8362w.get(0)).right + 15.0f, m17185t().top + m17173f().m16455F());
        c9952eM17179m.m17217c().set((m17185t().left + ((RectF) this.f8362w.get(1)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8362w.get(1)).right + 15.0f, m17185t().top + m17173f().m16455F());
        float f10 = 2;
        c9952eM17179m.m17222h().set((m17185t().left + this.f8364y.left) - 32.0f, m17185t().top + m17173f().m16455F() + 13.0f, m17185t().left + this.f8364y.right + 32.0f, m17185t().top + (m17173f().m16455F() * f10) + 13.0f);
        c9952eM17179m.m17221g().set((m17185t().left + this.f8363x.left) - 32.0f, m17185t().top + m17173f().m16455F() + 13.0f, m17185t().left + this.f8363x.right + 32.0f, m17185t().top + (m17173f().m16455F() * f10) + 13.0f);
        float f11 = c9952eM17179m.m17221g().right + 13.0f;
        c9952eM17179m.m17215a().clear();
        ArrayList arrayList = this.f8365z;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            RectF rectF = (RectF) obj;
            c9952eM17179m.m17215a().add(new RectF(rectF.left + f11, m17185t().top + m17173f().m16455F() + 13.0f + rectF.top, rectF.right + f11, m17185t().top + m17173f().m16455F() + 13.0f + rectF.bottom));
        }
        m17179m().m17216b().setEmpty();
        InterfaceC9615a interfaceC9615aM16456G = m17173f().m16456G();
        if (interfaceC9615aM16456G != null) {
            List listM7262c0 = m7262c0();
            if ((listM7262c0 != null ? AbstractC9880d.m16910c(listM7262c0) : null) == null) {
                interfaceC9615aM16456G = null;
            }
            if (interfaceC9615aM16456G != null) {
                c9952eM17179m.m17216b().set(m17185t().left, m17185t().top + ((m17173f().m16455F() + 13.0f) * f10), m17185t().left + interfaceC9615aM16456G.getWidth(), m17185t().top + ((m17173f().m16455F() + 13.0f) * f10) + interfaceC9615aM16456G.getHeight());
            }
        }
        if (m17162K()) {
            return;
        }
        float f12 = (c9952eM17179m.m17217c().right - c9952eM17179m.m17220f().left) + 16.0f;
        c9952eM17179m.m17220f().offset(m17185t().width() - f12, 0.0f);
        c9952eM17179m.m17217c().offset(m17185t().width() - f12, 0.0f);
        float fWidth = m17185t().width() - (((c9952eM17179m.m17221g().right - c9952eM17179m.m17222h().left) + 13.0f) + ((((RectF) CollectionsKt.last((List) c9952eM17179m.m17215a())).right - ((RectF) CollectionsKt.first((List) c9952eM17179m.m17215a())).left) + 46.0f));
        c9952eM17179m.m17222h().offset(fWidth, 0.0f);
        c9952eM17179m.m17221g().offset(fWidth, 0.0f);
        ArrayList arrayListM17215a = c9952eM17179m.m17215a();
        int size2 = arrayListM17215a.size();
        while (i9 < size2) {
            Object obj2 = arrayListM17215a.get(i9);
            i9++;
            ((RectF) obj2).offset(fWidth, 0.0f);
        }
        c9952eM17179m.m17216b().offset(m17185t().width() - c9952eM17179m.m17216b().width(), 0.0f);
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
            interfaceC9615aM16456G.mo11223b(m7269d0());
        }
    }

    /* renamed from: b0 */
    public final RectF m7268b0(String str, Paint paint, RectF rectF) {
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C9701t.f17139a.m16219a(str, paint, rectF.width()).size();
        if (size > m17173f().m16485f().height()) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        rectF.bottom = m17173f().m16485f().height() + rectF.top;
        return rectF;
    }

    /* renamed from: d0 */
    public Integer m7269d0() {
        return this.f8360u;
    }

    /* renamed from: f0 */
    public final void m7270f0(float f10) {
        float fM17176j = f10 - m17176j();
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c != null) {
            C8101d c8101d = (C8101d) interfaceC8055c;
            Matrix matrix = new Matrix();
            matrix.postConcat(c8101d.mo12794b());
            matrix.postConcat(m17184r().m17344b());
            float f11 = this.f8359A + fM17176j;
            Paint paintM12943I = c8101d.m12943I();
            Intrinsics.checkNotNull(paintM12943I);
            String strM12942H = c8101d.m12942H();
            Intrinsics.checkNotNull(strM12942H);
            float fMapRadius = matrix.mapRadius(paintM12943I.measureText(String.valueOf(StringsKt.first(strM12942H))));
            if (f11 <= m17173f().m16459J() * 2 || f11 <= fMapRadius) {
                return;
            }
            float fMapRadius2 = AbstractC9695n.m16200b(matrix).mapRadius(f11);
            RectF rectF = new RectF(c8101d.mo12797f());
            rectF.right = rectF.left + fMapRadius2;
            String strM12942H2 = c8101d.m12942H();
            Intrinsics.checkNotNull(strM12942H2);
            Paint paintM12943I2 = c8101d.m12943I();
            Intrinsics.checkNotNull(paintM12943I2);
            c8101d.mo7862n(m7268b0(strM12942H2, paintM12943I2, rectF));
        }
    }

    /* renamed from: g0 */
    public final void m7271g0(float f10) {
        C8101d c8101d;
        Paint paintM12943I;
        StringBuilder sb = new StringBuilder();
        sb.append("TextFunction:TextSize -> offset:");
        sb.append(f10);
        sb.append(" list: ");
        ArrayList arrayListM17186u = m17186u();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM17186u, 10));
        int size = arrayListM17186u.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayListM17186u.get(i9);
            i9++;
            arrayList.add(((InterfaceC8055c) obj).getId());
        }
        sb.append(arrayList);
        LogUtils.m2956i(sb.toString());
        ArrayList arrayListM17186u2 = m17186u();
        int size2 = arrayListM17186u2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayListM17186u2.get(i10);
            i10++;
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) obj2;
            if ((interfaceC8055c instanceof C8101d) && (paintM12943I = (c8101d = (C8101d) interfaceC8055c).m12943I()) != null) {
                Matrix matrix = new Matrix();
                matrix.postConcat(interfaceC8055c.mo12794b());
                matrix.postConcat(m17184r().m17344b());
                float fMapRadius = matrix.mapRadius(paintM12943I.getTextSize()) + f10;
                if (f10 >= 0.0f || fMapRadius >= m17173f().m16482d()) {
                    if (f10 <= 0.0f || fMapRadius <= m17173f().m16480c()) {
                        paintM12943I.setTextSize(AbstractC9695n.m16200b(matrix).mapRadius(fMapRadius));
                        c8101d.m12945K(paintM12943I);
                        RectF rectF = new RectF(interfaceC8055c.mo12797f());
                        String strM12942H = c8101d.m12942H();
                        if (strM12942H == null) {
                            strM12942H = "";
                        }
                        Paint paintM12943I2 = c8101d.m12943I();
                        Intrinsics.checkNotNull(paintM12943I2);
                        m7268b0(strM12942H, paintM12943I2, rectF);
                        c8101d.mo7862n(rectF);
                        InterfaceC9478f interfaceC9478fMo16686e = m17183q().mo16686e();
                        if (interfaceC9478fMo16686e != null) {
                            interfaceC9478fMo16686e.mo2227a(fMapRadius);
                        }
                        InterfaceC0039c interfaceC0039cM17181o = m17181o();
                        String id = interfaceC8055c.getId();
                        String strM12942H2 = c8101d.m12942H();
                        interfaceC0039cM17181o.mo176C(id, strM12942H2 != null ? strM12942H2 : "", paintM12943I, interfaceC8055c.mo12797f());
                        InterfaceC9822b.a.m16708a(m17183q(), interfaceC8055c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, rectF, null, new Paint(paintM12943I), null, null, null, 232, null);
                    }
                }
            }
        }
        m17183q().mo16693l();
        m7273l0();
        AbstractC9948a.m17155V(this, false, 1, null);
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: h */
    public List mo7249h() {
        return this.f8361v;
    }

    /* renamed from: k0 */
    public void m7272k0(Integer num) {
        this.f8360u = num;
    }

    /* renamed from: l0 */
    public final void m7273l0() {
        m17187v().setEmpty();
        ArrayList arrayListM17186u = m17186u();
        int size = arrayListM17186u.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayListM17186u.get(i9);
            i9++;
            m17187v().union(((InterfaceC8055c) obj).mo12799i(m17184r().m17344b()));
        }
        m17190y().reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // p302y4.AbstractC9948a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF mo7252s() {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f8362w
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList r1 = r8.f8365z
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r1)
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            float r1 = r1.right
            r2 = 1102577664(0x41b80000, float:23.0)
            float r1 = r1 + r2
            r2 = 1128202240(0x433f0000, float:191.0)
            float r2 = r2 + r1
            java.util.List r1 = r8.m7262c0()
            r3 = 0
            if (r1 == 0) goto L2c
            x4.f$b r1 = p292x4.AbstractC9880d.m16910c(r1)
            goto L2d
        L2c:
            r1 = r3
        L2d:
            if (r1 == 0) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = 0
        L32:
            v4.b r4 = r8.m17173f()
            t5.a r4 = r4.m16456G()
            r5 = 0
            if (r4 == 0) goto L48
            if (r1 == 0) goto L40
            goto L41
        L40:
            r4 = r3
        L41:
            if (r4 == 0) goto L48
            float r4 = r4.getWidth()
            goto L49
        L48:
            r4 = r5
        L49:
            v4.b r6 = r8.m17173f()
            t5.a r6 = r6.m16456G()
            r7 = 1095761920(0x41500000, float:13.0)
            if (r6 == 0) goto L60
            if (r1 == 0) goto L58
            r3 = r6
        L58:
            if (r3 == 0) goto L60
            float r1 = r3.getHeight()
            float r1 = r1 + r7
            goto L61
        L60:
            r1 = r5
        L61:
            kotlin.Pair r3 = new kotlin.Pair
            float r0 = java.lang.Math.max(r0, r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            v4.b r2 = r8.m17173f()
            float r2 = r2.m16455F()
            r6 = 2
            float r6 = (float) r6
            float r2 = r2 * r6
            float r2 = r2 + r7
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.<init>(r0, r2)
            r8.m17167R(r3)
            kotlin.Pair r0 = r8.m17189x()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r4)
            kotlin.Pair r2 = r8.m17189x()
            java.lang.Object r2 = r2.getSecond()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 + r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.mo7252s():android.graphics.RectF"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali:6526
    }
}
