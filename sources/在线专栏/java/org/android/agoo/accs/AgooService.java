package org.android.agoo.accs;

import android.text.TextUtils;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.C1804a;
import java.nio.charset.Charset;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;

/* loaded from: classes.dex */
public class AgooService extends TaoBaseService {

    /* renamed from: a */
    public static CallBack f11418a;

    /* renamed from: b */
    public static CallBack f11419b;

    /* renamed from: c */
    private AgooFactory f11420c;

    /* renamed from: a */
    private String m10011a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onBind(String str, int i4, String str2, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.m6092e("AgooService", "into--[onBind]:serviceId:" + str + ",errorCode=" + i4, new Object[0]);
        }
        if (f11418a != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i4 == AccsErrorCode.SUCCESS.getCodeInt()) {
                f11418a.onSuccess();
            } else {
                ErrorCode errorCodeBuild = C1804a.m6162a(i4, str2).build();
                f11418a.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
        }
        f11418a = null;
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ALog.m6090d("AgooService", "into--[onCreate]", new Object[0]);
        this.f11420c = AgooFactory.getInstance(getApplicationContext());
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m6093i("AgooService", "into--[onData]:serviceId:" + str + ",dataId=" + str3, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("push data:");
            sb.append(new String(bArr, Charset.forName("UTF-8")));
            ALog.m6090d("AgooService", sb.toString(), new Object[0]);
        }
        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", AdapterUtilityImpl.getDeviceId(getApplicationContext()), str3);
        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_TOTAL_ARRIVE, "total_arrive", 0.0d);
        try {
            this.f11420c.saveMsg(bArr);
            this.f11420c.msgReceive(bArr, "accs", extraInfo);
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", "onDataError", th);
            ALog.m6092e("AgooService", "into--[onData,dealMessage]:error:" + th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onResponse(String str, String str2, int i4, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m6093i("AgooService", "onResponse,dataId=" + str2 + ",errorCode=" + i4 + ",errorMsg=" + str3 + ",data=" + bArr + ",serviceId=" + str, new Object[0]);
        }
        String str4 = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    str4 = new String(bArr, "utf-8");
                }
            } catch (Throwable th) {
                ALog.m6092e("AgooService", "onResponse get data error,e=" + th, new Object[0]);
            }
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m6090d("AgooService", "onResponse,message=" + str4, new Object[0]);
        }
        ErrorCode errorCode = AccsErrorCode.SUCCESS;
        if (i4 == errorCode.getCodeInt() && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m6093i("AgooService", "request is success", Constants.KEY_DATA_ID, str2);
            }
            this.f11420c.updateMsg(bArr, true);
        } else {
            if (i4 != errorCode.getCodeInt() && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.m6092e("AgooService", "request is error", Constants.KEY_DATA_ID, str2, "errorid", Integer.valueOf(i4));
                }
                Config.m10013a(getApplicationContext(), 1);
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i4), 0.0d);
                return;
            }
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m6092e("AgooService", "business request is error,message=" + str4, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onSendData(String str, String str2, int i4, String str3, TaoBaseService.ExtraInfo extraInfo) {
        try {
            ALog.Level level = ALog.Level.I;
            if (ALog.isPrintLog(level)) {
                ALog.m6093i("AgooService", "onSendData,dataId=" + str2 + ",errorCode=" + i4 + ",errorMsg=" + str3 + ",serviceId=" + str, new Object[0]);
            }
            if (i4 != AccsErrorCode.SUCCESS.getCodeInt()) {
                if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                    Config.m10013a(getApplicationContext(), 1);
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i4), 0.0d);
                }
                if (ALog.isPrintLog(level)) {
                    ALog.m6093i("AgooService", "onSendData error,dataId=" + str2 + ",serviceId=" + str, new Object[0]);
                    ALog.m6092e("AgooService", "into--[parseError]", new Object[0]);
                }
                UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", AdapterUtilityImpl.getDeviceId(getApplicationContext()), Constants.KEY_ERROR_CODE, str2 + ",serviceId=" + str + ",errorCode=" + i4);
                return;
            }
            if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "8/9", 0.0d);
            }
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) && Long.parseLong(str2) > 300000000 && Long.parseLong(str2) < 600000000) {
                if (ALog.isPrintLog(level)) {
                    ALog.m6093i("AgooService", "onSendData,AckData=" + str2 + ",serviceId=" + str, new Object[0]);
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) || Long.parseLong(str2) <= 600000000 || !ALog.isPrintLog(level)) {
                return;
            }
            ALog.m6093i("AgooService", "onSendData,reportData=" + str2 + ",serviceId=" + str, new Object[0]);
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m6092e("AgooService", "onSendData exception,e=" + th.getMessage() + ",e.getStackMsg=" + m10011a(th), new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", AdapterUtilityImpl.getDeviceId(getApplicationContext()), "onSendDataException", m10011a(th));
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onUnbind(String str, int i4, String str2, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.m6092e("AgooService", "into--[onUnbind]:serviceId:" + str + ",errorCode=" + i4, new Object[0]);
        }
        if (f11419b != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i4 == AccsErrorCode.SUCCESS.getCodeInt()) {
                f11419b.onSuccess();
            } else {
                ErrorCode errorCodeBuild = C1804a.m6162a(i4, str2).build();
                f11419b.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
        }
        f11419b = null;
    }
}
