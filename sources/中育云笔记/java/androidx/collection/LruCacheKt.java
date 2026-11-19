package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class LruCacheKt {
    private static final long MAX_SIZE = 2147483647L;

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: androidx.collection.LruCacheKt$lruCache$4 */
    public static final class C09994<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC9540l $create;
        final /* synthetic */ InterfaceC9546r $onEntryRemoved;
        final /* synthetic */ InterfaceC9544p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09994(int i10, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r) {
            super(i10);
            this.$sizeOf = interfaceC9544p;
            this.$create = interfaceC9540l;
            this.$onEntryRemoved = interfaceC9546r;
        }

        @Override // androidx.collection.LruCache
        public V create(K key) {
            AbstractC9979u.m20294g(key, "key");
            return (V) this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean z10, K key, V oldValue, V v10) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(z10), key, oldValue, v10);
        }

        @Override // androidx.collection.LruCache
        public int sizeOf(K key, V value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            return ((Number) this.$sizeOf.invoke(key, value)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i10, InterfaceC9544p sizeOf, InterfaceC9540l create, InterfaceC9546r onEntryRemoved) {
        AbstractC9979u.m20294g(sizeOf, "sizeOf");
        AbstractC9979u.m20294g(create, "create");
        AbstractC9979u.m20294g(onEntryRemoved, "onEntryRemoved");
        return new C09994(i10, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i10, InterfaceC9544p sizeOf, InterfaceC9540l create, InterfaceC9546r onEntryRemoved, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sizeOf = new InterfaceC9544p() { // from class: androidx.collection.LruCacheKt.lruCache.1
                @Override // p181hd.InterfaceC9544p
                public final Integer invoke(Object obj2, Object obj3) {
                    AbstractC9979u.m20294g(obj2, "<anonymous parameter 0>");
                    AbstractC9979u.m20294g(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            create = new InterfaceC9540l() { // from class: androidx.collection.LruCacheKt.lruCache.2
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object it) {
                    AbstractC9979u.m20294g(it, "it");
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            onEntryRemoved = new InterfaceC9546r() { // from class: androidx.collection.LruCacheKt.lruCache.3
                public final void invoke(boolean z10, Object obj2, Object obj3, Object obj4) {
                    AbstractC9979u.m20294g(obj2, "<anonymous parameter 1>");
                    AbstractC9979u.m20294g(obj3, "<anonymous parameter 2>");
                }

                @Override // p181hd.InterfaceC9546r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return C10786q.f26013a;
                }
            };
        }
        AbstractC9979u.m20294g(sizeOf, "sizeOf");
        AbstractC9979u.m20294g(create, "create");
        AbstractC9979u.m20294g(onEntryRemoved, "onEntryRemoved");
        return new C09994(i10, sizeOf, create, onEntryRemoved);
    }
}
