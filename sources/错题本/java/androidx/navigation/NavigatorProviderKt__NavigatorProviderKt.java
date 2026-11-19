package androidx.navigation;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a6\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a$\u0010\f\u001a\u00020\u000b*\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavigatorProvider;", "", HintConstants.AUTOFILL_HINT_NAME, "get", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;)Landroidx/navigation/Navigator;", "navigator", "set", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "Ld6/s;", "plusAssign", "(Landroidx/navigation/NavigatorProvider;Landroidx/navigation/Navigator;)V", "navigation-common_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/NavigatorProviderKt")
/* loaded from: classes2.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProviderKt {
    @NotNull
    public static final <T extends Navigator<? extends NavDestination>> T get(@NotNull NavigatorProvider navigatorProvider, @NotNull String name) {
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(@NotNull NavigatorProvider navigatorProvider, @NotNull Navigator<? extends NavDestination> navigator) {
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    @Nullable
    public static final Navigator<? extends NavDestination> set(@NotNull NavigatorProvider navigatorProvider, @NotNull String name, @NotNull Navigator<? extends NavDestination> navigator) {
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }
}
