package p093k5;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C7527c;
import okhttp3.Protocol;
import p058f5.AbstractC6379r;
import p058f5.C6366f0;
import p058f5.C6384w;
import p058f5.InterfaceC6371j;
import p102l5.C7353g;

/* renamed from: k5.a */
/* loaded from: classes4.dex */
public final class C6678a implements InterfaceC6684g {

    /* renamed from: a */
    public final C6691n f8824a;

    /* renamed from: b */
    public final AbstractC6683f f8825b;

    /* renamed from: c */
    public final C7353g f8826c;

    public C6678a(C6691n call, AbstractC6683f poolConnectionListener, C7353g chain) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(poolConnectionListener, "poolConnectionListener");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.f8824a = call;
        this.f8825b = poolConnectionListener;
        this.f8826c = chain;
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: a */
    public void mo7681a(C6384w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        m7704x().m6782p(this.f8824a, url);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: b */
    public void mo7682b(C6682e connectPlan) {
        Intrinsics.checkNotNullParameter(connectPlan, "connectPlan");
        this.f8824a.m7794r().add(connectPlan);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: c */
    public void mo7683c(String socketHost, List result) {
        Intrinsics.checkNotNullParameter(socketHost, "socketHost");
        Intrinsics.checkNotNullParameter(result, "result");
        m7704x().m6778l(this.f8824a, socketHost, result);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: d */
    public void mo7684d(C6366f0 route, Protocol protocol, IOException e6) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(e6, "e");
        m7704x().m6774h(this.f8824a, route.m6716d(), route.m6714b(), null, e6);
        this.f8825b.m7727c(route, this.f8824a, e6);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: e */
    public void mo7685e(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.m7816i().m7731g(connection, this.f8824a);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: f */
    public void mo7686f(C6366f0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f8824a.m7788l().m6521u().m7857a(route);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: g */
    public void mo7687g(C6384w url, List proxies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        m7704x().m6781o(this.f8824a, url, proxies);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: h */
    public void mo7688h(C6366f0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        m7704x().m6775i(this.f8824a, route.m6716d(), route.m6714b());
        this.f8825b.m7728d(route, this.f8824a);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: i */
    public void mo7689i(InterfaceC6371j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        m7704x().m6777k(this.f8824a, connection);
    }

    @Override // p093k5.InterfaceC6684g
    public boolean isCanceled() {
        return this.f8824a.isCanceled();
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: j */
    public void mo7690j(C6682e connectPlan) {
        Intrinsics.checkNotNullParameter(connectPlan, "connectPlan");
        this.f8824a.m7794r().remove(connectPlan);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: k */
    public boolean mo7691k() {
        return !Intrinsics.areEqual(this.f8826c.m8349i().m6584h(), "GET");
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: l */
    public void mo7692l(String socketHost) {
        Intrinsics.checkNotNullParameter(socketHost, "socketHost");
        m7704x().m6779m(this.f8824a, socketHost);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: m */
    public void mo7693m(C7527c c7527c) {
        m7704x().m6765C(this.f8824a, c7527c);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: n */
    public void mo7694n(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.m7816i().m7730f(connection);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: o */
    public void mo7695o(C6366f0 route, Protocol protocol) {
        Intrinsics.checkNotNullParameter(route, "route");
        m7704x().m6773g(this.f8824a, route.m6716d(), route.m6714b(), protocol);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: p */
    public void mo7696p(InterfaceC6371j connection, C6366f0 route) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f8825b.m7726b(connection, route, this.f8824a);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: q */
    public void mo7697q() {
        m7704x().m6766D(this.f8824a);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: r */
    public Socket mo7698r() {
        return this.f8824a.m7800y();
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: s */
    public C6692o mo7699s() {
        return this.f8824a.m7789m();
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: t */
    public void mo7700t(InterfaceC6371j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        m7704x().m6776j(this.f8824a, connection);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: u */
    public void mo7701u(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.m7816i().m7732h(connection);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: v */
    public void mo7702v(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.m7816i().m7729e(connection, this.f8824a);
    }

    @Override // p093k5.InterfaceC6684g
    /* renamed from: w */
    public void mo7703w(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f8824a.m7782e(connection);
    }

    /* renamed from: x */
    public final AbstractC6379r m7704x() {
        return this.f8824a.m7790n();
    }
}
