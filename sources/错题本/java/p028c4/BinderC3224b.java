package p028c4;

import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: c4.b */
/* loaded from: classes3.dex */
public final class BinderC3224b extends AbstractBinderC3223a {

    /* renamed from: d */
    public final InterfaceC6471c f1788d;

    /* renamed from: e */
    public final InterfaceC6471c f1789e;

    public BinderC3224b(InterfaceC6471c serverCallBack, InterfaceC6471c userCallBack) {
        AbstractC5830k.m5331h(serverCallBack, "serverCallBack");
        AbstractC5830k.m5331h(userCallBack, "userCallBack");
        this.f1788d = serverCallBack;
        this.f1789e = userCallBack;
    }

    @Override // p043d4.InterfaceC5419a
    /* renamed from: a */
    public final void mo2169a(UserInfo userInfo) {
        this.f1789e.invoke(userInfo);
    }

    @Override // p043d4.InterfaceC5419a
    /* renamed from: b */
    public final void mo2170b(ServerInfo serverInfo) {
        this.f1788d.invoke(serverInfo);
    }
}
