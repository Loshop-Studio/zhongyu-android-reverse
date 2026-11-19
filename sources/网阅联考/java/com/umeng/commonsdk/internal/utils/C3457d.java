package com.umeng.commonsdk.internal.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.umeng.commonsdk.internal.utils.d */
/* loaded from: classes2.dex */
public class C3457d {

    /* renamed from: com.umeng.commonsdk.internal.utils.d$a */
    public static class a {

        /* renamed from: a */
        public String f2647a;

        /* renamed from: b */
        public String f2648b;

        /* renamed from: c */
        public int f2649c;

        /* renamed from: d */
        public String f2650d;

        /* renamed from: e */
        public String f2651e;

        /* renamed from: f */
        public String f2652f;

        /* renamed from: g */
        public String f2653g;

        /* renamed from: h */
        public String f2654h;

        /* renamed from: i */
        public String f2655i;

        /* renamed from: j */
        public String f2656j;

        /* renamed from: k */
        public String f2657k;

        /* renamed from: l */
        public String f2658l;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.umeng.commonsdk.internal.utils.C3457d.a m3545a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3457d.m3545a():com.umeng.commonsdk.internal.utils.d$a");
    }

    /* renamed from: b */
    public static String m3546b() throws IOException {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* renamed from: c */
    public static String m3547c() throws IOException {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* renamed from: d */
    public static String m3548d() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"));
            try {
                String strTrim = bufferedReader.readLine().trim();
                try {
                    bufferedReader.close();
                    return strTrim;
                } catch (Throwable unused) {
                    return strTrim;
                }
            } catch (Exception unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }
}
