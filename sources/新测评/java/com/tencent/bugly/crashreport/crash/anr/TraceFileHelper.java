package com.tencent.bugly.crashreport.crash.anr;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.proguard.C6414al;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C6398a {

        /* renamed from: a */
        public long f5116a;

        /* renamed from: b */
        public String f5117b;

        /* renamed from: c */
        public long f5118c;

        /* renamed from: d */
        public Map<String, String[]> f5119d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface InterfaceC6399b {
        /* renamed from: a */
        boolean mo4765a(long j10);

        /* renamed from: a */
        boolean mo4766a(long j10, long j11, String str);

        /* renamed from: a */
        boolean mo4767a(String str, int i10, String str2, String str3);
    }

    /* renamed from: a */
    private static Object[] m4763a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
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
    private static String m4764b(BufferedReader bufferedReader) throws IOException {
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

    public static C6398a readFirstDumpInfo(String str, final boolean z9) throws Throwable {
        if (str == null) {
            C6414al.m4929e("path:%s", str);
            return null;
        }
        final C6398a c6398a = new C6398a();
        readTraceFile(str, new InterfaceC6399b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.2
            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6399b
            /* renamed from: a */
            public final boolean mo4767a(String str2, int i10, String str3, String str4) {
                C6414al.m4927c("new thread %s", str2);
                C6398a c6398a2 = c6398a;
                if (c6398a2.f5119d == null) {
                    c6398a2.f5119d = new HashMap();
                }
                c6398a.f5119d.put(str2, new String[]{str3, str4, String.valueOf(i10)});
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6399b
            /* renamed from: a */
            public final boolean mo4766a(long j10, long j11, String str2) {
                C6414al.m4927c("new process %s", str2);
                C6398a c6398a2 = c6398a;
                c6398a2.f5116a = j10;
                c6398a2.f5117b = str2;
                c6398a2.f5118c = j11;
                return z9;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6399b
            /* renamed from: a */
            public final boolean mo4765a(long j10) {
                C6414al.m4927c("process end %d", Long.valueOf(j10));
                return false;
            }
        });
        if (c6398a.f5116a > 0 && c6398a.f5118c > 0 && c6398a.f5117b != null) {
            return c6398a;
        }
        C6414al.m4929e("first dump error %s", c6398a.f5116a + " " + c6398a.f5118c + " " + c6398a.f5117b);
        return null;
    }

    public static C6398a readTargetDumpInfo(final String str, String str2, final boolean z9) throws Throwable {
        if (str != null && str2 != null) {
            final C6398a c6398a = new C6398a();
            readTraceFile(str2, new InterfaceC6399b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.1
                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6399b
                /* renamed from: a */
                public final boolean mo4767a(String str3, int i10, String str4, String str5) {
                    C6414al.m4927c("new thread %s", str3);
                    C6398a c6398a2 = c6398a;
                    if (c6398a2.f5116a > 0 && c6398a2.f5118c > 0 && c6398a2.f5117b != null) {
                        if (c6398a2.f5119d == null) {
                            c6398a2.f5119d = new HashMap();
                        }
                        c6398a.f5119d.put(str3, new String[]{str4, str5, String.valueOf(i10)});
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6399b
                /* renamed from: a */
                public final boolean mo4766a(long j10, long j11, String str3) {
                    C6414al.m4927c("new process %s", str3);
                    if (!str3.equals(str)) {
                        return true;
                    }
                    C6398a c6398a2 = c6398a;
                    c6398a2.f5116a = j10;
                    c6398a2.f5117b = str3;
                    c6398a2.f5118c = j11;
                    return z9;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6399b
                /* renamed from: a */
                public final boolean mo4765a(long j10) {
                    C6414al.m4927c("process end %d", Long.valueOf(j10));
                    C6398a c6398a2 = c6398a;
                    return c6398a2.f5116a <= 0 || c6398a2.f5118c <= 0 || c6398a2.f5117b == null;
                }
            });
            if (c6398a.f5116a > 0 && c6398a.f5118c > 0 && c6398a.f5117b != null) {
                return c6398a;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r17.mo4765a(java.lang.Long.parseLong(r1[1].toString().split("\\s")[2])) != false) goto L99;
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
    
        if (com.tencent.bugly.proguard.C6414al.m4924a(r0) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC6399b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    /* renamed from: a */
    private static String m4762a(BufferedReader bufferedReader) throws IOException {
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
