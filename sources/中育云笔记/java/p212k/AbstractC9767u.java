package p212k;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Path;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p310qd.AbstractC10788a;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* renamed from: k.u */
/* loaded from: classes3.dex */
public abstract class AbstractC9767u {
    /* renamed from: a */
    public static final C9766t m19687a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new C9766t(m19689c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    /* renamed from: b */
    public static /* synthetic */ C9766t m19688b(String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
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
        return m19687a(str, str2, str3, str4, str5, str6);
    }

    /* renamed from: c */
    public static final String m19689c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
            sb2.append(':');
        }
        if (str2 != null) {
            sb2.append("//");
            sb2.append(str2);
        }
        if (str3 != null) {
            sb2.append(str3);
        }
        if (str4 != null) {
            sb2.append('?');
            sb2.append(str4);
        }
        if (str5 != null) {
            sb2.append('#');
            sb2.append(str5);
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static final String m19690d(C9766t c9766t) {
        List listM19692f = m19692f(c9766t);
        if (listM19692f.isEmpty()) {
            return null;
        }
        String strM19684b = c9766t.m19684b();
        AbstractC9979u.m20291d(strM19684b);
        return AbstractC10947g0.m23954w0(listM19692f, c9766t.m19686d(), AbstractC10819z.m23242O(strM19684b, c9766t.m19686d(), false, 2, null) ? c9766t.m19686d() : "", null, 0, null, null, 60, null);
    }

    /* renamed from: e */
    public static final int m19691e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    /* renamed from: f */
    public static final List m19692f(C9766t c9766t) {
        String strM19684b = c9766t.m19684b();
        if (strM19684b == null) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        int iM23128e0 = -1;
        while (iM23128e0 < strM19684b.length()) {
            int i10 = iM23128e0 + 1;
            iM23128e0 = AbstractC10793c0.m23128e0(strM19684b, '/', i10, false, 4, null);
            if (iM23128e0 == -1) {
                iM23128e0 = strM19684b.length();
            }
            String strSubstring = strM19684b.substring(i10, iM23128e0);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final C9766t m19693g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        boolean z10 = true;
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
                    } else if (z10 && i12 == -1 && i10 == -1) {
                        int i16 = i15 + 2;
                        if (i16 < str2.length() && str2.charAt(i15 + 1) == '/' && str2.charAt(i16) == '/') {
                            i13 = i15 + 3;
                            z10 = false;
                            i14 = i15;
                            i15 = i16;
                        } else if (AbstractC9979u.m20289b(str, str2)) {
                            i11 = i15 + 1;
                            i14 = i15;
                            i15 = i11;
                            i13 = i15;
                        }
                    }
                } else if (i11 == -1 && i12 == -1 && i10 == -1) {
                    i11 = i13 == -1 ? 0 : i15;
                    z10 = false;
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
            AbstractC9979u.m20293f(strSubstring2, "substring(...)");
            strSubstring = str.substring(i13, Math.min(i11 != -1 ? i11 : Integer.MAX_VALUE, iMin2));
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i11 != -1) {
            strSubstring3 = str.substring(i11, iMin2);
            AbstractC9979u.m20293f(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i12 != -1) {
            strSubstring4 = str.substring(i12, iMin);
            AbstractC9979u.m20293f(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i10 != -1) {
            strSubstring5 = str.substring(i10, str.length());
            AbstractC9979u.m20293f(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(m19691e(strSubstring2), Math.max(m19691e(strSubstring), Math.max(m19691e(strSubstring3), Math.max(m19691e(strSubstring4), m19691e(strSubstring5))))) - 2)];
        return new C9766t(str, str3, strSubstring2 != null ? m19694h(strSubstring2, bArr) : null, strSubstring != null ? m19694h(strSubstring, bArr) : null, strSubstring3 != null ? m19694h(strSubstring3, bArr) : null, strSubstring4 != null ? m19694h(strSubstring4, bArr) : null, strSubstring5 != null ? m19694h(strSubstring5, bArr) : null);
    }

    /* renamed from: h */
    public static final String m19694h(String str, byte[] bArr) {
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
                        AbstractC9979u.m20293f(strSubstring, "substring(...)");
                        bArr2[i11] = (byte) Integer.parseInt(strSubstring, AbstractC10788a.m23073a(16));
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
                    return AbstractC10819z.m23248z(bArr, 0, i11, false, 5, null);
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
    public static final C9766t m19695i(String str, String str2) {
        String str3;
        String str4;
        if (AbstractC9979u.m20289b(str2, MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            str = AbstractC10819z.m23238K(str3, str4, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 4, null);
        }
        return m19693g(str, str3, str4);
    }

    /* renamed from: j */
    public static /* synthetic */ C9766t m19696j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = Path.DIRECTORY_SEPARATOR;
        }
        return m19695i(str, str2);
    }
}
