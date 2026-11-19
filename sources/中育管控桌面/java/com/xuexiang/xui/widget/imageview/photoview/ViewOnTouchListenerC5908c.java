package com.xuexiang.xui.widget.imageview.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import p062g2.AbstractC6395a;
import p069h2.AbstractC6453f;
import p069h2.InterfaceC6451d;
import p069h2.InterfaceC6452e;
import p076i2.AbstractC6519c;
import p133q1.AbstractC7620c;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.c */
/* loaded from: classes3.dex */
public class ViewOnTouchListenerC5908c implements InterfaceC5907b, View.OnTouchListener, InterfaceC6452e, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: B */
    public static final boolean f5069B = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: C */
    public static int f5070C = 1;

    /* renamed from: A */
    public ImageView.ScaleType f5071A;

    /* renamed from: a */
    public Interpolator f5072a;

    /* renamed from: b */
    public int f5073b;

    /* renamed from: c */
    public float f5074c;

    /* renamed from: d */
    public float f5075d;

    /* renamed from: e */
    public float f5076e;

    /* renamed from: f */
    public boolean f5077f;

    /* renamed from: g */
    public boolean f5078g;

    /* renamed from: h */
    public WeakReference f5079h;

    /* renamed from: i */
    public GestureDetector f5080i;

    /* renamed from: j */
    public InterfaceC6451d f5081j;

    /* renamed from: k */
    public final Matrix f5082k;

    /* renamed from: l */
    public final Matrix f5083l;

    /* renamed from: m */
    public final Matrix f5084m;

    /* renamed from: n */
    public final RectF f5085n;

    /* renamed from: o */
    public final float[] f5086o;

    /* renamed from: p */
    public f f5087p;

    /* renamed from: q */
    public i f5088q;

    /* renamed from: r */
    public View.OnLongClickListener f5089r;

    /* renamed from: s */
    public int f5090s;

    /* renamed from: t */
    public int f5091t;

    /* renamed from: u */
    public int f5092u;

    /* renamed from: v */
    public int f5093v;

    /* renamed from: w */
    public d f5094w;

    /* renamed from: x */
    public int f5095x;

    /* renamed from: y */
    public float f5096y;

    /* renamed from: z */
    public boolean f5097z;

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
            ViewOnTouchListenerC5908c.m4721e(ViewOnTouchListenerC5908c.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC5908c.this.f5089r != null && ViewOnTouchListenerC5908c.this.m4769u().getY() == 0.0f && ViewOnTouchListenerC5908c.this.m4769u().getX() == 0.0f) {
                ViewOnTouchListenerC5908c.this.f5089r.onLongClick(ViewOnTouchListenerC5908c.this.m4769u());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5099a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5099a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5099a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5099a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5099a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5099a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final float f5100a;

        /* renamed from: b */
        public final float f5101b;

        /* renamed from: c */
        public final long f5102c = System.currentTimeMillis();

        /* renamed from: d */
        public final float f5103d;

        /* renamed from: e */
        public final float f5104e;

        public c(float f6, float f7, float f8, float f9) {
            this.f5100a = f8;
            this.f5101b = f9;
            this.f5103d = f6;
            this.f5104e = f7;
        }

        /* renamed from: a */
        public final float m4775a() {
            return ViewOnTouchListenerC5908c.this.f5072a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f5102c) * 1.0f) / ViewOnTouchListenerC5908c.this.f5073b));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM4769u = ViewOnTouchListenerC5908c.this.m4769u();
            if (imageViewM4769u == null) {
                return;
            }
            float fM4775a = m4775a();
            float f6 = this.f5103d;
            ViewOnTouchListenerC5908c.this.mo4753b((f6 + ((this.f5104e - f6) * fM4775a)) / ViewOnTouchListenerC5908c.this.m4730C(), this.f5100a, this.f5101b);
            if (fM4775a < 1.0f) {
                AbstractC6395a.m6915c(imageViewM4769u, this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final AbstractC6519c f5106a;

        /* renamed from: b */
        public int f5107b;

        /* renamed from: c */
        public int f5108c;

        public d(Context context) {
            this.f5106a = AbstractC6519c.m7267f(context);
        }

        /* renamed from: a */
        public void m4776a() {
            if (ViewOnTouchListenerC5908c.f5069B) {
                AbstractC7620c.m9060b("PhotoViewAttacher", "Cancel Fling");
            }
            this.f5106a.mo7262c(true);
        }

        /* renamed from: b */
        public void m4777b(int i6, int i7, int i8, int i9) {
            int i10;
            int iRound;
            int i11;
            int iRound2;
            RectF rectFM4765q = ViewOnTouchListenerC5908c.this.m4765q();
            if (rectFM4765q == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM4765q.left);
            float f6 = i6;
            if (f6 < rectFM4765q.width()) {
                iRound = Math.round(rectFM4765q.width() - f6);
                i10 = 0;
            } else {
                i10 = iRound3;
                iRound = i10;
            }
            int iRound4 = Math.round(-rectFM4765q.top);
            float f7 = i7;
            if (f7 < rectFM4765q.height()) {
                iRound2 = Math.round(rectFM4765q.height() - f7);
                i11 = 0;
            } else {
                i11 = iRound4;
                iRound2 = i11;
            }
            this.f5107b = iRound3;
            this.f5108c = iRound4;
            if (ViewOnTouchListenerC5908c.f5069B) {
                AbstractC7620c.m9060b("PhotoViewAttacher", "fling. StartX:" + iRound3 + " StartY:" + iRound4 + " MaxX:" + iRound + " MaxY:" + iRound2);
            }
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f5106a.mo7261b(iRound3, iRound4, i8, i9, i10, iRound, i11, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM4769u;
            if (this.f5106a.mo7265g() || (imageViewM4769u = ViewOnTouchListenerC5908c.this.m4769u()) == null || !this.f5106a.mo7266a()) {
                return;
            }
            int iMo7263d = this.f5106a.mo7263d();
            int iMo7264e = this.f5106a.mo7264e();
            if (ViewOnTouchListenerC5908c.f5069B) {
                AbstractC7620c.m9060b("PhotoViewAttacher", "fling run(). CurrentX:" + this.f5107b + " CurrentY:" + this.f5108c + " NewX:" + iMo7263d + " NewY:" + iMo7264e);
            }
            ViewOnTouchListenerC5908c.this.f5084m.postTranslate(this.f5107b - iMo7263d, this.f5108c - iMo7264e);
            ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = ViewOnTouchListenerC5908c.this;
            viewOnTouchListenerC5908c.m4736K(viewOnTouchListenerC5908c.m4767s());
            this.f5107b = iMo7263d;
            this.f5108c = iMo7264e;
            AbstractC6395a.m6915c(imageViewM4769u, this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$e */
    public interface e {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$f */
    public interface f {
        /* renamed from: a */
        void mo4778a();

        /* renamed from: b */
        void mo4779b(View view, float f6, float f7);
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$g */
    public interface g {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$h */
    public interface h {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$i */
    public interface i {
        /* renamed from: a */
        void mo4780a(View view, float f6, float f7);
    }

    public ViewOnTouchListenerC5908c(ImageView imageView) {
        this(imageView, true);
    }

    /* renamed from: G */
    public static boolean m4717G(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    /* renamed from: H */
    public static boolean m4718H(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (b.f5099a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* renamed from: L */
    public static void m4719L(ImageView imageView) {
        if (imageView == null || (imageView instanceof InterfaceC5907b)) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (scaleType.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    /* renamed from: e */
    public static /* synthetic */ h m4721e(ViewOnTouchListenerC5908c viewOnTouchListenerC5908c) {
        viewOnTouchListenerC5908c.getClass();
        return null;
    }

    /* renamed from: o */
    public static void m4727o(float f6, float f7, float f8) {
        if (f6 >= f7) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f7 >= f8) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: A */
    public f m4728A() {
        return this.f5087p;
    }

    /* renamed from: B */
    public i m4729B() {
        return this.f5088q;
    }

    /* renamed from: C */
    public float m4730C() {
        return (float) Math.sqrt(((float) Math.pow(m4732E(this.f5084m, 0), 2.0d)) + ((float) Math.pow(m4732E(this.f5084m, 3), 2.0d)));
    }

    /* renamed from: D */
    public ImageView.ScaleType m4731D() {
        return this.f5071A;
    }

    /* renamed from: E */
    public final float m4732E(Matrix matrix, int i6) {
        matrix.getValues(this.f5086o);
        return this.f5086o[i6];
    }

    /* renamed from: F */
    public Bitmap m4733F() {
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u == null) {
            return null;
        }
        return imageViewM4769u.getDrawingCache();
    }

    /* renamed from: I */
    public void m4734I() {
        this.f5084m.reset();
        m4747W(this.f5096y);
        m4736K(m4767s());
        m4763n();
    }

    /* renamed from: J */
    public void m4735J(boolean z6) {
        this.f5077f = z6;
    }

    /* renamed from: K */
    public final void m4736K(Matrix matrix) {
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u != null) {
            m4762m();
            imageViewM4769u.setImageMatrix(matrix);
        }
    }

    /* renamed from: M */
    public void m4737M(float f6) {
        m4727o(this.f5074c, this.f5075d, f6);
        this.f5076e = f6;
    }

    /* renamed from: N */
    public void m4738N(float f6) {
        m4727o(this.f5074c, f6, this.f5076e);
        this.f5075d = f6;
    }

    /* renamed from: O */
    public void m4739O(float f6) {
        m4727o(f6, this.f5075d, this.f5076e);
        this.f5074c = f6;
    }

    /* renamed from: P */
    public void m4740P(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f5080i.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f5080i.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC5906a(this));
        }
    }

    /* renamed from: Q */
    public void m4741Q(View.OnLongClickListener onLongClickListener) {
        this.f5089r = onLongClickListener;
    }

    /* renamed from: R */
    public void m4742R(e eVar) {
    }

    /* renamed from: S */
    public void m4743S(f fVar) {
        this.f5087p = fVar;
    }

    /* renamed from: T */
    public void m4744T(g gVar) {
    }

    /* renamed from: U */
    public void m4745U(h hVar) {
    }

    /* renamed from: V */
    public void m4746V(i iVar) {
        this.f5088q = iVar;
    }

    /* renamed from: W */
    public void m4747W(float f6) {
        this.f5084m.postRotate(f6 % 360.0f);
        m4761l();
    }

    /* renamed from: X */
    public void m4748X(float f6) {
        this.f5084m.setRotate(f6 % 360.0f);
        m4761l();
    }

    /* renamed from: Y */
    public void m4749Y(float f6) {
        m4752a0(f6, false);
    }

    /* renamed from: Z */
    public void m4750Z(float f6, float f7, float f8, boolean z6) {
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u != null) {
            if (f6 < this.f5074c || f6 > this.f5076e) {
                AbstractC7620c.m9064f("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            } else if (z6) {
                imageViewM4769u.post(new c(m4730C(), f6, f7, f8));
            } else {
                this.f5084m.setScale(f6, f6, f7, f8);
                m4761l();
            }
        }
    }

    @Override // p069h2.InterfaceC6452e
    /* renamed from: a */
    public void mo4751a(float f6, float f7) {
        if (this.f5081j.mo7096d()) {
            return;
        }
        if (f5069B) {
            AbstractC7620c.m9060b("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f6), Float.valueOf(f7)));
        }
        ImageView imageViewM4769u = m4769u();
        this.f5084m.postTranslate(f6, f7);
        m4761l();
        ViewParent parent = imageViewM4769u.getParent();
        if (!this.f5077f || this.f5081j.mo7096d() || this.f5078g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i6 = this.f5095x;
        if ((i6 == 2 || ((i6 == 0 && f6 >= 1.0f) || (i6 == 1 && f6 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: a0 */
    public void m4752a0(float f6, boolean z6) {
        if (m4769u() != null) {
            m4750Z(f6, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z6);
        }
    }

    @Override // p069h2.InterfaceC6452e
    /* renamed from: b */
    public void mo4753b(float f6, float f7, float f8) {
        if (f5069B) {
            AbstractC7620c.m9060b("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)));
        }
        if (m4730C() < this.f5076e || f6 < 1.0f) {
            if (m4730C() > this.f5074c || f6 > 1.0f) {
                this.f5084m.postScale(f6, f6, f7, f8);
                m4761l();
            }
        }
    }

    /* renamed from: b0 */
    public void m4754b0(ImageView.ScaleType scaleType) {
        if (!m4718H(scaleType) || scaleType == this.f5071A) {
            return;
        }
        this.f5071A = scaleType;
        m4758e0();
    }

    @Override // p069h2.InterfaceC6452e
    /* renamed from: c */
    public void mo4755c(float f6, float f7, float f8, float f9) {
        if (f5069B) {
            AbstractC7620c.m9060b("PhotoViewAttacher", "onFling. sX: " + f6 + " sY: " + f7 + " Vx: " + f8 + " Vy: " + f9);
        }
        ImageView imageViewM4769u = m4769u();
        d dVar = new d(imageViewM4769u.getContext());
        this.f5094w = dVar;
        dVar.m4777b(m4771w(imageViewM4769u), m4770v(imageViewM4769u), (int) f8, (int) f9);
        imageViewM4769u.post(this.f5094w);
    }

    /* renamed from: c0 */
    public void m4756c0(int i6) {
        if (i6 < 0) {
            i6 = 200;
        }
        this.f5073b = i6;
    }

    /* renamed from: d0 */
    public void m4757d0(boolean z6) {
        this.f5097z = z6;
        m4758e0();
    }

    /* renamed from: e0 */
    public void m4758e0() {
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u != null) {
            if (!this.f5097z) {
                m4734I();
            } else {
                m4719L(imageViewM4769u);
                m4759f0(imageViewM4769u.getDrawable());
            }
        }
    }

    /* renamed from: f0 */
    public final void m4759f0(Drawable drawable) {
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u == null || drawable == null) {
            return;
        }
        float fM4771w = m4771w(imageViewM4769u);
        float fM4770v = m4770v(imageViewM4769u);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f5082k.reset();
        float f6 = intrinsicWidth;
        float f7 = fM4771w / f6;
        float f8 = intrinsicHeight;
        float f9 = fM4770v / f8;
        ImageView.ScaleType scaleType = this.f5071A;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f5082k.postTranslate((fM4771w - f6) / 2.0f, (fM4770v - f8) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f7, f9);
            this.f5082k.postScale(fMax, fMax);
            this.f5082k.postTranslate((fM4771w - (f6 * fMax)) / 2.0f, (fM4770v - (f8 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f7, f9));
            this.f5082k.postScale(fMin, fMin);
            this.f5082k.postTranslate((fM4771w - (f6 * fMin)) / 2.0f, (fM4770v - (f8 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f6, f8);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM4771w, fM4770v);
            if (((int) this.f5096y) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f8, f6);
            }
            int i6 = b.f5099a[this.f5071A.ordinal()];
            if (i6 == 2) {
                this.f5082k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i6 == 3) {
                this.f5082k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i6 == 4) {
                this.f5082k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i6 == 5) {
                this.f5082k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m4734I();
    }

    /* renamed from: k */
    public final void m4760k() {
        d dVar = this.f5094w;
        if (dVar != null) {
            dVar.m4776a();
            this.f5094w = null;
        }
    }

    /* renamed from: l */
    public final void m4761l() {
        if (m4763n()) {
            m4736K(m4767s());
        }
    }

    /* renamed from: m */
    public final void m4762m() {
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u != null && !(imageViewM4769u instanceof InterfaceC5907b) && !ImageView.ScaleType.MATRIX.equals(imageViewM4769u.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    /* renamed from: n */
    public final boolean m4763n() {
        RectF rectFM4766r;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u == null || (rectFM4766r = m4766r(m4767s())) == null) {
            return false;
        }
        float fHeight = rectFM4766r.height();
        float fWidth = rectFM4766r.width();
        float fM4770v = m4770v(imageViewM4769u);
        float f12 = 0.0f;
        if (fHeight <= fM4770v) {
            int i6 = b.f5099a[this.f5071A.ordinal()];
            if (i6 != 2) {
                if (i6 != 3) {
                    fM4770v = (fM4770v - fHeight) / 2.0f;
                    f7 = rectFM4766r.top;
                } else {
                    fM4770v -= fHeight;
                    f7 = rectFM4766r.top;
                }
            } else {
                f6 = rectFM4766r.top;
                f8 = -f6;
            }
        } else {
            f6 = rectFM4766r.top;
            if (f6 > 0.0f) {
                f8 = -f6;
            } else {
                f7 = rectFM4766r.bottom;
                f8 = f7 < fM4770v ? fM4770v - f7 : 0.0f;
            }
        }
        float fM4771w = m4771w(imageViewM4769u);
        if (fWidth <= fM4771w) {
            int i7 = b.f5099a[this.f5071A.ordinal()];
            if (i7 != 2) {
                if (i7 != 3) {
                    f10 = (fM4771w - fWidth) / 2.0f;
                    f11 = rectFM4766r.left;
                } else {
                    f10 = fM4771w - fWidth;
                    f11 = rectFM4766r.left;
                }
                f9 = f10 - f11;
            } else {
                f9 = -rectFM4766r.left;
            }
            f12 = f9;
            this.f5095x = 2;
        } else {
            float f13 = rectFM4766r.left;
            if (f13 > 0.0f) {
                this.f5095x = 0;
                f12 = -f13;
            } else {
                float f14 = rectFM4766r.right;
                if (f14 < fM4771w) {
                    f12 = fM4771w - f14;
                    this.f5095x = 1;
                } else {
                    this.f5095x = -1;
                }
            }
        }
        this.f5084m.postTranslate(f12, f8);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u != null) {
            if (!this.f5097z) {
                m4759f0(imageViewM4769u.getDrawable());
                return;
            }
            int top = imageViewM4769u.getTop();
            int right = imageViewM4769u.getRight();
            int bottom = imageViewM4769u.getBottom();
            int left = imageViewM4769u.getLeft();
            if (top == this.f5090s && bottom == this.f5092u && left == this.f5093v && right == this.f5091t) {
                return;
            }
            m4759f0(imageViewM4769u.getDrawable());
            this.f5090s = top;
            this.f5091t = right;
            this.f5092u = bottom;
            this.f5093v = left;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f5097z
            r1 = 0
            if (r0 == 0) goto L9d
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = m4717G(r0)
            if (r0 == 0) goto L9d
            android.view.ViewParent r0 = r11.getParent()
            int r2 = r12.getAction()
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 == r3) goto L20
            r0 = 3
            if (r2 == r0) goto L20
        L1e:
            r5 = r10
            goto L5a
        L20:
            float r0 = r10.m4730C()
            float r2 = r10.f5074c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1e
            android.graphics.RectF r0 = r10.m4765q()
            if (r0 == 0) goto L1e
            com.xuexiang.xui.widget.imageview.photoview.c$c r4 = new com.xuexiang.xui.widget.imageview.photoview.c$c
            float r6 = r10.m4730C()
            float r7 = r10.f5074c
            float r8 = r0.centerX()
            float r9 = r0.centerY()
            r5 = r10
            r4.<init>(r6, r7, r8, r9)
            r11.post(r4)
            r11 = r3
            goto L5b
        L49:
            r5 = r10
            if (r0 == 0) goto L50
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L57
        L50:
            java.lang.String r11 = "PhotoViewAttacher"
            java.lang.String r0 = "onTouch getParent() returned null"
            p133q1.AbstractC7620c.m9064f(r11, r0)
        L57:
            r10.m4760k()
        L5a:
            r11 = r1
        L5b:
            h2.d r0 = r5.f5081j
            if (r0 == 0) goto L91
            boolean r11 = r0.mo7096d()
            h2.d r0 = r5.f5081j
            boolean r0 = r0.mo7092b()
            h2.d r2 = r5.f5081j
            boolean r2 = r2.mo7091a(r12)
            if (r11 != 0) goto L7b
            h2.d r11 = r5.f5081j
            boolean r11 = r11.mo7096d()
            if (r11 != 0) goto L7b
            r11 = r3
            goto L7c
        L7b:
            r11 = r1
        L7c:
            if (r0 != 0) goto L88
            h2.d r0 = r5.f5081j
            boolean r0 = r0.mo7092b()
            if (r0 != 0) goto L88
            r0 = r3
            goto L89
        L88:
            r0 = r1
        L89:
            if (r11 == 0) goto L8e
            if (r0 == 0) goto L8e
            r1 = r3
        L8e:
            r5.f5078g = r1
            r11 = r2
        L91:
            android.view.GestureDetector r0 = r5.f5080i
            if (r0 == 0) goto L9c
            boolean r12 = r0.onTouchEvent(r12)
            if (r12 == 0) goto L9c
            return r3
        L9c:
            return r11
        L9d:
            r5 = r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC5908c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m4764p() {
        WeakReference weakReference = this.f5079h;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            m4760k();
        }
        GestureDetector gestureDetector = this.f5080i;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f5087p = null;
        this.f5088q = null;
        this.f5089r = null;
        this.f5079h = null;
    }

    /* renamed from: q */
    public RectF m4765q() {
        m4763n();
        return m4766r(m4767s());
    }

    /* renamed from: r */
    public final RectF m4766r(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM4769u = m4769u();
        if (imageViewM4769u == null || (drawable = imageViewM4769u.getDrawable()) == null) {
            return null;
        }
        this.f5085n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f5085n);
        return this.f5085n;
    }

    /* renamed from: s */
    public final Matrix m4767s() {
        this.f5083l.set(this.f5082k);
        this.f5083l.postConcat(this.f5084m);
        return this.f5083l;
    }

    /* renamed from: t */
    public Matrix m4768t() {
        return this.f5083l;
    }

    /* renamed from: u */
    public ImageView m4769u() {
        WeakReference weakReference = this.f5079h;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m4764p();
            AbstractC7620c.m9064f("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    /* renamed from: v */
    public final int m4770v(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: w */
    public final int m4771w(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: x */
    public float m4772x() {
        return this.f5076e;
    }

    /* renamed from: y */
    public float m4773y() {
        return this.f5075d;
    }

    /* renamed from: z */
    public float m4774z() {
        return this.f5074c;
    }

    public ViewOnTouchListenerC5908c(ImageView imageView, boolean z6) {
        this.f5072a = new AccelerateDecelerateInterpolator();
        this.f5073b = 200;
        this.f5074c = 1.0f;
        this.f5075d = 1.75f;
        this.f5076e = 3.0f;
        this.f5077f = true;
        this.f5078g = false;
        this.f5082k = new Matrix();
        this.f5083l = new Matrix();
        this.f5084m = new Matrix();
        this.f5085n = new RectF();
        this.f5086o = new float[9];
        this.f5095x = 2;
        this.f5071A = ImageView.ScaleType.FIT_CENTER;
        this.f5079h = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m4719L(imageView);
        this.f5081j = AbstractC6453f.m7097a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f5080i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC5906a(this));
        this.f5096y = 0.0f;
        m4757d0(z6);
    }
}
