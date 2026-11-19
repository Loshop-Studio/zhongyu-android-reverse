package p000a.p029g.p030b;

import java.util.ArrayList;
import java.util.HashSet;
import p000a.p021e.C0136h;
import p000a.p031h.p042i.C0241c;

/* renamed from: a.g.b.a */
/* loaded from: classes.dex */
public final class C0183a<T> {

    /* renamed from: a */
    public final C0241c<ArrayList<T>> f1390a = new C0241c<>(10);

    /* renamed from: b */
    public final C0136h<T, ArrayList<T>> f1391b = new C0136h<>();

    /* renamed from: c */
    public final ArrayList<T> f1392c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f1393d = new HashSet<>();

    /* renamed from: a */
    public void m683a(T t) {
        if (this.f1391b.m511e(t) >= 0) {
            return;
        }
        this.f1391b.put(t, null);
    }

    /* renamed from: b */
    public final void m684b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> orDefault = this.f1391b.getOrDefault(t, null);
        if (orDefault != null) {
            int size = orDefault.size();
            for (int i = 0; i < size; i++) {
                m684b(orDefault.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
