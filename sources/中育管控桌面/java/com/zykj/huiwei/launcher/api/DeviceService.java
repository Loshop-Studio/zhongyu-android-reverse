package com.zykj.huiwei.launcher.api;

import com.zykj.http.bean.ApiResp;
import com.zykj.huiwei.launcher.bean.req.TrackInfoReq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4510a;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4529t;

@Metadata(m7879d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\n0\u0003H§@¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u000b¨\u0006\u0014À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/DeviceService;", "", "getDeviceState", "Lcom/zykj/http/bean/ApiResp;", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWhiteListApps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceAuthorized", "Ljava/lang/Void;", "uploadTrackInfo", "", "req", "Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;", "(Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWhiteIPList", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface DeviceService {
    @InterfaceC4524o("api/services/app/CrackRecord/AuthorizedAsync")
    Object deviceAuthorized(@InterfaceC4529t("deviceNumber") String str, Continuation<? super ApiResp<Void>> continuation);

    @InterfaceC4515f("api/services/app/CrackRecord/GetDeviceStateAsync")
    Object getDeviceState(@InterfaceC4529t("deviceNumber") String str, Continuation<? super ApiResp<Integer>> continuation);

    @InterfaceC4515f("api/services/app/WebWhiteList/GetAllWhiteIpsAsync")
    Object getWhiteIPList(Continuation<? super ApiResp<String>> continuation);

    @InterfaceC4515f("api/services/app/AppStore/GetWhiteListAsync")
    Object getWhiteListApps(Continuation<? super ApiResp<ArrayList<String>>> continuation);

    @InterfaceC4524o("api/services/app/CrackRecord/ReportAsync")
    Object uploadTrackInfo(@InterfaceC4510a TrackInfoReq trackInfoReq, Continuation<? super ApiResp<Boolean>> continuation);
}
