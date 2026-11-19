package p348t9;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import ba.InterfaceC5181c;
import ca.InterfaceC5413c;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p134ea.AbstractC9113c;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p337s9.AbstractC11081b;
import p337s9.AbstractC11082c;

/* renamed from: t9.f */
/* loaded from: classes5.dex */
public final class C11259f extends AbstractC11254a {

    /* renamed from: s */
    public boolean f27064s;

    /* renamed from: t */
    public final ArrayList f27065t;

    /* renamed from: u */
    public final ArrayList f27066u;

    /* renamed from: v */
    public final ArrayList f27067v;

    /* renamed from: w */
    public final ArrayList f27068w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11259f(InterfaceC10918b listener) {
        super(listener);
        AbstractC9979u.m20294g(listener, "listener");
        this.f27065t = new ArrayList();
        this.f27066u = new ArrayList();
        this.f27067v = new ArrayList();
        this.f27068w = new ArrayList();
        m25188T();
        m25187S();
    }

    /* renamed from: S */
    private final void m25187S() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM22861E = (m25135d().m22861E() - f10) / f11;
        float fM22861E2 = ((m25135d().m22861E() - f10) / f11) + f10;
        ArrayList arrayList = this.f27065t;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((AbstractC11082c) obj).m24640a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            float fMeasureText = paint.measureText(((AbstractC11082c) obj2).m24640a());
            this.f27066u.add(new RectF(f12, fM22861E, f12 + fMeasureText, fM22861E2));
            f12 += fMeasureText + 30.0f;
        }
        int size3 = m25135d().m22866J().size();
        float f13 = 16.0f;
        for (int i12 = 0; i12 < size3; i12++) {
            float f14 = (((i12 * 3.0f) + 8.0f) / f11) + 19.0f;
            float f15 = f13 + f14;
            this.f27067v.add(new PointF(f15, m25135d().m22861E() / f11));
            f13 = f15 + f14;
        }
        float fM22861E3 = (m25135d().m22861E() - 38.0f) / f11;
        float fM22861E4 = ((m25135d().m22861E() - 38.0f) / f11) + 38.0f;
        int size4 = m25135d().m22865I().size();
        for (int i13 = 0; i13 < size4; i13++) {
            float f16 = (i13 * 61.0f) + 23.0f;
            this.f27068w.add(new RectF(f16, fM22861E3, f16 + 38.0f, fM22861E4));
        }
    }

    /* renamed from: T */
    private final void m25188T() {
        this.f27065t.clear();
        this.f27065t.add(AbstractC11082c.d.f26760c);
        this.f27065t.add(AbstractC11082c.e.f26761c);
        this.f27065t.add(new AbstractC11082c.g(false, ((Number) m25135d().m22866J().get(0)).floatValue(), ((Number) m25135d().m22865I().get(0)).intValue()));
        this.f27065t.add(AbstractC11082c.a.f26757c);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: F */
    public boolean mo13874F(float f10, float f11) {
        Object obj;
        if (m25140j().m25176h().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(0));
            return true;
        }
        if (m25140j().m25170b().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(1));
            return true;
        }
        ArrayList arrayList = this.f27065t;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((AbstractC11082c) obj) instanceof AbstractC11082c.g) {
                break;
            }
        }
        AbstractC11082c abstractC11082c = (AbstractC11082c) obj;
        if (abstractC11082c != null && abstractC11082c.m24641b()) {
            int size2 = m25140j().m25177i().size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((RectF) m25140j().m25177i().get(i11)).contains(f10, f11)) {
                    m25127I(new AbstractC11081b.j(i11));
                    return true;
                }
            }
            int size3 = m25140j().m25169a().size();
            for (int i12 = 0; i12 < size3; i12++) {
                if (((RectF) m25140j().m25169a().get(i12)).contains(f10, f11)) {
                    m25127I(new AbstractC11081b.a(i12));
                    return true;
                }
            }
        }
        Matrix matrixM21660b = AbstractC10351n.m21660b(m25137g());
        float[] fArr = {f10, f11};
        matrixM21660b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM21660b.mapRadius(m25135d().m22864H());
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(m25148s().centerX() - f15, m25148s().top - ((5 * fMapRadius) / f14), m25148s().centerX() + f15, m25148s().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            m25127I(AbstractC11081b.g.f26750a);
            return true;
        }
        if (new RectF(m25148s().right - f15, m25148s().bottom - f15, m25148s().right + f15, m25148s().bottom + f15).contains(f12, f13)) {
            m25127I(AbstractC11081b.h.f26751a);
            return true;
        }
        if (m25148s().contains(f12, f13)) {
            m25127I(AbstractC11081b.b.f26742a);
            return true;
        }
        m25127I(AbstractC11081b.f.f26749a);
        return false;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: H */
    public void mo13875H() {
        super.mo13875H();
        m25188T();
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: L */
    public void mo13887L(List graphList) {
        Object obj;
        C10786q c10786q;
        AbstractC9979u.m20294g(graphList, "graphList");
        super.mo13887L(graphList);
        ArrayList arrayList = this.f27065t;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((AbstractC11082c) obj) instanceof AbstractC11082c.g) {
                break;
            }
        }
        AbstractC11082c abstractC11082c = (AbstractC11082c) obj;
        if (abstractC11082c != null) {
            Iterator it = graphList.iterator();
            boolean z10 = true;
            Integer numValueOf = null;
            Float fValueOf = null;
            while (it.hasNext()) {
                for (InterfaceC5181c interfaceC5181c : ((InterfaceC5181c) it.next()).mo2717f()) {
                    if (interfaceC5181c instanceof AbstractC9113c) {
                        Paint paintM17932z = ((AbstractC9113c) interfaceC5181c).m17932z();
                        if (paintM17932z != null) {
                            if (fValueOf == null) {
                                fValueOf = Float.valueOf(paintM17932z.getStrokeWidth());
                                numValueOf = Integer.valueOf(paintM17932z.getColor());
                            } else {
                                if (!AbstractC9979u.m20288a(fValueOf, paintM17932z.getStrokeWidth())) {
                                    fValueOf = Float.valueOf(-1.0f);
                                }
                                int color = paintM17932z.getColor();
                                if (numValueOf == null || numValueOf.intValue() != color) {
                                    numValueOf = Integer.MAX_VALUE;
                                }
                            }
                            if (Color.alpha(paintM17932z.getColor()) == 255) {
                                z10 = false;
                            }
                            c10786q = C10786q.f26013a;
                        } else {
                            c10786q = null;
                        }
                        if (c10786q == null) {
                        }
                    }
                    z10 = false;
                }
            }
            AbstractC11082c.g gVar = (AbstractC11082c.g) abstractC11082c;
            gVar.m24655h(z10);
            if (numValueOf != null) {
                gVar.m24654g(numValueOf.intValue());
            }
            if (fValueOf != null) {
                gVar.m24656i(fValueOf.floatValue());
            }
        }
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: R */
    public void mo13876R() {
        C11257d c11257dM25140j = m25140j();
        c11257dM25140j.m25176h().set((m25146q().left + ((RectF) this.f27066u.get(0)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f27066u.get(0)).right + 15.0f, m25146q().top + m25135d().m22861E());
        c11257dM25140j.m25170b().set((m25146q().left + ((RectF) this.f27066u.get(1)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f27066u.get(1)).right + 15.0f, m25146q().top + m25135d().m22861E());
        c11257dM25140j.m25177i().clear();
        ArrayList arrayList = this.f27067v;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            PointF pointF = (PointF) obj;
            float f10 = 2;
            float f11 = ((i10 * 3.0f) + 8.0f) / f10;
            c11257dM25140j.m25177i().add(new RectF(((m25146q().left + pointF.x) - f11) - 19.0f, m25146q().top + m25135d().m22861E() + 13.0f, m25146q().left + pointF.x + f11 + 19.0f, m25146q().top + (m25135d().m22861E() * f10) + 13.0f));
            i10 = i12;
        }
        c11257dM25140j.m25169a().clear();
        ArrayList arrayList2 = this.f27068w;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            RectF rectF = (RectF) obj2;
            float f12 = 2;
            c11257dM25140j.m25169a().add(new RectF(m25146q().left + rectF.left, m25146q().top + ((m25135d().m22861E() + 13.0f) * f12) + rectF.top, m25146q().left + rectF.right, m25146q().top + ((m25135d().m22861E() + 13.0f) * f12) + rectF.bottom));
        }
        if (m25126G()) {
            return;
        }
        float f13 = (c11257dM25140j.m25170b().right - c11257dM25140j.m25176h().left) + 16.0f;
        c11257dM25140j.m25176h().offset(m25146q().width() - f13, 0.0f);
        c11257dM25140j.m25170b().offset(m25146q().width() - f13, 0.0f);
        float f14 = (((RectF) AbstractC10947g0.m23956y0(c11257dM25140j.m25177i())).right - ((RectF) AbstractC10947g0.m23944m0(c11257dM25140j.m25177i())).left) + 32.0f;
        ArrayList arrayListM25177i = c11257dM25140j.m25177i();
        int size3 = arrayListM25177i.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayListM25177i.get(i14);
            i14++;
            ((RectF) obj3).offset(m25146q().width() - f14, 0.0f);
        }
        float f15 = (((RectF) AbstractC10947g0.m23956y0(c11257dM25140j.m25169a())).right - ((RectF) AbstractC10947g0.m23944m0(c11257dM25140j.m25169a())).left) + 46.0f;
        ArrayList arrayListM25169a = c11257dM25140j.m25169a();
        int size4 = arrayListM25169a.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj4 = arrayListM25169a.get(i15);
            i15++;
            ((RectF) obj4).offset(m25146q().width() - f15, 0.0f);
        }
    }

    /* renamed from: U */
    public final void m25189U(boolean z10) {
        this.f27064s = z10;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: f */
    public List mo13877f() {
        return this.f27065t;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: p */
    public RectF mo13878p() {
        return new RectF(0.0f, 0.0f, Math.max(((RectF) AbstractC10947g0.m23956y0(this.f27066u)).right + 15.0f + 8.0f, Math.max(((PointF) AbstractC10947g0.m23956y0(this.f27067v)).x + ((this.f27067v.size() - 1) * 3.0f) + 8.0f + 16.0f, ((RectF) AbstractC10947g0.m23956y0(this.f27068w)).right + 23.0f)), (m25135d().m22861E() * 3) + 26.0f);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: w */
    public boolean mo13879w(float f10, float f11) {
        Object obj;
        Paint paintM17932z;
        Object obj2;
        Paint paintM17932z2;
        Object obj3;
        if (!super.mo13879w(f10, f11)) {
            return false;
        }
        AbstractC11081b abstractC11081bM25136e = m25136e();
        if (abstractC11081bM25136e instanceof AbstractC11081b.d) {
            AbstractC11081b abstractC11081bM25136e2 = m25136e();
            AbstractC9979u.m20292e(abstractC11081bM25136e2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM24638a = ((AbstractC11081b.d) abstractC11081bM25136e2).m24638a();
            if (iM24638a == 0) {
                ArrayList arrayList = this.f27065t;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj3 = null;
                        break;
                    }
                    Object obj4 = arrayList.get(i10);
                    i10++;
                    if (((AbstractC11082c) obj4) instanceof AbstractC11082c.g) {
                        obj3 = obj4;
                        break;
                    }
                }
                AbstractC11082c abstractC11082c = (AbstractC11082c) obj3;
                if (abstractC11082c != null) {
                    abstractC11082c.m24642c(!abstractC11082c.m24641b());
                    m25133P(false);
                }
            } else if (iM24638a == 1) {
                m25142l().mo25456p(m25147r());
                m25142l().mo25445e();
                m25144n().mo23775o(m25147r(), System.currentTimeMillis());
                m25144n().mo23772l();
                mo13875H();
            }
            return true;
        }
        if (abstractC11081bM25136e instanceof AbstractC11081b.j) {
            AbstractC11081b abstractC11081bM25136e3 = m25136e();
            AbstractC9979u.m20292e(abstractC11081bM25136e3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize");
            int iM24639a = ((AbstractC11081b.j) abstractC11081bM25136e3).m24639a();
            float fFloatValue = this.f27064s ? ((Number) m25135d().m22863G().get(iM24639a)).floatValue() : ((Number) m25135d().m22866J().get(iM24639a)).floatValue();
            ArrayList arrayListM25147r = m25147r();
            int size2 = arrayListM25147r.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj5 = arrayListM25147r.get(i11);
                i11++;
                InterfaceC5181c interfaceC5181c = (InterfaceC5181c) obj5;
                for (InterfaceC5181c interfaceC5181c2 : interfaceC5181c.mo2717f()) {
                    if ((interfaceC5181c2 instanceof AbstractC9113c) && (paintM17932z2 = ((AbstractC9113c) interfaceC5181c2).m17932z()) != null) {
                        paintM17932z2.setStrokeWidth(fFloatValue);
                        InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c2, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(paintM17932z2), null, null, null, 236, null);
                    }
                    if (interfaceC5181c instanceof InterfaceC5413c) {
                        ((InterfaceC5413c) interfaceC5181c).mo2876l(true);
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WriteFunction:WriteSize -> size:");
            sb2.append(fFloatValue);
            sb2.append(" list: ");
            ArrayList arrayListM25147r2 = m25147r();
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayListM25147r2, 10));
            int size3 = arrayListM25147r2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj6 = arrayListM25147r2.get(i12);
                i12++;
                arrayList2.add(((InterfaceC5181c) obj6).getId());
            }
            sb2.append(arrayList2);
            LogUtils.m3888i(sb2.toString());
            m25142l().mo25447g();
            m25144n().mo23772l();
            ArrayList arrayList3 = this.f27065t;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size4) {
                    obj2 = null;
                    break;
                }
                Object obj7 = arrayList3.get(i13);
                i13++;
                if (((AbstractC11082c) obj7) instanceof AbstractC11082c.g) {
                    obj2 = obj7;
                    break;
                }
            }
            AbstractC11082c abstractC11082c2 = (AbstractC11082c) obj2;
            if (abstractC11082c2 != null) {
                ((AbstractC11082c.g) abstractC11082c2).m24656i(fFloatValue);
            }
            m25133P(false);
            return true;
        }
        if (!(abstractC11081bM25136e instanceof AbstractC11081b.a)) {
            return false;
        }
        AbstractC11081b abstractC11081bM25136e4 = m25136e();
        AbstractC9979u.m20292e(abstractC11081bM25136e4, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
        int iIntValue = ((Number) m25135d().m22865I().get(((AbstractC11081b.a) abstractC11081bM25136e4).m24637a())).intValue();
        if (this.f27064s) {
            iIntValue = (iIntValue & ViewCompat.MEASURED_SIZE_MASK) | (((int) (m25135d().m22915v() * 255)) << 24);
        }
        ArrayList arrayListM25147r3 = m25147r();
        int size5 = arrayListM25147r3.size();
        int i14 = 0;
        while (i14 < size5) {
            Object obj8 = arrayListM25147r3.get(i14);
            i14++;
            InterfaceC5181c interfaceC5181c3 = (InterfaceC5181c) obj8;
            for (InterfaceC5181c interfaceC5181c4 : interfaceC5181c3.mo2717f()) {
                if ((interfaceC5181c4 instanceof AbstractC9113c) && (paintM17932z = ((AbstractC9113c) interfaceC5181c4).m17932z()) != null) {
                    paintM17932z.setColor(iIntValue);
                    InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c4, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(paintM17932z), null, null, null, 236, null);
                }
            }
            if (interfaceC5181c3 instanceof InterfaceC5413c) {
                ((InterfaceC5413c) interfaceC5181c3).mo2876l(true);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("WriteFunction:Color -> color:");
        sb3.append(iIntValue);
        sb3.append(" list: ");
        ArrayList arrayListM25147r4 = m25147r();
        ArrayList arrayList4 = new ArrayList(AbstractC10980x.m24153x(arrayListM25147r4, 10));
        int size6 = arrayListM25147r4.size();
        int i15 = 0;
        while (i15 < size6) {
            Object obj9 = arrayListM25147r4.get(i15);
            i15++;
            arrayList4.add(((InterfaceC5181c) obj9).getId());
        }
        sb3.append(arrayList4);
        LogUtils.m3888i(sb3.toString());
        m25142l().mo25447g();
        m25144n().mo23772l();
        ArrayList arrayList5 = this.f27065t;
        int size7 = arrayList5.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size7) {
                obj = null;
                break;
            }
            Object obj10 = arrayList5.get(i16);
            i16++;
            if (((AbstractC11082c) obj10) instanceof AbstractC11082c.g) {
                obj = obj10;
                break;
            }
        }
        AbstractC11082c abstractC11082c3 = (AbstractC11082c) obj;
        if (abstractC11082c3 != null) {
            ((AbstractC11082c.g) abstractC11082c3).m24654g(iIntValue);
        }
        m25133P(false);
        return true;
    }
}
