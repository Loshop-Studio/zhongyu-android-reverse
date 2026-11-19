package p226r;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p116h0.AbstractC8706j;
import p160l.InterfaceC9228b;

/* renamed from: r.h */
/* loaded from: classes3.dex */
public class C9882h implements InterfaceC9228b {

    /* renamed from: b */
    public final InterfaceC9883i f19791b;

    /* renamed from: c */
    public final URL f19792c;

    /* renamed from: d */
    public final String f19793d;

    /* renamed from: e */
    public String f19794e;

    /* renamed from: f */
    public URL f19795f;

    /* renamed from: g */
    public volatile byte[] f19796g;

    /* renamed from: h */
    public int f19797h;

    public C9882h(URL url) {
        this(url, InterfaceC9883i.f19799b);
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        messageDigest.update(m18488d());
    }

    /* renamed from: c */
    public String m18487c() {
        String str = this.f19793d;
        return str != null ? str : ((URL) AbstractC8706j.m14181d(this.f19792c)).toString();
    }

    /* renamed from: d */
    public final byte[] m18488d() {
        if (this.f19796g == null) {
            this.f19796g = m18487c().getBytes(InterfaceC9228b.f18210a);
        }
        return this.f19796g;
    }

    /* renamed from: e */
    public Map m18489e() {
        return this.f19791b.mo18493a();
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C9882h) {
            C9882h c9882h = (C9882h) obj;
            if (m18487c().equals(c9882h.m18487c()) && this.f19791b.equals(c9882h.f19791b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m18490f() {
        if (TextUtils.isEmpty(this.f19794e)) {
            String string = this.f19793d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) AbstractC8706j.m14181d(this.f19792c)).toString();
            }
            this.f19794e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f19794e;
    }

    /* renamed from: g */
    public final URL m18491g() {
        if (this.f19795f == null) {
            this.f19795f = new URL(m18490f());
        }
        return this.f19795f;
    }

    /* renamed from: h */
    public URL m18492h() {
        return m18491g();
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        if (this.f19797h == 0) {
            int iHashCode = m18487c().hashCode();
            this.f19797h = iHashCode;
            this.f19797h = (iHashCode * 31) + this.f19791b.hashCode();
        }
        return this.f19797h;
    }

    public String toString() {
        return m18487c();
    }

    public C9882h(String str) {
        this(str, InterfaceC9883i.f19799b);
    }

    public C9882h(URL url, InterfaceC9883i interfaceC9883i) {
        this.f19792c = (URL) AbstractC8706j.m14181d(url);
        this.f19793d = null;
        this.f19791b = (InterfaceC9883i) AbstractC8706j.m14181d(interfaceC9883i);
    }

    public C9882h(String str, InterfaceC9883i interfaceC9883i) {
        this.f19792c = null;
        this.f19793d = AbstractC8706j.m14179b(str);
        this.f19791b = (InterfaceC9883i) AbstractC8706j.m14181d(interfaceC9883i);
    }
}
