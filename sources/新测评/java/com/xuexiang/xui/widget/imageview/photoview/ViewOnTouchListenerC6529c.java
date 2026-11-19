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
import p086f3.AbstractC7435a;
import p097g3.AbstractC7520f;
import p097g3.InterfaceC7518d;
import p097g3.InterfaceC7519e;
import p108h3.AbstractC7622c;
import p197p2.AbstractC8819c;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.c */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC6529c implements InterfaceC6528b, View.OnTouchListener, InterfaceC7519e, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: B */
    public static final boolean f6344B = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: C */
    public static int f6345C = 1;

    /* renamed from: A */
    public ImageView.ScaleType f6346A;

    /* renamed from: a */
    public Interpolator f6347a;

    /* renamed from: b */
    public int f6348b;

    /* renamed from: c */
    public float f6349c;

    /* renamed from: d */
    public float f6350d;

    /* renamed from: e */
    public float f6351e;

    /* renamed from: f */
    public boolean f6352f;

    /* renamed from: g */
    public boolean f6353g;

    /* renamed from: h */
    public WeakReference f6354h;

    /* renamed from: i */
    public GestureDetector f6355i;

    /* renamed from: j */
    public InterfaceC7518d f6356j;

    /* renamed from: k */
    public final Matrix f6357k;

    /* renamed from: l */
    public final Matrix f6358l;

    /* renamed from: m */
    public final Matrix f6359m;

    /* renamed from: n */
    public final RectF f6360n;

    /* renamed from: o */
    public final float[] f6361o;

    /* renamed from: p */
    public f f6362p;

    /* renamed from: q */
    public i f6363q;

    /* renamed from: r */
    public View.OnLongClickListener f6364r;

    /* renamed from: s */
    public int f6365s;

    /* renamed from: t */
    public int f6366t;

    /* renamed from: u */
    public int f6367u;

    /* renamed from: v */
    public int f6368v;

    /* renamed from: w */
    public d f6369w;

    /* renamed from: x */
    public int f6370x;

    /* renamed from: y */
    public float f6371y;

    /* renamed from: z */
    public boolean f6372z;

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ViewOnTouchListenerC6529c.m5702e(ViewOnTouchListenerC6529c.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC6529c.this.f6364r != null && ViewOnTouchListenerC6529c.this.m5750u().getY() == 0.0f && ViewOnTouchListenerC6529c.this.m5750u().getX() == 0.0f) {
                ViewOnTouchListenerC6529c.this.f6364r.onLongClick(ViewOnTouchListenerC6529c.this.m5750u());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6374a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f6374a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6374a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6374a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6374a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6374a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final float f6375a;

        /* renamed from: b */
        public final float f6376b;

        /* renamed from: c */
        public final long f6377c = System.currentTimeMillis();

        /* renamed from: d */
        public final float f6378d;

        /* renamed from: e */
        public final float f6379e;

        public c(float f10, float f11, float f12, float f13) {
            this.f6375a = f12;
            this.f6376b = f13;
            this.f6378d = f10;
            this.f6379e = f11;
        }

        /* renamed from: a */
        public final float m5756a() {
            return ViewOnTouchListenerC6529c.this.f6347a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f6377c) * 1.0f) / ViewOnTouchListenerC6529c.this.f6348b));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM5750u = ViewOnTouchListenerC6529c.this.m5750u();
            if (imageViewM5750u == null) {
                return;
            }
            float fM5756a = m5756a();
            float f10 = this.f6378d;
            ViewOnTouchListenerC6529c.this.mo5734b((f10 + ((this.f6379e - f10) * fM5756a)) / ViewOnTouchListenerC6529c.this.m5711C(), this.f6375a, this.f6376b);
            if (fM5756a < 1.0f) {
                AbstractC7435a.m11989c(imageViewM5750u, this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final AbstractC7622c f6381a;

        /* renamed from: b */
        public int f6382b;

        /* renamed from: c */
        public int f6383c;

        public d(Context context) {
            this.f6381a = AbstractC7622c.m12551f(context);
        }

        /* renamed from: a */
        public void m5757a() {
            if (ViewOnTouchListenerC6529c.f6344B) {
                AbstractC8819c.m14778b("PhotoViewAttacher", "Cancel Fling");
            }
            this.f6381a.mo12546c(true);
        }

        /* renamed from: b */
        public void m5758b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFM5746q = ViewOnTouchListenerC6529c.this.m5746q();
            if (rectFM5746q == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM5746q.left);
            float f10 = i10;
            if (f10 < rectFM5746q.width()) {
                iRound = Math.round(rectFM5746q.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFM5746q.top);
            float f11 = i11;
            if (f11 < rectFM5746q.height()) {
                iRound2 = Math.round(rectFM5746q.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f6382b = iRound3;
            this.f6383c = iRound4;
            if (ViewOnTouchListenerC6529c.f6344B) {
                AbstractC8819c.m14778b("PhotoViewAttacher", "fling. StartX:" + iRound3 + " StartY:" + iRound4 + " MaxX:" + iRound + " MaxY:" + iRound2);
            }
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f6381a.mo12545b(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM5750u;
            if (this.f6381a.mo12549g() || (imageViewM5750u = ViewOnTouchListenerC6529c.this.m5750u()) == null || !this.f6381a.mo12550a()) {
                return;
            }
            int iMo12547d = this.f6381a.mo12547d();
            int iMo12548e = this.f6381a.mo12548e();
            if (ViewOnTouchListenerC6529c.f6344B) {
                AbstractC8819c.m14778b("PhotoViewAttacher", "fling run(). CurrentX:" + this.f6382b + " CurrentY:" + this.f6383c + " NewX:" + iMo12547d + " NewY:" + iMo12548e);
            }
            ViewOnTouchListenerC6529c.this.f6359m.postTranslate(this.f6382b - iMo12547d, this.f6383c - iMo12548e);
            ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = ViewOnTouchListenerC6529c.this;
            viewOnTouchListenerC6529c.m5717K(viewOnTouchListenerC6529c.m5748s());
            this.f6382b = iMo12547d;
            this.f6383c = iMo12548e;
            AbstractC7435a.m11989c(imageViewM5750u, this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$e */
    public interface e {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$f */
    public interface f {
        /* renamed from: a */
        void mo5759a();

        /* renamed from: b */
        void mo5760b(View view, float f10, float f11);
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
        void mo5761a(View view, float f10, float f11);
    }

    public ViewOnTouchListenerC6529c(ImageView imageView) {
        this(imageView, true);
    }

    /* renamed from: G */
    public static boolean m5698G(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    /* renamed from: H */
    public static boolean m5699H(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (b.f6374a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* renamed from: L */
    public static void m5700L(ImageView imageView) {
        if (imageView == null || (imageView instanceof InterfaceC6528b)) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (scaleType.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    /* renamed from: e */
    public static /* synthetic */ h m5702e(ViewOnTouchListenerC6529c viewOnTouchListenerC6529c) {
        viewOnTouchListenerC6529c.getClass();
        return null;
    }

    /* renamed from: o */
    public static void m5708o(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: A */
    public f m5709A() {
        return this.f6362p;
    }

    /* renamed from: B */
    public i m5710B() {
        return this.f6363q;
    }

    /* renamed from: C */
    public float m5711C() {
        return (float) Math.sqrt(((float) Math.pow(m5713E(this.f6359m, 0), 2.0d)) + ((float) Math.pow(m5713E(this.f6359m, 3), 2.0d)));
    }

    /* renamed from: D */
    public ImageView.ScaleType m5712D() {
        return this.f6346A;
    }

    /* renamed from: E */
    public final float m5713E(Matrix matrix, int i10) {
        matrix.getValues(this.f6361o);
        return this.f6361o[i10];
    }

    /* renamed from: F */
    public Bitmap m5714F() {
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u == null) {
            return null;
        }
        return imageViewM5750u.getDrawingCache();
    }

    /* renamed from: I */
    public void m5715I() {
        this.f6359m.reset();
        m5728W(this.f6371y);
        m5717K(m5748s());
        m5744n();
    }

    /* renamed from: J */
    public void m5716J(boolean z9) {
        this.f6352f = z9;
    }

    /* renamed from: K */
    public final void m5717K(Matrix matrix) {
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u != null) {
            m5743m();
            imageViewM5750u.setImageMatrix(matrix);
        }
    }

    /* renamed from: M */
    public void m5718M(float f10) {
        m5708o(this.f6349c, this.f6350d, f10);
        this.f6351e = f10;
    }

    /* renamed from: N */
    public void m5719N(float f10) {
        m5708o(this.f6349c, f10, this.f6351e);
        this.f6350d = f10;
    }

    /* renamed from: O */
    public void m5720O(float f10) {
        m5708o(f10, this.f6350d, this.f6351e);
        this.f6349c = f10;
    }

    /* renamed from: P */
    public void m5721P(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f6355i.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f6355i.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6527a(this));
        }
    }

    /* renamed from: Q */
    public void m5722Q(View.OnLongClickListener onLongClickListener) {
        this.f6364r = onLongClickListener;
    }

    /* renamed from: R */
    public void m5723R(e eVar) {
    }

    /* renamed from: S */
    public void m5724S(f fVar) {
        this.f6362p = fVar;
    }

    /* renamed from: T */
    public void m5725T(g gVar) {
    }

    /* renamed from: U */
    public void m5726U(h hVar) {
    }

    /* renamed from: V */
    public void m5727V(i iVar) {
        this.f6363q = iVar;
    }

    /* renamed from: W */
    public void m5728W(float f10) {
        this.f6359m.postRotate(f10 % 360.0f);
        m5742l();
    }

    /* renamed from: X */
    public void m5729X(float f10) {
        this.f6359m.setRotate(f10 % 360.0f);
        m5742l();
    }

    /* renamed from: Y */
    public void m5730Y(float f10) {
        m5733a0(f10, false);
    }

    /* renamed from: Z */
    public void m5731Z(float f10, float f11, float f12, boolean z9) {
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u != null) {
            if (f10 < this.f6349c || f10 > this.f6351e) {
                AbstractC8819c.m14783g("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            } else if (z9) {
                imageViewM5750u.post(new c(m5711C(), f10, f11, f12));
            } else {
                this.f6359m.setScale(f10, f10, f11, f12);
                m5742l();
            }
        }
    }

    @Override // p097g3.InterfaceC7519e
    /* renamed from: a */
    public void mo5732a(float f10, float f11) {
        if (this.f6356j.mo12234d()) {
            return;
        }
        if (f6344B) {
            AbstractC8819c.m14778b("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f10), Float.valueOf(f11)));
        }
        ImageView imageViewM5750u = m5750u();
        this.f6359m.postTranslate(f10, f11);
        m5742l();
        ViewParent parent = imageViewM5750u.getParent();
        if (!this.f6352f || this.f6356j.mo12234d() || this.f6353g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i10 = this.f6370x;
        if ((i10 == 2 || ((i10 == 0 && f10 >= 1.0f) || (i10 == 1 && f10 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: a0 */
    public void m5733a0(float f10, boolean z9) {
        if (m5750u() != null) {
            m5731Z(f10, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z9);
        }
    }

    @Override // p097g3.InterfaceC7519e
    /* renamed from: b */
    public void mo5734b(float f10, float f11, float f12) {
        if (f6344B) {
            AbstractC8819c.m14778b("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (m5711C() < this.f6351e || f10 < 1.0f) {
            if (m5711C() > this.f6349c || f10 > 1.0f) {
                this.f6359m.postScale(f10, f10, f11, f12);
                m5742l();
            }
        }
    }

    /* renamed from: b0 */
    public void m5735b0(ImageView.ScaleType scaleType) {
        if (!m5699H(scaleType) || scaleType == this.f6346A) {
            return;
        }
        this.f6346A = scaleType;
        m5739e0();
    }

    @Override // p097g3.InterfaceC7519e
    /* renamed from: c */
    public void mo5736c(float f10, float f11, float f12, float f13) {
        if (f6344B) {
            AbstractC8819c.m14778b("PhotoViewAttacher", "onFling. sX: " + f10 + " sY: " + f11 + " Vx: " + f12 + " Vy: " + f13);
        }
        ImageView imageViewM5750u = m5750u();
        d dVar = new d(imageViewM5750u.getContext());
        this.f6369w = dVar;
        dVar.m5758b(m5752w(imageViewM5750u), m5751v(imageViewM5750u), (int) f12, (int) f13);
        imageViewM5750u.post(this.f6369w);
    }

    /* renamed from: c0 */
    public void m5737c0(int i10) {
        if (i10 < 0) {
            i10 = 200;
        }
        this.f6348b = i10;
    }

    /* renamed from: d0 */
    public void m5738d0(boolean z9) {
        this.f6372z = z9;
        m5739e0();
    }

    /* renamed from: e0 */
    public void m5739e0() {
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u != null) {
            if (!this.f6372z) {
                m5715I();
            } else {
                m5700L(imageViewM5750u);
                m5740f0(imageViewM5750u.getDrawable());
            }
        }
    }

    /* renamed from: f0 */
    public final void m5740f0(Drawable drawable) {
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u == null || drawable == null) {
            return;
        }
        float fM5752w = m5752w(imageViewM5750u);
        float fM5751v = m5751v(imageViewM5750u);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f6357k.reset();
        float f10 = intrinsicWidth;
        float f11 = fM5752w / f10;
        float f12 = intrinsicHeight;
        float f13 = fM5751v / f12;
        ImageView.ScaleType scaleType = this.f6346A;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f6357k.postTranslate((fM5752w - f10) / 2.0f, (fM5751v - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f6357k.postScale(fMax, fMax);
            this.f6357k.postTranslate((fM5752w - (f10 * fMax)) / 2.0f, (fM5751v - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f6357k.postScale(fMin, fMin);
            this.f6357k.postTranslate((fM5752w - (f10 * fMin)) / 2.0f, (fM5751v - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM5752w, fM5751v);
            if (((int) this.f6371y) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = b.f6374a[this.f6346A.ordinal()];
            if (i10 == 2) {
                this.f6357k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f6357k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f6357k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 5) {
                this.f6357k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m5715I();
    }

    /* renamed from: k */
    public final void m5741k() {
        d dVar = this.f6369w;
        if (dVar != null) {
            dVar.m5757a();
            this.f6369w = null;
        }
    }

    /* renamed from: l */
    public final void m5742l() {
        if (m5744n()) {
            m5717K(m5748s());
        }
    }

    /* renamed from: m */
    public final void m5743m() {
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u != null && !(imageViewM5750u instanceof InterfaceC6528b) && !ImageView.ScaleType.MATRIX.equals(imageViewM5750u.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    /* renamed from: n */
    public final boolean m5744n() {
        RectF rectFM5747r;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u == null || (rectFM5747r = m5747r(m5748s())) == null) {
            return false;
        }
        float fHeight = rectFM5747r.height();
        float fWidth = rectFM5747r.width();
        float fM5751v = m5751v(imageViewM5750u);
        float f16 = 0.0f;
        if (fHeight <= fM5751v) {
            int i10 = b.f6374a[this.f6346A.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    fM5751v = (fM5751v - fHeight) / 2.0f;
                    f11 = rectFM5747r.top;
                } else {
                    fM5751v -= fHeight;
                    f11 = rectFM5747r.top;
                }
            } else {
                f10 = rectFM5747r.top;
                f12 = -f10;
            }
        } else {
            f10 = rectFM5747r.top;
            if (f10 > 0.0f) {
                f12 = -f10;
            } else {
                f11 = rectFM5747r.bottom;
                f12 = f11 < fM5751v ? fM5751v - f11 : 0.0f;
            }
        }
        float fM5752w = m5752w(imageViewM5750u);
        if (fWidth <= fM5752w) {
            int i11 = b.f6374a[this.f6346A.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f14 = (fM5752w - fWidth) / 2.0f;
                    f15 = rectFM5747r.left;
                } else {
                    f14 = fM5752w - fWidth;
                    f15 = rectFM5747r.left;
                }
                f13 = f14 - f15;
            } else {
                f13 = -rectFM5747r.left;
            }
            f16 = f13;
            this.f6370x = 2;
        } else {
            float f17 = rectFM5747r.left;
            if (f17 > 0.0f) {
                this.f6370x = 0;
                f16 = -f17;
            } else {
                float f18 = rectFM5747r.right;
                if (f18 < fM5752w) {
                    f16 = fM5752w - f18;
                    this.f6370x = 1;
                } else {
                    this.f6370x = -1;
                }
            }
        }
        this.f6359m.postTranslate(f16, f12);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u != null) {
            if (!this.f6372z) {
                m5740f0(imageViewM5750u.getDrawable());
                return;
            }
            int top2 = imageViewM5750u.getTop();
            int right = imageViewM5750u.getRight();
            int bottom = imageViewM5750u.getBottom();
            int left = imageViewM5750u.getLeft();
            if (top2 == this.f6365s && bottom == this.f6367u && left == this.f6368v && right == this.f6366t) {
                return;
            }
            m5740f0(imageViewM5750u.getDrawable());
            this.f6365s = top2;
            this.f6366t = right;
            this.f6367u = bottom;
            this.f6368v = left;
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
            boolean r0 = r10.f6372z
            r1 = 0
            if (r0 == 0) goto L9d
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = m5698G(r0)
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
            float r0 = r10.m5711C()
            float r2 = r10.f6349c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1e
            android.graphics.RectF r0 = r10.m5746q()
            if (r0 == 0) goto L1e
            com.xuexiang.xui.widget.imageview.photoview.c$c r4 = new com.xuexiang.xui.widget.imageview.photoview.c$c
            float r6 = r10.m5711C()
            float r7 = r10.f6349c
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
            p197p2.AbstractC8819c.m14783g(r11, r0)
        L57:
            r10.m5741k()
        L5a:
            r11 = r1
        L5b:
            g3.d r0 = r5.f6356j
            if (r0 == 0) goto L91
            boolean r11 = r0.mo12234d()
            g3.d r0 = r5.f6356j
            boolean r0 = r0.mo12231c()
            g3.d r2 = r5.f6356j
            boolean r2 = r2.mo12229a(r12)
            if (r11 != 0) goto L7b
            g3.d r11 = r5.f6356j
            boolean r11 = r11.mo12234d()
            if (r11 != 0) goto L7b
            r11 = r3
            goto L7c
        L7b:
            r11 = r1
        L7c:
            if (r0 != 0) goto L88
            g3.d r0 = r5.f6356j
            boolean r0 = r0.mo12231c()
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
            r5.f6353g = r1
            r11 = r2
        L91:
            android.view.GestureDetector r0 = r5.f6355i
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
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6529c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m5745p() {
        WeakReference weakReference = this.f6354h;
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
            m5741k();
        }
        GestureDetector gestureDetector = this.f6355i;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f6362p = null;
        this.f6363q = null;
        this.f6364r = null;
        this.f6354h = null;
    }

    /* renamed from: q */
    public RectF m5746q() {
        m5744n();
        return m5747r(m5748s());
    }

    /* renamed from: r */
    public final RectF m5747r(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM5750u = m5750u();
        if (imageViewM5750u == null || (drawable = imageViewM5750u.getDrawable()) == null) {
            return null;
        }
        this.f6360n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f6360n);
        return this.f6360n;
    }

    /* renamed from: s */
    public final Matrix m5748s() {
        this.f6358l.set(this.f6357k);
        this.f6358l.postConcat(this.f6359m);
        return this.f6358l;
    }

    /* renamed from: t */
    public Matrix m5749t() {
        return this.f6358l;
    }

    /* renamed from: u */
    public ImageView m5750u() {
        WeakReference weakReference = this.f6354h;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m5745p();
            AbstractC8819c.m14783g("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    /* renamed from: v */
    public final int m5751v(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: w */
    public final int m5752w(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: x */
    public float m5753x() {
        return this.f6351e;
    }

    /* renamed from: y */
    public float m5754y() {
        return this.f6350d;
    }

    /* renamed from: z */
    public float m5755z() {
        return this.f6349c;
    }

    public ViewOnTouchListenerC6529c(ImageView imageView, boolean z9) {
        this.f6347a = new AccelerateDecelerateInterpolator();
        this.f6348b = 200;
        this.f6349c = 1.0f;
        this.f6350d = 1.75f;
        this.f6351e = 3.0f;
        this.f6352f = true;
        this.f6353g = false;
        this.f6357k = new Matrix();
        this.f6358l = new Matrix();
        this.f6359m = new Matrix();
        this.f6360n = new RectF();
        this.f6361o = new float[9];
        this.f6370x = 2;
        this.f6346A = ImageView.ScaleType.FIT_CENTER;
        this.f6354h = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m5700L(imageView);
        this.f6356j = AbstractC7520f.m12235a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f6355i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6527a(this));
        this.f6371y = 0.0f;
        m5738d0(z9);
    }
}
