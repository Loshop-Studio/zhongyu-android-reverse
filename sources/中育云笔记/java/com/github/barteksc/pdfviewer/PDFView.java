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
import androidx.core.view.ViewCompat;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.github.barteksc.pdfviewer.util.SnapEdge;
import com.shockwave.pdfium.C7519a;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p202j4.AsyncTaskC9675c;
import p202j4.C9673a;
import p202j4.C9674b;
import p202j4.C9677e;
import p202j4.C9678f;
import p202j4.GestureDetectorOnGestureListenerC9676d;
import p202j4.HandlerC9679g;
import p205j7.C9686a;
import p217k4.C9809a;
import p217k4.InterfaceC9810b;
import p233l4.C10136a;
import p233l4.InterfaceC10137b;
import p233l4.InterfaceC10139d;
import p233l4.InterfaceC10141f;
import p233l4.InterfaceC10142g;
import p246m4.C10199b;
import p258n4.InterfaceC10316a;
import p271o4.C10443b;
import p271o4.InterfaceC10442a;
import p288p4.AbstractC10627a;
import p288p4.AbstractC10628b;
import p288p4.AbstractC10630d;

/* loaded from: classes5.dex */
public class PDFView extends RelativeLayout {

    /* renamed from: T */
    public static final String f10774T = "PDFView";

    /* renamed from: A */
    public boolean f10775A;

    /* renamed from: B */
    public boolean f10776B;

    /* renamed from: C */
    public boolean f10777C;

    /* renamed from: D */
    public boolean f10778D;

    /* renamed from: E */
    public boolean f10779E;

    /* renamed from: F */
    public PdfiumCore f10780F;

    /* renamed from: G */
    public InterfaceC10316a f10781G;

    /* renamed from: H */
    public boolean f10782H;

    /* renamed from: I */
    public boolean f10783I;

    /* renamed from: J */
    public boolean f10784J;

    /* renamed from: K */
    public boolean f10785K;

    /* renamed from: L */
    public boolean f10786L;

    /* renamed from: M */
    public PaintFlagsDrawFilter f10787M;

    /* renamed from: N */
    public int f10788N;

    /* renamed from: O */
    public boolean f10789O;

    /* renamed from: P */
    public boolean f10790P;

    /* renamed from: Q */
    public List f10791Q;

    /* renamed from: R */
    public boolean f10792R;

    /* renamed from: S */
    public C6337b f10793S;

    /* renamed from: c */
    public float f10794c;

    /* renamed from: d */
    public float f10795d;

    /* renamed from: e */
    public float f10796e;

    /* renamed from: f */
    public ScrollDir f10797f;

    /* renamed from: g */
    public C9674b f10798g;

    /* renamed from: h */
    public C9673a f10799h;

    /* renamed from: i */
    public GestureDetectorOnGestureListenerC9676d f10800i;

    /* renamed from: j */
    public C9678f f10801j;

    /* renamed from: k */
    public int f10802k;

    /* renamed from: l */
    public float f10803l;

    /* renamed from: m */
    public float f10804m;

    /* renamed from: n */
    public float f10805n;

    /* renamed from: o */
    public boolean f10806o;

    /* renamed from: p */
    public State f10807p;

    /* renamed from: q */
    public AsyncTaskC9675c f10808q;

    /* renamed from: r */
    public HandlerThread f10809r;

    /* renamed from: s */
    public HandlerC9679g f10810s;

    /* renamed from: t */
    public C9677e f10811t;

    /* renamed from: u */
    public C10136a f10812u;

    /* renamed from: v */
    public Paint f10813v;

    /* renamed from: w */
    public Paint f10814w;

    /* renamed from: x */
    public FitPolicy f10815x;

    /* renamed from: y */
    public boolean f10816y;

    /* renamed from: z */
    public int f10817z;

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
    public class C6337b {

        /* renamed from: a */
        public final InterfaceC10442a f10827a;

        /* renamed from: b */
        public int[] f10828b;

        /* renamed from: c */
        public boolean f10829c;

        /* renamed from: d */
        public boolean f10830d;

        /* renamed from: e */
        public InterfaceC10139d f10831e;

        /* renamed from: f */
        public InterfaceC10141f f10832f;

        /* renamed from: g */
        public InterfaceC10142g f10833g;

        /* renamed from: h */
        public InterfaceC9810b f10834h;

        /* renamed from: i */
        public int f10835i;

        /* renamed from: j */
        public boolean f10836j;

        /* renamed from: k */
        public boolean f10837k;

        /* renamed from: l */
        public String f10838l;

        /* renamed from: m */
        public InterfaceC10316a f10839m;

        /* renamed from: n */
        public boolean f10840n;

        /* renamed from: o */
        public int f10841o;

        /* renamed from: p */
        public boolean f10842p;

        /* renamed from: q */
        public FitPolicy f10843q;

        /* renamed from: r */
        public boolean f10844r;

        /* renamed from: s */
        public boolean f10845s;

        /* renamed from: t */
        public boolean f10846t;

        /* renamed from: u */
        public boolean f10847u;

        /* renamed from: a */
        public C6337b m7894a(int i10) {
            this.f10835i = i10;
            return this;
        }

        /* renamed from: b */
        public C6337b m7895b(boolean z10) {
            this.f10837k = z10;
            return this;
        }

        /* renamed from: c */
        public void m7896c() {
            if (!PDFView.this.f10792R) {
                PDFView.this.f10793S = this;
                return;
            }
            PDFView.this.m7866T();
            PDFView.this.f10812u.m21154p(this.f10831e);
            PDFView.this.f10812u.m21153o(null);
            PDFView.this.f10812u.m21151m(null);
            PDFView.this.f10812u.m21152n(null);
            PDFView.this.f10812u.m21156r(this.f10832f);
            PDFView.this.f10812u.m21158t(null);
            PDFView.this.f10812u.m21159u(null);
            PDFView.this.f10812u.m21160v(null);
            PDFView.this.f10812u.m21155q(null);
            PDFView.this.f10812u.m21157s(this.f10833g);
            PDFView.this.f10812u.m21150l(this.f10834h);
            PDFView.this.setSwipeEnabled(this.f10829c);
            PDFView.this.setNightMode(this.f10847u);
            PDFView.this.m7885r(this.f10830d);
            PDFView.this.setDefaultPage(this.f10835i);
            PDFView.this.setSwipeVertical(!this.f10836j);
            PDFView.this.m7883p(this.f10837k);
            PDFView.this.setScrollHandle(this.f10839m);
            PDFView.this.m7884q(this.f10840n);
            PDFView.this.setSpacing(this.f10841o);
            PDFView.this.setAutoSpacing(this.f10842p);
            PDFView.this.setPageFitPolicy(this.f10843q);
            PDFView.this.setFitEachPage(this.f10844r);
            PDFView.this.setPageSnap(this.f10846t);
            PDFView.this.setPageFling(this.f10845s);
            int[] iArr = this.f10828b;
            if (iArr != null) {
                PDFView.this.m7854H(this.f10827a, this.f10838l, iArr);
            } else {
                PDFView.this.m7853G(this.f10827a, this.f10838l);
            }
        }

        /* renamed from: d */
        public C6337b m7897d(InterfaceC10139d interfaceC10139d) {
            this.f10831e = interfaceC10139d;
            return this;
        }

        /* renamed from: e */
        public C6337b m7898e(InterfaceC10141f interfaceC10141f) {
            this.f10832f = interfaceC10141f;
            return this;
        }

        /* renamed from: f */
        public C6337b m7899f(InterfaceC10142g interfaceC10142g) {
            this.f10833g = interfaceC10142g;
            return this;
        }

        /* renamed from: g */
        public C6337b m7900g(boolean z10) {
            this.f10845s = z10;
            return this;
        }

        /* renamed from: h */
        public C6337b m7901h(boolean z10) {
            this.f10846t = z10;
            return this;
        }

        /* renamed from: i */
        public C6337b m7902i(InterfaceC10316a interfaceC10316a) {
            this.f10839m = interfaceC10316a;
            return this;
        }

        /* renamed from: j */
        public C6337b m7903j(int i10) {
            this.f10841o = i10;
            return this;
        }

        public C6337b(InterfaceC10442a interfaceC10442a) {
            this.f10828b = null;
            this.f10829c = true;
            this.f10830d = true;
            this.f10834h = new C9809a(PDFView.this);
            this.f10835i = 0;
            this.f10836j = false;
            this.f10837k = false;
            this.f10838l = null;
            this.f10839m = null;
            this.f10840n = true;
            this.f10841o = 0;
            this.f10842p = false;
            this.f10843q = FitPolicy.WIDTH;
            this.f10844r = false;
            this.f10845s = false;
            this.f10846t = false;
            this.f10847u = false;
            this.f10827a = interfaceC10442a;
        }
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10794c = 1.0f;
        this.f10795d = 1.75f;
        this.f10796e = 3.0f;
        this.f10797f = ScrollDir.NONE;
        this.f10803l = 0.0f;
        this.f10804m = 0.0f;
        this.f10805n = 1.0f;
        this.f10806o = true;
        this.f10807p = State.DEFAULT;
        this.f10812u = new C10136a();
        this.f10815x = FitPolicy.WIDTH;
        this.f10816y = false;
        this.f10817z = 0;
        this.f10775A = true;
        this.f10776B = true;
        this.f10777C = true;
        this.f10778D = false;
        this.f10779E = true;
        this.f10782H = false;
        this.f10783I = false;
        this.f10784J = false;
        this.f10785K = false;
        this.f10786L = true;
        this.f10787M = new PaintFlagsDrawFilter(0, 3);
        this.f10788N = 0;
        this.f10789O = false;
        this.f10790P = true;
        this.f10791Q = new ArrayList(10);
        this.f10792R = false;
        this.f10809r = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.f10798g = new C9674b();
        C9673a c9673a = new C9673a(this);
        this.f10799h = c9673a;
        this.f10800i = new GestureDetectorOnGestureListenerC9676d(this, c9673a);
        this.f10811t = new C9677e(this);
        this.f10813v = new Paint();
        Paint paint = new Paint();
        this.f10814w = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f10780F = new PdfiumCore(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z10) {
        this.f10789O = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i10) {
        this.f10817z = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z10) {
        this.f10816y = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(FitPolicy fitPolicy) {
        this.f10815x = fitPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(InterfaceC10316a interfaceC10316a) {
        this.f10781G = interfaceC10316a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i10) {
        this.f10788N = AbstractC10630d.m22479a(getContext(), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z10) {
        this.f10775A = z10;
    }

    /* renamed from: A */
    public boolean m7847A() {
        return this.f10790P;
    }

    /* renamed from: B */
    public boolean m7848B() {
        return this.f10776B;
    }

    /* renamed from: C */
    public boolean m7849C() {
        return this.f10775A;
    }

    /* renamed from: D */
    public boolean m7850D() {
        return this.f10805n != this.f10794c;
    }

    /* renamed from: E */
    public void m7851E(int i10) {
        m7852F(i10, false);
    }

    /* renamed from: F */
    public void m7852F(int i10, boolean z10) {
        C9678f c9678f = this.f10801j;
        if (c9678f == null) {
            return;
        }
        int iM19107a = c9678f.m19107a(i10);
        float f10 = iM19107a == 0 ? 0.0f : -this.f10801j.m19119m(iM19107a, this.f10805n);
        if (this.f10775A) {
            if (z10) {
                this.f10799h.m19071j(this.f10804m, f10);
            } else {
                m7860N(this.f10803l, f10);
            }
        } else if (z10) {
            this.f10799h.m19070i(this.f10803l, f10);
        } else {
            m7860N(f10, this.f10804m);
        }
        m7870X(iM19107a);
    }

    /* renamed from: G */
    public final void m7853G(InterfaceC10442a interfaceC10442a, String str) {
        m7854H(interfaceC10442a, str, null);
    }

    /* renamed from: H */
    public final void m7854H(InterfaceC10442a interfaceC10442a, String str, int[] iArr) {
        if (!this.f10806o) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        this.f10806o = false;
        AsyncTaskC9675c asyncTaskC9675c = new AsyncTaskC9675c(interfaceC10442a, str, iArr, this, this.f10780F);
        this.f10808q = asyncTaskC9675c;
        asyncTaskC9675c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: I */
    public void m7855I(C9678f c9678f) {
        this.f10807p = State.LOADED;
        this.f10801j = c9678f;
        if (!this.f10809r.isAlive()) {
            this.f10809r.start();
        }
        HandlerC9679g handlerC9679g = new HandlerC9679g(this.f10809r.getLooper(), this);
        this.f10810s = handlerC9679g;
        handlerC9679g.m19137e();
        InterfaceC10316a interfaceC10316a = this.f10781G;
        if (interfaceC10316a != null) {
            interfaceC10316a.setupLayout(this);
            this.f10782H = true;
        }
        this.f10800i.m19093d();
        this.f10812u.m21140b(c9678f.m19122p());
        m7852F(this.f10817z, false);
    }

    /* renamed from: J */
    public void m7856J(Throwable th) {
        this.f10807p = State.ERROR;
        this.f10812u.m21149k();
        m7866T();
        invalidate();
        Log.e("PDFView", "load pdf error", th);
    }

    /* renamed from: K */
    public void m7857K() {
        float f10;
        int width;
        if (this.f10801j.m19122p() == 0) {
            return;
        }
        if (this.f10775A) {
            f10 = this.f10804m;
            width = getHeight();
        } else {
            f10 = this.f10803l;
            width = getWidth();
        }
        int iM19116j = this.f10801j.m19116j(-(f10 - (width / 2.0f)), this.f10805n);
        if (iM19116j < 0 || iM19116j > this.f10801j.m19122p() - 1 || iM19116j == getCurrentPage()) {
            m7858L();
        } else {
            m7870X(iM19116j);
        }
    }

    /* renamed from: L */
    public void m7858L() {
        HandlerC9679g handlerC9679g;
        if (this.f10801j == null || (handlerC9679g = this.f10810s) == null) {
            return;
        }
        handlerC9679g.removeMessages(1);
        this.f10798g.m19083i();
        this.f10811t.m19103f();
        m7867U();
    }

    /* renamed from: M */
    public void m7859M(float f10, float f11) {
        m7860N(this.f10803l + f10, this.f10804m + f11);
    }

    /* renamed from: N */
    public void m7860N(float f10, float f11) {
        m7861O(f10, f11, true);
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
    public void m7861O(float r6, float r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.m7861O(float, float, boolean):void");
    }

    /* renamed from: P */
    public void m7862P(C10199b c10199b) {
        if (this.f10807p == State.LOADED) {
            this.f10807p = State.SHOWN;
            this.f10812u.m21145g(this.f10801j.m19122p());
        }
        if (c10199b.m21303e()) {
            this.f10798g.m19078c(c10199b);
        } else {
            this.f10798g.m19077b(c10199b);
        }
        m7867U();
    }

    /* renamed from: Q */
    public void m7863Q(PageRenderingException pageRenderingException) {
        if (this.f10812u.m21143e(pageRenderingException.m7904a(), pageRenderingException.getCause())) {
            return;
        }
        Log.e(f10774T, "Cannot open page " + pageRenderingException.m7904a(), pageRenderingException.getCause());
    }

    /* renamed from: R */
    public boolean m7864R() {
        float f10 = -this.f10801j.m19119m(this.f10802k, this.f10805n);
        float fM19117k = f10 - this.f10801j.m19117k(this.f10802k, this.f10805n);
        if (m7849C()) {
            float f11 = this.f10804m;
            return f10 > f11 && fM19117k < f11 - ((float) getHeight());
        }
        float f12 = this.f10803l;
        return f10 > f12 && fM19117k < f12 - ((float) getWidth());
    }

    /* renamed from: S */
    public void m7865S() {
        C9678f c9678f;
        int iM7886s;
        SnapEdge snapEdgeM7887t;
        if (!this.f10779E || (c9678f = this.f10801j) == null || c9678f.m19122p() == 0 || (snapEdgeM7887t = m7887t((iM7886s = m7886s(this.f10803l, this.f10804m)))) == SnapEdge.NONE) {
            return;
        }
        float fM7871Y = m7871Y(iM7886s, snapEdgeM7887t);
        if (this.f10775A) {
            this.f10799h.m19071j(this.f10804m, -fM7871Y);
        } else {
            this.f10799h.m19070i(this.f10803l, -fM7871Y);
        }
    }

    /* renamed from: T */
    public void m7866T() {
        this.f10793S = null;
        this.f10799h.m19073l();
        this.f10800i.m19092c();
        HandlerC9679g handlerC9679g = this.f10810s;
        if (handlerC9679g != null) {
            handlerC9679g.m19138f();
            this.f10810s.removeMessages(1);
        }
        AsyncTaskC9675c asyncTaskC9675c = this.f10808q;
        if (asyncTaskC9675c != null) {
            asyncTaskC9675c.cancel(true);
        }
        this.f10798g.m19084j();
        InterfaceC10316a interfaceC10316a = this.f10781G;
        if (interfaceC10316a != null && this.f10782H) {
            interfaceC10316a.mo7906b();
        }
        C9678f c9678f = this.f10801j;
        if (c9678f != null) {
            c9678f.m19108b();
            this.f10801j = null;
        }
        this.f10810s = null;
        this.f10781G = null;
        this.f10782H = false;
        this.f10804m = 0.0f;
        this.f10803l = 0.0f;
        this.f10805n = 1.0f;
        this.f10806o = true;
        this.f10812u = new C10136a();
        this.f10807p = State.DEFAULT;
    }

    /* renamed from: U */
    public void m7867U() {
        invalidate();
    }

    /* renamed from: V */
    public void m7868V() {
        m7877e0(this.f10794c);
    }

    /* renamed from: W */
    public void m7869W(float f10, boolean z10) {
        if (this.f10775A) {
            m7861O(this.f10803l, ((-this.f10801j.m19111e(this.f10805n)) + getHeight()) * f10, z10);
        } else {
            m7861O(((-this.f10801j.m19111e(this.f10805n)) + getWidth()) * f10, this.f10804m, z10);
        }
        m7857K();
    }

    /* renamed from: X */
    public void m7870X(int i10) {
        if (this.f10806o) {
            return;
        }
        this.f10802k = this.f10801j.m19107a(i10);
        m7858L();
        if (this.f10781G != null && !m7880m()) {
            this.f10781G.setPageNum(this.f10802k + 1);
        }
        this.f10812u.m21142d(this.f10802k, this.f10801j.m19122p());
    }

    /* renamed from: Y */
    public float m7871Y(int i10, SnapEdge snapEdge) {
        float f10;
        float fM19119m = this.f10801j.m19119m(i10, this.f10805n);
        float height = this.f10775A ? getHeight() : getWidth();
        float fM19117k = this.f10801j.m19117k(i10, this.f10805n);
        if (snapEdge == SnapEdge.CENTER) {
            f10 = fM19119m - (height / 2.0f);
            fM19117k /= 2.0f;
        } else {
            if (snapEdge != SnapEdge.END) {
                return fM19119m;
            }
            f10 = fM19119m - height;
        }
        return f10 + fM19117k;
    }

    /* renamed from: Z */
    public void m7872Z() {
        this.f10799h.m19074m();
    }

    /* renamed from: a0 */
    public float m7873a0(float f10) {
        return f10 * this.f10805n;
    }

    /* renamed from: b0 */
    public void m7874b0(float f10, PointF pointF) {
        m7875c0(this.f10805n * f10, pointF);
    }

    /* renamed from: c0 */
    public void m7875c0(float f10, PointF pointF) {
        float f11 = f10 / this.f10805n;
        m7876d0(f10);
        float f12 = this.f10803l * f11;
        float f13 = this.f10804m * f11;
        float f14 = pointF.x;
        float f15 = pointF.y;
        m7860N(f12 + (f14 - (f14 * f11)), f13 + (f15 - (f11 * f15)));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        C9678f c9678f = this.f10801j;
        if (c9678f == null) {
            return true;
        }
        if (this.f10775A) {
            if (i10 >= 0 || this.f10803l >= 0.0f) {
                return i10 > 0 && this.f10803l + m7873a0(c9678f.m19114h()) > ((float) getWidth());
            }
            return true;
        }
        if (i10 >= 0 || this.f10803l >= 0.0f) {
            return i10 > 0 && this.f10803l + c9678f.m19111e(this.f10805n) > ((float) getWidth());
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        C9678f c9678f = this.f10801j;
        if (c9678f == null) {
            return true;
        }
        if (this.f10775A) {
            if (i10 >= 0 || this.f10804m >= 0.0f) {
                return i10 > 0 && this.f10804m + c9678f.m19111e(this.f10805n) > ((float) getHeight());
            }
            return true;
        }
        if (i10 >= 0 || this.f10804m >= 0.0f) {
            return i10 > 0 && this.f10804m + m7873a0(c9678f.m19112f()) > ((float) getHeight());
        }
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        this.f10799h.m19065d();
    }

    /* renamed from: d0 */
    public void m7876d0(float f10) {
        this.f10805n = f10;
    }

    /* renamed from: e0 */
    public void m7877e0(float f10) {
        this.f10799h.m19072k(getWidth() / 2, getHeight() / 2, this.f10805n, f10);
    }

    /* renamed from: f0 */
    public void m7878f0(float f10, float f11, float f12) {
        this.f10799h.m19072k(f10, f11, this.f10805n, f12);
    }

    public int getCurrentPage() {
        return this.f10802k;
    }

    public float getCurrentXOffset() {
        return this.f10803l;
    }

    public float getCurrentYOffset() {
        return this.f10804m;
    }

    public C7519a.c getDocumentMeta() {
        C9678f c9678f = this.f10801j;
        if (c9678f == null) {
            return null;
        }
        return c9678f.m19115i();
    }

    public float getMaxZoom() {
        return this.f10796e;
    }

    public float getMidZoom() {
        return this.f10795d;
    }

    public float getMinZoom() {
        return this.f10794c;
    }

    public int getPageCount() {
        C9678f c9678f = this.f10801j;
        if (c9678f == null) {
            return 0;
        }
        return c9678f.m19122p();
    }

    public FitPolicy getPageFitPolicy() {
        return this.f10815x;
    }

    public float getPositionOffset() {
        float f10;
        float fM19111e;
        int width;
        if (this.f10775A) {
            f10 = -this.f10804m;
            fM19111e = this.f10801j.m19111e(this.f10805n);
            width = getHeight();
        } else {
            f10 = -this.f10803l;
            fM19111e = this.f10801j.m19111e(this.f10805n);
            width = getWidth();
        }
        return AbstractC10628b.m22469c(f10 / (fM19111e - width), 0.0f, 1.0f);
    }

    public InterfaceC10316a getScrollHandle() {
        return this.f10781G;
    }

    public int getSpacingPx() {
        return this.f10788N;
    }

    public List<C7519a.a> getTableOfContents() {
        C9678f c9678f = this.f10801j;
        return c9678f == null ? Collections.EMPTY_LIST : c9678f.m19110d();
    }

    public float getZoom() {
        return this.f10805n;
    }

    /* renamed from: l */
    public boolean m7879l() {
        return this.f10785K;
    }

    /* renamed from: m */
    public boolean m7880m() {
        float fM19111e = this.f10801j.m19111e(1.0f);
        return this.f10775A ? fM19111e < ((float) getHeight()) : fM19111e < ((float) getWidth());
    }

    /* renamed from: n */
    public final void m7881n(Canvas canvas, C10199b c10199b) {
        float fM19119m;
        float fM7873a0;
        RectF rectFM21301c = c10199b.m21301c();
        Bitmap bitmapM21302d = c10199b.m21302d();
        if (bitmapM21302d.isRecycled()) {
            return;
        }
        C9686a c9686aM19120n = this.f10801j.m19120n(c10199b.m21300b());
        if (this.f10775A) {
            fM7873a0 = this.f10801j.m19119m(c10199b.m21300b(), this.f10805n);
            fM19119m = m7873a0(this.f10801j.m19114h() - c9686aM19120n.m19174b()) / 2.0f;
        } else {
            fM19119m = this.f10801j.m19119m(c10199b.m21300b(), this.f10805n);
            fM7873a0 = m7873a0(this.f10801j.m19112f() - c9686aM19120n.m19173a()) / 2.0f;
        }
        canvas.translate(fM19119m, fM7873a0);
        Rect rect = new Rect(0, 0, bitmapM21302d.getWidth(), bitmapM21302d.getHeight());
        float fM7873a02 = m7873a0(rectFM21301c.left * c9686aM19120n.m19174b());
        float fM7873a03 = m7873a0(rectFM21301c.top * c9686aM19120n.m19173a());
        RectF rectF = new RectF((int) fM7873a02, (int) fM7873a03, (int) (fM7873a02 + m7873a0(rectFM21301c.width() * c9686aM19120n.m19174b())), (int) (fM7873a03 + m7873a0(rectFM21301c.height() * c9686aM19120n.m19173a())));
        float f10 = this.f10803l + fM19119m;
        float f11 = this.f10804m + fM7873a0;
        if (rectF.left + f10 >= getWidth() || f10 + rectF.right <= 0.0f || rectF.top + f11 >= getHeight() || f11 + rectF.bottom <= 0.0f) {
            canvas.translate(-fM19119m, -fM7873a0);
            return;
        }
        canvas.drawBitmap(bitmapM21302d, rect, rectF, this.f10813v);
        if (AbstractC10627a.f25602a) {
            this.f10814w.setColor(c10199b.m21300b() % 2 == 0 ? SupportMenu.CATEGORY_MASK : -16776961);
            canvas.drawRect(rectF, this.f10814w);
        }
        canvas.translate(-fM19119m, -fM7873a0);
    }

    /* renamed from: o */
    public final void m7882o(Canvas canvas, int i10, InterfaceC10137b interfaceC10137b) {
        float fM19119m;
        if (interfaceC10137b != null) {
            float fM19119m2 = 0.0f;
            if (this.f10775A) {
                fM19119m = this.f10801j.m19119m(i10, this.f10805n);
            } else {
                fM19119m2 = this.f10801j.m19119m(i10, this.f10805n);
                fM19119m = 0.0f;
            }
            canvas.translate(fM19119m2, fM19119m);
            C9686a c9686aM19120n = this.f10801j.m19120n(i10);
            interfaceC10137b.m21161a(canvas, m7873a0(c9686aM19120n.m19174b()), m7873a0(c9686aM19120n.m19173a()), i10);
            canvas.translate(-fM19119m2, -fM19119m);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m7866T();
        HandlerThread handlerThread = this.f10809r;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f10809r = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            return;
        }
        if (this.f10786L) {
            canvas.setDrawFilter(this.f10787M);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.f10778D ? ViewCompat.MEASURED_STATE_MASK : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.f10806o && this.f10807p == State.SHOWN) {
            float f10 = this.f10803l;
            float f11 = this.f10804m;
            canvas.translate(f10, f11);
            Iterator it = this.f10798g.m19081g().iterator();
            while (it.hasNext()) {
                m7881n(canvas, (C10199b) it.next());
            }
            Iterator it2 = this.f10798g.m19080f().iterator();
            while (it2.hasNext()) {
                m7881n(canvas, (C10199b) it2.next());
                this.f10812u.m21148j();
            }
            Iterator it3 = this.f10791Q.iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                this.f10812u.m21148j();
                m7882o(canvas, iIntValue, null);
            }
            this.f10791Q.clear();
            int i10 = this.f10802k;
            this.f10812u.m21147i();
            m7882o(canvas, i10, null);
            canvas.translate(-f10, -f11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        float fM19111e;
        float fM19112f;
        this.f10792R = true;
        C6337b c6337b = this.f10793S;
        if (c6337b != null) {
            c6337b.m7896c();
        }
        if (isInEditMode() || this.f10807p != State.SHOWN) {
            return;
        }
        float f10 = (-this.f10803l) + (i12 * 0.5f);
        float f11 = (-this.f10804m) + (i13 * 0.5f);
        if (this.f10775A) {
            fM19111e = f10 / this.f10801j.m19114h();
            fM19112f = this.f10801j.m19111e(this.f10805n);
        } else {
            fM19111e = f10 / this.f10801j.m19111e(this.f10805n);
            fM19112f = this.f10801j.m19112f();
        }
        float f12 = f11 / fM19112f;
        this.f10799h.m19073l();
        this.f10801j.m19131y(new Size(i10, i11));
        if (this.f10775A) {
            this.f10803l = ((-fM19111e) * this.f10801j.m19114h()) + (i10 * 0.5f);
            this.f10804m = ((-f12) * this.f10801j.m19111e(this.f10805n)) + (i11 * 0.5f);
        } else {
            this.f10803l = ((-fM19111e) * this.f10801j.m19111e(this.f10805n)) + (i10 * 0.5f);
            this.f10804m = ((-f12) * this.f10801j.m19112f()) + (i11 * 0.5f);
        }
        m7860N(this.f10803l, this.f10804m);
        m7857K();
    }

    /* renamed from: p */
    public void m7883p(boolean z10) {
        this.f10784J = z10;
    }

    /* renamed from: q */
    public void m7884q(boolean z10) {
        this.f10786L = z10;
    }

    /* renamed from: r */
    public void m7885r(boolean z10) {
        this.f10777C = z10;
    }

    /* renamed from: s */
    public int m7886s(float f10, float f11) {
        boolean z10 = this.f10775A;
        if (z10) {
            f10 = f11;
        }
        float height = z10 ? getHeight() : getWidth();
        if (f10 > -1.0f) {
            return 0;
        }
        if (f10 < (-this.f10801j.m19111e(this.f10805n)) + height + 1.0f) {
            return this.f10801j.m19122p() - 1;
        }
        return this.f10801j.m19116j(-(f10 - (height / 2.0f)), this.f10805n);
    }

    public void setMaxZoom(float f10) {
        this.f10796e = f10;
    }

    public void setMidZoom(float f10) {
        this.f10795d = f10;
    }

    public void setMinZoom(float f10) {
        this.f10794c = f10;
    }

    public void setNightMode(boolean z10) {
        this.f10778D = z10;
        if (!z10) {
            this.f10813v.setColorFilter(null);
        } else {
            this.f10813v.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        }
    }

    public void setPageFling(boolean z10) {
        this.f10790P = z10;
    }

    public void setPageSnap(boolean z10) {
        this.f10779E = z10;
    }

    public void setPositionOffset(float f10) {
        m7869W(f10, true);
    }

    public void setSwipeEnabled(boolean z10) {
        this.f10776B = z10;
    }

    /* renamed from: t */
    public SnapEdge m7887t(int i10) {
        if (!this.f10779E || i10 < 0) {
            return SnapEdge.NONE;
        }
        float f10 = this.f10775A ? this.f10804m : this.f10803l;
        float f11 = -this.f10801j.m19119m(i10, this.f10805n);
        int height = this.f10775A ? getHeight() : getWidth();
        float fM19117k = this.f10801j.m19117k(i10, this.f10805n);
        float f12 = height;
        return f12 >= fM19117k ? SnapEdge.CENTER : f10 >= f11 ? SnapEdge.START : f11 - fM19117k > f10 - f12 ? SnapEdge.END : SnapEdge.NONE;
    }

    /* renamed from: u */
    public C6337b m7888u(File file) {
        return new C6337b(new C10443b(file));
    }

    /* renamed from: v */
    public boolean m7889v() {
        return this.f10784J;
    }

    /* renamed from: w */
    public boolean m7890w() {
        return this.f10789O;
    }

    /* renamed from: x */
    public boolean m7891x() {
        return this.f10783I;
    }

    /* renamed from: y */
    public boolean m7892y() {
        return this.f10777C;
    }

    /* renamed from: z */
    public boolean m7893z() {
        return this.f10816y;
    }
}
