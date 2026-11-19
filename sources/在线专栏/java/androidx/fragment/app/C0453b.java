package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C0247a;
import androidx.core.view.C0358u;
import androidx.core.view.C0360w;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0356s;
import androidx.fragment.app.AbstractC0476y;
import androidx.fragment.app.C0455d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p011b0.C1025h;
import p172y.C3483b;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
class C0453b extends AbstractC0476y {

    /* renamed from: androidx.fragment.app.b$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3119a;

        static {
            int[] iArr = new int[AbstractC0476y.e.c.values().length];
            f3119a = iArr;
            try {
                iArr[AbstractC0476y.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3119a[AbstractC0476y.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3119a[AbstractC0476y.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3119a[AbstractC0476y.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f3120a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0476y.e f3121b;

        b(List list, AbstractC0476y.e eVar) {
            this.f3120a = list;
            this.f3121b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3120a.contains(this.f3121b)) {
                this.f3120a.remove(this.f3121b);
                C0453b.this.m2568s(this.f3121b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3123a;

        /* renamed from: b */
        final /* synthetic */ View f3124b;

        /* renamed from: c */
        final /* synthetic */ boolean f3125c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0476y.e f3126d;

        /* renamed from: e */
        final /* synthetic */ k f3127e;

        c(ViewGroup viewGroup, View view, boolean z3, AbstractC0476y.e eVar, k kVar) {
            this.f3123a = viewGroup;
            this.f3124b = view;
            this.f3125c = z3;
            this.f3126d = eVar;
            this.f3127e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3123a.endViewTransition(this.f3124b);
            if (this.f3125c) {
                this.f3126d.m2795e().m2804a(this.f3124b);
            }
            this.f3127e.m2574a();
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    class d implements C3483b.a {

        /* renamed from: a */
        final /* synthetic */ Animator f3129a;

        d(Animator animator) {
            this.f3129a = animator;
        }

        @Override // p172y.C3483b.a
        /* renamed from: a */
        public void mo2572a() {
            this.f3129a.end();
        }
    }

    /* renamed from: androidx.fragment.app.b$e */
    class e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3131a;

        /* renamed from: b */
        final /* synthetic */ View f3132b;

        /* renamed from: c */
        final /* synthetic */ k f3133c;

        /* renamed from: androidx.fragment.app.b$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3131a.endViewTransition(eVar.f3132b);
                e.this.f3133c.m2574a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f3131a = viewGroup;
            this.f3132b = view;
            this.f3133c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3131a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    class f implements C3483b.a {

        /* renamed from: a */
        final /* synthetic */ View f3136a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3137b;

        /* renamed from: c */
        final /* synthetic */ k f3138c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f3136a = view;
            this.f3137b = viewGroup;
            this.f3138c = kVar;
        }

        @Override // p172y.C3483b.a
        /* renamed from: a */
        public void mo2572a() {
            this.f3136a.clearAnimation();
            this.f3137b.endViewTransition(this.f3136a);
            this.f3138c.m2574a();
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0476y.e f3140a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0476y.e f3141b;

        /* renamed from: c */
        final /* synthetic */ boolean f3142c;

        /* renamed from: d */
        final /* synthetic */ C0247a f3143d;

        g(AbstractC0476y.e eVar, AbstractC0476y.e eVar2, boolean z3, C0247a c0247a) {
            this.f3140a = eVar;
            this.f3141b = eVar2;
            this.f3142c = z3;
            this.f3143d = c0247a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0471t.m2716f(this.f3140a.m2796f(), this.f3141b.m2796f(), this.f3142c, this.f3143d, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC0473v f3145a;

        /* renamed from: b */
        final /* synthetic */ View f3146b;

        /* renamed from: c */
        final /* synthetic */ Rect f3147c;

        h(AbstractC0473v abstractC0473v, View view, Rect rect) {
            this.f3145a = abstractC0473v;
            this.f3146b = view;
            this.f3147c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3145a.m2761k(this.f3146b, this.f3147c);
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3149a;

        i(ArrayList arrayList) {
            this.f3149a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0471t.m2709A(this.f3149a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ m f3151a;

        j(m mVar) {
            this.f3151a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3151a.m2574a();
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    private static class k extends l {

        /* renamed from: c */
        private boolean f3153c;

        /* renamed from: d */
        private boolean f3154d;

        /* renamed from: e */
        private C0455d.d f3155e;

        k(AbstractC0476y.e eVar, C3483b c3483b, boolean z3) {
            super(eVar, c3483b);
            this.f3154d = false;
            this.f3153c = z3;
        }

        /* renamed from: e */
        C0455d.d m2573e(Context context) {
            if (this.f3154d) {
                return this.f3155e;
            }
            C0455d.d dVarM2588c = C0455d.m2588c(context, m2575b().m2796f(), m2575b().m2795e() == AbstractC0476y.e.c.VISIBLE, this.f3153c);
            this.f3155e = dVarM2588c;
            this.f3154d = true;
            return dVarM2588c;
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    private static class l {

        /* renamed from: a */
        private final AbstractC0476y.e f3156a;

        /* renamed from: b */
        private final C3483b f3157b;

        l(AbstractC0476y.e eVar, C3483b c3483b) {
            this.f3156a = eVar;
            this.f3157b = c3483b;
        }

        /* renamed from: a */
        void m2574a() {
            this.f3156a.m2794d(this.f3157b);
        }

        /* renamed from: b */
        AbstractC0476y.e m2575b() {
            return this.f3156a;
        }

        /* renamed from: c */
        C3483b m2576c() {
            return this.f3157b;
        }

        /* renamed from: d */
        boolean m2577d() {
            AbstractC0476y.e.c cVar;
            AbstractC0476y.e.c cVarM2803c = AbstractC0476y.e.c.m2803c(this.f3156a.m2796f().mView);
            AbstractC0476y.e.c cVarM2795e = this.f3156a.m2795e();
            return cVarM2803c == cVarM2795e || !(cVarM2803c == (cVar = AbstractC0476y.e.c.VISIBLE) || cVarM2795e == cVar);
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    private static class m extends l {

        /* renamed from: c */
        private final Object f3158c;

        /* renamed from: d */
        private final boolean f3159d;

        /* renamed from: e */
        private final Object f3160e;

        m(AbstractC0476y.e eVar, C3483b c3483b, boolean z3, boolean z4) {
            super(eVar, c3483b);
            if (eVar.m2795e() == AbstractC0476y.e.c.VISIBLE) {
                this.f3158c = z3 ? eVar.m2796f().getReenterTransition() : eVar.m2796f().getEnterTransition();
                this.f3159d = z3 ? eVar.m2796f().getAllowReturnTransitionOverlap() : eVar.m2796f().getAllowEnterTransitionOverlap();
            } else {
                this.f3158c = z3 ? eVar.m2796f().getReturnTransition() : eVar.m2796f().getExitTransition();
                this.f3159d = true;
            }
            if (!z4) {
                this.f3160e = null;
            } else if (z3) {
                this.f3160e = eVar.m2796f().getSharedElementReturnTransition();
            } else {
                this.f3160e = eVar.m2796f().getSharedElementEnterTransition();
            }
        }

        /* renamed from: f */
        private AbstractC0473v m2578f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC0473v abstractC0473v = C0471t.f3245b;
            if (abstractC0473v != null && abstractC0473v.mo2743e(obj)) {
                return abstractC0473v;
            }
            AbstractC0473v abstractC0473v2 = C0471t.f3246c;
            if (abstractC0473v2 != null && abstractC0473v2.mo2743e(obj)) {
                return abstractC0473v2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m2575b().m2796f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC0473v m2579e() {
            AbstractC0473v abstractC0473vM2578f = m2578f(this.f3158c);
            AbstractC0473v abstractC0473vM2578f2 = m2578f(this.f3160e);
            if (abstractC0473vM2578f == null || abstractC0473vM2578f2 == null || abstractC0473vM2578f == abstractC0473vM2578f2) {
                return abstractC0473vM2578f != null ? abstractC0473vM2578f : abstractC0473vM2578f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m2575b().m2796f() + " returned Transition " + this.f3158c + " which uses a different Transition  type than its shared element transition " + this.f3160e);
        }

        /* renamed from: g */
        public Object m2580g() {
            return this.f3160e;
        }

        /* renamed from: h */
        Object m2581h() {
            return this.f3158c;
        }

        /* renamed from: i */
        public boolean m2582i() {
            return this.f3160e != null;
        }

        /* renamed from: j */
        boolean m2583j() {
            return this.f3159d;
        }
    }

    C0453b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m2565w(List<k> list, List<AbstractC0476y.e> list2, boolean z3, Map<AbstractC0476y.e, Boolean> map) {
        ViewGroup viewGroupM2787m = m2787m();
        Context context = viewGroupM2787m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (k kVar : list) {
            if (kVar.m2577d()) {
                kVar.m2574a();
            } else {
                C0455d.d dVarM2573e = kVar.m2573e(context);
                if (dVarM2573e == null) {
                    kVar.m2574a();
                } else {
                    Animator animator = dVarM2573e.f3179b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        AbstractC0476y.e eVarM2575b = kVar.m2575b();
                        Fragment fragmentM2796f = eVarM2575b.m2796f();
                        if (Boolean.TRUE.equals(map.get(eVarM2575b))) {
                            if (FragmentManager.m2388H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentM2796f + " as this Fragment was involved in a Transition.");
                            }
                            kVar.m2574a();
                        } else {
                            boolean z5 = eVarM2575b.m2795e() == AbstractC0476y.e.c.GONE;
                            if (z5) {
                                list2.remove(eVarM2575b);
                            }
                            View view = fragmentM2796f.mView;
                            viewGroupM2787m.startViewTransition(view);
                            animator.addListener(new c(viewGroupM2787m, view, z5, eVarM2575b, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m2576c().m10557c(new d(animator));
                            z4 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            AbstractC0476y.e eVarM2575b2 = kVar2.m2575b();
            Fragment fragmentM2796f2 = eVarM2575b2.m2796f();
            if (z3) {
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM2796f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.m2574a();
            } else if (z4) {
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM2796f2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.m2574a();
            } else {
                View view2 = fragmentM2796f2.mView;
                Animation animation = (Animation) C1025h.m4782f(((C0455d.d) C1025h.m4782f(kVar2.m2573e(context))).f3178a);
                if (eVarM2575b2.m2795e() != AbstractC0476y.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m2574a();
                } else {
                    viewGroupM2787m.startViewTransition(view2);
                    C0455d.e eVar = new C0455d.e(animation, viewGroupM2787m, view2);
                    eVar.setAnimationListener(new e(viewGroupM2787m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m2576c().m10557c(new f(view2, viewGroupM2787m, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private Map<AbstractC0476y.e, Boolean> m2566x(List<m> list, List<AbstractC0476y.e> list2, boolean z3, AbstractC0476y.e eVar, AbstractC0476y.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        AbstractC0476y.e eVar3;
        AbstractC0476y.e eVar4;
        View view2;
        Object objMo2746n;
        C0247a c0247a;
        ArrayList<View> arrayList3;
        AbstractC0476y.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        AbstractC0473v abstractC0473v;
        AbstractC0476y.e eVar6;
        View view4;
        boolean z4 = z3;
        AbstractC0476y.e eVar7 = eVar;
        AbstractC0476y.e eVar8 = eVar2;
        HashMap map = new HashMap();
        AbstractC0473v abstractC0473v2 = null;
        for (m mVar : list) {
            if (!mVar.m2577d()) {
                AbstractC0473v abstractC0473vM2579e = mVar.m2579e();
                if (abstractC0473v2 == null) {
                    abstractC0473v2 = abstractC0473vM2579e;
                } else if (abstractC0473vM2579e != null && abstractC0473v2 != abstractC0473vM2579e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m2575b().m2796f() + " returned Transition " + mVar.m2581h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC0473v2 == null) {
            for (m mVar2 : list) {
                map.put(mVar2.m2575b(), Boolean.FALSE);
                mVar2.m2574a();
            }
            return map;
        }
        View view5 = new View(m2787m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C0247a c0247a2 = new C0247a();
        Object obj3 = null;
        View view6 = null;
        boolean z5 = false;
        for (m mVar3 : list) {
            if (!mVar3.m2582i() || eVar7 == null || eVar8 == null) {
                c0247a = c0247a2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                abstractC0473v = abstractC0473v2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object objMo2739B = abstractC0473v2.mo2739B(abstractC0473v2.mo2744g(mVar3.m2580g()));
                ArrayList<String> sharedElementSourceNames = eVar2.m2796f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.m2796f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.m2796f().getSharedElementTargetNames();
                View view7 = view6;
                int i4 = 0;
                while (i4 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                    }
                    i4++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.m2796f().getSharedElementTargetNames();
                if (z4) {
                    eVar.m2796f().getEnterTransitionCallback();
                    eVar2.m2796f().getExitTransitionCallback();
                } else {
                    eVar.m2796f().getExitTransitionCallback();
                    eVar2.m2796f().getEnterTransitionCallback();
                }
                int i5 = 0;
                for (int size = sharedElementSourceNames.size(); i5 < size; size = size) {
                    c0247a2.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                    i5++;
                }
                C0247a<String, View> c0247a3 = new C0247a<>();
                m2570u(c0247a3, eVar.m2796f().mView);
                c0247a3.retainAll(sharedElementSourceNames);
                c0247a2.retainAll(c0247a3.keySet());
                C0247a<String, View> c0247a4 = new C0247a<>();
                m2570u(c0247a4, eVar2.m2796f().mView);
                c0247a4.retainAll(sharedElementTargetNames2);
                c0247a4.retainAll(c0247a2.values());
                C0471t.m2734x(c0247a2, c0247a4);
                m2571v(c0247a3, c0247a2.keySet());
                m2571v(c0247a4, c0247a2.values());
                if (c0247a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c0247a = c0247a2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC0473v = abstractC0473v2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    C0471t.m2716f(eVar2.m2796f(), eVar.m2796f(), z4, c0247a3, true);
                    c0247a = c0247a2;
                    ArrayList<View> arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC0356s.m1974a(m2787m(), new g(eVar2, eVar, z3, c0247a4));
                    arrayList5.addAll(c0247a3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = (View) c0247a3.get(sharedElementSourceNames.get(0));
                        abstractC0473v2.mo2752v(objMo2739B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c0247a4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) c0247a4.get(sharedElementTargetNames2.get(0))) != null) {
                        ViewTreeObserverOnPreDrawListenerC0356s.m1974a(m2787m(), new h(abstractC0473v2, view4, rect2));
                        z5 = true;
                    }
                    abstractC0473v2.mo2754z(objMo2739B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC0473v = abstractC0473v2;
                    abstractC0473v2.mo2750t(objMo2739B, null, null, null, null, objMo2739B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objMo2739B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            c0247a2 = c0247a;
            z4 = z3;
            arrayList6 = arrayList3;
            abstractC0473v2 = abstractC0473v;
        }
        View view9 = view6;
        C0247a c0247a5 = c0247a2;
        ArrayList<View> arrayList9 = arrayList6;
        AbstractC0476y.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        AbstractC0473v abstractC0473v3 = abstractC0473v2;
        AbstractC0476y.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object objMo2746n2 = null;
        for (m mVar4 : list) {
            if (mVar4.m2577d()) {
                map.put(mVar4.m2575b(), Boolean.FALSE);
                mVar4.m2574a();
            } else {
                Object objMo2744g = abstractC0473v3.mo2744g(mVar4.m2581h());
                AbstractC0476y.e eVarM2575b = mVar4.m2575b();
                boolean z6 = obj3 != null && (eVarM2575b == eVar9 || eVarM2575b == eVar10);
                if (objMo2744g == null) {
                    if (!z6) {
                        map.put(eVarM2575b, Boolean.FALSE);
                        mVar4.m2574a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view10;
                    objMo2746n = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj5 = obj4;
                    m2569t(arrayList12, eVarM2575b.m2796f().mView);
                    if (z6) {
                        if (eVarM2575b == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC0473v3.mo2740a(objMo2744g, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = eVarM2575b;
                        obj2 = objMo2746n2;
                        eVar3 = eVar10;
                        obj = obj5;
                    } else {
                        abstractC0473v3.mo2741b(objMo2744g, arrayList12);
                        view = view10;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objMo2746n2;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        abstractC0473v3.mo2750t(objMo2744g, objMo2744g, arrayList12, null, null, null, null);
                        if (eVarM2575b.m2795e() == AbstractC0476y.e.c.GONE) {
                            eVar4 = eVarM2575b;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar4.m2796f().mView);
                            abstractC0473v3.mo2749r(objMo2744g, eVar4.m2796f().mView, arrayList13);
                            ViewTreeObserverOnPreDrawListenerC0356s.m1974a(m2787m(), new i(arrayList12));
                        } else {
                            eVar4 = eVarM2575b;
                        }
                    }
                    if (eVar4.m2795e() == AbstractC0476y.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z5) {
                            abstractC0473v3.mo2751u(objMo2744g, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        abstractC0473v3.mo2752v(objMo2744g, view2);
                    }
                    map.put(eVar4, Boolean.TRUE);
                    if (mVar4.m2583j()) {
                        objMo2746n2 = abstractC0473v3.mo2746n(obj2, objMo2744g, null);
                        objMo2746n = obj;
                    } else {
                        objMo2746n = abstractC0473v3.mo2746n(obj, objMo2744g, null);
                        objMo2746n2 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = objMo2746n;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        ArrayList<View> arrayList15 = arrayList10;
        AbstractC0476y.e eVar11 = eVar10;
        Object objMo2745m = abstractC0473v3.mo2745m(objMo2746n2, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.m2577d()) {
                Object objM2581h = mVar5.m2581h();
                AbstractC0476y.e eVarM2575b2 = mVar5.m2575b();
                boolean z7 = obj3 != null && (eVarM2575b2 == eVar9 || eVarM2575b2 == eVar11);
                if (objM2581h != null || z7) {
                    if (C0358u.m2013V(m2787m())) {
                        abstractC0473v3.mo2753w(mVar5.m2575b().m2796f(), objMo2745m, mVar5.m2576c(), new j(mVar5));
                    } else {
                        if (FragmentManager.m2388H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m2787m() + " has not been laid out. Completing operation " + eVarM2575b2);
                        }
                        mVar5.m2574a();
                    }
                }
            }
        }
        if (!C0358u.m2013V(m2787m())) {
            return map;
        }
        C0471t.m2709A(arrayList11, 4);
        ArrayList<String> arrayListM2762o = abstractC0473v3.m2762o(arrayList14);
        abstractC0473v3.mo2742c(m2787m(), objMo2745m);
        abstractC0473v3.m2765y(m2787m(), arrayList15, arrayList14, arrayListM2762o, c0247a5);
        C0471t.m2709A(arrayList11, 0);
        abstractC0473v3.mo2738A(obj3, arrayList15, arrayList14);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // androidx.fragment.app.AbstractC0476y
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mo2567f(java.util.List<androidx.fragment.app.AbstractC0476y.e> r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.y$e r1 = (androidx.fragment.app.AbstractC0476y.e) r1
            androidx.fragment.app.Fragment r3 = r1.m2796f()
            android.view.View r3 = r3.mView
            androidx.fragment.app.y$e$c r3 = androidx.fragment.app.AbstractC0476y.e.c.m2803c(r3)
            int[] r4 = androidx.fragment.app.C0453b.a.f3119a
            androidx.fragment.app.y$e$c r5 = r1.m2795e()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L3c
            r2 = 2
            if (r4 == r2) goto L3c
            r2 = 3
            if (r4 == r2) goto L3c
            r2 = 4
            if (r4 == r2) goto L36
            goto L7
        L36:
            androidx.fragment.app.y$e$c r2 = androidx.fragment.app.AbstractC0476y.e.c.VISIBLE
            if (r3 == r2) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.y$e$c r2 = androidx.fragment.app.AbstractC0476y.e.c.VISIBLE
            if (r3 != r2) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r11.next()
            androidx.fragment.app.y$e r4 = (androidx.fragment.app.AbstractC0476y.e) r4
            y.b r5 = new y.b
            r5.<init>()
            r4.m2800j(r5)
            androidx.fragment.app.b$k r8 = new androidx.fragment.app.b$k
            r8.<init>(r4, r5, r12)
            r0.add(r8)
            y.b r5 = new y.b
            r5.<init>()
            r4.m2800j(r5)
            androidx.fragment.app.b$m r8 = new androidx.fragment.app.b$m
            r9 = 0
            if (r12 == 0) goto L83
            if (r4 != r6) goto L86
            goto L85
        L83:
            if (r4 != r7) goto L86
        L85:
            r9 = 1
        L86:
            r8.<init>(r4, r5, r12, r9)
            r3.add(r8)
            androidx.fragment.app.b$b r5 = new androidx.fragment.app.b$b
            r5.<init>(r1, r4)
            r4.m2792a(r5)
            goto L57
        L95:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.m2566x(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.m2565w(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        La9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.y$e r12 = (androidx.fragment.app.AbstractC0476y.e) r12
            r10.m2568s(r12)
            goto La9
        Lb9:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0453b.mo2567f(java.util.List, boolean):void");
    }

    /* renamed from: s */
    void m2568s(AbstractC0476y.e eVar) {
        eVar.m2795e().m2804a(eVar.m2796f().mView);
    }

    /* renamed from: t */
    void m2569t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C0360w.m2111a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                m2569t(arrayList, childAt);
            }
        }
    }

    /* renamed from: u */
    void m2570u(Map<String, View> map, View view) {
        String strM1998K = C0358u.m1998K(view);
        if (strM1998K != null) {
            map.put(strM1998K, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    m2570u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m2571v(C0247a<String, View> c0247a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c0247a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0358u.m1998K(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
