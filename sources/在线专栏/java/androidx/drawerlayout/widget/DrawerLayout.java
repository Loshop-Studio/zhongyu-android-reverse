package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0332a;
import androidx.core.view.C0335a;
import androidx.core.view.C0342e;
import androidx.core.view.C0358u;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C0384c;
import com.p068uc.crashsdk.export.LogType;
import com.taobao.accs.ErrorCode;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p016c0.C1050c;
import p156u.C3403a;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: L */
    private static final int[] f2894L = {R.attr.colorPrimaryDark};

    /* renamed from: M */
    static final int[] f2895M = {R.attr.layout_gravity};

    /* renamed from: N */
    static final boolean f2896N = true;

    /* renamed from: S */
    private static final boolean f2897S = true;

    /* renamed from: A */
    private CharSequence f2898A;

    /* renamed from: B */
    private CharSequence f2899B;

    /* renamed from: C */
    private Object f2900C;

    /* renamed from: D */
    private boolean f2901D;

    /* renamed from: E */
    private Drawable f2902E;

    /* renamed from: F */
    private Drawable f2903F;

    /* renamed from: G */
    private Drawable f2904G;

    /* renamed from: H */
    private Drawable f2905H;

    /* renamed from: I */
    private final ArrayList<View> f2906I;

    /* renamed from: J */
    private Rect f2907J;

    /* renamed from: K */
    private Matrix f2908K;

    /* renamed from: a */
    private final C0409c f2909a;

    /* renamed from: b */
    private float f2910b;

    /* renamed from: c */
    private int f2911c;

    /* renamed from: d */
    private int f2912d;

    /* renamed from: e */
    private float f2913e;

    /* renamed from: f */
    private Paint f2914f;

    /* renamed from: g */
    private final C0384c f2915g;

    /* renamed from: h */
    private final C0384c f2916h;

    /* renamed from: i */
    private final C0411e f2917i;

    /* renamed from: j */
    private final C0411e f2918j;

    /* renamed from: k */
    private int f2919k;

    /* renamed from: l */
    private boolean f2920l;

    /* renamed from: m */
    private boolean f2921m;

    /* renamed from: n */
    private int f2922n;

    /* renamed from: o */
    private int f2923o;

    /* renamed from: p */
    private int f2924p;

    /* renamed from: q */
    private int f2925q;

    /* renamed from: r */
    private boolean f2926r;

    /* renamed from: s */
    private boolean f2927s;

    /* renamed from: t */
    private InterfaceC0410d f2928t;

    /* renamed from: u */
    private List<InterfaceC0410d> f2929u;

    /* renamed from: v */
    private float f2930v;

    /* renamed from: w */
    private float f2931w;

    /* renamed from: x */
    private Drawable f2932x;

    /* renamed from: y */
    private Drawable f2933y;

    /* renamed from: z */
    private Drawable f2934z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class ViewOnApplyWindowInsetsListenerC0407a implements View.OnApplyWindowInsetsListener {
        ViewOnApplyWindowInsetsListenerC0407a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).m2329M(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    class C0408b extends C0335a {

        /* renamed from: a */
        private final Rect f2945a = new Rect();

        C0408b() {
        }

        /* renamed from: a */
        private void m2355a(C1050c c1050c, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (DrawerLayout.m2321y(childAt)) {
                    c1050c.m4878c(childAt);
                }
            }
        }

        /* renamed from: b */
        private void m2356b(C1050c c1050c, C1050c c1050c2) {
            Rect rect = this.f2945a;
            c1050c2.m4893m(rect);
            c1050c.m4871X(rect);
            c1050c2.m4895n(rect);
            c1050c.m4872Y(rect);
            c1050c.m4857F0(c1050c2.m4866N());
            c1050c.m4903r0(c1050c2.m4909v());
            c1050c.m4879c0(c1050c2.m4899p());
            c1050c.m4885g0(c1050c2.m4902r());
            c1050c.m4888i0(c1050c2.m4856F());
            c1050c.m4881d0(c1050c2.m4854E());
            c1050c.m4891k0(c1050c2.m4858G());
            c1050c.m4892l0(c1050c2.m4860H());
            c1050c.m4870V(c1050c2.m4848B());
            c1050c.m4916z0(c1050c2.m4864L());
            c1050c.m4898o0(c1050c2.m4861I());
            c1050c.m4874a(c1050c2.m4890k());
        }

        @Override // androidx.core.view.C0335a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM2345n = DrawerLayout.this.m2345n();
            if (viewM2345n == null) {
                return true;
            }
            CharSequence charSequenceM2348q = DrawerLayout.this.m2348q(DrawerLayout.this.m2349r(viewM2345n));
            if (charSequenceM2348q == null) {
                return true;
            }
            text.add(charSequenceM2348q);
            return true;
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
            if (DrawerLayout.f2896N) {
                super.onInitializeAccessibilityNodeInfo(view, c1050c);
            } else {
                C1050c c1050cM4835Q = C1050c.m4835Q(c1050c);
                super.onInitializeAccessibilityNodeInfo(view, c1050cM4835Q);
                c1050c.m4849B0(view);
                Object objM1992H = C0358u.m1992H(view);
                if (objM1992H instanceof View) {
                    c1050c.m4907t0((View) objM1992H);
                }
                m2356b(c1050c, c1050cM4835Q);
                c1050cM4835Q.m4868S();
                m2355a(c1050c, (ViewGroup) view);
            }
            c1050c.m4879c0(DrawerLayout.class.getName());
            c1050c.m4891k0(false);
            c1050c.m4892l0(false);
            c1050c.m4869T(C1050c.a.f6207e);
            c1050c.m4869T(C1050c.a.f6208f);
        }

        @Override // androidx.core.view.C0335a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f2896N || DrawerLayout.m2321y(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    static final class C0409c extends C0335a {
        C0409c() {
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
            super.onInitializeAccessibilityNodeInfo(view, c1050c);
            if (DrawerLayout.m2321y(view)) {
                return;
            }
            c1050c.m4907t0(null);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface InterfaceC0410d {
        /* renamed from: a */
        void m2357a(int i4);

        /* renamed from: b */
        void m2358b(View view, float f4);

        /* renamed from: c */
        void m2359c(View view);

        /* renamed from: d */
        void m2360d(View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    private class C0411e extends C0384c.c {

        /* renamed from: a */
        private final int f2947a;

        /* renamed from: b */
        private C0384c f2948b;

        /* renamed from: c */
        private final Runnable f2949c = new a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0411e.this.m2362b();
            }
        }

        C0411e(int i4) {
            this.f2947a = i4;
        }

        /* renamed from: a */
        private void m2361a() {
            View viewM2343l = DrawerLayout.this.m2343l(this.f2947a == 3 ? 5 : 3);
            if (viewM2343l != null) {
                DrawerLayout.this.m2336d(viewM2343l);
            }
        }

        /* renamed from: b */
        void m2362b() {
            View viewM2343l;
            int width;
            int iM2281x = this.f2948b.m2281x();
            boolean z3 = this.f2947a == 3;
            if (z3) {
                viewM2343l = DrawerLayout.this.m2343l(3);
                width = (viewM2343l != null ? -viewM2343l.getWidth() : 0) + iM2281x;
            } else {
                viewM2343l = DrawerLayout.this.m2343l(5);
                width = DrawerLayout.this.getWidth() - iM2281x;
            }
            if (viewM2343l != null) {
                if (((!z3 || viewM2343l.getLeft() >= width) && (z3 || viewM2343l.getLeft() <= width)) || DrawerLayout.this.m2347p(viewM2343l) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewM2343l.getLayoutParams();
                this.f2948b.m2271P(viewM2343l, width, viewM2343l.getTop());
                layoutParams.f2937c = true;
                DrawerLayout.this.invalidate();
                m2361a();
                DrawerLayout.this.m2334b();
            }
        }

        /* renamed from: c */
        public void m2363c() {
            DrawerLayout.this.removeCallbacks(this.f2949c);
        }

        @Override // androidx.customview.widget.C0384c.c
        public int clampViewPositionHorizontal(View view, int i4, int i5) {
            if (DrawerLayout.this.m2335c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i4, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i4, width));
        }

        @Override // androidx.customview.widget.C0384c.c
        public int clampViewPositionVertical(View view, int i4, int i5) {
            return view.getTop();
        }

        /* renamed from: d */
        public void m2364d(C0384c c0384c) {
            this.f2948b = c0384c;
        }

        @Override // androidx.customview.widget.C0384c.c
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.m2323B(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onEdgeDragStarted(int i4, int i5) {
            View viewM2343l = (i4 & 1) == 1 ? DrawerLayout.this.m2343l(3) : DrawerLayout.this.m2343l(5);
            if (viewM2343l == null || DrawerLayout.this.m2347p(viewM2343l) != 0) {
                return;
            }
            this.f2948b.m2275c(viewM2343l, i5);
        }

        @Override // androidx.customview.widget.C0384c.c
        public boolean onEdgeLock(int i4) {
            return false;
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onEdgeTouched(int i4, int i5) {
            DrawerLayout.this.postDelayed(this.f2949c, 160L);
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewCaptured(View view, int i4) {
            ((LayoutParams) view.getLayoutParams()).f2937c = false;
            m2361a();
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewDragStateChanged(int i4) {
            DrawerLayout.this.m2332Q(this.f2947a, i4, this.f2948b.m2280w());
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
            float width = (DrawerLayout.this.m2335c(view, 3) ? i4 + r3 : DrawerLayout.this.getWidth() - i4) / view.getWidth();
            DrawerLayout.this.m2331O(view, width);
            view.setVisibility(width == IGoodView.DEFAULT_TO_ALPHA ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewReleased(View view, float f4, float f5) {
            int i4;
            float fM2350s = DrawerLayout.this.m2350s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m2335c(view, 3)) {
                i4 = (f4 > IGoodView.DEFAULT_TO_ALPHA || (f4 == IGoodView.DEFAULT_TO_ALPHA && fM2350s > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f4 < IGoodView.DEFAULT_TO_ALPHA || (f4 == IGoodView.DEFAULT_TO_ALPHA && fM2350s > 0.5f)) {
                    width2 -= width;
                }
                i4 = width2;
            }
            this.f2948b.m2269N(i4, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0384c.c
        public boolean tryCaptureView(View view, int i4) {
            return DrawerLayout.this.m2323B(view) && DrawerLayout.this.m2335c(view, this.f2947a) && DrawerLayout.this.m2347p(view) == 0;
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: D */
    private boolean m2309D(float f4, float f5, View view) {
        if (this.f2907J == null) {
            this.f2907J = new Rect();
        }
        view.getHitRect(this.f2907J);
        return this.f2907J.contains((int) f4, (int) f5);
    }

    /* renamed from: E */
    private boolean m2310E(Drawable drawable, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null || !C3403a.m10391h(drawable)) {
            return false;
        }
        C3403a.m10396m(drawable, i4);
        return true;
    }

    /* renamed from: J */
    private Drawable m2311J() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iM1978A = C0358u.m1978A(this);
        if (iM1978A == 0) {
            Drawable drawable = this.f2902E;
            if (drawable != null) {
                m2310E(drawable, iM1978A);
                return this.f2902E;
            }
        } else {
            Drawable drawable2 = this.f2903F;
            if (drawable2 != null) {
                m2310E(drawable2, iM1978A);
                return this.f2903F;
            }
        }
        return this.f2904G;
    }

    /* renamed from: K */
    private Drawable m2312K() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iM1978A = C0358u.m1978A(this);
        if (iM1978A == 0) {
            Drawable drawable = this.f2903F;
            if (drawable != null) {
                m2310E(drawable, iM1978A);
                return this.f2903F;
            }
        } else {
            Drawable drawable2 = this.f2902E;
            if (drawable2 != null) {
                m2310E(drawable2, iM1978A);
                return this.f2902E;
            }
        }
        return this.f2905H;
    }

    /* renamed from: L */
    private void m2313L() {
        if (f2897S) {
            return;
        }
        this.f2933y = m2311J();
        this.f2934z = m2312K();
    }

    /* renamed from: P */
    private void m2314P(View view, boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((z3 || m2323B(childAt)) && !(z3 && childAt == view)) {
                C0358u.m1979A0(childAt, 4);
            } else {
                C0358u.m1979A0(childAt, 1);
            }
        }
    }

    /* renamed from: k */
    private boolean m2315k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventM2316t = m2316t(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventM2316t);
            motionEventM2316t.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    /* renamed from: t */
    private MotionEvent m2316t(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f2908K == null) {
                this.f2908K = new Matrix();
            }
            matrix.invert(this.f2908K);
            motionEventObtain.transform(this.f2908K);
        }
        return motionEventObtain;
    }

    /* renamed from: u */
    static String m2317u(int i4) {
        return (i4 & 3) == 3 ? "LEFT" : (i4 & 5) == 5 ? "RIGHT" : Integer.toHexString(i4);
    }

    /* renamed from: v */
    private static boolean m2318v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: w */
    private boolean m2319w() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((LayoutParams) getChildAt(i4).getLayoutParams()).f2937c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    private boolean m2320x() {
        return m2345n() != null;
    }

    /* renamed from: y */
    static boolean m2321y(View view) {
        return (C0358u.m2066y(view) == 4 || C0358u.m2066y(view) == 2) ? false : true;
    }

    /* renamed from: A */
    public boolean m2322A(View view) {
        if (m2323B(view)) {
            return (((LayoutParams) view.getLayoutParams()).f2938d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: B */
    boolean m2323B(View view) {
        int iM1928b = C0342e.m1928b(((LayoutParams) view.getLayoutParams()).f2935a, C0358u.m1978A(view));
        return ((iM1928b & 3) == 0 && (iM1928b & 5) == 0) ? false : true;
    }

    /* renamed from: C */
    public boolean m2324C(View view) {
        if (m2323B(view)) {
            return ((LayoutParams) view.getLayoutParams()).f2936b > IGoodView.DEFAULT_TO_ALPHA;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: F */
    void m2325F(View view, float f4) {
        float fM2350s = m2350s(view);
        float width = view.getWidth();
        int i4 = ((int) (width * f4)) - ((int) (fM2350s * width));
        if (!m2335c(view, 3)) {
            i4 = -i4;
        }
        view.offsetLeftAndRight(i4);
        m2331O(view, f4);
    }

    /* renamed from: G */
    public void m2326G(View view) {
        m2327H(view, true);
    }

    /* renamed from: H */
    public void m2327H(View view, boolean z3) {
        if (!m2323B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f2921m) {
            layoutParams.f2936b = 1.0f;
            layoutParams.f2938d = 1;
            m2314P(view, true);
        } else if (z3) {
            layoutParams.f2938d |= 2;
            if (m2335c(view, 3)) {
                this.f2915g.m2271P(view, 0, view.getTop());
            } else {
                this.f2916h.m2271P(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m2325F(view, 1.0f);
            m2332Q(layoutParams.f2935a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: I */
    public void m2328I(InterfaceC0410d interfaceC0410d) {
        List<InterfaceC0410d> list;
        if (interfaceC0410d == null || (list = this.f2929u) == null) {
            return;
        }
        list.remove(interfaceC0410d);
    }

    /* renamed from: M */
    public void m2329M(Object obj, boolean z3) {
        this.f2900C = obj;
        this.f2901D = z3;
        setWillNotDraw(!z3 && getBackground() == null);
        requestLayout();
    }

    /* renamed from: N */
    public void m2330N(int i4, int i5) {
        View viewM2343l;
        int iM1928b = C0342e.m1928b(i5, C0358u.m1978A(this));
        if (i5 == 3) {
            this.f2922n = i4;
        } else if (i5 == 5) {
            this.f2923o = i4;
        } else if (i5 == 8388611) {
            this.f2924p = i4;
        } else if (i5 == 8388613) {
            this.f2925q = i4;
        }
        if (i4 != 0) {
            (iM1928b == 3 ? this.f2915g : this.f2916h).m2274b();
        }
        if (i4 != 1) {
            if (i4 == 2 && (viewM2343l = m2343l(iM1928b)) != null) {
                m2326G(viewM2343l);
                return;
            }
            return;
        }
        View viewM2343l2 = m2343l(iM1928b);
        if (viewM2343l2 != null) {
            m2336d(viewM2343l2);
        }
    }

    /* renamed from: O */
    void m2331O(View view, float f4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f4 == layoutParams.f2936b) {
            return;
        }
        layoutParams.f2936b = f4;
        m2342j(view, f4);
    }

    /* renamed from: Q */
    void m2332Q(int i4, int i5, View view) {
        int iM2261A = this.f2915g.m2261A();
        int iM2261A2 = this.f2916h.m2261A();
        int i6 = 2;
        if (iM2261A == 1 || iM2261A2 == 1) {
            i6 = 1;
        } else if (iM2261A != 2 && iM2261A2 != 2) {
            i6 = 0;
        }
        if (view != null && i5 == 0) {
            float f4 = ((LayoutParams) view.getLayoutParams()).f2936b;
            if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
                m2340h(view);
            } else if (f4 == 1.0f) {
                m2341i(view);
            }
        }
        if (i6 != this.f2919k) {
            this.f2919k = i6;
            List<InterfaceC0410d> list = this.f2929u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2929u.get(size).m2357a(i6);
                }
            }
        }
    }

    /* renamed from: a */
    public void m2333a(InterfaceC0410d interfaceC0410d) {
        if (interfaceC0410d == null) {
            return;
        }
        if (this.f2929u == null) {
            this.f2929u = new ArrayList();
        }
        this.f2929u.add(interfaceC0410d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!m2323B(childAt)) {
                this.f2906I.add(childAt);
            } else if (m2322A(childAt)) {
                childAt.addFocusables(arrayList, i4, i5);
                z3 = true;
            }
        }
        if (!z3) {
            int size = this.f2906I.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.f2906I.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i4, i5);
                }
            }
        }
        this.f2906I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (m2344m() != null || m2323B(view)) {
            C0358u.m1979A0(view, 4);
        } else {
            C0358u.m1979A0(view, 1);
        }
        if (f2896N) {
            return;
        }
        C0358u.m2051q0(view, this.f2909a);
    }

    /* renamed from: b */
    void m2334b() {
        if (this.f2927s) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f2927s = true;
    }

    /* renamed from: c */
    boolean m2335c(View view, int i4) {
        return (m2349r(view) & i4) == i4;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = IGoodView.DEFAULT_TO_ALPHA;
        for (int i4 = 0; i4 < childCount; i4++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i4).getLayoutParams()).f2936b);
        }
        this.f2913e = fMax;
        boolean zM2278n = this.f2915g.m2278n(true);
        boolean zM2278n2 = this.f2916h.m2278n(true);
        if (zM2278n || zM2278n2) {
            C0358u.m2033h0(this);
        }
    }

    /* renamed from: d */
    public void m2336d(View view) {
        m2337e(view, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2913e <= IGoodView.DEFAULT_TO_ALPHA) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt = getChildAt(i4);
            if (m2309D(x3, y3, childAt) && !m2351z(childAt) && m2315k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        int height = getHeight();
        boolean zM2351z = m2351z(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i4 = 0;
        if (zM2351z) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != view && childAt.getVisibility() == 0 && m2318v(childAt) && m2323B(childAt) && childAt.getHeight() >= height) {
                    if (m2335c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i5) {
                            i5 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i5, 0, width, getHeight());
            i4 = i5;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(iSave);
        float f4 = this.f2913e;
        if (f4 > IGoodView.DEFAULT_TO_ALPHA && zM2351z) {
            this.f2914f.setColor((this.f2912d & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f4)) << 24));
            canvas.drawRect(i4, IGoodView.DEFAULT_TO_ALPHA, width, getHeight(), this.f2914f);
        } else if (this.f2933y != null && m2335c(view, 3)) {
            int intrinsicWidth = this.f2933y.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(IGoodView.DEFAULT_TO_ALPHA, Math.min(right2 / this.f2915g.m2281x(), 1.0f));
            this.f2933y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f2933y.setAlpha((int) (fMax * 255.0f));
            this.f2933y.draw(canvas);
        } else if (this.f2934z != null && m2335c(view, 5)) {
            int intrinsicWidth2 = this.f2934z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(IGoodView.DEFAULT_TO_ALPHA, Math.min((getWidth() - left2) / this.f2916h.m2281x(), 1.0f));
            this.f2934z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f2934z.setAlpha((int) (fMax2 * 255.0f));
            this.f2934z.draw(canvas);
        }
        return zDrawChild;
    }

    /* renamed from: e */
    public void m2337e(View view, boolean z3) {
        if (!m2323B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f2921m) {
            layoutParams.f2936b = IGoodView.DEFAULT_TO_ALPHA;
            layoutParams.f2938d = 0;
        } else if (z3) {
            layoutParams.f2938d |= 4;
            if (m2335c(view, 3)) {
                this.f2915g.m2271P(view, -view.getWidth(), view.getTop());
            } else {
                this.f2916h.m2271P(view, getWidth(), view.getTop());
            }
        } else {
            m2325F(view, IGoodView.DEFAULT_TO_ALPHA);
            m2332Q(layoutParams.f2935a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: f */
    public void m2338f() {
        m2339g(false);
    }

    /* renamed from: g */
    void m2339g(boolean z3) {
        int childCount = getChildCount();
        boolean zM2271P = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m2323B(childAt) && (!z3 || layoutParams.f2937c)) {
                zM2271P |= m2335c(childAt, 3) ? this.f2915g.m2271P(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2916h.m2271P(childAt, getWidth(), childAt.getTop());
                layoutParams.f2937c = false;
            }
        }
        this.f2917i.m2363c();
        this.f2918j.m2363c();
        if (zM2271P) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        return f2897S ? this.f2910b : IGoodView.DEFAULT_TO_ALPHA;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2932x;
    }

    /* renamed from: h */
    void m2340h(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f2938d & 1) == 1) {
            layoutParams.f2938d = 0;
            List<InterfaceC0410d> list = this.f2929u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2929u.get(size).m2360d(view);
                }
            }
            m2314P(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: i */
    void m2341i(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f2938d & 1) == 0) {
            layoutParams.f2938d = 1;
            List<InterfaceC0410d> list = this.f2929u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2929u.get(size).m2359c(view);
                }
            }
            m2314P(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: j */
    void m2342j(View view, float f4) {
        List<InterfaceC0410d> list = this.f2929u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2929u.get(size).m2358b(view, f4);
            }
        }
    }

    /* renamed from: l */
    View m2343l(int i4) {
        int iM1928b = C0342e.m1928b(i4, C0358u.m1978A(this)) & 7;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((m2349r(childAt) & 7) == iM1928b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: m */
    View m2344m() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((((LayoutParams) childAt.getLayoutParams()).f2938d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    View m2345n() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (m2323B(childAt) && m2324C(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public int m2346o(int i4) {
        int iM1978A = C0358u.m1978A(this);
        if (i4 == 3) {
            int i5 = this.f2922n;
            if (i5 != 3) {
                return i5;
            }
            int i6 = iM1978A == 0 ? this.f2924p : this.f2925q;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i4 == 5) {
            int i7 = this.f2923o;
            if (i7 != 3) {
                return i7;
            }
            int i8 = iM1978A == 0 ? this.f2925q : this.f2924p;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i4 == 8388611) {
            int i9 = this.f2924p;
            if (i9 != 3) {
                return i9;
            }
            int i10 = iM1978A == 0 ? this.f2922n : this.f2923o;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i4 != 8388613) {
            return 0;
        }
        int i11 = this.f2925q;
        if (i11 != 3) {
            return i11;
        }
        int i12 = iM1978A == 0 ? this.f2923o : this.f2922n;
        if (i12 != 3) {
            return i12;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2921m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2921m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2901D || this.f2932x == null) {
            return;
        }
        Object obj = this.f2900C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f2932x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2932x.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.c r1 = r6.f2915g
            boolean r1 = r1.m2270O(r7)
            androidx.customview.widget.c r2 = r6.f2916h
            boolean r2 = r2.m2270O(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            androidx.customview.widget.c r7 = r6.f2915g
            boolean r7 = r7.m2276e(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f2917i
            r7.m2363c()
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f2918j
            r7.m2363c()
            goto L38
        L31:
            r6.m2339g(r2)
            r6.f2926r = r3
            r6.f2927s = r3
        L38:
            r7 = 0
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2930v = r0
            r6.f2931w = r7
            float r4 = r6.f2913e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            androidx.customview.widget.c r4 = r6.f2915g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m2279u(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.m2351z(r7)
            if (r7 == 0) goto L5f
            r7 = 1
            goto L60
        L5f:
            r7 = 0
        L60:
            r6.f2926r = r3
            r6.f2927s = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.m2319w()
            if (r7 != 0) goto L74
            boolean r7 = r6.f2927s
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = 0
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || !m2320x()) {
            return super.onKeyDown(i4, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            return super.onKeyUp(i4, keyEvent);
        }
        View viewM2345n = m2345n();
        if (viewM2345n != null && m2347p(viewM2345n) == 0) {
            m2338f();
        }
        return viewM2345n != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        float f4;
        int i8;
        this.f2920l = true;
        int i9 = i6 - i4;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m2351z(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2335c(childAt, 3)) {
                        float f5 = measuredWidth;
                        i8 = (-measuredWidth) + ((int) (layoutParams.f2936b * f5));
                        f4 = (measuredWidth + i8) / f5;
                    } else {
                        float f6 = measuredWidth;
                        f4 = (i9 - r11) / f6;
                        i8 = i9 - ((int) (layoutParams.f2936b * f6));
                    }
                    boolean z4 = f4 != layoutParams.f2936b;
                    int i12 = layoutParams.f2935a & 112;
                    if (i12 == 16) {
                        int i13 = i7 - i5;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i16 > i13 - i17) {
                                i14 = (i13 - i17) - measuredHeight;
                            }
                        }
                        childAt.layout(i8, i14, measuredWidth + i8, measuredHeight + i14);
                    } else if (i12 != 80) {
                        int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i8, i18, measuredWidth + i8, measuredHeight + i18);
                    } else {
                        int i19 = i7 - i5;
                        childAt.layout(i8, (i19 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i8, i19 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z4) {
                        m2331O(childAt, f4);
                    }
                    int i20 = layoutParams.f2936b > IGoodView.DEFAULT_TO_ALPHA ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
        }
        this.f2920l = false;
        this.f2921m = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = ErrorCode.APP_NOT_BIND;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = ErrorCode.APP_NOT_BIND;
            }
        }
        setMeasuredDimension(size, size2);
        int i6 = 0;
        boolean z3 = this.f2900C != null && C0358u.m2064x(this);
        int iM1978A = C0358u.m1978A(this);
        int childCount = getChildCount();
        int i7 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z3) {
                    int iM1928b = C0342e.m1928b(layoutParams.f2935a, iM1978A);
                    if (C0358u.m2064x(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f2900C;
                        if (iM1928b == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i6, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iM1928b == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i6, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f2900C;
                        if (iM1928b == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i6, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iM1928b == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i6, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m2351z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!m2323B(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i7 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f2897S) {
                        float fM2058u = C0358u.m2058u(childAt);
                        float f4 = this.f2910b;
                        if (fM2058u != f4) {
                            C0358u.m2065x0(childAt, f4);
                        }
                    }
                    int iM2349r = m2349r(childAt) & 7;
                    boolean z6 = iM2349r == 3;
                    if ((z6 && z4) || (!z6 && z5)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m2317u(iM2349r) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z6) {
                        z4 = true;
                    } else {
                        z5 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i4, this.f2911c + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
            i7++;
            i6 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewM2343l;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i4 = savedState.f2939a;
        if (i4 != 0 && (viewM2343l = m2343l(i4)) != null) {
            m2326G(viewM2343l);
        }
        int i5 = savedState.f2940b;
        if (i5 != 3) {
            m2330N(i5, 3);
        }
        int i6 = savedState.f2941c;
        if (i6 != 3) {
            m2330N(i6, 5);
        }
        int i7 = savedState.f2942d;
        if (i7 != 3) {
            m2330N(i7, 8388611);
        }
        int i8 = savedState.f2943e;
        if (i8 != 3) {
            m2330N(i8, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        m2313L();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            int i5 = layoutParams.f2938d;
            boolean z3 = i5 == 1;
            boolean z4 = i5 == 2;
            if (z3 || z4) {
                savedState.f2939a = layoutParams.f2935a;
                break;
            }
        }
        savedState.f2940b = this.f2922n;
        savedState.f2941c = this.f2923o;
        savedState.f2942d = this.f2924p;
        savedState.f2943e = this.f2925q;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.c r0 = r6.f2915g
            r0.m2265F(r7)
            androidx.customview.widget.c r0 = r6.f2916h
            r0.m2265F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L69
            if (r0 == r1) goto L22
            r7 = 3
            if (r0 == r7) goto L1a
            goto L79
        L1a:
            r6.m2339g(r1)
            r6.f2926r = r2
            r6.f2927s = r2
            goto L79
        L22:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.c r3 = r6.f2915g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m2279u(r4, r5)
            if (r3 == 0) goto L62
            boolean r3 = r6.m2351z(r3)
            if (r3 == 0) goto L62
            float r3 = r6.f2930v
            float r0 = r0 - r3
            float r3 = r6.f2931w
            float r7 = r7 - r3
            androidx.customview.widget.c r3 = r6.f2915g
            int r3 = r3.m2282z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L62
            android.view.View r7 = r6.m2344m()
            if (r7 == 0) goto L62
            int r7 = r6.m2347p(r7)
            r0 = 2
            if (r7 != r0) goto L60
            goto L62
        L60:
            r7 = 0
            goto L63
        L62:
            r7 = 1
        L63:
            r6.m2339g(r7)
            r6.f2926r = r2
            goto L79
        L69:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2930v = r0
            r6.f2931w = r7
            r6.f2926r = r2
            r6.f2927s = r2
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public int m2347p(View view) {
        if (m2323B(view)) {
            return m2346o(((LayoutParams) view.getLayoutParams()).f2935a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: q */
    public CharSequence m2348q(int i4) {
        int iM1928b = C0342e.m1928b(i4, C0358u.m1978A(this));
        if (iM1928b == 3) {
            return this.f2898A;
        }
        if (iM1928b == 5) {
            return this.f2899B;
        }
        return null;
    }

    /* renamed from: r */
    int m2349r(View view) {
        return C0342e.m1928b(((LayoutParams) view.getLayoutParams()).f2935a, C0358u.m1978A(this));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        this.f2926r = z3;
        if (z3) {
            m2339g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2920l) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    float m2350s(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2936b;
    }

    public void setDrawerElevation(float f4) {
        this.f2910b = f4;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (m2323B(childAt)) {
                C0358u.m2065x0(childAt, this.f2910b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0410d interfaceC0410d) {
        InterfaceC0410d interfaceC0410d2 = this.f2928t;
        if (interfaceC0410d2 != null) {
            m2328I(interfaceC0410d2);
        }
        if (interfaceC0410d != null) {
            m2333a(interfaceC0410d);
        }
        this.f2928t = interfaceC0410d;
    }

    public void setDrawerLockMode(int i4) {
        m2330N(i4, 3);
        m2330N(i4, 5);
    }

    public void setScrimColor(int i4) {
        this.f2912d = i4;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2932x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i4) {
        this.f2932x = new ColorDrawable(i4);
        invalidate();
    }

    /* renamed from: z */
    boolean m2351z(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2935a == 0;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2909a = new C0409c();
        this.f2912d = -1728053248;
        this.f2914f = new Paint();
        this.f2921m = true;
        this.f2922n = 3;
        this.f2923o = 3;
        this.f2924p = 3;
        this.f2925q = 3;
        this.f2902E = null;
        this.f2903F = null;
        this.f2904G = null;
        this.f2905H = null;
        setDescendantFocusability(262144);
        float f4 = getResources().getDisplayMetrics().density;
        this.f2911c = (int) ((64.0f * f4) + 0.5f);
        float f5 = 400.0f * f4;
        C0411e c0411e = new C0411e(3);
        this.f2917i = c0411e;
        C0411e c0411e2 = new C0411e(5);
        this.f2918j = c0411e2;
        C0384c c0384cM2253o = C0384c.m2253o(this, 1.0f, c0411e);
        this.f2915g = c0384cM2253o;
        c0384cM2253o.m2267L(1);
        c0384cM2253o.m2268M(f5);
        c0411e.m2364d(c0384cM2253o);
        C0384c c0384cM2253o2 = C0384c.m2253o(this, 1.0f, c0411e2);
        this.f2916h = c0384cM2253o2;
        c0384cM2253o2.m2267L(2);
        c0384cM2253o2.m2268M(f5);
        c0411e2.m2364d(c0384cM2253o2);
        setFocusableInTouchMode(true);
        C0358u.m1979A0(this, 1);
        C0358u.m2051q0(this, new C0408b());
        setMotionEventSplittingEnabled(false);
        if (C0358u.m2064x(this)) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0407a());
            setSystemUiVisibility(LogType.UNEXP_ANR);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f2894L);
            try {
                this.f2932x = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f2910b = f4 * 10.0f;
        this.f2906I = new ArrayList<>();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setStatusBarBackground(int i4) {
        this.f2932x = i4 != 0 ? C0332a.m1806d(getContext(), i4) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2935a;

        /* renamed from: b */
        float f2936b;

        /* renamed from: c */
        boolean f2937c;

        /* renamed from: d */
        int f2938d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2935a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2895M);
            this.f2935a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f2935a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f2935a = 0;
            this.f2935a = layoutParams.f2935a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2935a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2935a = 0;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0406a();

        /* renamed from: a */
        int f2939a;

        /* renamed from: b */
        int f2940b;

        /* renamed from: c */
        int f2941c;

        /* renamed from: d */
        int f2942d;

        /* renamed from: e */
        int f2943e;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        static class C0406a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0406a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2939a = 0;
            this.f2939a = parcel.readInt();
            this.f2940b = parcel.readInt();
            this.f2941c = parcel.readInt();
            this.f2942d = parcel.readInt();
            this.f2943e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f2939a);
            parcel.writeInt(this.f2940b);
            parcel.writeInt(this.f2941c);
            parcel.writeInt(this.f2942d);
            parcel.writeInt(this.f2943e);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f2939a = 0;
        }
    }
}
