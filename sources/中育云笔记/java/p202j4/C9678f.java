package p202j4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.C7519a;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p205j7.C9686a;
import p288p4.C10629c;

/* renamed from: j4.f */
/* loaded from: classes5.dex */
public class C9678f {

    /* renamed from: t */
    public static final Object f22439t = new Object();

    /* renamed from: a */
    public C7519a f22440a;

    /* renamed from: b */
    public PdfiumCore f22441b;

    /* renamed from: k */
    public boolean f22450k;

    /* renamed from: l */
    public int f22451l;

    /* renamed from: m */
    public boolean f22452m;

    /* renamed from: q */
    public final FitPolicy f22456q;

    /* renamed from: r */
    public final boolean f22457r;

    /* renamed from: s */
    public int[] f22458s;

    /* renamed from: c */
    public int f22442c = 0;

    /* renamed from: d */
    public List f22443d = new ArrayList();

    /* renamed from: e */
    public List f22444e = new ArrayList();

    /* renamed from: f */
    public SparseBooleanArray f22445f = new SparseBooleanArray();

    /* renamed from: g */
    public Size f22446g = new Size(0, 0);

    /* renamed from: h */
    public Size f22447h = new Size(0, 0);

    /* renamed from: i */
    public C9686a f22448i = new C9686a(0.0f, 0.0f);

    /* renamed from: j */
    public C9686a f22449j = new C9686a(0.0f, 0.0f);

    /* renamed from: n */
    public List f22453n = new ArrayList();

    /* renamed from: o */
    public List f22454o = new ArrayList();

    /* renamed from: p */
    public float f22455p = 0.0f;

    public C9678f(PdfiumCore pdfiumCore, C7519a c7519a, FitPolicy fitPolicy, Size size, int[] iArr, boolean z10, int i10, boolean z11, boolean z12) {
        this.f22441b = pdfiumCore;
        this.f22440a = c7519a;
        this.f22456q = fitPolicy;
        this.f22458s = iArr;
        this.f22450k = z10;
        this.f22451l = i10;
        this.f22452m = z11;
        this.f22457r = z12;
        m19106A(size);
    }

    /* renamed from: A */
    public final void m19106A(Size size) {
        int[] iArr = this.f22458s;
        if (iArr != null) {
            this.f22442c = iArr.length;
        } else {
            this.f22442c = this.f22441b.m9705d(this.f22440a);
        }
        for (int i10 = 0; i10 < this.f22442c; i10++) {
            Size sizeM9707f = this.f22441b.m9707f(this.f22440a, m19109c(i10));
            if (sizeM9707f.m9720b() > this.f22446g.m9720b()) {
                this.f22446g = sizeM9707f;
            }
            if (sizeM9707f.m9719a() > this.f22447h.m9719a()) {
                this.f22447h = sizeM9707f;
            }
            this.f22443d.add(sizeM9707f);
        }
        m19131y(size);
    }

    /* renamed from: a */
    public int m19107a(int i10) {
        int iM19122p;
        if (i10 <= 0) {
            return 0;
        }
        int[] iArr = this.f22458s;
        if (iArr != null) {
            if (i10 >= iArr.length) {
                iM19122p = iArr.length;
                return iM19122p - 1;
            }
            return i10;
        }
        if (i10 >= m19122p()) {
            iM19122p = m19122p();
            return iM19122p - 1;
        }
        return i10;
    }

    /* renamed from: b */
    public void m19108b() {
        C7519a c7519a;
        PdfiumCore pdfiumCore = this.f22441b;
        if (pdfiumCore != null && (c7519a = this.f22440a) != null) {
            pdfiumCore.m9703a(c7519a);
        }
        this.f22440a = null;
        this.f22458s = null;
    }

    /* renamed from: c */
    public int m19109c(int i10) {
        int i11;
        int[] iArr = this.f22458s;
        if (iArr == null) {
            i11 = i10;
        } else {
            if (i10 < 0 || i10 >= iArr.length) {
                return -1;
            }
            i11 = iArr[i10];
        }
        if (i11 < 0 || i10 >= m19122p()) {
            return -1;
        }
        return i11;
    }

    /* renamed from: d */
    public List m19110d() {
        C7519a c7519a = this.f22440a;
        return c7519a == null ? new ArrayList() : this.f22441b.m9708g(c7519a);
    }

    /* renamed from: e */
    public float m19111e(float f10) {
        return this.f22455p * f10;
    }

    /* renamed from: f */
    public float m19112f() {
        return m19113g().m19173a();
    }

    /* renamed from: g */
    public C9686a m19113g() {
        return this.f22450k ? this.f22449j : this.f22448i;
    }

    /* renamed from: h */
    public float m19114h() {
        return m19113g().m19174b();
    }

    /* renamed from: i */
    public C7519a.c m19115i() {
        C7519a c7519a = this.f22440a;
        if (c7519a == null) {
            return null;
        }
        return this.f22441b.m9704b(c7519a);
    }

    /* renamed from: j */
    public int m19116j(float f10, float f11) {
        int i10 = 0;
        for (int i11 = 0; i11 < m19122p() && (((Float) this.f22453n.get(i11)).floatValue() * f11) - (m19121o(i11, f11) / 2.0f) < f10; i11++) {
            i10++;
        }
        int i12 = i10 - 1;
        if (i12 >= 0) {
            return i12;
        }
        return 0;
    }

    /* renamed from: k */
    public float m19117k(int i10, float f10) {
        C9686a c9686aM19120n = m19120n(i10);
        return (this.f22450k ? c9686aM19120n.m19173a() : c9686aM19120n.m19174b()) * f10;
    }

    /* renamed from: l */
    public List m19118l(int i10) {
        return this.f22441b.m9706e(this.f22440a, m19109c(i10));
    }

    /* renamed from: m */
    public float m19119m(int i10, float f10) {
        if (m19109c(i10) < 0) {
            return 0.0f;
        }
        return ((Float) this.f22453n.get(i10)).floatValue() * f10;
    }

    /* renamed from: n */
    public C9686a m19120n(int i10) {
        return m19109c(i10) < 0 ? new C9686a(0.0f, 0.0f) : (C9686a) this.f22444e.get(i10);
    }

    /* renamed from: o */
    public float m19121o(int i10, float f10) {
        return (this.f22452m ? ((Float) this.f22454o.get(i10)).floatValue() : this.f22451l) * f10;
    }

    /* renamed from: p */
    public int m19122p() {
        return this.f22442c;
    }

    /* renamed from: q */
    public C9686a m19123q(int i10, float f10) {
        C9686a c9686aM19120n = m19120n(i10);
        return new C9686a(c9686aM19120n.m19174b() * f10, c9686aM19120n.m19173a() * f10);
    }

    /* renamed from: r */
    public float m19124r(int i10, float f10) {
        float fM19112f;
        float fM19173a;
        C9686a c9686aM19120n = m19120n(i10);
        if (this.f22450k) {
            fM19112f = m19114h();
            fM19173a = c9686aM19120n.m19174b();
        } else {
            fM19112f = m19112f();
            fM19173a = c9686aM19120n.m19173a();
        }
        return (f10 * (fM19112f - fM19173a)) / 2.0f;
    }

    /* renamed from: s */
    public RectF m19125s(int i10, int i11, int i12, int i13, int i14, RectF rectF) {
        return this.f22441b.m9710i(this.f22440a, m19109c(i10), i11, i12, i13, i14, 0, rectF);
    }

    /* renamed from: t */
    public boolean m19126t(int i10) {
        int iM19109c = m19109c(i10);
        if (iM19109c < 0) {
            return false;
        }
        synchronized (f22439t) {
            try {
                if (this.f22445f.indexOfKey(iM19109c) >= 0) {
                    return false;
                }
                try {
                    this.f22441b.m9712k(this.f22440a, iM19109c);
                    this.f22445f.put(iM19109c, true);
                    return true;
                } catch (Exception e10) {
                    this.f22445f.put(iM19109c, false);
                    throw new PageRenderingException(i10, e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public boolean m19127u(int i10) {
        return !this.f22445f.get(m19109c(i10), false);
    }

    /* renamed from: v */
    public final void m19128v(Size size) {
        float fM9720b;
        float fM19174b;
        this.f22454o.clear();
        for (int i10 = 0; i10 < m19122p(); i10++) {
            C9686a c9686a = (C9686a) this.f22444e.get(i10);
            if (this.f22450k) {
                fM9720b = size.m9719a();
                fM19174b = c9686a.m19173a();
            } else {
                fM9720b = size.m9720b();
                fM19174b = c9686a.m19174b();
            }
            float fMax = Math.max(0.0f, fM9720b - fM19174b);
            if (i10 < m19122p() - 1) {
                fMax += this.f22451l;
            }
            this.f22454o.add(Float.valueOf(fMax));
        }
    }

    /* renamed from: w */
    public final void m19129w() {
        float fFloatValue;
        float fM19173a = 0.0f;
        for (int i10 = 0; i10 < m19122p(); i10++) {
            C9686a c9686a = (C9686a) this.f22444e.get(i10);
            fM19173a += this.f22450k ? c9686a.m19173a() : c9686a.m19174b();
            if (this.f22452m) {
                fFloatValue = ((Float) this.f22454o.get(i10)).floatValue();
            } else if (i10 < m19122p() - 1) {
                fFloatValue = this.f22451l;
            }
            fM19173a += fFloatValue;
        }
        this.f22455p = fM19173a;
    }

    /* renamed from: x */
    public final void m19130x() {
        float fFloatValue;
        this.f22453n.clear();
        float fFloatValue2 = 0.0f;
        for (int i10 = 0; i10 < m19122p(); i10++) {
            C9686a c9686a = (C9686a) this.f22444e.get(i10);
            float fM19173a = this.f22450k ? c9686a.m19173a() : c9686a.m19174b();
            if (this.f22452m) {
                fFloatValue2 += ((Float) this.f22454o.get(i10)).floatValue() / 2.0f;
                if (i10 == 0) {
                    fFloatValue2 -= this.f22451l / 2.0f;
                } else if (i10 == m19122p() - 1) {
                    fFloatValue2 += this.f22451l / 2.0f;
                }
                this.f22453n.add(Float.valueOf(fFloatValue2));
                fFloatValue = ((Float) this.f22454o.get(i10)).floatValue() / 2.0f;
            } else {
                this.f22453n.add(Float.valueOf(fFloatValue2));
                fFloatValue = this.f22451l;
            }
            fFloatValue2 += fM19173a + fFloatValue;
        }
    }

    /* renamed from: y */
    public void m19131y(Size size) {
        this.f22444e.clear();
        C10629c c10629c = new C10629c(this.f22456q, this.f22446g, this.f22447h, size, this.f22457r);
        this.f22449j = c10629c.m22478g();
        this.f22448i = c10629c.m22477f();
        Iterator it = this.f22443d.iterator();
        while (it.hasNext()) {
            this.f22444e.add(c10629c.m22472a((Size) it.next()));
        }
        if (this.f22452m) {
            m19128v(size);
        }
        m19129w();
        m19130x();
    }

    /* renamed from: z */
    public void m19132z(Bitmap bitmap, int i10, Rect rect, boolean z10) {
        this.f22441b.m9714m(this.f22440a, bitmap, m19109c(i10), rect.left, rect.top, rect.width(), rect.height(), z10);
    }
}
