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
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import p083e2.AbstractC8349a;
import p095f2.AbstractC8430f;
import p095f2.InterfaceC8428d;
import p095f2.InterfaceC8429e;
import p107g2.AbstractC8525c;
import p184n1.AbstractC9363c;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.c */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC6935c implements InterfaceC6934b, View.OnTouchListener, InterfaceC8429e, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: B */
    public static final boolean f7761B = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: C */
    public static int f7762C = 1;

    /* renamed from: A */
    public ImageView.ScaleType f7763A;

    /* renamed from: a */
    public Interpolator f7764a;

    /* renamed from: b */
    public int f7765b;

    /* renamed from: c */
    public float f7766c;

    /* renamed from: d */
    public float f7767d;

    /* renamed from: e */
    public float f7768e;

    /* renamed from: f */
    public boolean f7769f;

    /* renamed from: g */
    public boolean f7770g;

    /* renamed from: h */
    public WeakReference f7771h;

    /* renamed from: i */
    public GestureDetector f7772i;

    /* renamed from: j */
    public InterfaceC8428d f7773j;

    /* renamed from: k */
    public final Matrix f7774k;

    /* renamed from: l */
    public final Matrix f7775l;

    /* renamed from: m */
    public final Matrix f7776m;

    /* renamed from: n */
    public final RectF f7777n;

    /* renamed from: o */
    public final float[] f7778o;

    /* renamed from: p */
    public f f7779p;

    /* renamed from: q */
    public i f7780q;

    /* renamed from: r */
    public View.OnLongClickListener f7781r;

    /* renamed from: s */
    public int f7782s;

    /* renamed from: t */
    public int f7783t;

    /* renamed from: u */
    public int f7784u;

    /* renamed from: v */
    public int f7785v;

    /* renamed from: w */
    public d f7786w;

    /* renamed from: x */
    public int f7787x;

    /* renamed from: y */
    public float f7788y;

    /* renamed from: z */
    public boolean f7789z;

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ViewOnTouchListenerC6935c.m6896e(ViewOnTouchListenerC6935c.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC6935c.this.f7781r != null && ViewOnTouchListenerC6935c.this.m6944u().getY() == 0.0f && ViewOnTouchListenerC6935c.this.m6944u().getX() == 0.0f) {
                ViewOnTouchListenerC6935c.this.f7781r.onLongClick(ViewOnTouchListenerC6935c.this.m6944u());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7791a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f7791a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7791a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7791a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7791a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7791a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final float f7792a;

        /* renamed from: b */
        public final float f7793b;

        /* renamed from: c */
        public final long f7794c = System.currentTimeMillis();

        /* renamed from: d */
        public final float f7795d;

        /* renamed from: e */
        public final float f7796e;

        public c(float f10, float f11, float f12, float f13) {
            this.f7792a = f12;
            this.f7793b = f13;
            this.f7795d = f10;
            this.f7796e = f11;
        }

        /* renamed from: a */
        public final float m6950a() {
            return ViewOnTouchListenerC6935c.this.f7764a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f7794c) * 1.0f) / ViewOnTouchListenerC6935c.this.f7765b));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM6944u = ViewOnTouchListenerC6935c.this.m6944u();
            if (imageViewM6944u == null) {
                return;
            }
            float fM6950a = m6950a();
            float f10 = this.f7795d;
            ViewOnTouchListenerC6935c.this.mo6928b((f10 + ((this.f7796e - f10) * fM6950a)) / ViewOnTouchListenerC6935c.this.m6905C(), this.f7792a, this.f7793b);
            if (fM6950a < 1.0f) {
                AbstractC8349a.m13593c(imageViewM6944u, this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final AbstractC8525c f7798a;

        /* renamed from: b */
        public int f7799b;

        /* renamed from: c */
        public int f7800c;

        public d(Context context) {
            this.f7798a = AbstractC8525c.m13892f(context);
        }

        /* renamed from: a */
        public void m6951a() {
            if (ViewOnTouchListenerC6935c.f7761B) {
                AbstractC9363c.m17248b("PhotoViewAttacher", "Cancel Fling");
            }
            this.f7798a.mo13887c(true);
        }

        /* renamed from: b */
        public void m6952b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFM6940q = ViewOnTouchListenerC6935c.this.m6940q();
            if (rectFM6940q == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM6940q.left);
            float f10 = i10;
            if (f10 < rectFM6940q.width()) {
                iRound = Math.round(rectFM6940q.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFM6940q.top);
            float f11 = i11;
            if (f11 < rectFM6940q.height()) {
                iRound2 = Math.round(rectFM6940q.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f7799b = iRound3;
            this.f7800c = iRound4;
            if (ViewOnTouchListenerC6935c.f7761B) {
                AbstractC9363c.m17248b("PhotoViewAttacher", "fling. StartX:" + iRound3 + " StartY:" + iRound4 + " MaxX:" + iRound + " MaxY:" + iRound2);
            }
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f7798a.mo13886b(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM6944u;
            if (this.f7798a.mo13890g() || (imageViewM6944u = ViewOnTouchListenerC6935c.this.m6944u()) == null || !this.f7798a.mo13891a()) {
                return;
            }
            int iMo13888d = this.f7798a.mo13888d();
            int iMo13889e = this.f7798a.mo13889e();
            if (ViewOnTouchListenerC6935c.f7761B) {
                AbstractC9363c.m17248b("PhotoViewAttacher", "fling run(). CurrentX:" + this.f7799b + " CurrentY:" + this.f7800c + " NewX:" + iMo13888d + " NewY:" + iMo13889e);
            }
            ViewOnTouchListenerC6935c.this.f7776m.postTranslate(this.f7799b - iMo13888d, this.f7800c - iMo13889e);
            ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = ViewOnTouchListenerC6935c.this;
            viewOnTouchListenerC6935c.m6911K(viewOnTouchListenerC6935c.m6942s());
            this.f7799b = iMo13888d;
            this.f7800c = iMo13889e;
            AbstractC8349a.m13593c(imageViewM6944u, this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$e */
    public interface e {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$f */
    public interface f {
        /* renamed from: a */
        void mo6953a();

        /* renamed from: b */
        void mo6954b(View view, float f10, float f11);
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
        void mo6955a(View view, float f10, float f11);
    }

    public ViewOnTouchListenerC6935c(ImageView imageView) {
        this(imageView, true);
    }

    /* renamed from: G */
    public static boolean m6892G(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    /* renamed from: H */
    public static boolean m6893H(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (b.f7791a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* renamed from: L */
    public static void m6894L(ImageView imageView) {
        if (imageView == null || (imageView instanceof InterfaceC6934b)) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (scaleType.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    /* renamed from: e */
    public static /* synthetic */ h m6896e(ViewOnTouchListenerC6935c viewOnTouchListenerC6935c) {
        viewOnTouchListenerC6935c.getClass();
        return null;
    }

    /* renamed from: o */
    public static void m6902o(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: A */
    public f m6903A() {
        return this.f7779p;
    }

    /* renamed from: B */
    public i m6904B() {
        return this.f7780q;
    }

    /* renamed from: C */
    public float m6905C() {
        return (float) Math.sqrt(((float) Math.pow(m6907E(this.f7776m, 0), 2.0d)) + ((float) Math.pow(m6907E(this.f7776m, 3), 2.0d)));
    }

    /* renamed from: D */
    public ImageView.ScaleType m6906D() {
        return this.f7763A;
    }

    /* renamed from: E */
    public final float m6907E(Matrix matrix, int i10) {
        matrix.getValues(this.f7778o);
        return this.f7778o[i10];
    }

    /* renamed from: F */
    public Bitmap m6908F() {
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u == null) {
            return null;
        }
        return imageViewM6944u.getDrawingCache();
    }

    /* renamed from: I */
    public void m6909I() {
        this.f7776m.reset();
        m6922W(this.f7788y);
        m6911K(m6942s());
        m6938n();
    }

    /* renamed from: J */
    public void m6910J(boolean z10) {
        this.f7769f = z10;
    }

    /* renamed from: K */
    public final void m6911K(Matrix matrix) {
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u != null) {
            m6937m();
            imageViewM6944u.setImageMatrix(matrix);
        }
    }

    /* renamed from: M */
    public void m6912M(float f10) {
        m6902o(this.f7766c, this.f7767d, f10);
        this.f7768e = f10;
    }

    /* renamed from: N */
    public void m6913N(float f10) {
        m6902o(this.f7766c, f10, this.f7768e);
        this.f7767d = f10;
    }

    /* renamed from: O */
    public void m6914O(float f10) {
        m6902o(f10, this.f7767d, this.f7768e);
        this.f7766c = f10;
    }

    /* renamed from: P */
    public void m6915P(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f7772i.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f7772i.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6933a(this));
        }
    }

    /* renamed from: Q */
    public void m6916Q(View.OnLongClickListener onLongClickListener) {
        this.f7781r = onLongClickListener;
    }

    /* renamed from: R */
    public void m6917R(e eVar) {
    }

    /* renamed from: S */
    public void m6918S(f fVar) {
        this.f7779p = fVar;
    }

    /* renamed from: T */
    public void m6919T(g gVar) {
    }

    /* renamed from: U */
    public void m6920U(h hVar) {
    }

    /* renamed from: V */
    public void m6921V(i iVar) {
        this.f7780q = iVar;
    }

    /* renamed from: W */
    public void m6922W(float f10) {
        this.f7776m.postRotate(f10 % 360.0f);
        m6936l();
    }

    /* renamed from: X */
    public void m6923X(float f10) {
        this.f7776m.setRotate(f10 % 360.0f);
        m6936l();
    }

    /* renamed from: Y */
    public void m6924Y(float f10) {
        m6927a0(f10, false);
    }

    /* renamed from: Z */
    public void m6925Z(float f10, float f11, float f12, boolean z10) {
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u != null) {
            if (f10 < this.f7766c || f10 > this.f7768e) {
                AbstractC9363c.m17252f("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            } else if (z10) {
                imageViewM6944u.post(new c(m6905C(), f10, f11, f12));
            } else {
                this.f7776m.setScale(f10, f10, f11, f12);
                m6936l();
            }
        }
    }

    @Override // p095f2.InterfaceC8429e
    /* renamed from: a */
    public void mo6926a(float f10, float f11) {
        if (this.f7773j.mo13766c()) {
            return;
        }
        if (f7761B) {
            AbstractC9363c.m17248b("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f10), Float.valueOf(f11)));
        }
        ImageView imageViewM6944u = m6944u();
        this.f7776m.postTranslate(f10, f11);
        m6936l();
        ViewParent parent = imageViewM6944u.getParent();
        if (!this.f7769f || this.f7773j.mo13766c() || this.f7770g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i10 = this.f7787x;
        if ((i10 == 2 || ((i10 == 0 && f10 >= 1.0f) || (i10 == 1 && f10 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: a0 */
    public void m6927a0(float f10, boolean z10) {
        if (m6944u() != null) {
            m6925Z(f10, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z10);
        }
    }

    @Override // p095f2.InterfaceC8429e
    /* renamed from: b */
    public void mo6928b(float f10, float f11, float f12) {
        if (f7761B) {
            AbstractC9363c.m17248b("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (m6905C() < this.f7768e || f10 < 1.0f) {
            if (m6905C() > this.f7766c || f10 > 1.0f) {
                this.f7776m.postScale(f10, f10, f11, f12);
                m6936l();
            }
        }
    }

    /* renamed from: b0 */
    public void m6929b0(ImageView.ScaleType scaleType) {
        if (!m6893H(scaleType) || scaleType == this.f7763A) {
            return;
        }
        this.f7763A = scaleType;
        m6933e0();
    }

    @Override // p095f2.InterfaceC8429e
    /* renamed from: c */
    public void mo6930c(float f10, float f11, float f12, float f13) {
        if (f7761B) {
            AbstractC9363c.m17248b("PhotoViewAttacher", "onFling. sX: " + f10 + " sY: " + f11 + " Vx: " + f12 + " Vy: " + f13);
        }
        ImageView imageViewM6944u = m6944u();
        d dVar = new d(imageViewM6944u.getContext());
        this.f7786w = dVar;
        dVar.m6952b(m6946w(imageViewM6944u), m6945v(imageViewM6944u), (int) f12, (int) f13);
        imageViewM6944u.post(this.f7786w);
    }

    /* renamed from: c0 */
    public void m6931c0(int i10) {
        if (i10 < 0) {
            i10 = 200;
        }
        this.f7765b = i10;
    }

    /* renamed from: d0 */
    public void m6932d0(boolean z10) {
        this.f7789z = z10;
        m6933e0();
    }

    /* renamed from: e0 */
    public void m6933e0() {
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u != null) {
            if (!this.f7789z) {
                m6909I();
            } else {
                m6894L(imageViewM6944u);
                m6934f0(imageViewM6944u.getDrawable());
            }
        }
    }

    /* renamed from: f0 */
    public final void m6934f0(Drawable drawable) {
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u == null || drawable == null) {
            return;
        }
        float fM6946w = m6946w(imageViewM6944u);
        float fM6945v = m6945v(imageViewM6944u);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f7774k.reset();
        float f10 = intrinsicWidth;
        float f11 = fM6946w / f10;
        float f12 = intrinsicHeight;
        float f13 = fM6945v / f12;
        ImageView.ScaleType scaleType = this.f7763A;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f7774k.postTranslate((fM6946w - f10) / 2.0f, (fM6945v - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f7774k.postScale(fMax, fMax);
            this.f7774k.postTranslate((fM6946w - (f10 * fMax)) / 2.0f, (fM6945v - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f7774k.postScale(fMin, fMin);
            this.f7774k.postTranslate((fM6946w - (f10 * fMin)) / 2.0f, (fM6945v - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM6946w, fM6945v);
            if (((int) this.f7788y) % TXLiveConstants.RENDER_ROTATION_180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = b.f7791a[this.f7763A.ordinal()];
            if (i10 == 2) {
                this.f7774k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f7774k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f7774k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 5) {
                this.f7774k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m6909I();
    }

    /* renamed from: k */
    public final void m6935k() {
        d dVar = this.f7786w;
        if (dVar != null) {
            dVar.m6951a();
            this.f7786w = null;
        }
    }

    /* renamed from: l */
    public final void m6936l() {
        if (m6938n()) {
            m6911K(m6942s());
        }
    }

    /* renamed from: m */
    public final void m6937m() {
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u != null && !(imageViewM6944u instanceof InterfaceC6934b) && !ImageView.ScaleType.MATRIX.equals(imageViewM6944u.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    /* renamed from: n */
    public final boolean m6938n() {
        RectF rectFM6941r;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u == null || (rectFM6941r = m6941r(m6942s())) == null) {
            return false;
        }
        float fHeight = rectFM6941r.height();
        float fWidth = rectFM6941r.width();
        float fM6945v = m6945v(imageViewM6944u);
        float f16 = 0.0f;
        if (fHeight <= fM6945v) {
            int i10 = b.f7791a[this.f7763A.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    fM6945v = (fM6945v - fHeight) / 2.0f;
                    f11 = rectFM6941r.top;
                } else {
                    fM6945v -= fHeight;
                    f11 = rectFM6941r.top;
                }
            } else {
                f10 = rectFM6941r.top;
                f12 = -f10;
            }
        } else {
            f10 = rectFM6941r.top;
            if (f10 > 0.0f) {
                f12 = -f10;
            } else {
                f11 = rectFM6941r.bottom;
                f12 = f11 < fM6945v ? fM6945v - f11 : 0.0f;
            }
        }
        float fM6946w = m6946w(imageViewM6944u);
        if (fWidth <= fM6946w) {
            int i11 = b.f7791a[this.f7763A.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f14 = (fM6946w - fWidth) / 2.0f;
                    f15 = rectFM6941r.left;
                } else {
                    f14 = fM6946w - fWidth;
                    f15 = rectFM6941r.left;
                }
                f13 = f14 - f15;
            } else {
                f13 = -rectFM6941r.left;
            }
            f16 = f13;
            this.f7787x = 2;
        } else {
            float f17 = rectFM6941r.left;
            if (f17 > 0.0f) {
                this.f7787x = 0;
                f16 = -f17;
            } else {
                float f18 = rectFM6941r.right;
                if (f18 < fM6946w) {
                    f16 = fM6946w - f18;
                    this.f7787x = 1;
                } else {
                    this.f7787x = -1;
                }
            }
        }
        this.f7776m.postTranslate(f16, f12);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u != null) {
            if (!this.f7789z) {
                m6934f0(imageViewM6944u.getDrawable());
                return;
            }
            int top2 = imageViewM6944u.getTop();
            int right = imageViewM6944u.getRight();
            int bottom = imageViewM6944u.getBottom();
            int left = imageViewM6944u.getLeft();
            if (top2 == this.f7782s && bottom == this.f7784u && left == this.f7785v && right == this.f7783t) {
                return;
            }
            m6934f0(imageViewM6944u.getDrawable());
            this.f7782s = top2;
            this.f7783t = right;
            this.f7784u = bottom;
            this.f7785v = left;
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
            boolean r0 = r10.f7789z
            r1 = 0
            if (r0 == 0) goto L9d
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = m6892G(r0)
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
            float r0 = r10.m6905C()
            float r2 = r10.f7766c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1e
            android.graphics.RectF r0 = r10.m6940q()
            if (r0 == 0) goto L1e
            com.xuexiang.xui.widget.imageview.photoview.c$c r4 = new com.xuexiang.xui.widget.imageview.photoview.c$c
            float r6 = r10.m6905C()
            float r7 = r10.f7766c
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
            p184n1.AbstractC9363c.m17252f(r11, r0)
        L57:
            r10.m6935k()
        L5a:
            r11 = r1
        L5b:
            f2.d r0 = r5.f7773j
            if (r0 == 0) goto L91
            boolean r11 = r0.mo13766c()
            f2.d r0 = r5.f7773j
            boolean r0 = r0.mo13763b()
            f2.d r2 = r5.f7773j
            boolean r2 = r2.onTouchEvent(r12)
            if (r11 != 0) goto L7b
            f2.d r11 = r5.f7773j
            boolean r11 = r11.mo13766c()
            if (r11 != 0) goto L7b
            r11 = r3
            goto L7c
        L7b:
            r11 = r1
        L7c:
            if (r0 != 0) goto L88
            f2.d r0 = r5.f7773j
            boolean r0 = r0.mo13763b()
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
            r5.f7770g = r1
            r11 = r2
        L91:
            android.view.GestureDetector r0 = r5.f7772i
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
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m6939p() {
        WeakReference weakReference = this.f7771h;
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
            m6935k();
        }
        GestureDetector gestureDetector = this.f7772i;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f7779p = null;
        this.f7780q = null;
        this.f7781r = null;
        this.f7771h = null;
    }

    /* renamed from: q */
    public RectF m6940q() {
        m6938n();
        return m6941r(m6942s());
    }

    /* renamed from: r */
    public final RectF m6941r(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM6944u = m6944u();
        if (imageViewM6944u == null || (drawable = imageViewM6944u.getDrawable()) == null) {
            return null;
        }
        this.f7777n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f7777n);
        return this.f7777n;
    }

    /* renamed from: s */
    public final Matrix m6942s() {
        this.f7775l.set(this.f7774k);
        this.f7775l.postConcat(this.f7776m);
        return this.f7775l;
    }

    /* renamed from: t */
    public Matrix m6943t() {
        return this.f7775l;
    }

    /* renamed from: u */
    public ImageView m6944u() {
        WeakReference weakReference = this.f7771h;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m6939p();
            AbstractC9363c.m17252f("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    /* renamed from: v */
    public final int m6945v(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: w */
    public final int m6946w(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: x */
    public float m6947x() {
        return this.f7768e;
    }

    /* renamed from: y */
    public float m6948y() {
        return this.f7767d;
    }

    /* renamed from: z */
    public float m6949z() {
        return this.f7766c;
    }

    public ViewOnTouchListenerC6935c(ImageView imageView, boolean z10) {
        this.f7764a = new AccelerateDecelerateInterpolator();
        this.f7765b = 200;
        this.f7766c = 1.0f;
        this.f7767d = 1.75f;
        this.f7768e = 3.0f;
        this.f7769f = true;
        this.f7770g = false;
        this.f7774k = new Matrix();
        this.f7775l = new Matrix();
        this.f7776m = new Matrix();
        this.f7777n = new RectF();
        this.f7778o = new float[9];
        this.f7787x = 2;
        this.f7763A = ImageView.ScaleType.FIT_CENTER;
        this.f7771h = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m6894L(imageView);
        this.f7773j = AbstractC8430f.m13767a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f7772i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6933a(this));
        this.f7788y = 0.0f;
        m6932d0(z10);
    }
}
