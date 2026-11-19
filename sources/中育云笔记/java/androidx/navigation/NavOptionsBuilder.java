package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavOptions;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p310qd.AbstractC10793c0;

@NavOptionsDsl
/* loaded from: classes.dex */
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;
    private String popUpToRoute;
    private InterfaceC10469c popUpToRouteClass;
    private Object popUpToRouteObject;
    private boolean restoreState;
    private boolean saveState;
    private final NavOptions.Builder builder = new NavOptions.Builder();

    @IdRes
    private int popUpToId = -1;

    @InterfaceC10770a
    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.navigation.b0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return NavOptionsBuilder.popUpTo$lambda$1((PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(i10, interfaceC9540l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q popUpTo$lambda$1(PopUpToBuilder popUpToBuilder) {
        AbstractC9979u.m20294g(popUpToBuilder, "<this>");
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q popUpTo$lambda$2(PopUpToBuilder popUpToBuilder) {
        AbstractC9979u.m20294g(popUpToBuilder, "<this>");
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q popUpTo$lambda$3(PopUpToBuilder popUpToBuilder) {
        AbstractC9979u.m20294g(popUpToBuilder, "<this>");
        return C10786q.f26013a;
    }

    private final void setPopUpToRoute(String str) {
        if (str != null) {
            if (AbstractC10793c0.m23132h0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteClass(InterfaceC10469c interfaceC10469c) {
        if (interfaceC10469c != null) {
            this.popUpToRouteClass = interfaceC10469c;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteObject(Object obj) {
        if (obj != null) {
            this.popUpToRouteObject = obj;
            this.inclusive = false;
        }
    }

    public final void anim(InterfaceC9540l animBuilder) {
        AbstractC9979u.m20294g(animBuilder, "animBuilder");
        AnimBuilder animBuilder2 = new AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.builder.setEnterAnim(animBuilder2.getEnter()).setExitAnim(animBuilder2.getExit()).setPopEnterAnim(animBuilder2.getPopEnter()).setPopExitAnim(animBuilder2.getPopExit());
    }

    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder = this.builder;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.inclusive, this.saveState);
        } else {
            InterfaceC10469c interfaceC10469c = this.popUpToRouteClass;
            if (interfaceC10469c != null) {
                AbstractC9979u.m20291d(interfaceC10469c);
                builder.setPopUpTo(interfaceC10469c, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    AbstractC9979u.m20291d(obj);
                    builder.setPopUpTo((NavOptions.Builder) obj, this.inclusive, this.saveState);
                } else {
                    builder.setPopUpTo(this.popUpToId, this.inclusive, this.saveState);
                }
            }
        }
        return builder.build();
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    public final int getPopUpTo() {
        return this.popUpToId;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final InterfaceC10469c getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void popUpTo(@IdRes int i10, InterfaceC9540l popUpToBuilder) {
        AbstractC9979u.m20294g(popUpToBuilder, "popUpToBuilder");
        setPopUpToId$navigation_common_release(i10);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final void setLaunchSingleTop(boolean z10) {
        this.launchSingleTop = z10;
    }

    @InterfaceC10770a
    public final void setPopUpTo(int i10) {
        popUpTo$default(this, i10, (InterfaceC9540l) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common_release(int i10) {
        this.popUpToId = i10;
        this.inclusive = false;
    }

    public final void setRestoreState(boolean z10) {
        this.restoreState = z10;
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.navigation.c0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return NavOptionsBuilder.popUpTo$lambda$2((PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(str, interfaceC9540l);
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, InterfaceC9540l popUpToBuilder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            popUpToBuilder = new InterfaceC9540l() { // from class: androidx.navigation.NavOptionsBuilder.popUpTo.3
                public final void invoke(PopUpToBuilder popUpToBuilder2) {
                    AbstractC9979u.m20294g(popUpToBuilder2, "<this>");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PopUpToBuilder) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        AbstractC9979u.m20294g(popUpToBuilder, "popUpToBuilder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        navOptionsBuilder.popUpTo(AbstractC9983y.m20315b(Object.class), popUpToBuilder);
    }

    public final void popUpTo(String route, InterfaceC9540l popUpToBuilder) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRoute(route);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, Object obj, InterfaceC9540l interfaceC9540l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.navigation.d0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj3) {
                    return NavOptionsBuilder.popUpTo$lambda$3((PopUpToBuilder) obj3);
                }
            };
        }
        navOptionsBuilder.popUpTo((NavOptionsBuilder) obj, interfaceC9540l);
    }

    public final /* synthetic */ <T> void popUpTo(InterfaceC9540l popUpToBuilder) {
        AbstractC9979u.m20294g(popUpToBuilder, "popUpToBuilder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        popUpTo(AbstractC9983y.m20315b(Object.class), popUpToBuilder);
    }

    public final <T> void popUpTo(InterfaceC10469c route, InterfaceC9540l popUpToBuilder) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteClass(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final <T> void popUpTo(T route, InterfaceC9540l popUpToBuilder) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteObject(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }
}
