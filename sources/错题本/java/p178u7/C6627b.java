package p178u7;

import kotlin.jvm.internal.AbstractC5830k;
import okio.ByteString;

/* renamed from: u7.b */
/* loaded from: classes4.dex */
public final class C6627b {

    /* renamed from: d */
    public static final ByteString f11091d;

    /* renamed from: e */
    public static final ByteString f11092e;

    /* renamed from: f */
    public static final ByteString f11093f;

    /* renamed from: g */
    public static final ByteString f11094g;

    /* renamed from: h */
    public static final ByteString f11095h;

    /* renamed from: i */
    public static final ByteString f11096i;

    /* renamed from: a */
    public final ByteString f11097a;

    /* renamed from: b */
    public final ByteString f11098b;

    /* renamed from: c */
    public final int f11099c;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f11091d = companion.encodeUtf8(":");
        f11092e = companion.encodeUtf8(":status");
        f11093f = companion.encodeUtf8(":method");
        f11094g = companion.encodeUtf8(":path");
        f11095h = companion.encodeUtf8(":scheme");
        f11096i = companion.encodeUtf8(":authority");
    }

    public C6627b(ByteString name, ByteString value) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(value, "value");
        this.f11097a = name;
        this.f11098b = value;
        this.f11099c = value.size() + name.size() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6627b)) {
            return false;
        }
        C6627b c6627b = (C6627b) obj;
        return AbstractC5830k.m5325b(this.f11097a, c6627b.f11097a) && AbstractC5830k.m5325b(this.f11098b, c6627b.f11098b);
    }

    public final int hashCode() {
        return this.f11098b.hashCode() + (this.f11097a.hashCode() * 31);
    }

    public final String toString() {
        return this.f11097a.utf8() + ": " + this.f11098b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6627b(String name, String value) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6627b(String value, ByteString name) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(value, "value");
    }
}
