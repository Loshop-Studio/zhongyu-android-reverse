package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt$measure$1$30$1 extends Lambda implements InterfaceC6471c {
    public static final LazyStaggeredGridMeasureKt$measure$1$30$1 INSTANCE = new LazyStaggeredGridMeasureKt$measure$1$30$1();

    public LazyStaggeredGridMeasureKt$measure$1$30$1() {
        super(1);
    }

    @Override // p152r6.InterfaceC6471c
    public final CharSequence invoke(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        return String.valueOf(lazyStaggeredGridMeasuredItem.getIndex());
    }
}
