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
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tencent.bugly.proguard.ab */
/* loaded from: classes5.dex */
public final class C7769ab {

    /* renamed from: a */
    private static final ArrayList<a> f13660a = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.ab.1
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
    private static final Map<Integer, String> f13661b = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.ab.2
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
    private static final String[] f13662c = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* renamed from: com.tencent.bugly.proguard.ab$a */
    public static abstract class a {
        public a() {
        }

        /* renamed from: a */
        public abstract String mo10539a();

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$b */
    public static class b extends a {
        public b() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.gn.gnromvernumber");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "amigo/" + strM10652a + MqttTopic.TOPIC_LEVEL_SEPARATOR + C7783ap.m10652a("ro.build.display.id");
        }

        public /* synthetic */ b(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$c */
    public static class c extends a {
        public c() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            return C7783ap.m10652a("ro.build.fingerprint") + MqttTopic.TOPIC_LEVEL_SEPARATOR + C7783ap.m10652a("ro.build.rom.id");
        }

        public /* synthetic */ c(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$d */
    public static class d extends a {
        public d() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.build.tyd.kbstyle_version");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "dido/".concat(strM10652a);
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$e */
    public static class e extends a {
        public e() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.aa.romver");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "htc/" + strM10652a + MqttTopic.TOPIC_LEVEL_SEPARATOR + C7783ap.m10652a("ro.build.description");
        }

        public /* synthetic */ e(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$f */
    public static class f extends a {
        public f() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.build.version.emui");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "HuaWei/EMOTION/".concat(strM10652a);
        }

        public /* synthetic */ f(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$g */
    public static class g extends a {
        public g() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.lenovo.series");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "Lenovo/VIBE/".concat(String.valueOf(C7783ap.m10652a("ro.build.version.incremental")));
        }

        public /* synthetic */ g(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$h */
    public static class h extends a {
        public h() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.meizu.product.model");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "Meizu/FLYME/" + C7783ap.m10652a("ro.build.display.id");
        }

        public /* synthetic */ h(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$i */
    public static class i extends a {
        public i() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.build.version.opporom");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "Oppo/COLOROS/".concat(strM10652a);
        }

        public /* synthetic */ i(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$j */
    public static class j extends a {
        public j() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.lewa.version");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "tcl/" + strM10652a + MqttTopic.TOPIC_LEVEL_SEPARATOR + C7783ap.m10652a("ro.build.display.id");
        }

        public /* synthetic */ j(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$k */
    public static class k extends a {
        public k() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.vivo.os.build.display.id");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "vivo/FUNTOUCH/".concat(strM10652a);
        }

        public /* synthetic */ k(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$l */
    public static class l extends a {
        public l() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.miui.ui.version.name");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "XiaoMi/MIUI/".concat(strM10652a);
        }

        public /* synthetic */ l(byte b10) {
            this();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ab$m */
    public static class m extends a {
        public m() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.C7769ab.a
        /* renamed from: a */
        public final String mo10539a() {
            String strM10652a = C7783ap.m10652a("ro.build.nubia.rom.name");
            if (C7783ap.m10676b(strM10652a) || strM10652a.equals("fail")) {
                return null;
            }
            return "Zte/NUBIA/" + strM10652a + BundleUtil.UNDERLINE_TAG + C7783ap.m10652a("ro.build.nubia.rom.code");
        }

        public /* synthetic */ m(byte b10) {
            this();
        }
    }

    /* renamed from: a */
    public static String m10517a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static String m10520b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: c */
    public static int m10521c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: d */
    public static String m10523d() {
        try {
            return String.valueOf(System.getProperty("os.arch"));
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: e */
    public static long m10524e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: f */
    public static long m10525f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
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
    public static long m10526g() {
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
            com.tencent.bugly.proguard.C7779al.m10614a(r2)     // Catch: java.lang.Throwable -> L48
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7769ab.m10526g():long");
    }

    /* renamed from: h */
    public static long m10527h() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /* renamed from: i */
    public static long m10528i() throws IOException {
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
                        long j10 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            if (!C7779al.m10614a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!C7779al.m10614a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return j10;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        if (!C7779al.m10614a(e12)) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                        return -1L;
                    } catch (IOException e13) {
                        if (C7779al.m10614a(e13)) {
                            return -1L;
                        }
                        e13.printStackTrace();
                        return -1L;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!C7779al.m10614a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                if (!C7779al.m10614a(e14)) {
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
                            if (C7779al.m10614a(e15)) {
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
                                if (!C7779al.m10614a(e16)) {
                                    e16.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e17) {
                                if (!C7779al.m10614a(e17)) {
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
    public static long m10529j() throws IOException {
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
                            if (!C7779al.m10614a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!C7779al.m10614a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j10 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e12) {
                            if (!C7779al.m10614a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e13) {
                            if (!C7779al.m10614a(e13)) {
                                e13.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j11 = j10 + (Long.parseLong(line2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024);
                    String line3 = bufferedReader2.readLine();
                    if (line3 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e14) {
                            if (!C7779al.m10614a(e14)) {
                                e14.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e15) {
                            if (!C7779al.m10614a(e15)) {
                                e15.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j12 = j11 + (Long.parseLong(line3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024);
                    try {
                        bufferedReader2.close();
                    } catch (IOException e16) {
                        if (!C7779al.m10614a(e16)) {
                            e16.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e17) {
                        if (!C7779al.m10614a(e17)) {
                            e17.printStackTrace();
                        }
                    }
                    return j12;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        if (!C7779al.m10614a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e18) {
                                if (!C7779al.m10614a(e18)) {
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
                            if (C7779al.m10614a(e19)) {
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
                                if (!C7779al.m10614a(e20)) {
                                    e20.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e21) {
                                if (!C7779al.m10614a(e21)) {
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
    public static long m10530k() {
        if (!m10538s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: l */
    public static long m10531l() {
        if (!m10538s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: m */
    public static String m10532m() {
        return "";
    }

    /* renamed from: n */
    public static String m10533n() {
        ArrayList<a> arrayList = f13660a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = arrayList.get(i10);
            i10++;
            String strMo10539a = aVar.mo10539a();
            if (!TextUtils.isEmpty(strMo10539a)) {
                return strMo10539a;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m10534o() {
        return !TextUtils.isEmpty(new i((byte) 0).mo10539a());
    }

    /* renamed from: p */
    public static boolean m10535p() {
        return !TextUtils.isEmpty(new k((byte) 0).mo10539a());
    }

    /* renamed from: q */
    public static boolean m10536q() {
        boolean z10;
        String[] strArr = f13662c;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (new File(strArr[i10]).exists()) {
                z10 = true;
                break;
            }
            i10++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z10;
    }

    /* renamed from: r */
    public static boolean m10537r() {
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f10 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f11 = fMaxMemory - f10;
        C7779al.m10617c("maxMemory : %f", Float.valueOf(fMaxMemory));
        C7779al.m10617c("totalMemory : %f", Float.valueOf(f10));
        C7779al.m10617c("freeMemory : %f", Float.valueOf(f11));
        return f11 < 10.0f;
    }

    /* renamed from: s */
    private static boolean m10538s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static String m10522c(Context context) {
        TelephonyManager telephonyManager;
        String str = "unknown";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0 || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) {
                return "unknown";
            }
            int networkType = telephonyManager.getNetworkType();
            String str2 = f13661b.get(Integer.valueOf(networkType));
            if (str2 != null) {
                return str2;
            }
            try {
                return "MOBILE(" + networkType + ")";
            } catch (Exception e10) {
                e = e10;
                str = str2;
                if (!C7779al.m10614a(e)) {
                    e.printStackTrace();
                }
                return str;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* renamed from: a */
    public static String m10518a(Context context) {
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
    public static long m10519b(Context context) {
        long pss;
        ActivityManager activityManager;
        try {
            activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        } catch (Throwable unused) {
            pss = Debug.getPss();
        }
        if (activityManager == null) {
            return 0L;
        }
        pss = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        return pss * 1024;
    }
}
