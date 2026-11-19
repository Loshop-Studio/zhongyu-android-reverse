package androidx.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"androidx/navigation/NavigatorProviderKt__NavigatorProviderKt", "androidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavigatorProviderKt {
    @NotNull
    public static final <T extends Navigator<? extends NavDestination>> T get(@NotNull NavigatorProvider navigatorProvider, @NotNull String str) {
        return (T) NavigatorProviderKt__NavigatorProviderKt.get(navigatorProvider, str);
    }

    public static final void plusAssign(@NotNull NavigatorProvider navigatorProvider, @NotNull Navigator<? extends NavDestination> navigator) {
        NavigatorProviderKt__NavigatorProviderKt.plusAssign(navigatorProvider, navigator);
    }

    @Nullable
    public static final Navigator<? extends NavDestination> set(@NotNull NavigatorProvider navigatorProvider, @NotNull String str, @NotNull Navigator<? extends NavDestination> navigator) {
        return NavigatorProviderKt__NavigatorProviderKt.set(navigatorProvider, str, navigator);
    }

    @NotNull
    public static final <T extends Navigator<? extends NavDestination>> T get(@NotNull NavigatorProvider navigatorProvider, @NotNull InterfaceC6779c interfaceC6779c) {
        return (T) NavigatorProviderKt__NavigatorProvider_androidKt.get(navigatorProvider, interfaceC6779c);
    }
}
