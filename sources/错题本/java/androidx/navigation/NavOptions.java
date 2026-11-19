package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteSerializerKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u0001:\u00014B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0017\u0010\t\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b)\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b*\u0010\u0018R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010#R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b2\u00103¨\u00065"}, m5110d2 = {"Landroidx/navigation/NavOptions;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "Ly6/c;", "popUpToRouteClass", "(ZZLy6/c;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "getPopUpTo", "()I", "shouldLaunchSingleTop", "()Z", "shouldRestoreState", "isPopUpToInclusive", "shouldPopUpToSaveState", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Z", "I", "getPopUpToId", "getEnterAnim", "getExitAnim", "getPopEnterAnim", "getPopExitAnim", "value", "Ljava/lang/String;", "getPopUpToRoute", "Ly6/c;", "getPopUpToRouteClass", "()Ly6/c;", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "Builder", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;

    @IdRes
    private final int popUpToId;
    private final boolean popUpToInclusive;

    @Nullable
    private String popUpToRoute;

    @Nullable
    private InterfaceC6779c popUpToRouteClass;

    @Nullable
    private Object popUpToRouteObject;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    @Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0012J.\u0010\u000e\u001a\u00020\u0000\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u000e\u0010\u0014J9\u0010\u000e\u001a\u00020\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0016J3\u0010\u000e\u001a\u00020\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010\u001aJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&¨\u0006/"}, m5110d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "<init>", "()V", "", "singleTop", "setLaunchSingleTop", "(Z)Landroidx/navigation/NavOptions$Builder;", "restoreState", "setRestoreState", "", "destinationId", "inclusive", "saveState", "setPopUpTo", "(IZZ)Landroidx/navigation/NavOptions$Builder;", "", "route", "(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "(ZZ)Landroidx/navigation/NavOptions$Builder;", "Ly6/c;", "(Ly6/c;ZZ)Landroidx/navigation/NavOptions$Builder;", "(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;", "enterAnim", "setEnterAnim", "(I)Landroidx/navigation/NavOptions$Builder;", "exitAnim", "setExitAnim", "popEnterAnim", "setPopEnterAnim", "popExitAnim", "setPopExitAnim", "Landroidx/navigation/NavOptions;", "build", "()Landroidx/navigation/NavOptions;", "Z", "popUpToId", "I", "popUpToRoute", "Ljava/lang/String;", "popUpToRouteClass", "Ly6/c;", "popUpToRouteObject", "Ljava/lang/Object;", "popUpToInclusive", "popUpToSaveState", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavOptions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptions.android.kt\nandroidx/navigation/NavOptions$Builder\n*L\n1#1,481:1\n334#1:482\n208#1:483\n340#1,2:484\n*S KotlinDebug\n*F\n+ 1 NavOptions.android.kt\nandroidx/navigation/NavOptions$Builder\n*L\n-1#1:482\n-1#1:483\n-1#1:484,2\n*E\n"})
    public static final class Builder {
        private boolean popUpToInclusive;

        @Nullable
        private String popUpToRoute;

        @Nullable
        private InterfaceC6779c popUpToRouteClass;

        @Nullable
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

        public static Builder setPopUpTo$default(Builder builder, boolean z8, boolean z9, int i, Object obj) {
            AbstractC5830k.m5338o();
            throw null;
        }

        @NotNull
        public final NavOptions build() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            InterfaceC6779c interfaceC6779c = this.popUpToRouteClass;
            if (interfaceC6779c != null) {
                return new NavOptions(this.singleTop, this.restoreState, interfaceC6779c, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            if (obj == null) {
                return new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            boolean z8 = this.singleTop;
            boolean z9 = this.restoreState;
            AbstractC5830k.m5327d(obj);
            return new NavOptions(z8, z9, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        @NotNull
        public final Builder setEnterAnim(@AnimRes @AnimatorRes int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        @NotNull
        public final Builder setExitAnim(@AnimRes @AnimatorRes int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        @NotNull
        public final Builder setLaunchSingleTop(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        @NotNull
        public final Builder setPopEnterAnim(@AnimRes @AnimatorRes int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        @NotNull
        public final Builder setPopExitAnim(@AnimRes @AnimatorRes int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@IdRes int i, boolean z8) {
            return setPopUpTo$default(this, i, z8, false, 4, (Object) null);
        }

        @NotNull
        public final Builder setRestoreState(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i, boolean z8, boolean z9, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                z9 = false;
            }
            return builder.setPopUpTo(i, z8, z9);
        }

        @JvmOverloads
        @NotNull
        public final <T> Builder setPopUpTo(@NotNull T route, boolean z8) {
            AbstractC5830k.m5330g(route, "route");
            return setPopUpTo$default(this, (Object) route, z8, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z8, boolean z9, int i, Object obj) {
            if ((i & 4) != 0) {
                z9 = false;
            }
            return builder.setPopUpTo(str, z8, z9);
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@Nullable String str, boolean z8) {
            return setPopUpTo$default(this, str, z8, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, InterfaceC6779c interfaceC6779c, boolean z8, boolean z9, int i, Object obj) {
            if ((i & 4) != 0) {
                z9 = false;
            }
            return builder.setPopUpTo(interfaceC6779c, z8, z9);
        }

        @JvmOverloads
        @NotNull
        public final <T> Builder setPopUpTo(@NotNull InterfaceC6779c route, boolean z8) {
            AbstractC5830k.m5330g(route, "route");
            return setPopUpTo$default(this, route, z8, false, 4, (Object) null);
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, Object obj, boolean z8, boolean z9, int i, Object obj2) {
            if ((i & 4) != 0) {
                z9 = false;
            }
            return builder.setPopUpTo((Builder) obj, z8, z9);
        }

        @JvmOverloads
        public final <T> Builder setPopUpTo(boolean z8) {
            AbstractC5830k.m5338o();
            throw null;
        }

        @JvmOverloads
        public final <T> Builder setPopUpTo(boolean inclusive, boolean saveState) {
            AbstractC5830k.m5338o();
            throw null;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@IdRes int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@Nullable String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final <T> Builder setPopUpTo(@NotNull InterfaceC6779c route, boolean inclusive, boolean saveState) {
            AbstractC5830k.m5330g(route, "route");
            this.popUpToRouteClass = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final <T> Builder setPopUpTo(@NotNull T route, boolean inclusive, boolean saveState) {
            AbstractC5830k.m5330g(route, "route");
            this.popUpToRouteObject = route;
            setPopUpTo(RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(AbstractC5832m.m5340a(route.getClass()))), inclusive, saveState);
            return this;
        }
    }

    public NavOptions(boolean z8, boolean z9, @IdRes int i, boolean z10, boolean z11, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11) {
        this.singleTop = z8;
        this.restoreState = z9;
        this.popUpToId = i;
        this.popUpToInclusive = z10;
        this.popUpToSaveState = z11;
        this.enterAnim = i8;
        this.exitAnim = i9;
        this.popEnterAnim = i10;
        this.popExitAnim = i11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavOptions)) {
            NavOptions navOptions = (NavOptions) other;
            if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && AbstractC5830k.m5325b(this.popUpToRoute, navOptions.popUpToRoute) && AbstractC5830k.m5325b(this.popUpToRouteClass, navOptions.popUpToRouteClass) && AbstractC5830k.m5325b(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
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

    @Deprecated(message = "Use popUpToId instead.", replaceWith = @ReplaceWith(expression = "popUpToId", imports = {}))
    @IdRes
    /* renamed from: getPopUpTo, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    @IdRes
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

    public int hashCode() {
        int i = ((((getRestoreState() ? 1 : 0) + ((getSingleTop() ? 1 : 0) * 31)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        InterfaceC6779c interfaceC6779c = this.popUpToRouteClass;
        int iHashCode2 = (iHashCode + (interfaceC6779c != null ? interfaceC6779c.hashCode() : 0)) * 31;
        Object obj = this.popUpToRouteObject;
        return (((((((((getPopUpToSaveState() ? 1 : 0) + (((getPopUpToInclusive() ? 1 : 0) + ((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31)) * 31)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    /* renamed from: isPopUpToInclusive, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    /* renamed from: shouldLaunchSingleTop, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* renamed from: shouldPopUpToSaveState, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* renamed from: shouldRestoreState, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavOptions(");
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
                InterfaceC6779c interfaceC6779c = this.popUpToRouteClass;
                if (interfaceC6779c != null) {
                    sb.append(interfaceC6779c);
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
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    public NavOptions(boolean z8, boolean z9, @Nullable String str, boolean z10, boolean z11, int i, int i8, int i9, int i10) {
        this(z8, z9, NavDestination.INSTANCE.createRoute(str).hashCode(), z10, z11, i, i8, i9, i10);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z8, boolean z9, @Nullable InterfaceC6779c interfaceC6779c, boolean z10, boolean z11, int i, int i8, int i9, int i10) {
        this(z8, z9, RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(interfaceC6779c)), z10, z11, i, i8, i9, i10);
        AbstractC5830k.m5327d(interfaceC6779c);
        this.popUpToRouteClass = interfaceC6779c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z8, boolean z9, @NotNull Object popUpToRouteObject, boolean z10, boolean z11, int i, int i8, int i9, int i10) {
        this(z8, z9, RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(AbstractC5832m.m5340a(popUpToRouteObject.getClass()))), z10, z11, i, i8, i9, i10);
        AbstractC5830k.m5330g(popUpToRouteObject, "popUpToRouteObject");
        this.popUpToRouteObject = popUpToRouteObject;
    }
}
