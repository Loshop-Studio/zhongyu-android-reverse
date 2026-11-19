package p149z2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: z2.a */
/* loaded from: classes2.dex */
public final class C4708a {

    /* renamed from: d */
    public static final ByteString f6067d;

    /* renamed from: e */
    public static final ByteString f6068e;

    /* renamed from: f */
    public static final ByteString f6069f;

    /* renamed from: g */
    public static final ByteString f6070g;

    /* renamed from: h */
    public static final ByteString f6071h;

    /* renamed from: i */
    public static final ByteString f6072i;

    /* renamed from: j */
    public static final a f6073j = new a(null);

    /* renamed from: a */
    public final int f6074a;

    /* renamed from: b */
    public final ByteString f6075b;

    /* renamed from: c */
    public final ByteString f6076c;

    /* renamed from: z2.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f6067d = companion.encodeUtf8(":");
        f6068e = companion.encodeUtf8(":status");
        f6069f = companion.encodeUtf8(":method");
        f6070g = companion.encodeUtf8(":path");
        f6071h = companion.encodeUtf8(":scheme");
        f6072i = companion.encodeUtf8(":authority");
    }

    public C4708a(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6075b = name;
        this.f6076c = value;
        this.f6074a = name.size() + 32 + value.size();
    }

    /* renamed from: a */
    public final ByteString m6709a() {
        return this.f6075b;
    }

    /* renamed from: b */
    public final ByteString m6710b() {
        return this.f6076c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4708a)) {
            return false;
        }
        C4708a c4708a = (C4708a) obj;
        return Intrinsics.areEqual(this.f6075b, c4708a.f6075b) && Intrinsics.areEqual(this.f6076c, c4708a.f6076c);
    }

    public int hashCode() {
        ByteString byteString = this.f6075b;
        int iHashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.f6076c;
        return iHashCode + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    public String toString() {
        return this.f6075b.utf8() + ": " + this.f6076c.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4708a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4708a(ByteString name, String value) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
