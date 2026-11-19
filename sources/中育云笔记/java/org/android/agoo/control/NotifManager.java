package org.android.agoo.control;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import androidx.core.app.NotificationCompat;
import anet.channel.request.Request;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class NotifManager {
    private static final String ACK_MESSAGE = "accs.ackMessage";
    private static final int EVENT_ID = 66001;
    private static final String TAG = "NotifManager";
    private static Context mContext;

    private byte[] convertMsgToBytes(MsgDO msgDO) {
        HashMap map = new HashMap();
        map.put("api", "agooReport");
        map.put(AgooConstants.MESSAGE_ID, msgDO.msgIds + "@" + msgDO.messageSource);
        map.put("ext", msgDO.extData);
        map.put(NotificationCompat.CATEGORY_STATUS, msgDO.msgStatus);
        if (!TextUtils.isEmpty(msgDO.errorCode)) {
            map.put("ec", msgDO.errorCode);
        }
        if (!TextUtils.isEmpty(msgDO.type)) {
            map.put("type", msgDO.type);
        }
        if (!TextUtils.isEmpty(msgDO.fromPkg)) {
            map.put("fromPkg", msgDO.fromPkg);
        }
        if (!TextUtils.isEmpty(msgDO.fromAppkey)) {
            map.put(AgooConstants.MESSAGE_FROM_APPKEY, msgDO.fromAppkey);
        }
        if (!TextUtils.isEmpty(msgDO.notifyEnable)) {
            map.put("notifyEnable", msgDO.notifyEnable);
        }
        if (!TextUtils.isEmpty(msgDO.extData)) {
            map.put("ext", msgDO.extData);
        }
        map.put("isStartProc", Boolean.toString(msgDO.isStartProc));
        map.put("appkey", Config.m22234b(mContext));
        map.put("utdid", AdapterUtilityImpl.getDeviceId(mContext));
        return new JSONObject(map).toString().getBytes(Request.DEFAULT_CHARSET);
    }

    private String getVersion(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "null";
            }
            String str2 = mContext.getPackageManager().getPackageInfo(str, 0).versionName;
            ALog.m10116d(TAG, "getVersion###版本号为 : " + str2, new Object[0]);
            return str2;
        } catch (Throwable unused) {
            return "null";
        }
    }

    private boolean isAppInstalled(String str) {
        PackageInfo packageInfo;
        try {
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        packageInfo = mContext.getPackageManager().getPackageInfo(str, 0);
        if (packageInfo == null) {
            return false;
        }
        ALog.m10119i(TAG, "isAppInstalled true..", new Object[0]);
        return true;
    }

    private void reportMethod(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (msgDO == null) {
                ALog.m10118e(TAG, "reportMethod msg null", new Object[0]);
                return;
            }
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = mContext;
            String strSendPushResponse = ACCSManager.getAccsInstance(context, Config.m22234b(context), Config.m22238d(mContext)).sendPushResponse(mContext, accsRequest, extraInfo);
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m10116d(TAG, AgooConstants.MESSAGE_REPORT, Constants.KEY_DATA_ID, strSendPushResponse, NotificationCompat.CATEGORY_STATUS, msgDO.msgStatus, "errorcode", msgDO.errorCode);
            }
        } catch (Throwable th) {
            AppMonitorAdapter.commitCount("accs", "error", th.toString(), AudioStats.AUDIO_AMPLITUDE_NONE);
        }
    }

    public void doUninstall(String str, boolean z10) {
        try {
            HashMap map = new HashMap();
            map.put("pack", str);
            map.put("appkey", Config.m22234b(mContext));
            map.put("utdid", AdapterUtilityImpl.getDeviceId(mContext));
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooKick", new JSONObject(map).toString().getBytes(Request.DEFAULT_CHARSET), null, null, null, null);
            Context context = mContext;
            ACCSManager.getAccsInstance(context, Config.m22234b(context), Config.m22238d(mContext)).sendPushResponse(mContext, accsRequest, new TaoBaseService.ExtraInfo());
        } catch (Throwable th) {
            ALog.m10117e(TAG, "[doUninstall] is error", th, new Object[0]);
        }
    }

    public void handlerACKMessage(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (msgDO == null) {
            return;
        }
        if (TextUtils.isEmpty(msgDO.msgIds) && TextUtils.isEmpty(msgDO.removePacks) && TextUtils.isEmpty(msgDO.errorCode)) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, AdapterUtilityImpl.getDeviceId(mContext), "handlerACKMessageReturn", "msgIds=" + msgDO.msgIds + ",removePacks=" + msgDO.removePacks + ",errorCode=" + msgDO.errorCode);
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("api", AgooConstants.AGOO_SERVICE_AGOOACK);
            map.put(AgooConstants.MESSAGE_ID, msgDO.msgIds + "@" + msgDO.messageSource);
            if (!TextUtils.isEmpty(msgDO.removePacks)) {
                map.put("del_pack", msgDO.removePacks);
            }
            if (!TextUtils.isEmpty(msgDO.errorCode)) {
                map.put("ec", msgDO.errorCode);
            }
            if (!TextUtils.isEmpty(msgDO.type)) {
                map.put("type", msgDO.type);
            }
            if (!TextUtils.isEmpty(msgDO.extData)) {
                map.put("ext", msgDO.extData);
            }
            map.put("appkey", Config.m22234b(mContext));
            map.put("utdid", AdapterUtilityImpl.getDeviceId(mContext));
            byte[] bytes = new JSONObject(map).toString().getBytes(Request.DEFAULT_CHARSET);
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, AdapterUtilityImpl.getDeviceId(mContext), "handlerACKMessageSendData", msgDO.msgIds);
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_ACK, "handlerACKMessage", AudioStats.AUDIO_AMPLITUDE_NONE);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, bytes, null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = mContext;
            ALog.m10119i(TAG, "handlerACKMessage,endRequest,dataId=" + ACCSManager.getAccsInstance(context, Config.m22234b(context), Config.m22238d(mContext)).sendPushResponse(mContext, accsRequest, extraInfo), new Object[0]);
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m10118e(TAG, "handlerACKMessage Throwable,msgIds=" + msgDO.msgIds + ",type=" + msgDO.type + ",e=" + th.toString(), new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, AdapterUtilityImpl.getDeviceId(mContext), "handlerACKMessageExceptionFailed", th.toString());
        }
    }

    public void init(Context context) {
        mContext = context;
    }

    public void pingApp(String str, String str2, String str3, int i10) {
    }

    public void report(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (TextUtils.isEmpty(msgDO.reportStr)) {
            return;
        }
        try {
            if (Integer.parseInt(msgDO.reportStr) >= -1) {
                reportMethod(msgDO, extraInfo);
                if (msgDO.isFromCache) {
                    return;
                }
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, AudioStats.AUDIO_AMPLITUDE_NONE);
            }
        } catch (Throwable th) {
            ALog.m10117e(TAG, "[report] is error", th, new Object[0]);
        }
    }

    public void reportNotifyMessage(MsgDO msgDO) {
        if (msgDO != null) {
            try {
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_REPORT_ID, msgDO.msgIds, AudioStats.AUDIO_AMPLITUDE_NONE);
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
                Context context = mContext;
                String strSendRequest = ACCSManager.getAccsInstance(context, Config.m22234b(context), Config.m22238d(mContext)).sendRequest(mContext, accsRequest);
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m10119i(TAG, "reportNotifyMessage", Constants.KEY_DATA_ID, strSendRequest, NotificationCompat.CATEGORY_STATUS, msgDO.msgStatus);
                }
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_CLICK, msgDO.msgStatus, AudioStats.AUDIO_AMPLITUDE_NONE);
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, AudioStats.AUDIO_AMPLITUDE_NONE);
            } catch (Throwable th) {
                ALog.m10117e(TAG, "[reportNotifyMessage] is error", th, new Object[0]);
                AppMonitorAdapter.commitCount("accs", "error", th.toString(), AudioStats.AUDIO_AMPLITUDE_NONE);
            }
        }
    }

    public void reportThirdPushToken(String str, String str2, boolean z10) {
        reportThirdPushToken(null, str, str2, null, z10);
    }

    public void reportThirdPushToken(String str, String str2, String str3, String str4, boolean z10) {
        ThreadPoolExecutorFactory.schedule(new RunnableC10569m(this, str, str3, str2, str4, z10), 10L, TimeUnit.SECONDS);
    }

    public void reportThirdPushToken(String str, String str2, String str3, boolean z10) {
        reportThirdPushToken(null, str, str2, str3, z10);
    }

    public void reportThirdPushToken(String str, String str2) {
        reportThirdPushToken(null, str, str2, null, true);
    }
}
