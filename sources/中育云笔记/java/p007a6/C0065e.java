package p007a6;

import android.os.Build;

/* renamed from: a6.e */
/* loaded from: classes5.dex */
public class C0065e {

    /* renamed from: b */
    public static final String f56b = "RootKeyUtil";

    /* renamed from: a */
    public byte[] f57a = null;

    /* renamed from: d */
    public static C0065e m129d(String str, String str2, String str3, String str4) {
        C0065e c0065e = new C0065e();
        c0065e.m130a(str, str2, str3, str4);
        return c0065e;
    }

    /* renamed from: a */
    public final void m130a(String str, String str2, String str3, String str4) {
        m131b(str, str2, str3, AbstractC0064d.m128b(str4));
    }

    /* renamed from: b */
    public final void m131b(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC0067g.m139d(f56b, "initRootKey: sha1");
            this.f57a = AbstractC0061a.m119j(str, str2, str3, bArr, false);
        } else {
            AbstractC0067g.m139d(f56b, "initRootKey: sha256");
            this.f57a = AbstractC0061a.m119j(str, str2, str3, bArr, true);
        }
    }

    /* renamed from: c */
    public byte[] m132c() {
        return (byte[]) this.f57a.clone();
    }
}
