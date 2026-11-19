package com.tencent.bugly.crashreport.crash.anr;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.proguard.C4055al;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C4036a {

        /* renamed from: a */
        public long f3345a;

        /* renamed from: b */
        public String f3346b;

        /* renamed from: c */
        public long f3347c;

        /* renamed from: d */
        public Map<String, String[]> f3348d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface InterfaceC4037b {
        /* renamed from: a */
        boolean mo2864a(long j7);

        /* renamed from: a */
        boolean mo2865a(long j7, long j8, String str);

        /* renamed from: a */
        boolean mo2866a(String str, int i, String str2, String str3);
    }

    /* renamed from: a */
    private static Object[] m2862a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            for (Pattern pattern : patternArr) {
                if (pattern.matcher(line).matches()) {
                    return new Object[]{pattern, line};
                }
            }
        }
    }

    /* renamed from: b */
    private static String m2863b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(line.concat(SignParameters.NEW_LINE));
        }
        return stringBuffer.toString();
    }

    public static C4036a readFirstDumpInfo(String str, boolean z8) throws Throwable {
        if (str == null) {
            C4055al.m3027e("path:%s", str);
            return null;
        }
        C4036a c4036a = new C4036a();
        readTraceFile(str, new C4039b(c4036a, z8));
        if (c4036a.f3345a > 0 && c4036a.f3347c > 0 && c4036a.f3346b != null) {
            return c4036a;
        }
        C4055al.m3027e("first dump error %s", c4036a.f3345a + " " + c4036a.f3347c + " " + c4036a.f3346b);
        return null;
    }

    public static C4036a readTargetDumpInfo(String str, String str2, boolean z8) {
        if (str == null || str2 == null) {
            return null;
        }
        C4036a c4036a = new C4036a();
        readTraceFile(str2, new C4038a(c4036a, str, z8));
        if (c4036a.f3345a <= 0 || c4036a.f3347c <= 0 || c4036a.f3346b == null) {
            return null;
        }
        return c4036a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r17.mo2864a(java.lang.Long.parseLong(r1[1].toString().split("\\s")[2])) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0152, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0155, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0156, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015b, code lost:
    
        if (com.tencent.bugly.proguard.C4055al.m3022a(r0) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC4037b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    /* renamed from: a */
    private static String m2861a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            stringBuffer.append(line.concat(SignParameters.NEW_LINE));
        }
        return stringBuffer.toString();
    }
}
