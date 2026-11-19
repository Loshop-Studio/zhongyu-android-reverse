package p085d6;

import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d6.b */
/* loaded from: classes4.dex */
public final class BinderC7755b extends AbstractBinderC7754a {

    /* renamed from: b */
    public final Function1 f13073b;

    /* renamed from: c */
    public final Function1 f13074c;

    public BinderC7755b(Function1 serverCallBack, Function1 userCallBack) {
        Intrinsics.checkParameterIsNotNull(serverCallBack, "serverCallBack");
        Intrinsics.checkParameterIsNotNull(userCallBack, "userCallBack");
        this.f13073b = serverCallBack;
        this.f13074c = userCallBack;
    }

    @Override // p096e6.InterfaceC7851a
    /* renamed from: b */
    public void mo12111b(UserInfo userInfo) {
        this.f13074c.invoke(userInfo);
    }

    @Override // p096e6.InterfaceC7851a
    /* renamed from: d */
    public void mo9856d(ServerInfo serverInfo) {
        this.f13073b.invoke(serverInfo);
    }
}
