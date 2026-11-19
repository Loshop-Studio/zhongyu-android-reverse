package com.zykj.message.listener;

import com.zykj.message.client.BuildConfig;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultMessageCallBack.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0010"}, m18d2 = {"Lcom/zykj/message/listener/DefaultMessageCallBack;", "Lcom/zykj/message/listener/BaseMessageCallBack;", "serverCallBack", "Lkotlin/Function1;", "Lcom/zykj/message/server/bean/ServerInfo;", BuildConfig.FLAVOR, "userCallBack", "Lcom/zykj/message/server/bean/UserInfo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getServerCallBack", "()Lkotlin/jvm/functions/Function1;", "getUserCallBack", "serverInfoUpdate", "serverInfo", "userInfoUpdate", "userInfo", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class DefaultMessageCallBack extends BaseMessageCallBack {
    private final Function1<ServerInfo, Unit> serverCallBack;
    private final Function1<UserInfo, Unit> userCallBack;

    public final Function1<ServerInfo, Unit> getServerCallBack() {
        return this.serverCallBack;
    }

    public final Function1<UserInfo, Unit> getUserCallBack() {
        return this.userCallBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultMessageCallBack(Function1<? super ServerInfo, Unit> serverCallBack, Function1<? super UserInfo, Unit> userCallBack) {
        Intrinsics.checkParameterIsNotNull(serverCallBack, "serverCallBack");
        Intrinsics.checkParameterIsNotNull(userCallBack, "userCallBack");
        this.serverCallBack = serverCallBack;
        this.userCallBack = userCallBack;
    }

    @Override // com.zykj.message.server.MessageCallBack
    public void serverInfoUpdate(ServerInfo serverInfo) {
        this.serverCallBack.invoke(serverInfo);
    }

    @Override // com.zykj.message.server.MessageCallBack
    public void userInfoUpdate(UserInfo userInfo) {
        this.userCallBack.invoke(userInfo);
    }
}
