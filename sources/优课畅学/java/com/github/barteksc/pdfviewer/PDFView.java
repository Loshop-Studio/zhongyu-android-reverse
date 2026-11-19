package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import androidx.core.internal.view.SupportMenu;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.github.barteksc.pdfviewer.util.SnapEdge;
import com.shockwave.pdfium.C6409a;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p002a1.C0021b;
import p021b1.InterfaceC5028b;
import p032c1.C5229b;
import p032c1.InterfaceC5228a;
import p070d1.AbstractC8274a;
import p070d1.AbstractC8275b;
import p070d1.AbstractC8277d;
import p117h1.C8708a;
import p293x0.AsyncTaskC10484c;
import p293x0.C10482a;
import p293x0.C10483b;
import p293x0.C10486e;
import p293x0.C10487f;
import p293x0.GestureDetectorOnGestureListenerC10485d;
import p293x0.HandlerC10488g;
import p304y0.C10599a;
import p304y0.InterfaceC10600b;
import p315z0.C10691a;
import p315z0.InterfaceC10692b;
import p315z0.InterfaceC10694d;
import p315z0.InterfaceC10696f;
import p315z0.InterfaceC10697g;

/* loaded from: classes3.dex */
public class PDFView extends RelativeLayout {

    /* renamed from: R */
    public static final String f3693R = "PDFView";

    /* renamed from: A */
    public boolean f3694A;

    /* renamed from: B */
    public boolean f3695B;

    /* renamed from: C */
    public boolean f3696C;

    /* renamed from: D */
    public PdfiumCore f3697D;

    /* renamed from: E */
    public InterfaceC5028b f3698E;

    /* renamed from: F */
    public boolean f3699F;

    /* renamed from: G */
    public boolean f3700G;

    /* renamed from: H */
    public boolean f3701H;

    /* renamed from: I */
    public boolean f3702I;

    /* renamed from: J */
    public boolean f3703J;

    /* renamed from: K */
    public PaintFlagsDrawFilter f3704K;

    /* renamed from: L */
    public int f3705L;

    /* renamed from: M */
    public boolean f3706M;

    /* renamed from: N */
    public boolean f3707N;

    /* renamed from: O */
    public List f3708O;

    /* renamed from: P */
    public boolean f3709P;

    /* renamed from: Q */
    public C5492b f3710Q;

    /* renamed from: a */
    public float f3711a;

    /* renamed from: b */
    public float f3712b;

    /* renamed from: c */
    public float f3713c;

    /* renamed from: d */
    public ScrollDir f3714d;

    /* renamed from: e */
    public C10483b f3715e;

    /* renamed from: f */
    public C10482a f3716f;

    /* renamed from: g */
    public GestureDetectorOnGestureListenerC10485d f3717g;

    /* renamed from: h */
    public C10487f f3718h;

    /* renamed from: i */
    public int f3719i;

    /* renamed from: j */
    public float f3720j;

    /* renamed from: k */
    public float f3721k;

    /* renamed from: l */
    public float f3722l;

    /* renamed from: m */
    public boolean f3723m;

    /* renamed from: n */
    public State f3724n;

    /* renamed from: o */
    public AsyncTaskC10484c f3725o;

    /* renamed from: p */
    public HandlerThread f3726p;

    /* renamed from: q */
    public HandlerC10488g f3727q;

    /* renamed from: r */
    public C10486e f3728r;

    /* renamed from: s */
    public C10691a f3729s;

    /* renamed from: t */
    public Paint f3730t;

    /* renamed from: u */
    public Paint f3731u;

    /* renamed from: v */
    public FitPolicy f3732v;

    /* renamed from: w */
    public boolean f3733w;

    /* renamed from: x */
    public int f3734x;

    /* renamed from: y */
    public boolean f3735y;

    /* renamed from: z */
    public boolean f3736z;

    public enum ScrollDir {
        NONE,
        START,
        END
    }

    public enum State {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    /* renamed from: com.github.barteksc.pdfviewer.PDFView$b */
    public class C5492b {

        /* renamed from: a */
        public final InterfaceC5228a f3746a;

        /* renamed from: b */
        public int[] f3747b;

        /* renamed from: c */
        public boolean f3748c;

        /* renamed from: d */
        public boolean f3749d;

        /* renamed from: e */
        public InterfaceC10694d f3750e;

        /* renamed from: f */
        public InterfaceC10696f f3751f;

        /* renamed from: g */
        public InterfaceC10697g f3752g;

        /* renamed from: h */
        public InterfaceC10600b f3753h;

        /* renamed from: i */
        public int f3754i;

        /* renamed from: j */
        public boolean f3755j;

        /* renamed from: k */
        public boolean f3756k;

        /* renamed from: l */
        public String f3757l;

        /* renamed from: m */
        public InterfaceC5028b f3758m;

        /* renamed from: n */
        public boolean f3759n;

        /* renamed from: o */
        public int f3760o;

        /* renamed from: p */
        public boolean f3761p;

        /* renamed from: q */
        public FitPolicy f3762q;

        /* renamed from: r */
        public boolean f3763r;

        /* renamed from: s */
        public boolean f3764s;

        /* renamed from: t */
        public boolean f3765t;

        /* renamed from: u */
        public boolean f3766u;

        /* renamed from: a */
        public C5492b m3603a(int i10) {
            this.f3754i = i10;
            return this;
        }

        /* renamed from: b */
        public C5492b m3604b(boolean z10) {
            this.f3756k = z10;
            return this;
        }

        /* renamed from: c */
        public void m3605c() {
            if (!PDFView.this.f3709P) {
                PDFView.this.f3710Q = this;
                return;
            }
            PDFView.this.m3575T();
            PDFView.this.f3729s.m20001p(this.f3750e);
            PDFView.this.f3729s.m20000o(null);
            PDFView.this.f3729s.m19998m(null);
            PDFView.this.f3729s.m19999n(null);
            PDFView.this.f3729s.m20003r(this.f3751f);
            PDFView.this.f3729s.m20005t(null);
            PDFView.this.f3729s.m20006u(null);
            PDFView.this.f3729s.m20007v(null);
            PDFView.this.f3729s.m20002q(null);
            PDFView.this.f3729s.m20004s(this.f3752g);
            PDFView.this.f3729s.m19997l(this.f3753h);
            PDFView.this.setSwipeEnabled(this.f3748c);
            PDFView.this.setNightMode(this.f3766u);
            PDFView.this.m3594r(this.f3749d);
            PDFView.this.setDefaultPage(this.f3754i);
            PDFView.this.setSwipeVertical(!this.f3755j);
            PDFView.this.m3592p(this.f3756k);
            PDFView.this.setScrollHandle(this.f3758m);
            PDFView.this.m3593q(this.f3759n);
            PDFView.this.setSpacing(this.f3760o);
            PDFView.this.setAutoSpacing(this.f3761p);
            PDFView.this.setPageFitPolicy(this.f3762q);
            PDFView.this.setFitEachPage(this.f3763r);
            PDFView.this.setPageSnap(this.f3765t);
            PDFView.this.setPageFling(this.f3764s);
            int[] iArr = this.f3747b;
            if (iArr != null) {
                PDFView.this.m3563H(this.f3746a, this.f3757l, iArr);
            } else {
                PDFView.this.m3562G(this.f3746a, this.f3757l);
            }
        }

        /* renamed from: d */
        public C5492b m3606d(InterfaceC10694d interfaceC10694d) {
            this.f3750e = interfaceC10694d;
            return this;
        }

        /* renamed from: e */
        public C5492b m3607e(InterfaceC10696f interfaceC10696f) {
            this.f3751f = interfaceC10696f;
            return this;
        }

        /* renamed from: f */
        public C5492b m3608f(InterfaceC10697g interfaceC10697g) {
            this.f3752g = interfaceC10697g;
            return this;
        }

        /* renamed from: g */
        public C5492b m3609g(boolean z10) {
            this.f3764s = z10;
            return this;
        }

        /* renamed from: h */
        public C5492b m3610h(boolean z10) {
            this.f3765t = z10;
            return this;
        }

        /* renamed from: i */
        public C5492b m3611i(InterfaceC5028b interfaceC5028b) {
            this.f3758m = interfaceC5028b;
            return this;
        }

        /* renamed from: j */
        public C5492b m3612j(int i10) {
            this.f3760o = i10;
            return this;
        }

        public C5492b(InterfaceC5228a interfaceC5228a) {
            this.f3747b = null;
            this.f3748c = true;
            this.f3749d = true;
            this.f3753h = new C10599a(PDFView.this);
            this.f3754i = 0;
            this.f3755j = false;
            this.f3756k = false;
            this.f3757l = null;
            this.f3758m = null;
            this.f3759n = true;
            this.f3760o = 0;
            this.f3761p = false;
            this.f3762q = FitPolicy.WIDTH;
            this.f3763r = false;
            this.f3764s = false;
            this.f3765t = false;
            this.f3766u = false;
            this.f3746a = interfaceC5228a;
        }
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3711a = 1.0f;
        this.f3712b = 1.75f;
        this.f3713c = 3.0f;
        this.f3714d = ScrollDir.NONE;
        this.f3720j = 0.0f;
        this.f3721k = 0.0f;
        this.f3722l = 1.0f;
        this.f3723m = true;
        this.f3724n = State.DEFAULT;
        this.f3729s = new C10691a();
        this.f3732v = FitPolicy.WIDTH;
        this.f3733w = false;
        this.f3734x = 0;
        this.f3735y = true;
        this.f3736z = true;
        this.f3694A = true;
        this.f3695B = false;
        this.f3696C = true;
        this.f3699F = false;
        this.f3700G = false;
        this.f3701H = false;
        this.f3702I = false;
        this.f3703J = true;
        this.f3704K = new PaintFlagsDrawFilter(0, 3);
        this.f3705L = 0;
        this.f3706M = false;
        this.f3707N = true;
        this.f3708O = new ArrayList(10);
        this.f3709P = false;
        this.f3726p = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.f3715e = new C10483b();
        C10482a c10482a = new C10482a(this);
        this.f3716f = c10482a;
        this.f3717g = new GestureDetectorOnGestureListenerC10485d(this, c10482a);
        this.f3728r = new C10486e(this);
        this.f3730t = new Paint();
        Paint paint = new Paint();
        this.f3731u = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f3697D = new PdfiumCore(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z10) {
        this.f3706M = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i10) {
        this.f3734x = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z10) {
        this.f3733w = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(FitPolicy fitPolicy) {
        this.f3732v = fitPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(InterfaceC5028b interfaceC5028b) {
        this.f3698E = interfaceC5028b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i10) {
        this.f3705L = AbstractC8277d.m13429a(getContext(), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z10) {
        this.f3735y = z10;
    }

    /* renamed from: A */
    public boolean m3556A() {
        return this.f3707N;
    }

    /* renamed from: B */
    public boolean m3557B() {
        return this.f3736z;
    }

    /* renamed from: C */
    public boolean m3558C() {
        return this.f3735y;
    }

    /* renamed from: D */
    public boolean m3559D() {
        return this.f3722l != this.f3711a;
    }

    /* renamed from: E */
    public void m3560E(int i10) {
        m3561F(i10, false);
    }

    /* renamed from: F */
    public void m3561F(int i10, boolean z10) {
        C10487f c10487f = this.f3718h;
        if (c10487f == null) {
            return;
        }
        int iM19652a = c10487f.m19652a(i10);
        float f10 = iM19652a == 0 ? 0.0f : -this.f3718h.m19664m(iM19652a, this.f3722l);
        if (this.f3735y) {
            if (z10) {
                this.f3716f.m19616j(this.f3721k, f10);
            } else {
                m3569N(this.f3720j, f10);
            }
        } else if (z10) {
            this.f3716f.m19615i(this.f3720j, f10);
        } else {
            m3569N(f10, this.f3721k);
        }
        m3579X(iM19652a);
    }

    /* renamed from: G */
    public final void m3562G(InterfaceC5228a interfaceC5228a, String str) {
        m3563H(interfaceC5228a, str, null);
    }

    /* renamed from: H */
    public final void m3563H(InterfaceC5228a interfaceC5228a, String str, int[] iArr) {
        if (!this.f3723m) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        this.f3723m = false;
        AsyncTaskC10484c asyncTaskC10484c = new AsyncTaskC10484c(interfaceC5228a, str, iArr, this, this.f3697D);
        this.f3725o = asyncTaskC10484c;
        asyncTaskC10484c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: I */
    public void m3564I(C10487f c10487f) {
        this.f3724n = State.LOADED;
        this.f3718h = c10487f;
        if (!this.f3726p.isAlive()) {
            this.f3726p.start();
        }
        HandlerC10488g handlerC10488g = new HandlerC10488g(this.f3726p.getLooper(), this);
        this.f3727q = handlerC10488g;
        handlerC10488g.m19682e();
        InterfaceC5028b interfaceC5028b = this.f3698E;
        if (interfaceC5028b != null) {
            interfaceC5028b.setupLayout(this);
            this.f3699F = true;
        }
        this.f3717g.m19638d();
        this.f3729s.m19987b(c10487f.m19667p());
        m3561F(this.f3734x, false);
    }

    /* renamed from: J */
    public void m3565J(Throwable th) {
        this.f3724n = State.ERROR;
        this.f3729s.m19996k();
        m3575T();
        invalidate();
        Log.e("PDFView", "load pdf error", th);
    }

    /* renamed from: K */
    public void m3566K() {
        float f10;
        int width;
        if (this.f3718h.m19667p() == 0) {
            return;
        }
        if (this.f3735y) {
            f10 = this.f3721k;
            width = getHeight();
        } else {
            f10 = this.f3720j;
            width = getWidth();
        }
        int iM19661j = this.f3718h.m19661j(-(f10 - (width / 2.0f)), this.f3722l);
        if (iM19661j < 0 || iM19661j > this.f3718h.m19667p() - 1 || iM19661j == getCurrentPage()) {
            m3567L();
        } else {
            m3579X(iM19661j);
        }
    }

    /* renamed from: L */
    public void m3567L() {
        HandlerC10488g handlerC10488g;
        if (this.f3718h == null || (handlerC10488g = this.f3727q) == null) {
            return;
        }
        handlerC10488g.removeMessages(1);
        this.f3715e.m19628i();
        this.f3728r.m19648f();
        m3576U();
    }

    /* renamed from: M */
    public void m3568M(float f10, float f11) {
        m3569N(this.f3720j + f10, this.f3721k + f11);
    }

    /* renamed from: N */
    public void m3569N(float f10, float f11) {
        m3570O(f10, f11, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3570O(float r6, float r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.m3570O(float, float, boolean):void");
    }

    /* renamed from: P */
    public void m3571P(C0021b c0021b) {
        if (this.f3724n == State.LOADED) {
            this.f3724n = State.SHOWN;
            this.f3729s.m19992g(this.f3718h.m19667p());
        }
        if (c0021b.m49e()) {
            this.f3715e.m19623c(c0021b);
        } else {
            this.f3715e.m19622b(c0021b);
        }
        m3576U();
    }

    /* renamed from: Q */
    public void m3572Q(PageRenderingException pageRenderingException) {
        if (this.f3729s.m19990e(pageRenderingException.m3613a(), pageRenderingException.getCause())) {
            return;
        }
        Log.e(f3693R, "Cannot open page " + pageRenderingException.m3613a(), pageRenderingException.getCause());
    }

    /* renamed from: R */
    public boolean m3573R() {
        float f10 = -this.f3718h.m19664m(this.f3719i, this.f3722l);
        float fM19662k = f10 - this.f3718h.m19662k(this.f3719i, this.f3722l);
        if (m3558C()) {
            float f11 = this.f3721k;
            return f10 > f11 && fM19662k < f11 - ((float) getHeight());
        }
        float f12 = this.f3720j;
        return f10 > f12 && fM19662k < f12 - ((float) getWidth());
    }

    /* renamed from: S */
    public void m3574S() {
        C10487f c10487f;
        int iM3595s;
        SnapEdge snapEdgeM3596t;
        if (!this.f3696C || (c10487f = this.f3718h) == null || c10487f.m19667p() == 0 || (snapEdgeM3596t = m3596t((iM3595s = m3595s(this.f3720j, this.f3721k)))) == SnapEdge.NONE) {
            return;
        }
        float fM3580Y = m3580Y(iM3595s, snapEdgeM3596t);
        if (this.f3735y) {
            this.f3716f.m19616j(this.f3721k, -fM3580Y);
        } else {
            this.f3716f.m19615i(this.f3720j, -fM3580Y);
        }
    }

    /* renamed from: T */
    public void m3575T() {
        this.f3710Q = null;
        this.f3716f.m19618l();
        this.f3717g.m19637c();
        HandlerC10488g handlerC10488g = this.f3727q;
        if (handlerC10488g != null) {
            handlerC10488g.m19683f();
            this.f3727q.removeMessages(1);
        }
        AsyncTaskC10484c asyncTaskC10484c = this.f3725o;
        if (asyncTaskC10484c != null) {
            asyncTaskC10484c.cancel(true);
        }
        this.f3715e.m19629j();
        InterfaceC5028b interfaceC5028b = this.f3698E;
        if (interfaceC5028b != null && this.f3699F) {
            interfaceC5028b.mo2070b();
        }
        C10487f c10487f = this.f3718h;
        if (c10487f != null) {
            c10487f.m19653b();
            this.f3718h = null;
        }
        this.f3727q = null;
        this.f3698E = null;
        this.f3699F = false;
        this.f3721k = 0.0f;
        this.f3720j = 0.0f;
        this.f3722l = 1.0f;
        this.f3723m = true;
        this.f3729s = new C10691a();
        this.f3724n = State.DEFAULT;
    }

    /* renamed from: U */
    public void m3576U() {
        invalidate();
    }

    /* renamed from: V */
    public void m3577V() {
        m3586e0(this.f3711a);
    }

    /* renamed from: W */
    public void m3578W(float f10, boolean z10) {
        if (this.f3735y) {
            m3570O(this.f3720j, ((-this.f3718h.m19656e(this.f3722l)) + getHeight()) * f10, z10);
        } else {
            m3570O(((-this.f3718h.m19656e(this.f3722l)) + getWidth()) * f10, this.f3721k, z10);
        }
        m3566K();
    }

    /* renamed from: X */
    public void m3579X(int i10) {
        if (this.f3723m) {
            return;
        }
        this.f3719i = this.f3718h.m19652a(i10);
        m3567L();
        if (this.f3698E != null && !m3589m()) {
            this.f3698E.setPageNum(this.f3719i + 1);
        }
        this.f3729s.m19989d(this.f3719i, this.f3718h.m19667p());
    }

    /* renamed from: Y */
    public float m3580Y(int i10, SnapEdge snapEdge) {
        float f10;
        float fM19664m = this.f3718h.m19664m(i10, this.f3722l);
        float height = this.f3735y ? getHeight() : getWidth();
        float fM19662k = this.f3718h.m19662k(i10, this.f3722l);
        if (snapEdge == SnapEdge.CENTER) {
            f10 = fM19664m - (height / 2.0f);
            fM19662k /= 2.0f;
        } else {
            if (snapEdge != SnapEdge.END) {
                return fM19664m;
            }
            f10 = fM19664m - height;
        }
        return f10 + fM19662k;
    }

    /* renamed from: Z */
    public void m3581Z() {
        this.f3716f.m19619m();
    }

    /* renamed from: a0 */
    public float m3582a0(float f10) {
        return f10 * this.f3722l;
    }

    /* renamed from: b0 */
    public void m3583b0(float f10, PointF pointF) {
        m3584c0(this.f3722l * f10, pointF);
    }

    /* renamed from: c0 */
    public void m3584c0(float f10, PointF pointF) {
        float f11 = f10 / this.f3722l;
        m3585d0(f10);
        float f12 = this.f3720j * f11;
        float f13 = this.f3721k * f11;
        float f14 = pointF.x;
        float f15 = pointF.y;
        m3569N(f12 + (f14 - (f14 * f11)), f13 + (f15 - (f11 * f15)));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        C10487f c10487f = this.f3718h;
        if (c10487f == null) {
            return true;
        }
        if (this.f3735y) {
            if (i10 >= 0 || this.f3720j >= 0.0f) {
                return i10 > 0 && this.f3720j + m3582a0(c10487f.m19659h()) > ((float) getWidth());
            }
            return true;
        }
        if (i10 >= 0 || this.f3720j >= 0.0f) {
            return i10 > 0 && this.f3720j + c10487f.m19656e(this.f3722l) > ((float) getWidth());
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        C10487f c10487f = this.f3718h;
        if (c10487f == null) {
            return true;
        }
        if (this.f3735y) {
            if (i10 >= 0 || this.f3721k >= 0.0f) {
                return i10 > 0 && this.f3721k + c10487f.m19656e(this.f3722l) > ((float) getHeight());
            }
            return true;
        }
        if (i10 >= 0 || this.f3721k >= 0.0f) {
            return i10 > 0 && this.f3721k + m3582a0(c10487f.m19657f()) > ((float) getHeight());
        }
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        this.f3716f.m19610d();
    }

    /* renamed from: d0 */
    public void m3585d0(float f10) {
        this.f3722l = f10;
    }

    /* renamed from: e0 */
    public void m3586e0(float f10) {
        this.f3716f.m19617k(getWidth() / 2, getHeight() / 2, this.f3722l, f10);
    }

    /* renamed from: f0 */
    public void m3587f0(float f10, float f11, float f12) {
        this.f3716f.m19617k(f10, f11, this.f3722l, f12);
    }

    public int getCurrentPage() {
        return this.f3719i;
    }

    public float getCurrentXOffset() {
        return this.f3720j;
    }

    public float getCurrentYOffset() {
        return this.f3721k;
    }

    public C6409a.c getDocumentMeta() {
        C10487f c10487f = this.f3718h;
        if (c10487f == null) {
            return null;
        }
        return c10487f.m19660i();
    }

    public float getMaxZoom() {
        return this.f3713c;
    }

    public float getMidZoom() {
        return this.f3712b;
    }

    public float getMinZoom() {
        return this.f3711a;
    }

    public int getPageCount() {
        C10487f c10487f = this.f3718h;
        if (c10487f == null) {
            return 0;
        }
        return c10487f.m19667p();
    }

    public FitPolicy getPageFitPolicy() {
        return this.f3732v;
    }

    public float getPositionOffset() {
        float f10;
        float fM19656e;
        int width;
        if (this.f3735y) {
            f10 = -this.f3721k;
            fM19656e = this.f3718h.m19656e(this.f3722l);
            width = getHeight();
        } else {
            f10 = -this.f3720j;
            fM19656e = this.f3718h.m19656e(this.f3722l);
            width = getWidth();
        }
        return AbstractC8275b.m13419c(f10 / (fM19656e - width), 0.0f, 1.0f);
    }

    public InterfaceC5028b getScrollHandle() {
        return this.f3698E;
    }

    public int getSpacingPx() {
        return this.f3705L;
    }

    public List<C6409a.a> getTableOfContents() {
        C10487f c10487f = this.f3718h;
        return c10487f == null ? Collections.EMPTY_LIST : c10487f.m19655d();
    }

    public float getZoom() {
        return this.f3722l;
    }

    /* renamed from: l */
    public boolean m3588l() {
        return this.f3702I;
    }

    /* renamed from: m */
    public boolean m3589m() {
        float fM19656e = this.f3718h.m19656e(1.0f);
        return this.f3735y ? fM19656e < ((float) getHeight()) : fM19656e < ((float) getWidth());
    }

    /* renamed from: n */
    public final void m3590n(Canvas canvas, C0021b c0021b) {
        float fM19664m;
        float fM3582a0;
        RectF rectFM47c = c0021b.m47c();
        Bitmap bitmapM48d = c0021b.m48d();
        if (bitmapM48d.isRecycled()) {
            return;
        }
        C8708a c8708aM19665n = this.f3718h.m19665n(c0021b.m46b());
        if (this.f3735y) {
            fM3582a0 = this.f3718h.m19664m(c0021b.m46b(), this.f3722l);
            fM19664m = m3582a0(this.f3718h.m19659h() - c8708aM19665n.m14208b()) / 2.0f;
        } else {
            fM19664m = this.f3718h.m19664m(c0021b.m46b(), this.f3722l);
            fM3582a0 = m3582a0(this.f3718h.m19657f() - c8708aM19665n.m14207a()) / 2.0f;
        }
        canvas.translate(fM19664m, fM3582a0);
        Rect rect = new Rect(0, 0, bitmapM48d.getWidth(), bitmapM48d.getHeight());
        float fM3582a02 = m3582a0(rectFM47c.left * c8708aM19665n.m14208b());
        float fM3582a03 = m3582a0(rectFM47c.top * c8708aM19665n.m14207a());
        RectF rectF = new RectF((int) fM3582a02, (int) fM3582a03, (int) (fM3582a02 + m3582a0(rectFM47c.width() * c8708aM19665n.m14208b())), (int) (fM3582a03 + m3582a0(rectFM47c.height() * c8708aM19665n.m14207a())));
        float f10 = this.f3720j + fM19664m;
        float f11 = this.f3721k + fM3582a0;
        if (rectF.left + f10 >= getWidth() || f10 + rectF.right <= 0.0f || rectF.top + f11 >= getHeight() || f11 + rectF.bottom <= 0.0f) {
            canvas.translate(-fM19664m, -fM3582a0);
            return;
        }
        canvas.drawBitmap(bitmapM48d, rect, rectF, this.f3730t);
        if (AbstractC8274a.f15665a) {
            this.f3731u.setColor(c0021b.m46b() % 2 == 0 ? SupportMenu.CATEGORY_MASK : -16776961);
            canvas.drawRect(rectF, this.f3731u);
        }
        canvas.translate(-fM19664m, -fM3582a0);
    }

    /* renamed from: o */
    public final void m3591o(Canvas canvas, int i10, InterfaceC10692b interfaceC10692b) {
        float fM19664m;
        if (interfaceC10692b != null) {
            float fM19664m2 = 0.0f;
            if (this.f3735y) {
                fM19664m = this.f3718h.m19664m(i10, this.f3722l);
            } else {
                fM19664m2 = this.f3718h.m19664m(i10, this.f3722l);
                fM19664m = 0.0f;
            }
            canvas.translate(fM19664m2, fM19664m);
            C8708a c8708aM19665n = this.f3718h.m19665n(i10);
            interfaceC10692b.m20008a(canvas, m3582a0(c8708aM19665n.m14208b()), m3582a0(c8708aM19665n.m14207a()), i10);
            canvas.translate(-fM19664m2, -fM19664m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m3575T();
        HandlerThread handlerThread = this.f3726p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f3726p = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            return;
        }
        if (this.f3703J) {
            canvas.setDrawFilter(this.f3704K);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.f3695B ? -16777216 : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.f3723m && this.f3724n == State.SHOWN) {
            float f10 = this.f3720j;
            float f11 = this.f3721k;
            canvas.translate(f10, f11);
            Iterator it = this.f3715e.m19626g().iterator();
            while (it.hasNext()) {
                m3590n(canvas, (C0021b) it.next());
            }
            Iterator it2 = this.f3715e.m19625f().iterator();
            while (it2.hasNext()) {
                m3590n(canvas, (C0021b) it2.next());
                this.f3729s.m19995j();
            }
            Iterator it3 = this.f3708O.iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                this.f3729s.m19995j();
                m3591o(canvas, iIntValue, null);
            }
            this.f3708O.clear();
            int i10 = this.f3719i;
            this.f3729s.m19994i();
            m3591o(canvas, i10, null);
            canvas.translate(-f10, -f11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        float fM19656e;
        float fM19657f;
        this.f3709P = true;
        C5492b c5492b = this.f3710Q;
        if (c5492b != null) {
            c5492b.m3605c();
        }
        if (isInEditMode() || this.f3724n != State.SHOWN) {
            return;
        }
        float f10 = (-this.f3720j) + (i12 * 0.5f);
        float f11 = (-this.f3721k) + (i13 * 0.5f);
        if (this.f3735y) {
            fM19656e = f10 / this.f3718h.m19659h();
            fM19657f = this.f3718h.m19656e(this.f3722l);
        } else {
            fM19656e = f10 / this.f3718h.m19656e(this.f3722l);
            fM19657f = this.f3718h.m19657f();
        }
        float f12 = f11 / fM19657f;
        this.f3716f.m19618l();
        this.f3718h.m19676y(new Size(i10, i11));
        if (this.f3735y) {
            this.f3720j = ((-fM19656e) * this.f3718h.m19659h()) + (i10 * 0.5f);
            this.f3721k = ((-f12) * this.f3718h.m19656e(this.f3722l)) + (i11 * 0.5f);
        } else {
            this.f3720j = ((-fM19656e) * this.f3718h.m19656e(this.f3722l)) + (i10 * 0.5f);
            this.f3721k = ((-f12) * this.f3718h.m19657f()) + (i11 * 0.5f);
        }
        m3569N(this.f3720j, this.f3721k);
        m3566K();
    }

    /* renamed from: p */
    public void m3592p(boolean z10) {
        this.f3701H = z10;
    }

    /* renamed from: q */
    public void m3593q(boolean z10) {
        this.f3703J = z10;
    }

    /* renamed from: r */
    public void m3594r(boolean z10) {
        this.f3694A = z10;
    }

    /* renamed from: s */
    public int m3595s(float f10, float f11) {
        boolean z10 = this.f3735y;
        if (z10) {
            f10 = f11;
        }
        float height = z10 ? getHeight() : getWidth();
        if (f10 > -1.0f) {
            return 0;
        }
        if (f10 < (-this.f3718h.m19656e(this.f3722l)) + height + 1.0f) {
            return this.f3718h.m19667p() - 1;
        }
        return this.f3718h.m19661j(-(f10 - (height / 2.0f)), this.f3722l);
    }

    public void setMaxZoom(float f10) {
        this.f3713c = f10;
    }

    public void setMidZoom(float f10) {
        this.f3712b = f10;
    }

    public void setMinZoom(float f10) {
        this.f3711a = f10;
    }

    public void setNightMode(boolean z10) {
        this.f3695B = z10;
        if (!z10) {
            this.f3730t.setColorFilter(null);
        } else {
            this.f3730t.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        }
    }

    public void setPageFling(boolean z10) {
        this.f3707N = z10;
    }

    public void setPageSnap(boolean z10) {
        this.f3696C = z10;
    }

    public void setPositionOffset(float f10) {
        m3578W(f10, true);
    }

    public void setSwipeEnabled(boolean z10) {
        this.f3736z = z10;
    }

    /* renamed from: t */
    public SnapEdge m3596t(int i10) {
        if (!this.f3696C || i10 < 0) {
            return SnapEdge.NONE;
        }
        float f10 = this.f3735y ? this.f3721k : this.f3720j;
        float f11 = -this.f3718h.m19664m(i10, this.f3722l);
        int height = this.f3735y ? getHeight() : getWidth();
        float fM19662k = this.f3718h.m19662k(i10, this.f3722l);
        float f12 = height;
        return f12 >= fM19662k ? SnapEdge.CENTER : f10 >= f11 ? SnapEdge.START : f11 - fM19662k > f10 - f12 ? SnapEdge.END : SnapEdge.NONE;
    }

    /* renamed from: u */
    public C5492b m3597u(File file) {
        return new C5492b(new C5229b(file));
    }

    /* renamed from: v */
    public boolean m3598v() {
        return this.f3701H;
    }

    /* renamed from: w */
    public boolean m3599w() {
        return this.f3706M;
    }

    /* renamed from: x */
    public boolean m3600x() {
        return this.f3700G;
    }

    /* renamed from: y */
    public boolean m3601y() {
        return this.f3694A;
    }

    /* renamed from: z */
    public boolean m3602z() {
        return this.f3733w;
    }
}
