package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C0247a;
import androidx.core.view.C0358u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.u */
/* loaded from: classes.dex */
public class C0749u {

    /* renamed from: a */
    private static Transition f4469a = new AutoTransition();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0247a<ViewGroup, ArrayList<Transition>>>> f4470b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f4471c = new ArrayList<>();

    /* renamed from: androidx.transition.u$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        Transition f4472a;

        /* renamed from: b */
        ViewGroup f4473b;

        /* renamed from: androidx.transition.u$a$a, reason: collision with other inner class name */
        class C3520a extends C0748t {

            /* renamed from: a */
            final /* synthetic */ C0247a f4474a;

            C3520a(C0247a c0247a) {
                this.f4474a = c0247a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.Transition.InterfaceC0708g
            public void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f4474a.get(a.this.f4473b)).remove(transition);
                transition.removeListener(this);
            }
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.f4472a = transition;
            this.f4473b = viewGroup;
        }

        /* renamed from: a */
        private void m3922a() {
            this.f4473b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f4473b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m3922a();
            if (!C0749u.f4471c.remove(this.f4473b)) {
                return true;
            }
            C0247a<ViewGroup, ArrayList<Transition>> c0247aM3919b = C0749u.m3919b();
            ArrayList<Transition> arrayList = c0247aM3919b.get(this.f4473b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c0247aM3919b.put(this.f4473b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f4472a);
            this.f4472a.addListener(new C3520a(c0247aM3919b));
            this.f4472a.captureValues(this.f4473b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.f4473b);
                }
            }
            this.f4472a.playTransition(this.f4473b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m3922a();
            C0749u.f4471c.remove(this.f4473b);
            ArrayList<Transition> arrayList = C0749u.m3919b().get(this.f4473b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f4473b);
                }
            }
            this.f4472a.clearValues(true);
        }
    }

    /* renamed from: a */
    public static void m3918a(ViewGroup viewGroup, Transition transition) {
        if (f4471c.contains(viewGroup) || !C0358u.m2013V(viewGroup)) {
            return;
        }
        f4471c.add(viewGroup);
        if (transition == null) {
            transition = f4469a;
        }
        Transition transitionMo10731clone = transition.mo10731clone();
        m3921d(viewGroup, transitionMo10731clone);
        C0745q.m3913c(viewGroup, null);
        m3920c(viewGroup, transitionMo10731clone);
    }

    /* renamed from: b */
    static C0247a<ViewGroup, ArrayList<Transition>> m3919b() {
        C0247a<ViewGroup, ArrayList<Transition>> c0247a;
        WeakReference<C0247a<ViewGroup, ArrayList<Transition>>> weakReference = f4470b.get();
        if (weakReference != null && (c0247a = weakReference.get()) != null) {
            return c0247a;
        }
        C0247a<ViewGroup, ArrayList<Transition>> c0247a2 = new C0247a<>();
        f4470b.set(new WeakReference<>(c0247a2));
        return c0247a2;
    }

    /* renamed from: c */
    private static void m3920c(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: d */
    private static void m3921d(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = m3919b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        C0745q c0745qM3912b = C0745q.m3912b(viewGroup);
        if (c0745qM3912b != null) {
            c0745qM3912b.m3914a();
        }
    }
}
