package com.zykj.huiwei.launcher.api;

import androidx.core.view.PointerIconCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.http.bean.ApiResp;
import com.zykj.huiwei.launcher.bean.AvatarItem;
import com.zykj.huiwei.launcher.bean.GetTaskListReq;
import com.zykj.huiwei.launcher.bean.GetTaskListResponse;
import com.zykj.huiwei.launcher.bean.SystemSettingsBean;
import com.zykj.huiwei.launcher.bean.req.AvatarSetReq;
import com.zykj.huiwei.launcher.bean.resp.Credential;
import com.zykj.huiwei.launcher.bean.resp.DisableAppInfo;
import com.zykj.huiwei.launcher.bean.resp.SettingResp;
import com.zykj.huiwei.launcher.bean.resp.TodoResp;
import com.zykj.huiwei.launcher.bean.resp.WeatherBean;
import com.zykj.huiwei.launcher.bean.resp.WebsitesUsedOftenBean;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4510a;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4529t;

@Metadata(m7879d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H§@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010!\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\t0\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010(\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0014¨\u0006)À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/HomeService;", "", "getStudentUserTodo", "Lcom/zykj/http/bean/ApiResp;", "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;", "studentId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebsitesUsedOften", "", "Lcom/zykj/huiwei/launcher/bean/resp/WebsitesUsedOftenBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSettings", "Lcom/zykj/huiwei/launcher/bean/resp/SettingResp;", "getDnUrl", "", "clientType", "getWeatherList", "Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;", RequestParameters.SUBRESOURCE_LOCATION, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodoTasksList", "Lcom/zykj/huiwei/launcher/bean/GetTaskListResponse;", "getTaskListReq", "Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;", "(Lcom/zykj/huiwei/launcher/bean/GetTaskListReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTodoTasksListWithUrgeCount", "getStorageCredentialAsync", "Lcom/zykj/huiwei/launcher/bean/resp/Credential;", "getAllProfilesAsync", "", "Lcom/zykj/huiwei/launcher/bean/AvatarItem;", "setPictureAsync", "req", "Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;", "(Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDisableAppsAsync", "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;", "getSystemSettings", "Lcom/zykj/huiwei/launcher/bean/SystemSettingsBean;", "propertyName", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface HomeService {

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getTodoTasksList$default(HomeService homeService, GetTaskListReq getTaskListReq, Continuation continuation, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTodoTasksList");
        }
        if ((i6 & 1) != 0) {
            getTaskListReq = new GetTaskListReq(1, 0, 0, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRAB, null);
        }
        return homeService.getTodoTasksList(getTaskListReq, continuation);
    }

    static /* synthetic */ Object getTodoTasksListWithUrgeCount$default(HomeService homeService, GetTaskListReq getTaskListReq, Continuation continuation, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTodoTasksListWithUrgeCount");
        }
        if ((i6 & 1) != 0) {
            getTaskListReq = new GetTaskListReq(1, 0, 0, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRAB, null);
        }
        return homeService.getTodoTasksListWithUrgeCount(getTaskListReq, continuation);
    }

    @InterfaceC4515f("api/services/app/User/GetAllProfilesAsync")
    Object getAllProfilesAsync(Continuation<? super ApiResp<List<AvatarItem>>> continuation);

    @InterfaceC4515f("api/services/app/Huiwei/GetDisableAppsAsync")
    Object getDisableAppsAsync(Continuation<? super ApiResp<List<DisableAppInfo>>> continuation);

    @InterfaceC4515f("/api/dn/GetDnUrl")
    Object getDnUrl(@InterfaceC4529t("clientType") int i6, Continuation<? super ApiResp<String>> continuation);

    @InterfaceC4515f("/api/services/app/Setting/GetAllSettings")
    Object getSettings(Continuation<? super ApiResp<SettingResp>> continuation);

    @InterfaceC4515f("api/services/app/ObjectStorage/GeneratorTokenAsync")
    Object getStorageCredentialAsync(Continuation<? super ApiResp<Credential>> continuation);

    @InterfaceC4515f("/api/services/app/StudentUser/GetStudentUserTodoAsync")
    Object getStudentUserTodo(@InterfaceC4529t("studentId") int i6, Continuation<? super ApiResp<TodoResp>> continuation);

    @InterfaceC4524o("api/services/app/Setting/GetSettingByNameAsync")
    Object getSystemSettings(@InterfaceC4529t("propertyName") String str, Continuation<? super ApiResp<SystemSettingsBean>> continuation);

    @InterfaceC4524o("api/services/app/Task/GetStudentTaskListAsync")
    @Deprecated(message = "2025/05/22, 需要同时返回催交数量，已被 {@link #getTodoTasksListWithUrgeCount()} 替代")
    Object getTodoTasksList(@InterfaceC4510a GetTaskListReq getTaskListReq, Continuation<? super ApiResp<GetTaskListResponse>> continuation);

    @InterfaceC4524o("api/services/app/Task/GetStudentTaskListWithUrgeCountAsync")
    Object getTodoTasksListWithUrgeCount(@InterfaceC4510a GetTaskListReq getTaskListReq, Continuation<? super ApiResp<GetTaskListResponse>> continuation);

    @InterfaceC4515f("api/services/app/Weather/GetQWeatherAsync")
    Object getWeatherList(@InterfaceC4529t(RequestParameters.SUBRESOURCE_LOCATION) String str, Continuation<? super ApiResp<WeatherBean>> continuation);

    @InterfaceC4515f("/api/services/app/WebWhiteList/GetAllCommonWebSiteAsync")
    Object getWebsitesUsedOften(Continuation<? super ApiResp<List<WebsitesUsedOftenBean>>> continuation);

    @InterfaceC4524o("api/services/app/StudentUser/SetPictureAsync")
    Object setPictureAsync(@InterfaceC4510a AvatarSetReq avatarSetReq, Continuation<? super ApiResp<String>> continuation);
}
