package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0473v;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.e */
/* loaded from: classes.dex */
public class C0722e extends AbstractC0473v {

    /* renamed from: androidx.transition.e$a */
    class a extends Transition.AbstractC0707f {

        /* renamed from: a */
        final /* synthetic */ Rect f4401a;

        a(Rect rect) {
            this.f4401a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC0707f
        /* renamed from: a */
        public Rect mo3818a(Transition transition) {
            return this.f4401a;
        }
    }

    /* renamed from: androidx.transition.e$b */
    class b implements Transition.InterfaceC0708g {

        /* renamed from: a */
        final /* synthetic */ View f4403a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4404b;

        b(View view, ArrayList arrayList) {
            this.f4403a = view;
            this.f4404b = arrayList;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4403a.setVisibility(8);
            int size = this.f4404b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f4404b.get(i4)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.e$c */
    class c extends C0748t {

        /* renamed from: a */
        final /* synthetic */ Object f4406a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4407b;

        /* renamed from: c */
        final /* synthetic */ Object f4408c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4409d;

        /* renamed from: e */
        final /* synthetic */ Object f4410e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4411f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4406a = obj;
            this.f4407b = arrayList;
            this.f4408c = obj2;
            this.f4409d = arrayList2;
            this.f4410e = obj3;
            this.f4411f = arrayList3;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4406a;
            if (obj != null) {
                C0722e.this.mo2748q(obj, this.f4407b, null);
            }
            Object obj2 = this.f4408c;
            if (obj2 != null) {
                C0722e.this.mo2748q(obj2, this.f4409d, null);
            }
            Object obj3 = this.f4410e;
            if (obj3 != null) {
                C0722e.this.mo2748q(obj3, this.f4411f, null);
            }
        }
    }

    /* renamed from: androidx.transition.e$d */
    class d extends Transition.AbstractC0707f {

        /* renamed from: a */
        final /* synthetic */ Rect f4413a;

        d(Rect rect) {
            this.f4413a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC0707f
        /* renamed from: a */
        public Rect mo3818a(Transition transition) {
            Rect rect = this.f4413a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4413a;
        }
    }

    /* renamed from: C */
    private static boolean m3853C(Transition transition) {
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
        transitionSet.m3826f((Transition) obj);
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
            int iM3828i = transitionSet.m3828i();
            while (i4 < iM3828i) {
                mo2741b(transitionSet.m3827h(i4), arrayList);
                i4++;
            }
            return;
        }
        if (m3853C(transition) || !AbstractC0473v.m2758l(transition.getTargets())) {
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
        C0749u.m3918a(viewGroup, (Transition) obj);
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
            return ((Transition) obj).mo10731clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: m */
    public Object mo2745m(Object obj, Object obj2, Object obj3) {
        Transition transitionM3837r = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionM3837r != null && transition != null) {
            transitionM3837r = new TransitionSet().m3826f(transitionM3837r).m3826f(transition).m3837r(1);
        } else if (transitionM3837r == null) {
            transitionM3837r = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionM3837r;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transitionM3837r != null) {
            transitionSet.m3826f(transitionM3837r);
        }
        transitionSet.m3826f(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0473v
    /* renamed from: n */
    public Object mo2746n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m3826f((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.m3826f((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.m3826f((Transition) obj3);
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
        Transition transition = (Transition) obj;
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iM3828i = transitionSet.m3828i();
            while (i4 < iM3828i) {
                mo2748q(transitionSet.m3827h(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (m3853C(transition)) {
            return;
        }
        List<View> targets = transition.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i4 < size) {
                transition.addTarget(arrayList2.get(i4));
                i4++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
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
            ((Transition) obj).setEpicenterCallback(new d(rect));
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
