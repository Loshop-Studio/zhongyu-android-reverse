package kotlin.uuid;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10781l;
import p310qd.AbstractC10819z;

/* loaded from: classes6.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {

    /* renamed from: e */
    public static final C9987a f23466e = new C9987a(null);

    /* renamed from: f */
    public static final Uuid f23467f = new Uuid(0, 0);

    /* renamed from: c */
    public final long f23468c;

    /* renamed from: d */
    public final long f23469d;

    /* renamed from: kotlin.uuid.Uuid$a */
    public static final class C9987a {
        public /* synthetic */ C9987a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Uuid m20358a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? m20359b() : new Uuid(j10, j11, null);
        }

        /* renamed from: b */
        public final Uuid m20359b() {
            return Uuid.f23467f;
        }

        /* renamed from: c */
        public final Uuid m20360c(String uuidString) {
            AbstractC9979u.m20294g(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return AbstractC9989a.m20363c(uuidString);
            }
            if (length == 36) {
                return AbstractC9989a.m20364d(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + AbstractC9990b.m20368h(uuidString, 64) + "\" of length " + uuidString.length());
        }

        public C9987a() {
        }
    }

    public /* synthetic */ Uuid(long j10, long j11, AbstractC9972n abstractC9972n) {
        this(j10, j11);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return AbstractC9989a.m20362b(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(Uuid other) {
        AbstractC9979u.m20294g(other, "other");
        long j10 = this.f23468c;
        return j10 != other.f23468c ? Long.compare(C10781l.m23023b(j10) ^ Long.MIN_VALUE, C10781l.m23023b(other.f23468c) ^ Long.MIN_VALUE) : Long.compare(C10781l.m23023b(this.f23469d) ^ Long.MIN_VALUE, C10781l.m23023b(other.f23469d) ^ Long.MIN_VALUE);
    }

    /* renamed from: d */
    public final long m20355d() {
        return this.f23469d;
    }

    /* renamed from: e */
    public final long m20356e() {
        return this.f23468c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.f23468c == uuid.f23468c && this.f23469d == uuid.f23469d;
    }

    /* renamed from: f */
    public final String m20357f() {
        byte[] bArr = new byte[36];
        AbstractC9989a.m20361a(this.f23468c, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC9989a.m20361a(this.f23468c, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC9989a.m20361a(this.f23468c, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC9989a.m20361a(this.f23469d, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC9989a.m20361a(this.f23469d, bArr, 24, 2, 8);
        return AbstractC10819z.m23246x(bArr);
    }

    public int hashCode() {
        return Long.hashCode(this.f23468c ^ this.f23469d);
    }

    public String toString() {
        return m20357f();
    }

    public Uuid(long j10, long j11) {
        this.f23468c = j10;
        this.f23469d = j11;
    }
}
