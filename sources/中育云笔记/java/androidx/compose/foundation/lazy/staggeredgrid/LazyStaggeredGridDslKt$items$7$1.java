package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$7$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC9540l $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$items$7$1(InterfaceC9540l interfaceC9540l, T[] tArr) {
        super(1);
        this.$key = interfaceC9540l;
        this.$items = tArr;
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(this.$items[i10]);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
