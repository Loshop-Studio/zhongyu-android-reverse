package io.objectbox.relation;

import io.objectbox.BoxStore;
import io.objectbox.C8957a;
import io.objectbox.Cursor;
import io.objectbox.exception.DbDetachedException;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import p189n6.C9433f;

/* loaded from: classes5.dex */
public class ToOne<TARGET> implements Serializable {

    /* renamed from: a */
    public final Object f17007a;

    /* renamed from: b */
    public final RelationInfo f17008b;

    /* renamed from: c */
    public final boolean f17009c;

    /* renamed from: d */
    public transient BoxStore f17010d;

    /* renamed from: e */
    public transient C8957a f17011e;

    /* renamed from: f */
    public volatile transient C8957a f17012f;

    /* renamed from: g */
    public transient Field f17013g;

    /* renamed from: h */
    public Object f17014h;

    /* renamed from: i */
    public long f17015i;

    /* renamed from: j */
    public volatile long f17016j;

    /* renamed from: k */
    public boolean f17017k;

    /* renamed from: l */
    public boolean f17018l;

    public ToOne(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f17007a = obj;
        this.f17008b = relationInfo;
        this.f17009c = relationInfo.f16985c.f16876g;
    }

    /* renamed from: a */
    public final synchronized void m15509a() {
        this.f17016j = 0L;
        this.f17014h = null;
    }

    /* renamed from: b */
    public final void m15510b(Object obj) {
        if (this.f17012f == null) {
            try {
                BoxStore boxStore = (BoxStore) C9433f.m17289b().m17290a(this.f17007a.getClass(), "__boxStore").get(this.f17007a);
                this.f17010d = boxStore;
                if (boxStore == null) {
                    if (obj != null) {
                        this.f17010d = (BoxStore) C9433f.m17289b().m17290a(obj.getClass(), "__boxStore").get(obj);
                    }
                    if (this.f17010d == null) {
                        throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                    }
                }
                this.f17018l = this.f17010d.m15389z();
                this.f17011e = this.f17010d.m15370d(this.f17008b.f16983a.getEntityClass());
                this.f17012f = this.f17010d.m15370d(this.f17008b.f16984b.getEntityClass());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: c */
    public Object m15511c() {
        return m15512d(m15513e());
    }

    /* renamed from: d */
    public Object m15512d(long j10) {
        synchronized (this) {
            try {
                if (this.f17016j == j10) {
                    return this.f17014h;
                }
                m15510b(null);
                Object objM15405c = this.f17012f.m15405c(j10);
                m15517j(objM15405c, j10);
                return objM15405c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public long m15513e() {
        if (this.f17009c) {
            return this.f17015i;
        }
        Field fieldM15514g = m15514g();
        try {
            Long l10 = (Long) fieldM15514g.get(this.f17007a);
            if (l10 != null) {
                return l10.longValue();
            }
            return 0L;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + fieldM15514g);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ToOne toOne = (ToOne) obj;
        return this.f17008b == toOne.f17008b && m15513e() == toOne.m15513e();
    }

    /* renamed from: g */
    public final Field m15514g() {
        if (this.f17013g == null) {
            this.f17013g = C9433f.m17289b().m17290a(this.f17007a.getClass(), this.f17008b.f16985c.f16874e);
        }
        return this.f17013g;
    }

    /* renamed from: h */
    public void m15515h(Cursor cursor) throws IllegalAccessException, IllegalArgumentException {
        this.f17017k = false;
        long jPut = cursor.put(this.f17014h);
        setTargetId(jPut);
        m15517j(this.f17014h, jPut);
    }

    public int hashCode() {
        long jM15513e = m15513e();
        return (int) (jM15513e ^ (jM15513e >>> 32));
    }

    /* renamed from: i */
    public boolean m15516i() {
        return this.f17017k && this.f17014h != null && m15513e() == 0;
    }

    /* renamed from: j */
    public final synchronized void m15517j(Object obj, long j10) {
        try {
            if (this.f17018l) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("Setting resolved ToOne target to ");
                sb.append(obj == null ? "null" : "non-null");
                sb.append(" for ID ");
                sb.append(j10);
                printStream.println(sb.toString());
            }
            this.f17016j = j10;
            this.f17014h = obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public void m15518k(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            setTargetId(0L);
            m15509a();
        } else {
            long id = this.f17008b.f16984b.getIdGetter().getId(obj);
            this.f17017k = id == 0;
            setTargetId(id);
            m15517j(obj, id);
        }
    }

    public void setTargetId(long j10) throws IllegalAccessException, IllegalArgumentException {
        if (this.f17009c) {
            this.f17015i = j10;
        } else {
            try {
                m15514g().set(this.f17007a, Long.valueOf(j10));
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Could not update to-one ID in entity", e10);
            }
        }
        if (j10 != 0) {
            this.f17017k = false;
        }
    }
}
