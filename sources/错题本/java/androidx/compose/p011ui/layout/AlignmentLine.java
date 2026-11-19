package androidx.compose.p011ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Immutable
@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0001\nB#\b\u0004\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m5110d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "Lkotlin/Function2;", "", "merger", "<init>", "(Lr6/e;)V", "Lr6/e;", "getMerger$ui_release", "()Lr6/e;", "Companion", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final int Unspecified = Integer.MIN_VALUE;

    @NotNull
    private final InterfaceC6473e merger;

    public /* synthetic */ AlignmentLine(InterfaceC6473e interfaceC6473e, AbstractC5824e abstractC5824e) {
        this(interfaceC6473e);
    }

    @NotNull
    /* renamed from: getMerger$ui_release, reason: from getter */
    public final InterfaceC6473e getMerger() {
        return this.merger;
    }

    private AlignmentLine(InterfaceC6473e interfaceC6473e) {
        this.merger = interfaceC6473e;
    }
}
