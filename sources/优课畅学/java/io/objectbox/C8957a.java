package io.objectbox;

import io.objectbox.query.QueryBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p189n6.InterfaceC9428a;
import p189n6.InterfaceC9430c;

/* renamed from: io.objectbox.a */
/* loaded from: classes5.dex */
public class C8957a {

    /* renamed from: a */
    public final BoxStore f16888a;

    /* renamed from: b */
    public final Class f16889b;

    /* renamed from: c */
    public final ThreadLocal f16890c = new ThreadLocal();

    /* renamed from: d */
    public final ThreadLocal f16891d = new ThreadLocal();

    /* renamed from: e */
    public final InterfaceC9430c f16892e;

    public C8957a(BoxStore boxStore, Class cls) {
        this.f16888a = boxStore;
        this.f16889b = cls;
        this.f16892e = boxStore.m15382r(cls).getIdGetter();
    }

    /* renamed from: a */
    public void m15403a() {
        Cursor cursor = (Cursor) this.f16891d.get();
        if (cursor != null) {
            cursor.close();
            cursor.getTx().close();
            this.f16891d.remove();
        }
    }

    /* renamed from: b */
    public void m15404b(Cursor cursor) {
        if (this.f16890c.get() == null) {
            cursor.close();
            cursor.getTx().m15396d();
        }
    }

    /* renamed from: c */
    public Object m15405c(long j10) {
        Cursor cursorM15408f = m15408f();
        try {
            return cursorM15408f.get(j10);
        } finally {
            m15418p(cursorM15408f);
        }
    }

    /* renamed from: d */
    public Cursor m15406d() {
        Transaction transaction = (Transaction) this.f16888a.f16861p.get();
        if (transaction == null) {
            return null;
        }
        if (transaction.isClosed()) {
            throw new IllegalStateException("Active TX is closed");
        }
        Cursor cursor = (Cursor) this.f16890c.get();
        if (cursor != null && !cursor.getTx().isClosed()) {
            return cursor;
        }
        Cursor cursorM15397e = transaction.m15397e(this.f16889b);
        this.f16890c.set(cursorM15397e);
        return cursorM15397e;
    }

    /* renamed from: e */
    public Class m15407e() {
        return this.f16889b;
    }

    /* renamed from: f */
    public Cursor m15408f() {
        Cursor cursorM15406d = m15406d();
        if (cursorM15406d != null) {
            return cursorM15406d;
        }
        Cursor cursor = (Cursor) this.f16891d.get();
        if (cursor == null) {
            Cursor cursorM15397e = this.f16888a.m15368b().m15397e(this.f16889b);
            this.f16891d.set(cursorM15397e);
            return cursorM15397e;
        }
        Transaction transaction = cursor.f16868tx;
        if (transaction.isClosed() || !transaction.m15400h()) {
            throw new IllegalStateException("Illegal reader TX state");
        }
        transaction.m15402j();
        cursor.renew();
        return cursor;
    }

    /* renamed from: g */
    public BoxStore m15409g() {
        return this.f16888a;
    }

    /* renamed from: h */
    public Cursor m15410h() {
        Cursor cursorM15406d = m15406d();
        if (cursorM15406d != null) {
            return cursorM15406d;
        }
        Transaction transactionM15369c = this.f16888a.m15369c();
        try {
            return transactionM15369c.m15397e(this.f16889b);
        } catch (RuntimeException e10) {
            transactionM15369c.close();
            throw e10;
        }
    }

    /* renamed from: i */
    public Object m15411i(InterfaceC9428a interfaceC9428a) {
        Cursor cursorM15408f = m15408f();
        try {
            return interfaceC9428a.mo17283a(cursorM15408f.internalHandle());
        } finally {
            m15418p(cursorM15408f);
        }
    }

    /* renamed from: j */
    public List m15412j(int i10, Property property, long j10) {
        Cursor cursorM15408f = m15408f();
        try {
            return cursorM15408f.getBacklinkEntities(i10, property, j10);
        } finally {
            m15418p(cursorM15408f);
        }
    }

    /* renamed from: k */
    public List m15413k(int i10, int i11, long j10, boolean z10) {
        Cursor cursorM15408f = m15408f();
        try {
            return cursorM15408f.getRelationEntities(i10, i11, j10, z10);
        } finally {
            m15418p(cursorM15408f);
        }
    }

    /* renamed from: l */
    public long m15414l(Object obj) {
        Cursor cursorM15410h = m15410h();
        try {
            long jPut = cursorM15410h.put(obj);
            m15404b(cursorM15410h);
            return jPut;
        } finally {
            m15419q(cursorM15410h);
        }
    }

    /* renamed from: m */
    public void m15415m(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM15410h = m15410h();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM15410h.put(it.next());
            }
            m15404b(cursorM15410h);
            m15419q(cursorM15410h);
        } catch (Throwable th) {
            m15419q(cursorM15410h);
            throw th;
        }
    }

    /* renamed from: n */
    public QueryBuilder m15416n() {
        return new QueryBuilder(this, this.f16888a.m15385v(), this.f16888a.m15380p(this.f16889b));
    }

    /* renamed from: o */
    public void m15417o(Transaction transaction) {
        Cursor cursor = (Cursor) this.f16890c.get();
        if (cursor == null || cursor.getTx() != transaction) {
            return;
        }
        this.f16890c.remove();
        cursor.close();
    }

    /* renamed from: p */
    public void m15418p(Cursor cursor) {
        if (this.f16890c.get() == null) {
            Transaction tx = cursor.getTx();
            if (tx.isClosed() || tx.m15400h() || !tx.isReadOnly()) {
                throw new IllegalStateException("Illegal reader TX state");
            }
            tx.m15401i();
        }
    }

    /* renamed from: q */
    public void m15419q(Cursor cursor) {
        if (this.f16890c.get() == null) {
            Transaction tx = cursor.getTx();
            if (tx.isClosed()) {
                return;
            }
            cursor.close();
            tx.m15393a();
            tx.close();
        }
    }

    /* renamed from: r */
    public void m15420r(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM15410h = m15410h();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM15410h.deleteEntity(cursorM15410h.getId(it.next()));
            }
            m15404b(cursorM15410h);
            m15419q(cursorM15410h);
        } catch (Throwable th) {
            m15419q(cursorM15410h);
            throw th;
        }
    }

    /* renamed from: s */
    public boolean m15421s(long j10) {
        Cursor cursorM15410h = m15410h();
        try {
            boolean zDeleteEntity = cursorM15410h.deleteEntity(j10);
            m15404b(cursorM15410h);
            return zDeleteEntity;
        } finally {
            m15419q(cursorM15410h);
        }
    }

    /* renamed from: t */
    public boolean m15422t(Object obj) {
        Cursor cursorM15410h = m15410h();
        try {
            boolean zDeleteEntity = cursorM15410h.deleteEntity(cursorM15410h.getId(obj));
            m15404b(cursorM15410h);
            return zDeleteEntity;
        } finally {
            m15419q(cursorM15410h);
        }
    }

    /* renamed from: u */
    public void m15423u(Transaction transaction) {
        Cursor cursor = (Cursor) this.f16890c.get();
        if (cursor != null) {
            this.f16890c.remove();
            cursor.close();
        }
    }
}
