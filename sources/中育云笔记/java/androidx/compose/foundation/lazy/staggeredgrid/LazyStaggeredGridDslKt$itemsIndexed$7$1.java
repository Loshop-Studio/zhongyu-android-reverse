package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$7$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC9544p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$7$1(InterfaceC9544p interfaceC9544p, T[] tArr) {
        super(1);
        this.$key = interfaceC9544p;
        this.$items = tArr;
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(Integer.valueOf(i10), this.$items[i10]);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
