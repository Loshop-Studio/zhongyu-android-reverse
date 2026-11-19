package p293x0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.C6409a;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p070d1.C8276c;
import p117h1.C8708a;

/* renamed from: x0.f */
/* loaded from: classes3.dex */
public class C10487f {

    /* renamed from: t */
    public static final Object f20874t = new Object();

    /* renamed from: a */
    public C6409a f20875a;

    /* renamed from: b */
    public PdfiumCore f20876b;

    /* renamed from: k */
    public boolean f20885k;

    /* renamed from: l */
    public int f20886l;

    /* renamed from: m */
    public boolean f20887m;

    /* renamed from: q */
    public final FitPolicy f20891q;

    /* renamed from: r */
    public final boolean f20892r;

    /* renamed from: s */
    public int[] f20893s;

    /* renamed from: c */
    public int f20877c = 0;

    /* renamed from: d */
    public List f20878d = new ArrayList();

    /* renamed from: e */
    public List f20879e = new ArrayList();

    /* renamed from: f */
    public SparseBooleanArray f20880f = new SparseBooleanArray();

    /* renamed from: g */
    public Size f20881g = new Size(0, 0);

    /* renamed from: h */
    public Size f20882h = new Size(0, 0);

    /* renamed from: i */
    public C8708a f20883i = new C8708a(0.0f, 0.0f);

    /* renamed from: j */
    public C8708a f20884j = new C8708a(0.0f, 0.0f);

    /* renamed from: n */
    public List f20888n = new ArrayList();

    /* renamed from: o */
    public List f20889o = new ArrayList();

    /* renamed from: p */
    public float f20890p = 0.0f;

    public C10487f(PdfiumCore pdfiumCore, C6409a c6409a, FitPolicy fitPolicy, Size size, int[] iArr, boolean z10, int i10, boolean z11, boolean z12) {
        this.f20876b = pdfiumCore;
        this.f20875a = c6409a;
        this.f20891q = fitPolicy;
        this.f20893s = iArr;
        this.f20885k = z10;
        this.f20886l = i10;
        this.f20887m = z11;
        this.f20892r = z12;
        m19651A(size);
    }

    /* renamed from: A */
    public final void m19651A(Size size) {
        int[] iArr = this.f20893s;
        if (iArr != null) {
            this.f20877c = iArr.length;
        } else {
            this.f20877c = this.f20876b.m4092d(this.f20875a);
        }
        for (int i10 = 0; i10 < this.f20877c; i10++) {
            Size sizeM4094f = this.f20876b.m4094f(this.f20875a, m19654c(i10));
            if (sizeM4094f.m4107b() > this.f20881g.m4107b()) {
                this.f20881g = sizeM4094f;
            }
            if (sizeM4094f.m4106a() > this.f20882h.m4106a()) {
                this.f20882h = sizeM4094f;
            }
            this.f20878d.add(sizeM4094f);
        }
        m19676y(size);
    }

    /* renamed from: a */
    public int m19652a(int i10) {
        int iM19667p;
        if (i10 <= 0) {
            return 0;
        }
        int[] iArr = this.f20893s;
        if (iArr != null) {
            if (i10 >= iArr.length) {
                iM19667p = iArr.length;
                return iM19667p - 1;
            }
            return i10;
        }
        if (i10 >= m19667p()) {
            iM19667p = m19667p();
            return iM19667p - 1;
        }
        return i10;
    }

    /* renamed from: b */
    public void m19653b() {
        C6409a c6409a;
        PdfiumCore pdfiumCore = this.f20876b;
        if (pdfiumCore != null && (c6409a = this.f20875a) != null) {
            pdfiumCore.m4090a(c6409a);
        }
        this.f20875a = null;
        this.f20893s = null;
    }

    /* renamed from: c */
    public int m19654c(int i10) {
        int i11;
        int[] iArr = this.f20893s;
        if (iArr == null) {
            i11 = i10;
        } else {
            if (i10 < 0 || i10 >= iArr.length) {
                return -1;
            }
            i11 = iArr[i10];
        }
        if (i11 < 0 || i10 >= m19667p()) {
            return -1;
        }
        return i11;
    }

    /* renamed from: d */
    public List m19655d() {
        C6409a c6409a = this.f20875a;
        return c6409a == null ? new ArrayList() : this.f20876b.m4095g(c6409a);
    }

    /* renamed from: e */
    public float m19656e(float f10) {
        return this.f20890p * f10;
    }

    /* renamed from: f */
    public float m19657f() {
        return m19658g().m14207a();
    }

    /* renamed from: g */
    public C8708a m19658g() {
        return this.f20885k ? this.f20884j : this.f20883i;
    }

    /* renamed from: h */
    public float m19659h() {
        return m19658g().m14208b();
    }

    /* renamed from: i */
    public C6409a.c m19660i() {
        C6409a c6409a = this.f20875a;
        if (c6409a == null) {
            return null;
        }
        return this.f20876b.m4091b(c6409a);
    }

    /* renamed from: j */
    public int m19661j(float f10, float f11) {
        int i10 = 0;
        for (int i11 = 0; i11 < m19667p() && (((Float) this.f20888n.get(i11)).floatValue() * f11) - (m19666o(i11, f11) / 2.0f) < f10; i11++) {
            i10++;
        }
        int i12 = i10 - 1;
        if (i12 >= 0) {
            return i12;
        }
        return 0;
    }

    /* renamed from: k */
    public float m19662k(int i10, float f10) {
        C8708a c8708aM19665n = m19665n(i10);
        return (this.f20885k ? c8708aM19665n.m14207a() : c8708aM19665n.m14208b()) * f10;
    }

    /* renamed from: l */
    public List m19663l(int i10) {
        return this.f20876b.m4093e(this.f20875a, m19654c(i10));
    }

    /* renamed from: m */
    public float m19664m(int i10, float f10) {
        if (m19654c(i10) < 0) {
            return 0.0f;
        }
        return ((Float) this.f20888n.get(i10)).floatValue() * f10;
    }

    /* renamed from: n */
    public C8708a m19665n(int i10) {
        return m19654c(i10) < 0 ? new C8708a(0.0f, 0.0f) : (C8708a) this.f20879e.get(i10);
    }

    /* renamed from: o */
    public float m19666o(int i10, float f10) {
        return (this.f20887m ? ((Float) this.f20889o.get(i10)).floatValue() : this.f20886l) * f10;
    }

    /* renamed from: p */
    public int m19667p() {
        return this.f20877c;
    }

    /* renamed from: q */
    public C8708a m19668q(int i10, float f10) {
        C8708a c8708aM19665n = m19665n(i10);
        return new C8708a(c8708aM19665n.m14208b() * f10, c8708aM19665n.m14207a() * f10);
    }

    /* renamed from: r */
    public float m19669r(int i10, float f10) {
        float fM19657f;
        float fM14207a;
        C8708a c8708aM19665n = m19665n(i10);
        if (this.f20885k) {
            fM19657f = m19659h();
            fM14207a = c8708aM19665n.m14208b();
        } else {
            fM19657f = m19657f();
            fM14207a = c8708aM19665n.m14207a();
        }
        return (f10 * (fM19657f - fM14207a)) / 2.0f;
    }

    /* renamed from: s */
    public RectF m19670s(int i10, int i11, int i12, int i13, int i14, RectF rectF) {
        return this.f20876b.m4097i(this.f20875a, m19654c(i10), i11, i12, i13, i14, 0, rectF);
    }

    /* renamed from: t */
    public boolean m19671t(int i10) {
        int iM19654c = m19654c(i10);
        if (iM19654c < 0) {
            return false;
        }
        synchronized (f20874t) {
            try {
                if (this.f20880f.indexOfKey(iM19654c) >= 0) {
                    return false;
                }
                try {
                    this.f20876b.m4099k(this.f20875a, iM19654c);
                    this.f20880f.put(iM19654c, true);
                    return true;
                } catch (Exception e10) {
                    this.f20880f.put(iM19654c, false);
                    throw new PageRenderingException(i10, e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public boolean m19672u(int i10) {
        return !this.f20880f.get(m19654c(i10), false);
    }

    /* renamed from: v */
    public final void m19673v(Size size) {
        float fM4107b;
        float fM14208b;
        this.f20889o.clear();
        for (int i10 = 0; i10 < m19667p(); i10++) {
            C8708a c8708a = (C8708a) this.f20879e.get(i10);
            if (this.f20885k) {
                fM4107b = size.m4106a();
                fM14208b = c8708a.m14207a();
            } else {
                fM4107b = size.m4107b();
                fM14208b = c8708a.m14208b();
            }
            float fMax = Math.max(0.0f, fM4107b - fM14208b);
            if (i10 < m19667p() - 1) {
                fMax += this.f20886l;
            }
            this.f20889o.add(Float.valueOf(fMax));
        }
    }

    /* renamed from: w */
    public final void m19674w() {
        float fFloatValue;
        float fM14207a = 0.0f;
        for (int i10 = 0; i10 < m19667p(); i10++) {
            C8708a c8708a = (C8708a) this.f20879e.get(i10);
            fM14207a += this.f20885k ? c8708a.m14207a() : c8708a.m14208b();
            if (this.f20887m) {
                fFloatValue = ((Float) this.f20889o.get(i10)).floatValue();
            } else if (i10 < m19667p() - 1) {
                fFloatValue = this.f20886l;
            }
            fM14207a += fFloatValue;
        }
        this.f20890p = fM14207a;
    }

    /* renamed from: x */
    public final void m19675x() {
        float fFloatValue;
        this.f20888n.clear();
        float fFloatValue2 = 0.0f;
        for (int i10 = 0; i10 < m19667p(); i10++) {
            C8708a c8708a = (C8708a) this.f20879e.get(i10);
            float fM14207a = this.f20885k ? c8708a.m14207a() : c8708a.m14208b();
            if (this.f20887m) {
                fFloatValue2 += ((Float) this.f20889o.get(i10)).floatValue() / 2.0f;
                if (i10 == 0) {
                    fFloatValue2 -= this.f20886l / 2.0f;
                } else if (i10 == m19667p() - 1) {
                    fFloatValue2 += this.f20886l / 2.0f;
                }
                this.f20888n.add(Float.valueOf(fFloatValue2));
                fFloatValue = ((Float) this.f20889o.get(i10)).floatValue() / 2.0f;
            } else {
                this.f20888n.add(Float.valueOf(fFloatValue2));
                fFloatValue = this.f20886l;
            }
            fFloatValue2 += fM14207a + fFloatValue;
        }
    }

    /* renamed from: y */
    public void m19676y(Size size) {
        this.f20879e.clear();
        C8276c c8276c = new C8276c(this.f20891q, this.f20881g, this.f20882h, size, this.f20892r);
        this.f20884j = c8276c.m13428g();
        this.f20883i = c8276c.m13427f();
        Iterator it = this.f20878d.iterator();
        while (it.hasNext()) {
            this.f20879e.add(c8276c.m13422a((Size) it.next()));
        }
        if (this.f20887m) {
            m19673v(size);
        }
        m19674w();
        m19675x();
    }

    /* renamed from: z */
    public void m19677z(Bitmap bitmap, int i10, Rect rect, boolean z10) {
        this.f20876b.m4101m(this.f20875a, bitmap, m19654c(i10), rect.left, rect.top, rect.width(), rect.height(), z10);
    }
}
