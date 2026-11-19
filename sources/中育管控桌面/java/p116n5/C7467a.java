package p116n5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: n5.a */
/* loaded from: classes4.dex */
public final class C7467a {

    /* renamed from: d */
    public static final a f9567d = new a(null);

    /* renamed from: e */
    public static final ByteString f9568e;

    /* renamed from: f */
    public static final ByteString f9569f;

    /* renamed from: g */
    public static final ByteString f9570g;

    /* renamed from: h */
    public static final ByteString f9571h;

    /* renamed from: i */
    public static final ByteString f9572i;

    /* renamed from: j */
    public static final ByteString f9573j;

    /* renamed from: a */
    public final ByteString f9574a;

    /* renamed from: b */
    public final ByteString f9575b;

    /* renamed from: c */
    public final int f9576c;

    /* renamed from: n5.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f9568e = companion.encodeUtf8(":");
        f9569f = companion.encodeUtf8(":status");
        f9570g = companion.encodeUtf8(":method");
        f9571h = companion.encodeUtf8(":path");
        f9572i = companion.encodeUtf8(":scheme");
        f9573j = companion.encodeUtf8(":authority");
    }

    public C7467a(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9574a = name;
        this.f9575b = value;
        this.f9576c = name.size() + 32 + value.size();
    }

    /* renamed from: a */
    public final ByteString m8541a() {
        return this.f9574a;
    }

    /* renamed from: b */
    public final ByteString m8542b() {
        return this.f9575b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7467a)) {
            return false;
        }
        C7467a c7467a = (C7467a) obj;
        return Intrinsics.areEqual(this.f9574a, c7467a.f9574a) && Intrinsics.areEqual(this.f9575b, c7467a.f9575b);
    }

    public int hashCode() {
        return (this.f9574a.hashCode() * 31) + this.f9575b.hashCode();
    }

    public String toString() {
        return this.f9574a.utf8() + ": " + this.f9575b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7467a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7467a(ByteString name, String value) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
