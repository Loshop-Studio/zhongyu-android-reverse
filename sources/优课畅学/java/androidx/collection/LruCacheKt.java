package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes.dex */
public final class LruCacheKt {
    private static final long MAX_SIZE = 2147483647L;

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: androidx.collection.LruCacheKt$lruCache$4 */
    public static final class C09694<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC10570l $create;
        final /* synthetic */ InterfaceC10576r $onEntryRemoved;
        final /* synthetic */ InterfaceC10574p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09694(int i10, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r) {
            super(i10);
            this.$sizeOf = interfaceC10574p;
            this.$create = interfaceC10570l;
            this.$onEntryRemoved = interfaceC10576r;
        }

        @Override // androidx.collection.LruCache
        public V create(K key) {
            AbstractC9133u.m16133g(key, "key");
            return (V) this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean z10, K key, V oldValue, V v10) {
            AbstractC9133u.m16133g(key, "key");
            AbstractC9133u.m16133g(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(z10), key, oldValue, v10);
        }

        @Override // androidx.collection.LruCache
        public int sizeOf(K key, V value) {
            AbstractC9133u.m16133g(key, "key");
            AbstractC9133u.m16133g(value, "value");
            return ((Number) this.$sizeOf.invoke(key, value)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i10, InterfaceC10574p sizeOf, InterfaceC10570l create, InterfaceC10576r onEntryRemoved) {
        AbstractC9133u.m16133g(sizeOf, "sizeOf");
        AbstractC9133u.m16133g(create, "create");
        AbstractC9133u.m16133g(onEntryRemoved, "onEntryRemoved");
        return new C09694(i10, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i10, InterfaceC10574p sizeOf, InterfaceC10570l create, InterfaceC10576r onEntryRemoved, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sizeOf = new InterfaceC10574p() { // from class: androidx.collection.LruCacheKt.lruCache.1
                @Override // p300x7.InterfaceC10574p
                public final Integer invoke(Object obj2, Object obj3) {
                    AbstractC9133u.m16133g(obj2, "<anonymous parameter 0>");
                    AbstractC9133u.m16133g(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            create = new InterfaceC10570l() { // from class: androidx.collection.LruCacheKt.lruCache.2
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object it) {
                    AbstractC9133u.m16133g(it, "it");
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            onEntryRemoved = new InterfaceC10576r() { // from class: androidx.collection.LruCacheKt.lruCache.3
                public final void invoke(boolean z10, Object obj2, Object obj3, Object obj4) {
                    AbstractC9133u.m16133g(obj2, "<anonymous parameter 1>");
                    AbstractC9133u.m16133g(obj3, "<anonymous parameter 2>");
                }

                @Override // p300x7.InterfaceC10576r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return C8736p.f16368a;
                }
            };
        }
        AbstractC9133u.m16133g(sizeOf, "sizeOf");
        AbstractC9133u.m16133g(create, "create");
        AbstractC9133u.m16133g(onEntryRemoved, "onEntryRemoved");
        return new C09694(i10, sizeOf, create, onEntryRemoved);
    }
}
