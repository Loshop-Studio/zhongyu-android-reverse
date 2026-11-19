package p026b8;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Property;
import io.objectbox.Transaction;
import io.objectbox.query.QueryBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p037c8.InterfaceC5266a;
import p037c8.InterfaceC5268c;

/* renamed from: b8.a */
/* loaded from: classes5.dex */
public class C5206a {

    /* renamed from: a */
    public final BoxStore f2371a;

    /* renamed from: b */
    public final Class f2372b;

    /* renamed from: c */
    public final ThreadLocal f2373c = new ThreadLocal();

    /* renamed from: d */
    public final ThreadLocal f2374d = new ThreadLocal();

    /* renamed from: e */
    public final InterfaceC5268c f2375e;

    public C5206a(BoxStore boxStore, Class cls) {
        this.f2371a = boxStore;
        this.f2372b = cls;
        this.f2375e = boxStore.m13113v(cls).mo7367l();
    }

    /* renamed from: a */
    public void m2244a() {
        Cursor cursor = (Cursor) this.f2374d.get();
        if (cursor != null) {
            cursor.close();
            cursor.m13124m().close();
            this.f2374d.remove();
        }
    }

    /* renamed from: b */
    public void m2245b(Cursor cursor) {
        if (this.f2373c.get() == null) {
            cursor.close();
            cursor.m13124m().m13134h();
        }
    }

    /* renamed from: c */
    public Object m2246c(long j9) {
        Cursor cursorM2249f = m2249f();
        try {
            return cursorM2249f.m13119g(j9);
        } finally {
            m2259p(cursorM2249f);
        }
    }

    /* renamed from: d */
    public Cursor m2247d() {
        Transaction transaction = (Transaction) this.f2371a.f13987p.get();
        if (transaction == null) {
            return null;
        }
        if (transaction.isClosed()) {
            throw new IllegalStateException("Active TX is closed");
        }
        Cursor cursor = (Cursor) this.f2373c.get();
        if (cursor != null && !cursor.m13124m().isClosed()) {
            return cursor;
        }
        Cursor cursorM13135i = transaction.m13135i(this.f2372b);
        this.f2373c.set(cursorM13135i);
        return cursorM13135i;
    }

    /* renamed from: e */
    public Class m2248e() {
        return this.f2372b;
    }

    /* renamed from: f */
    public Cursor m2249f() {
        Cursor cursorM2247d = m2247d();
        if (cursorM2247d != null) {
            return cursorM2247d;
        }
        Cursor cursor = (Cursor) this.f2374d.get();
        if (cursor == null) {
            Cursor cursorM13135i = this.f2371a.m13099c().m13135i(this.f2372b);
            this.f2374d.set(cursorM13135i);
            return cursorM13135i;
        }
        Transaction transaction = cursor.f13996a;
        if (transaction.isClosed() || !transaction.m13137k()) {
            throw new IllegalStateException("Illegal reader TX state");
        }
        transaction.m13139m();
        cursor.m13127q();
        return cursor;
    }

    /* renamed from: g */
    public BoxStore m2250g() {
        return this.f2371a;
    }

    /* renamed from: h */
    public Cursor m2251h() {
        Cursor cursorM2247d = m2247d();
        if (cursorM2247d != null) {
            return cursorM2247d;
        }
        Transaction transactionM13100g = this.f2371a.m13100g();
        try {
            return transactionM13100g.m13135i(this.f2372b);
        } catch (RuntimeException e10) {
            transactionM13100g.close();
            throw e10;
        }
    }

    /* renamed from: i */
    public Object m2252i(InterfaceC5266a interfaceC5266a) {
        Cursor cursorM2249f = m2249f();
        try {
            return interfaceC5266a.mo2404a(cursorM2249f.m13125n());
        } finally {
            m2259p(cursorM2249f);
        }
    }

    /* renamed from: j */
    public List m2253j(int i9, Property property, long j9) {
        Cursor cursorM2249f = m2249f();
        try {
            return cursorM2249f.m13120h(i9, property, j9);
        } finally {
            m2259p(cursorM2249f);
        }
    }

    /* renamed from: k */
    public List m2254k(int i9, int i10, long j9, boolean z9) {
        Cursor cursorM2249f = m2249f();
        try {
            return cursorM2249f.m13122k(i9, i10, j9, z9);
        } finally {
            m2259p(cursorM2249f);
        }
    }

    /* renamed from: l */
    public long m2255l(Object obj) {
        Cursor cursorM2251h = m2251h();
        try {
            long jMo7359p = cursorM2251h.mo7359p(obj);
            m2245b(cursorM2251h);
            return jMo7359p;
        } finally {
            m2260q(cursorM2251h);
        }
    }

    /* renamed from: m */
    public void m2256m(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM2251h = m2251h();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM2251h.mo7359p(it.next());
            }
            m2245b(cursorM2251h);
            m2260q(cursorM2251h);
        } catch (Throwable th) {
            m2260q(cursorM2251h);
            throw th;
        }
    }

    /* renamed from: n */
    public QueryBuilder m2257n() {
        return new QueryBuilder(this, this.f2371a.m13116z(), this.f2371a.m13111t(this.f2372b));
    }

    /* renamed from: o */
    public void m2258o(Transaction transaction) {
        Cursor cursor = (Cursor) this.f2373c.get();
        if (cursor == null || cursor.m13124m() != transaction) {
            return;
        }
        this.f2373c.remove();
        cursor.close();
    }

    /* renamed from: p */
    public void m2259p(Cursor cursor) {
        if (this.f2373c.get() == null) {
            Transaction transactionM13124m = cursor.m13124m();
            if (transactionM13124m.isClosed() || transactionM13124m.m13137k() || !transactionM13124m.isReadOnly()) {
                throw new IllegalStateException("Illegal reader TX state");
            }
            transactionM13124m.m13138l();
        }
    }

    /* renamed from: q */
    public void m2260q(Cursor cursor) {
        if (this.f2373c.get() == null) {
            Transaction transactionM13124m = cursor.m13124m();
            if (transactionM13124m.isClosed()) {
                return;
            }
            cursor.close();
            transactionM13124m.m13131a();
            transactionM13124m.close();
        }
    }

    /* renamed from: r */
    public void m2261r(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM2251h = m2251h();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM2251h.m13118c(cursorM2251h.mo7358i(it.next()));
            }
            m2245b(cursorM2251h);
            m2260q(cursorM2251h);
        } catch (Throwable th) {
            m2260q(cursorM2251h);
            throw th;
        }
    }

    /* renamed from: s */
    public boolean m2262s(long j9) {
        Cursor cursorM2251h = m2251h();
        try {
            boolean zM13118c = cursorM2251h.m13118c(j9);
            m2245b(cursorM2251h);
            return zM13118c;
        } finally {
            m2260q(cursorM2251h);
        }
    }

    /* renamed from: t */
    public boolean m2263t(Object obj) {
        Cursor cursorM2251h = m2251h();
        try {
            boolean zM13118c = cursorM2251h.m13118c(cursorM2251h.mo7358i(obj));
            m2245b(cursorM2251h);
            return zM13118c;
        } finally {
            m2260q(cursorM2251h);
        }
    }

    /* renamed from: u */
    public void m2264u(Transaction transaction) {
        Cursor cursor = (Cursor) this.f2373c.get();
        if (cursor != null) {
            this.f2373c.remove();
            cursor.close();
        }
    }
}
