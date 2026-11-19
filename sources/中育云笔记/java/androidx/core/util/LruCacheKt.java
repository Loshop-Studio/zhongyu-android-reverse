package androidx.core.util;

import android.util.LruCache;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: androidx.core.util.LruCacheKt$lruCache$4 */
    public static final class C35084<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC9540l $create;
        final /* synthetic */ InterfaceC9546r $onEntryRemoved;
        final /* synthetic */ InterfaceC9544p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35084(int i10, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r) {
            super(i10);
            this.$sizeOf = interfaceC9544p;
            this.$create = interfaceC9540l;
            this.$onEntryRemoved = interfaceC9546r;
        }

        @Override // android.util.LruCache
        public V create(K k10) {
            return (V) this.$create.invoke(k10);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z10, K k10, V v10, V v11) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z10), k10, v10, v11);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k10, V v10) {
            return ((Number) this.$sizeOf.invoke(k10, v10)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i10, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r) {
        return new C35084(i10, interfaceC9544p, interfaceC9540l, interfaceC9546r);
    }

    public static /* synthetic */ LruCache lruCache$default(int i10, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC9544p = new InterfaceC9544p() { // from class: androidx.core.util.LruCacheKt.lruCache.1
                @Override // p181hd.InterfaceC9544p
                public final Integer invoke(Object obj2, Object obj3) {
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.core.util.LruCacheKt.lruCache.2
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            interfaceC9546r = new InterfaceC9546r() { // from class: androidx.core.util.LruCacheKt.lruCache.3
                public final void invoke(boolean z10, Object obj2, Object obj3, Object obj4) {
                }

                @Override // p181hd.InterfaceC9546r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return C10786q.f26013a;
                }
            };
        }
        return new C35084(i10, interfaceC9544p, interfaceC9540l, interfaceC9546r);
    }
}
