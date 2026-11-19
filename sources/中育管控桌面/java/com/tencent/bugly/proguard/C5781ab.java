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
/* loaded from: classes3.dex */
public final class C5781ab {

    /* renamed from: a */
    private static final ArrayList<a> f3939a = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.ab.1
        {
            byte b7 = 0;
            add(new l(b7));
            add(new f(b7));
            add(new g(b7));
            add(new m(b7));
            add(new h(b7));
            add(new i(b7));
            add(new k(b7));
            add(new e(b7));
            add(new j(b7));
            add(new b(b7));
            add(new d(b7));
            add(new c(b7));
        }
    };

    /* renamed from: b */
    private static final Map<Integer, String> f3940b = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.ab.2
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
    private static final String[] f3941c = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* renamed from: com.tencent.bugly.proguard.ab$a */
    public static abstract class a {
        private a() {
        }

        /* renamed from: a */
        public abstract String mo3854a();

        public /* synthetic */ a(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$b */
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.gn.gnromvernumber");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "amigo/" + strM3967a + "/" + C5795ap.m3967a("ro.build.display.id");
        }

        public /* synthetic */ b(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$c */
    public static class c extends a {
        private c() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            return C5795ap.m3967a("ro.build.fingerprint") + "/" + C5795ap.m3967a("ro.build.rom.id");
        }

        public /* synthetic */ c(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$d */
    public static class d extends a {
        private d() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.build.tyd.kbstyle_version");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "dido/".concat(strM3967a);
        }

        public /* synthetic */ d(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$e */
    public static class e extends a {
        private e() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.aa.romver");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "htc/" + strM3967a + "/" + C5795ap.m3967a("ro.build.description");
        }

        public /* synthetic */ e(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$f */
    public static class f extends a {
        private f() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.build.version.emui");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "HuaWei/EMOTION/".concat(strM3967a);
        }

        public /* synthetic */ f(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$g */
    public static class g extends a {
        private g() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.lenovo.series");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "Lenovo/VIBE/".concat(String.valueOf(C5795ap.m3967a("ro.build.version.incremental")));
        }

        public /* synthetic */ g(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$h */
    public static class h extends a {
        private h() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.meizu.product.model");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "Meizu/FLYME/" + C5795ap.m3967a("ro.build.display.id");
        }

        public /* synthetic */ h(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$i */
    public static class i extends a {
        private i() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.build.version.opporom");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "Oppo/COLOROS/".concat(strM3967a);
        }

        public /* synthetic */ i(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$j */
    public static class j extends a {
        private j() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.lewa.version");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "tcl/" + strM3967a + "/" + C5795ap.m3967a("ro.build.display.id");
        }

        public /* synthetic */ j(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$k */
    public static class k extends a {
        private k() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.vivo.os.build.display.id");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "vivo/FUNTOUCH/".concat(strM3967a);
        }

        public /* synthetic */ k(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$l */
    public static class l extends a {
        private l() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.miui.ui.version.name");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "XiaoMi/MIUI/".concat(strM3967a);
        }

        public /* synthetic */ l(byte b7) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$m */
    public static class m extends a {
        private m() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C5781ab.a
        /* renamed from: a */
        public final String mo3854a() {
            String strM3967a = C5795ap.m3967a("ro.build.nubia.rom.name");
            if (C5795ap.m3991b(strM3967a) || strM3967a.equals("fail")) {
                return null;
            }
            return "Zte/NUBIA/" + strM3967a + "_" + C5795ap.m3967a("ro.build.nubia.rom.code");
        }

        public /* synthetic */ m(byte b7) {
            this();
        }
    }

    /* renamed from: a */
    public static String m3832a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static String m3835b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: c */
    public static int m3836c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: d */
    public static String m3838d() {
        try {
            return String.valueOf(System.getProperty("os.arch"));
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: e */
    public static long m3839e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: f */
    public static long m3840f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
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
    public static long m3841g() {
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
            com.tencent.bugly.proguard.C5791al.m3929a(r2)     // Catch: java.lang.Throwable -> L48
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5781ab.m3841g():long");
    }

    /* renamed from: h */
    public static long m3842h() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /* renamed from: i */
    public static long m3843i() throws IOException {
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
                        long j6 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                        try {
                            bufferedReader.close();
                        } catch (IOException e6) {
                            if (!C5791al.m3929a(e6)) {
                                e6.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e7) {
                            if (!C5791al.m3929a(e7)) {
                                e7.printStackTrace();
                            }
                        }
                        return j6;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        if (!C5791al.m3929a(e8)) {
                            e8.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                        return -1L;
                    } catch (IOException e9) {
                        if (C5791al.m3929a(e9)) {
                            return -1L;
                        }
                        e9.printStackTrace();
                        return -1L;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!C5791al.m3929a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                if (!C5791al.m3929a(e10)) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e11) {
                            if (C5791al.m3929a(e11)) {
                                return -2L;
                            }
                            e11.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th3) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e12) {
                                if (!C5791al.m3929a(e12)) {
                                    e12.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e13) {
                                if (!C5791al.m3929a(e13)) {
                                    e13.printStackTrace();
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
    public static long m3844j() throws IOException {
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
                        } catch (IOException e6) {
                            if (!C5791al.m3929a(e6)) {
                                e6.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e7) {
                            if (!C5791al.m3929a(e7)) {
                                e7.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j6 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e8) {
                            if (!C5791al.m3929a(e8)) {
                                e8.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e9) {
                            if (!C5791al.m3929a(e9)) {
                                e9.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j7 = j6 + (Long.parseLong(line2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    String line3 = bufferedReader2.readLine();
                    if (line3 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            if (!C5791al.m3929a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!C5791al.m3929a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j8 = j7 + (Long.parseLong(line3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    try {
                        bufferedReader2.close();
                    } catch (IOException e12) {
                        if (!C5791al.m3929a(e12)) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e13) {
                        if (!C5791al.m3929a(e13)) {
                            e13.printStackTrace();
                        }
                    }
                    return j8;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        if (!C5791al.m3929a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                if (!C5791al.m3929a(e14)) {
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
                            if (C5791al.m3929a(e15)) {
                                return -2L;
                            }
                            e15.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e16) {
                                if (!C5791al.m3929a(e16)) {
                                    e16.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e17) {
                                if (!C5791al.m3929a(e17)) {
                                    e17.printStackTrace();
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
    public static long m3845k() {
        if (!m3853s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: l */
    public static long m3846l() {
        if (!m3853s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: m */
    public static String m3847m() {
        return "";
    }

    /* renamed from: n */
    public static String m3848n() {
        ArrayList<a> arrayList = f3939a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            a aVar = arrayList.get(i6);
            i6++;
            String strMo3854a = aVar.mo3854a();
            if (!TextUtils.isEmpty(strMo3854a)) {
                return strMo3854a;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m3849o() {
        return !TextUtils.isEmpty(new i((byte) 0).mo3854a());
    }

    /* renamed from: p */
    public static boolean m3850p() {
        return !TextUtils.isEmpty(new k((byte) 0).mo3854a());
    }

    /* renamed from: q */
    public static boolean m3851q() {
        boolean z6;
        String[] strArr = f3941c;
        int length = strArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z6 = false;
                break;
            }
            if (new File(strArr[i6]).exists()) {
                z6 = true;
                break;
            }
            i6++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z6;
    }

    /* renamed from: r */
    public static boolean m3852r() {
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f6 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f7 = fMaxMemory - f6;
        C5791al.m3932c("maxMemory : %f", Float.valueOf(fMaxMemory));
        C5791al.m3932c("totalMemory : %f", Float.valueOf(f6));
        C5791al.m3932c("freeMemory : %f", Float.valueOf(f7));
        return f7 < 10.0f;
    }

    /* renamed from: s */
    private static boolean m3853s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static String m3837c(Context context) {
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
            String str2 = f3940b.get(Integer.valueOf(networkType));
            if (str2 != null) {
                return str2;
            }
            try {
                return "MOBILE(" + networkType + ")";
            } catch (Exception e6) {
                e = e6;
                str = str2;
                if (!C5791al.m3929a(e)) {
                    e.printStackTrace();
                }
                return str;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    /* renamed from: a */
    public static String m3833a(Context context) {
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
    public static long m3834b(Context context) {
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
