package p093m;

import java.security.MessageDigest;
import java.util.Map;
import p062g0.AbstractC3749i;
import p076j.C3794d;
import p076j.InterfaceC3792b;

/* renamed from: m.e */
/* loaded from: classes2.dex */
public class C4356e implements InterfaceC3792b {

    /* renamed from: b */
    public final Object f4870b;

    /* renamed from: c */
    public final int f4871c;

    /* renamed from: d */
    public final int f4872d;

    /* renamed from: e */
    public final Class f4873e;

    /* renamed from: f */
    public final Class f4874f;

    /* renamed from: g */
    public final InterfaceC3792b f4875g;

    /* renamed from: h */
    public final Map f4876h;

    /* renamed from: i */
    public final C3794d f4877i;

    /* renamed from: j */
    public int f4878j;

    public C4356e(Object obj, InterfaceC3792b interfaceC3792b, int i4, int i5, Map map, Class cls, Class cls2, C3794d c3794d) {
        this.f4870b = AbstractC3749i.m4768d(obj);
        this.f4875g = (InterfaceC3792b) AbstractC3749i.m4769e(interfaceC3792b, "Signature must not be null");
        this.f4871c = i4;
        this.f4872d = i5;
        this.f4876h = (Map) AbstractC3749i.m4768d(map);
        this.f4873e = (Class) AbstractC3749i.m4769e(cls, "Resource class must not be null");
        this.f4874f = (Class) AbstractC3749i.m4769e(cls2, "Transcode class must not be null");
        this.f4877i = (C3794d) AbstractC3749i.m4768d(c3794d);
    }

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (!(obj instanceof C4356e)) {
            return false;
        }
        C4356e c4356e = (C4356e) obj;
        return this.f4870b.equals(c4356e.f4870b) && this.f4875g.equals(c4356e.f4875g) && this.f4872d == c4356e.f4872d && this.f4871c == c4356e.f4871c && this.f4876h.equals(c4356e.f4876h) && this.f4873e.equals(c4356e.f4873e) && this.f4874f.equals(c4356e.f4874f) && this.f4877i.equals(c4356e.f4877i);
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        if (this.f4878j == 0) {
            int iHashCode = this.f4870b.hashCode();
            this.f4878j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f4875g.hashCode()) * 31) + this.f4871c) * 31) + this.f4872d;
            this.f4878j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f4876h.hashCode();
            this.f4878j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f4873e.hashCode();
            this.f4878j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f4874f.hashCode();
            this.f4878j = iHashCode5;
            this.f4878j = (iHashCode5 * 31) + this.f4877i.hashCode();
        }
        return this.f4878j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f4870b + ", width=" + this.f4871c + ", height=" + this.f4872d + ", resourceClass=" + this.f4873e + ", transcodeClass=" + this.f4874f + ", signature=" + this.f4875g + ", hashCode=" + this.f4878j + ", transformations=" + this.f4876h + ", options=" + this.f4877i + '}';
    }
}
