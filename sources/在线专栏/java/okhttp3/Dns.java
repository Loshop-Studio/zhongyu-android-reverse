package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.C2725h;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface Dns {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Dns SYSTEM = new Companion.DnsSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            @NotNull
            public List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException {
                C2769l.m9241e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    C2769l.m9240d(allByName, "InetAddress.getAllByName(hostname)");
                    return C2725h.m9103w(allByName);
                } catch (NullPointerException e4) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e4);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    @NotNull
    List<InetAddress> lookup(@NotNull String str) throws UnknownHostException;
}
