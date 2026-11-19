package com.taobao.accs.base;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.IACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p085ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class AccsAbstractDataListener implements AccsDataListenerV2 {
    private static final String TAG = "AccsAbstractDataListener";

    private static Map<TaoBaseService.ExtHeaderType, String> getExtHeader(Map<Integer, String> map) {
        HashMap map2 = null;
        if (map == null) {
            return null;
        }
        try {
            HashMap map3 = new HashMap();
            try {
                for (TaoBaseService.ExtHeaderType extHeaderType : TaoBaseService.ExtHeaderType.values()) {
                    String str = map.get(Integer.valueOf(extHeaderType.ordinal()));
                    if (!TextUtils.isEmpty(str)) {
                        map3.put(extHeaderType, str);
                    }
                }
                return map3;
            } catch (Exception e10) {
                e = e10;
                map2 = map3;
                ALog.m10117e(TAG, "getExtHeader", e, new Object[0]);
                return map2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static TaoBaseService.ExtraInfo getExtraInfo(Intent intent) {
        TaoBaseService.ExtraInfo extraInfo = new TaoBaseService.ExtraInfo();
        try {
            HashMap map = (HashMap) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER);
            Map<TaoBaseService.ExtHeaderType, String> extHeader = getExtHeader(map);
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_HOST);
            extraInfo.connType = intent.getIntExtra(Constants.KEY_CONN_TYPE, 0);
            extraInfo.extHeader = extHeader;
            extraInfo.oriExtHeader = map;
            extraInfo.fromPackage = stringExtra;
            extraInfo.fromHost = stringExtra2;
            return extraInfo;
        } catch (Throwable th) {
            ALog.m10117e(TAG, "getExtraInfo", th, new Object[0]);
            return extraInfo;
        }
    }

    public static int onReceiveData(Context context, Intent intent, AccsDataListenerV2 accsDataListenerV2) {
        int i10;
        String str;
        String str2;
        Intent intent2 = intent;
        if (accsDataListenerV2 == null || context == null) {
            ALog.m10118e(TAG, "onReceiveData listener or context null", new Object[0]);
            return 2;
        }
        if (intent2 == null) {
            return 2;
        }
        String str3 = "";
        try {
            int intExtra = intent2.getIntExtra("command", -1);
            ErrorCode errorCode = Constants.getErrorCode(intent2);
            String stringExtra = intent2.getStringExtra(Constants.KEY_USER_ID);
            String stringExtra2 = intent2.getStringExtra(Constants.KEY_DATA_ID);
            i10 = 2;
            try {
                String stringExtra3 = intent2.getStringExtra(Constants.KEY_SERVICE_ID);
                try {
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        str2 = stringExtra2;
                        str = stringExtra3;
                        try {
                            ALog.m10119i(TAG, "onReceiveData", Constants.KEY_DATA_ID, stringExtra2, Constants.KEY_SERVICE_ID, stringExtra3, "command", Integer.valueOf(intExtra), "className", accsDataListenerV2.getClass().getName());
                        } catch (Exception e10) {
                            e = e10;
                            str3 = str;
                            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str3, "1", "callback error" + e.toString());
                            ALog.m10117e(TAG, "onReceiveData", e, new Object[0]);
                            return i10;
                        }
                    } else {
                        str2 = stringExtra2;
                        str = stringExtra3;
                    }
                    if (intExtra <= 0) {
                        ALog.m10122w(TAG, "onReceiveData command not handled " + intExtra, new Object[0]);
                        return 2;
                    }
                    UTMini.getInstance().commitEvent(66001, "MsgToBuss5", "commandId=" + intExtra, "serviceId=" + str + " dataId=" + str2, Integer.valueOf(Constants.SDK_VERSION_CODE));
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_TO_BUSS, "3commandId=" + intExtra + "serviceId=" + str, AudioStats.AUDIO_AMPLITUDE_NONE);
                    if (intExtra == 5) {
                        accsDataListenerV2.onBind(str, errorCode.getCodeInt(), getExtraInfo(intent2));
                        return 2;
                    }
                    if (intExtra == 6) {
                        accsDataListenerV2.onUnbind(str, errorCode.getCodeInt(), getExtraInfo(intent2));
                        return 2;
                    }
                    try {
                        if (intExtra == 100) {
                            String stringExtra4 = intent2.getStringExtra(Constants.KEY_DATA_ID);
                            if (TextUtils.equals(Constants.SEND_TYPE_RES, intent2.getStringExtra(Constants.KEY_SEND_TYPE))) {
                                byte[] byteArrayExtra = intent2.getByteArrayExtra("data");
                                int codeInt = errorCode.getCodeInt();
                                String msg = errorCode.getMsg();
                                TaoBaseService.ExtraInfo extraInfo = getExtraInfo(intent2);
                                String str4 = str;
                                accsDataListenerV2.onResponse(str4, stringExtra4, codeInt, msg, byteArrayExtra, extraInfo);
                                intent2 = str4;
                            } else {
                                int codeInt2 = errorCode.getCodeInt();
                                String msg2 = errorCode.getMsg();
                                TaoBaseService.ExtraInfo extraInfo2 = getExtraInfo(intent2);
                                String str5 = str;
                                accsDataListenerV2.onSendData(str5, stringExtra4, codeInt2, msg2, extraInfo2);
                                intent2 = str5;
                            }
                        } else {
                            if (intExtra != 101) {
                                if (intExtra == 103) {
                                    boolean booleanExtra = intent2.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
                                    String stringExtra5 = intent2.getStringExtra(Constants.KEY_HOST);
                                    boolean booleanExtra2 = intent2.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                                    boolean booleanExtra3 = intent2.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                                    if (TextUtils.isEmpty(stringExtra5)) {
                                        return 2;
                                    }
                                    if (booleanExtra) {
                                        accsDataListenerV2.onConnected(new TaoBaseService.ConnectInfo(stringExtra5, booleanExtra2, booleanExtra3));
                                        return 2;
                                    }
                                    accsDataListenerV2.onDisconnected(new TaoBaseService.ConnectInfo(stringExtra5, booleanExtra2, booleanExtra3, errorCode.getCodeInt(), errorCode.getMsg()));
                                    return 2;
                                }
                                if (intExtra != 104) {
                                    ALog.m10122w(TAG, "onReceiveData command not handled " + intExtra, new Object[0]);
                                    return 2;
                                }
                                boolean booleanExtra4 = intent2.getBooleanExtra(Constants.KEY_ANTI_BRUSH_RET, false);
                                ALog.m10118e(TAG, "onReceiveData anti brush result:" + booleanExtra4, new Object[0]);
                                accsDataListenerV2.onAntiBrush(booleanExtra4, null);
                                return 2;
                            }
                            byte[] byteArrayExtra2 = intent2.getByteArrayExtra("data");
                            boolean booleanExtra5 = intent2.getBooleanExtra(Constants.KEY_NEED_BUSINESS_ACK, false);
                            if (byteArrayExtra2 == null) {
                                ALog.m10118e(TAG, "onReceiveData COMMAND_RECEIVE_DATA msg null", new Object[0]);
                                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "COMMAND_RECEIVE_DATA msg null");
                                return 2;
                            }
                            String stringExtra6 = intent2.getStringExtra(Constants.KEY_DATA_ID);
                            if (ALog.isPrintLog(ALog.Level.D)) {
                                ALog.m10116d(TAG, "onReceiveData COMMAND_RECEIVE_DATA onData dataId:" + stringExtra6 + " serviceId:" + str, new Object[0]);
                            }
                            TaoBaseService.ExtraInfo extraInfo3 = getExtraInfo(intent2);
                            if (booleanExtra5) {
                                ALog.m10119i(TAG, "onReceiveData try to send biz ack dataId " + stringExtra6, new Object[0]);
                                sendBusinessAck(context, intent2, stringExtra6, extraInfo3.oriExtHeader);
                            }
                            NetPerformanceMonitor netPerformanceMonitor = (NetPerformanceMonitor) intent2.getSerializableExtra(Constants.KEY_MONIROT);
                            if (netPerformanceMonitor != null) {
                                netPerformanceMonitor.onToAccsTime();
                            }
                            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_TO_BUSS_SUCCESS, "1commandId=101serviceId=" + str, AudioStats.AUDIO_AMPLITUDE_NONE);
                            String str6 = str;
                            accsDataListenerV2.onData(str6, stringExtra, stringExtra6, byteArrayExtra2, extraInfo3);
                            intent2 = str6;
                        }
                        return 2;
                    } catch (Exception e11) {
                        e = e11;
                        str = intent2;
                        str3 = str;
                        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str3, "1", "callback error" + e.toString());
                        ALog.m10117e(TAG, "onReceiveData", e, new Object[0]);
                        return i10;
                    }
                } catch (Exception e12) {
                    e = e12;
                    str = stringExtra3;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            i10 = 2;
        }
    }

    private static void sendBusinessAck(Context context, Intent intent, String str, Map<Integer, String> map) {
        try {
            ALog.m10119i(TAG, "sendBusinessAck", Constants.KEY_DATA_ID, str);
            if (intent != null) {
                String stringExtra = intent.getStringExtra(Constants.KEY_HOST);
                String stringExtra2 = intent.getStringExtra("source");
                String stringExtra3 = intent.getStringExtra("target");
                String stringExtra4 = intent.getStringExtra(Constants.KEY_APP_KEY);
                String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                short shortExtra = intent.getShortExtra(Constants.KEY_FLAGS, (short) 0);
                IACCSManager accsInstance = ACCSManager.getAccsInstance(context, stringExtra4, stringExtra5);
                if (accsInstance == null) {
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, "no acsmgr", AudioStats.AUDIO_AMPLITUDE_NONE);
                } else {
                    accsInstance.sendBusinessAck(stringExtra3, stringExtra2, str, shortExtra, stringExtra, map);
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_BUSINESS_ACK_SUCC, "", AudioStats.AUDIO_AMPLITUDE_NONE);
                }
            }
        } catch (Throwable th) {
            ALog.m10117e(TAG, "sendBusinessAck", th, new Object[0]);
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, th.toString(), AudioStats.AUDIO_AMPLITUDE_NONE);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i10, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListenerV2
    public void onBind(String str, int i10, String str2, TaoBaseService.ExtraInfo extraInfo) {
        onBind(str, i10, extraInfo);
    }

    @Override // com.taobao.accs.base.AccsDataListenerV2
    public void onResponse(String str, String str2, int i10, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        onResponse(str, str2, i10, bArr, extraInfo);
    }

    @Override // com.taobao.accs.base.AccsDataListenerV2
    public void onSendData(String str, String str2, int i10, String str3, TaoBaseService.ExtraInfo extraInfo) {
        onSendData(str, str2, i10, extraInfo);
    }

    @Override // com.taobao.accs.base.AccsDataListenerV2
    public void onUnbind(String str, int i10, String str2, TaoBaseService.ExtraInfo extraInfo) {
        onUnbind(str, i10, extraInfo);
    }
}
