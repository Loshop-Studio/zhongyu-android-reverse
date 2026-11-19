package com.zykj.huiwei.launcher.api;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.zykj.http.bean.ApiResp;
import com.zykj.huiwei.launcher.bean.PolicyTypeBean;
import com.zykj.huiwei.launcher.bean.StudentInfoBean;
import com.zykj.huiwei.launcher.bean.UpdateInfo;
import com.zykj.huiwei.launcher.bean.req.ForcePsdReq;
import com.zykj.huiwei.launcher.bean.req.UpdatePwdReq;
import com.zykj.huiwei.launcher.bean.resp.SchoolSettingResp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4510a;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4529t;

@Metadata(m7879d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H§@¢\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/UserService;", "", "getPolicy", "Lcom/zykj/http/bean/ApiResp;", "Lcom/zykj/huiwei/launcher/bean/PolicyTypeBean;", "number", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userInfo", "Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "schoolInfoSettingsAsync", "Lcom/zykj/huiwei/launcher/bean/resp/SchoolSettingResp;", "updatePwd", "Ljava/lang/Void;", "updatePwdReq", "Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;", "(Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkUpdateAsync", "Lcom/zykj/huiwei/launcher/bean/UpdateInfo;", "packageName", "version", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceChangePsdAsync", "forcePsdReq", "Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;", "(Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface UserService {
    @InterfaceC4515f("api/services/app/AppStore/CheckUpdateAsync")
    Object checkUpdateAsync(@InterfaceC4529t("packageName") String str, @InterfaceC4529t("version") int i6, @InterfaceC4529t("appType") int i7, Continuation<? super ApiResp<UpdateInfo>> continuation);

    @InterfaceC4524o("api/services/app/User/ForceChangePasswordAsync")
    Object forceChangePsdAsync(@InterfaceC4510a ForcePsdReq forcePsdReq, Continuation<? super ApiResp<Void>> continuation);

    @InterfaceC4515f("api/services/app/CtrlStrategy/GetControlPolicyByDeviceNumberAsync")
    Object getPolicy(@InterfaceC4529t("number") String str, Continuation<? super ApiResp<PolicyTypeBean>> continuation);

    @InterfaceC4515f("api/services/app/Setting/GetSchoolInfoSettingsAsync")
    Object schoolInfoSettingsAsync(Continuation<? super ApiResp<SchoolSettingResp>> continuation);

    @InterfaceC4524o("api/services/app/User/ChangePasswordAsync")
    Object updatePwd(@InterfaceC4510a UpdatePwdReq updatePwdReq, Continuation<? super ApiResp<Void>> continuation);

    @InterfaceC4515f("api/services/app/StudentUser/GetMyInfoAsync")
    Object userInfo(Continuation<? super ApiResp<StudentInfoBean>> continuation);
}
