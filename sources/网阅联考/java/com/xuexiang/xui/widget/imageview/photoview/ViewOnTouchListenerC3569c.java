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
import p082k0.AbstractC3857c;
import p135w0.AbstractC4638a;
import p139x0.AbstractC4662f;
import p139x0.InterfaceC4660d;
import p139x0.InterfaceC4661e;
import p143y0.AbstractC4684c;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.c */
/* loaded from: classes2.dex */
public class ViewOnTouchListenerC3569c implements InterfaceC3568b, View.OnTouchListener, InterfaceC4661e, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: B */
    public static final boolean f3548B = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: C */
    public static int f3549C = 1;

    /* renamed from: A */
    public ImageView.ScaleType f3550A;

    /* renamed from: a */
    public Interpolator f3551a;

    /* renamed from: b */
    public int f3552b;

    /* renamed from: c */
    public float f3553c;

    /* renamed from: d */
    public float f3554d;

    /* renamed from: e */
    public float f3555e;

    /* renamed from: f */
    public boolean f3556f;

    /* renamed from: g */
    public boolean f3557g;

    /* renamed from: h */
    public WeakReference f3558h;

    /* renamed from: i */
    public GestureDetector f3559i;

    /* renamed from: j */
    public InterfaceC4660d f3560j;

    /* renamed from: k */
    public final Matrix f3561k;

    /* renamed from: l */
    public final Matrix f3562l;

    /* renamed from: m */
    public final Matrix f3563m;

    /* renamed from: n */
    public final RectF f3564n;

    /* renamed from: o */
    public final float[] f3565o;

    /* renamed from: p */
    public f f3566p;

    /* renamed from: q */
    public i f3567q;

    /* renamed from: r */
    public View.OnLongClickListener f3568r;

    /* renamed from: s */
    public int f3569s;

    /* renamed from: t */
    public int f3570t;

    /* renamed from: u */
    public int f3571u;

    /* renamed from: v */
    public int f3572v;

    /* renamed from: w */
    public d f3573w;

    /* renamed from: x */
    public int f3574x;

    /* renamed from: y */
    public float f3575y;

    /* renamed from: z */
    public boolean f3576z;

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
            ViewOnTouchListenerC3569c.m4344e(ViewOnTouchListenerC3569c.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC3569c.this.f3568r != null && ViewOnTouchListenerC3569c.this.m4392u().getY() == 0.0f && ViewOnTouchListenerC3569c.this.m4392u().getX() == 0.0f) {
                ViewOnTouchListenerC3569c.this.f3568r.onLongClick(ViewOnTouchListenerC3569c.this.m4392u());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3578a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f3578a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3578a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3578a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3578a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3578a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final float f3579a;

        /* renamed from: b */
        public final float f3580b;

        /* renamed from: c */
        public final long f3581c = System.currentTimeMillis();

        /* renamed from: d */
        public final float f3582d;

        /* renamed from: e */
        public final float f3583e;

        public c(float f4, float f5, float f6, float f7) {
            this.f3579a = f6;
            this.f3580b = f7;
            this.f3582d = f4;
            this.f3583e = f5;
        }

        /* renamed from: a */
        public final float m4398a() {
            return ViewOnTouchListenerC3569c.this.f3551a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f3581c) * 1.0f) / ViewOnTouchListenerC3569c.this.f3552b));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM4392u = ViewOnTouchListenerC3569c.this.m4392u();
            if (imageViewM4392u == null) {
                return;
            }
            float fM4398a = m4398a();
            float f4 = this.f3582d;
            ViewOnTouchListenerC3569c.this.mo4374a((f4 + ((this.f3583e - f4) * fM4398a)) / ViewOnTouchListenerC3569c.this.m4353C(), this.f3579a, this.f3580b);
            if (fM4398a < 1.0f) {
                AbstractC4638a.m6461c(imageViewM4392u, this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final AbstractC4684c f3585a;

        /* renamed from: b */
        public int f3586b;

        /* renamed from: c */
        public int f3587c;

        public d(Context context) {
            this.f3585a = AbstractC4684c.m6618f(context);
        }

        /* renamed from: a */
        public void m4399a() {
            if (ViewOnTouchListenerC3569c.f3548B) {
                AbstractC3857c.m5160b("PhotoViewAttacher", "Cancel Fling");
            }
            this.f3585a.mo6613c(true);
        }

        /* renamed from: b */
        public void m4400b(int i4, int i5, int i6, int i7) {
            int i8;
            int iRound;
            int i9;
            int iRound2;
            RectF rectFM4388q = ViewOnTouchListenerC3569c.this.m4388q();
            if (rectFM4388q == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM4388q.left);
            float f4 = i4;
            if (f4 < rectFM4388q.width()) {
                iRound = Math.round(rectFM4388q.width() - f4);
                i8 = 0;
            } else {
                i8 = iRound3;
                iRound = i8;
            }
            int iRound4 = Math.round(-rectFM4388q.top);
            float f5 = i5;
            if (f5 < rectFM4388q.height()) {
                iRound2 = Math.round(rectFM4388q.height() - f5);
                i9 = 0;
            } else {
                i9 = iRound4;
                iRound2 = i9;
            }
            this.f3586b = iRound3;
            this.f3587c = iRound4;
            if (ViewOnTouchListenerC3569c.f3548B) {
                AbstractC3857c.m5160b("PhotoViewAttacher", "fling. StartX:" + iRound3 + " StartY:" + iRound4 + " MaxX:" + iRound + " MaxY:" + iRound2);
            }
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f3585a.mo6612b(iRound3, iRound4, i6, i7, i8, iRound, i9, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM4392u;
            if (this.f3585a.mo6616g() || (imageViewM4392u = ViewOnTouchListenerC3569c.this.m4392u()) == null || !this.f3585a.mo6617a()) {
                return;
            }
            int iMo6614d = this.f3585a.mo6614d();
            int iMo6615e = this.f3585a.mo6615e();
            if (ViewOnTouchListenerC3569c.f3548B) {
                AbstractC3857c.m5160b("PhotoViewAttacher", "fling run(). CurrentX:" + this.f3586b + " CurrentY:" + this.f3587c + " NewX:" + iMo6614d + " NewY:" + iMo6615e);
            }
            ViewOnTouchListenerC3569c.this.f3563m.postTranslate(this.f3586b - iMo6614d, this.f3587c - iMo6615e);
            ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = ViewOnTouchListenerC3569c.this;
            viewOnTouchListenerC3569c.m4359K(viewOnTouchListenerC3569c.m4390s());
            this.f3586b = iMo6614d;
            this.f3587c = iMo6615e;
            AbstractC4638a.m6461c(imageViewM4392u, this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$e */
    public interface e {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$f */
    public interface f {
        /* renamed from: a */
        void mo4401a(View view, float f4, float f5);

        /* renamed from: b */
        void mo4402b();
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
        void mo4403a(View view, float f4, float f5);
    }

    public ViewOnTouchListenerC3569c(ImageView imageView) {
        this(imageView, true);
    }

    /* renamed from: G */
    public static boolean m4340G(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    /* renamed from: H */
    public static boolean m4341H(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (b.f3578a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* renamed from: L */
    public static void m4342L(ImageView imageView) {
        if (imageView == null || (imageView instanceof InterfaceC3568b) || ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: e */
    public static /* synthetic */ h m4344e(ViewOnTouchListenerC3569c viewOnTouchListenerC3569c) {
        viewOnTouchListenerC3569c.getClass();
        return null;
    }

    /* renamed from: o */
    public static void m4350o(float f4, float f5, float f6) {
        if (f4 >= f5) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f5 >= f6) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: A */
    public f m4351A() {
        return this.f3566p;
    }

    /* renamed from: B */
    public i m4352B() {
        return this.f3567q;
    }

    /* renamed from: C */
    public float m4353C() {
        return (float) Math.sqrt(((float) Math.pow(m4355E(this.f3563m, 0), 2.0d)) + ((float) Math.pow(m4355E(this.f3563m, 3), 2.0d)));
    }

    /* renamed from: D */
    public ImageView.ScaleType m4354D() {
        return this.f3550A;
    }

    /* renamed from: E */
    public final float m4355E(Matrix matrix, int i4) {
        matrix.getValues(this.f3565o);
        return this.f3565o[i4];
    }

    /* renamed from: F */
    public Bitmap m4356F() {
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u == null) {
            return null;
        }
        return imageViewM4392u.getDrawingCache();
    }

    /* renamed from: I */
    public void m4357I() {
        this.f3563m.reset();
        m4370W(this.f3575y);
        m4359K(m4390s());
        m4386n();
    }

    /* renamed from: J */
    public void m4358J(boolean z3) {
        this.f3556f = z3;
    }

    /* renamed from: K */
    public final void m4359K(Matrix matrix) {
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u != null) {
            m4385m();
            imageViewM4392u.setImageMatrix(matrix);
        }
    }

    /* renamed from: M */
    public void m4360M(float f4) {
        m4350o(this.f3553c, this.f3554d, f4);
        this.f3555e = f4;
    }

    /* renamed from: N */
    public void m4361N(float f4) {
        m4350o(this.f3553c, f4, this.f3555e);
        this.f3554d = f4;
    }

    /* renamed from: O */
    public void m4362O(float f4) {
        m4350o(f4, this.f3554d, this.f3555e);
        this.f3553c = f4;
    }

    /* renamed from: P */
    public void m4363P(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f3559i.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f3559i.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC3567a(this));
        }
    }

    /* renamed from: Q */
    public void m4364Q(View.OnLongClickListener onLongClickListener) {
        this.f3568r = onLongClickListener;
    }

    /* renamed from: R */
    public void m4365R(e eVar) {
    }

    /* renamed from: S */
    public void m4366S(f fVar) {
        this.f3566p = fVar;
    }

    /* renamed from: T */
    public void m4367T(g gVar) {
    }

    /* renamed from: U */
    public void m4368U(h hVar) {
    }

    /* renamed from: V */
    public void m4369V(i iVar) {
        this.f3567q = iVar;
    }

    /* renamed from: W */
    public void m4370W(float f4) {
        this.f3563m.postRotate(f4 % 360.0f);
        m4384l();
    }

    /* renamed from: X */
    public void m4371X(float f4) {
        this.f3563m.setRotate(f4 % 360.0f);
        m4384l();
    }

    /* renamed from: Y */
    public void m4372Y(float f4) {
        m4375a0(f4, false);
    }

    /* renamed from: Z */
    public void m4373Z(float f4, float f5, float f6, boolean z3) {
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u != null) {
            if (f4 < this.f3553c || f4 > this.f3555e) {
                AbstractC3857c.m5164f("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            } else if (z3) {
                imageViewM4392u.post(new c(m4353C(), f4, f5, f6));
            } else {
                this.f3563m.setScale(f4, f4, f5, f6);
                m4384l();
            }
        }
    }

    @Override // p139x0.InterfaceC4661e
    /* renamed from: a */
    public void mo4374a(float f4, float f5, float f6) {
        if (f3548B) {
            AbstractC3857c.m5160b("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6)));
        }
        if (m4353C() < this.f3555e || f4 < 1.0f) {
            if (m4353C() > this.f3553c || f4 > 1.0f) {
                this.f3563m.postScale(f4, f4, f5, f6);
                m4384l();
            }
        }
    }

    /* renamed from: a0 */
    public void m4375a0(float f4, boolean z3) {
        if (m4392u() != null) {
            m4373Z(f4, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z3);
        }
    }

    @Override // p139x0.InterfaceC4661e
    /* renamed from: b */
    public void mo4376b(float f4, float f5, float f6, float f7) {
        if (f3548B) {
            AbstractC3857c.m5160b("PhotoViewAttacher", "onFling. sX: " + f4 + " sY: " + f5 + " Vx: " + f6 + " Vy: " + f7);
        }
        ImageView imageViewM4392u = m4392u();
        d dVar = new d(imageViewM4392u.getContext());
        this.f3573w = dVar;
        dVar.m4400b(m4394w(imageViewM4392u), m4393v(imageViewM4392u), (int) f6, (int) f7);
        imageViewM4392u.post(this.f3573w);
    }

    /* renamed from: b0 */
    public void m4377b0(ImageView.ScaleType scaleType) {
        if (!m4341H(scaleType) || scaleType == this.f3550A) {
            return;
        }
        this.f3550A = scaleType;
        m4381e0();
    }

    @Override // p139x0.InterfaceC4661e
    /* renamed from: c */
    public void mo4378c(float f4, float f5) {
        if (this.f3560j.mo6560c()) {
            return;
        }
        if (f3548B) {
            AbstractC3857c.m5160b("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f4), Float.valueOf(f5)));
        }
        ImageView imageViewM4392u = m4392u();
        this.f3563m.postTranslate(f4, f5);
        m4384l();
        ViewParent parent = imageViewM4392u.getParent();
        if (!this.f3556f || this.f3560j.mo6560c() || this.f3557g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i4 = this.f3574x;
        if ((i4 == 2 || ((i4 == 0 && f4 >= 1.0f) || (i4 == 1 && f4 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: c0 */
    public void m4379c0(int i4) {
        if (i4 < 0) {
            i4 = 200;
        }
        this.f3552b = i4;
    }

    /* renamed from: d0 */
    public void m4380d0(boolean z3) {
        this.f3576z = z3;
        m4381e0();
    }

    /* renamed from: e0 */
    public void m4381e0() {
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u != null) {
            if (!this.f3576z) {
                m4357I();
            } else {
                m4342L(imageViewM4392u);
                m4382f0(imageViewM4392u.getDrawable());
            }
        }
    }

    /* renamed from: f0 */
    public final void m4382f0(Drawable drawable) {
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u == null || drawable == null) {
            return;
        }
        float fM4394w = m4394w(imageViewM4392u);
        float fM4393v = m4393v(imageViewM4392u);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f3561k.reset();
        float f4 = intrinsicWidth;
        float f5 = fM4394w / f4;
        float f6 = intrinsicHeight;
        float f7 = fM4393v / f6;
        ImageView.ScaleType scaleType = this.f3550A;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f3561k.postTranslate((fM4394w - f4) / 2.0f, (fM4393v - f6) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f5, f7);
            this.f3561k.postScale(fMax, fMax);
            this.f3561k.postTranslate((fM4394w - (f4 * fMax)) / 2.0f, (fM4393v - (f6 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f5, f7));
            this.f3561k.postScale(fMin, fMin);
            this.f3561k.postTranslate((fM4394w - (f4 * fMin)) / 2.0f, (fM4393v - (f6 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f4, f6);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM4394w, fM4393v);
            if (((int) this.f3575y) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f6, f4);
            }
            int i4 = b.f3578a[this.f3550A.ordinal()];
            if (i4 == 2) {
                this.f3561k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i4 == 3) {
                this.f3561k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i4 == 4) {
                this.f3561k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i4 == 5) {
                this.f3561k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m4357I();
    }

    /* renamed from: k */
    public final void m4383k() {
        d dVar = this.f3573w;
        if (dVar != null) {
            dVar.m4399a();
            this.f3573w = null;
        }
    }

    /* renamed from: l */
    public final void m4384l() {
        if (m4386n()) {
            m4359K(m4390s());
        }
    }

    /* renamed from: m */
    public final void m4385m() {
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u != null && !(imageViewM4392u instanceof InterfaceC3568b) && !ImageView.ScaleType.MATRIX.equals(imageViewM4392u.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    /* renamed from: n */
    public final boolean m4386n() {
        RectF rectFM4389r;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u == null || (rectFM4389r = m4389r(m4390s())) == null) {
            return false;
        }
        float fHeight = rectFM4389r.height();
        float fWidth = rectFM4389r.width();
        float fM4393v = m4393v(imageViewM4392u);
        float f10 = 0.0f;
        if (fHeight <= fM4393v) {
            int i4 = b.f3578a[this.f3550A.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    fM4393v = (fM4393v - fHeight) / 2.0f;
                    f5 = rectFM4389r.top;
                } else {
                    fM4393v -= fHeight;
                    f5 = rectFM4389r.top;
                }
            } else {
                f4 = rectFM4389r.top;
                f6 = -f4;
            }
        } else {
            f4 = rectFM4389r.top;
            if (f4 > 0.0f) {
                f6 = -f4;
            } else {
                f5 = rectFM4389r.bottom;
                f6 = f5 < fM4393v ? fM4393v - f5 : 0.0f;
            }
        }
        float fM4394w = m4394w(imageViewM4392u);
        if (fWidth <= fM4394w) {
            int i5 = b.f3578a[this.f3550A.ordinal()];
            if (i5 != 2) {
                if (i5 != 3) {
                    f8 = (fM4394w - fWidth) / 2.0f;
                    f9 = rectFM4389r.left;
                } else {
                    f8 = fM4394w - fWidth;
                    f9 = rectFM4389r.left;
                }
                f7 = f8 - f9;
            } else {
                f7 = -rectFM4389r.left;
            }
            f10 = f7;
            this.f3574x = 2;
        } else {
            float f11 = rectFM4389r.left;
            if (f11 > 0.0f) {
                this.f3574x = 0;
                f10 = -f11;
            } else {
                float f12 = rectFM4389r.right;
                if (f12 < fM4394w) {
                    f10 = fM4394w - f12;
                    this.f3574x = 1;
                } else {
                    this.f3574x = -1;
                }
            }
        }
        this.f3563m.postTranslate(f10, f6);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u != null) {
            if (!this.f3576z) {
                m4382f0(imageViewM4392u.getDrawable());
                return;
            }
            int top = imageViewM4392u.getTop();
            int right = imageViewM4392u.getRight();
            int bottom = imageViewM4392u.getBottom();
            int left = imageViewM4392u.getLeft();
            if (top == this.f3569s && bottom == this.f3571u && left == this.f3572v && right == this.f3570t) {
                return;
            }
            m4382f0(imageViewM4392u.getDrawable());
            this.f3569s = top;
            this.f3570t = right;
            this.f3571u = bottom;
            this.f3572v = left;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f3576z
            r1 = 0
            if (r0 == 0) goto L9d
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = m4340G(r0)
            if (r0 == 0) goto L9d
            android.view.ViewParent r0 = r11.getParent()
            int r2 = r12.getAction()
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 == r3) goto L1f
            r0 = 3
            if (r2 == r0) goto L1f
            goto L59
        L1f:
            float r0 = r10.m4353C()
            float r2 = r10.f3553c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L59
            android.graphics.RectF r0 = r10.m4388q()
            if (r0 == 0) goto L59
            com.xuexiang.xui.widget.imageview.photoview.c$c r2 = new com.xuexiang.xui.widget.imageview.photoview.c$c
            float r6 = r10.m4353C()
            float r7 = r10.f3553c
            float r8 = r0.centerX()
            float r9 = r0.centerY()
            r4 = r2
            r5 = r10
            r4.<init>(r6, r7, r8, r9)
            r11.post(r2)
            r11 = r3
            goto L5a
        L49:
            if (r0 == 0) goto L4f
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L56
        L4f:
            java.lang.String r11 = "PhotoViewAttacher"
            java.lang.String r0 = "onTouch getParent() returned null"
            p082k0.AbstractC3857c.m5164f(r11, r0)
        L56:
            r10.m4383k()
        L59:
            r11 = r1
        L5a:
            x0.d r0 = r10.f3560j
            if (r0 == 0) goto L91
            boolean r11 = r0.mo6560c()
            x0.d r0 = r10.f3560j
            boolean r0 = r0.mo6557b()
            x0.d r2 = r10.f3560j
            boolean r2 = r2.onTouchEvent(r12)
            if (r11 != 0) goto L7a
            x0.d r11 = r10.f3560j
            boolean r11 = r11.mo6560c()
            if (r11 != 0) goto L7a
            r11 = r3
            goto L7b
        L7a:
            r11 = r1
        L7b:
            if (r0 != 0) goto L87
            x0.d r0 = r10.f3560j
            boolean r0 = r0.mo6557b()
            if (r0 != 0) goto L87
            r0 = r3
            goto L88
        L87:
            r0 = r1
        L88:
            if (r11 == 0) goto L8d
            if (r0 == 0) goto L8d
            r1 = r3
        L8d:
            r10.f3557g = r1
            r1 = r2
            goto L92
        L91:
            r1 = r11
        L92:
            android.view.GestureDetector r11 = r10.f3559i
            if (r11 == 0) goto L9d
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L9d
            r1 = r3
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC3569c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m4387p() {
        WeakReference weakReference = this.f3558h;
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
            m4383k();
        }
        GestureDetector gestureDetector = this.f3559i;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f3566p = null;
        this.f3567q = null;
        this.f3568r = null;
        this.f3558h = null;
    }

    /* renamed from: q */
    public RectF m4388q() {
        m4386n();
        return m4389r(m4390s());
    }

    /* renamed from: r */
    public final RectF m4389r(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM4392u = m4392u();
        if (imageViewM4392u == null || (drawable = imageViewM4392u.getDrawable()) == null) {
            return null;
        }
        this.f3564n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f3564n);
        return this.f3564n;
    }

    /* renamed from: s */
    public final Matrix m4390s() {
        this.f3562l.set(this.f3561k);
        this.f3562l.postConcat(this.f3563m);
        return this.f3562l;
    }

    /* renamed from: t */
    public Matrix m4391t() {
        return this.f3562l;
    }

    /* renamed from: u */
    public ImageView m4392u() {
        WeakReference weakReference = this.f3558h;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m4387p();
            AbstractC3857c.m5164f("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    /* renamed from: v */
    public final int m4393v(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: w */
    public final int m4394w(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: x */
    public float m4395x() {
        return this.f3555e;
    }

    /* renamed from: y */
    public float m4396y() {
        return this.f3554d;
    }

    /* renamed from: z */
    public float m4397z() {
        return this.f3553c;
    }

    public ViewOnTouchListenerC3569c(ImageView imageView, boolean z3) {
        this.f3551a = new AccelerateDecelerateInterpolator();
        this.f3552b = 200;
        this.f3553c = 1.0f;
        this.f3554d = 1.75f;
        this.f3555e = 3.0f;
        this.f3556f = true;
        this.f3557g = false;
        this.f3561k = new Matrix();
        this.f3562l = new Matrix();
        this.f3563m = new Matrix();
        this.f3564n = new RectF();
        this.f3565o = new float[9];
        this.f3574x = 2;
        this.f3550A = ImageView.ScaleType.FIT_CENTER;
        this.f3558h = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m4342L(imageView);
        this.f3560j = AbstractC4662f.m6561a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f3559i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC3567a(this));
        this.f3575y = 0.0f;
        m4380d0(z3);
    }
}
