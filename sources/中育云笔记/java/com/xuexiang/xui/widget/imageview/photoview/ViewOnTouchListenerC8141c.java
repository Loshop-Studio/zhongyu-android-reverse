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
import com.alibaba.fastjson.asm.Opcodes;
import java.lang.ref.WeakReference;
import p034b8.AbstractC5175c;
import p292p8.AbstractC10636a;
import p306q8.AbstractC10760f;
import p306q8.InterfaceC10758d;
import p306q8.InterfaceC10759e;
import p321r8.AbstractC10916c;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.c */
/* loaded from: classes5.dex */
public class ViewOnTouchListenerC8141c implements InterfaceC8140b, View.OnTouchListener, InterfaceC10759e, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: D */
    public static final boolean f16208D = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: E */
    public static int f16209E = 1;

    /* renamed from: A */
    public float f16210A;

    /* renamed from: B */
    public boolean f16211B;

    /* renamed from: C */
    public ImageView.ScaleType f16212C;

    /* renamed from: c */
    public Interpolator f16213c;

    /* renamed from: d */
    public int f16214d;

    /* renamed from: e */
    public float f16215e;

    /* renamed from: f */
    public float f16216f;

    /* renamed from: g */
    public float f16217g;

    /* renamed from: h */
    public boolean f16218h;

    /* renamed from: i */
    public boolean f16219i;

    /* renamed from: j */
    public WeakReference f16220j;

    /* renamed from: k */
    public GestureDetector f16221k;

    /* renamed from: l */
    public InterfaceC10758d f16222l;

    /* renamed from: m */
    public final Matrix f16223m;

    /* renamed from: n */
    public final Matrix f16224n;

    /* renamed from: o */
    public final Matrix f16225o;

    /* renamed from: p */
    public final RectF f16226p;

    /* renamed from: q */
    public final float[] f16227q;

    /* renamed from: r */
    public f f16228r;

    /* renamed from: s */
    public i f16229s;

    /* renamed from: t */
    public View.OnLongClickListener f16230t;

    /* renamed from: u */
    public int f16231u;

    /* renamed from: v */
    public int f16232v;

    /* renamed from: w */
    public int f16233w;

    /* renamed from: x */
    public int f16234x;

    /* renamed from: y */
    public d f16235y;

    /* renamed from: z */
    public int f16236z;

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$a */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ViewOnTouchListenerC8141c.m12789e(ViewOnTouchListenerC8141c.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC8141c.this.f16230t != null && ViewOnTouchListenerC8141c.this.m12837u().getY() == 0.0f && ViewOnTouchListenerC8141c.this.m12837u().getX() == 0.0f) {
                ViewOnTouchListenerC8141c.this.f16230t.onLongClick(ViewOnTouchListenerC8141c.this.m12837u());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16238a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f16238a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16238a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16238a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16238a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16238a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$c */
    public class c implements Runnable {

        /* renamed from: c */
        public final float f16239c;

        /* renamed from: d */
        public final float f16240d;

        /* renamed from: e */
        public final long f16241e = System.currentTimeMillis();

        /* renamed from: f */
        public final float f16242f;

        /* renamed from: g */
        public final float f16243g;

        public c(float f10, float f11, float f12, float f13) {
            this.f16239c = f12;
            this.f16240d = f13;
            this.f16242f = f10;
            this.f16243g = f11;
        }

        /* renamed from: a */
        public final float m12843a() {
            return ViewOnTouchListenerC8141c.this.f16213c.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f16241e) * 1.0f) / ViewOnTouchListenerC8141c.this.f16214d));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM12837u = ViewOnTouchListenerC8141c.this.m12837u();
            if (imageViewM12837u == null) {
                return;
            }
            float fM12843a = m12843a();
            float f10 = this.f16242f;
            ViewOnTouchListenerC8141c.this.mo12821b((f10 + ((this.f16243g - f10) * fM12843a)) / ViewOnTouchListenerC8141c.this.m12798C(), this.f16239c, this.f16240d);
            if (fM12843a < 1.0f) {
                AbstractC10636a.m22504c(imageViewM12837u, this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$d */
    public class d implements Runnable {

        /* renamed from: c */
        public final AbstractC10916c f16245c;

        /* renamed from: d */
        public int f16246d;

        /* renamed from: e */
        public int f16247e;

        public d(Context context) {
            this.f16245c = AbstractC10916c.m23760f(context);
        }

        /* renamed from: a */
        public void m12844a() {
            if (ViewOnTouchListenerC8141c.f16208D) {
                AbstractC5175c.m2708b("PhotoViewAttacher", "Cancel Fling");
            }
            this.f16245c.mo23755c(true);
        }

        /* renamed from: b */
        public void m12845b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFM12833q = ViewOnTouchListenerC8141c.this.m12833q();
            if (rectFM12833q == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM12833q.left);
            float f10 = i10;
            if (f10 < rectFM12833q.width()) {
                iRound = Math.round(rectFM12833q.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFM12833q.top);
            float f11 = i11;
            if (f11 < rectFM12833q.height()) {
                iRound2 = Math.round(rectFM12833q.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f16246d = iRound3;
            this.f16247e = iRound4;
            if (ViewOnTouchListenerC8141c.f16208D) {
                AbstractC5175c.m2708b("PhotoViewAttacher", "fling. StartX:" + iRound3 + " StartY:" + iRound4 + " MaxX:" + iRound + " MaxY:" + iRound2);
            }
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f16245c.mo23754b(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM12837u;
            if (this.f16245c.mo23758g() || (imageViewM12837u = ViewOnTouchListenerC8141c.this.m12837u()) == null || !this.f16245c.mo23759a()) {
                return;
            }
            int iMo23756d = this.f16245c.mo23756d();
            int iMo23757e = this.f16245c.mo23757e();
            if (ViewOnTouchListenerC8141c.f16208D) {
                AbstractC5175c.m2708b("PhotoViewAttacher", "fling run(). CurrentX:" + this.f16246d + " CurrentY:" + this.f16247e + " NewX:" + iMo23756d + " NewY:" + iMo23757e);
            }
            ViewOnTouchListenerC8141c.this.f16225o.postTranslate(this.f16246d - iMo23756d, this.f16247e - iMo23757e);
            ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = ViewOnTouchListenerC8141c.this;
            viewOnTouchListenerC8141c.m12804K(viewOnTouchListenerC8141c.m12835s());
            this.f16246d = iMo23756d;
            this.f16247e = iMo23757e;
            AbstractC10636a.m22504c(imageViewM12837u, this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$e */
    public interface e {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.c$f */
    public interface f {
        /* renamed from: a */
        void mo12846a();

        /* renamed from: b */
        void mo12847b(View view, float f10, float f11);
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
        void mo12848a(View view, float f10, float f11);
    }

    public ViewOnTouchListenerC8141c(ImageView imageView) {
        this(imageView, true);
    }

    /* renamed from: G */
    public static boolean m12785G(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    /* renamed from: H */
    public static boolean m12786H(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (b.f16238a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* renamed from: L */
    public static void m12787L(ImageView imageView) {
        if (imageView == null || (imageView instanceof InterfaceC8140b)) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (scaleType.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    /* renamed from: e */
    public static /* synthetic */ h m12789e(ViewOnTouchListenerC8141c viewOnTouchListenerC8141c) {
        viewOnTouchListenerC8141c.getClass();
        return null;
    }

    /* renamed from: o */
    public static void m12795o(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: A */
    public f m12796A() {
        return this.f16228r;
    }

    /* renamed from: B */
    public i m12797B() {
        return this.f16229s;
    }

    /* renamed from: C */
    public float m12798C() {
        return (float) Math.sqrt(((float) Math.pow(m12800E(this.f16225o, 0), 2.0d)) + ((float) Math.pow(m12800E(this.f16225o, 3), 2.0d)));
    }

    /* renamed from: D */
    public ImageView.ScaleType m12799D() {
        return this.f16212C;
    }

    /* renamed from: E */
    public final float m12800E(Matrix matrix, int i10) {
        matrix.getValues(this.f16227q);
        return this.f16227q[i10];
    }

    /* renamed from: F */
    public Bitmap m12801F() {
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u == null) {
            return null;
        }
        return imageViewM12837u.getDrawingCache();
    }

    /* renamed from: I */
    public void m12802I() {
        this.f16225o.reset();
        m12815W(this.f16210A);
        m12804K(m12835s());
        m12831n();
    }

    /* renamed from: J */
    public void m12803J(boolean z10) {
        this.f16218h = z10;
    }

    /* renamed from: K */
    public final void m12804K(Matrix matrix) {
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u != null) {
            m12830m();
            imageViewM12837u.setImageMatrix(matrix);
        }
    }

    /* renamed from: M */
    public void m12805M(float f10) {
        m12795o(this.f16215e, this.f16216f, f10);
        this.f16217g = f10;
    }

    /* renamed from: N */
    public void m12806N(float f10) {
        m12795o(this.f16215e, f10, this.f16217g);
        this.f16216f = f10;
    }

    /* renamed from: O */
    public void m12807O(float f10) {
        m12795o(f10, this.f16216f, this.f16217g);
        this.f16215e = f10;
    }

    /* renamed from: P */
    public void m12808P(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f16221k.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f16221k.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC8139a(this));
        }
    }

    /* renamed from: Q */
    public void m12809Q(View.OnLongClickListener onLongClickListener) {
        this.f16230t = onLongClickListener;
    }

    /* renamed from: R */
    public void m12810R(e eVar) {
    }

    /* renamed from: S */
    public void m12811S(f fVar) {
        this.f16228r = fVar;
    }

    /* renamed from: T */
    public void m12812T(g gVar) {
    }

    /* renamed from: U */
    public void m12813U(h hVar) {
    }

    /* renamed from: V */
    public void m12814V(i iVar) {
        this.f16229s = iVar;
    }

    /* renamed from: W */
    public void m12815W(float f10) {
        this.f16225o.postRotate(f10 % 360.0f);
        m12829l();
    }

    /* renamed from: X */
    public void m12816X(float f10) {
        this.f16225o.setRotate(f10 % 360.0f);
        m12829l();
    }

    /* renamed from: Y */
    public void m12817Y(float f10) {
        m12820a0(f10, false);
    }

    /* renamed from: Z */
    public void m12818Z(float f10, float f11, float f12, boolean z10) {
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u != null) {
            if (f10 < this.f16215e || f10 > this.f16217g) {
                AbstractC5175c.m2712f("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            } else if (z10) {
                imageViewM12837u.post(new c(m12798C(), f10, f11, f12));
            } else {
                this.f16225o.setScale(f10, f10, f11, f12);
                m12829l();
            }
        }
    }

    @Override // p306q8.InterfaceC10759e
    /* renamed from: a */
    public void mo12819a(float f10, float f11) {
        if (this.f16222l.mo22854d()) {
            return;
        }
        if (f16208D) {
            AbstractC5175c.m2708b("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f10), Float.valueOf(f11)));
        }
        ImageView imageViewM12837u = m12837u();
        this.f16225o.postTranslate(f10, f11);
        m12829l();
        ViewParent parent = imageViewM12837u.getParent();
        if (!this.f16218h || this.f16222l.mo22854d() || this.f16219i) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i10 = this.f16236z;
        if ((i10 == 2 || ((i10 == 0 && f10 >= 1.0f) || (i10 == 1 && f10 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: a0 */
    public void m12820a0(float f10, boolean z10) {
        if (m12837u() != null) {
            m12818Z(f10, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z10);
        }
    }

    @Override // p306q8.InterfaceC10759e
    /* renamed from: b */
    public void mo12821b(float f10, float f11, float f12) {
        if (f16208D) {
            AbstractC5175c.m2708b("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (m12798C() < this.f16217g || f10 < 1.0f) {
            if (m12798C() > this.f16215e || f10 > 1.0f) {
                this.f16225o.postScale(f10, f10, f11, f12);
                m12829l();
            }
        }
    }

    /* renamed from: b0 */
    public void m12822b0(ImageView.ScaleType scaleType) {
        if (!m12786H(scaleType) || scaleType == this.f16212C) {
            return;
        }
        this.f16212C = scaleType;
        m12826e0();
    }

    @Override // p306q8.InterfaceC10759e
    /* renamed from: c */
    public void mo12823c(float f10, float f11, float f12, float f13) {
        if (f16208D) {
            AbstractC5175c.m2708b("PhotoViewAttacher", "onFling. sX: " + f10 + " sY: " + f11 + " Vx: " + f12 + " Vy: " + f13);
        }
        ImageView imageViewM12837u = m12837u();
        d dVar = new d(imageViewM12837u.getContext());
        this.f16235y = dVar;
        dVar.m12845b(m12839w(imageViewM12837u), m12838v(imageViewM12837u), (int) f12, (int) f13);
        imageViewM12837u.post(this.f16235y);
    }

    /* renamed from: c0 */
    public void m12824c0(int i10) {
        if (i10 < 0) {
            i10 = 200;
        }
        this.f16214d = i10;
    }

    /* renamed from: d0 */
    public void m12825d0(boolean z10) {
        this.f16211B = z10;
        m12826e0();
    }

    /* renamed from: e0 */
    public void m12826e0() {
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u != null) {
            if (!this.f16211B) {
                m12802I();
            } else {
                m12787L(imageViewM12837u);
                m12827f0(imageViewM12837u.getDrawable());
            }
        }
    }

    /* renamed from: f0 */
    public final void m12827f0(Drawable drawable) {
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u == null || drawable == null) {
            return;
        }
        float fM12839w = m12839w(imageViewM12837u);
        float fM12838v = m12838v(imageViewM12837u);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f16223m.reset();
        float f10 = intrinsicWidth;
        float f11 = fM12839w / f10;
        float f12 = intrinsicHeight;
        float f13 = fM12838v / f12;
        ImageView.ScaleType scaleType = this.f16212C;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f16223m.postTranslate((fM12839w - f10) / 2.0f, (fM12838v - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f16223m.postScale(fMax, fMax);
            this.f16223m.postTranslate((fM12839w - (f10 * fMax)) / 2.0f, (fM12838v - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f16223m.postScale(fMin, fMin);
            this.f16223m.postTranslate((fM12839w - (f10 * fMin)) / 2.0f, (fM12838v - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM12839w, fM12838v);
            if (((int) this.f16210A) % Opcodes.GETFIELD != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = b.f16238a[this.f16212C.ordinal()];
            if (i10 == 2) {
                this.f16223m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f16223m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f16223m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 5) {
                this.f16223m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m12802I();
    }

    /* renamed from: k */
    public final void m12828k() {
        d dVar = this.f16235y;
        if (dVar != null) {
            dVar.m12844a();
            this.f16235y = null;
        }
    }

    /* renamed from: l */
    public final void m12829l() {
        if (m12831n()) {
            m12804K(m12835s());
        }
    }

    /* renamed from: m */
    public final void m12830m() {
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u != null && !(imageViewM12837u instanceof InterfaceC8140b) && !ImageView.ScaleType.MATRIX.equals(imageViewM12837u.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    /* renamed from: n */
    public final boolean m12831n() {
        RectF rectFM12834r;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u == null || (rectFM12834r = m12834r(m12835s())) == null) {
            return false;
        }
        float fHeight = rectFM12834r.height();
        float fWidth = rectFM12834r.width();
        float fM12838v = m12838v(imageViewM12837u);
        float f16 = 0.0f;
        if (fHeight <= fM12838v) {
            int i10 = b.f16238a[this.f16212C.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    fM12838v = (fM12838v - fHeight) / 2.0f;
                    f11 = rectFM12834r.top;
                } else {
                    fM12838v -= fHeight;
                    f11 = rectFM12834r.top;
                }
            } else {
                f10 = rectFM12834r.top;
                f12 = -f10;
            }
        } else {
            f10 = rectFM12834r.top;
            if (f10 > 0.0f) {
                f12 = -f10;
            } else {
                f11 = rectFM12834r.bottom;
                f12 = f11 < fM12838v ? fM12838v - f11 : 0.0f;
            }
        }
        float fM12839w = m12839w(imageViewM12837u);
        if (fWidth <= fM12839w) {
            int i11 = b.f16238a[this.f16212C.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f14 = (fM12839w - fWidth) / 2.0f;
                    f15 = rectFM12834r.left;
                } else {
                    f14 = fM12839w - fWidth;
                    f15 = rectFM12834r.left;
                }
                f13 = f14 - f15;
            } else {
                f13 = -rectFM12834r.left;
            }
            f16 = f13;
            this.f16236z = 2;
        } else {
            float f17 = rectFM12834r.left;
            if (f17 > 0.0f) {
                this.f16236z = 0;
                f16 = -f17;
            } else {
                float f18 = rectFM12834r.right;
                if (f18 < fM12839w) {
                    f16 = fM12839w - f18;
                    this.f16236z = 1;
                } else {
                    this.f16236z = -1;
                }
            }
        }
        this.f16225o.postTranslate(f16, f12);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u != null) {
            if (!this.f16211B) {
                m12827f0(imageViewM12837u.getDrawable());
                return;
            }
            int top2 = imageViewM12837u.getTop();
            int right = imageViewM12837u.getRight();
            int bottom = imageViewM12837u.getBottom();
            int left = imageViewM12837u.getLeft();
            if (top2 == this.f16231u && bottom == this.f16233w && left == this.f16234x && right == this.f16232v) {
                return;
            }
            m12827f0(imageViewM12837u.getDrawable());
            this.f16231u = top2;
            this.f16232v = right;
            this.f16233w = bottom;
            this.f16234x = left;
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
            boolean r0 = r10.f16211B
            r1 = 0
            if (r0 == 0) goto L9d
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = m12785G(r0)
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
            float r0 = r10.m12798C()
            float r2 = r10.f16215e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1e
            android.graphics.RectF r0 = r10.m12833q()
            if (r0 == 0) goto L1e
            com.xuexiang.xui.widget.imageview.photoview.c$c r4 = new com.xuexiang.xui.widget.imageview.photoview.c$c
            float r6 = r10.m12798C()
            float r7 = r10.f16215e
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
            p034b8.AbstractC5175c.m2712f(r11, r0)
        L57:
            r10.m12828k()
        L5a:
            r11 = r1
        L5b:
            q8.d r0 = r5.f16222l
            if (r0 == 0) goto L91
            boolean r11 = r0.mo22854d()
            q8.d r0 = r5.f16222l
            boolean r0 = r0.mo22851c()
            q8.d r2 = r5.f16222l
            boolean r2 = r2.mo22849a(r12)
            if (r11 != 0) goto L7b
            q8.d r11 = r5.f16222l
            boolean r11 = r11.mo22854d()
            if (r11 != 0) goto L7b
            r11 = r3
            goto L7c
        L7b:
            r11 = r1
        L7c:
            if (r0 != 0) goto L88
            q8.d r0 = r5.f16222l
            boolean r0 = r0.mo22851c()
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
            r5.f16219i = r1
            r11 = r2
        L91:
            android.view.GestureDetector r0 = r5.f16221k
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
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC8141c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m12832p() {
        WeakReference weakReference = this.f16220j;
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
            m12828k();
        }
        GestureDetector gestureDetector = this.f16221k;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f16228r = null;
        this.f16229s = null;
        this.f16230t = null;
        this.f16220j = null;
    }

    /* renamed from: q */
    public RectF m12833q() {
        m12831n();
        return m12834r(m12835s());
    }

    /* renamed from: r */
    public final RectF m12834r(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM12837u = m12837u();
        if (imageViewM12837u == null || (drawable = imageViewM12837u.getDrawable()) == null) {
            return null;
        }
        this.f16226p.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f16226p);
        return this.f16226p;
    }

    /* renamed from: s */
    public final Matrix m12835s() {
        this.f16224n.set(this.f16223m);
        this.f16224n.postConcat(this.f16225o);
        return this.f16224n;
    }

    /* renamed from: t */
    public Matrix m12836t() {
        return this.f16224n;
    }

    /* renamed from: u */
    public ImageView m12837u() {
        WeakReference weakReference = this.f16220j;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m12832p();
            AbstractC5175c.m2712f("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    /* renamed from: v */
    public final int m12838v(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: w */
    public final int m12839w(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: x */
    public float m12840x() {
        return this.f16217g;
    }

    /* renamed from: y */
    public float m12841y() {
        return this.f16216f;
    }

    /* renamed from: z */
    public float m12842z() {
        return this.f16215e;
    }

    public ViewOnTouchListenerC8141c(ImageView imageView, boolean z10) {
        this.f16213c = new AccelerateDecelerateInterpolator();
        this.f16214d = 200;
        this.f16215e = 1.0f;
        this.f16216f = 1.75f;
        this.f16217g = 3.0f;
        this.f16218h = true;
        this.f16219i = false;
        this.f16223m = new Matrix();
        this.f16224n = new Matrix();
        this.f16225o = new Matrix();
        this.f16226p = new RectF();
        this.f16227q = new float[9];
        this.f16236z = 2;
        this.f16212C = ImageView.ScaleType.FIT_CENTER;
        this.f16220j = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m12787L(imageView);
        this.f16222l = AbstractC10760f.m22855a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f16221k = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC8139a(this));
        this.f16210A = 0.0f;
        m12825d0(z10);
    }
}
