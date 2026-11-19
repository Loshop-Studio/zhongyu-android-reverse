package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.C1715a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.net.AbstractC1745b;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C1780c;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.taobao.accs.data.g */
/* loaded from: classes.dex */
public class C1729g {

    /* renamed from: a */
    private static volatile C1729g f7603a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b2  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5940b(android.content.Context r29, com.taobao.accs.net.AbstractC1745b r30, android.content.Intent r31) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C1729g.m5940b(android.content.Context, com.taobao.accs.net.b, android.content.Intent):void");
    }

    /* renamed from: a */
    public static C1729g m5934a() {
        if (f7603a == null) {
            synchronized (C1729g.class) {
                if (f7603a == null) {
                    f7603a = new C1729g();
                }
            }
        }
        return f7603a;
    }

    /* renamed from: a */
    public static void m5935a(Context context, Intent intent) {
        m5936a(context, null, intent);
    }

    /* renamed from: a */
    public static void m5936a(Context context, AbstractC1745b abstractC1745b, Intent intent) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC1730h(context, abstractC1745b, intent));
        } catch (Throwable th) {
            if (abstractC1745b != null && intent != null) {
                String stringExtra = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                String stringExtra2 = intent.getStringExtra(Constants.KEY_DATA_ID);
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                    abstractC1745b.m6002b(Message.m5861a(stringExtra2, intent.getStringExtra(Constants.KEY_SERVICE_ID), abstractC1745b.mo5998b((String) null), 3), true);
                }
            }
            ALog.m6091e("MsgDistribute", "distribMessage", th, new Object[0]);
            UTMini.getInstance().commitEvent(66001, "MsgToBuss8", "distribMessage" + th.toString(), Integer.valueOf(Constants.SDK_VERSION_CODE));
        }
    }

    /* renamed from: a */
    protected boolean m5944a(int i4, String str) {
        if (i4 != 100 && !GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            long jM6118c = UtilityImpl.m6118c();
            if (jM6118c != -1 && jM6118c <= 5242880) {
                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "space low " + jM6118c);
                ALog.m6092e("MsgDistribute", "user space low, don't distribute", "size", Long.valueOf(jM6118c), Constants.KEY_SERVICE_ID, str);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected boolean m5945a(Context context, String str, String str2, Intent intent, ArrayList<IAppReceiver> arrayList) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String service = null;
            if (arrayList != null) {
                Iterator<IAppReceiver> it = arrayList.iterator();
                while (it.hasNext()) {
                    service = it.next().getService(str);
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
                ALog.m6092e("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            } else {
                ALog.m6093i("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            }
            intent.setClassName(intent.getPackage(), m5946b());
            IntentDispatch.dispatchIntent(context, intent, m5946b());
            return true;
        } catch (Throwable th) {
            ALog.m6091e("MsgDistribute", "handleMsgInChannelProcess", th, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    private void m5937a(Intent intent, String str, int i4, String str2, String str3, String str4, ArrayList<IAppReceiver> arrayList, ErrorCode errorCode) {
        int i5;
        int i6;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m6090d("MsgDistribute", "handleControlMsg", Constants.KEY_CONFIG_TAG, str, Constants.KEY_DATA_ID, str4, Constants.KEY_SERVICE_ID, str3, "command", Integer.valueOf(i4), Constants.KEY_ERROR_CODE, errorCode);
            if (arrayList != null) {
                Iterator<IAppReceiver> it = arrayList.iterator();
                while (it.hasNext()) {
                    IAppReceiver next = it.next();
                    Object[] objArr = new Object[2];
                    objArr[0] = "appReceiver";
                    objArr[1] = next == null ? null : next.getClass().getName();
                    ALog.m6090d("MsgDistribute", "handleControlMsg", objArr);
                }
            }
        }
        if (errorCode.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt() || i4 == 103 || i4 == 101) {
            i5 = 2;
            i6 = 3;
        } else {
            i5 = 2;
            i6 = 3;
            ALog.m6092e("MsgDistribute", "handleControlMsg", "command", Integer.valueOf(i4), Constants.KEY_ERROR_CODE, errorCode);
        }
        if (arrayList != null) {
            if (i4 == 1) {
                ALog.m6090d("MsgDistribute", "onBindApp", Constants.KEY_HTTP_CODE, errorCode);
                Log.d("ACCS_TEST", "onBindApp code: " + errorCode);
                Iterator<IAppReceiver> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1780c.m6140a(errorCode, it2.next(), null);
                }
            } else if (i4 == i5) {
                ALog.m6090d("MsgDistribute", "onUnbindApp", Constants.KEY_HTTP_CODE, errorCode);
                Iterator<IAppReceiver> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C1780c.m6139a(errorCode, it3.next());
                }
            } else if (i4 == i6) {
                ALog.m6090d("MsgDistribute", "onBindUser", Constants.KEY_HTTP_CODE, errorCode);
                Iterator<IAppReceiver> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C1780c.m6142b(errorCode, it4.next(), str2);
                }
            } else if (i4 == 4) {
                ALog.m6090d("MsgDistribute", "onUnbindUser", Constants.KEY_HTTP_CODE, errorCode);
                Iterator<IAppReceiver> it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    C1780c.m6141b(errorCode, it5.next());
                }
            } else if (i4 != 100) {
                if (i4 == 101 && TextUtils.isEmpty(str3)) {
                    ALog.m6090d("MsgDistribute", "handleControlMsg serviceId isEmpty", new Object[0]);
                    byte[] byteArrayExtra = intent.getByteArrayExtra(Constants.KEY_DATA);
                    if (byteArrayExtra != null) {
                        ALog.m6090d("MsgDistribute", "onData", Constants.KEY_HTTP_CODE, errorCode);
                        Iterator<IAppReceiver> it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            it6.next().onData(str2, str4, byteArrayExtra);
                        }
                    }
                }
            } else if (TextUtils.isEmpty(str3)) {
                ALog.m6090d("MsgDistribute", "handleControlMsg COMMAND_SEND_DATA serviceId isEmpty", new Object[0]);
                ALog.m6090d("MsgDistribute", "onSendData", Constants.KEY_HTTP_CODE, errorCode);
                Iterator<IAppReceiver> it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    it7.next().onSendData(str4, errorCode.getCodeInt());
                }
            }
        }
        if ((arrayList != null && arrayList.size() != 0) || i4 == 104 || i4 == 103) {
            return;
        }
        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str3, "1", "appReceiver null return");
        UTMini.getInstance().commitEvent(66001, "MsgToBuss7", "commandId=" + i4, "serviceId=" + str3 + " errorCode=" + errorCode + " dataId=" + str4, Integer.valueOf(Constants.SDK_VERSION_CODE));
    }

    /* renamed from: b */
    protected String m5946b() {
        return AdapterUtilityImpl.msgService;
    }

    /* renamed from: b */
    private boolean m5941b(Context context, Intent intent) {
        return !context.getPackageName().equals(intent.getPackage());
    }

    /* renamed from: a */
    protected void m5943a(Context context, AbstractC1745b abstractC1745b, ArrayList<IAppReceiver> arrayList, Intent intent, String str, String str2, int i4, ErrorCode errorCode) {
        String service;
        ALog.m6093i("MsgDistribute", "handleBusinessMsg start", Constants.KEY_DATA_ID, str2, Constants.KEY_SERVICE_ID, str, "command", Integer.valueOf(i4));
        if (arrayList != null) {
            Iterator<IAppReceiver> it = arrayList.iterator();
            service = null;
            while (it.hasNext()) {
                service = it.next().getService(str);
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
                ALog.m6090d("MsgDistribute", "handleBusinessMsg to start service", "className", service);
            }
            intent.setClassName(context, service);
            IntentDispatch.dispatchIntent(context, intent, service);
        } else {
            AccsAbstractDataListener listener = GlobalClientInfo.getInstance(context).getListener(str);
            if (listener != null) {
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m6090d("MsgDistribute", "handleBusinessMsg getListener not null", new Object[0]);
                }
                AccsAbstractDataListener.onReceiveData(context, intent, listener);
            } else {
                if (abstractC1745b != null) {
                    abstractC1745b.m6002b(Message.m5861a(str2, str, abstractC1745b.mo5998b((String) null), 0), true);
                }
                ALog.m6092e("MsgDistribute", "handleBusinessMsg getListener also null", new Object[0]);
                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "service is null");
            }
        }
        UTMini.getInstance().commitEvent(66001, "MsgToBuss", "commandId=" + i4, "serviceId=" + str + " errorCode=" + errorCode + " dataId=" + str2, Integer.valueOf(Constants.SDK_VERSION_CODE));
        StringBuilder sb = new StringBuilder();
        sb.append("2commandId=");
        sb.append(i4);
        sb.append("serviceId=");
        sb.append(str);
        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb.toString(), 0.0d);
    }

    /* renamed from: a */
    protected void m5942a(Context context, Intent intent, int i4, ErrorCode errorCode) {
        ALog.m6093i("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i4));
        HashMap map = new HashMap();
        ArrayList<IAppReceiver> arrayListM5840b = C1715a.m5837a().m5840b();
        if (arrayListM5840b != null) {
            Iterator<IAppReceiver> it = arrayListM5840b.iterator();
            while (it.hasNext()) {
                Map<String, String> allServices = it.next().getAllServices();
                if (allServices != null) {
                    map.putAll(allServices);
                }
            }
        }
        if (i4 != 103) {
            if (i4 == 104) {
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
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6) {
                ALog.m6096w("MsgDistribute", "handBroadCastMsg not handled command " + i4, new Object[0]);
                return;
            }
            ALog.m6090d("MsgDistribute", "handBroadCastMsg not handled command " + i4, new Object[0]);
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
        TaoBaseService.ConnectInfo connectInfo = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            if (booleanExtra) {
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
            } else {
                ALog.m6092e("MsgDistribute", "InAppConnection Not Available ", "error", errorCode);
                connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, errorCode.getCodeInt(), errorCode.getMsg());
            }
            connectInfo.connected = booleanExtra;
        }
        if (connectInfo != null) {
            ALog.m6090d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
            Intent intent2 = new Intent(Constants.ACTION_CONNECT_INFO);
            intent2.setPackage(context.getPackageName());
            intent2.putExtra(Constants.KEY_CONNECT_INFO, connectInfo);
            context.sendBroadcast(intent2, context.getPackageName() + ".ACCS");
            return;
        }
        ALog.m6092e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
    }

    /* renamed from: a */
    private boolean m5939a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        intent.getBooleanExtra("routingMsg", false);
        return booleanExtra;
    }
}
