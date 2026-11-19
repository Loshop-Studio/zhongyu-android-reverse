package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import gd.AbstractC9293a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

@NavDestinationDsl
/* loaded from: classes.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {
    private String action;
    private InterfaceC10469c activityClass;
    private Context context;
    private Uri data;
    private String dataPattern;
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, @IdRes int i10) {
        super(navigator, i10);
        AbstractC9979u.m20294g(navigator, "navigator");
        this.context = navigator.getContext();
    }

    public final String getAction() {
        return this.action;
    }

    public final InterfaceC10469c getActivityClass() {
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

    public final void setActivityClass(InterfaceC10469c interfaceC10469c) {
        this.activityClass = interfaceC10469c;
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
        InterfaceC10469c interfaceC10469c = this.activityClass;
        if (interfaceC10469c != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) AbstractC9293a.m18324a(interfaceC10469c)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, String route) {
        super(navigator, route);
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(route, "route");
        this.context = navigator.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, InterfaceC10469c route, Map<InterfaceC10481o, NavType<?>> typeMap) {
        super(navigator, route, typeMap);
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.context = navigator.getContext();
    }
}
