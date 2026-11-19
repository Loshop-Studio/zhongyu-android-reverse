package p000a.p063q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p000a.p063q.AbstractC0417h;

/* renamed from: a.q.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC0408a0 extends AbstractC0417h {

    /* renamed from: z */
    public static final String[] f2361z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y */
    public int f2362y = 3;

    /* renamed from: a.q.a0$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC0417h.d {

        /* renamed from: a */
        public final View f2363a;

        /* renamed from: b */
        public final int f2364b;

        /* renamed from: c */
        public final ViewGroup f2365c;

        /* renamed from: d */
        public final boolean f2366d;

        /* renamed from: e */
        public boolean f2367e;

        /* renamed from: f */
        public boolean f2368f = false;

        public a(View view, int i, boolean z) {
            this.f2363a = view;
            this.f2364b = i;
            this.f2365c = (ViewGroup) view.getParent();
            this.f2366d = z;
            m1438g(true);
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: a */
        public void mo1432a(AbstractC0417h abstractC0417h) {
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: b */
        public void mo1433b(AbstractC0417h abstractC0417h) {
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: c */
        public void mo1434c(AbstractC0417h abstractC0417h) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            m1437f();
            abstractC0417h.mo1467v(this);
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: d */
        public void mo1435d(AbstractC0417h abstractC0417h) {
            m1438g(false);
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: e */
        public void mo1436e(AbstractC0417h abstractC0417h) {
            m1438g(true);
        }

        /* renamed from: f */
        public final void m1437f() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (!this.f2368f) {
                C0428s.f2464a.mo1486f(this.f2363a, this.f2364b);
                ViewGroup viewGroup = this.f2365c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m1438g(false);
        }

        /* renamed from: g */
        public final void m1438g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f2366d || this.f2367e == z || (viewGroup = this.f2365c) == null) {
                return;
            }
            this.f2367e = z;
            C0427r.m1476a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2368f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            m1437f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f2368f) {
                return;
            }
            C0428s.f2464a.mo1486f(this.f2363a, this.f2364b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f2368f) {
                return;
            }
            C0428s.f2464a.mo1486f(this.f2363a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: a.q.a0$b */
    public static class b {

        /* renamed from: a */
        public boolean f2369a;

        /* renamed from: b */
        public boolean f2370b;

        /* renamed from: c */
        public int f2371c;

        /* renamed from: d */
        public int f2372d;

        /* renamed from: e */
        public ViewGroup f2373e;

        /* renamed from: f */
        public ViewGroup f2374f;
    }

    /* renamed from: H */
    public final void m1425H(C0425p c0425p) {
        c0425p.f2456a.put("android:visibility:visibility", Integer.valueOf(c0425p.f2457b.getVisibility()));
        c0425p.f2456a.put("android:visibility:parent", c0425p.f2457b.getParent());
        int[] iArr = new int[2];
        c0425p.f2457b.getLocationOnScreen(iArr);
        c0425p.f2456a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r0.f2373e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0.f2371c == 0) goto L40;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000a.p063q.AbstractC0408a0.b m1426I(p000a.p063q.C0425p r8, p000a.p063q.C0425p r9) {
        /*
            r7 = this;
            a.q.a0$b r0 = new a.q.a0$b
            r0.<init>()
            r1 = 0
            r0.f2369a = r1
            r0.f2370b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2456a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2456a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f2371c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2456a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2373e = r6
            goto L37
        L33:
            r0.f2371c = r4
            r0.f2373e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f2456a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2456a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2372d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2456a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2374f = r2
            goto L5e
        L5a:
            r0.f2372d = r4
            r0.f2374f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f2371c
            int r9 = r0.f2372d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f2373e
            android.view.ViewGroup r4 = r0.f2374f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f2374f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f2373e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f2372d
            if (r8 != 0) goto L8d
        L88:
            r0.f2370b = r2
        L8a:
            r0.f2369a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f2371c
            if (r8 != 0) goto L96
        L93:
            r0.f2370b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p063q.AbstractC0408a0.m1426I(a.q.p, a.q.p):a.q.a0$b");
    }

    /* renamed from: J */
    public abstract Animator mo1427J(ViewGroup viewGroup, View view, C0425p c0425p, C0425p c0425p2);

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: d */
    public void mo1428d(C0425p c0425p) {
        m1425H(c0425p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (m1426I(m1463n(r1, false), m1464q(r1, false)).f2369a != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0219  */
    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator mo1429k(android.view.ViewGroup r22, p000a.p063q.C0425p r23, p000a.p063q.C0425p r24) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p063q.AbstractC0408a0.mo1429k(android.view.ViewGroup, a.q.p, a.q.p):android.animation.Animator");
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: p */
    public String[] mo1430p() {
        return f2361z;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: r */
    public boolean mo1431r(C0425p c0425p, C0425p c0425p2) {
        if (c0425p == null && c0425p2 == null) {
            return false;
        }
        if (c0425p != null && c0425p2 != null && c0425p2.f2456a.containsKey("android:visibility:visibility") != c0425p.f2456a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b bVarM1426I = m1426I(c0425p, c0425p2);
        if (bVarM1426I.f2369a) {
            return bVarM1426I.f2371c == 0 || bVarM1426I.f2372d == 0;
        }
        return false;
    }
}
