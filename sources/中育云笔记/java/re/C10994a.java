package re;

import anet.channel.util.HttpConstant;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.ByteString;

/* renamed from: re.a */
/* loaded from: classes6.dex */
public final class C10994a {

    /* renamed from: d */
    public static final a f26501d = new a(null);

    /* renamed from: e */
    public static final ByteString f26502e;

    /* renamed from: f */
    public static final ByteString f26503f;

    /* renamed from: g */
    public static final ByteString f26504g;

    /* renamed from: h */
    public static final ByteString f26505h;

    /* renamed from: i */
    public static final ByteString f26506i;

    /* renamed from: j */
    public static final ByteString f26507j;

    /* renamed from: a */
    public final ByteString f26508a;

    /* renamed from: b */
    public final ByteString f26509b;

    /* renamed from: c */
    public final int f26510c;

    /* renamed from: re.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.Companion;
        f26502e = companion.encodeUtf8(":");
        f26503f = companion.encodeUtf8(HttpConstant.STATUS);
        f26504g = companion.encodeUtf8(":method");
        f26505h = companion.encodeUtf8(":path");
        f26506i = companion.encodeUtf8(":scheme");
        f26507j = companion.encodeUtf8(":authority");
    }

    public C10994a(ByteString name, ByteString value) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(value, "value");
        this.f26508a = name;
        this.f26509b = value;
        this.f26510c = name.size() + 32 + value.size();
    }

    /* renamed from: a */
    public final ByteString m24245a() {
        return this.f26508a;
    }

    /* renamed from: b */
    public final ByteString m24246b() {
        return this.f26509b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10994a)) {
            return false;
        }
        C10994a c10994a = (C10994a) obj;
        return AbstractC9979u.m20289b(this.f26508a, c10994a.f26508a) && AbstractC9979u.m20289b(this.f26509b, c10994a.f26509b);
    }

    public int hashCode() {
        return (this.f26508a.hashCode() * 31) + this.f26509b.hashCode();
    }

    public String toString() {
        return this.f26508a.utf8() + ": " + this.f26509b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10994a(String name, String value) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(value, "value");
        ByteString.Companion companion = ByteString.Companion;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10994a(ByteString name, String value) {
        this(name, ByteString.Companion.encodeUtf8(value));
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(value, "value");
    }
}
