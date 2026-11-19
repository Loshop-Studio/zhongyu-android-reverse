package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00062\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\t\u0010\b\u0082\u0001\u0001\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/runtime/PausedComposition;", "setPausableContent", "(Lr6/e;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "Landroidx/compose/runtime/CompositionImpl;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface PausableComposition extends ReusableComposition {
    @NotNull
    PausedComposition setPausableContent(@NotNull InterfaceC6473e content);

    @NotNull
    PausedComposition setPausableContentWithReuse(@NotNull InterfaceC6473e content);
}
