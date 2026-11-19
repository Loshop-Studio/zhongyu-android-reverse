package p070b.p113c.p114a.p116e.p128f.p130b;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0822a;
import p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0824c;
import p070b.p113c.p114a.p116e.p128f.p130b.p131f.InterfaceC0825d;
import p070b.p113c.p114a.p116e.p128f.p130b.p132g.AbstractC0828c;
import p070b.p113c.p114a.p116e.p128f.p130b.p132g.C0826a;
import p070b.p113c.p114a.p116e.p128f.p130b.p132g.C0827b;

/* renamed from: b.c.a.e.f.b.e */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC0821e implements InterfaceC0818b, View.OnTouchListener, InterfaceC0825d, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: E */
    public static final boolean f4553E = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: F */
    public static int f4554F = 1;

    /* renamed from: A */
    public c f4555A;

    /* renamed from: C */
    public boolean f4557C;

    /* renamed from: i */
    public WeakReference<ImageView> f4566i;

    /* renamed from: j */
    public GestureDetector f4567j;

    /* renamed from: k */
    public C0822a f4568k;

    /* renamed from: q */
    public d f4574q;

    /* renamed from: r */
    public e f4575r;

    /* renamed from: s */
    public h f4576s;

    /* renamed from: t */
    public View.OnLongClickListener f4577t;

    /* renamed from: u */
    public f f4578u;

    /* renamed from: v */
    public g f4579v;

    /* renamed from: w */
    public int f4580w;

    /* renamed from: x */
    public int f4581x;

    /* renamed from: y */
    public int f4582y;

    /* renamed from: z */
    public int f4583z;

    /* renamed from: b */
    public Interpolator f4559b = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public int f4560c = 200;

    /* renamed from: d */
    public float f4561d = 1.0f;

    /* renamed from: e */
    public float f4562e = 1.75f;

    /* renamed from: f */
    public float f4563f = 3.0f;

    /* renamed from: g */
    public boolean f4564g = true;

    /* renamed from: h */
    public boolean f4565h = false;

    /* renamed from: l */
    public final Matrix f4569l = new Matrix();

    /* renamed from: m */
    public final Matrix f4570m = new Matrix();

    /* renamed from: n */
    public final Matrix f4571n = new Matrix();

    /* renamed from: o */
    public final RectF f4572o = new RectF();

    /* renamed from: p */
    public final float[] f4573p = new float[9];

    /* renamed from: B */
    public int f4556B = 2;

    /* renamed from: D */
    public ImageView.ScaleType f4558D = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: b.c.a.e.f.b.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4584a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f4584a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4584a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4584a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4584a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4584a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: b.c.a.e.f.b.e$b */
    public class b implements Runnable {

        /* renamed from: b */
        public final float f4585b;

        /* renamed from: c */
        public final float f4586c;

        /* renamed from: d */
        public final long f4587d = System.currentTimeMillis();

        /* renamed from: e */
        public final float f4588e;

        /* renamed from: f */
        public final float f4589f;

        public b(float f2, float f3, float f4, float f5) {
            this.f4585b = f4;
            this.f4586c = f5;
            this.f4588e = f2;
            this.f4589f = f3;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM2529i = ViewOnTouchListenerC0821e.this.m2529i();
            if (imageViewM2529i == null) {
                return;
            }
            float interpolation = ViewOnTouchListenerC0821e.this.f4559b.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f4587d) * 1.0f) / ViewOnTouchListenerC0821e.this.f4560c));
            float f2 = this.f4588e;
            ViewOnTouchListenerC0821e.this.m2533m(C0561a.m2073a(this.f4589f, f2, interpolation, f2) / ViewOnTouchListenerC0821e.this.m2532l(), this.f4585b, this.f4586c);
            if (interpolation < 1.0f) {
                imageViewM2529i.postOnAnimation(this);
            }
        }
    }

    /* renamed from: b.c.a.e.f.b.e$c */
    public class c implements Runnable {

        /* renamed from: b */
        public final AbstractC0828c f4591b;

        /* renamed from: c */
        public int f4592c;

        /* renamed from: d */
        public int f4593d;

        public c(Context context) {
            this.f4591b = new C0827b(context);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageViewM2529i;
            if (((C0826a) this.f4591b).f4606a.isFinished() || (imageViewM2529i = ViewOnTouchListenerC0821e.this.m2529i()) == null || !this.f4591b.mo2546a()) {
                return;
            }
            int currX = ((C0826a) this.f4591b).f4606a.getCurrX();
            int currY = ((C0826a) this.f4591b).f4606a.getCurrY();
            boolean z = ViewOnTouchListenerC0821e.f4553E;
            ViewOnTouchListenerC0821e.this.f4571n.postTranslate(this.f4592c - currX, this.f4593d - currY);
            ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = ViewOnTouchListenerC0821e.this;
            viewOnTouchListenerC0821e.m2535o(viewOnTouchListenerC0821e.m2528h());
            this.f4592c = currX;
            this.f4593d = currY;
            imageViewM2529i.postOnAnimation(this);
        }
    }

    /* renamed from: b.c.a.e.f.b.e$d */
    public interface d {
        /* renamed from: a */
        void m2540a(RectF rectF);
    }

    /* renamed from: b.c.a.e.f.b.e$e */
    public interface e {
    }

    /* renamed from: b.c.a.e.f.b.e$f */
    public interface f {
        /* renamed from: a */
        void m2541a(float f2, float f3, float f4);
    }

    /* renamed from: b.c.a.e.f.b.e$g */
    public interface g {
        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3);
    }

    /* renamed from: b.c.a.e.f.b.e$h */
    public interface h {
    }

    public ViewOnTouchListenerC0821e(ImageView imageView) {
        this.f4566i = new WeakReference<>(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m2521p(imageView);
        C0824c c0824c = new C0824c(imageView.getContext());
        c0824c.f4595a = this;
        this.f4568k = c0824c;
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C0820d(this));
        this.f4567j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC0817a(this));
        this.f4557C = true;
        m2538s();
    }

    /* renamed from: d */
    public static void m2520d(float f2, float f3, float f4) {
        if (f2 >= f3) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f3 >= f4) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: p */
    public static void m2521p(ImageView imageView) {
        if (imageView == null || (imageView instanceof InterfaceC0818b) || ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: a */
    public final void m2522a() {
        c cVar = this.f4555A;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            ((C0826a) cVar.f4591b).f4606a.forceFinished(true);
            this.f4555A = null;
        }
    }

    /* renamed from: b */
    public final void m2523b() {
        if (m2524c()) {
            m2535o(m2528h());
        }
    }

    /* renamed from: c */
    public final boolean m2524c() {
        RectF rectFM2527g;
        float f2;
        float f3;
        float f4;
        float f5;
        ImageView imageViewM2529i = m2529i();
        if (imageViewM2529i == null || (rectFM2527g = m2527g(m2528h())) == null) {
            return false;
        }
        float fHeight = rectFM2527g.height();
        float fWidth = rectFM2527g.width();
        float fM2530j = m2530j(imageViewM2529i);
        float f6 = 0.0f;
        if (fHeight <= fM2530j) {
            int i = a.f4584a[this.f4558D.ordinal()];
            if (i != 2) {
                fM2530j -= fHeight;
                if (i != 3) {
                    fM2530j /= 2.0f;
                }
                f3 = rectFM2527g.top;
            } else {
                f2 = rectFM2527g.top;
                f4 = -f2;
            }
        } else {
            f2 = rectFM2527g.top;
            if (f2 > 0.0f) {
                f4 = -f2;
            } else {
                f3 = rectFM2527g.bottom;
                f4 = f3 < fM2530j ? fM2530j - f3 : 0.0f;
            }
        }
        float fM2531k = m2531k(imageViewM2529i);
        if (fWidth <= fM2531k) {
            int i2 = a.f4584a[this.f4558D.ordinal()];
            if (i2 != 2) {
                float f7 = fM2531k - fWidth;
                if (i2 != 3) {
                    f7 /= 2.0f;
                }
                f5 = f7 - rectFM2527g.left;
            } else {
                f5 = -rectFM2527g.left;
            }
            f6 = f5;
            this.f4556B = 2;
        } else {
            float f8 = rectFM2527g.left;
            if (f8 > 0.0f) {
                this.f4556B = 0;
                f6 = -f8;
            } else {
                float f9 = rectFM2527g.right;
                if (f9 < fM2531k) {
                    f6 = fM2531k - f9;
                    this.f4556B = 1;
                } else {
                    this.f4556B = -1;
                }
            }
        }
        this.f4571n.postTranslate(f6, f4);
        return true;
    }

    /* renamed from: e */
    public void m2525e() {
        WeakReference<ImageView> weakReference = this.f4566i;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            m2522a();
        }
        GestureDetector gestureDetector = this.f4567j;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f4574q = null;
        this.f4575r = null;
        this.f4576s = null;
        this.f4577t = null;
        this.f4578u = null;
        this.f4579v = null;
        this.f4566i = null;
    }

    /* renamed from: f */
    public RectF m2526f() {
        m2524c();
        return m2527g(m2528h());
    }

    /* renamed from: g */
    public final RectF m2527g(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM2529i = m2529i();
        if (imageViewM2529i == null || (drawable = imageViewM2529i.getDrawable()) == null) {
            return null;
        }
        this.f4572o.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f4572o);
        return this.f4572o;
    }

    /* renamed from: h */
    public final Matrix m2528h() {
        this.f4570m.set(this.f4569l);
        this.f4570m.postConcat(this.f4571n);
        return this.f4570m;
    }

    /* renamed from: i */
    public ImageView m2529i() {
        WeakReference<ImageView> weakReference = this.f4566i;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (imageView == null) {
            m2525e();
        }
        return imageView;
    }

    /* renamed from: j */
    public final int m2530j(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: k */
    public final int m2531k(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: l */
    public float m2532l() {
        this.f4571n.getValues(this.f4573p);
        float fPow = (float) Math.pow(this.f4573p[0], 2.0d);
        this.f4571n.getValues(this.f4573p);
        return (float) Math.sqrt(fPow + ((float) Math.pow(this.f4573p[3], 2.0d)));
    }

    /* renamed from: m */
    public void m2533m(float f2, float f3, float f4) {
        if (f4553E) {
            String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
        }
        if (m2532l() < this.f4563f || f2 < 1.0f) {
            if (m2532l() > this.f4561d || f2 > 1.0f) {
                f fVar = this.f4578u;
                if (fVar != null) {
                    fVar.m2541a(f2, f3, f4);
                }
                this.f4571n.postScale(f2, f2, f3, f4);
                m2523b();
            }
        }
    }

    /* renamed from: n */
    public void m2534n() {
        this.f4571n.reset();
        this.f4571n.postRotate(0.0f);
        m2523b();
        m2535o(m2528h());
        m2524c();
    }

    /* renamed from: o */
    public final void m2535o(Matrix matrix) {
        RectF rectFM2527g;
        ImageView imageViewM2529i = m2529i();
        if (imageViewM2529i != null) {
            ImageView imageViewM2529i2 = m2529i();
            if (imageViewM2529i2 != null && !(imageViewM2529i2 instanceof InterfaceC0818b) && !ImageView.ScaleType.MATRIX.equals(imageViewM2529i2.getScaleType())) {
                throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
            }
            imageViewM2529i.setImageMatrix(matrix);
            if (this.f4574q == null || (rectFM2527g = m2527g(matrix)) == null) {
                return;
            }
            this.f4574q.m2540a(rectFM2527g);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageViewM2529i = m2529i();
        if (imageViewM2529i != null) {
            if (!this.f4557C) {
                m2539t(imageViewM2529i.getDrawable());
                return;
            }
            int top = imageViewM2529i.getTop();
            int right = imageViewM2529i.getRight();
            int bottom = imageViewM2529i.getBottom();
            int left = imageViewM2529i.getLeft();
            if (top == this.f4580w && bottom == this.f4582y && left == this.f4583z && right == this.f4581x) {
                return;
            }
            m2539t(imageViewM2529i.getDrawable());
            this.f4580w = top;
            this.f4581x = right;
            this.f4582y = bottom;
            this.f4583z = left;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f4557C
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L96
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L13
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L96
            android.view.ViewParent r0 = r11.getParent()
            int r3 = r12.getAction()
            if (r3 == 0) goto L50
            if (r3 == r2) goto L26
            r0 = 3
            if (r3 == r0) goto L26
            goto L58
        L26:
            float r0 = r10.m2532l()
            float r3 = r10.f4561d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L58
            android.graphics.RectF r0 = r10.m2526f()
            if (r0 == 0) goto L58
            b.c.a.e.f.b.e$b r9 = new b.c.a.e.f.b.e$b
            float r5 = r10.m2532l()
            float r6 = r10.f4561d
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            r11 = r2
            goto L59
        L50:
            if (r0 == 0) goto L55
            r0.requestDisallowInterceptTouchEvent(r2)
        L55:
            r10.m2522a()
        L58:
            r11 = r1
        L59:
            b.c.a.e.f.b.f.a r0 = r10.f4568k
            if (r0 == 0) goto L8a
            boolean r11 = r0.mo2544c()
            b.c.a.e.f.b.f.a r0 = r10.f4568k
            boolean r3 = r0.f4601g
            boolean r0 = r0.mo2545d(r12)
            if (r11 != 0) goto L75
            b.c.a.e.f.b.f.a r11 = r10.f4568k
            boolean r11 = r11.mo2544c()
            if (r11 != 0) goto L75
            r11 = r2
            goto L76
        L75:
            r11 = r1
        L76:
            if (r3 != 0) goto L80
            b.c.a.e.f.b.f.a r3 = r10.f4568k
            boolean r3 = r3.f4601g
            if (r3 != 0) goto L80
            r3 = r2
            goto L81
        L80:
            r3 = r1
        L81:
            if (r11 == 0) goto L86
            if (r3 == 0) goto L86
            r1 = r2
        L86:
            r10.f4565h = r1
            r1 = r0
            goto L8b
        L8a:
            r1 = r11
        L8b:
            android.view.GestureDetector r11 = r10.f4567j
            if (r11 == 0) goto L96
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L96
            r1 = r2
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p113c.p114a.p116e.p128f.p130b.ViewOnTouchListenerC0821e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public void m2536q(float f2, float f3, float f4, boolean z) {
        ImageView imageViewM2529i = m2529i();
        if (imageViewM2529i == null || f2 < this.f4561d || f2 > this.f4563f) {
            return;
        }
        if (z) {
            imageViewM2529i.post(new b(m2532l(), f2, f3, f4));
        } else {
            this.f4571n.setScale(f2, f2, f3, f4);
            m2523b();
        }
    }

    /* renamed from: r */
    public void m2537r(float f2, boolean z) {
        if (m2529i() != null) {
            m2536q(f2, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z);
        }
    }

    /* renamed from: s */
    public void m2538s() {
        ImageView imageViewM2529i = m2529i();
        if (imageViewM2529i != null) {
            if (!this.f4557C) {
                m2534n();
            } else {
                m2521p(imageViewM2529i);
                m2539t(imageViewM2529i.getDrawable());
            }
        }
    }

    /* renamed from: t */
    public final void m2539t(Drawable drawable) {
        Matrix matrix;
        Matrix.ScaleToFit scaleToFit;
        float fMin;
        ImageView imageViewM2529i = m2529i();
        if (imageViewM2529i == null || drawable == null) {
            return;
        }
        float fM2531k = m2531k(imageViewM2529i);
        float fM2530j = m2530j(imageViewM2529i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f4569l.reset();
        float f2 = intrinsicWidth;
        float f3 = fM2531k / f2;
        float f4 = intrinsicHeight;
        float f5 = fM2530j / f4;
        ImageView.ScaleType scaleType = this.f4558D;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f4569l.postTranslate((fM2531k - f2) / 2.0f, (fM2530j - f4) / 2.0f);
        } else {
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                fMin = Math.max(f3, f5);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                fMin = Math.min(1.0f, Math.min(f3, f5));
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                RectF rectF2 = new RectF(0.0f, 0.0f, fM2531k, fM2530j);
                if (((int) 0.0f) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f4, f2);
                }
                int i = a.f4584a[this.f4558D.ordinal()];
                if (i == 2) {
                    matrix = this.f4569l;
                    scaleToFit = Matrix.ScaleToFit.START;
                } else if (i == 3) {
                    matrix = this.f4569l;
                    scaleToFit = Matrix.ScaleToFit.END;
                } else if (i == 4) {
                    matrix = this.f4569l;
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                } else if (i == 5) {
                    matrix = this.f4569l;
                    scaleToFit = Matrix.ScaleToFit.FILL;
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
            }
            this.f4569l.postScale(fMin, fMin);
            this.f4569l.postTranslate((fM2531k - (f2 * fMin)) / 2.0f, (fM2530j - (f4 * fMin)) / 2.0f);
        }
        m2534n();
    }
}
