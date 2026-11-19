package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m7880d2 = {"Lokhttp3/Protocol;", "", "", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "i", "okhttp"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class Protocol {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c */
    public static final Protocol f9716c = new Protocol("HTTP_1_0", 0, "http/1.0");

    /* renamed from: d */
    public static final Protocol f9717d = new Protocol("HTTP_1_1", 1, "http/1.1");

    /* renamed from: e */
    public static final Protocol f9718e = new Protocol("SPDY_3", 2, "spdy/3.1");

    /* renamed from: f */
    public static final Protocol f9719f = new Protocol("HTTP_2", 3, "h2");

    /* renamed from: g */
    public static final Protocol f9720g = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");

    /* renamed from: h */
    public static final Protocol f9721h = new Protocol("QUIC", 5, "quic");

    /* renamed from: i */
    public static final Protocol f9722i = new Protocol("HTTP_3", 6, "h3");

    /* renamed from: j */
    public static final /* synthetic */ Protocol[] f9723j;

    /* renamed from: k */
    public static final /* synthetic */ EnumEntries f9724k;

    /* renamed from: a, reason: from kotlin metadata */
    public final String protocol;

    /* renamed from: okhttp3.Protocol$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Protocol m8688a(String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Protocol protocol2 = Protocol.f9716c;
            if (Intrinsics.areEqual(protocol, protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.f9717d;
            if (Intrinsics.areEqual(protocol, protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.f9720g;
            if (Intrinsics.areEqual(protocol, protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.f9719f;
            if (Intrinsics.areEqual(protocol, protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.f9718e;
            if (Intrinsics.areEqual(protocol, protocol6.protocol)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.f9721h;
            if (Intrinsics.areEqual(protocol, protocol7.protocol)) {
                return protocol7;
            }
            Protocol protocol8 = Protocol.f9722i;
            if (StringsKt.startsWith$default(protocol, protocol8.protocol, false, 2, (Object) null)) {
                return protocol8;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public Companion() {
        }
    }

    static {
        Protocol[] protocolArrM8686a = m8686a();
        f9723j = protocolArrM8686a;
        f9724k = EnumEntriesKt.enumEntries(protocolArrM8686a);
        INSTANCE = new Companion(null);
    }

    public Protocol(String str, int i6, String str2) {
        this.protocol = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ Protocol[] m8686a() {
        return new Protocol[]{f9716c, f9717d, f9718e, f9719f, f9720g, f9721h, f9722i};
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) f9723j.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
