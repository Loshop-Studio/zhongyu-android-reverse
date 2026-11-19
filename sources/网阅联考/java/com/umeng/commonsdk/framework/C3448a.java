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
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.C3474c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.umeng.commonsdk.framework.a */
/* loaded from: classes2.dex */
class C3448a implements UMImprintChangeCallback {

    /* renamed from: a */
    private static HandlerThread f2547a = null;

    /* renamed from: b */
    private static Handler f2548b = null;

    /* renamed from: c */
    private static Handler f2549c = null;

    /* renamed from: d */
    private static final int f2550d = 200;

    /* renamed from: e */
    private static final int f2551e = 273;

    /* renamed from: f */
    private static final int f2552f = 274;

    /* renamed from: g */
    private static final int f2553g = 512;

    /* renamed from: h */
    private static final int f2554h = 769;

    /* renamed from: i */
    private static a f2555i = null;

    /* renamed from: j */
    private static ConnectivityManager f2556j = null;

    /* renamed from: k */
    private static NetworkInfo f2557k = null;

    /* renamed from: l */
    private static IntentFilter f2558l = null;

    /* renamed from: m */
    private static boolean f2559m = false;

    /* renamed from: n */
    private static ArrayList<UMSenderStateNotify> f2560n = null;

    /* renamed from: q */
    private static final String f2563q = "report_policy";

    /* renamed from: r */
    private static final String f2564r = "report_interval";

    /* renamed from: t */
    private static final int f2566t = 15;

    /* renamed from: u */
    private static final int f2567u = 3;

    /* renamed from: v */
    private static final int f2568v = 90;

    /* renamed from: o */
    private static Object f2561o = new Object();

    /* renamed from: p */
    private static ReentrantLock f2562p = new ReentrantLock();

    /* renamed from: s */
    private static boolean f2565s = false;

    /* renamed from: w */
    private static int f2569w = 15;

    /* renamed from: x */
    private static Object f2570x = new Object();

    /* renamed from: y */
    private static BroadcastReceiver f2571y = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.a.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int size;
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context appContext = UMModuleRegister.getAppContext();
                try {
                    if (C3448a.f2556j != null) {
                        NetworkInfo unused = C3448a.f2557k = C3448a.f2556j.getActiveNetworkInfo();
                        if (C3448a.f2557k == null || !C3448a.f2557k.isAvailable()) {
                            ULog.m3683i("--->>> network disconnected.");
                            boolean unused2 = C3448a.f2559m = false;
                            return;
                        }
                        ULog.m3683i("--->>> network isAvailable, check if there are any files to send.");
                        boolean unused3 = C3448a.f2559m = true;
                        synchronized (C3448a.f2561o) {
                            if (C3448a.f2560n != null && (size = C3448a.f2560n.size()) > 0) {
                                for (int i4 = 0; i4 < size; i4++) {
                                    ((UMSenderStateNotify) C3448a.f2560n.get(i4)).onConnectionAvailable();
                                }
                            }
                        }
                        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
                        C3448a.m3454d();
                        if (C3448a.f2557k.getType() != 1 || context == null) {
                            return;
                        }
                        try {
                            if (UMWorkDispatch.eventHasExist(C3449a.f2586k)) {
                                return;
                            }
                            UMWorkDispatch.sendEvent(context, C3449a.f2586k, C3450b.m3469a(context).m3470a(), null);
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
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i4, String str) {
            if ((i4 & 8) != 8) {
                return;
            }
            ULog.m3671d("--->>> envelope file created >>> " + str);
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            C3448a.m3453c(273);
        }
    }

    public C3448a(Context context, Handler handler) {
        Context appContext = UMModuleRegister.getAppContext();
        f2556j = (ConnectivityManager) appContext.getSystemService("connectivity");
        f2549c = handler;
        try {
            if (f2547a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f2547a = handlerThread;
                handlerThread.start();
                if (f2555i == null) {
                    a aVar = new a(UMFrUtils.getEnvelopeDirPath(context));
                    f2555i = aVar;
                    aVar.startWatching();
                    ULog.m3671d("--->>> FileMonitor has already started!");
                }
                if (DeviceConfig.checkPermission(appContext, "android.permission.ACCESS_NETWORK_STATE") && f2556j != null && f2558l == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    f2558l = intentFilter;
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    BroadcastReceiver broadcastReceiver = f2571y;
                    if (broadcastReceiver != null) {
                        appContext.registerReceiver(broadcastReceiver, f2558l);
                    }
                }
                m3464n();
                if (f2548b == null) {
                    f2548b = new Handler(f2547a.getLooper()) { // from class: com.umeng.commonsdk.framework.a.2
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i4 = message.what;
                            if (i4 == 273) {
                                ULog.m3671d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                try {
                                    C3448a.f2562p.tryLock(1L, TimeUnit.SECONDS);
                                    try {
                                        C3448a.m3468r();
                                    } catch (Throwable unused) {
                                    }
                                    C3448a.f2562p.unlock();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            if (i4 == C3448a.f2552f) {
                                C3448a.m3466p();
                            } else {
                                if (i4 != 512) {
                                    return;
                                }
                                C3448a.m3467q();
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f2563q, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f2564r, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: b */
    public static int m3450b() {
        int i4;
        synchronized (f2570x) {
            i4 = f2569w;
        }
        return i4;
    }

    /* renamed from: c */
    public static void m3452c() {
    }

    /* renamed from: d */
    public static void m3454d() {
        if (f2562p.tryLock()) {
            try {
                m3451b(273);
            } finally {
                f2562p.unlock();
            }
        }
    }

    /* renamed from: e */
    public static void m3455e() {
        m3445a(f2552f, PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    /* renamed from: n */
    private void m3464n() {
        synchronized (f2570x) {
            if ("11".equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f2563q, ""))) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f2565s = true;
                f2569w = 15;
                int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f2564r, "15")).intValue();
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > f2568v) {
                    f2569w = 15;
                } else {
                    f2569w = iIntValue * 1000;
                }
            } else {
                f2565s = false;
            }
        }
    }

    /* renamed from: o */
    private static void m3465o() {
        if (f2547a != null) {
            f2547a = null;
        }
        if (f2548b != null) {
            f2548b = null;
        }
        if (f2549c != null) {
            f2549c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static void m3466p() {
        int size;
        synchronized (f2561o) {
            ArrayList<UMSenderStateNotify> arrayList = f2560n;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    f2560n.get(i4).onSenderIdle();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m3467q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m3468r() {
        ULog.m3671d("--->>> handleProcessNext: Enter...");
        if (f2559m) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.m3671d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.m3671d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        ULog.m3671d("--->>> Ready to send envelope file [" + path + "].");
                        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                        if (!new C3474c(appContext).m3640a(envelopeFile)) {
                            ULog.m3671d("--->>> Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        ULog.m3671d("--->>> Send envelope file success, delete it.");
                        if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                            ULog.m3671d("--->>> Failed to delete already processed file. We try again after delete failed.");
                            UMFrUtils.removeEnvelopeFile(envelopeFile);
                        }
                        m3453c(273);
                        return;
                    }
                }
                m3455e();
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f2570x) {
            if (f2563q.equals(str)) {
                if ("11".equals(str2)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f2565s = true;
                } else {
                    f2565s = false;
                }
            }
            if (f2564r.equals(str)) {
                int iIntValue = Integer.valueOf(str2).intValue();
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > f2568v) {
                    f2569w = 15000;
                } else {
                    f2569w = iIntValue * 1000;
                }
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f2569w);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m3453c(int i4) {
        Handler handler;
        if (!f2559m || (handler = f2548b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i4;
        f2548b.sendMessage(messageObtainMessage);
    }

    /* renamed from: a */
    public static void m3447a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f2561o) {
            try {
                if (f2560n == null) {
                    f2560n = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i4 = 0; i4 < f2560n.size(); i4++) {
                        if (uMSenderStateNotify == f2560n.get(i4)) {
                            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f2560n.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    /* renamed from: b */
    private static void m3451b(int i4) {
        Handler handler;
        if (!f2559m || (handler = f2548b) == null || handler.hasMessages(i4)) {
            return;
        }
        Message messageObtainMessage = f2548b.obtainMessage();
        messageObtainMessage.what = i4;
        f2548b.sendMessage(messageObtainMessage);
    }

    /* renamed from: a */
    public static boolean m3448a() {
        boolean z3;
        synchronized (f2570x) {
            z3 = f2565s;
        }
        return z3;
    }

    /* renamed from: a */
    private static void m3446a(int i4, long j4) {
        Handler handler;
        if (!f2559m || (handler = f2548b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i4;
        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j4);
        f2548b.sendMessageDelayed(messageObtainMessage, j4);
    }

    /* renamed from: a */
    private static void m3445a(int i4, int i5) {
        Handler handler;
        if (!f2559m || (handler = f2548b) == null) {
            return;
        }
        handler.removeMessages(i4);
        Message messageObtainMessage = f2548b.obtainMessage();
        messageObtainMessage.what = i4;
        f2548b.sendMessageDelayed(messageObtainMessage, i5);
    }
}
