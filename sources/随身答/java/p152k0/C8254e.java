package p152k0;

import java.security.MessageDigest;
import java.util.Map;
import p091e1.AbstractC7837i;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;

/* renamed from: k0.e */
/* loaded from: classes3.dex */
public class C8254e implements InterfaceC8082b {

    /* renamed from: b */
    public final Object f14328b;

    /* renamed from: c */
    public final int f14329c;

    /* renamed from: d */
    public final int f14330d;

    /* renamed from: e */
    public final Class f14331e;

    /* renamed from: f */
    public final Class f14332f;

    /* renamed from: g */
    public final InterfaceC8082b f14333g;

    /* renamed from: h */
    public final Map f14334h;

    /* renamed from: i */
    public final C8084d f14335i;

    /* renamed from: j */
    public int f14336j;

    public C8254e(Object obj, InterfaceC8082b interfaceC8082b, int i9, int i10, Map map, Class cls, Class cls2, C8084d c8084d) {
        this.f14328b = AbstractC7837i.m12256d(obj);
        this.f14333g = (InterfaceC8082b) AbstractC7837i.m12257e(interfaceC8082b, "Signature must not be null");
        this.f14329c = i9;
        this.f14330d = i10;
        this.f14334h = (Map) AbstractC7837i.m12256d(map);
        this.f14331e = (Class) AbstractC7837i.m12257e(cls, "Resource class must not be null");
        this.f14332f = (Class) AbstractC7837i.m12257e(cls2, "Transcode class must not be null");
        this.f14335i = (C8084d) AbstractC7837i.m12256d(c8084d);
    }

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C8254e) {
            C8254e c8254e = (C8254e) obj;
            if (this.f14328b.equals(c8254e.f14328b) && this.f14333g.equals(c8254e.f14333g) && this.f14330d == c8254e.f14330d && this.f14329c == c8254e.f14329c && this.f14334h.equals(c8254e.f14334h) && this.f14331e.equals(c8254e.f14331e) && this.f14332f.equals(c8254e.f14332f) && this.f14335i.equals(c8254e.f14335i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        if (this.f14336j == 0) {
            int iHashCode = this.f14328b.hashCode();
            this.f14336j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f14333g.hashCode()) * 31) + this.f14329c) * 31) + this.f14330d;
            this.f14336j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f14334h.hashCode();
            this.f14336j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f14331e.hashCode();
            this.f14336j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f14332f.hashCode();
            this.f14336j = iHashCode5;
            this.f14336j = (iHashCode5 * 31) + this.f14335i.hashCode();
        }
        return this.f14336j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f14328b + ", width=" + this.f14329c + ", height=" + this.f14330d + ", resourceClass=" + this.f14331e + ", transcodeClass=" + this.f14332f + ", signature=" + this.f14333g + ", hashCode=" + this.f14336j + ", transformations=" + this.f14334h + ", options=" + this.f14335i + '}';
    }
}
