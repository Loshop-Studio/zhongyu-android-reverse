package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Route {

    @NotNull
    private final Address address;

    @NotNull
    private final Proxy proxy;

    @NotNull
    private final InetSocketAddress socketAddress;

    public Route(@NotNull Address address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        C2769l.m9241e(address, "address");
        C2769l.m9241e(proxy, "proxy");
        C2769l.m9241e(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @NotNull
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final Address m10869deprecated_address() {
        return this.address;
    }

    @NotNull
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m10870deprecated_proxy() {
        return this.proxy;
    }

    @NotNull
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m10871deprecated_socketAddress() {
        return this.socketAddress;
    }

    @NotNull
    public final Address address() {
        return this.address;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (C2769l.m9237a(route.address, this.address) && C2769l.m9237a(route.proxy, this.proxy) && C2769l.m9237a(route.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @NotNull
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @NotNull
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @NotNull
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
