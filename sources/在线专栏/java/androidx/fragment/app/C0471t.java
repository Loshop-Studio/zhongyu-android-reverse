package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0247a;
import androidx.core.view.C0358u;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0356s;
import androidx.transition.C0722e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p172y.C3483b;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
class C0471t {

    /* renamed from: a */
    private static final int[] f3244a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC0473v f3245b = new C0472u();

    /* renamed from: c */
    static final AbstractC0473v f3246c = m2733w();

    /* renamed from: androidx.fragment.app.t$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g f3247a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3248b;

        /* renamed from: c */
        final /* synthetic */ C3483b f3249c;

        a(g gVar, Fragment fragment, C3483b c3483b) {
            this.f3247a = gVar;
            this.f3248b = fragment;
            this.f3249c = c3483b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3247a.mo2518b(this.f3248b, this.f3249c);
        }
    }

    /* renamed from: androidx.fragment.app.t$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3250a;

        b(ArrayList arrayList) {
            this.f3250a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0471t.m2709A(this.f3250a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.t$c */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g f3251a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3252b;

        /* renamed from: c */
        final /* synthetic */ C3483b f3253c;

        c(g gVar, Fragment fragment, C3483b c3483b) {
            this.f3251a = gVar;
            this.f3252b = fragment;
            this.f3253c = c3483b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3251a.mo2518b(this.f3252b, this.f3253c);
        }
    }

    /* renamed from: androidx.fragment.app.t$d */
    class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f3254a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0473v f3255b;

        /* renamed from: c */
        final /* synthetic */ View f3256c;

        /* renamed from: d */
        final /* synthetic */ Fragment f3257d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3258e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3259f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3260g;

        /* renamed from: h */
        final /* synthetic */ Object f3261h;

        d(Object obj, AbstractC0473v abstractC0473v, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3254a = obj;
            this.f3255b = abstractC0473v;
            this.f3256c = view;
            this.f3257d = fragment;
            this.f3258e = arrayList;
            this.f3259f = arrayList2;
            this.f3260g = arrayList3;
            this.f3261h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3254a;
            if (obj != null) {
                this.f3255b.mo2747p(obj, this.f3256c);
                this.f3259f.addAll(C0471t.m2721k(this.f3255b, this.f3254a, this.f3257d, this.f3258e, this.f3256c));
            }
            if (this.f3260g != null) {
                if (this.f3261h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f3256c);
                    this.f3255b.mo2748q(this.f3261h, this.f3260g, arrayList);
                }
                this.f3260g.clear();
                this.f3260g.add(this.f3256c);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$e */
    class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Fragment f3262a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3263b;

        /* renamed from: c */
        final /* synthetic */ boolean f3264c;

        /* renamed from: d */
        final /* synthetic */ C0247a f3265d;

        /* renamed from: e */
        final /* synthetic */ View f3266e;

        /* renamed from: f */
        final /* synthetic */ AbstractC0473v f3267f;

        /* renamed from: g */
        final /* synthetic */ Rect f3268g;

        e(Fragment fragment, Fragment fragment2, boolean z3, C0247a c0247a, View view, AbstractC0473v abstractC0473v, Rect rect) {
            this.f3262a = fragment;
            this.f3263b = fragment2;
            this.f3264c = z3;
            this.f3265d = c0247a;
            this.f3266e = view;
            this.f3267f = abstractC0473v;
            this.f3268g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0471t.m2716f(this.f3262a, this.f3263b, this.f3264c, this.f3265d, false);
            View view = this.f3266e;
            if (view != null) {
                this.f3267f.m2761k(view, this.f3268g);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$f */
    class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0473v f3269a;

        /* renamed from: b */
        final /* synthetic */ C0247a f3270b;

        /* renamed from: c */
        final /* synthetic */ Object f3271c;

        /* renamed from: d */
        final /* synthetic */ h f3272d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3273e;

        /* renamed from: f */
        final /* synthetic */ View f3274f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3275g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3276h;

        /* renamed from: i */
        final /* synthetic */ boolean f3277i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3278j;

        /* renamed from: k */
        final /* synthetic */ Object f3279k;

        /* renamed from: l */
        final /* synthetic */ Rect f3280l;

        f(AbstractC0473v abstractC0473v, C0247a c0247a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z3, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3269a = abstractC0473v;
            this.f3270b = c0247a;
            this.f3271c = obj;
            this.f3272d = hVar;
            this.f3273e = arrayList;
            this.f3274f = view;
            this.f3275g = fragment;
            this.f3276h = fragment2;
            this.f3277i = z3;
            this.f3278j = arrayList2;
            this.f3279k = obj2;
            this.f3280l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0247a<String, View> c0247aM2718h = C0471t.m2718h(this.f3269a, this.f3270b, this.f3271c, this.f3272d);
            if (c0247aM2718h != null) {
                this.f3273e.addAll(c0247aM2718h.values());
                this.f3273e.add(this.f3274f);
            }
            C0471t.m2716f(this.f3275g, this.f3276h, this.f3277i, c0247aM2718h, false);
            Object obj = this.f3271c;
            if (obj != null) {
                this.f3269a.mo2738A(obj, this.f3278j, this.f3273e);
                View viewM2729s = C0471t.m2729s(c0247aM2718h, this.f3272d, this.f3279k, this.f3277i);
                if (viewM2729s != null) {
                    this.f3269a.m2761k(viewM2729s, this.f3280l);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$g */
    interface g {
        /* renamed from: a */
        void mo2517a(Fragment fragment, C3483b c3483b);

        /* renamed from: b */
        void mo2518b(Fragment fragment, C3483b c3483b);
    }

    /* renamed from: androidx.fragment.app.t$h */
    static class h {

        /* renamed from: a */
        public Fragment f3281a;

        /* renamed from: b */
        public boolean f3282b;

        /* renamed from: c */
        public C0451a f3283c;

        /* renamed from: d */
        public Fragment f3284d;

        /* renamed from: e */
        public boolean f3285e;

        /* renamed from: f */
        public C0451a f3286f;

        h() {
        }
    }

    /* renamed from: A */
    static void m2709A(ArrayList<View> arrayList, int i4) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i4);
        }
    }

    /* renamed from: B */
    static void m2710B(Context context, AbstractC0456e abstractC0456e, ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, int i4, int i5, boolean z3, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i6 = i4; i6 < i5; i6++) {
            C0451a c0451a = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue()) {
                m2715e(c0451a, sparseArray, z3);
            } else {
                m2713c(c0451a, sparseArray, z3);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int iKeyAt = sparseArray.keyAt(i7);
                C0247a<String, String> c0247aM2714d = m2714d(iKeyAt, arrayList, arrayList2, i4, i5);
                h hVar = (h) sparseArray.valueAt(i7);
                if (abstractC0456e.mo2372d() && (viewGroup = (ViewGroup) abstractC0456e.mo2371c(iKeyAt)) != null) {
                    if (z3) {
                        m2725o(viewGroup, hVar, view, c0247aM2714d, gVar);
                    } else {
                        m2724n(viewGroup, hVar, view, c0247aM2714d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2711a(ArrayList<View> arrayList, C0247a<String, View> c0247a, Collection<String> collection) {
        for (int size = c0247a.size() - 1; size >= 0; size--) {
            View viewValueAt = c0247a.valueAt(size);
            if (collection.contains(C0358u.m1998K(viewValueAt))) {
                arrayList.add(viewValueAt);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m2712b(androidx.fragment.app.C0451a r8, androidx.fragment.app.AbstractC0470s.a r9, android.util.SparseArray<androidx.fragment.app.C0471t.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0471t.m2712b(androidx.fragment.app.a, androidx.fragment.app.s$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m2713c(C0451a c0451a, SparseArray<h> sparseArray, boolean z3) {
        int size = c0451a.f3219c.size();
        for (int i4 = 0; i4 < size; i4++) {
            m2712b(c0451a, c0451a.f3219c.get(i4), sparseArray, false, z3);
        }
    }

    /* renamed from: d */
    private static C0247a<String, String> m2714d(int i4, ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, int i5, int i6) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0247a<String, String> c0247a = new C0247a<>();
        for (int i7 = i6 - 1; i7 >= i5; i7--) {
            C0451a c0451a = arrayList.get(i7);
            if (c0451a.m2544D(i4)) {
                boolean zBooleanValue = arrayList2.get(i7).booleanValue();
                ArrayList<String> arrayList5 = c0451a.f3232p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = c0451a.f3232p;
                        arrayList4 = c0451a.f3233q;
                    } else {
                        ArrayList<String> arrayList6 = c0451a.f3232p;
                        arrayList3 = c0451a.f3233q;
                        arrayList4 = arrayList6;
                    }
                    for (int i8 = 0; i8 < size; i8++) {
                        String str = arrayList4.get(i8);
                        String str2 = arrayList3.get(i8);
                        String strRemove = c0247a.remove(str2);
                        if (strRemove != null) {
                            c0247a.put(str, strRemove);
                        } else {
                            c0247a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0247a;
    }

    /* renamed from: e */
    public static void m2715e(C0451a c0451a, SparseArray<h> sparseArray, boolean z3) {
        if (c0451a.f3116t.m2495p0().mo2372d()) {
            for (int size = c0451a.f3219c.size() - 1; size >= 0; size--) {
                m2712b(c0451a, c0451a.f3219c.get(size), sparseArray, true, z3);
            }
        }
    }

    /* renamed from: f */
    static void m2716f(Fragment fragment, Fragment fragment2, boolean z3, C0247a<String, View> c0247a, boolean z4) {
        if (z3) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* renamed from: g */
    private static boolean m2717g(AbstractC0473v abstractC0473v, List<Object> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!abstractC0473v.mo2743e(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C0247a<String, View> m2718h(AbstractC0473v abstractC0473v, C0247a<String, String> c0247a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3281a;
        View view = fragment.getView();
        if (c0247a.isEmpty() || obj == null || view == null) {
            c0247a.clear();
            return null;
        }
        C0247a<String, View> c0247a2 = new C0247a<>();
        abstractC0473v.m2760j(c0247a2, view);
        C0451a c0451a = hVar.f3283c;
        if (hVar.f3282b) {
            fragment.getExitTransitionCallback();
            arrayList = c0451a.f3232p;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = c0451a.f3233q;
        }
        if (arrayList != null) {
            c0247a2.retainAll(arrayList);
            c0247a2.retainAll(c0247a.values());
        }
        m2734x(c0247a, c0247a2);
        return c0247a2;
    }

    /* renamed from: i */
    private static C0247a<String, View> m2719i(AbstractC0473v abstractC0473v, C0247a<String, String> c0247a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (c0247a.isEmpty() || obj == null) {
            c0247a.clear();
            return null;
        }
        Fragment fragment = hVar.f3284d;
        C0247a<String, View> c0247a2 = new C0247a<>();
        abstractC0473v.m2760j(c0247a2, fragment.requireView());
        C0451a c0451a = hVar.f3286f;
        if (hVar.f3285e) {
            fragment.getEnterTransitionCallback();
            arrayList = c0451a.f3233q;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = c0451a.f3232p;
        }
        if (arrayList != null) {
            c0247a2.retainAll(arrayList);
        }
        c0247a.retainAll(c0247a2.keySet());
        return c0247a2;
    }

    /* renamed from: j */
    private static AbstractC0473v m2720j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0473v abstractC0473v = f3245b;
        if (abstractC0473v != null && m2717g(abstractC0473v, arrayList)) {
            return abstractC0473v;
        }
        AbstractC0473v abstractC0473v2 = f3246c;
        if (abstractC0473v2 != null && m2717g(abstractC0473v2, arrayList)) {
            return abstractC0473v2;
        }
        if (abstractC0473v == null && abstractC0473v2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m2721k(AbstractC0473v abstractC0473v, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            abstractC0473v.m2759f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0473v.mo2741b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m2722l(AbstractC0473v abstractC0473v, ViewGroup viewGroup, View view, C0247a<String, String> c0247a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objM2730t;
        C0247a<String, String> c0247a2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f3281a;
        Fragment fragment2 = hVar.f3284d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z3 = hVar.f3282b;
        if (c0247a.isEmpty()) {
            c0247a2 = c0247a;
            objM2730t = null;
        } else {
            objM2730t = m2730t(abstractC0473v, fragment, fragment2, z3);
            c0247a2 = c0247a;
        }
        C0247a<String, View> c0247aM2719i = m2719i(abstractC0473v, c0247a2, objM2730t, hVar);
        if (c0247a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(c0247aM2719i.values());
            obj3 = objM2730t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m2716f(fragment, fragment2, z3, c0247aM2719i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0473v.mo2754z(obj3, view, arrayList);
            m2736z(abstractC0473v, obj3, obj2, c0247aM2719i, hVar.f3285e, hVar.f3286f);
            if (obj != null) {
                abstractC0473v.mo2751u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0356s.m1974a(viewGroup, new f(abstractC0473v, c0247a, obj3, hVar, arrayList2, view, fragment, fragment2, z3, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m2723m(AbstractC0473v abstractC0473v, ViewGroup viewGroup, View view, C0247a<String, String> c0247a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f3281a;
        Fragment fragment2 = hVar.f3284d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z3 = hVar.f3282b;
        Object objM2730t = c0247a.isEmpty() ? null : m2730t(abstractC0473v, fragment, fragment2, z3);
        C0247a<String, View> c0247aM2719i = m2719i(abstractC0473v, c0247a, objM2730t, hVar);
        C0247a<String, View> c0247aM2718h = m2718h(abstractC0473v, c0247a, objM2730t, hVar);
        if (c0247a.isEmpty()) {
            if (c0247aM2719i != null) {
                c0247aM2719i.clear();
            }
            if (c0247aM2718h != null) {
                c0247aM2718h.clear();
            }
            obj3 = null;
        } else {
            m2711a(arrayList, c0247aM2719i, c0247a.keySet());
            m2711a(arrayList2, c0247aM2718h, c0247a.values());
            obj3 = objM2730t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m2716f(fragment, fragment2, z3, c0247aM2719i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0473v.mo2754z(obj3, view, arrayList);
            m2736z(abstractC0473v, obj3, obj2, c0247aM2719i, hVar.f3285e, hVar.f3286f);
            Rect rect2 = new Rect();
            View viewM2729s = m2729s(c0247aM2718h, hVar, obj, z3);
            if (viewM2729s != null) {
                abstractC0473v.mo2751u(obj, rect2);
            }
            rect = rect2;
            view2 = viewM2729s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0356s.m1974a(viewGroup, new e(fragment, fragment2, z3, c0247aM2718h, view2, abstractC0473v, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m2724n(ViewGroup viewGroup, h hVar, View view, C0247a<String, String> c0247a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3281a;
        Fragment fragment2 = hVar.f3284d;
        AbstractC0473v abstractC0473vM2720j = m2720j(fragment2, fragment);
        if (abstractC0473vM2720j == null) {
            return;
        }
        boolean z3 = hVar.f3282b;
        boolean z4 = hVar.f3285e;
        Object objM2727q = m2727q(abstractC0473vM2720j, fragment, z3);
        Object objM2728r = m2728r(abstractC0473vM2720j, fragment2, z4);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM2722l = m2722l(abstractC0473vM2720j, viewGroup, view, c0247a, hVar, arrayList, arrayList2, objM2727q, objM2728r);
        if (objM2727q == null && objM2722l == null) {
            obj = objM2728r;
            if (obj == null) {
                return;
            }
        } else {
            obj = objM2728r;
        }
        ArrayList<View> arrayListM2721k = m2721k(abstractC0473vM2720j, obj, fragment2, arrayList, view);
        if (arrayListM2721k == null || arrayListM2721k.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        abstractC0473vM2720j.mo2740a(objM2727q, view);
        Object objM2731u = m2731u(abstractC0473vM2720j, objM2727q, obj2, objM2722l, fragment, hVar.f3282b);
        if (fragment2 != null && arrayListM2721k != null && (arrayListM2721k.size() > 0 || arrayList.size() > 0)) {
            C3483b c3483b = new C3483b();
            gVar.mo2517a(fragment2, c3483b);
            abstractC0473vM2720j.mo2753w(fragment2, objM2731u, c3483b, new c(gVar, fragment2, c3483b));
        }
        if (objM2731u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            abstractC0473vM2720j.mo2750t(objM2731u, objM2727q, arrayList3, obj2, arrayListM2721k, objM2722l, arrayList2);
            m2735y(abstractC0473vM2720j, viewGroup, fragment, view, arrayList2, objM2727q, arrayList3, obj2, arrayListM2721k);
            abstractC0473vM2720j.m2764x(viewGroup, arrayList2, c0247a);
            abstractC0473vM2720j.mo2742c(viewGroup, objM2731u);
            abstractC0473vM2720j.m2763s(viewGroup, arrayList2, c0247a);
        }
    }

    /* renamed from: o */
    private static void m2725o(ViewGroup viewGroup, h hVar, View view, C0247a<String, String> c0247a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3281a;
        Fragment fragment2 = hVar.f3284d;
        AbstractC0473v abstractC0473vM2720j = m2720j(fragment2, fragment);
        if (abstractC0473vM2720j == null) {
            return;
        }
        boolean z3 = hVar.f3282b;
        boolean z4 = hVar.f3285e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM2727q = m2727q(abstractC0473vM2720j, fragment, z3);
        Object objM2728r = m2728r(abstractC0473vM2720j, fragment2, z4);
        Object objM2723m = m2723m(abstractC0473vM2720j, viewGroup, view, c0247a, hVar, arrayList2, arrayList, objM2727q, objM2728r);
        if (objM2727q == null && objM2723m == null) {
            obj = objM2728r;
            if (obj == null) {
                return;
            }
        } else {
            obj = objM2728r;
        }
        ArrayList<View> arrayListM2721k = m2721k(abstractC0473vM2720j, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListM2721k2 = m2721k(abstractC0473vM2720j, objM2727q, fragment, arrayList, view);
        m2709A(arrayListM2721k2, 4);
        Object objM2731u = m2731u(abstractC0473vM2720j, objM2727q, obj, objM2723m, fragment, z3);
        if (fragment2 != null && arrayListM2721k != null && (arrayListM2721k.size() > 0 || arrayList2.size() > 0)) {
            C3483b c3483b = new C3483b();
            gVar.mo2517a(fragment2, c3483b);
            abstractC0473vM2720j.mo2753w(fragment2, objM2731u, c3483b, new a(gVar, fragment2, c3483b));
        }
        if (objM2731u != null) {
            m2732v(abstractC0473vM2720j, obj, fragment2, arrayListM2721k);
            ArrayList<String> arrayListM2762o = abstractC0473vM2720j.m2762o(arrayList);
            abstractC0473vM2720j.mo2750t(objM2731u, objM2727q, arrayListM2721k2, obj, arrayListM2721k, objM2723m, arrayList);
            abstractC0473vM2720j.mo2742c(viewGroup, objM2731u);
            abstractC0473vM2720j.m2765y(viewGroup, arrayList2, arrayList, arrayListM2762o, c0247a);
            m2709A(arrayListM2721k2, 0);
            abstractC0473vM2720j.mo2738A(objM2723m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static h m2726p(h hVar, SparseArray<h> sparseArray, int i4) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i4, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m2727q(AbstractC0473v abstractC0473v, Fragment fragment, boolean z3) {
        if (fragment == null) {
            return null;
        }
        return abstractC0473v.mo2744g(z3 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    /* renamed from: r */
    private static Object m2728r(AbstractC0473v abstractC0473v, Fragment fragment, boolean z3) {
        if (fragment == null) {
            return null;
        }
        return abstractC0473v.mo2744g(z3 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* renamed from: s */
    static View m2729s(C0247a<String, View> c0247a, h hVar, Object obj, boolean z3) {
        ArrayList<String> arrayList;
        C0451a c0451a = hVar.f3283c;
        if (obj == null || c0247a == null || (arrayList = c0451a.f3232p) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0247a.get(z3 ? c0451a.f3232p.get(0) : c0451a.f3233q.get(0));
    }

    /* renamed from: t */
    private static Object m2730t(AbstractC0473v abstractC0473v, Fragment fragment, Fragment fragment2, boolean z3) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return abstractC0473v.mo2739B(abstractC0473v.mo2744g(z3 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    /* renamed from: u */
    private static Object m2731u(AbstractC0473v abstractC0473v, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z3) {
        return (obj == null || obj2 == null || fragment == null) ? true : z3 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? abstractC0473v.mo2746n(obj2, obj, obj3) : abstractC0473v.mo2745m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m2732v(AbstractC0473v abstractC0473v, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            abstractC0473v.mo2749r(obj, fragment.getView(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0356s.m1974a(fragment.mContainer, new b(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC0473v m2733w() {
        try {
            return (AbstractC0473v) C0722e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    static void m2734x(C0247a<String, String> c0247a, C0247a<String, View> c0247a2) {
        for (int size = c0247a.size() - 1; size >= 0; size--) {
            if (!c0247a2.containsKey(c0247a.valueAt(size))) {
                c0247a.removeAt(size);
            }
        }
    }

    /* renamed from: y */
    private static void m2735y(AbstractC0473v abstractC0473v, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0356s.m1974a(viewGroup, new d(obj, abstractC0473v, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m2736z(AbstractC0473v abstractC0473v, Object obj, Object obj2, C0247a<String, View> c0247a, boolean z3, C0451a c0451a) {
        ArrayList<String> arrayList = c0451a.f3232p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0247a.get(z3 ? c0451a.f3233q.get(0) : c0451a.f3232p.get(0));
        abstractC0473v.mo2752v(obj, view);
        if (obj2 != null) {
            abstractC0473v.mo2752v(obj2, view);
        }
    }
}
