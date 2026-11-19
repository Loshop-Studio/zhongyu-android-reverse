package p055f0;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p185v7.AbstractC6675d;
import p202y.InterfaceC6760c;

/* renamed from: f0.f */
/* loaded from: classes2.dex */
public final class C5501f implements InterfaceC6760c {

    /* renamed from: b */
    public final InterfaceC5502g f8509b;

    /* renamed from: c */
    public final URL f8510c;

    /* renamed from: d */
    public final String f8511d;

    /* renamed from: e */
    public String f8512e;

    /* renamed from: f */
    public URL f8513f;

    /* renamed from: g */
    public volatile byte[] f8514g;

    /* renamed from: h */
    public int f8515h;

    public C5501f(URL url) {
        C5505j c5505j = InterfaceC5502g.f8516a;
        AbstractC6675d.m6344f(url, "Argument must not be null");
        this.f8510c = url;
        this.f8511d = null;
        AbstractC6675d.m6344f(c5505j, "Argument must not be null");
        this.f8509b = c5505j;
    }

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        if (this.f8514g == null) {
            this.f8514g = m4879c().getBytes(InterfaceC6760c.f11429a);
        }
        messageDigest.update(this.f8514g);
    }

    /* renamed from: c */
    public final String m4879c() {
        String str = this.f8511d;
        if (str != null) {
            return str;
        }
        URL url = this.f8510c;
        AbstractC6675d.m6344f(url, "Argument must not be null");
        return url.toString();
    }

    /* renamed from: d */
    public final URL m4880d() {
        if (this.f8513f == null) {
            if (TextUtils.isEmpty(this.f8512e)) {
                String string = this.f8511d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f8510c;
                    AbstractC6675d.m6344f(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f8512e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f8513f = new URL(this.f8512e);
        }
        return this.f8513f;
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C5501f) {
            C5501f c5501f = (C5501f) obj;
            if (m4879c().equals(c5501f.m4879c()) && this.f8509b.equals(c5501f.f8509b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        if (this.f8515h == 0) {
            int iHashCode = m4879c().hashCode();
            this.f8515h = iHashCode;
            this.f8515h = this.f8509b.hashCode() + (iHashCode * 31);
        }
        return this.f8515h;
    }

    public final String toString() {
        return m4879c();
    }

    public C5501f(String str) {
        C5505j c5505j = InterfaceC5502g.f8516a;
        this.f8510c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f8511d = str;
            AbstractC6675d.m6344f(c5505j, "Argument must not be null");
            this.f8509b = c5505j;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
