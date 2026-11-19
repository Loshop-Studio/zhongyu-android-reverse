package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class HmsClient extends BaseHmsClient implements AnyClient {

    /* renamed from: com.huawei.hms.common.internal.HmsClient$a */
    public static class C7269a implements BaseAdapter.BaseCallBack {

        /* renamed from: a */
        public final AnyClient.CallBack f11548a;

        /* renamed from: b */
        public final WeakReference f11549b;

        public C7269a(HmsClient hmsClient, AnyClient.CallBack callBack) {
            this.f11548a = callBack;
            this.f11549b = new WeakReference(hmsClient);
        }

        /* renamed from: a */
        public final void m8481a(String str) {
            HmsClient hmsClient = (HmsClient) this.f11549b.get();
            if (hmsClient != null) {
                hmsClient.updateSessionId(str);
            }
        }

        /* renamed from: b */
        public final void m8482b(String str, String str2) {
            if (this.f11548a == null) {
                return;
            }
            ResponseHeader responseHeader = new ResponseHeader();
            if (!responseHeader.fromJson(str)) {
                this.f11548a.onCallback(new ResponseHeader(1, CommonCode.ErrorCode.ARGUMENTS_INVALID, "response header json error"), new JSONObject().toString());
                return;
            }
            HMSLog.m8727i("HmsClient", "receive msg " + responseHeader);
            m8481a(responseHeader.getSessionId());
            this.f11548a.onCallback(responseHeader, str2);
        }

        /* renamed from: c */
        public final void m8483c(String str, String str2, Parcelable parcelable) {
            if (this.f11548a == null) {
                return;
            }
            ResponseHeader responseHeader = new ResponseHeader();
            if (!responseHeader.fromJson(str)) {
                this.f11548a.onCallback(new ResponseHeader(1, CommonCode.ErrorCode.ARGUMENTS_INVALID, "response header json error"), new JSONObject().toString());
                return;
            }
            responseHeader.setParcelable(parcelable);
            HMSLog.m8727i("HmsClient", "receive msg " + responseHeader);
            m8481a(responseHeader.getSessionId());
            this.f11548a.onCallback(responseHeader, str2);
        }

        @Override // com.huawei.hms.adapter.BaseAdapter.BaseCallBack
        public void onComplete(String str, String str2, Parcelable parcelable) {
            if (parcelable == null) {
                m8482b(str, str2);
            } else {
                m8483c(str, str2, parcelable);
            }
        }

        @Override // com.huawei.hms.adapter.BaseAdapter.BaseCallBack
        public void onError(String str) {
            if (this.f11548a == null) {
                return;
            }
            ResponseWrap responseWrap = new ResponseWrap(new ResponseHeader());
            if (!responseWrap.fromJson(str)) {
                this.f11548a.onCallback(new ResponseHeader(1, CommonCode.ErrorCode.ARGUMENTS_INVALID, "response header json error"), new JSONObject().toString());
                return;
            }
            HMSLog.m8727i("HmsClient", "receive msg " + responseWrap);
            ResponseHeader responseHeader = responseWrap.getResponseHeader();
            m8481a(responseHeader.getSessionId());
            this.f11548a.onCallback(responseHeader, responseWrap.getBody());
        }
    }

    public HmsClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        super(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }

    @Override // com.huawei.hms.common.internal.AnyClient
    public void post(InterfaceC7278e interfaceC7278e, String str, AnyClient.CallBack callBack) throws IllegalArgumentException {
        if (callBack == null) {
            HMSLog.m8725e("HmsClient", "callback is invalid, discard.");
            return;
        }
        if (!(interfaceC7278e instanceof RequestHeader) || str == null) {
            HMSLog.m8725e("HmsClient", "arguments is invalid.");
            callBack.onCallback(new ResponseHeader(1, CommonCode.ErrorCode.ARGUMENTS_INVALID, "Args is invalid"), new JSONObject().toString());
            return;
        }
        if (!isConnected()) {
            HMSLog.m8727i("HmsClient", "No connection now, the connection status:" + getConnectionStatus());
            if (getConnectionStatus() != 6) {
                HMSLog.m8725e("HmsClient", "post failed for not connected.");
                callBack.onCallback(new ResponseHeader(1, CommonCode.ErrorCode.INTERNAL_ERROR, "Not Connected"), new JSONObject().toString());
                return;
            } else {
                HMSLog.m8727i("HmsClient", "in timeout-disconnect status, need to bind again.");
                m8464c();
            }
        }
        RequestHeader requestHeader = (RequestHeader) interfaceC7278e;
        HMSLog.m8727i("HmsClient", "post msg " + requestHeader);
        Activity cpActivity = m8478u().getCpActivity();
        boolean z10 = cpActivity == null;
        if (z10) {
            HMSLog.m8727i("HmsClient", "Activity is null for " + m8478u().getAppID());
        }
        (z10 ? new BaseAdapter(this) : new BaseAdapter(this, cpActivity)).baseRequest(requestHeader.toJson(), str, requestHeader.getParcelable(), new C7269a(this, callBack));
    }

    public void updateSessionId(String str) {
        if (TextUtils.isEmpty(this.f11520g)) {
            this.f11520g = str;
        }
    }
}
