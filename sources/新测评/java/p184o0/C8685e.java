package p184o0;

import java.security.MessageDigest;
import java.util.Map;
import p117i1.AbstractC7651j;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;

/* renamed from: o0.e */
/* loaded from: classes3.dex */
public class C8685e implements InterfaceC8537b {

    /* renamed from: b */
    public final Object f14427b;

    /* renamed from: c */
    public final int f14428c;

    /* renamed from: d */
    public final int f14429d;

    /* renamed from: e */
    public final Class f14430e;

    /* renamed from: f */
    public final Class f14431f;

    /* renamed from: g */
    public final InterfaceC8537b f14432g;

    /* renamed from: h */
    public final Map f14433h;

    /* renamed from: i */
    public final C8539d f14434i;

    /* renamed from: j */
    public int f14435j;

    public C8685e(Object obj, InterfaceC8537b interfaceC8537b, int i10, int i11, Map map, Class cls, Class cls2, C8539d c8539d) {
        this.f14427b = AbstractC7651j.m12683d(obj);
        this.f14432g = (InterfaceC8537b) AbstractC7651j.m12684e(interfaceC8537b, "Signature must not be null");
        this.f14428c = i10;
        this.f14429d = i11;
        this.f14433h = (Map) AbstractC7651j.m12683d(map);
        this.f14430e = (Class) AbstractC7651j.m12684e(cls, "Resource class must not be null");
        this.f14431f = (Class) AbstractC7651j.m12684e(cls2, "Transcode class must not be null");
        this.f14434i = (C8539d) AbstractC7651j.m12683d(c8539d);
    }

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C8685e) {
            C8685e c8685e = (C8685e) obj;
            if (this.f14427b.equals(c8685e.f14427b) && this.f14432g.equals(c8685e.f14432g) && this.f14429d == c8685e.f14429d && this.f14428c == c8685e.f14428c && this.f14433h.equals(c8685e.f14433h) && this.f14430e.equals(c8685e.f14430e) && this.f14431f.equals(c8685e.f14431f) && this.f14434i.equals(c8685e.f14434i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        if (this.f14435j == 0) {
            int iHashCode = this.f14427b.hashCode();
            this.f14435j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f14432g.hashCode()) * 31) + this.f14428c) * 31) + this.f14429d;
            this.f14435j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f14433h.hashCode();
            this.f14435j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f14430e.hashCode();
            this.f14435j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f14431f.hashCode();
            this.f14435j = iHashCode5;
            this.f14435j = (iHashCode5 * 31) + this.f14434i.hashCode();
        }
        return this.f14435j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f14427b + ", width=" + this.f14428c + ", height=" + this.f14429d + ", resourceClass=" + this.f14430e + ", transcodeClass=" + this.f14431f + ", signature=" + this.f14432g + ", hashCode=" + this.f14435j + ", transformations=" + this.f14433h + ", options=" + this.f14434i + '}';
    }
}
