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
import p035c5.InterfaceC5123f;
import p066d5.InterfaceC7289a;
import p066d5.InterfaceC7291c;
import p077e5.AbstractC7352m;
import p077e5.C7358s;
import p098g4.InterfaceC7522b;
import p109h4.AbstractC7624b;
import p109h4.AbstractC7625c;
import p109h4.AbstractC7626d;
import p109h4.AbstractC7628f;
import p120i4.AbstractC7661a;
import p120i4.C7665e;
import p120i4.InterfaceC7666f;
import p142k4.InterfaceC7880c;
import p210q4.InterfaceC8888c;
import p221r4.C9008d;

/* loaded from: classes4.dex */
public final class TextFunction extends AbstractC7661a implements InterfaceC7666f {

    /* renamed from: A */
    public float f7076A;

    /* renamed from: u */
    public Integer f7077u;

    /* renamed from: v */
    public final ArrayList f7078v;

    /* renamed from: w */
    public final ArrayList f7079w;

    /* renamed from: x */
    public final RectF f7080x;

    /* renamed from: y */
    public final RectF f7081y;

    /* renamed from: z */
    public final ArrayList f7082z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFunction(InterfaceC7522b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7078v = new ArrayList();
        this.f7079w = new ArrayList();
        this.f7080x = new RectF();
        this.f7081y = new RectF();
        this.f7082z = new ArrayList();
        m6169i0();
        m6168h0();
    }

    /* renamed from: a0 */
    private final void m6165a0() {
        m12763t().set(mo6156s());
        m12742N(m12758n(m12763t(), m12766w(), m12760p(), m12767x()));
        mo6139X();
        m12749W();
    }

    /* renamed from: c0 */
    private final List m6166c0() {
        AbstractC7625c.f fVarM12585e = AbstractC7626d.m12585e(this.f7078v);
        if (fVarM12585e != null) {
            return fVarM12585e.m12571d();
        }
        return null;
    }

    /* renamed from: e0 */
    private final boolean m6167e0() {
        return m12764u().size() == 1;
    }

    /* renamed from: h0 */
    private final void m6168h0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float selectButtonHeight = (m12751f().getSelectButtonHeight() - f10) / f11;
        float selectButtonHeight2 = ((m12751f().getSelectButtonHeight() - f10) / f11) + f10;
        ArrayList arrayList = this.f7078v;
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
            this.f7079w.add(new RectF(f12, selectButtonHeight, f12 + fMeasureText, selectButtonHeight2));
            f12 += fMeasureText + 30.0f;
        }
        this.f7081y.set(32.0f, (m12751f().getSelectButtonHeight() - 24.0f) / f11, 56.0f, ((m12751f().getSelectButtonHeight() - 24.0f) / f11) + 24.0f);
        this.f7080x.set(122.0f, (m12751f().getSelectButtonHeight() - 24.0f) / f11, 146.0f, ((m12751f().getSelectButtonHeight() - 24.0f) / f11) + 24.0f);
        m6170j0();
    }

    /* renamed from: i0 */
    private final void m6169i0() {
        this.f7078v.clear();
        this.f7078v.add(new AbstractC7625c.f(m6167e0(), AbstractC7626d.m12581a(m12751f().getSelectEditColorList())));
        this.f7078v.add(AbstractC7625c.a.f12802c);
    }

    /* renamed from: j0 */
    private final void m6170j0() {
        this.f7082z.clear();
        float f10 = 2;
        float selectButtonHeight = (m12751f().getSelectButtonHeight() - 38.0f) / f10;
        float selectButtonHeight2 = ((m12751f().getSelectButtonHeight() - 38.0f) / f10) + 38.0f;
        int size = AbstractC7626d.m12581a(m12751f().getSelectEditColorList()).size();
        for (int i10 = 0; i10 < size; i10++) {
            float f11 = (i10 * 61.0f) + 23.0f;
            this.f7082z.add(new RectF(f11, selectButtonHeight, f11 + 38.0f, selectButtonHeight2));
        }
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
                AbstractC7625c.f fVarM12585e = AbstractC7626d.m12585e(this.f7078v);
                if (fVarM12585e != null) {
                    fVarM12585e.m12566c(!fVarM12585e.m12565b());
                    m12748U(false);
                }
            } else if (iM12562a == 1) {
                m12759o().mo13452q(m12764u());
                m12759o().mo13439d();
                m12761q().mo12249n(m12764u(), System.currentTimeMillis());
                m12761q().mo12247l();
                mo6137L();
            }
        } else if (abstractC7624bM12752g instanceof AbstractC7624b.j.a) {
            m6175g0(4.0f);
        } else if (abstractC7624bM12752g instanceof AbstractC7624b.j.b) {
            m6175g0(-4.0f);
        } else if (abstractC7624bM12752g instanceof AbstractC7624b.a) {
            AbstractC7624b abstractC7624bM12752g3 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iM12561a = ((AbstractC7624b.a) abstractC7624bM12752g3).m12561a();
            final List listM6166c0 = m6166c0();
            if (listM6166c0 == null) {
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

                public final void invoke(int i10) {
                    C9008d c9008d;
                    Paint paintM15160J;
                    ArrayList arrayListM12764u = this.f7083a.m12764u();
                    TextFunction textFunction = this.f7083a;
                    int size = arrayListM12764u.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayListM12764u.get(i11);
                        i11++;
                        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) obj;
                        if ((interfaceC8888c instanceof C9008d) && (paintM15160J = (c9008d = (C9008d) interfaceC8888c).m15160J()) != null) {
                            paintM15160J.setColor(i10);
                            c9008d.m15162L(paintM15160J);
                            InterfaceC7522b.a.m12262a(textFunction.m12761q(), interfaceC8888c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, null, new Paint(paintM15160J), null, null, null, 236, null);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("TextFunction:TextColor -> color:");
                    sb.append(i10);
                    sb.append(" list: ");
                    ArrayList arrayListM12764u2 = this.f7083a.m12764u();
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
                    InterfaceC5123f interfaceC5123fMo12240e = this.f7083a.m12761q().mo12240e();
                    if (interfaceC5123fMo12240e != null) {
                        interfaceC5123fMo12240e.mo2784d(i10);
                    }
                    this.f7083a.m12759o().mo13440e();
                    this.f7083a.m12761q().mo12247l();
                    List list = listM6166c0;
                    final TextFunction textFunction2 = this.f7083a;
                    AbstractC7626d.m12587g(list, i10, new Function1<Integer, Boolean>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Boolean invoke(int i13) {
                            InterfaceC7289a selectCustomColorView = textFunction2.m12751f().getSelectCustomColorView();
                            return Boolean.valueOf(selectCustomColorView != null ? selectCustomColorView.mo10825c(i13) : false);
                        }
                    });
                    TextFunction textFunction3 = this.f7083a;
                    AbstractC7628f.b bVarM12583c = AbstractC7626d.m12583c(listM6166c0);
                    textFunction3.m6176k0(bVarM12583c != null ? Integer.valueOf(bVarM12583c.m12594a()) : null);
                    this.f7083a.m12748U(false);
                }
            };
            if (listM6166c0.get(iM12561a) instanceof AbstractC7628f.b) {
                AbstractC7628f.b bVarM12583c = AbstractC7626d.m12583c(listM6166c0);
                if (bVarM12583c == null || !bVarM12583c.m12598e()) {
                    if (bVarM12583c != null) {
                        bVarM12583c.m12599f(true);
                    }
                    InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
                    if (selectCustomColorView != null) {
                        selectCustomColorView.mo10826d(function1);
                    }
                    AbstractC7628f.b bVarM12583c2 = AbstractC7626d.m12583c(listM6166c0);
                    int iM12594a = bVarM12583c2 != null ? bVarM12583c2.m12594a() : 0;
                    InterfaceC7289a selectCustomColorView2 = m12751f().getSelectCustomColorView();
                    if (selectCustomColorView2 == null || !selectCustomColorView2.mo10825c(iM12594a)) {
                        AbstractC7626d.m12588h(listM6166c0);
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
                function1.invoke(Integer.valueOf(((AbstractC7628f) listM6166c0.get(iM12561a)).m12594a()));
            }
        }
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: B */
    public boolean mo6171B(float f10, float f11) {
        InterfaceC8888c interfaceC8888c;
        if (!Intrinsics.areEqual(m12752g(), AbstractC7624b.b.f12786a) || (interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u())) == null) {
            return false;
        }
        final C9008d c9008d = (C9008d) interfaceC8888c;
        final String strM15159I = c9008d.m15159I();
        if (strM15159I == null) {
            strM15159I = "";
        }
        final RectF rectF = new RectF(c9008d.mo14996g());
        InterfaceC7291c textEditView = m12751f().getTextEditView();
        if (textEditView == null) {
            return true;
        }
        textEditView.mo10819a(strM15159I, new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleDoubleClick$1
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
                TextFunction textFunction = this.f7086a;
                Paint paintM15160J = c9008d.m15160J();
                Intrinsics.checkNotNull(paintM15160J);
                RectF rectFM6172b0 = textFunction.m6172b0(it, paintM15160J, new RectF(c9008d.mo14996g()));
                if (!Intrinsics.areEqual(rectFM6172b0, c9008d.mo14996g())) {
                    c9008d.mo6750o(rectFM6172b0);
                }
                c9008d.m15161K(it);
                InterfaceC7880c interfaceC7880cM12759o = this.f7086a.m12759o();
                String id = c9008d.getId();
                String strM15159I2 = c9008d.m15159I();
                if (strM15159I2 == null) {
                    strM15159I2 = "";
                }
                Paint paintM15160J2 = c9008d.m15160J();
                Intrinsics.checkNotNull(paintM15160J2);
                interfaceC7880cM12759o.mo13415B(id, strM15159I2, paintM15160J2, c9008d.mo14996g());
                this.f7086a.m6177l0();
                AbstractC7661a.m12733V(this.f7086a, false, 1, null);
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
                InterfaceC7880c interfaceC7880cM12759o = this.f7088a.m12759o();
                String id = c9008d.getId();
                String strM15159I2 = c9008d.m15159I();
                if (strM15159I2 == null) {
                    strM15159I2 = "";
                }
                Paint paintM15160J = c9008d.m15160J();
                Intrinsics.checkNotNull(paintM15160J);
                interfaceC7880cM12759o.mo13415B(id, strM15159I2, paintM15160J, c9008d.mo14996g());
                this.f7088a.m6177l0();
                AbstractC7661a.m12733V(this.f7088a, false, 1, null);
                InterfaceC7522b interfaceC7522bM12761q = this.f7088a.m12761q();
                C9008d c9008d2 = c9008d;
                InterfaceC7522b.a.m12262a(interfaceC7522bM12761q, c9008d2, EzyGraphEnum.GraphEnum.TEXT_GRAPH, c9008d2.mo14996g(), c9008d.m15159I(), null, null, null, null, 240, null);
                this.f7088a.m12761q().mo12247l();
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
                c9008d.m15161K(strM15159I);
                if (!Intrinsics.areEqual(rectF, c9008d.mo14996g())) {
                    c9008d.mo6750o(rectF);
                }
                InterfaceC7880c interfaceC7880cM12759o = this.m12759o();
                String id = c9008d.getId();
                String strM15159I2 = c9008d.m15159I();
                if (strM15159I2 == null) {
                    strM15159I2 = "";
                }
                Paint paintM15160J = c9008d.m15160J();
                Intrinsics.checkNotNull(paintM15160J);
                interfaceC7880cM12759o.mo13415B(id, strM15159I2, paintM15160J, c9008d.mo14996g());
                this.m6177l0();
                AbstractC7661a.m12733V(this, false, 1, null);
            }
        });
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: C */
    public boolean mo6133C(float f10, float f11) {
        if (super.mo6133C(f10, f11)) {
            return true;
        }
        if (!Intrinsics.areEqual(m12752g(), AbstractC7624b.c.C10145c.f12789a)) {
            return false;
        }
        m6174f0(f10);
        m6177l0();
        m6165a0();
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c != null) {
            InterfaceC7880c.a.m13463b(m12759o(), m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), null, 64, null);
            InterfaceC7522b.a.m12262a(m12761q(), interfaceC8888c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, interfaceC8888c.mo14996g(), null, null, null, null, null, 248, null);
        }
        m12761q().mo12247l();
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: D */
    public boolean mo6134D(float f10, float f11) {
        if (!Intrinsics.areEqual(m12752g(), AbstractC7624b.c.C10145c.f12789a)) {
            return true;
        }
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c == null) {
            return false;
        }
        C9008d c9008d = (C9008d) interfaceC8888c;
        Matrix matrix = new Matrix();
        matrix.postConcat(c9008d.mo14993b());
        matrix.postConcat(m12762r().m13188b());
        this.f7076A = matrix.mapRadius(c9008d.mo14996g().width());
        m6177l0();
        m6165a0();
        InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c2 == null) {
            return true;
        }
        InterfaceC7880c.a.m13464c(m12759o(), (C9008d) interfaceC8888c2, m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), null, 128, null);
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: E */
    public boolean mo6135E(float f10, float f11) {
        if (super.mo6135E(f10, f11)) {
            return true;
        }
        if (!Intrinsics.areEqual(m12752g(), AbstractC7624b.c.C10145c.f12789a)) {
            return false;
        }
        m6174f0(f10);
        m6177l0();
        m6165a0();
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c != null) {
            InterfaceC7880c.a.m13465d(m12759o(), (C9008d) interfaceC8888c, m12765v(), m12753i(), m12763t(), m12757m(), m12756l(), mo6153h(), null, 128, null);
        }
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: J */
    public boolean mo6136J(float f10, float f11) {
        AbstractC7628f.b bVarM12583c;
        if (m12757m().m12798f().contains(f10, f11)) {
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
        AbstractC7625c.f fVarM12585e = AbstractC7626d.m12585e(this.f7078v);
        if (fVarM12585e != null && fVarM12585e.m12565b()) {
            if (m12757m().m12799g().contains(f10, f11)) {
                m12741M(AbstractC7624b.j.a.f12797a);
                return true;
            }
            if (m12757m().m12800h().contains(f10, f11)) {
                m12741M(AbstractC7624b.j.b.f12798a);
                return true;
            }
            if (m12756l().m12776d().contains(f10, f11)) {
                m12741M(AbstractC7624b.e.f12792a);
                return true;
            }
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
            List listM6166c0 = m6166c0();
            if (listM6166c0 != null && (bVarM12583c = AbstractC7626d.m12583c(listM6166c0)) != null && bVarM12583c.m12598e()) {
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
        float fMapRadius = matrixM11777b.mapRadius(m12751f().getSelectIconWidth()) / 2;
        RectF rectF = new RectF(m12765v().right - fMapRadius, m12765v().centerY() - fMapRadius, m12765v().right + fMapRadius, m12765v().centerY() + fMapRadius);
        if (m6167e0() && rectF.contains(f12, f13)) {
            m12741M(AbstractC7624b.c.C10145c.f12789a);
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
        m6169i0();
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.mo10826d(null);
        }
        m6176k0(null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.mo6138P(java.util.List):void"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali:3201
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: X */
    public void mo6139X() {
        C7665e c7665eM12757m = m12757m();
        int i10 = 0;
        c7665eM12757m.m12798f().set((m12763t().left + ((RectF) this.f7079w.get(0)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7079w.get(0)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        c7665eM12757m.m12795c().set((m12763t().left + ((RectF) this.f7079w.get(1)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7079w.get(1)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        float f10 = 2;
        c7665eM12757m.m12800h().set((m12763t().left + this.f7081y.left) - 32.0f, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f, m12763t().left + this.f7081y.right + 32.0f, m12763t().top + (m12751f().getSelectButtonHeight() * f10) + 13.0f);
        c7665eM12757m.m12799g().set((m12763t().left + this.f7080x.left) - 32.0f, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f, m12763t().left + this.f7080x.right + 32.0f, m12763t().top + (m12751f().getSelectButtonHeight() * f10) + 13.0f);
        float f11 = c7665eM12757m.m12799g().right + 13.0f;
        c7665eM12757m.m12793a().clear();
        ArrayList arrayList = this.f7082z;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            RectF rectF = (RectF) obj;
            c7665eM12757m.m12793a().add(new RectF(rectF.left + f11, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f + rectF.top, rectF.right + f11, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f + rectF.bottom));
        }
        m12757m().m12794b().setEmpty();
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            List listM6166c0 = m6166c0();
            if ((listM6166c0 != null ? AbstractC7626d.m12583c(listM6166c0) : null) == null) {
                selectCustomColorView = null;
            }
            if (selectCustomColorView != null) {
                c7665eM12757m.m12794b().set(m12763t().left, m12763t().top + ((m12751f().getSelectButtonHeight() + 13.0f) * f10), m12763t().left + selectCustomColorView.getWidth(), m12763t().top + ((m12751f().getSelectButtonHeight() + 13.0f) * f10) + selectCustomColorView.getHeight());
            }
        }
        if (m12740K()) {
            return;
        }
        float f12 = (c7665eM12757m.m12795c().right - c7665eM12757m.m12798f().left) + 16.0f;
        c7665eM12757m.m12798f().offset(m12763t().width() - f12, 0.0f);
        c7665eM12757m.m12795c().offset(m12763t().width() - f12, 0.0f);
        float fWidth = m12763t().width() - (((c7665eM12757m.m12799g().right - c7665eM12757m.m12800h().left) + 13.0f) + ((((RectF) CollectionsKt.last((List) c7665eM12757m.m12793a())).right - ((RectF) CollectionsKt.first((List) c7665eM12757m.m12793a())).left) + 46.0f));
        c7665eM12757m.m12800h().offset(fWidth, 0.0f);
        c7665eM12757m.m12799g().offset(fWidth, 0.0f);
        ArrayList arrayListM12793a = c7665eM12757m.m12793a();
        int size2 = arrayListM12793a.size();
        while (i10 < size2) {
            Object obj2 = arrayListM12793a.get(i10);
            i10++;
            ((RectF) obj2).offset(fWidth, 0.0f);
        }
        c7665eM12757m.m12794b().offset(m12763t().width() - c7665eM12757m.m12794b().width(), 0.0f);
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

    @Override // p120i4.InterfaceC7666f
    /* renamed from: b */
    public void mo6144b() {
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.mo10824b(m6173d0());
        }
    }

    /* renamed from: b0 */
    public final RectF m6172b0(String str, Paint paint, RectF rectF) {
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C7358s.f11926a.m11795a(str, paint, rectF.width()).size();
        if (size > m12751f().getAddTextRectF().height()) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        rectF.bottom = m12751f().getAddTextRectF().height() + rectF.top;
        return rectF;
    }

    /* renamed from: d0 */
    public Integer m6173d0() {
        return this.f7077u;
    }

    /* renamed from: f0 */
    public final void m6174f0(float f10) {
        float fM12754j = f10 - m12754j();
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c != null) {
            C9008d c9008d = (C9008d) interfaceC8888c;
            Matrix matrix = new Matrix();
            matrix.postConcat(c9008d.mo14993b());
            matrix.postConcat(m12762r().m13188b());
            float f11 = this.f7076A + fM12754j;
            Paint paintM15160J = c9008d.m15160J();
            Intrinsics.checkNotNull(paintM15160J);
            String strM15159I = c9008d.m15159I();
            Intrinsics.checkNotNull(strM15159I);
            float fMapRadius = matrix.mapRadius(paintM15160J.measureText(String.valueOf(StringsKt.first(strM15159I))));
            if (f11 <= m12751f().getSelectIconWidth() * 2 || f11 <= fMapRadius) {
                return;
            }
            float fMapRadius2 = AbstractC7352m.m11777b(matrix).mapRadius(f11);
            RectF rectF = new RectF(c9008d.mo14996g());
            rectF.right = rectF.left + fMapRadius2;
            String strM15159I2 = c9008d.m15159I();
            Intrinsics.checkNotNull(strM15159I2);
            Paint paintM15160J2 = c9008d.m15160J();
            Intrinsics.checkNotNull(paintM15160J2);
            c9008d.mo6750o(m6172b0(strM15159I2, paintM15160J2, rectF));
        }
    }

    /* renamed from: g0 */
    public final void m6175g0(float f10) {
        C9008d c9008d;
        Paint paintM15160J;
        StringBuilder sb = new StringBuilder();
        sb.append("TextFunction:TextSize -> offset:");
        sb.append(f10);
        sb.append(" list: ");
        ArrayList arrayListM12764u = m12764u();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM12764u, 10));
        int size = arrayListM12764u.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM12764u.get(i10);
            i10++;
            arrayList.add(((InterfaceC8888c) obj).getId());
        }
        sb.append(arrayList);
        LogUtils.m3239i(sb.toString());
        ArrayList arrayListM12764u2 = m12764u();
        int size2 = arrayListM12764u2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayListM12764u2.get(i11);
            i11++;
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) obj2;
            if ((interfaceC8888c instanceof C9008d) && (paintM15160J = (c9008d = (C9008d) interfaceC8888c).m15160J()) != null) {
                Matrix matrix = new Matrix();
                matrix.postConcat(interfaceC8888c.mo14993b());
                matrix.postConcat(m12762r().m13188b());
                float fMapRadius = matrix.mapRadius(paintM15160J.getTextSize()) + f10;
                if (f10 >= 0.0f || fMapRadius >= m12751f().getAddTextOriginalTextMinSize()) {
                    if (f10 <= 0.0f || fMapRadius <= m12751f().getAddTextOriginalTextMaxSize()) {
                        paintM15160J.setTextSize(AbstractC7352m.m11777b(matrix).mapRadius(fMapRadius));
                        c9008d.m15162L(paintM15160J);
                        RectF rectF = new RectF(interfaceC8888c.mo14996g());
                        String strM15159I = c9008d.m15159I();
                        if (strM15159I == null) {
                            strM15159I = "";
                        }
                        Paint paintM15160J2 = c9008d.m15160J();
                        Intrinsics.checkNotNull(paintM15160J2);
                        m6172b0(strM15159I, paintM15160J2, rectF);
                        c9008d.mo6750o(rectF);
                        InterfaceC5123f interfaceC5123fMo12240e = m12761q().mo12240e();
                        if (interfaceC5123fMo12240e != null) {
                            interfaceC5123fMo12240e.mo2781a(fMapRadius);
                        }
                        InterfaceC7880c interfaceC7880cM12759o = m12759o();
                        String id = interfaceC8888c.getId();
                        String strM15159I2 = c9008d.m15159I();
                        interfaceC7880cM12759o.mo13415B(id, strM15159I2 != null ? strM15159I2 : "", paintM15160J, interfaceC8888c.mo14996g());
                        InterfaceC7522b.a.m12262a(m12761q(), interfaceC8888c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, rectF, null, new Paint(paintM15160J), null, null, null, 232, null);
                    }
                }
            }
        }
        m12761q().mo12247l();
        m6177l0();
        AbstractC7661a.m12733V(this, false, 1, null);
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: h */
    public List mo6153h() {
        return this.f7078v;
    }

    /* renamed from: k0 */
    public void m6176k0(Integer num) {
        this.f7077u = num;
    }

    /* renamed from: l0 */
    public final void m6177l0() {
        m12765v().setEmpty();
        ArrayList arrayListM12764u = m12764u();
        int size = arrayListM12764u.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM12764u.get(i10);
            i10++;
            m12765v().union(((InterfaceC8888c) obj).mo14999j(m12762r().m13188b()));
        }
        m12768y().reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // p120i4.AbstractC7661a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF mo6156s() {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f7079w
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList r1 = r8.f7082z
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r1)
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            float r1 = r1.right
            r2 = 1102577664(0x41b80000, float:23.0)
            float r1 = r1 + r2
            r2 = 1128202240(0x433f0000, float:191.0)
            float r2 = r2 + r1
            java.util.List r1 = r8.m6166c0()
            r3 = 0
            if (r1 == 0) goto L2c
            h4.f$b r1 = p109h4.AbstractC7626d.m12583c(r1)
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
            com.zykj.blackboard.bean.BoardConfig r4 = r8.m12751f()
            d5.a r4 = r4.getSelectCustomColorView()
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
            com.zykj.blackboard.bean.BoardConfig r6 = r8.m12751f()
            d5.a r6 = r6.getSelectCustomColorView()
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
            com.zykj.blackboard.bean.BoardConfig r2 = r8.m12751f()
            float r2 = r2.getSelectButtonHeight()
            r6 = 2
            float r6 = (float) r6
            float r2 = r2 * r6
            float r2 = r2 + r7
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.<init>(r0, r2)
            r8.m12745R(r3)
            kotlin.Pair r0 = r8.m12767x()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r4)
            kotlin.Pair r2 = r8.m12767x()
            java.lang.Object r2 = r2.getSecond()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 + r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.mo6156s():android.graphics.RectF"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali:6526
    }
}
