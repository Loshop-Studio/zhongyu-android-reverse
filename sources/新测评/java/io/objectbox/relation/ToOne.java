package io.objectbox.relation;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.exception.DbDetachedException;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import p214q8.C8980a;
import p225r8.C9051f;

/* loaded from: classes5.dex */
public class ToOne<TARGET> implements Serializable {

    /* renamed from: a */
    public final Object f13262a;

    /* renamed from: b */
    public final RelationInfo f13263b;

    /* renamed from: c */
    public final boolean f13264c;

    /* renamed from: d */
    public transient BoxStore f13265d;

    /* renamed from: e */
    public transient C8980a f13266e;

    /* renamed from: f */
    public volatile transient C8980a f13267f;

    /* renamed from: g */
    public transient Field f13268g;

    /* renamed from: h */
    public Object f13269h;

    /* renamed from: i */
    public long f13270i;

    /* renamed from: j */
    public volatile long f13271j;

    /* renamed from: k */
    public boolean f13272k;

    /* renamed from: l */
    public boolean f13273l;

    public ToOne(Object obj, RelationInfo relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.f13262a = obj;
        this.f13263b = relationInfo;
        this.f13264c = relationInfo.f13240c.f13196g;
    }

    /* renamed from: a */
    public final synchronized void m13062a() {
        this.f13271j = 0L;
        this.f13269h = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ToOne toOne = (ToOne) obj;
        return this.f13263b == toOne.f13263b && m13066m() == toOne.m13066m();
    }

    /* renamed from: f */
    public final void m13063f(Object obj) {
        if (this.f13267f == null) {
            try {
                BoxStore boxStore = (BoxStore) C9051f.m15203b().m15204a(this.f13262a.getClass(), "__boxStore").get(this.f13262a);
                this.f13265d = boxStore;
                if (boxStore == null) {
                    if (obj != null) {
                        this.f13265d = (BoxStore) C9051f.m15203b().m15204a(obj.getClass(), "__boxStore").get(obj);
                    }
                    if (this.f13265d == null) {
                        throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                    }
                }
                this.f13273l = this.f13265d.m12972D();
                this.f13266e = this.f13265d.m12981h(this.f13263b.f13238a.mo6271e());
                this.f13267f = this.f13265d.m12981h(this.f13263b.f13239b.mo6271e());
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public int hashCode() {
        long jM13066m = m13066m();
        return (int) (jM13066m ^ (jM13066m >>> 32));
    }

    /* renamed from: j */
    public Object m13064j() {
        return m13065k(m13066m());
    }

    /* renamed from: k */
    public Object m13065k(long j10) {
        synchronized (this) {
            try {
                if (this.f13271j == j10) {
                    return this.f13269h;
                }
                m13063f(null);
                Object objM15036c = this.f13267f.m15036c(j10);
                m13070s(objM15036c, j10);
                return objM15036c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public long m13066m() {
        if (this.f13264c) {
            return this.f13270i;
        }
        Field fieldM13067o = m13067o();
        try {
            Long l10 = (Long) fieldM13067o.get(this.f13262a);
            if (l10 != null) {
                return l10.longValue();
            }
            return 0L;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + fieldM13067o);
        }
    }

    /* renamed from: o */
    public final Field m13067o() {
        if (this.f13268g == null) {
            this.f13268g = C9051f.m15203b().m15204a(this.f13262a.getClass(), this.f13263b.f13240c.f13194e);
        }
        return this.f13268g;
    }

    /* renamed from: q */
    public void m13068q(Cursor cursor) throws IllegalAccessException, IllegalArgumentException {
        this.f13272k = false;
        long jMo6265p = cursor.mo6265p(this.f13269h);
        setTargetId(jMo6265p);
        m13070s(this.f13269h, jMo6265p);
    }

    /* renamed from: r */
    public boolean m13069r() {
        return this.f13272k && this.f13269h != null && m13066m() == 0;
    }

    /* renamed from: s */
    public final synchronized void m13070s(Object obj, long j10) {
        try {
            if (this.f13273l) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("Setting resolved ToOne target to ");
                sb.append(obj == null ? "null" : "non-null");
                sb.append(" for ID ");
                sb.append(j10);
                printStream.println(sb.toString());
            }
            this.f13271j = j10;
            this.f13269h = obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setTargetId(long j10) throws IllegalAccessException, IllegalArgumentException {
        if (this.f13264c) {
            this.f13270i = j10;
        } else {
            try {
                m13067o().set(this.f13262a, Long.valueOf(j10));
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Could not update to-one ID in entity", e10);
            }
        }
        if (j10 != 0) {
            this.f13272k = false;
        }
    }

    /* renamed from: t */
    public void m13071t(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            setTargetId(0L);
            m13062a();
        } else {
            long jMo6279a = this.f13263b.f13239b.mo6274i().mo6279a(obj);
            this.f13272k = jMo6279a == 0;
            setTargetId(jMo6279a);
            m13070s(obj, jMo6279a);
        }
    }
}
