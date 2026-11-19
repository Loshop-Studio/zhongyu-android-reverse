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
import com.umeng.analytics.pro.C1851ai;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C1965a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.vchannel.C2027a;
import java.io.File;
import java.util.LinkedList;

/* renamed from: com.umeng.commonsdk.stateless.b */
/* loaded from: classes.dex */
public class C1985b {

    /* renamed from: a */
    public static final int f9296a = 273;

    /* renamed from: b */
    private static Context f9297b = null;

    /* renamed from: c */
    private static HandlerThread f9298c = null;

    /* renamed from: d */
    private static Handler f9299d = null;

    /* renamed from: f */
    private static final int f9301f = 274;

    /* renamed from: g */
    private static final int f9302g = 275;

    /* renamed from: h */
    private static final int f9303h = 512;

    /* renamed from: i */
    private static a f9304i = null;

    /* renamed from: j */
    private static IntentFilter f9305j = null;

    /* renamed from: k */
    private static boolean f9306k = false;

    /* renamed from: e */
    private static Object f9300e = new Object();

    /* renamed from: l */
    private static LinkedList<String> f9307l = new LinkedList<>();

    /* renamed from: m */
    private static BroadcastReceiver f9308m = new BroadcastReceiver() { // from class: com.umeng.commonsdk.stateless.b.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (context == null || intent == null) {
                return;
            }
            try {
                if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    Context unused = C1985b.f9297b = context.getApplicationContext();
                    if (C1985b.f9297b != null && (connectivityManager = (ConnectivityManager) C1985b.f9297b.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
                            boolean unused2 = C1985b.f9306k = false;
                        } else {
                            boolean unused3 = C1985b.f9306k = true;
                            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
                            C1985b.m7505b(C1985b.f9301f);
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
    };

    /* renamed from: com.umeng.commonsdk.stateless.b$a */
    static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i4, String str) {
            if ((i4 & 8) != 8) {
                return;
            }
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            C1985b.m7501a(C1985b.f9301f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[Catch: all -> 0x00b9, DONT_GENERATE, TryCatch #1 {, blocks: (B:28:0x00b7, B:27:0x00b4, B:5:0x0008, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:13:0x004b, B:14:0x0055, B:15:0x0066, B:17:0x006a, B:18:0x0077, B:20:0x0081, B:22:0x0092, B:24:0x00a2), top: B:33:0x0008, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1985b(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = com.umeng.commonsdk.stateless.C1985b.f9300e
            monitor-enter(r0)
            if (r6 == 0) goto Lb7
            android.content.Context r1 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C1985b.f9297b = r1     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb7
            android.os.HandlerThread r1 = com.umeng.commonsdk.stateless.C1985b.f9298c     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto Lb7
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "SL-NetWorkSender"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C1985b.f9298c = r1     // Catch: java.lang.Throwable -> Lb3
            r1.start()     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.b$a r1 = com.umeng.commonsdk.stateless.C1985b.f9304i     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r2 = com.umeng.commonsdk.stateless.C1985b.f9297b     // Catch: java.lang.Throwable -> Lb3
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
            com.umeng.commonsdk.debug.UMRTLog.m7355e(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            r2.mkdir()     // Catch: java.lang.Throwable -> Lb3
        L55:
            com.umeng.commonsdk.stateless.b$a r2 = new com.umeng.commonsdk.stateless.b$a     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C1985b.f9304i = r2     // Catch: java.lang.Throwable -> Lb3
            r2.startWatching()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> 2号数据仓File Monitor启动."
            com.umeng.commonsdk.debug.UMRTLog.m7355e(r1, r2)     // Catch: java.lang.Throwable -> Lb3
        L66:
            android.os.Handler r1 = com.umeng.commonsdk.stateless.C1985b.f9299d     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L77
            com.umeng.commonsdk.stateless.b$2 r1 = new com.umeng.commonsdk.stateless.b$2     // Catch: java.lang.Throwable -> Lb3
            android.os.HandlerThread r2 = com.umeng.commonsdk.stateless.C1985b.f9298c     // Catch: java.lang.Throwable -> Lb3
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C1985b.f9299d = r1     // Catch: java.lang.Throwable -> Lb3
        L77:
            android.content.Context r1 = com.umeng.commonsdk.stateless.C1985b.f9297b     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb7
            java.lang.String r1 = "walle"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb3
            r3 = 0
            java.lang.String r4 = "[stateless] begin register receiver"
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.statistics.common.ULog.m7609i(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            android.content.IntentFilter r1 = com.umeng.commonsdk.stateless.C1985b.f9305j     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto Lb7
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            com.umeng.commonsdk.stateless.C1985b.f9305j = r1     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.addAction(r2)     // Catch: java.lang.Throwable -> Lb3
            android.content.BroadcastReceiver r1 = com.umeng.commonsdk.stateless.C1985b.f9308m     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb7
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> 2号数据仓：注册网络状态监听器。"
            com.umeng.commonsdk.debug.UMRTLog.m7355e(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r1 = com.umeng.commonsdk.stateless.C1985b.f9297b     // Catch: java.lang.Throwable -> Lb3
            android.content.BroadcastReceiver r2 = com.umeng.commonsdk.stateless.C1985b.f9308m     // Catch: java.lang.Throwable -> Lb3
            android.content.IntentFilter r3 = com.umeng.commonsdk.stateless.C1985b.f9305j     // Catch: java.lang.Throwable -> Lb3
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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C1985b.<init>(android.content.Context):void");
    }

    /* renamed from: b */
    public static void m7505b(int i4) {
        Handler handler;
        try {
            if (!f9306k || (handler = f9299d) == null || handler.hasMessages(i4)) {
                return;
            }
            Message messageObtainMessage = f9299d.obtainMessage();
            messageObtainMessage.what = i4;
            f9299d.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9297b, th);
        }
    }

    /* renamed from: c */
    public static void m7506c() {
        m7505b(f9302g);
    }

    /* renamed from: d */
    public static void m7507d() {
        m7505b(512);
    }

    /* renamed from: j */
    private static void m7513j() {
        File[] fileArrM7542c = C1987d.m7542c(f9297b);
        if (fileArrM7542c != null) {
            if (f9307l.size() > 0) {
                f9307l.clear();
            }
            for (File file : fileArrM7542c) {
                f9307l.add(file.getAbsolutePath());
            }
        }
    }

    /* renamed from: k */
    private static String m7514k() {
        String str = null;
        try {
            String strPeek = f9307l.peek();
            if (strPeek == null) {
                return strPeek;
            }
            try {
                f9307l.removeFirst();
                return strPeek;
            } catch (Throwable unused) {
                str = strPeek;
                return str;
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: l */
    private static void m7515l() {
        String strPollFirst;
        if (f9307l.size() <= 0) {
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            strPollFirst = f9307l.pollFirst();
            if (!TextUtils.isEmpty(strPollFirst)) {
                File file = new File(strPollFirst);
                if (file.exists()) {
                    C1986c c1986c = new C1986c(f9297b);
                    byte[] bArrM7533a = null;
                    try {
                        bArrM7533a = C1987d.m7533a(strPollFirst);
                    } catch (Exception unused) {
                    }
                    String name = file.getName();
                    String strSubstring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : C1851ai.f8256aE;
                    String strM7543d = C1987d.m7543d(name);
                    String str = C1984a.f9294j;
                    String strM7540c = C1987d.m7540c(strM7543d);
                    if (C2027a.f9625c.equalsIgnoreCase(strM7540c)) {
                        str = C2027a.f9623a;
                    }
                    if (c1986c.m7525a(bArrM7533a, strM7540c, str, strSubstring) && !file.delete()) {
                        file.delete();
                    }
                } else {
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                }
            }
        } while (strPollFirst != null);
        f9307l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static void m7516m() {
        File fileM7527a;
        if (!f9306k || f9297b == null) {
            return;
        }
        do {
            try {
                fileM7527a = C1987d.m7527a(f9297b);
                if (fileM7527a != null && fileM7527a.getParentFile() != null && !TextUtils.isEmpty(fileM7527a.getParentFile().getName())) {
                    C1986c c1986c = new C1986c(f9297b);
                    String str = new String(Base64.decode(fileM7527a.getParentFile().getName(), 0));
                    if (C1965a.f9168a.equalsIgnoreCase(str) || C1965a.f9169b.equalsIgnoreCase(str) || C1965a.f9165A.equalsIgnoreCase(str)) {
                        new File(fileM7527a.getAbsolutePath()).delete();
                    } else {
                        ULog.m7609i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        byte[] bArrM7533a = null;
                        try {
                            bArrM7533a = C1987d.m7533a(fileM7527a.getAbsolutePath());
                        } catch (Exception unused) {
                        }
                        String str2 = C2027a.f9625c.equalsIgnoreCase(str) ? C2027a.f9623a : "";
                        String str3 = C1851ai.f8256aE;
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str)) {
                            str3 = C1851ai.f8303az;
                        }
                        if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) {
                            str3 = C1851ai.f8299av;
                        }
                        if (!c1986c.m7525a(bArrM7533a, str, str2, str3)) {
                            ULog.m7609i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        ULog.m7609i("walle", "[stateless] Send envelope file success, delete it.");
                        File file = new File(fileM7527a.getAbsolutePath());
                        if (!file.delete()) {
                            ULog.m7609i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                            file.delete();
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f9297b, th);
            }
        } while (fileM7527a != null);
        m7517n();
    }

    /* renamed from: n */
    private static void m7517n() {
        try {
            File file = new File(f9297b.getFilesDir() + File.separator + C1984a.f9289e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                C1987d.m7532a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static void m7518o() {
        if (!f9306k || f9297b == null) {
            return;
        }
        m7513j();
        m7515l();
        m7506c();
    }

    /* renamed from: p */
    private static void m7519p() {
        try {
            File file = new File(f9297b.getFilesDir() + File.separator + C1984a.f9289e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                m7505b(f9296a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m7520q() {
        m7519p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m7521r() {
    }

    /* renamed from: a */
    public static boolean m7502a() {
        synchronized (f9300e) {
            return f9304i != null;
        }
    }

    /* renamed from: b */
    public static void m7504b() {
        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        m7505b(f9301f);
    }

    /* renamed from: a */
    public static void m7501a(int i4) {
        Handler handler;
        if (!f9306k || (handler = f9299d) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i4;
        f9299d.sendMessage(messageObtainMessage);
    }
}
