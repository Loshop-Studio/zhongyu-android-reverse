package p293x0;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.PDFView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p070d1.AbstractC8274a;
import p070d1.AbstractC8275b;
import p070d1.AbstractC8277d;
import p117h1.C8708a;

/* renamed from: x0.e */
/* loaded from: classes3.dex */
public class C10486e {

    /* renamed from: a */
    public PDFView f20853a;

    /* renamed from: b */
    public int f20854b;

    /* renamed from: c */
    public float f20855c;

    /* renamed from: d */
    public float f20856d;

    /* renamed from: e */
    public float f20857e;

    /* renamed from: f */
    public float f20858f;

    /* renamed from: g */
    public float f20859g;

    /* renamed from: h */
    public float f20860h;

    /* renamed from: i */
    public final RectF f20861i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j */
    public final int f20862j;

    /* renamed from: x0.e$b */
    public class b {

        /* renamed from: a */
        public int f20863a;

        /* renamed from: b */
        public int f20864b;

        public b() {
        }

        public String toString() {
            return "GridSize{rows=" + this.f20863a + ", cols=" + this.f20864b + '}';
        }
    }

    /* renamed from: x0.e$c */
    public class c {

        /* renamed from: a */
        public int f20866a;

        /* renamed from: b */
        public int f20867b;

        public c() {
        }

        public String toString() {
            return "Holder{row=" + this.f20866a + ", col=" + this.f20867b + '}';
        }
    }

    /* renamed from: x0.e$d */
    public class d {

        /* renamed from: a */
        public int f20869a = 0;

        /* renamed from: b */
        public b f20870b;

        /* renamed from: c */
        public c f20871c;

        /* renamed from: d */
        public c f20872d;

        public d() {
            this.f20870b = new b();
            this.f20871c = new c();
            this.f20872d = new c();
        }

        public String toString() {
            return "RenderRange{page=" + this.f20869a + ", gridSize=" + this.f20870b + ", leftTop=" + this.f20871c + ", rightBottom=" + this.f20872d + '}';
        }
    }

    public C10486e(PDFView pDFView) {
        this.f20853a = pDFView;
        this.f20862j = AbstractC8277d.m13429a(pDFView.getContext(), AbstractC8274a.f15668d);
    }

    /* renamed from: a */
    public final void m19643a(b bVar) {
        float f10 = 1.0f / bVar.f20864b;
        this.f20857e = f10;
        float f11 = 1.0f / bVar.f20863a;
        this.f20858f = f11;
        float f12 = AbstractC8274a.f15667c;
        this.f20859g = f12 / f10;
        this.f20860h = f12 / f11;
    }

    /* renamed from: b */
    public final void m19644b(b bVar, int i10) {
        C8708a c8708aM19665n = this.f20853a.f3718h.m19665n(i10);
        float fM14208b = 1.0f / c8708aM19665n.m14208b();
        float fM14207a = (AbstractC8274a.f15667c * (1.0f / c8708aM19665n.m14207a())) / this.f20853a.getZoom();
        float zoom = (AbstractC8274a.f15667c * fM14208b) / this.f20853a.getZoom();
        bVar.f20863a = AbstractC8275b.m13417a(1.0f / fM14207a);
        bVar.f20864b = AbstractC8275b.m13417a(1.0f / zoom);
    }

    /* renamed from: c */
    public final List m19645c(float f10, float f11, float f12, float f13) {
        float fM19664m;
        float fM14208b;
        float f14;
        float fM14207a;
        float f15;
        float f16;
        boolean z10;
        float fM14208b2;
        float fM14207a2;
        float f17 = -AbstractC8275b.m13420d(f10, 0.0f);
        float f18 = -AbstractC8275b.m13420d(f11, 0.0f);
        float f19 = -AbstractC8275b.m13420d(f12, 0.0f);
        float f20 = -AbstractC8275b.m13420d(f13, 0.0f);
        float f21 = this.f20853a.m3558C() ? f18 : f17;
        float f22 = this.f20853a.m3558C() ? f20 : f19;
        PDFView pDFView = this.f20853a;
        int iM19661j = pDFView.f3718h.m19661j(f21, pDFView.getZoom());
        PDFView pDFView2 = this.f20853a;
        int iM19661j2 = pDFView2.f3718h.m19661j(f22, pDFView2.getZoom());
        int i10 = 1;
        int i11 = (iM19661j2 - iM19661j) + 1;
        LinkedList linkedList = new LinkedList();
        int i12 = iM19661j;
        while (i12 <= iM19661j2) {
            d dVar = new d();
            dVar.f20869a = i12;
            if (i12 != iM19661j) {
                if (i12 == iM19661j2) {
                    PDFView pDFView3 = this.f20853a;
                    fM19664m = pDFView3.f3718h.m19664m(i12, pDFView3.getZoom());
                    if (this.f20853a.m3558C()) {
                        f15 = fM19664m;
                        fM19664m = f17;
                    } else {
                        f15 = f18;
                    }
                    fM14207a = f20;
                    f14 = f15;
                } else {
                    PDFView pDFView4 = this.f20853a;
                    fM19664m = pDFView4.f3718h.m19664m(i12, pDFView4.getZoom());
                    PDFView pDFView5 = this.f20853a;
                    C8708a c8708aM19668q = pDFView5.f3718h.m19668q(i12, pDFView5.getZoom());
                    if (this.f20853a.m3558C()) {
                        f14 = fM19664m;
                        fM14207a = c8708aM19668q.m14207a() + fM19664m;
                        fM19664m = f17;
                    } else {
                        fM14208b = c8708aM19668q.m14208b() + fM19664m;
                        f14 = f18;
                        fM14207a = f20;
                    }
                }
                fM14208b = f19;
            } else if (i11 == i10) {
                fM19664m = f17;
                f14 = f18;
                fM14208b = f19;
                fM14207a = f20;
            } else {
                PDFView pDFView6 = this.f20853a;
                float fM19664m2 = pDFView6.f3718h.m19664m(i12, pDFView6.getZoom());
                PDFView pDFView7 = this.f20853a;
                C8708a c8708aM19668q2 = pDFView7.f3718h.m19668q(i12, pDFView7.getZoom());
                if (this.f20853a.m3558C()) {
                    fM14207a2 = fM19664m2 + c8708aM19668q2.m14207a();
                    fM14208b2 = f19;
                } else {
                    fM14208b2 = fM19664m2 + c8708aM19668q2.m14208b();
                    fM14207a2 = f20;
                }
                f14 = f18;
                fM14207a = fM14207a2;
                fM14208b = fM14208b2;
                fM19664m = f17;
            }
            m19644b(dVar.f20870b, dVar.f20869a);
            PDFView pDFView8 = this.f20853a;
            float f23 = f17;
            C8708a c8708aM19668q3 = pDFView8.f3718h.m19668q(dVar.f20869a, pDFView8.getZoom());
            float fM14207a3 = c8708aM19668q3.m14207a() / dVar.f20870b.f20863a;
            float fM14208b3 = c8708aM19668q3.m14208b() / dVar.f20870b.f20864b;
            PDFView pDFView9 = this.f20853a;
            float fM19669r = pDFView9.f3718h.m19669r(i12, pDFView9.getZoom());
            if (this.f20853a.m3558C()) {
                c cVar = dVar.f20871c;
                PDFView pDFView10 = this.f20853a;
                f16 = f18;
                cVar.f20866a = AbstractC8275b.m13418b(Math.abs(f14 - pDFView10.f3718h.m19664m(dVar.f20869a, pDFView10.getZoom())) / fM14207a3);
                dVar.f20871c.f20867b = AbstractC8275b.m13418b(AbstractC8275b.m13421e(fM19664m - fM19669r, 0.0f) / fM14208b3);
                c cVar2 = dVar.f20872d;
                PDFView pDFView11 = this.f20853a;
                cVar2.f20866a = AbstractC8275b.m13417a(Math.abs(fM14207a - pDFView11.f3718h.m19664m(dVar.f20869a, pDFView11.getZoom())) / fM14207a3);
                dVar.f20872d.f20867b = AbstractC8275b.m13418b(AbstractC8275b.m13421e(fM14208b - fM19669r, 0.0f) / fM14208b3);
                z10 = false;
            } else {
                f16 = f18;
                c cVar3 = dVar.f20871c;
                PDFView pDFView12 = this.f20853a;
                cVar3.f20867b = AbstractC8275b.m13418b(Math.abs(fM19664m - pDFView12.f3718h.m19664m(dVar.f20869a, pDFView12.getZoom())) / fM14208b3);
                dVar.f20871c.f20866a = AbstractC8275b.m13418b(AbstractC8275b.m13421e(f14 - fM19669r, 0.0f) / fM14207a3);
                c cVar4 = dVar.f20872d;
                PDFView pDFView13 = this.f20853a;
                cVar4.f20867b = AbstractC8275b.m13418b(Math.abs(fM14208b - pDFView13.f3718h.m19664m(dVar.f20869a, pDFView13.getZoom())) / fM14208b3);
                z10 = false;
                dVar.f20872d.f20866a = AbstractC8275b.m13418b(AbstractC8275b.m13421e(fM14207a - fM19669r, 0.0f) / fM14207a3);
            }
            linkedList.add(dVar);
            i12++;
            f17 = f23;
            f18 = f16;
            i10 = 1;
        }
        return linkedList;
    }

    /* renamed from: d */
    public final boolean m19646d(int i10, int i11, int i12, float f10, float f11) {
        float f12 = i12 * f10;
        float f13 = i11 * f11;
        float f14 = this.f20859g;
        float f15 = this.f20860h;
        float f16 = f12 + f10 > 1.0f ? 1.0f - f12 : f10;
        float f17 = f13 + f11 > 1.0f ? 1.0f - f13 : f11;
        float f18 = f14 * f16;
        float f19 = f15 * f17;
        RectF rectF = new RectF(f12, f13, f16 + f12, f17 + f13);
        if (f18 <= 0.0f || f19 <= 0.0f) {
            return false;
        }
        if (!this.f20853a.f3715e.m19630k(i10, rectF, this.f20854b)) {
            PDFView pDFView = this.f20853a;
            pDFView.f3727q.m19679b(i10, f18, f19, rectF, false, this.f20854b, pDFView.m3600x(), this.f20853a.m3598v());
        }
        this.f20854b++;
        return true;
    }

    /* renamed from: e */
    public final int m19647e(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 0;
        for (int i17 = i11; i17 <= i12; i17++) {
            int i18 = i13;
            while (i18 <= i14) {
                int i19 = i10;
                if (m19646d(i19, i17, i18, this.f20857e, this.f20858f)) {
                    i16++;
                }
                if (i16 >= i15) {
                    return i16;
                }
                i18++;
                i10 = i19;
            }
        }
        return i16;
    }

    /* renamed from: f */
    public void m19648f() {
        this.f20854b = 1;
        this.f20855c = -AbstractC8275b.m13420d(this.f20853a.getCurrentXOffset(), 0.0f);
        this.f20856d = -AbstractC8275b.m13420d(this.f20853a.getCurrentYOffset(), 0.0f);
        m19650h();
    }

    /* renamed from: g */
    public final void m19649g(int i10) {
        C8708a c8708aM19665n = this.f20853a.f3718h.m19665n(i10);
        float fM14208b = c8708aM19665n.m14208b() * AbstractC8274a.f15666b;
        float fM14207a = c8708aM19665n.m14207a() * AbstractC8274a.f15666b;
        if (this.f20853a.f3715e.m19624d(i10, this.f20861i)) {
            return;
        }
        PDFView pDFView = this.f20853a;
        pDFView.f3727q.m19679b(i10, fM14208b, fM14207a, this.f20861i, true, 0, pDFView.m3600x(), this.f20853a.m3598v());
    }

    /* renamed from: h */
    public final void m19650h() {
        float f10 = this.f20862j;
        float f11 = this.f20855c;
        float f12 = this.f20856d;
        List<d> listM19645c = m19645c((-f11) + f10, (-f12) + f10, ((-f11) - this.f20853a.getWidth()) - f10, ((-f12) - this.f20853a.getHeight()) - f10);
        Iterator it = listM19645c.iterator();
        while (it.hasNext()) {
            m19649g(((d) it.next()).f20869a);
        }
        int iM19647e = 0;
        for (d dVar : listM19645c) {
            m19643a(dVar.f20870b);
            int i10 = dVar.f20869a;
            c cVar = dVar.f20871c;
            int i11 = cVar.f20866a;
            c cVar2 = dVar.f20872d;
            iM19647e += m19647e(i10, i11, cVar2.f20866a, cVar.f20867b, cVar2.f20867b, AbstractC8274a.a.f15669a - iM19647e);
            if (iM19647e >= AbstractC8274a.a.f15669a) {
                return;
            }
        }
    }
}
