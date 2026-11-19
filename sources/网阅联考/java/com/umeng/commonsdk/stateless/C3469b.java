package com.umeng.commonsdk.stateless;

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
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.vchannel.C3511a;
import java.io.File;
import java.util.LinkedList;

/* renamed from: com.umeng.commonsdk.stateless.b */
/* loaded from: classes2.dex */
public class C3469b {

    /* renamed from: a */
    public static final int f2704a = 273;

    /* renamed from: b */
    private static Context f2705b = null;

    /* renamed from: c */
    private static HandlerThread f2706c = null;

    /* renamed from: d */
    private static Handler f2707d = null;

    /* renamed from: f */
    private static final int f2709f = 274;

    /* renamed from: g */
    private static final int f2710g = 275;

    /* renamed from: h */
    private static final int f2711h = 512;

    /* renamed from: i */
    private static a f2712i = null;

    /* renamed from: j */
    private static IntentFilter f2713j = null;

    /* renamed from: k */
    private static boolean f2714k = false;

    /* renamed from: e */
    private static Object f2708e = new Object();

    /* renamed from: l */
    private static LinkedList<String> f2715l = new LinkedList<>();

    /* renamed from: m */
    private static BroadcastReceiver f2716m = new BroadcastReceiver() { // from class: com.umeng.commonsdk.stateless.b.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (context == null || intent == null) {
                return;
            }
            try {
                if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    Context unused = C3469b.f2705b = context.getApplicationContext();
                    if (C3469b.f2705b != null && (connectivityManager = (ConnectivityManager) C3469b.f2705b.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
                            boolean unused2 = C3469b.f2714k = false;
                        } else {
                            boolean unused3 = C3469b.f2714k = true;
                            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
                            C3469b.m3582b(C3469b.f2709f);
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
    };

    /* renamed from: com.umeng.commonsdk.stateless.b$a */
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i4, String str) {
            if ((i4 & 8) != 8) {
                return;
            }
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            C3469b.m3578a(C3469b.f2709f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[Catch: all -> 0x00b9, DONT_GENERATE, TryCatch #1 {, blocks: (B:28:0x00b7, B:27:0x00b4, B:5:0x0008, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:13:0x004b, B:14:0x0055, B:15:0x0066, B:17:0x006a, B:18:0x0077, B:20:0x0081, B:22:0x0092, B:24:0x00a2), top: B:33:0x0008, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3469b(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = com.umeng.commonsdk.stateless.C3469b.f2708e
            monitor-enter(r0)
            if (r6 == 0) goto Lb7
            android.content.Context r1 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C3469b.f2705b = r1     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb7
            android.os.HandlerThread r1 = com.umeng.commonsdk.stateless.C3469b.f2706c     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto Lb7
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "SL-NetWorkSender"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C3469b.f2706c = r1     // Catch: java.lang.Throwable -> Lb3
            r1.start()     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.b$a r1 = com.umeng.commonsdk.stateless.C3469b.f2712i     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r2 = com.umeng.commonsdk.stateless.C3469b.f2705b     // Catch: java.lang.Throwable -> Lb3
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> Lb3
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> Lb3
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = ".emitter"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb3
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> Lb3
            if (r3 != 0) goto L55
            java.lang.String r3 = "MobclickRT"
            java.lang.String r4 = "--->>> 2号数据仓目录不存在，创建之。"
            com.umeng.commonsdk.debug.UMRTLog.m3432e(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            r2.mkdir()     // Catch: java.lang.Throwable -> Lb3
        L55:
            com.umeng.commonsdk.stateless.b$a r2 = new com.umeng.commonsdk.stateless.b$a     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C3469b.f2712i = r2     // Catch: java.lang.Throwable -> Lb3
            r2.startWatching()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> 2号数据仓File Monitor启动."
            com.umeng.commonsdk.debug.UMRTLog.m3432e(r1, r2)     // Catch: java.lang.Throwable -> Lb3
        L66:
            android.os.Handler r1 = com.umeng.commonsdk.stateless.C3469b.f2707d     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L77
            com.umeng.commonsdk.stateless.b$2 r1 = new com.umeng.commonsdk.stateless.b$2     // Catch: java.lang.Throwable -> Lb3
            android.os.HandlerThread r2 = com.umeng.commonsdk.stateless.C3469b.f2706c     // Catch: java.lang.Throwable -> Lb3
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C3469b.f2707d = r1     // Catch: java.lang.Throwable -> Lb3
        L77:
            android.content.Context r1 = com.umeng.commonsdk.stateless.C3469b.f2705b     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb7
            java.lang.String r1 = "walle"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = "[stateless] begin register receiver"
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.statistics.common.ULog.m3686i(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            android.content.IntentFilter r1 = com.umeng.commonsdk.stateless.C3469b.f2713j     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto Lb7
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C3469b.f2713j = r1     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.addAction(r2)     // Catch: java.lang.Throwable -> Lb3
            android.content.BroadcastReceiver r1 = com.umeng.commonsdk.stateless.C3469b.f2716m     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb7
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> 2号数据仓：注册网络状态监听器。"
            com.umeng.commonsdk.debug.UMRTLog.m3432e(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r1 = com.umeng.commonsdk.stateless.C3469b.f2705b     // Catch: java.lang.Throwable -> Lb3
            android.content.BroadcastReceiver r2 = com.umeng.commonsdk.stateless.C3469b.f2716m     // Catch: java.lang.Throwable -> Lb3
            android.content.IntentFilter r3 = com.umeng.commonsdk.stateless.C3469b.f2713j     // Catch: java.lang.Throwable -> Lb3
            r1.registerReceiver(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r1)     // Catch: java.lang.Throwable -> Lb9
        Lb7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb9
            return
        Lb9:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb9
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3469b.<init>(android.content.Context):void");
    }

    /* renamed from: b */
    public static void m3582b(int i4) {
        Handler handler;
        try {
            if (!f2714k || (handler = f2707d) == null || handler.hasMessages(i4)) {
                return;
            }
            Message messageObtainMessage = f2707d.obtainMessage();
            messageObtainMessage.what = i4;
            f2707d.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f2705b, th);
        }
    }

    /* renamed from: c */
    public static void m3583c() {
        m3582b(f2710g);
    }

    /* renamed from: d */
    public static void m3584d() {
        m3582b(512);
    }

    /* renamed from: j */
    private static void m3590j() {
        File[] fileArrM3619c = C3471d.m3619c(f2705b);
        if (fileArrM3619c != null) {
            if (f2715l.size() > 0) {
                f2715l.clear();
            }
            for (File file : fileArrM3619c) {
                f2715l.add(file.getAbsolutePath());
            }
        }
    }

    /* renamed from: k */
    private static String m3591k() {
        String str = null;
        try {
            String strPeek = f2715l.peek();
            if (strPeek == null) {
                return strPeek;
            }
            try {
                f2715l.removeFirst();
                return strPeek;
            } catch (Throwable unused) {
                str = strPeek;
                return str;
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: l */
    private static void m3592l() {
        String strPollFirst;
        byte[] bArrM3610a;
        if (f2715l.size() <= 0) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            strPollFirst = f2715l.pollFirst();
            if (!TextUtils.isEmpty(strPollFirst)) {
                File file = new File(strPollFirst);
                if (file.exists()) {
                    C3470c c3470c = new C3470c(f2705b);
                    try {
                        bArrM3610a = C3471d.m3610a(strPollFirst);
                    } catch (Exception unused) {
                        bArrM3610a = null;
                    }
                    String name = file.getName();
                    String strSubstring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : C3335ai.f1664aE;
                    String strM3620d = C3471d.m3620d(name);
                    String str = C3468a.f2702j;
                    String strM3617c = C3471d.m3617c(strM3620d);
                    if (C3511a.f3033c.equalsIgnoreCase(strM3617c)) {
                        str = C3511a.f3031a;
                    }
                    if (c3470c.m3602a(bArrM3610a, strM3617c, str, strSubstring) && !file.delete()) {
                        file.delete();
                    }
                } else {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                }
            }
        } while (strPollFirst != null);
        f2715l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static void m3593m() {
        File fileM3604a;
        byte[] bArrM3610a;
        if (!f2714k || f2705b == null) {
            return;
        }
        do {
            try {
                fileM3604a = C3471d.m3604a(f2705b);
                if (fileM3604a != null && fileM3604a.getParentFile() != null && !TextUtils.isEmpty(fileM3604a.getParentFile().getName())) {
                    C3470c c3470c = new C3470c(f2705b);
                    String str = new String(Base64.decode(fileM3604a.getParentFile().getName(), 0));
                    if (C3449a.f2576a.equalsIgnoreCase(str) || C3449a.f2577b.equalsIgnoreCase(str) || C3449a.f2573A.equalsIgnoreCase(str)) {
                        new File(fileM3604a.getAbsolutePath()).delete();
                    } else {
                        ULog.m3686i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        try {
                            bArrM3610a = C3471d.m3610a(fileM3604a.getAbsolutePath());
                        } catch (Exception unused) {
                            bArrM3610a = null;
                        }
                        String str2 = C3511a.f3033c.equalsIgnoreCase(str) ? C3511a.f3031a : "";
                        String str3 = C3335ai.f1664aE;
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str)) {
                            str3 = C3335ai.f1711az;
                        }
                        if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) {
                            str3 = C3335ai.f1707av;
                        }
                        if (!c3470c.m3602a(bArrM3610a, str, str2, str3)) {
                            ULog.m3686i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        ULog.m3686i("walle", "[stateless] Send envelope file success, delete it.");
                        File file = new File(fileM3604a.getAbsolutePath());
                        if (!file.delete()) {
                            ULog.m3686i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                            file.delete();
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f2705b, th);
            }
        } while (fileM3604a != null);
        m3594n();
    }

    /* renamed from: n */
    private static void m3594n() {
        try {
            File file = new File(f2705b.getFilesDir() + File.separator + C3468a.f2697e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                C3471d.m3609a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static void m3595o() {
        if (!f2714k || f2705b == null) {
            return;
        }
        m3590j();
        m3592l();
        m3583c();
    }

    /* renamed from: p */
    private static void m3596p() {
        try {
            File file = new File(f2705b.getFilesDir() + File.separator + C3468a.f2697e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                m3582b(f2704a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m3597q() {
        m3596p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m3598r() {
    }

    /* renamed from: a */
    public static boolean m3579a() {
        synchronized (f2708e) {
            return f2712i != null;
        }
    }

    /* renamed from: b */
    public static void m3581b() {
        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        m3582b(f2709f);
    }

    /* renamed from: a */
    public static void m3578a(int i4) {
        Handler handler;
        if (!f2714k || (handler = f2707d) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i4;
        f2707d.sendMessage(messageObtainMessage);
    }
}
