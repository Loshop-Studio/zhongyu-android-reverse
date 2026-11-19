package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.analytics.pro.C1868az;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.InterfaceC2013d;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.proto.C2023d;
import com.umeng.commonsdk.statistics.proto.C2024e;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ImprintHandler implements FileLockCallback {

    /* renamed from: a */
    private static final String f9369a = "ImprintHandler";

    /* renamed from: c */
    private static final String f9371c = ".imprint";

    /* renamed from: k */
    private static Context f9376k = null;

    /* renamed from: l */
    private static FileLockUtil f9377l = null;

    /* renamed from: m */
    private static final int f9378m = 0;

    /* renamed from: n */
    private static final int f9379n = 1;

    /* renamed from: e */
    private InterfaceC2013d f9382e;

    /* renamed from: h */
    private C1995a f9383h = new C1995a();

    /* renamed from: i */
    private C2023d f9384i = null;

    /* renamed from: b */
    private static Object f9370b = new Object();

    /* renamed from: d */
    private static final byte[] f9372d = "pbl0".getBytes();

    /* renamed from: f */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f9373f = new HashMap();

    /* renamed from: g */
    private static Object f9374g = new Object();

    /* renamed from: j */
    private static ImprintHandler f9375j = null;

    /* renamed from: o */
    private static Map<String, UMImprintPreProcessCallback> f9380o = new HashMap();

    /* renamed from: p */
    private static Object f9381p = new Object();

    private ImprintHandler(Context context) {
        f9376k = context.getApplicationContext();
    }

    /* renamed from: a */
    private static void m7659a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f9374g) {
            try {
                int i4 = 0;
                if (f9373f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f9373f.get(str);
                    int size = arrayList.size();
                    ULog.m7606i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i4 < size) {
                        if (uMImprintChangeCallback == arrayList.get(i4)) {
                            ULog.m7606i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i4++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.m7606i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList<UMImprintChangeCallback> arrayList2 = new ArrayList<>();
                    int size2 = arrayList2.size();
                    ULog.m7606i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i4 < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i4)) {
                            ULog.m7606i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i4++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.m7606i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f9373f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f9376k, th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: all -> 0x009f, DONT_GENERATE, TryCatch #1 {, blocks: (B:24:0x009d, B:23:0x0098, B:8:0x000d, B:10:0x0015, B:12:0x0023, B:14:0x003e, B:16:0x0044, B:17:0x005c, B:18:0x005f, B:20:0x007d), top: B:30:0x000d, inners: #0 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m7661b(java.lang.String r5, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto La2
            if (r6 != 0) goto La
            goto La2
        La:
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9374g
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9373f     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L9d
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9373f     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L97
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L97
            if (r2 <= 0) goto L9d
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "--->>> removeCallback: before remove: callbacks size is: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L97
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L97
            com.umeng.commonsdk.statistics.common.ULog.m7606i(r3)     // Catch: java.lang.Throwable -> L97
            r3 = 0
        L3c:
            if (r3 >= r2) goto L5f
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L97
            if (r6 != r4) goto L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "--->>> removeCallback: remove index "
            r6.append(r2)     // Catch: java.lang.Throwable -> L97
            r6.append(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L97
            com.umeng.commonsdk.statistics.common.ULog.m7606i(r6)     // Catch: java.lang.Throwable -> L97
            r1.remove(r3)     // Catch: java.lang.Throwable -> L97
            goto L5f
        L5c:
            int r3 = r3 + 1
            goto L3c
        L5f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "--->>> removeCallback: after remove: callbacks size is: "
            r6.append(r2)     // Catch: java.lang.Throwable -> L97
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L97
            r6.append(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L97
            com.umeng.commonsdk.statistics.common.ULog.m7606i(r6)     // Catch: java.lang.Throwable -> L97
            int r6 = r1.size()     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L9d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "--->>> removeCallback: remove key from map: key = "
            r6.append(r1)     // Catch: java.lang.Throwable -> L97
            r6.append(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L97
            com.umeng.commonsdk.statistics.common.ULog.m7606i(r6)     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9373f     // Catch: java.lang.Throwable -> L97
            r6.remove(r5)     // Catch: java.lang.Throwable -> L97
            goto L9d
        L97:
            r5 = move-exception
            android.content.Context r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9376k     // Catch: java.lang.Throwable -> L9f
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r5)     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            return
        L9f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            throw r5
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.m7661b(java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback):void");
    }

    /* renamed from: c */
    private boolean m7662c(C2023d c2023d) {
        if (!c2023d.m7876i().equals(m7666a(c2023d))) {
            return false;
        }
        for (C2024e c2024e : c2023d.m7869c().values()) {
            byte[] bArrReverseHexString = DataHelper.reverseHexString(c2024e.m7909h());
            byte[] bArrM7670a = m7670a(c2024e);
            for (int i4 = 0; i4 < 4; i4++) {
                if (bArrReverseHexString[i4] != bArrM7670a[i4]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    private C2023d m7663d(C2023d c2023d) {
        Map<String, C2024e> mapM7869c = c2023d.m7869c();
        if (mapM7869c.containsKey(C1851ai.f8318f)) {
            mapM7869c.remove(C1851ai.f8318f);
            this.f9383h.m7678a(C1851ai.f8318f);
            c2023d.m7861a(c2023d.m7873f());
            c2023d.m7862a(m7666a(c2023d));
        }
        return c2023d;
    }

    /* renamed from: e */
    private C2023d m7664e(C2023d c2023d) {
        ArrayList<UMImprintChangeCallback> arrayList;
        boolean z3;
        ArrayList<UMImprintChangeCallback> arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map<String, C2024e> mapM7869c = c2023d.m7869c();
        ArrayList<String> arrayList3 = new ArrayList(mapM7869c.size() / 2);
        Iterator<Map.Entry<String, C2024e>> it = mapM7869c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, C2024e> next = it.next();
            if (next.getValue().m7905d()) {
                String key = next.getKey();
                String str = next.getValue().f9537a;
                synchronized (f9381p) {
                    z3 = !TextUtils.isEmpty(key) && f9380o.containsKey(key) && (uMImprintPreProcessCallback = f9380o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str);
                }
                if (z3) {
                    arrayList3.add(key);
                }
                synchronized (f9374g) {
                    if (!TextUtils.isEmpty(key) && f9373f.containsKey(key) && (arrayList2 = f9373f.get(key)) != null) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            arrayList2.get(i4).onImprintValueChanged(key, str);
                        }
                    }
                }
            } else {
                arrayList3.add(next.getKey());
            }
        }
        for (String str2 : arrayList3) {
            synchronized (f9374g) {
                if (!TextUtils.isEmpty(str2) && f9373f.containsKey(str2) && (arrayList = f9373f.get(str2)) != null) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        arrayList.get(i5).onImprintValueChanged(str2, null);
                    }
                }
            }
            mapM7869c.remove(str2);
        }
        return c2023d;
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        if (f9375j == null) {
            f9375j = new ImprintHandler(context);
            f9377l = new FileLockUtil();
            f9377l.doFileOperateion(new File(f9376k.getFilesDir(), f9371c), f9375j, 0);
        }
        return f9375j;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i4) {
        if (i4 == 0) {
            f9375j.m7665e();
        } else if (i4 == 1) {
            f9375j.m7658a(file);
        }
        return true;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        m7659a(str, uMImprintChangeCallback);
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (TextUtils.isEmpty(str) || uMImprintPreProcessCallback == null) {
            return;
        }
        synchronized (f9381p) {
            try {
                if (f9380o.containsKey(str)) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                } else {
                    f9380o.put(str, uMImprintPreProcessCallback);
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                }
            } finally {
            }
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        m7661b(str, uMImprintChangeCallback);
    }

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a */
    public static class C1995a {

        /* renamed from: a */
        private Map<String, String> f9385a = new HashMap();

        C1995a() {
        }

        /* renamed from: b */
        private synchronized void m7675b(C2023d c2023d) {
            C2024e c2024e;
            if (c2023d != null) {
                if (c2023d.m7872e()) {
                    Map<String, C2024e> mapM7869c = c2023d.m7869c();
                    for (String str : mapM7869c.keySet()) {
                        if (!TextUtils.isEmpty(str) && (c2024e = mapM7869c.get(str)) != null) {
                            String strM7901b = c2024e.m7901b();
                            if (!TextUtils.isEmpty(strM7901b)) {
                                this.f9385a.put(str, strM7901b);
                                if (AnalyticsConstants.UM_DEBUG) {
                                    Log.i(ImprintHandler.f9369a, "imKey is " + str + ", imValue is " + strM7901b);
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public synchronized void m7678a(String str) {
            Map<String, String> map = this.f9385a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f9385a.containsKey(str)) {
                this.f9385a.remove(str);
            }
        }

        C1995a(C2023d c2023d) {
            m7677a(c2023d);
        }

        /* renamed from: a */
        public void m7677a(C2023d c2023d) {
            if (c2023d == null) {
                return;
            }
            m7675b(c2023d);
        }

        /* renamed from: a */
        public synchronized String m7676a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f9385a.size() > 0) {
                String str3 = this.f9385a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }
    }

    /* renamed from: c */
    public C1995a m7673c() {
        return this.f9383h;
    }

    /* renamed from: d */
    public void m7674d() throws IOException {
        if (this.f9384i == null || f9377l == null) {
            return;
        }
        File file = new File(f9376k.getFilesDir(), f9371c);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e4) {
                    UMCrashManager.reportCrash(f9376k, e4);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f9377l.doFileOperateion(file, f9375j, 1);
    }

    /* renamed from: b */
    public void m7672b(C2023d c2023d) {
        C2023d c2023dM7657a;
        boolean z3;
        if (c2023d == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m7354d(UMRTLog.RTLOG_TAG, "Imprint is null");
                return;
            }
            return;
        }
        if (!m7662c(c2023d)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
                return;
            }
            return;
        }
        boolean z4 = AnalyticsConstants.UM_DEBUG;
        HashMap map = new HashMap();
        synchronized (this) {
            C2023d c2023d2 = this.f9384i;
            C2023d c2023dM7663d = m7663d(c2023d);
            String strM7876i = null;
            String strM7876i2 = c2023d2 == null ? null : c2023d2.m7876i();
            if (c2023d2 == null) {
                c2023dM7657a = m7664e(c2023dM7663d);
            } else {
                c2023dM7657a = m7657a(c2023d2, c2023dM7663d, map);
            }
            this.f9384i = c2023dM7657a;
            if (c2023dM7657a != null) {
                strM7876i = c2023dM7657a.m7876i();
            }
            z3 = !m7660a(strM7876i2, strM7876i);
        }
        C2023d c2023d3 = this.f9384i;
        if (c2023d3 != null && z3) {
            this.f9383h.m7677a(c2023d3);
            InterfaceC2013d interfaceC2013d = this.f9382e;
            if (interfaceC2013d != null) {
                interfaceC2013d.onImprintChanged(this.f9383h);
            }
        }
        if (map.size() > 0) {
            synchronized (f9374g) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && f9373f.containsKey(key)) {
                        ULog.m7606i("--->>> target imprint key is: " + key + "; value is: " + value);
                        ArrayList<UMImprintChangeCallback> arrayList = f9373f.get(key);
                        if (arrayList != null) {
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                arrayList.get(i4).onImprintValueChanged(key, value);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m7668a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f9381p) {
            try {
                if (f9380o.containsKey(str)) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f9373f.remove(str);
                } else {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7665e() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9376k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9370b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return
        L18:
            r0 = 0
            android.content.Context r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9376k     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            java.lang.String r3 = ".imprint"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            byte[] r0 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r2)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L5b
        L25:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L60
            goto L36
        L29:
            r3 = move-exception
            goto L32
        L2b:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L5c
        L30:
            r3 = move-exception
            r2 = r0
        L32:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L5b
            goto L25
        L36:
            if (r0 == 0) goto L59
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            com.umeng.analytics.pro.at r3 = new com.umeng.analytics.pro.at     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r3.<init>()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r3.m6911a(r2, r0)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r5.f9384i = r2     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.f9383h     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r0.m7677a(r2)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            com.umeng.commonsdk.statistics.proto.d r0 = r5.f9384i     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            com.umeng.commonsdk.statistics.proto.d r0 = r5.m7663d(r0)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r5.f9384i = r0     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            goto L59
        L55:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L60
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return
        L5b:
            r0 = move-exception
        L5c:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.m7665e():void");
    }

    /* renamed from: a */
    public void m7667a(InterfaceC2013d interfaceC2013d) {
        this.f9382e = interfaceC2013d;
    }

    /* renamed from: a */
    public String m7666a(C2023d c2023d) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(c2023d.m7869c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((C2024e) entry.getValue()).m7905d()) {
                sb.append(((C2024e) entry.getValue()).m7901b());
            }
            sb.append(((C2024e) entry.getValue()).m7906e());
            sb.append(((C2024e) entry.getValue()).m7909h());
        }
        sb.append(c2023d.f9519b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public byte[] m7670a(C2024e c2024e) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(null);
        byteBufferAllocate.putLong(c2024e.m7906e());
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = f9372d;
        byte[] bArr2 = new byte[4];
        for (int i4 = 0; i4 < 4; i4++) {
            bArr2[i4] = (byte) (bArrArray[i4] ^ bArr[i4]);
        }
        return bArr2;
    }

    /* renamed from: a */
    public byte[] m7669a() {
        try {
            synchronized (this) {
                C2023d c2023d = this.f9384i;
                if (c2023d == null) {
                    return null;
                }
                if (c2023d.m7866b() <= 0) {
                    return null;
                }
                return new C1868az().m6923a(this.f9384i);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9376k, th);
            return null;
        }
    }

    /* renamed from: b */
    public synchronized C2023d m7671b() {
        return this.f9384i;
    }

    /* renamed from: a */
    private boolean m7660a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    private C2023d m7657a(C2023d c2023d, C2023d c2023d2, Map<String, String> map) {
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        ArrayList<UMImprintChangeCallback> arrayList;
        if (c2023d2 == null) {
            return c2023d;
        }
        Map<String, C2024e> mapM7869c = c2023d.m7869c();
        for (Map.Entry<String, C2024e> entry : c2023d2.m7869c().entrySet()) {
            int i4 = 0;
            if (entry.getValue().m7905d()) {
                String key = entry.getKey();
                String str = entry.getValue().f9537a;
                synchronized (f9381p) {
                    if (!TextUtils.isEmpty(key) && f9380o.containsKey(key) && (uMImprintPreProcessCallback = f9380o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str)) {
                        i4 = 1;
                    }
                }
                if (i4 == 0) {
                    mapM7869c.put(entry.getKey(), entry.getValue());
                    synchronized (f9374g) {
                        if (!TextUtils.isEmpty(key) && f9373f.containsKey(key) && f9373f.get(key) != null) {
                            map.put(key, str);
                        }
                    }
                } else {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + key + "] should be ignored.");
                }
            } else {
                String key2 = entry.getKey();
                synchronized (f9374g) {
                    if (!TextUtils.isEmpty(key2) && f9373f.containsKey(key2) && (arrayList = f9373f.get(key2)) != null) {
                        while (i4 < arrayList.size()) {
                            arrayList.get(i4).onImprintValueChanged(key2, null);
                            i4++;
                        }
                    }
                }
                mapM7869c.remove(key2);
                this.f9383h.m7678a(key2);
            }
        }
        c2023d.m7861a(c2023d2.m7873f());
        c2023d.m7862a(m7666a(c2023d));
        return c2023d;
    }

    /* renamed from: a */
    private void m7658a(File file) {
        if (this.f9384i == null) {
            return;
        }
        try {
            synchronized (f9370b) {
                byte[] bArrM6923a = new C1868az().m6923a(this.f9384i);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArrM6923a);
                    fileOutputStream.flush();
                } finally {
                    HelperUtils.safeClose(fileOutputStream);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
