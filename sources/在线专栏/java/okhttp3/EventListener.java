package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    public interface Factory {
        @NotNull
        EventListener create(@NotNull Call call);
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response cachedResponse) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(response, "response");
    }

    public void cacheMiss(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void callEnd(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void callFailed(@NotNull Call call, @NotNull IOException ioe) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(ioe, "ioe");
    }

    public void callStart(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void canceled(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(inetSocketAddress, "inetSocketAddress");
        C2769l.m9241e(proxy, "proxy");
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(inetSocketAddress, "inetSocketAddress");
        C2769l.m9241e(proxy, "proxy");
        C2769l.m9241e(ioe, "ioe");
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(inetSocketAddress, "inetSocketAddress");
        C2769l.m9241e(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(connection, "connection");
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(connection, "connection");
    }

    public void dnsEnd(@NotNull Call call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(domainName, "domainName");
        C2769l.m9241e(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@NotNull Call call, @NotNull String domainName) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(domainName, "domainName");
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl url, @NotNull List<Proxy> proxies) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(url, "url");
        C2769l.m9241e(proxies, "proxies");
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl url) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(url, "url");
    }

    public void requestBodyEnd(@NotNull Call call, long j4) {
        C2769l.m9241e(call, "call");
    }

    public void requestBodyStart(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException ioe) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(ioe, "ioe");
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(request, "request");
    }

    public void requestHeadersStart(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void responseBodyEnd(@NotNull Call call, long j4) {
        C2769l.m9241e(call, "call");
    }

    public void responseBodyStart(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException ioe) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(ioe, "ioe");
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(response, "response");
    }

    public void responseHeadersStart(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(response, "response");
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        C2769l.m9241e(call, "call");
    }

    public void secureConnectStart(@NotNull Call call) {
        C2769l.m9241e(call, "call");
    }
}
