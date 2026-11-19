package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0335a;
import androidx.core.view.C0340c0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p016c0.C1050c;
import p016c0.InterfaceC1053f;
import p139q.C3004b;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.u */
/* loaded from: classes.dex */
public class C0358u {

    /* renamed from: c */
    private static Field f2751c;

    /* renamed from: e */
    private static ThreadLocal<Rect> f2753e;

    /* renamed from: a */
    private static final AtomicInteger f2749a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, C0362y> f2750b = null;

    /* renamed from: d */
    private static boolean f2752d = false;

    /* renamed from: f */
    private static final int[] f2754f = {C3004b.f11602b, C3004b.f11603c, C3004b.f11614n, C3004b.f11625y, C3004b.f11583B, C3004b.f11584C, C3004b.f11585D, C3004b.f11586E, C3004b.f11587F, C3004b.f11588G, C3004b.f11604d, C3004b.f11605e, C3004b.f11606f, C3004b.f11607g, C3004b.f11608h, C3004b.f11609i, C3004b.f11610j, C3004b.f11611k, C3004b.f11612l, C3004b.f11613m, C3004b.f11615o, C3004b.f11616p, C3004b.f11617q, C3004b.f11618r, C3004b.f11619s, C3004b.f11620t, C3004b.f11621u, C3004b.f11622v, C3004b.f11623w, C3004b.f11624x, C3004b.f11626z, C3004b.f11582A};

    /* renamed from: g */
    private static final InterfaceC0355r f2755g = new a();

    /* renamed from: h */
    private static f f2756h = new f();

    /* renamed from: androidx.core.view.u$a */
    class a implements InterfaceC0355r {
        a() {
        }

        @Override // androidx.core.view.InterfaceC0355r
        public C0339c onReceiveContent(C0339c c0339c) {
            return c0339c;
        }
    }

    /* renamed from: androidx.core.view.u$b */
    class b extends g<Boolean> {
        b(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo2070d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2071e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2072h(Boolean bool, Boolean bool2) {
            return !m2089a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.u$c */
    class c extends g<CharSequence> {
        c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo2070d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2071e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2072h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.u$d */
    class d extends g<CharSequence> {
        d(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo2070d(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2071e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2072h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.u$e */
    class e extends g<Boolean> {
        e(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo2070d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2071e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0358u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2072h(Boolean bool, Boolean bool2) {
            return !m2089a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.u$f */
    static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f2757a = new WeakHashMap<>();

        f() {
        }

        /* renamed from: a */
        private void m2085a(View view, boolean z3) {
            boolean z4 = view.getVisibility() == 0;
            if (z3 != z4) {
                C0358u.m2017Z(view, z4 ? 16 : 32);
                this.f2757a.put(view, Boolean.valueOf(z4));
            }
        }

        /* renamed from: b */
        private void m2086b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2757a.entrySet()) {
                    m2085a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m2086b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.u$g */
    static abstract class g<T> {

        /* renamed from: a */
        private final int f2758a;

        /* renamed from: b */
        private final Class<T> f2759b;

        /* renamed from: c */
        private final int f2760c;

        /* renamed from: d */
        private final int f2761d;

        g(int i4, Class<T> cls, int i5) {
            this(i4, cls, 0, i5);
        }

        /* renamed from: b */
        private boolean m2087b() {
            return true;
        }

        /* renamed from: c */
        private boolean m2088c() {
            return Build.VERSION.SDK_INT >= this.f2760c;
        }

        /* renamed from: a */
        boolean m2089a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* renamed from: d */
        abstract T mo2070d(View view);

        /* renamed from: e */
        abstract void mo2071e(View view, T t3);

        /* renamed from: f */
        T m2090f(View view) {
            if (m2088c()) {
                return mo2070d(view);
            }
            if (!m2087b()) {
                return null;
            }
            T t3 = (T) view.getTag(this.f2758a);
            if (this.f2759b.isInstance(t3)) {
                return t3;
            }
            return null;
        }

        /* renamed from: g */
        void m2091g(View view, T t3) {
            if (m2088c()) {
                mo2071e(view, t3);
            } else if (m2087b() && mo2072h(m2090f(view), t3)) {
                C0358u.m1986E(view);
                view.setTag(this.f2758a, t3);
                C0358u.m2017Z(view, this.f2761d);
            }
        }

        /* renamed from: h */
        abstract boolean mo2072h(T t3, T t4);

        g(int i4, Class<T> cls, int i5, int i6) {
            this.f2758a = i4;
            this.f2759b = cls;
            this.f2761d = i5;
            this.f2760c = i6;
        }
    }

    /* renamed from: androidx.core.view.u$h */
    private static class h {

        /* renamed from: androidx.core.view.u$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0340c0 f2762a = null;

            /* renamed from: b */
            final /* synthetic */ View f2763b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC0353p f2764c;

            a(View view, InterfaceC0353p interfaceC0353p) {
                this.f2763b = view;
                this.f2764c = interfaceC0353p;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0340c0 c0340c0M1862x = C0340c0.m1862x(windowInsets, view);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    h.m2092a(windowInsets, this.f2763b);
                    if (c0340c0M1862x.equals(this.f2762a)) {
                        return this.f2764c.onApplyWindowInsets(view, c0340c0M1862x).m1883v();
                    }
                }
                this.f2762a = c0340c0M1862x;
                C0340c0 c0340c0OnApplyWindowInsets = this.f2764c.onApplyWindowInsets(view, c0340c0M1862x);
                if (i4 >= 30) {
                    return c0340c0OnApplyWindowInsets.m1883v();
                }
                C0358u.m2045n0(view);
                return c0340c0OnApplyWindowInsets.m1883v();
            }
        }

        /* renamed from: a */
        static void m2092a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C3004b.f11600S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C0340c0 m2093b(View view, C0340c0 c0340c0, Rect rect) {
            WindowInsets windowInsetsM1883v = c0340c0.m1883v();
            if (windowInsetsM1883v != null) {
                return C0340c0.m1862x(view.computeSystemWindowInsets(windowInsetsM1883v, rect), view);
            }
            rect.setEmpty();
            return c0340c0;
        }

        /* renamed from: c */
        public static C0340c0 m2094c(View view) {
            return C0340c0.a.m1884a(view);
        }

        /* renamed from: d */
        static void m2095d(View view, InterfaceC0353p interfaceC0353p) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C3004b.f11593L, interfaceC0353p);
            }
            if (interfaceC0353p == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C3004b.f11600S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0353p));
            }
        }
    }

    /* renamed from: androidx.core.view.u$i */
    private static class i {
        /* renamed from: a */
        public static C0340c0 m2096a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0340c0 c0340c0M1861w = C0340c0.m1861w(rootWindowInsets);
            c0340c0M1861w.m1881t(c0340c0M1861w);
            c0340c0M1861w.m1866d(view.getRootView());
            return c0340c0M1861w;
        }
    }

    /* renamed from: androidx.core.view.u$j */
    private static class j {
        /* renamed from: a */
        static void m2097a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    /* renamed from: androidx.core.view.u$k */
    public interface k {
        /* renamed from: a */
        boolean m2098a(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.u$l */
    static class l {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f2765d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f2766a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f2767b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f2768c = null;

        l() {
        }

        /* renamed from: a */
        static l m2099a(View view) {
            int i4 = C3004b.f11598Q;
            l lVar = (l) view.getTag(i4);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l();
            view.setTag(i4, lVar2);
            return lVar2;
        }

        /* renamed from: c */
        private View m2100c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2766a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM2100c = m2100c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM2100c != null) {
                            return viewM2100c;
                        }
                    }
                }
                if (m2102e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m2101d() {
            if (this.f2767b == null) {
                this.f2767b = new SparseArray<>();
            }
            return this.f2767b;
        }

        /* renamed from: e */
        private boolean m2102e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C3004b.f11599R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((k) arrayList.get(size)).m2098a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m2103g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2766a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2765d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2766a == null) {
                    this.f2766a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f2765d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2766a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2766a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m2104b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m2103g();
            }
            View viewM2100c = m2100c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM2100c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m2101d().put(keyCode, new WeakReference<>(viewM2100c));
                }
            }
            return viewM2100c != null;
        }

        /* renamed from: f */
        boolean m2105f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2768c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2768c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayM2101d = m2101d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayM2101d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayM2101d.valueAt(iIndexOfKey);
                sparseArrayM2101d.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayM2101d.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && C0358u.m2012U(view)) {
                m2102e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static int m1978A(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: A0 */
    public static void m1979A0(View view, int i4) {
        view.setImportantForAccessibility(i4);
    }

    /* renamed from: B */
    public static int m1980B(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: B0 */
    public static void m1981B0(View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i4);
        }
    }

    /* renamed from: C */
    public static int m1982C(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: C0 */
    public static void m1983C0(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* renamed from: D */
    public static String[] m1984D(View view) {
        return (String[]) view.getTag(C3004b.f11595N);
    }

    /* renamed from: D0 */
    public static void m1985D0(View view, InterfaceC0353p interfaceC0353p) {
        h.m2095d(view, interfaceC0353p);
    }

    /* renamed from: E */
    static C0335a m1986E(View view) {
        C0335a c0335aM2038k = m2038k(view);
        if (c0335aM2038k == null) {
            c0335aM2038k = new C0335a();
        }
        m2051q0(view, c0335aM2038k);
        return c0335aM2038k;
    }

    /* renamed from: E0 */
    public static void m1987E0(View view, int i4, int i5, int i6, int i7) {
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    /* renamed from: F */
    public static int m1988F(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: F0 */
    public static void m1989F0(View view, C0357t c0357t) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (c0357t != null ? c0357t.m1977a() : null));
        }
    }

    /* renamed from: G */
    public static int m1990G(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: G0 */
    public static void m1991G0(View view, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i4, i5);
        }
    }

    /* renamed from: H */
    public static ViewParent m1992H(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: H0 */
    public static void m1993H0(View view, CharSequence charSequence) {
        m2001L0().m2091g(view, charSequence);
    }

    /* renamed from: I */
    public static C0340c0 m1994I(View view) {
        return Build.VERSION.SDK_INT >= 23 ? i.m2096a(view) : h.m2094c(view);
    }

    /* renamed from: I0 */
    public static void m1995I0(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: J */
    public static final CharSequence m1996J(View view) {
        return m2001L0().m2090f(view);
    }

    /* renamed from: J0 */
    public static void m1997J0(View view, float f4) {
        view.setTranslationZ(f4);
    }

    /* renamed from: K */
    public static String m1998K(View view) {
        return view.getTransitionName();
    }

    /* renamed from: K0 */
    private static void m1999K0(View view) {
        if (m2066y(view) == 0) {
            m1979A0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m2066y((View) parent) == 4) {
                m1979A0(view, 2);
                return;
            }
        }
    }

    @Deprecated
    /* renamed from: L */
    public static float m2000L(View view) {
        return view.getTranslationX();
    }

    /* renamed from: L0 */
    private static g<CharSequence> m2001L0() {
        return new d(C3004b.f11597P, CharSequence.class, 64, 30);
    }

    @Deprecated
    /* renamed from: M */
    public static float m2002M(View view) {
        return view.getTranslationY();
    }

    /* renamed from: M0 */
    public static void m2003M0(View view) {
        view.stopNestedScroll();
    }

    /* renamed from: N */
    public static float m2004N(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: N0 */
    private static void m2005N0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: O */
    public static int m2006O(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: P */
    public static float m2007P(View view) {
        return view.getZ();
    }

    /* renamed from: Q */
    public static boolean m2008Q(View view) {
        return view.hasOnClickListeners();
    }

    /* renamed from: R */
    public static boolean m2009R(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: S */
    public static boolean m2010S(View view) {
        return view.hasTransientState();
    }

    /* renamed from: T */
    public static boolean m2011T(View view) {
        Boolean boolM2090f = m2018a().m2090f(view);
        if (boolM2090f == null) {
            return false;
        }
        return boolM2090f.booleanValue();
    }

    /* renamed from: U */
    public static boolean m2012U(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: V */
    public static boolean m2013V(View view) {
        return view.isLaidOut();
    }

    /* renamed from: W */
    public static boolean m2014W(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: X */
    public static boolean m2015X(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: Y */
    public static boolean m2016Y(View view) {
        Boolean boolM2090f = m2049p0().m2090f(view);
        if (boolM2090f == null) {
            return false;
        }
        return boolM2090f.booleanValue();
    }

    /* renamed from: Z */
    static void m2017Z(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = m2046o(view) != null && view.getVisibility() == 0;
            if (m2044n(view) != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i4);
                if (z3) {
                    accessibilityEventObtain.getText().add(m2046o(view));
                    m1999K0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i4 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i4);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m2046o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    /* renamed from: a */
    private static g<Boolean> m2018a() {
        return new e(C3004b.f11591J, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m2019a0(View view, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i4);
            return;
        }
        Rect rectM2060v = m2060v();
        boolean z3 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM2060v.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z3 = !rectM2060v.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2024d(view, i4);
        if (z3 && rectM2060v.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM2060v);
        }
    }

    /* renamed from: b */
    private static void m2020b(View view, C1050c.a aVar) {
        m1986E(view);
        m2041l0(aVar.m4918b(), view);
        m2048p(view).add(aVar);
        m2017Z(view, 0);
    }

    /* renamed from: b0 */
    public static void m2021b0(View view, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i4);
            return;
        }
        Rect rectM2060v = m2060v();
        boolean z3 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM2060v.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z3 = !rectM2060v.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2026e(view, i4);
        if (z3 && rectM2060v.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM2060v);
        }
    }

    /* renamed from: c */
    public static C0362y m2022c(View view) {
        if (f2750b == null) {
            f2750b = new WeakHashMap<>();
        }
        C0362y c0362y = f2750b.get(view);
        if (c0362y != null) {
            return c0362y;
        }
        C0362y c0362y2 = new C0362y(view);
        f2750b.put(view, c0362y2);
        return c0362y2;
    }

    /* renamed from: c0 */
    public static C0340c0 m2023c0(View view, C0340c0 c0340c0) {
        WindowInsets windowInsetsM1883v = c0340c0.m1883v();
        if (windowInsetsM1883v != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM1883v);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM1883v)) {
                return C0340c0.m1862x(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return c0340c0;
    }

    /* renamed from: d */
    private static void m2024d(View view, int i4) {
        view.offsetLeftAndRight(i4);
        if (view.getVisibility() == 0) {
            m2005N0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2005N0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    public static void m2025d0(View view, C1050c c1050c) {
        view.onInitializeAccessibilityNodeInfo(c1050c.m4859G0());
    }

    /* renamed from: e */
    private static void m2026e(View view, int i4) {
        view.offsetTopAndBottom(i4);
        if (view.getVisibility() == 0) {
            m2005N0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2005N0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    private static g<CharSequence> m2027e0() {
        return new c(C3004b.f11592K, CharSequence.class, 8, 28);
    }

    /* renamed from: f */
    public static C0340c0 m2028f(View view, C0340c0 c0340c0, Rect rect) {
        return h.m2093b(view, c0340c0, rect);
    }

    /* renamed from: f0 */
    public static boolean m2029f0(View view, int i4, Bundle bundle) {
        return view.performAccessibilityAction(i4, bundle);
    }

    /* renamed from: g */
    public static C0340c0 m2030g(View view, C0340c0 c0340c0) {
        WindowInsets windowInsetsM1883v = c0340c0.m1883v();
        if (windowInsetsM1883v != null) {
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsetsM1883v);
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsetsM1883v)) {
                return C0340c0.m1862x(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return c0340c0;
    }

    /* renamed from: g0 */
    public static C0339c m2031g0(View view, C0339c c0339c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0339c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        InterfaceC0354q interfaceC0354q = (InterfaceC0354q) view.getTag(C3004b.f11594M);
        if (interfaceC0354q == null) {
            return m2062w(view).onReceiveContent(c0339c);
        }
        C0339c c0339cMo1973a = interfaceC0354q.mo1973a(view, c0339c);
        if (c0339cMo1973a == null) {
            return null;
        }
        return m2062w(view).onReceiveContent(c0339cMo1973a);
    }

    /* renamed from: h */
    static boolean m2032h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.m2099a(view).m2104b(view, keyEvent);
    }

    /* renamed from: h0 */
    public static void m2033h0(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: i */
    static boolean m2034i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.m2099a(view).m2105f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m2035i0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: j */
    public static int m2036j() {
        return View.generateViewId();
    }

    /* renamed from: j0 */
    public static void m2037j0(View view, Runnable runnable, long j4) {
        view.postOnAnimationDelayed(runnable, j4);
    }

    /* renamed from: k */
    public static C0335a m2038k(View view) {
        View.AccessibilityDelegate accessibilityDelegateM2040l = m2040l(view);
        if (accessibilityDelegateM2040l == null) {
            return null;
        }
        return accessibilityDelegateM2040l instanceof C0335a.a ? ((C0335a.a) accessibilityDelegateM2040l).f2685a : new C0335a(accessibilityDelegateM2040l);
    }

    /* renamed from: k0 */
    public static void m2039k0(View view, int i4) {
        m2041l0(i4, view);
        m2017Z(view, 0);
    }

    /* renamed from: l */
    private static View.AccessibilityDelegate m2040l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : m2042m(view);
    }

    /* renamed from: l0 */
    private static void m2041l0(int i4, View view) {
        List<C1050c.a> listM2048p = m2048p(view);
        for (int i5 = 0; i5 < listM2048p.size(); i5++) {
            if (listM2048p.get(i5).m4918b() == i4) {
                listM2048p.remove(i5);
                return;
            }
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m2042m(View view) {
        if (f2752d) {
            return null;
        }
        if (f2751c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2751c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2752d = true;
                return null;
            }
        }
        try {
            Object obj = f2751c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2752d = true;
            return null;
        }
    }

    /* renamed from: m0 */
    public static void m2043m0(View view, C1050c.a aVar, CharSequence charSequence, InterfaceC1053f interfaceC1053f) {
        if (interfaceC1053f == null && charSequence == null) {
            m2039k0(view, aVar.m4918b());
        } else {
            m2020b(view, aVar.m4917a(charSequence, interfaceC1053f));
        }
    }

    /* renamed from: n */
    public static int m2044n(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* renamed from: n0 */
    public static void m2045n0(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: o */
    public static CharSequence m2046o(View view) {
        return m2027e0().m2090f(view);
    }

    /* renamed from: o0 */
    public static void m2047o0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.m2097a(view, context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    /* renamed from: p */
    private static List<C1050c.a> m2048p(View view) {
        int i4 = C3004b.f11589H;
        ArrayList arrayList = (ArrayList) view.getTag(i4);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i4, arrayList2);
        return arrayList2;
    }

    /* renamed from: p0 */
    private static g<Boolean> m2049p0() {
        return new b(C3004b.f11596O, Boolean.class, 28);
    }

    /* renamed from: q */
    public static ColorStateList m2050q(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: q0 */
    public static void m2051q0(View view, C0335a c0335a) {
        if (c0335a == null && (m2040l(view) instanceof C0335a.a)) {
            c0335a = new C0335a();
        }
        view.setAccessibilityDelegate(c0335a == null ? null : c0335a.getBridge());
    }

    /* renamed from: r */
    public static PorterDuff.Mode m2052r(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: r0 */
    public static void m2053r0(View view, boolean z3) {
        m2018a().m2091g(view, Boolean.valueOf(z3));
    }

    /* renamed from: s */
    public static Rect m2054s(View view) {
        return view.getClipBounds();
    }

    /* renamed from: s0 */
    public static void m2055s0(View view, int i4) {
        view.setAccessibilityLiveRegion(i4);
    }

    /* renamed from: t */
    public static Display m2056t(View view) {
        return view.getDisplay();
    }

    /* renamed from: t0 */
    public static void m2057t0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: u */
    public static float m2058u(View view) {
        return view.getElevation();
    }

    /* renamed from: u0 */
    public static void m2059u0(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: v */
    private static Rect m2060v() {
        if (f2753e == null) {
            f2753e = new ThreadLocal<>();
        }
        Rect rect = f2753e.get();
        if (rect == null) {
            rect = new Rect();
            f2753e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: v0 */
    public static void m2061v0(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private static InterfaceC0355r m2062w(View view) {
        return view instanceof InterfaceC0355r ? (InterfaceC0355r) view : f2755g;
    }

    /* renamed from: w0 */
    public static void m2063w0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: x */
    public static boolean m2064x(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: x0 */
    public static void m2065x0(View view, float f4) {
        view.setElevation(f4);
    }

    /* renamed from: y */
    public static int m2066y(View view) {
        return view.getImportantForAccessibility();
    }

    @Deprecated
    /* renamed from: y0 */
    public static void m2067y0(View view, boolean z3) {
        view.setFitsSystemWindows(z3);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: z */
    public static int m2068z(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: z0 */
    public static void m2069z0(View view, boolean z3) {
        view.setHasTransientState(z3);
    }
}
