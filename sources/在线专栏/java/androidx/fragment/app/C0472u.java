package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p172y.C3483b;

/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
class C0472u extends AbstractC0473v {

    /* renamed from: androidx.fragment.app.u$a */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3287a;

        a(Rect rect) {
            this.f3287a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3287a;
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    class b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3289a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3290b;

        b(View view, ArrayList arrayList) {
            this.f3289a = view;
            this.f3290b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3289a.setVisibility(8);
            int size = this.f3290b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f3290b.get(i4)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.u$c */
    class c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3292a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3293b;

        /* renamed from: c */
        final /* synthetic */ Object f3294c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3295d;

        /* renamed from: e */
        final /* synthetic */ Object f3296e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3297f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3292a = obj;
            this.f3293b = arrayList;
            this.f3294c = obj2;
            this.f3295d = arrayList2;
            this.f3296e = obj3;
            this.f3297f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3292a;
            if (obj != null) {
                C0472u.this.mo2748q(obj, this.f3293b, null);
            }
            Object obj2 = this.f3294c;
            if (obj2 != null) {
                C0472u.this.mo2748q(obj2, this.f3295d, null);
            }
            Object obj3 = this.f3296e;
            if (obj3 != null) {
                C0472u.this.mo2748q(obj3, this.f3297f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.u$d */
    class d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3299a;

        d(Runnable runnable) {
            this.f3299a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3299a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.u$e */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3301a;

        e(Rect rect) {
            this.f3301a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3301a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3301a;
        }
    }

    C0472u() {
    }

    /* renamed from: C */
    private static boolean m2737C(Transition transition) {
        return (AbstractC0473v.m2758l(transition.getTargetIds()) && AbstractC0473v.m2758l(transition.getTargetNames()) && AbstractC0473v.m2758l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: A */
    public void mo2738A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2748q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: B */
    public Object mo2739B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: a */
    public void mo2740a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: b */
    public void mo2741b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                mo2741b(transitionSet.getTransitionAt(i4), arrayList);
                i4++;
            }
            return;
        }
        if (m2737C(transition) || !AbstractC0473v.m2758l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i4 < size) {
            transition.addTarget(arrayList.get(i4));
            i4++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: c */
    public void mo2742c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: e */
    public boolean mo2743e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: g */
    public Object mo2744g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: m */
    public Object mo2745m(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: n */
    public Object mo2746n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: p */
    public void mo2747p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: q */
    public void mo2748q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                mo2748q(transitionSet.getTransitionAt(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (m2737C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i4 < size) {
            transition.addTarget(arrayList2.get(i4));
            i4++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: r */
    public void mo2749r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: t */
    public void mo2750t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: u */
    public void mo2751u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: v */
    public void mo2752v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m2761k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: w */
    public void mo2753w(Fragment fragment, Object obj, C3483b c3483b, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: z */
    public void mo2754z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0473v.m2755d(targets, arrayList.get(i4));
        }
        targets.add(view);
        arrayList.add(view);
        mo2741b(transitionSet, arrayList);
    }
}
