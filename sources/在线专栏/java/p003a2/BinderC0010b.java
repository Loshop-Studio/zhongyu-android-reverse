package p003a2;

import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: a2.b */
/* loaded from: classes.dex */
public final class BinderC0010b extends AbstractBinderC0009a {

    /* renamed from: b */
    @NotNull
    private final InterfaceC3470l<ServerInfo, C2925r> f54b;

    /* renamed from: c */
    @NotNull
    private final InterfaceC3470l<UserInfo, C2925r> f55c;

    /* JADX WARN: Multi-variable type inference failed */
    public BinderC0010b(@NotNull InterfaceC3470l<? super ServerInfo, C2925r> serverCallBack, @NotNull InterfaceC3470l<? super UserInfo, C2925r> userCallBack) {
        C2769l.m9242f(serverCallBack, "serverCallBack");
        C2769l.m9242f(userCallBack, "userCallBack");
        this.f54b = serverCallBack;
        this.f55c = userCallBack;
    }

    @Override // p013b2.InterfaceC1030a
    /* renamed from: o */
    public void mo60o(@Nullable ServerInfo serverInfo) {
        this.f54b.invoke(serverInfo);
    }

    @Override // p013b2.InterfaceC1030a
    /* renamed from: t */
    public void mo61t(@Nullable UserInfo userInfo) {
        this.f55c.invoke(userInfo);
    }
}
