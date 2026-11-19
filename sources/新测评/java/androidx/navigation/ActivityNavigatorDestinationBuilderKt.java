package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"androidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt"}, m13559k = 4, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to build your ActivityDestination instead", replaceWith = @ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(NavGraphBuilder navGraphBuilder, @IdRes int i10, Function1<? super ActivityNavigatorDestinationBuilder, Unit> function1) {
        C4047x70fa4890.activity(navGraphBuilder, i10, function1);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, String str, Function1<? super ActivityNavigatorDestinationBuilder, Unit> function1) {
        C4047x70fa4890.activity(navGraphBuilder, str, function1);
    }
}
