package p198j0;

import java.security.MessageDigest;
import java.util.Map;
import p109d1.AbstractC8909j;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;

/* renamed from: j0.e */
/* loaded from: classes3.dex */
public class C9652e implements InterfaceC9435b {

    /* renamed from: b */
    public final Object f22360b;

    /* renamed from: c */
    public final int f22361c;

    /* renamed from: d */
    public final int f22362d;

    /* renamed from: e */
    public final Class f22363e;

    /* renamed from: f */
    public final Class f22364f;

    /* renamed from: g */
    public final InterfaceC9435b f22365g;

    /* renamed from: h */
    public final Map f22366h;

    /* renamed from: i */
    public final C9438e f22367i;

    /* renamed from: j */
    public int f22368j;

    public C9652e(Object obj, InterfaceC9435b interfaceC9435b, int i10, int i11, Map map, Class cls, Class cls2, C9438e c9438e) {
        this.f22360b = AbstractC8909j.m17468d(obj);
        this.f22365g = (InterfaceC9435b) AbstractC8909j.m17469e(interfaceC9435b, "Signature must not be null");
        this.f22361c = i10;
        this.f22362d = i11;
        this.f22366h = (Map) AbstractC8909j.m17468d(map);
        this.f22363e = (Class) AbstractC8909j.m17469e(cls, "Resource class must not be null");
        this.f22364f = (Class) AbstractC8909j.m17469e(cls2, "Transcode class must not be null");
        this.f22367i = (C9438e) AbstractC8909j.m17468d(c9438e);
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C9652e) {
            C9652e c9652e = (C9652e) obj;
            if (this.f22360b.equals(c9652e.f22360b) && this.f22365g.equals(c9652e.f22365g) && this.f22362d == c9652e.f22362d && this.f22361c == c9652e.f22361c && this.f22366h.equals(c9652e.f22366h) && this.f22363e.equals(c9652e.f22363e) && this.f22364f.equals(c9652e.f22364f) && this.f22367i.equals(c9652e.f22367i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        if (this.f22368j == 0) {
            int iHashCode = this.f22360b.hashCode();
            this.f22368j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f22365g.hashCode()) * 31) + this.f22361c) * 31) + this.f22362d;
            this.f22368j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f22366h.hashCode();
            this.f22368j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f22363e.hashCode();
            this.f22368j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f22364f.hashCode();
            this.f22368j = iHashCode5;
            this.f22368j = (iHashCode5 * 31) + this.f22367i.hashCode();
        }
        return this.f22368j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f22360b + ", width=" + this.f22361c + ", height=" + this.f22362d + ", resourceClass=" + this.f22363e + ", transcodeClass=" + this.f22364f + ", signature=" + this.f22365g + ", hashCode=" + this.f22368j + ", transformations=" + this.f22366h + ", options=" + this.f22367i + '}';
    }
}
