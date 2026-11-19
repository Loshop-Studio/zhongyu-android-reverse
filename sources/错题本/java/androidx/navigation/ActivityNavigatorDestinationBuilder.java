package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ActivityNavigator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@NavDestinationDsl
@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB>\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\u001b\u0010\u0012\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR,\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001f\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e¨\u00063"}, m5110d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/ActivityNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/ActivityNavigator;I)V", "", "route", "(Landroidx/navigation/ActivityNavigator;Ljava/lang/String;)V", "Ly6/c;", "", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/ActivityNavigator;Ly6/c;Ljava/util/Map;)V", "build", "()Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "targetPackage", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "Landroid/app/Activity;", "activityClass", "Ly6/c;", "getActivityClass", "()Ly6/c;", "setActivityClass", "(Ly6/c;)V", "action", "getAction", "setAction", "Landroid/net/Uri;", "data", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "dataPattern", "getDataPattern", "setDataPattern", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {

    @Nullable
    private String action;

    @Nullable
    private InterfaceC6779c activityClass;

    @NotNull
    private Context context;

    @Nullable
    private Uri data;

    @Nullable
    private String dataPattern;

    @Nullable
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @ReplaceWith(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator navigator, @IdRes int i) {
        super(navigator, i);
        AbstractC5830k.m5330g(navigator, "navigator");
        this.context = navigator.getContext();
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final InterfaceC6779c getActivityClass() {
        return this.activityClass;
    }

    @Nullable
    public final Uri getData() {
        return this.data;
    }

    @Nullable
    public final String getDataPattern() {
        return this.dataPattern;
    }

    @Nullable
    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final void setActivityClass(@Nullable InterfaceC6779c interfaceC6779c) {
        this.activityClass = interfaceC6779c;
    }

    public final void setData(@Nullable Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(@Nullable String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(@Nullable String str) {
        this.targetPackage = str;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        InterfaceC6779c interfaceC6779c = this.activityClass;
        if (interfaceC6779c != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) AbstractC6675d.m6349m(interfaceC6779c)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator navigator, @NotNull String route) {
        super(navigator, route);
        AbstractC5830k.m5330g(navigator, "navigator");
        AbstractC5830k.m5330g(route, "route");
        this.context = navigator.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator navigator, @NotNull InterfaceC6779c route, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap) {
        super(navigator, route, typeMap);
        AbstractC5830k.m5330g(navigator, "navigator");
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        this.context = navigator.getContext();
    }
}
