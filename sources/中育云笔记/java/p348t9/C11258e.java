package p348t9;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.InterfaceC5181c;
import ca.C5412b;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10352o;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p337s9.AbstractC11081b;
import p337s9.AbstractC11082c;

/* renamed from: t9.e */
/* loaded from: classes5.dex */
public final class C11258e extends AbstractC11254a {

    /* renamed from: s */
    public final ArrayList f27057s;

    /* renamed from: t */
    public final ArrayList f27058t;

    /* renamed from: u */
    public final ArrayList f27059u;

    /* renamed from: v */
    public float f27060v;

    /* renamed from: w */
    public float f27061w;

    /* renamed from: x */
    public final PointF f27062x;

    /* renamed from: y */
    public final PointF f27063y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11258e(InterfaceC10918b listener) {
        super(listener);
        AbstractC9979u.m20294g(listener, "listener");
        this.f27057s = new ArrayList();
        this.f27058t = new ArrayList();
        this.f27059u = new ArrayList();
        this.f27062x = new PointF();
        this.f27063y = new PointF();
        m25179X();
        m25178W();
    }

    /* renamed from: W */
    private final void m25178W() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM22861E = (m25135d().m22861E() - f10) / f11;
        float fM22861E2 = ((m25135d().m22861E() - f10) / f11) + f10;
        ArrayList arrayList = this.f27057s;
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
            this.f27058t.add(new RectF(f12, fM22861E, f12 + fMeasureText, fM22861E2));
            f12 += fMeasureText + 30.0f;
        }
        float fM22861E3 = (m25135d().m22861E() - 38.0f) / f11;
        float fM22861E4 = ((m25135d().m22861E() - 38.0f) / f11) + 38.0f;
        int size3 = m25135d().m22865I().size();
        for (int i12 = 0; i12 < size3; i12++) {
            float f13 = (i12 * 61.0f) + 23.0f;
            this.f27059u.add(new RectF(f13, fM22861E3, f13 + 38.0f, fM22861E4));
        }
    }

    /* renamed from: X */
    private final void m25179X() {
        this.f27057s.clear();
        this.f27057s.add(AbstractC11082c.d.f26760c);
        this.f27057s.add(AbstractC11082c.e.f26761c);
        this.f27057s.add(new AbstractC11082c.b(m25181T(), ((Number) m25135d().m22865I().get(0)).intValue()));
        this.f27057s.add(AbstractC11082c.a.f26757c);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: A */
    public boolean mo13886A(float f10, float f11) {
        if (super.mo13886A(f10, f11)) {
            return true;
        }
        AbstractC11081b abstractC11081bM25136e = m25136e();
        if (abstractC11081bM25136e instanceof AbstractC11081b.c) {
            AbstractC11081b abstractC11081bM25136e2 = m25136e();
            AbstractC9979u.m20292e(abstractC11081bM25136e2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            m25183V((AbstractC11081b.c) abstractC11081bM25136e2, f10, f11);
            m25184Y();
            m25180S();
            PointF pointFM25151v = m25151v();
            PointF pointFM21672e = pointFM25151v != null ? C10352o.f24660a.m21672e(pointFM25151v, m25137g()) : null;
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
            if (interfaceC5181c != null) {
                m25142l().mo25422H((C5412b) interfaceC5181c, m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), pointFM21672e);
            }
        } else {
            if (!(abstractC11081bM25136e instanceof AbstractC11081b.e)) {
                return false;
            }
            m25182U(f10, f11);
            PointF pointFM25151v2 = m25151v();
            PointF pointFM21672e2 = pointFM25151v2 != null ? C10352o.f24660a.m21672e(pointFM25151v2, m25137g()) : null;
            InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
            if (interfaceC5181c2 != null) {
                m25142l().mo25422H((C5412b) interfaceC5181c2, m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), pointFM21672e2);
            }
        }
        return true;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: F */
    public boolean mo13874F(float f10, float f11) {
        Object obj;
        if (m25140j().m25171c().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(0));
            return true;
        }
        if (m25140j().m25170b().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(1));
            return true;
        }
        ArrayList arrayList = this.f27057s;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((AbstractC11082c) obj) instanceof AbstractC11082c.b) {
                break;
            }
        }
        AbstractC11082c abstractC11082c = (AbstractC11082c) obj;
        if (abstractC11082c != null && abstractC11082c.m24641b()) {
            int size2 = m25140j().m25169a().size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((RectF) m25140j().m25169a().get(i11)).contains(f10, f11)) {
                    m25127I(new AbstractC11081b.a(i11));
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
        if (m25181T()) {
            PointF pointFM25151v = m25151v();
            if (pointFM25151v != null) {
                float f14 = pointFM25151v.x;
                float f15 = fMapRadius / 2;
                float f16 = pointFM25151v.y;
                if (new RectF(f14 - f15, f16 - f15, f14 + f15, f16 + f15).contains(f12, f13)) {
                    m25127I(AbstractC11081b.e.f26748a);
                    return true;
                }
            }
            float f17 = fMapRadius / 2;
            if (new RectF(m25148s().left - f17, m25148s().centerY() - f17, m25148s().left + f17, m25148s().centerY() + f17).contains(f12, f13)) {
                m25127I(AbstractC11081b.c.b.f26744a);
                return true;
            }
            if (new RectF(m25148s().centerX() - f17, m25148s().top - f17, m25148s().centerX() + f17, m25148s().top + f17).contains(f12, f13)) {
                m25127I(AbstractC11081b.c.d.f26746a);
                return true;
            }
            if (new RectF(m25148s().right - f17, m25148s().centerY() - f17, m25148s().right + f17, m25148s().centerY() + f17).contains(f12, f13)) {
                m25127I(AbstractC11081b.c.C12150c.f26745a);
                return true;
            }
            if (new RectF(m25148s().centerX() - f17, m25148s().bottom - f17, m25148s().centerX() + f17, m25148s().bottom + f17).contains(f12, f13)) {
                m25127I(AbstractC11081b.c.a.f26743a);
                return true;
            }
        }
        float f18 = 2;
        float f19 = fMapRadius / f18;
        if (new RectF(m25148s().centerX() - f19, m25148s().top - ((5 * fMapRadius) / f18), m25148s().centerX() + f19, m25148s().top - ((fMapRadius * 3) / f18)).contains(f12, f13)) {
            m25127I(AbstractC11081b.g.f26750a);
            return true;
        }
        if (new RectF(m25148s().right - f19, m25148s().bottom - f19, m25148s().right + f19, m25148s().bottom + f19).contains(f12, f13)) {
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
        m25179X();
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: L */
    public void mo13887L(List graphList) {
        Object obj;
        AbstractC9979u.m20294g(graphList, "graphList");
        super.mo13887L(graphList);
        ArrayList arrayList = this.f27057s;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((AbstractC11082c) obj) instanceof AbstractC11082c.b) {
                break;
            }
        }
        AbstractC11082c abstractC11082c = (AbstractC11082c) obj;
        if (abstractC11082c != null) {
            AbstractC11082c.b bVar = (AbstractC11082c.b) abstractC11082c;
            bVar.m24646g(m25181T());
            int color = Integer.MAX_VALUE;
            if (bVar.m24644e()) {
                Object objM23944m0 = AbstractC10947g0.m23944m0(graphList);
                AbstractC9979u.m20292e(objM23944m0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.GeometryGraph");
                Paint paintM2870F = ((C5412b) objM23944m0).m2870F();
                if (paintM2870F != null) {
                    color = paintM2870F.getColor();
                }
            }
            bVar.m24645f(color);
        }
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: R */
    public void mo13876R() {
        C11257d c11257dM25140j = m25140j();
        int i10 = 0;
        c11257dM25140j.m25171c().set((m25146q().left + ((RectF) this.f27058t.get(0)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f27058t.get(0)).right + 15.0f, m25146q().top + m25135d().m22861E());
        c11257dM25140j.m25170b().set((m25146q().left + ((RectF) this.f27058t.get(1)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f27058t.get(1)).right + 15.0f, m25146q().top + m25135d().m22861E());
        c11257dM25140j.m25169a().clear();
        ArrayList arrayList = this.f27059u;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            RectF rectF = (RectF) obj;
            c11257dM25140j.m25169a().add(new RectF(m25146q().left + rectF.left, m25146q().top + m25135d().m22861E() + 13.0f + rectF.top, m25146q().left + rectF.right, m25146q().top + m25135d().m22861E() + 13.0f + rectF.bottom));
        }
        if (m25126G()) {
            return;
        }
        float f10 = (c11257dM25140j.m25170b().right - c11257dM25140j.m25171c().left) + 16.0f;
        c11257dM25140j.m25171c().offset(m25146q().width() - f10, 0.0f);
        c11257dM25140j.m25170b().offset(m25146q().width() - f10, 0.0f);
        float f11 = (((RectF) AbstractC10947g0.m23956y0(c11257dM25140j.m25169a())).right - ((RectF) AbstractC10947g0.m23944m0(c11257dM25140j.m25169a())).left) + 46.0f;
        ArrayList arrayListM25169a = c11257dM25140j.m25169a();
        int size2 = arrayListM25169a.size();
        while (i10 < size2) {
            Object obj2 = arrayListM25169a.get(i10);
            i10++;
            ((RectF) obj2).offset(m25146q().width() - f11, 0.0f);
        }
    }

    /* renamed from: S */
    public final void m25180S() {
        m25146q().set(mo13878p());
        m25128J(m25141k(m25146q(), m25149t(), m25143m()));
        mo13876R();
    }

    /* renamed from: T */
    public final boolean m25181T() {
        return m25147r().size() == 1;
    }

    /* renamed from: U */
    public final void m25182U(float f10, float f11) {
        PointF pointF = new PointF();
        PointF pointF2 = this.f27062x;
        float f12 = pointF2.x;
        float f13 = pointF2.y;
        PointF pointF3 = this.f27063y;
        float fM25186b = m25186b(f12, f13, pointF3.x, pointF3.y, f12, f13, f10, f11);
        if (fM25186b < 0.0f) {
            pointF.set(this.f27062x);
        } else {
            PointF pointF4 = this.f27062x;
            float f14 = pointF4.x;
            PointF pointF5 = this.f27063y;
            float f15 = pointF5.x;
            float f16 = (f14 - f15) * (f14 - f15);
            float f17 = pointF4.y;
            float f18 = pointF5.y;
            float fSqrt = (float) Math.sqrt(f16 + ((f17 - f18) * (f17 - f18)));
            if (fM25186b > fSqrt) {
                pointF.set(this.f27063y);
            } else {
                float f19 = fM25186b / fSqrt;
                PointF pointF6 = this.f27062x;
                float f20 = pointF6.x;
                PointF pointF7 = this.f27063y;
                float f21 = f20 + ((pointF7.x - f20) * f19);
                float f22 = pointF6.y;
                pointF.set(f21, f22 + ((pointF7.y - f22) * f19));
            }
        }
        pointF.set(C10352o.f24660a.m21672e(pointF, AbstractC10351n.m21660b(m25137g())));
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c != null) {
            C5412b c5412b = (C5412b) interfaceC5181c;
            c5412b.m2874J(AbstractC10978w.m24139q(pointF, new PointF(c5412b.mo2718g().left, c5412b.mo2718g().bottom), new PointF(c5412b.mo2718g().right, c5412b.mo2718g().bottom)));
            PointF pointFM25151v = m25151v();
            if (pointFM25151v != null) {
                pointFM25151v.set(pointF);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25183V(p337s9.AbstractC11081b.c r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p348t9.C11258e.m25183V(s9.b$c, float, float):void");
    }

    /* renamed from: Y */
    public final void m25184Y() {
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c != null) {
            m25148s().set(interfaceC5181c.mo2718g());
            Matrix matrixM25150u = m25150u();
            matrixM25150u.reset();
            matrixM25150u.postConcat(interfaceC5181c.mo2714b());
            matrixM25150u.postConcat(m25145o().m25311b());
            m25132O((PointF) AbstractC10947g0.m23946o0(((C5412b) interfaceC5181c).m2869E()));
        }
    }

    /* renamed from: a */
    public final float m25185a(float f10, float f11) {
        if (f10 == 0.0f) {
            return (float) Math.toRadians(f11 > 0.0f ? 90.0d : -90.0d);
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: b */
    public final float m25186b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m25185a(f12 - f10, f13 - f11) - m25185a(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: f */
    public List mo13877f() {
        return this.f27057s;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: p */
    public RectF mo13878p() {
        return new RectF(0.0f, 0.0f, Math.max(((RectF) AbstractC10947g0.m23956y0(this.f27058t)).right + 15.0f + 8.0f, ((RectF) AbstractC10947g0.m23956y0(this.f27059u)).right + 23.0f), (m25135d().m22861E() * 2) + 13.0f);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: w */
    public boolean mo13879w(float f10, float f11) {
        C5412b c5412b;
        Paint paintM2870F;
        if (!super.mo13879w(f10, f11)) {
            return false;
        }
        AbstractC11081b abstractC11081bM25136e = m25136e();
        Object obj = null;
        if (abstractC11081bM25136e instanceof AbstractC11081b.d) {
            AbstractC11081b abstractC11081bM25136e2 = m25136e();
            AbstractC9979u.m20292e(abstractC11081bM25136e2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM24638a = ((AbstractC11081b.d) abstractC11081bM25136e2).m24638a();
            if (iM24638a == 0) {
                ArrayList arrayList = this.f27057s;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (((AbstractC11082c) obj2) instanceof AbstractC11082c.b) {
                        obj = obj2;
                        break;
                    }
                }
                AbstractC11082c abstractC11082c = (AbstractC11082c) obj;
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
        } else if (abstractC11081bM25136e instanceof AbstractC11081b.a) {
            AbstractC11081b abstractC11081bM25136e3 = m25136e();
            AbstractC9979u.m20292e(abstractC11081bM25136e3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iIntValue = ((Number) m25135d().m22865I().get(((AbstractC11081b.a) abstractC11081bM25136e3).m24637a())).intValue();
            ArrayList arrayListM25147r = m25147r();
            int size2 = arrayListM25147r.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayListM25147r.get(i11);
                i11++;
                InterfaceC5181c interfaceC5181c = (InterfaceC5181c) obj3;
                if ((interfaceC5181c instanceof C5412b) && (paintM2870F = (c5412b = (C5412b) interfaceC5181c).m2870F()) != null) {
                    paintM2870F.setColor(iIntValue);
                    c5412b.m2873I(paintM2870F);
                    InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, new Paint(paintM2870F), null, null, null, 236, null);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GeometryFunction:color -> color:");
            sb2.append(iIntValue);
            sb2.append(" graphList: ");
            ArrayList arrayListM25147r2 = m25147r();
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayListM25147r2, 10));
            int size3 = arrayListM25147r2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj4 = arrayListM25147r2.get(i12);
                i12++;
                arrayList2.add(((InterfaceC5181c) obj4).getId());
            }
            sb2.append(arrayList2);
            LogUtils.m3888i(sb2.toString());
            m25142l().mo25447g();
            m25144n().mo23772l();
            ArrayList arrayList3 = this.f27057s;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size4) {
                    break;
                }
                Object obj5 = arrayList3.get(i13);
                i13++;
                if (((AbstractC11082c) obj5) instanceof AbstractC11082c.b) {
                    obj = obj5;
                    break;
                }
            }
            AbstractC11082c abstractC11082c2 = (AbstractC11082c) obj;
            if (abstractC11082c2 != null) {
                ((AbstractC11082c.b) abstractC11082c2).m24645f(iIntValue);
            }
            m25133P(false);
        }
        return true;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: y */
    public boolean mo13893y(float f10, float f11) {
        if (super.mo13893y(f10, f11)) {
            return true;
        }
        AbstractC11081b abstractC11081bM25136e = m25136e();
        if (abstractC11081bM25136e instanceof AbstractC11081b.c) {
            AbstractC11081b abstractC11081bM25136e2 = m25136e();
            AbstractC9979u.m20292e(abstractC11081bM25136e2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            m25183V((AbstractC11081b.c) abstractC11081bM25136e2, f10, f11);
            m25184Y();
            m25180S();
            PointF pointFM25151v = m25151v();
            PointF pointFM21672e = pointFM25151v != null ? C10352o.f24660a.m21672e(pointFM25151v, m25137g()) : null;
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
            if (interfaceC5181c != null) {
                m25142l().mo25462v(m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), pointFM21672e);
                InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, interfaceC5181c.mo2718g(), null, null, null, null, null, 248, null);
            }
            m25144n().mo23772l();
        } else {
            if (!(abstractC11081bM25136e instanceof AbstractC11081b.e)) {
                return false;
            }
            m25182U(f10, f11);
            PointF pointFM25151v2 = m25151v();
            PointF pointFM21672e2 = pointFM25151v2 != null ? C10352o.f24660a.m21672e(pointFM25151v2, m25137g()) : null;
            InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
            if (interfaceC5181c2 != null) {
                m25142l().mo25462v(m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), pointFM21672e2);
                InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c2, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, null, ((C5412b) interfaceC5181c2).m2871G(), null, null, 220, null);
            }
            m25144n().mo23772l();
        }
        return true;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: z */
    public boolean mo13894z(float f10, float f11) {
        AbstractC11081b abstractC11081bM25136e = m25136e();
        if (!(abstractC11081bM25136e instanceof AbstractC11081b.c)) {
            if (!(abstractC11081bM25136e instanceof AbstractC11081b.e)) {
                return true;
            }
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
            if (interfaceC5181c == null) {
                return false;
            }
            C5412b c5412b = (C5412b) interfaceC5181c;
            Matrix matrix = new Matrix();
            matrix.postConcat(c5412b.mo2714b());
            matrix.postConcat(m25145o().m25311b());
            PointF pointF = this.f27062x;
            C10352o c10352o = C10352o.f24660a;
            pointF.set(c10352o.m21671d(c5412b.mo2718g().left, c5412b.mo2718g().top, matrix));
            this.f27063y.set(c10352o.m21671d(c5412b.mo2718g().right, c5412b.mo2718g().top, matrix));
            PointF pointFM25151v = m25151v();
            PointF pointFM21672e = pointFM25151v != null ? c10352o.m21672e(pointFM25151v, m25137g()) : null;
            InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
            if (interfaceC5181c2 == null) {
                return true;
            }
            m25142l().mo25448h((C5412b) interfaceC5181c2, m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), pointFM21672e);
            return true;
        }
        InterfaceC5181c interfaceC5181c3 = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c3 == null) {
            return false;
        }
        C5412b c5412b2 = (C5412b) interfaceC5181c3;
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(c5412b2.mo2714b());
        matrix2.postConcat(m25145o().m25311b());
        this.f27060v = matrix2.mapRadius(c5412b2.mo2718g().width());
        this.f27061w = matrix2.mapRadius(c5412b2.mo2718g().height());
        LogUtils.m3888i("GeometryFunction:changeFrame -> start graph:" + c5412b2.getId());
        m25184Y();
        m25180S();
        PointF pointFM25151v2 = m25151v();
        PointF pointFM21672e2 = pointFM25151v2 != null ? C10352o.f24660a.m21672e(pointFM25151v2, m25137g()) : null;
        InterfaceC5181c interfaceC5181c4 = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c4 == null) {
            return true;
        }
        m25142l().mo25448h((C5412b) interfaceC5181c4, m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), pointFM21672e2);
        return true;
    }
}
