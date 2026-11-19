package p333s5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import p043c5.C5400a;
import p113d5.AbstractC8990a;
import p385w4.C11702f;
import p417y4.C11911a;

/* renamed from: s5.e */
/* loaded from: classes5.dex */
public class C11065e extends TaskApiCall {

    /* renamed from: f */
    public Context f26694f;

    /* renamed from: g */
    public TokenReq f26695g;

    /* renamed from: s5.e$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f26696c;

        /* renamed from: d */
        public final /* synthetic */ String f26697d;

        public a(String str, String str2) {
            this.f26696c = str;
            this.f26697d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C11067g.m24536k(C11065e.this.f26694f).m24539m(this.f26696c).equals(this.f26697d)) {
                return;
            }
            HMSLog.m8727i(C11911a.f28223d, "receive a new token, refresh the local token");
            C11067g.m24536k(C11065e.this.f26694f).m24540n(this.f26696c, this.f26697d);
        }
    }

    public C11065e(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.f26694f = context;
        this.f26695g = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo8490a(C5400a c5400a, ResponseErrorCode responseErrorCode, String str, C11702f c11702f) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.m8725e(C11911a.f28223d, "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            m24530d(responseErrorCode, c11702f);
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum errorEnumM8224a = ErrorEnum.m8224a(tokenResp.getRetCode());
            if (errorEnumM8224a != ErrorEnum.SUCCESS) {
                c11702f.m25873b(errorEnumM8224a.m8228f());
                HMSLog.m8725e(C11911a.f28223d, "TokenTask failed, StatusCode:" + errorEnumM8224a.m8225c());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.m8224a(tokenResp.getRetCode()).m8225c());
                c11702f.m25874c(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.m8727i(C11911a.f28223d, "GetTokenTask receive an empty token, please check onNewToken callback method.");
                    AbstractC11066f.m24533b(c5400a.getContext(), getUri(), responseErrorCode);
                    return;
                }
                m24531e(token, this.f26695g.getSubjectId());
            }
        }
        AbstractC11066f.m24533b(c5400a.getContext(), getUri(), responseErrorCode);
    }

    /* renamed from: d */
    public final void m24530d(ResponseErrorCode responseErrorCode, C11702f c11702f) {
        ErrorEnum errorEnumM8224a = ErrorEnum.m8224a(responseErrorCode.getErrorCode());
        if (errorEnumM8224a != ErrorEnum.ERROR_UNKNOWN) {
            c11702f.m25873b(errorEnumM8224a.m8228f());
        } else {
            c11702f.m25873b(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    /* renamed from: e */
    public final void m24531e(String str, String str2) {
        AbstractC8990a.m17533a(new a(str2, str));
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f26695g.isMultiSender() ? 50004300 : 30000000;
    }
}
