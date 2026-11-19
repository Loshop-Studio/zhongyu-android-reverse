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
import com.shockwave.pdfium.C1671a;
import com.shockwave.pdfium.PdfiumCore;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p119m1.C2860a;
import p123n1.InterfaceC2881a;
import p123n1.InterfaceC2882b;
import p123n1.InterfaceC2883c;
import p123n1.InterfaceC2884d;
import p123n1.InterfaceC2885e;
import p123n1.InterfaceC2886f;
import p123n1.InterfaceC2887g;
import p123n1.InterfaceC2888h;
import p127o1.C2907a;
import p137p1.InterfaceC2996a;
import p141q1.C3008b;
import p141q1.InterfaceC3007a;
import p145r1.C3026a;
import p145r1.C3027b;
import p145r1.C3028c;
import p145r1.C3029d;

/* loaded from: classes.dex */
public class PDFView extends RelativeLayout {

    /* renamed from: g0 */
    private static final String f7215g0 = PDFView.class.getSimpleName();

    /* renamed from: A */
    private InterfaceC2883c f7216A;

    /* renamed from: B */
    private InterfaceC2882b f7217B;

    /* renamed from: C */
    private InterfaceC2884d f7218C;

    /* renamed from: D */
    private InterfaceC2886f f7219D;

    /* renamed from: E */
    private InterfaceC2881a f7220E;

    /* renamed from: F */
    private InterfaceC2881a f7221F;

    /* renamed from: G */
    private InterfaceC2887g f7222G;

    /* renamed from: H */
    private InterfaceC2888h f7223H;

    /* renamed from: I */
    private InterfaceC2885e f7224I;

    /* renamed from: J */
    private Paint f7225J;

    /* renamed from: K */
    private Paint f7226K;

    /* renamed from: L */
    private int f7227L;

    /* renamed from: M */
    private int f7228M;

    /* renamed from: N */
    private boolean f7229N;

    /* renamed from: S */
    private PdfiumCore f7230S;

    /* renamed from: T */
    private C1671a f7231T;

    /* renamed from: U */
    private InterfaceC2996a f7232U;

    /* renamed from: V */
    private boolean f7233V;

    /* renamed from: W */
    private boolean f7234W;

    /* renamed from: a */
    private float f7235a;

    /* renamed from: a0 */
    private boolean f7236a0;

    /* renamed from: b */
    private float f7237b;

    /* renamed from: b0 */
    private boolean f7238b0;

    /* renamed from: c */
    private float f7239c;

    /* renamed from: c0 */
    private boolean f7240c0;

    /* renamed from: d */
    private EnumC1363c f7241d;

    /* renamed from: d0 */
    private PaintFlagsDrawFilter f7242d0;

    /* renamed from: e */
    C1366b f7243e;

    /* renamed from: e0 */
    private int f7244e0;

    /* renamed from: f */
    private C1365a f7245f;

    /* renamed from: f0 */
    private List<Integer> f7246f0;

    /* renamed from: g */
    private GestureDetectorOnGestureListenerC1368d f7247g;

    /* renamed from: h */
    private int[] f7248h;

    /* renamed from: i */
    private int[] f7249i;

    /* renamed from: j */
    private int[] f7250j;

    /* renamed from: k */
    private int f7251k;

    /* renamed from: l */
    private int f7252l;

    /* renamed from: m */
    private int f7253m;

    /* renamed from: n */
    private int f7254n;

    /* renamed from: o */
    private int f7255o;

    /* renamed from: p */
    private float f7256p;

    /* renamed from: q */
    private float f7257q;

    /* renamed from: r */
    private float f7258r;

    /* renamed from: s */
    private float f7259s;

    /* renamed from: t */
    private float f7260t;

    /* renamed from: u */
    private boolean f7261u;

    /* renamed from: v */
    private EnumC1364d f7262v;

    /* renamed from: w */
    private AsyncTaskC1367c f7263w;

    /* renamed from: x */
    private final HandlerThread f7264x;

    /* renamed from: y */
    HandlerC1370f f7265y;

    /* renamed from: z */
    private C1369e f7266z;

    /* renamed from: com.github.barteksc.pdfviewer.PDFView$b */
    public class C1362b {

        /* renamed from: a */
        private final InterfaceC3007a f7267a;

        /* renamed from: b */
        private int[] f7268b;

        /* renamed from: c */
        private boolean f7269c;

        /* renamed from: d */
        private boolean f7270d;

        /* renamed from: e */
        private InterfaceC2881a f7271e;

        /* renamed from: f */
        private InterfaceC2881a f7272f;

        /* renamed from: g */
        private InterfaceC2883c f7273g;

        /* renamed from: h */
        private InterfaceC2882b f7274h;

        /* renamed from: i */
        private InterfaceC2884d f7275i;

        /* renamed from: j */
        private InterfaceC2886f f7276j;

        /* renamed from: k */
        private InterfaceC2887g f7277k;

        /* renamed from: l */
        private InterfaceC2888h f7278l;

        /* renamed from: m */
        private InterfaceC2885e f7279m;

        /* renamed from: n */
        private int f7280n;

        /* renamed from: o */
        private boolean f7281o;

        /* renamed from: p */
        private boolean f7282p;

        /* renamed from: q */
        private String f7283q;

        /* renamed from: r */
        private InterfaceC2996a f7284r;

        /* renamed from: s */
        private boolean f7285s;

        /* renamed from: t */
        private int f7286t;

        /* renamed from: u */
        private int f7287u;

        /* renamed from: com.github.barteksc.pdfviewer.PDFView$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C1362b.this.f7268b != null) {
                    C1362b c1362b = C1362b.this;
                    PDFView.this.m5605J(c1362b.f7267a, C1362b.this.f7283q, C1362b.this.f7273g, C1362b.this.f7274h, C1362b.this.f7268b);
                } else {
                    C1362b c1362b2 = C1362b.this;
                    PDFView.this.m5604I(c1362b2.f7267a, C1362b.this.f7283q, C1362b.this.f7273g, C1362b.this.f7274h);
                }
            }
        }

        /* renamed from: f */
        public C1362b m5665f(int i4) {
            this.f7280n = i4;
            return this;
        }

        /* renamed from: g */
        public C1362b m5666g(boolean z3) {
            this.f7282p = z3;
            return this;
        }

        /* renamed from: h */
        public C1362b m5667h(boolean z3) {
            this.f7270d = z3;
            return this;
        }

        /* renamed from: i */
        public C1362b m5668i(boolean z3) {
            this.f7269c = z3;
            return this;
        }

        /* renamed from: j */
        public void m5669j() {
            PDFView.this.m5643T();
            PDFView.this.setOnDrawListener(this.f7271e);
            PDFView.this.setOnDrawAllListener(this.f7272f);
            PDFView.this.setOnPageChangeListener(this.f7275i);
            PDFView.this.setOnPageScrollListener(this.f7276j);
            PDFView.this.setOnRenderListener(this.f7277k);
            PDFView.this.setOnTapListener(this.f7278l);
            PDFView.this.setOnPageErrorListener(this.f7279m);
            PDFView.this.m5626A(this.f7269c);
            PDFView.this.m5659z(this.f7270d);
            PDFView.this.setDefaultPage(this.f7280n);
            PDFView.this.setSwipeVertical(!this.f7281o);
            PDFView.this.m5657x(this.f7282p);
            PDFView.this.setScrollHandle(this.f7284r);
            PDFView.this.m5658y(this.f7285s);
            PDFView.this.setSpacing(this.f7286t);
            PDFView.this.setInvalidPageColor(this.f7287u);
            PDFView.this.f7247g.m5704f(PDFView.this.f7229N);
            PDFView.this.post(new a());
        }

        /* renamed from: k */
        public C1362b m5670k(InterfaceC2882b interfaceC2882b) {
            this.f7274h = interfaceC2882b;
            return this;
        }

        /* renamed from: l */
        public C1362b m5671l(InterfaceC2883c interfaceC2883c) {
            this.f7273g = interfaceC2883c;
            return this;
        }

        /* renamed from: m */
        public C1362b m5672m(InterfaceC2884d interfaceC2884d) {
            this.f7275i = interfaceC2884d;
            return this;
        }

        /* renamed from: n */
        public C1362b m5673n(InterfaceC2885e interfaceC2885e) {
            this.f7279m = interfaceC2885e;
            return this;
        }

        /* renamed from: o */
        public C1362b m5674o(InterfaceC2886f interfaceC2886f) {
            this.f7276j = interfaceC2886f;
            return this;
        }

        /* renamed from: p */
        public C1362b m5675p(boolean z3) {
            this.f7281o = z3;
            return this;
        }

        private C1362b(InterfaceC3007a interfaceC3007a) {
            this.f7268b = null;
            this.f7269c = true;
            this.f7270d = true;
            this.f7280n = 0;
            this.f7281o = false;
            this.f7282p = false;
            this.f7283q = null;
            this.f7284r = null;
            this.f7285s = true;
            this.f7286t = 0;
            this.f7287u = -1;
            this.f7267a = interfaceC3007a;
        }
    }

    /* renamed from: com.github.barteksc.pdfviewer.PDFView$c */
    enum EnumC1363c {
        NONE,
        START,
        END
    }

    /* renamed from: com.github.barteksc.pdfviewer.PDFView$d */
    private enum EnumC1364d {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7235a = 1.0f;
        this.f7237b = 1.75f;
        this.f7239c = 3.0f;
        this.f7241d = EnumC1363c.NONE;
        this.f7258r = IGoodView.DEFAULT_TO_ALPHA;
        this.f7259s = IGoodView.DEFAULT_TO_ALPHA;
        this.f7260t = 1.0f;
        this.f7261u = true;
        this.f7262v = EnumC1364d.DEFAULT;
        this.f7227L = -1;
        this.f7228M = 0;
        this.f7229N = true;
        this.f7233V = false;
        this.f7234W = false;
        this.f7236a0 = false;
        this.f7238b0 = false;
        this.f7240c0 = true;
        this.f7242d0 = new PaintFlagsDrawFilter(0, 3);
        this.f7244e0 = 0;
        this.f7246f0 = new ArrayList(10);
        this.f7264x = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.f7243e = new C1366b();
        C1365a c1365a = new C1365a(this);
        this.f7245f = c1365a;
        this.f7247g = new GestureDetectorOnGestureListenerC1368d(this, c1365a);
        this.f7225J = new Paint();
        Paint paint = new Paint();
        this.f7226K = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f7230S = new PdfiumCore(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public void m5604I(InterfaceC3007a interfaceC3007a, String str, InterfaceC2883c interfaceC2883c, InterfaceC2882b interfaceC2882b) {
        m5605J(interfaceC3007a, str, interfaceC2883c, interfaceC2882b, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m5605J(InterfaceC3007a interfaceC3007a, String str, InterfaceC2883c interfaceC2883c, InterfaceC2882b interfaceC2882b, int[] iArr) {
        if (!this.f7261u) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        if (iArr != null) {
            this.f7248h = iArr;
            this.f7249i = C3026a.m10161b(iArr);
            this.f7250j = C3026a.m10160a(this.f7248h);
        }
        this.f7216A = interfaceC2883c;
        this.f7217B = interfaceC2882b;
        int[] iArr2 = this.f7248h;
        int i4 = iArr2 != null ? iArr2[0] : 0;
        this.f7261u = false;
        AsyncTaskC1367c asyncTaskC1367c = new AsyncTaskC1367c(interfaceC3007a, str, this, this.f7230S, i4);
        this.f7263w = asyncTaskC1367c;
        asyncTaskC1367c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: q */
    private void m5621q() {
        if (this.f7262v == EnumC1364d.DEFAULT || getWidth() == 0) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f4 = this.f7254n / this.f7255o;
        float fFloor = (float) Math.floor(width / f4);
        if (fFloor > height) {
            width = (float) Math.floor(f4 * height);
        } else {
            height = fFloor;
        }
        this.f7256p = width;
        this.f7257q = height;
    }

    /* renamed from: r */
    private float m5622r(int i4) {
        return this.f7229N ? m5648Y((i4 * this.f7257q) + (i4 * this.f7244e0)) : m5648Y((i4 * this.f7256p) + (i4 * this.f7244e0));
    }

    /* renamed from: s */
    private int m5623s(int i4) {
        if (i4 <= 0) {
            return 0;
        }
        int[] iArr = this.f7248h;
        if (iArr == null) {
            int i5 = this.f7251k;
            if (i4 >= i5) {
                return i5 - 1;
            }
        } else if (i4 >= iArr.length) {
            return iArr.length - 1;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i4) {
        this.f7228M = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvalidPageColor(int i4) {
        this.f7227L = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDrawAllListener(InterfaceC2881a interfaceC2881a) {
        this.f7221F = interfaceC2881a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDrawListener(InterfaceC2881a interfaceC2881a) {
        this.f7220E = interfaceC2881a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageChangeListener(InterfaceC2884d interfaceC2884d) {
        this.f7218C = interfaceC2884d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageErrorListener(InterfaceC2885e interfaceC2885e) {
        this.f7224I = interfaceC2885e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageScrollListener(InterfaceC2886f interfaceC2886f) {
        this.f7219D = interfaceC2886f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnRenderListener(InterfaceC2887g interfaceC2887g) {
        this.f7222G = interfaceC2887g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnTapListener(InterfaceC2888h interfaceC2888h) {
        this.f7223H = interfaceC2888h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(InterfaceC2996a interfaceC2996a) {
        this.f7232U = interfaceC2996a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i4) {
        this.f7244e0 = C3029d.m10168a(getContext(), i4);
    }

    /* renamed from: v */
    private void m5624v(Canvas canvas, C2907a c2907a) {
        float fM5622r;
        float fM5622r2;
        RectF rectFM9975d = c2907a.m9975d();
        Bitmap bitmapM9976e = c2907a.m9976e();
        if (bitmapM9976e.isRecycled()) {
            return;
        }
        if (this.f7229N) {
            fM5622r2 = m5622r(c2907a.m9977f());
            fM5622r = IGoodView.DEFAULT_TO_ALPHA;
        } else {
            fM5622r = m5622r(c2907a.m9977f());
            fM5622r2 = IGoodView.DEFAULT_TO_ALPHA;
        }
        canvas.translate(fM5622r, fM5622r2);
        Rect rect = new Rect(0, 0, bitmapM9976e.getWidth(), bitmapM9976e.getHeight());
        float fM5648Y = m5648Y(rectFM9975d.left * this.f7256p);
        float fM5648Y2 = m5648Y(rectFM9975d.top * this.f7257q);
        RectF rectF = new RectF((int) fM5648Y, (int) fM5648Y2, (int) (fM5648Y + m5648Y(rectFM9975d.width() * this.f7256p)), (int) (fM5648Y2 + m5648Y(rectFM9975d.height() * this.f7257q)));
        float f4 = this.f7258r + fM5622r;
        float f5 = this.f7259s + fM5622r2;
        if (rectF.left + f4 >= getWidth() || f4 + rectF.right <= IGoodView.DEFAULT_TO_ALPHA || rectF.top + f5 >= getHeight() || f5 + rectF.bottom <= IGoodView.DEFAULT_TO_ALPHA) {
            canvas.translate(-fM5622r, -fM5622r2);
            return;
        }
        canvas.drawBitmap(bitmapM9976e, rect, rectF, this.f7225J);
        if (C3027b.f11730a) {
            this.f7226K.setColor(c2907a.m9977f() % 2 == 0 ? -65536 : -16776961);
            canvas.drawRect(rectF, this.f7226K);
        }
        canvas.translate(-fM5622r, -fM5622r2);
    }

    /* renamed from: w */
    private void m5625w(Canvas canvas, int i4, InterfaceC2881a interfaceC2881a) {
        float fM5622r;
        if (interfaceC2881a != null) {
            boolean z3 = this.f7229N;
            float fM5622r2 = IGoodView.DEFAULT_TO_ALPHA;
            if (z3) {
                fM5622r = m5622r(i4);
            } else {
                fM5622r2 = m5622r(i4);
                fM5622r = IGoodView.DEFAULT_TO_ALPHA;
            }
            canvas.translate(fM5622r2, fM5622r);
            interfaceC2881a.m9919a(canvas, m5648Y(this.f7256p), m5648Y(this.f7257q), i4);
            canvas.translate(-fM5622r2, -fM5622r);
        }
    }

    /* renamed from: A */
    public void m5626A(boolean z3) {
        this.f7247g.m5703e(z3);
    }

    /* renamed from: B */
    public C1362b m5627B(File file) {
        return new C1362b(new C3008b(file));
    }

    /* renamed from: C */
    public boolean m5628C() {
        return this.f7236a0;
    }

    /* renamed from: D */
    public boolean m5629D() {
        return this.f7234W;
    }

    /* renamed from: E */
    public boolean m5630E() {
        return this.f7229N;
    }

    /* renamed from: F */
    public boolean m5631F() {
        return this.f7260t != this.f7235a;
    }

    /* renamed from: G */
    public void m5632G(int i4) {
        m5633H(i4, false);
    }

    /* renamed from: H */
    public void m5633H(int i4, boolean z3) {
        float f4 = -m5622r(i4);
        if (this.f7229N) {
            if (z3) {
                this.f7245f.m5682g(this.f7259s, f4);
            } else {
                m5639P(this.f7258r, f4);
            }
        } else if (z3) {
            this.f7245f.m5681f(this.f7258r, f4);
        } else {
            m5639P(f4, this.f7259s);
        }
        m5647X(i4);
    }

    /* renamed from: K */
    void m5634K(C1671a c1671a, int i4, int i5) {
        this.f7262v = EnumC1364d.LOADED;
        this.f7251k = this.f7230S.m5723d(c1671a);
        this.f7231T = c1671a;
        this.f7254n = i4;
        this.f7255o = i5;
        m5621q();
        this.f7266z = new C1369e(this);
        if (!this.f7264x.isAlive()) {
            this.f7264x.start();
        }
        HandlerC1370f handlerC1370f = new HandlerC1370f(this.f7264x.getLooper(), this, this.f7230S, c1671a);
        this.f7265y = handlerC1370f;
        handlerC1370f.m5717e();
        InterfaceC2996a interfaceC2996a = this.f7232U;
        if (interfaceC2996a != null) {
            interfaceC2996a.m10100d(this);
            this.f7233V = true;
        }
        InterfaceC2883c interfaceC2883c = this.f7216A;
        if (interfaceC2883c != null) {
            interfaceC2883c.mo4949a(this.f7251k);
        }
        m5633H(this.f7228M, false);
    }

    /* renamed from: L */
    void m5635L(Throwable th) {
        this.f7262v = EnumC1364d.ERROR;
        m5643T();
        invalidate();
        InterfaceC2882b interfaceC2882b = this.f7217B;
        if (interfaceC2882b != null) {
            interfaceC2882b.onError(th);
        } else {
            Log.e("PDFView", "load pdf error", th);
        }
    }

    /* renamed from: M */
    void m5636M() {
        float f4;
        float f5;
        int width;
        if (getPageCount() == 0) {
            return;
        }
        int i4 = this.f7244e0;
        float pageCount = i4 - (i4 / getPageCount());
        if (this.f7229N) {
            f4 = this.f7259s;
            f5 = this.f7257q + pageCount;
            width = getHeight();
        } else {
            f4 = this.f7258r;
            f5 = this.f7256p + pageCount;
            width = getWidth();
        }
        int iFloor = (int) Math.floor((Math.abs(f4) + (width / 2.0f)) / m5648Y(f5));
        if (iFloor < 0 || iFloor > getPageCount() - 1 || iFloor == getCurrentPage()) {
            m5637N();
        } else {
            m5647X(iFloor);
        }
    }

    /* renamed from: N */
    public void m5637N() {
        HandlerC1370f handlerC1370f;
        if (this.f7256p == IGoodView.DEFAULT_TO_ALPHA || this.f7257q == IGoodView.DEFAULT_TO_ALPHA || (handlerC1370f = this.f7265y) == null) {
            return;
        }
        handlerC1370f.removeMessages(1);
        this.f7243e.m5693h();
        this.f7266z.m5711e();
        m5644U();
    }

    /* renamed from: O */
    public void m5638O(float f4, float f5) {
        m5639P(this.f7258r + f4, this.f7259s + f5);
    }

    /* renamed from: P */
    public void m5639P(float f4, float f5) {
        m5640Q(f4, f5, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5640Q(float r6, float r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.m5640Q(float, float, boolean):void");
    }

    /* renamed from: R */
    public void m5641R(C2907a c2907a) {
        if (this.f7262v == EnumC1364d.LOADED) {
            this.f7262v = EnumC1364d.SHOWN;
            InterfaceC2887g interfaceC2887g = this.f7222G;
            if (interfaceC2887g != null) {
                interfaceC2887g.m9920a(getPageCount(), this.f7256p, this.f7257q);
            }
        }
        if (c2907a.m9979h()) {
            this.f7243e.m5689b(c2907a);
        } else {
            this.f7243e.m5688a(c2907a);
        }
        m5644U();
    }

    /* renamed from: S */
    void m5642S(C2860a c2860a) {
        InterfaceC2885e interfaceC2885e = this.f7224I;
        if (interfaceC2885e != null) {
            interfaceC2885e.mo4951a(c2860a.m9649a(), c2860a.getCause());
            return;
        }
        Log.e(f7215g0, "Cannot open page " + c2860a.m9649a(), c2860a.getCause());
    }

    /* renamed from: T */
    public void m5643T() {
        C1671a c1671a;
        this.f7245f.m5684i();
        HandlerC1370f handlerC1370f = this.f7265y;
        if (handlerC1370f != null) {
            handlerC1370f.m5718f();
            this.f7265y.removeMessages(1);
        }
        AsyncTaskC1367c asyncTaskC1367c = this.f7263w;
        if (asyncTaskC1367c != null) {
            asyncTaskC1367c.cancel(true);
        }
        this.f7243e.m5694i();
        InterfaceC2996a interfaceC2996a = this.f7232U;
        if (interfaceC2996a != null && this.f7233V) {
            interfaceC2996a.m10099c();
        }
        PdfiumCore pdfiumCore = this.f7230S;
        if (pdfiumCore != null && (c1671a = this.f7231T) != null) {
            pdfiumCore.m5721a(c1671a);
        }
        this.f7265y = null;
        this.f7248h = null;
        this.f7249i = null;
        this.f7250j = null;
        this.f7231T = null;
        this.f7232U = null;
        this.f7233V = false;
        this.f7259s = IGoodView.DEFAULT_TO_ALPHA;
        this.f7258r = IGoodView.DEFAULT_TO_ALPHA;
        this.f7260t = 1.0f;
        this.f7261u = true;
        this.f7262v = EnumC1364d.DEFAULT;
    }

    /* renamed from: U */
    void m5644U() {
        invalidate();
    }

    /* renamed from: V */
    public void m5645V() {
        m5652c0(this.f7235a);
    }

    /* renamed from: W */
    public void m5646W(float f4, boolean z3) {
        if (this.f7229N) {
            m5640Q(this.f7258r, ((-m5654p()) + getHeight()) * f4, z3);
        } else {
            m5640Q(((-m5654p()) + getWidth()) * f4, this.f7259s, z3);
        }
        m5636M();
    }

    /* renamed from: X */
    void m5647X(int i4) {
        if (this.f7261u) {
            return;
        }
        int iM5623s = m5623s(i4);
        this.f7252l = iM5623s;
        this.f7253m = iM5623s;
        int[] iArr = this.f7250j;
        if (iArr != null && iM5623s >= 0 && iM5623s < iArr.length) {
            this.f7253m = iArr[iM5623s];
        }
        m5637N();
        if (this.f7232U != null && !m5656u()) {
            this.f7232U.m10097a(this.f7252l + 1);
        }
        InterfaceC2884d interfaceC2884d = this.f7218C;
        if (interfaceC2884d != null) {
            interfaceC2884d.mo4950a(this.f7252l, getPageCount());
        }
    }

    /* renamed from: Y */
    public float m5648Y(float f4) {
        return f4 * this.f7260t;
    }

    /* renamed from: Z */
    public void m5649Z(float f4, PointF pointF) {
        m5650a0(this.f7260t * f4, pointF);
    }

    /* renamed from: a0 */
    public void m5650a0(float f4, PointF pointF) {
        float f5 = f4 / this.f7260t;
        m5651b0(f4);
        float f6 = this.f7258r * f5;
        float f7 = this.f7259s * f5;
        float f8 = pointF.x;
        float f9 = pointF.y;
        m5639P(f6 + (f8 - (f8 * f5)), f7 + (f9 - (f5 * f9)));
    }

    /* renamed from: b0 */
    public void m5651b0(float f4) {
        this.f7260t = f4;
    }

    /* renamed from: c0 */
    public void m5652c0(float f4) {
        this.f7245f.m5683h(getWidth() / 2, getHeight() / 2, this.f7260t, f4);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.f7229N) {
            if (i4 >= 0 || this.f7258r >= IGoodView.DEFAULT_TO_ALPHA) {
                return i4 > 0 && this.f7258r + m5648Y(this.f7256p) > ((float) getWidth());
            }
            return true;
        }
        if (i4 >= 0 || this.f7258r >= IGoodView.DEFAULT_TO_ALPHA) {
            return i4 > 0 && this.f7258r + m5654p() > ((float) getWidth());
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        if (this.f7229N) {
            if (i4 >= 0 || this.f7259s >= IGoodView.DEFAULT_TO_ALPHA) {
                return i4 > 0 && this.f7259s + m5654p() > ((float) getHeight());
            }
            return true;
        }
        if (i4 >= 0 || this.f7259s >= IGoodView.DEFAULT_TO_ALPHA) {
            return i4 > 0 && this.f7259s + m5648Y(this.f7257q) > ((float) getHeight());
        }
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        this.f7245f.m5679c();
    }

    /* renamed from: d0 */
    public void m5653d0(float f4, float f5, float f6) {
        this.f7245f.m5683h(f4, f5, this.f7260t, f6);
    }

    public int getCurrentPage() {
        return this.f7252l;
    }

    public float getCurrentXOffset() {
        return this.f7258r;
    }

    public float getCurrentYOffset() {
        return this.f7259s;
    }

    public C1671a.b getDocumentMeta() {
        C1671a c1671a = this.f7231T;
        if (c1671a == null) {
            return null;
        }
        return this.f7230S.m5722b(c1671a);
    }

    int getDocumentPageCount() {
        return this.f7251k;
    }

    int[] getFilteredUserPageIndexes() {
        return this.f7250j;
    }

    int[] getFilteredUserPages() {
        return this.f7249i;
    }

    public int getInvalidPageColor() {
        return this.f7227L;
    }

    public float getMaxZoom() {
        return this.f7239c;
    }

    public float getMidZoom() {
        return this.f7237b;
    }

    public float getMinZoom() {
        return this.f7235a;
    }

    InterfaceC2884d getOnPageChangeListener() {
        return this.f7218C;
    }

    InterfaceC2886f getOnPageScrollListener() {
        return this.f7219D;
    }

    InterfaceC2887g getOnRenderListener() {
        return this.f7222G;
    }

    InterfaceC2888h getOnTapListener() {
        return this.f7223H;
    }

    public float getOptimalPageHeight() {
        return this.f7257q;
    }

    public float getOptimalPageWidth() {
        return this.f7256p;
    }

    int[] getOriginalUserPages() {
        return this.f7248h;
    }

    public int getPageCount() {
        int[] iArr = this.f7248h;
        return iArr != null ? iArr.length : this.f7251k;
    }

    public float getPositionOffset() {
        float f4;
        float fM5654p;
        int width;
        if (this.f7229N) {
            f4 = -this.f7259s;
            fM5654p = m5654p();
            width = getHeight();
        } else {
            f4 = -this.f7258r;
            fM5654p = m5654p();
            width = getWidth();
        }
        return C3028c.m10164c(f4 / (fM5654p - width), IGoodView.DEFAULT_TO_ALPHA, 1.0f);
    }

    EnumC1363c getScrollDir() {
        return this.f7241d;
    }

    InterfaceC2996a getScrollHandle() {
        return this.f7232U;
    }

    int getSpacingPx() {
        return this.f7244e0;
    }

    public List<C1671a.a> getTableOfContents() {
        C1671a c1671a = this.f7231T;
        return c1671a == null ? new ArrayList() : this.f7230S.m5726g(c1671a);
    }

    public float getZoom() {
        return this.f7260t;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        m5643T();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            return;
        }
        if (this.f7240c0) {
            canvas.setDrawFilter(this.f7242d0);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(-1);
        } else {
            background.draw(canvas);
        }
        if (!this.f7261u && this.f7262v == EnumC1364d.SHOWN) {
            float f4 = this.f7258r;
            float f5 = this.f7259s;
            canvas.translate(f4, f5);
            Iterator<C2907a> it = this.f7243e.m5692f().iterator();
            while (it.hasNext()) {
                m5624v(canvas, it.next());
            }
            for (C2907a c2907a : this.f7243e.m5691e()) {
                m5624v(canvas, c2907a);
                if (this.f7221F != null && !this.f7246f0.contains(Integer.valueOf(c2907a.m9977f()))) {
                    this.f7246f0.add(Integer.valueOf(c2907a.m9977f()));
                }
            }
            Iterator<Integer> it2 = this.f7246f0.iterator();
            while (it2.hasNext()) {
                m5625w(canvas, it2.next().intValue(), this.f7221F);
            }
            this.f7246f0.clear();
            m5625w(canvas, this.f7252l, this.f7220E);
            canvas.translate(-f4, -f5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (isInEditMode() || this.f7262v != EnumC1364d.SHOWN) {
            return;
        }
        this.f7245f.m5684i();
        m5621q();
        if (this.f7229N) {
            m5639P(this.f7258r, -m5622r(this.f7252l));
        } else {
            m5639P(-m5622r(this.f7252l), this.f7259s);
        }
        m5636M();
    }

    /* renamed from: p */
    float m5654p() {
        int pageCount = getPageCount();
        return this.f7229N ? m5648Y((pageCount * this.f7257q) + ((pageCount - 1) * this.f7244e0)) : m5648Y((pageCount * this.f7256p) + ((pageCount - 1) * this.f7244e0));
    }

    public void setMaxZoom(float f4) {
        this.f7239c = f4;
    }

    public void setMidZoom(float f4) {
        this.f7237b = f4;
    }

    public void setMinZoom(float f4) {
        this.f7235a = f4;
    }

    public void setPositionOffset(float f4) {
        m5646W(f4, true);
    }

    public void setSwipeVertical(boolean z3) {
        this.f7229N = z3;
    }

    /* renamed from: t */
    public boolean m5655t() {
        return this.f7238b0;
    }

    /* renamed from: u */
    public boolean m5656u() {
        int pageCount = getPageCount();
        int i4 = (pageCount - 1) * this.f7244e0;
        return this.f7229N ? (((float) pageCount) * this.f7257q) + ((float) i4) < ((float) getHeight()) : (((float) pageCount) * this.f7256p) + ((float) i4) < ((float) getWidth());
    }

    /* renamed from: x */
    public void m5657x(boolean z3) {
        this.f7236a0 = z3;
    }

    /* renamed from: y */
    public void m5658y(boolean z3) {
        this.f7240c0 = z3;
    }

    /* renamed from: z */
    public void m5659z(boolean z3) {
        this.f7247g.m5700a(z3);
    }
}
