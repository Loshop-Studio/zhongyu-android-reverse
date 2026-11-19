package okhttp3;

import com.zykj.mistake.feature.notebook.detail.C4916z4;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.Regex;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.r */
/* loaded from: classes4.dex */
public final class C6330r {

    /* renamed from: k */
    public static final char[] f10264k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f10265a;

    /* renamed from: b */
    public final String f10266b;

    /* renamed from: c */
    public final String f10267c;

    /* renamed from: d */
    public final String f10268d;

    /* renamed from: e */
    public final int f10269e;

    /* renamed from: f */
    public final ArrayList f10270f;

    /* renamed from: g */
    public final List f10271g;

    /* renamed from: h */
    public final String f10272h;

    /* renamed from: i */
    public final String f10273i;

    /* renamed from: j */
    public final boolean f10274j;

    public C6330r(String scheme, String username, String password, String host, int i, ArrayList arrayList, ArrayList arrayList2, String str, String str2) {
        AbstractC5830k.m5330g(scheme, "scheme");
        AbstractC5830k.m5330g(username, "username");
        AbstractC5830k.m5330g(password, "password");
        AbstractC5830k.m5330g(host, "host");
        this.f10265a = scheme;
        this.f10266b = username;
        this.f10267c = password;
        this.f10268d = host;
        this.f10269e = i;
        this.f10270f = arrayList;
        this.f10271g = arrayList2;
        this.f10272h = str;
        this.f10273i = str2;
        this.f10274j = scheme.equals("https");
    }

    /* renamed from: a */
    public final String m5967a() {
        if (this.f10267c.length() == 0) {
            return "";
        }
        int length = this.f10265a.length() + 3;
        String str = this.f10273i;
        String strSubstring = str.substring(AbstractC5855p.m5379M(str, ':', length, 4) + 1, AbstractC5855p.m5379M(str, '@', 0, 6));
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: b */
    public final String m5968b() {
        int length = this.f10265a.length() + 3;
        String str = this.f10273i;
        int iM5379M = AbstractC5855p.m5379M(str, '/', length, 4);
        String strSubstring = str.substring(iM5379M, AbstractC6396c.m6045e(iM5379M, str.length(), str, "?#"));
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public final ArrayList m5969c() {
        int length = this.f10265a.length() + 3;
        String str = this.f10273i;
        int iM5379M = AbstractC5855p.m5379M(str, '/', length, 4);
        int iM6045e = AbstractC6396c.m6045e(iM5379M, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM5379M < iM6045e) {
            int i = iM5379M + 1;
            int iM6046f = AbstractC6396c.m6046f(str, '/', i, iM6045e);
            String strSubstring = str.substring(i, iM6046f);
            AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM5379M = iM6046f;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m5970d() {
        if (this.f10271g == null) {
            return null;
        }
        String str = this.f10273i;
        int iM5379M = AbstractC5855p.m5379M(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iM5379M, AbstractC6396c.m6046f(str, '#', iM5379M, str.length()));
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e */
    public final String m5971e() {
        if (this.f10266b.length() == 0) {
            return "";
        }
        int length = this.f10265a.length() + 3;
        String str = this.f10273i;
        String strSubstring = str.substring(length, AbstractC6396c.m6045e(length, str.length(), str, ":@"));
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6330r) && AbstractC5830k.m5325b(((C6330r) obj).f10273i, this.f10273i);
    }

    /* renamed from: f */
    public final C4916z4 m5972f(String link) {
        AbstractC5830k.m5330g(link, "link");
        try {
            C4916z4 c4916z4 = new C4916z4();
            c4916z4.m4288d(this, link);
            return c4916z4;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final String m5973g() {
        C4916z4 c4916z4M5972f = m5972f("/...");
        AbstractC5830k.m5327d(c4916z4M5972f);
        c4916z4M5972f.f7437f = C6286b.m5878b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
        c4916z4M5972f.f7438g = C6286b.m5878b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
        return c4916z4M5972f.m4285a().f10273i;
    }

    /* renamed from: h */
    public final URI m5974h() {
        String strSubstring;
        C4916z4 c4916z4 = new C4916z4();
        String scheme = this.f10265a;
        c4916z4.f7436e = scheme;
        c4916z4.f7437f = m5971e();
        c4916z4.f7438g = m5967a();
        c4916z4.f7439h = this.f10268d;
        AbstractC5830k.m5330g(scheme, "scheme");
        int i = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i8 = this.f10269e;
        c4916z4.f7433b = i8 != i ? i8 : -1;
        ArrayList arrayList = c4916z4.f7434c;
        arrayList.clear();
        arrayList.addAll(m5969c());
        c4916z4.m4287c(m5970d());
        if (this.f10272h == null) {
            strSubstring = null;
        } else {
            String str = this.f10273i;
            strSubstring = str.substring(AbstractC5855p.m5379M(str, '#', 0, 6) + 1);
            AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        c4916z4.f7440i = strSubstring;
        String str2 = (String) c4916z4.f7439h;
        c4916z4.f7439h = str2 != null ? new Regex("[\"<>^`{|}]").replace(str2, "") : null;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.set(i9, C6286b.m5878b((String) arrayList.get(i9), 0, "[]", 0, 227));
        }
        ArrayList arrayList2 = c4916z4.f7435d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str3 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str3 != null ? C6286b.m5878b(str3, 0, "\\^`{|}", 0, 195) : null);
            }
        }
        String str4 = (String) c4916z4.f7440i;
        c4916z4.f7440i = str4 != null ? C6286b.m5878b(str4, 0, " \"#<>\\^`{|}", 0, 163) : null;
        String string = c4916z4.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                AbstractC5830k.m5329f(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.f10273i.hashCode();
    }

    public final String toString() {
        return this.f10273i;
    }
}
