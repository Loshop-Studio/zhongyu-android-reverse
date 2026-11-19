package p247s9;

import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.ByteString;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p113g8.AbstractC8658b;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;

/* renamed from: s9.d */
/* loaded from: classes5.dex */
public final class C10073d {

    /* renamed from: a */
    public static final C10073d f20122a = new C10073d();

    /* renamed from: b */
    public static final String f20123b = "xn--";

    /* renamed from: c */
    public static final ByteString f20124c = ByteString.Companion.encodeUtf8("xn--");

    /* renamed from: a */
    public final int m18804a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / 700 : i10 / 2;
        int i13 = i12 + (i12 / i11);
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return i14 + ((i13 * 36) / (i13 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* renamed from: b */
    public final List m18805b(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (AbstractC8658b.m13947i(iCharAt)) {
                int i12 = i10 + 1;
                char cCharAt = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = 65536 + (((iCharAt & TXLiteAVCode.EVT_CAMERA_REMOVED) << 10) | (cCharAt & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i10++;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String m18806c(String string) {
        AbstractC9133u.m16133g(string, "string");
        int length = string.length();
        Buffer buffer = new Buffer();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM13990e0 = AbstractC8661c0.m13990e0(str, '.', i10, false, 4, null);
            if (iM13990e0 == -1) {
                iM13990e0 = length;
            }
            if (!m18807d(str, i10, iM13990e0, buffer)) {
                return null;
            }
            if (iM13990e0 >= length) {
                break;
            }
            buffer.writeByte(46);
            i10 = iM13990e0 + 1;
            string = str;
        }
        return buffer.readUtf8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final boolean m18807d(String str, int i10, int i11, Buffer buffer) {
        int i12;
        int i13;
        int i14 = 1;
        if (!AbstractC8687z.m14096D(str, i10, f20123b, 0, 4, true)) {
            buffer.writeUtf8(str, i10, i11);
            return true;
        }
        int i15 = i10 + 4;
        ArrayList arrayList = new ArrayList();
        int iM13996k0 = AbstractC8661c0.m13996k0(str, '-', i11, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        boolean z10 = false;
        if (iM13996k0 >= i15) {
            while (i15 < iM13996k0) {
                int i16 = i15 + 1;
                char cCharAt = str.charAt(i15);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i15 = i16;
            }
            i15++;
        }
        int i17 = 128;
        int iM18804a = 72;
        int i18 = 0;
        while (i15 < i11) {
            int i19 = i14;
            boolean z11 = z10;
            C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(36, Integer.MAX_VALUE), 36);
            int iM13496b = c8319dM13524s.m13496b();
            int iM13497c = c8319dM13524s.m13497c();
            int iM13498d = c8319dM13524s.m13498d();
            if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
                i12 = i18;
                int i20 = i19;
                while (i15 != i11) {
                    int i21 = i15 + 1;
                    char cCharAt2 = str.charAt(i15);
                    if ('a' <= cCharAt2 && cCharAt2 < c12) {
                        i13 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c11) {
                        i13 = cCharAt2 - 'A';
                    } else {
                        if (c10 > cCharAt2 || cCharAt2 >= ':') {
                            return z11;
                        }
                        i13 = cCharAt2 - 22;
                    }
                    int i22 = i20;
                    int i23 = i13 * i22;
                    int i24 = i12;
                    if (i24 > Integer.MAX_VALUE - i23) {
                        return z11;
                    }
                    i12 = i24 + i23;
                    int i25 = iM13496b <= iM18804a ? i19 : iM13496b >= iM18804a + 26 ? 26 : iM13496b - iM18804a;
                    if (i13 >= i25) {
                        int i26 = 36 - i25;
                        if (i22 > Integer.MAX_VALUE / i26) {
                            return z11;
                        }
                        i20 = i22 * i26;
                        if (iM13496b != iM13497c) {
                            iM13496b += iM13498d;
                            i15 = i21;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i15 = i21;
                }
                return z11;
            }
            i12 = i18;
            iM18804a = m18804a(i12 - i18, arrayList.size() + 1, i18 == 0 ? i19 : z11);
            int size = i12 / (arrayList.size() + 1);
            if (i17 > Integer.MAX_VALUE - size) {
                return z11;
            }
            i17 += size;
            int size2 = i12 % (arrayList.size() + 1);
            if (i17 > 1114111) {
                return z11;
            }
            arrayList.add(size2, Integer.valueOf(i17));
            i18 = size2 + 1;
            z10 = z11;
            i14 = i19;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        boolean z12 = i14;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            buffer.writeUtf8CodePoint(((Number) it.next()).intValue());
        }
        return z12;
    }

    /* renamed from: e */
    public final String m18808e(String string) {
        AbstractC9133u.m16133g(string, "string");
        int length = string.length();
        Buffer buffer = new Buffer();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM13990e0 = AbstractC8661c0.m13990e0(str, '.', i10, false, 4, null);
            if (iM13990e0 == -1) {
                iM13990e0 = length;
            }
            if (!m18809f(str, i10, iM13990e0, buffer)) {
                return null;
            }
            if (iM13990e0 >= length) {
                break;
            }
            buffer.writeByte(46);
            i10 = iM13990e0 + 1;
            string = str;
        }
        return buffer.readUtf8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final boolean m18809f(String str, int i10, int i11, Buffer buffer) {
        int i12;
        int i13;
        int i14;
        int i15 = 1;
        if (!m18811h(str, i10, i11)) {
            buffer.writeUtf8(str, i10, i11);
            return true;
        }
        buffer.write(f20124c);
        List listM18805b = m18805b(str, i10, i11);
        Iterator it = listM18805b.iterator();
        int i16 = 0;
        while (true) {
            i12 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue < 128) {
                buffer.writeByte(iIntValue);
                i16++;
            }
        }
        if (i16 > 0) {
            buffer.writeByte(45);
        }
        int iM18804a = 72;
        int i17 = 0;
        int i18 = i16;
        while (i18 < listM18805b.size()) {
            Iterator it2 = listM18805b.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i12) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i12) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i19 = (iIntValue4 - i12) * (i18 + 1);
            if (i17 > Integer.MAX_VALUE - i19) {
                return false;
            }
            int i20 = i17 + i19;
            Iterator it3 = listM18805b.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = ((Number) it3.next()).intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i20 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i20++;
                } else if (iIntValue5 == iIntValue4) {
                    C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(36, Integer.MAX_VALUE), 36);
                    int iM13496b = c8319dM13524s.m13496b();
                    int iM13497c = c8319dM13524s.m13497c();
                    int iM13498d = c8319dM13524s.m13498d();
                    if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
                        i14 = i20;
                        while (true) {
                            if (iM13496b <= iM18804a) {
                                i13 = i15;
                            } else {
                                i13 = i15;
                                i15 = iM13496b >= iM18804a + 26 ? 26 : iM13496b - iM18804a;
                            }
                            if (i14 < i15) {
                                break;
                            }
                            int i21 = i14 - i15;
                            int i22 = 36 - i15;
                            buffer.writeByte(m18810g(i15 + (i21 % i22)));
                            i14 = i21 / i22;
                            if (iM13496b == iM13497c) {
                                break;
                            }
                            iM13496b += iM13498d;
                            i15 = i13;
                        }
                    } else {
                        i13 = i15;
                        i14 = i20;
                    }
                    buffer.writeByte(m18810g(i14));
                    int i23 = i18 + 1;
                    iM18804a = m18804a(i20, i23, i18 == i16 ? i13 : false);
                    i18 = i23;
                    i20 = 0;
                    i15 = i13;
                }
            }
            i17 = i20 + 1;
            i12 = iIntValue4 + 1;
        }
        return i15;
    }

    /* renamed from: g */
    public final int m18810g(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    /* renamed from: h */
    public final boolean m18811h(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }
}
