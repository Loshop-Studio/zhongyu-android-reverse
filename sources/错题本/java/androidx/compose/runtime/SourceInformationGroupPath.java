package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/compose/runtime/SourceInformationGroupPath;", "", "()V", "getIdentity", "table", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/AnchoredGroupPath;", "Landroidx/compose/runtime/RelativeGroupPath;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
abstract class SourceInformationGroupPath {
    public /* synthetic */ SourceInformationGroupPath(AbstractC5824e abstractC5824e) {
        this();
    }

    @NotNull
    public abstract Object getIdentity(@NotNull SlotTable table);

    private SourceInformationGroupPath() {
    }
}
