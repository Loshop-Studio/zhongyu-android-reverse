package com.zykj.huiwei.launcher.api;

import com.zykj.http.bean.ApiResp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4515f;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/WhiteUrlService;", "", "getWhiteList", "Lcom/zykj/http/bean/ApiResp;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface WhiteUrlService {
    @InterfaceC4515f("api/services/app/WebWhiteList/GetAllWhiteUrlAsync")
    Object getWhiteList(Continuation<? super ApiResp<String>> continuation);
}
