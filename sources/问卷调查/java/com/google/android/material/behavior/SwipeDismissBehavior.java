package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p049j.p051b.C0292e;
import p070b.p074b.p075a.p076a.p082e.C0588a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0503c<V> {

    /* renamed from: a */
    public C0292e f4802a;

    /* renamed from: b */
    public boolean f4803b;

    /* renamed from: c */
    public int f4804c = 2;

    /* renamed from: d */
    public float f4805d = 0.5f;

    /* renamed from: e */
    public float f4806e = 0.0f;

    /* renamed from: f */
    public float f4807f = 0.5f;

    /* renamed from: g */
    public final C0292e.c f4808g = new C0914a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C0914a extends C0292e.c {

        /* renamed from: a */
        public int f4809a;

        /* renamed from: b */
        public int f4810b = -1;

        public C0914a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo964a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.WeakHashMap<android.view.View, a.h.j.v> r5 = p000a.p031h.p043j.C0266o.f1616a
                int r5 = r3.getLayoutDirection()
                r0 = 1
                if (r5 != r0) goto Lb
                r5 = r0
                goto Lc
            Lb:
                r5 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f4804c
                if (r1 != 0) goto L26
                if (r5 == 0) goto L1e
            L14:
                int r5 = r2.f4809a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f4809a
                goto L39
            L1e:
                int r5 = r2.f4809a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L39
            L26:
                if (r1 != r0) goto L2b
                if (r5 == 0) goto L14
                goto L1e
            L2b:
                int r5 = r2.f4809a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f4809a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L39:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0914a.mo964a(android.view.View, int, int):int");
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: b */
        public int mo965b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: c */
        public int mo966c(View view) {
            return view.getWidth();
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: e */
        public void mo968e(View view, int i) {
            this.f4810b = i;
            this.f4809a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: f */
        public void mo969f(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: g */
        public void mo970g(View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f4806e) + this.f4809a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f4807f) + this.f4809a;
            float f2 = i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m2611C(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo971h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f4810b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L3c
                java.util.WeakHashMap<android.view.View, a.h.j.v> r4 = p000a.p031h.p043j.C0266o.f1616a
                int r4 = r8.getLayoutDirection()
                if (r4 != r2) goto L18
                r4 = r2
                goto L19
            L18:
                r4 = r3
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f4804c
                r6 = 2
                if (r5 != r6) goto L21
                goto L2c
            L21:
                if (r5 != 0) goto L30
                if (r4 == 0) goto L2a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
                goto L2c
            L2a:
                if (r1 <= 0) goto L2e
            L2c:
                r9 = r2
                goto L58
            L2e:
                r9 = r3
                goto L58
            L30:
                if (r5 != r2) goto L2e
                if (r4 == 0) goto L37
                if (r1 <= 0) goto L2e
                goto L3b
            L37:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
            L3b:
                goto L2c
            L3c:
                int r9 = r8.getLeft()
                int r0 = r7.f4809a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f4805d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L2e
                goto L2c
            L58:
                if (r9 == 0) goto L66
                int r9 = r8.getLeft()
                int r0 = r7.f4809a
                if (r9 >= r0) goto L64
                int r0 = r0 - r10
                goto L69
            L64:
                int r0 = r0 + r10
                goto L69
            L66:
                int r0 = r7.f4809a
                r2 = r3
            L69:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                a.j.b.e r9 = r9.f4802a
                int r10 = r8.getTop()
                boolean r9 = r9.m961t(r0, r10)
                if (r9 == 0) goto L84
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, a.h.j.v> r10 = p000a.p031h.p043j.C0266o.f1616a
                r8.postOnAnimation(r9)
                goto L8b
            L84:
                if (r2 == 0) goto L8b
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r8)
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0914a.mo971h(android.view.View, float, float):void");
        }

        @Override // p000a.p049j.p051b.C0292e.c
        /* renamed from: i */
        public boolean mo972i(View view, int i) {
            int i2 = this.f4810b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo2612B(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class RunnableC0915b implements Runnable {

        /* renamed from: b */
        public final View f4812b;

        /* renamed from: c */
        public final boolean f4813c;

        public RunnableC0915b(View view, boolean z) {
            this.f4812b = view;
            this.f4813c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0292e c0292e = SwipeDismissBehavior.this.f4802a;
            if (c0292e == null || !c0292e.m950i(true)) {
                if (this.f4813c) {
                    Objects.requireNonNull(SwipeDismissBehavior.this);
                }
            } else {
                View view = this.f4812b;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                view.postOnAnimation(this);
            }
        }
    }

    /* renamed from: C */
    public static float m2611C(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: A */
    public boolean mo1663A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0292e c0292e = this.f4802a;
        if (c0292e == null) {
            return false;
        }
        c0292e.m955n(motionEvent);
        return true;
    }

    /* renamed from: B */
    public boolean mo2612B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: j */
    public boolean mo1673j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zM1653p = this.f4803b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM1653p = coordinatorLayout.m1653p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4803b = zM1653p;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4803b = false;
        }
        if (!zM1653p) {
            return false;
        }
        if (this.f4802a == null) {
            this.f4802a = new C0292e(coordinatorLayout.getContext(), coordinatorLayout, this.f4808g);
        }
        return this.f4802a.m962u(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: k */
    public boolean mo1674k(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            C0266o.m872k(1048576, v);
            C0266o.m869h(v, 0);
            if (mo2612B(v)) {
                C0266o.m873l(v, C0245b.a.f1571j, null, new C0588a(this));
            }
        }
        return false;
    }
}
