package com.tencent.bugly.crashreport.crash.anr;

import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.proguard.C6674al;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C6658a {

        /* renamed from: a */
        public long f5693a;

        /* renamed from: b */
        public String f5694b;

        /* renamed from: c */
        public long f5695c;

        /* renamed from: d */
        public Map<String, String[]> f5696d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface InterfaceC6659b {
        /* renamed from: a */
        boolean mo4944a(long j9);

        /* renamed from: a */
        boolean mo4945a(long j9, long j10, String str);

        /* renamed from: a */
        boolean mo4946a(String str, int i9, String str2, String str3);
    }

    /* renamed from: a */
    private static Object[] m4942a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
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
    private static String m4943b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(line + AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
        return stringBuffer.toString();
    }

    public static C6658a readFirstDumpInfo(String str, final boolean z9) throws Throwable {
        if (str == null) {
            C6674al.m5108e("path:%s", str);
            return null;
        }
        final C6658a c6658a = new C6658a();
        readTraceFile(str, new InterfaceC6659b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.2
            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6659b
            /* renamed from: a */
            public final boolean mo4946a(String str2, int i9, String str3, String str4) {
                C6674al.m5106c("new thread %s", str2);
                C6658a c6658a2 = c6658a;
                if (c6658a2.f5696d == null) {
                    c6658a2.f5696d = new HashMap();
                }
                c6658a.f5696d.put(str2, new String[]{str3, str4, String.valueOf(i9)});
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6659b
            /* renamed from: a */
            public final boolean mo4945a(long j9, long j10, String str2) {
                C6674al.m5106c("new process %s", str2);
                C6658a c6658a2 = c6658a;
                c6658a2.f5693a = j9;
                c6658a2.f5694b = str2;
                c6658a2.f5695c = j10;
                return z9;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6659b
            /* renamed from: a */
            public final boolean mo4944a(long j9) {
                C6674al.m5106c("process end %d", Long.valueOf(j9));
                return false;
            }
        });
        if (c6658a.f5693a > 0 && c6658a.f5695c > 0 && c6658a.f5694b != null) {
            return c6658a;
        }
        C6674al.m5108e("first dump error %s", c6658a.f5693a + " " + c6658a.f5695c + " " + c6658a.f5694b);
        return null;
    }

    public static C6658a readTargetDumpInfo(final String str, String str2, final boolean z9) throws Throwable {
        if (str != null && str2 != null) {
            final C6658a c6658a = new C6658a();
            readTraceFile(str2, new InterfaceC6659b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.1
                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6659b
                /* renamed from: a */
                public final boolean mo4946a(String str3, int i9, String str4, String str5) {
                    C6674al.m5106c("new thread %s", str3);
                    C6658a c6658a2 = c6658a;
                    if (c6658a2.f5693a > 0 && c6658a2.f5695c > 0 && c6658a2.f5694b != null) {
                        if (c6658a2.f5696d == null) {
                            c6658a2.f5696d = new HashMap();
                        }
                        c6658a.f5696d.put(str3, new String[]{str4, str5, String.valueOf(i9)});
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6659b
                /* renamed from: a */
                public final boolean mo4945a(long j9, long j10, String str3) {
                    C6674al.m5106c("new process %s", str3);
                    if (!str3.equals(str)) {
                        return true;
                    }
                    C6658a c6658a2 = c6658a;
                    c6658a2.f5693a = j9;
                    c6658a2.f5694b = str3;
                    c6658a2.f5695c = j10;
                    return z9;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6659b
                /* renamed from: a */
                public final boolean mo4944a(long j9) {
                    C6674al.m5106c("process end %d", Long.valueOf(j9));
                    C6658a c6658a2 = c6658a;
                    return c6658a2.f5693a <= 0 || c6658a2.f5695c <= 0 || c6658a2.f5694b == null;
                }
            });
            if (c6658a.f5693a > 0 && c6658a.f5695c > 0 && c6658a.f5694b != null) {
                return c6658a;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r17.mo4944a(java.lang.Long.parseLong(r1[1].toString().split("\\s")[2])) != false) goto L99;
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
    
        if (com.tencent.bugly.proguard.C6674al.m5103a(r0) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6659b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    /* renamed from: a */
    private static String m4941a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i9 = 0; i9 < 3; i9++) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            stringBuffer.append(line + AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
        return stringBuffer.toString();
    }
}
