package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10217e;
import ma.InterfaceC10222j;
import na.AbstractC10351n;
import na.C10357t;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p310qd.AbstractC10797e0;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;
import p337s9.AbstractC11081b;
import p337s9.AbstractC11082c;
import p348t9.AbstractC11254a;
import p348t9.C11257d;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class TextFunction extends AbstractC11254a {

    /* renamed from: s */
    public final ArrayList f17913s;

    /* renamed from: t */
    public final ArrayList f17914t;

    /* renamed from: u */
    public final RectF f17915u;

    /* renamed from: v */
    public final RectF f17916v;

    /* renamed from: w */
    public final ArrayList f17917w;

    /* renamed from: x */
    public float f17918x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFunction(InterfaceC10918b listener) {
        super(listener);
        AbstractC9979u.m20294g(listener, "listener");
        this.f17913s = new ArrayList();
        this.f17914t = new ArrayList();
        this.f17915u = new RectF();
        this.f17916v = new RectF();
        this.f17917w = new ArrayList();
        m13885a0();
        m13884Z();
    }

    /* renamed from: U */
    private final void m13882U() {
        m25146q().set(mo13878p());
        m25128J(m25141k(m25146q(), m25149t(), m25143m()));
        mo13876R();
    }

    /* renamed from: W */
    private final boolean m13883W() {
        return m25147r().size() == 1;
    }

    /* renamed from: Z */
    private final void m13884Z() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM22861E = (m25135d().m22861E() - f10) / f11;
        float fM22861E2 = ((m25135d().m22861E() - f10) / f11) + f10;
        ArrayList arrayList = this.f17913s;
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
            this.f17914t.add(new RectF(f12, fM22861E, f12 + fMeasureText, fM22861E2));
            f12 += fMeasureText + 30.0f;
        }
        this.f17916v.set(32.0f, (m25135d().m22861E() - 24.0f) / f11, 56.0f, ((m25135d().m22861E() - 24.0f) / f11) + 24.0f);
        this.f17915u.set(122.0f, (m25135d().m22861E() - 24.0f) / f11, 146.0f, ((m25135d().m22861E() - 24.0f) / f11) + 24.0f);
        float fM22861E3 = (m25135d().m22861E() - 38.0f) / f11;
        float fM22861E4 = ((m25135d().m22861E() - 38.0f) / f11) + 38.0f;
        int size3 = m25135d().m22865I().size();
        for (int i12 = 0; i12 < size3; i12++) {
            float f13 = (i12 * 61.0f) + 23.0f;
            this.f17917w.add(new RectF(f13, fM22861E3, f13 + 38.0f, fM22861E4));
        }
    }

    /* renamed from: a0 */
    private final void m13885a0() {
        this.f17913s.clear();
        this.f17913s.add(new AbstractC11082c.f(m13883W(), ((Number) m25135d().m22865I().get(0)).intValue()));
        this.f17913s.add(AbstractC11082c.a.f26757c);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: A */
    public boolean mo13886A(float f10, float f11) {
        if (super.mo13886A(f10, f11)) {
            return true;
        }
        if (!AbstractC9979u.m20289b(m25136e(), AbstractC11081b.c.C12150c.f26745a)) {
            return false;
        }
        m13889X(f10);
        m13891b0();
        m13882U();
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c != null) {
            InterfaceC11552c.a.m25470d(m25142l(), (C5414d) interfaceC5181c, m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), null, 64, null);
        }
        return true;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: F */
    public boolean mo13874F(float f10, float f11) {
        Object obj;
        if (m25140j().m25173e().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(0));
            return true;
        }
        if (m25140j().m25170b().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(1));
            return true;
        }
        ArrayList arrayList = this.f17913s;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((AbstractC11082c) obj) instanceof AbstractC11082c.f) {
                break;
            }
        }
        AbstractC11082c abstractC11082c = (AbstractC11082c) obj;
        if (abstractC11082c != null && abstractC11082c.m24641b()) {
            if (m25140j().m25174f().contains(f10, f11)) {
                m25127I(AbstractC11081b.i.a.f26752a);
                return true;
            }
            if (m25140j().m25175g().contains(f10, f11)) {
                m25127I(AbstractC11081b.i.b.f26753a);
                return true;
            }
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
        float fMapRadius = matrixM21660b.mapRadius(m25135d().m22864H()) / 2;
        RectF rectF = new RectF(m25148s().right - fMapRadius, m25148s().centerY() - fMapRadius, m25148s().right + fMapRadius, m25148s().centerY() + fMapRadius);
        if (m13883W() && rectF.contains(f12, f13)) {
            m25127I(AbstractC11081b.c.C12150c.f26745a);
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
        m13885a0();
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: L */
    public void mo13887L(List graphList) {
        Object obj;
        AbstractC9979u.m20294g(graphList, "graphList");
        super.mo13887L(graphList);
        ArrayList arrayList = this.f17913s;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((AbstractC11082c) obj) instanceof AbstractC11082c.f) {
                break;
            }
        }
        AbstractC11082c abstractC11082c = (AbstractC11082c) obj;
        if (abstractC11082c != null) {
            AbstractC11082c.f fVar = (AbstractC11082c.f) abstractC11082c;
            fVar.m24650g(m13883W());
            int color = Integer.MAX_VALUE;
            if (fVar.m24648e()) {
                Object objM23944m0 = AbstractC10947g0.m23944m0(graphList);
                AbstractC9979u.m20292e(objM23944m0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph");
                Paint paintM2878F = ((C5414d) objM23944m0).m2878F();
                if (paintM2878F != null) {
                    color = paintM2878F.getColor();
                }
            }
            fVar.m24649f(color);
        }
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: R */
    public void mo13876R() {
        C11257d c11257dM25140j = m25140j();
        int i10 = 0;
        c11257dM25140j.m25173e().set((m25146q().left + ((RectF) this.f17914t.get(0)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f17914t.get(0)).right + 15.0f, m25146q().top + m25135d().m22861E());
        c11257dM25140j.m25170b().set((m25146q().left + ((RectF) this.f17914t.get(1)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f17914t.get(1)).right + 15.0f, m25146q().top + m25135d().m22861E());
        float f10 = 2;
        c11257dM25140j.m25175g().set((m25146q().left + this.f17916v.left) - 32.0f, m25146q().top + m25135d().m22861E() + 13.0f, m25146q().left + this.f17916v.right + 32.0f, m25146q().top + (m25135d().m22861E() * f10) + 13.0f);
        c11257dM25140j.m25174f().set((m25146q().left + this.f17915u.left) - 32.0f, m25146q().top + m25135d().m22861E() + 13.0f, m25146q().left + this.f17915u.right + 32.0f, m25146q().top + (m25135d().m22861E() * f10) + 13.0f);
        c11257dM25140j.m25169a().clear();
        ArrayList arrayList = this.f17917w;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            RectF rectF = (RectF) obj;
            c11257dM25140j.m25169a().add(new RectF(m25146q().left + rectF.left, m25146q().top + ((m25135d().m22861E() + 13.0f) * f10) + rectF.top, m25146q().left + rectF.right, m25146q().top + ((m25135d().m22861E() + 13.0f) * f10) + rectF.bottom));
        }
        if (m25126G()) {
            return;
        }
        float f11 = (c11257dM25140j.m25170b().right - c11257dM25140j.m25173e().left) + 16.0f;
        c11257dM25140j.m25173e().offset(m25146q().width() - f11, 0.0f);
        c11257dM25140j.m25170b().offset(m25146q().width() - f11, 0.0f);
        float f12 = c11257dM25140j.m25174f().right - c11257dM25140j.m25175g().left;
        c11257dM25140j.m25175g().offset(m25146q().width() - f12, 0.0f);
        c11257dM25140j.m25174f().offset(m25146q().width() - f12, 0.0f);
        float f13 = (((RectF) AbstractC10947g0.m23956y0(c11257dM25140j.m25169a())).right - ((RectF) AbstractC10947g0.m23944m0(c11257dM25140j.m25169a())).left) + 46.0f;
        ArrayList arrayListM25169a = c11257dM25140j.m25169a();
        int size2 = arrayListM25169a.size();
        while (i10 < size2) {
            Object obj2 = arrayListM25169a.get(i10);
            i10++;
            ((RectF) obj2).offset(m25146q().width() - f13, 0.0f);
        }
    }

    /* renamed from: V */
    public final RectF m13888V(String str, Paint paint, RectF rectF) {
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C10357t.f24666a.m21684a(str, paint, rectF.width()).size();
        if (size > m25135d().m22892f().height()) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        rectF.bottom = m25135d().m22892f().height() + rectF.top;
        return rectF;
    }

    /* renamed from: X */
    public final void m13889X(float f10) {
        float fM25138h = f10 - m25138h();
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c != null) {
            C5414d c5414d = (C5414d) interfaceC5181c;
            Matrix matrix = new Matrix();
            matrix.postConcat(c5414d.mo2714b());
            matrix.postConcat(m25145o().m25311b());
            float f11 = this.f17918x + fM25138h;
            Paint paintM2878F = c5414d.m2878F();
            AbstractC9979u.m20291d(paintM2878F);
            String strM2877E = c5414d.m2877E();
            AbstractC9979u.m20291d(strM2877E);
            float fMapRadius = matrix.mapRadius(paintM2878F.measureText(String.valueOf(AbstractC10797e0.m23170g1(strM2877E))));
            if (f11 <= m25135d().m22864H() * 2 || f11 <= fMapRadius) {
                return;
            }
            float fMapRadius2 = AbstractC10351n.m21660b(matrix).mapRadius(f11);
            RectF rectF = new RectF(c5414d.mo2718g());
            rectF.right = rectF.left + fMapRadius2;
            String strM2877E2 = c5414d.m2877E();
            AbstractC9979u.m20291d(strM2877E2);
            Paint paintM2878F2 = c5414d.m2878F();
            AbstractC9979u.m20291d(paintM2878F2);
            c5414d.mo2875p(m13888V(strM2877E2, paintM2878F2, rectF));
        }
    }

    /* renamed from: Y */
    public final void m13890Y(float f10) {
        C5414d c5414d;
        Paint paintM2878F;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TextFunction:TextSize -> offset:");
        sb2.append(f10);
        sb2.append(" list: ");
        ArrayList arrayListM25147r = m25147r();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(arrayListM25147r, 10));
        int size = arrayListM25147r.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM25147r.get(i10);
            i10++;
            arrayList.add(((InterfaceC5181c) obj).getId());
        }
        sb2.append(arrayList);
        LogUtils.m3888i(sb2.toString());
        ArrayList arrayListM25147r2 = m25147r();
        int size2 = arrayListM25147r2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayListM25147r2.get(i11);
            i11++;
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) obj2;
            if ((interfaceC5181c instanceof C5414d) && (paintM2878F = (c5414d = (C5414d) interfaceC5181c).m2878F()) != null) {
                Matrix matrix = new Matrix();
                matrix.postConcat(interfaceC5181c.mo2714b());
                matrix.postConcat(m25145o().m25311b());
                float fMapRadius = matrix.mapRadius(paintM2878F.getTextSize()) + f10;
                if (f10 >= 0.0f || fMapRadius >= m25135d().m22888d()) {
                    if (f10 <= 0.0f || fMapRadius <= m25135d().m22886c()) {
                        paintM2878F.setTextSize(AbstractC10351n.m21660b(matrix).mapRadius(fMapRadius));
                        c5414d.m2880H(paintM2878F);
                        RectF rectF = new RectF(interfaceC5181c.mo2718g());
                        String strM2877E = c5414d.m2877E();
                        if (strM2877E == null) {
                            strM2877E = "";
                        }
                        Paint paintM2878F2 = c5414d.m2878F();
                        AbstractC9979u.m20291d(paintM2878F2);
                        m13888V(strM2877E, paintM2878F2, rectF);
                        c5414d.mo2875p(rectF);
                        InterfaceC10217e interfaceC10217eMo23764d = m25144n().mo23764d();
                        if (interfaceC10217eMo23764d != null) {
                            interfaceC10217eMo23764d.mo19973a(fMapRadius);
                        }
                        InterfaceC11552c interfaceC11552cM25142l = m25142l();
                        String id2 = interfaceC5181c.getId();
                        String strM2877E2 = c5414d.m2877E();
                        interfaceC11552cM25142l.mo25417C(id2, strM2877E2 != null ? strM2877E2 : "", paintM2878F, interfaceC5181c.mo2718g());
                        InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, rectF, null, new Paint(paintM2878F), null, null, null, 232, null);
                    }
                }
            }
        }
        m25144n().mo23772l();
        m13891b0();
        AbstractC11254a.m25119Q(this, false, 1, null);
    }

    /* renamed from: b0 */
    public final void m13891b0() {
        m25148s().setEmpty();
        ArrayList arrayListM25147r = m25147r();
        int size = arrayListM25147r.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM25147r.get(i10);
            i10++;
            m25148s().union(((InterfaceC5181c) obj).mo2721j(m25145o().m25311b()));
        }
        m25150u().reset();
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: f */
    public List mo13877f() {
        return this.f17913s;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: p */
    public RectF mo13878p() {
        return new RectF(0.0f, 0.0f, Math.max(((RectF) AbstractC10947g0.m23956y0(this.f17914t)).right + 15.0f + 8.0f, Math.max(178.0f, ((RectF) AbstractC10947g0.m23956y0(this.f17917w)).right + 23.0f)), (m25135d().m22861E() * 3) + 26.0f);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: w */
    public boolean mo13879w(float f10, float f11) {
        C5414d c5414d;
        Paint paintM2878F;
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
                ArrayList arrayList = this.f17913s;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (((AbstractC11082c) obj2) instanceof AbstractC11082c.f) {
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
        } else if (abstractC11081bM25136e instanceof AbstractC11081b.i.a) {
            m13890Y(4.0f);
        } else if (abstractC11081bM25136e instanceof AbstractC11081b.i.b) {
            m13890Y(-4.0f);
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
                if ((interfaceC5181c instanceof C5414d) && (paintM2878F = (c5414d = (C5414d) interfaceC5181c).m2878F()) != null) {
                    paintM2878F.setColor(iIntValue);
                    c5414d.m2880H(paintM2878F);
                    InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, null, new Paint(paintM2878F), null, null, null, 236, null);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TextFunction:TextColor -> color:");
            sb2.append(iIntValue);
            sb2.append(" list: ");
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
            InterfaceC10217e interfaceC10217eMo23764d = m25144n().mo23764d();
            if (interfaceC10217eMo23764d != null) {
                interfaceC10217eMo23764d.mo19976d(iIntValue);
            }
            m25142l().mo25447g();
            m25144n().mo23772l();
            ArrayList arrayList3 = this.f17913s;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size4) {
                    break;
                }
                Object obj5 = arrayList3.get(i13);
                i13++;
                if (((AbstractC11082c) obj5) instanceof AbstractC11082c.f) {
                    obj = obj5;
                    break;
                }
            }
            AbstractC11082c abstractC11082c2 = (AbstractC11082c) obj;
            if (abstractC11082c2 != null) {
                ((AbstractC11082c.f) abstractC11082c2).m24649f(iIntValue);
            }
            m25133P(false);
        }
        return true;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: x */
    public boolean mo13892x(float f10, float f11) {
        InterfaceC5181c interfaceC5181c;
        if (!AbstractC9979u.m20289b(m25136e(), AbstractC11081b.b.f26742a) || (interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r())) == null) {
            return false;
        }
        final C5414d c5414d = (C5414d) interfaceC5181c;
        final String strM2877E = c5414d.m2877E();
        if (strM2877E == null) {
            strM2877E = "";
        }
        final RectF rectF = new RectF(c5414d.mo2718g());
        InterfaceC10222j interfaceC10222jM22867K = m25135d().m22867K();
        if (interfaceC10222jM22867K == null) {
            return true;
        }
        interfaceC10222jM22867K.mo16800a(strM2877E, new InterfaceC9540l() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleDoubleClick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C10786q.f26013a;
            }

            public final void invoke(String it) {
                AbstractC9979u.m20294g(it, "it");
                TextFunction textFunction = this.f17919c;
                Paint paintM2878F = c5414d.m2878F();
                AbstractC9979u.m20291d(paintM2878F);
                RectF rectFM13888V = textFunction.m13888V(it, paintM2878F, new RectF(c5414d.mo2718g()));
                if (!AbstractC9979u.m20289b(rectFM13888V, c5414d.mo2718g())) {
                    c5414d.mo2875p(rectFM13888V);
                }
                c5414d.m2879G(it);
                InterfaceC11552c interfaceC11552cM25142l = this.f17919c.m25142l();
                String id2 = c5414d.getId();
                String strM2877E2 = c5414d.m2877E();
                if (strM2877E2 == null) {
                    strM2877E2 = "";
                }
                Paint paintM2878F2 = c5414d.m2878F();
                AbstractC9979u.m20291d(paintM2878F2);
                interfaceC11552cM25142l.mo25417C(id2, strM2877E2, paintM2878F2, c5414d.mo2718g());
                this.f17919c.m13891b0();
                AbstractC11254a.m25119Q(this.f17919c, false, 1, null);
            }
        }, new InterfaceC9540l() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleDoubleClick$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C10786q.f26013a;
            }

            public final void invoke(String it) {
                AbstractC9979u.m20294g(it, "it");
                InterfaceC11552c interfaceC11552cM25142l = this.f17921c.m25142l();
                String id2 = c5414d.getId();
                String strM2877E2 = c5414d.m2877E();
                if (strM2877E2 == null) {
                    strM2877E2 = "";
                }
                Paint paintM2878F = c5414d.m2878F();
                AbstractC9979u.m20291d(paintM2878F);
                interfaceC11552cM25142l.mo25417C(id2, strM2877E2, paintM2878F, c5414d.mo2718g());
                this.f17921c.m13891b0();
                AbstractC11254a.m25119Q(this.f17921c, false, 1, null);
                InterfaceC10918b interfaceC10918bM25144n = this.f17921c.m25144n();
                C5414d c5414d2 = c5414d;
                InterfaceC10918b.a.m23785a(interfaceC10918bM25144n, c5414d2, EzyGraphEnum.GraphEnum.TEXT_GRAPH, c5414d2.mo2718g(), c5414d.m2877E(), null, null, null, null, 240, null);
                this.f17921c.m25144n().mo23772l();
            }
        }, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleDoubleClick$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34002invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34002invoke() {
                c5414d.m2879G(strM2877E);
                if (!AbstractC9979u.m20289b(rectF, c5414d.mo2718g())) {
                    c5414d.mo2875p(rectF);
                }
                InterfaceC11552c interfaceC11552cM25142l = this.m25142l();
                String id2 = c5414d.getId();
                String strM2877E2 = c5414d.m2877E();
                if (strM2877E2 == null) {
                    strM2877E2 = "";
                }
                Paint paintM2878F = c5414d.m2878F();
                AbstractC9979u.m20291d(paintM2878F);
                interfaceC11552cM25142l.mo25417C(id2, strM2877E2, paintM2878F, c5414d.mo2718g());
                this.m13891b0();
                AbstractC11254a.m25119Q(this, false, 1, null);
            }
        });
        return true;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: y */
    public boolean mo13893y(float f10, float f11) {
        if (super.mo13893y(f10, f11)) {
            return true;
        }
        if (!AbstractC9979u.m20289b(m25136e(), AbstractC11081b.c.C12150c.f26745a)) {
            return false;
        }
        m13889X(f10);
        m13891b0();
        m13882U();
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c != null) {
            InterfaceC11552c.a.m25468b(m25142l(), m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), null, 32, null);
            InterfaceC10918b.a.m23785a(m25144n(), interfaceC5181c, EzyGraphEnum.GraphEnum.TEXT_GRAPH, interfaceC5181c.mo2718g(), null, null, null, null, null, 248, null);
        }
        m25144n().mo23772l();
        return true;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: z */
    public boolean mo13894z(float f10, float f11) {
        if (!AbstractC9979u.m20289b(m25136e(), AbstractC11081b.c.C12150c.f26745a)) {
            return true;
        }
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c == null) {
            return false;
        }
        C5414d c5414d = (C5414d) interfaceC5181c;
        Matrix matrix = new Matrix();
        matrix.postConcat(c5414d.mo2714b());
        matrix.postConcat(m25145o().m25311b());
        this.f17918x = matrix.mapRadius(c5414d.mo2718g().width());
        m13891b0();
        m13882U();
        InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c2 == null) {
            return true;
        }
        InterfaceC11552c.a.m25469c(m25142l(), (C5414d) interfaceC5181c2, m25148s(), m25137g(), m25146q(), m25140j(), mo13877f(), null, 64, null);
        return true;
    }
}
