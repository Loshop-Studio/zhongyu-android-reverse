package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt$measure$1$30$1 extends Lambda implements InterfaceC10570l {
    public static final LazyStaggeredGridMeasureKt$measure$1$30$1 INSTANCE = new LazyStaggeredGridMeasureKt$measure$1$30$1();

    public LazyStaggeredGridMeasureKt$measure$1$30$1() {
        super(1);
    }

    @Override // p300x7.InterfaceC10570l
    public final CharSequence invoke(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        return String.valueOf(lazyStaggeredGridMeasuredItem.getIndex());
    }
}
