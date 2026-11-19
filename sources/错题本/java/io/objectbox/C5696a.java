package io.objectbox;

import io.objectbox.query.QueryBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p116m5.InterfaceC6110b;

/* renamed from: io.objectbox.a */
/* loaded from: classes3.dex */
public final class C5696a {

    /* renamed from: a */
    public final BoxStore f8922a;

    /* renamed from: b */
    public final Class f8923b;

    /* renamed from: c */
    public final ThreadLocal f8924c = new ThreadLocal();

    /* renamed from: d */
    public final ThreadLocal f8925d = new ThreadLocal();

    /* renamed from: e */
    public final InterfaceC6110b f8926e;

    public C5696a(BoxStore boxStore, Class cls) {
        this.f8922a = boxStore;
        this.f8923b = cls;
        this.f8926e = ((EntityInfo) boxStore.f8901e.get(cls)).getIdGetter();
    }

    /* renamed from: a */
    public final void m5030a(Cursor cursor) {
        if (this.f8924c.get() == null) {
            cursor.close();
            Transaction tx = cursor.getTx();
            tx.m5028b();
            tx.close();
        }
    }

    /* renamed from: b */
    public final Cursor m5031b() {
        Transaction transaction = (Transaction) this.f8922a.f8910n.get();
        if (transaction == null) {
            return null;
        }
        if (transaction.f8921e) {
            throw new IllegalStateException("Active TX is closed");
        }
        Cursor cursor = (Cursor) this.f8924c.get();
        if (cursor != null && !cursor.getTx().f8921e) {
            return cursor;
        }
        Cursor cursorM5029c = transaction.m5029c(this.f8923b);
        this.f8924c.set(cursorM5029c);
        return cursorM5029c;
    }

    /* renamed from: c */
    public final Cursor m5032c() {
        Cursor cursorM5031b = m5031b();
        if (cursorM5031b != null) {
            return cursorM5031b;
        }
        Cursor cursor = (Cursor) this.f8925d.get();
        if (cursor == null) {
            Cursor cursorM5029c = this.f8922a.m5016a().m5029c(this.f8923b);
            this.f8925d.set(cursorM5029c);
            return cursorM5029c;
        }
        Transaction transaction = cursor.f8915tx;
        if (!transaction.f8921e) {
            transaction.m5027a();
            if (transaction.nativeIsRecycled(transaction.f8917a)) {
                transaction.m5027a();
                transaction.f8920d = transaction.f8918b.f8913q;
                transaction.nativeRenew(transaction.f8917a);
                cursor.renew();
                return cursor;
            }
        }
        throw new IllegalStateException("Illegal reader TX state");
    }

    /* renamed from: d */
    public final Cursor m5033d() {
        Cursor cursorM5031b = m5031b();
        if (cursorM5031b != null) {
            return cursorM5031b;
        }
        Transaction transactionM5017b = this.f8922a.m5017b();
        try {
            return transactionM5017b.m5029c(this.f8923b);
        } catch (RuntimeException e) {
            transactionM5017b.close();
            throw e;
        }
    }

    /* renamed from: e */
    public final long m5034e(Object obj) {
        Cursor cursorM5033d = m5033d();
        try {
            long jPut = cursorM5033d.put(obj);
            m5030a(cursorM5033d);
            return jPut;
        } finally {
            m5038i(cursorM5033d);
        }
    }

    /* renamed from: f */
    public final void m5035f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Cursor cursorM5033d = m5033d();
        try {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                cursorM5033d.put(obj);
            }
            m5030a(cursorM5033d);
            m5038i(cursorM5033d);
        } catch (Throwable th) {
            m5038i(cursorM5033d);
            throw th;
        }
    }

    /* renamed from: g */
    public final QueryBuilder m5036g() {
        BoxStore boxStore = this.f8922a;
        return new QueryBuilder(this, boxStore.f8898b, (String) boxStore.f8899c.get(this.f8923b));
    }

    /* renamed from: h */
    public final void m5037h(Cursor cursor) {
        if (this.f8924c.get() == null) {
            Transaction tx = cursor.getTx();
            if (!tx.f8921e) {
                tx.m5027a();
                if (!tx.nativeIsRecycled(tx.f8917a) && tx.f8919c) {
                    tx.m5027a();
                    tx.nativeRecycle(tx.f8917a);
                    return;
                }
            }
            throw new IllegalStateException("Illegal reader TX state");
        }
    }

    /* renamed from: i */
    public final void m5038i(Cursor cursor) {
        if (this.f8924c.get() == null) {
            Transaction tx = cursor.getTx();
            if (tx.f8921e) {
                return;
            }
            cursor.close();
            tx.m5027a();
            tx.nativeAbort(tx.f8917a);
            tx.close();
        }
    }

    /* renamed from: j */
    public final void m5039j(Object obj) {
        Cursor cursorM5033d = m5033d();
        try {
            cursorM5033d.deleteEntity(cursorM5033d.getId(obj));
            m5030a(cursorM5033d);
        } finally {
            m5038i(cursorM5033d);
        }
    }

    /* renamed from: k */
    public final void m5040k(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Cursor cursorM5033d = m5033d();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cursorM5033d.deleteEntity(cursorM5033d.getId(it.next()));
            }
            m5030a(cursorM5033d);
            m5038i(cursorM5033d);
        } catch (Throwable th) {
            m5038i(cursorM5033d);
            throw th;
        }
    }

    /* renamed from: l */
    public final boolean m5041l(long j7) {
        Cursor cursorM5033d = m5033d();
        try {
            boolean zDeleteEntity = cursorM5033d.deleteEntity(j7);
            m5030a(cursorM5033d);
            return zDeleteEntity;
        } finally {
            m5038i(cursorM5033d);
        }
    }
}
