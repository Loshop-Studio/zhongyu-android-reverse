package com.tencent.bugly.crashreport.crash.anr;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.proguard.C5791al;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C5775a {

        /* renamed from: a */
        public long f3837a;

        /* renamed from: b */
        public String f3838b;

        /* renamed from: c */
        public long f3839c;

        /* renamed from: d */
        public Map<String, String[]> f3840d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface InterfaceC5776b {
        /* renamed from: a */
        boolean mo3770a(long j6);

        /* renamed from: a */
        boolean mo3771a(long j6, long j7, String str);

        /* renamed from: a */
        boolean mo3772a(String str, int i6, String str2, String str3);
    }

    /* renamed from: a */
    private static Object[] m3768a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
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
    private static String m3769b(BufferedReader bufferedReader) throws IOException {
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

    public static C5775a readFirstDumpInfo(String str, final boolean z6) throws Throwable {
        if (str == null) {
            C5791al.m3934e("path:%s", str);
            return null;
        }
        final C5775a c5775a = new C5775a();
        readTraceFile(str, new InterfaceC5776b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.2
            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC5776b
            /* renamed from: a */
            public final boolean mo3772a(String str2, int i6, String str3, String str4) {
                C5791al.m3932c("new thread %s", str2);
                C5775a c5775a2 = c5775a;
                if (c5775a2.f3840d == null) {
                    c5775a2.f3840d = new HashMap();
                }
                c5775a.f3840d.put(str2, new String[]{str3, str4, String.valueOf(i6)});
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC5776b
            /* renamed from: a */
            public final boolean mo3771a(long j6, long j7, String str2) {
                C5791al.m3932c("new process %s", str2);
                C5775a c5775a2 = c5775a;
                c5775a2.f3837a = j6;
                c5775a2.f3838b = str2;
                c5775a2.f3839c = j7;
                return z6;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC5776b
            /* renamed from: a */
            public final boolean mo3770a(long j6) {
                C5791al.m3932c("process end %d", Long.valueOf(j6));
                return false;
            }
        });
        if (c5775a.f3837a > 0 && c5775a.f3839c > 0 && c5775a.f3838b != null) {
            return c5775a;
        }
        C5791al.m3934e("first dump error %s", c5775a.f3837a + " " + c5775a.f3839c + " " + c5775a.f3838b);
        return null;
    }

    public static C5775a readTargetDumpInfo(final String str, String str2, final boolean z6) throws Throwable {
        if (str != null && str2 != null) {
            final C5775a c5775a = new C5775a();
            readTraceFile(str2, new InterfaceC5776b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.1
                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC5776b
                /* renamed from: a */
                public final boolean mo3772a(String str3, int i6, String str4, String str5) {
                    C5791al.m3932c("new thread %s", str3);
                    C5775a c5775a2 = c5775a;
                    if (c5775a2.f3837a > 0 && c5775a2.f3839c > 0 && c5775a2.f3838b != null) {
                        if (c5775a2.f3840d == null) {
                            c5775a2.f3840d = new HashMap();
                        }
                        c5775a.f3840d.put(str3, new String[]{str4, str5, String.valueOf(i6)});
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC5776b
                /* renamed from: a */
                public final boolean mo3771a(long j6, long j7, String str3) {
                    C5791al.m3932c("new process %s", str3);
                    if (!str3.equals(str)) {
                        return true;
                    }
                    C5775a c5775a2 = c5775a;
                    c5775a2.f3837a = j6;
                    c5775a2.f3838b = str3;
                    c5775a2.f3839c = j7;
                    return z6;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC5776b
                /* renamed from: a */
                public final boolean mo3770a(long j6) {
                    C5791al.m3932c("process end %d", Long.valueOf(j6));
                    C5775a c5775a2 = c5775a;
                    return c5775a2.f3837a <= 0 || c5775a2.f3839c <= 0 || c5775a2.f3838b == null;
                }
            });
            if (c5775a.f3837a > 0 && c5775a.f3839c > 0 && c5775a.f3838b != null) {
                return c5775a;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r17.mo3770a(java.lang.Long.parseLong(r1[1].toString().split("\\s")[2])) != false) goto L99;
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
    
        if (com.tencent.bugly.proguard.C5791al.m3929a(r0) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC5776b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    /* renamed from: a */
    private static String m3767a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i6 = 0; i6 < 3; i6++) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            stringBuffer.append(line + SignParameters.NEW_LINE);
        }
        return stringBuffer.toString();
    }
}
