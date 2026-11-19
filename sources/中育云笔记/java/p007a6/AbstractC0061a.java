package p007a6;

import android.os.Build;
import java.io.UnsupportedEncodingException;
import p418y5.AbstractC11912a;

/* renamed from: a6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC0061a {

    /* renamed from: a */
    public static final String f53a = "BaseKeyUtil";

    /* renamed from: a */
    public static int m110a(int i10, int i11, int i12) {
        if (i11 < i10) {
            i10 = i11;
        }
        return i12 < i10 ? i12 : i10;
    }

    /* renamed from: b */
    public static boolean m111b(int i10) {
        return i10 >= 16;
    }

    /* renamed from: c */
    public static boolean m112c(int i10, String str) {
        return str != null && str.length() >= i10;
    }

    /* renamed from: d */
    public static boolean m113d(int i10, byte[] bArr) {
        return m115f(i10) & m114e(bArr);
    }

    /* renamed from: e */
    public static boolean m114e(byte[] bArr) {
        return bArr.length >= 16;
    }

    /* renamed from: f */
    public static boolean m115f(int i10) {
        return i10 >= 16;
    }

    /* renamed from: g */
    public static byte[] m116g(String str, String str2, String str3, String str4, int i10, boolean z10) {
        return m118i(str, str2, str3, AbstractC0064d.m128b(str4), i10, z10);
    }

    /* renamed from: h */
    public static byte[] m117h(String str, String str2, String str3, byte[] bArr, int i10, int i11, boolean z10) throws UnsupportedEncodingException {
        if (!m111b(i11)) {
            AbstractC0067g.m138c(f53a, "exportLen length must be more than 128bit.");
            return new byte[0];
        }
        if (!m112c(i11, str)) {
            AbstractC0067g.m138c(f53a, "material(first) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (!m112c(i11, str2)) {
            AbstractC0067g.m138c(f53a, "material(second) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (!m112c(i11, str3)) {
            AbstractC0067g.m138c(f53a, "material(third) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        byte[] bArrM128b = AbstractC0064d.m128b(str);
        byte[] bArrM128b2 = AbstractC0064d.m128b(str2);
        byte[] bArrM128b3 = AbstractC0064d.m128b(str3);
        int iM110a = m110a(bArrM128b.length, bArrM128b2.length, bArrM128b3.length);
        if (!m113d(iM110a, bArr)) {
            throw new IllegalArgumentException("key length must be more than 128bit.");
        }
        char[] cArr = new char[iM110a];
        for (int i12 = 0; i12 < iM110a; i12++) {
            cArr[i12] = (char) ((bArrM128b[i12] ^ bArrM128b2[i12]) ^ bArrM128b3[i12]);
        }
        if (!z10) {
            AbstractC0067g.m139d(f53a, "exportRootKey: sha1");
            return AbstractC11912a.m26448c(cArr, bArr, i10, i11 * 8, false);
        }
        String str4 = f53a;
        AbstractC0067g.m139d(str4, "exportRootKey: sha256");
        if (Build.VERSION.SDK_INT >= 26) {
            return AbstractC11912a.m26448c(cArr, bArr, i10, i11 * 8, true);
        }
        AbstractC0067g.m138c(str4, "system version not high than 26");
        return new byte[0];
    }

    /* renamed from: i */
    public static byte[] m118i(String str, String str2, String str3, byte[] bArr, int i10, boolean z10) {
        return m117h(str, str2, str3, bArr, 10000, i10, z10);
    }

    /* renamed from: j */
    public static byte[] m119j(String str, String str2, String str3, byte[] bArr, boolean z10) {
        return m118i(str, str2, str3, bArr, 16, z10);
    }
}
