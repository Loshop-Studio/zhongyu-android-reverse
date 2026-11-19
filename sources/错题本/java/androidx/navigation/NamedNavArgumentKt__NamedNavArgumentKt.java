package androidx.navigation;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/navigation/NamedNavArgument;", "navArgument", "(Ljava/lang/String;Lr6/c;)Landroidx/navigation/NamedNavArgument;", "navigation-common_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/NamedNavArgumentKt")
/* loaded from: classes2.dex */
final /* synthetic */ class NamedNavArgumentKt__NamedNavArgumentKt {
    @NotNull
    public static final NamedNavArgument navArgument(@NotNull String name, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(builder, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        builder.invoke(navArgumentBuilder);
        return new NamedNavArgument(name, navArgumentBuilder.build());
    }
}
