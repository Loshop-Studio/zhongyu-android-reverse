package p162m0;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: m0.d */
/* loaded from: classes3.dex */
public final class C8539d implements InterfaceC8537b {

    /* renamed from: b */
    public final ArrayMap f14179b = new CachedHashCodeArrayMap();

    /* renamed from: f */
    public static void m14056f(C8538c c8538c, Object obj, MessageDigest messageDigest) {
        c8538c.m14055g(obj, messageDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f14179b.getSize(); i10++) {
            m14056f((C8538c) this.f14179b.keyAt(i10), this.f14179b.valueAt(i10), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m14057c(C8538c c8538c) {
        return this.f14179b.containsKey(c8538c) ? this.f14179b.get(c8538c) : c8538c.m14053c();
    }

    /* renamed from: d */
    public void m14058d(C8539d c8539d) {
        this.f14179b.putAll((SimpleArrayMap) c8539d.f14179b);
    }

    /* renamed from: e */
    public C8539d m14059e(C8538c c8538c, Object obj) {
        this.f14179b.put(c8538c, obj);
        return this;
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C8539d) {
            return this.f14179b.equals(((C8539d) obj).f14179b);
        }
        return false;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        return this.f14179b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f14179b + '}';
    }
}
