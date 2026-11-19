package com.zykj.message.client;

import kotlin.Metadata;

/* compiled from: DataCallBack.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m18d2 = {"Lcom/zykj/message/client/DataCallBack;", "T", BuildConfig.FLAVOR, "response", BuildConfig.FLAVOR, "t", "(Ljava/lang/Object;)V", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public interface DataCallBack<T> {
    void response(T t);
}
