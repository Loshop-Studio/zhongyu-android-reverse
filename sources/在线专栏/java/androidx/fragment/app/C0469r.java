package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
class C0469r {

    /* renamed from: a */
    private final ArrayList<Fragment> f3214a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0467p> f3215b = new HashMap<>();

    /* renamed from: c */
    private C0463l f3216c;

    C0469r() {
    }

    /* renamed from: a */
    void m2675a(Fragment fragment) {
        if (this.f3214a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3214a) {
            this.f3214a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* renamed from: b */
    void m2676b() {
        this.f3215b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    boolean m2677c(String str) {
        return this.f3215b.get(str) != null;
    }

    /* renamed from: d */
    void m2678d(int i4) {
        for (C0467p c0467p : this.f3215b.values()) {
            if (c0467p != null) {
                c0467p.m2672u(i4);
            }
        }
    }

    /* renamed from: e */
    void m2679e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3215b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0467p c0467p : this.f3215b.values()) {
                printWriter.print(str);
                if (c0467p != null) {
                    Fragment fragmentM2664k = c0467p.m2664k();
                    printWriter.println(fragmentM2664k);
                    fragmentM2664k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3214a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size; i4++) {
                Fragment fragment = this.f3214a.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* renamed from: f */
    Fragment m2680f(String str) {
        C0467p c0467p = this.f3215b.get(str);
        if (c0467p != null) {
            return c0467p.m2664k();
        }
        return null;
    }

    /* renamed from: g */
    Fragment m2681g(int i4) {
        for (int size = this.f3214a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3214a.get(size);
            if (fragment != null && fragment.mFragmentId == i4) {
                return fragment;
            }
        }
        for (C0467p c0467p : this.f3215b.values()) {
            if (c0467p != null) {
                Fragment fragmentM2664k = c0467p.m2664k();
                if (fragmentM2664k.mFragmentId == i4) {
                    return fragmentM2664k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    Fragment m2682h(String str) {
        if (str != null) {
            for (int size = this.f3214a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3214a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0467p c0467p : this.f3215b.values()) {
            if (c0467p != null) {
                Fragment fragmentM2664k = c0467p.m2664k();
                if (str.equals(fragmentM2664k.mTag)) {
                    return fragmentM2664k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    Fragment m2683i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C0467p c0467p : this.f3215b.values()) {
            if (c0467p != null && (fragmentFindFragmentByWho = c0467p.m2664k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    int m2684j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f3214a.indexOf(fragment);
        for (int i4 = iIndexOf - 1; i4 >= 0; i4--) {
            Fragment fragment2 = this.f3214a.get(i4);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f3214a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3214a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    List<C0467p> m2685k() {
        ArrayList arrayList = new ArrayList();
        for (C0467p c0467p : this.f3215b.values()) {
            if (c0467p != null) {
                arrayList.add(c0467p);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    List<Fragment> m2686l() {
        ArrayList arrayList = new ArrayList();
        for (C0467p c0467p : this.f3215b.values()) {
            if (c0467p != null) {
                arrayList.add(c0467p.m2664k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    C0467p m2687m(String str) {
        return this.f3215b.get(str);
    }

    /* renamed from: n */
    List<Fragment> m2688n() {
        ArrayList arrayList;
        if (this.f3214a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3214a) {
            arrayList = new ArrayList(this.f3214a);
        }
        return arrayList;
    }

    /* renamed from: o */
    C0463l m2689o() {
        return this.f3216c;
    }

    /* renamed from: p */
    void m2690p(C0467p c0467p) {
        Fragment fragmentM2664k = c0467p.m2664k();
        if (m2677c(fragmentM2664k.mWho)) {
            return;
        }
        this.f3215b.put(fragmentM2664k.mWho, c0467p);
        if (fragmentM2664k.mRetainInstanceChangedWhileDetached) {
            if (fragmentM2664k.mRetainInstance) {
                this.f3216c.m2640f(fragmentM2664k);
            } else {
                this.f3216c.m2647n(fragmentM2664k);
            }
            fragmentM2664k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentM2664k);
        }
    }

    /* renamed from: q */
    void m2691q(C0467p c0467p) {
        Fragment fragmentM2664k = c0467p.m2664k();
        if (fragmentM2664k.mRetainInstance) {
            this.f3216c.m2647n(fragmentM2664k);
        }
        if (this.f3215b.put(fragmentM2664k.mWho, null) != null && FragmentManager.m2388H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentM2664k);
        }
    }

    /* renamed from: r */
    void m2692r() {
        Iterator<Fragment> it = this.f3214a.iterator();
        while (it.hasNext()) {
            C0467p c0467p = this.f3215b.get(it.next().mWho);
            if (c0467p != null) {
                c0467p.m2665m();
            }
        }
        for (C0467p c0467p2 : this.f3215b.values()) {
            if (c0467p2 != null) {
                c0467p2.m2665m();
                Fragment fragmentM2664k = c0467p2.m2664k();
                if (fragmentM2664k.mRemoving && !fragmentM2664k.isInBackStack()) {
                    m2691q(c0467p2);
                }
            }
        }
    }

    /* renamed from: s */
    void m2693s(Fragment fragment) {
        synchronized (this.f3214a) {
            this.f3214a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: t */
    void m2694t() {
        this.f3215b.clear();
    }

    /* renamed from: u */
    void m2695u(List<String> list) {
        this.f3214a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentM2680f = m2680f(str);
                if (fragmentM2680f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentM2680f);
                }
                m2675a(fragmentM2680f);
            }
        }
    }

    /* renamed from: v */
    ArrayList<FragmentState> m2696v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f3215b.size());
        for (C0467p c0467p : this.f3215b.values()) {
            if (c0467p != null) {
                Fragment fragmentM2664k = c0467p.m2664k();
                FragmentState fragmentStateM2670s = c0467p.m2670s();
                arrayList.add(fragmentStateM2670s);
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentM2664k + ": " + fragmentStateM2670s.f3103m);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    ArrayList<String> m2697w() {
        synchronized (this.f3214a) {
            if (this.f3214a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3214a.size());
            Iterator<Fragment> it = this.f3214a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m2388H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: x */
    void m2698x(C0463l c0463l) {
        this.f3216c = c0463l;
    }
}
