package com.zykj.huiwei.launcher.api;

import com.zykj.huiwei.launcher.bean.resp.GatewayBean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4528s;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/GatewayService;", "", "gateway", "Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;", "school", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface GatewayService {
    @InterfaceC4515f("api/discovery/{school}")
    Object gateway(@InterfaceC4528s("school") String str, Continuation<? super GatewayBean> continuation);
}
