package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import android.util.Pair;
import com.github.barteksc.pdfviewer.PDFView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p145r1.C3027b;
import p145r1.C3028c;

/* renamed from: com.github.barteksc.pdfviewer.e */
/* loaded from: classes.dex */
class C1369e {

    /* renamed from: a */
    private PDFView f7332a;

    /* renamed from: b */
    private int f7333b;

    /* renamed from: c */
    private float f7334c;

    /* renamed from: d */
    private float f7335d;

    /* renamed from: e */
    private Pair<Integer, Integer> f7336e;

    /* renamed from: f */
    private float f7337f;

    /* renamed from: g */
    private float f7338g;

    /* renamed from: h */
    private float f7339h;

    /* renamed from: i */
    private float f7340i;

    /* renamed from: j */
    private float f7341j;

    /* renamed from: k */
    private float f7342k;

    /* renamed from: l */
    private float f7343l;

    /* renamed from: m */
    private float f7344m;

    /* renamed from: n */
    private int f7345n;

    /* renamed from: o */
    private int f7346o;

    /* renamed from: p */
    private float f7347p;

    /* renamed from: q */
    private final RectF f7348q = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 1.0f, 1.0f);

    /* renamed from: com.github.barteksc.pdfviewer.e$b */
    private class b {

        /* renamed from: a */
        int f7349a;

        /* renamed from: b */
        int f7350b;

        /* renamed from: c */
        int f7351c;

        private b() {
        }
    }

    C1369e(PDFView pDFView) {
        this.f7332a = pDFView;
    }

    /* renamed from: a */
    private int m5705a(int i4) {
        int i5;
        if (this.f7332a.getOriginalUserPages() == null) {
            i5 = i4;
        } else {
            if (i4 < 0 || i4 >= this.f7332a.getOriginalUserPages().length) {
                return -1;
            }
            i5 = this.f7332a.getOriginalUserPages()[i4];
        }
        if (i5 < 0 || i4 >= this.f7332a.getDocumentPageCount()) {
            return -1;
        }
        return i5;
    }

    /* renamed from: b */
    private b m5706b(float f4, boolean z3) {
        float fAbs;
        float fAbs2;
        b bVar = new b();
        float f5 = -C3028c.m10165d(f4, IGoodView.DEFAULT_TO_ALPHA);
        if (this.f7332a.m5630E()) {
            int iM10163b = C3028c.m10163b(f5 / (this.f7334c + this.f7347p));
            bVar.f7349a = iM10163b;
            fAbs2 = Math.abs(f5 - ((this.f7334c + this.f7347p) * iM10163b)) / this.f7339h;
            fAbs = this.f7337f / this.f7340i;
        } else {
            int iM10163b2 = C3028c.m10163b(f5 / (this.f7335d + this.f7347p));
            bVar.f7349a = iM10163b2;
            fAbs = Math.abs(f5 - ((this.f7335d + this.f7347p) * iM10163b2)) / this.f7340i;
            fAbs2 = this.f7338g / this.f7339h;
        }
        if (z3) {
            bVar.f7350b = C3028c.m10162a(fAbs2);
            bVar.f7351c = C3028c.m10162a(fAbs);
        } else {
            bVar.f7350b = C3028c.m10163b(fAbs2);
            bVar.f7351c = C3028c.m10163b(fAbs);
        }
        return bVar;
    }

    /* renamed from: c */
    private Pair<Integer, Integer> m5707c() {
        float optimalPageWidth = 1.0f / this.f7332a.getOptimalPageWidth();
        float optimalPageHeight = (C3027b.f11732c * (1.0f / this.f7332a.getOptimalPageHeight())) / this.f7332a.getZoom();
        return new Pair<>(Integer.valueOf(C3028c.m10162a(1.0f / ((C3027b.f11732c * optimalPageWidth) / this.f7332a.getZoom()))), Integer.valueOf(C3028c.m10162a(1.0f / optimalPageHeight)));
    }

    /* renamed from: d */
    private boolean m5708d(int i4, int i5, int i6, int i7, float f4, float f5) {
        float f6 = i7 * f4;
        float f7 = i6 * f5;
        float f8 = this.f7343l;
        float f9 = this.f7344m;
        float f10 = f6 + f4 > 1.0f ? 1.0f - f6 : f4;
        float f11 = f7 + f5 > 1.0f ? 1.0f - f7 : f5;
        float f12 = f8 * f10;
        float f13 = f9 * f11;
        RectF rectF = new RectF(f6, f7, f10 + f6, f11 + f7);
        if (f12 <= IGoodView.DEFAULT_TO_ALPHA || f13 <= IGoodView.DEFAULT_TO_ALPHA) {
            return false;
        }
        if (!this.f7332a.f7243e.m5695j(i4, i5, f12, f13, rectF, this.f7333b)) {
            PDFView pDFView = this.f7332a;
            pDFView.f7265y.m5716b(i4, i5, f12, f13, rectF, false, this.f7333b, pDFView.m5629D(), this.f7332a.m5628C());
        }
        this.f7333b++;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[PHI: r0 r11
      0x0034: PHI (r0v4 float) = (r0v3 float), (r0v25 float) binds: [B:8:0x002b, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r11v4 float) = (r11v3 float), (r11v12 float) binds: [B:8:0x002b, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m5709f(int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.C1369e.m5709f(int, int, boolean):int");
    }

    /* renamed from: g */
    private void m5710g(int i4, int i5) {
        if (this.f7332a.f7243e.m5690c(i4, i5, this.f7345n, this.f7346o, this.f7348q)) {
            return;
        }
        PDFView pDFView = this.f7332a;
        pDFView.f7265y.m5716b(i4, i5, this.f7345n, this.f7346o, this.f7348q, true, 0, pDFView.m5629D(), this.f7332a.m5628C());
    }

    /* renamed from: e */
    public void m5711e() {
        PDFView pDFView = this.f7332a;
        this.f7334c = pDFView.m5648Y(pDFView.getOptimalPageHeight());
        PDFView pDFView2 = this.f7332a;
        this.f7335d = pDFView2.m5648Y(pDFView2.getOptimalPageWidth());
        this.f7345n = (int) (this.f7332a.getOptimalPageWidth() * C3027b.f11731b);
        this.f7346o = (int) (this.f7332a.getOptimalPageHeight() * C3027b.f11731b);
        this.f7336e = m5707c();
        this.f7337f = -C3028c.m10165d(this.f7332a.getCurrentXOffset(), IGoodView.DEFAULT_TO_ALPHA);
        this.f7338g = -C3028c.m10165d(this.f7332a.getCurrentYOffset(), IGoodView.DEFAULT_TO_ALPHA);
        this.f7339h = this.f7334c / ((Integer) this.f7336e.second).intValue();
        this.f7340i = this.f7335d / ((Integer) this.f7336e.first).intValue();
        this.f7341j = 1.0f / ((Integer) this.f7336e.first).intValue();
        float fIntValue = 1.0f / ((Integer) this.f7336e.second).intValue();
        this.f7342k = fIntValue;
        float f4 = C3027b.f11732c;
        this.f7343l = f4 / this.f7341j;
        this.f7344m = f4 / fIntValue;
        this.f7333b = 1;
        float fM5648Y = this.f7332a.m5648Y(r1.getSpacingPx());
        this.f7347p = fM5648Y;
        this.f7347p = fM5648Y - (fM5648Y / this.f7332a.getPageCount());
        int iM5712h = m5712h();
        if (this.f7332a.getScrollDir().equals(PDFView.EnumC1363c.END)) {
            for (int i4 = 0; i4 < C3027b.f11733d && iM5712h < C3027b.a.f11734a; i4++) {
                iM5712h += m5709f(i4, iM5712h, true);
            }
            return;
        }
        for (int i5 = 0; i5 > (-C3027b.f11733d) && iM5712h < C3027b.a.f11734a; i5--) {
            iM5712h += m5709f(i5, iM5712h, false);
        }
    }

    /* renamed from: h */
    public int m5712h() {
        b bVarM5706b;
        int i4;
        int iM5709f;
        int i5;
        if (!this.f7332a.m5630E()) {
            bVarM5706b = m5706b(this.f7332a.getCurrentXOffset(), false);
            b bVarM5706b2 = m5706b((this.f7332a.getCurrentXOffset() - this.f7332a.getWidth()) + 1.0f, true);
            if (bVarM5706b.f7349a == bVarM5706b2.f7349a) {
                i4 = (bVarM5706b2.f7351c - bVarM5706b.f7351c) + 1;
            } else {
                int iIntValue = (((Integer) this.f7336e.first).intValue() - bVarM5706b.f7351c) + 0;
                for (int i6 = bVarM5706b.f7349a + 1; i6 < bVarM5706b2.f7349a; i6++) {
                    iIntValue += ((Integer) this.f7336e.first).intValue();
                }
                i4 = bVarM5706b2.f7351c + 1 + iIntValue;
            }
            iM5709f = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = C3027b.a.f11734a;
                if (iM5709f >= i8) {
                    break;
                }
                iM5709f += m5709f(i7, i8 - iM5709f, false);
            }
        } else {
            bVarM5706b = m5706b(this.f7332a.getCurrentYOffset(), false);
            b bVarM5706b3 = m5706b((this.f7332a.getCurrentYOffset() - this.f7332a.getHeight()) + 1.0f, true);
            if (bVarM5706b.f7349a == bVarM5706b3.f7349a) {
                i5 = (bVarM5706b3.f7350b - bVarM5706b.f7350b) + 1;
            } else {
                int iIntValue2 = (((Integer) this.f7336e.second).intValue() - bVarM5706b.f7350b) + 0;
                for (int i9 = bVarM5706b.f7349a + 1; i9 < bVarM5706b3.f7349a; i9++) {
                    iIntValue2 += ((Integer) this.f7336e.second).intValue();
                }
                i5 = bVarM5706b3.f7350b + 1 + iIntValue2;
            }
            iM5709f = 0;
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = C3027b.a.f11734a;
                if (iM5709f >= i11) {
                    break;
                }
                iM5709f += m5709f(i10, i11 - iM5709f, false);
            }
        }
        int iM5705a = m5705a(bVarM5706b.f7349a - 1);
        if (iM5705a >= 0) {
            m5710g(bVarM5706b.f7349a - 1, iM5705a);
        }
        int iM5705a2 = m5705a(bVarM5706b.f7349a + 1);
        if (iM5705a2 >= 0) {
            m5710g(bVarM5706b.f7349a + 1, iM5705a2);
        }
        return iM5709f;
    }
}
