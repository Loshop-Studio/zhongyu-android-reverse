package org.android.agoo.accs;

import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import anet.channel.request.Request;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.C7703a;
import java.nio.charset.Charset;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;

/* loaded from: classes6.dex */
public class AgooService extends TaoBaseService {

    /* renamed from: a */
    public static CallBack f25300a;

    /* renamed from: b */
    public static CallBack f25301b;

    /* renamed from: c */
    private AgooFactory f25302c;

    /* renamed from: a */
    private String m22229a(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb2.append(stackTraceElement.toString());
                sb2.append(SignParameters.NEW_LINE);
            }
        }
        return sb2.toString();
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onBind(String str, int i10, String str2, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.m10118e("AgooService", "into--[onBind]:serviceId:" + str + ",errorCode=" + i10, new Object[0]);
        }
        if (f25300a != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i10 == AccsErrorCode.SUCCESS.getCodeInt()) {
                f25300a.onSuccess();
            } else {
                ErrorCode errorCodeBuild = C7703a.m10188a(i10, str2).build();
                f25300a.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
        }
        f25300a = null;
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ALog.m10116d("AgooService", "into--[onCreate]", new Object[0]);
        this.f25302c = AgooFactory.getInstance(getApplicationContext());
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i("AgooService", "into--[onData]:serviceId:" + str + ",dataId=" + str3, new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("push data:");
            sb2.append(new String(bArr, Charset.forName(Request.DEFAULT_CHARSET)));
            ALog.m10116d("AgooService", sb2.toString(), new Object[0]);
        }
        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", AdapterUtilityImpl.getDeviceId(getApplicationContext()), str3);
        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_TOTAL_ARRIVE, "total_arrive", AudioStats.AUDIO_AMPLITUDE_NONE);
        try {
            this.f25302c.saveMsg(bArr);
            this.f25302c.msgReceive(bArr, "accs", extraInfo);
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", "onDataError", th);
            ALog.m10118e("AgooService", "into--[onData,dealMessage]:error:" + th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onResponse(String str, String str2, int i10, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i("AgooService", "onResponse,dataId=" + str2 + ",errorCode=" + i10 + ",errorMsg=" + str3 + ",data=" + bArr + ",serviceId=" + str, new Object[0]);
        }
        String str4 = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    str4 = new String(bArr, "utf-8");
                }
            } catch (Throwable th) {
                ALog.m10118e("AgooService", "onResponse get data error,e=" + th, new Object[0]);
            }
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m10116d("AgooService", "onResponse,message=" + str4, new Object[0]);
        }
        ErrorCode errorCode = AccsErrorCode.SUCCESS;
        if (i10 == errorCode.getCodeInt() && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m10119i("AgooService", "request is success", Constants.KEY_DATA_ID, str2);
            }
            this.f25302c.updateMsg(bArr, true);
        } else {
            if (i10 != errorCode.getCodeInt() && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.m10118e("AgooService", "request is error", Constants.KEY_DATA_ID, str2, "errorid", Integer.valueOf(i10));
                }
                Config.m22231a(getApplicationContext(), 1);
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i10), AudioStats.AUDIO_AMPLITUDE_NONE);
                return;
            }
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m10118e("AgooService", "business request is error,message=" + str4, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onSendData(String str, String str2, int i10, String str3, TaoBaseService.ExtraInfo extraInfo) {
        try {
            ALog.Level level = ALog.Level.I;
            if (ALog.isPrintLog(level)) {
                ALog.m10119i("AgooService", "onSendData,dataId=" + str2 + ",errorCode=" + i10 + ",errorMsg=" + str3 + ",serviceId=" + str, new Object[0]);
            }
            if (i10 != AccsErrorCode.SUCCESS.getCodeInt()) {
                if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                    Config.m22231a(getApplicationContext(), 1);
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i10), AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                if (ALog.isPrintLog(level)) {
                    ALog.m10119i("AgooService", "onSendData error,dataId=" + str2 + ",serviceId=" + str, new Object[0]);
                    ALog.m10118e("AgooService", "into--[parseError]", new Object[0]);
                }
                UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", AdapterUtilityImpl.getDeviceId(getApplicationContext()), Constants.KEY_ERROR_CODE, str2 + ",serviceId=" + str + ",errorCode=" + i10);
                return;
            }
            if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "8/9", AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) && Long.parseLong(str2) > 300000000 && Long.parseLong(str2) < 600000000) {
                if (ALog.isPrintLog(level)) {
                    ALog.m10119i("AgooService", "onSendData,AckData=" + str2 + ",serviceId=" + str, new Object[0]);
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) || Long.parseLong(str2) <= 600000000 || !ALog.isPrintLog(level)) {
                return;
            }
            ALog.m10119i("AgooService", "onSendData,reportData=" + str2 + ",serviceId=" + str, new Object[0]);
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m10118e("AgooService", "onSendData exception,e=" + th.getMessage() + ",e.getStackMsg=" + m22229a(th), new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", AdapterUtilityImpl.getDeviceId(getApplicationContext()), "onSendDataException", m22229a(th));
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListenerV2
    public void onUnbind(String str, int i10, String str2, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.m10118e("AgooService", "into--[onUnbind]:serviceId:" + str + ",errorCode=" + i10, new Object[0]);
        }
        if (f25301b != null && GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            if (i10 == AccsErrorCode.SUCCESS.getCodeInt()) {
                f25301b.onSuccess();
            } else {
                ErrorCode errorCodeBuild = C7703a.m10188a(i10, str2).build();
                f25301b.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
        }
        f25301b = null;
    }
}
