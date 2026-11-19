package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavOptions;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u000fJ:\u0010\u000b\u001a\u00020\b\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0019\b\n\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011J>\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u0013J:\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u0014J&\u0010\u0017\u001a\u00020\b2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R*\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R.\u00100\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010!R\u0016\u00107\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010!R6\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010>\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010\u000b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010-\"\u0004\bE\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006G"}, m5110d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "popUpToBuilder", "popUpTo", "(ILr6/c;)V", "", "route", "(Ljava/lang/String;Lr6/c;)V", ExifInterface.GPS_DIRECTION_TRUE, "(Lr6/c;)V", "Ly6/c;", "(Ly6/c;Lr6/c;)V", "(Ljava/lang/Object;Lr6/c;)V", "Landroidx/navigation/AnimBuilder;", "animBuilder", "anim", "Landroidx/navigation/NavOptions;", "build$navigation_common_release", "()Landroidx/navigation/NavOptions;", "build", "Landroidx/navigation/NavOptions$Builder;", "builder", "Landroidx/navigation/NavOptions$Builder;", "", "launchSingleTop", "Z", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "restoreState", "getRestoreState", "setRestoreState", "value", "popUpToId", "I", "getPopUpToId", "()I", "setPopUpToId$navigation_common_release", "(I)V", "popUpToRoute", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "setPopUpToRoute", "(Ljava/lang/String;)V", "inclusive", "saveState", "popUpToRouteClass", "Ly6/c;", "getPopUpToRouteClass", "()Ly6/c;", "setPopUpToRouteClass", "(Ly6/c;)V", "popUpToRouteObject", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "setPopUpToRouteObject", "(Ljava/lang/Object;)V", "getPopUpTo", "setPopUpTo", "getPopUpTo$annotations", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@NavOptionsDsl
@SourceDebugExtension({"SMAP\nNavOptionsBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.android.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
/* loaded from: classes2.dex */
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;

    @Nullable
    private String popUpToRoute;

    @Nullable
    private InterfaceC6779c popUpToRouteClass;

    @Nullable
    private Object popUpToRouteObject;
    private boolean restoreState;
    private boolean saveState;

    @NotNull
    private final NavOptions.Builder builder = new NavOptions.Builder();

    @IdRes
    private int popUpToId = -1;

    @Deprecated(message = "Use the popUpToId property.")
    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC6471c = new C2826a(10);
        }
        navOptionsBuilder.popUpTo(i, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s popUpTo$lambda$1(PopUpToBuilder popUpToBuilder) {
        AbstractC5830k.m5330g(popUpToBuilder, "<this>");
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s popUpTo$lambda$2(PopUpToBuilder popUpToBuilder) {
        AbstractC5830k.m5330g(popUpToBuilder, "<this>");
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s popUpTo$lambda$3(PopUpToBuilder popUpToBuilder) {
        AbstractC5830k.m5330g(popUpToBuilder, "<this>");
        return C5443s.f8405a;
    }

    private final void setPopUpToRoute(String str) {
        if (str != null) {
            if (AbstractC5855p.m5382P(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteClass(InterfaceC6779c interfaceC6779c) {
        if (interfaceC6779c != null) {
            this.popUpToRouteClass = interfaceC6779c;
            this.inclusive = false;
        }
    }

    private final void setPopUpToRouteObject(Object obj) {
        if (obj != null) {
            this.popUpToRouteObject = obj;
            this.inclusive = false;
        }
    }

    public final void anim(@NotNull InterfaceC6471c animBuilder) {
        AbstractC5830k.m5330g(animBuilder, "animBuilder");
        AnimBuilder animBuilder2 = new AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.builder.setEnterAnim(animBuilder2.getEnter()).setExitAnim(animBuilder2.getExit()).setPopEnterAnim(animBuilder2.getPopEnter()).setPopExitAnim(animBuilder2.getPopExit());
    }

    @NotNull
    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder = this.builder;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.inclusive, this.saveState);
        } else {
            InterfaceC6779c interfaceC6779c = this.popUpToRouteClass;
            if (interfaceC6779c != null) {
                AbstractC5830k.m5327d(interfaceC6779c);
                builder.setPopUpTo(interfaceC6779c, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    AbstractC5830k.m5327d(obj);
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

    /* renamed from: getPopUpTo, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    @Nullable
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    @Nullable
    public final InterfaceC6779c getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    @Nullable
    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void popUpTo(@IdRes int id, @NotNull InterfaceC6471c popUpToBuilder) {
        AbstractC5830k.m5330g(popUpToBuilder, "popUpToBuilder");
        setPopUpToId$navigation_common_release(id);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final void setLaunchSingleTop(boolean z8) {
        this.launchSingleTop = z8;
    }

    @Deprecated(message = "Use the popUpTo function and passing in the id.")
    public final void setPopUpTo(int i) {
        popUpTo$default(this, i, (InterfaceC6471c) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common_release(int i) {
        this.popUpToId = i;
        this.inclusive = false;
    }

    public final void setRestoreState(boolean z8) {
        this.restoreState = z8;
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = new C2826a(11);
        }
        navOptionsBuilder.popUpTo(str, interfaceC6471c);
    }

    public static void popUpTo$default(NavOptionsBuilder navOptionsBuilder, InterfaceC6471c popUpToBuilder, int i, Object obj) {
        if ((i & 1) != 0) {
            popUpToBuilder = new InterfaceC6471c() { // from class: androidx.navigation.NavOptionsBuilder.popUpTo.3
                public final void invoke(PopUpToBuilder popUpToBuilder2) {
                    AbstractC5830k.m5330g(popUpToBuilder2, "<this>");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PopUpToBuilder) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        AbstractC5830k.m5330g(popUpToBuilder, "popUpToBuilder");
        AbstractC5830k.m5338o();
        throw null;
    }

    public final void popUpTo(@NotNull String route, @NotNull InterfaceC6471c popUpToBuilder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRoute(route);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, Object obj, InterfaceC6471c interfaceC6471c, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC6471c = new C2826a(12);
        }
        navOptionsBuilder.popUpTo((NavOptionsBuilder) obj, interfaceC6471c);
    }

    public final <T> void popUpTo(@NotNull InterfaceC6779c route, @NotNull InterfaceC6471c popUpToBuilder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteClass(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final <T> void popUpTo(@NotNull T route, @NotNull InterfaceC6471c popUpToBuilder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteObject(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final <T> void popUpTo(InterfaceC6471c popUpToBuilder) {
        AbstractC5830k.m5330g(popUpToBuilder, "popUpToBuilder");
        AbstractC5830k.m5338o();
        throw null;
    }
}
