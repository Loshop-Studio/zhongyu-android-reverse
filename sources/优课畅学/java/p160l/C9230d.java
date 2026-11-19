package p160l;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: l.d */
/* loaded from: classes3.dex */
public final class C9230d implements InterfaceC9228b {

    /* renamed from: b */
    public final ArrayMap f18216b = new CachedHashCodeArrayMap();

    /* renamed from: f */
    public static void m16939f(C9229c c9229c, Object obj, MessageDigest messageDigest) {
        c9229c.m16938g(obj, messageDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f18216b.size(); i10++) {
            m16939f((C9229c) this.f18216b.keyAt(i10), this.f18216b.valueAt(i10), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m16940c(C9229c c9229c) {
        return this.f18216b.containsKey(c9229c) ? this.f18216b.get(c9229c) : c9229c.m16936c();
    }

    /* renamed from: d */
    public void m16941d(C9230d c9230d) {
        this.f18216b.putAll((SimpleArrayMap) c9230d.f18216b);
    }

    /* renamed from: e */
    public C9230d m16942e(C9229c c9229c, Object obj) {
        this.f18216b.put(c9229c, obj);
        return this;
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C9230d) {
            return this.f18216b.equals(((C9230d) obj).f18216b);
        }
        return false;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return this.f18216b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f18216b + '}';
    }
}
