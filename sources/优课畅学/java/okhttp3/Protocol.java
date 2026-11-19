package okhttp3;

import java.io.IOException;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Protocol {

    /* renamed from: b */
    public static final C9557a f18937b;

    /* renamed from: c */
    public static final Protocol f18938c = new Protocol("HTTP_1_0", 0, "http/1.0");

    /* renamed from: d */
    public static final Protocol f18939d = new Protocol("HTTP_1_1", 1, "http/1.1");

    /* renamed from: e */
    public static final Protocol f18940e = new Protocol("SPDY_3", 2, "spdy/3.1");

    /* renamed from: f */
    public static final Protocol f18941f = new Protocol("HTTP_2", 3, "h2");

    /* renamed from: g */
    public static final Protocol f18942g = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");

    /* renamed from: h */
    public static final Protocol f18943h = new Protocol("QUIC", 5, "quic");

    /* renamed from: i */
    public static final Protocol f18944i = new Protocol("HTTP_3", 6, "h3");

    /* renamed from: j */
    public static final /* synthetic */ Protocol[] f18945j;

    /* renamed from: k */
    public static final /* synthetic */ InterfaceC9760a f18946k;

    /* renamed from: a */
    public final String f18947a;

    /* renamed from: okhttp3.Protocol$a */
    public static final class C9557a {
        public /* synthetic */ C9557a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final Protocol m17869a(String protocol) throws IOException {
            AbstractC9133u.m16133g(protocol, "protocol");
            Protocol protocol2 = Protocol.f18938c;
            if (AbstractC9133u.m16128b(protocol, protocol2.f18947a)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.f18939d;
            if (AbstractC9133u.m16128b(protocol, protocol3.f18947a)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.f18942g;
            if (AbstractC9133u.m16128b(protocol, protocol4.f18947a)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.f18941f;
            if (AbstractC9133u.m16128b(protocol, protocol5.f18947a)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.f18940e;
            if (AbstractC9133u.m16128b(protocol, protocol6.f18947a)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.f18943h;
            if (AbstractC9133u.m16128b(protocol, protocol7.f18947a)) {
                return protocol7;
            }
            Protocol protocol8 = Protocol.f18944i;
            if (AbstractC8687z.m14105M(protocol, protocol8.f18947a, false, 2, null)) {
                return protocol8;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public C9557a() {
        }
    }

    static {
        Protocol[] protocolArrM17867a = m17867a();
        f18945j = protocolArrM17867a;
        f18946k = AbstractC9108a.m16085a(protocolArrM17867a);
        f18937b = new C9557a(null);
    }

    public Protocol(String str, int i10, String str2) {
        this.f18947a = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ Protocol[] m17867a() {
        return new Protocol[]{f18938c, f18939d, f18940e, f18941f, f18942g, f18943h, f18944i};
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) f18945j.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18947a;
    }
}
