package p194o0;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p091e1.AbstractC7837i;
import p122h0.InterfaceC8082b;

/* renamed from: o0.g */
/* loaded from: classes3.dex */
public class C9140g implements InterfaceC8082b {

    /* renamed from: b */
    public final InterfaceC9141h f15396b;

    /* renamed from: c */
    public final URL f15397c;

    /* renamed from: d */
    public final String f15398d;

    /* renamed from: e */
    public String f15399e;

    /* renamed from: f */
    public URL f15400f;

    /* renamed from: g */
    public volatile byte[] f15401g;

    /* renamed from: h */
    public int f15402h;

    public C9140g(URL url) {
        this(url, InterfaceC9141h.f15404b);
    }

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        messageDigest.update(m14684d());
    }

    /* renamed from: c */
    public String m14683c() {
        String str = this.f15398d;
        return str != null ? str : ((URL) AbstractC7837i.m12256d(this.f15397c)).toString();
    }

    /* renamed from: d */
    public final byte[] m14684d() {
        if (this.f15401g == null) {
            this.f15401g = m14683c().getBytes(InterfaceC8082b.f13784a);
        }
        return this.f15401g;
    }

    /* renamed from: e */
    public Map m14685e() {
        return this.f15396b.mo14689a();
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C9140g) {
            C9140g c9140g = (C9140g) obj;
            if (m14683c().equals(c9140g.m14683c()) && this.f15396b.equals(c9140g.f15396b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m14686f() {
        if (TextUtils.isEmpty(this.f15399e)) {
            String string = this.f15398d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) AbstractC7837i.m12256d(this.f15397c)).toString();
            }
            this.f15399e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f15399e;
    }

    /* renamed from: g */
    public final URL m14687g() {
        if (this.f15400f == null) {
            this.f15400f = new URL(m14686f());
        }
        return this.f15400f;
    }

    /* renamed from: h */
    public URL m14688h() {
        return m14687g();
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        if (this.f15402h == 0) {
            int iHashCode = m14683c().hashCode();
            this.f15402h = iHashCode;
            this.f15402h = (iHashCode * 31) + this.f15396b.hashCode();
        }
        return this.f15402h;
    }

    public String toString() {
        return m14683c();
    }

    public C9140g(String str) {
        this(str, InterfaceC9141h.f15404b);
    }

    public C9140g(URL url, InterfaceC9141h interfaceC9141h) {
        this.f15397c = (URL) AbstractC7837i.m12256d(url);
        this.f15398d = null;
        this.f15396b = (InterfaceC9141h) AbstractC7837i.m12256d(interfaceC9141h);
    }

    public C9140g(String str, InterfaceC9141h interfaceC9141h) {
        this.f15397c = null;
        this.f15398d = AbstractC7837i.m12254b(str);
        this.f15396b = (InterfaceC9141h) AbstractC7837i.m12256d(interfaceC9141h);
    }
}
