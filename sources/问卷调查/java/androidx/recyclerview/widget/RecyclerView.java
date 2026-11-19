package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p039f.C0218b;
import p000a.p031h.p043j.C0258g;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.InterfaceC0257f;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p049j.p050a.AbstractC0287a;
import p000a.p060o.C0375a;
import p000a.p060o.p061b.AbstractC0401x;
import p000a.p060o.p061b.C0376a;
import p000a.p060o.p061b.C0377a0;
import p000a.p060o.p061b.C0378b;
import p000a.p060o.p061b.C0379b0;
import p000a.p060o.p061b.C0383f;
import p000a.p060o.p061b.C0388k;
import p000a.p060o.p061b.C0392o;
import p000a.p060o.p061b.C0398u;
import p000a.p060o.p061b.C0400w;
import p000a.p060o.p061b.RunnableC0380c;
import p000a.p060o.p061b.RunnableC0381d;
import p000a.p060o.p061b.RunnableC0382e;
import p000a.p060o.p061b.RunnableC0390m;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0257f {

    /* renamed from: w0 */
    public static final int[] f3262w0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: x0 */
    public static final Class<?>[] f3263x0;

    /* renamed from: y0 */
    public static final Interpolator f3264y0;

    /* renamed from: A */
    public final AccessibilityManager f3265A;

    /* renamed from: B */
    public boolean f3266B;

    /* renamed from: C */
    public boolean f3267C;

    /* renamed from: D */
    public int f3268D;

    /* renamed from: E */
    public int f3269E;

    /* renamed from: F */
    public C0534h f3270F;

    /* renamed from: G */
    public EdgeEffect f3271G;

    /* renamed from: H */
    public EdgeEffect f3272H;

    /* renamed from: I */
    public EdgeEffect f3273I;

    /* renamed from: J */
    public EdgeEffect f3274J;

    /* renamed from: K */
    public AbstractC0535i f3275K;

    /* renamed from: L */
    public int f3276L;

    /* renamed from: M */
    public int f3277M;

    /* renamed from: N */
    public VelocityTracker f3278N;

    /* renamed from: O */
    public int f3279O;

    /* renamed from: P */
    public int f3280P;

    /* renamed from: Q */
    public int f3281Q;

    /* renamed from: R */
    public int f3282R;

    /* renamed from: S */
    public int f3283S;

    /* renamed from: T */
    public AbstractC0540n f3284T;

    /* renamed from: U */
    public final int f3285U;

    /* renamed from: V */
    public final int f3286V;

    /* renamed from: W */
    public float f3287W;

    /* renamed from: a0 */
    public float f3288a0;

    /* renamed from: b */
    public final C0546t f3289b;

    /* renamed from: b0 */
    public boolean f3290b0;

    /* renamed from: c */
    public final C0544r f3291c;

    /* renamed from: c0 */
    public final RunnableC0551y f3292c0;

    /* renamed from: d */
    public C0547u f3293d;

    /* renamed from: d0 */
    public RunnableC0390m f3294d0;

    /* renamed from: e */
    public C0376a f3295e;

    /* renamed from: e0 */
    public RunnableC0390m.b f3296e0;

    /* renamed from: f */
    public C0378b f3297f;

    /* renamed from: f0 */
    public final C0549w f3298f0;

    /* renamed from: g */
    public final C0379b0 f3299g;

    /* renamed from: g0 */
    public AbstractC0542p f3300g0;

    /* renamed from: h */
    public boolean f3301h;

    /* renamed from: h0 */
    public List<AbstractC0542p> f3302h0;

    /* renamed from: i */
    public final Rect f3303i;

    /* renamed from: i0 */
    public boolean f3304i0;

    /* renamed from: j */
    public final Rect f3305j;

    /* renamed from: j0 */
    public boolean f3306j0;

    /* renamed from: k */
    public final RectF f3307k;

    /* renamed from: k0 */
    public AbstractC0535i.b f3308k0;

    /* renamed from: l */
    public AbstractC0530d f3309l;

    /* renamed from: l0 */
    public boolean f3310l0;

    /* renamed from: m */
    public AbstractC0538l f3311m;

    /* renamed from: m0 */
    public C0400w f3312m0;

    /* renamed from: n */
    public InterfaceC0545s f3313n;

    /* renamed from: n0 */
    public InterfaceC0533g f3314n0;

    /* renamed from: o */
    public final ArrayList<AbstractC0537k> f3315o;

    /* renamed from: o0 */
    public final int[] f3316o0;

    /* renamed from: p */
    public final ArrayList<InterfaceC0541o> f3317p;

    /* renamed from: p0 */
    public C0258g f3318p0;

    /* renamed from: q */
    public InterfaceC0541o f3319q;

    /* renamed from: q0 */
    public final int[] f3320q0;

    /* renamed from: r */
    public boolean f3321r;

    /* renamed from: r0 */
    public final int[] f3322r0;

    /* renamed from: s */
    public boolean f3323s;

    /* renamed from: s0 */
    public final int[] f3324s0;

    /* renamed from: t */
    public boolean f3325t;

    /* renamed from: t0 */
    public final List<AbstractC0552z> f3326t0;

    /* renamed from: u */
    public boolean f3327u;

    /* renamed from: u0 */
    public Runnable f3328u0;

    /* renamed from: v */
    public int f3329v;

    /* renamed from: v0 */
    public final C0379b0.b f3330v0;

    /* renamed from: w */
    public boolean f3331w;

    /* renamed from: x */
    public boolean f3332x;

    /* renamed from: y */
    public boolean f3333y;

    /* renamed from: z */
    public int f3334z;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC0527a implements Runnable {
        public RunnableC0527a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0535i abstractC0535i = RecyclerView.this.f3275K;
            if (abstractC0535i != null) {
                C0388k c0388k = (C0388k) abstractC0535i;
                boolean z = !c0388k.f2245h.isEmpty();
                boolean z2 = !c0388k.f2247j.isEmpty();
                boolean z3 = !c0388k.f2248k.isEmpty();
                boolean z4 = !c0388k.f2246i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<AbstractC0552z> it = c0388k.f2245h.iterator();
                    while (it.hasNext()) {
                        AbstractC0552z next = it.next();
                        View view = next.f3428a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0388k.f2254q.add(next);
                        viewPropertyAnimatorAnimate.setDuration(c0388k.f3342d).alpha(0.0f).setListener(new C0383f(c0388k, next, viewPropertyAnimatorAnimate, view)).start();
                    }
                    c0388k.f2245h.clear();
                    if (z2) {
                        ArrayList<C0388k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(c0388k.f2247j);
                        c0388k.f2250m.add(arrayList);
                        c0388k.f2247j.clear();
                        RunnableC0380c runnableC0380c = new RunnableC0380c(c0388k, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).f2262a.f3428a;
                            long j = c0388k.f3342d;
                            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                            view2.postOnAnimationDelayed(runnableC0380c, j);
                        } else {
                            runnableC0380c.run();
                        }
                    }
                    if (z3) {
                        ArrayList<C0388k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(c0388k.f2248k);
                        c0388k.f2251n.add(arrayList2);
                        c0388k.f2248k.clear();
                        RunnableC0381d runnableC0381d = new RunnableC0381d(c0388k, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).f2256a.f3428a;
                            long j2 = c0388k.f3342d;
                            WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                            view3.postOnAnimationDelayed(runnableC0381d, j2);
                        } else {
                            runnableC0381d.run();
                        }
                    }
                    if (z4) {
                        ArrayList<AbstractC0552z> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(c0388k.f2246i);
                        c0388k.f2249l.add(arrayList3);
                        c0388k.f2246i.clear();
                        RunnableC0382e runnableC0382e = new RunnableC0382e(c0388k, arrayList3);
                        if (z || z2 || z3) {
                            long jMax = Math.max(z2 ? c0388k.f3343e : 0L, z3 ? c0388k.f3344f : 0L) + (z ? c0388k.f3342d : 0L);
                            View view4 = arrayList3.get(0).f3428a;
                            WeakHashMap<View, C0273v> weakHashMap3 = C0266o.f1616a;
                            view4.postOnAnimationDelayed(runnableC0382e, jMax);
                        } else {
                            runnableC0382e.run();
                        }
                    }
                }
            }
            RecyclerView.this.f3310l0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public static class InterpolatorC0528b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C0529c implements C0379b0.b {
        public C0529c() {
        }

        /* renamed from: a */
        public void m1889a(AbstractC0552z abstractC0552z, AbstractC0535i.c cVar, AbstractC0535i.c cVar2) {
            boolean zMo1357i;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            abstractC0552z.m2017s(false);
            AbstractC0401x abstractC0401x = (AbstractC0401x) recyclerView.f3275K;
            Objects.requireNonNull(abstractC0401x);
            if (cVar == null || ((i = cVar.f3345a) == (i2 = cVar2.f3345a) && cVar.f3346b == cVar2.f3346b)) {
                C0388k c0388k = (C0388k) abstractC0401x;
                c0388k.m1362n(abstractC0552z);
                abstractC0552z.f3428a.setAlpha(0.0f);
                c0388k.f2246i.add(abstractC0552z);
                zMo1357i = true;
            } else {
                zMo1357i = abstractC0401x.mo1357i(abstractC0552z, i, cVar.f3346b, i2, cVar2.f3346b);
            }
            if (zMo1357i) {
                recyclerView.m1850Z();
            }
        }

        /* renamed from: b */
        public void m1890b(AbstractC0552z abstractC0552z, AbstractC0535i.c cVar, AbstractC0535i.c cVar2) {
            boolean zMo1357i;
            RecyclerView.this.f3291c.m1986l(abstractC0552z);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m1856f(abstractC0552z);
            abstractC0552z.m2017s(false);
            AbstractC0401x abstractC0401x = (AbstractC0401x) recyclerView.f3275K;
            Objects.requireNonNull(abstractC0401x);
            int i = cVar.f3345a;
            int i2 = cVar.f3346b;
            View view = abstractC0552z.f3428a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f3345a;
            int top = cVar2 == null ? view.getTop() : cVar2.f3346b;
            if (abstractC0552z.m2010l() || (i == left && i2 == top)) {
                C0388k c0388k = (C0388k) abstractC0401x;
                c0388k.m1362n(abstractC0552z);
                c0388k.f2245h.add(abstractC0552z);
                zMo1357i = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                zMo1357i = abstractC0401x.mo1357i(abstractC0552z, i, i2, left, top);
            }
            if (zMo1357i) {
                recyclerView.m1850Z();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public static abstract class AbstractC0530d<VH extends AbstractC0552z> {

        /* renamed from: a */
        public final C0531e f3337a = new C0531e();

        /* renamed from: b */
        public boolean f3338b = false;

        /* renamed from: a */
        public abstract int mo1891a();

        /* renamed from: b */
        public long mo1892b(int i) {
            return -1L;
        }

        /* renamed from: c */
        public abstract void mo1893c(VH vh, int i);

        /* renamed from: d */
        public abstract VH mo1894d(ViewGroup viewGroup, int i);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static class C0531e extends Observable<AbstractC0532f> {
        /* renamed from: a */
        public boolean m1895a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m1896b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0532f) ((Observable) this).mObservers.get(size)).mo1897a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static abstract class AbstractC0532f {
        /* renamed from: a */
        public void mo1897a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public interface InterfaceC0533g {
        /* renamed from: a */
        int m1898a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0534h {
        /* renamed from: a */
        public EdgeEffect m1899a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC0535i {

        /* renamed from: a */
        public b f3339a = null;

        /* renamed from: b */
        public ArrayList<a> f3340b = new ArrayList<>();

        /* renamed from: c */
        public long f3341c = 120;

        /* renamed from: d */
        public long f3342d = 120;

        /* renamed from: e */
        public long f3343e = 250;

        /* renamed from: f */
        public long f3344f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$a */
        public interface a {
            /* renamed from: a */
            void m1904a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$b */
        public interface b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$c */
        public static class c {

            /* renamed from: a */
            public int f3345a;

            /* renamed from: b */
            public int f3346b;
        }

        /* renamed from: b */
        public static int m1900b(AbstractC0552z abstractC0552z) {
            int i = abstractC0552z.f3437j & 14;
            if (abstractC0552z.m2008j()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = abstractC0552z.f3431d;
            RecyclerView recyclerView = abstractC0552z.f3445r;
            int iM1833H = recyclerView == null ? -1 : recyclerView.m1833H(abstractC0552z);
            return (i2 == -1 || iM1833H == -1 || i2 == iM1833H) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo1416a(AbstractC0552z abstractC0552z, AbstractC0552z abstractC0552z2, c cVar, c cVar2);

        /* renamed from: c */
        public final void m1901c(AbstractC0552z abstractC0552z) {
            b bVar = this.f3339a;
            if (bVar != null) {
                C0536j c0536j = (C0536j) bVar;
                Objects.requireNonNull(c0536j);
                boolean z = true;
                abstractC0552z.m2017s(true);
                if (abstractC0552z.f3435h != null && abstractC0552z.f3436i == null) {
                    abstractC0552z.f3435h = null;
                }
                abstractC0552z.f3436i = null;
                if ((abstractC0552z.f3437j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = abstractC0552z.f3428a;
                recyclerView.m1872n0();
                C0378b c0378b = recyclerView.f3297f;
                int iIndexOfChild = ((C0398u) c0378b.f2205a).f2341a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    c0378b.m1336m(view);
                } else if (c0378b.f2206b.m1340d(iIndexOfChild)) {
                    c0378b.f2206b.m1342f(iIndexOfChild);
                    c0378b.m1336m(view);
                    ((C0398u) c0378b.f2205a).m1409c(iIndexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
                    recyclerView.f3291c.m1986l(abstractC0552zM1821K);
                    recyclerView.f3291c.m1983i(abstractC0552zM1821K);
                }
                recyclerView.m1876p0(!z);
                if (z || !abstractC0552z.m2012n()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(abstractC0552z.f3428a, false);
            }
        }

        /* renamed from: d */
        public final void m1902d() {
            int size = this.f3340b.size();
            for (int i = 0; i < size; i++) {
                this.f3340b.get(i).m1904a();
            }
            this.f3340b.clear();
        }

        /* renamed from: e */
        public abstract void mo1354e(AbstractC0552z abstractC0552z);

        /* renamed from: f */
        public abstract void mo1355f();

        /* renamed from: g */
        public abstract boolean mo1356g();

        /* renamed from: h */
        public c m1903h(AbstractC0552z abstractC0552z) {
            c cVar = new c();
            View view = abstractC0552z.f3428a;
            cVar.f3345a = view.getLeft();
            cVar.f3346b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public class C0536j implements AbstractC0535i.b {
        public C0536j() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static abstract class AbstractC0537k {
        /* renamed from: d */
        public void mo1905d(Canvas canvas, RecyclerView recyclerView, C0549w c0549w) {
        }

        /* renamed from: e */
        public void mo1366e(Canvas canvas, RecyclerView recyclerView, C0549w c0549w) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0538l {

        /* renamed from: a */
        public C0378b f3348a;

        /* renamed from: b */
        public RecyclerView f3349b;

        /* renamed from: c */
        public final C0377a0.b f3350c;

        /* renamed from: d */
        public final C0377a0.b f3351d;

        /* renamed from: e */
        public C0377a0 f3352e;

        /* renamed from: f */
        public C0377a0 f3353f;

        /* renamed from: g */
        public AbstractC0548v f3354g;

        /* renamed from: h */
        public boolean f3355h;

        /* renamed from: i */
        public boolean f3356i;

        /* renamed from: j */
        public boolean f3357j;

        /* renamed from: k */
        public boolean f3358k;

        /* renamed from: l */
        public int f3359l;

        /* renamed from: m */
        public boolean f3360m;

        /* renamed from: n */
        public int f3361n;

        /* renamed from: o */
        public int f3362o;

        /* renamed from: p */
        public int f3363p;

        /* renamed from: q */
        public int f3364q;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public class a implements C0377a0.b {
            public a() {
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: a */
            public int mo1319a() {
                AbstractC0538l abstractC0538l = AbstractC0538l.this;
                return abstractC0538l.f3363p - abstractC0538l.m1934P();
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: b */
            public int mo1320b() {
                return AbstractC0538l.this.m1933O();
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: c */
            public int mo1321c(View view) {
                return AbstractC0538l.this.m1919G(view) + ((ViewGroup.MarginLayoutParams) ((C0539m) view.getLayoutParams())).rightMargin;
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: d */
            public int mo1322d(View view) {
                return AbstractC0538l.this.m1913D(view) - ((ViewGroup.MarginLayoutParams) ((C0539m) view.getLayoutParams())).leftMargin;
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: e */
            public View mo1323e(int i) {
                return AbstractC0538l.this.m1966x(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public class b implements C0377a0.b {
            public b() {
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: a */
            public int mo1319a() {
                AbstractC0538l abstractC0538l = AbstractC0538l.this;
                return abstractC0538l.f3364q - abstractC0538l.m1932N();
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: b */
            public int mo1320b() {
                return AbstractC0538l.this.m1936Q();
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: c */
            public int mo1321c(View view) {
                return AbstractC0538l.this.m1911B(view) + ((ViewGroup.MarginLayoutParams) ((C0539m) view.getLayoutParams())).bottomMargin;
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: d */
            public int mo1322d(View view) {
                return AbstractC0538l.this.m1921H(view) - ((ViewGroup.MarginLayoutParams) ((C0539m) view.getLayoutParams())).topMargin;
            }

            @Override // p000a.p060o.p061b.C0377a0.b
            /* renamed from: e */
            public View mo1323e(int i) {
                return AbstractC0538l.this.m1966x(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public interface c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$d */
        public static class d {

            /* renamed from: a */
            public int f3367a;

            /* renamed from: b */
            public int f3368b;

            /* renamed from: c */
            public boolean f3369c;

            /* renamed from: d */
            public boolean f3370d;
        }

        public AbstractC0538l() {
            a aVar = new a();
            this.f3350c = aVar;
            b bVar = new b();
            this.f3351d = bVar;
            this.f3352e = new C0377a0(aVar);
            this.f3353f = new C0377a0(bVar);
            this.f3355h = false;
            this.f3356i = false;
            this.f3357j = true;
            this.f3358k = true;
        }

        /* renamed from: S */
        public static d m1906S(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0375a.f2188a, i, i2);
            dVar.f3367a = typedArrayObtainStyledAttributes.getInt(0, 1);
            dVar.f3368b = typedArrayObtainStyledAttributes.getInt(10, 1);
            dVar.f3369c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            dVar.f3370d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: Y */
        public static boolean m1907Y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: h */
        public static int m1908h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m1909z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0538l.m1909z(int, int, int, int, boolean):int");
        }

        /* renamed from: A */
        public int mo1727A(C0544r c0544r, C0549w c0549w) {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView == null || recyclerView.f3309l == null || !mo1784e()) {
                return 1;
            }
            return this.f3349b.f3309l.mo1891a();
        }

        /* renamed from: A0 */
        public boolean m1910A0(RecyclerView recyclerView, View view, View view2) {
            return m1969z0(recyclerView);
        }

        /* renamed from: B */
        public int m1911B(View view) {
            return view.getBottom() + ((C0539m) view.getLayoutParams()).f3372b.bottom;
        }

        /* renamed from: B0 */
        public void mo1767B0(Parcelable parcelable) {
        }

        /* renamed from: C */
        public void m1912C(View view, Rect rect) {
            int[] iArr = RecyclerView.f3262w0;
            C0539m c0539m = (C0539m) view.getLayoutParams();
            Rect rect2 = c0539m.f3372b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0539m).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0539m).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0539m).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0539m).bottomMargin);
        }

        /* renamed from: C0 */
        public Parcelable mo1769C0() {
            return null;
        }

        /* renamed from: D */
        public int m1913D(View view) {
            return view.getLeft() - ((C0539m) view.getLayoutParams()).f3372b.left;
        }

        /* renamed from: D0 */
        public void mo1914D0(int i) {
        }

        /* renamed from: E */
        public int m1915E(View view) {
            Rect rect = ((C0539m) view.getLayoutParams()).f3372b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: E0 */
        public boolean m1916E0(int i) {
            int iM1936Q;
            int iM1933O;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                iM1936Q = recyclerView.canScrollVertically(1) ? (this.f3364q - m1936Q()) - m1932N() : 0;
                if (this.f3349b.canScrollHorizontally(1)) {
                    iM1933O = (this.f3363p - m1933O()) - m1934P();
                    i3 = iM1933O;
                    i2 = iM1936Q;
                }
                i2 = iM1936Q;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                iM1936Q = recyclerView.canScrollVertically(-1) ? -((this.f3364q - m1936Q()) - m1932N()) : 0;
                if (this.f3349b.canScrollHorizontally(-1)) {
                    iM1933O = -((this.f3363p - m1933O()) - m1934P());
                    i3 = iM1933O;
                    i2 = iM1936Q;
                }
                i2 = iM1936Q;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f3349b.m1868l0(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: F */
        public int m1917F(View view) {
            Rect rect = ((C0539m) view.getLayoutParams()).f3372b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: F0 */
        public boolean m1918F0() {
            return false;
        }

        /* renamed from: G */
        public int m1919G(View view) {
            return view.getRight() + ((C0539m) view.getLayoutParams()).f3372b.right;
        }

        /* renamed from: G0 */
        public void m1920G0(C0544r c0544r) {
            for (int iM1967y = m1967y() - 1; iM1967y >= 0; iM1967y--) {
                if (!RecyclerView.m1821K(m1966x(iM1967y)).m2018t()) {
                    m1926J0(iM1967y, c0544r);
                }
            }
        }

        /* renamed from: H */
        public int m1921H(View view) {
            return view.getTop() - ((C0539m) view.getLayoutParams()).f3372b.top;
        }

        /* renamed from: H0 */
        public void m1922H0(C0544r c0544r) {
            int size = c0544r.f3381a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = c0544r.f3381a.get(i).f3428a;
                AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
                if (!abstractC0552zM1821K.m2018t()) {
                    abstractC0552zM1821K.m2017s(false);
                    if (abstractC0552zM1821K.m2012n()) {
                        this.f3349b.removeDetachedView(view, false);
                    }
                    AbstractC0535i abstractC0535i = this.f3349b.f3275K;
                    if (abstractC0535i != null) {
                        abstractC0535i.mo1354e(abstractC0552zM1821K);
                    }
                    abstractC0552zM1821K.m2017s(true);
                    AbstractC0552z abstractC0552zM1821K2 = RecyclerView.m1821K(view);
                    abstractC0552zM1821K2.f3441n = null;
                    abstractC0552zM1821K2.f3442o = false;
                    abstractC0552zM1821K2.m2002d();
                    c0544r.m1983i(abstractC0552zM1821K2);
                }
            }
            c0544r.f3381a.clear();
            ArrayList<AbstractC0552z> arrayList = c0544r.f3382b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f3349b.invalidate();
            }
        }

        /* renamed from: I */
        public View m1923I() {
            View focusedChild;
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3348a.f2207c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: I0 */
        public void m1924I0(View view, C0544r c0544r) {
            C0378b c0378b = this.f3348a;
            int iIndexOfChild = ((C0398u) c0378b.f2205a).f2341a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c0378b.f2206b.m1342f(iIndexOfChild)) {
                    c0378b.m1336m(view);
                }
                ((C0398u) c0378b.f2205a).m1409c(iIndexOfChild);
            }
            c0544r.m1982h(view);
        }

        /* renamed from: J */
        public int m1925J() {
            RecyclerView recyclerView = this.f3349b;
            AbstractC0530d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo1891a();
            }
            return 0;
        }

        /* renamed from: J0 */
        public void m1926J0(int i, C0544r c0544r) {
            View viewM1966x = m1966x(i);
            if (m1966x(i) != null) {
                this.f3348a.m1335l(i);
            }
            c0544r.m1982h(viewM1966x);
        }

        /* renamed from: K */
        public int m1927K() {
            RecyclerView recyclerView = this.f3349b;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            return recyclerView.getLayoutDirection();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
        /* renamed from: K0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m1928K0(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.m1933O()
                int r2 = r9.m1936Q()
                int r3 = r9.f3363p
                int r4 = r9.m1934P()
                int r3 = r3 - r4
                int r4 = r9.f3364q
                int r5 = r9.m1932N()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.m1927K()
                r8 = 1
                if (r4 != r8) goto L5f
                if (r3 == 0) goto L5a
                goto L67
            L5a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L67
            L5f:
                if (r7 == 0) goto L62
                goto L66
            L62:
                int r7 = java.lang.Math.min(r5, r3)
            L66:
                r3 = r7
            L67:
                if (r2 == 0) goto L6a
                goto L6e
            L6a:
                int r2 = java.lang.Math.min(r6, r12)
            L6e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto Lb6
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L7f
                goto Lb3
            L7f:
                int r0 = r9.m1933O()
                int r2 = r9.m1936Q()
                int r3 = r9.f3363p
                int r4 = r9.m1934P()
                int r3 = r3 - r4
                int r4 = r9.f3364q
                int r5 = r9.m1932N()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.f3349b
                android.graphics.Rect r5 = r5.f3303i
                r9.m1912C(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto Lb3
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto Lb3
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto Lb3
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto Lb1
                goto Lb3
            Lb1:
                r14 = r8
                goto Lb4
            Lb3:
                r14 = r1
            Lb4:
                if (r14 == 0) goto Lbb
            Lb6:
                if (r11 != 0) goto Lbc
                if (r12 == 0) goto Lbb
                goto Lbc
            Lbb:
                return r1
            Lbc:
                if (r13 == 0) goto Lc2
                r10.scrollBy(r11, r12)
                goto Lc6
            Lc2:
                r13 = 0
                r10.m1866k0(r11, r12, r13)
            Lc6:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0538l.m1928K0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: L */
        public int m1929L() {
            RecyclerView recyclerView = this.f3349b;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            return recyclerView.getMinimumHeight();
        }

        /* renamed from: L0 */
        public void m1930L0() {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: M */
        public int m1931M() {
            RecyclerView recyclerView = this.f3349b;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            return recyclerView.getMinimumWidth();
        }

        /* renamed from: M0 */
        public int mo1733M0(int i, C0544r c0544r, C0549w c0549w) {
            return 0;
        }

        /* renamed from: N */
        public int m1932N() {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: N0 */
        public void mo1775N0(int i) {
        }

        /* renamed from: O */
        public int m1933O() {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: O0 */
        public int mo1736O0(int i, C0544r c0544r, C0549w c0549w) {
            return 0;
        }

        /* renamed from: P */
        public int m1934P() {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: P0 */
        public void m1935P0(RecyclerView recyclerView) {
            m1937Q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: Q */
        public int m1936Q() {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: Q0 */
        public void m1937Q0(int i, int i2) {
            this.f3363p = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3361n = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.f3262w0;
            }
            this.f3364q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3362o = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.f3262w0;
            }
        }

        /* renamed from: R */
        public int m1938R(View view) {
            return ((C0539m) view.getLayoutParams()).m1970a();
        }

        /* renamed from: R0 */
        public void mo1740R0(Rect rect, int i, int i2) {
            int iM1934P = m1934P() + m1933O() + rect.width();
            int iM1932N = m1932N() + m1936Q() + rect.height();
            this.f3349b.setMeasuredDimension(m1908h(i, iM1934P, m1931M()), m1908h(i2, iM1932N, m1929L()));
        }

        /* renamed from: S0 */
        public void m1939S0(int i, int i2) {
            int iM1967y = m1967y();
            if (iM1967y == 0) {
                this.f3349b.m1873o(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < iM1967y; i7++) {
                View viewM1966x = m1966x(i7);
                Rect rect = this.f3349b.f3303i;
                m1912C(viewM1966x, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f3349b.f3303i.set(i4, i5, i3, i6);
            mo1740R0(this.f3349b.f3303i, i, i2);
        }

        /* renamed from: T */
        public int mo1742T(C0544r c0544r, C0549w c0549w) {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView == null || recyclerView.f3309l == null || !mo1786f()) {
                return 1;
            }
            return this.f3349b.f3309l.mo1891a();
        }

        /* renamed from: T0 */
        public void m1940T0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f3349b = null;
                this.f3348a = null;
                height = 0;
                this.f3363p = 0;
            } else {
                this.f3349b = recyclerView;
                this.f3348a = recyclerView.f3297f;
                this.f3363p = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f3364q = height;
            this.f3361n = 1073741824;
            this.f3362o = 1073741824;
        }

        /* renamed from: U */
        public int m1941U() {
            return 0;
        }

        /* renamed from: U0 */
        public boolean m1942U0(View view, int i, int i2, C0539m c0539m) {
            return (!view.isLayoutRequested() && this.f3357j && m1907Y(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0539m).width) && m1907Y(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0539m).height)) ? false : true;
        }

        /* renamed from: V */
        public void m1943V(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0539m) view.getLayoutParams()).f3372b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3349b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3349b.f3307k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: V0 */
        public boolean mo1776V0() {
            return false;
        }

        /* renamed from: W */
        public boolean mo1777W() {
            return false;
        }

        /* renamed from: W0 */
        public boolean m1944W0(View view, int i, int i2, C0539m c0539m) {
            return (this.f3357j && m1907Y(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0539m).width) && m1907Y(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0539m).height)) ? false : true;
        }

        /* renamed from: X */
        public boolean m1945X() {
            return false;
        }

        /* renamed from: X0 */
        public void mo1778X0(RecyclerView recyclerView, C0549w c0549w, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: Y0 */
        public void m1946Y0(AbstractC0548v abstractC0548v) {
            AbstractC0548v abstractC0548v2 = this.f3354g;
            if (abstractC0548v2 != null && abstractC0548v != abstractC0548v2 && abstractC0548v2.f3395e) {
                abstractC0548v2.m1991d();
            }
            this.f3354g = abstractC0548v;
            RecyclerView recyclerView = this.f3349b;
            Objects.requireNonNull(abstractC0548v);
            recyclerView.f3292c0.m1998c();
            if (abstractC0548v.f3398h) {
                StringBuilder sbM2079g = C0561a.m2079g("An instance of ");
                sbM2079g.append(abstractC0548v.getClass().getSimpleName());
                sbM2079g.append(" was started more than once. Each instance of");
                sbM2079g.append(abstractC0548v.getClass().getSimpleName());
                sbM2079g.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", sbM2079g.toString());
            }
            abstractC0548v.f3392b = recyclerView;
            abstractC0548v.f3393c = this;
            int i = abstractC0548v.f3391a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f3298f0.f3406a = i;
            abstractC0548v.f3395e = true;
            abstractC0548v.f3394d = true;
            abstractC0548v.f3396f = recyclerView.f3311m.mo1806t(i);
            abstractC0548v.f3392b.f3292c0.m1996a();
            abstractC0548v.f3398h = true;
        }

        /* renamed from: Z */
        public boolean m1947Z(View view, boolean z) {
            boolean z2 = this.f3352e.m1316b(view, 24579) && this.f3353f.m1316b(view, 24579);
            return z ? z2 : !z2;
        }

        /* renamed from: Z0 */
        public boolean mo1743Z0() {
            return false;
        }

        /* renamed from: a0 */
        public void m1948a0(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C0539m) view.getLayoutParams()).f3372b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: b */
        public void m1949b(View view) {
            m1951c(view, -1, false);
        }

        /* renamed from: b0 */
        public void m1950b0(View view, int i, int i2, int i3, int i4) {
            C0539m c0539m = (C0539m) view.getLayoutParams();
            Rect rect = c0539m.f3372b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0539m).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0539m).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0539m).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0539m).bottomMargin);
        }

        /* renamed from: c */
        public final void m1951c(View view, int i, boolean z) {
            AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
            if (z || abstractC0552zM1821K.m2010l()) {
                this.f3349b.f3299g.m1345a(abstractC0552zM1821K);
            } else {
                this.f3349b.f3299g.m1350f(abstractC0552zM1821K);
            }
            C0539m c0539m = (C0539m) view.getLayoutParams();
            if (abstractC0552zM1821K.m2019u() || abstractC0552zM1821K.m2011m()) {
                if (abstractC0552zM1821K.m2011m()) {
                    abstractC0552zM1821K.f3441n.m1986l(abstractC0552zM1821K);
                } else {
                    abstractC0552zM1821K.m2002d();
                }
                this.f3348a.m1325b(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f3349b) {
                    int iM1333j = this.f3348a.m1333j(view);
                    if (i == -1) {
                        i = this.f3348a.m1328e();
                    }
                    if (iM1333j == -1) {
                        StringBuilder sbM2079g = C0561a.m2079g("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sbM2079g.append(this.f3349b.indexOfChild(view));
                        throw new IllegalStateException(C0561a.m2074b(this.f3349b, sbM2079g));
                    }
                    if (iM1333j != i) {
                        AbstractC0538l abstractC0538l = this.f3349b.f3311m;
                        View viewM1966x = abstractC0538l.m1966x(iM1333j);
                        if (viewM1966x == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM1333j + abstractC0538l.f3349b.toString());
                        }
                        abstractC0538l.m1966x(iM1333j);
                        abstractC0538l.m1963r(iM1333j);
                        C0539m c0539m2 = (C0539m) viewM1966x.getLayoutParams();
                        AbstractC0552z abstractC0552zM1821K2 = RecyclerView.m1821K(viewM1966x);
                        if (abstractC0552zM1821K2.m2010l()) {
                            abstractC0538l.f3349b.f3299g.m1345a(abstractC0552zM1821K2);
                        } else {
                            abstractC0538l.f3349b.f3299g.m1350f(abstractC0552zM1821K2);
                        }
                        abstractC0538l.f3348a.m1325b(viewM1966x, i, c0539m2, abstractC0552zM1821K2.m2010l());
                    }
                } else {
                    this.f3348a.m1324a(view, i, false);
                    c0539m.f3373c = true;
                    AbstractC0548v abstractC0548v = this.f3354g;
                    if (abstractC0548v != null && abstractC0548v.f3395e) {
                        Objects.requireNonNull(abstractC0548v.f3392b);
                        AbstractC0552z abstractC0552zM1821K3 = RecyclerView.m1821K(view);
                        if ((abstractC0552zM1821K3 != null ? abstractC0552zM1821K3.m2003e() : -1) == abstractC0548v.f3391a) {
                            abstractC0548v.f3396f = view;
                        }
                    }
                }
            }
            if (c0539m.f3374d) {
                abstractC0552zM1821K.f3428a.invalidate();
                c0539m.f3374d = false;
            }
        }

        /* renamed from: c0 */
        public void m1952c0(View view, int i, int i2) {
            C0539m c0539m = (C0539m) view.getLayoutParams();
            Rect rectM1836L = this.f3349b.m1836L(view);
            int i3 = rectM1836L.left + rectM1836L.right + i;
            int i4 = rectM1836L.top + rectM1836L.bottom + i2;
            int iM1909z = m1909z(this.f3363p, this.f3361n, m1934P() + m1933O() + ((ViewGroup.MarginLayoutParams) c0539m).leftMargin + ((ViewGroup.MarginLayoutParams) c0539m).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0539m).width, mo1784e());
            int iM1909z2 = m1909z(this.f3364q, this.f3362o, m1932N() + m1936Q() + ((ViewGroup.MarginLayoutParams) c0539m).topMargin + ((ViewGroup.MarginLayoutParams) c0539m).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0539m).height, mo1786f());
            if (m1942U0(view, iM1909z, iM1909z2, c0539m)) {
                view.measure(iM1909z, iM1909z2);
            }
        }

        /* renamed from: d */
        public void mo1782d(String str) {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                recyclerView.m1862i(str);
            }
        }

        /* renamed from: d0 */
        public void mo1953d0(int i) {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                int iM1328e = recyclerView.f3297f.m1328e();
                for (int i2 = 0; i2 < iM1328e; i2++) {
                    recyclerView.f3297f.m1327d(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: e */
        public boolean mo1784e() {
            return false;
        }

        /* renamed from: e0 */
        public void mo1954e0(int i) {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView != null) {
                int iM1328e = recyclerView.f3297f.m1328e();
                for (int i2 = 0; i2 < iM1328e; i2++) {
                    recyclerView.f3297f.m1327d(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* renamed from: f */
        public boolean mo1786f() {
            return false;
        }

        /* renamed from: f0 */
        public void mo1955f0(AbstractC0530d abstractC0530d, AbstractC0530d abstractC0530d2) {
        }

        /* renamed from: g */
        public boolean mo1745g(C0539m c0539m) {
            return c0539m != null;
        }

        /* renamed from: g0 */
        public boolean mo1956g0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: h0 */
        public void m1957h0() {
        }

        /* renamed from: i */
        public void mo1790i(int i, int i2, C0549w c0549w, c cVar) {
        }

        @Deprecated
        /* renamed from: i0 */
        public void m1958i0() {
        }

        /* renamed from: j */
        public void mo1792j(int i, c cVar) {
        }

        /* renamed from: j0 */
        public void mo1793j0(RecyclerView recyclerView, C0544r c0544r) {
            m1958i0();
        }

        /* renamed from: k */
        public int mo1795k(C0549w c0549w) {
            return 0;
        }

        /* renamed from: k0 */
        public View mo1746k0(View view, int i, C0544r c0544r, C0549w c0549w) {
            return null;
        }

        /* renamed from: l */
        public int mo1747l(C0549w c0549w) {
            return 0;
        }

        /* renamed from: l0 */
        public void mo1797l0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3349b;
            C0544r c0544r = recyclerView.f3291c;
            C0549w c0549w = recyclerView.f3298f0;
            m1959m0(accessibilityEvent);
        }

        /* renamed from: m */
        public int mo1748m(C0549w c0549w) {
            return 0;
        }

        /* renamed from: m0 */
        public void m1959m0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3349b.canScrollVertically(-1) && !this.f3349b.canScrollHorizontally(-1) && !this.f3349b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0530d abstractC0530d = this.f3349b.f3309l;
            if (abstractC0530d != null) {
                accessibilityEvent.setItemCount(abstractC0530d.mo1891a());
            }
        }

        /* renamed from: n */
        public int mo1800n(C0549w c0549w) {
            return 0;
        }

        /* renamed from: n0 */
        public void m1960n0(View view, C0245b c0245b) {
            AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
            if (abstractC0552zM1821K == null || abstractC0552zM1821K.m2010l() || this.f3348a.m1334k(abstractC0552zM1821K.f3428a)) {
                return;
            }
            RecyclerView recyclerView = this.f3349b;
            mo1750o0(recyclerView.f3291c, recyclerView.f3298f0, view, c0245b);
        }

        /* renamed from: o */
        public int mo1749o(C0549w c0549w) {
            return 0;
        }

        /* renamed from: o0 */
        public void mo1750o0(C0544r c0544r, C0549w c0549w, View view, C0245b c0245b) {
            c0245b.m825j(C0245b.c.m828a(mo1786f() ? m1938R(view) : 0, 1, mo1784e() ? m1938R(view) : 0, 1, false, false));
        }

        /* renamed from: p */
        public int mo1751p(C0549w c0549w) {
            return 0;
        }

        /* renamed from: p0 */
        public View m1961p0() {
            return null;
        }

        /* renamed from: q */
        public void m1962q(C0544r c0544r) {
            for (int iM1967y = m1967y() - 1; iM1967y >= 0; iM1967y--) {
                View viewM1966x = m1966x(iM1967y);
                AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(viewM1966x);
                if (!abstractC0552zM1821K.m2018t()) {
                    if (!abstractC0552zM1821K.m2008j() || abstractC0552zM1821K.m2010l() || this.f3349b.f3309l.f3338b) {
                        m1966x(iM1967y);
                        m1963r(iM1967y);
                        c0544r.m1984j(viewM1966x);
                        this.f3349b.f3299g.m1350f(abstractC0552zM1821K);
                    } else {
                        if (m1966x(iM1967y) != null) {
                            this.f3348a.m1335l(iM1967y);
                        }
                        c0544r.m1983i(abstractC0552zM1821K);
                    }
                }
            }
        }

        /* renamed from: q0 */
        public void mo1752q0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: r */
        public final void m1963r(int i) {
            this.f3348a.m1326c(i);
        }

        /* renamed from: r0 */
        public void mo1754r0(RecyclerView recyclerView) {
        }

        /* renamed from: s */
        public View m1964s(View view) {
            View viewM1829C;
            RecyclerView recyclerView = this.f3349b;
            if (recyclerView == null || (viewM1829C = recyclerView.m1829C(view)) == null || this.f3348a.f2207c.contains(viewM1829C)) {
                return null;
            }
            return viewM1829C;
        }

        /* renamed from: s0 */
        public void mo1755s0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: t */
        public View mo1806t(int i) {
            int iM1967y = m1967y();
            for (int i2 = 0; i2 < iM1967y; i2++) {
                View viewM1966x = m1966x(i2);
                AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(viewM1966x);
                if (abstractC0552zM1821K != null && abstractC0552zM1821K.m2003e() == i && !abstractC0552zM1821K.m2018t() && (this.f3349b.f3298f0.f3412g || !abstractC0552zM1821K.m2010l())) {
                    return viewM1966x;
                }
            }
            return null;
        }

        /* renamed from: t0 */
        public void mo1756t0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: u */
        public abstract C0539m mo1757u();

        /* renamed from: u0 */
        public void m1965u0() {
        }

        /* renamed from: v */
        public C0539m mo1758v(Context context, AttributeSet attributeSet) {
            return new C0539m(context, attributeSet);
        }

        /* renamed from: v0 */
        public void mo1759v0(RecyclerView recyclerView, int i, int i2, Object obj) {
            m1965u0();
        }

        /* renamed from: w */
        public C0539m mo1760w(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0539m ? new C0539m((C0539m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0539m((ViewGroup.MarginLayoutParams) layoutParams) : new C0539m(layoutParams);
        }

        /* renamed from: w0 */
        public void mo1761w0(C0544r c0544r, C0549w c0549w) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: x */
        public View m1966x(int i) {
            C0378b c0378b = this.f3348a;
            if (c0378b == null) {
                return null;
            }
            return ((C0398u) c0378b.f2205a).m1407a(c0378b.m1329f(i));
        }

        /* renamed from: x0 */
        public void mo1763x0(C0549w c0549w) {
        }

        /* renamed from: y */
        public int m1967y() {
            C0378b c0378b = this.f3348a;
            if (c0378b != null) {
                return c0378b.m1328e();
            }
            return 0;
        }

        /* renamed from: y0 */
        public void m1968y0(int i, int i2) {
            this.f3349b.m1873o(i, i2);
        }

        @Deprecated
        /* renamed from: z0 */
        public boolean m1969z0(RecyclerView recyclerView) {
            AbstractC0548v abstractC0548v = this.f3354g;
            return (abstractC0548v != null && abstractC0548v.f3395e) || recyclerView.m1839O();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static class C0539m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0552z f3371a;

        /* renamed from: b */
        public final Rect f3372b;

        /* renamed from: c */
        public boolean f3373c;

        /* renamed from: d */
        public boolean f3374d;

        public C0539m(int i, int i2) {
            super(i, i2);
            this.f3372b = new Rect();
            this.f3373c = true;
            this.f3374d = false;
        }

        public C0539m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3372b = new Rect();
            this.f3373c = true;
            this.f3374d = false;
        }

        public C0539m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3372b = new Rect();
            this.f3373c = true;
            this.f3374d = false;
        }

        public C0539m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3372b = new Rect();
            this.f3373c = true;
            this.f3374d = false;
        }

        public C0539m(C0539m c0539m) {
            super((ViewGroup.LayoutParams) c0539m);
            this.f3372b = new Rect();
            this.f3373c = true;
            this.f3374d = false;
        }

        /* renamed from: a */
        public int m1970a() {
            return this.f3371a.m2003e();
        }

        /* renamed from: b */
        public boolean m1971b() {
            return this.f3371a.m2013o();
        }

        /* renamed from: c */
        public boolean m1972c() {
            return this.f3371a.m2010l();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC0540n {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface InterfaceC0541o {
        /* renamed from: a */
        void mo1363a(boolean z);

        /* renamed from: b */
        boolean mo1364b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo1365c(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC0542p {
        /* renamed from: a */
        public void mo1418a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo1373b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C0543q {

        /* renamed from: a */
        public SparseArray<a> f3375a = new SparseArray<>();

        /* renamed from: b */
        public int f3376b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$q$a */
        public static class a {

            /* renamed from: a */
            public final ArrayList<AbstractC0552z> f3377a = new ArrayList<>();

            /* renamed from: b */
            public int f3378b = 5;

            /* renamed from: c */
            public long f3379c = 0;

            /* renamed from: d */
            public long f3380d = 0;
        }

        /* renamed from: a */
        public final a m1973a(int i) {
            a aVar = this.f3375a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3375a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: b */
        public long m1974b(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public final class C0544r {

        /* renamed from: a */
        public final ArrayList<AbstractC0552z> f3381a;

        /* renamed from: b */
        public ArrayList<AbstractC0552z> f3382b;

        /* renamed from: c */
        public final ArrayList<AbstractC0552z> f3383c;

        /* renamed from: d */
        public final List<AbstractC0552z> f3384d;

        /* renamed from: e */
        public int f3385e;

        /* renamed from: f */
        public int f3386f;

        /* renamed from: g */
        public C0543q f3387g;

        public C0544r() {
            ArrayList<AbstractC0552z> arrayList = new ArrayList<>();
            this.f3381a = arrayList;
            this.f3382b = null;
            this.f3383c = new ArrayList<>();
            this.f3384d = Collections.unmodifiableList(arrayList);
            this.f3385e = 2;
            this.f3386f = 2;
        }

        /* renamed from: a */
        public void m1975a(AbstractC0552z abstractC0552z, boolean z) {
            RecyclerView.m1826k(abstractC0552z);
            View view = abstractC0552z.f3428a;
            C0400w c0400w = RecyclerView.this.f3312m0;
            if (c0400w != null) {
                C0400w.a aVar = c0400w.f2344e;
                C0266o.m875n(view, aVar instanceof C0400w.a ? aVar.f2346e.remove(view) : null);
            }
            if (z) {
                InterfaceC0545s interfaceC0545s = RecyclerView.this.f3313n;
                if (interfaceC0545s != null) {
                    interfaceC0545s.m1988a(abstractC0552z);
                }
                RecyclerView recyclerView = RecyclerView.this;
                AbstractC0530d abstractC0530d = recyclerView.f3309l;
                if (recyclerView.f3298f0 != null) {
                    recyclerView.f3299g.m1351g(abstractC0552z);
                }
            }
            abstractC0552z.f3445r = null;
            C0543q c0543qM1978d = m1978d();
            Objects.requireNonNull(c0543qM1978d);
            int i = abstractC0552z.f3433f;
            ArrayList<AbstractC0552z> arrayList = c0543qM1978d.m1973a(i).f3377a;
            if (c0543qM1978d.f3375a.get(i).f3378b <= arrayList.size()) {
                return;
            }
            abstractC0552z.m2015q();
            arrayList.add(abstractC0552z);
        }

        /* renamed from: b */
        public void m1976b() {
            this.f3381a.clear();
            m1980f();
        }

        /* renamed from: c */
        public int m1977c(int i) {
            if (i >= 0 && i < RecyclerView.this.f3298f0.m1995b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.f3298f0.f3412g ? i : recyclerView.f3295e.m1307f(i, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.f3298f0.m1995b());
            throw new IndexOutOfBoundsException(C0561a.m2074b(RecyclerView.this, sb));
        }

        /* renamed from: d */
        public C0543q m1978d() {
            if (this.f3387g == null) {
                this.f3387g = new C0543q();
            }
            return this.f3387g;
        }

        /* renamed from: e */
        public View m1979e(int i) {
            return m1985k(i, false, Long.MAX_VALUE).f3428a;
        }

        /* renamed from: f */
        public void m1980f() {
            for (int size = this.f3383c.size() - 1; size >= 0; size--) {
                m1981g(size);
            }
            this.f3383c.clear();
            int[] iArr = RecyclerView.f3262w0;
            RunnableC0390m.b bVar = RecyclerView.this.f3296e0;
            int[] iArr2 = bVar.f2311c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2312d = 0;
        }

        /* renamed from: g */
        public void m1981g(int i) {
            m1975a(this.f3383c.get(i), true);
            this.f3383c.remove(i);
        }

        /* renamed from: h */
        public void m1982h(View view) {
            AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(view);
            if (abstractC0552zM1821K.m2012n()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (abstractC0552zM1821K.m2011m()) {
                abstractC0552zM1821K.f3441n.m1986l(abstractC0552zM1821K);
            } else if (abstractC0552zM1821K.m2019u()) {
                abstractC0552zM1821K.m2002d();
            }
            m1983i(abstractC0552zM1821K);
            if (RecyclerView.this.f3275K == null || abstractC0552zM1821K.m2009k()) {
                return;
            }
            RecyclerView.this.f3275K.mo1354e(abstractC0552zM1821K);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m1983i(androidx.recyclerview.widget.RecyclerView.AbstractC0552z r7) {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0544r.m1983i(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m1984j(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$z r5 = androidx.recyclerview.widget.RecyclerView.m1821K(r5)
                r0 = 12
                boolean r0 = r5.m2005g(r0)
                r1 = 0
                if (r0 != 0) goto L55
                boolean r0 = r5.m2013o()
                if (r0 == 0) goto L55
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r0 = r0.f3275K
                r2 = 1
                if (r0 == 0) goto L3f
                java.util.List r3 = r5.m2004f()
                a.o.b.k r0 = (p000a.p060o.p061b.C0388k) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L39
                boolean r0 = r0.f2347g
                if (r0 == 0) goto L33
                boolean r0 = r5.m2008j()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = r1
                goto L34
            L33:
                r0 = r2
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = r1
                goto L3a
            L39:
                r0 = r2
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = r1
                goto L40
            L3f:
                r0 = r2
            L40:
                if (r0 == 0) goto L43
                goto L55
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f3382b
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f3382b = r0
            L4e:
                r5.f3441n = r4
                r5.f3442o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f3382b
                goto L82
            L55:
                boolean r0 = r5.m2008j()
                if (r0 == 0) goto L7c
                boolean r0 = r5.m2010l()
                if (r0 != 0) goto L7c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r0 = r0.f3309l
                boolean r0 = r0.f3338b
                if (r0 == 0) goto L6a
                goto L7c
            L6a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = p070b.p071a.p072a.p073a.C0561a.m2079g(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p070b.p071a.p072a.p073a.C0561a.m2074b(r1, r0)
                r5.<init>(r0)
                throw r5
            L7c:
                r5.f3441n = r4
                r5.f3442o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f3381a
            L82:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0544r.m1984j(android.view.View):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x033a  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x040f  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0433  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0439  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0532  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x0539  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0555 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0189  */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0552z m1985k(int r16, boolean r17, long r18) {
            /*
                Method dump skipped, instructions count: 1420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0544r.m1985k(int, boolean, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        /* renamed from: l */
        public void m1986l(AbstractC0552z abstractC0552z) {
            (abstractC0552z.f3442o ? this.f3382b : this.f3381a).remove(abstractC0552z);
            abstractC0552z.f3441n = null;
            abstractC0552z.f3442o = false;
            abstractC0552z.m2002d();
        }

        /* renamed from: m */
        public void m1987m() {
            AbstractC0538l abstractC0538l = RecyclerView.this.f3311m;
            this.f3386f = this.f3385e + (abstractC0538l != null ? abstractC0538l.f3359l : 0);
            for (int size = this.f3383c.size() - 1; size >= 0 && this.f3383c.size() > this.f3386f; size--) {
                m1981g(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC0545s {
        /* renamed from: a */
        void m1988a(AbstractC0552z abstractC0552z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public class C0546t extends AbstractC0532f {
        public C0546t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0532f
        /* renamed from: a */
        public void mo1897a() {
            RecyclerView.this.m1862i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3298f0.f3411f = true;
            recyclerView.m1852b0(true);
            if (RecyclerView.this.f3295e.m1308g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0547u extends AbstractC0287a {
        public static final Parcelable.Creator<C0547u> CREATOR = new a();

        /* renamed from: d */
        public Parcelable f3390d;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0547u> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0547u(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0547u[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0547u createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0547u(parcel, classLoader);
            }
        }

        public C0547u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3390d = parcel.readParcelable(classLoader == null ? AbstractC0538l.class.getClassLoader() : classLoader);
        }

        public C0547u(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeParcelable(this.f3390d, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static abstract class AbstractC0548v {

        /* renamed from: b */
        public RecyclerView f3392b;

        /* renamed from: c */
        public AbstractC0538l f3393c;

        /* renamed from: d */
        public boolean f3394d;

        /* renamed from: e */
        public boolean f3395e;

        /* renamed from: f */
        public View f3396f;

        /* renamed from: h */
        public boolean f3398h;

        /* renamed from: a */
        public int f3391a = -1;

        /* renamed from: g */
        public final a f3397g = new a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class a {

            /* renamed from: a */
            public int f3399a;

            /* renamed from: b */
            public int f3400b;

            /* renamed from: d */
            public int f3402d = -1;

            /* renamed from: f */
            public boolean f3404f = false;

            /* renamed from: g */
            public int f3405g = 0;

            /* renamed from: c */
            public int f3401c = Integer.MIN_VALUE;

            /* renamed from: e */
            public Interpolator f3403e = null;

            public a(int i, int i2) {
                this.f3399a = i;
                this.f3400b = i2;
            }

            /* renamed from: a */
            public void m1992a(RecyclerView recyclerView) {
                int i = this.f3402d;
                if (i >= 0) {
                    this.f3402d = -1;
                    recyclerView.m1840P(i);
                    this.f3404f = false;
                    return;
                }
                if (!this.f3404f) {
                    this.f3405g = 0;
                    return;
                }
                Interpolator interpolator = this.f3403e;
                if (interpolator != null && this.f3401c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f3401c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.f3292c0.m1997b(this.f3399a, this.f3400b, i2, interpolator);
                int i3 = this.f3405g + 1;
                this.f3405g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f3404f = false;
            }

            /* renamed from: b */
            public void m1993b(int i, int i2, int i3, Interpolator interpolator) {
                this.f3399a = i;
                this.f3400b = i2;
                this.f3401c = i3;
                this.f3403e = interpolator;
                this.f3404f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$b */
        public interface b {
            /* renamed from: a */
            PointF mo1779a(int i);
        }

        /* renamed from: a */
        public PointF m1989a(int i) {
            Object obj = this.f3393c;
            if (obj instanceof b) {
                return ((b) obj).mo1779a(i);
            }
            StringBuilder sbM2079g = C0561a.m2079g("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sbM2079g.append(b.class.getCanonicalName());
            Log.w("RecyclerView", sbM2079g.toString());
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m1990b(int r8, int r9) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0548v.m1990b(int, int):void");
        }

        /* renamed from: c */
        public abstract void mo1380c(View view, C0549w c0549w, a aVar);

        /* renamed from: d */
        public final void m1991d() {
            if (this.f3395e) {
                this.f3395e = false;
                C0392o c0392o = (C0392o) this;
                c0392o.f2334p = 0;
                c0392o.f2333o = 0;
                c0392o.f2329k = null;
                this.f3392b.f3298f0.f3406a = -1;
                this.f3396f = null;
                this.f3391a = -1;
                this.f3394d = false;
                AbstractC0538l abstractC0538l = this.f3393c;
                if (abstractC0538l.f3354g == this) {
                    abstractC0538l.f3354g = null;
                }
                this.f3393c = null;
                this.f3392b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C0549w {

        /* renamed from: a */
        public int f3406a = -1;

        /* renamed from: b */
        public int f3407b = 0;

        /* renamed from: c */
        public int f3408c = 0;

        /* renamed from: d */
        public int f3409d = 1;

        /* renamed from: e */
        public int f3410e = 0;

        /* renamed from: f */
        public boolean f3411f = false;

        /* renamed from: g */
        public boolean f3412g = false;

        /* renamed from: h */
        public boolean f3413h = false;

        /* renamed from: i */
        public boolean f3414i = false;

        /* renamed from: j */
        public boolean f3415j = false;

        /* renamed from: k */
        public boolean f3416k = false;

        /* renamed from: l */
        public int f3417l;

        /* renamed from: m */
        public long f3418m;

        /* renamed from: n */
        public int f3419n;

        /* renamed from: a */
        public void m1994a(int i) {
            if ((this.f3409d & i) != 0) {
                return;
            }
            StringBuilder sbM2079g = C0561a.m2079g("Layout state should be one of ");
            sbM2079g.append(Integer.toBinaryString(i));
            sbM2079g.append(" but it is ");
            sbM2079g.append(Integer.toBinaryString(this.f3409d));
            throw new IllegalStateException(sbM2079g.toString());
        }

        /* renamed from: b */
        public int m1995b() {
            return this.f3412g ? this.f3407b - this.f3408c : this.f3410e;
        }

        public String toString() {
            StringBuilder sbM2079g = C0561a.m2079g("State{mTargetPosition=");
            sbM2079g.append(this.f3406a);
            sbM2079g.append(", mData=");
            sbM2079g.append((Object) null);
            sbM2079g.append(", mItemCount=");
            sbM2079g.append(this.f3410e);
            sbM2079g.append(", mIsMeasuring=");
            sbM2079g.append(this.f3414i);
            sbM2079g.append(", mPreviousLayoutItemCount=");
            sbM2079g.append(this.f3407b);
            sbM2079g.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sbM2079g.append(this.f3408c);
            sbM2079g.append(", mStructureChanged=");
            sbM2079g.append(this.f3411f);
            sbM2079g.append(", mInPreLayout=");
            sbM2079g.append(this.f3412g);
            sbM2079g.append(", mRunSimpleAnimations=");
            sbM2079g.append(this.f3415j);
            sbM2079g.append(", mRunPredictiveAnimations=");
            sbM2079g.append(this.f3416k);
            sbM2079g.append('}');
            return sbM2079g.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static abstract class AbstractC0550x {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public class RunnableC0551y implements Runnable {

        /* renamed from: b */
        public int f3420b;

        /* renamed from: c */
        public int f3421c;

        /* renamed from: d */
        public OverScroller f3422d;

        /* renamed from: e */
        public Interpolator f3423e;

        /* renamed from: f */
        public boolean f3424f;

        /* renamed from: g */
        public boolean f3425g;

        public RunnableC0551y() {
            Interpolator interpolator = RecyclerView.f3264y0;
            this.f3423e = interpolator;
            this.f3424f = false;
            this.f3425g = false;
            this.f3422d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public void m1996a() {
            if (this.f3424f) {
                this.f3425g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            recyclerView.postOnAnimation(this);
        }

        /* renamed from: b */
        public void m1997b(int i, int i2, int i3, Interpolator interpolator) {
            int iRound;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int iSqrt = (int) Math.sqrt(0);
                int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i4 = width / 2;
                float f2 = width;
                float f3 = i4;
                float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                if (iSqrt > 0) {
                    iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        iAbs = iAbs2;
                    }
                    iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
                }
                i3 = Math.min(iRound, 2000);
            }
            int i5 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f3264y0;
            }
            if (this.f3423e != interpolator) {
                this.f3423e = interpolator;
                this.f3422d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3421c = 0;
            this.f3420b = 0;
            RecyclerView.this.setScrollState(2);
            this.f3422d.startScroll(0, 0, i, i2, i5);
            m1996a();
        }

        /* renamed from: c */
        public void m1998c() {
            RecyclerView.this.removeCallbacks(this);
            this.f3422d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3311m == null) {
                m1998c();
                return;
            }
            this.f3425g = false;
            this.f3424f = true;
            recyclerView.m1871n();
            OverScroller overScroller = this.f3422d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3420b;
                int i4 = currY - this.f3421c;
                this.f3420b = currX;
                this.f3421c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3324s0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m1882t(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3324s0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m1869m(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3309l != null) {
                    int[] iArr3 = recyclerView3.f3324s0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m1861h0(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3324s0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    AbstractC0548v abstractC0548v = recyclerView4.f3311m.f3354g;
                    if (abstractC0548v != null && !abstractC0548v.f3394d && abstractC0548v.f3395e) {
                        int iM1995b = recyclerView4.f3298f0.m1995b();
                        if (iM1995b == 0) {
                            abstractC0548v.m1991d();
                        } else {
                            if (abstractC0548v.f3391a >= iM1995b) {
                                abstractC0548v.f3391a = iM1995b - 1;
                            }
                            abstractC0548v.m1990b(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f3315o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3324s0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m1883u(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3324s0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.m1884v(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                AbstractC0548v abstractC0548v2 = recyclerView7.f3311m.f3354g;
                if ((abstractC0548v2 != null && abstractC0548v2.f3394d) || !z) {
                    m1996a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    RunnableC0390m runnableC0390m = recyclerView8.f3294d0;
                    if (runnableC0390m != null) {
                        runnableC0390m.m1374a(recyclerView8, i2, i);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i7 < 0) {
                            recyclerView9.m1886x();
                            if (recyclerView9.f3271G.isFinished()) {
                                recyclerView9.f3271G.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView9.m1887y();
                            if (recyclerView9.f3273I.isFinished()) {
                                recyclerView9.f3273I.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.m1888z();
                            if (recyclerView9.f3272H.isFinished()) {
                                recyclerView9.f3272H.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.m1885w();
                            if (recyclerView9.f3274J.isFinished()) {
                                recyclerView9.f3274J.onAbsorb(currVelocity);
                            }
                        }
                        if (i7 != 0 || currVelocity != 0) {
                            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                            recyclerView9.postInvalidateOnAnimation();
                        }
                    }
                    int[] iArr7 = RecyclerView.f3262w0;
                    RunnableC0390m.b bVar = RecyclerView.this.f3296e0;
                    int[] iArr8 = bVar.f2311c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    bVar.f2312d = 0;
                }
            }
            AbstractC0548v abstractC0548v3 = RecyclerView.this.f3311m.f3354g;
            if (abstractC0548v3 != null && abstractC0548v3.f3394d) {
                abstractC0548v3.m1990b(0, 0);
            }
            this.f3424f = false;
            if (!this.f3425g) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m1878q0(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                recyclerView10.postOnAnimation(this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class AbstractC0552z {

        /* renamed from: s */
        public static final List<Object> f3427s = Collections.emptyList();

        /* renamed from: a */
        public final View f3428a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f3429b;

        /* renamed from: j */
        public int f3437j;

        /* renamed from: r */
        public RecyclerView f3445r;

        /* renamed from: c */
        public int f3430c = -1;

        /* renamed from: d */
        public int f3431d = -1;

        /* renamed from: e */
        public long f3432e = -1;

        /* renamed from: f */
        public int f3433f = -1;

        /* renamed from: g */
        public int f3434g = -1;

        /* renamed from: h */
        public AbstractC0552z f3435h = null;

        /* renamed from: i */
        public AbstractC0552z f3436i = null;

        /* renamed from: k */
        public List<Object> f3438k = null;

        /* renamed from: l */
        public List<Object> f3439l = null;

        /* renamed from: m */
        public int f3440m = 0;

        /* renamed from: n */
        public C0544r f3441n = null;

        /* renamed from: o */
        public boolean f3442o = false;

        /* renamed from: p */
        public int f3443p = 0;

        /* renamed from: q */
        public int f3444q = -1;

        public AbstractC0552z(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f3428a = view;
        }

        /* renamed from: a */
        public void m1999a(Object obj) {
            if (obj == null) {
                m2000b(1024);
                return;
            }
            if ((1024 & this.f3437j) == 0) {
                if (this.f3438k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f3438k = arrayList;
                    this.f3439l = Collections.unmodifiableList(arrayList);
                }
                this.f3438k.add(obj);
            }
        }

        /* renamed from: b */
        public void m2000b(int i) {
            this.f3437j = i | this.f3437j;
        }

        /* renamed from: c */
        public void m2001c() {
            this.f3431d = -1;
            this.f3434g = -1;
        }

        /* renamed from: d */
        public void m2002d() {
            this.f3437j &= -33;
        }

        /* renamed from: e */
        public final int m2003e() {
            int i = this.f3434g;
            return i == -1 ? this.f3430c : i;
        }

        /* renamed from: f */
        public List<Object> m2004f() {
            if ((this.f3437j & 1024) != 0) {
                return f3427s;
            }
            List<Object> list = this.f3438k;
            return (list == null || list.size() == 0) ? f3427s : this.f3439l;
        }

        /* renamed from: g */
        public boolean m2005g(int i) {
            return (i & this.f3437j) != 0;
        }

        /* renamed from: h */
        public boolean m2006h() {
            return (this.f3428a.getParent() == null || this.f3428a.getParent() == this.f3445r) ? false : true;
        }

        /* renamed from: i */
        public boolean m2007i() {
            return (this.f3437j & 1) != 0;
        }

        /* renamed from: j */
        public boolean m2008j() {
            return (this.f3437j & 4) != 0;
        }

        /* renamed from: k */
        public final boolean m2009k() {
            if ((this.f3437j & 16) == 0) {
                View view = this.f3428a;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public boolean m2010l() {
            return (this.f3437j & 8) != 0;
        }

        /* renamed from: m */
        public boolean m2011m() {
            return this.f3441n != null;
        }

        /* renamed from: n */
        public boolean m2012n() {
            return (this.f3437j & 256) != 0;
        }

        /* renamed from: o */
        public boolean m2013o() {
            return (this.f3437j & 2) != 0;
        }

        /* renamed from: p */
        public void m2014p(int i, boolean z) {
            if (this.f3431d == -1) {
                this.f3431d = this.f3430c;
            }
            if (this.f3434g == -1) {
                this.f3434g = this.f3430c;
            }
            if (z) {
                this.f3434g += i;
            }
            this.f3430c += i;
            if (this.f3428a.getLayoutParams() != null) {
                ((C0539m) this.f3428a.getLayoutParams()).f3373c = true;
            }
        }

        /* renamed from: q */
        public void m2015q() {
            this.f3437j = 0;
            this.f3430c = -1;
            this.f3431d = -1;
            this.f3432e = -1L;
            this.f3434g = -1;
            this.f3440m = 0;
            this.f3435h = null;
            this.f3436i = null;
            List<Object> list = this.f3438k;
            if (list != null) {
                list.clear();
            }
            this.f3437j &= -1025;
            this.f3443p = 0;
            this.f3444q = -1;
            RecyclerView.m1826k(this);
        }

        /* renamed from: r */
        public void m2016r(int i, int i2) {
            this.f3437j = (i & i2) | (this.f3437j & (~i2));
        }

        /* renamed from: s */
        public final void m2017s(boolean z) {
            int i;
            int i2 = this.f3440m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f3440m = i3;
            if (i3 < 0) {
                this.f3440m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f3437j | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.f3437j & (-17);
            }
            this.f3437j = i;
        }

        /* renamed from: t */
        public boolean m2018t() {
            return (this.f3437j & 128) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3430c + " id=" + this.f3432e + ", oldPos=" + this.f3431d + ", pLpos:" + this.f3434g);
            if (m2011m()) {
                sb.append(" scrap ");
                sb.append(this.f3442o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m2008j()) {
                sb.append(" invalid");
            }
            if (!m2007i()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.f3437j & 2) != 0) {
                sb.append(" update");
            }
            if (m2010l()) {
                sb.append(" removed");
            }
            if (m2018t()) {
                sb.append(" ignored");
            }
            if (m2012n()) {
                sb.append(" tmpDetached");
            }
            if (!m2009k()) {
                StringBuilder sbM2079g = C0561a.m2079g(" not recyclable(");
                sbM2079g.append(this.f3440m);
                sbM2079g.append(")");
                sb.append(sbM2079g.toString());
            }
            if ((this.f3437j & 512) == 0 && !m2008j()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f3428a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public boolean m2019u() {
            return (this.f3437j & 32) != 0;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f3263x0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3264y0 = new InterpolatorC0528b();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.recyclerViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:48)(12:49|(1:52)|51|93|54|(1:56)(1:57)|58|59|91|60|61|65)|93|54|(0)(0)|58|59|91|60|61|65) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0276, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0279, code lost:
    
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028e, code lost:
    
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ae, code lost:
    
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0241 A[Catch: ClassCastException -> 0x02af, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, ClassNotFoundException -> 0x0327, TryCatch #4 {ClassCastException -> 0x02af, ClassNotFoundException -> 0x0327, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, blocks: (B:54:0x023b, B:56:0x0241, B:58:0x024e, B:60:0x025a, B:65:0x027f, B:64:0x0279, B:67:0x028e, B:68:0x02ae, B:57:0x024a), top: B:93:0x023b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024a A[Catch: ClassCastException -> 0x02af, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, ClassNotFoundException -> 0x0327, TryCatch #4 {ClassCastException -> 0x02af, ClassNotFoundException -> 0x0327, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, blocks: (B:54:0x023b, B:56:0x0241, B:58:0x024e, B:60:0x025a, B:65:0x027f, B:64:0x0279, B:67:0x028e, B:68:0x02ae, B:57:0x024a), top: B:93:0x023b }] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: F */
    public static RecyclerView m1820F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM1820F = m1820F(viewGroup.getChildAt(i));
            if (recyclerViewM1820F != null) {
                return recyclerViewM1820F;
            }
        }
        return null;
    }

    /* renamed from: K */
    public static AbstractC0552z m1821K(View view) {
        if (view == null) {
            return null;
        }
        return ((C0539m) view.getLayoutParams()).f3371a;
    }

    private C0258g getScrollingChildHelper() {
        if (this.f3318p0 == null) {
            this.f3318p0 = new C0258g(this);
        }
        return this.f3318p0;
    }

    /* renamed from: k */
    public static void m1826k(AbstractC0552z abstractC0552z) {
        WeakReference<RecyclerView> weakReference = abstractC0552z.f3429b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == abstractC0552z.f3428a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                abstractC0552z.f3429b = null;
                return;
            }
        }
    }

    /* renamed from: A */
    public String m1827A() {
        StringBuilder sbM2079g = C0561a.m2079g(" ");
        sbM2079g.append(super.toString());
        sbM2079g.append(", adapter:");
        sbM2079g.append(this.f3309l);
        sbM2079g.append(", layout:");
        sbM2079g.append(this.f3311m);
        sbM2079g.append(", context:");
        sbM2079g.append(getContext());
        return sbM2079g.toString();
    }

    /* renamed from: B */
    public final void m1828B(C0549w c0549w) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(c0549w);
            return;
        }
        OverScroller overScroller = this.f3292c0.f3422d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(c0549w);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* renamed from: C */
    public View m1829C(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: D */
    public final boolean m1830D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3317p.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0541o interfaceC0541o = this.f3317p.get(i);
            if (interfaceC0541o.mo1364b(this, motionEvent) && action != 3) {
                this.f3319q = interfaceC0541o;
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m1831E(int[] iArr) {
        int iM1328e = this.f3297f.m1328e();
        if (iM1328e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM1328e; i3++) {
            AbstractC0552z abstractC0552zM1821K = m1821K(this.f3297f.m1327d(i3));
            if (!abstractC0552zM1821K.m2018t()) {
                int iM2003e = abstractC0552zM1821K.m2003e();
                if (iM2003e < i) {
                    i = iM2003e;
                }
                if (iM2003e > i2) {
                    i2 = iM2003e;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: G */
    public AbstractC0552z m1832G(int i) {
        AbstractC0552z abstractC0552z = null;
        if (this.f3266B) {
            return null;
        }
        int iM1331h = this.f3297f.m1331h();
        for (int i2 = 0; i2 < iM1331h; i2++) {
            AbstractC0552z abstractC0552zM1821K = m1821K(this.f3297f.m1330g(i2));
            if (abstractC0552zM1821K != null && !abstractC0552zM1821K.m2010l() && m1833H(abstractC0552zM1821K) == i) {
                if (!this.f3297f.m1334k(abstractC0552zM1821K.f3428a)) {
                    return abstractC0552zM1821K;
                }
                abstractC0552z = abstractC0552zM1821K;
            }
        }
        return abstractC0552z;
    }

    /* renamed from: H */
    public int m1833H(AbstractC0552z abstractC0552z) {
        if (abstractC0552z.m2005g(524) || !abstractC0552z.m2007i()) {
            return -1;
        }
        C0376a c0376a = this.f3295e;
        int i = abstractC0552z.f3430c;
        int size = c0376a.f2190b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0376a.b bVar = c0376a.f2190b.get(i2);
            int i3 = bVar.f2194a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2195b;
                    if (i4 <= i) {
                        int i5 = bVar.f2197d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2195b;
                    if (i6 == i) {
                        i = bVar.f2197d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2197d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2195b <= i) {
                i += bVar.f2197d;
            }
        }
        return i;
    }

    /* renamed from: I */
    public long m1834I(AbstractC0552z abstractC0552z) {
        return this.f3309l.f3338b ? abstractC0552z.f3432e : abstractC0552z.f3430c;
    }

    /* renamed from: J */
    public AbstractC0552z m1835J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1821K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: L */
    public Rect m1836L(View view) {
        C0539m c0539m = (C0539m) view.getLayoutParams();
        if (!c0539m.f3373c) {
            return c0539m.f3372b;
        }
        if (this.f3298f0.f3412g && (c0539m.m1971b() || c0539m.f3371a.m2008j())) {
            return c0539m.f3372b;
        }
        Rect rect = c0539m.f3372b;
        rect.set(0, 0, 0, 0);
        int size = this.f3315o.size();
        for (int i = 0; i < size; i++) {
            this.f3303i.set(0, 0, 0, 0);
            AbstractC0537k abstractC0537k = this.f3315o.get(i);
            Rect rect2 = this.f3303i;
            Objects.requireNonNull(abstractC0537k);
            ((C0539m) view.getLayoutParams()).m1970a();
            rect2.set(0, 0, 0, 0);
            int i2 = rect.left;
            Rect rect3 = this.f3303i;
            rect.left = i2 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        c0539m.f3373c = false;
        return rect;
    }

    /* renamed from: M */
    public boolean m1837M() {
        return !this.f3327u || this.f3266B || this.f3295e.m1308g();
    }

    /* renamed from: N */
    public void m1838N() {
        this.f3274J = null;
        this.f3272H = null;
        this.f3273I = null;
        this.f3271G = null;
    }

    /* renamed from: O */
    public boolean m1839O() {
        return this.f3268D > 0;
    }

    /* renamed from: P */
    public void m1840P(int i) {
        if (this.f3311m == null) {
            return;
        }
        setScrollState(2);
        this.f3311m.mo1775N0(i);
        awakenScrollBars();
    }

    /* renamed from: Q */
    public void m1841Q() {
        int iM1331h = this.f3297f.m1331h();
        for (int i = 0; i < iM1331h; i++) {
            ((C0539m) this.f3297f.m1330g(i).getLayoutParams()).f3373c = true;
        }
        C0544r c0544r = this.f3291c;
        int size = c0544r.f3383c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0539m c0539m = (C0539m) c0544r.f3383c.get(i2).f3428a.getLayoutParams();
            if (c0539m != null) {
                c0539m.f3373c = true;
            }
        }
    }

    /* renamed from: R */
    public void m1842R(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM1331h = this.f3297f.m1331h();
        for (int i4 = 0; i4 < iM1331h; i4++) {
            AbstractC0552z abstractC0552zM1821K = m1821K(this.f3297f.m1330g(i4));
            if (abstractC0552zM1821K != null && !abstractC0552zM1821K.m2018t()) {
                int i5 = abstractC0552zM1821K.f3430c;
                if (i5 >= i3) {
                    abstractC0552zM1821K.m2014p(-i2, z);
                } else if (i5 >= i) {
                    abstractC0552zM1821K.m2000b(8);
                    abstractC0552zM1821K.m2014p(-i2, z);
                    abstractC0552zM1821K.f3430c = i - 1;
                }
                this.f3298f0.f3411f = true;
            }
        }
        C0544r c0544r = this.f3291c;
        int size = c0544r.f3383c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            AbstractC0552z abstractC0552z = c0544r.f3383c.get(size);
            if (abstractC0552z != null) {
                int i6 = abstractC0552z.f3430c;
                if (i6 >= i3) {
                    abstractC0552z.m2014p(-i2, z);
                } else if (i6 >= i) {
                    abstractC0552z.m2000b(8);
                    c0544r.m1981g(size);
                }
            }
        }
    }

    /* renamed from: S */
    public void m1843S() {
    }

    /* renamed from: T */
    public void m1844T() {
    }

    /* renamed from: U */
    public void m1845U() {
        this.f3268D++;
    }

    /* renamed from: V */
    public void m1846V(boolean z) {
        int i;
        int i2 = this.f3268D - 1;
        this.f3268D = i2;
        if (i2 < 1) {
            this.f3268D = 0;
            if (z) {
                int i3 = this.f3334z;
                this.f3334z = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f3265A;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                        accessibilityEventObtain.setEventType(2048);
                        accessibilityEventObtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(accessibilityEventObtain);
                    }
                }
                for (int size = this.f3326t0.size() - 1; size >= 0; size--) {
                    AbstractC0552z abstractC0552z = this.f3326t0.get(size);
                    if (abstractC0552z.f3428a.getParent() == this && !abstractC0552z.m2018t() && (i = abstractC0552z.f3444q) != -1) {
                        View view = abstractC0552z.f3428a;
                        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                        view.setImportantForAccessibility(i);
                        abstractC0552z.f3444q = -1;
                    }
                }
                this.f3326t0.clear();
            }
        }
    }

    /* renamed from: W */
    public final void m1847W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3277M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3277M = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3281Q = x;
            this.f3279O = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3282R = y;
            this.f3280P = y;
        }
    }

    /* renamed from: X */
    public void m1848X() {
    }

    /* renamed from: Y */
    public void m1849Y() {
    }

    /* renamed from: Z */
    public void m1850Z() {
        if (this.f3310l0 || !this.f3321r) {
            return;
        }
        Runnable runnable = this.f3328u0;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        postOnAnimation(runnable);
        this.f3310l0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1851a0() {
        /*
            r6 = this;
            boolean r0 = r6.f3266B
            if (r0 == 0) goto L19
            a.o.b.a r0 = r6.f3295e
            java.util.ArrayList<a.o.b.a$b> r1 = r0.f2190b
            r0.m1313l(r1)
            java.util.ArrayList<a.o.b.a$b> r1 = r0.f2191c
            r0.m1313l(r1)
            boolean r0 = r6.f3267C
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f3311m
            r0.mo1754r0(r6)
        L19:
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.f3275K
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f3311m
            boolean r0 = r0.mo1743Z0()
            if (r0 == 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L32
            a.o.b.a r0 = r6.f3295e
            r0.m1311j()
            goto L37
        L32:
            a.o.b.a r0 = r6.f3295e
            r0.m1304c()
        L37:
            boolean r0 = r6.f3304i0
            if (r0 != 0) goto L42
            boolean r0 = r6.f3306j0
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = r2
            goto L43
        L42:
            r0 = r1
        L43:
            androidx.recyclerview.widget.RecyclerView$w r3 = r6.f3298f0
            boolean r4 = r6.f3327u
            if (r4 == 0) goto L63
            androidx.recyclerview.widget.RecyclerView$i r4 = r6.f3275K
            if (r4 == 0) goto L63
            boolean r4 = r6.f3266B
            if (r4 != 0) goto L59
            if (r0 != 0) goto L59
            androidx.recyclerview.widget.RecyclerView$l r5 = r6.f3311m
            boolean r5 = r5.f3355h
            if (r5 == 0) goto L63
        L59:
            if (r4 == 0) goto L61
            androidx.recyclerview.widget.RecyclerView$d r4 = r6.f3309l
            boolean r4 = r4.f3338b
            if (r4 == 0) goto L63
        L61:
            r4 = r1
            goto L64
        L63:
            r4 = r2
        L64:
            r3.f3415j = r4
            if (r4 == 0) goto L80
            if (r0 == 0) goto L80
            boolean r0 = r6.f3266B
            if (r0 != 0) goto L80
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.f3275K
            if (r0 == 0) goto L7c
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f3311m
            boolean r0 = r0.mo1743Z0()
            if (r0 == 0) goto L7c
            r0 = r1
            goto L7d
        L7c:
            r0 = r2
        L7d:
            if (r0 == 0) goto L80
            goto L81
        L80:
            r1 = r2
        L81:
            r3.f3416k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1851a0():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null || !abstractC0538l.mo1956g0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public void m1852b0(boolean z) {
        this.f3267C = z | this.f3267C;
        this.f3266B = true;
        int iM1331h = this.f3297f.m1331h();
        for (int i = 0; i < iM1331h; i++) {
            AbstractC0552z abstractC0552zM1821K = m1821K(this.f3297f.m1330g(i));
            if (abstractC0552zM1821K != null && !abstractC0552zM1821K.m2018t()) {
                abstractC0552zM1821K.m2000b(6);
            }
        }
        m1841Q();
        C0544r c0544r = this.f3291c;
        int size = c0544r.f3383c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0552z abstractC0552z = c0544r.f3383c.get(i2);
            if (abstractC0552z != null) {
                abstractC0552z.m2000b(6);
                abstractC0552z.m1999a(null);
            }
        }
        AbstractC0530d abstractC0530d = RecyclerView.this.f3309l;
        if (abstractC0530d == null || !abstractC0530d.f3338b) {
            c0544r.m1980f();
        }
    }

    /* renamed from: c0 */
    public void m1853c0(AbstractC0552z abstractC0552z, AbstractC0535i.c cVar) {
        abstractC0552z.m2016r(0, 8192);
        if (this.f3298f0.f3413h && abstractC0552z.m2013o() && !abstractC0552z.m2010l() && !abstractC0552z.m2018t()) {
            this.f3299g.f2211b.m497g(m1834I(abstractC0552z), abstractC0552z);
        }
        this.f3299g.m1347c(abstractC0552z, cVar);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0539m) && this.f3311m.mo1745g((C0539m) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null && abstractC0538l.mo1784e()) {
            return this.f3311m.mo1795k(this.f3298f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null && abstractC0538l.mo1784e()) {
            return this.f3311m.mo1747l(this.f3298f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null && abstractC0538l.mo1784e()) {
            return this.f3311m.mo1748m(this.f3298f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null && abstractC0538l.mo1786f()) {
            return this.f3311m.mo1800n(this.f3298f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null && abstractC0538l.mo1786f()) {
            return this.f3311m.mo1749o(this.f3298f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null && abstractC0538l.mo1786f()) {
            return this.f3311m.mo1751p(this.f3298f0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public void m1854d0() {
        AbstractC0535i abstractC0535i = this.f3275K;
        if (abstractC0535i != null) {
            abstractC0535i.mo1355f();
        }
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            abstractC0538l.m1920G0(this.f3291c);
            this.f3311m.m1922H0(this.f3291c);
        }
        this.f3291c.m1976b();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return getScrollingChildHelper().m842a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().m843b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m844c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m846e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float paddingRight;
        float paddingBottom;
        super.draw(canvas);
        int size = this.f3315o.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f3315o.get(i).mo1366e(canvas, this, this.f3298f0);
        }
        EdgeEffect edgeEffect = this.f3271G;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f3301h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.f3271G;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f3272H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f3301h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3272H;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f3273I;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3301h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f3273I;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f3274J;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3301h) {
                paddingRight = getPaddingRight() + (-getWidth());
                paddingBottom = getPaddingBottom() + (-getHeight());
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.f3274J;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f3275K == null || this.f3315o.size() <= 0 || !this.f3275K.mo1356g()) ? z : true) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public final void m1855e0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3303i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0539m) {
            C0539m c0539m = (C0539m) layoutParams;
            if (!c0539m.f3373c) {
                Rect rect = c0539m.f3372b;
                Rect rect2 = this.f3303i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3303i);
            offsetRectIntoDescendantCoords(view, this.f3303i);
        }
        this.f3311m.m1928K0(this, view, this.f3303i, !this.f3327u, view2 == null);
    }

    /* renamed from: f */
    public final void m1856f(AbstractC0552z abstractC0552z) {
        View view = abstractC0552z.f3428a;
        boolean z = view.getParent() == this;
        this.f3291c.m1986l(m1835J(view));
        if (abstractC0552z.m2012n()) {
            this.f3297f.m1325b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0378b c0378b = this.f3297f;
        if (!z) {
            c0378b.m1324a(view, -1, true);
            return;
        }
        int iIndexOfChild = ((C0398u) c0378b.f2205a).f2341a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c0378b.f2206b.m1344h(iIndexOfChild);
            c0378b.m1332i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: f0 */
    public final void m1857f0() {
        VelocityTracker velocityTracker = this.f3278N;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m1878q0(0);
        EdgeEffect edgeEffect = this.f3271G;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f3271G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3272H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f3272H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3273I;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f3273I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3274J;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f3274J.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public void m1858g(AbstractC0537k abstractC0537k) {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            abstractC0538l.mo1782d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3315o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f3315o.add(abstractC0537k);
        m1841Q();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m1859g0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1859g0(int, int, android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            return abstractC0538l.mo1757u();
        }
        throw new IllegalStateException(C0561a.m2074b(this, C0561a.m2079g("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            return abstractC0538l.mo1758v(getContext(), attributeSet);
        }
        throw new IllegalStateException(C0561a.m2074b(this, C0561a.m2079g("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            return abstractC0538l.mo1760w(layoutParams);
        }
        throw new IllegalStateException(C0561a.m2074b(this, C0561a.m2079g("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0530d getAdapter() {
        return this.f3309l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(abstractC0538l);
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC0533g interfaceC0533g = this.f3314n0;
        return interfaceC0533g == null ? super.getChildDrawingOrder(i, i2) : interfaceC0533g.m1898a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3301h;
    }

    public C0400w getCompatAccessibilityDelegate() {
        return this.f3312m0;
    }

    public C0534h getEdgeEffectFactory() {
        return this.f3270F;
    }

    public AbstractC0535i getItemAnimator() {
        return this.f3275K;
    }

    public int getItemDecorationCount() {
        return this.f3315o.size();
    }

    public AbstractC0538l getLayoutManager() {
        return this.f3311m;
    }

    public int getMaxFlingVelocity() {
        return this.f3286V;
    }

    public int getMinFlingVelocity() {
        return this.f3285U;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0540n getOnFlingListener() {
        return this.f3284T;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3290b0;
    }

    public C0543q getRecycledViewPool() {
        return this.f3291c.m1978d();
    }

    public int getScrollState() {
        return this.f3276L;
    }

    /* renamed from: h */
    public void m1860h(AbstractC0542p abstractC0542p) {
        if (this.f3302h0 == null) {
            this.f3302h0 = new ArrayList();
        }
        this.f3302h0.add(abstractC0542p);
    }

    /* renamed from: h0 */
    public void m1861h0(int i, int i2, int[] iArr) {
        AbstractC0552z abstractC0552z;
        m1872n0();
        m1845U();
        int i3 = C0218b.f1483a;
        Trace.beginSection("RV Scroll");
        m1828B(this.f3298f0);
        int iMo1733M0 = i != 0 ? this.f3311m.mo1733M0(i, this.f3291c, this.f3298f0) : 0;
        int iMo1736O0 = i2 != 0 ? this.f3311m.mo1736O0(i2, this.f3291c, this.f3298f0) : 0;
        Trace.endSection();
        int iM1328e = this.f3297f.m1328e();
        for (int i4 = 0; i4 < iM1328e; i4++) {
            View viewM1327d = this.f3297f.m1327d(i4);
            AbstractC0552z abstractC0552zM1835J = m1835J(viewM1327d);
            if (abstractC0552zM1835J != null && (abstractC0552z = abstractC0552zM1835J.f3436i) != null) {
                View view = abstractC0552z.f3428a;
                int left = viewM1327d.getLeft();
                int top = viewM1327d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1846V(true);
        m1876p0(false);
        if (iArr != null) {
            iArr[0] = iMo1733M0;
            iArr[1] = iMo1736O0;
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m849h(0);
    }

    /* renamed from: i */
    public void m1862i(String str) {
        if (m1839O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(C0561a.m2074b(this, C0561a.m2079g("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f3269E > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C0561a.m2074b(this, C0561a.m2079g(BuildConfig.FLAVOR))));
        }
    }

    /* renamed from: i0 */
    public void m1863i0(int i) {
        if (this.f3332x) {
            return;
        }
        m1880r0();
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0538l.mo1775N0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f3321r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3332x;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1609d;
    }

    /* renamed from: j */
    public final void m1864j() {
        m1857f0();
        setScrollState(0);
    }

    /* renamed from: j0 */
    public boolean m1865j0(AbstractC0552z abstractC0552z, int i) {
        if (m1839O()) {
            abstractC0552z.f3444q = i;
            this.f3326t0.add(abstractC0552z);
            return false;
        }
        View view = abstractC0552z.f3428a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        view.setImportantForAccessibility(i);
        return true;
    }

    /* renamed from: k0 */
    public void m1866k0(int i, int i2, Interpolator interpolator) {
        m1868l0(i, i2, null, Integer.MIN_VALUE, false);
    }

    /* renamed from: l */
    public void m1867l() {
        int iM1331h = this.f3297f.m1331h();
        for (int i = 0; i < iM1331h; i++) {
            AbstractC0552z abstractC0552zM1821K = m1821K(this.f3297f.m1330g(i));
            if (!abstractC0552zM1821K.m2018t()) {
                abstractC0552zM1821K.m2001c();
            }
        }
        C0544r c0544r = this.f3291c;
        int size = c0544r.f3383c.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0544r.f3383c.get(i2).m2001c();
        }
        int size2 = c0544r.f3381a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c0544r.f3381a.get(i3).m2001c();
        }
        ArrayList<AbstractC0552z> arrayList = c0544r.f3382b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c0544r.f3382b.get(i4).m2001c();
            }
        }
    }

    /* renamed from: l0 */
    public void m1868l0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3332x) {
            return;
        }
        if (!abstractC0538l.mo1784e()) {
            i = 0;
        }
        if (!this.f3311m.mo1786f()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            m1874o0(i4, 1);
        }
        this.f3292c0.m1997b(i, i2, i3, interpolator);
    }

    /* renamed from: m */
    public void m1869m(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f3271G;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f3271G.onRelease();
            zIsFinished = this.f3271G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3273I;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3273I.onRelease();
            zIsFinished |= this.f3273I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3272H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3272H.onRelease();
            zIsFinished |= this.f3272H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3274J;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3274J.onRelease();
            zIsFinished |= this.f3274J.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m0 */
    public void m1870m0(int i) {
        if (this.f3332x) {
            return;
        }
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0538l.mo1778X0(this, this.f3298f0, i);
        }
    }

    /* renamed from: n */
    public void m1871n() {
        if (!this.f3327u || this.f3266B) {
            int i = C0218b.f1483a;
            Trace.beginSection("RV FullInvalidate");
            m1877q();
            Trace.endSection();
            return;
        }
        if (this.f3295e.m1308g()) {
            Objects.requireNonNull(this.f3295e);
            if (this.f3295e.m1308g()) {
                int i2 = C0218b.f1483a;
                Trace.beginSection("RV FullInvalidate");
                m1877q();
                Trace.endSection();
            }
        }
    }

    /* renamed from: n0 */
    public void m1872n0() {
        int i = this.f3329v + 1;
        this.f3329v = i;
        if (i != 1 || this.f3332x) {
            return;
        }
        this.f3331w = false;
    }

    /* renamed from: o */
    public void m1873o(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        setMeasuredDimension(AbstractC0538l.m1908h(i, paddingRight, getMinimumWidth()), AbstractC0538l.m1908h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* renamed from: o0 */
    public boolean m1874o0(int i, int i2) {
        return getScrollingChildHelper().m850i(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3268D = 0;
        this.f3321r = true;
        this.f3327u = this.f3327u && !isLayoutRequested();
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            abstractC0538l.f3356i = true;
            abstractC0538l.m1957h0();
        }
        this.f3310l0 = false;
        ThreadLocal<RunnableC0390m> threadLocal = RunnableC0390m.f2303f;
        RunnableC0390m runnableC0390m = threadLocal.get();
        this.f3294d0 = runnableC0390m;
        if (runnableC0390m == null) {
            this.f3294d0 = new RunnableC0390m();
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            Display display = getDisplay();
            float f2 = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            RunnableC0390m runnableC0390m2 = this.f3294d0;
            runnableC0390m2.f2307d = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0390m2);
        }
        this.f3294d0.f2305b.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0535i abstractC0535i = this.f3275K;
        if (abstractC0535i != null) {
            abstractC0535i.mo1355f();
        }
        m1880r0();
        this.f3321r = false;
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            C0544r c0544r = this.f3291c;
            abstractC0538l.f3356i = false;
            abstractC0538l.mo1793j0(this, c0544r);
        }
        this.f3326t0.clear();
        removeCallbacks(this.f3328u0);
        Objects.requireNonNull(this.f3299g);
        while (C0379b0.a.f2212d.mo805a() != null) {
        }
        RunnableC0390m runnableC0390m = this.f3294d0;
        if (runnableC0390m != null) {
            runnableC0390m.f2305b.remove(this);
            this.f3294d0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3315o.size();
        for (int i = 0; i < size; i++) {
            this.f3315o.get(i).mo1905d(canvas, this, this.f3298f0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f3311m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f3332x
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f3311m
            boolean r0 = r0.mo1786f()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$l r3 = r5.f3311m
            boolean r3 = r3.mo1784e()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$l r3 = r5.f3311m
            boolean r3 = r3.mo1786f()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$l r3 = r5.f3311m
            boolean r3 = r3.mo1784e()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f3287W
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3288a0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1859g0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3332x) {
            return false;
        }
        this.f3319q = null;
        if (m1830D(motionEvent)) {
            m1864j();
            return true;
        }
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null) {
            return false;
        }
        boolean zMo1784e = abstractC0538l.mo1784e();
        boolean zMo1786f = this.f3311m.mo1786f();
        if (this.f3278N == null) {
            this.f3278N = VelocityTracker.obtain();
        }
        this.f3278N.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3333y) {
                this.f3333y = false;
            }
            this.f3277M = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3281Q = x;
            this.f3279O = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3282R = y;
            this.f3280P = y;
            if (this.f3276L == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m1878q0(1);
            }
            int[] iArr = this.f3322r0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zMo1784e;
            if (zMo1786f) {
                i = (zMo1784e ? 1 : 0) | 2;
            }
            m1874o0(i, 0);
        } else if (actionMasked == 1) {
            this.f3278N.clear();
            m1878q0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f3277M);
            if (iFindPointerIndex < 0) {
                StringBuilder sbM2079g = C0561a.m2079g("Error processing scroll; pointer index for id ");
                sbM2079g.append(this.f3277M);
                sbM2079g.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sbM2079g.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f3276L != 1) {
                int i2 = x2 - this.f3279O;
                int i3 = y2 - this.f3280P;
                if (zMo1784e == 0 || Math.abs(i2) <= this.f3283S) {
                    z = false;
                } else {
                    this.f3281Q = x2;
                    z = true;
                }
                if (zMo1786f && Math.abs(i3) > this.f3283S) {
                    this.f3282R = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m1864j();
        } else if (actionMasked == 5) {
            this.f3277M = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3281Q = x3;
            this.f3279O = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3282R = y3;
            this.f3280P = y3;
        } else if (actionMasked == 6) {
            m1847W(motionEvent);
        }
        return this.f3276L == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C0218b.f1483a;
        Trace.beginSection("RV OnLayout");
        m1877q();
        Trace.endSection();
        this.f3327u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null) {
            m1873o(i, i2);
            return;
        }
        boolean z = false;
        if (!abstractC0538l.mo1777W()) {
            if (this.f3323s) {
                this.f3311m.m1968y0(i, i2);
                return;
            }
            C0549w c0549w = this.f3298f0;
            if (c0549w.f3416k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0530d abstractC0530d = this.f3309l;
            if (abstractC0530d != null) {
                c0549w.f3410e = abstractC0530d.mo1891a();
            } else {
                c0549w.f3410e = 0;
            }
            m1872n0();
            this.f3311m.m1968y0(i, i2);
            m1876p0(false);
            this.f3298f0.f3412g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3311m.m1968y0(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        if (z || this.f3309l == null) {
            return;
        }
        if (this.f3298f0.f3409d == 1) {
            m1879r();
        }
        this.f3311m.m1937Q0(i, i2);
        this.f3298f0.f3414i = true;
        m1881s();
        this.f3311m.m1939S0(i, i2);
        if (this.f3311m.mo1776V0()) {
            this.f3311m.m1937Q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.f3298f0.f3414i = true;
            m1881s();
            this.f3311m.m1939S0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m1839O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0547u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0547u c0547u = (C0547u) parcelable;
        this.f3293d = c0547u;
        super.onRestoreInstanceState(c0547u.f1718b);
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null || (parcelable2 = this.f3293d.f3390d) == null) {
            return;
        }
        abstractC0538l.mo1767B0(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0547u c0547u = new C0547u(super.onSaveInstanceState());
        C0547u c0547u2 = this.f3293d;
        if (c0547u2 != null) {
            c0547u.f3390d = c0547u2.f3390d;
        } else {
            AbstractC0538l abstractC0538l = this.f3311m;
            c0547u.f3390d = abstractC0538l != null ? abstractC0538l.mo1769C0() : null;
        }
        return c0547u;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m1838N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5 A[PHI: r8
      0x00f5: PHI (r8v12 int) = (r8v8 int), (r8v16 int) binds: [B:50:0x00e0, B:55:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m1875p(View view) {
        AbstractC0552z abstractC0552zM1821K = m1821K(view);
        m1844T();
        AbstractC0530d abstractC0530d = this.f3309l;
        if (abstractC0530d == null || abstractC0552zM1821K == null) {
            return;
        }
        Objects.requireNonNull(abstractC0530d);
    }

    /* renamed from: p0 */
    public void m1876p0(boolean z) {
        if (this.f3329v < 1) {
            this.f3329v = 1;
        }
        if (!z && !this.f3332x) {
            this.f3331w = false;
        }
        if (this.f3329v == 1) {
            if (z && this.f3331w && !this.f3332x && this.f3311m != null && this.f3309l != null) {
                m1877q();
            }
            if (!this.f3332x) {
                this.f3331w = false;
            }
        }
        this.f3329v--;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1877q() {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1877q():void");
    }

    /* renamed from: q0 */
    public void m1878q0(int i) {
        getScrollingChildHelper().m851j(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1879r() {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1879r():void");
    }

    /* renamed from: r0 */
    public void m1880r0() {
        AbstractC0548v abstractC0548v;
        setScrollState(0);
        this.f3292c0.m1998c();
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null || (abstractC0548v = abstractC0538l.f3354g) == null) {
            return;
        }
        abstractC0548v.m1991d();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0552z abstractC0552zM1821K = m1821K(view);
        if (abstractC0552zM1821K != null) {
            if (abstractC0552zM1821K.m2012n()) {
                abstractC0552zM1821K.f3437j &= -257;
            } else if (!abstractC0552zM1821K.m2018t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC0552zM1821K);
                throw new IllegalArgumentException(C0561a.m2074b(this, sb));
            }
        }
        view.clearAnimation();
        m1875p(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3311m.m1910A0(this, view, view2) && view2 != null) {
            m1855e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3311m.m1928K0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3317p.size();
        for (int i = 0; i < size; i++) {
            this.f3317p.get(i).mo1363a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3329v != 0 || this.f3332x) {
            this.f3331w = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m1881s() {
        m1872n0();
        m1845U();
        this.f3298f0.m1994a(6);
        this.f3295e.m1304c();
        this.f3298f0.f3410e = this.f3309l.mo1891a();
        C0549w c0549w = this.f3298f0;
        c0549w.f3408c = 0;
        c0549w.f3412g = false;
        this.f3311m.mo1761w0(this.f3291c, c0549w);
        C0549w c0549w2 = this.f3298f0;
        c0549w2.f3411f = false;
        this.f3293d = null;
        c0549w2.f3415j = c0549w2.f3415j && this.f3275K != null;
        c0549w2.f3409d = 4;
        m1846V(true);
        m1876p0(false);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3332x) {
            return;
        }
        boolean zMo1784e = abstractC0538l.mo1784e();
        boolean zMo1786f = this.f3311m.mo1786f();
        if (zMo1784e || zMo1786f) {
            if (!zMo1784e) {
                i = 0;
            }
            if (!zMo1786f) {
                i2 = 0;
            }
            m1859g0(i, i2, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m1839O()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f3334z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            i = 1;
        }
        if (i != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0400w c0400w) {
        this.f3312m0 = c0400w;
        C0266o.m875n(this, c0400w);
    }

    public void setAdapter(AbstractC0530d abstractC0530d) {
        setLayoutFrozen(false);
        AbstractC0530d abstractC0530d2 = this.f3309l;
        if (abstractC0530d2 != null) {
            abstractC0530d2.f3337a.unregisterObserver(this.f3289b);
            Objects.requireNonNull(this.f3309l);
        }
        m1854d0();
        C0376a c0376a = this.f3295e;
        c0376a.m1313l(c0376a.f2190b);
        c0376a.m1313l(c0376a.f2191c);
        AbstractC0530d abstractC0530d3 = this.f3309l;
        this.f3309l = abstractC0530d;
        if (abstractC0530d != null) {
            abstractC0530d.f3337a.registerObserver(this.f3289b);
        }
        AbstractC0538l abstractC0538l = this.f3311m;
        if (abstractC0538l != null) {
            abstractC0538l.mo1955f0(abstractC0530d3, this.f3309l);
        }
        C0544r c0544r = this.f3291c;
        AbstractC0530d abstractC0530d4 = this.f3309l;
        c0544r.m1976b();
        C0543q c0543qM1978d = c0544r.m1978d();
        Objects.requireNonNull(c0543qM1978d);
        if (abstractC0530d3 != null) {
            c0543qM1978d.f3376b--;
        }
        if (c0543qM1978d.f3376b == 0) {
            for (int i = 0; i < c0543qM1978d.f3375a.size(); i++) {
                c0543qM1978d.f3375a.valueAt(i).f3377a.clear();
            }
        }
        if (abstractC0530d4 != null) {
            c0543qM1978d.f3376b++;
        }
        this.f3298f0.f3411f = true;
        m1852b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0533g interfaceC0533g) {
        if (interfaceC0533g == this.f3314n0) {
            return;
        }
        this.f3314n0 = interfaceC0533g;
        setChildrenDrawingOrderEnabled(interfaceC0533g != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f3301h) {
            m1838N();
        }
        this.f3301h = z;
        super.setClipToPadding(z);
        if (this.f3327u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0534h c0534h) {
        Objects.requireNonNull(c0534h);
        this.f3270F = c0534h;
        m1838N();
    }

    public void setHasFixedSize(boolean z) {
        this.f3323s = z;
    }

    public void setItemAnimator(AbstractC0535i abstractC0535i) {
        AbstractC0535i abstractC0535i2 = this.f3275K;
        if (abstractC0535i2 != null) {
            abstractC0535i2.mo1355f();
            this.f3275K.f3339a = null;
        }
        this.f3275K = abstractC0535i;
        if (abstractC0535i != null) {
            abstractC0535i.f3339a = this.f3308k0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0544r c0544r = this.f3291c;
        c0544r.f3385e = i;
        c0544r.m1987m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0538l abstractC0538l) {
        if (abstractC0538l == this.f3311m) {
            return;
        }
        m1880r0();
        if (this.f3311m != null) {
            AbstractC0535i abstractC0535i = this.f3275K;
            if (abstractC0535i != null) {
                abstractC0535i.mo1355f();
            }
            this.f3311m.m1920G0(this.f3291c);
            this.f3311m.m1922H0(this.f3291c);
            this.f3291c.m1976b();
            if (this.f3321r) {
                AbstractC0538l abstractC0538l2 = this.f3311m;
                C0544r c0544r = this.f3291c;
                abstractC0538l2.f3356i = false;
                abstractC0538l2.mo1793j0(this, c0544r);
            }
            this.f3311m.m1940T0(null);
            this.f3311m = null;
        } else {
            this.f3291c.m1976b();
        }
        C0378b c0378b = this.f3297f;
        C0378b.a aVar = c0378b.f2206b;
        aVar.f2208a = 0L;
        C0378b.a aVar2 = aVar.f2209b;
        if (aVar2 != null) {
            aVar2.m1343g();
        }
        int size = c0378b.f2207c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0378b.b bVar = c0378b.f2205a;
            View view = c0378b.f2207c.get(size);
            C0398u c0398u = (C0398u) bVar;
            Objects.requireNonNull(c0398u);
            AbstractC0552z abstractC0552zM1821K = m1821K(view);
            if (abstractC0552zM1821K != null) {
                c0398u.f2341a.m1865j0(abstractC0552zM1821K, abstractC0552zM1821K.f3443p);
                abstractC0552zM1821K.f3443p = 0;
            }
            c0378b.f2207c.remove(size);
        }
        C0398u c0398u2 = (C0398u) c0378b.f2205a;
        int iM1408b = c0398u2.m1408b();
        for (int i = 0; i < iM1408b; i++) {
            View viewM1407a = c0398u2.m1407a(i);
            c0398u2.f2341a.m1875p(viewM1407a);
            viewM1407a.clearAnimation();
        }
        c0398u2.f2341a.removeAllViews();
        this.f3311m = abstractC0538l;
        if (abstractC0538l != null) {
            if (abstractC0538l.f3349b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(abstractC0538l);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(C0561a.m2074b(abstractC0538l.f3349b, sb));
            }
            abstractC0538l.m1940T0(this);
            if (this.f3321r) {
                AbstractC0538l abstractC0538l3 = this.f3311m;
                abstractC0538l3.f3356i = true;
                abstractC0538l3.m1957h0();
            }
        }
        this.f3291c.m1987m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0258g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1609d) {
            View view = scrollingChildHelper.f1608c;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f1609d = z;
    }

    public void setOnFlingListener(AbstractC0540n abstractC0540n) {
        this.f3284T = abstractC0540n;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0542p abstractC0542p) {
        this.f3300g0 = abstractC0542p;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3290b0 = z;
    }

    public void setRecycledViewPool(C0543q c0543q) {
        C0544r c0544r = this.f3291c;
        if (c0544r.f3387g != null) {
            r1.f3376b--;
        }
        c0544r.f3387g = c0543q;
        if (c0543q == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        c0544r.f3387g.f3376b++;
    }

    public void setRecyclerListener(InterfaceC0545s interfaceC0545s) {
        this.f3313n = interfaceC0545s;
    }

    public void setScrollState(int i) {
        AbstractC0548v abstractC0548v;
        if (i == this.f3276L) {
            return;
        }
        this.f3276L = i;
        if (i != 2) {
            this.f3292c0.m1998c();
            AbstractC0538l abstractC0538l = this.f3311m;
            if (abstractC0538l != null && (abstractC0548v = abstractC0538l.f3354g) != null) {
                abstractC0548v.m1991d();
            }
        }
        AbstractC0538l abstractC0538l2 = this.f3311m;
        if (abstractC0538l2 != null) {
            abstractC0538l2.mo1914D0(i);
        }
        m1848X();
        AbstractC0542p abstractC0542p = this.f3300g0;
        if (abstractC0542p != null) {
            abstractC0542p.mo1418a(this, i);
        }
        List<AbstractC0542p> list = this.f3302h0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f3302h0.get(size).mo1418a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f3283S = scaledTouchSlop;
    }

    public void setViewCacheExtension(AbstractC0550x abstractC0550x) {
        Objects.requireNonNull(this.f3291c);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m850i(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m851j(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f3332x) {
            m1862i("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f3332x = true;
                this.f3333y = true;
                m1880r0();
                return;
            }
            this.f3332x = false;
            if (this.f3331w && this.f3311m != null && this.f3309l != null) {
                requestLayout();
            }
            this.f3331w = false;
        }
    }

    /* renamed from: t */
    public boolean m1882t(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m844c(i, i2, iArr, null, i3);
    }

    /* renamed from: u */
    public final void m1883u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m847f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: v */
    public void m1884v(int i, int i2) {
        this.f3269E++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m1849Y();
        AbstractC0542p abstractC0542p = this.f3300g0;
        if (abstractC0542p != null) {
            abstractC0542p.mo1373b(this, i, i2);
        }
        List<AbstractC0542p> list = this.f3302h0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3302h0.get(size).mo1373b(this, i, i2);
            }
        }
        this.f3269E--;
    }

    /* renamed from: w */
    public void m1885w() {
        int measuredWidth;
        int measuredHeight;
        if (this.f3274J != null) {
            return;
        }
        EdgeEffect edgeEffectM1899a = this.f3270F.m1899a(this);
        this.f3274J = edgeEffectM1899a;
        if (this.f3301h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectM1899a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: x */
    public void m1886x() {
        int measuredHeight;
        int measuredWidth;
        if (this.f3271G != null) {
            return;
        }
        EdgeEffect edgeEffectM1899a = this.f3270F.m1899a(this);
        this.f3271G = edgeEffectM1899a;
        if (this.f3301h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectM1899a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: y */
    public void m1887y() {
        int measuredHeight;
        int measuredWidth;
        if (this.f3273I != null) {
            return;
        }
        EdgeEffect edgeEffectM1899a = this.f3270F.m1899a(this);
        this.f3273I = edgeEffectM1899a;
        if (this.f3301h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectM1899a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: z */
    public void m1888z() {
        int measuredWidth;
        int measuredHeight;
        if (this.f3272H != null) {
            return;
        }
        EdgeEffect edgeEffectM1899a = this.f3270F.m1899a(this);
        this.f3272H = edgeEffectM1899a;
        if (this.f3301h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectM1899a.setSize(measuredWidth, measuredHeight);
    }
}
