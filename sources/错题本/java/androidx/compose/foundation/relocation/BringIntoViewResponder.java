package androidx.compose.foundation.relocation;

import androidx.compose.p011ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;

@Deprecated(message = "Use BringIntoViewModifierNode instead")
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "", "Landroidx/compose/ui/geometry/Rect;", "localRect", "calculateRectForParent", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Lkotlin/Function0;", "Ld6/s;", "bringChildIntoView", "(Lr6/a;Lh6/c;)Ljava/lang/Object;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    @Nullable
    Object bringChildIntoView(@NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);

    @NotNull
    Rect calculateRectForParent(@NotNull Rect localRect);
}
