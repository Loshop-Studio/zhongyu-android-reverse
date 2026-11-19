package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$4$1 extends Lambda implements InterfaceC10570l {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC10574p $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$4$1(InterfaceC10574p interfaceC10574p, List<? extends T> list) {
        super(1);
        this.$span = interfaceC10574p;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i10) {
        return (StaggeredGridItemSpan) this.$span.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
