package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0082\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, m5110d2 = {"", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Ld6/s;", "onEntryRemoved", "Landroidx/collection/LruCache;", "lruCache", "(ILr6/e;Lr6/c;Lr6/g;)Landroidx/collection/LruCache;", "", "MAX_SIZE", "J", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LruCacheKt {
    private static final long MAX_SIZE = 2147483647L;

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    @Metadata(m5109d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Ld6/s;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.collection.LruCacheKt$lruCache$4 */
    public static final class C05674<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC6471c $create;
        final /* synthetic */ InterfaceC6475g $onEntryRemoved;
        final /* synthetic */ InterfaceC6473e $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05674(int i, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c, InterfaceC6475g interfaceC6475g) {
            super(i);
            this.$sizeOf = interfaceC6473e;
            this.$create = interfaceC6471c;
            this.$onEntryRemoved = interfaceC6475g;
        }

        @Override // androidx.collection.LruCache
        public V create(K key) {
            AbstractC5830k.m5330g(key, "key");
            return (V) this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
            AbstractC5830k.m5330g(key, "key");
            AbstractC5830k.m5330g(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(evicted), key, oldValue, newValue);
        }

        @Override // androidx.collection.LruCache
        public int sizeOf(K key, V value) {
            AbstractC5830k.m5330g(key, "key");
            AbstractC5830k.m5330g(value, "value");
            return ((Number) this.$sizeOf.invoke(key, value)).intValue();
        }
    }

    @NotNull
    public static final <K, V> LruCache<K, V> lruCache(int i, @NotNull InterfaceC6473e sizeOf, @NotNull InterfaceC6471c create, @NotNull InterfaceC6475g onEntryRemoved) {
        AbstractC5830k.m5330g(sizeOf, "sizeOf");
        AbstractC5830k.m5330g(create, "create");
        AbstractC5830k.m5330g(onEntryRemoved, "onEntryRemoved");
        return new C05674(i, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, InterfaceC6473e sizeOf, InterfaceC6471c create, InterfaceC6475g onEntryRemoved, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            sizeOf = new InterfaceC6473e() { // from class: androidx.collection.LruCacheKt.lruCache.1
                @Override // p152r6.InterfaceC6473e
                public final Integer invoke(Object obj2, Object obj3) {
                    AbstractC5830k.m5330g(obj2, "<anonymous parameter 0>");
                    AbstractC5830k.m5330g(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i8 & 4) != 0) {
            create = new InterfaceC6471c() { // from class: androidx.collection.LruCacheKt.lruCache.2
                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object it) {
                    AbstractC5830k.m5330g(it, "it");
                    return null;
                }
            };
        }
        if ((i8 & 8) != 0) {
            onEntryRemoved = new InterfaceC6475g() { // from class: androidx.collection.LruCacheKt.lruCache.3
                public final void invoke(boolean z8, Object obj2, Object obj3, Object obj4) {
                    AbstractC5830k.m5330g(obj2, "<anonymous parameter 1>");
                    AbstractC5830k.m5330g(obj3, "<anonymous parameter 2>");
                }

                @Override // p152r6.InterfaceC6475g
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return C5443s.f8405a;
                }
            };
        }
        AbstractC5830k.m5330g(sizeOf, "sizeOf");
        AbstractC5830k.m5330g(create, "create");
        AbstractC5830k.m5330g(onEntryRemoved, "onEntryRemoved");
        return new C05674(i, sizeOf, create, onEntryRemoved);
    }
}
