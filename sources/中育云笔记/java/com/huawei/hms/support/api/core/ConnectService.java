package com.huawei.hms.support.api.core;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolvePendingResult;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CheckConnectResp;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeReq;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes5.dex */
public final class ConnectService {

    /* renamed from: com.huawei.hms.support.api.core.ConnectService$a */
    public class C7329a extends PendingResultImpl {
        public C7329a(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e) {
            super(apiClient, str, interfaceC7278e);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public boolean checkApiClient(ApiClient apiClient) {
            return apiClient != null;
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ResolveResult onComplete(ConnectResp connectResp) {
            ResolveResult resolveResult = new ResolveResult(connectResp);
            resolveResult.setStatus(Status.SUCCESS);
            HMSLog.m8722d("connectservice", "connect - onComplete: success");
            return resolveResult;
        }
    }

    /* renamed from: com.huawei.hms.support.api.core.ConnectService$b */
    public class C7330b extends PendingResultImpl {
        public C7330b(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e) {
            super(apiClient, str, interfaceC7278e);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public boolean checkApiClient(ApiClient apiClient) {
            return apiClient != null;
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ResolveResult onComplete(ConnectResp connectResp) {
            ResolveResult resolveResult = new ResolveResult(connectResp);
            resolveResult.setStatus(Status.SUCCESS);
            HMSLog.m8722d("connectservice", "forceConnect - onComplete: success");
            return resolveResult;
        }
    }

    /* renamed from: com.huawei.hms.support.api.core.ConnectService$c */
    public class C7331c extends PendingResultImpl {
        public C7331c(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e) {
            super(apiClient, str, interfaceC7278e);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ResolveResult onComplete(JosGetNoticeResp josGetNoticeResp) {
            if (josGetNoticeResp == null) {
                HMSLog.m8725e("connectservice", "JosNoticeResp is null");
                return null;
            }
            HMSLog.m8727i("connectservice", "josNoticeResp status code :" + josGetNoticeResp.getStatusCode());
            ResolveResult resolveResult = new ResolveResult(josGetNoticeResp);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    private ConnectService() {
    }

    public static InnerPendingResult<ResolveResult<CheckConnectResp>> checkconnect(ApiClient apiClient, CheckConnectInfo checkConnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.CHECKCONNECT, checkConnectInfo, CheckConnectResp.class);
    }

    public static PendingResult<ResolveResult<ConnectResp>> connect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new C7329a(apiClient, CoreNaming.CONNECT, connectInfo);
    }

    public static ResolvePendingResult<DisconnectResp> disconnect(ApiClient apiClient, DisconnectInfo disconnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.DISCONNECT, disconnectInfo, DisconnectResp.class);
    }

    public static PendingResult<ResolveResult<ConnectResp>> forceConnect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new C7330b(apiClient, CoreNaming.FORECONNECT, connectInfo);
    }

    public static PendingResult<ResolveResult<JosGetNoticeResp>> getNotice(ApiClient apiClient, int i10, String str) {
        JosGetNoticeReq josGetNoticeReq = new JosGetNoticeReq();
        josGetNoticeReq.setNoticeType(i10);
        josGetNoticeReq.setHmsSdkVersionName(str);
        if (apiClient != null && !TextUtils.isEmpty(apiClient.getCpID())) {
            josGetNoticeReq.setCpID(apiClient.getCpID());
        }
        return new C7331c(apiClient, CoreNaming.GETNOTICE, josGetNoticeReq);
    }
}
