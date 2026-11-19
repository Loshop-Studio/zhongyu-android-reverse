package p016b0;

import java.security.MessageDigest;
import java.util.Map;
import p185v7.AbstractC6675d;
import p202y.C6763f;
import p202y.InterfaceC6760c;

/* renamed from: b0.y */
/* loaded from: classes2.dex */
public final class C3095y implements InterfaceC6760c {

    /* renamed from: b */
    public final Object f1522b;

    /* renamed from: c */
    public final int f1523c;

    /* renamed from: d */
    public final int f1524d;

    /* renamed from: e */
    public final Class f1525e;

    /* renamed from: f */
    public final Class f1526f;

    /* renamed from: g */
    public final InterfaceC6760c f1527g;

    /* renamed from: h */
    public final Map f1528h;

    /* renamed from: i */
    public final C6763f f1529i;

    /* renamed from: j */
    public int f1530j;

    public C3095y(Object obj, InterfaceC6760c interfaceC6760c, int i, int i8, Map map, Class cls, Class cls2, C6763f c6763f) {
        AbstractC6675d.m6344f(obj, "Argument must not be null");
        this.f1522b = obj;
        this.f1527g = interfaceC6760c;
        this.f1523c = i;
        this.f1524d = i8;
        AbstractC6675d.m6344f(map, "Argument must not be null");
        this.f1528h = map;
        AbstractC6675d.m6344f(cls, "Resource class must not be null");
        this.f1525e = cls;
        AbstractC6675d.m6344f(cls2, "Transcode class must not be null");
        this.f1526f = cls2;
        AbstractC6675d.m6344f(c6763f, "Argument must not be null");
        this.f1529i = c6763f;
    }

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C3095y) {
            C3095y c3095y = (C3095y) obj;
            if (this.f1522b.equals(c3095y.f1522b) && this.f1527g.equals(c3095y.f1527g) && this.f1524d == c3095y.f1524d && this.f1523c == c3095y.f1523c && this.f1528h.equals(c3095y.f1528h) && this.f1525e.equals(c3095y.f1525e) && this.f1526f.equals(c3095y.f1526f) && this.f1529i.equals(c3095y.f1529i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        if (this.f1530j == 0) {
            int iHashCode = this.f1522b.hashCode();
            this.f1530j = iHashCode;
            int iHashCode2 = ((((this.f1527g.hashCode() + (iHashCode * 31)) * 31) + this.f1523c) * 31) + this.f1524d;
            this.f1530j = iHashCode2;
            int iHashCode3 = this.f1528h.hashCode() + (iHashCode2 * 31);
            this.f1530j = iHashCode3;
            int iHashCode4 = this.f1525e.hashCode() + (iHashCode3 * 31);
            this.f1530j = iHashCode4;
            int iHashCode5 = this.f1526f.hashCode() + (iHashCode4 * 31);
            this.f1530j = iHashCode5;
            this.f1530j = this.f1529i.f11435b.hashCode() + (iHashCode5 * 31);
        }
        return this.f1530j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f1522b + ", width=" + this.f1523c + ", height=" + this.f1524d + ", resourceClass=" + this.f1525e + ", transcodeClass=" + this.f1526f + ", signature=" + this.f1527g + ", hashCode=" + this.f1530j + ", transformations=" + this.f1528h + ", options=" + this.f1529i + '}';
    }
}
