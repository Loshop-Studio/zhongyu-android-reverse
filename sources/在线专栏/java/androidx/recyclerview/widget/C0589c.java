package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C0358u;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0589c extends AbstractC0600n {

    /* renamed from: s */
    private static TimeInterpolator f3762s;

    /* renamed from: h */
    private ArrayList<RecyclerView.AbstractC0557b0> f3763h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC0557b0> f3764i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<j> f3765j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<i> f3766k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.AbstractC0557b0>> f3767l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<j>> f3768m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<i>> f3769n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.AbstractC0557b0> f3770o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC0557b0> f3771p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC0557b0> f3772q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC0557b0> f3773r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3774a;

        a(ArrayList arrayList) {
            this.f3774a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3774a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C0589c.this.m3332S(jVar.f3808a, jVar.f3809b, jVar.f3810c, jVar.f3811d, jVar.f3812e);
            }
            this.f3774a.clear();
            C0589c.this.f3768m.remove(this.f3774a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3776a;

        b(ArrayList arrayList) {
            this.f3776a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3776a.iterator();
            while (it.hasNext()) {
                C0589c.this.m3331R((i) it.next());
            }
            this.f3776a.clear();
            C0589c.this.f3769n.remove(this.f3776a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3778a;

        c(ArrayList arrayList) {
            this.f3778a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3778a.iterator();
            while (it.hasNext()) {
                C0589c.this.m3330Q((RecyclerView.AbstractC0557b0) it.next());
            }
            this.f3778a.clear();
            C0589c.this.f3767l.remove(this.f3778a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0557b0 f3780a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3781b;

        /* renamed from: c */
        final /* synthetic */ View f3782c;

        d(RecyclerView.AbstractC0557b0 abstractC0557b0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3780a = abstractC0557b0;
            this.f3781b = viewPropertyAnimator;
            this.f3782c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3781b.setListener(null);
            this.f3782c.setAlpha(1.0f);
            C0589c.this.m3430G(this.f3780a);
            C0589c.this.f3772q.remove(this.f3780a);
            C0589c.this.m3334V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0589c.this.m3431H(this.f3780a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0557b0 f3784a;

        /* renamed from: b */
        final /* synthetic */ View f3785b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3786c;

        e(RecyclerView.AbstractC0557b0 abstractC0557b0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3784a = abstractC0557b0;
            this.f3785b = view;
            this.f3786c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3785b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3786c.setListener(null);
            C0589c.this.m3424A(this.f3784a);
            C0589c.this.f3770o.remove(this.f3784a);
            C0589c.this.m3334V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0589c.this.m3425B(this.f3784a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0557b0 f3788a;

        /* renamed from: b */
        final /* synthetic */ int f3789b;

        /* renamed from: c */
        final /* synthetic */ View f3790c;

        /* renamed from: d */
        final /* synthetic */ int f3791d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3792e;

        f(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3788a = abstractC0557b0;
            this.f3789b = i4;
            this.f3790c = view;
            this.f3791d = i5;
            this.f3792e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3789b != 0) {
                this.f3790c.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
            }
            if (this.f3791d != 0) {
                this.f3790c.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3792e.setListener(null);
            C0589c.this.m3428E(this.f3788a);
            C0589c.this.f3771p.remove(this.f3788a);
            C0589c.this.m3334V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0589c.this.m3429F(this.f3788a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f3794a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3795b;

        /* renamed from: c */
        final /* synthetic */ View f3796c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3794a = iVar;
            this.f3795b = viewPropertyAnimator;
            this.f3796c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3795b.setListener(null);
            this.f3796c.setAlpha(1.0f);
            this.f3796c.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
            this.f3796c.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
            C0589c.this.m3426C(this.f3794a.f3802a, true);
            C0589c.this.f3773r.remove(this.f3794a.f3802a);
            C0589c.this.m3334V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0589c.this.m3427D(this.f3794a.f3802a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f3798a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3799b;

        /* renamed from: c */
        final /* synthetic */ View f3800c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3798a = iVar;
            this.f3799b = viewPropertyAnimator;
            this.f3800c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3799b.setListener(null);
            this.f3800c.setAlpha(1.0f);
            this.f3800c.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
            this.f3800c.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
            C0589c.this.m3426C(this.f3798a.f3803b, false);
            C0589c.this.f3773r.remove(this.f3798a.f3803b);
            C0589c.this.m3334V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0589c.this.m3427D(this.f3798a.f3803b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    private static class j {

        /* renamed from: a */
        public RecyclerView.AbstractC0557b0 f3808a;

        /* renamed from: b */
        public int f3809b;

        /* renamed from: c */
        public int f3810c;

        /* renamed from: d */
        public int f3811d;

        /* renamed from: e */
        public int f3812e;

        j(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4, int i5, int i6, int i7) {
            this.f3808a = abstractC0557b0;
            this.f3809b = i4;
            this.f3810c = i5;
            this.f3811d = i6;
            this.f3812e = i7;
        }
    }

    /* renamed from: T */
    private void m3325T(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        View view = abstractC0557b0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3772q.add(abstractC0557b0);
        viewPropertyAnimatorAnimate.setDuration(m3079o()).alpha(IGoodView.DEFAULT_TO_ALPHA).setListener(new d(abstractC0557b0, viewPropertyAnimatorAnimate, view)).start();
    }

    /* renamed from: W */
    private void m3326W(List<i> list, RecyclerView.AbstractC0557b0 abstractC0557b0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (m3328Y(iVar, abstractC0557b0) && iVar.f3802a == null && iVar.f3803b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m3327X(i iVar) {
        RecyclerView.AbstractC0557b0 abstractC0557b0 = iVar.f3802a;
        if (abstractC0557b0 != null) {
            m3328Y(iVar, abstractC0557b0);
        }
        RecyclerView.AbstractC0557b0 abstractC0557b02 = iVar.f3803b;
        if (abstractC0557b02 != null) {
            m3328Y(iVar, abstractC0557b02);
        }
    }

    /* renamed from: Y */
    private boolean m3328Y(i iVar, RecyclerView.AbstractC0557b0 abstractC0557b0) {
        boolean z3 = false;
        if (iVar.f3803b == abstractC0557b0) {
            iVar.f3803b = null;
        } else {
            if (iVar.f3802a != abstractC0557b0) {
                return false;
            }
            iVar.f3802a = null;
            z3 = true;
        }
        abstractC0557b0.itemView.setAlpha(1.0f);
        abstractC0557b0.itemView.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
        abstractC0557b0.itemView.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
        m3426C(abstractC0557b0, z3);
        return true;
    }

    /* renamed from: Z */
    private void m3329Z(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        if (f3762s == null) {
            f3762s = new ValueAnimator().getInterpolator();
        }
        abstractC0557b0.itemView.animate().setInterpolator(f3762s);
        mo3074j(abstractC0557b0);
    }

    /* renamed from: Q */
    void m3330Q(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        View view = abstractC0557b0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3770o.add(abstractC0557b0);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m3076l()).setListener(new e(abstractC0557b0, view, viewPropertyAnimatorAnimate)).start();
    }

    /* renamed from: R */
    void m3331R(i iVar) {
        RecyclerView.AbstractC0557b0 abstractC0557b0 = iVar.f3802a;
        View view = abstractC0557b0 == null ? null : abstractC0557b0.itemView;
        RecyclerView.AbstractC0557b0 abstractC0557b02 = iVar.f3803b;
        View view2 = abstractC0557b02 != null ? abstractC0557b02.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m3077m());
            this.f3773r.add(iVar.f3802a);
            duration.translationX(iVar.f3806e - iVar.f3804c);
            duration.translationY(iVar.f3807f - iVar.f3805d);
            duration.alpha(IGoodView.DEFAULT_TO_ALPHA).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3773r.add(iVar.f3803b);
            viewPropertyAnimatorAnimate.translationX(IGoodView.DEFAULT_TO_ALPHA).translationY(IGoodView.DEFAULT_TO_ALPHA).setDuration(m3077m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* renamed from: S */
    void m3332S(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4, int i5, int i6, int i7) {
        View view = abstractC0557b0.itemView;
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 != 0) {
            view.animate().translationX(IGoodView.DEFAULT_TO_ALPHA);
        }
        if (i9 != 0) {
            view.animate().translationY(IGoodView.DEFAULT_TO_ALPHA);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3771p.add(abstractC0557b0);
        viewPropertyAnimatorAnimate.setDuration(m3078n()).setListener(new f(abstractC0557b0, i8, view, i9, viewPropertyAnimatorAnimate)).start();
    }

    /* renamed from: U */
    void m3333U(List<RecyclerView.AbstractC0557b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* renamed from: V */
    void m3334V() {
        if (mo3080p()) {
            return;
        }
        m3073i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: g */
    public boolean mo3071g(RecyclerView.AbstractC0557b0 abstractC0557b0, List<Object> list) {
        return !list.isEmpty() || super.mo3071g(abstractC0557b0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: j */
    public void mo3074j(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        View view = abstractC0557b0.itemView;
        view.animate().cancel();
        int size = this.f3765j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f3765j.get(size).f3808a == abstractC0557b0) {
                view.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
                view.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
                m3428E(abstractC0557b0);
                this.f3765j.remove(size);
            }
        }
        m3326W(this.f3766k, abstractC0557b0);
        if (this.f3763h.remove(abstractC0557b0)) {
            view.setAlpha(1.0f);
            m3430G(abstractC0557b0);
        }
        if (this.f3764i.remove(abstractC0557b0)) {
            view.setAlpha(1.0f);
            m3424A(abstractC0557b0);
        }
        for (int size2 = this.f3769n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f3769n.get(size2);
            m3326W(arrayList, abstractC0557b0);
            if (arrayList.isEmpty()) {
                this.f3769n.remove(size2);
            }
        }
        for (int size3 = this.f3768m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f3768m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f3808a == abstractC0557b0) {
                    view.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
                    view.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
                    m3428E(abstractC0557b0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3768m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3767l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0557b0> arrayList3 = this.f3767l.get(size5);
            if (arrayList3.remove(abstractC0557b0)) {
                view.setAlpha(1.0f);
                m3424A(abstractC0557b0);
                if (arrayList3.isEmpty()) {
                    this.f3767l.remove(size5);
                }
            }
        }
        this.f3772q.remove(abstractC0557b0);
        this.f3770o.remove(abstractC0557b0);
        this.f3773r.remove(abstractC0557b0);
        this.f3771p.remove(abstractC0557b0);
        m3334V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: k */
    public void mo3075k() {
        int size = this.f3765j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f3765j.get(size);
            View view = jVar.f3808a.itemView;
            view.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
            view.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
            m3428E(jVar.f3808a);
            this.f3765j.remove(size);
        }
        for (int size2 = this.f3763h.size() - 1; size2 >= 0; size2--) {
            m3430G(this.f3763h.get(size2));
            this.f3763h.remove(size2);
        }
        int size3 = this.f3764i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0557b0 abstractC0557b0 = this.f3764i.get(size3);
            abstractC0557b0.itemView.setAlpha(1.0f);
            m3424A(abstractC0557b0);
            this.f3764i.remove(size3);
        }
        for (int size4 = this.f3766k.size() - 1; size4 >= 0; size4--) {
            m3327X(this.f3766k.get(size4));
        }
        this.f3766k.clear();
        if (mo3080p()) {
            for (int size5 = this.f3768m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f3768m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3808a.itemView;
                    view2.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
                    view2.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
                    m3428E(jVar2.f3808a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3768m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3767l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0557b0> arrayList2 = this.f3767l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0557b0 abstractC0557b02 = arrayList2.get(size8);
                    abstractC0557b02.itemView.setAlpha(1.0f);
                    m3424A(abstractC0557b02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3767l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3769n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f3769n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m3327X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3769n.remove(arrayList3);
                    }
                }
            }
            m3333U(this.f3772q);
            m3333U(this.f3771p);
            m3333U(this.f3770o);
            m3333U(this.f3773r);
            m3073i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: p */
    public boolean mo3080p() {
        return (this.f3764i.isEmpty() && this.f3766k.isEmpty() && this.f3765j.isEmpty() && this.f3763h.isEmpty() && this.f3771p.isEmpty() && this.f3772q.isEmpty() && this.f3770o.isEmpty() && this.f3773r.isEmpty() && this.f3768m.isEmpty() && this.f3767l.isEmpty() && this.f3769n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: u */
    public void mo3085u() {
        boolean z3 = !this.f3763h.isEmpty();
        boolean z4 = !this.f3765j.isEmpty();
        boolean z5 = !this.f3766k.isEmpty();
        boolean z6 = !this.f3764i.isEmpty();
        if (z3 || z4 || z6 || z5) {
            Iterator<RecyclerView.AbstractC0557b0> it = this.f3763h.iterator();
            while (it.hasNext()) {
                m3325T(it.next());
            }
            this.f3763h.clear();
            if (z4) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f3765j);
                this.f3768m.add(arrayList);
                this.f3765j.clear();
                a aVar = new a(arrayList);
                if (z3) {
                    C0358u.m2037j0(arrayList.get(0).f3808a.itemView, aVar, m3079o());
                } else {
                    aVar.run();
                }
            }
            if (z5) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3766k);
                this.f3769n.add(arrayList2);
                this.f3766k.clear();
                b bVar = new b(arrayList2);
                if (z3) {
                    C0358u.m2037j0(arrayList2.get(0).f3802a.itemView, bVar, m3079o());
                } else {
                    bVar.run();
                }
            }
            if (z6) {
                ArrayList<RecyclerView.AbstractC0557b0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f3764i);
                this.f3767l.add(arrayList3);
                this.f3764i.clear();
                c cVar = new c(arrayList3);
                if (z3 || z4 || z5) {
                    C0358u.m2037j0(arrayList3.get(0).itemView, cVar, (z3 ? m3079o() : 0L) + Math.max(z4 ? m3078n() : 0L, z5 ? m3077m() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0600n
    /* renamed from: w */
    public boolean mo3335w(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3329Z(abstractC0557b0);
        abstractC0557b0.itemView.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
        this.f3764i.add(abstractC0557b0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0600n
    /* renamed from: x */
    public boolean mo3336x(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0557b0 abstractC0557b02, int i4, int i5, int i6, int i7) {
        if (abstractC0557b0 == abstractC0557b02) {
            return mo3337y(abstractC0557b0, i4, i5, i6, i7);
        }
        float translationX = abstractC0557b0.itemView.getTranslationX();
        float translationY = abstractC0557b0.itemView.getTranslationY();
        float alpha = abstractC0557b0.itemView.getAlpha();
        m3329Z(abstractC0557b0);
        int i8 = (int) ((i6 - i4) - translationX);
        int i9 = (int) ((i7 - i5) - translationY);
        abstractC0557b0.itemView.setTranslationX(translationX);
        abstractC0557b0.itemView.setTranslationY(translationY);
        abstractC0557b0.itemView.setAlpha(alpha);
        if (abstractC0557b02 != null) {
            m3329Z(abstractC0557b02);
            abstractC0557b02.itemView.setTranslationX(-i8);
            abstractC0557b02.itemView.setTranslationY(-i9);
            abstractC0557b02.itemView.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
        }
        this.f3766k.add(new i(abstractC0557b0, abstractC0557b02, i4, i5, i6, i7));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0600n
    /* renamed from: y */
    public boolean mo3337y(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4, int i5, int i6, int i7) {
        View view = abstractC0557b0.itemView;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) abstractC0557b0.itemView.getTranslationY());
        m3329Z(abstractC0557b0);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            m3428E(abstractC0557b0);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        this.f3765j.add(new j(abstractC0557b0, translationX, translationY, i6, i7));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0600n
    /* renamed from: z */
    public boolean mo3338z(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3329Z(abstractC0557b0);
        this.f3763h.add(abstractC0557b0);
        return true;
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    private static class i {

        /* renamed from: a */
        public RecyclerView.AbstractC0557b0 f3802a;

        /* renamed from: b */
        public RecyclerView.AbstractC0557b0 f3803b;

        /* renamed from: c */
        public int f3804c;

        /* renamed from: d */
        public int f3805d;

        /* renamed from: e */
        public int f3806e;

        /* renamed from: f */
        public int f3807f;

        private i(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0557b0 abstractC0557b02) {
            this.f3802a = abstractC0557b0;
            this.f3803b = abstractC0557b02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3802a + ", newHolder=" + this.f3803b + ", fromX=" + this.f3804c + ", fromY=" + this.f3805d + ", toX=" + this.f3806e + ", toY=" + this.f3807f + '}';
        }

        i(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0557b0 abstractC0557b02, int i4, int i5, int i6, int i7) {
            this(abstractC0557b0, abstractC0557b02);
            this.f3804c = i4;
            this.f3805d = i5;
            this.f3806e = i6;
            this.f3807f = i7;
        }
    }
}
