package p122h0;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: h0.d */
/* loaded from: classes3.dex */
public final class C8084d implements InterfaceC8082b {

    /* renamed from: b */
    public final ArrayMap f13790b = new CachedHashCodeArrayMap();

    /* renamed from: f */
    public static void m12907f(C8083c c8083c, Object obj, MessageDigest messageDigest) {
        c8083c.m12905g(obj, messageDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        for (int i9 = 0; i9 < this.f13790b.getSize(); i9++) {
            m12907f((C8083c) this.f13790b.keyAt(i9), this.f13790b.valueAt(i9), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m12908c(C8083c c8083c) {
        return this.f13790b.containsKey(c8083c) ? this.f13790b.get(c8083c) : c8083c.m12903c();
    }

    /* renamed from: d */
    public void m12909d(C8084d c8084d) {
        this.f13790b.putAll((SimpleArrayMap) c8084d.f13790b);
    }

    /* renamed from: e */
    public C8084d m12910e(C8083c c8083c, Object obj) {
        this.f13790b.put(c8083c, obj);
        return this;
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C8084d) {
            return this.f13790b.equals(((C8084d) obj).f13790b);
        }
        return false;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        return this.f13790b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f13790b + '}';
    }
}
