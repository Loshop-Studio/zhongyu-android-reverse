package p137k;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.Path;

/* renamed from: k.u */
/* loaded from: classes3.dex */
public abstract class AbstractC7849u {
    /* renamed from: a */
    public static final C7848t m13311a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new C7848t(m13313c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    /* renamed from: b */
    public static /* synthetic */ C7848t m13312b(String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        if ((i10 & 32) != 0) {
            str6 = Path.DIRECTORY_SEPARATOR;
        }
        return m13311a(str, str2, str3, str4, str5, str6);
    }

    /* renamed from: c */
    public static final String m13313c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(':');
        }
        if (str2 != null) {
            sb.append("//");
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static final String m13314d(C7848t c7848t) {
        List listM13316f = m13316f(c7848t);
        if (listM13316f.isEmpty()) {
            return null;
        }
        String strM13308b = c7848t.m13308b();
        Intrinsics.checkNotNull(strM13308b);
        return CollectionsKt.joinToString$default(listM13316f, c7848t.m13310d(), StringsKt.startsWith$default(strM13308b, c7848t.m13310d(), false, 2, (Object) null) ? c7848t.m13310d() : "", null, 0, null, null, 60, null);
    }

    /* renamed from: e */
    public static final int m13315e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    /* renamed from: f */
    public static final List m13316f(C7848t c7848t) {
        String strM13308b = c7848t.m13308b();
        if (strM13308b == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf$default = -1;
        while (iIndexOf$default < strM13308b.length()) {
            int i10 = iIndexOf$default + 1;
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) strM13308b, '/', i10, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = strM13308b.length();
            }
            String strSubstring = strM13308b.substring(i10, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final C7848t m13317g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        boolean z9 = true;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        while (i15 < str.length()) {
            char cCharAt = str.charAt(i15);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i12 == -1 && i10 == -1) {
                            i12 = i15 + 1;
                        }
                    } else if (z9 && i12 == -1 && i10 == -1) {
                        int i16 = i15 + 2;
                        if (i16 < str2.length() && str2.charAt(i15 + 1) == '/' && str2.charAt(i16) == '/') {
                            i13 = i15 + 3;
                            z9 = false;
                            i14 = i15;
                            i15 = i16;
                        } else if (Intrinsics.areEqual(str, str2)) {
                            i11 = i15 + 1;
                            i14 = i15;
                            i15 = i11;
                            i13 = i15;
                        }
                    }
                } else if (i11 == -1 && i12 == -1 && i10 == -1) {
                    i11 = i13 == -1 ? 0 : i15;
                    z9 = false;
                }
            } else if (i10 == -1) {
                i10 = i15 + 1;
            }
            i15++;
        }
        int iMin = Math.min(i10 == -1 ? Integer.MAX_VALUE : i10 - 1, str.length());
        int iMin2 = Math.min(i12 == -1 ? Integer.MAX_VALUE : i12 - 1, iMin);
        if (i13 != -1) {
            strSubstring2 = str.substring(0, i14);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            strSubstring = str.substring(i13, Math.min(i11 != -1 ? i11 : Integer.MAX_VALUE, iMin2));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i11 != -1) {
            strSubstring3 = str.substring(i11, iMin2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i12 != -1) {
            strSubstring4 = str.substring(i12, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i10 != -1) {
            strSubstring5 = str.substring(i10, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(m13315e(strSubstring2), Math.max(m13315e(strSubstring), Math.max(m13315e(strSubstring3), Math.max(m13315e(strSubstring4), m13315e(strSubstring5))))) - 2)];
        return new C7848t(str, str3, strSubstring2 != null ? m13318h(strSubstring2, bArr) : null, strSubstring != null ? m13318h(strSubstring, bArr) : null, strSubstring3 != null ? m13318h(strSubstring3, bArr) : null, strSubstring4 != null ? m13318h(strSubstring4, bArr) : null, strSubstring5 != null ? m13318h(strSubstring5, bArr) : null);
    }

    /* renamed from: h */
    public static final String m13318h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i10 = 0;
        int iMax = Math.max(0, length - 2);
        int i11 = 0;
        while (true) {
            if (i10 < iMax) {
                bArr2 = bArr;
                if (str.charAt(i10) == '%') {
                    int i12 = i10 + 3;
                    try {
                        String strSubstring = str.substring(i10 + 1, i12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        bArr2[i11] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
                        i11++;
                        bArr = bArr2;
                        i10 = i12;
                    } catch (NumberFormatException unused) {
                    }
                }
            } else {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    return StringsKt.decodeToString$default(bArr, 0, i11, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
            bArr = bArr2;
        }
    }

    /* renamed from: i */
    public static final C7848t m13319i(String str, String str2) {
        String str3;
        String str4;
        if (Intrinsics.areEqual(str2, "/")) {
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            str = StringsKt.replace$default(str3, str4, "/", false, 4, (Object) null);
        }
        return m13317g(str, str3, str4);
    }

    /* renamed from: j */
    public static /* synthetic */ C7848t m13320j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = Path.DIRECTORY_SEPARATOR;
        }
        return m13319i(str, str2);
    }
}
