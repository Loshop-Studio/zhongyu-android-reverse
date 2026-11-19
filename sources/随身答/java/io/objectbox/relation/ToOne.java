package io.objectbox.relation;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.exception.DbDetachedException;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import p026b8.C5206a;
import p037c8.C5271f;

/* loaded from: classes5.dex */
public class ToOne<TARGET> implements Serializable {

    /* renamed from: a */
    public final Object f14076a;

    /* renamed from: b */
    public final RelationInfo f14077b;

    /* renamed from: c */
    public final boolean f14078c;

    /* renamed from: d */
    public transient BoxStore f14079d;

    /* renamed from: e */
    public transient C5206a f14080e;

    /* renamed from: f */
    public volatile transient C5206a f14081f;

    /* renamed from: g */
    public transient Field f14082g;

    /* renamed from: h */
    public Object f14083h;

    /* renamed from: i */
    public long f14084i;

    /* renamed from: j */
    public volatile long f14085j;

    /* renamed from: k */
    public boolean f14086k;

    /* renamed from: l */
    public boolean f14087l;

    public ToOne(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f14076a = obj;
        this.f14077b = relationInfo;
        this.f14078c = relationInfo.f14054c.f14010g;
    }

    /* renamed from: a */
    public final synchronized void m13181a() {
        this.f14085j = 0L;
        this.f14083h = null;
    }

    /* renamed from: c */
    public final void m13182c(Object obj) {
        if (this.f14081f == null) {
            try {
                BoxStore boxStore = (BoxStore) C5271f.m2412b().m2413a(this.f14076a.getClass(), "__boxStore").get(this.f14076a);
                this.f14079d = boxStore;
                if (boxStore == null) {
                    if (obj != null) {
                        this.f14079d = (BoxStore) C5271f.m2412b().m2413a(obj.getClass(), "__boxStore").get(obj);
                    }
                    if (this.f14079d == null) {
                        throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                    }
                }
                this.f14087l = this.f14079d.m13092D();
                this.f14080e = this.f14079d.m13101h(this.f14077b.f14052a.mo7364f());
                this.f14081f = this.f14079d.m13101h(this.f14077b.f14053b.mo7364f());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ToOne toOne = (ToOne) obj;
        return this.f14077b == toOne.f14077b && m13185n() == toOne.m13185n();
    }

    /* renamed from: g */
    public Object m13183g() {
        return m13184k(m13185n());
    }

    public int hashCode() {
        long jM13185n = m13185n();
        return (int) (jM13185n ^ (jM13185n >>> 32));
    }

    /* renamed from: k */
    public Object m13184k(long j9) {
        synchronized (this) {
            try {
                if (this.f14085j == j9) {
                    return this.f14083h;
                }
                m13182c(null);
                Object objM2246c = this.f14081f.m2246c(j9);
                m13189v(objM2246c, j9);
                return objM2246c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public long m13185n() {
        if (this.f14078c) {
            return this.f14084i;
        }
        Field fieldM13186q = m13186q();
        try {
            Long l9 = (Long) fieldM13186q.get(this.f14076a);
            if (l9 != null) {
                return l9.longValue();
            }
            return 0L;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + fieldM13186q);
        }
    }

    /* renamed from: q */
    public final Field m13186q() {
        if (this.f14082g == null) {
            this.f14082g = C5271f.m2412b().m2413a(this.f14076a.getClass(), this.f14077b.f14054c.f14008e);
        }
        return this.f14082g;
    }

    public void setTargetId(long j9) throws IllegalAccessException, IllegalArgumentException {
        if (this.f14078c) {
            this.f14084i = j9;
        } else {
            try {
                m13186q().set(this.f14076a, Long.valueOf(j9));
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Could not update to-one ID in entity", e10);
            }
        }
        if (j9 != 0) {
            this.f14086k = false;
        }
    }

    /* renamed from: t */
    public void m13187t(Cursor cursor) throws IllegalAccessException, IllegalArgumentException {
        this.f14086k = false;
        long jMo7359p = cursor.mo7359p(this.f14083h);
        setTargetId(jMo7359p);
        m13189v(this.f14083h, jMo7359p);
    }

    /* renamed from: u */
    public boolean m13188u() {
        return this.f14086k && this.f14083h != null && m13185n() == 0;
    }

    /* renamed from: v */
    public final synchronized void m13189v(Object obj, long j9) {
        try {
            if (this.f14087l) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("Setting resolved ToOne target to ");
                sb.append(obj == null ? "null" : "non-null");
                sb.append(" for ID ");
                sb.append(j9);
                printStream.println(sb.toString());
            }
            this.f14085j = j9;
            this.f14083h = obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: w */
    public void m13190w(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            setTargetId(0L);
            m13181a();
        } else {
            long jMo2406a = this.f14077b.f14053b.mo7367l().mo2406a(obj);
            this.f14086k = jMo2406a == 0;
            setTargetId(jMo2406a);
            m13189v(obj, jMo2406a);
        }
    }
}
