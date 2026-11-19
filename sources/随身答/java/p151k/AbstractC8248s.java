package p151k;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.Path;

/* renamed from: k.s */
/* loaded from: classes3.dex */
public abstract class AbstractC8248s {
    /* renamed from: a */
    public static final C8247r m13279a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new C8247r(m13281c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    /* renamed from: b */
    public static /* synthetic */ C8247r m13280b(String str, String str2, String str3, String str4, String str5, String str6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        if ((i9 & 4) != 0) {
            str3 = null;
        }
        if ((i9 & 8) != 0) {
            str4 = null;
        }
        if ((i9 & 16) != 0) {
            str5 = null;
        }
        if ((i9 & 32) != 0) {
            str6 = Path.DIRECTORY_SEPARATOR;
        }
        return m13279a(str, str2, str3, str4, str5, str6);
    }

    /* renamed from: c */
    public static final String m13281c(String str, String str2, String str3, String str4, String str5) {
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
    public static final String m13282d(C8247r c8247r) {
        List listM13284f = m13284f(c8247r);
        if (listM13284f.isEmpty()) {
            return null;
        }
        String strM13276b = c8247r.m13276b();
        Intrinsics.checkNotNull(strM13276b);
        return CollectionsKt.joinToString$default(listM13284f, c8247r.m13278d(), StringsKt.startsWith$default(strM13276b, c8247r.m13278d(), false, 2, (Object) null) ? c8247r.m13278d() : "", null, 0, null, null, 60, null);
    }

    /* renamed from: e */
    public static final int m13283e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    /* renamed from: f */
    public static final List m13284f(C8247r c8247r) {
        String strM13276b = c8247r.m13276b();
        if (strM13276b == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf$default = -1;
        while (iIndexOf$default < strM13276b.length()) {
            int i9 = iIndexOf$default + 1;
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) strM13276b, '/', i9, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = strM13276b.length();
            }
            String strSubstring = strM13276b.substring(i9, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final C8247r m13285g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        boolean z9 = true;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        while (i14 < str.length()) {
            char cCharAt = str.charAt(i14);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i11 == -1 && i9 == -1) {
                            i11 = i14 + 1;
                        }
                    } else if (z9 && i11 == -1 && i9 == -1) {
                        int i15 = i14 + 2;
                        if (i15 < str2.length() && str2.charAt(i14 + 1) == '/' && str2.charAt(i15) == '/') {
                            i12 = i14 + 3;
                            z9 = false;
                            i13 = i14;
                            i14 = i15;
                        } else if (Intrinsics.areEqual(str, str2)) {
                            i10 = i14 + 1;
                            i13 = i14;
                            i14 = i10;
                            i12 = i14;
                        }
                    }
                } else if (i10 == -1 && i11 == -1 && i9 == -1) {
                    i10 = i12 == -1 ? 0 : i14;
                    z9 = false;
                }
            } else if (i9 == -1) {
                i9 = i14 + 1;
            }
            i14++;
        }
        int iMin = Math.min(i9 == -1 ? Integer.MAX_VALUE : i9 - 1, str.length());
        int iMin2 = Math.min(i11 == -1 ? Integer.MAX_VALUE : i11 - 1, iMin);
        if (i12 != -1) {
            strSubstring2 = str.substring(0, i13);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            strSubstring = str.substring(i12, Math.min(i10 != -1 ? i10 : Integer.MAX_VALUE, iMin2));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i10 != -1) {
            strSubstring3 = str.substring(i10, iMin2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i11 != -1) {
            strSubstring4 = str.substring(i11, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i9 != -1) {
            strSubstring5 = str.substring(i9, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(m13283e(strSubstring2), Math.max(m13283e(strSubstring), Math.max(m13283e(strSubstring3), Math.max(m13283e(strSubstring4), m13283e(strSubstring5))))) - 2)];
        return new C8247r(str, str3, strSubstring2 != null ? m13286h(strSubstring2, bArr) : null, strSubstring != null ? m13286h(strSubstring, bArr) : null, strSubstring3 != null ? m13286h(strSubstring3, bArr) : null, strSubstring4 != null ? m13286h(strSubstring4, bArr) : null, strSubstring5 != null ? m13286h(strSubstring5, bArr) : null);
    }

    /* renamed from: h */
    public static final String m13286h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i9 = 0;
        int iMax = Math.max(0, length - 2);
        int i10 = 0;
        while (true) {
            if (i9 < iMax) {
                bArr2 = bArr;
                if (str.charAt(i9) == '%') {
                    int i11 = i9 + 3;
                    try {
                        String strSubstring = str.substring(i9 + 1, i11);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        bArr2[i10] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
                        i10++;
                        bArr = bArr2;
                        i9 = i11;
                    } catch (NumberFormatException unused) {
                    }
                }
            } else {
                if (i9 == i10) {
                    return str;
                }
                if (i9 >= length) {
                    return StringsKt.decodeToString$default(bArr, 0, i10, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i10] = (byte) str.charAt(i9);
            i10++;
            i9++;
            bArr = bArr2;
        }
    }

    /* renamed from: i */
    public static final C8247r m13287i(String str, String str2) {
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
        return m13285g(str, str3, str4);
    }

    /* renamed from: j */
    public static /* synthetic */ C8247r m13288j(String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str2 = Path.DIRECTORY_SEPARATOR;
        }
        return m13287i(str, str2);
    }
}
