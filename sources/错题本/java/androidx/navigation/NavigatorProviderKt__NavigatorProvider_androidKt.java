package androidx.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavigatorProvider;", "Ly6/c;", "clazz", "get", "(Landroidx/navigation/NavigatorProvider;Ly6/c;)Landroidx/navigation/Navigator;", "navigation-common_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/NavigatorProviderKt")
/* loaded from: classes2.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProvider_androidKt {
    @NotNull
    public static final <T extends Navigator<? extends NavDestination>> T get(@NotNull NavigatorProvider navigatorProvider, @NotNull InterfaceC6779c clazz) {
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(AbstractC6675d.m6349m(clazz));
    }
}
