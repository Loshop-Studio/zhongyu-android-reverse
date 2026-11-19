package coil3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.target.GenericViewTarget;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.C5780c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.C5867b0;
import okio.Path;
import p129o2.C6268a;
import p154s.C6532f;
import p154s.C6537k;
import p154s.C6538l;
import p171u.InterfaceC6608a;
import p204y1.AbstractC6768a;

/* renamed from: coil3.o */
/* loaded from: classes2.dex */
public abstract class AbstractC3330o {

    /* renamed from: a */
    public static final C6268a f2035a = new C6268a(Boolean.TRUE, 6);

    /* renamed from: a */
    public static C3351x m2263a(String str) {
        String str2 = Path.DIRECTORY_SEPARATOR;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new C3351x(sb.toString(), str2, "file", null, str);
    }

    /* renamed from: b */
    public static final Drawable m2264b(InterfaceC3305k interfaceC3305k, Resources resources) {
        return interfaceC3305k instanceof C3294e ? ((C3294e) interfaceC3305k).f1976a : interfaceC3305k instanceof C3241a ? new BitmapDrawable(resources, ((C3241a) interfaceC3305k).f1813a) : new C3306l(interfaceC3305k);
    }

    /* renamed from: c */
    public static final InterfaceC3305k m2265c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new C3241a(((BitmapDrawable) drawable).getBitmap()) : new C3294e(drawable);
    }

    /* renamed from: d */
    public static final C6537k m2266d(C6532f c6532f, C5867b0 c5867b0) {
        InterfaceC6608a interfaceC6608a = c6532f.f10863c;
        if (!(interfaceC6608a instanceof GenericViewTarget)) {
            return new C6537k(c5867b0);
        }
        ((GenericViewTarget) interfaceC6608a).getClass();
        AbstractC6768a.m6449n(null);
        throw null;
    }

    /* renamed from: e */
    public static final Object m2267e(C6532f c6532f, C6268a c6268a) {
        Object obj = c6532f.f10878r.f1996a.get(c6268a);
        if (obj != null) {
            return obj;
        }
        Object obj2 = c6532f.f10880t.f10849n.f1996a.get(c6268a);
        return obj2 == null ? c6268a.f10022b : obj2;
    }

    /* renamed from: f */
    public static final Object m2268f(C6538l c6538l, C6268a c6268a) {
        Object obj = c6538l.f10903j.f1996a.get(c6268a);
        return obj == null ? c6268a.f10022b : obj;
    }

    /* renamed from: g */
    public static final String m2269g(C3351x c3351x) {
        List listM2270h = m2270h(c3351x);
        String str = c3351x.f2087b;
        if (listM2270h.isEmpty()) {
            return null;
        }
        String str2 = c3351x.f2090e;
        AbstractC5830k.m5327d(str2);
        if (!AbstractC5862w.m5409C(str2, str, false)) {
            str = "";
        }
        return AbstractC5805t.m5234n0(listM2270h, c3351x.f2087b, str, null, null, 60);
    }

    /* renamed from: h */
    public static final List m2270h(C3351x c3351x) {
        String str = c3351x.f2090e;
        if (str == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i8 = i + 1;
            int iM5379M = AbstractC5855p.m5379M(str, '/', i8, 4);
            if (iM5379M == -1) {
                iM5379M = str.length();
            }
            String strSubstring = str.substring(i8, iM5379M);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iM5379M;
        }
        return arrayList;
    }

    /* renamed from: i */
    public static final String m2271i(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i8) {
                    return str;
                }
                if (i >= length) {
                    C5780c c5780c = AbstractC5786f.Companion;
                    int length2 = bArr.length;
                    c5780c.getClass();
                    C5780c.m5142a(0, i8, length2);
                    return new String(bArr, 0, i8, AbstractC5840a.f9235a);
                }
            } else if (str.charAt(i) == '%') {
                int i9 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i9);
                    AbstractC5830k.m5329f(strSubstring, "substring(...)");
                    AbstractC6768a.m6440d(16);
                    bArr[i8] = (byte) Integer.parseInt(strSubstring, 16);
                    i8++;
                    i = i9;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i8] = (byte) str.charAt(i);
            i8++;
            i++;
        }
    }

    /* renamed from: j */
    public static Bitmap m2272j(InterfaceC3305k interfaceC3305k) {
        int width = interfaceC3305k.getWidth();
        int height = interfaceC3305k.getHeight();
        boolean z8 = interfaceC3305k instanceof C3241a;
        Bitmap.Config config = z8 ? ((C3241a) interfaceC3305k).f1813a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z8) {
            Bitmap bitmap = ((C3241a) interfaceC3305k).f1813a;
            if (bitmap.getWidth() == width && bitmap.getHeight() == height && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        interfaceC3305k.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* renamed from: k */
    public static C3351x m2273k(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = Path.DIRECTORY_SEPARATOR;
        String strM5407A = !AbstractC5830k.m5325b(str2, "/") ? AbstractC5862w.m5407A(str, str2, "/") : str;
        int i = 0;
        boolean z8 = true;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (i < strM5407A.length()) {
            char cCharAt = strM5407A.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i10 == -1 && i8 == -1) {
                            i10 = i + 1;
                        }
                    } else if (z8 && i10 == -1 && i8 == -1) {
                        int i13 = i + 2;
                        if (i13 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i13) == '/') {
                            i11 = i + 3;
                            z8 = false;
                            i12 = i;
                            i = i13;
                        } else if (strM5407A.equals(str)) {
                            i9 = i + 1;
                            i12 = i;
                            i = i9;
                            i11 = i;
                        }
                    }
                } else if (i9 == -1 && i10 == -1 && i8 == -1) {
                    i9 = i11 == -1 ? 0 : i;
                    z8 = false;
                }
            } else if (i8 == -1) {
                i8 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i8 == -1 ? Integer.MAX_VALUE : i8 - 1, strM5407A.length());
        int iMin2 = Math.min(i10 == -1 ? Integer.MAX_VALUE : i10 - 1, iMin);
        if (i11 != -1) {
            strSubstring2 = strM5407A.substring(0, i12);
            AbstractC5830k.m5329f(strSubstring2, "substring(...)");
            strSubstring = strM5407A.substring(i11, Math.min(i9 != -1 ? i9 : Integer.MAX_VALUE, iMin2));
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i9 != -1) {
            strSubstring3 = strM5407A.substring(i9, iMin2);
            AbstractC5830k.m5329f(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i10 != -1) {
            strSubstring4 = strM5407A.substring(i10, iMin);
            AbstractC5830k.m5329f(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i8 != -1) {
            strSubstring5 = strM5407A.substring(i8, strM5407A.length());
            AbstractC5830k.m5329f(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strM2271i = strSubstring2 != null ? m2271i(strSubstring2, bArr) : null;
        String strM2271i2 = strSubstring != null ? m2271i(strSubstring, bArr) : null;
        String strM2271i3 = strSubstring3 != null ? m2271i(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            m2271i(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            m2271i(strSubstring5, bArr);
        }
        return new C3351x(strM5407A, str2, strM2271i, strM2271i2, strM2271i3);
    }
}
