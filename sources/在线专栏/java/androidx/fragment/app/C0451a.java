package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0470s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC0496f;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
final class C0451a extends AbstractC0470s implements FragmentManager.InterfaceC0444m {

    /* renamed from: t */
    final FragmentManager f3116t;

    /* renamed from: u */
    boolean f3117u;

    /* renamed from: v */
    int f3118v;

    C0451a(FragmentManager fragmentManager) {
        super(fragmentManager.m2500s0(), fragmentManager.m2505v0() != null ? fragmentManager.m2505v0().m2619f().getClassLoader() : null);
        this.f3118v = -1;
        this.f3116t = fragmentManager;
    }

    /* renamed from: F */
    private static boolean m2540F(AbstractC0470s.a aVar) {
        Fragment fragment = aVar.f3237b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* renamed from: A */
    void m2541A(boolean z3) {
        for (int size = this.f3219c.size() - 1; size >= 0; size--) {
            AbstractC0470s.a aVar = this.f3219c.get(size);
            Fragment fragment = aVar.f3237b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m2407k1(this.f3224h));
                fragment.setSharedElementNames(this.f3233q, this.f3232p);
            }
            switch (aVar.f3236a) {
                case 1:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2494o1(fragment, true);
                    this.f3116t.m2475f1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3236a);
                case 3:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2476g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2501s1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2494o1(fragment, true);
                    this.f3116t.m2431E0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2487l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2494o1(fragment, true);
                    this.f3116t.m2509y(fragment);
                    break;
                case 8:
                    this.f3116t.m2498q1(null);
                    break;
                case 9:
                    this.f3116t.m2498q1(fragment);
                    break;
                case 10:
                    this.f3116t.m2496p1(fragment, aVar.f3242g);
                    break;
            }
            if (!this.f3234r && aVar.f3236a != 3 && fragment != null && !FragmentManager.f3015P) {
                this.f3116t.m2453R0(fragment);
            }
        }
        if (this.f3234r || !z3 || FragmentManager.f3015P) {
            return;
        }
        FragmentManager fragmentManager = this.f3116t;
        fragmentManager.m2455S0(fragmentManager.f3046q, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment m2542B(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.s$a> r5 = r0.f3219c
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.s$a> r5 = r0.f3219c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.s$a r5 = (androidx.fragment.app.AbstractC0470s.a) r5
            int r6 = r5.f3236a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.s$a> r6 = r0.f3219c
            androidx.fragment.app.s$a r7 = new androidx.fragment.app.s$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f3237b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f3237b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f3237b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.s$a> r3 = r0.f3219c
            androidx.fragment.app.s$a r6 = new androidx.fragment.app.s$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f3237b
            int r9 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.s$a> r3 = r0.f3219c
            androidx.fragment.app.s$a r15 = new androidx.fragment.app.s$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.s$a r15 = new androidx.fragment.app.s$a
            r15.<init>(r10, r14)
            int r2 = r5.f3238c
            r15.f3238c = r2
            int r2 = r5.f3240e
            r15.f3240e = r2
            int r2 = r5.f3239d
            r15.f3239d = r2
            int r2 = r5.f3241f
            r15.f3241f = r2
            java.util.ArrayList<androidx.fragment.app.s$a> r2 = r0.f3219c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.s$a> r2 = r0.f3219c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f3236a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f3237b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0451a.m2542B(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    /* renamed from: C */
    public String m2543C() {
        return this.f3227k;
    }

    /* renamed from: D */
    boolean m2544D(int i4) {
        int size = this.f3219c.size();
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f3219c.get(i5).f3237b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (i6 != 0 && i6 == i4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    boolean m2545E(ArrayList<C0451a> arrayList, int i4, int i5) {
        if (i5 == i4) {
            return false;
        }
        int size = this.f3219c.size();
        int i6 = -1;
        for (int i7 = 0; i7 < size; i7++) {
            Fragment fragment = this.f3219c.get(i7).f3237b;
            int i8 = fragment != null ? fragment.mContainerId : 0;
            if (i8 != 0 && i8 != i6) {
                for (int i9 = i4; i9 < i5; i9++) {
                    C0451a c0451a = arrayList.get(i9);
                    int size2 = c0451a.f3219c.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        Fragment fragment2 = c0451a.f3219c.get(i10).f3237b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i8) {
                            return true;
                        }
                    }
                }
                i6 = i8;
            }
        }
        return false;
    }

    /* renamed from: G */
    boolean m2546G() {
        for (int i4 = 0; i4 < this.f3219c.size(); i4++) {
            if (m2540F(this.f3219c.get(i4))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public void m2547H() {
        if (this.f3235s != null) {
            for (int i4 = 0; i4 < this.f3235s.size(); i4++) {
                this.f3235s.get(i4).run();
            }
            this.f3235s = null;
        }
    }

    /* renamed from: I */
    void m2548I(Fragment.InterfaceC0426l interfaceC0426l) {
        for (int i4 = 0; i4 < this.f3219c.size(); i4++) {
            AbstractC0470s.a aVar = this.f3219c.get(i4);
            if (m2540F(aVar)) {
                aVar.f3237b.setOnStartEnterTransitionListener(interfaceC0426l);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment m2549J(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.s$a> r0 = r5.f3219c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.s$a> r2 = r5.f3219c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.s$a r2 = (androidx.fragment.app.AbstractC0470s.a) r2
            int r3 = r2.f3236a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.f$c r3 = r2.f3242g
            r2.f3243h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f3237b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f3237b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f3237b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0451a.m2549J(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0444m
    /* renamed from: a */
    public boolean mo2527a(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3225i) {
            return true;
        }
        this.f3116t.m2471e(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: h */
    public int mo2550h() {
        return m2561w(false);
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: i */
    public int mo2551i() {
        return m2561w(true);
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: j */
    public void mo2552j() {
        m2705m();
        this.f3116t.m2469c0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: k */
    public void mo2553k() {
        m2705m();
        this.f3116t.m2469c0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: l */
    public AbstractC0470s mo2554l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3116t) {
            return super.mo2554l(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: n */
    void mo2555n(int i4, Fragment fragment, String str, int i5) {
        super.mo2555n(i4, fragment, str, i5);
        fragment.mFragmentManager = this.f3116t;
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: o */
    public AbstractC0470s mo2556o(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3116t) {
            return super.mo2556o(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: p */
    public AbstractC0470s mo2557p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3116t) {
            return super.mo2557p(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: s */
    public AbstractC0470s mo2558s(Fragment fragment, AbstractC0496f.c cVar) {
        if (fragment.mFragmentManager != this.f3116t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3116t);
        }
        if (cVar == AbstractC0496f.c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        }
        if (cVar != AbstractC0496f.c.DESTROYED) {
            return super.mo2558s(fragment, cVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3118v >= 0) {
            sb.append(" #");
            sb.append(this.f3118v);
        }
        if (this.f3227k != null) {
            sb.append(" ");
            sb.append(this.f3227k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.AbstractC0470s
    /* renamed from: u */
    public AbstractC0470s mo2559u(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3116t) {
            return super.mo2559u(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: v */
    void m2560v(int i4) {
        if (this.f3225i) {
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            int size = this.f3219c.size();
            for (int i5 = 0; i5 < size; i5++) {
                AbstractC0470s.a aVar = this.f3219c.get(i5);
                Fragment fragment = aVar.f3237b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i4;
                    if (FragmentManager.m2388H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3237b + " to " + aVar.f3237b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: w */
    int m2561w(boolean z3) {
        if (this.f3117u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0475x("FragmentManager"));
            m2562x("  ", printWriter);
            printWriter.close();
        }
        this.f3117u = true;
        if (this.f3225i) {
            this.f3118v = this.f3116t.m2482j();
        } else {
            this.f3118v = -1;
        }
        this.f3116t.m2465Z(this, z3);
        return this.f3118v;
    }

    /* renamed from: x */
    public void m2562x(String str, PrintWriter printWriter) {
        m2563y(str, printWriter, true);
    }

    /* renamed from: y */
    public void m2563y(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3227k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3118v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3117u);
            if (this.f3224h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3224h));
            }
            if (this.f3220d != 0 || this.f3221e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3220d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3221e));
            }
            if (this.f3222f != 0 || this.f3223g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3222f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3223g));
            }
            if (this.f3228l != 0 || this.f3229m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3228l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3229m);
            }
            if (this.f3230n != 0 || this.f3231o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3230n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3231o);
            }
        }
        if (this.f3219c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3219c.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0470s.a aVar = this.f3219c.get(i4);
            switch (aVar.f3236a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3236a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3237b);
            if (z3) {
                if (aVar.f3238c != 0 || aVar.f3239d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3238c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3239d));
                }
                if (aVar.f3240e != 0 || aVar.f3241f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3240e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3241f));
                }
            }
        }
    }

    /* renamed from: z */
    void m2564z() {
        int size = this.f3219c.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0470s.a aVar = this.f3219c.get(i4);
            Fragment fragment = aVar.f3237b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3224h);
                fragment.setSharedElementNames(this.f3232p, this.f3233q);
            }
            switch (aVar.f3236a) {
                case 1:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2494o1(fragment, false);
                    this.f3116t.m2476g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3236a);
                case 3:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2475f1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2431E0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2494o1(fragment, false);
                    this.f3116t.m2501s1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2509y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3238c, aVar.f3239d, aVar.f3240e, aVar.f3241f);
                    this.f3116t.m2494o1(fragment, false);
                    this.f3116t.m2487l(fragment);
                    break;
                case 8:
                    this.f3116t.m2498q1(fragment);
                    break;
                case 9:
                    this.f3116t.m2498q1(null);
                    break;
                case 10:
                    this.f3116t.m2496p1(fragment, aVar.f3243h);
                    break;
            }
            if (!this.f3234r && aVar.f3236a != 1 && fragment != null && !FragmentManager.f3015P) {
                this.f3116t.m2453R0(fragment);
            }
        }
        if (this.f3234r || FragmentManager.f3015P) {
            return;
        }
        FragmentManager fragmentManager = this.f3116t;
        fragmentManager.m2455S0(fragmentManager.f3046q, true);
    }
}
