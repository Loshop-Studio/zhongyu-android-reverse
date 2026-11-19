package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p200x6.C6756f;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lx6/f;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "Ld6/s;", "update", "(I)V", "I", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Lx6/f;", "setValue", "(Lx6/f;)V", "value", "lastFirstVisibleItem", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,66:1\n85#2:67\n113#2,2:68\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n32#1:67\n32#1:68,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<C6756f> {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState value;

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState$Companion;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "Lx6/f;", "calculateNearestItemsRange", "(III)Lx6/f;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C6756f calculateNearestItemsRange(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int i = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            return AbstractC5806u.m5260N(Math.max(i - extraItemCount, 0), i + slidingWindowSize + extraItemCount);
        }

        private Companion() {
        }
    }

    public LazyLayoutNearestRangeState(int i, int i8, int i9) {
        this.slidingWindowSize = i8;
        this.extraItemCount = i9;
        this.value = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i, i8, i9), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i;
    }

    private void setValue(C6756f c6756f) {
        this.value.setValue(c6756f);
    }

    public final void update(int firstVisibleItem) {
        if (firstVisibleItem != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = firstVisibleItem;
            setValue(Companion.calculateNearestItemsRange(firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    @NotNull
    public C6756f getValue() {
        return (C6756f) this.value.getValue();
    }
}
