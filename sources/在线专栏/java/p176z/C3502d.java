package p176z;

import android.util.Base64;
import java.util.List;
import p011b0.C1025h;

/* renamed from: z.d */
/* loaded from: classes.dex */
public final class C3502d {

    /* renamed from: a */
    private final String f12250a;

    /* renamed from: b */
    private final String f12251b;

    /* renamed from: c */
    private final String f12252c;

    /* renamed from: d */
    private final List<List<byte[]>> f12253d;

    /* renamed from: e */
    private final int f12254e = 0;

    /* renamed from: f */
    private final String f12255f;

    public C3502d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f12250a = (String) C1025h.m4782f(str);
        this.f12251b = (String) C1025h.m4782f(str2);
        this.f12252c = (String) C1025h.m4782f(str3);
        this.f12253d = (List) C1025h.m4782f(list);
        this.f12255f = m10650a(str, str2, str3);
    }

    /* renamed from: a */
    private String m10650a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m10651b() {
        return this.f12253d;
    }

    /* renamed from: c */
    public int m10652c() {
        return this.f12254e;
    }

    /* renamed from: d */
    String m10653d() {
        return this.f12255f;
    }

    /* renamed from: e */
    public String m10654e() {
        return this.f12250a;
    }

    /* renamed from: f */
    public String m10655f() {
        return this.f12251b;
    }

    /* renamed from: g */
    public String m10656g() {
        return this.f12252c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f12250a + ", mProviderPackage: " + this.f12251b + ", mQuery: " + this.f12252c + ", mCertificates:");
        for (int i4 = 0; i4 < this.f12253d.size(); i4++) {
            sb.append(" [");
            List<byte[]> list = this.f12253d.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f12254e);
        return sb.toString();
    }
}
