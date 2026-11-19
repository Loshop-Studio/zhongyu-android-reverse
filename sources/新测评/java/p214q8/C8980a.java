package p214q8;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Property;
import io.objectbox.Transaction;
import io.objectbox.query.QueryBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p225r8.InterfaceC9046a;
import p225r8.InterfaceC9048c;

/* renamed from: q8.a */
/* loaded from: classes5.dex */
public class C8980a {

    /* renamed from: a */
    public final BoxStore f15313a;

    /* renamed from: b */
    public final Class f15314b;

    /* renamed from: c */
    public final ThreadLocal f15315c = new ThreadLocal();

    /* renamed from: d */
    public final ThreadLocal f15316d = new ThreadLocal();

    /* renamed from: e */
    public final InterfaceC9048c f15317e;

    public C8980a(BoxStore boxStore, Class cls) {
        this.f15313a = boxStore;
        this.f15314b = cls;
        this.f15317e = boxStore.m12993v(cls).mo6274i();
    }

    /* renamed from: a */
    public void m15034a() {
        Cursor cursor = (Cursor) this.f15316d.get();
        if (cursor != null) {
            cursor.close();
            cursor.m13004m().close();
            this.f15316d.remove();
        }
    }

    /* renamed from: b */
    public void m15035b(Cursor cursor) {
        if (this.f15315c.get() == null) {
            cursor.close();
            cursor.m13004m().m13014h();
        }
    }

    /* renamed from: c */
    public Object m15036c(long j10) {
        Cursor cursorM15039f = m15039f();
        try {
            return cursorM15039f.m12999g(j10);
        } finally {
            m15049p(cursorM15039f);
        }
    }

    /* renamed from: d */
    public Cursor m15037d() {
        Transaction transaction = (Transaction) this.f15313a.f13173p.get();
        if (transaction == null) {
            return null;
        }
        if (transaction.isClosed()) {
            throw new IllegalStateException("Active TX is closed");
        }
        Cursor cursor = (Cursor) this.f15315c.get();
        if (cursor != null && !cursor.m13004m().isClosed()) {
            return cursor;
        }
        Cursor cursorM13015i = transaction.m13015i(this.f15314b);
        this.f15315c.set(cursorM13015i);
        return cursorM13015i;
    }

    /* renamed from: e */
    public Class m15038e() {
        return this.f15314b;
    }

    /* renamed from: f */
    public Cursor m15039f() {
        Cursor cursorM15037d = m15037d();
        if (cursorM15037d != null) {
            return cursorM15037d;
        }
        Cursor cursor = (Cursor) this.f15316d.get();
        if (cursor == null) {
            Cursor cursorM13015i = this.f15313a.m12979f().m13015i(this.f15314b);
            this.f15316d.set(cursorM13015i);
            return cursorM13015i;
        }
        Transaction transaction = cursor.f13182a;
        if (transaction.isClosed() || !transaction.m13017k()) {
            throw new IllegalStateException("Illegal reader TX state");
        }
        transaction.m13019m();
        cursor.m13007q();
        return cursor;
    }

    /* renamed from: g */
    public BoxStore m15040g() {
        return this.f15313a;
    }

    /* renamed from: h */
    public Cursor m15041h() {
        Cursor cursorM15037d = m15037d();
        if (cursorM15037d != null) {
            return cursorM15037d;
        }
        Transaction transactionM12980g = this.f15313a.m12980g();
        try {
            return transactionM12980g.m13015i(this.f15314b);
        } catch (RuntimeException e10) {
            transactionM12980g.close();
            throw e10;
        }
    }

    /* renamed from: i */
    public Object m15042i(InterfaceC9046a interfaceC9046a) {
        Cursor cursorM15039f = m15039f();
        try {
            return interfaceC9046a.mo15197a(cursorM15039f.m13005n());
        } finally {
            m15049p(cursorM15039f);
        }
    }

    /* renamed from: j */
    public List m15043j(int i10, Property property, long j10) {
        Cursor cursorM15039f = m15039f();
        try {
            return cursorM15039f.m13000h(i10, property, j10);
        } finally {
            m15049p(cursorM15039f);
        }
    }

    /* renamed from: k */
    public List m15044k(int i10, int i11, long j10, boolean z9) {
        Cursor cursorM15039f = m15039f();
        try {
            return cursorM15039f.m13002k(i10, i11, j10, z9);
        } finally {
            m15049p(cursorM15039f);
        }
    }

    /* renamed from: l */
    public long m15045l(Object obj) {
        Cursor cursorM15041h = m15041h();
        try {
            long jMo6265p = cursorM15041h.mo6265p(obj);
            m15035b(cursorM15041h);
            return jMo6265p;
        } finally {
            m15050q(cursorM15041h);
        }
    }

    /* renamed from: m */
    public void m15046m(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM15041h = m15041h();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM15041h.mo6265p(it.next());
            }
            m15035b(cursorM15041h);
            m15050q(cursorM15041h);
        } catch (Throwable th) {
            m15050q(cursorM15041h);
            throw th;
        }
    }

    /* renamed from: n */
    public QueryBuilder m15047n() {
        return new QueryBuilder(this, this.f15313a.m12996z(), this.f15313a.m12991t(this.f15314b));
    }

    /* renamed from: o */
    public void m15048o(Transaction transaction) {
        Cursor cursor = (Cursor) this.f15315c.get();
        if (cursor == null || cursor.m13004m() != transaction) {
            return;
        }
        this.f15315c.remove();
        cursor.close();
    }

    /* renamed from: p */
    public void m15049p(Cursor cursor) {
        if (this.f15315c.get() == null) {
            Transaction transactionM13004m = cursor.m13004m();
            if (transactionM13004m.isClosed() || transactionM13004m.m13017k() || !transactionM13004m.isReadOnly()) {
                throw new IllegalStateException("Illegal reader TX state");
            }
            transactionM13004m.m13018l();
        }
    }

    /* renamed from: q */
    public void m15050q(Cursor cursor) {
        if (this.f15315c.get() == null) {
            Transaction transactionM13004m = cursor.m13004m();
            if (transactionM13004m.isClosed()) {
                return;
            }
            cursor.close();
            transactionM13004m.m13011a();
            transactionM13004m.close();
        }
    }

    /* renamed from: r */
    public void m15051r(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM15041h = m15041h();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM15041h.m12998f(cursorM15041h.mo6264i(it.next()));
            }
            m15035b(cursorM15041h);
            m15050q(cursorM15041h);
        } catch (Throwable th) {
            m15050q(cursorM15041h);
            throw th;
        }
    }

    /* renamed from: s */
    public boolean m15052s(long j10) {
        Cursor cursorM15041h = m15041h();
        try {
            boolean zM12998f = cursorM15041h.m12998f(j10);
            m15035b(cursorM15041h);
            return zM12998f;
        } finally {
            m15050q(cursorM15041h);
        }
    }

    /* renamed from: t */
    public void m15053t(Transaction transaction) {
        Cursor cursor = (Cursor) this.f15315c.get();
        if (cursor != null) {
            this.f15315c.remove();
            cursor.close();
        }
    }
}
