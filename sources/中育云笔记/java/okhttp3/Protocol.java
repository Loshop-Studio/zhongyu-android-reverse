package okhttp3;

import anet.channel.entity.ConnType;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC(ConnType.QUIC);


    /* renamed from: d */
    public static final C10493a f24957d = new C10493a(null);

    /* renamed from: c */
    public final String f24965c;

    /* renamed from: okhttp3.Protocol$a */
    public static final class C10493a {
        public /* synthetic */ C10493a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Protocol m21955a(String protocol) throws IOException {
            AbstractC9979u.m20294g(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (AbstractC9979u.m20289b(protocol, protocol2.f24965c)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.HTTP_1_1;
            if (AbstractC9979u.m20289b(protocol, protocol3.f24965c)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (AbstractC9979u.m20289b(protocol, protocol4.f24965c)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.HTTP_2;
            if (AbstractC9979u.m20289b(protocol, protocol5.f24965c)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.SPDY_3;
            if (AbstractC9979u.m20289b(protocol, protocol6.f24965c)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.QUIC;
            if (AbstractC9979u.m20289b(protocol, protocol7.f24965c)) {
                return protocol7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public C10493a() {
        }
    }

    Protocol(String str) {
        this.f24965c = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24965c;
    }
}
