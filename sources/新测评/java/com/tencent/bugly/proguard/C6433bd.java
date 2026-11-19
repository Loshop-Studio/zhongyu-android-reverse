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
public final class C6433bd implements NativeExceptionHandler {

    /* renamed from: a */
    private final Context f5463a;

    /* renamed from: b */
    private final C6421as f5464b;

    /* renamed from: c */
    private final C6403aa f5465c;

    /* renamed from: d */
    private final C6405ac f5466d;

    public C6433bd(Context context, C6403aa c6403aa, C6421as c6421as, C6405ac c6405ac) {
        this.f5463a = context;
        this.f5464b = c6421as;
        this.f5465c = c6403aa;
        this.f5466d = c6405ac;
    }

    /* renamed from: a */
    private static Map<String, String> m5106a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            C6414al.m4927c("not found extraMsg", new Object[0]);
            return map;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str != null) {
                C6414al.m4923a("Extra message[%d]: %s", Integer.valueOf(i10), str);
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    C6414al.m4928d("bad extraMsg %s", str);
                }
            }
        }
        return map;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (C6427ay.m5083a() == null) {
            return false;
        }
        C6427ay c6427ayM5083a = C6427ay.m5083a();
        if (c6427ayM5083a.f5425a.get()) {
            C6414al.m4927c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = c6427ayM5083a.f5426b;
        if (C6475z.m5325a(activityManager) || C6428az.m5101a(activityManager, 0L) == null) {
            C6414al.m4927c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (c6427ayM5083a.m5097a(System.currentTimeMillis())) {
            return false;
        }
        return c6427ayM5083a.m5098a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7) {
        C6414al.m4923a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i10, i11, j10, j11, str, str2, str3, str4, i12, str5, i13, i14, i15, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7, String[] strArr) {
        String str8;
        String string;
        boolean z9;
        String str9;
        String strM5321a;
        C6414al.m4923a("Native Crash Happen v2", new Object[0]);
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
                if (C6414al.m4924a(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        } else {
            string = str;
            str8 = str5;
        }
        String strM5111a = C6434be.m5111a(str3);
        Map<String, String> mapM5106a = m5106a(strArr);
        String str10 = mapM5106a.get("HasPendingException");
        if (str10 == null || !str10.equals("true")) {
            z9 = false;
        } else {
            C6414al.m4923a("Native crash happened with a Java pending exception.", new Object[0]);
            z9 = true;
        }
        C6403aa c6403aa = this.f5465c;
        String str11 = mapM5106a.get("ExceptionProcessName");
        if (str11 == null || str11.length() == 0) {
            str11 = c6403aa.f5195d;
        } else {
            C6414al.m4927c("Name of crash process: %s", str11);
        }
        String str12 = mapM5106a.get("ExceptionThreadName");
        C6414al.m4927c("crash thread name:%s tid:%s", str12, Integer.valueOf(i11));
        if (TextUtils.isEmpty(str12)) {
            str9 = Thread.currentThread().getName() + "(" + i11 + ")";
        } else {
            str9 = str12 + "(" + i11 + ")";
        }
        long j12 = (j10 * 1000) + (j11 / 1000);
        String str13 = mapM5106a.get("SysLogPath");
        String str14 = mapM5106a.get("JniLogPath");
        if (!this.f5466d.m4860b()) {
            C6414al.m4928d("no remote but still store!", new Object[0]);
        }
        if (!this.f5466d.m4861c().f5040f && this.f5466d.m4860b()) {
            C6414al.m4929e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            C6421as.m5013a("NATIVE_CRASH", C6418ap.m4958a(), str11, str9, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM5111a, null);
            C6418ap.m4989c(str4);
            return;
        }
        if (i12 > 0) {
            str8 = "KERNEL";
        }
        String str15 = str8;
        strM5321a = "UNKNOWN";
        if (i12 <= 0) {
            strM5321a = i13 > 0 ? C6475z.m5321a(i13) : "UNKNOWN";
            if (!strM5321a.equals(String.valueOf(i13))) {
                strM5321a = strM5321a + "(" + i13 + ")";
            }
        }
        String str16 = str9;
        String str17 = str11;
        CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str17, str16, j12, string, str2, strM5111a, str15, strM5321a, str4, str13, str14, str7, null, null, true, z9);
        if (crashDetailBeanPackageCrashDatas == null) {
            C6414al.m4929e("pkg crash datas fail!", new Object[0]);
            return;
        }
        C6421as.m5013a("NATIVE_CRASH", C6418ap.m4958a(), str17, str16, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM5111a, crashDetailBeanPackageCrashDatas);
        C6421as c6421as = this.f5464b;
        if (c6421as == null) {
            C6414al.m4928d("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        boolean zM5042a = c6421as.m5042a(crashDetailBeanPackageCrashDatas, true);
        C6434be.m5115a(true, NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null);
        if (!zM5042a) {
            this.f5464b.m5044b(crashDetailBeanPackageCrashDatas, true);
        }
        this.f5464b.m5040a(crashDetailBeanPackageCrashDatas);
        C6422at.m5046a().f5377t.m5078b();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z9, boolean z10) throws IOException {
        int i10;
        String str12;
        int iIndexOf;
        boolean zM5060i = C6422at.m5046a().m5060i();
        if (zM5060i) {
            C6414al.m4929e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f5086b = 1;
        crashDetailBean.f5089e = this.f5465c.m4807g();
        C6403aa c6403aa = this.f5465c;
        crashDetailBean.f5090f = c6403aa.f5206o;
        crashDetailBean.f5091g = c6403aa.m4817q();
        crashDetailBean.f5097m = this.f5465c.m4805f();
        crashDetailBean.f5098n = str3;
        crashDetailBean.f5099o = zM5060i ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f5100p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f5101q = str13;
        crashDetailBean.f5102r = j10;
        crashDetailBean.f5105u = C6418ap.m4988c(str13.getBytes());
        crashDetailBean.f5058A = str;
        crashDetailBean.f5059B = str2;
        crashDetailBean.f5069L = this.f5465c.m4819s();
        crashDetailBean.f5092h = this.f5465c.m4816p();
        crashDetailBean.f5093i = this.f5465c.m4792A();
        crashDetailBean.f5106v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String strM5113a = C6434be.m5113a(dumpFilePath, str8);
        if (!C6418ap.m4986b(strM5113a)) {
            crashDetailBean.f5083Z = strM5113a;
        }
        crashDetailBean.f5085aa = C6434be.m5117b(dumpFilePath);
        crashDetailBean.f5107w = C6434be.m5112a(str9, C6422at.f5359f, C6422at.f5364k, C6422at.f5369p);
        crashDetailBean.f5108x = C6434be.m5112a(str10, C6422at.f5359f, null, true);
        crashDetailBean.f5071N = str7;
        crashDetailBean.f5072O = str6;
        crashDetailBean.f5073P = str11;
        crashDetailBean.f5063F = this.f5465c.m4812k();
        crashDetailBean.f5064G = this.f5465c.m4811j();
        crashDetailBean.f5065H = this.f5465c.m4813l();
        crashDetailBean.f5066I = C6404ab.m4829b(this.f5463a);
        crashDetailBean.f5067J = C6404ab.m4836g();
        crashDetailBean.f5068K = C6404ab.m4837h();
        if (!z9) {
            crashDetailBean.f5060C = -1L;
            crashDetailBean.f5061D = -1L;
            crashDetailBean.f5062E = -1L;
            if (crashDetailBean.f5107w == null) {
                crashDetailBean.f5107w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f5074Q = -1L;
            crashDetailBean.f5078U = -1;
            crashDetailBean.f5079V = -1;
            crashDetailBean.f5080W = map;
            crashDetailBean.f5081X = this.f5465c.m4825y();
            crashDetailBean.f5110z = null;
            if (str == null) {
                crashDetailBean.f5058A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f5109y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.f5060C = C6404ab.m4839j();
        crashDetailBean.f5061D = C6404ab.m4835f();
        crashDetailBean.f5062E = C6404ab.m4841l();
        crashDetailBean.f5109y = C6417ao.m4942a();
        C6403aa c6403aa2 = this.f5465c;
        crashDetailBean.f5074Q = c6403aa2.f5168a;
        crashDetailBean.f5075R = c6403aa2.m4796a();
        crashDetailBean.f5110z = C6418ap.m4969a(this.f5465c.f5159Q, C6422at.f5361h);
        int iIndexOf2 = crashDetailBean.f5101q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i10 = iIndexOf2 + 6) < crashDetailBean.f5101q.length()) {
            String str14 = crashDetailBean.f5101q;
            String strSubstring = str14.substring(i10, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f5110z.containsKey(crashDetailBean.f5059B) && (iIndexOf = (str12 = crashDetailBean.f5110z.get(crashDetailBean.f5059B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f5110z.put(crashDetailBean.f5059B, strSubstring2);
                crashDetailBean.f5101q = crashDetailBean.f5101q.substring(0, i10);
                crashDetailBean.f5101q += strSubstring2;
            }
        }
        if (str == null) {
            crashDetailBean.f5058A = this.f5465c.f5195d;
        }
        crashDetailBean.f5078U = this.f5465c.m4826z();
        C6403aa c6403aa3 = this.f5465c;
        crashDetailBean.f5079V = c6403aa3.f5215x;
        crashDetailBean.f5080W = c6403aa3.m4820t();
        crashDetailBean.f5081X = this.f5465c.m4825y();
        return crashDetailBean;
    }
}
