package p256t8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: t8.a */
/* loaded from: classes5.dex */
public final class C9636a {

    /* renamed from: d */
    public static final a f16919d = new a(null);

    /* renamed from: e */
    public static final ByteString f16920e;

    /* renamed from: f */
    public static final ByteString f16921f;

    /* renamed from: g */
    public static final ByteString f16922g;

    /* renamed from: h */
    public static final ByteString f16923h;

    /* renamed from: i */
    public static final ByteString f16924i;

    /* renamed from: j */
    public static final ByteString f16925j;

    /* renamed from: a */
    public final ByteString f16926a;

    /* renamed from: b */
    public final ByteString f16927b;

    /* renamed from: c */
    public final int f16928c;

    /* renamed from: t8.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f16920e = companion.encodeUtf8(":");
        f16921f = companion.encodeUtf8(":status");
        f16922g = companion.encodeUtf8(":method");
        f16923h = companion.encodeUtf8(":path");
        f16924i = companion.encodeUtf8(":scheme");
        f16925j = companion.encodeUtf8(":authority");
    }

    public C9636a(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16926a = name;
        this.f16927b = value;
        this.f16928c = name.size() + 32 + value.size();
    }

    /* renamed from: a */
    public final ByteString m15910a() {
        return this.f16926a;
    }

    /* renamed from: b */
    public final ByteString m15911b() {
        return this.f16927b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9636a)) {
            return false;
        }
        C9636a c9636a = (C9636a) obj;
        return Intrinsics.areEqual(this.f16926a, c9636a.f16926a) && Intrinsics.areEqual(this.f16927b, c9636a.f16927b);
    }

    public int hashCode() {
        return (this.f16926a.hashCode() * 31) + this.f16927b.hashCode();
    }

    public String toString() {
        return this.f16926a.utf8() + ": " + this.f16927b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9636a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9636a(ByteString name, String value) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
