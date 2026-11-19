package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bd */
/* loaded from: classes4.dex */
public final class C6455bd implements NativeExceptionHandler {

    /* renamed from: a */
    private final Context f4806a;

    /* renamed from: b */
    private final C6443as f4807b;

    /* renamed from: c */
    private final C6425aa f4808c;

    /* renamed from: d */
    private final C6427ac f4809d;

    public C6455bd(Context context, C6425aa c6425aa, C6443as c6443as, C6427ac c6427ac) {
        this.f4806a = context;
        this.f4807b = c6443as;
        this.f4808c = c6425aa;
        this.f4809d = c6427ac;
    }

    /* renamed from: a */
    private static Map<String, String> m4466a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            C6436al.m4287c("not found extraMsg", new Object[0]);
            return map;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str != null) {
                C6436al.m4283a("Extra message[%d]: %s", Integer.valueOf(i10), str);
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    C6436al.m4288d("bad extraMsg %s", str);
                }
            }
        }
        return map;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (C6449ay.m4443a() == null) {
            return false;
        }
        C6449ay c6449ayM4443a = C6449ay.m4443a();
        if (c6449ayM4443a.f4768a.get()) {
            C6436al.m4287c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = c6449ayM4443a.f4769b;
        if (C6497z.m4685a(activityManager) || C6450az.m4461a(activityManager, 0L) == null) {
            C6436al.m4287c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (c6449ayM4443a.m4457a(System.currentTimeMillis())) {
            return false;
        }
        return c6449ayM4443a.m4458a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7) {
        C6436al.m4283a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i10, i11, j10, j11, str, str2, str3, str4, i12, str5, i13, i14, i15, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7, String[] strArr) {
        String str8;
        String string;
        boolean z10;
        String str9;
        String strM4681a;
        C6436al.m4283a("Native Crash Happen v2", new Object[0]);
        if (i12 > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(");
                str8 = str5;
                sb.append(str8);
                sb.append(")");
                string = sb.toString();
            } catch (Throwable th) {
                if (C6436al.m4284a(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        } else {
            string = str;
            str8 = str5;
        }
        String strM4471a = C6456be.m4471a(str3);
        Map<String, String> mapM4466a = m4466a(strArr);
        String str10 = mapM4466a.get("HasPendingException");
        if (str10 == null || !str10.equals("true")) {
            z10 = false;
        } else {
            C6436al.m4283a("Native crash happened with a Java pending exception.", new Object[0]);
            z10 = true;
        }
        C6425aa c6425aa = this.f4808c;
        String str11 = mapM4466a.get("ExceptionProcessName");
        if (str11 == null || str11.length() == 0) {
            str11 = c6425aa.f4538d;
        } else {
            C6436al.m4287c("Name of crash process: %s", str11);
        }
        String str12 = mapM4466a.get("ExceptionThreadName");
        C6436al.m4287c("crash thread name:%s tid:%s", str12, Integer.valueOf(i11));
        if (TextUtils.isEmpty(str12)) {
            str9 = Thread.currentThread().getName() + "(" + i11 + ")";
        } else {
            str9 = str12 + "(" + i11 + ")";
        }
        long j12 = (j10 * 1000) + (j11 / 1000);
        String str13 = mapM4466a.get("SysLogPath");
        String str14 = mapM4466a.get("JniLogPath");
        if (!this.f4809d.m4220b()) {
            C6436al.m4288d("no remote but still store!", new Object[0]);
        }
        if (!this.f4809d.m4221c().f4383f && this.f4809d.m4220b()) {
            C6436al.m4289e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            C6443as.m4373a("NATIVE_CRASH", C6440ap.m4318a(), str11, str9, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM4471a, null);
            C6440ap.m4349c(str4);
            return;
        }
        if (i12 > 0) {
            str8 = "KERNEL";
        }
        String str15 = str8;
        strM4681a = "UNKNOWN";
        if (i12 <= 0) {
            strM4681a = i13 > 0 ? C6497z.m4681a(i13) : "UNKNOWN";
            if (!strM4681a.equals(String.valueOf(i13))) {
                strM4681a = strM4681a + "(" + i13 + ")";
            }
        }
        String str16 = str9;
        String str17 = str11;
        CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str17, str16, j12, string, str2, strM4471a, str15, strM4681a, str4, str13, str14, str7, null, null, true, z10);
        if (crashDetailBeanPackageCrashDatas == null) {
            C6436al.m4289e("pkg crash datas fail!", new Object[0]);
            return;
        }
        C6443as.m4373a("NATIVE_CRASH", C6440ap.m4318a(), str17, str16, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM4471a, crashDetailBeanPackageCrashDatas);
        C6443as c6443as = this.f4807b;
        if (c6443as == null) {
            C6436al.m4288d("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        boolean zM4402a = c6443as.m4402a(crashDetailBeanPackageCrashDatas, true);
        C6456be.m4475a(true, NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null);
        if (!zM4402a) {
            this.f4807b.m4404b(crashDetailBeanPackageCrashDatas, true);
        }
        this.f4807b.m4400a(crashDetailBeanPackageCrashDatas);
        C6444at.m4406a().f4720t.m4438b();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z10, boolean z11) throws IOException {
        int i10;
        String str12;
        int iIndexOf;
        boolean zM4420i = C6444at.m4406a().m4420i();
        if (zM4420i) {
            C6436al.m4289e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f4429b = 1;
        crashDetailBean.f4432e = this.f4808c.m4167g();
        C6425aa c6425aa = this.f4808c;
        crashDetailBean.f4433f = c6425aa.f4549o;
        crashDetailBean.f4434g = c6425aa.m4177q();
        crashDetailBean.f4440m = this.f4808c.m4165f();
        crashDetailBean.f4441n = str3;
        crashDetailBean.f4442o = zM4420i ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f4443p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f4444q = str13;
        crashDetailBean.f4445r = j10;
        crashDetailBean.f4448u = C6440ap.m4348c(str13.getBytes());
        crashDetailBean.f4401A = str;
        crashDetailBean.f4402B = str2;
        crashDetailBean.f4412L = this.f4808c.m4179s();
        crashDetailBean.f4435h = this.f4808c.m4176p();
        crashDetailBean.f4436i = this.f4808c.m4152A();
        crashDetailBean.f4449v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String strM4473a = C6456be.m4473a(dumpFilePath, str8);
        if (!C6440ap.m4346b(strM4473a)) {
            crashDetailBean.f4426Z = strM4473a;
        }
        crashDetailBean.f4428aa = C6456be.m4477b(dumpFilePath);
        crashDetailBean.f4450w = C6456be.m4472a(str9, C6444at.f4702f, C6444at.f4707k, C6444at.f4712p);
        crashDetailBean.f4451x = C6456be.m4472a(str10, C6444at.f4702f, null, true);
        crashDetailBean.f4414N = str7;
        crashDetailBean.f4415O = str6;
        crashDetailBean.f4416P = str11;
        crashDetailBean.f4406F = this.f4808c.m4172k();
        crashDetailBean.f4407G = this.f4808c.m4171j();
        crashDetailBean.f4408H = this.f4808c.m4173l();
        crashDetailBean.f4409I = C6426ab.m4189b(this.f4806a);
        crashDetailBean.f4410J = C6426ab.m4196g();
        crashDetailBean.f4411K = C6426ab.m4197h();
        if (!z10) {
            crashDetailBean.f4403C = -1L;
            crashDetailBean.f4404D = -1L;
            crashDetailBean.f4405E = -1L;
            if (crashDetailBean.f4450w == null) {
                crashDetailBean.f4450w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f4417Q = -1L;
            crashDetailBean.f4421U = -1;
            crashDetailBean.f4422V = -1;
            crashDetailBean.f4423W = map;
            crashDetailBean.f4424X = this.f4808c.m4185y();
            crashDetailBean.f4453z = null;
            if (str == null) {
                crashDetailBean.f4401A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f4452y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.f4403C = C6426ab.m4199j();
        crashDetailBean.f4404D = C6426ab.m4195f();
        crashDetailBean.f4405E = C6426ab.m4201l();
        crashDetailBean.f4452y = C6439ao.m4302a();
        C6425aa c6425aa2 = this.f4808c;
        crashDetailBean.f4417Q = c6425aa2.f4511a;
        crashDetailBean.f4418R = c6425aa2.m4156a();
        crashDetailBean.f4453z = C6440ap.m4329a(this.f4808c.f4502Q, C6444at.f4704h);
        int iIndexOf2 = crashDetailBean.f4444q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i10 = iIndexOf2 + 6) < crashDetailBean.f4444q.length()) {
            String str14 = crashDetailBean.f4444q;
            String strSubstring = str14.substring(i10, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f4453z.containsKey(crashDetailBean.f4402B) && (iIndexOf = (str12 = crashDetailBean.f4453z.get(crashDetailBean.f4402B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f4453z.put(crashDetailBean.f4402B, strSubstring2);
                crashDetailBean.f4444q = crashDetailBean.f4444q.substring(0, i10);
                crashDetailBean.f4444q += strSubstring2;
            }
        }
        if (str == null) {
            crashDetailBean.f4401A = this.f4808c.f4538d;
        }
        crashDetailBean.f4421U = this.f4808c.m4186z();
        C6425aa c6425aa3 = this.f4808c;
        crashDetailBean.f4422V = c6425aa3.f4558x;
        crashDetailBean.f4423W = c6425aa3.m4180t();
        crashDetailBean.f4424X = this.f4808c.m4185y();
        return crashDetailBean;
    }
}
