package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.core.os.EnvironmentCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ab */
/* loaded from: classes4.dex */
public final class C6664ab {

    /* renamed from: a */
    private static final ArrayList<a> f5795a = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.ab.1
        {
            byte b10 = 0;
            add(new l(b10));
            add(new f(b10));
            add(new g(b10));
            add(new m(b10));
            add(new h(b10));
            add(new i(b10));
            add(new k(b10));
            add(new e(b10));
            add(new j(b10));
            add(new b(b10));
            add(new d(b10));
            add(new c(b10));
        }
    };

    /* renamed from: b */
    private static final Map<Integer, String> f5796b = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.ab.2
        {
            put(1, "GPRS");
            put(2, "EDGE");
            put(3, "UMTS");
            put(8, "HSDPA");
            put(9, "HSUPA");
            put(10, "HSPA");
            put(4, "CDMA");
            put(5, "EVDO_0");
            put(6, "EVDO_A");
            put(7, "1xRTT");
            put(11, "iDen");
            put(12, "EVDO_B");
            put(13, "LTE");
            put(14, "eHRPD");
            put(15, "HSPA+");
        }
    };

    /* renamed from: c */
    private static final String[] f5797c = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* renamed from: com.tencent.bugly.proguard.ab$a */
    public static abstract class a {
        private a() {
        }

        /* renamed from: a */
        public abstract String mo5028a();

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$b */
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.gn.gnromvernumber");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "amigo/" + strM5141a + "/" + C6678ap.m5141a("ro.build.display.id");
        }

        public /* synthetic */ b(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$c */
    public static class c extends a {
        private c() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            return C6678ap.m5141a("ro.build.fingerprint") + "/" + C6678ap.m5141a("ro.build.rom.id");
        }

        public /* synthetic */ c(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$d */
    public static class d extends a {
        private d() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.build.tyd.kbstyle_version");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "dido/".concat(strM5141a);
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$e */
    public static class e extends a {
        private e() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.aa.romver");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "htc/" + strM5141a + "/" + C6678ap.m5141a("ro.build.description");
        }

        public /* synthetic */ e(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$f */
    public static class f extends a {
        private f() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.build.version.emui");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "HuaWei/EMOTION/".concat(strM5141a);
        }

        public /* synthetic */ f(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$g */
    public static class g extends a {
        private g() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.lenovo.series");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "Lenovo/VIBE/".concat(String.valueOf(C6678ap.m5141a("ro.build.version.incremental")));
        }

        public /* synthetic */ g(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$h */
    public static class h extends a {
        private h() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.meizu.product.model");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "Meizu/FLYME/" + C6678ap.m5141a("ro.build.display.id");
        }

        public /* synthetic */ h(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$i */
    public static class i extends a {
        private i() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.build.version.opporom");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "Oppo/COLOROS/".concat(strM5141a);
        }

        public /* synthetic */ i(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$j */
    public static class j extends a {
        private j() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.lewa.version");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "tcl/" + strM5141a + "/" + C6678ap.m5141a("ro.build.display.id");
        }

        public /* synthetic */ j(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$k */
    public static class k extends a {
        private k() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.vivo.os.build.display.id");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "vivo/FUNTOUCH/".concat(strM5141a);
        }

        public /* synthetic */ k(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$l */
    public static class l extends a {
        private l() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.miui.ui.version.name");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "XiaoMi/MIUI/".concat(strM5141a);
        }

        public /* synthetic */ l(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$m */
    public static class m extends a {
        private m() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C6664ab.a
        /* renamed from: a */
        public final String mo5028a() {
            String strM5141a = C6678ap.m5141a("ro.build.nubia.rom.name");
            if (C6678ap.m5165b(strM5141a) || strM5141a.equals("fail")) {
                return null;
            }
            return "Zte/NUBIA/" + strM5141a + "_" + C6678ap.m5141a("ro.build.nubia.rom.code");
        }

        public /* synthetic */ m(byte b10) {
            this();
        }
    }

    /* renamed from: a */
    public static String m5006a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static String m5009b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: c */
    public static int m5010c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: d */
    public static String m5012d() {
        try {
            return String.valueOf(System.getProperty("os.arch"));
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: e */
    public static long m5013e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: f */
    public static long m5014f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = java.lang.Long.parseLong(r2.replaceAll("[^\\d]", ""));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m5015g() {
        /*
            r0 = 0
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "/proc/self/status"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L2a
        L13:
            if (r2 == 0) goto L31
            java.lang.String r4 = "VmSize"
            boolean r4 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            java.lang.String r4 = "[^\\d]"
            java.lang.String r5 = ""
            java.lang.String r2 = r2.replaceAll(r4, r5)     // Catch: java.lang.Throwable -> L2a
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r2 = move-exception
            goto L3e
        L2c:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L2a
            goto L13
        L31:
            r3.close()     // Catch: java.lang.Throwable -> L35
            goto L44
        L35:
            r2 = move-exception
            r2.printStackTrace()
            goto L44
        L3a:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L3e:
            com.tencent.bugly.proguard.C6674al.m5103a(r2)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L44
            goto L31
        L44:
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            return r0
        L48:
            r0 = move-exception
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r1 = move-exception
            r1.printStackTrace()
        L53:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6664ab.m5015g():long");
    }

    /* renamed from: h */
    public static long m5016h() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /* renamed from: i */
    public static long m5017i() throws IOException {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 2048);
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        long j9 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            if (!C6674al.m5103a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!C6674al.m5103a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return j9;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        if (!C6674al.m5103a(e12)) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                        return -1L;
                    } catch (IOException e13) {
                        if (C6674al.m5103a(e13)) {
                            return -1L;
                        }
                        e13.printStackTrace();
                        return -1L;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!C6674al.m5103a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                if (!C6674al.m5103a(e14)) {
                                    e14.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e15) {
                            if (C6674al.m5103a(e15)) {
                                return -2L;
                            }
                            e15.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th3) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e16) {
                                if (!C6674al.m5103a(e16)) {
                                    e16.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e17) {
                                if (!C6674al.m5103a(e17)) {
                                    e17.printStackTrace();
                                }
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            fileReader = null;
            th = th5;
            bufferedReader = null;
        }
    }

    /* renamed from: j */
    public static long m5018j() throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 2048);
                try {
                    bufferedReader2.readLine();
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            if (!C6674al.m5103a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!C6674al.m5103a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j9 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e12) {
                            if (!C6674al.m5103a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e13) {
                            if (!C6674al.m5103a(e13)) {
                                e13.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j10 = j9 + (Long.parseLong(line2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    String line3 = bufferedReader2.readLine();
                    if (line3 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e14) {
                            if (!C6674al.m5103a(e14)) {
                                e14.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e15) {
                            if (!C6674al.m5103a(e15)) {
                                e15.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j11 = j10 + (Long.parseLong(line3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    try {
                        bufferedReader2.close();
                    } catch (IOException e16) {
                        if (!C6674al.m5103a(e16)) {
                            e16.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e17) {
                        if (!C6674al.m5103a(e17)) {
                            e17.printStackTrace();
                        }
                    }
                    return j11;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        if (!C6674al.m5103a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e18) {
                                if (!C6674al.m5103a(e18)) {
                                    e18.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e19) {
                            if (C6674al.m5103a(e19)) {
                                return -2L;
                            }
                            e19.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e20) {
                                if (!C6674al.m5103a(e20)) {
                                    e20.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e21) {
                                if (!C6674al.m5103a(e21)) {
                                    e21.printStackTrace();
                                }
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
        }
    }

    /* renamed from: k */
    public static long m5019k() {
        if (!m5027s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: l */
    public static long m5020l() {
        if (!m5027s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: m */
    public static String m5021m() {
        return "";
    }

    /* renamed from: n */
    public static String m5022n() {
        ArrayList<a> arrayList = f5795a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            a aVar = arrayList.get(i9);
            i9++;
            String strMo5028a = aVar.mo5028a();
            if (!TextUtils.isEmpty(strMo5028a)) {
                return strMo5028a;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m5023o() {
        return !TextUtils.isEmpty(new i((byte) 0).mo5028a());
    }

    /* renamed from: p */
    public static boolean m5024p() {
        return !TextUtils.isEmpty(new k((byte) 0).mo5028a());
    }

    /* renamed from: q */
    public static boolean m5025q() {
        boolean z9;
        String[] strArr = f5797c;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                z9 = false;
                break;
            }
            if (new File(strArr[i9]).exists()) {
                z9 = true;
                break;
            }
            i9++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z9;
    }

    /* renamed from: r */
    public static boolean m5026r() {
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f10 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f11 = fMaxMemory - f10;
        C6674al.m5106c("maxMemory : %f", Float.valueOf(fMaxMemory));
        C6674al.m5106c("totalMemory : %f", Float.valueOf(f10));
        C6674al.m5106c("freeMemory : %f", Float.valueOf(f11));
        return f11 < 10.0f;
    }

    /* renamed from: s */
    private static boolean m5027s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static String m5011c(Context context) {
        TelephonyManager telephonyManager;
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0 || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            int networkType = telephonyManager.getNetworkType();
            String str2 = f5796b.get(Integer.valueOf(networkType));
            if (str2 != null) {
                return str2;
            }
            try {
                return "MOBILE(" + networkType + ")";
            } catch (Exception e10) {
                e = e10;
                str = str2;
                if (!C6674al.m5103a(e)) {
                    e.printStackTrace();
                }
                return str;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* renamed from: a */
    public static String m5007a(Context context) {
        if (context != null && context.getApplicationInfo() != null) {
            String str = context.getApplicationInfo().nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                if (str.endsWith("arm")) {
                    return "armeabi-v7a";
                }
                if (str.endsWith("arm64")) {
                    return "arm64-v8a";
                }
                if (str.endsWith("x86")) {
                    return "x86";
                }
                if (str.endsWith("x86_64")) {
                    return "x86_64";
                }
                return "fail";
            }
            return "fail";
        }
        return "fail";
    }

    /* renamed from: b */
    public static long m5008b(Context context) {
        long pss;
        ActivityManager activityManager;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable unused) {
            pss = Debug.getPss();
        }
        if (activityManager == null) {
            return 0L;
        }
        pss = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        return pss * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
