package androidx.coordinatorlayout.widget;

import androidx.collection.C0253g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p011b0.C1023f;
import p011b0.InterfaceC1022e;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0308a<T> {

    /* renamed from: a */
    private final InterfaceC1022e<ArrayList<T>> f2598a = new C1023f(10);

    /* renamed from: b */
    private final C0253g<T, ArrayList<T>> f2599b = new C0253g<>();

    /* renamed from: c */
    private final ArrayList<T> f2600c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2601d = new HashSet<>();

    /* renamed from: e */
    private void m1722e(T t3, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t3)) {
            return;
        }
        if (hashSet.contains(t3)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t3);
        ArrayList<T> arrayList2 = this.f2599b.get(t3);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                m1722e(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(t3);
        arrayList.add(t3);
    }

    /* renamed from: f */
    private ArrayList<T> m1723f() {
        ArrayList<T> arrayListAcquire = this.f2598a.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    /* renamed from: k */
    private void m1724k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2598a.release(arrayList);
    }

    /* renamed from: a */
    public void m1725a(T t3, T t4) {
        if (!this.f2599b.containsKey(t3) || !this.f2599b.containsKey(t4)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListM1723f = this.f2599b.get(t3);
        if (arrayListM1723f == null) {
            arrayListM1723f = m1723f();
            this.f2599b.put(t3, arrayListM1723f);
        }
        arrayListM1723f.add(t4);
    }

    /* renamed from: b */
    public void m1726b(T t3) {
        if (this.f2599b.containsKey(t3)) {
            return;
        }
        this.f2599b.put(t3, null);
    }

    /* renamed from: c */
    public void m1727c() {
        int size = this.f2599b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> arrayListValueAt = this.f2599b.valueAt(i4);
            if (arrayListValueAt != null) {
                m1724k(arrayListValueAt);
            }
        }
        this.f2599b.clear();
    }

    /* renamed from: d */
    public boolean m1728d(T t3) {
        return this.f2599b.containsKey(t3);
    }

    /* renamed from: g */
    public List m1729g(T t3) {
        return this.f2599b.get(t3);
    }

    /* renamed from: h */
    public List<T> m1730h(T t3) {
        int size = this.f2599b.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> arrayListValueAt = this.f2599b.valueAt(i4);
            if (arrayListValueAt != null && arrayListValueAt.contains(t3)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2599b.keyAt(i4));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m1731i() {
        this.f2600c.clear();
        this.f2601d.clear();
        int size = this.f2599b.size();
        for (int i4 = 0; i4 < size; i4++) {
            m1722e(this.f2599b.keyAt(i4), this.f2600c, this.f2601d);
        }
        return this.f2600c;
    }

    /* renamed from: j */
    public boolean m1732j(T t3) {
        int size = this.f2599b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> arrayListValueAt = this.f2599b.valueAt(i4);
            if (arrayListValueAt != null && arrayListValueAt.contains(t3)) {
                return true;
            }
        }
        return false;
    }
}
