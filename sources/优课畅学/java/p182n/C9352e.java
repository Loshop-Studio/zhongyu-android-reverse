package p182n;

import java.security.MessageDigest;
import java.util.Map;
import p116h0.AbstractC8706j;
import p160l.C9230d;
import p160l.InterfaceC9228b;

/* renamed from: n.e */
/* loaded from: classes3.dex */
public class C9352e implements InterfaceC9228b {

    /* renamed from: b */
    public final Object f18469b;

    /* renamed from: c */
    public final int f18470c;

    /* renamed from: d */
    public final int f18471d;

    /* renamed from: e */
    public final Class f18472e;

    /* renamed from: f */
    public final Class f18473f;

    /* renamed from: g */
    public final InterfaceC9228b f18474g;

    /* renamed from: h */
    public final Map f18475h;

    /* renamed from: i */
    public final C9230d f18476i;

    /* renamed from: j */
    public int f18477j;

    public C9352e(Object obj, InterfaceC9228b interfaceC9228b, int i10, int i11, Map map, Class cls, Class cls2, C9230d c9230d) {
        this.f18469b = AbstractC8706j.m14181d(obj);
        this.f18474g = (InterfaceC9228b) AbstractC8706j.m14182e(interfaceC9228b, "Signature must not be null");
        this.f18470c = i10;
        this.f18471d = i11;
        this.f18475h = (Map) AbstractC8706j.m14181d(map);
        this.f18472e = (Class) AbstractC8706j.m14182e(cls, "Resource class must not be null");
        this.f18473f = (Class) AbstractC8706j.m14182e(cls2, "Transcode class must not be null");
        this.f18476i = (C9230d) AbstractC8706j.m14181d(c9230d);
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C9352e) {
            C9352e c9352e = (C9352e) obj;
            if (this.f18469b.equals(c9352e.f18469b) && this.f18474g.equals(c9352e.f18474g) && this.f18471d == c9352e.f18471d && this.f18470c == c9352e.f18470c && this.f18475h.equals(c9352e.f18475h) && this.f18472e.equals(c9352e.f18472e) && this.f18473f.equals(c9352e.f18473f) && this.f18476i.equals(c9352e.f18476i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        if (this.f18477j == 0) {
            int iHashCode = this.f18469b.hashCode();
            this.f18477j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f18474g.hashCode()) * 31) + this.f18470c) * 31) + this.f18471d;
            this.f18477j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f18475h.hashCode();
            this.f18477j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f18472e.hashCode();
            this.f18477j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f18473f.hashCode();
            this.f18477j = iHashCode5;
            this.f18477j = (iHashCode5 * 31) + this.f18476i.hashCode();
        }
        return this.f18477j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f18469b + ", width=" + this.f18470c + ", height=" + this.f18471d + ", resourceClass=" + this.f18472e + ", transcodeClass=" + this.f18473f + ", signature=" + this.f18474g + ", hashCode=" + this.f18477j + ", transformations=" + this.f18475h + ", options=" + this.f18476i + '}';
    }
}
