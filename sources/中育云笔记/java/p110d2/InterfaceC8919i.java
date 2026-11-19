package p110d2;

import com.friday.common.entity.EzyLoginRequest;
import com.friday.common.entity.MonitorRequest;
import com.friday.common.entity.OssTokenReq;
import com.friday.common.entity.OssTokenResult;
import com.friday.common.entity.SendSmsBean;
import com.friday.common.entity.TokenResponse;
import com.zykj.http.bean.ApiResp;
import gf.InterfaceC9408a;
import gf.InterfaceC9416i;
import gf.InterfaceC9422o;
import vc.InterfaceC11588c;

/* renamed from: d2.i */
/* loaded from: classes3.dex */
public interface InterfaceC8919i {
    @InterfaceC9422o("api/services/app/ObjectStorage/GenerateTokenV2Async")
    /* renamed from: a */
    Object m17508a(@InterfaceC9408a OssTokenReq ossTokenReq, InterfaceC11588c<? super OssTokenResult> interfaceC11588c);

    @InterfaceC9422o("/api/services/app/StoreAppControl/RecordPicturesAsync")
    /* renamed from: b */
    Object m17509b(@InterfaceC9408a MonitorRequest monitorRequest, InterfaceC11588c<? super ApiResp<Object>> interfaceC11588c);

    @InterfaceC9422o("api/TokenAuth/Login")
    /* renamed from: c */
    Object m17510c(@InterfaceC9408a EzyLoginRequest ezyLoginRequest, @InterfaceC9416i("AppName") String str, @InterfaceC9416i("AppVersion") int i10, @InterfaceC9416i("ClientCode") String str2, InterfaceC11588c<? super TokenResponse> interfaceC11588c);

    @InterfaceC9422o("/api/TokenAuth/NewSendSmsCode")
    /* renamed from: d */
    Object m17511d(@InterfaceC9408a SendSmsBean sendSmsBean, InterfaceC11588c<? super ApiResp<Object>> interfaceC11588c);
}
