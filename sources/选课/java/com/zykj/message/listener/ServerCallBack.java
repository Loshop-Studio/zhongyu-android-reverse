package com.zykj.message.listener;

import com.zykj.message.client.BuildConfig;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;

/* compiled from: ServerCallBack.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, m18d2 = {"Lcom/zykj/message/listener/ServerCallBack;", "Lcom/zykj/message/listener/BaseMessageCallBack;", "()V", "userInfoUpdate", BuildConfig.FLAVOR, "userInfo", "Lcom/zykj/message/server/bean/UserInfo;", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class ServerCallBack extends BaseMessageCallBack {
    @Override // com.zykj.message.server.MessageCallBack
    public void userInfoUpdate(UserInfo userInfo) {
    }
}
