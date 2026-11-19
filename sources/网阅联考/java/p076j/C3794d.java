package p076j;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: j.d */
/* loaded from: classes2.dex */
public final class C3794d implements InterfaceC3792b {

    /* renamed from: b */
    public final ArrayMap f4543b = new CachedHashCodeArrayMap();

    /* renamed from: f */
    public static void m4950f(C3793c c3793c, Object obj, MessageDigest messageDigest) {
        c3793c.m4948g(obj, messageDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        for (int i4 = 0; i4 < this.f4543b.size(); i4++) {
            m4950f((C3793c) this.f4543b.keyAt(i4), this.f4543b.valueAt(i4), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m4951c(C3793c c3793c) {
        return this.f4543b.containsKey(c3793c) ? this.f4543b.get(c3793c) : c3793c.m4946c();
    }

    /* renamed from: d */
    public void m4952d(C3794d c3794d) {
        this.f4543b.putAll((SimpleArrayMap) c3794d.f4543b);
    }

    /* renamed from: e */
    public C3794d m4953e(C3793c c3793c, Object obj) {
        this.f4543b.put(c3793c, obj);
        return this;
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (obj instanceof C3794d) {
            return this.f4543b.equals(((C3794d) obj).f4543b);
        }
        return false;
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        return this.f4543b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f4543b + '}';
    }
}
