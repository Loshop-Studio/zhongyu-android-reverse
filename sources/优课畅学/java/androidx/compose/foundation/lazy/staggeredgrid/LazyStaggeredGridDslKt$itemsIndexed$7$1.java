package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$7$1 extends Lambda implements InterfaceC10570l {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC10574p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$7$1(InterfaceC10574p interfaceC10574p, T[] tArr) {
        super(1);
        this.$key = interfaceC10574p;
        this.$items = tArr;
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(Integer.valueOf(i10), this.$items[i10]);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
