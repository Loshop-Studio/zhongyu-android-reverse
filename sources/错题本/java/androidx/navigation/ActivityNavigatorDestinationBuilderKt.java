package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"androidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to build your ActivityDestination instead", replaceWith = @ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(@NotNull NavGraphBuilder navGraphBuilder, @IdRes int i, @NotNull InterfaceC6471c interfaceC6471c) {
        C2821x70fa4890.activity(navGraphBuilder, i, interfaceC6471c);
    }

    public static final void activity(@NotNull NavGraphBuilder navGraphBuilder, @NotNull String str, @NotNull InterfaceC6471c interfaceC6471c) {
        C2821x70fa4890.activity(navGraphBuilder, str, interfaceC6471c);
    }
}
