package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavOptions;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

@NavOptionsDsl
/* loaded from: classes3.dex */
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;
    private String popUpToRoute;
    private InterfaceC8375c popUpToRouteClass;
    private Object popUpToRouteObject;
    private boolean restoreState;
    private boolean saveState;
    private final NavOptions.Builder builder = new NavOptions.Builder();

    @IdRes
    private int popUpToId = -1;

    @InterfaceC8721a
    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i10, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.navigation.b0
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return NavOptionsBuilder.popUpTo$lambda$1((PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(i10, interfaceC10570l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p popUpTo$lambda$1(PopUpToBuilder popUpToBuilder) {
        AbstractC9133u.m16133g(popUpToBuilder, "<this>");
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p popUpTo$lambda$2(PopUpToBuilder popUpToBuilder) {
        AbstractC9133u.m16133g(popUpToBuilder, "<this>");
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p popUpTo$lambda$3(PopUpToBuilder popUpToBuilder) {
        AbstractC9133u.m16133g(popUpToBuilder, "<this>");
        return C8736p.f16368a;
    }

    private final void setPopUpToRoute(String str) {
        if (str != null) {
            if (AbstractC8661c0.m13993h0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteClass(InterfaceC8375c interfaceC8375c) {
        if (interfaceC8375c != null) {
            this.popUpToRouteClass = interfaceC8375c;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteObject(Object obj) {
        if (obj != null) {
            this.popUpToRouteObject = obj;
            this.inclusive = false;
        }
    }

    public final void anim(InterfaceC10570l animBuilder) {
        AbstractC9133u.m16133g(animBuilder, "animBuilder");
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
            InterfaceC8375c interfaceC8375c = this.popUpToRouteClass;
            if (interfaceC8375c != null) {
                AbstractC9133u.m16130d(interfaceC8375c);
                builder.setPopUpTo(interfaceC8375c, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    AbstractC9133u.m16130d(obj);
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

    public final InterfaceC8375c getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void popUpTo(@IdRes int i10, InterfaceC10570l popUpToBuilder) {
        AbstractC9133u.m16133g(popUpToBuilder, "popUpToBuilder");
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

    @InterfaceC8721a
    public final void setPopUpTo(int i10) {
        popUpTo$default(this, i10, (InterfaceC10570l) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common_release(int i10) {
        this.popUpToId = i10;
        this.inclusive = false;
    }

    public final void setRestoreState(boolean z10) {
        this.restoreState = z10;
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.navigation.c0
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return NavOptionsBuilder.popUpTo$lambda$2((PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(str, interfaceC10570l);
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, InterfaceC10570l popUpToBuilder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            popUpToBuilder = new InterfaceC10570l() { // from class: androidx.navigation.NavOptionsBuilder.popUpTo.3
                public final void invoke(PopUpToBuilder popUpToBuilder2) {
                    AbstractC9133u.m16133g(popUpToBuilder2, "<this>");
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PopUpToBuilder) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        AbstractC9133u.m16133g(popUpToBuilder, "popUpToBuilder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        navOptionsBuilder.popUpTo(AbstractC9137y.m16154b(Object.class), popUpToBuilder);
    }

    public final void popUpTo(String route, InterfaceC10570l popUpToBuilder) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRoute(route);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, Object obj, InterfaceC10570l interfaceC10570l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.navigation.d0
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj3) {
                    return NavOptionsBuilder.popUpTo$lambda$3((PopUpToBuilder) obj3);
                }
            };
        }
        navOptionsBuilder.popUpTo((NavOptionsBuilder) obj, interfaceC10570l);
    }

    public final /* synthetic */ <T> void popUpTo(InterfaceC10570l popUpToBuilder) {
        AbstractC9133u.m16133g(popUpToBuilder, "popUpToBuilder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        popUpTo(AbstractC9137y.m16154b(Object.class), popUpToBuilder);
    }

    public final <T> void popUpTo(InterfaceC8375c route, InterfaceC10570l popUpToBuilder) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteClass(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final <T> void popUpTo(T route, InterfaceC10570l popUpToBuilder) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteObject(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }
}
