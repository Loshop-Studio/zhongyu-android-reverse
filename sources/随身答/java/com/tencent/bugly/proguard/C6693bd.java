package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bd */
/* loaded from: classes4.dex */
public final class C6693bd implements NativeExceptionHandler {

    /* renamed from: a */
    private final Context f6040a;

    /* renamed from: b */
    private final C6681as f6041b;

    /* renamed from: c */
    private final C6663aa f6042c;

    /* renamed from: d */
    private final C6665ac f6043d;

    public C6693bd(Context context, C6663aa c6663aa, C6681as c6681as, C6665ac c6665ac) {
        this.f6040a = context;
        this.f6041b = c6681as;
        this.f6042c = c6663aa;
        this.f6043d = c6665ac;
    }

    /* renamed from: a */
    private static Map<String, String> m5285a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            C6674al.m5106c("not found extraMsg", new Object[0]);
            return map;
        }
        for (int i9 = 0; i9 < strArr.length; i9++) {
            String str = strArr[i9];
            if (str != null) {
                C6674al.m5102a("Extra message[%d]: %s", Integer.valueOf(i9), str);
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    C6674al.m5107d("bad extraMsg %s", str);
                }
            }
        }
        return map;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (C6687ay.m5262a() == null) {
            return false;
        }
        C6687ay c6687ayM5262a = C6687ay.m5262a();
        if (c6687ayM5262a.f6002a.get()) {
            C6674al.m5106c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = c6687ayM5262a.f6003b;
        if (C6735z.m5504a(activityManager) || C6688az.m5280a(activityManager, 0L) == null) {
            C6674al.m5106c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (c6687ayM5262a.m5276a(System.currentTimeMillis())) {
            return false;
        }
        return c6687ayM5262a.m5277a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i9, int i10, long j9, long j10, String str, String str2, String str3, String str4, int i11, String str5, int i12, int i13, int i14, String str6, String str7) {
        C6674al.m5102a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i9, i10, j9, j10, str, str2, str3, str4, i11, str5, i12, i13, i14, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int i9, int i10, long j9, long j10, String str, String str2, String str3, String str4, int i11, String str5, int i12, int i13, int i14, String str6, String str7, String[] strArr) {
        String str8;
        String string;
        boolean z9;
        String str9;
        String strM5500a;
        C6674al.m5102a("Native Crash Happen v2", new Object[0]);
        if (i11 > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(");
                str8 = str5;
                sb.append(str8);
                sb.append(")");
                string = sb.toString();
            } catch (Throwable th) {
                if (C6674al.m5103a(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        } else {
            string = str;
            str8 = str5;
        }
        String strM5290a = C6694be.m5290a(str3);
        Map<String, String> mapM5285a = m5285a(strArr);
        String str10 = mapM5285a.get("HasPendingException");
        if (str10 == null || !str10.equals("true")) {
            z9 = false;
        } else {
            C6674al.m5102a("Native crash happened with a Java pending exception.", new Object[0]);
            z9 = true;
        }
        C6663aa c6663aa = this.f6042c;
        String str11 = mapM5285a.get("ExceptionProcessName");
        if (str11 == null || str11.length() == 0) {
            str11 = c6663aa.f5772d;
        } else {
            C6674al.m5106c("Name of crash process: %s", str11);
        }
        String str12 = mapM5285a.get("ExceptionThreadName");
        C6674al.m5106c("crash thread name:%s tid:%s", str12, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str12)) {
            str9 = Thread.currentThread().getName() + "(" + i10 + ")";
        } else {
            str9 = str12 + "(" + i10 + ")";
        }
        long j11 = (j9 * 1000) + (j10 / 1000);
        String str13 = mapM5285a.get("SysLogPath");
        String str14 = mapM5285a.get("JniLogPath");
        if (!this.f6043d.m5039b()) {
            C6674al.m5107d("no remote but still store!", new Object[0]);
        }
        if (!this.f6043d.m5040c().f5617f && this.f6043d.m5039b()) {
            C6674al.m5108e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            C6681as.m5192a("NATIVE_CRASH", C6678ap.m5137a(), str11, str9, string + AbsSection.SEP_ORIGIN_LINE_BREAK + str2 + AbsSection.SEP_ORIGIN_LINE_BREAK + strM5290a, null);
            C6678ap.m5168c(str4);
            return;
        }
        if (i11 > 0) {
            str8 = "KERNEL";
        }
        String str15 = str8;
        strM5500a = "UNKNOWN";
        if (i11 <= 0) {
            strM5500a = i12 > 0 ? C6735z.m5500a(i12) : "UNKNOWN";
            if (!strM5500a.equals(String.valueOf(i12))) {
                strM5500a = strM5500a + "(" + i12 + ")";
            }
        }
        String str16 = str9;
        String str17 = str11;
        CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str17, str16, j11, string, str2, strM5290a, str15, strM5500a, str4, str13, str14, str7, null, null, true, z9);
        if (crashDetailBeanPackageCrashDatas == null) {
            C6674al.m5108e("pkg crash datas fail!", new Object[0]);
            return;
        }
        C6681as.m5192a("NATIVE_CRASH", C6678ap.m5137a(), str17, str16, string + AbsSection.SEP_ORIGIN_LINE_BREAK + str2 + AbsSection.SEP_ORIGIN_LINE_BREAK + strM5290a, crashDetailBeanPackageCrashDatas);
        C6681as c6681as = this.f6041b;
        if (c6681as == null) {
            C6674al.m5107d("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        boolean zM5221a = c6681as.m5221a(crashDetailBeanPackageCrashDatas, true);
        C6694be.m5294a(true, NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null);
        if (!zM5221a) {
            this.f6041b.m5223b(crashDetailBeanPackageCrashDatas, true);
        }
        this.f6041b.m5219a(crashDetailBeanPackageCrashDatas);
        C6682at.m5225a().f5954t.m5257b();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j9, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z9, boolean z10) throws IOException {
        int i9;
        String str12;
        int iIndexOf;
        boolean zM5239i = C6682at.m5225a().m5239i();
        if (zM5239i) {
            C6674al.m5108e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f5663b = 1;
        crashDetailBean.f5666e = this.f6042c.m4986g();
        C6663aa c6663aa = this.f6042c;
        crashDetailBean.f5667f = c6663aa.f5783o;
        crashDetailBean.f5668g = c6663aa.m4996q();
        crashDetailBean.f5674m = this.f6042c.m4984f();
        crashDetailBean.f5675n = str3;
        crashDetailBean.f5676o = zM5239i ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f5677p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f5678q = str13;
        crashDetailBean.f5679r = j9;
        crashDetailBean.f5682u = C6678ap.m5167c(str13.getBytes());
        crashDetailBean.f5635A = str;
        crashDetailBean.f5636B = str2;
        crashDetailBean.f5646L = this.f6042c.m4998s();
        crashDetailBean.f5669h = this.f6042c.m4995p();
        crashDetailBean.f5670i = this.f6042c.m4971A();
        crashDetailBean.f5683v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String strM5292a = C6694be.m5292a(dumpFilePath, str8);
        if (!C6678ap.m5165b(strM5292a)) {
            crashDetailBean.f5660Z = strM5292a;
        }
        crashDetailBean.f5662aa = C6694be.m5296b(dumpFilePath);
        crashDetailBean.f5684w = C6694be.m5291a(str9, C6682at.f5936f, C6682at.f5941k, C6682at.f5946p);
        crashDetailBean.f5685x = C6694be.m5291a(str10, C6682at.f5936f, null, true);
        crashDetailBean.f5648N = str7;
        crashDetailBean.f5649O = str6;
        crashDetailBean.f5650P = str11;
        crashDetailBean.f5640F = this.f6042c.m4991k();
        crashDetailBean.f5641G = this.f6042c.m4990j();
        crashDetailBean.f5642H = this.f6042c.m4992l();
        crashDetailBean.f5643I = C6664ab.m5008b(this.f6040a);
        crashDetailBean.f5644J = C6664ab.m5015g();
        crashDetailBean.f5645K = C6664ab.m5016h();
        if (!z9) {
            crashDetailBean.f5637C = -1L;
            crashDetailBean.f5638D = -1L;
            crashDetailBean.f5639E = -1L;
            if (crashDetailBean.f5684w == null) {
                crashDetailBean.f5684w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f5651Q = -1L;
            crashDetailBean.f5655U = -1;
            crashDetailBean.f5656V = -1;
            crashDetailBean.f5657W = map;
            crashDetailBean.f5658X = this.f6042c.m5004y();
            crashDetailBean.f5687z = null;
            if (str == null) {
                crashDetailBean.f5635A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f5686y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.f5637C = C6664ab.m5018j();
        crashDetailBean.f5638D = C6664ab.m5014f();
        crashDetailBean.f5639E = C6664ab.m5020l();
        crashDetailBean.f5686y = C6677ao.m5121a();
        C6663aa c6663aa2 = this.f6042c;
        crashDetailBean.f5651Q = c6663aa2.f5745a;
        crashDetailBean.f5652R = c6663aa2.m4975a();
        crashDetailBean.f5687z = C6678ap.m5148a(this.f6042c.f5736Q, C6682at.f5938h);
        int iIndexOf2 = crashDetailBean.f5678q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i9 = iIndexOf2 + 6) < crashDetailBean.f5678q.length()) {
            String str14 = crashDetailBean.f5678q;
            String strSubstring = str14.substring(i9, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f5687z.containsKey(crashDetailBean.f5636B) && (iIndexOf = (str12 = crashDetailBean.f5687z.get(crashDetailBean.f5636B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f5687z.put(crashDetailBean.f5636B, strSubstring2);
                crashDetailBean.f5678q = crashDetailBean.f5678q.substring(0, i9);
                crashDetailBean.f5678q += strSubstring2;
            }
        }
        if (str == null) {
            crashDetailBean.f5635A = this.f6042c.f5772d;
        }
        crashDetailBean.f5655U = this.f6042c.m5005z();
        C6663aa c6663aa3 = this.f6042c;
        crashDetailBean.f5656V = c6663aa3.f5792x;
        crashDetailBean.f5657W = c6663aa3.m4999t();
        crashDetailBean.f5658X = this.f6042c.m5004y();
        return crashDetailBean;
    }
}
