package p176m2;

import android.text.TextUtils;
import p154k2.AbstractC8263a;

/* renamed from: m2.f */
/* loaded from: classes4.dex */
public class C8957f {
    /* renamed from: a */
    public static void m14280a(String str, int i9, String str2) {
        m14282c(null, str, i9, str2);
    }

    /* renamed from: b */
    public static void m14281b(String str, int i9, String str2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        m14283d(null, str, i9, str2, strArr, strArr2, strArr3, strArr4);
    }

    /* renamed from: c */
    public static void m14282c(String str, String str2, int i9, String str3) {
        m14283d(str, str2, i9, str3, null, null, null, null);
    }

    /* renamed from: d */
    public static void m14283d(String str, String str2, int i9, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        String[] strArrSplit;
        try {
            if (AbstractC8263a.m13312e()) {
                String str4 = TextUtils.isEmpty(str) ? "UMLog" : "UMLog_" + str;
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || (strArrSplit = str2.split(str3)) == null || strArrSplit.length < 2) {
                    return;
                }
                if (strArr != null && strArr.length > 0 && strArr2 != null && strArr2.length > 0) {
                    for (int i10 = 0; i10 < strArr.length && i10 < strArr2.length; i10++) {
                        strArrSplit[0] = strArrSplit[0].replace(strArr[i10], strArr2[i10]);
                    }
                }
                if (strArr3 != null && strArr3.length > 0 && strArr4 != null && strArr4.length > 0) {
                    for (int i11 = 0; i11 < strArr3.length && i11 < strArr4.length; i11++) {
                        strArrSplit[1] = strArrSplit[1].replace(strArr3[i11], strArr4[i11]);
                    }
                }
                InterfaceC8956e interfaceC8956eM14284e = m14284e(i9);
                interfaceC8956eM14284e.mo14278a(str4, "┌───────────────────问题─────────────────────────────────────────────────────────────────────────────");
                interfaceC8956eM14284e.mo14278a(str4, "│     " + strArrSplit[0]);
                interfaceC8956eM14284e.mo14278a(str4, "├───────────────────解决方案─────────────────────────────────────────────────────────────────────────────");
                interfaceC8956eM14284e.mo14278a(str4, "│     " + strArrSplit[1]);
                interfaceC8956eM14284e.mo14278a(str4, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static InterfaceC8956e m14284e(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? new C8952a() : new C8952a() : new C8954c() : new C8960i() : new C8953b();
    }

    /* renamed from: f */
    public static void m14285f(int i9, String... strArr) {
        try {
            if (AbstractC8263a.m13312e()) {
                int length = strArr.length;
                InterfaceC8956e interfaceC8956eM14284e = m14284e(i9);
                if (length == 1) {
                    interfaceC8956eM14284e.mo14278a("UMLog", strArr[0]);
                    return;
                }
                if (length >= 2) {
                    interfaceC8956eM14284e.mo14278a("UMLog", "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    for (int i10 = 0; i10 < length; i10++) {
                        interfaceC8956eM14284e.mo14278a("UMLog", "│     " + strArr[i10]);
                        if (i10 != length - 1) {
                            interfaceC8956eM14284e.mo14278a("UMLog", "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                        }
                    }
                    interfaceC8956eM14284e.mo14278a("UMLog", "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static void m14286g(String str, int i9, String str2) {
        m14288i(null, str, i9, str2);
    }

    /* renamed from: h */
    public static void m14287h(String str, int i9, String str2, String[] strArr, String[] strArr2) {
        m14289j(null, str, i9, str2, strArr, strArr2);
    }

    /* renamed from: i */
    public static void m14288i(String str, String str2, int i9, String str3) {
        m14289j(str, str2, i9, str3, null, null);
    }

    /* renamed from: j */
    public static void m14289j(String str, String str2, int i9, String str3, String[] strArr, String[] strArr2) {
        try {
            if (AbstractC8263a.m13312e()) {
                String str4 = TextUtils.isEmpty(str) ? "UMLog" : "UMLog_" + str;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (strArr != null && strArr.length > 0 && strArr2 != null && strArr2.length > 0) {
                    for (int i10 = 0; i10 < strArr.length && i10 < strArr2.length; i10++) {
                        str2 = str2.replace(strArr[i10], strArr2[i10]);
                    }
                }
                InterfaceC8956e interfaceC8956eM14284e = m14284e(i9);
                if (TextUtils.isEmpty(str3)) {
                    interfaceC8956eM14284e.mo14278a(str4, str2);
                    return;
                }
                String[] strArrSplit = str2.split(str3);
                if (strArrSplit != null) {
                    interfaceC8956eM14284e.mo14278a(str4, "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        interfaceC8956eM14284e.mo14278a(str4, "│     " + strArrSplit[i11]);
                        if (i11 != strArrSplit.length - 1) {
                            interfaceC8956eM14284e.mo14278a(str4, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                        }
                    }
                    interfaceC8956eM14284e.mo14278a(str4, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                }
            }
        } catch (Exception unused) {
        }
    }
}
