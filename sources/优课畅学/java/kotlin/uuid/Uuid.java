package kotlin.uuid;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p123h7.C8731k;

/* loaded from: classes5.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {

    /* renamed from: c */
    public static final C9141a f17537c = new C9141a(null);

    /* renamed from: d */
    public static final Uuid f17538d = new Uuid(0, 0);

    /* renamed from: a */
    public final long f17539a;

    /* renamed from: b */
    public final long f17540b;

    /* renamed from: kotlin.uuid.Uuid$a */
    public static final class C9141a {
        public /* synthetic */ C9141a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final Uuid m16198a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? m16199b() : new Uuid(j10, j11, null);
        }

        /* renamed from: b */
        public final Uuid m16199b() {
            return Uuid.f17538d;
        }

        /* renamed from: c */
        public final Uuid m16200c(String uuidString) {
            AbstractC9133u.m16133g(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return AbstractC9143a.m16203c(uuidString);
            }
            if (length == 36) {
                return AbstractC9143a.m16204d(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + AbstractC9144b.m16208h(uuidString, 64) + "\" of length " + uuidString.length());
        }

        public C9141a() {
        }
    }

    public /* synthetic */ Uuid(long j10, long j11, AbstractC9126n abstractC9126n) {
        this(j10, j11);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return AbstractC9143a.m16202b(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Uuid other) {
        AbstractC9133u.m16133g(other, "other");
        long j10 = this.f17539a;
        return j10 != other.f17539a ? Long.compare(C8731k.m14278b(j10) ^ Long.MIN_VALUE, C8731k.m14278b(other.f17539a) ^ Long.MIN_VALUE) : Long.compare(C8731k.m14278b(this.f17540b) ^ Long.MIN_VALUE, C8731k.m14278b(other.f17540b) ^ Long.MIN_VALUE);
    }

    /* renamed from: c */
    public final long m16195c() {
        return this.f17540b;
    }

    /* renamed from: d */
    public final long m16196d() {
        return this.f17539a;
    }

    /* renamed from: e */
    public final String m16197e() {
        byte[] bArr = new byte[36];
        AbstractC9143a.m16201a(this.f17539a, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC9143a.m16201a(this.f17539a, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC9143a.m16201a(this.f17539a, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC9143a.m16201a(this.f17540b, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC9143a.m16201a(this.f17540b, bArr, 24, 2, 8);
        return AbstractC8687z.m14109x(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.f17539a == uuid.f17539a && this.f17540b == uuid.f17540b;
    }

    public int hashCode() {
        return Long.hashCode(this.f17539a ^ this.f17540b);
    }

    public String toString() {
        return m16197e();
    }

    public Uuid(long j10, long j11) {
        this.f17539a = j10;
        this.f17540b = j11;
    }
}
