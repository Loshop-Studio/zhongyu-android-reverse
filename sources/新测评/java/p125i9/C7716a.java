package p125i9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: i9.a */
/* loaded from: classes5.dex */
public final class C7716a {

    /* renamed from: d */
    public static final a f13089d = new a(null);

    /* renamed from: e */
    public static final ByteString f13090e;

    /* renamed from: f */
    public static final ByteString f13091f;

    /* renamed from: g */
    public static final ByteString f13092g;

    /* renamed from: h */
    public static final ByteString f13093h;

    /* renamed from: i */
    public static final ByteString f13094i;

    /* renamed from: j */
    public static final ByteString f13095j;

    /* renamed from: a */
    public final ByteString f13096a;

    /* renamed from: b */
    public final ByteString f13097b;

    /* renamed from: c */
    public final int f13098c;

    /* renamed from: i9.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f13090e = companion.encodeUtf8(":");
        f13091f = companion.encodeUtf8(":status");
        f13092g = companion.encodeUtf8(":method");
        f13093h = companion.encodeUtf8(":path");
        f13094i = companion.encodeUtf8(":scheme");
        f13095j = companion.encodeUtf8(":authority");
    }

    public C7716a(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f13096a = name;
        this.f13097b = value;
        this.f13098c = name.size() + 32 + value.size();
    }

    /* renamed from: a */
    public final ByteString m12891a() {
        return this.f13096a;
    }

    /* renamed from: b */
    public final ByteString m12892b() {
        return this.f13097b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7716a)) {
            return false;
        }
        C7716a c7716a = (C7716a) obj;
        return Intrinsics.areEqual(this.f13096a, c7716a.f13096a) && Intrinsics.areEqual(this.f13097b, c7716a.f13097b);
    }

    public int hashCode() {
        return (this.f13096a.hashCode() * 31) + this.f13097b.hashCode();
    }

    public String toString() {
        return this.f13096a.utf8() + ": " + this.f13097b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7716a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7716a(ByteString name, String value) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
