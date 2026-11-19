package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import com.shockwave.pdfium.C5764a;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p068h1.AsyncTaskC6445c;
import p068h1.C6443a;
import p068h1.C6444b;
import p068h1.GestureDetectorOnGestureListenerC6446d;
import p068h1.HandlerC6447e;
import p075i1.InterfaceC6509a;
import p075i1.InterfaceC6510b;
import p075i1.InterfaceC6511c;
import p075i1.InterfaceC6512d;
import p075i1.InterfaceC6513e;
import p075i1.InterfaceC6514f;
import p075i1.InterfaceC6515g;
import p075i1.InterfaceC6516h;
import p082j1.C6583a;
import p089k1.InterfaceC6626a;
import p098l1.C7293b;
import p098l1.InterfaceC7292a;
import p105m1.AbstractC7374a;
import p105m1.AbstractC7375b;
import p105m1.AbstractC7376c;
import p105m1.AbstractC7377d;

/* loaded from: classes3.dex */
public class PDFView extends RelativeLayout {

    /* renamed from: U */
    public static final String f3286U = "PDFView";

    /* renamed from: A */
    public InterfaceC6511c f3287A;

    /* renamed from: B */
    public InterfaceC6510b f3288B;

    /* renamed from: C */
    public InterfaceC6512d f3289C;

    /* renamed from: D */
    public InterfaceC6514f f3290D;

    /* renamed from: E */
    public InterfaceC6513e f3291E;

    /* renamed from: F */
    public Paint f3292F;

    /* renamed from: G */
    public Paint f3293G;

    /* renamed from: H */
    public int f3294H;

    /* renamed from: I */
    public int f3295I;

    /* renamed from: J */
    public boolean f3296J;

    /* renamed from: K */
    public PdfiumCore f3297K;

    /* renamed from: L */
    public C5764a f3298L;

    /* renamed from: M */
    public boolean f3299M;

    /* renamed from: N */
    public boolean f3300N;

    /* renamed from: O */
    public boolean f3301O;

    /* renamed from: P */
    public boolean f3302P;

    /* renamed from: Q */
    public boolean f3303Q;

    /* renamed from: R */
    public PaintFlagsDrawFilter f3304R;

    /* renamed from: S */
    public int f3305S;

    /* renamed from: T */
    public List f3306T;

    /* renamed from: a */
    public float f3307a;

    /* renamed from: b */
    public float f3308b;

    /* renamed from: c */
    public float f3309c;

    /* renamed from: d */
    public ScrollDir f3310d;

    /* renamed from: e */
    public C6444b f3311e;

    /* renamed from: f */
    public C6443a f3312f;

    /* renamed from: g */
    public GestureDetectorOnGestureListenerC6446d f3313g;

    /* renamed from: h */
    public int[] f3314h;

    /* renamed from: i */
    public int[] f3315i;

    /* renamed from: j */
    public int[] f3316j;

    /* renamed from: k */
    public int f3317k;

    /* renamed from: l */
    public int f3318l;

    /* renamed from: m */
    public int f3319m;

    /* renamed from: n */
    public int f3320n;

    /* renamed from: o */
    public int f3321o;

    /* renamed from: p */
    public float f3322p;

    /* renamed from: q */
    public float f3323q;

    /* renamed from: r */
    public float f3324r;

    /* renamed from: s */
    public float f3325s;

    /* renamed from: t */
    public float f3326t;

    /* renamed from: u */
    public boolean f3327u;

    /* renamed from: v */
    public State f3328v;

    /* renamed from: w */
    public AsyncTaskC6445c f3329w;

    /* renamed from: x */
    public final HandlerThread f3330x;

    /* renamed from: y */
    public HandlerC6447e f3331y;

    /* renamed from: z */
    public C4849a f3332z;

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
    public class C4848b {

        /* renamed from: a */
        public final InterfaceC7292a f3342a;

        /* renamed from: b */
        public int[] f3343b;

        /* renamed from: c */
        public boolean f3344c;

        /* renamed from: d */
        public boolean f3345d;

        /* renamed from: e */
        public InterfaceC6511c f3346e;

        /* renamed from: f */
        public InterfaceC6510b f3347f;

        /* renamed from: g */
        public InterfaceC6512d f3348g;

        /* renamed from: h */
        public InterfaceC6514f f3349h;

        /* renamed from: i */
        public InterfaceC6513e f3350i;

        /* renamed from: j */
        public int f3351j;

        /* renamed from: k */
        public boolean f3352k;

        /* renamed from: l */
        public boolean f3353l;

        /* renamed from: m */
        public String f3354m;

        /* renamed from: n */
        public boolean f3355n;

        /* renamed from: o */
        public int f3356o;

        /* renamed from: p */
        public int f3357p;

        /* renamed from: com.github.barteksc.pdfviewer.PDFView$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C4848b.this.f3343b != null) {
                    C4848b c4848b = C4848b.this;
                    PDFView.this.m3376I(c4848b.f3342a, C4848b.this.f3354m, C4848b.this.f3346e, C4848b.this.f3347f, C4848b.this.f3343b);
                } else {
                    C4848b c4848b2 = C4848b.this;
                    PDFView.this.m3375H(c4848b2.f3342a, C4848b.this.f3354m, C4848b.this.f3346e, C4848b.this.f3347f);
                }
            }
        }

        /* renamed from: f */
        public C4848b m3413f(int i6) {
            this.f3351j = i6;
            return this;
        }

        /* renamed from: g */
        public C4848b m3414g(boolean z6) {
            this.f3345d = z6;
            return this;
        }

        /* renamed from: h */
        public C4848b m3415h(boolean z6) {
            this.f3344c = z6;
            return this;
        }

        /* renamed from: i */
        public void m3416i() {
            PDFView.this.m3386S();
            PDFView.this.setOnDrawListener(null);
            PDFView.this.setOnDrawAllListener(null);
            PDFView.this.setOnPageChangeListener(this.f3348g);
            PDFView.this.setOnPageScrollListener(this.f3349h);
            PDFView.this.setOnRenderListener(null);
            PDFView.this.setOnTapListener(null);
            PDFView.this.setOnPageErrorListener(this.f3350i);
            PDFView.this.m3407z(this.f3344c);
            PDFView.this.m3406y(this.f3345d);
            PDFView.this.setDefaultPage(this.f3351j);
            PDFView.this.setSwipeVertical(!this.f3352k);
            PDFView.this.m3404w(this.f3353l);
            PDFView.this.setScrollHandle(null);
            PDFView.this.m3405x(this.f3355n);
            PDFView.this.setSpacing(this.f3356o);
            PDFView.this.setInvalidPageColor(this.f3357p);
            PDFView.this.f3313g.m7084f(PDFView.this.f3296J);
            PDFView.this.post(new a());
        }

        /* renamed from: j */
        public C4848b m3417j(InterfaceC6510b interfaceC6510b) {
            this.f3347f = interfaceC6510b;
            return this;
        }

        /* renamed from: k */
        public C4848b m3418k(InterfaceC6511c interfaceC6511c) {
            this.f3346e = interfaceC6511c;
            return this;
        }

        /* renamed from: l */
        public C4848b m3419l(InterfaceC6512d interfaceC6512d) {
            this.f3348g = interfaceC6512d;
            return this;
        }

        /* renamed from: m */
        public C4848b m3420m(InterfaceC6513e interfaceC6513e) {
            this.f3350i = interfaceC6513e;
            return this;
        }

        /* renamed from: n */
        public C4848b m3421n(InterfaceC6514f interfaceC6514f) {
            this.f3349h = interfaceC6514f;
            return this;
        }

        /* renamed from: o */
        public C4848b m3422o(boolean z6) {
            this.f3352k = z6;
            return this;
        }

        public C4848b(InterfaceC7292a interfaceC7292a) {
            this.f3343b = null;
            this.f3344c = true;
            this.f3345d = true;
            this.f3351j = 0;
            this.f3352k = false;
            this.f3353l = false;
            this.f3354m = null;
            this.f3355n = true;
            this.f3356o = 0;
            this.f3357p = -1;
            this.f3342a = interfaceC7292a;
        }
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3307a = 1.0f;
        this.f3308b = 1.75f;
        this.f3309c = 3.0f;
        this.f3310d = ScrollDir.NONE;
        this.f3324r = 0.0f;
        this.f3325s = 0.0f;
        this.f3326t = 1.0f;
        this.f3327u = true;
        this.f3328v = State.DEFAULT;
        this.f3294H = -1;
        this.f3295I = 0;
        this.f3296J = true;
        this.f3299M = false;
        this.f3300N = false;
        this.f3301O = false;
        this.f3302P = false;
        this.f3303Q = true;
        this.f3304R = new PaintFlagsDrawFilter(0, 3);
        this.f3305S = 0;
        this.f3306T = new ArrayList(10);
        this.f3330x = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.f3311e = new C6444b();
        C6443a c6443a = new C6443a(this);
        this.f3312f = c6443a;
        this.f3313g = new GestureDetectorOnGestureListenerC6446d(this, c6443a);
        this.f3292F = new Paint();
        Paint paint = new Paint();
        this.f3293G = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f3297K = new PdfiumCore(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i6) {
        this.f3295I = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvalidPageColor(int i6) {
        this.f3294H = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageChangeListener(InterfaceC6512d interfaceC6512d) {
        this.f3289C = interfaceC6512d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageErrorListener(InterfaceC6513e interfaceC6513e) {
        this.f3291E = interfaceC6513e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageScrollListener(InterfaceC6514f interfaceC6514f) {
        this.f3290D = interfaceC6514f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i6) {
        this.f3305S = AbstractC7377d.m8411a(getContext(), i6);
    }

    /* renamed from: A */
    public C4848b m3368A(File file) {
        return new C4848b(new C7293b(file));
    }

    /* renamed from: B */
    public boolean m3369B() {
        return this.f3301O;
    }

    /* renamed from: C */
    public boolean m3370C() {
        return this.f3300N;
    }

    /* renamed from: D */
    public boolean m3371D() {
        return this.f3296J;
    }

    /* renamed from: E */
    public boolean m3372E() {
        return this.f3326t != this.f3307a;
    }

    /* renamed from: F */
    public void m3373F(int i6) {
        m3374G(i6, false);
    }

    /* renamed from: G */
    public void m3374G(int i6, boolean z6) {
        float f6 = -m3399r(i6);
        if (this.f3296J) {
            if (z6) {
                this.f3312f.m7062g(this.f3325s, f6);
            } else {
                m3382O(this.f3324r, f6);
            }
        } else if (z6) {
            this.f3312f.m7061f(this.f3324r, f6);
        } else {
            m3382O(f6, this.f3325s);
        }
        m3390W(i6);
    }

    /* renamed from: H */
    public final void m3375H(InterfaceC7292a interfaceC7292a, String str, InterfaceC6511c interfaceC6511c, InterfaceC6510b interfaceC6510b) {
        m3376I(interfaceC7292a, str, interfaceC6511c, interfaceC6510b, null);
    }

    /* renamed from: I */
    public final void m3376I(InterfaceC7292a interfaceC7292a, String str, InterfaceC6511c interfaceC6511c, InterfaceC6510b interfaceC6510b, int[] iArr) {
        if (!this.f3327u) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        if (iArr != null) {
            this.f3314h = iArr;
            this.f3315i = AbstractC7374a.m8404b(iArr);
            this.f3316j = AbstractC7374a.m8403a(this.f3314h);
        }
        this.f3287A = interfaceC6511c;
        this.f3288B = interfaceC6510b;
        int[] iArr2 = this.f3314h;
        int i6 = iArr2 != null ? iArr2[0] : 0;
        this.f3327u = false;
        AsyncTaskC6445c asyncTaskC6445c = new AsyncTaskC6445c(interfaceC7292a, str, this, this.f3297K, i6);
        this.f3329w = asyncTaskC6445c;
        asyncTaskC6445c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: J */
    public void m3377J(C5764a c5764a, int i6, int i7) {
        this.f3328v = State.LOADED;
        this.f3317k = this.f3297K.m3746d(c5764a);
        this.f3298L = c5764a;
        this.f3320n = i6;
        this.f3321o = i7;
        m3398q();
        this.f3332z = new C4849a(this);
        if (!this.f3330x.isAlive()) {
            this.f3330x.start();
        }
        HandlerC6447e handlerC6447e = new HandlerC6447e(this.f3330x.getLooper(), this, this.f3297K, c5764a);
        this.f3331y = handlerC6447e;
        handlerC6447e.m7089e();
        InterfaceC6511c interfaceC6511c = this.f3287A;
        if (interfaceC6511c != null) {
            interfaceC6511c.mo7257a(this.f3317k);
        }
        m3374G(this.f3295I, false);
    }

    /* renamed from: K */
    public void m3378K(Throwable th) {
        this.f3328v = State.ERROR;
        m3386S();
        invalidate();
        InterfaceC6510b interfaceC6510b = this.f3288B;
        if (interfaceC6510b != null) {
            interfaceC6510b.onError(th);
        } else {
            Log.e("PDFView", "load pdf error", th);
        }
    }

    /* renamed from: L */
    public void m3379L() {
        float f6;
        float f7;
        int width;
        if (getPageCount() == 0) {
            return;
        }
        int i6 = this.f3305S;
        float pageCount = i6 - (i6 / getPageCount());
        if (this.f3296J) {
            f6 = this.f3325s;
            f7 = this.f3323q + pageCount;
            width = getHeight();
        } else {
            f6 = this.f3324r;
            f7 = this.f3322p + pageCount;
            width = getWidth();
        }
        int iFloor = (int) Math.floor((Math.abs(f6) + (width / 2.0f)) / m3391X(f7));
        if (iFloor < 0 || iFloor > getPageCount() - 1 || iFloor == getCurrentPage()) {
            m3380M();
        } else {
            m3390W(iFloor);
        }
    }

    /* renamed from: M */
    public void m3380M() {
        HandlerC6447e handlerC6447e;
        if (this.f3322p == 0.0f || this.f3323q == 0.0f || (handlerC6447e = this.f3331y) == null) {
            return;
        }
        handlerC6447e.removeMessages(1);
        this.f3311e.m7073h();
        this.f3332z.m3427e();
        m3387T();
    }

    /* renamed from: N */
    public void m3381N(float f6, float f7) {
        m3382O(this.f3324r + f6, this.f3325s + f7);
    }

    /* renamed from: O */
    public void m3382O(float f6, float f7) {
        m3383P(f6, f7, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3383P(float r5, float r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.m3383P(float, float, boolean):void");
    }

    /* renamed from: Q */
    public void m3384Q(C6583a c6583a) {
        if (this.f3328v == State.LOADED) {
            this.f3328v = State.SHOWN;
        }
        if (c6583a.m7474h()) {
            this.f3311e.m7068b(c6583a);
        } else {
            this.f3311e.m7067a(c6583a);
        }
        m3387T();
    }

    /* renamed from: R */
    public void m3385R(PageRenderingException pageRenderingException) {
        InterfaceC6513e interfaceC6513e = this.f3291E;
        if (interfaceC6513e != null) {
            interfaceC6513e.mo7259a(pageRenderingException.m3431a(), pageRenderingException.getCause());
            return;
        }
        Log.e(f3286U, "Cannot open page " + pageRenderingException.m3431a(), pageRenderingException.getCause());
    }

    /* renamed from: S */
    public void m3386S() {
        C5764a c5764a;
        this.f3312f.m7064i();
        HandlerC6447e handlerC6447e = this.f3331y;
        if (handlerC6447e != null) {
            handlerC6447e.m7090f();
            this.f3331y.removeMessages(1);
        }
        AsyncTaskC6445c asyncTaskC6445c = this.f3329w;
        if (asyncTaskC6445c != null) {
            asyncTaskC6445c.cancel(true);
        }
        this.f3311e.m7074i();
        PdfiumCore pdfiumCore = this.f3297K;
        if (pdfiumCore != null && (c5764a = this.f3298L) != null) {
            pdfiumCore.m3744a(c5764a);
        }
        this.f3331y = null;
        this.f3314h = null;
        this.f3315i = null;
        this.f3316j = null;
        this.f3298L = null;
        this.f3299M = false;
        this.f3325s = 0.0f;
        this.f3324r = 0.0f;
        this.f3326t = 1.0f;
        this.f3327u = true;
        this.f3328v = State.DEFAULT;
    }

    /* renamed from: T */
    public void m3387T() {
        invalidate();
    }

    /* renamed from: U */
    public void m3388U() {
        m3395b0(this.f3307a);
    }

    /* renamed from: V */
    public void m3389V(float f6, boolean z6) {
        if (this.f3296J) {
            m3383P(this.f3324r, ((-m3397p()) + getHeight()) * f6, z6);
        } else {
            m3383P(((-m3397p()) + getWidth()) * f6, this.f3325s, z6);
        }
        m3379L();
    }

    /* renamed from: W */
    public void m3390W(int i6) {
        if (this.f3327u) {
            return;
        }
        int iM3400s = m3400s(i6);
        this.f3318l = iM3400s;
        this.f3319m = iM3400s;
        int[] iArr = this.f3316j;
        if (iArr != null && iM3400s >= 0 && iM3400s < iArr.length) {
            this.f3319m = iArr[iM3400s];
        }
        m3380M();
        InterfaceC6512d interfaceC6512d = this.f3289C;
        if (interfaceC6512d != null) {
            interfaceC6512d.mo7258a(this.f3318l, getPageCount());
        }
    }

    /* renamed from: X */
    public float m3391X(float f6) {
        return f6 * this.f3326t;
    }

    /* renamed from: Y */
    public void m3392Y(float f6, PointF pointF) {
        m3393Z(this.f3326t * f6, pointF);
    }

    /* renamed from: Z */
    public void m3393Z(float f6, PointF pointF) {
        float f7 = f6 / this.f3326t;
        m3394a0(f6);
        float f8 = this.f3324r * f7;
        float f9 = this.f3325s * f7;
        float f10 = pointF.x;
        float f11 = pointF.y;
        m3382O(f8 + (f10 - (f10 * f7)), f9 + (f11 - (f7 * f11)));
    }

    /* renamed from: a0 */
    public void m3394a0(float f6) {
        this.f3326t = f6;
    }

    /* renamed from: b0 */
    public void m3395b0(float f6) {
        this.f3312f.m7063h(getWidth() / 2, getHeight() / 2, this.f3326t, f6);
    }

    /* renamed from: c0 */
    public void m3396c0(float f6, float f7, float f8) {
        this.f3312f.m7063h(f6, f7, this.f3326t, f8);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i6) {
        if (this.f3296J) {
            if (i6 >= 0 || this.f3324r >= 0.0f) {
                return i6 > 0 && this.f3324r + m3391X(this.f3322p) > ((float) getWidth());
            }
            return true;
        }
        if (i6 >= 0 || this.f3324r >= 0.0f) {
            return i6 > 0 && this.f3324r + m3397p() > ((float) getWidth());
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i6) {
        if (this.f3296J) {
            if (i6 >= 0 || this.f3325s >= 0.0f) {
                return i6 > 0 && this.f3325s + m3397p() > ((float) getHeight());
            }
            return true;
        }
        if (i6 >= 0 || this.f3325s >= 0.0f) {
            return i6 > 0 && this.f3325s + m3391X(this.f3323q) > ((float) getHeight());
        }
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        this.f3312f.m7058c();
    }

    public int getCurrentPage() {
        return this.f3318l;
    }

    public float getCurrentXOffset() {
        return this.f3324r;
    }

    public float getCurrentYOffset() {
        return this.f3325s;
    }

    public C5764a.b getDocumentMeta() {
        C5764a c5764a = this.f3298L;
        if (c5764a == null) {
            return null;
        }
        return this.f3297K.m3745b(c5764a);
    }

    public int getDocumentPageCount() {
        return this.f3317k;
    }

    public int[] getFilteredUserPageIndexes() {
        return this.f3316j;
    }

    public int[] getFilteredUserPages() {
        return this.f3315i;
    }

    public int getInvalidPageColor() {
        return this.f3294H;
    }

    public float getMaxZoom() {
        return this.f3309c;
    }

    public float getMidZoom() {
        return this.f3308b;
    }

    public float getMinZoom() {
        return this.f3307a;
    }

    public InterfaceC6512d getOnPageChangeListener() {
        return this.f3289C;
    }

    public InterfaceC6514f getOnPageScrollListener() {
        return this.f3290D;
    }

    public InterfaceC6515g getOnRenderListener() {
        return null;
    }

    public InterfaceC6516h getOnTapListener() {
        return null;
    }

    public float getOptimalPageHeight() {
        return this.f3323q;
    }

    public float getOptimalPageWidth() {
        return this.f3322p;
    }

    public int[] getOriginalUserPages() {
        return this.f3314h;
    }

    public int getPageCount() {
        int[] iArr = this.f3314h;
        return iArr != null ? iArr.length : this.f3317k;
    }

    public float getPositionOffset() {
        float f6;
        float fM3397p;
        int width;
        if (this.f3296J) {
            f6 = -this.f3325s;
            fM3397p = m3397p();
            width = getHeight();
        } else {
            f6 = -this.f3324r;
            fM3397p = m3397p();
            width = getWidth();
        }
        return AbstractC7376c.m8407c(f6 / (fM3397p - width), 0.0f, 1.0f);
    }

    public ScrollDir getScrollDir() {
        return this.f3310d;
    }

    public InterfaceC6626a getScrollHandle() {
        return null;
    }

    public int getSpacingPx() {
        return this.f3305S;
    }

    public List<C5764a.a> getTableOfContents() {
        C5764a c5764a = this.f3298L;
        return c5764a == null ? new ArrayList() : this.f3297K.m3749g(c5764a);
    }

    public float getZoom() {
        return this.f3326t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m3386S();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            return;
        }
        if (this.f3303Q) {
            canvas.setDrawFilter(this.f3304R);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(-1);
        } else {
            background.draw(canvas);
        }
        if (!this.f3327u && this.f3328v == State.SHOWN) {
            float f6 = this.f3324r;
            float f7 = this.f3325s;
            canvas.translate(f6, f7);
            Iterator it = this.f3311e.m7071f().iterator();
            while (it.hasNext()) {
                m3402u(canvas, (C6583a) it.next());
            }
            Iterator it2 = this.f3311e.m7070e().iterator();
            while (it2.hasNext()) {
                m3402u(canvas, (C6583a) it2.next());
            }
            Iterator it3 = this.f3306T.iterator();
            while (it3.hasNext()) {
                m3403v(canvas, ((Integer) it3.next()).intValue(), null);
            }
            this.f3306T.clear();
            m3403v(canvas, this.f3318l, null);
            canvas.translate(-f6, -f7);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        if (isInEditMode() || this.f3328v != State.SHOWN) {
            return;
        }
        this.f3312f.m7064i();
        m3398q();
        if (this.f3296J) {
            m3382O(this.f3324r, -m3399r(this.f3318l));
        } else {
            m3382O(-m3399r(this.f3318l), this.f3325s);
        }
        m3379L();
    }

    /* renamed from: p */
    public float m3397p() {
        int pageCount = getPageCount();
        return this.f3296J ? m3391X((pageCount * this.f3323q) + ((pageCount - 1) * this.f3305S)) : m3391X((pageCount * this.f3322p) + ((pageCount - 1) * this.f3305S));
    }

    /* renamed from: q */
    public final void m3398q() {
        if (this.f3328v == State.DEFAULT || getWidth() == 0) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f6 = this.f3320n / this.f3321o;
        float fFloor = (float) Math.floor(width / f6);
        if (fFloor > height) {
            width = (float) Math.floor(f6 * height);
        } else {
            height = fFloor;
        }
        this.f3322p = width;
        this.f3323q = height;
    }

    /* renamed from: r */
    public final float m3399r(int i6) {
        return this.f3296J ? m3391X((i6 * this.f3323q) + (i6 * this.f3305S)) : m3391X((i6 * this.f3322p) + (i6 * this.f3305S));
    }

    /* renamed from: s */
    public final int m3400s(int i6) {
        if (i6 <= 0) {
            return 0;
        }
        int[] iArr = this.f3314h;
        if (iArr == null) {
            int i7 = this.f3317k;
            if (i6 >= i7) {
                return i7 - 1;
            }
        } else if (i6 >= iArr.length) {
            return iArr.length - 1;
        }
        return i6;
    }

    public void setMaxZoom(float f6) {
        this.f3309c = f6;
    }

    public void setMidZoom(float f6) {
        this.f3308b = f6;
    }

    public void setMinZoom(float f6) {
        this.f3307a = f6;
    }

    public void setPositionOffset(float f6) {
        m3389V(f6, true);
    }

    public void setSwipeVertical(boolean z6) {
        this.f3296J = z6;
    }

    /* renamed from: t */
    public boolean m3401t() {
        return this.f3302P;
    }

    /* renamed from: u */
    public final void m3402u(Canvas canvas, C6583a c6583a) {
        float fM3399r;
        float fM3399r2;
        RectF rectFM7470d = c6583a.m7470d();
        Bitmap bitmapM7471e = c6583a.m7471e();
        if (bitmapM7471e.isRecycled()) {
            return;
        }
        if (this.f3296J) {
            fM3399r2 = m3399r(c6583a.m7472f());
            fM3399r = 0.0f;
        } else {
            fM3399r = m3399r(c6583a.m7472f());
            fM3399r2 = 0.0f;
        }
        canvas.translate(fM3399r, fM3399r2);
        Rect rect = new Rect(0, 0, bitmapM7471e.getWidth(), bitmapM7471e.getHeight());
        float fM3391X = m3391X(rectFM7470d.left * this.f3322p);
        float fM3391X2 = m3391X(rectFM7470d.top * this.f3323q);
        RectF rectF = new RectF((int) fM3391X, (int) fM3391X2, (int) (fM3391X + m3391X(rectFM7470d.width() * this.f3322p)), (int) (fM3391X2 + m3391X(rectFM7470d.height() * this.f3323q)));
        float f6 = this.f3324r + fM3399r;
        float f7 = this.f3325s + fM3399r2;
        if (rectF.left + f6 >= getWidth() || f6 + rectF.right <= 0.0f || rectF.top + f7 >= getHeight() || f7 + rectF.bottom <= 0.0f) {
            canvas.translate(-fM3399r, -fM3399r2);
            return;
        }
        canvas.drawBitmap(bitmapM7471e, rect, rectF, this.f3292F);
        if (AbstractC7375b.f9386a) {
            this.f3293G.setColor(c6583a.m7472f() % 2 == 0 ? SupportMenu.CATEGORY_MASK : -16776961);
            canvas.drawRect(rectF, this.f3293G);
        }
        canvas.translate(-fM3399r, -fM3399r2);
    }

    /* renamed from: v */
    public final void m3403v(Canvas canvas, int i6, InterfaceC6509a interfaceC6509a) {
        float fM3399r;
        if (interfaceC6509a != null) {
            float fM3399r2 = 0.0f;
            if (this.f3296J) {
                fM3399r = m3399r(i6);
            } else {
                fM3399r2 = m3399r(i6);
                fM3399r = 0.0f;
            }
            canvas.translate(fM3399r2, fM3399r);
            interfaceC6509a.m7256a(canvas, m3391X(this.f3322p), m3391X(this.f3323q), i6);
            canvas.translate(-fM3399r2, -fM3399r);
        }
    }

    /* renamed from: w */
    public void m3404w(boolean z6) {
        this.f3301O = z6;
    }

    /* renamed from: x */
    public void m3405x(boolean z6) {
        this.f3303Q = z6;
    }

    /* renamed from: y */
    public void m3406y(boolean z6) {
        this.f3313g.m7079a(z6);
    }

    /* renamed from: z */
    public void m3407z(boolean z6) {
        this.f3313g.m7083e(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDrawAllListener(InterfaceC6509a interfaceC6509a) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDrawListener(InterfaceC6509a interfaceC6509a) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnRenderListener(InterfaceC6515g interfaceC6515g) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnTapListener(InterfaceC6516h interfaceC6516h) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(InterfaceC6626a interfaceC6626a) {
    }
}
