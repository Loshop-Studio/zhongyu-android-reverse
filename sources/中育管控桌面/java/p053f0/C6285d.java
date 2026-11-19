package p053f0;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* renamed from: f0.d */
/* loaded from: classes3.dex */
public final class C6285d implements InterfaceC6283b {

    /* renamed from: b */
    public final ArrayMap f7655b = new CachedHashCodeArrayMap();

    /* renamed from: f */
    public static void m6419f(C6284c c6284c, Object obj, MessageDigest messageDigest) {
        c6284c.m6418g(obj, messageDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        for (int i6 = 0; i6 < this.f7655b.getSize(); i6++) {
            m6419f((C6284c) this.f7655b.keyAt(i6), this.f7655b.valueAt(i6), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m6420c(C6284c c6284c) {
        return this.f7655b.containsKey(c6284c) ? this.f7655b.get(c6284c) : c6284c.m6416c();
    }

    /* renamed from: d */
    public void m6421d(C6285d c6285d) {
        this.f7655b.putAll((SimpleArrayMap) c6285d.f7655b);
    }

    /* renamed from: e */
    public C6285d m6422e(C6284c c6284c, Object obj) {
        this.f7655b.put(c6284c, obj);
        return this;
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C6285d) {
            return this.f7655b.equals(((C6285d) obj).f7655b);
        }
        return false;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        return this.f7655b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f7655b + '}';
    }
}
