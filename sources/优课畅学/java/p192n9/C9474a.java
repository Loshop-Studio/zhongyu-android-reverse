package p192n9;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.C9561c;
import okhttp3.Protocol;
import p136i9.AbstractC8920r;
import p136i9.C8907f0;
import p136i9.C8925w;
import p136i9.InterfaceC8912j;
import p203o9.C9552g;

/* renamed from: n9.a */
/* loaded from: classes5.dex */
public final class C9474a implements InterfaceC9480g {

    /* renamed from: a */
    public final C9487n f18694a;

    /* renamed from: b */
    public final AbstractC9479f f18695b;

    /* renamed from: c */
    public final C9552g f18696c;

    public C9474a(C9487n call, AbstractC9479f poolConnectionListener, C9552g chain) {
        AbstractC9133u.m16133g(call, "call");
        AbstractC9133u.m16133g(poolConnectionListener, "poolConnectionListener");
        AbstractC9133u.m16133g(chain, "chain");
        this.f18694a = call;
        this.f18695b = poolConnectionListener;
        this.f18696c = chain;
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: a */
    public void mo17414a(C8907f0 route, Protocol protocol) {
        AbstractC9133u.m16133g(route, "route");
        m17437x().m15234g(this.f18694a, route.m15177d(), route.m15175b(), protocol);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: b */
    public void mo17415b(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        connection.m17549i().m17465h(connection);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: c */
    public void mo17416c(String socketHost, List result) {
        AbstractC9133u.m16133g(socketHost, "socketHost");
        AbstractC9133u.m16133g(result, "result");
        m17437x().m15239l(this.f18694a, socketHost, result);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: d */
    public void mo17417d(C8925w url, List proxies) {
        AbstractC9133u.m16133g(url, "url");
        AbstractC9133u.m16133g(proxies, "proxies");
        m17437x().m15242o(this.f18694a, url, proxies);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: e */
    public void mo17418e(InterfaceC8912j connection, C8907f0 route) {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(route, "route");
        this.f18695b.m17459b(connection, route, this.f18694a);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: f */
    public void mo17419f(C9478e connectPlan) {
        AbstractC9133u.m16133g(connectPlan, "connectPlan");
        this.f18694a.m17527r().add(connectPlan);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: g */
    public void mo17420g(C8907f0 route) {
        AbstractC9133u.m16133g(route, "route");
        this.f18694a.m17521l().m14985u().m17590a(route);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: h */
    public void mo17421h(InterfaceC8912j connection) {
        AbstractC9133u.m16133g(connection, "connection");
        m17437x().m15238k(this.f18694a, connection);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: i */
    public void mo17422i(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        this.f18694a.m17515f(connection);
    }

    @Override // p192n9.InterfaceC9480g
    public boolean isCanceled() {
        return this.f18694a.isCanceled();
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: j */
    public void mo17423j(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        connection.m17549i().m17462e(connection, this.f18694a);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: k */
    public void mo17424k(C8907f0 route) {
        AbstractC9133u.m16133g(route, "route");
        m17437x().m15236i(this.f18694a, route.m15177d(), route.m15175b());
        this.f18695b.m17461d(route, this.f18694a);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: l */
    public boolean mo17425l() {
        return !AbstractC9133u.m16128b(this.f18696c.m17854i().m15048h(), "GET");
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: m */
    public void mo17426m(C9478e connectPlan) {
        AbstractC9133u.m16133g(connectPlan, "connectPlan");
        this.f18694a.m17527r().remove(connectPlan);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: n */
    public void mo17427n(String socketHost) {
        AbstractC9133u.m16133g(socketHost, "socketHost");
        m17437x().m15240m(this.f18694a, socketHost);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: o */
    public void mo17428o(C8925w url) {
        AbstractC9133u.m16133g(url, "url");
        m17437x().m15243p(this.f18694a, url);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: p */
    public void mo17429p(C9561c c9561c) {
        m17437x().m15226C(this.f18694a, c9561c);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: q */
    public void mo17430q(C8907f0 route, Protocol protocol, IOException e10) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(e10, "e");
        m17437x().m15235h(this.f18694a, route.m15177d(), route.m15175b(), null, e10);
        this.f18695b.m17460c(route, this.f18694a, e10);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: r */
    public void mo17431r() {
        m17437x().m15227D(this.f18694a);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: s */
    public Socket mo17432s() {
        return this.f18694a.m17533y();
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: t */
    public void mo17433t(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        connection.m17549i().m17463f(connection);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: u */
    public C9488o mo17434u() {
        return this.f18694a.m17522m();
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: v */
    public void mo17435v(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        connection.m17549i().m17464g(connection, this.f18694a);
    }

    @Override // p192n9.InterfaceC9480g
    /* renamed from: w */
    public void mo17436w(InterfaceC8912j connection) {
        AbstractC9133u.m16133g(connection, "connection");
        m17437x().m15237j(this.f18694a, connection);
    }

    /* renamed from: x */
    public final AbstractC8920r m17437x() {
        return this.f18694a.m17523n();
    }
}
