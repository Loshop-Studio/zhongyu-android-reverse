package p097l0;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p016b1.AbstractC4408j;
import p053f0.InterfaceC6283b;

/* renamed from: l0.h */
/* loaded from: classes3.dex */
public class C7274h implements InterfaceC6283b {

    /* renamed from: b */
    public final InterfaceC7275i f9202b;

    /* renamed from: c */
    public final URL f9203c;

    /* renamed from: d */
    public final String f9204d;

    /* renamed from: e */
    public String f9205e;

    /* renamed from: f */
    public URL f9206f;

    /* renamed from: g */
    public volatile byte[] f9207g;

    /* renamed from: h */
    public int f9208h;

    public C7274h(URL url) {
        this(url, InterfaceC7275i.f9210b);
    }

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        messageDigest.update(m8233d());
    }

    /* renamed from: c */
    public String m8232c() {
        String str = this.f9204d;
        return str != null ? str : ((URL) AbstractC4408j.m1438d(this.f9203c)).toString();
    }

    /* renamed from: d */
    public final byte[] m8233d() {
        if (this.f9207g == null) {
            this.f9207g = m8232c().getBytes(InterfaceC6283b.f7649a);
        }
        return this.f9207g;
    }

    /* renamed from: e */
    public Map m8234e() {
        return this.f9202b.mo8238a();
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C7274h) {
            C7274h c7274h = (C7274h) obj;
            if (m8232c().equals(c7274h.m8232c()) && this.f9202b.equals(c7274h.f9202b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m8235f() {
        if (TextUtils.isEmpty(this.f9205e)) {
            String string = this.f9204d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) AbstractC4408j.m1438d(this.f9203c)).toString();
            }
            this.f9205e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f9205e;
    }

    /* renamed from: g */
    public final URL m8236g() {
        if (this.f9206f == null) {
            this.f9206f = new URL(m8235f());
        }
        return this.f9206f;
    }

    /* renamed from: h */
    public URL m8237h() {
        return m8236g();
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        if (this.f9208h == 0) {
            int iHashCode = m8232c().hashCode();
            this.f9208h = iHashCode;
            this.f9208h = (iHashCode * 31) + this.f9202b.hashCode();
        }
        return this.f9208h;
    }

    public String toString() {
        return m8232c();
    }

    public C7274h(String str) {
        this(str, InterfaceC7275i.f9210b);
    }

    public C7274h(URL url, InterfaceC7275i interfaceC7275i) {
        this.f9203c = (URL) AbstractC4408j.m1438d(url);
        this.f9204d = null;
        this.f9202b = (InterfaceC7275i) AbstractC4408j.m1438d(interfaceC7275i);
    }

    public C7274h(String str, InterfaceC7275i interfaceC7275i) {
        this.f9203c = null;
        this.f9204d = AbstractC4408j.m1436b(str);
        this.f9202b = (InterfaceC7275i) AbstractC4408j.m1438d(interfaceC7275i);
    }
}
