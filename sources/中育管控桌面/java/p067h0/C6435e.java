package p067h0;

import java.security.MessageDigest;
import java.util.Map;
import p016b1.AbstractC4408j;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;

/* renamed from: h0.e */
/* loaded from: classes3.dex */
public class C6435e implements InterfaceC6283b {

    /* renamed from: b */
    public final Object f8117b;

    /* renamed from: c */
    public final int f8118c;

    /* renamed from: d */
    public final int f8119d;

    /* renamed from: e */
    public final Class f8120e;

    /* renamed from: f */
    public final Class f8121f;

    /* renamed from: g */
    public final InterfaceC6283b f8122g;

    /* renamed from: h */
    public final Map f8123h;

    /* renamed from: i */
    public final C6285d f8124i;

    /* renamed from: j */
    public int f8125j;

    public C6435e(Object obj, InterfaceC6283b interfaceC6283b, int i6, int i7, Map map, Class cls, Class cls2, C6285d c6285d) {
        this.f8117b = AbstractC4408j.m1438d(obj);
        this.f8122g = (InterfaceC6283b) AbstractC4408j.m1439e(interfaceC6283b, "Signature must not be null");
        this.f8118c = i6;
        this.f8119d = i7;
        this.f8123h = (Map) AbstractC4408j.m1438d(map);
        this.f8120e = (Class) AbstractC4408j.m1439e(cls, "Resource class must not be null");
        this.f8121f = (Class) AbstractC4408j.m1439e(cls2, "Transcode class must not be null");
        this.f8124i = (C6285d) AbstractC4408j.m1438d(c6285d);
    }

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C6435e) {
            C6435e c6435e = (C6435e) obj;
            if (this.f8117b.equals(c6435e.f8117b) && this.f8122g.equals(c6435e.f8122g) && this.f8119d == c6435e.f8119d && this.f8118c == c6435e.f8118c && this.f8123h.equals(c6435e.f8123h) && this.f8120e.equals(c6435e.f8120e) && this.f8121f.equals(c6435e.f8121f) && this.f8124i.equals(c6435e.f8124i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        if (this.f8125j == 0) {
            int iHashCode = this.f8117b.hashCode();
            this.f8125j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f8122g.hashCode()) * 31) + this.f8118c) * 31) + this.f8119d;
            this.f8125j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f8123h.hashCode();
            this.f8125j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f8120e.hashCode();
            this.f8125j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f8121f.hashCode();
            this.f8125j = iHashCode5;
            this.f8125j = (iHashCode5 * 31) + this.f8124i.hashCode();
        }
        return this.f8125j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f8117b + ", width=" + this.f8118c + ", height=" + this.f8119d + ", resourceClass=" + this.f8120e + ", transcodeClass=" + this.f8121f + ", signature=" + this.f8122g + ", hashCode=" + this.f8125j + ", transformations=" + this.f8123h + ", options=" + this.f8124i + '}';
    }
}
