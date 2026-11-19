package p093k5;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6355a;
import p058f5.C6366f0;
import p058f5.C6384w;
import p065g5.AbstractC6422f;
import p065g5.AbstractC6427k;

/* renamed from: k5.v */
/* loaded from: classes4.dex */
public final class C6699v {

    /* renamed from: i */
    public static final a f8966i = new a(null);

    /* renamed from: a */
    public final C6355a f8967a;

    /* renamed from: b */
    public final C6697t f8968b;

    /* renamed from: c */
    public final InterfaceC6684g f8969c;

    /* renamed from: d */
    public final boolean f8970d;

    /* renamed from: e */
    public List f8971e;

    /* renamed from: f */
    public int f8972f;

    /* renamed from: g */
    public List f8973g;

    /* renamed from: h */
    public final List f8974h;

    /* renamed from: k5.v$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m7874a(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }

        public a() {
        }
    }

    /* renamed from: k5.v$b */
    public static final class b {

        /* renamed from: a */
        public final List f8975a;

        /* renamed from: b */
        public int f8976b;

        public b(List routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f8975a = routes;
        }

        /* renamed from: a */
        public final List m7875a() {
            return this.f8975a;
        }

        /* renamed from: b */
        public final boolean m7876b() {
            return this.f8976b < this.f8975a.size();
        }

        /* renamed from: c */
        public final C6366f0 m7877c() {
            if (!m7876b()) {
                throw new NoSuchElementException();
            }
            List list = this.f8975a;
            int i6 = this.f8976b;
            this.f8976b = i6 + 1;
            return (C6366f0) list.get(i6);
        }
    }

    public C6699v(C6355a address, C6697t routeDatabase, InterfaceC6684g connectionUser, boolean z6) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        this.f8967a = address;
        this.f8968b = routeDatabase;
        this.f8969c = connectionUser;
        this.f8970d = z6;
        this.f8971e = CollectionsKt.emptyList();
        this.f8973g = CollectionsKt.emptyList();
        this.f8974h = new ArrayList();
        m7873f(address.m6486l(), address.m6481g());
    }

    /* renamed from: g */
    public static final List m7867g(Proxy proxy, C6384w c6384w, C6699v c6699v) {
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI uriM6833r = c6384w.m6833r();
        if (uriM6833r.getHost() == null) {
            return AbstractC6427k.m7024l(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = c6699v.f8967a.m6483i().select(uriM6833r);
        return (listSelect == null || listSelect.isEmpty()) ? AbstractC6427k.m7024l(Proxy.NO_PROXY) : AbstractC6427k.m7034v(listSelect);
    }

    /* renamed from: a */
    public final boolean m7868a() {
        return m7869b() || !this.f8974h.isEmpty();
    }

    /* renamed from: b */
    public final boolean m7869b() {
        return this.f8972f < this.f8971e.size();
    }

    /* renamed from: c */
    public final b m7870c() {
        if (!m7868a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m7869b()) {
            Proxy proxyM7871d = m7871d();
            Iterator it = this.f8973g.iterator();
            while (it.hasNext()) {
                C6366f0 c6366f0 = new C6366f0(this.f8967a, proxyM7871d, (InetSocketAddress) it.next());
                if (this.f8968b.m7859c(c6366f0)) {
                    this.f8974h.add(c6366f0);
                } else {
                    arrayList.add(c6366f0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f8974h);
            this.f8974h.clear();
        }
        return new b(arrayList);
    }

    /* renamed from: d */
    public final Proxy m7871d() throws SocketException, UnknownHostException {
        if (m7869b()) {
            List list = this.f8971e;
            int i6 = this.f8972f;
            this.f8972f = i6 + 1;
            Proxy proxy = (Proxy) list.get(i6);
            m7872e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f8967a.m6486l().m6823h() + "; exhausted proxy configurations: " + this.f8971e);
    }

    /* renamed from: e */
    public final void m7872e(Proxy proxy) throws SocketException, UnknownHostException {
        String strM6823h;
        int iM6828m;
        List listMo6762a;
        ArrayList arrayList = new ArrayList();
        this.f8973g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM6823h = this.f8967a.m6486l().m6823h();
            iM6828m = this.f8967a.m6486l().m6828m();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strM6823h = f8966i.m7874a(inetSocketAddress);
            iM6828m = inetSocketAddress.getPort();
        }
        if (1 > iM6828m || iM6828m >= 65536) {
            throw new SocketException("No route to " + strM6823h + ':' + iM6828m + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strM6823h, iM6828m));
            return;
        }
        if (AbstractC6422f.m6970a(strM6823h)) {
            listMo6762a = CollectionsKt.listOf(InetAddress.getByName(strM6823h));
        } else {
            this.f8969c.mo7692l(strM6823h);
            listMo6762a = this.f8967a.m6477c().mo6762a(strM6823h);
            if (listMo6762a.isEmpty()) {
                throw new UnknownHostException(this.f8967a.m6477c() + " returned no addresses for " + strM6823h);
            }
            this.f8969c.mo7683c(strM6823h, listMo6762a);
        }
        if (this.f8970d) {
            listMo6762a = AbstractC6690m.m7775a(listMo6762a);
        }
        Iterator it = listMo6762a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM6828m));
        }
    }

    /* renamed from: f */
    public final void m7873f(C6384w c6384w, Proxy proxy) {
        this.f8969c.mo7681a(c6384w);
        List listM7867g = m7867g(proxy, c6384w, this);
        this.f8971e = listM7867g;
        this.f8972f = 0;
        this.f8969c.mo7687g(c6384w, listM7867g);
    }
}
