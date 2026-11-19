package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.collections.w */
/* loaded from: classes.dex */
final class C2741w implements Map, Serializable, InterfaceC3498a {

    /* renamed from: a */
    @NotNull
    public static final C2741w f10708a = new C2741w();

    private C2741w() {
    }

    /* renamed from: a */
    public boolean m9186a(@NotNull Void value) {
        C2769l.m9241e(value, "value");
        return false;
    }

    @Override // java.util.Map
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(@Nullable Object obj) {
        return null;
    }

    @NotNull
    /* renamed from: c */
    public Set<Map.Entry> m9188c() {
        return C2742x.f10709a;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m9186a((Void) obj);
        }
        return false;
    }

    @NotNull
    /* renamed from: d */
    public Set<Object> m9189d() {
        return C2742x.f10709a;
    }

    /* renamed from: e */
    public int m9190e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m9188c();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @NotNull
    /* renamed from: f */
    public Collection m9191f() {
        return C2740v.f10707a;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void put(Object obj, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m9189d();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m9190e();
    }

    @NotNull
    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m9191f();
    }
}
