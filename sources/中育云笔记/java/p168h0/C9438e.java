package p168h0;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: h0.e */
/* loaded from: classes3.dex */
public final class C9438e implements InterfaceC9435b {

    /* renamed from: b */
    public final ArrayMap f21844b = new CachedHashCodeArrayMap();

    /* renamed from: g */
    public static void m18625g(C9437d c9437d, Object obj, MessageDigest messageDigest) {
        c9437d.m18624g(obj, messageDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f21844b.size(); i10++) {
            m18625g((C9437d) this.f21844b.keyAt(i10), this.f21844b.valueAt(i10), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m18626c(C9437d c9437d) {
        return this.f21844b.containsKey(c9437d) ? this.f21844b.get(c9437d) : c9437d.m18622c();
    }

    /* renamed from: d */
    public void m18627d(C9438e c9438e) {
        this.f21844b.putAll((SimpleArrayMap) c9438e.f21844b);
    }

    /* renamed from: e */
    public C9438e m18628e(C9437d c9437d) {
        this.f21844b.remove(c9437d);
        return this;
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C9438e) {
            return this.f21844b.equals(((C9438e) obj).f21844b);
        }
        return false;
    }

    /* renamed from: f */
    public C9438e m18629f(C9437d c9437d, Object obj) {
        this.f21844b.put(c9437d, obj);
        return this;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return this.f21844b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f21844b + '}';
    }
}
