package com.tencent.bugly.crashreport.crash.anr;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.proguard.C6436al;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C6420a {

        /* renamed from: a */
        public long f4459a;

        /* renamed from: b */
        public String f4460b;

        /* renamed from: c */
        public long f4461c;

        /* renamed from: d */
        public Map<String, String[]> f4462d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface InterfaceC6421b {
        /* renamed from: a */
        boolean mo4125a(long j10);

        /* renamed from: a */
        boolean mo4126a(long j10, long j11, String str);

        /* renamed from: a */
        boolean mo4127a(String str, int i10, String str2, String str3);
    }

    /* renamed from: a */
    private static Object[] m4123a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
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
    private static String m4124b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(line + SignParameters.NEW_LINE);
        }
        return stringBuffer.toString();
    }

    public static C6420a readFirstDumpInfo(String str, final boolean z10) throws Throwable {
        if (str == null) {
            C6436al.m4289e("path:%s", str);
            return null;
        }
        final C6420a c6420a = new C6420a();
        readTraceFile(str, new InterfaceC6421b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.2
            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6421b
            /* renamed from: a */
            public final boolean mo4127a(String str2, int i10, String str3, String str4) {
                C6436al.m4287c("new thread %s", str2);
                C6420a c6420a2 = c6420a;
                if (c6420a2.f4462d == null) {
                    c6420a2.f4462d = new HashMap();
                }
                c6420a.f4462d.put(str2, new String[]{str3, str4, String.valueOf(i10)});
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6421b
            /* renamed from: a */
            public final boolean mo4126a(long j10, long j11, String str2) {
                C6436al.m4287c("new process %s", str2);
                C6420a c6420a2 = c6420a;
                c6420a2.f4459a = j10;
                c6420a2.f4460b = str2;
                c6420a2.f4461c = j11;
                return z10;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6421b
            /* renamed from: a */
            public final boolean mo4125a(long j10) {
                C6436al.m4287c("process end %d", Long.valueOf(j10));
                return false;
            }
        });
        if (c6420a.f4459a > 0 && c6420a.f4461c > 0 && c6420a.f4460b != null) {
            return c6420a;
        }
        C6436al.m4289e("first dump error %s", c6420a.f4459a + " " + c6420a.f4461c + " " + c6420a.f4460b);
        return null;
    }

    public static C6420a readTargetDumpInfo(final String str, String str2, final boolean z10) throws Throwable {
        if (str != null && str2 != null) {
            final C6420a c6420a = new C6420a();
            readTraceFile(str2, new InterfaceC6421b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.1
                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6421b
                /* renamed from: a */
                public final boolean mo4127a(String str3, int i10, String str4, String str5) {
                    C6436al.m4287c("new thread %s", str3);
                    C6420a c6420a2 = c6420a;
                    if (c6420a2.f4459a > 0 && c6420a2.f4461c > 0 && c6420a2.f4460b != null) {
                        if (c6420a2.f4462d == null) {
                            c6420a2.f4462d = new HashMap();
                        }
                        c6420a.f4462d.put(str3, new String[]{str4, str5, String.valueOf(i10)});
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6421b
                /* renamed from: a */
                public final boolean mo4126a(long j10, long j11, String str3) {
                    C6436al.m4287c("new process %s", str3);
                    if (!str3.equals(str)) {
                        return true;
                    }
                    C6420a c6420a2 = c6420a;
                    c6420a2.f4459a = j10;
                    c6420a2.f4460b = str3;
                    c6420a2.f4461c = j11;
                    return z10;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6421b
                /* renamed from: a */
                public final boolean mo4125a(long j10) {
                    C6436al.m4287c("process end %d", Long.valueOf(j10));
                    C6420a c6420a2 = c6420a;
                    return c6420a2.f4459a <= 0 || c6420a2.f4461c <= 0 || c6420a2.f4460b == null;
                }
            });
            if (c6420a.f4459a > 0 && c6420a.f4461c > 0 && c6420a.f4460b != null) {
                return c6420a;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r17.mo4125a(java.lang.Long.parseLong(r1[1].toString().split("\\s")[2])) != false) goto L99;
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
    
        if (com.tencent.bugly.proguard.C6436al.m4284a(r0) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6421b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    /* renamed from: a */
    private static String m4122a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < 3; i10++) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            stringBuffer.append(line + SignParameters.NEW_LINE);
        }
        return stringBuffer.toString();
    }
}
