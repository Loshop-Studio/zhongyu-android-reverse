package p000a.p063q;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.q.b */
/* loaded from: classes.dex */
public class C0409b extends AbstractC0417h {

    /* renamed from: y */
    public int[] f2383y = new int[2];

    /* renamed from: z */
    public static final String[] f2382z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: A */
    public static final Property<Drawable, PointF> f2375A = new a(PointF.class, "boundsOrigin");

    /* renamed from: B */
    public static final Property<i, PointF> f2376B = new b(PointF.class, "topLeft");

    /* renamed from: C */
    public static final Property<i, PointF> f2377C = new c(PointF.class, "bottomRight");

    /* renamed from: D */
    public static final Property<View, PointF> f2378D = new d(PointF.class, "bottomRight");

    /* renamed from: E */
    public static final Property<View, PointF> f2379E = new e(PointF.class, "topLeft");

    /* renamed from: F */
    public static final Property<View, PointF> f2380F = new f(PointF.class, "position");

    /* renamed from: G */
    public static C0415f f2381G = new C0415f();

    /* renamed from: a.q.b$a */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f2384a;

        public a(Class cls, String str) {
            super(cls, str);
            this.f2384a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f2384a);
            Rect rect = this.f2384a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f2384a);
            this.f2384a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f2384a);
        }
    }

    /* renamed from: a.q.b$b */
    public static class b extends Property<i, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f2388a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f2389b = iRound;
            int i = iVar2.f2393f + 1;
            iVar2.f2393f = i;
            if (i == iVar2.f2394g) {
                C0428s.m1478b(iVar2.f2392e, iVar2.f2388a, iRound, iVar2.f2390c, iVar2.f2391d);
                iVar2.f2393f = 0;
                iVar2.f2394g = 0;
            }
        }
    }

    /* renamed from: a.q.b$c */
    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f2390c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f2391d = iRound;
            int i = iVar2.f2394g + 1;
            iVar2.f2394g = i;
            if (iVar2.f2393f == i) {
                C0428s.m1478b(iVar2.f2392e, iVar2.f2388a, iVar2.f2389b, iVar2.f2390c, iRound);
                iVar2.f2393f = 0;
                iVar2.f2394g = 0;
            }
        }
    }

    /* renamed from: a.q.b$d */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C0428s.m1478b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: a.q.b$e */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C0428s.m1478b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: a.q.b$f */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            C0428s.m1478b(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* renamed from: a.q.b$g */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ i f2385a;
        private i mViewBounds;

        public g(C0409b c0409b, i iVar) {
            this.f2385a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: a.q.b$h */
    public class h extends C0420k {

        /* renamed from: a */
        public boolean f2386a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f2387b;

        public h(C0409b c0409b, ViewGroup viewGroup) {
            this.f2387b = viewGroup;
        }

        @Override // p000a.p063q.C0420k, p000a.p063q.AbstractC0417h.d
        /* renamed from: b */
        public void mo1433b(AbstractC0417h abstractC0417h) {
            C0427r.m1476a(this.f2387b, false);
            this.f2386a = true;
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: c */
        public void mo1434c(AbstractC0417h abstractC0417h) {
            if (!this.f2386a) {
                C0427r.m1476a(this.f2387b, false);
            }
            abstractC0417h.mo1467v(this);
        }

        @Override // p000a.p063q.C0420k, p000a.p063q.AbstractC0417h.d
        /* renamed from: d */
        public void mo1435d(AbstractC0417h abstractC0417h) {
            C0427r.m1476a(this.f2387b, false);
        }

        @Override // p000a.p063q.C0420k, p000a.p063q.AbstractC0417h.d
        /* renamed from: e */
        public void mo1436e(AbstractC0417h abstractC0417h) {
            C0427r.m1476a(this.f2387b, true);
        }
    }

    /* renamed from: a.q.b$i */
    public static class i {

        /* renamed from: a */
        public int f2388a;

        /* renamed from: b */
        public int f2389b;

        /* renamed from: c */
        public int f2390c;

        /* renamed from: d */
        public int f2391d;

        /* renamed from: e */
        public View f2392e;

        /* renamed from: f */
        public int f2393f;

        /* renamed from: g */
        public int f2394g;

        public i(View view) {
            this.f2392e = view;
        }
    }

    /* renamed from: H */
    public final void m1439H(C0425p c0425p) {
        View view = c0425p.f2457b;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0425p.f2456a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0425p.f2456a.put("android:changeBounds:parent", c0425p.f2457b.getParent());
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: d */
    public void mo1428d(C0425p c0425p) {
        m1439H(c0425p);
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: g */
    public void mo1440g(C0425p c0425p) {
        m1439H(c0425p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator mo1429k(android.view.ViewGroup r19, p000a.p063q.C0425p r20, p000a.p063q.C0425p r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p063q.C0409b.mo1429k(android.view.ViewGroup, a.q.p, a.q.p):android.animation.Animator");
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: p */
    public String[] mo1430p() {
        return f2382z;
    }
}
