package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p127o1.C2907a;
import p145r1.C3027b;

/* renamed from: com.github.barteksc.pdfviewer.b */
/* loaded from: classes.dex */
class C1366b {

    /* renamed from: a */
    private final PriorityQueue<C2907a> f7308a;

    /* renamed from: b */
    private final PriorityQueue<C2907a> f7309b;

    /* renamed from: c */
    private final List<C2907a> f7310c;

    /* renamed from: d */
    private final Object f7311d = new Object();

    /* renamed from: e */
    private final a f7312e;

    /* renamed from: com.github.barteksc.pdfviewer.b$a */
    class a implements Comparator<C2907a> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2907a c2907a, C2907a c2907a2) {
            if (c2907a.m9972a() == c2907a2.m9972a()) {
                return 0;
            }
            return c2907a.m9972a() > c2907a2.m9972a() ? 1 : -1;
        }
    }

    public C1366b() {
        a aVar = new a();
        this.f7312e = aVar;
        this.f7309b = new PriorityQueue<>(C3027b.a.f11734a, aVar);
        this.f7308a = new PriorityQueue<>(C3027b.a.f11734a, aVar);
        this.f7310c = new ArrayList();
    }

    /* renamed from: d */
    private static C2907a m5686d(PriorityQueue<C2907a> priorityQueue, C2907a c2907a) {
        Iterator<C2907a> it = priorityQueue.iterator();
        while (it.hasNext()) {
            C2907a next = it.next();
            if (next.equals(c2907a)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m5687g() {
        synchronized (this.f7311d) {
            while (this.f7309b.size() + this.f7308a.size() >= C3027b.a.f11734a && !this.f7308a.isEmpty()) {
                this.f7308a.poll().m9976e().recycle();
            }
            while (this.f7309b.size() + this.f7308a.size() >= C3027b.a.f11734a && !this.f7309b.isEmpty()) {
                this.f7309b.poll().m9976e().recycle();
            }
        }
    }

    /* renamed from: a */
    public void m5688a(C2907a c2907a) {
        synchronized (this.f7311d) {
            m5687g();
            this.f7309b.offer(c2907a);
        }
    }

    /* renamed from: b */
    public void m5689b(C2907a c2907a) {
        synchronized (this.f7310c) {
            if (this.f7310c.size() >= C3027b.a.f11735b) {
                this.f7310c.remove(0).m9976e().recycle();
            }
            this.f7310c.add(c2907a);
        }
    }

    /* renamed from: c */
    public boolean m5690c(int i4, int i5, float f4, float f5, RectF rectF) {
        C2907a c2907a = new C2907a(i4, i5, null, f4, f5, rectF, true, 0);
        synchronized (this.f7310c) {
            Iterator<C2907a> it = this.f7310c.iterator();
            while (it.hasNext()) {
                if (it.next().equals(c2907a)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public List<C2907a> m5691e() {
        ArrayList arrayList;
        synchronized (this.f7311d) {
            arrayList = new ArrayList(this.f7308a);
            arrayList.addAll(this.f7309b);
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<C2907a> m5692f() {
        List<C2907a> list;
        synchronized (this.f7310c) {
            list = this.f7310c;
        }
        return list;
    }

    /* renamed from: h */
    public void m5693h() {
        synchronized (this.f7311d) {
            this.f7308a.addAll(this.f7309b);
            this.f7309b.clear();
        }
    }

    /* renamed from: i */
    public void m5694i() {
        synchronized (this.f7311d) {
            Iterator<C2907a> it = this.f7308a.iterator();
            while (it.hasNext()) {
                it.next().m9976e().recycle();
            }
            this.f7308a.clear();
            Iterator<C2907a> it2 = this.f7309b.iterator();
            while (it2.hasNext()) {
                it2.next().m9976e().recycle();
            }
            this.f7309b.clear();
        }
        synchronized (this.f7310c) {
            Iterator<C2907a> it3 = this.f7310c.iterator();
            while (it3.hasNext()) {
                it3.next().m9976e().recycle();
            }
            this.f7310c.clear();
        }
    }

    /* renamed from: j */
    public boolean m5695j(int i4, int i5, float f4, float f5, RectF rectF, int i6) {
        C2907a c2907a = new C2907a(i4, i5, null, f4, f5, rectF, false, 0);
        synchronized (this.f7311d) {
            C2907a c2907aM5686d = m5686d(this.f7308a, c2907a);
            boolean z3 = true;
            if (c2907aM5686d == null) {
                if (m5686d(this.f7309b, c2907a) == null) {
                    z3 = false;
                }
                return z3;
            }
            this.f7308a.remove(c2907aM5686d);
            c2907aM5686d.m9980i(i6);
            this.f7309b.offer(c2907aM5686d);
            return true;
        }
    }
}
