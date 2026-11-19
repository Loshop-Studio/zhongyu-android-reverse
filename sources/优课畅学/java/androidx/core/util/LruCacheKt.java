package androidx.core.util;

import android.util.LruCache;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes2.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: androidx.core.util.LruCacheKt$lruCache$4 */
    public static final class C34784<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC10570l $create;
        final /* synthetic */ InterfaceC10576r $onEntryRemoved;
        final /* synthetic */ InterfaceC10574p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34784(int i10, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r) {
            super(i10);
            this.$sizeOf = interfaceC10574p;
            this.$create = interfaceC10570l;
            this.$onEntryRemoved = interfaceC10576r;
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

    public static final <K, V> LruCache<K, V> lruCache(int i10, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r) {
        return new C34784(i10, interfaceC10574p, interfaceC10570l, interfaceC10576r);
    }

    public static /* synthetic */ LruCache lruCache$default(int i10, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC10574p = new InterfaceC10574p() { // from class: androidx.core.util.LruCacheKt.lruCache.1
                @Override // p300x7.InterfaceC10574p
                public final Integer invoke(Object obj2, Object obj3) {
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.core.util.LruCacheKt.lruCache.2
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            interfaceC10576r = new InterfaceC10576r() { // from class: androidx.core.util.LruCacheKt.lruCache.3
                public final void invoke(boolean z10, Object obj2, Object obj3, Object obj4) {
                }

                @Override // p300x7.InterfaceC10576r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return C8736p.f16368a;
                }
            };
        }
        return new C34784(i10, interfaceC10574p, interfaceC10570l, interfaceC10576r);
    }
}
