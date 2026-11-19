package p302q4;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.alibaba.fastjson.asm.Opcodes;

/* renamed from: q4.k */
/* loaded from: classes5.dex */
public class ViewOnTouchListenerC10735k implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: A */
    public static float f25809A = 3.0f;

    /* renamed from: B */
    public static float f25810B = 1.75f;

    /* renamed from: C */
    public static float f25811C = 1.0f;

    /* renamed from: D */
    public static int f25812D = 200;

    /* renamed from: j */
    public ImageView f25820j;

    /* renamed from: k */
    public GestureDetector f25821k;

    /* renamed from: l */
    public C10726b f25822l;

    /* renamed from: r */
    public View.OnClickListener f25828r;

    /* renamed from: s */
    public View.OnLongClickListener f25829s;

    /* renamed from: t */
    public f f25830t;

    /* renamed from: w */
    public float f25833w;

    /* renamed from: c */
    public Interpolator f25813c = new AccelerateDecelerateInterpolator();

    /* renamed from: d */
    public int f25814d = f25812D;

    /* renamed from: e */
    public float f25815e = f25811C;

    /* renamed from: f */
    public float f25816f = f25810B;

    /* renamed from: g */
    public float f25817g = f25809A;

    /* renamed from: h */
    public boolean f25818h = true;

    /* renamed from: i */
    public boolean f25819i = false;

    /* renamed from: m */
    public final Matrix f25823m = new Matrix();

    /* renamed from: n */
    public final Matrix f25824n = new Matrix();

    /* renamed from: o */
    public final Matrix f25825o = new Matrix();

    /* renamed from: p */
    public final RectF f25826p = new RectF();

    /* renamed from: q */
    public final float[] f25827q = new float[9];

    /* renamed from: u */
    public int f25831u = 2;

    /* renamed from: v */
    public int f25832v = 2;

    /* renamed from: x */
    public boolean f25834x = true;

    /* renamed from: y */
    public ImageView.ScaleType f25835y = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: z */
    public InterfaceC10727c f25836z = new a();

    /* renamed from: q4.k$a */
    public class a implements InterfaceC10727c {
        public a() {
        }

        @Override // p302q4.InterfaceC10727c
        /* renamed from: a */
        public void mo22723a(float f10, float f11) {
            if (ViewOnTouchListenerC10735k.this.f25822l.m22720e()) {
                return;
            }
            ViewOnTouchListenerC10735k.m22727b(ViewOnTouchListenerC10735k.this);
            ViewOnTouchListenerC10735k.this.f25825o.postTranslate(f10, f11);
            ViewOnTouchListenerC10735k.this.m22790z();
            ViewParent parent = ViewOnTouchListenerC10735k.this.f25820j.getParent();
            if (!ViewOnTouchListenerC10735k.this.f25818h || ViewOnTouchListenerC10735k.this.f25822l.m22720e() || ViewOnTouchListenerC10735k.this.f25819i) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((ViewOnTouchListenerC10735k.this.f25831u == 2 || ((ViewOnTouchListenerC10735k.this.f25831u == 0 && f10 >= 1.0f) || ((ViewOnTouchListenerC10735k.this.f25831u == 1 && f10 <= -1.0f) || ((ViewOnTouchListenerC10735k.this.f25832v == 0 && f11 >= 1.0f) || (ViewOnTouchListenerC10735k.this.f25832v == 1 && f11 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // p302q4.InterfaceC10727c
        /* renamed from: b */
        public void mo22724b(float f10, float f11, float f12) {
            if (ViewOnTouchListenerC10735k.this.m22760K() < ViewOnTouchListenerC10735k.this.f25817g || f10 < 1.0f) {
                ViewOnTouchListenerC10735k.m22731f(ViewOnTouchListenerC10735k.this);
                ViewOnTouchListenerC10735k.this.f25825o.postScale(f10, f10, f11, f12);
                ViewOnTouchListenerC10735k.this.m22790z();
            }
        }

        @Override // p302q4.InterfaceC10727c
        /* renamed from: c */
        public void mo22725c(float f10, float f11, float f12, float f13) {
            ViewOnTouchListenerC10735k viewOnTouchListenerC10735k = ViewOnTouchListenerC10735k.this;
            viewOnTouchListenerC10735k.f25830t = viewOnTouchListenerC10735k.new f(viewOnTouchListenerC10735k.f25820j.getContext());
            f fVar = ViewOnTouchListenerC10735k.this.f25830t;
            ViewOnTouchListenerC10735k viewOnTouchListenerC10735k2 = ViewOnTouchListenerC10735k.this;
            int iM22756G = viewOnTouchListenerC10735k2.m22756G(viewOnTouchListenerC10735k2.f25820j);
            ViewOnTouchListenerC10735k viewOnTouchListenerC10735k3 = ViewOnTouchListenerC10735k.this;
            fVar.m22793b(iM22756G, viewOnTouchListenerC10735k3.m22755F(viewOnTouchListenerC10735k3.f25820j), (int) f12, (int) f13);
            ViewOnTouchListenerC10735k.this.f25820j.post(ViewOnTouchListenerC10735k.this.f25830t);
        }
    }

    /* renamed from: q4.k$b */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ViewOnTouchListenerC10735k.m22733h(ViewOnTouchListenerC10735k.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC10735k.this.f25829s != null) {
                ViewOnTouchListenerC10735k.this.f25829s.onLongClick(ViewOnTouchListenerC10735k.this.f25820j);
            }
        }
    }

    /* renamed from: q4.k$c */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fM22760K = ViewOnTouchListenerC10735k.this.m22760K();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (fM22760K < ViewOnTouchListenerC10735k.this.m22758I()) {
                    ViewOnTouchListenerC10735k viewOnTouchListenerC10735k = ViewOnTouchListenerC10735k.this;
                    viewOnTouchListenerC10735k.m22782g0(viewOnTouchListenerC10735k.m22758I(), x10, y10, true);
                } else if (fM22760K < ViewOnTouchListenerC10735k.this.m22758I() || fM22760K >= ViewOnTouchListenerC10735k.this.m22757H()) {
                    ViewOnTouchListenerC10735k viewOnTouchListenerC10735k2 = ViewOnTouchListenerC10735k.this;
                    viewOnTouchListenerC10735k2.m22782g0(viewOnTouchListenerC10735k2.m22759J(), x10, y10, true);
                } else {
                    ViewOnTouchListenerC10735k viewOnTouchListenerC10735k3 = ViewOnTouchListenerC10735k.this;
                    viewOnTouchListenerC10735k3.m22782g0(viewOnTouchListenerC10735k3.m22757H(), x10, y10, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC10735k.this.f25828r != null) {
                ViewOnTouchListenerC10735k.this.f25828r.onClick(ViewOnTouchListenerC10735k.this.f25820j);
            }
            RectF rectFM22751B = ViewOnTouchListenerC10735k.this.m22751B();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            ViewOnTouchListenerC10735k.m22735j(ViewOnTouchListenerC10735k.this);
            if (rectFM22751B == null) {
                return false;
            }
            if (!rectFM22751B.contains(x10, y10)) {
                ViewOnTouchListenerC10735k.m22738m(ViewOnTouchListenerC10735k.this);
                return false;
            }
            rectFM22751B.width();
            rectFM22751B.height();
            ViewOnTouchListenerC10735k.m22737l(ViewOnTouchListenerC10735k.this);
            return true;
        }
    }

    /* renamed from: q4.k$d */
    public static /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25840a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f25840a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25840a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25840a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25840a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: q4.k$e */
    public class e implements Runnable {

        /* renamed from: c */
        public final float f25841c;

        /* renamed from: d */
        public final float f25842d;

        /* renamed from: e */
        public final long f25843e = System.currentTimeMillis();

        /* renamed from: f */
        public final float f25844f;

        /* renamed from: g */
        public final float f25845g;

        public e(float f10, float f11, float f12, float f13) {
            this.f25841c = f12;
            this.f25842d = f13;
            this.f25844f = f10;
            this.f25845g = f11;
        }

        /* renamed from: a */
        public final float m22791a() {
            return ViewOnTouchListenerC10735k.this.f25813c.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f25843e) * 1.0f) / ViewOnTouchListenerC10735k.this.f25814d));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fM22791a = m22791a();
            float f10 = this.f25844f;
            ViewOnTouchListenerC10735k.this.f25836z.mo22724b((f10 + ((this.f25845g - f10) * fM22791a)) / ViewOnTouchListenerC10735k.this.m22760K(), this.f25841c, this.f25842d);
            if (fM22791a < 1.0f) {
                AbstractC10725a.m22714a(ViewOnTouchListenerC10735k.this.f25820j, this);
            }
        }
    }

    /* renamed from: q4.k$f */
    public class f implements Runnable {

        /* renamed from: c */
        public final OverScroller f25847c;

        /* renamed from: d */
        public int f25848d;

        /* renamed from: e */
        public int f25849e;

        public f(Context context) {
            this.f25847c = new OverScroller(context);
        }

        /* renamed from: a */
        public void m22792a() {
            this.f25847c.forceFinished(true);
        }

        /* renamed from: b */
        public void m22793b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFM22751B = ViewOnTouchListenerC10735k.this.m22751B();
            if (rectFM22751B == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM22751B.left);
            float f10 = i10;
            if (f10 < rectFM22751B.width()) {
                iRound = Math.round(rectFM22751B.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFM22751B.top);
            float f11 = i11;
            if (f11 < rectFM22751B.height()) {
                iRound2 = Math.round(rectFM22751B.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f25848d = iRound3;
            this.f25849e = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f25847c.fling(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f25847c.isFinished() && this.f25847c.computeScrollOffset()) {
                int currX = this.f25847c.getCurrX();
                int currY = this.f25847c.getCurrY();
                ViewOnTouchListenerC10735k.this.f25825o.postTranslate(this.f25848d - currX, this.f25849e - currY);
                ViewOnTouchListenerC10735k.this.m22790z();
                this.f25848d = currX;
                this.f25849e = currY;
                AbstractC10725a.m22714a(ViewOnTouchListenerC10735k.this.f25820j, this);
            }
        }
    }

    public ViewOnTouchListenerC10735k(ImageView imageView) {
        this.f25820j = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f25833w = 0.0f;
        this.f25822l = new C10726b(imageView.getContext(), this.f25836z);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f25821k = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10733i m22727b(ViewOnTouchListenerC10735k viewOnTouchListenerC10735k) {
        viewOnTouchListenerC10735k.getClass();
        return null;
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC10731g m22731f(ViewOnTouchListenerC10735k viewOnTouchListenerC10735k) {
        viewOnTouchListenerC10735k.getClass();
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC10732h m22733h(ViewOnTouchListenerC10735k viewOnTouchListenerC10735k) {
        viewOnTouchListenerC10735k.getClass();
        return null;
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC10734j m22735j(ViewOnTouchListenerC10735k viewOnTouchListenerC10735k) {
        viewOnTouchListenerC10735k.getClass();
        return null;
    }

    /* renamed from: l */
    public static /* synthetic */ InterfaceC10730f m22737l(ViewOnTouchListenerC10735k viewOnTouchListenerC10735k) {
        viewOnTouchListenerC10735k.getClass();
        return null;
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC10729e m22738m(ViewOnTouchListenerC10735k viewOnTouchListenerC10735k) {
        viewOnTouchListenerC10735k.getClass();
        return null;
    }

    /* renamed from: A */
    public final boolean m22750A() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF rectFM22752C = m22752C(m22753D());
        if (rectFM22752C == null) {
            return false;
        }
        float fHeight = rectFM22752C.height();
        float fWidth = rectFM22752C.width();
        float fM22755F = m22755F(this.f25820j);
        float f15 = 0.0f;
        if (fHeight <= fM22755F) {
            int i10 = d.f25840a[this.f25835y.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (fM22755F - fHeight) / 2.0f;
                    f14 = rectFM22752C.top;
                } else {
                    f13 = fM22755F - fHeight;
                    f14 = rectFM22752C.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -rectFM22752C.top;
            }
            this.f25832v = 2;
        } else {
            float f16 = rectFM22752C.top;
            if (f16 > 0.0f) {
                this.f25832v = 0;
                f10 = -f16;
            } else {
                float f17 = rectFM22752C.bottom;
                if (f17 < fM22755F) {
                    this.f25832v = 1;
                    f10 = fM22755F - f17;
                } else {
                    this.f25832v = -1;
                    f10 = 0.0f;
                }
            }
        }
        float fM22756G = m22756G(this.f25820j);
        if (fWidth <= fM22756G) {
            int i11 = d.f25840a[this.f25835y.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (fM22756G - fWidth) / 2.0f;
                    f12 = rectFM22752C.left;
                } else {
                    f11 = fM22756G - fWidth;
                    f12 = rectFM22752C.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectFM22752C.left;
            }
            this.f25831u = 2;
        } else {
            float f18 = rectFM22752C.left;
            if (f18 > 0.0f) {
                this.f25831u = 0;
                f15 = -f18;
            } else {
                float f19 = rectFM22752C.right;
                if (f19 < fM22756G) {
                    f15 = fM22756G - f19;
                    this.f25831u = 1;
                } else {
                    this.f25831u = -1;
                }
            }
        }
        this.f25825o.postTranslate(f15, f10);
        return true;
    }

    /* renamed from: B */
    public RectF m22751B() {
        m22750A();
        return m22752C(m22753D());
    }

    /* renamed from: C */
    public final RectF m22752C(Matrix matrix) {
        if (this.f25820j.getDrawable() == null) {
            return null;
        }
        this.f25826p.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f25826p);
        return this.f25826p;
    }

    /* renamed from: D */
    public final Matrix m22753D() {
        this.f25824n.set(this.f25823m);
        this.f25824n.postConcat(this.f25825o);
        return this.f25824n;
    }

    /* renamed from: E */
    public Matrix m22754E() {
        return this.f25824n;
    }

    /* renamed from: F */
    public final int m22755F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: G */
    public final int m22756G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: H */
    public float m22757H() {
        return this.f25817g;
    }

    /* renamed from: I */
    public float m22758I() {
        return this.f25816f;
    }

    /* renamed from: J */
    public float m22759J() {
        return this.f25815e;
    }

    /* renamed from: K */
    public float m22760K() {
        return (float) Math.sqrt(((float) Math.pow(m22762M(this.f25825o, 0), 2.0d)) + ((float) Math.pow(m22762M(this.f25825o, 3), 2.0d)));
    }

    /* renamed from: L */
    public ImageView.ScaleType m22761L() {
        return this.f25835y;
    }

    /* renamed from: M */
    public final float m22762M(Matrix matrix, int i10) {
        matrix.getValues(this.f25827q);
        return this.f25827q[i10];
    }

    /* renamed from: N */
    public final void m22763N() {
        this.f25825o.reset();
        m22779d0(this.f25833w);
        m22765P(m22753D());
        m22750A();
    }

    /* renamed from: O */
    public void m22764O(boolean z10) {
        this.f25818h = z10;
    }

    /* renamed from: P */
    public final void m22765P(Matrix matrix) {
        this.f25820j.setImageMatrix(matrix);
    }

    /* renamed from: Q */
    public void m22766Q(float f10) {
        AbstractC10736l.m22794a(this.f25815e, this.f25816f, f10);
        this.f25817g = f10;
    }

    /* renamed from: R */
    public void m22767R(float f10) {
        AbstractC10736l.m22794a(this.f25815e, f10, this.f25817g);
        this.f25816f = f10;
    }

    /* renamed from: S */
    public void m22768S(float f10) {
        AbstractC10736l.m22794a(f10, this.f25816f, this.f25817g);
        this.f25815e = f10;
    }

    /* renamed from: T */
    public void m22769T(View.OnClickListener onClickListener) {
        this.f25828r = onClickListener;
    }

    /* renamed from: U */
    public void m22770U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f25821k.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: V */
    public void m22771V(View.OnLongClickListener onLongClickListener) {
        this.f25829s = onLongClickListener;
    }

    /* renamed from: d0 */
    public void m22779d0(float f10) {
        this.f25825o.postRotate(f10 % 360.0f);
        m22790z();
    }

    /* renamed from: e0 */
    public void m22780e0(float f10) {
        this.f25825o.setRotate(f10 % 360.0f);
        m22790z();
    }

    /* renamed from: f0 */
    public void m22781f0(float f10) {
        m22783h0(f10, false);
    }

    /* renamed from: g0 */
    public void m22782g0(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f25815e || f10 > this.f25817g) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z10) {
            this.f25820j.post(new e(m22760K(), f10, f11, f12));
        } else {
            this.f25825o.setScale(f10, f10, f11, f12);
            m22790z();
        }
    }

    /* renamed from: h0 */
    public void m22783h0(float f10, boolean z10) {
        m22782g0(f10, this.f25820j.getRight() / 2, this.f25820j.getBottom() / 2, z10);
    }

    /* renamed from: i0 */
    public void m22784i0(ImageView.ScaleType scaleType) {
        if (!AbstractC10736l.m22797d(scaleType) || scaleType == this.f25835y) {
            return;
        }
        this.f25835y = scaleType;
        m22787l0();
    }

    /* renamed from: j0 */
    public void m22785j0(int i10) {
        this.f25814d = i10;
    }

    /* renamed from: k0 */
    public void m22786k0(boolean z10) {
        this.f25834x = z10;
        m22787l0();
    }

    /* renamed from: l0 */
    public void m22787l0() {
        if (this.f25834x) {
            m22788m0(this.f25820j.getDrawable());
        } else {
            m22763N();
        }
    }

    /* renamed from: m0 */
    public final void m22788m0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fM22756G = m22756G(this.f25820j);
        float fM22755F = m22755F(this.f25820j);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f25823m.reset();
        float f10 = intrinsicWidth;
        float f11 = fM22756G / f10;
        float f12 = intrinsicHeight;
        float f13 = fM22755F / f12;
        ImageView.ScaleType scaleType = this.f25835y;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f25823m.postTranslate((fM22756G - f10) / 2.0f, (fM22755F - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f25823m.postScale(fMax, fMax);
            this.f25823m.postTranslate((fM22756G - (f10 * fMax)) / 2.0f, (fM22755F - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f25823m.postScale(fMin, fMin);
            this.f25823m.postTranslate((fM22756G - (f10 * fMin)) / 2.0f, (fM22755F - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM22756G, fM22755F);
            if (((int) this.f25833w) % Opcodes.GETFIELD != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = d.f25840a[this.f25835y.ordinal()];
            if (i10 == 1) {
                this.f25823m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 2) {
                this.f25823m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f25823m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f25823m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m22763N();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        m22788m0(this.f25820j.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f25834x
            r6 = 0
            if (r0 == 0) goto Lc4
            r0 = r9
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = p302q4.AbstractC10736l.m22796c(r0)
            if (r0 == 0) goto Lc4
            int r0 = r10.getAction()
            r7 = 1
            if (r0 == 0) goto L75
            if (r0 == r7) goto L1c
            r2 = 3
            if (r0 == r2) goto L1c
            goto L81
        L1c:
            float r0 = r8.m22760K()
            float r2 = r8.f25815e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L48
            android.graphics.RectF r0 = r8.m22751B()
            if (r0 == 0) goto L81
            r2 = r0
            q4.k$e r0 = new q4.k$e
            r3 = r2
            float r2 = r8.m22760K()
            r4 = r3
            float r3 = r8.f25815e
            r5 = r4
            float r4 = r5.centerX()
            float r5 = r5.centerY()
            r1 = r8
            r0.<init>(r2, r3, r4, r5)
            r9.post(r0)
            goto L73
        L48:
            float r0 = r8.m22760K()
            float r2 = r8.f25817g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L81
            android.graphics.RectF r0 = r8.m22751B()
            if (r0 == 0) goto L81
            r2 = r0
            q4.k$e r0 = new q4.k$e
            r3 = r2
            float r2 = r8.m22760K()
            r4 = r3
            float r3 = r8.f25817g
            r5 = r4
            float r4 = r5.centerX()
            float r5 = r5.centerY()
            r1 = r8
            r0.<init>(r2, r3, r4, r5)
            r9.post(r0)
        L73:
            r0 = r7
            goto L82
        L75:
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L7e
            r0.requestDisallowInterceptTouchEvent(r7)
        L7e:
            r8.m22789y()
        L81:
            r0 = r6
        L82:
            q4.b r2 = r8.f25822l
            if (r2 == 0) goto Lb8
            boolean r0 = r2.m22720e()
            q4.b r2 = r8.f25822l
            boolean r2 = r2.m22719d()
            q4.b r3 = r8.f25822l
            boolean r3 = r3.m22721f(r10)
            if (r0 != 0) goto La2
            q4.b r0 = r8.f25822l
            boolean r0 = r0.m22720e()
            if (r0 != 0) goto La2
            r0 = r7
            goto La3
        La2:
            r0 = r6
        La3:
            if (r2 != 0) goto Laf
            q4.b r2 = r8.f25822l
            boolean r2 = r2.m22719d()
            if (r2 != 0) goto Laf
            r2 = r7
            goto Lb0
        Laf:
            r2 = r6
        Lb0:
            if (r0 == 0) goto Lb5
            if (r2 == 0) goto Lb5
            r6 = r7
        Lb5:
            r8.f25819i = r6
            r0 = r3
        Lb8:
            android.view.GestureDetector r2 = r8.f25821k
            if (r2 == 0) goto Lc3
            boolean r2 = r2.onTouchEvent(r10)
            if (r2 == 0) goto Lc3
            return r7
        Lc3:
            return r0
        Lc4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p302q4.ViewOnTouchListenerC10735k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: y */
    public final void m22789y() {
        f fVar = this.f25830t;
        if (fVar != null) {
            fVar.m22792a();
            this.f25830t = null;
        }
    }

    /* renamed from: z */
    public final void m22790z() {
        if (m22750A()) {
            m22765P(m22753D());
        }
    }

    /* renamed from: W */
    public void m22772W(InterfaceC10728d interfaceC10728d) {
    }

    /* renamed from: X */
    public void m22773X(InterfaceC10729e interfaceC10729e) {
    }

    /* renamed from: Y */
    public void m22774Y(InterfaceC10730f interfaceC10730f) {
    }

    /* renamed from: Z */
    public void m22775Z(InterfaceC10731g interfaceC10731g) {
    }

    /* renamed from: a0 */
    public void m22776a0(InterfaceC10732h interfaceC10732h) {
    }

    /* renamed from: b0 */
    public void m22777b0(InterfaceC10733i interfaceC10733i) {
    }

    /* renamed from: c0 */
    public void m22778c0(InterfaceC10734j interfaceC10734j) {
    }
}
