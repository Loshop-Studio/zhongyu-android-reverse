package okhttp3;

import anet.channel.entity.ConnType;
import java.io.IOException;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC(ConnType.QUIC);

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        @NotNull
        public final Protocol get(@NotNull String protocol) throws IOException {
            C2769l.m9241e(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (!C2769l.m9237a(protocol, protocol2.protocol)) {
                protocol2 = Protocol.HTTP_1_1;
                if (!C2769l.m9237a(protocol, protocol2.protocol)) {
                    protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!C2769l.m9237a(protocol, protocol2.protocol)) {
                        protocol2 = Protocol.HTTP_2;
                        if (!C2769l.m9237a(protocol, protocol2.protocol)) {
                            protocol2 = Protocol.SPDY_3;
                            if (!C2769l.m9237a(protocol, protocol2.protocol)) {
                                protocol2 = Protocol.QUIC;
                                if (!C2769l.m9237a(protocol, protocol2.protocol)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return protocol2;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @NotNull
    public static final Protocol get(@NotNull String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.protocol;
    }
}
