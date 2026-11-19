package p403x6;

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

/* renamed from: x6.k */
/* loaded from: classes5.dex */
public class ViewOnTouchListenerC11808k implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: A */
    public final InterfaceC11800c f28000A;

    /* renamed from: j */
    public final ImageView f28008j;

    /* renamed from: k */
    public GestureDetector f28009k;

    /* renamed from: l */
    public C11799b f28010l;

    /* renamed from: r */
    public InterfaceC11807j f28016r;

    /* renamed from: s */
    public View.OnClickListener f28017s;

    /* renamed from: t */
    public View.OnLongClickListener f28018t;

    /* renamed from: u */
    public f f28019u;

    /* renamed from: x */
    public float f28022x;

    /* renamed from: c */
    public Interpolator f28001c = new AccelerateDecelerateInterpolator();

    /* renamed from: d */
    public int f28002d = 200;

    /* renamed from: e */
    public float f28003e = 1.0f;

    /* renamed from: f */
    public float f28004f = 1.75f;

    /* renamed from: g */
    public float f28005g = 3.0f;

    /* renamed from: h */
    public boolean f28006h = true;

    /* renamed from: i */
    public boolean f28007i = false;

    /* renamed from: m */
    public final Matrix f28011m = new Matrix();

    /* renamed from: n */
    public final Matrix f28012n = new Matrix();

    /* renamed from: o */
    public final Matrix f28013o = new Matrix();

    /* renamed from: p */
    public final RectF f28014p = new RectF();

    /* renamed from: q */
    public final float[] f28015q = new float[9];

    /* renamed from: v */
    public int f28020v = 2;

    /* renamed from: w */
    public int f28021w = 2;

    /* renamed from: y */
    public boolean f28023y = true;

    /* renamed from: z */
    public ImageView.ScaleType f28024z = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: x6.k$a */
    public class a implements InterfaceC11800c {
        public a() {
        }

        @Override // p403x6.InterfaceC11800c
        /* renamed from: a */
        public void mo26054a(float f10, float f11) {
            if (ViewOnTouchListenerC11808k.this.f28010l.m26051e()) {
                return;
            }
            ViewOnTouchListenerC11808k.m26059b(ViewOnTouchListenerC11808k.this);
            ViewOnTouchListenerC11808k.this.f28013o.postTranslate(f10, f11);
            ViewOnTouchListenerC11808k.this.m26122z();
            ViewParent parent = ViewOnTouchListenerC11808k.this.f28008j.getParent();
            if (!ViewOnTouchListenerC11808k.this.f28006h || ViewOnTouchListenerC11808k.this.f28010l.m26051e() || ViewOnTouchListenerC11808k.this.f28007i) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((ViewOnTouchListenerC11808k.this.f28020v == 2 || ((ViewOnTouchListenerC11808k.this.f28020v == 0 && f10 >= 1.0f) || ((ViewOnTouchListenerC11808k.this.f28020v == 1 && f10 <= -1.0f) || ((ViewOnTouchListenerC11808k.this.f28021w == 0 && f11 >= 1.0f) || (ViewOnTouchListenerC11808k.this.f28021w == 1 && f11 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // p403x6.InterfaceC11800c
        /* renamed from: b */
        public void mo26055b(float f10, float f11, float f12) {
            mo26057d(f10, f11, f12, 0.0f, 0.0f);
        }

        @Override // p403x6.InterfaceC11800c
        /* renamed from: c */
        public void mo26056c(float f10, float f11, float f12, float f13) {
            ViewOnTouchListenerC11808k viewOnTouchListenerC11808k = ViewOnTouchListenerC11808k.this;
            viewOnTouchListenerC11808k.f28019u = viewOnTouchListenerC11808k.new f(viewOnTouchListenerC11808k.f28008j.getContext());
            f fVar = ViewOnTouchListenerC11808k.this.f28019u;
            ViewOnTouchListenerC11808k viewOnTouchListenerC11808k2 = ViewOnTouchListenerC11808k.this;
            int iM26088G = viewOnTouchListenerC11808k2.m26088G(viewOnTouchListenerC11808k2.f28008j);
            ViewOnTouchListenerC11808k viewOnTouchListenerC11808k3 = ViewOnTouchListenerC11808k.this;
            fVar.m26125b(iM26088G, viewOnTouchListenerC11808k3.m26087F(viewOnTouchListenerC11808k3.f28008j), (int) f12, (int) f13);
            ViewOnTouchListenerC11808k.this.f28008j.post(ViewOnTouchListenerC11808k.this.f28019u);
        }

        @Override // p403x6.InterfaceC11800c
        /* renamed from: d */
        public void mo26057d(float f10, float f11, float f12, float f13, float f14) {
            if (ViewOnTouchListenerC11808k.this.m26092K() < ViewOnTouchListenerC11808k.this.f28005g || f10 < 1.0f) {
                ViewOnTouchListenerC11808k.m26063f(ViewOnTouchListenerC11808k.this);
                ViewOnTouchListenerC11808k.this.f28013o.postScale(f10, f10, f11, f12);
                ViewOnTouchListenerC11808k.this.f28013o.postTranslate(f13, f14);
                ViewOnTouchListenerC11808k.this.m26122z();
            }
        }
    }

    /* renamed from: x6.k$b */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ViewOnTouchListenerC11808k.m26065h(ViewOnTouchListenerC11808k.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC11808k.this.f28018t != null) {
                ViewOnTouchListenerC11808k.this.f28018t.onLongClick(ViewOnTouchListenerC11808k.this.f28008j);
            }
        }
    }

    /* renamed from: x6.k$c */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fM26092K = ViewOnTouchListenerC11808k.this.m26092K();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (fM26092K < ViewOnTouchListenerC11808k.this.m26090I()) {
                    ViewOnTouchListenerC11808k viewOnTouchListenerC11808k = ViewOnTouchListenerC11808k.this;
                    viewOnTouchListenerC11808k.m26114g0(viewOnTouchListenerC11808k.m26090I(), x10, y10, true);
                } else if (fM26092K < ViewOnTouchListenerC11808k.this.m26090I() || fM26092K >= ViewOnTouchListenerC11808k.this.m26089H()) {
                    ViewOnTouchListenerC11808k viewOnTouchListenerC11808k2 = ViewOnTouchListenerC11808k.this;
                    viewOnTouchListenerC11808k2.m26114g0(viewOnTouchListenerC11808k2.m26091J(), x10, y10, true);
                } else {
                    ViewOnTouchListenerC11808k viewOnTouchListenerC11808k3 = ViewOnTouchListenerC11808k.this;
                    viewOnTouchListenerC11808k3.m26114g0(viewOnTouchListenerC11808k3.m26089H(), x10, y10, true);
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
            if (ViewOnTouchListenerC11808k.this.f28017s != null) {
                ViewOnTouchListenerC11808k.this.f28017s.onClick(ViewOnTouchListenerC11808k.this.f28008j);
            }
            RectF rectFM26083B = ViewOnTouchListenerC11808k.this.m26083B();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (ViewOnTouchListenerC11808k.this.f28016r != null) {
                ViewOnTouchListenerC11808k.this.f28016r.mo9210a(ViewOnTouchListenerC11808k.this.f28008j, x10, y10);
            }
            if (rectFM26083B == null) {
                return false;
            }
            if (!rectFM26083B.contains(x10, y10)) {
                ViewOnTouchListenerC11808k.m26069l(ViewOnTouchListenerC11808k.this);
                return false;
            }
            rectFM26083B.width();
            rectFM26083B.height();
            ViewOnTouchListenerC11808k.m26068k(ViewOnTouchListenerC11808k.this);
            return true;
        }
    }

    /* renamed from: x6.k$d */
    public static /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28028a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f28028a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28028a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28028a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28028a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: x6.k$e */
    public class e implements Runnable {

        /* renamed from: c */
        public final float f28029c;

        /* renamed from: d */
        public final float f28030d;

        /* renamed from: e */
        public final long f28031e = System.currentTimeMillis();

        /* renamed from: f */
        public final float f28032f;

        /* renamed from: g */
        public final float f28033g;

        public e(float f10, float f11, float f12, float f13) {
            this.f28029c = f12;
            this.f28030d = f13;
            this.f28032f = f10;
            this.f28033g = f11;
        }

        /* renamed from: a */
        public final float m26123a() {
            return ViewOnTouchListenerC11808k.this.f28001c.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f28031e) * 1.0f) / ViewOnTouchListenerC11808k.this.f28002d));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fM26123a = m26123a();
            float f10 = this.f28032f;
            ViewOnTouchListenerC11808k.this.f28000A.mo26055b((f10 + ((this.f28033g - f10) * fM26123a)) / ViewOnTouchListenerC11808k.this.m26092K(), this.f28029c, this.f28030d);
            if (fM26123a < 1.0f) {
                AbstractC11798a.m26045a(ViewOnTouchListenerC11808k.this.f28008j, this);
            }
        }
    }

    /* renamed from: x6.k$f */
    public class f implements Runnable {

        /* renamed from: c */
        public final OverScroller f28035c;

        /* renamed from: d */
        public int f28036d;

        /* renamed from: e */
        public int f28037e;

        public f(Context context) {
            this.f28035c = new OverScroller(context);
        }

        /* renamed from: a */
        public void m26124a() {
            this.f28035c.forceFinished(true);
        }

        /* renamed from: b */
        public void m26125b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFM26083B = ViewOnTouchListenerC11808k.this.m26083B();
            if (rectFM26083B == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM26083B.left);
            float f10 = i10;
            if (f10 < rectFM26083B.width()) {
                iRound = Math.round(rectFM26083B.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFM26083B.top);
            float f11 = i11;
            if (f11 < rectFM26083B.height()) {
                iRound2 = Math.round(rectFM26083B.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f28036d = iRound3;
            this.f28037e = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f28035c.fling(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f28035c.isFinished() && this.f28035c.computeScrollOffset()) {
                int currX = this.f28035c.getCurrX();
                int currY = this.f28035c.getCurrY();
                ViewOnTouchListenerC11808k.this.f28013o.postTranslate(this.f28036d - currX, this.f28037e - currY);
                ViewOnTouchListenerC11808k.this.m26122z();
                this.f28036d = currX;
                this.f28037e = currY;
                AbstractC11798a.m26045a(ViewOnTouchListenerC11808k.this.f28008j, this);
            }
        }
    }

    public ViewOnTouchListenerC11808k(ImageView imageView) {
        a aVar = new a();
        this.f28000A = aVar;
        this.f28008j = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f28022x = 0.0f;
        this.f28010l = new C11799b(imageView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f28009k = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11806i m26059b(ViewOnTouchListenerC11808k viewOnTouchListenerC11808k) {
        viewOnTouchListenerC11808k.getClass();
        return null;
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC11804g m26063f(ViewOnTouchListenerC11808k viewOnTouchListenerC11808k) {
        viewOnTouchListenerC11808k.getClass();
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC11805h m26065h(ViewOnTouchListenerC11808k viewOnTouchListenerC11808k) {
        viewOnTouchListenerC11808k.getClass();
        return null;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC11803f m26068k(ViewOnTouchListenerC11808k viewOnTouchListenerC11808k) {
        viewOnTouchListenerC11808k.getClass();
        return null;
    }

    /* renamed from: l */
    public static /* synthetic */ InterfaceC11802e m26069l(ViewOnTouchListenerC11808k viewOnTouchListenerC11808k) {
        viewOnTouchListenerC11808k.getClass();
        return null;
    }

    /* renamed from: A */
    public final boolean m26082A() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF rectFM26084C = m26084C(m26085D());
        if (rectFM26084C == null) {
            return false;
        }
        float fHeight = rectFM26084C.height();
        float fWidth = rectFM26084C.width();
        float fM26087F = m26087F(this.f28008j);
        float f15 = 0.0f;
        if (fHeight <= fM26087F) {
            int i10 = d.f28028a[this.f28024z.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (fM26087F - fHeight) / 2.0f;
                    f14 = rectFM26084C.top;
                } else {
                    f13 = fM26087F - fHeight;
                    f14 = rectFM26084C.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -rectFM26084C.top;
            }
            this.f28021w = 2;
        } else {
            float f16 = rectFM26084C.top;
            if (f16 > 0.0f) {
                this.f28021w = 0;
                f10 = -f16;
            } else {
                float f17 = rectFM26084C.bottom;
                if (f17 < fM26087F) {
                    this.f28021w = 1;
                    f10 = fM26087F - f17;
                } else {
                    this.f28021w = -1;
                    f10 = 0.0f;
                }
            }
        }
        float fM26088G = m26088G(this.f28008j);
        if (fWidth <= fM26088G) {
            int i11 = d.f28028a[this.f28024z.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (fM26088G - fWidth) / 2.0f;
                    f12 = rectFM26084C.left;
                } else {
                    f11 = fM26088G - fWidth;
                    f12 = rectFM26084C.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectFM26084C.left;
            }
            this.f28020v = 2;
        } else {
            float f18 = rectFM26084C.left;
            if (f18 > 0.0f) {
                this.f28020v = 0;
                f15 = -f18;
            } else {
                float f19 = rectFM26084C.right;
                if (f19 < fM26088G) {
                    f15 = fM26088G - f19;
                    this.f28020v = 1;
                } else {
                    this.f28020v = -1;
                }
            }
        }
        this.f28013o.postTranslate(f15, f10);
        return true;
    }

    /* renamed from: B */
    public RectF m26083B() {
        m26082A();
        return m26084C(m26085D());
    }

    /* renamed from: C */
    public final RectF m26084C(Matrix matrix) {
        if (this.f28008j.getDrawable() == null) {
            return null;
        }
        this.f28014p.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f28014p);
        return this.f28014p;
    }

    /* renamed from: D */
    public final Matrix m26085D() {
        this.f28012n.set(this.f28011m);
        this.f28012n.postConcat(this.f28013o);
        return this.f28012n;
    }

    /* renamed from: E */
    public Matrix m26086E() {
        return this.f28012n;
    }

    /* renamed from: F */
    public final int m26087F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: G */
    public final int m26088G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: H */
    public float m26089H() {
        return this.f28005g;
    }

    /* renamed from: I */
    public float m26090I() {
        return this.f28004f;
    }

    /* renamed from: J */
    public float m26091J() {
        return this.f28003e;
    }

    /* renamed from: K */
    public float m26092K() {
        return (float) Math.sqrt(((float) Math.pow(m26094M(this.f28013o, 0), 2.0d)) + ((float) Math.pow(m26094M(this.f28013o, 3), 2.0d)));
    }

    /* renamed from: L */
    public ImageView.ScaleType m26093L() {
        return this.f28024z;
    }

    /* renamed from: M */
    public final float m26094M(Matrix matrix, int i10) {
        matrix.getValues(this.f28015q);
        return this.f28015q[i10];
    }

    /* renamed from: N */
    public final void m26095N() {
        this.f28013o.reset();
        m26111d0(this.f28022x);
        m26097P(m26085D());
        m26082A();
    }

    /* renamed from: O */
    public void m26096O(boolean z10) {
        this.f28006h = z10;
    }

    /* renamed from: P */
    public final void m26097P(Matrix matrix) {
        this.f28008j.setImageMatrix(matrix);
    }

    /* renamed from: Q */
    public void m26098Q(float f10) {
        AbstractC11809l.m26126a(this.f28003e, this.f28004f, f10);
        this.f28005g = f10;
    }

    /* renamed from: R */
    public void m26099R(float f10) {
        AbstractC11809l.m26126a(this.f28003e, f10, this.f28005g);
        this.f28004f = f10;
    }

    /* renamed from: S */
    public void m26100S(float f10) {
        AbstractC11809l.m26126a(f10, this.f28004f, this.f28005g);
        this.f28003e = f10;
    }

    /* renamed from: T */
    public void m26101T(View.OnClickListener onClickListener) {
        this.f28017s = onClickListener;
    }

    /* renamed from: U */
    public void m26102U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f28009k.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: V */
    public void m26103V(View.OnLongClickListener onLongClickListener) {
        this.f28018t = onLongClickListener;
    }

    /* renamed from: c0 */
    public void m26110c0(InterfaceC11807j interfaceC11807j) {
        this.f28016r = interfaceC11807j;
    }

    /* renamed from: d0 */
    public void m26111d0(float f10) {
        this.f28013o.postRotate(f10 % 360.0f);
        m26122z();
    }

    /* renamed from: e0 */
    public void m26112e0(float f10) {
        this.f28013o.setRotate(f10 % 360.0f);
        m26122z();
    }

    /* renamed from: f0 */
    public void m26113f0(float f10) {
        m26115h0(f10, false);
    }

    /* renamed from: g0 */
    public void m26114g0(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f28003e || f10 > this.f28005g) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z10) {
            this.f28008j.post(new e(m26092K(), f10, f11, f12));
        } else {
            this.f28013o.setScale(f10, f10, f11, f12);
            m26122z();
        }
    }

    /* renamed from: h0 */
    public void m26115h0(float f10, boolean z10) {
        m26114g0(f10, this.f28008j.getRight() / 2, this.f28008j.getBottom() / 2, z10);
    }

    /* renamed from: i0 */
    public void m26116i0(ImageView.ScaleType scaleType) {
        if (!AbstractC11809l.m26129d(scaleType) || scaleType == this.f28024z) {
            return;
        }
        this.f28024z = scaleType;
        m26119l0();
    }

    /* renamed from: j0 */
    public void m26117j0(int i10) {
        this.f28002d = i10;
    }

    /* renamed from: k0 */
    public void m26118k0(boolean z10) {
        this.f28023y = z10;
        m26119l0();
    }

    /* renamed from: l0 */
    public void m26119l0() {
        if (this.f28023y) {
            m26120m0(this.f28008j.getDrawable());
        } else {
            m26095N();
        }
    }

    /* renamed from: m0 */
    public final void m26120m0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fM26088G = m26088G(this.f28008j);
        float fM26087F = m26087F(this.f28008j);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f28011m.reset();
        float f10 = intrinsicWidth;
        float f11 = fM26088G / f10;
        float f12 = intrinsicHeight;
        float f13 = fM26087F / f12;
        ImageView.ScaleType scaleType = this.f28024z;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f28011m.postTranslate((fM26088G - f10) / 2.0f, (fM26087F - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f28011m.postScale(fMax, fMax);
            this.f28011m.postTranslate((fM26088G - (f10 * fMax)) / 2.0f, (fM26087F - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f28011m.postScale(fMin, fMin);
            this.f28011m.postTranslate((fM26088G - (f10 * fMin)) / 2.0f, (fM26087F - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM26088G, fM26087F);
            if (((int) this.f28022x) % Opcodes.GETFIELD != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = d.f28028a[this.f28024z.ordinal()];
            if (i10 == 1) {
                this.f28011m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 2) {
                this.f28011m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f28011m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f28011m.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m26095N();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        m26120m0(this.f28008j.getDrawable());
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
            boolean r0 = r8.f28023y
            r6 = 0
            if (r0 == 0) goto Lc4
            r0 = r9
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = p403x6.AbstractC11809l.m26128c(r0)
            if (r0 == 0) goto Lc4
            int r0 = r10.getAction()
            r7 = 1
            if (r0 == 0) goto L75
            if (r0 == r7) goto L1c
            r2 = 3
            if (r0 == r2) goto L1c
            goto L81
        L1c:
            float r0 = r8.m26092K()
            float r2 = r8.f28003e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L48
            android.graphics.RectF r0 = r8.m26083B()
            if (r0 == 0) goto L81
            r2 = r0
            x6.k$e r0 = new x6.k$e
            r3 = r2
            float r2 = r8.m26092K()
            r4 = r3
            float r3 = r8.f28003e
            r5 = r4
            float r4 = r5.centerX()
            float r5 = r5.centerY()
            r1 = r8
            r0.<init>(r2, r3, r4, r5)
            r9.post(r0)
            goto L73
        L48:
            float r0 = r8.m26092K()
            float r2 = r8.f28005g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L81
            android.graphics.RectF r0 = r8.m26083B()
            if (r0 == 0) goto L81
            r2 = r0
            x6.k$e r0 = new x6.k$e
            r3 = r2
            float r2 = r8.m26092K()
            r4 = r3
            float r3 = r8.f28005g
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
            r8.m26121y()
        L81:
            r0 = r6
        L82:
            x6.b r2 = r8.f28010l
            if (r2 == 0) goto Lb8
            boolean r0 = r2.m26051e()
            x6.b r2 = r8.f28010l
            boolean r2 = r2.m26050d()
            x6.b r3 = r8.f28010l
            boolean r3 = r3.m26052f(r10)
            if (r0 != 0) goto La2
            x6.b r0 = r8.f28010l
            boolean r0 = r0.m26051e()
            if (r0 != 0) goto La2
            r0 = r7
            goto La3
        La2:
            r0 = r6
        La3:
            if (r2 != 0) goto Laf
            x6.b r2 = r8.f28010l
            boolean r2 = r2.m26050d()
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
            r8.f28007i = r6
            r0 = r3
        Lb8:
            android.view.GestureDetector r2 = r8.f28009k
            if (r2 == 0) goto Lc3
            boolean r2 = r2.onTouchEvent(r10)
            if (r2 == 0) goto Lc3
            return r7
        Lc3:
            return r0
        Lc4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p403x6.ViewOnTouchListenerC11808k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: y */
    public final void m26121y() {
        f fVar = this.f28019u;
        if (fVar != null) {
            fVar.m26124a();
            this.f28019u = null;
        }
    }

    /* renamed from: z */
    public final void m26122z() {
        if (m26082A()) {
            m26097P(m26085D());
        }
    }

    /* renamed from: W */
    public void m26104W(InterfaceC11801d interfaceC11801d) {
    }

    /* renamed from: X */
    public void m26105X(InterfaceC11802e interfaceC11802e) {
    }

    /* renamed from: Y */
    public void m26106Y(InterfaceC11803f interfaceC11803f) {
    }

    /* renamed from: Z */
    public void m26107Z(InterfaceC11804g interfaceC11804g) {
    }

    /* renamed from: a0 */
    public void m26108a0(InterfaceC11805h interfaceC11805h) {
    }

    /* renamed from: b0 */
    public void m26109b0(InterfaceC11806i interfaceC11806i) {
    }
}
