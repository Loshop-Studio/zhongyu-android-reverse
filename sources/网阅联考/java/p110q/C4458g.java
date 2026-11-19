package p110q;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p062g0.AbstractC3749i;
import p076j.InterfaceC3792b;

/* renamed from: q.g */
/* loaded from: classes2.dex */
public class C4458g implements InterfaceC3792b {

    /* renamed from: b */
    public final InterfaceC4459h f5165b;

    /* renamed from: c */
    public final URL f5166c;

    /* renamed from: d */
    public final String f5167d;

    /* renamed from: e */
    public String f5168e;

    /* renamed from: f */
    public URL f5169f;

    /* renamed from: g */
    public volatile byte[] f5170g;

    /* renamed from: h */
    public int f5171h;

    public C4458g(URL url) {
        this(url, InterfaceC4459h.f5173b);
    }

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        messageDigest.update(m5700d());
    }

    /* renamed from: c */
    public String m5699c() {
        String str = this.f5167d;
        return str != null ? str : ((URL) AbstractC3749i.m4768d(this.f5166c)).toString();
    }

    /* renamed from: d */
    public final byte[] m5700d() {
        if (this.f5170g == null) {
            this.f5170g = m5699c().getBytes(InterfaceC3792b.f4537a);
        }
        return this.f5170g;
    }

    /* renamed from: e */
    public Map m5701e() {
        return this.f5165b.mo5705a();
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (!(obj instanceof C4458g)) {
            return false;
        }
        C4458g c4458g = (C4458g) obj;
        return m5699c().equals(c4458g.m5699c()) && this.f5165b.equals(c4458g.f5165b);
    }

    /* renamed from: f */
    public final String m5702f() {
        if (TextUtils.isEmpty(this.f5168e)) {
            String string = this.f5167d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) AbstractC3749i.m4768d(this.f5166c)).toString();
            }
            this.f5168e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f5168e;
    }

    /* renamed from: g */
    public final URL m5703g() {
        if (this.f5169f == null) {
            this.f5169f = new URL(m5702f());
        }
        return this.f5169f;
    }

    /* renamed from: h */
    public URL m5704h() {
        return m5703g();
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        if (this.f5171h == 0) {
            int iHashCode = m5699c().hashCode();
            this.f5171h = iHashCode;
            this.f5171h = (iHashCode * 31) + this.f5165b.hashCode();
        }
        return this.f5171h;
    }

    public String toString() {
        return m5699c();
    }

    public C4458g(String str) {
        this(str, InterfaceC4459h.f5173b);
    }

    public C4458g(URL url, InterfaceC4459h interfaceC4459h) {
        this.f5166c = (URL) AbstractC3749i.m4768d(url);
        this.f5167d = null;
        this.f5165b = (InterfaceC4459h) AbstractC3749i.m4768d(interfaceC4459h);
    }

    public C4458g(String str, InterfaceC4459h interfaceC4459h) {
        this.f5166c = null;
        this.f5167d = AbstractC3749i.m4766b(str);
        this.f5165b = (InterfaceC4459h) AbstractC3749i.m4768d(interfaceC4459h);
    }
}
