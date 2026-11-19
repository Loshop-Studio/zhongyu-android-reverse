package io.objectbox.relation;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.exception.DbDetachedException;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import p210jc.C9710a;
import p225kc.C9913f;

/* loaded from: classes6.dex */
public class ToOne<TARGET> implements Serializable {

    /* renamed from: c */
    public final Object f22335c;

    /* renamed from: d */
    public final RelationInfo f22336d;

    /* renamed from: e */
    public final boolean f22337e;

    /* renamed from: f */
    public transient BoxStore f22338f;

    /* renamed from: g */
    public transient C9710a f22339g;

    /* renamed from: h */
    public volatile transient C9710a f22340h;

    /* renamed from: i */
    public transient Field f22341i;

    /* renamed from: j */
    public Object f22342j;

    /* renamed from: k */
    public long f22343k;

    /* renamed from: l */
    public volatile long f22344l;

    /* renamed from: m */
    public boolean f22345m;

    /* renamed from: n */
    public boolean f22346n;

    public ToOne(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f22335c = obj;
        this.f22336d = relationInfo;
        this.f22337e = relationInfo.f22313e.f22269i;
    }

    /* renamed from: a */
    public final synchronized void m19034a() {
        this.f22344l = 0L;
        this.f22342j = null;
    }

    /* renamed from: c */
    public final void m19035c(Object obj) {
        if (this.f22340h == null) {
            try {
                BoxStore boxStore = (BoxStore) C9913f.m19986b().m19987a(this.f22335c.getClass(), "__boxStore").get(this.f22335c);
                this.f22338f = boxStore;
                if (boxStore == null) {
                    if (obj != null) {
                        this.f22338f = (BoxStore) C9913f.m19986b().m19987a(obj.getClass(), "__boxStore").get(obj);
                    }
                    if (this.f22338f == null) {
                        throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                    }
                }
                this.f22346n = this.f22338f.m18945F();
                this.f22339g = this.f22338f.m18954g(this.f22336d.f22311c.mo13994j());
                this.f22340h = this.f22338f.m18954g(this.f22336d.f22312d.mo13994j());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: d */
    public Object m19036d() {
        return m19037e(m19038f());
    }

    /* renamed from: e */
    public Object m19037e(long j10) {
        synchronized (this) {
            try {
                if (this.f22344l == j10) {
                    return this.f22342j;
                }
                m19035c(null);
                Object objM19217c = this.f22340h.m19217c(j10);
                m19042n(objM19217c, j10);
                return objM19217c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ToOne toOne = (ToOne) obj;
        return this.f22336d == toOne.f22336d && m19038f() == toOne.m19038f();
    }

    /* renamed from: f */
    public long m19038f() {
        if (this.f22337e) {
            return this.f22343k;
        }
        Field fieldM19039g = m19039g();
        try {
            Long l10 = (Long) fieldM19039g.get(this.f22335c);
            if (l10 != null) {
                return l10.longValue();
            }
            return 0L;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + fieldM19039g);
        }
    }

    /* renamed from: g */
    public final Field m19039g() {
        if (this.f22341i == null) {
            this.f22341i = C9913f.m19986b().m19987a(this.f22335c.getClass(), this.f22336d.f22313e.f22267g);
        }
        return this.f22341i;
    }

    public int hashCode() {
        long jM19038f = m19038f();
        return (int) (jM19038f ^ (jM19038f >>> 32));
    }

    /* renamed from: k */
    public void m19040k(Cursor cursor) throws IllegalAccessException, IllegalArgumentException {
        this.f22345m = false;
        long jMo13987s = cursor.mo13987s(this.f22342j);
        setTargetId(jMo13987s);
        m19042n(this.f22342j, jMo13987s);
    }

    /* renamed from: m */
    public boolean m19041m() {
        return this.f22345m && this.f22342j != null && m19038f() == 0;
    }

    /* renamed from: n */
    public final synchronized void m19042n(Object obj, long j10) {
        try {
            if (this.f22346n) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting resolved ToOne target to ");
                sb2.append(obj == null ? "null" : "non-null");
                sb2.append(" for ID ");
                sb2.append(j10);
                printStream.println(sb2.toString());
            }
            this.f22344l = j10;
            this.f22342j = obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: o */
    public void m19043o(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            setTargetId(0L);
            m19034a();
        } else {
            long jMo14001a = this.f22336d.f22312d.mo13997s().mo14001a(obj);
            this.f22345m = jMo14001a == 0;
            setTargetId(jMo14001a);
            m19042n(obj, jMo14001a);
        }
    }

    public void setTargetId(long j10) throws IllegalAccessException, IllegalArgumentException {
        if (this.f22337e) {
            this.f22343k = j10;
        } else {
            try {
                m19039g().set(this.f22335c, Long.valueOf(j10));
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Could not update to-one ID in entity", e10);
            }
        }
        if (j10 != 0) {
            this.f22345m = false;
        }
    }
}
