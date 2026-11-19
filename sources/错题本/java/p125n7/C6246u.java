package p125n7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p160s6.InterfaceC6560a;

@Serializable(with = C6248w.class)
/* renamed from: n7.u */
/* loaded from: classes4.dex */
public final class C6246u extends AbstractC6235j implements Map<String, AbstractC6235j>, InterfaceC6560a {

    @NotNull
    public static final C6245t Companion = new C6245t();

    /* renamed from: a */
    public final Map f9993a;

    public C6246u(Map content) {
        AbstractC5830k.m5330g(content, "content");
        this.f9993a = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC6235j compute(String str, BiFunction<? super String, ? super AbstractC6235j, ? extends AbstractC6235j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC6235j computeIfAbsent(String str, Function<? super String, ? extends AbstractC6235j> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC6235j computeIfPresent(String str, BiFunction<? super String, ? super AbstractC6235j, ? extends AbstractC6235j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        AbstractC5830k.m5330g(key, "key");
        return this.f9993a.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC6235j)) {
            return false;
        }
        AbstractC6235j value = (AbstractC6235j) obj;
        AbstractC5830k.m5330g(value, "value");
        return this.f9993a.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC6235j>> entrySet() {
        return this.f9993a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC5830k.m5325b(this.f9993a, obj);
    }

    @Override // java.util.Map
    public final AbstractC6235j get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        AbstractC5830k.m5330g(key, "key");
        return (AbstractC6235j) this.f9993a.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9993a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9993a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f9993a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC6235j merge(String str, AbstractC6235j abstractC6235j, BiFunction<? super AbstractC6235j, ? super AbstractC6235j, ? extends AbstractC6235j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC6235j put(String str, AbstractC6235j abstractC6235j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC6235j> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC6235j putIfAbsent(String str, AbstractC6235j abstractC6235j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC6235j remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC6235j replace(String str, AbstractC6235j abstractC6235j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC6235j, ? extends AbstractC6235j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9993a.size();
    }

    public final String toString() {
        return AbstractC5805t.m5234n0(this.f9993a.entrySet(), ",", "{", "}", new C6237l(1), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC6235j> values() {
        return this.f9993a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC6235j abstractC6235j, AbstractC6235j abstractC6235j2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
