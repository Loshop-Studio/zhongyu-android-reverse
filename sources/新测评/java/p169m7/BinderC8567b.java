package p169m7;

import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m7.b */
/* loaded from: classes.dex */
public final class BinderC8567b extends AbstractBinderC8566a {

    /* renamed from: b */
    public final Function1 f14209b;

    /* renamed from: c */
    public final Function1 f14210c;

    public BinderC8567b(Function1 serverCallBack, Function1 userCallBack) {
        Intrinsics.checkParameterIsNotNull(serverCallBack, "serverCallBack");
        Intrinsics.checkParameterIsNotNull(userCallBack, "userCallBack");
        this.f14209b = serverCallBack;
        this.f14210c = userCallBack;
    }

    @Override // p180n7.InterfaceC8668a
    /* renamed from: a */
    public void mo14108a(UserInfo userInfo) {
        this.f14210c.invoke(userInfo);
    }

    @Override // p180n7.InterfaceC8668a
    /* renamed from: e */
    public void mo10590e(ServerInfo serverInfo) {
        this.f14209b.invoke(serverInfo);
    }
}
