package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteSerializerKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p123h7.InterfaceC8721a;
import p246s8.AbstractC10067q;

/* loaded from: classes3.dex */
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;

    @IdRes
    private final int popUpToId;
    private final boolean popUpToInclusive;
    private String popUpToRoute;
    private InterfaceC8375c popUpToRouteClass;
    private Object popUpToRouteObject;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    public static final class Builder {
        private boolean popUpToInclusive;
        private String popUpToRoute;
        private InterfaceC8375c popUpToRouteClass;
        private Object popUpToRouteObject;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;

        @IdRes
        private int popUpToId = -1;

        @AnimRes
        @AnimatorRes
        private int enterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int exitAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popEnterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popExitAnim = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return builder.setPopUpTo(i10, z10, z11);
        }

        public final NavOptions build() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            InterfaceC8375c interfaceC8375c = this.popUpToRouteClass;
            if (interfaceC8375c != null) {
                return new NavOptions(this.singleTop, this.restoreState, interfaceC8375c, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            if (obj == null) {
                return new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            boolean z10 = this.singleTop;
            boolean z11 = this.restoreState;
            AbstractC9133u.m16130d(obj);
            return new NavOptions(z10, z11, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final Builder setEnterAnim(@AnimRes @AnimatorRes int i10) {
            this.enterAnim = i10;
            return this;
        }

        public final Builder setExitAnim(@AnimRes @AnimatorRes int i10) {
            this.exitAnim = i10;
            return this;
        }

        public final Builder setLaunchSingleTop(boolean z10) {
            this.singleTop = z10;
            return this;
        }

        public final Builder setPopEnterAnim(@AnimRes @AnimatorRes int i10) {
            this.popEnterAnim = i10;
            return this;
        }

        public final Builder setPopExitAnim(@AnimRes @AnimatorRes int i10) {
            this.popExitAnim = i10;
            return this;
        }

        public final Builder setPopUpTo(@IdRes int i10, boolean z10) {
            return setPopUpTo$default(this, i10, z10, false, 4, (Object) null);
        }

        public final Builder setRestoreState(boolean z10) {
            this.restoreState = z10;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return builder.setPopUpTo(str, z10, z11);
        }

        public final <T> Builder setPopUpTo(InterfaceC8375c route, boolean z10) {
            AbstractC9133u.m16133g(route, "route");
            return setPopUpTo$default(this, route, z10, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
            builder.setPopUpTo(AbstractC9137y.m16154b(Object.class), z10, z11);
            return builder;
        }

        public final <T> Builder setPopUpTo(T route, boolean z10) {
            AbstractC9133u.m16133g(route, "route");
            return setPopUpTo$default(this, (Object) route, z10, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, InterfaceC8375c interfaceC8375c, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return builder.setPopUpTo(interfaceC8375c, z10, z11);
        }

        public final Builder setPopUpTo(String str, boolean z10) {
            return setPopUpTo$default(this, str, z10, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return builder.setPopUpTo((Builder) obj, z10, z11);
        }

        public final Builder setPopUpTo(@IdRes int i10, boolean z10, boolean z11) {
            this.popUpToId = i10;
            this.popUpToRoute = null;
            this.popUpToInclusive = z10;
            this.popUpToSaveState = z11;
            return this;
        }

        public final Builder setPopUpTo(String str, boolean z10, boolean z11) {
            this.popUpToRoute = str;
            this.popUpToId = -1;
            this.popUpToInclusive = z10;
            this.popUpToSaveState = z11;
            return this;
        }

        public final /* synthetic */ <T> Builder setPopUpTo(boolean z10, boolean z11) {
            AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
            setPopUpTo(AbstractC9137y.m16154b(Object.class), z10, z11);
            return this;
        }

        public final <T> Builder setPopUpTo(InterfaceC8375c route, boolean z10, boolean z11) {
            AbstractC9133u.m16133g(route, "route");
            this.popUpToRouteClass = route;
            this.popUpToId = -1;
            this.popUpToInclusive = z10;
            this.popUpToSaveState = z11;
            return this;
        }

        public final <T> Builder setPopUpTo(T route, boolean z10, boolean z11) {
            AbstractC9133u.m16133g(route, "route");
            this.popUpToRouteObject = route;
            setPopUpTo(RouteSerializerKt.generateHashCode(AbstractC10067q.m18778b(AbstractC9137y.m16154b(route.getClass()))), z10, z11);
            return this;
        }

        public final /* synthetic */ <T> Builder setPopUpTo(boolean z10) {
            AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
            setPopUpTo(AbstractC9137y.m16154b(Object.class), z10, false);
            return this;
        }
    }

    public NavOptions(boolean z10, boolean z11, @IdRes int i10, boolean z12, boolean z13, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        this.singleTop = z10;
        this.restoreState = z11;
        this.popUpToId = i10;
        this.popUpToInclusive = z12;
        this.popUpToSaveState = z13;
        this.enterAnim = i11;
        this.exitAnim = i12;
        this.popEnterAnim = i13;
        this.popExitAnim = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavOptions)) {
            NavOptions navOptions = (NavOptions) obj;
            if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && AbstractC9133u.m16128b(this.popUpToRoute, navOptions.popUpToRoute) && AbstractC9133u.m16128b(this.popUpToRouteClass, navOptions.popUpToRouteClass) && AbstractC9133u.m16128b(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    @AnimRes
    @AnimatorRes
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getExitAnim() {
        return this.exitAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    @InterfaceC8721a
    @IdRes
    public final int getPopUpTo() {
        return this.popUpToId;
    }

    @IdRes
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

    public int hashCode() {
        int i10 = (((((shouldLaunchSingleTop() ? 1 : 0) * 31) + (shouldRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        InterfaceC8375c interfaceC8375c = this.popUpToRouteClass;
        int iHashCode2 = (iHashCode + (interfaceC8375c != null ? interfaceC8375c.hashCode() : 0)) * 31;
        Object obj = this.popUpToRouteObject;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (isPopUpToInclusive() ? 1 : 0)) * 31) + (shouldPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final boolean isPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    public final boolean shouldLaunchSingleTop() {
        return this.singleTop;
    }

    public final boolean shouldPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    public final boolean shouldRestoreState() {
        return this.restoreState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavOptions.class.getSimpleName());
        sb.append("(");
        if (this.singleTop) {
            sb.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb.append(str2);
            } else {
                InterfaceC8375c interfaceC8375c = this.popUpToRouteClass;
                if (interfaceC8375c != null) {
                    sb.append(interfaceC8375c);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.enterAnim));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.exitAnim));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.popEnterAnim));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.popExitAnim));
            sb.append(")");
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public NavOptions(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, NavDestination.Companion.createRoute(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z10, boolean z11, InterfaceC8375c interfaceC8375c, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, RouteSerializerKt.generateHashCode(AbstractC10067q.m18778b(interfaceC8375c)), z12, z13, i10, i11, i12, i13);
        AbstractC9133u.m16130d(interfaceC8375c);
        this.popUpToRouteClass = interfaceC8375c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z10, boolean z11, Object popUpToRouteObject, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, RouteSerializerKt.generateHashCode(AbstractC10067q.m18778b(AbstractC9137y.m16154b(popUpToRouteObject.getClass()))), z12, z13, i10, i11, i12, i13);
        AbstractC9133u.m16133g(popUpToRouteObject, "popUpToRouteObject");
        this.popUpToRouteObject = popUpToRouteObject;
    }
}
