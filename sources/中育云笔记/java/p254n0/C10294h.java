package p254n0;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p109d1.AbstractC8909j;
import p168h0.InterfaceC9435b;

/* renamed from: n0.h */
/* loaded from: classes3.dex */
public class C10294h implements InterfaceC9435b {

    /* renamed from: b */
    public final InterfaceC10295i f24514b;

    /* renamed from: c */
    public final URL f24515c;

    /* renamed from: d */
    public final String f24516d;

    /* renamed from: e */
    public String f24517e;

    /* renamed from: f */
    public URL f24518f;

    /* renamed from: g */
    public volatile byte[] f24519g;

    /* renamed from: h */
    public int f24520h;

    public C10294h(URL url) {
        this(url, InterfaceC10295i.f24522b);
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        messageDigest.update(m21460d());
    }

    /* renamed from: c */
    public String m21459c() {
        String str = this.f24516d;
        return str != null ? str : ((URL) AbstractC8909j.m17468d(this.f24515c)).toString();
    }

    /* renamed from: d */
    public final byte[] m21460d() {
        if (this.f24519g == null) {
            this.f24519g = m21459c().getBytes(InterfaceC9435b.f21837a);
        }
        return this.f24519g;
    }

    /* renamed from: e */
    public Map m21461e() {
        return this.f24514b.getHeaders();
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C10294h) {
            C10294h c10294h = (C10294h) obj;
            if (m21459c().equals(c10294h.m21459c()) && this.f24514b.equals(c10294h.f24514b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m21462f() {
        if (TextUtils.isEmpty(this.f24517e)) {
            String string = this.f24516d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) AbstractC8909j.m17468d(this.f24515c)).toString();
            }
            this.f24517e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f24517e;
    }

    /* renamed from: g */
    public final URL m21463g() {
        if (this.f24518f == null) {
            this.f24518f = new URL(m21462f());
        }
        return this.f24518f;
    }

    /* renamed from: h */
    public URL m21464h() {
        return m21463g();
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        if (this.f24520h == 0) {
            int iHashCode = m21459c().hashCode();
            this.f24520h = iHashCode;
            this.f24520h = (iHashCode * 31) + this.f24514b.hashCode();
        }
        return this.f24520h;
    }

    public String toString() {
        return m21459c();
    }

    public C10294h(String str) {
        this(str, InterfaceC10295i.f24522b);
    }

    public C10294h(URL url, InterfaceC10295i interfaceC10295i) {
        this.f24515c = (URL) AbstractC8909j.m17468d(url);
        this.f24516d = null;
        this.f24514b = (InterfaceC10295i) AbstractC8909j.m17468d(interfaceC10295i);
    }

    public C10294h(String str, InterfaceC10295i interfaceC10295i) {
        this.f24515c = null;
        this.f24516d = AbstractC8909j.m17466b(str);
        this.f24514b = (InterfaceC10295i) AbstractC8909j.m17468d(interfaceC10295i);
    }
}
