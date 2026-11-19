package p000a.p031h.p040g;

import android.util.Base64;
import java.util.List;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.g.e */
/* loaded from: classes.dex */
public final class C0223e {

    /* renamed from: a */
    public final String f1491a;

    /* renamed from: b */
    public final String f1492b;

    /* renamed from: c */
    public final String f1493c;

    /* renamed from: d */
    public final List<List<byte[]>> f1494d;

    /* renamed from: e */
    public final String f1495e;

    public C0223e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1491a = str;
        this.f1492b = str2;
        this.f1493c = str3;
        Objects.requireNonNull(list);
        this.f1494d = list;
        this.f1495e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbM2079g = C0561a.m2079g("FontRequest {mProviderAuthority: ");
        sbM2079g.append(this.f1491a);
        sbM2079g.append(", mProviderPackage: ");
        sbM2079g.append(this.f1492b);
        sbM2079g.append(", mQuery: ");
        sbM2079g.append(this.f1493c);
        sbM2079g.append(", mCertificates:");
        sb.append(sbM2079g.toString());
        for (int i = 0; i < this.f1494d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f1494d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
