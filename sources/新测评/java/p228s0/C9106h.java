package p228s0;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p117i1.AbstractC7651j;
import p162m0.InterfaceC8537b;

/* renamed from: s0.h */
/* loaded from: classes3.dex */
public class C9106h implements InterfaceC8537b {

    /* renamed from: b */
    public final InterfaceC9107i f15756b;

    /* renamed from: c */
    public final URL f15757c;

    /* renamed from: d */
    public final String f15758d;

    /* renamed from: e */
    public String f15759e;

    /* renamed from: f */
    public URL f15760f;

    /* renamed from: g */
    public volatile byte[] f15761g;

    /* renamed from: h */
    public int f15762h;

    public C9106h(URL url) {
        this(url, InterfaceC9107i.f15764b);
    }

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        messageDigest.update(m15397d());
    }

    /* renamed from: c */
    public String m15396c() {
        String str = this.f15758d;
        return str != null ? str : ((URL) AbstractC7651j.m12683d(this.f15757c)).toString();
    }

    /* renamed from: d */
    public final byte[] m15397d() {
        if (this.f15761g == null) {
            this.f15761g = m15396c().getBytes(InterfaceC8537b.f14173a);
        }
        return this.f15761g;
    }

    /* renamed from: e */
    public Map m15398e() {
        return this.f15756b.mo15402a();
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C9106h) {
            C9106h c9106h = (C9106h) obj;
            if (m15396c().equals(c9106h.m15396c()) && this.f15756b.equals(c9106h.f15756b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m15399f() {
        if (TextUtils.isEmpty(this.f15759e)) {
            String string = this.f15758d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) AbstractC7651j.m12683d(this.f15757c)).toString();
            }
            this.f15759e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f15759e;
    }

    /* renamed from: g */
    public final URL m15400g() {
        if (this.f15760f == null) {
            this.f15760f = new URL(m15399f());
        }
        return this.f15760f;
    }

    /* renamed from: h */
    public URL m15401h() {
        return m15400g();
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        if (this.f15762h == 0) {
            int iHashCode = m15396c().hashCode();
            this.f15762h = iHashCode;
            this.f15762h = (iHashCode * 31) + this.f15756b.hashCode();
        }
        return this.f15762h;
    }

    public String toString() {
        return m15396c();
    }

    public C9106h(String str) {
        this(str, InterfaceC9107i.f15764b);
    }

    public C9106h(URL url, InterfaceC9107i interfaceC9107i) {
        this.f15757c = (URL) AbstractC7651j.m12683d(url);
        this.f15758d = null;
        this.f15756b = (InterfaceC9107i) AbstractC7651j.m12683d(interfaceC9107i);
    }

    public C9106h(String str, InterfaceC9107i interfaceC9107i) {
        this.f15757c = null;
        this.f15758d = AbstractC7651j.m12681b(str);
        this.f15756b = (InterfaceC9107i) AbstractC7651j.m12683d(interfaceC9107i);
    }
}
