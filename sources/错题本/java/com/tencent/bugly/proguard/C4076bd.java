package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bd */
/* loaded from: classes3.dex */
public final class C4076bd implements NativeExceptionHandler {

    /* renamed from: a */
    private final Context f3665a;

    /* renamed from: b */
    private final C4062as f3666b;

    /* renamed from: c */
    private final C4044aa f3667c;

    /* renamed from: d */
    private final C4046ac f3668d;

    public C4076bd(Context context, C4044aa c4044aa, C4062as c4062as, C4046ac c4046ac) {
        this.f3665a = context;
        this.f3666b = c4062as;
        this.f3667c = c4044aa;
        this.f3668d = c4046ac;
    }

    /* renamed from: a */
    private static Map<String, String> m3203a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            C4055al.m3025c("not found extraMsg", new Object[0]);
            return map;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                C4055al.m3021a("Extra message[%d]: %s", Integer.valueOf(i), str);
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    C4055al.m3026d("bad extraMsg %s", str);
                }
            }
        }
        return map;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (C4068ay.m3180a() == null) {
            return false;
        }
        C4068ay c4068ayM3180a = C4068ay.m3180a();
        if (c4068ayM3180a.f3631a.get()) {
            C4055al.m3025c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = c4068ayM3180a.f3632b;
        if (C4149z.m3421a(activityManager) || C4069az.m3198a(activityManager, 0L) == null) {
            C4055al.m3025c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (c4068ayM3180a.m3194a(System.currentTimeMillis())) {
            return false;
        }
        return c4068ayM3180a.m3195a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i, int i8, long j7, long j8, String str, String str2, String str3, String str4, int i9, String str5, int i10, int i11, int i12, String str6, String str7) {
        C4055al.m3021a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i, i8, j7, j8, str, str2, str3, str4, i9, str5, i10, i11, i12, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int i, int i8, long j7, long j8, String str, String str2, String str3, String str4, int i9, String str5, int i10, int i11, int i12, String str6, String str7, String[] strArr) {
        String str8;
        String string;
        boolean z8;
        String str9;
        String strM3417a;
        C4055al.m3021a("Native Crash Happen v2", new Object[0]);
        if (i9 > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(");
                str8 = str5;
                sb.append(str8);
                sb.append(")");
                string = sb.toString();
            } catch (Throwable th) {
                if (C4055al.m3022a(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        } else {
            string = str;
            str8 = str5;
        }
        String strM3208a = C4077be.m3208a(str3);
        Map<String, String> mapM3203a = m3203a(strArr);
        String str10 = mapM3203a.get("HasPendingException");
        if (str10 == null || !str10.equals("true")) {
            z8 = false;
        } else {
            C4055al.m3021a("Native crash happened with a Java pending exception.", new Object[0]);
            z8 = true;
        }
        C4044aa c4044aa = this.f3667c;
        String str11 = mapM3203a.get("ExceptionProcessName");
        if (str11 == null || str11.length() == 0) {
            str11 = c4044aa.f3434d;
        } else {
            C4055al.m3025c("Name of crash process: %s", str11);
        }
        String str12 = mapM3203a.get("ExceptionThreadName");
        C4055al.m3025c("crash thread name:%s tid:%s", str12, Integer.valueOf(i8));
        if (TextUtils.isEmpty(str12)) {
            str9 = Thread.currentThread().getName() + "(" + i8 + ")";
        } else {
            str9 = str12 + "(" + i8 + ")";
        }
        long j9 = (j7 * 1000) + (j8 / 1000);
        String str13 = mapM3203a.get("SysLogPath");
        String str14 = mapM3203a.get("JniLogPath");
        if (!this.f3668d.m2959b()) {
            C4055al.m3026d("no remote but still store!", new Object[0]);
        }
        if (!this.f3668d.m2960c().f3274f && this.f3668d.m2959b()) {
            C4055al.m3027e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            C4062as.m3111a("NATIVE_CRASH", C4059ap.m3056a(), str11, str9, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM3208a, null);
            C4059ap.m3087c(str4);
            return;
        }
        if (i9 > 0) {
            str8 = "KERNEL";
        }
        String str15 = str8;
        strM3417a = "UNKNOWN";
        if (i9 <= 0) {
            strM3417a = i10 > 0 ? C4149z.m3417a(i10) : "UNKNOWN";
            if (!strM3417a.equals(String.valueOf(i10))) {
                strM3417a = strM3417a + "(" + i10 + ")";
            }
        }
        String str16 = str9;
        String str17 = str11;
        CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str17, str16, j9, string, str2, strM3208a, str15, strM3417a, str4, str13, str14, str7, null, null, true, z8);
        if (crashDetailBeanPackageCrashDatas == null) {
            C4055al.m3027e("pkg crash datas fail!", new Object[0]);
            return;
        }
        C4062as.m3111a("NATIVE_CRASH", C4059ap.m3056a(), str17, str16, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM3208a, crashDetailBeanPackageCrashDatas);
        C4062as c4062as = this.f3666b;
        if (c4062as == null) {
            C4055al.m3026d("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        boolean zM3140a = c4062as.m3140a(crashDetailBeanPackageCrashDatas, true);
        C4077be.m3212a(true, NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null);
        if (!zM3140a) {
            this.f3666b.m3142b(crashDetailBeanPackageCrashDatas, true);
        }
        this.f3666b.m3138a(crashDetailBeanPackageCrashDatas);
        C4063at.m3143a().f3593t.m3175b();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j7, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z8, boolean z9) throws IOException {
        int i;
        String str12;
        int iIndexOf;
        boolean zM3157i = C4063at.m3143a().m3157i();
        if (zM3157i) {
            C4055al.m3027e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f3320b = 1;
        crashDetailBean.f3323e = this.f3667c.m2907g();
        C4044aa c4044aa = this.f3667c;
        crashDetailBean.f3324f = c4044aa.f3445o;
        crashDetailBean.f3325g = c4044aa.m2917q();
        crashDetailBean.f3331m = this.f3667c.m2905f();
        crashDetailBean.f3332n = str3;
        crashDetailBean.f3333o = zM3157i ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f3334p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f3335q = str13;
        crashDetailBean.f3336r = j7;
        crashDetailBean.f3339u = C4059ap.m3086c(str13.getBytes());
        crashDetailBean.f3292A = str;
        crashDetailBean.f3293B = str2;
        crashDetailBean.f3303L = this.f3667c.m2919s();
        crashDetailBean.f3326h = this.f3667c.m2916p();
        crashDetailBean.f3327i = this.f3667c.m2892A();
        crashDetailBean.f3340v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String strM3210a = C4077be.m3210a(dumpFilePath, str8);
        if (!C4059ap.m3084b(strM3210a)) {
            crashDetailBean.f3317Z = strM3210a;
        }
        crashDetailBean.f3319aa = C4077be.m3214b(dumpFilePath);
        crashDetailBean.f3341w = C4077be.m3209a(str9, C4063at.f3575f, C4063at.f3580k, C4063at.f3585p);
        crashDetailBean.f3342x = C4077be.m3209a(str10, C4063at.f3575f, null, true);
        crashDetailBean.f3305N = str7;
        crashDetailBean.f3306O = str6;
        crashDetailBean.f3307P = str11;
        crashDetailBean.f3297F = this.f3667c.m2912k();
        crashDetailBean.f3298G = this.f3667c.m2911j();
        crashDetailBean.f3299H = this.f3667c.m2913l();
        crashDetailBean.f3300I = C4045ab.m2929b(this.f3665a);
        crashDetailBean.f3301J = C4045ab.m2936g();
        crashDetailBean.f3302K = C4045ab.m2937h();
        if (!z8) {
            crashDetailBean.f3294C = -1L;
            crashDetailBean.f3295D = -1L;
            crashDetailBean.f3296E = -1L;
            if (crashDetailBean.f3341w == null) {
                crashDetailBean.f3341w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f3308Q = -1L;
            crashDetailBean.f3312U = -1;
            crashDetailBean.f3313V = -1;
            crashDetailBean.f3314W = map;
            crashDetailBean.f3315X = this.f3667c.m2925y();
            crashDetailBean.f3344z = null;
            if (str == null) {
                crashDetailBean.f3292A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f3343y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.f3294C = C4045ab.m2939j();
        crashDetailBean.f3295D = C4045ab.m2935f();
        crashDetailBean.f3296E = C4045ab.m2941l();
        crashDetailBean.f3343y = C4058ao.m3040a();
        C4044aa c4044aa2 = this.f3667c;
        crashDetailBean.f3308Q = c4044aa2.f3407a;
        crashDetailBean.f3309R = c4044aa2.m2896a();
        crashDetailBean.f3344z = C4059ap.m3067a(this.f3667c.f3398Q, C4063at.f3577h);
        int iIndexOf2 = crashDetailBean.f3335q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i = iIndexOf2 + 6) < crashDetailBean.f3335q.length()) {
            String str14 = crashDetailBean.f3335q;
            String strSubstring = str14.substring(i, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f3344z.containsKey(crashDetailBean.f3293B) && (iIndexOf = (str12 = crashDetailBean.f3344z.get(crashDetailBean.f3293B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f3344z.put(crashDetailBean.f3293B, strSubstring2);
                crashDetailBean.f3335q = crashDetailBean.f3335q.substring(0, i);
                crashDetailBean.f3335q = AbstractC0037f.m91p(new StringBuilder(), crashDetailBean.f3335q, strSubstring2);
            }
        }
        if (str == null) {
            crashDetailBean.f3292A = this.f3667c.f3434d;
        }
        crashDetailBean.f3312U = this.f3667c.m2926z();
        C4044aa c4044aa3 = this.f3667c;
        crashDetailBean.f3313V = c4044aa3.f3454x;
        crashDetailBean.f3314W = c4044aa3.m2920t();
        crashDetailBean.f3315X = this.f3667c.m2925y();
        return crashDetailBean;
    }
}
