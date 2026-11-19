package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt$measure$1$30$1 extends Lambda implements InterfaceC9540l {
    public static final LazyStaggeredGridMeasureKt$measure$1$30$1 INSTANCE = new LazyStaggeredGridMeasureKt$measure$1$30$1();

    public LazyStaggeredGridMeasureKt$measure$1$30$1() {
        super(1);
    }

    @Override // p181hd.InterfaceC9540l
    public final CharSequence invoke(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        return String.valueOf(lazyStaggeredGridMeasuredItem.getIndex());
    }
}
