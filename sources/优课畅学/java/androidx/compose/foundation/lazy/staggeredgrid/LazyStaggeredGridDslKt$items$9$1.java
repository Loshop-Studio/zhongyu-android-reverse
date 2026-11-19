package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$9$1 extends Lambda implements InterfaceC10570l {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC10570l $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$items$9$1(InterfaceC10570l interfaceC10570l, T[] tArr) {
        super(1);
        this.$span = interfaceC10570l;
        this.$items = tArr;
    }

    public final StaggeredGridItemSpan invoke(int i10) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items[i10]);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
