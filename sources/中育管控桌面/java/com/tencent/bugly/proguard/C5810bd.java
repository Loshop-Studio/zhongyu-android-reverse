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
/* loaded from: classes3.dex */
public final class C5810bd implements NativeExceptionHandler {

    /* renamed from: a */
    private final Context f4184a;

    /* renamed from: b */
    private final C5798as f4185b;

    /* renamed from: c */
    private final C5780aa f4186c;

    /* renamed from: d */
    private final C5782ac f4187d;

    public C5810bd(Context context, C5780aa c5780aa, C5798as c5798as, C5782ac c5782ac) {
        this.f4184a = context;
        this.f4185b = c5798as;
        this.f4186c = c5780aa;
        this.f4187d = c5782ac;
    }

    /* renamed from: a */
    private static Map<String, String> m4111a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            C5791al.m3932c("not found extraMsg", new Object[0]);
            return map;
        }
        for (int i6 = 0; i6 < strArr.length; i6++) {
            String str = strArr[i6];
            if (str != null) {
                C5791al.m3928a("Extra message[%d]: %s", Integer.valueOf(i6), str);
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    C5791al.m3933d("bad extraMsg %s", str);
                }
            }
        }
        return map;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (C5804ay.m4088a() == null) {
            return false;
        }
        C5804ay c5804ayM4088a = C5804ay.m4088a();
        if (c5804ayM4088a.f4146a.get()) {
            C5791al.m3932c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = c5804ayM4088a.f4147b;
        if (C5852z.m4330a(activityManager) || C5805az.m4106a(activityManager, 0L) == null) {
            C5791al.m3932c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (c5804ayM4088a.m4102a(System.currentTimeMillis())) {
            return false;
        }
        return c5804ayM4088a.m4103a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i6, int i7, long j6, long j7, String str, String str2, String str3, String str4, int i8, String str5, int i9, int i10, int i11, String str6, String str7) {
        C5791al.m3928a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i6, i7, j6, j7, str, str2, str3, str4, i8, str5, i9, i10, i11, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int i6, int i7, long j6, long j7, String str, String str2, String str3, String str4, int i8, String str5, int i9, int i10, int i11, String str6, String str7, String[] strArr) {
        String str8;
        String string;
        boolean z6;
        String str9;
        String strM4326a;
        C5791al.m3928a("Native Crash Happen v2", new Object[0]);
        if (i8 > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(");
                str8 = str5;
                sb.append(str8);
                sb.append(")");
                string = sb.toString();
            } catch (Throwable th) {
                if (C5791al.m3929a(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        } else {
            string = str;
            str8 = str5;
        }
        String strM4116a = C5811be.m4116a(str3);
        Map<String, String> mapM4111a = m4111a(strArr);
        String str10 = mapM4111a.get("HasPendingException");
        if (str10 == null || !str10.equals("true")) {
            z6 = false;
        } else {
            C5791al.m3928a("Native crash happened with a Java pending exception.", new Object[0]);
            z6 = true;
        }
        C5780aa c5780aa = this.f4186c;
        String str11 = mapM4111a.get("ExceptionProcessName");
        if (str11 == null || str11.length() == 0) {
            str11 = c5780aa.f3916d;
        } else {
            C5791al.m3932c("Name of crash process: %s", str11);
        }
        String str12 = mapM4111a.get("ExceptionThreadName");
        C5791al.m3932c("crash thread name:%s tid:%s", str12, Integer.valueOf(i7));
        if (TextUtils.isEmpty(str12)) {
            str9 = Thread.currentThread().getName() + "(" + i7 + ")";
        } else {
            str9 = str12 + "(" + i7 + ")";
        }
        long j8 = (j6 * 1000) + (j7 / 1000);
        String str13 = mapM4111a.get("SysLogPath");
        String str14 = mapM4111a.get("JniLogPath");
        if (!this.f4187d.m3865b()) {
            C5791al.m3933d("no remote but still store!", new Object[0]);
        }
        if (!this.f4187d.m3866c().f3761f && this.f4187d.m3865b()) {
            C5791al.m3934e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            C5798as.m4018a("NATIVE_CRASH", C5795ap.m3963a(), str11, str9, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM4116a, null);
            C5795ap.m3994c(str4);
            return;
        }
        if (i8 > 0) {
            str8 = "KERNEL";
        }
        String str15 = str8;
        strM4326a = "UNKNOWN";
        if (i8 <= 0) {
            strM4326a = i9 > 0 ? C5852z.m4326a(i9) : "UNKNOWN";
            if (!strM4326a.equals(String.valueOf(i9))) {
                strM4326a = strM4326a + "(" + i9 + ")";
            }
        }
        String str16 = str9;
        String str17 = str11;
        CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str17, str16, j8, string, str2, strM4116a, str15, strM4326a, str4, str13, str14, str7, null, null, true, z6);
        if (crashDetailBeanPackageCrashDatas == null) {
            C5791al.m3934e("pkg crash datas fail!", new Object[0]);
            return;
        }
        C5798as.m4018a("NATIVE_CRASH", C5795ap.m3963a(), str17, str16, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM4116a, crashDetailBeanPackageCrashDatas);
        C5798as c5798as = this.f4185b;
        if (c5798as == null) {
            C5791al.m3933d("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        boolean zM4047a = c5798as.m4047a(crashDetailBeanPackageCrashDatas, true);
        C5811be.m4120a(true, NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null);
        if (!zM4047a) {
            this.f4185b.m4049b(crashDetailBeanPackageCrashDatas, true);
        }
        this.f4185b.m4045a(crashDetailBeanPackageCrashDatas);
        C5799at.m4051a().f4098t.m4083b();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j6, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z6, boolean z7) throws IOException {
        int i6;
        String str12;
        int iIndexOf;
        boolean zM4065i = C5799at.m4051a().m4065i();
        if (zM4065i) {
            C5791al.m3934e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f3807b = 1;
        crashDetailBean.f3810e = this.f4186c.m3812g();
        C5780aa c5780aa = this.f4186c;
        crashDetailBean.f3811f = c5780aa.f3927o;
        crashDetailBean.f3812g = c5780aa.m3822q();
        crashDetailBean.f3818m = this.f4186c.m3810f();
        crashDetailBean.f3819n = str3;
        crashDetailBean.f3820o = zM4065i ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f3821p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f3822q = str13;
        crashDetailBean.f3823r = j6;
        crashDetailBean.f3826u = C5795ap.m3993c(str13.getBytes());
        crashDetailBean.f3779A = str;
        crashDetailBean.f3780B = str2;
        crashDetailBean.f3790L = this.f4186c.m3824s();
        crashDetailBean.f3813h = this.f4186c.m3821p();
        crashDetailBean.f3814i = this.f4186c.m3797A();
        crashDetailBean.f3827v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String strM4118a = C5811be.m4118a(dumpFilePath, str8);
        if (!C5795ap.m3991b(strM4118a)) {
            crashDetailBean.f3804Z = strM4118a;
        }
        crashDetailBean.f3806aa = C5811be.m4122b(dumpFilePath);
        crashDetailBean.f3828w = C5811be.m4117a(str9, C5799at.f4080f, C5799at.f4085k, C5799at.f4090p);
        crashDetailBean.f3829x = C5811be.m4117a(str10, C5799at.f4080f, null, true);
        crashDetailBean.f3792N = str7;
        crashDetailBean.f3793O = str6;
        crashDetailBean.f3794P = str11;
        crashDetailBean.f3784F = this.f4186c.m3817k();
        crashDetailBean.f3785G = this.f4186c.m3816j();
        crashDetailBean.f3786H = this.f4186c.m3818l();
        crashDetailBean.f3787I = C5781ab.m3834b(this.f4184a);
        crashDetailBean.f3788J = C5781ab.m3841g();
        crashDetailBean.f3789K = C5781ab.m3842h();
        if (!z6) {
            crashDetailBean.f3781C = -1L;
            crashDetailBean.f3782D = -1L;
            crashDetailBean.f3783E = -1L;
            if (crashDetailBean.f3828w == null) {
                crashDetailBean.f3828w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f3795Q = -1L;
            crashDetailBean.f3799U = -1;
            crashDetailBean.f3800V = -1;
            crashDetailBean.f3801W = map;
            crashDetailBean.f3802X = this.f4186c.m3830y();
            crashDetailBean.f3831z = null;
            if (str == null) {
                crashDetailBean.f3779A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f3830y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.f3781C = C5781ab.m3844j();
        crashDetailBean.f3782D = C5781ab.m3840f();
        crashDetailBean.f3783E = C5781ab.m3846l();
        crashDetailBean.f3830y = C5794ao.m3947a();
        C5780aa c5780aa2 = this.f4186c;
        crashDetailBean.f3795Q = c5780aa2.f3889a;
        crashDetailBean.f3796R = c5780aa2.m3801a();
        crashDetailBean.f3831z = C5795ap.m3974a(this.f4186c.f3880Q, C5799at.f4082h);
        int iIndexOf2 = crashDetailBean.f3822q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i6 = iIndexOf2 + 6) < crashDetailBean.f3822q.length()) {
            String str14 = crashDetailBean.f3822q;
            String strSubstring = str14.substring(i6, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f3831z.containsKey(crashDetailBean.f3780B) && (iIndexOf = (str12 = crashDetailBean.f3831z.get(crashDetailBean.f3780B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f3831z.put(crashDetailBean.f3780B, strSubstring2);
                crashDetailBean.f3822q = crashDetailBean.f3822q.substring(0, i6);
                crashDetailBean.f3822q += strSubstring2;
            }
        }
        if (str == null) {
            crashDetailBean.f3779A = this.f4186c.f3916d;
        }
        crashDetailBean.f3799U = this.f4186c.m3831z();
        C5780aa c5780aa3 = this.f4186c;
        crashDetailBean.f3800V = c5780aa3.f3936x;
        crashDetailBean.f3801W = c5780aa3.m3825t();
        crashDetailBean.f3802X = this.f4186c.m3830y();
        return crashDetailBean;
    }
}
