package p010a9;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import p102f9.AbstractC8485b;
import p323z8.AbstractC10732c;
import p323z8.C10733d;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10741l;

/* renamed from: a9.d */
/* loaded from: classes5.dex */
public class C0053d implements InterfaceC10741l {

    /* renamed from: a */
    public Collection f162a;

    /* renamed from: b */
    public C0053d f163b;

    /* renamed from: c */
    public AbstractC10732c f164c;

    /* renamed from: d */
    public AbstractC10732c f165d;

    /* renamed from: e */
    public AbstractC10732c f166e;

    /* renamed from: f */
    public AbstractC10732c f167f;

    /* renamed from: g */
    public b f168g;

    /* renamed from: h */
    public int f169h;

    /* renamed from: i */
    public int f170i;

    /* renamed from: j */
    public a f171j;

    /* renamed from: k */
    public boolean f172k;

    /* renamed from: a9.d$a */
    public class a implements Comparator {

        /* renamed from: a */
        public boolean f173a;

        public a(boolean z10) {
            m187b(z10);
        }

        /* renamed from: a */
        public int compare(AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2) {
            if (this.f173a && AbstractC8485b.m13877g(abstractC10732c, abstractC10732c2)) {
                return 0;
            }
            return AbstractC8485b.m13874d(abstractC10732c, abstractC10732c2);
        }

        /* renamed from: b */
        public void m187b(boolean z10) {
            this.f173a = z10;
        }
    }

    /* renamed from: a9.d$b */
    public class b implements InterfaceC10740k {

        /* renamed from: a */
        public Collection f175a;

        /* renamed from: b */
        public Iterator f176b;

        /* renamed from: c */
        public boolean f177c;

        public b(Collection collection) {
            m189b(collection);
        }

        /* renamed from: a */
        public synchronized void m188a() {
            if (this.f177c || this.f176b == null) {
                if (this.f175a == null || C0053d.this.f169h <= 0) {
                    this.f176b = null;
                } else {
                    this.f176b = this.f175a.iterator();
                }
                this.f177c = false;
            }
        }

        /* renamed from: b */
        public synchronized void m189b(Collection collection) {
            try {
                if (this.f175a != collection) {
                    this.f177c = false;
                    this.f176b = null;
                }
                this.f175a = collection;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
        @Override // p323z8.InterfaceC10740k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized boolean hasNext() {
            /*
                r1 = this;
                monitor-enter(r1)
                java.util.Iterator r0 = r1.f176b     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Ld:
                r0 = move-exception
                goto L12
            Lf:
                r0 = 0
            L10:
                monitor-exit(r1)
                return r0
            L12:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p010a9.C0053d.b.hasNext():boolean");
        }

        @Override // p323z8.InterfaceC10740k
        public synchronized AbstractC10732c next() {
            Iterator it;
            this.f177c = true;
            it = this.f176b;
            return it != null ? (AbstractC10732c) it.next() : null;
        }

        @Override // p323z8.InterfaceC10740k
        public synchronized void remove() {
            this.f177c = true;
            Iterator it = this.f176b;
            if (it != null) {
                it.remove();
                C0053d.m177g(C0053d.this);
            }
        }
    }

    /* renamed from: a9.d$c */
    public class c extends a {
        public c(boolean z10) {
            super(z10);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2) {
            return super.compare(abstractC10732c, abstractC10732c2);
        }
    }

    /* renamed from: a9.d$d */
    public class d extends a {
        public d(boolean z10) {
            super(z10);
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2) {
            if (this.f173a && AbstractC8485b.m13877g(abstractC10732c, abstractC10732c2)) {
                return 0;
            }
            return Float.compare(abstractC10732c.mo20053l(), abstractC10732c2.mo20053l());
        }
    }

    /* renamed from: a9.d$e */
    public class e extends a {
        public e(boolean z10) {
            super(z10);
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC10732c abstractC10732c, AbstractC10732c abstractC10732c2) {
            if (this.f173a && AbstractC8485b.m13877g(abstractC10732c, abstractC10732c2)) {
                return 0;
            }
            return Float.compare(abstractC10732c2.mo20053l(), abstractC10732c.mo20053l());
        }
    }

    public C0053d() {
        this(0, false);
    }

    /* renamed from: g */
    public static /* synthetic */ int m177g(C0053d c0053d) {
        int i10 = c0053d.f169h;
        c0053d.f169h = i10 - 1;
        return i10;
    }

    @Override // p323z8.InterfaceC10741l
    /* renamed from: a */
    public InterfaceC10741l mo178a(long j10, long j11) {
        Collection collectionM185j = m185j(j10, j11);
        if (collectionM185j == null || collectionM185j.isEmpty()) {
            return null;
        }
        return new C0053d(new LinkedList(collectionM185j));
    }

    @Override // p323z8.InterfaceC10741l
    /* renamed from: b */
    public boolean mo179b(AbstractC10732c abstractC10732c) {
        if (abstractC10732c == null) {
            return false;
        }
        if (abstractC10732c.m20060s()) {
            abstractC10732c.m20041D(false);
        }
        if (!this.f162a.remove(abstractC10732c)) {
            return false;
        }
        this.f169h--;
        return true;
    }

    @Override // p323z8.InterfaceC10741l
    /* renamed from: c */
    public InterfaceC10741l mo180c(long j10, long j11) {
        Collection collection = this.f162a;
        if (collection == null || collection.size() == 0) {
            return null;
        }
        if (this.f163b == null) {
            if (this.f170i == 4) {
                C0053d c0053d = new C0053d(4);
                this.f163b = c0053d;
                c0053d.m184i(this.f162a);
            } else {
                this.f163b = new C0053d(this.f172k);
            }
        }
        if (this.f170i == 4) {
            return this.f163b;
        }
        if (this.f164c == null) {
            this.f164c = m183h("start");
        }
        if (this.f165d == null) {
            this.f165d = m183h("end");
        }
        if (this.f163b != null && j10 - this.f164c.m20043b() >= 0 && j11 <= this.f165d.m20043b()) {
            return this.f163b;
        }
        this.f164c.m20039B(j10);
        this.f165d.m20039B(j11);
        this.f163b.m184i(((SortedSet) this.f162a).subSet(this.f164c, this.f165d));
        return this.f163b;
    }

    @Override // p323z8.InterfaceC10741l
    public void clear() {
        Collection collection = this.f162a;
        if (collection != null) {
            collection.clear();
            this.f169h = 0;
            this.f168g = new b(this.f162a);
        }
        if (this.f163b != null) {
            this.f163b = null;
            this.f164c = m183h("start");
            this.f165d = m183h("end");
        }
    }

    @Override // p323z8.InterfaceC10741l
    /* renamed from: d */
    public boolean mo181d(AbstractC10732c abstractC10732c) {
        Collection collection = this.f162a;
        return collection != null && collection.contains(abstractC10732c);
    }

    @Override // p323z8.InterfaceC10741l
    /* renamed from: e */
    public boolean mo182e(AbstractC10732c abstractC10732c) {
        Collection collection = this.f162a;
        if (collection == null) {
            return false;
        }
        try {
            if (!collection.add(abstractC10732c)) {
                return false;
            }
            this.f169h++;
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // p323z8.InterfaceC10741l
    public AbstractC10732c first() {
        Collection collection = this.f162a;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return this.f170i == 4 ? (AbstractC10732c) ((LinkedList) this.f162a).getFirst() : (AbstractC10732c) ((SortedSet) this.f162a).first();
    }

    /* renamed from: h */
    public final AbstractC10732c m183h(String str) {
        return new C10733d(str);
    }

    /* renamed from: i */
    public void m184i(Collection collection) {
        if (!this.f172k || this.f170i == 4) {
            this.f162a = collection;
        } else {
            this.f162a.clear();
            this.f162a.addAll(collection);
            collection = this.f162a;
        }
        if (collection instanceof List) {
            this.f170i = 4;
        }
        this.f169h = collection == null ? 0 : collection.size();
        b bVar = this.f168g;
        if (bVar == null) {
            this.f168g = new b(collection);
        } else {
            bVar.m189b(collection);
        }
    }

    @Override // p323z8.InterfaceC10741l
    public boolean isEmpty() {
        Collection collection = this.f162a;
        return collection == null || collection.isEmpty();
    }

    @Override // p323z8.InterfaceC10741l
    public InterfaceC10740k iterator() {
        this.f168g.m188a();
        return this.f168g;
    }

    /* renamed from: j */
    public final Collection m185j(long j10, long j11) {
        Collection collection;
        if (this.f170i == 4 || (collection = this.f162a) == null || collection.size() == 0) {
            return null;
        }
        if (this.f163b == null) {
            this.f163b = new C0053d(this.f172k);
        }
        if (this.f167f == null) {
            this.f167f = m183h("start");
        }
        if (this.f166e == null) {
            this.f166e = m183h("end");
        }
        this.f167f.m20039B(j10);
        this.f166e.m20039B(j11);
        return ((SortedSet) this.f162a).subSet(this.f167f, this.f166e);
    }

    @Override // p323z8.InterfaceC10741l
    public AbstractC10732c last() {
        Collection collection = this.f162a;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        if (this.f170i != 4) {
            return (AbstractC10732c) ((SortedSet) this.f162a).last();
        }
        return (AbstractC10732c) ((LinkedList) this.f162a).get(r0.size() - 1);
    }

    @Override // p323z8.InterfaceC10741l
    public int size() {
        return this.f169h;
    }

    public C0053d(int i10) {
        this(i10, false);
    }

    public C0053d(int i10, boolean z10) {
        a eVar;
        this.f169h = 0;
        this.f170i = 0;
        if (i10 == 0) {
            eVar = new c(z10);
        } else if (i10 == 1) {
            eVar = new d(z10);
        } else {
            eVar = i10 == 2 ? new e(z10) : null;
        }
        if (i10 == 4) {
            this.f162a = new LinkedList();
        } else {
            this.f172k = z10;
            eVar.m187b(z10);
            this.f162a = new TreeSet(eVar);
            this.f171j = eVar;
        }
        this.f170i = i10;
        this.f169h = 0;
        this.f168g = new b(this.f162a);
    }

    public C0053d(Collection collection) {
        this.f169h = 0;
        this.f170i = 0;
        m184i(collection);
    }

    public C0053d(boolean z10) {
        this(0, z10);
    }
}
