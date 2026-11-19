package com.tencent.bugly.crashreport.crash.anr;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.proguard.C7779al;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C7761a {

        /* renamed from: a */
        public long f13553a;

        /* renamed from: b */
        public String f13554b;

        /* renamed from: c */
        public long f13555c;

        /* renamed from: d */
        public Map<String, String[]> f13556d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface InterfaceC7762b {
        /* renamed from: a */
        boolean mo10455a(long j10);

        /* renamed from: a */
        boolean mo10456a(long j10, long j11, String str);

        /* renamed from: a */
        boolean mo10457a(String str, int i10, String str2, String str3);
    }

    /* renamed from: a */
    private static Object[] m10453a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
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
    private static String m10454b(BufferedReader bufferedReader) throws IOException {
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

    public static C7761a readFirstDumpInfo(String str, boolean z10) throws Throwable {
        if (str == null) {
            C7779al.m10619e("path:%s", str);
            return null;
        }
        C7761a c7761a = new C7761a();
        readTraceFile(str, new C7764d(c7761a, z10));
        if (c7761a.f13553a > 0 && c7761a.f13555c > 0 && c7761a.f13554b != null) {
            return c7761a;
        }
        C7779al.m10619e("first dump error %s", c7761a.f13553a + " " + c7761a.f13555c + " " + c7761a.f13554b);
        return null;
    }

    public static C7761a readTargetDumpInfo(String str, String str2, boolean z10) throws Throwable {
        if (str != null && str2 != null) {
            C7761a c7761a = new C7761a();
            readTraceFile(str2, new C7763c(c7761a, str, z10));
            if (c7761a.f13553a > 0 && c7761a.f13555c > 0 && c7761a.f13554b != null) {
                return c7761a;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r17.mo10455a(java.lang.Long.parseLong(r1[1].toString().split("\\s")[2])) != false) goto L99;
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
    
        if (com.tencent.bugly.proguard.C7779al.m10614a(r0) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC7762b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$d */
    public static class C7764d implements InterfaceC7762b {

        /* renamed from: a */
        public final /* synthetic */ C7761a f13560a;

        /* renamed from: b */
        public final /* synthetic */ boolean f13561b;

        public C7764d(C7761a c7761a, boolean z10) {
            this.f13560a = c7761a;
            this.f13561b = z10;
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC7762b
        /* renamed from: a */
        public final boolean mo10457a(String str, int i10, String str2, String str3) {
            C7779al.m10617c("new thread %s", str);
            C7761a c7761a = this.f13560a;
            if (c7761a.f13556d == null) {
                c7761a.f13556d = new HashMap();
            }
            this.f13560a.f13556d.put(str, new String[]{str2, str3, String.valueOf(i10)});
            return true;
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC7762b
        /* renamed from: a */
        public final boolean mo10456a(long j10, long j11, String str) {
            C7779al.m10617c("new process %s", str);
            C7761a c7761a = this.f13560a;
            c7761a.f13553a = j10;
            c7761a.f13554b = str;
            c7761a.f13555c = j11;
            return this.f13561b;
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC7762b
        /* renamed from: a */
        public final boolean mo10455a(long j10) {
            C7779al.m10617c("process end %d", Long.valueOf(j10));
            return false;
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$c */
    public static class C7763c implements InterfaceC7762b {

        /* renamed from: a */
        public final /* synthetic */ C7761a f13557a;

        /* renamed from: b */
        public final /* synthetic */ String f13558b;

        /* renamed from: c */
        public final /* synthetic */ boolean f13559c;

        public C7763c(C7761a c7761a, String str, boolean z10) {
            this.f13557a = c7761a;
            this.f13558b = str;
            this.f13559c = z10;
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC7762b
        /* renamed from: a */
        public final boolean mo10457a(String str, int i10, String str2, String str3) {
            C7779al.m10617c("new thread %s", str);
            C7761a c7761a = this.f13557a;
            if (c7761a.f13553a > 0 && c7761a.f13555c > 0 && c7761a.f13554b != null) {
                if (c7761a.f13556d == null) {
                    c7761a.f13556d = new HashMap();
                }
                this.f13557a.f13556d.put(str, new String[]{str2, str3, String.valueOf(i10)});
            }
            return true;
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC7762b
        /* renamed from: a */
        public final boolean mo10456a(long j10, long j11, String str) {
            C7779al.m10617c("new process %s", str);
            if (!str.equals(this.f13558b)) {
                return true;
            }
            C7761a c7761a = this.f13557a;
            c7761a.f13553a = j10;
            c7761a.f13554b = str;
            c7761a.f13555c = j11;
            return this.f13559c;
        }

        @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.InterfaceC7762b
        /* renamed from: a */
        public final boolean mo10455a(long j10) {
            C7779al.m10617c("process end %d", Long.valueOf(j10));
            C7761a c7761a = this.f13557a;
            return c7761a.f13553a <= 0 || c7761a.f13555c <= 0 || c7761a.f13554b == null;
        }
    }

    /* renamed from: a */
    private static String m10452a(BufferedReader bufferedReader) throws IOException {
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
