package com.huawei.hms.api;

import android.os.Bundle;
import com.huawei.hms.core.aidl.AbstractC7275b;
import com.huawei.hms.core.aidl.C7279f;
import com.huawei.hms.core.aidl.C7281h;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.InterfaceC7276c;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes5.dex */
public class IPCTransport implements DatagramTransport {
    private static final String TAG = "IPCTransport";
    private int apiLevel;
    private final InterfaceC7278e mEntity;
    private final Class<? extends InterfaceC7278e> mResponseClass;
    private final String mURI;

    public IPCTransport(String str, InterfaceC7278e interfaceC7278e, Class<? extends InterfaceC7278e> cls) {
        this.mURI = str;
        this.mEntity = interfaceC7278e;
        this.mResponseClass = cls;
    }

    private int syncCall(ApiClient apiClient, InterfaceC7276c interfaceC7276c) {
        if (!(apiClient instanceof InnerApiClient)) {
            if (apiClient instanceof AidlApiClient) {
                AidlApiClient aidlApiClient = (AidlApiClient) apiClient;
                DataBuffer dataBuffer = new DataBuffer(this.mURI, ProtocolNegotiate.getInstance().getVersion());
                dataBuffer.m8507c(AbstractC7275b.m8513a(dataBuffer.m8510i()).m8528g(this.mEntity, new Bundle()));
                try {
                    aidlApiClient.getService().mo8518j(dataBuffer, interfaceC7276c);
                    return 0;
                } catch (Exception e10) {
                    HMSLog.m8725e(TAG, "sync call ex:" + e10);
                }
            }
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
        DataBuffer dataBuffer2 = new DataBuffer(this.mURI, ProtocolNegotiate.getInstance().getVersion());
        C7279f c7279fM8513a = AbstractC7275b.m8513a(dataBuffer2.m8510i());
        dataBuffer2.m8507c(c7279fM8513a.m8528g(this.mEntity, new Bundle()));
        C7281h c7281h = new C7281h();
        c7281h.m8534c(apiClient.getAppID());
        c7281h.m8535d(apiClient.getPackageName());
        c7281h.m8536e(61300301);
        c7281h.m8533b(((AidlApiClient) apiClient).getApiNameList());
        c7281h.m8537f(apiClient.getSessionId());
        c7281h.m8532a(this.apiLevel);
        dataBuffer2.f11601d = c7279fM8513a.m8528g(c7281h, new Bundle());
        try {
            AidlApiClient aidlApiClient2 = (AidlApiClient) apiClient;
            if (aidlApiClient2.getService() == null) {
                HMSLog.m8725e(TAG, "HuaweiApiClient is not binded to service yet.");
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
            aidlApiClient2.getService().mo8518j(dataBuffer2, interfaceC7276c);
            return 0;
        } catch (Exception e11) {
            HMSLog.m8725e(TAG, "sync call ex:" + e11);
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.InterfaceC7338a interfaceC7338a) {
        send(apiClient, interfaceC7338a);
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.InterfaceC7338a interfaceC7338a) {
        int iSyncCall = syncCall(apiClient, new IPCCallback(this.mResponseClass, interfaceC7338a));
        if (iSyncCall == 0 || interfaceC7338a == null) {
            return;
        }
        interfaceC7338a.mo8680a(iSyncCall, null);
    }

    public IPCTransport(String str, InterfaceC7278e interfaceC7278e, Class<? extends InterfaceC7278e> cls, int i10) {
        this.mURI = str;
        this.mEntity = interfaceC7278e;
        this.mResponseClass = cls;
        this.apiLevel = i10;
    }
}
