package kotlin.collections;

import id.InterfaceC9624a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
final class EmptyMap implements Map, Serializable, InterfaceC9624a {

    /* renamed from: c */
    public static final EmptyMap f23281c = new EmptyMap();

    private EmptyMap() {
    }

    private final Object readResolve() {
        return f23281c;
    }

    /* renamed from: a */
    public boolean m20077a(Void value) {
        AbstractC9979u.m20294g(value, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m20077a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set m20079d() {
        return EmptySet.f23282c;
    }

    /* renamed from: e */
    public Set m20080e() {
        return EmptySet.f23282c;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m20079d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public int m20081f() {
        return 0;
    }

    /* renamed from: g */
    public Collection m20082g() {
        return EmptyList.f23280c;
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
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m20080e();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m20081f();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m20082g();
    }
}
