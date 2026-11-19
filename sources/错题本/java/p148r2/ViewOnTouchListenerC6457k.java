package p148r2;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.compose.material3.AbstractC1923c;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;
import java.lang.ref.WeakReference;
import p057f3.C5523a;
import p156s2.C6553b;

/* renamed from: r2.k */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC6457k implements InterfaceC6448b, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: z */
    public static final boolean f10598z = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: h */
    public WeakReference f10606h;

    /* renamed from: i */
    public final GestureDetector f10607i;

    /* renamed from: j */
    public final C6553b f10608j;

    /* renamed from: p */
    public InterfaceC6456j f10614p;

    /* renamed from: q */
    public View.OnLongClickListener f10615q;

    /* renamed from: r */
    public int f10616r;

    /* renamed from: s */
    public int f10617s;

    /* renamed from: t */
    public int f10618t;

    /* renamed from: u */
    public int f10619u;

    /* renamed from: v */
    public RunnableC6451e f10620v;

    /* renamed from: x */
    public boolean f10622x;

    /* renamed from: a */
    public final AccelerateDecelerateInterpolator f10599a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    public int f10600b = 200;

    /* renamed from: c */
    public float f10601c = 1.0f;

    /* renamed from: d */
    public float f10602d = 1.75f;

    /* renamed from: e */
    public float f10603e = 3.0f;

    /* renamed from: f */
    public boolean f10604f = true;

    /* renamed from: g */
    public boolean f10605g = false;

    /* renamed from: k */
    public final Matrix f10609k = new Matrix();

    /* renamed from: l */
    public final Matrix f10610l = new Matrix();

    /* renamed from: m */
    public final Matrix f10611m = new Matrix();

    /* renamed from: n */
    public final RectF f10612n = new RectF();

    /* renamed from: o */
    public final float[] f10613o = new float[9];

    /* renamed from: w */
    public int f10621w = 2;

    /* renamed from: y */
    public ImageView.ScaleType f10623y = ImageView.ScaleType.FIT_CENTER;

    public ViewOnTouchListenerC6457k(PhotoView photoView) {
        this.f10606h = new WeakReference(photoView);
        photoView.setDrawingCacheEnabled(true);
        photoView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = photoView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        C6553b c6553b = new C6553b(photoView.getContext());
        c6553b.f10935a = this;
        this.f10608j = c6553b;
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new C5523a(this));
        this.f10607i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6447a(this));
        this.f10622x = true;
        m6123o();
    }

    /* renamed from: c */
    public static void m6109c(float f, float f7, float f8) {
        if (f >= f7) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f7 >= f8) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: h */
    public static int m6110h(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: i */
    public static int m6111i(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: a */
    public final void m6112a() {
        if (m6113b()) {
            m6121m(m6116f());
        }
    }

    /* renamed from: b */
    public final boolean m6113b() {
        RectF rectFM6115e;
        float f;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        ImageView imageViewM6117g = m6117g();
        if (imageViewM6117g == null || (rectFM6115e = m6115e(m6116f())) == null) {
            return false;
        }
        float fHeight = rectFM6115e.height();
        float fWidth = rectFM6115e.width();
        float fM6110h = m6110h(imageViewM6117g);
        float f12 = 0.0f;
        if (fHeight <= fM6110h) {
            int i = AbstractC6449c.f10587a[this.f10623y.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    fM6110h = (fM6110h - fHeight) / 2.0f;
                    f7 = rectFM6115e.top;
                } else {
                    fM6110h -= fHeight;
                    f7 = rectFM6115e.top;
                }
            } else {
                f = rectFM6115e.top;
                f8 = -f;
            }
        } else {
            f = rectFM6115e.top;
            if (f > 0.0f) {
                f8 = -f;
            } else {
                f7 = rectFM6115e.bottom;
                f8 = f7 < fM6110h ? fM6110h - f7 : 0.0f;
            }
        }
        float fM6111i = m6111i(imageViewM6117g);
        if (fWidth <= fM6111i) {
            int i8 = AbstractC6449c.f10587a[this.f10623y.ordinal()];
            if (i8 != 2) {
                if (i8 != 3) {
                    f10 = (fM6111i - fWidth) / 2.0f;
                    f11 = rectFM6115e.left;
                } else {
                    f10 = fM6111i - fWidth;
                    f11 = rectFM6115e.left;
                }
                f9 = f10 - f11;
            } else {
                f9 = -rectFM6115e.left;
            }
            f12 = f9;
            this.f10621w = 2;
        } else {
            float f13 = rectFM6115e.left;
            if (f13 > 0.0f) {
                this.f10621w = 0;
                f12 = -f13;
            } else {
                float f14 = rectFM6115e.right;
                if (f14 < fM6111i) {
                    f12 = fM6111i - f14;
                    this.f10621w = 1;
                } else {
                    this.f10621w = -1;
                }
            }
        }
        this.f10611m.postTranslate(f12, f8);
        return true;
    }

    /* renamed from: d */
    public final void m6114d() {
        WeakReference weakReference = this.f10606h;
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
            RunnableC6451e runnableC6451e = this.f10620v;
            if (runnableC6451e != null) {
                runnableC6451e.f10594a.f10989b.forceFinished(true);
                this.f10620v = null;
            }
        }
        GestureDetector gestureDetector = this.f10607i;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f10614p = null;
        this.f10615q = null;
        this.f10606h = null;
    }

    /* renamed from: e */
    public final RectF m6115e(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM6117g = m6117g();
        if (imageViewM6117g == null || (drawable = imageViewM6117g.getDrawable()) == null) {
            return null;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f10612n;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        matrix.mapRect(rectF);
        return rectF;
    }

    /* renamed from: f */
    public final Matrix m6116f() {
        Matrix matrix = this.f10609k;
        Matrix matrix2 = this.f10610l;
        matrix2.set(matrix);
        matrix2.postConcat(this.f10611m);
        return matrix2;
    }

    /* renamed from: g */
    public final ImageView m6117g() {
        WeakReference weakReference = this.f10606h;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m6114d();
        }
        return imageView;
    }

    /* renamed from: j */
    public final float m6118j() {
        Matrix matrix = this.f10611m;
        float[] fArr = this.f10613o;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    /* renamed from: k */
    public final void m6119k(float f, float f7, float f8) {
        if (f10598z) {
            String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f), Float.valueOf(f7), Float.valueOf(f8));
        }
        if (m6118j() < this.f10603e || f < 1.0f) {
            if (m6118j() > this.f10601c || f > 1.0f) {
                this.f10611m.postScale(f, f, f7, f8);
                m6112a();
            }
        }
    }

    /* renamed from: l */
    public final void m6120l() {
        Matrix matrix = this.f10611m;
        matrix.reset();
        matrix.postRotate(0.0f);
        m6112a();
        m6121m(m6116f());
        m6113b();
    }

    /* renamed from: m */
    public final void m6121m(Matrix matrix) {
        ImageView imageViewM6117g = m6117g();
        if (imageViewM6117g != null) {
            ImageView imageViewM6117g2 = m6117g();
            if (imageViewM6117g2 != null && !(imageViewM6117g2 instanceof InterfaceC6448b) && !ImageView.ScaleType.MATRIX.equals(imageViewM6117g2.getScaleType())) {
                throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
            }
            imageViewM6117g.setImageMatrix(matrix);
        }
    }

    /* renamed from: n */
    public final void m6122n(float f, float f7, float f8, boolean z8) {
        ImageView imageViewM6117g = m6117g();
        if (imageViewM6117g == null || f < this.f10601c || f > this.f10603e) {
            return;
        }
        if (z8) {
            imageViewM6117g.post(new RunnableC6450d(this, m6118j(), f, f7, f8));
        } else {
            this.f10611m.setScale(f, f, f7, f8);
            m6112a();
        }
    }

    /* renamed from: o */
    public final void m6123o() {
        ImageView imageViewM6117g = m6117g();
        if (imageViewM6117g != null) {
            if (!this.f10622x) {
                m6120l();
                return;
            }
            if (!(imageViewM6117g instanceof InterfaceC6448b)) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
                if (!scaleType.equals(imageViewM6117g.getScaleType())) {
                    imageViewM6117g.setScaleType(scaleType);
                }
            }
            m6124p(imageViewM6117g.getDrawable());
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView imageViewM6117g = m6117g();
        if (imageViewM6117g != null) {
            if (!this.f10622x) {
                m6124p(imageViewM6117g.getDrawable());
                return;
            }
            int top2 = imageViewM6117g.getTop();
            int right = imageViewM6117g.getRight();
            int bottom = imageViewM6117g.getBottom();
            int left = imageViewM6117g.getLeft();
            if (top2 == this.f10616r && bottom == this.f10618t && left == this.f10619u && right == this.f10617s) {
                return;
            }
            m6124p(imageViewM6117g.getDrawable());
            this.f10616r = top2;
            this.f10617s = right;
            this.f10618t = bottom;
            this.f10619u = left;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f10622x
            r1 = 0
            if (r0 == 0) goto La6
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto La6
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto La6
            android.view.ViewParent r0 = r11.getParent()
            int r2 = r12.getAction()
            r3 = 1
            if (r2 == 0) goto L52
            if (r2 == r3) goto L22
            r0 = 3
            if (r2 == r0) goto L22
        L20:
            r5 = r10
            goto L66
        L22:
            float r0 = r10.m6118j()
            float r2 = r10.f10601c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L20
            r10.m6113b()
            android.graphics.Matrix r0 = r10.m6116f()
            android.graphics.RectF r0 = r10.m6115e(r0)
            if (r0 == 0) goto L20
            r2.d r4 = new r2.d
            float r6 = r10.m6118j()
            float r7 = r10.f10601c
            float r8 = r0.centerX()
            float r9 = r0.centerY()
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r11.post(r4)
            r11 = r3
            goto L67
        L52:
            r5 = r10
            if (r0 == 0) goto L58
            r0.requestDisallowInterceptTouchEvent(r3)
        L58:
            r2.e r11 = r5.f10620v
            if (r11 == 0) goto L66
            t2.a r11 = r11.f10594a
            android.widget.OverScroller r11 = r11.f10989b
            r11.forceFinished(r3)
            r11 = 0
            r5.f10620v = r11
        L66:
            r11 = r1
        L67:
            s2.b r0 = r5.f10608j
            if (r0 == 0) goto L9a
            android.view.ScaleGestureDetector r11 = r0.f10944j
            boolean r2 = r11.isInProgress()
            boolean r4 = r0.f10941g
            r0.getClass()
            android.view.ScaleGestureDetector r6 = r0.f10944j     // Catch: java.lang.IllegalArgumentException -> L7e
            r6.onTouchEvent(r12)     // Catch: java.lang.IllegalArgumentException -> L7e
            r0.m6194d(r12)     // Catch: java.lang.IllegalArgumentException -> L7e
        L7e:
            if (r2 != 0) goto L88
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto L88
            r11 = r3
            goto L89
        L88:
            r11 = r1
        L89:
            if (r4 != 0) goto L91
            boolean r0 = r0.f10941g
            if (r0 != 0) goto L91
            r0 = r3
            goto L92
        L91:
            r0 = r1
        L92:
            if (r11 == 0) goto L97
            if (r0 == 0) goto L97
            r1 = r3
        L97:
            r5.f10605g = r1
            r11 = r3
        L9a:
            android.view.GestureDetector r0 = r5.f10607i
            if (r0 == 0) goto La5
            boolean r12 = r0.onTouchEvent(r12)
            if (r12 == 0) goto La5
            return r3
        La5:
            return r11
        La6:
            r5 = r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148r2.ViewOnTouchListenerC6457k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m6124p(Drawable drawable) {
        ImageView imageViewM6117g = m6117g();
        if (imageViewM6117g == null || drawable == null) {
            return;
        }
        float fM6111i = m6111i(imageViewM6117g);
        float fM6110h = m6110h(imageViewM6117g);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f10609k;
        matrix.reset();
        float f = intrinsicWidth;
        float f7 = fM6111i / f;
        float f8 = intrinsicHeight;
        float f9 = fM6110h / f8;
        ImageView.ScaleType scaleType = this.f10623y;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((fM6111i - f) / 2.0f, (fM6110h - f8) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f7, f9);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((fM6111i - (f * fMax)) / 2.0f, AbstractC1923c.m1037a(f8, fMax, fM6110h, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f7, f9));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((fM6111i - (f * fMin)) / 2.0f, AbstractC1923c.m1037a(f8, fMin, fM6110h, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f8);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM6111i, fM6110h);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f8, f);
            }
            int i = AbstractC6449c.f10587a[this.f10623y.ordinal()];
            if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 5) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m6120l();
    }
}
