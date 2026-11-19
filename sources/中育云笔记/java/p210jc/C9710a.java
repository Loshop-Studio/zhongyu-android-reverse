package p210jc;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Property;
import io.objectbox.Transaction;
import io.objectbox.query.QueryBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p225kc.InterfaceC9908a;
import p225kc.InterfaceC9910c;

/* renamed from: jc.a */
/* loaded from: classes6.dex */
public class C9710a {

    /* renamed from: a */
    public final BoxStore f22599a;

    /* renamed from: b */
    public final Class f22600b;

    /* renamed from: c */
    public final ThreadLocal f22601c = new ThreadLocal();

    /* renamed from: d */
    public final ThreadLocal f22602d = new ThreadLocal();

    /* renamed from: e */
    public final InterfaceC9910c f22603e;

    public C9710a(BoxStore boxStore, Class cls) {
        this.f22599a = boxStore;
        this.f22600b = cls;
        this.f22603e = boxStore.m18966x(cls).mo13997s();
    }

    /* renamed from: a */
    public void m19215a() {
        Cursor cursor = (Cursor) this.f22602d.get();
        if (cursor != null) {
            cursor.close();
            cursor.m18976m().close();
            this.f22602d.remove();
        }
    }

    /* renamed from: b */
    public void m19216b(Cursor cursor) {
        if (this.f22601c.get() == null) {
            cursor.close();
            cursor.m18976m().m18986g();
        }
    }

    /* renamed from: c */
    public Object m19217c(long j10) {
        Cursor cursorM19221g = m19221g();
        try {
            return cursorM19221g.m18971f(j10);
        } finally {
            m19231q(cursorM19221g);
        }
    }

    /* renamed from: d */
    public Cursor m19218d() {
        Transaction transaction = (Transaction) this.f22599a.f22246r.get();
        if (transaction == null) {
            return null;
        }
        if (transaction.isClosed()) {
            throw new IllegalStateException("Active TX is closed");
        }
        Cursor cursor = (Cursor) this.f22601c.get();
        if (cursor != null && !cursor.m18976m().isClosed()) {
            return cursor;
        }
        Cursor cursorM18987i = transaction.m18987i(this.f22600b);
        this.f22601c.set(cursorM18987i);
        return cursorM18987i;
    }

    /* renamed from: e */
    public List m19219e() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM19221g = m19221g();
        try {
            for (Object objM18970e = cursorM19221g.m18970e(); objM18970e != null; objM18970e = cursorM19221g.m18979r()) {
                arrayList.add(objM18970e);
            }
            return arrayList;
        } finally {
            m19231q(cursorM19221g);
        }
    }

    /* renamed from: f */
    public Class m19220f() {
        return this.f22600b;
    }

    /* renamed from: g */
    public Cursor m19221g() {
        Cursor cursorM19218d = m19218d();
        if (cursorM19218d != null) {
            return cursorM19218d;
        }
        Cursor cursor = (Cursor) this.f22602d.get();
        if (cursor == null) {
            Cursor cursorM18987i = this.f22599a.m18952e().m18987i(this.f22600b);
            this.f22602d.set(cursorM18987i);
            return cursorM18987i;
        }
        Transaction transaction = cursor.f22255c;
        if (transaction.isClosed() || !transaction.m18989k()) {
            throw new IllegalStateException("Illegal reader TX state");
        }
        transaction.m18991m();
        cursor.m18980t();
        return cursor;
    }

    /* renamed from: h */
    public BoxStore m19222h() {
        return this.f22599a;
    }

    /* renamed from: i */
    public Cursor m19223i() {
        Cursor cursorM19218d = m19218d();
        if (cursorM19218d != null) {
            return cursorM19218d;
        }
        Transaction transactionM18953f = this.f22599a.m18953f();
        try {
            return transactionM18953f.m18987i(this.f22600b);
        } catch (RuntimeException e10) {
            transactionM18953f.close();
            throw e10;
        }
    }

    /* renamed from: j */
    public Object m19224j(InterfaceC9908a interfaceC9908a) {
        Cursor cursorM19221g = m19221g();
        try {
            return interfaceC9908a.mo19980a(cursorM19221g.m18977n());
        } finally {
            m19231q(cursorM19221g);
        }
    }

    /* renamed from: k */
    public List m19225k(int i10, Property property, long j10) {
        Cursor cursorM19221g = m19221g();
        try {
            return cursorM19221g.m18972g(i10, property, j10);
        } finally {
            m19231q(cursorM19221g);
        }
    }

    /* renamed from: l */
    public List m19226l(int i10, int i11, long j10, boolean z10) {
        Cursor cursorM19221g = m19221g();
        try {
            return cursorM19221g.m18974k(i10, i11, j10, z10);
        } finally {
            m19231q(cursorM19221g);
        }
    }

    /* renamed from: m */
    public long m19227m(Object obj) {
        Cursor cursorM19223i = m19223i();
        try {
            long jMo13987s = cursorM19223i.mo13987s(obj);
            m19216b(cursorM19223i);
            return jMo13987s;
        } finally {
            m19232r(cursorM19223i);
        }
    }

    /* renamed from: n */
    public void m19228n(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM19223i = m19223i();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM19223i.mo13987s(it.next());
            }
            m19216b(cursorM19223i);
            m19232r(cursorM19223i);
        } catch (Throwable th) {
            m19232r(cursorM19223i);
            throw th;
        }
    }

    /* renamed from: o */
    public QueryBuilder m19229o() {
        return new QueryBuilder(this, this.f22599a.m18941B(), this.f22599a.m18964v(this.f22600b));
    }

    /* renamed from: p */
    public void m19230p(Transaction transaction) {
        Cursor cursor = (Cursor) this.f22601c.get();
        if (cursor == null || cursor.m18976m() != transaction) {
            return;
        }
        this.f22601c.remove();
        cursor.close();
    }

    /* renamed from: q */
    public void m19231q(Cursor cursor) {
        if (this.f22601c.get() == null) {
            Transaction transactionM18976m = cursor.m18976m();
            if (transactionM18976m.isClosed() || transactionM18976m.m18989k() || !transactionM18976m.isReadOnly()) {
                throw new IllegalStateException("Illegal reader TX state");
            }
            transactionM18976m.m18990l();
        }
    }

    /* renamed from: r */
    public void m19232r(Cursor cursor) {
        if (this.f22601c.get() == null) {
            Transaction transactionM18976m = cursor.m18976m();
            if (transactionM18976m.isClosed()) {
                return;
            }
            cursor.close();
            transactionM18976m.m18984e();
            transactionM18976m.close();
        }
    }

    /* renamed from: s */
    public void m19233s(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorM19223i = m19223i();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorM19223i.m18969c(cursorM19223i.mo13986i(it.next()));
            }
            m19216b(cursorM19223i);
            m19232r(cursorM19223i);
        } catch (Throwable th) {
            m19232r(cursorM19223i);
            throw th;
        }
    }

    /* renamed from: t */
    public boolean m19234t(long j10) {
        Cursor cursorM19223i = m19223i();
        try {
            boolean zM18969c = cursorM19223i.m18969c(j10);
            m19216b(cursorM19223i);
            return zM18969c;
        } finally {
            m19232r(cursorM19223i);
        }
    }

    /* renamed from: u */
    public boolean m19235u(Object obj) {
        Cursor cursorM19223i = m19223i();
        try {
            boolean zM18969c = cursorM19223i.m18969c(cursorM19223i.mo13986i(obj));
            m19216b(cursorM19223i);
            return zM18969c;
        } finally {
            m19232r(cursorM19223i);
        }
    }

    /* renamed from: v */
    public void m19236v(Transaction transaction) {
        Cursor cursor = (Cursor) this.f22601c.get();
        if (cursor != null) {
            this.f22601c.remove();
            cursor.close();
        }
    }
}
