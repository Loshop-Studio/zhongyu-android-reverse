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
import p066d5.InterfaceC7289a;
import p077e5.AbstractC7352m;
import p077e5.C7344e;
import p098g4.InterfaceC7522b;
import p109h4.AbstractC7624b;
import p109h4.AbstractC7625c;
import p109h4.AbstractC7626d;
import p109h4.AbstractC7628f;
import p120i4.AbstractC7661a;
import p120i4.C7665e;
import p120i4.InterfaceC7666f;
import p210q4.InterfaceC8888c;
import p221r4.InterfaceC9007c;
import p243t4.AbstractC9384c;

/* loaded from: classes4.dex */
public final class WriteFunction extends AbstractC7661a implements InterfaceC7666f {

    /* renamed from: u */
    public Integer f7094u;

    /* renamed from: v */
    public boolean f7095v;

    /* renamed from: w */
    public final ArrayList f7096w;

    /* renamed from: x */
    public final ArrayList f7097x;

    /* renamed from: y */
    public final ArrayList f7098y;

    /* renamed from: z */
    public final ArrayList f7099z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteFunction(InterfaceC7522b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7096w = new ArrayList();
        this.f7097x = new ArrayList();
        this.f7098y = new ArrayList();
        this.f7099z = new ArrayList();
        m6180b0();
        m6179a0();
    }

    /* renamed from: Y */
    private final List m6178Y() {
        AbstractC7625c.g gVarM12586f = AbstractC7626d.m12586f(this.f7096w);
        if (gVarM12586f != null) {
            return gVarM12586f.m12575d();
        }
        return null;
    }

    /* renamed from: a0 */
    private final void m6179a0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float selectButtonHeight = (m12751f().getSelectButtonHeight() - f10) / f11;
        float selectButtonHeight2 = ((m12751f().getSelectButtonHeight() - f10) / f11) + f10;
        ArrayList arrayList = this.f7096w;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((AbstractC7625c) obj).m12564a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            float fMeasureText = paint.measureText(((AbstractC7625c) obj2).m12564a());
            this.f7097x.add(new RectF(f12, selectButtonHeight, f12 + fMeasureText, selectButtonHeight2));
            f12 += fMeasureText + 30.0f;
        }
        int size3 = m12751f().getSelectWriteLevel().size();
        float f13 = 16.0f;
        for (int i12 = 0; i12 < size3; i12++) {
            float f14 = (((i12 * 3.0f) + 8.0f) / f11) + 19.0f;
            float f15 = f13 + f14;
            this.f7098y.add(new PointF(f15, m12751f().getSelectButtonHeight() / f11));
            f13 = f15 + f14;
        }
        m6181d0();
    }

    /* renamed from: b0 */
    private final void m6180b0() {
        this.f7096w.clear();
        this.f7096w.add(AbstractC7625c.d.f12805c);
        this.f7096w.add(AbstractC7625c.e.f12806c);
        this.f7096w.add(new AbstractC7625c.g(false, m12751f().getSelectWriteLevel().get(0).floatValue(), AbstractC7626d.m12581a(m12751f().getSelectEditColorList())));
        this.f7096w.add(AbstractC7625c.a.f12802c);
    }

    /* renamed from: d0 */
    private final void m6181d0() {
        this.f7099z.clear();
        float f10 = 2;
        float selectButtonHeight = (m12751f().getSelectButtonHeight() - 38.0f) / f10;
        float selectButtonHeight2 = ((m12751f().getSelectButtonHeight() - 38.0f) / f10) + 38.0f;
        int size = AbstractC7626d.m12581a(m12751f().getSelectEditColorList()).size();
        for (int i10 = 0; i10 < size; i10++) {
            float f11 = (i10 * 61.0f) + 23.0f;
            this.f7099z.add(new RectF(f11, selectButtonHeight, f11 + 38.0f, selectButtonHeight2));
        }
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: A */
    public boolean mo6132A(float f10, float f11) {
        Paint paintM15703z;
        if (!super.mo6132A(f10, f11)) {
            return false;
        }
        AbstractC7624b abstractC7624bM12752g = m12752g();
        if (abstractC7624bM12752g instanceof AbstractC7624b.d) {
            AbstractC7624b abstractC7624bM12752g2 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM12562a = ((AbstractC7624b.d) abstractC7624bM12752g2).m12562a();
            if (iM12562a == 0) {
                AbstractC7625c.g gVarM12586f = AbstractC7626d.m12586f(this.f7096w);
                if (gVarM12586f != null) {
                    gVarM12586f.m12566c(!gVarM12586f.m12565b());
                    m12748U(false);
                }
            } else if (iM12562a == 1) {
                m12759o().mo13452q(m12764u());
                m12759o().mo13439d();
                m12761q().mo12249n(m12764u(), System.currentTimeMillis());
                m12761q().mo12247l();
                mo6137L();
            }
        } else if (abstractC7624bM12752g instanceof AbstractC7624b.k) {
            AbstractC7624b abstractC7624bM12752g3 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize");
            float fFloatValue = m12751f().getSelectStrokeWidthList(this.f7095v).get(((AbstractC7624b.k) abstractC7624bM12752g3).m12563a()).floatValue();
            ArrayList arrayListM12764u = m12764u();
            int size = arrayListM12764u.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListM12764u.get(i10);
                i10++;
                InterfaceC8888c interfaceC8888c = (InterfaceC8888c) obj;
                for (InterfaceC8888c interfaceC8888c2 : interfaceC8888c.mo14995f()) {
                    if ((interfaceC8888c2 instanceof AbstractC9384c) && (paintM15703z = ((AbstractC9384c) interfaceC8888c2).m15703z()) != null) {
                        paintM15703z.setStrokeWidth(fFloatValue);
                        InterfaceC7522b.a.m12262a(m12761q(), interfaceC8888c2, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(paintM15703z), null, null, null, 236, null);
                    }
                    if (interfaceC8888c instanceof InterfaceC9007c) {
                        ((InterfaceC9007c) interfaceC8888c).mo6748l(true);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("WriteFunction:WriteSize -> size:");
            sb.append(fFloatValue);
            sb.append(" list: ");
            ArrayList arrayListM12764u2 = m12764u();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM12764u2, 10));
            int size2 = arrayListM12764u2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayListM12764u2.get(i11);
                i11++;
                arrayList.add(((InterfaceC8888c) obj2).getId());
            }
            sb.append(arrayList);
            LogUtils.m3239i(sb.toString());
            m12759o().mo13440e();
            m12761q().mo12247l();
            AbstractC7625c.g gVarM12586f2 = AbstractC7626d.m12586f(this.f7096w);
            if (gVarM12586f2 != null) {
                gVarM12586f2.m12580i(fFloatValue);
            }
            m12748U(false);
        } else if (abstractC7624bM12752g instanceof AbstractC7624b.a) {
            AbstractC7624b abstractC7624bM12752g4 = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g4, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iM12561a = ((AbstractC7624b.a) abstractC7624bM12752g4).m12561a();
            final List listM6178Y = m6178Y();
            if (listM6178Y == null) {
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

                public final void invoke(int i12) {
                    Paint paintM15703z2;
                    int iM11748a = this.f7100a.m6183c0() ? C7344e.f11911a.m11748a(i12, this.f7100a.m12751f().getHighlighterColorAlpha()) : i12;
                    ArrayList arrayListM12764u3 = this.f7100a.m12764u();
                    WriteFunction writeFunction = this.f7100a;
                    int size3 = arrayListM12764u3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj3 = arrayListM12764u3.get(i13);
                        i13++;
                        InterfaceC8888c interfaceC8888c3 = (InterfaceC8888c) obj3;
                        for (InterfaceC8888c interfaceC8888c4 : interfaceC8888c3.mo14995f()) {
                            if ((interfaceC8888c4 instanceof AbstractC9384c) && (paintM15703z2 = ((AbstractC9384c) interfaceC8888c4).m15703z()) != null) {
                                paintM15703z2.setColor(iM11748a);
                                InterfaceC7522b.a.m12262a(writeFunction.m12761q(), interfaceC8888c4, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(paintM15703z2), null, null, null, 236, null);
                            }
                        }
                        if (interfaceC8888c3 instanceof InterfaceC9007c) {
                            ((InterfaceC9007c) interfaceC8888c3).mo6748l(true);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WriteFunction:Color -> color:");
                    sb2.append(iM11748a);
                    sb2.append(" list: ");
                    ArrayList arrayListM12764u4 = this.f7100a.m12764u();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM12764u4, 10));
                    int size4 = arrayListM12764u4.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj4 = arrayListM12764u4.get(i14);
                        i14++;
                        arrayList2.add(((InterfaceC8888c) obj4).getId());
                    }
                    sb2.append(arrayList2);
                    LogUtils.m3239i(sb2.toString());
                    Function1<Integer, Unit> selectEditColorChangeListener = this.f7100a.m12751f().getSelectEditColorChangeListener();
                    if (selectEditColorChangeListener != null) {
                        selectEditColorChangeListener.invoke(Integer.valueOf(i12));
                    }
                    this.f7100a.m12759o().mo13440e();
                    this.f7100a.m12761q().mo12247l();
                    List list = listM6178Y;
                    final WriteFunction writeFunction2 = this.f7100a;
                    AbstractC7626d.m12587g(list, i12, new Function1<Integer, Boolean>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Boolean invoke(int i15) {
                            InterfaceC7289a selectCustomColorView = writeFunction2.m12751f().getSelectCustomColorView();
                            return Boolean.valueOf(selectCustomColorView != null ? selectCustomColorView.mo10825c(i15) : false);
                        }
                    });
                    WriteFunction writeFunction3 = this.f7100a;
                    AbstractC7628f.b bVarM12583c = AbstractC7626d.m12583c(listM6178Y);
                    writeFunction3.m6185f0(bVarM12583c != null ? Integer.valueOf(bVarM12583c.m12594a()) : null);
                    this.f7100a.m12748U(false);
                }
            };
            if (listM6178Y.get(iM12561a) instanceof AbstractC7628f.b) {
                AbstractC7628f.b bVarM12583c = AbstractC7626d.m12583c(listM6178Y);
                if (bVarM12583c == null || !bVarM12583c.m12598e()) {
                    if (bVarM12583c != null) {
                        bVarM12583c.m12599f(true);
                    }
                    InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
                    if (selectCustomColorView != null) {
                        selectCustomColorView.mo10826d(function1);
                    }
                    int iM12594a = bVarM12583c != null ? bVarM12583c.m12594a() : 0;
                    InterfaceC7289a selectCustomColorView2 = m12751f().getSelectCustomColorView();
                    if (selectCustomColorView2 == null || !selectCustomColorView2.mo10825c(iM12594a)) {
                        AbstractC7626d.m12588h(listM6178Y);
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
                function1.invoke(Integer.valueOf(((AbstractC7628f) listM6178Y.get(iM12561a)).m12594a()));
            }
        }
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: J */
    public boolean mo6136J(float f10, float f11) {
        AbstractC7628f.b bVarM12583c;
        if (m12757m().m12801i().contains(f10, f11)) {
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
        AbstractC7625c.g gVarM12586f = AbstractC7626d.m12586f(this.f7096w);
        if (gVarM12586f != null && gVarM12586f.m12565b()) {
            int size = m12757m().m12802j().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((RectF) m12757m().m12802j().get(i10)).contains(f10, f11)) {
                    m12741M(new AbstractC7624b.k(i10));
                    return true;
                }
            }
            if (m12756l().m12777e().contains(f10, f11)) {
                m12741M(AbstractC7624b.e.f12792a);
                return true;
            }
            int size2 = m12757m().m12793a().size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((RectF) m12757m().m12793a().get(i11)).contains(f10, f11)) {
                    m12741M(new AbstractC7624b.a(i11));
                    return true;
                }
            }
            if (m12756l().m12773a().contains(f10, f11)) {
                m12741M(AbstractC7624b.e.f12792a);
                return true;
            }
            List listM6178Y = m6178Y();
            if (listM6178Y != null && (bVarM12583c = AbstractC7626d.m12583c(listM6178Y)) != null && bVarM12583c.m12598e()) {
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
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(m12765v().centerX() - f15, m12765v().top - ((5 * fMapRadius) / f14), m12765v().centerX() + f15, m12765v().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            m12741M(AbstractC7624b.h.f12795a);
            return true;
        }
        if (new RectF(m12765v().right - f15, m12765v().bottom - f15, m12765v().right + f15, m12765v().bottom + f15).contains(f12, f13)) {
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
        m6180b0();
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.mo10826d(null);
        }
        m6185f0(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    @Override // p120i4.AbstractC7661a
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo6138P(java.util.List r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction.mo6138P(java.util.List):void"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali:2803
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: X */
    public void mo6139X() {
        C7665e c7665eM12757m = m12757m();
        c7665eM12757m.m12801i().set((m12763t().left + ((RectF) this.f7097x.get(0)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7097x.get(0)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        c7665eM12757m.m12795c().set((m12763t().left + ((RectF) this.f7097x.get(1)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7097x.get(1)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        c7665eM12757m.m12802j().clear();
        ArrayList arrayList = this.f7098y;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PointF pointF = (PointF) obj;
            float f10 = 2;
            float f11 = ((i10 * 3.0f) + 8.0f) / f10;
            c7665eM12757m.m12802j().add(new RectF(((m12763t().left + pointF.x) - f11) - 19.0f, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f, m12763t().left + pointF.x + f11 + 19.0f, m12763t().top + (m12751f().getSelectButtonHeight() * f10) + 13.0f));
            i10 = i12;
        }
        float f12 = ((RectF) CollectionsKt.last((List) m12757m().m12802j())).right + 16.0f + 13.0f;
        c7665eM12757m.m12793a().clear();
        ArrayList arrayList2 = this.f7099z;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            RectF rectF = (RectF) obj2;
            c7665eM12757m.m12793a().add(new RectF(rectF.left + f12, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f + rectF.top, rectF.right + f12, m12763t().top + m12751f().getSelectButtonHeight() + 13.0f + rectF.bottom));
        }
        m12757m().m12794b().setEmpty();
        InterfaceC7289a selectCustomColorView = m12751f().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            List listM6178Y = m6178Y();
            if ((listM6178Y != null ? AbstractC7626d.m12583c(listM6178Y) : null) == null) {
                selectCustomColorView = null;
            }
            if (selectCustomColorView != null) {
                float f13 = 2;
                c7665eM12757m.m12794b().set(m12763t().left, m12763t().top + ((m12751f().getSelectButtonHeight() + 13.0f) * f13), m12763t().left + selectCustomColorView.getWidth(), m12763t().top + ((m12751f().getSelectButtonHeight() + 13.0f) * f13) + selectCustomColorView.getHeight());
            }
        }
        if (m12740K()) {
            return;
        }
        float f14 = (c7665eM12757m.m12795c().right - c7665eM12757m.m12801i().left) + 16.0f;
        c7665eM12757m.m12801i().offset(m12763t().width() - f14, 0.0f);
        c7665eM12757m.m12795c().offset(m12763t().width() - f14, 0.0f);
        float fWidth = m12763t().width() - ((((((RectF) CollectionsKt.last((List) c7665eM12757m.m12802j())).right - ((RectF) CollectionsKt.first((List) c7665eM12757m.m12802j())).left) + 32.0f) + 13.0f) + ((((RectF) CollectionsKt.last((List) c7665eM12757m.m12793a())).right - ((RectF) CollectionsKt.first((List) c7665eM12757m.m12793a())).left) + 46.0f));
        ArrayList arrayListM12802j = c7665eM12757m.m12802j();
        int size3 = arrayListM12802j.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayListM12802j.get(i14);
            i14++;
            ((RectF) obj3).offset(fWidth, 0.0f);
        }
        ArrayList arrayListM12793a = c7665eM12757m.m12793a();
        int size4 = arrayListM12793a.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj4 = arrayListM12793a.get(i15);
            i15++;
            ((RectF) obj4).offset(fWidth, 0.0f);
        }
        c7665eM12757m.m12794b().offset(m12763t().width() - c7665eM12757m.m12794b().width(), 0.0f);
    }

    /* renamed from: Z */
    public Integer m6182Z() {
        return this.f7094u;
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
            selectCustomColorView.mo10824b(m6182Z());
        }
    }

    /* renamed from: c0 */
    public final boolean m6183c0() {
        return this.f7095v;
    }

    /* renamed from: e0 */
    public final void m6184e0(boolean z9) {
        this.f7095v = z9;
    }

    /* renamed from: f0 */
    public void m6185f0(Integer num) {
        this.f7094u = num;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: h */
    public List mo6153h() {
        return this.f7096w;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    @Override // p120i4.AbstractC7661a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF mo6156s() {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f7097x
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList r2 = r9.f7098y
            java.lang.Object r2 = kotlin.collections.CollectionsKt.last(r2)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            java.util.ArrayList r3 = r9.f7098y
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
            java.util.ArrayList r3 = r9.f7099z
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r3)
            android.graphics.RectF r3 = (android.graphics.RectF) r3
            float r3 = r3.right
            r5 = 1102577664(0x41b80000, float:23.0)
            float r3 = r3 + r5
            r5 = 1095761920(0x41500000, float:13.0)
            float r2 = r2 + r5
            float r2 = r2 + r3
            java.util.List r3 = r9.m6178Y()
            r6 = 0
            if (r3 == 0) goto L4e
            h4.f$b r3 = p109h4.AbstractC7626d.m12583c(r3)
            goto L4f
        L4e:
            r3 = r6
        L4f:
            if (r3 == 0) goto L52
            goto L53
        L52:
            r4 = 0
        L53:
            com.zykj.blackboard.bean.BoardConfig r3 = r9.m12751f()
            d5.a r3 = r3.getSelectCustomColorView()
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
            com.zykj.blackboard.bean.BoardConfig r8 = r9.m12751f()
            d5.a r8 = r8.getSelectCustomColorView()
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
            com.zykj.blackboard.bean.BoardConfig r2 = r9.m12751f()
            float r2 = r2.getSelectButtonHeight()
            float r2 = r2 * r1
            float r2 = r2 + r5
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r6.<init>(r0, r1)
            r9.m12745R(r6)
            kotlin.Pair r0 = r9.m12767x()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r3)
            kotlin.Pair r1 = r9.m12767x()
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r4
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r7, r7, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction.mo6156s():android.graphics.RectF"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali:5314
    }
}
