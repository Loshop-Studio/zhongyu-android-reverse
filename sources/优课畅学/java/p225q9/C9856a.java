package p225q9;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.ByteString;

/* renamed from: q9.a */
/* loaded from: classes5.dex */
public final class C9856a {

    /* renamed from: d */
    public static final a f19661d = new a(null);

    /* renamed from: e */
    public static final ByteString f19662e;

    /* renamed from: f */
    public static final ByteString f19663f;

    /* renamed from: g */
    public static final ByteString f19664g;

    /* renamed from: h */
    public static final ByteString f19665h;

    /* renamed from: i */
    public static final ByteString f19666i;

    /* renamed from: j */
    public static final ByteString f19667j;

    /* renamed from: a */
    public final ByteString f19668a;

    /* renamed from: b */
    public final ByteString f19669b;

    /* renamed from: c */
    public final int f19670c;

    /* renamed from: q9.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.Companion;
        f19662e = companion.encodeUtf8(":");
        f19663f = companion.encodeUtf8(":status");
        f19664g = companion.encodeUtf8(":method");
        f19665h = companion.encodeUtf8(":path");
        f19666i = companion.encodeUtf8(":scheme");
        f19667j = companion.encodeUtf8(":authority");
    }

    public C9856a(ByteString name, ByteString value) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(value, "value");
        this.f19668a = name;
        this.f19669b = value;
        this.f19670c = name.size() + 32 + value.size();
    }

    /* renamed from: a */
    public final ByteString m18374a() {
        return this.f19668a;
    }

    /* renamed from: b */
    public final ByteString m18375b() {
        return this.f19669b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9856a)) {
            return false;
        }
        C9856a c9856a = (C9856a) obj;
        return AbstractC9133u.m16128b(this.f19668a, c9856a.f19668a) && AbstractC9133u.m16128b(this.f19669b, c9856a.f19669b);
    }

    public int hashCode() {
        return (this.f19668a.hashCode() * 31) + this.f19669b.hashCode();
    }

    public String toString() {
        return this.f19668a.utf8() + ": " + this.f19669b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9856a(String name, String value) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(value, "value");
        ByteString.Companion companion = ByteString.Companion;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9856a(ByteString name, String value) {
        this(name, ByteString.Companion.encodeUtf8(value));
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(value, "value");
    }
}
