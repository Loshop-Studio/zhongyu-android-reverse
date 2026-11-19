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
import p104f3.AbstractC7919c;
import p271v3.AbstractC9761a;
import p281w3.AbstractC9820f;
import p281w3.InterfaceC9818d;
import p281w3.InterfaceC9819e;
import p291x3.AbstractC9876c;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.c */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC6849c implements InterfaceC6848b, View.OnTouchListener, InterfaceC9819e, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: B */
    public static final boolean f7602B = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: C */
    public static int f7603C = 1;

    /* renamed from: A */
    public ImageView.ScaleType f7604A;

    /* renamed from: a */
    public Interpolator f7605a;

    /* renamed from: b */
    public int f7606b;

    /* renamed from: c */
    public float f7607c;

    /* renamed from: d */
    public float f7608d;

    /* renamed from: e */
    public float f7609e;

    /* renamed from: f */
    public boolean f7610f;

    /* renamed from: g */
    public boolean f7611g;

    /* renamed from: h */
    public WeakReference f7612h;

    /* renamed from: i */
    public GestureDetector f7613i;

    /* renamed from: j */
    public InterfaceC9818d f7614j;

    /* renamed from: k */
    public final Matrix f7615k;

    /* renamed from: l */
    public final Matrix f7616l;

    /* renamed from: m */
    public final Matrix f7617m;

    /* renamed from: n */
    public final RectF f7618n;

    /* renamed from: o */
    public final float[] f7619o;

    /* renamed from: p */
    public f f7620p;

    /* renamed from: q */
    public i f7621q;

    /* renamed from: r */
    public View.OnLongClickListener f7622r;

    /* renamed from: s */
    public int f7623s;

    /* renamed from: t */
    public int f7624t;

    /* renamed from: u */
    public int f7625u;

    /* renamed from: v */
    public int f7626v;

    /* renamed from: w */
    public d f7627w;

    /* renamed from: x */
    public int f7628x;

    /* renamed from: y */
    public float f7629y;

    /* renamed from: z */
    public boolean f7630z;

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ViewOnTouchListenerC6849c.m6808e(ViewOnTouchListenerC6849c.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC6849c.this.f7622r != null && ViewOnTouchListenerC6849c.this.m6856u().getY() == 0.0f && ViewOnTouchListenerC6849c.this.m6856u().getX() == 0.0f) {
                ViewOnTouchListenerC6849c.this.f7622r.onLongClick(ViewOnTouchListenerC6849c.this.m6856u());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7632a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f7632a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7632a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7632a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7632a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7632a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final float f7633a;

        /* renamed from: b */
        public final float f7634b;

        /* renamed from: c */
        public final long f7635c = System.currentTimeMillis();

        /* renamed from: d */
        public final float f7636d;

        /* renamed from: e */
        public final float f7637e;

        public c(float f10, float f11, float f12, float f13) {
            this.f7633a = f12;
            this.f7634b = f13;
            this.f7636d = f10;
            this.f7637e = f11;
        }

        /* renamed from: a */
        public final float m6862a() {
            return ViewOnTouchListenerC6849c.this.f7605a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f7635c) * 1.0f) / ViewOnTouchListenerC6849c.this.f7606b));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM6856u = ViewOnTouchListenerC6849c.this.m6856u();
            if (imageViewM6856u == null) {
                return;
            }
            float fM6862a = m6862a();
            float f10 = this.f7636d;
            ViewOnTouchListenerC6849c.this.mo6840b((f10 + ((this.f7637e - f10) * fM6862a)) / ViewOnTouchListenerC6849c.this.m6817C(), this.f7633a, this.f7634b);
            if (fM6862a < 1.0f) {
                AbstractC9761a.m16447c(imageViewM6856u, this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final AbstractC9876c f7639a;

        /* renamed from: b */
        public int f7640b;

        /* renamed from: c */
        public int f7641c;

        public d(Context context) {
            this.f7639a = AbstractC9876c.m16878f(context);
        }

        /* renamed from: a */
        public void m6863a() {
            if (ViewOnTouchListenerC6849c.f7602B) {
                AbstractC7919c.m12469b("PhotoViewAttacher", "Cancel Fling");
            }
            this.f7639a.mo16873c(true);
        }

        /* renamed from: b */
        public void m6864b(int i9, int i10, int i11, int i12) {
            int i13;
            int iRound;
            int i14;
            int iRound2;
            RectF rectFM6852q = ViewOnTouchListenerC6849c.this.m6852q();
            if (rectFM6852q == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM6852q.left);
            float f10 = i9;
            if (f10 < rectFM6852q.width()) {
                iRound = Math.round(rectFM6852q.width() - f10);
                i13 = 0;
            } else {
                i13 = iRound3;
                iRound = i13;
            }
            int iRound4 = Math.round(-rectFM6852q.top);
            float f11 = i10;
            if (f11 < rectFM6852q.height()) {
                iRound2 = Math.round(rectFM6852q.height() - f11);
                i14 = 0;
            } else {
                i14 = iRound4;
                iRound2 = i14;
            }
            this.f7640b = iRound3;
            this.f7641c = iRound4;
            if (ViewOnTouchListenerC6849c.f7602B) {
                AbstractC7919c.m12469b("PhotoViewAttacher", "fling. StartX:" + iRound3 + " StartY:" + iRound4 + " MaxX:" + iRound + " MaxY:" + iRound2);
            }
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f7639a.mo16872b(iRound3, iRound4, i11, i12, i13, iRound, i14, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM6856u;
            if (this.f7639a.mo16876g() || (imageViewM6856u = ViewOnTouchListenerC6849c.this.m6856u()) == null || !this.f7639a.mo16877a()) {
                return;
            }
            int iMo16874d = this.f7639a.mo16874d();
            int iMo16875e = this.f7639a.mo16875e();
            if (ViewOnTouchListenerC6849c.f7602B) {
                AbstractC7919c.m12469b("PhotoViewAttacher", "fling run(). CurrentX:" + this.f7640b + " CurrentY:" + this.f7641c + " NewX:" + iMo16874d + " NewY:" + iMo16875e);
            }
            ViewOnTouchListenerC6849c.this.f7617m.postTranslate(this.f7640b - iMo16874d, this.f7641c - iMo16875e);
            ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = ViewOnTouchListenerC6849c.this;
            viewOnTouchListenerC6849c.m6823K(viewOnTouchListenerC6849c.m6854s());
            this.f7640b = iMo16874d;
            this.f7641c = iMo16875e;
            AbstractC9761a.m16447c(imageViewM6856u, this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$e */
    public interface e {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$f */
    public interface f {
        /* renamed from: a */
        void mo6865a();

        /* renamed from: b */
        void mo6866b(View view, float f10, float f11);
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
        void mo6867a(View view, float f10, float f11);
    }

    public ViewOnTouchListenerC6849c(ImageView imageView) {
        this(imageView, true);
    }

    /* renamed from: G */
    public static boolean m6804G(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    /* renamed from: H */
    public static boolean m6805H(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (b.f7632a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* renamed from: L */
    public static void m6806L(ImageView imageView) {
        if (imageView == null || (imageView instanceof InterfaceC6848b)) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (scaleType.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    /* renamed from: e */
    public static /* synthetic */ h m6808e(ViewOnTouchListenerC6849c viewOnTouchListenerC6849c) {
        viewOnTouchListenerC6849c.getClass();
        return null;
    }

    /* renamed from: o */
    public static void m6814o(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: A */
    public f m6815A() {
        return this.f7620p;
    }

    /* renamed from: B */
    public i m6816B() {
        return this.f7621q;
    }

    /* renamed from: C */
    public float m6817C() {
        return (float) Math.sqrt(((float) Math.pow(m6819E(this.f7617m, 0), 2.0d)) + ((float) Math.pow(m6819E(this.f7617m, 3), 2.0d)));
    }

    /* renamed from: D */
    public ImageView.ScaleType m6818D() {
        return this.f7604A;
    }

    /* renamed from: E */
    public final float m6819E(Matrix matrix, int i9) {
        matrix.getValues(this.f7619o);
        return this.f7619o[i9];
    }

    /* renamed from: F */
    public Bitmap m6820F() {
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u == null) {
            return null;
        }
        return imageViewM6856u.getDrawingCache();
    }

    /* renamed from: I */
    public void m6821I() {
        this.f7617m.reset();
        m6834W(this.f7629y);
        m6823K(m6854s());
        m6850n();
    }

    /* renamed from: J */
    public void m6822J(boolean z9) {
        this.f7610f = z9;
    }

    /* renamed from: K */
    public final void m6823K(Matrix matrix) {
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u != null) {
            m6849m();
            imageViewM6856u.setImageMatrix(matrix);
        }
    }

    /* renamed from: M */
    public void m6824M(float f10) {
        m6814o(this.f7607c, this.f7608d, f10);
        this.f7609e = f10;
    }

    /* renamed from: N */
    public void m6825N(float f10) {
        m6814o(this.f7607c, f10, this.f7609e);
        this.f7608d = f10;
    }

    /* renamed from: O */
    public void m6826O(float f10) {
        m6814o(f10, this.f7608d, this.f7609e);
        this.f7607c = f10;
    }

    /* renamed from: P */
    public void m6827P(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f7613i.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f7613i.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6847a(this));
        }
    }

    /* renamed from: Q */
    public void m6828Q(View.OnLongClickListener onLongClickListener) {
        this.f7622r = onLongClickListener;
    }

    /* renamed from: R */
    public void m6829R(e eVar) {
    }

    /* renamed from: S */
    public void m6830S(f fVar) {
        this.f7620p = fVar;
    }

    /* renamed from: T */
    public void m6831T(g gVar) {
    }

    /* renamed from: U */
    public void m6832U(h hVar) {
    }

    /* renamed from: V */
    public void m6833V(i iVar) {
        this.f7621q = iVar;
    }

    /* renamed from: W */
    public void m6834W(float f10) {
        this.f7617m.postRotate(f10 % 360.0f);
        m6848l();
    }

    /* renamed from: X */
    public void m6835X(float f10) {
        this.f7617m.setRotate(f10 % 360.0f);
        m6848l();
    }

    /* renamed from: Y */
    public void m6836Y(float f10) {
        m6839a0(f10, false);
    }

    /* renamed from: Z */
    public void m6837Z(float f10, float f11, float f12, boolean z9) {
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u != null) {
            if (f10 < this.f7607c || f10 > this.f7609e) {
                AbstractC7919c.m12474g("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            } else if (z9) {
                imageViewM6856u.post(new c(m6817C(), f10, f11, f12));
            } else {
                this.f7617m.setScale(f10, f10, f11, f12);
                m6848l();
            }
        }
    }

    @Override // p281w3.InterfaceC9819e
    /* renamed from: a */
    public void mo6838a(float f10, float f11) {
        if (this.f7614j.mo16680d()) {
            return;
        }
        if (f7602B) {
            AbstractC7919c.m12469b("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f10), Float.valueOf(f11)));
        }
        ImageView imageViewM6856u = m6856u();
        this.f7617m.postTranslate(f10, f11);
        m6848l();
        ViewParent parent = imageViewM6856u.getParent();
        if (!this.f7610f || this.f7614j.mo16680d() || this.f7611g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i9 = this.f7628x;
        if ((i9 == 2 || ((i9 == 0 && f10 >= 1.0f) || (i9 == 1 && f10 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: a0 */
    public void m6839a0(float f10, boolean z9) {
        if (m6856u() != null) {
            m6837Z(f10, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z9);
        }
    }

    @Override // p281w3.InterfaceC9819e
    /* renamed from: b */
    public void mo6840b(float f10, float f11, float f12) {
        if (f7602B) {
            AbstractC7919c.m12469b("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (m6817C() < this.f7609e || f10 < 1.0f) {
            if (m6817C() > this.f7607c || f10 > 1.0f) {
                this.f7617m.postScale(f10, f10, f11, f12);
                m6848l();
            }
        }
    }

    /* renamed from: b0 */
    public void m6841b0(ImageView.ScaleType scaleType) {
        if (!m6805H(scaleType) || scaleType == this.f7604A) {
            return;
        }
        this.f7604A = scaleType;
        m6845e0();
    }

    @Override // p281w3.InterfaceC9819e
    /* renamed from: c */
    public void mo6842c(float f10, float f11, float f12, float f13) {
        if (f7602B) {
            AbstractC7919c.m12469b("PhotoViewAttacher", "onFling. sX: " + f10 + " sY: " + f11 + " Vx: " + f12 + " Vy: " + f13);
        }
        ImageView imageViewM6856u = m6856u();
        d dVar = new d(imageViewM6856u.getContext());
        this.f7627w = dVar;
        dVar.m6864b(m6858w(imageViewM6856u), m6857v(imageViewM6856u), (int) f12, (int) f13);
        imageViewM6856u.post(this.f7627w);
    }

    /* renamed from: c0 */
    public void m6843c0(int i9) {
        if (i9 < 0) {
            i9 = 200;
        }
        this.f7606b = i9;
    }

    /* renamed from: d0 */
    public void m6844d0(boolean z9) {
        this.f7630z = z9;
        m6845e0();
    }

    /* renamed from: e0 */
    public void m6845e0() {
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u != null) {
            if (!this.f7630z) {
                m6821I();
            } else {
                m6806L(imageViewM6856u);
                m6846f0(imageViewM6856u.getDrawable());
            }
        }
    }

    /* renamed from: f0 */
    public final void m6846f0(Drawable drawable) {
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u == null || drawable == null) {
            return;
        }
        float fM6858w = m6858w(imageViewM6856u);
        float fM6857v = m6857v(imageViewM6856u);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f7615k.reset();
        float f10 = intrinsicWidth;
        float f11 = fM6858w / f10;
        float f12 = intrinsicHeight;
        float f13 = fM6857v / f12;
        ImageView.ScaleType scaleType = this.f7604A;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f7615k.postTranslate((fM6858w - f10) / 2.0f, (fM6857v - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f7615k.postScale(fMax, fMax);
            this.f7615k.postTranslate((fM6858w - (f10 * fMax)) / 2.0f, (fM6857v - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f7615k.postScale(fMin, fMin);
            this.f7615k.postTranslate((fM6858w - (f10 * fMin)) / 2.0f, (fM6857v - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM6858w, fM6857v);
            if (((int) this.f7629y) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i9 = b.f7632a[this.f7604A.ordinal()];
            if (i9 == 2) {
                this.f7615k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i9 == 3) {
                this.f7615k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i9 == 4) {
                this.f7615k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i9 == 5) {
                this.f7615k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m6821I();
    }

    /* renamed from: k */
    public final void m6847k() {
        d dVar = this.f7627w;
        if (dVar != null) {
            dVar.m6863a();
            this.f7627w = null;
        }
    }

    /* renamed from: l */
    public final void m6848l() {
        if (m6850n()) {
            m6823K(m6854s());
        }
    }

    /* renamed from: m */
    public final void m6849m() {
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u != null && !(imageViewM6856u instanceof InterfaceC6848b) && !ImageView.ScaleType.MATRIX.equals(imageViewM6856u.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    /* renamed from: n */
    public final boolean m6850n() {
        RectF rectFM6853r;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u == null || (rectFM6853r = m6853r(m6854s())) == null) {
            return false;
        }
        float fHeight = rectFM6853r.height();
        float fWidth = rectFM6853r.width();
        float fM6857v = m6857v(imageViewM6856u);
        float f16 = 0.0f;
        if (fHeight <= fM6857v) {
            int i9 = b.f7632a[this.f7604A.ordinal()];
            if (i9 != 2) {
                if (i9 != 3) {
                    fM6857v = (fM6857v - fHeight) / 2.0f;
                    f11 = rectFM6853r.top;
                } else {
                    fM6857v -= fHeight;
                    f11 = rectFM6853r.top;
                }
            } else {
                f10 = rectFM6853r.top;
                f12 = -f10;
            }
        } else {
            f10 = rectFM6853r.top;
            if (f10 > 0.0f) {
                f12 = -f10;
            } else {
                f11 = rectFM6853r.bottom;
                f12 = f11 < fM6857v ? fM6857v - f11 : 0.0f;
            }
        }
        float fM6858w = m6858w(imageViewM6856u);
        if (fWidth <= fM6858w) {
            int i10 = b.f7632a[this.f7604A.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f14 = (fM6858w - fWidth) / 2.0f;
                    f15 = rectFM6853r.left;
                } else {
                    f14 = fM6858w - fWidth;
                    f15 = rectFM6853r.left;
                }
                f13 = f14 - f15;
            } else {
                f13 = -rectFM6853r.left;
            }
            f16 = f13;
            this.f7628x = 2;
        } else {
            float f17 = rectFM6853r.left;
            if (f17 > 0.0f) {
                this.f7628x = 0;
                f16 = -f17;
            } else {
                float f18 = rectFM6853r.right;
                if (f18 < fM6858w) {
                    f16 = fM6858w - f18;
                    this.f7628x = 1;
                } else {
                    this.f7628x = -1;
                }
            }
        }
        this.f7617m.postTranslate(f16, f12);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u != null) {
            if (!this.f7630z) {
                m6846f0(imageViewM6856u.getDrawable());
                return;
            }
            int top2 = imageViewM6856u.getTop();
            int right = imageViewM6856u.getRight();
            int bottom = imageViewM6856u.getBottom();
            int left = imageViewM6856u.getLeft();
            if (top2 == this.f7623s && bottom == this.f7625u && left == this.f7626v && right == this.f7624t) {
                return;
            }
            m6846f0(imageViewM6856u.getDrawable());
            this.f7623s = top2;
            this.f7624t = right;
            this.f7625u = bottom;
            this.f7626v = left;
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
            boolean r0 = r10.f7630z
            r1 = 0
            if (r0 == 0) goto L9d
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = m6804G(r0)
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
            float r0 = r10.m6817C()
            float r2 = r10.f7607c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1e
            android.graphics.RectF r0 = r10.m6852q()
            if (r0 == 0) goto L1e
            com.xuexiang.xui.widget.imageview.photoview.c$c r4 = new com.xuexiang.xui.widget.imageview.photoview.c$c
            float r6 = r10.m6817C()
            float r7 = r10.f7607c
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
            p104f3.AbstractC7919c.m12474g(r11, r0)
        L57:
            r10.m6847k()
        L5a:
            r11 = r1
        L5b:
            w3.d r0 = r5.f7614j
            if (r0 == 0) goto L91
            boolean r11 = r0.mo16680d()
            w3.d r0 = r5.f7614j
            boolean r0 = r0.mo16677c()
            w3.d r2 = r5.f7614j
            boolean r2 = r2.mo16675a(r12)
            if (r11 != 0) goto L7b
            w3.d r11 = r5.f7614j
            boolean r11 = r11.mo16680d()
            if (r11 != 0) goto L7b
            r11 = r3
            goto L7c
        L7b:
            r11 = r1
        L7c:
            if (r0 != 0) goto L88
            w3.d r0 = r5.f7614j
            boolean r0 = r0.mo16677c()
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
            r5.f7611g = r1
            r11 = r2
        L91:
            android.view.GestureDetector r0 = r5.f7613i
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
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m6851p() {
        WeakReference weakReference = this.f7612h;
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
            m6847k();
        }
        GestureDetector gestureDetector = this.f7613i;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f7620p = null;
        this.f7621q = null;
        this.f7622r = null;
        this.f7612h = null;
    }

    /* renamed from: q */
    public RectF m6852q() {
        m6850n();
        return m6853r(m6854s());
    }

    /* renamed from: r */
    public final RectF m6853r(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM6856u = m6856u();
        if (imageViewM6856u == null || (drawable = imageViewM6856u.getDrawable()) == null) {
            return null;
        }
        this.f7618n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f7618n);
        return this.f7618n;
    }

    /* renamed from: s */
    public final Matrix m6854s() {
        this.f7616l.set(this.f7615k);
        this.f7616l.postConcat(this.f7617m);
        return this.f7616l;
    }

    /* renamed from: t */
    public Matrix m6855t() {
        return this.f7616l;
    }

    /* renamed from: u */
    public ImageView m6856u() {
        WeakReference weakReference = this.f7612h;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m6851p();
            AbstractC7919c.m12474g("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    /* renamed from: v */
    public final int m6857v(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: w */
    public final int m6858w(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: x */
    public float m6859x() {
        return this.f7609e;
    }

    /* renamed from: y */
    public float m6860y() {
        return this.f7608d;
    }

    /* renamed from: z */
    public float m6861z() {
        return this.f7607c;
    }

    public ViewOnTouchListenerC6849c(ImageView imageView, boolean z9) {
        this.f7605a = new AccelerateDecelerateInterpolator();
        this.f7606b = 200;
        this.f7607c = 1.0f;
        this.f7608d = 1.75f;
        this.f7609e = 3.0f;
        this.f7610f = true;
        this.f7611g = false;
        this.f7615k = new Matrix();
        this.f7616l = new Matrix();
        this.f7617m = new Matrix();
        this.f7618n = new RectF();
        this.f7619o = new float[9];
        this.f7628x = 2;
        this.f7604A = ImageView.ScaleType.FIT_CENTER;
        this.f7612h = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m6806L(imageView);
        this.f7614j = AbstractC9820f.m16681a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f7613i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6847a(this));
        this.f7629y = 0.0f;
        m6844d0(z9);
    }
}
