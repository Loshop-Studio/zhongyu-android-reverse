package androidx.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"androidx/navigation/NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavDeepLinkDslBuilderKt {
    @NotNull
    public static final NavDeepLink navDeepLink(@NotNull InterfaceC6471c interfaceC6471c) {
        return NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink(interfaceC6471c);
    }

    @JvmOverloads
    @NotNull
    public static final <T> NavDeepLink navDeepLink(@NotNull InterfaceC6779c interfaceC6779c, @NotNull String str, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink(interfaceC6779c, str, map, interfaceC6471c);
    }

    @JvmOverloads
    @NotNull
    public static final <T> NavDeepLink navDeepLink(@NotNull InterfaceC6779c interfaceC6779c, @NotNull String str, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt.navDeepLink(interfaceC6779c, str, interfaceC6471c);
    }
}
