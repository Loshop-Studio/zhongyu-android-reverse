package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import android.util.Pair;
import com.github.barteksc.pdfviewer.PDFView;
import p105m1.AbstractC7375b;
import p105m1.AbstractC7376c;

/* renamed from: com.github.barteksc.pdfviewer.a */
/* loaded from: classes3.dex */
public class C4849a {

    /* renamed from: a */
    public PDFView f3360a;

    /* renamed from: b */
    public int f3361b;

    /* renamed from: c */
    public float f3362c;

    /* renamed from: d */
    public float f3363d;

    /* renamed from: e */
    public Pair f3364e;

    /* renamed from: f */
    public float f3365f;

    /* renamed from: g */
    public float f3366g;

    /* renamed from: h */
    public float f3367h;

    /* renamed from: i */
    public float f3368i;

    /* renamed from: j */
    public float f3369j;

    /* renamed from: k */
    public float f3370k;

    /* renamed from: l */
    public float f3371l;

    /* renamed from: m */
    public float f3372m;

    /* renamed from: n */
    public int f3373n;

    /* renamed from: o */
    public int f3374o;

    /* renamed from: p */
    public float f3375p;

    /* renamed from: q */
    public final RectF f3376q = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: com.github.barteksc.pdfviewer.a$b */
    public class b {

        /* renamed from: a */
        public int f3377a;

        /* renamed from: b */
        public int f3378b;

        /* renamed from: c */
        public int f3379c;

        public b() {
        }
    }

    public C4849a(PDFView pDFView) {
        this.f3360a = pDFView;
    }

    /* renamed from: a */
    public final int m3423a(int i6) {
        int i7;
        if (this.f3360a.getOriginalUserPages() == null) {
            i7 = i6;
        } else {
            if (i6 < 0 || i6 >= this.f3360a.getOriginalUserPages().length) {
                return -1;
            }
            i7 = this.f3360a.getOriginalUserPages()[i6];
        }
        if (i7 < 0 || i6 >= this.f3360a.getDocumentPageCount()) {
            return -1;
        }
        return i7;
    }

    /* renamed from: b */
    public final b m3424b(float f6, boolean z6) {
        float fAbs;
        float fAbs2;
        b bVar = new b();
        float f7 = -AbstractC7376c.m8408d(f6, 0.0f);
        if (this.f3360a.m3371D()) {
            int iM8406b = AbstractC7376c.m8406b(f7 / (this.f3362c + this.f3375p));
            bVar.f3377a = iM8406b;
            fAbs2 = Math.abs(f7 - ((this.f3362c + this.f3375p) * iM8406b)) / this.f3367h;
            fAbs = this.f3365f / this.f3368i;
        } else {
            int iM8406b2 = AbstractC7376c.m8406b(f7 / (this.f3363d + this.f3375p));
            bVar.f3377a = iM8406b2;
            fAbs = Math.abs(f7 - ((this.f3363d + this.f3375p) * iM8406b2)) / this.f3368i;
            fAbs2 = this.f3366g / this.f3367h;
        }
        if (z6) {
            bVar.f3378b = AbstractC7376c.m8405a(fAbs2);
            bVar.f3379c = AbstractC7376c.m8405a(fAbs);
            return bVar;
        }
        bVar.f3378b = AbstractC7376c.m8406b(fAbs2);
        bVar.f3379c = AbstractC7376c.m8406b(fAbs);
        return bVar;
    }

    /* renamed from: c */
    public final Pair m3425c() {
        float optimalPageWidth = 1.0f / this.f3360a.getOptimalPageWidth();
        float optimalPageHeight = (AbstractC7375b.f9388c * (1.0f / this.f3360a.getOptimalPageHeight())) / this.f3360a.getZoom();
        return new Pair(Integer.valueOf(AbstractC7376c.m8405a(1.0f / ((AbstractC7375b.f9388c * optimalPageWidth) / this.f3360a.getZoom()))), Integer.valueOf(AbstractC7376c.m8405a(1.0f / optimalPageHeight)));
    }

    /* renamed from: d */
    public final boolean m3426d(int i6, int i7, int i8, int i9, float f6, float f7) {
        float f8 = i9 * f6;
        float f9 = i8 * f7;
        float f10 = this.f3371l;
        float f11 = this.f3372m;
        float f12 = f8 + f6 > 1.0f ? 1.0f - f8 : f6;
        float f13 = f9 + f7 > 1.0f ? 1.0f - f9 : f7;
        float f14 = f10 * f12;
        float f15 = f11 * f13;
        RectF rectF = new RectF(f8, f9, f12 + f8, f13 + f9);
        if (f14 <= 0.0f || f15 <= 0.0f) {
            return false;
        }
        if (!this.f3360a.f3311e.m7075j(i6, i7, f14, f15, rectF, this.f3361b)) {
            PDFView pDFView = this.f3360a;
            pDFView.f3331y.m7086b(i6, i7, f14, f15, rectF, false, this.f3361b, pDFView.m3370C(), this.f3360a.m3369B());
        }
        this.f3361b++;
        return true;
    }

    /* renamed from: e */
    public void m3427e() {
        PDFView pDFView = this.f3360a;
        this.f3362c = pDFView.m3391X(pDFView.getOptimalPageHeight());
        PDFView pDFView2 = this.f3360a;
        this.f3363d = pDFView2.m3391X(pDFView2.getOptimalPageWidth());
        this.f3373n = (int) (this.f3360a.getOptimalPageWidth() * AbstractC7375b.f9387b);
        this.f3374o = (int) (this.f3360a.getOptimalPageHeight() * AbstractC7375b.f9387b);
        this.f3364e = m3425c();
        this.f3365f = -AbstractC7376c.m8408d(this.f3360a.getCurrentXOffset(), 0.0f);
        this.f3366g = -AbstractC7376c.m8408d(this.f3360a.getCurrentYOffset(), 0.0f);
        this.f3367h = this.f3362c / ((Integer) this.f3364e.second).intValue();
        this.f3368i = this.f3363d / ((Integer) this.f3364e.first).intValue();
        this.f3369j = 1.0f / ((Integer) this.f3364e.first).intValue();
        float fIntValue = 1.0f / ((Integer) this.f3364e.second).intValue();
        this.f3370k = fIntValue;
        float f6 = AbstractC7375b.f9388c;
        this.f3371l = f6 / this.f3369j;
        this.f3372m = f6 / fIntValue;
        this.f3361b = 1;
        float fM3391X = this.f3360a.m3391X(r1.getSpacingPx());
        this.f3375p = fM3391X;
        this.f3375p = fM3391X - (fM3391X / this.f3360a.getPageCount());
        int iM3430h = m3430h();
        if (this.f3360a.getScrollDir().equals(PDFView.ScrollDir.END)) {
            for (int i6 = 0; i6 < AbstractC7375b.f9389d && iM3430h < AbstractC7375b.a.f9390a; i6++) {
                iM3430h += m3428f(i6, iM3430h, true);
            }
            return;
        }
        for (int i7 = 0; i7 > (-AbstractC7375b.f9389d) && iM3430h < AbstractC7375b.a.f9390a; i7--) {
            iM3430h += m3428f(i7, iM3430h, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[PHI: r0 r10
      0x001f: PHI (r0v4 float) = (r0v3 float), (r0v22 float) binds: [B:10:0x002e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r10v4 float) = (r10v3 float), (r10v12 float) binds: [B:10:0x002e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m3428f(int r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.C4849a.m3428f(int, int, boolean):int");
    }

    /* renamed from: g */
    public final void m3429g(int i6, int i7) {
        if (this.f3360a.f3311e.m7069c(i6, i7, this.f3373n, this.f3374o, this.f3376q)) {
            return;
        }
        PDFView pDFView = this.f3360a;
        pDFView.f3331y.m7086b(i6, i7, this.f3373n, this.f3374o, this.f3376q, true, 0, pDFView.m3370C(), this.f3360a.m3369B());
    }

    /* renamed from: h */
    public int m3430h() {
        b bVarM3424b;
        int i6;
        int iM3428f;
        int i7;
        if (!this.f3360a.m3371D()) {
            bVarM3424b = m3424b(this.f3360a.getCurrentXOffset(), false);
            b bVarM3424b2 = m3424b((this.f3360a.getCurrentXOffset() - this.f3360a.getWidth()) + 1.0f, true);
            if (bVarM3424b.f3377a == bVarM3424b2.f3377a) {
                i6 = (bVarM3424b2.f3379c - bVarM3424b.f3379c) + 1;
            } else {
                int iIntValue = ((Integer) this.f3364e.first).intValue() - bVarM3424b.f3379c;
                for (int i8 = bVarM3424b.f3377a + 1; i8 < bVarM3424b2.f3377a; i8++) {
                    iIntValue += ((Integer) this.f3364e.first).intValue();
                }
                i6 = bVarM3424b2.f3379c + 1 + iIntValue;
            }
            iM3428f = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = AbstractC7375b.a.f9390a;
                if (iM3428f >= i10) {
                    break;
                }
                iM3428f += m3428f(i9, i10 - iM3428f, false);
            }
        } else {
            bVarM3424b = m3424b(this.f3360a.getCurrentYOffset(), false);
            b bVarM3424b3 = m3424b((this.f3360a.getCurrentYOffset() - this.f3360a.getHeight()) + 1.0f, true);
            if (bVarM3424b.f3377a == bVarM3424b3.f3377a) {
                i7 = (bVarM3424b3.f3378b - bVarM3424b.f3378b) + 1;
            } else {
                int iIntValue2 = ((Integer) this.f3364e.second).intValue() - bVarM3424b.f3378b;
                for (int i11 = bVarM3424b.f3377a + 1; i11 < bVarM3424b3.f3377a; i11++) {
                    iIntValue2 += ((Integer) this.f3364e.second).intValue();
                }
                i7 = bVarM3424b3.f3378b + 1 + iIntValue2;
            }
            iM3428f = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                int i13 = AbstractC7375b.a.f9390a;
                if (iM3428f >= i13) {
                    break;
                }
                iM3428f += m3428f(i12, i13 - iM3428f, false);
            }
        }
        int iM3423a = m3423a(bVarM3424b.f3377a - 1);
        if (iM3423a >= 0) {
            m3429g(bVarM3424b.f3377a - 1, iM3423a);
        }
        int iM3423a2 = m3423a(bVarM3424b.f3377a + 1);
        if (iM3423a2 >= 0) {
            m3429g(bVarM3424b.f3377a + 1, iM3423a2);
        }
        return iM3428f;
    }
}
