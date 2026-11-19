package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$4$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC9540l $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$4$1(InterfaceC9540l interfaceC9540l, List<? extends T> list) {
        super(1);
        this.$span = interfaceC9540l;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i10) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items.get(i10));
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
