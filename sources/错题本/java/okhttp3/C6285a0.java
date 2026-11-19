package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: okhttp3.a0 */
/* loaded from: classes4.dex */
public final class C6285a0 {
    /* renamed from: a */
    public static Protocol m5876a(String protocol) throws IOException {
        AbstractC5830k.m5330g(protocol, "protocol");
        Protocol protocol2 = Protocol.HTTP_1_0;
        if (protocol.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = Protocol.HTTP_1_1;
        if (protocol.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
        if (protocol.equals(protocol4.protocol)) {
            return protocol4;
        }
        Protocol protocol5 = Protocol.HTTP_2;
        if (protocol.equals(protocol5.protocol)) {
            return protocol5;
        }
        Protocol protocol6 = Protocol.SPDY_3;
        if (protocol.equals(protocol6.protocol)) {
            return protocol6;
        }
        Protocol protocol7 = Protocol.QUIC;
        if (protocol.equals(protocol7.protocol)) {
            return protocol7;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }
}
