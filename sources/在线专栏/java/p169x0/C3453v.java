package p169x0;

import androidx.work.C0810a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: x0.v */
/* loaded from: classes.dex */
public final class C3453v {

    /* renamed from: a */
    private UUID f12085a;

    /* renamed from: b */
    private a f12086b;

    /* renamed from: c */
    private C0810a f12087c;

    /* renamed from: d */
    private Set<String> f12088d;

    /* renamed from: e */
    private C0810a f12089e;

    /* renamed from: f */
    private int f12090f;

    /* renamed from: x0.v$a */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: a */
        public boolean m10524a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C3453v(UUID uuid, a aVar, C0810a c0810a, List<String> list, C0810a c0810a2, int i4) {
        this.f12085a = uuid;
        this.f12086b = aVar;
        this.f12087c = c0810a;
        this.f12088d = new HashSet(list);
        this.f12089e = c0810a2;
        this.f12090f = i4;
    }

    /* renamed from: a */
    public UUID m10518a() {
        return this.f12085a;
    }

    /* renamed from: b */
    public C0810a m10519b() {
        return this.f12087c;
    }

    /* renamed from: c */
    public C0810a m10520c() {
        return this.f12089e;
    }

    /* renamed from: d */
    public int m10521d() {
        return this.f12090f;
    }

    /* renamed from: e */
    public a m10522e() {
        return this.f12086b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3453v.class != obj.getClass()) {
            return false;
        }
        C3453v c3453v = (C3453v) obj;
        if (this.f12090f == c3453v.f12090f && this.f12085a.equals(c3453v.f12085a) && this.f12086b == c3453v.f12086b && this.f12087c.equals(c3453v.f12087c) && this.f12088d.equals(c3453v.f12088d)) {
            return this.f12089e.equals(c3453v.f12089e);
        }
        return false;
    }

    /* renamed from: f */
    public Set<String> m10523f() {
        return this.f12088d;
    }

    public int hashCode() {
        return (((((((((this.f12085a.hashCode() * 31) + this.f12086b.hashCode()) * 31) + this.f12087c.hashCode()) * 31) + this.f12088d.hashCode()) * 31) + this.f12089e.hashCode()) * 31) + this.f12090f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f12085a + "', mState=" + this.f12086b + ", mOutputData=" + this.f12087c + ", mTags=" + this.f12088d + ", mProgress=" + this.f12089e + '}';
    }
}
