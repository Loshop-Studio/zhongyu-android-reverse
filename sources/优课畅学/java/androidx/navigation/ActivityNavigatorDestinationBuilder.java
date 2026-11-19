package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p289w7.AbstractC10360a;

@NavDestinationDsl
/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {
    private String action;
    private InterfaceC8375c activityClass;
    private Context context;
    private Uri data;
    private String dataPattern;
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, @IdRes int i10) {
        super(navigator, i10);
        AbstractC9133u.m16133g(navigator, "navigator");
        this.context = navigator.getContext();
    }

    public final String getAction() {
        return this.action;
    }

    public final InterfaceC8375c getActivityClass() {
        return this.activityClass;
    }

    public final Uri getData() {
        return this.data;
    }

    public final String getDataPattern() {
        return this.dataPattern;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setActivityClass(InterfaceC8375c interfaceC8375c) {
        this.activityClass = interfaceC8375c;
    }

    public final void setData(Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(String str) {
        this.targetPackage = str;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        InterfaceC8375c interfaceC8375c = this.activityClass;
        if (interfaceC8375c != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) AbstractC10360a.m19298a(interfaceC8375c)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, String route) {
        super(navigator, route);
        AbstractC9133u.m16133g(navigator, "navigator");
        AbstractC9133u.m16133g(route, "route");
        this.context = navigator.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, InterfaceC8375c route, Map<InterfaceC8387o, NavType<?>> typeMap) {
        super(navigator, route, typeMap);
        AbstractC9133u.m16133g(navigator, "navigator");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        this.context = navigator.getContext();
    }
}
