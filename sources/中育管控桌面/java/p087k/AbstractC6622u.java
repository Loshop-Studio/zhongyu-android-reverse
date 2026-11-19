package p087k;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.Path;

/* renamed from: k.u */
/* loaded from: classes3.dex */
public abstract class AbstractC6622u {
    /* renamed from: a */
    public static final C6621t m7577a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new C6621t(m7579c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    /* renamed from: b */
    public static /* synthetic */ C6621t m7578b(String str, String str2, String str3, String str4, String str5, String str6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        if ((i6 & 4) != 0) {
            str3 = null;
        }
        if ((i6 & 8) != 0) {
            str4 = null;
        }
        if ((i6 & 16) != 0) {
            str5 = null;
        }
        if ((i6 & 32) != 0) {
            str6 = Path.DIRECTORY_SEPARATOR;
        }
        return m7577a(str, str2, str3, str4, str5, str6);
    }

    /* renamed from: c */
    public static final String m7579c(String str, String str2, String str3, String str4, String str5) {
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
    public static final String m7580d(C6621t c6621t) {
        List listM7582f = m7582f(c6621t);
        if (listM7582f.isEmpty()) {
            return null;
        }
        String strM7574b = c6621t.m7574b();
        Intrinsics.checkNotNull(strM7574b);
        return CollectionsKt.joinToString$default(listM7582f, c6621t.m7576d(), StringsKt.startsWith$default(strM7574b, c6621t.m7576d(), false, 2, (Object) null) ? c6621t.m7576d() : "", null, 0, null, null, 60, null);
    }

    /* renamed from: e */
    public static final int m7581e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    /* renamed from: f */
    public static final List m7582f(C6621t c6621t) {
        String strM7574b = c6621t.m7574b();
        if (strM7574b == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf$default = -1;
        while (iIndexOf$default < strM7574b.length()) {
            int i6 = iIndexOf$default + 1;
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) strM7574b, '/', i6, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = strM7574b.length();
            }
            String strSubstring = strM7574b.substring(i6, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final C6621t m7583g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        boolean z6 = true;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i8 == -1 && i6 == -1) {
                            i8 = i11 + 1;
                        }
                    } else if (z6 && i8 == -1 && i6 == -1) {
                        int i12 = i11 + 2;
                        if (i12 < str2.length() && str2.charAt(i11 + 1) == '/' && str2.charAt(i12) == '/') {
                            i9 = i11 + 3;
                            z6 = false;
                            i10 = i11;
                            i11 = i12;
                        } else if (Intrinsics.areEqual(str, str2)) {
                            i7 = i11 + 1;
                            i10 = i11;
                            i11 = i7;
                            i9 = i11;
                        }
                    }
                } else if (i7 == -1 && i8 == -1 && i6 == -1) {
                    i7 = i9 == -1 ? 0 : i11;
                    z6 = false;
                }
            } else if (i6 == -1) {
                i6 = i11 + 1;
            }
            i11++;
        }
        int iMin = Math.min(i6 == -1 ? Integer.MAX_VALUE : i6 - 1, str.length());
        int iMin2 = Math.min(i8 == -1 ? Integer.MAX_VALUE : i8 - 1, iMin);
        if (i9 != -1) {
            strSubstring2 = str.substring(0, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            strSubstring = str.substring(i9, Math.min(i7 != -1 ? i7 : Integer.MAX_VALUE, iMin2));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i7 != -1) {
            strSubstring3 = str.substring(i7, iMin2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i8 != -1) {
            strSubstring4 = str.substring(i8, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i6 != -1) {
            strSubstring5 = str.substring(i6, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(m7581e(strSubstring2), Math.max(m7581e(strSubstring), Math.max(m7581e(strSubstring3), Math.max(m7581e(strSubstring4), m7581e(strSubstring5))))) - 2)];
        return new C6621t(str, str3, strSubstring2 != null ? m7584h(strSubstring2, bArr) : null, strSubstring != null ? m7584h(strSubstring, bArr) : null, strSubstring3 != null ? m7584h(strSubstring3, bArr) : null, strSubstring4 != null ? m7584h(strSubstring4, bArr) : null, strSubstring5 != null ? m7584h(strSubstring5, bArr) : null);
    }

    /* renamed from: h */
    public static final String m7584h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i6 = 0;
        int iMax = Math.max(0, length - 2);
        int i7 = 0;
        while (true) {
            if (i6 < iMax) {
                bArr2 = bArr;
                if (str.charAt(i6) == '%') {
                    int i8 = i6 + 3;
                    try {
                        String strSubstring = str.substring(i6 + 1, i8);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        bArr2[i7] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
                        i7++;
                        bArr = bArr2;
                        i6 = i8;
                    } catch (NumberFormatException unused) {
                    }
                }
            } else {
                if (i6 == i7) {
                    return str;
                }
                if (i6 >= length) {
                    return StringsKt.decodeToString$default(bArr, 0, i7, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i7] = (byte) str.charAt(i6);
            i7++;
            i6++;
            bArr = bArr2;
        }
    }

    /* renamed from: i */
    public static final C6621t m7585i(String str, String str2) {
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
        return m7583g(str, str3, str4);
    }

    /* renamed from: j */
    public static /* synthetic */ C6621t m7586j(String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str2 = Path.DIRECTORY_SEPARATOR;
        }
        return m7585i(str, str2);
    }
}
