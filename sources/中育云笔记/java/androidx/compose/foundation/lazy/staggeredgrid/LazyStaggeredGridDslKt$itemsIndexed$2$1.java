package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$2$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC9544p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$2$1(InterfaceC9544p interfaceC9544p, List<? extends T> list) {
        super(1);
        this.$key = interfaceC9544p;
        this.$items = list;
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
