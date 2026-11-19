package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.C7612a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.net.AbstractC7642b;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C7677c;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.taobao.accs.data.g */
/* loaded from: classes5.dex */
public class C7626g {

    /* renamed from: a */
    private static volatile C7626g f13001a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[Catch: all -> 0x00bb, TRY_ENTER, TryCatch #11 {all -> 0x00bb, blocks: (B:24:0x00b3, B:31:0x00d0, B:35:0x00dd, B:36:0x00eb), top: B:138:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9966b(android.content.Context r23, com.taobao.accs.net.AbstractC7642b r24, android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C7626g.m9966b(android.content.Context, com.taobao.accs.net.b, android.content.Intent):void");
    }

    /* renamed from: a */
    public static C7626g m9960a() {
        if (f13001a == null) {
            synchronized (C7626g.class) {
                try {
                    if (f13001a == null) {
                        f13001a = new C7626g();
                    }
                } finally {
                }
            }
        }
        return f13001a;
    }

    /* renamed from: a */
    public static void m9961a(Context context, Intent intent) {
        m9962a(context, null, intent);
    }

    /* renamed from: a */
    public static void m9962a(Context context, AbstractC7642b abstractC7642b, Intent intent) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC7627h(context, abstractC7642b, intent));
        } catch (Throwable th) {
            if (abstractC7642b != null && intent != null) {
                String stringExtra = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                String stringExtra2 = intent.getStringExtra(Constants.KEY_DATA_ID);
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                    abstractC7642b.m10028b(Message.m9887a(stringExtra2, intent.getStringExtra(Constants.KEY_SERVICE_ID), abstractC7642b.mo10024b((String) null), 3), true);
                }
            }
            ALog.m10117e("MsgDistribute", "distribMessage", th, new Object[0]);
            UTMini.getInstance().commitEvent(66001, "MsgToBuss8", "distribMessage" + th.toString(), Integer.valueOf(Constants.SDK_VERSION_CODE));
        }
    }

    /* renamed from: a */
    public boolean m9970a(int i10, String str) {
        if (i10 == 100 || GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            return false;
        }
        long jM10144c = UtilityImpl.m10144c();
        if (jM10144c == -1 || jM10144c > 5242880) {
            return false;
        }
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "space low " + jM10144c);
        ALog.m10118e("MsgDistribute", "user space low, don't distribute", "size", Long.valueOf(jM10144c), Constants.KEY_SERVICE_ID, str);
        return true;
    }

    /* renamed from: a */
    public boolean m9971a(Context context, String str, String str2, Intent intent, ArrayList<IAppReceiver> arrayList) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String service = null;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    IAppReceiver iAppReceiver = arrayList.get(i10);
                    i10++;
                    service = iAppReceiver.getService(str);
                    if (!TextUtils.isEmpty(service)) {
                        break;
                    }
                }
            }
            if (TextUtils.isEmpty(service)) {
                service = GlobalClientInfo.getInstance(context).getService(str);
            }
            if (!TextUtils.isEmpty(service) || AdapterUtilityImpl.isTargetProcess(context)) {
                return false;
            }
            if ("accs".equals(str)) {
                ALog.m10118e("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            } else {
                ALog.m10119i("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            }
            intent.setClassName(intent.getPackage(), m9972b());
            IntentDispatch.dispatchIntent(context, intent, m9972b());
            return true;
        } catch (Throwable th) {
            ALog.m10117e("MsgDistribute", "handleMsgInChannelProcess", th, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    private void m9963a(Intent intent, String str, int i10, String str2, String str3, String str4, ArrayList<IAppReceiver> arrayList, ErrorCode errorCode) {
        String str5;
        String str6;
        ErrorCode errorCode2;
        String str7;
        int i11 = 0;
        if (ALog.isPrintLog(ALog.Level.D)) {
            str5 = str3;
            str6 = str4;
            errorCode2 = errorCode;
            str7 = "MsgDistribute";
            ALog.m10116d(str7, "handleControlMsg", Constants.KEY_CONFIG_TAG, str, Constants.KEY_DATA_ID, str6, Constants.KEY_SERVICE_ID, str5, "command", Integer.valueOf(i10), Constants.KEY_ERROR_CODE, errorCode2);
            if (arrayList != null) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    IAppReceiver iAppReceiver = arrayList.get(i12);
                    i12++;
                    IAppReceiver iAppReceiver2 = iAppReceiver;
                    ALog.m10116d(str7, "handleControlMsg", "appReceiver", iAppReceiver2 == null ? null : iAppReceiver2.getClass().getName());
                }
            }
        } else {
            str5 = str3;
            str6 = str4;
            errorCode2 = errorCode;
            str7 = "MsgDistribute";
        }
        if (errorCode2.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt() && i10 != 103 && i10 != 101) {
            ALog.m10118e(str7, "handleControlMsg", "command", Integer.valueOf(i10), Constants.KEY_ERROR_CODE, errorCode2);
        }
        if (arrayList != null) {
            if (i10 == 1) {
                ALog.m10116d(str7, "onBindApp", Constants.KEY_HTTP_CODE, errorCode2);
                errorCode2.toString();
                int size2 = arrayList.size();
                while (i11 < size2) {
                    IAppReceiver iAppReceiver3 = arrayList.get(i11);
                    i11++;
                    C7677c.m10166a(errorCode2, iAppReceiver3, null);
                }
            } else if (i10 == 2) {
                ALog.m10116d(str7, "onUnbindApp", Constants.KEY_HTTP_CODE, errorCode2);
                int size3 = arrayList.size();
                while (i11 < size3) {
                    IAppReceiver iAppReceiver4 = arrayList.get(i11);
                    i11++;
                    C7677c.m10165a(errorCode2, iAppReceiver4);
                }
            } else if (i10 == 3) {
                ALog.m10116d(str7, "onBindUser", Constants.KEY_HTTP_CODE, errorCode2);
                int size4 = arrayList.size();
                while (i11 < size4) {
                    IAppReceiver iAppReceiver5 = arrayList.get(i11);
                    i11++;
                    C7677c.m10168b(errorCode2, iAppReceiver5, str2);
                }
            } else if (i10 == 4) {
                ALog.m10116d(str7, "onUnbindUser", Constants.KEY_HTTP_CODE, errorCode2);
                int size5 = arrayList.size();
                while (i11 < size5) {
                    IAppReceiver iAppReceiver6 = arrayList.get(i11);
                    i11++;
                    C7677c.m10167b(errorCode2, iAppReceiver6);
                }
            } else if (i10 != 100) {
                if (i10 == 101 && TextUtils.isEmpty(str5)) {
                    ALog.m10116d(str7, "handleControlMsg serviceId isEmpty", new Object[0]);
                    byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                    if (byteArrayExtra != null) {
                        ALog.m10116d(str7, "onData", Constants.KEY_HTTP_CODE, errorCode2);
                        int size6 = arrayList.size();
                        while (i11 < size6) {
                            IAppReceiver iAppReceiver7 = arrayList.get(i11);
                            i11++;
                            iAppReceiver7.onData(str2, str6, byteArrayExtra);
                        }
                    }
                }
            } else if (TextUtils.isEmpty(str5)) {
                ALog.m10116d(str7, "handleControlMsg COMMAND_SEND_DATA serviceId isEmpty", new Object[0]);
                ALog.m10116d(str7, "onSendData", Constants.KEY_HTTP_CODE, errorCode2);
                int size7 = arrayList.size();
                while (i11 < size7) {
                    IAppReceiver iAppReceiver8 = arrayList.get(i11);
                    i11++;
                    iAppReceiver8.onSendData(str6, errorCode2.getCodeInt());
                }
            }
        }
        if ((arrayList != null && arrayList.size() != 0) || i10 == 104 || i10 == 103) {
            return;
        }
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str5, "1", "appReceiver null return");
        UTMini.getInstance().commitEvent(66001, "MsgToBuss7", "commandId=" + i10, "serviceId=" + str5 + " errorCode=" + errorCode2 + " dataId=" + str6, Integer.valueOf(Constants.SDK_VERSION_CODE));
    }

    /* renamed from: b */
    public String m9972b() {
        return AdapterUtilityImpl.msgService;
    }

    /* renamed from: b */
    private boolean m9967b(Context context, Intent intent) {
        return !context.getPackageName().equals(intent.getPackage());
    }

    /* renamed from: a */
    public void m9969a(Context context, AbstractC7642b abstractC7642b, ArrayList<IAppReceiver> arrayList, Intent intent, String str, String str2, int i10, ErrorCode errorCode) {
        String service;
        ALog.m10119i("MsgDistribute", "handleBusinessMsg start", Constants.KEY_DATA_ID, str2, Constants.KEY_SERVICE_ID, str, "command", Integer.valueOf(i10));
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            service = null;
            while (i11 < size) {
                IAppReceiver iAppReceiver = arrayList.get(i11);
                i11++;
                service = iAppReceiver.getService(str);
                if (!TextUtils.isEmpty(service)) {
                    break;
                }
            }
        } else {
            service = null;
        }
        if (TextUtils.isEmpty(service)) {
            service = GlobalClientInfo.getInstance(context).getService(str);
        }
        if (!TextUtils.isEmpty(service)) {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m10116d("MsgDistribute", "handleBusinessMsg to start service", "className", service);
            }
            intent.setClassName(context, service);
            IntentDispatch.dispatchIntent(context, intent, service);
        } else {
            AccsAbstractDataListener listener = GlobalClientInfo.getInstance(context).getListener(str);
            if (listener == null) {
                if (abstractC7642b != null) {
                    abstractC7642b.m10028b(Message.m9887a(str2, str, abstractC7642b.mo10024b((String) null), 0), true);
                }
                ALog.m10118e("MsgDistribute", "handleBusinessMsg getListener also null", new Object[0]);
                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "service is null");
            } else {
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m10116d("MsgDistribute", "handleBusinessMsg getListener not null", new Object[0]);
                }
                AccsAbstractDataListener.onReceiveData(context, intent, listener);
            }
        }
        UTMini.getInstance().commitEvent(66001, "MsgToBuss", "commandId=" + i10, "serviceId=" + str + " errorCode=" + errorCode + " dataId=" + str2, Integer.valueOf(Constants.SDK_VERSION_CODE));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2commandId=");
        sb2.append(i10);
        sb2.append("serviceId=");
        sb2.append(str);
        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb2.toString(), AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    /* renamed from: a */
    public void m9968a(Context context, Intent intent, int i10, ErrorCode errorCode) {
        TaoBaseService.ConnectInfo connectInfo;
        ALog.m10119i("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i10));
        HashMap map = new HashMap();
        ArrayList<IAppReceiver> arrayListM9866b = C7612a.m9863a().m9866b();
        if (arrayListM9866b != null) {
            int size = arrayListM9866b.size();
            int i11 = 0;
            while (i11 < size) {
                IAppReceiver iAppReceiver = arrayListM9866b.get(i11);
                i11++;
                Map<String, String> allServices = iAppReceiver.getAllServices();
                if (allServices != null) {
                    map.putAll(allServices);
                }
            }
        }
        if (i10 != 103) {
            if (i10 == 104) {
                for (String str : map.keySet()) {
                    String service = (String) map.get(str);
                    if (TextUtils.isEmpty(service)) {
                        service = GlobalClientInfo.getInstance(context).getService(str);
                    }
                    if (!TextUtils.isEmpty(service)) {
                        intent.setClassName(context, service);
                        IntentDispatch.dispatchIntent(context, intent, service);
                    }
                }
                return;
            }
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
                ALog.m10122w("MsgDistribute", "handBroadCastMsg not handled command " + i10, new Object[0]);
                return;
            }
            ALog.m10116d("MsgDistribute", "handBroadCastMsg not handled command " + i10, new Object[0]);
            return;
        }
        for (String str2 : map.keySet()) {
            if ("accs".equals(str2) || "windvane".equals(str2) || "motu-remote".equals(str2)) {
                String service2 = (String) map.get(str2);
                if (TextUtils.isEmpty(service2)) {
                    service2 = GlobalClientInfo.getInstance(context).getService(str2);
                }
                if (!TextUtils.isEmpty(service2)) {
                    intent.setClassName(context, service2);
                    IntentDispatch.dispatchIntent(context, intent, service2);
                }
            }
        }
        boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
        String stringExtra = intent.getStringExtra(Constants.KEY_HOST);
        boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
        boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
        if (TextUtils.isEmpty(stringExtra)) {
            connectInfo = null;
        } else {
            if (booleanExtra) {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
            } else {
                ALog.m10118e("MsgDistribute", "InAppConnection Not Available ", "error", errorCode);
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, errorCode.getCodeInt(), errorCode.getMsg());
            }
            connectInfo.connected = booleanExtra;
        }
        if (connectInfo != null) {
            ALog.m10116d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
            Intent intent2 = new Intent(Constants.ACTION_CONNECT_INFO);
            intent2.setPackage(context.getPackageName());
            intent2.putExtra(Constants.KEY_CONNECT_INFO, connectInfo);
            context.sendBroadcast(intent2, context.getPackageName() + ".ACCS");
            return;
        }
        ALog.m10118e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
    }

    /* renamed from: a */
    private boolean m9965a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        intent.getBooleanExtra("routingMsg", false);
        return booleanExtra;
    }
}
