package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ Object[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(Object[] objArr) {
        super(1);
        this.$items = objArr;
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i10) {
        Object obj = this.$items[i10];
        return null;
    }
}
