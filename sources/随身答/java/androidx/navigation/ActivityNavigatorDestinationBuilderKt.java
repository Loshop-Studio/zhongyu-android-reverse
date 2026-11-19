package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13412d1 = {"androidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt"}, m13414k = 4, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to build your ActivityDestination instead", replaceWith = @ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(NavGraphBuilder navGraphBuilder, @IdRes int i9, Function1<? super ActivityNavigatorDestinationBuilder, Unit> function1) {
        C4194x70fa4890.activity(navGraphBuilder, i9, function1);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, String str, Function1<? super ActivityNavigatorDestinationBuilder, Unit> function1) {
        C4194x70fa4890.activity(navGraphBuilder, str, function1);
    }
}
