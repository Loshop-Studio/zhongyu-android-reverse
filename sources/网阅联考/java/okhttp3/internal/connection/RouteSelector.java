package okhttp3.internal.connection;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p117r2.AbstractC4514q;
import p117r2.C4495a;
import p117r2.C4500c0;
import p117r2.C4517t;
import p117r2.InterfaceC4502e;
import p121s2.AbstractC4550b;
import p137w2.C4648h;

/* loaded from: classes2.dex */
public final class RouteSelector {

    /* renamed from: i */
    public static final C4431a f5082i = new C4431a(null);

    /* renamed from: a */
    public List f5083a;

    /* renamed from: b */
    public int f5084b;

    /* renamed from: c */
    public List f5085c;

    /* renamed from: d */
    public final List f5086d;

    /* renamed from: e */
    public final C4495a f5087e;

    /* renamed from: f */
    public final C4648h f5088f;

    /* renamed from: g */
    public final InterfaceC4502e f5089g;

    /* renamed from: h */
    public final AbstractC4514q f5090h;

    /* renamed from: okhttp3.internal.connection.RouteSelector$a */
    public static final class C4431a {
        public C4431a() {
        }

        public /* synthetic */ C4431a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m5630a(InetSocketAddress socketHost) {
            Intrinsics.checkNotNullParameter(socketHost, "$this$socketHost");
            InetAddress address = socketHost.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = socketHost.getHostName();
            Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
            return hostName;
        }
    }

    /* renamed from: okhttp3.internal.connection.RouteSelector$b */
    public static final class C4432b {

        /* renamed from: a */
        public int f5091a;

        /* renamed from: b */
        public final List f5092b;

        public C4432b(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f5092b = routes;
        }

        /* renamed from: a */
        public final List m5631a() {
            return this.f5092b;
        }

        /* renamed from: b */
        public final boolean m5632b() {
            return this.f5091a < this.f5092b.size();
        }

        /* renamed from: c */
        public final C4500c0 m5633c() {
            if (!m5632b()) {
                throw new NoSuchElementException();
            }
            List list = this.f5092b;
            int i4 = this.f5091a;
            this.f5091a = i4 + 1;
            return (C4500c0) list.get(i4);
        }
    }

    public RouteSelector(C4495a address, C4648h routeDatabase, InterfaceC4502e call, AbstractC4514q eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f5087e = address;
        this.f5088f = routeDatabase;
        this.f5089g = call;
        this.f5090h = eventListener;
        this.f5083a = CollectionsKt__CollectionsKt.emptyList();
        this.f5085c = CollectionsKt__CollectionsKt.emptyList();
        this.f5086d = new ArrayList();
        m5629g(address.m5798l(), address.m5793g());
    }

    /* renamed from: b */
    public final boolean m5624b() {
        return m5625c() || (this.f5086d.isEmpty() ^ true);
    }

    /* renamed from: c */
    public final boolean m5625c() {
        return this.f5084b < this.f5083a.size();
    }

    /* renamed from: d */
    public final C4432b m5626d() throws SocketException, UnknownHostException {
        if (!m5624b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m5625c()) {
            Proxy proxyM5627e = m5627e();
            Iterator it = this.f5085c.iterator();
            while (it.hasNext()) {
                C4500c0 c4500c0 = new C4500c0(this.f5087e, proxyM5627e, (InetSocketAddress) it.next());
                if (this.f5088f.m6542c(c4500c0)) {
                    this.f5086d.add(c4500c0);
                } else {
                    arrayList.add(c4500c0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f5086d);
            this.f5086d.clear();
        }
        return new C4432b(arrayList);
    }

    /* renamed from: e */
    public final Proxy m5627e() throws SocketException, UnknownHostException {
        if (m5625c()) {
            List list = this.f5083a;
            int i4 = this.f5084b;
            this.f5084b = i4 + 1;
            Proxy proxy = (Proxy) list.get(i4);
            m5628f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f5087e.m5798l().m5987i() + "; exhausted proxy configurations: " + this.f5083a);
    }

    /* renamed from: f */
    public final void m5628f(Proxy proxy) throws SocketException, UnknownHostException {
        String strM5987i;
        int iM5992n;
        ArrayList arrayList = new ArrayList();
        this.f5085c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM5987i = this.f5087e.m5798l().m5987i();
            iM5992n = this.f5087e.m5798l().m5992n();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strM5987i = f5082i.m5630a(inetSocketAddress);
            iM5992n = inetSocketAddress.getPort();
        }
        if (1 > iM5992n || 65535 < iM5992n) {
            throw new SocketException("No route to " + strM5987i + ':' + iM5992n + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM5987i, iM5992n));
            return;
        }
        this.f5090h.m5939m(this.f5089g, strM5987i);
        List listMo5924a = this.f5087e.m5789c().mo5924a(strM5987i);
        if (listMo5924a.isEmpty()) {
            throw new UnknownHostException(this.f5087e.m5789c() + " returned no addresses for " + strM5987i);
        }
        this.f5090h.m5938l(this.f5089g, strM5987i, listMo5924a);
        Iterator it = listMo5924a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM5992n));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.connection.RouteSelector$resetNextProxy$1] */
    /* renamed from: g */
    public final void m5629g(final C4517t c4517t, final Proxy proxy) {
        ?? r02 = new Function0<List<? extends Proxy>>() { // from class: okhttp3.internal.connection.RouteSelector$resetNextProxy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                Proxy proxy2 = proxy;
                if (proxy2 != null) {
                    return CollectionsKt__CollectionsJVMKt.listOf(proxy2);
                }
                URI uriM5997s = c4517t.m5997s();
                if (uriM5997s.getHost() == null) {
                    return AbstractC4550b.m6238t(Proxy.NO_PROXY);
                }
                List<Proxy> listSelect = this.f5093a.f5087e.m5795i().select(uriM5997s);
                return listSelect == null || listSelect.isEmpty() ? AbstractC4550b.m6238t(Proxy.NO_PROXY) : AbstractC4550b.m6211N(listSelect);
            }
        };
        this.f5090h.m5941o(this.f5089g, c4517t);
        List listM5634a = r02.invoke();
        this.f5083a = listM5634a;
        this.f5084b = 0;
        this.f5090h.m5940n(this.f5089g, c4517t, listM5634a);
    }
}
