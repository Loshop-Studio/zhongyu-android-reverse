package com.zykj.huiwei.launcher.api;

import com.zykj.http.bean.ApiResp;
import com.zykj.huiwei.launcher.bean.AppType;
import com.zykj.huiwei.launcher.bean.resp.VersionInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4529t;

@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/VersionService;", "", "checkUpdateAsync", "Lcom/zykj/http/bean/ApiResp;", "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;", "packageName", "", "version", "", "appType", "Lcom/zykj/huiwei/launcher/bean/AppType;", "(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface VersionService {
    @InterfaceC4515f("api/services/app/AppStore/CheckUpdateAsync")
    Object checkUpdateAsync(@InterfaceC4529t("packageName") String str, @InterfaceC4529t("version") int i6, @InterfaceC4529t("appType") AppType appType, Continuation<? super ApiResp<VersionInfo>> continuation);
}
