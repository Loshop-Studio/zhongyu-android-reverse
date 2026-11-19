package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bd */
/* loaded from: classes5.dex */
public final class C7798bd implements NativeExceptionHandler {

    /* renamed from: a */
    private final Context f13905a;

    /* renamed from: b */
    private final C7786as f13906b;

    /* renamed from: c */
    private final C7768aa f13907c;

    /* renamed from: d */
    private final C7770ac f13908d;

    public C7798bd(Context context, C7768aa c7768aa, C7786as c7786as, C7770ac c7770ac) {
        this.f13905a = context;
        this.f13906b = c7786as;
        this.f13907c = c7768aa;
        this.f13908d = c7770ac;
    }

    /* renamed from: a */
    private static Map<String, String> m10796a(String[] strArr) {
        HashMap map = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            C7779al.m10617c("not found extraMsg", new Object[0]);
            return map;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str != null) {
                C7779al.m10613a("Extra message[%d]: %s", Integer.valueOf(i10), str);
                String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                } else {
                    C7779al.m10618d("bad extraMsg %s", str);
                }
            }
        }
        return map;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (C7792ay.m10773a() == null) {
            return false;
        }
        C7792ay c7792ayM10773a = C7792ay.m10773a();
        if (c7792ayM10773a.f13867a.get()) {
            C7779al.m10617c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = c7792ayM10773a.f13868b;
        if (C7840z.m11015a(activityManager) || C7793az.m10791a(activityManager, 0L) == null) {
            C7779al.m10617c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (c7792ayM10773a.m10787a(System.currentTimeMillis())) {
            return false;
        }
        return c7792ayM10773a.m10788a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7) {
        C7779al.m10613a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i10, i11, j10, j11, str, str2, str3, str4, i12, str5, i13, i14, i15, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException2(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7, String[] strArr) {
        String str8;
        String string;
        boolean z10;
        String str9;
        C7779al.m10613a("Native Crash Happen v2", new Object[0]);
        if (i12 > 0) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("(");
                str8 = str5;
                sb2.append(str8);
                sb2.append(")");
                string = sb2.toString();
            } catch (Throwable th) {
                if (C7779al.m10614a(th)) {
                    return;
                }
                th.printStackTrace();
                return;
            }
        } else {
            string = str;
            str8 = str5;
        }
        String strM10801a = C7799be.m10801a(str3);
        Map<String, String> mapM10796a = m10796a(strArr);
        String str10 = mapM10796a.get("HasPendingException");
        if (str10 == null || !str10.equals(RequestConstant.TRUE)) {
            z10 = false;
        } else {
            C7779al.m10613a("Native crash happened with a Java pending exception.", new Object[0]);
            z10 = true;
        }
        C7768aa c7768aa = this.f13907c;
        String str11 = mapM10796a.get("ExceptionProcessName");
        if (str11 == null || str11.length() == 0) {
            str11 = c7768aa.f13637d;
        } else {
            C7779al.m10617c("Name of crash process: %s", str11);
        }
        String str12 = mapM10796a.get("ExceptionThreadName");
        C7779al.m10617c("crash thread name:%s tid:%s", str12, Integer.valueOf(i11));
        if (TextUtils.isEmpty(str12)) {
            str9 = Thread.currentThread().getName() + "(" + i11 + ")";
        } else {
            str9 = str12 + "(" + i11 + ")";
        }
        long j12 = (j10 * 1000) + (j11 / 1000);
        String str13 = mapM10796a.get("SysLogPath");
        String str14 = mapM10796a.get("JniLogPath");
        if (!this.f13908d.m10550b()) {
            C7779al.m10618d("no remote but still store!", new Object[0]);
        }
        if (!this.f13908d.m10551c().f13482f && this.f13908d.m10550b()) {
            C7779al.m10619e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
            C7786as.m10703a("NATIVE_CRASH", C7783ap.m10648a(), str11, str9, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM10801a, null);
            C7783ap.m10679c(str4);
            return;
        }
        if (i12 > 0) {
            str8 = "KERNEL";
        }
        String str15 = str8;
        String strM11011a = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        if (i12 <= 0) {
            if (i13 > 0) {
                strM11011a = C7840z.m11011a(i13);
            }
            if (!strM11011a.equals(String.valueOf(i13))) {
                strM11011a = strM11011a + "(" + i13 + ")";
            }
        }
        String str16 = str9;
        String str17 = str11;
        CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str17, str16, j12, string, str2, strM10801a, str15, strM11011a, str4, str13, str14, str7, null, null, true, z10);
        if (crashDetailBeanPackageCrashDatas == null) {
            C7779al.m10619e("pkg crash datas fail!", new Object[0]);
            return;
        }
        C7786as.m10703a("NATIVE_CRASH", C7783ap.m10648a(), str17, str16, string + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + strM10801a, crashDetailBeanPackageCrashDatas);
        C7786as c7786as = this.f13906b;
        if (c7786as == null) {
            C7779al.m10618d("crashHandler is null. Won't upload native crash.", new Object[0]);
            return;
        }
        boolean zM10732a = c7786as.m10732a(crashDetailBeanPackageCrashDatas, true);
        C7799be.m10805a(true, NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null);
        if (!zM10732a) {
            this.f13906b.m10734b(crashDetailBeanPackageCrashDatas, true);
        }
        this.f13906b.m10730a(crashDetailBeanPackageCrashDatas);
        C7787at.m10736a().f13819t.m10768b();
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z10, boolean z11) throws IOException {
        int i10;
        String str12;
        int iIndexOf;
        boolean zM10750i = C7787at.m10736a().m10750i();
        if (zM10750i) {
            C7779al.m10619e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f13528b = 1;
        crashDetailBean.f13531e = this.f13907c.m10497g();
        C7768aa c7768aa = this.f13907c;
        crashDetailBean.f13532f = c7768aa.f13648o;
        crashDetailBean.f13533g = c7768aa.m10507q();
        crashDetailBean.f13539m = this.f13907c.m10495f();
        crashDetailBean.f13540n = str3;
        crashDetailBean.f13541o = zM10750i ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f13542p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f13543q = str13;
        crashDetailBean.f13544r = j10;
        crashDetailBean.f13547u = C7783ap.m10678c(str13.getBytes());
        crashDetailBean.f13500A = str;
        crashDetailBean.f13501B = str2;
        crashDetailBean.f13511L = this.f13907c.m10509s();
        crashDetailBean.f13534h = this.f13907c.m10506p();
        crashDetailBean.f13535i = this.f13907c.m10482A();
        crashDetailBean.f13548v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String strM10803a = C7799be.m10803a(dumpFilePath, str8);
        if (!C7783ap.m10676b(strM10803a)) {
            crashDetailBean.f13525Z = strM10803a;
        }
        crashDetailBean.f13527aa = C7799be.m10807b(dumpFilePath);
        crashDetailBean.f13549w = C7799be.m10802a(str9, C7787at.f13801f, C7787at.f13806k, C7787at.f13811p);
        crashDetailBean.f13550x = C7799be.m10802a(str10, C7787at.f13801f, null, true);
        crashDetailBean.f13513N = str7;
        crashDetailBean.f13514O = str6;
        crashDetailBean.f13515P = str11;
        crashDetailBean.f13505F = this.f13907c.m10502k();
        crashDetailBean.f13506G = this.f13907c.m10501j();
        crashDetailBean.f13507H = this.f13907c.m10503l();
        crashDetailBean.f13508I = C7769ab.m10519b(this.f13905a);
        crashDetailBean.f13509J = C7769ab.m10526g();
        crashDetailBean.f13510K = C7769ab.m10527h();
        if (!z10) {
            crashDetailBean.f13502C = -1L;
            crashDetailBean.f13503D = -1L;
            crashDetailBean.f13504E = -1L;
            if (crashDetailBean.f13549w == null) {
                crashDetailBean.f13549w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f13516Q = -1L;
            crashDetailBean.f13520U = -1;
            crashDetailBean.f13521V = -1;
            crashDetailBean.f13522W = map;
            crashDetailBean.f13523X = this.f13907c.m10515y();
            crashDetailBean.f13552z = null;
            if (str == null) {
                crashDetailBean.f13500A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f13551y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.f13502C = C7769ab.m10529j();
        crashDetailBean.f13503D = C7769ab.m10525f();
        crashDetailBean.f13504E = C7769ab.m10531l();
        crashDetailBean.f13551y = C7782ao.m10632a();
        C7768aa c7768aa2 = this.f13907c;
        crashDetailBean.f13516Q = c7768aa2.f13610a;
        crashDetailBean.f13517R = c7768aa2.m10486a();
        crashDetailBean.f13552z = C7783ap.m10659a(this.f13907c.f13601Q, C7787at.f13803h);
        int iIndexOf2 = crashDetailBean.f13543q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i10 = iIndexOf2 + 6) < crashDetailBean.f13543q.length()) {
            String str14 = crashDetailBean.f13543q;
            String strSubstring = str14.substring(i10, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f13552z.containsKey(crashDetailBean.f13501B) && (iIndexOf = (str12 = crashDetailBean.f13552z.get(crashDetailBean.f13501B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f13552z.put(crashDetailBean.f13501B, strSubstring2);
                crashDetailBean.f13543q = crashDetailBean.f13543q.substring(0, i10);
                crashDetailBean.f13543q += strSubstring2;
            }
        }
        if (str == null) {
            crashDetailBean.f13500A = this.f13907c.f13637d;
        }
        crashDetailBean.f13520U = this.f13907c.m10516z();
        C7768aa c7768aa3 = this.f13907c;
        crashDetailBean.f13521V = c7768aa3.f13657x;
        crashDetailBean.f13522W = c7768aa3.m10510t();
        crashDetailBean.f13523X = this.f13907c.m10515y();
        return crashDetailBean;
    }
}
