package p000a.p052k.p053b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p000a.p031h.p039f.C0217a;

/* renamed from: a.k.b.t0 */
/* loaded from: classes.dex */
public class C0335t0 extends AbstractC0337u0 {

    /* renamed from: a.k.b.t0$a */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f2084a;

        public a(C0335t0 c0335t0, Rect rect) {
            this.f2084a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f2084a;
        }
    }

    /* renamed from: a.k.b.t0$b */
    public class b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f2085a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2086b;

        public b(C0335t0 c0335t0, View view, ArrayList arrayList) {
            this.f2085a = view;
            this.f2086b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2085a.setVisibility(8);
            int size = this.f2086b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2086b.get(i)).setVisibility(0);
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

    /* renamed from: a.k.b.t0$c */
    public class c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f2087a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f2088b;

        /* renamed from: c */
        public final /* synthetic */ Object f2089c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f2090d;

        /* renamed from: e */
        public final /* synthetic */ Object f2091e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f2092f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2087a = obj;
            this.f2088b = arrayList;
            this.f2089c = obj2;
            this.f2090d = arrayList2;
            this.f2091e = obj3;
            this.f2092f = arrayList3;
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
            Object obj = this.f2087a;
            if (obj != null) {
                C0335t0.this.mo1225p(obj, this.f2088b, null);
            }
            Object obj2 = this.f2089c;
            if (obj2 != null) {
                C0335t0.this.mo1225p(obj2, this.f2090d, null);
            }
            Object obj3 = this.f2091e;
            if (obj3 != null) {
                C0335t0.this.mo1225p(obj3, this.f2092f, null);
            }
        }
    }

    /* renamed from: a.k.b.t0$d */
    public class d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f2094a;

        public d(C0335t0 c0335t0, Runnable runnable) {
            this.f2094a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f2094a.run();
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

    /* renamed from: a.k.b.t0$e */
    public class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f2095a;

        public e(C0335t0 c0335t0, Rect rect) {
            this.f2095a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2095a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2095a;
        }
    }

    /* renamed from: z */
    public static boolean m1216z(Transition transition) {
        return (AbstractC0337u0.m1236k(transition.getTargetIds()) && AbstractC0337u0.m1236k(transition.getTargetNames()) && AbstractC0337u0.m1236k(transition.getTargetTypes())) ? false : true;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: a */
    public void mo1217a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: b */
    public void mo1218b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1218b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m1216z(transition) || !AbstractC0337u0.m1236k(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: c */
    public void mo1219c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: e */
    public boolean mo1220e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: g */
    public Object mo1221g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: l */
    public Object mo1222l(Object obj, Object obj2, Object obj3) {
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

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: m */
    public Object mo1223m(Object obj, Object obj2, Object obj3) {
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

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: o */
    public void mo1224o(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: p */
    public void mo1225p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1225p(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m1216z(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: q */
    public void mo1226q(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: r */
    public void mo1227r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: s */
    public void mo1228s(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(this, rect));
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: t */
    public void mo1229t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1239j(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: u */
    public void mo1230u(ComponentCallbacksC0320m componentCallbacksC0320m, Object obj, C0217a c0217a, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: w */
    public void mo1231w(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0337u0.m1234d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1218b(transitionSet, arrayList);
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: x */
    public void mo1232x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo1225p(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000a.p052k.p053b.AbstractC0337u0
    /* renamed from: y */
    public Object mo1233y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
