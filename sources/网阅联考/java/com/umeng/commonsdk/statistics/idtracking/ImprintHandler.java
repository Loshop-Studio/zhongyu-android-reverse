package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3352az;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.InterfaceC3497d;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.proto.C3507d;
import com.umeng.commonsdk.statistics.proto.C3508e;
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

/* loaded from: classes2.dex */
public class ImprintHandler implements FileLockCallback {

    /* renamed from: a */
    private static final String f2777a = "ImprintHandler";

    /* renamed from: c */
    private static final String f2779c = ".imprint";

    /* renamed from: k */
    private static Context f2784k = null;

    /* renamed from: l */
    private static FileLockUtil f2785l = null;

    /* renamed from: m */
    private static final int f2786m = 0;

    /* renamed from: n */
    private static final int f2787n = 1;

    /* renamed from: e */
    private InterfaceC3497d f2790e;

    /* renamed from: h */
    private C3479a f2791h = new C3479a();

    /* renamed from: i */
    private C3507d f2792i = null;

    /* renamed from: b */
    private static Object f2778b = new Object();

    /* renamed from: d */
    private static final byte[] f2780d = "pbl0".getBytes();

    /* renamed from: f */
    private static Map<String, ArrayList<UMImprintChangeCallback>> f2781f = new HashMap();

    /* renamed from: g */
    private static Object f2782g = new Object();

    /* renamed from: j */
    private static ImprintHandler f2783j = null;

    /* renamed from: o */
    private static Map<String, UMImprintPreProcessCallback> f2788o = new HashMap();

    /* renamed from: p */
    private static Object f2789p = new Object();

    private ImprintHandler(Context context) {
        f2784k = context.getApplicationContext();
    }

    /* renamed from: a */
    private static void m3736a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f2782g) {
            try {
                int i4 = 0;
                if (f2781f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f2781f.get(str);
                    int size = arrayList.size();
                    ULog.m3683i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i4 < size) {
                        if (uMImprintChangeCallback == arrayList.get(i4)) {
                            ULog.m3683i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i4++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.m3683i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList<UMImprintChangeCallback> arrayList2 = new ArrayList<>();
                    int size2 = arrayList2.size();
                    ULog.m3683i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i4 < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i4)) {
                            ULog.m3683i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i4++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.m3683i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f2781f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f2784k, th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: all -> 0x009f, DONT_GENERATE, TryCatch #1 {, blocks: (B:24:0x009d, B:23:0x0098, B:8:0x000d, B:10:0x0015, B:12:0x0023, B:14:0x003e, B:16:0x0044, B:17:0x005c, B:18:0x005f, B:20:0x007d), top: B:30:0x000d, inners: #0 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m3738b(java.lang.String r5, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto La2
            if (r6 != 0) goto La
            goto La2
        La:
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2782g
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2781f     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L9d
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2781f     // Catch: java.lang.Throwable -> L97
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
            com.umeng.commonsdk.statistics.common.ULog.m3683i(r3)     // Catch: java.lang.Throwable -> L97
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
            com.umeng.commonsdk.statistics.common.ULog.m3683i(r6)     // Catch: java.lang.Throwable -> L97
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
            com.umeng.commonsdk.statistics.common.ULog.m3683i(r6)     // Catch: java.lang.Throwable -> L97
            int r6 = r1.size()     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L9d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "--->>> removeCallback: remove key from map: key = "
            r6.append(r1)     // Catch: java.lang.Throwable -> L97
            r6.append(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L97
            com.umeng.commonsdk.statistics.common.ULog.m3683i(r6)     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2781f     // Catch: java.lang.Throwable -> L97
            r6.remove(r5)     // Catch: java.lang.Throwable -> L97
            goto L9d
        L97:
            r5 = move-exception
            android.content.Context r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2784k     // Catch: java.lang.Throwable -> L9f
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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.m3738b(java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback):void");
    }

    /* renamed from: c */
    private boolean m3739c(C3507d c3507d) {
        if (!c3507d.m3953i().equals(m3743a(c3507d))) {
            return false;
        }
        for (C3508e c3508e : c3507d.m3946c().values()) {
            byte[] bArrReverseHexString = DataHelper.reverseHexString(c3508e.m3986h());
            byte[] bArrM3747a = m3747a(c3508e);
            for (int i4 = 0; i4 < 4; i4++) {
                if (bArrReverseHexString[i4] != bArrM3747a[i4]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    private C3507d m3740d(C3507d c3507d) {
        Map<String, C3508e> mapM3946c = c3507d.m3946c();
        if (mapM3946c.containsKey(C3335ai.f1726f)) {
            mapM3946c.remove(C3335ai.f1726f);
            this.f2791h.m3755a(C3335ai.f1726f);
            c3507d.m3938a(c3507d.m3950f());
            c3507d.m3939a(m3743a(c3507d));
        }
        return c3507d;
    }

    /* renamed from: e */
    private C3507d m3741e(C3507d c3507d) {
        ArrayList<UMImprintChangeCallback> arrayList;
        boolean z3;
        ArrayList<UMImprintChangeCallback> arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map<String, C3508e> mapM3946c = c3507d.m3946c();
        ArrayList<String> arrayList3 = new ArrayList(mapM3946c.size() / 2);
        Iterator<Map.Entry<String, C3508e>> it = mapM3946c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, C3508e> next = it.next();
            if (next.getValue().m3982d()) {
                String key = next.getKey();
                String str = next.getValue().f2945a;
                synchronized (f2789p) {
                    z3 = !TextUtils.isEmpty(key) && f2788o.containsKey(key) && (uMImprintPreProcessCallback = f2788o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str);
                }
                if (z3) {
                    arrayList3.add(key);
                }
                synchronized (f2782g) {
                    if (!TextUtils.isEmpty(key) && f2781f.containsKey(key) && (arrayList2 = f2781f.get(key)) != null) {
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
            synchronized (f2782g) {
                if (!TextUtils.isEmpty(str2) && f2781f.containsKey(str2) && (arrayList = f2781f.get(str2)) != null) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        arrayList.get(i5).onImprintValueChanged(str2, null);
                    }
                }
            }
            mapM3946c.remove(str2);
        }
        return c3507d;
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        if (f2783j == null) {
            f2783j = new ImprintHandler(context);
            f2785l = new FileLockUtil();
            f2785l.doFileOperateion(new File(f2784k.getFilesDir(), f2779c), f2783j, 0);
        }
        return f2783j;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        m3736a(str, uMImprintChangeCallback);
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (TextUtils.isEmpty(str) || uMImprintPreProcessCallback == null) {
            return;
        }
        synchronized (f2789p) {
            try {
                if (f2788o.containsKey(str)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                } else {
                    f2788o.put(str, uMImprintPreProcessCallback);
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                }
            } finally {
            }
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        m3738b(str, uMImprintChangeCallback);
    }

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a */
    public static class C3479a {

        /* renamed from: a */
        private Map<String, String> f2793a = new HashMap();

        public C3479a() {
        }

        /* renamed from: b */
        private synchronized void m3752b(C3507d c3507d) {
            C3508e c3508e;
            if (c3507d != null) {
                if (c3507d.m3949e()) {
                    Map<String, C3508e> mapM3946c = c3507d.m3946c();
                    for (String str : mapM3946c.keySet()) {
                        if (!TextUtils.isEmpty(str) && (c3508e = mapM3946c.get(str)) != null) {
                            String strM3978b = c3508e.m3978b();
                            if (!TextUtils.isEmpty(strM3978b)) {
                                this.f2793a.put(str, strM3978b);
                                if (AnalyticsConstants.UM_DEBUG) {
                                    Log.i(ImprintHandler.f2777a, "imKey is " + str + ", imValue is " + strM3978b);
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public synchronized void m3755a(String str) {
            Map<String, String> map = this.f2793a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f2793a.containsKey(str)) {
                this.f2793a.remove(str);
            }
        }

        public C3479a(C3507d c3507d) {
            m3754a(c3507d);
        }

        /* renamed from: a */
        public void m3754a(C3507d c3507d) {
            if (c3507d == null) {
                return;
            }
            m3752b(c3507d);
        }

        /* renamed from: a */
        public synchronized String m3753a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f2793a.size() > 0) {
                String str3 = this.f2793a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i4) {
        if (i4 == 0) {
            f2783j.m3742e();
        } else if (i4 == 1) {
            f2783j.m3735a(file);
        }
        return true;
    }

    /* renamed from: c */
    public C3479a m3750c() {
        return this.f2791h;
    }

    /* renamed from: d */
    public void m3751d() throws IOException {
        if (this.f2792i == null || f2785l == null) {
            return;
        }
        File file = new File(f2784k.getFilesDir(), f2779c);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e4) {
                    UMCrashManager.reportCrash(f2784k, e4);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f2785l.doFileOperateion(file, f2783j, 1);
    }

    /* renamed from: b */
    public void m3749b(C3507d c3507d) {
        C3507d c3507dM3734a;
        boolean z3;
        if (c3507d == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m3431d(UMRTLog.RTLOG_TAG, "Imprint is null");
                return;
            }
            return;
        }
        if (!m3739c(c3507d)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
                return;
            }
            return;
        }
        String str = AnalyticsConstants.f2725OS;
        HashMap map = new HashMap();
        synchronized (this) {
            C3507d c3507d2 = this.f2792i;
            C3507d c3507dM3740d = m3740d(c3507d);
            String strM3953i = null;
            String strM3953i2 = c3507d2 == null ? null : c3507d2.m3953i();
            if (c3507d2 == null) {
                c3507dM3734a = m3741e(c3507dM3740d);
            } else {
                c3507dM3734a = m3734a(c3507d2, c3507dM3740d, map);
            }
            this.f2792i = c3507dM3734a;
            if (c3507dM3734a != null) {
                strM3953i = c3507dM3734a.m3953i();
            }
            z3 = !m3737a(strM3953i2, strM3953i);
        }
        C3507d c3507d3 = this.f2792i;
        if (c3507d3 != null && z3) {
            this.f2791h.m3754a(c3507d3);
            InterfaceC3497d interfaceC3497d = this.f2790e;
            if (interfaceC3497d != null) {
                interfaceC3497d.onImprintChanged(this.f2791h);
            }
        }
        if (map.size() > 0) {
            synchronized (f2782g) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && f2781f.containsKey(key)) {
                        ULog.m3683i("--->>> target imprint key is: " + key + "; value is: " + value);
                        ArrayList<UMImprintChangeCallback> arrayList = f2781f.get(key);
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
    public void m3745a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f2789p) {
            try {
                if (f2788o.containsKey(str)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f2781f.remove(str);
                } else {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
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
    private void m3742e() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2784k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2778b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return
        L18:
            r0 = 0
            android.content.Context r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f2784k     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
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
            r3.m2988a(r2, r0)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r5.f2792i = r2     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.f2791h     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r0.m3754a(r2)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            com.umeng.commonsdk.statistics.proto.d r0 = r5.f2792i     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            com.umeng.commonsdk.statistics.proto.d r0 = r5.m3740d(r0)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
            r5.f2792i = r0     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L60
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
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.m3742e():void");
    }

    /* renamed from: a */
    public void m3744a(InterfaceC3497d interfaceC3497d) {
        this.f2790e = interfaceC3497d;
    }

    /* renamed from: a */
    public String m3743a(C3507d c3507d) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(c3507d.m3946c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((C3508e) entry.getValue()).m3982d()) {
                sb.append(((C3508e) entry.getValue()).m3978b());
            }
            sb.append(((C3508e) entry.getValue()).m3983e());
            sb.append(((C3508e) entry.getValue()).m3986h());
        }
        sb.append(c3507d.f2927b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public byte[] m3747a(C3508e c3508e) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(null);
        byteBufferAllocate.putLong(c3508e.m3983e());
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = f2780d;
        byte[] bArr2 = new byte[4];
        for (int i4 = 0; i4 < 4; i4++) {
            bArr2[i4] = (byte) (bArrArray[i4] ^ bArr[i4]);
        }
        return bArr2;
    }

    /* renamed from: a */
    public byte[] m3746a() {
        try {
            synchronized (this) {
                C3507d c3507d = this.f2792i;
                if (c3507d == null) {
                    return null;
                }
                if (c3507d.m3943b() <= 0) {
                    return null;
                }
                return new C3352az().m3000a(this.f2792i);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f2784k, th);
            return null;
        }
    }

    /* renamed from: b */
    public synchronized C3507d m3748b() {
        return this.f2792i;
    }

    /* renamed from: a */
    private boolean m3737a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    private C3507d m3734a(C3507d c3507d, C3507d c3507d2, Map<String, String> map) {
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        ArrayList<UMImprintChangeCallback> arrayList;
        if (c3507d2 == null) {
            return c3507d;
        }
        Map<String, C3508e> mapM3946c = c3507d.m3946c();
        for (Map.Entry<String, C3508e> entry : c3507d2.m3946c().entrySet()) {
            int i4 = 0;
            if (entry.getValue().m3982d()) {
                String key = entry.getKey();
                String str = entry.getValue().f2945a;
                synchronized (f2789p) {
                    if (!TextUtils.isEmpty(key) && f2788o.containsKey(key) && (uMImprintPreProcessCallback = f2788o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str)) {
                        i4 = 1;
                    }
                }
                if (i4 == 0) {
                    mapM3946c.put(entry.getKey(), entry.getValue());
                    synchronized (f2782g) {
                        if (!TextUtils.isEmpty(key) && f2781f.containsKey(key) && f2781f.get(key) != null) {
                            map.put(key, str);
                        }
                    }
                } else {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + key + "] should be ignored.");
                }
            } else {
                String key2 = entry.getKey();
                synchronized (f2782g) {
                    if (!TextUtils.isEmpty(key2) && f2781f.containsKey(key2) && (arrayList = f2781f.get(key2)) != null) {
                        while (i4 < arrayList.size()) {
                            arrayList.get(i4).onImprintValueChanged(key2, null);
                            i4++;
                        }
                    }
                }
                mapM3946c.remove(key2);
                this.f2791h.m3755a(key2);
            }
        }
        c3507d.m3938a(c3507d2.m3950f());
        c3507d.m3939a(m3743a(c3507d));
        return c3507d;
    }

    /* renamed from: a */
    private void m3735a(File file) {
        if (this.f2792i == null) {
            return;
        }
        try {
            synchronized (f2778b) {
                byte[] bArrM3000a = new C3352az().m3000a(this.f2792i);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArrM3000a);
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
