package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C1965a;
import com.umeng.commonsdk.internal.C1966b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.C1990c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.xuexiang.xui.widget.picker.wheelview.timer.MessageHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.umeng.commonsdk.framework.a */
/* loaded from: classes.dex */
class C1964a implements UMImprintChangeCallback {

    /* renamed from: a */
    private static HandlerThread f9139a = null;

    /* renamed from: b */
    private static Handler f9140b = null;

    /* renamed from: c */
    private static Handler f9141c = null;

    /* renamed from: d */
    private static final int f9142d = 200;

    /* renamed from: e */
    private static final int f9143e = 273;

    /* renamed from: f */
    private static final int f9144f = 274;

    /* renamed from: g */
    private static final int f9145g = 512;

    /* renamed from: h */
    private static final int f9146h = 769;

    /* renamed from: i */
    private static a f9147i = null;

    /* renamed from: j */
    private static ConnectivityManager f9148j = null;

    /* renamed from: k */
    private static NetworkInfo f9149k = null;

    /* renamed from: l */
    private static IntentFilter f9150l = null;

    /* renamed from: m */
    private static boolean f9151m = false;

    /* renamed from: n */
    private static ArrayList<UMSenderStateNotify> f9152n = null;

    /* renamed from: q */
    private static final String f9155q = "report_policy";

    /* renamed from: r */
    private static final String f9156r = "report_interval";

    /* renamed from: t */
    private static final int f9158t = 15;

    /* renamed from: u */
    private static final int f9159u = 3;

    /* renamed from: v */
    private static final int f9160v = 90;

    /* renamed from: o */
    private static Object f9153o = new Object();

    /* renamed from: p */
    private static ReentrantLock f9154p = new ReentrantLock();

    /* renamed from: s */
    private static boolean f9157s = false;

    /* renamed from: w */
    private static int f9161w = 15;

    /* renamed from: x */
    private static Object f9162x = new Object();

    /* renamed from: y */
    private static BroadcastReceiver f9163y = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.a.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int size;
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context appContext = UMModuleRegister.getAppContext();
                try {
                    if (C1964a.f9148j != null) {
                        NetworkInfo unused = C1964a.f9149k = C1964a.f9148j.getActiveNetworkInfo();
                        if (C1964a.f9149k == null || !C1964a.f9149k.isAvailable()) {
                            ULog.m7606i("--->>> network disconnected.");
                            boolean unused2 = C1964a.f9151m = false;
                            return;
                        }
                        ULog.m7606i("--->>> network isAvailable, check if there are any files to send.");
                        boolean unused3 = C1964a.f9151m = true;
                        synchronized (C1964a.f9153o) {
                            if (C1964a.f9152n != null && (size = C1964a.f9152n.size()) > 0) {
                                for (int i4 = 0; i4 < size; i4++) {
                                    ((UMSenderStateNotify) C1964a.f9152n.get(i4)).onConnectionAvailable();
                                }
                            }
                        }
                        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
                        C1964a.m7377d();
                        if (C1964a.f9149k.getType() != 1 || context == null) {
                            return;
                        }
                        try {
                            if (UMWorkDispatch.eventHasExist(C1965a.f9178k)) {
                                return;
                            }
                            UMWorkDispatch.sendEvent(context, C1965a.f9178k, C1966b.m7392a(context).m7393a(), null);
                        } catch (Throwable unused4) {
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
        }
    };

    /* renamed from: com.umeng.commonsdk.framework.a$a */
    static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i4, String str) {
            if ((i4 & 8) != 8) {
                return;
            }
            ULog.m7594d("--->>> envelope file created >>> " + str);
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            C1964a.m7376c(273);
        }
    }

    public C1964a(Context context, Handler handler) {
        Context appContext = UMModuleRegister.getAppContext();
        f9148j = (ConnectivityManager) appContext.getSystemService("connectivity");
        f9141c = handler;
        try {
            if (f9139a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f9139a = handlerThread;
                handlerThread.start();
                if (f9147i == null) {
                    a aVar = new a(UMFrUtils.getEnvelopeDirPath(context));
                    f9147i = aVar;
                    aVar.startWatching();
                    ULog.m7594d("--->>> FileMonitor has already started!");
                }
                if (DeviceConfig.checkPermission(appContext, "android.permission.ACCESS_NETWORK_STATE") && f9148j != null && f9150l == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    f9150l = intentFilter;
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    BroadcastReceiver broadcastReceiver = f9163y;
                    if (broadcastReceiver != null) {
                        appContext.registerReceiver(broadcastReceiver, f9150l);
                    }
                }
                m7387n();
                if (f9140b == null) {
                    f9140b = new Handler(f9139a.getLooper()) { // from class: com.umeng.commonsdk.framework.a.2
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i4 = message.what;
                            if (i4 == 273) {
                                ULog.m7594d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                try {
                                    C1964a.f9154p.tryLock(1L, TimeUnit.SECONDS);
                                    try {
                                        C1964a.m7391r();
                                    } catch (Throwable unused) {
                                    }
                                    C1964a.f9154p.unlock();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            if (i4 == C1964a.f9144f) {
                                C1964a.m7389p();
                            } else {
                                if (i4 != 512) {
                                    return;
                                }
                                C1964a.m7390q();
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f9155q, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f9156r, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: b */
    public static int m7373b() {
        int i4;
        synchronized (f9162x) {
            i4 = f9161w;
        }
        return i4;
    }

    /* renamed from: c */
    public static void m7375c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m7376c(int i4) {
        Handler handler;
        if (!f9151m || (handler = f9140b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i4;
        f9140b.sendMessage(messageObtainMessage);
    }

    /* renamed from: d */
    public static void m7377d() {
        if (f9154p.tryLock()) {
            try {
                m7374b(273);
            } finally {
                f9154p.unlock();
            }
        }
    }

    /* renamed from: e */
    public static void m7378e() {
        m7368a(f9144f, MessageHandler.WHAT_ITEM_SELECTED);
    }

    /* renamed from: n */
    private void m7387n() {
        synchronized (f9162x) {
            if (AgooConstants.ACK_BODY_NULL.equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f9155q, ""))) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f9157s = true;
                f9161w = 15;
                int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f9156r, AgooConstants.ACK_PACK_ERROR)).intValue();
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > 90) {
                    f9161w = 15;
                } else {
                    f9161w = iIntValue * 1000;
                }
            } else {
                f9157s = false;
            }
        }
    }

    /* renamed from: o */
    private static void m7388o() {
        if (f9139a != null) {
            f9139a = null;
        }
        if (f9140b != null) {
            f9140b = null;
        }
        if (f9141c != null) {
            f9141c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static void m7389p() {
        int size;
        synchronized (f9153o) {
            ArrayList<UMSenderStateNotify> arrayList = f9152n;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    f9152n.get(i4).onSenderIdle();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m7390q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m7391r() {
        ULog.m7594d("--->>> handleProcessNext: Enter...");
        if (f9151m) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.m7594d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.m7594d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        ULog.m7594d("--->>> Ready to send envelope file [" + path + "].");
                        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                        if (!new C1990c(appContext).m7563a(envelopeFile)) {
                            ULog.m7594d("--->>> Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        ULog.m7594d("--->>> Send envelope file success, delete it.");
                        if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                            ULog.m7594d("--->>> Failed to delete already processed file. We try again after delete failed.");
                            UMFrUtils.removeEnvelopeFile(envelopeFile);
                        }
                        m7376c(273);
                        return;
                    }
                }
                m7378e();
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f9162x) {
            if (f9155q.equals(str)) {
                if (AgooConstants.ACK_BODY_NULL.equals(str2)) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f9157s = true;
                } else {
                    f9157s = false;
                }
            }
            if (f9156r.equals(str)) {
                int iIntValue = Integer.valueOf(str2).intValue();
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > 90) {
                    f9161w = 15000;
                } else {
                    f9161w = iIntValue * 1000;
                }
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f9161w);
            }
        }
    }

    /* renamed from: a */
    public static void m7370a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f9153o) {
            try {
                if (f9152n == null) {
                    f9152n = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i4 = 0; i4 < f9152n.size(); i4++) {
                        if (uMSenderStateNotify == f9152n.get(i4)) {
                            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f9152n.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    /* renamed from: b */
    private static void m7374b(int i4) {
        Handler handler;
        if (!f9151m || (handler = f9140b) == null || handler.hasMessages(i4)) {
            return;
        }
        Message messageObtainMessage = f9140b.obtainMessage();
        messageObtainMessage.what = i4;
        f9140b.sendMessage(messageObtainMessage);
    }

    /* renamed from: a */
    public static boolean m7371a() {
        boolean z3;
        synchronized (f9162x) {
            z3 = f9157s;
        }
        return z3;
    }

    /* renamed from: a */
    private static void m7369a(int i4, long j4) {
        Handler handler;
        if (!f9151m || (handler = f9140b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i4;
        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j4);
        f9140b.sendMessageDelayed(messageObtainMessage, j4);
    }

    /* renamed from: a */
    private static void m7368a(int i4, int i5) {
        Handler handler;
        if (!f9151m || (handler = f9140b) == null) {
            return;
        }
        handler.removeMessages(i4);
        Message messageObtainMessage = f9140b.obtainMessage();
        messageObtainMessage.what = i4;
        f9140b.sendMessageDelayed(messageObtainMessage, i5);
    }
}
