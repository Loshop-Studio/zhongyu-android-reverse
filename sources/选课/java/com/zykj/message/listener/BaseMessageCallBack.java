package com.zykj.message.listener;

import com.zykj.message.client.BuildConfig;
import com.zykj.message.server.MessageCallBack;
import kotlin.Metadata;

/* compiled from: BaseMessageCallBack.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m18d2 = {"Lcom/zykj/message/listener/BaseMessageCallBack;", "Lcom/zykj/message/server/MessageCallBack$Stub;", "()V", "name", BuildConfig.FLAVOR, "getName", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class BaseMessageCallBack extends MessageCallBack.Stub {
    private final String name = new StringBuilder().append(hashCode()).append('-').append(System.currentTimeMillis()).toString();

    @Override // com.zykj.message.server.MessageCallBack
    public String getName() {
        return this.name;
    }
}
