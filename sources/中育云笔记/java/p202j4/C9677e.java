package p202j4;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.PDFView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p205j7.C9686a;
import p288p4.AbstractC10627a;
import p288p4.AbstractC10628b;
import p288p4.AbstractC10630d;

/* renamed from: j4.e */
/* loaded from: classes5.dex */
public class C9677e {

    /* renamed from: a */
    public PDFView f22418a;

    /* renamed from: b */
    public int f22419b;

    /* renamed from: c */
    public float f22420c;

    /* renamed from: d */
    public float f22421d;

    /* renamed from: e */
    public float f22422e;

    /* renamed from: f */
    public float f22423f;

    /* renamed from: g */
    public float f22424g;

    /* renamed from: h */
    public float f22425h;

    /* renamed from: i */
    public final RectF f22426i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j */
    public final int f22427j;

    /* renamed from: j4.e$b */
    public class b {

        /* renamed from: a */
        public int f22428a;

        /* renamed from: b */
        public int f22429b;

        public b() {
        }

        public String toString() {
            return "GridSize{rows=" + this.f22428a + ", cols=" + this.f22429b + '}';
        }
    }

    /* renamed from: j4.e$c */
    public class c {

        /* renamed from: a */
        public int f22431a;

        /* renamed from: b */
        public int f22432b;

        public c() {
        }

        public String toString() {
            return "Holder{row=" + this.f22431a + ", col=" + this.f22432b + '}';
        }
    }

    /* renamed from: j4.e$d */
    public class d {

        /* renamed from: a */
        public int f22434a = 0;

        /* renamed from: b */
        public b f22435b;

        /* renamed from: c */
        public c f22436c;

        /* renamed from: d */
        public c f22437d;

        public d() {
            this.f22435b = new b();
            this.f22436c = new c();
            this.f22437d = new c();
        }

        public String toString() {
            return "RenderRange{page=" + this.f22434a + ", gridSize=" + this.f22435b + ", leftTop=" + this.f22436c + ", rightBottom=" + this.f22437d + '}';
        }
    }

    public C9677e(PDFView pDFView) {
        this.f22418a = pDFView;
        this.f22427j = AbstractC10630d.m22479a(pDFView.getContext(), AbstractC10627a.f25605d);
    }

    /* renamed from: a */
    public final void m19098a(b bVar) {
        float f10 = 1.0f / bVar.f22429b;
        this.f22422e = f10;
        float f11 = 1.0f / bVar.f22428a;
        this.f22423f = f11;
        float f12 = AbstractC10627a.f25604c;
        this.f22424g = f12 / f10;
        this.f22425h = f12 / f11;
    }

    /* renamed from: b */
    public final void m19099b(b bVar, int i10) {
        C9686a c9686aM19120n = this.f22418a.f10801j.m19120n(i10);
        float fM19174b = 1.0f / c9686aM19120n.m19174b();
        float fM19173a = (AbstractC10627a.f25604c * (1.0f / c9686aM19120n.m19173a())) / this.f22418a.getZoom();
        float zoom = (AbstractC10627a.f25604c * fM19174b) / this.f22418a.getZoom();
        bVar.f22428a = AbstractC10628b.m22467a(1.0f / fM19173a);
        bVar.f22429b = AbstractC10628b.m22467a(1.0f / zoom);
    }

    /* renamed from: c */
    public final List m19100c(float f10, float f11, float f12, float f13) {
        float fM19119m;
        float fM19174b;
        float f14;
        float fM19173a;
        float f15;
        float f16;
        boolean z10;
        float fM19174b2;
        float fM19173a2;
        float f17 = -AbstractC10628b.m22470d(f10, 0.0f);
        float f18 = -AbstractC10628b.m22470d(f11, 0.0f);
        float f19 = -AbstractC10628b.m22470d(f12, 0.0f);
        float f20 = -AbstractC10628b.m22470d(f13, 0.0f);
        float f21 = this.f22418a.m7849C() ? f18 : f17;
        float f22 = this.f22418a.m7849C() ? f20 : f19;
        PDFView pDFView = this.f22418a;
        int iM19116j = pDFView.f10801j.m19116j(f21, pDFView.getZoom());
        PDFView pDFView2 = this.f22418a;
        int iM19116j2 = pDFView2.f10801j.m19116j(f22, pDFView2.getZoom());
        int i10 = 1;
        int i11 = (iM19116j2 - iM19116j) + 1;
        LinkedList linkedList = new LinkedList();
        int i12 = iM19116j;
        while (i12 <= iM19116j2) {
            d dVar = new d();
            dVar.f22434a = i12;
            if (i12 != iM19116j) {
                if (i12 == iM19116j2) {
                    PDFView pDFView3 = this.f22418a;
                    fM19119m = pDFView3.f10801j.m19119m(i12, pDFView3.getZoom());
                    if (this.f22418a.m7849C()) {
                        f15 = fM19119m;
                        fM19119m = f17;
                    } else {
                        f15 = f18;
                    }
                    fM19173a = f20;
                    f14 = f15;
                } else {
                    PDFView pDFView4 = this.f22418a;
                    fM19119m = pDFView4.f10801j.m19119m(i12, pDFView4.getZoom());
                    PDFView pDFView5 = this.f22418a;
                    C9686a c9686aM19123q = pDFView5.f10801j.m19123q(i12, pDFView5.getZoom());
                    if (this.f22418a.m7849C()) {
                        f14 = fM19119m;
                        fM19173a = c9686aM19123q.m19173a() + fM19119m;
                        fM19119m = f17;
                    } else {
                        fM19174b = c9686aM19123q.m19174b() + fM19119m;
                        f14 = f18;
                        fM19173a = f20;
                    }
                }
                fM19174b = f19;
            } else if (i11 == i10) {
                fM19119m = f17;
                f14 = f18;
                fM19174b = f19;
                fM19173a = f20;
            } else {
                PDFView pDFView6 = this.f22418a;
                float fM19119m2 = pDFView6.f10801j.m19119m(i12, pDFView6.getZoom());
                PDFView pDFView7 = this.f22418a;
                C9686a c9686aM19123q2 = pDFView7.f10801j.m19123q(i12, pDFView7.getZoom());
                if (this.f22418a.m7849C()) {
                    fM19173a2 = fM19119m2 + c9686aM19123q2.m19173a();
                    fM19174b2 = f19;
                } else {
                    fM19174b2 = fM19119m2 + c9686aM19123q2.m19174b();
                    fM19173a2 = f20;
                }
                f14 = f18;
                fM19173a = fM19173a2;
                fM19174b = fM19174b2;
                fM19119m = f17;
            }
            m19099b(dVar.f22435b, dVar.f22434a);
            PDFView pDFView8 = this.f22418a;
            float f23 = f17;
            C9686a c9686aM19123q3 = pDFView8.f10801j.m19123q(dVar.f22434a, pDFView8.getZoom());
            float fM19173a3 = c9686aM19123q3.m19173a() / dVar.f22435b.f22428a;
            float fM19174b3 = c9686aM19123q3.m19174b() / dVar.f22435b.f22429b;
            PDFView pDFView9 = this.f22418a;
            float fM19124r = pDFView9.f10801j.m19124r(i12, pDFView9.getZoom());
            if (this.f22418a.m7849C()) {
                c cVar = dVar.f22436c;
                PDFView pDFView10 = this.f22418a;
                f16 = f18;
                cVar.f22431a = AbstractC10628b.m22468b(Math.abs(f14 - pDFView10.f10801j.m19119m(dVar.f22434a, pDFView10.getZoom())) / fM19173a3);
                dVar.f22436c.f22432b = AbstractC10628b.m22468b(AbstractC10628b.m22471e(fM19119m - fM19124r, 0.0f) / fM19174b3);
                c cVar2 = dVar.f22437d;
                PDFView pDFView11 = this.f22418a;
                cVar2.f22431a = AbstractC10628b.m22467a(Math.abs(fM19173a - pDFView11.f10801j.m19119m(dVar.f22434a, pDFView11.getZoom())) / fM19173a3);
                dVar.f22437d.f22432b = AbstractC10628b.m22468b(AbstractC10628b.m22471e(fM19174b - fM19124r, 0.0f) / fM19174b3);
                z10 = false;
            } else {
                f16 = f18;
                c cVar3 = dVar.f22436c;
                PDFView pDFView12 = this.f22418a;
                cVar3.f22432b = AbstractC10628b.m22468b(Math.abs(fM19119m - pDFView12.f10801j.m19119m(dVar.f22434a, pDFView12.getZoom())) / fM19174b3);
                dVar.f22436c.f22431a = AbstractC10628b.m22468b(AbstractC10628b.m22471e(f14 - fM19124r, 0.0f) / fM19173a3);
                c cVar4 = dVar.f22437d;
                PDFView pDFView13 = this.f22418a;
                cVar4.f22432b = AbstractC10628b.m22468b(Math.abs(fM19174b - pDFView13.f10801j.m19119m(dVar.f22434a, pDFView13.getZoom())) / fM19174b3);
                z10 = false;
                dVar.f22437d.f22431a = AbstractC10628b.m22468b(AbstractC10628b.m22471e(fM19173a - fM19124r, 0.0f) / fM19173a3);
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
    public final boolean m19101d(int i10, int i11, int i12, float f10, float f11) {
        float f12 = i12 * f10;
        float f13 = i11 * f11;
        float f14 = this.f22424g;
        float f15 = this.f22425h;
        float f16 = f12 + f10 > 1.0f ? 1.0f - f12 : f10;
        float f17 = f13 + f11 > 1.0f ? 1.0f - f13 : f11;
        float f18 = f14 * f16;
        float f19 = f15 * f17;
        RectF rectF = new RectF(f12, f13, f16 + f12, f17 + f13);
        if (f18 <= 0.0f || f19 <= 0.0f) {
            return false;
        }
        if (!this.f22418a.f10798g.m19085k(i10, rectF, this.f22419b)) {
            PDFView pDFView = this.f22418a;
            pDFView.f10810s.m19134b(i10, f18, f19, rectF, false, this.f22419b, pDFView.m7891x(), this.f22418a.m7889v());
        }
        this.f22419b++;
        return true;
    }

    /* renamed from: e */
    public final int m19102e(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 0;
        for (int i17 = i11; i17 <= i12; i17++) {
            int i18 = i13;
            while (i18 <= i14) {
                int i19 = i10;
                if (m19101d(i19, i17, i18, this.f22422e, this.f22423f)) {
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
    public void m19103f() {
        this.f22419b = 1;
        this.f22420c = -AbstractC10628b.m22470d(this.f22418a.getCurrentXOffset(), 0.0f);
        this.f22421d = -AbstractC10628b.m22470d(this.f22418a.getCurrentYOffset(), 0.0f);
        m19105h();
    }

    /* renamed from: g */
    public final void m19104g(int i10) {
        C9686a c9686aM19120n = this.f22418a.f10801j.m19120n(i10);
        float fM19174b = c9686aM19120n.m19174b() * AbstractC10627a.f25603b;
        float fM19173a = c9686aM19120n.m19173a() * AbstractC10627a.f25603b;
        if (this.f22418a.f10798g.m19079d(i10, this.f22426i)) {
            return;
        }
        PDFView pDFView = this.f22418a;
        pDFView.f10810s.m19134b(i10, fM19174b, fM19173a, this.f22426i, true, 0, pDFView.m7891x(), this.f22418a.m7889v());
    }

    /* renamed from: h */
    public final void m19105h() {
        float f10 = this.f22427j;
        float f11 = this.f22420c;
        float f12 = this.f22421d;
        List<d> listM19100c = m19100c((-f11) + f10, (-f12) + f10, ((-f11) - this.f22418a.getWidth()) - f10, ((-f12) - this.f22418a.getHeight()) - f10);
        Iterator it = listM19100c.iterator();
        while (it.hasNext()) {
            m19104g(((d) it.next()).f22434a);
        }
        int iM19102e = 0;
        for (d dVar : listM19100c) {
            m19098a(dVar.f22435b);
            int i10 = dVar.f22434a;
            c cVar = dVar.f22436c;
            int i11 = cVar.f22431a;
            c cVar2 = dVar.f22437d;
            iM19102e += m19102e(i10, i11, cVar2.f22431a, cVar.f22432b, cVar2.f22432b, AbstractC10627a.a.f25606a - iM19102e);
            if (iM19102e >= AbstractC10627a.a.f25606a) {
                return;
            }
        }
    }
}
