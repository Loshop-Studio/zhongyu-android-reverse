package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SavedStateReader;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDeepLink;
import androidx.navigation.common.C2829R;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.serialization.RouteSerializerKt;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p214z6.AbstractC6833k;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\b\b\u0016\u0018\u0000 {2\u00020\u0001:\u0003|}{B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0019\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020%2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\u000e\u0010*\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0017¢\u0006\u0004\b-\u0010.J\u0019\u00102\u001a\u0004\u0018\u0001012\b\b\u0001\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103J!\u00106\u001a\u00020\r2\b\b\u0001\u00104\u001a\u00020/2\b\b\u0001\u00105\u001a\u00020/¢\u0006\u0004\b6\u00107J\u001f\u00106\u001a\u00020\r2\b\b\u0001\u00104\u001a\u00020/2\u0006\u00108\u001a\u000201¢\u0006\u0004\b6\u00109J\u0017\u0010:\u001a\u00020\r2\b\b\u0001\u00104\u001a\u00020/¢\u0006\u0004\b:\u0010;J\u001d\u0010?\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u0002¢\u0006\u0004\bA\u0010\u0005J'\u0010C\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)2\u000e\u0010B\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0007¢\u0006\u0004\bC\u0010DJ'\u0010F\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u000e\u0010E\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0002H\u0016¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\u00122\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020/H\u0016¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010IR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR.\u0010V\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010T8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010]\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u0002010c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020=0f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR&\u00100\u001a\u00020/2\b\b\u0001\u0010U\u001a\u00020/8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010N\"\u0004\bj\u0010;R/\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010k\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bl\u0010I\"\u0004\bm\u0010\u0005*\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010IR/\u0010u\u001a\u0004\u0018\u00010\u00022\b\u0010k\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\br\u0010I\"\u0004\bs\u0010\u0005*\u0004\bt\u0010oR!\u0010z\u001a\b\u0012\u0004\u0012\u00020\u001a0v8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bw\u0010x*\u0004\by\u0010o¨\u0006~"}, m5110d2 = {"Landroidx/navigation/NavDestination;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Ld6/s;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/net/Uri;", "deepLink", "", "hasDeepLink", "(Landroid/net/Uri;)Z", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "uriPattern", "addDeepLink", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "(Landroidx/navigation/NavDeepLink;)V", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "navDeepLinkRequest", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "previousDestination", "", "buildDeepLinkIds", "(Landroidx/navigation/NavDestination;)[I", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "hasRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "supportsActions", "()Z", "", "id", "Landroidx/navigation/NavAction;", "getAction", "(I)Landroidx/navigation/NavAction;", "actionId", "destId", "putAction", "(II)V", "action", "(ILandroidx/navigation/NavAction;)V", "removeAction", "(I)V", "argumentName", "Landroidx/navigation/NavArgument;", "argument", "addArgument", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "removeArgument", "args", "addInDefaultArgs", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "bundle", "fillInLabel", "(Landroid/content/Context;Landroid/os/Bundle;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getNavigatorName", "Landroidx/navigation/internal/NavDestinationImpl;", "impl", "Landroidx/navigation/internal/NavDestinationImpl;", "Landroidx/navigation/NavGraph;", "value", "parent", "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "Landroidx/collection/SparseArrayCompat;", "actions", "Landroidx/collection/SparseArrayCompat;", "", "getArguments", "()Ljava/util/Map;", "getId", "setId", "<set-?>", "getRoute", "setRoute", "getRoute$delegate", "(Landroidx/navigation/NavDestination;)Ljava/lang/Object;", "getDisplayName", "displayName", "getIdName", "setIdName", "getIdName$delegate", "idName", "", "getDeepLinks", "()Ljava/util/List;", "getDeepLinks$delegate", "deepLinks", "Companion", "ClassType", "DeepLinkMatch", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavDestination.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,515:1\n233#2,3:516\n1557#3:519\n1628#3,3:520\n1863#3,2:529\n1863#3,2:534\n1#4:523\n90#5:524\n90#5:532\n1228#6,2:525\n1228#6,2:527\n32#7:531\n33#7:533\n*S KotlinDebug\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination\n*L\n138#1:516,3\n224#1:519\n224#1:520,3\n402#1:529,2\n412#1:534,2\n331#1:524\n410#1:532\n383#1:525,2\n387#1:527,2\n407#1:531\n407#1:533\n*E\n"})
/* loaded from: classes2.dex */
public class NavDestination {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Class<?>> classes = new LinkedHashMap();

    @NotNull
    private final SparseArrayCompat<NavAction> actions;

    @NotNull
    private final NavDestinationImpl impl;

    @Nullable
    private CharSequence label;

    @NotNull
    private final String navigatorName;

    @Nullable
    private NavGraph parent;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "Ly6/c;", "value", "<init>", "(Ly6/c;)V", "()Ljava/lang/Class;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface ClassType {
        Class<?> value();
    }

    @Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\tH\u0005¢\u0006\u0004\b\u000b\u0010\fJA\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u0018\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u0001*\u00020\u0017H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0016*\u00020\u0001*\u00020\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u0019\u0010\u001cR$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d*\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m5110d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "<init>", "()V", "C", "Landroid/content/Context;", "context", "", HintConstants.AUTOFILL_HINT_NAME, "Ljava/lang/Class;", "expectedClassType", "parseClassFromName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;", "parseClassFromNameInternal", "Landroidx/navigation/internal/NavContext;", "", "id", "getDisplayName", "(Landroidx/navigation/internal/NavContext;I)Ljava/lang/String;", "route", "createRoute", "(Ljava/lang/String;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavDestination;", "", "hasRoute", "(Landroidx/navigation/NavDestination;)Z", "Ly6/c;", "(Landroidx/navigation/NavDestination;Ly6/c;)Z", "Lz6/h;", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lz6/h;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "classes", "Ljava/util/Map;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination _get_hierarchy_$lambda$1(NavDestination it) {
            AbstractC5830k.m5330g(it, "it");
            return it.getParent();
        }

        @JvmStatic
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final String createRoute(@Nullable String route) {
            return route != null ? "android-app://androidx.navigation/".concat(route) : "";
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final String getDisplayName(@NotNull NavContext context, int id) {
            AbstractC5830k.m5330g(context, "context");
            return id <= 16777215 ? String.valueOf(id) : context.getResourceName(id);
        }

        @NotNull
        public final InterfaceC6830h getHierarchy(@NotNull NavDestination navDestination) {
            AbstractC5830k.m5330g(navDestination, "<this>");
            return AbstractC6833k.m6495v(navDestination, new C2826a(7));
        }

        @JvmStatic
        public final <T> boolean hasRoute(NavDestination navDestination) {
            AbstractC5830k.m5330g(navDestination, "<this>");
            AbstractC5830k.m5338o();
            throw null;
        }

        @JvmStatic
        @NotNull
        public final <C> Class<? extends C> parseClassFromName(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
            String str;
            AbstractC5830k.m5330g(context, "context");
            AbstractC5830k.m5330g(name, "name");
            AbstractC5830k.m5330g(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, cls);
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            AbstractC5830k.m5327d(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final <C> Class<? extends C> parseClassFromNameInternal(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
            AbstractC5830k.m5330g(context, "context");
            AbstractC5830k.m5330g(name, "name");
            AbstractC5830k.m5330g(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        private Companion() {
        }

        @JvmStatic
        public final <T> boolean hasRoute(@NotNull NavDestination navDestination, @NotNull InterfaceC6779c route) {
            AbstractC5830k.m5330g(navDestination, "<this>");
            AbstractC5830k.m5330g(route, "route");
            return RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(route)) == navDestination.getId();
        }
    }

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m5110d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "isExactDeepLink", "", "matchingPathSegments", "", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "hasMatchingArgs", "arguments", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nNavDestination.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n90#2:516\n90#2:518\n1863#3:517\n1864#3:519\n*S KotlinDebug\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n80#1:516\n100#1:518\n98#1:517\n98#1:519\n*E\n"})
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        @NotNull
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;

        @Nullable
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(@NotNull NavDestination destination, @Nullable Bundle bundle, boolean z8, int i, boolean z9, int i8) {
            AbstractC5830k.m5330g(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z8;
            this.matchingPathSegments = i;
            this.hasMatchingAction = z9;
            this.mimeTypeMatchLevel = i8;
        }

        @NotNull
        public final NavDestination getDestination() {
            return this.destination;
        }

        @Nullable
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(@Nullable Bundle arguments) {
            Bundle bundle;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            AbstractC5830k.m5329f(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Bundle bundleM13597constructorimpl = SavedStateReader.m13597constructorimpl(arguments);
                AbstractC5830k.m5327d(str);
                if (!SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, str)) {
                    return false;
                }
                NavArgument navArgument = this.destination.getArguments().get(str);
                NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                Object obj = type != null ? type.get(this.matchingArgs, str) : null;
                Object obj2 = type != null ? type.get(arguments, str) : null;
                if (type != null && !type.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull DeepLinkMatch other) {
            AbstractC5830k.m5330g(other, "other");
            boolean z8 = this.isExactDeepLink;
            if (z8 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z8 && other.isExactDeepLink) {
                return -1;
            }
            int i = this.matchingPathSegments - other.matchingPathSegments;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int iM13677sizeimpl = SavedStateReader.m13677sizeimpl(SavedStateReader.m13597constructorimpl(bundle));
                Bundle bundle2 = other.matchingArgs;
                AbstractC5830k.m5327d(bundle2);
                int iM13677sizeimpl2 = iM13677sizeimpl - SavedStateReader.m13677sizeimpl(SavedStateReader.m13597constructorimpl(bundle2));
                if (iM13677sizeimpl2 > 0) {
                    return 1;
                }
                if (iM13677sizeimpl2 < 0) {
                    return -1;
                }
            }
            boolean z9 = this.hasMatchingAction;
            if (z9 && !other.hasMatchingAction) {
                return 1;
            }
            if (z9 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    public NavDestination(@NotNull String navigatorName) {
        AbstractC5830k.m5330g(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.impl = new NavDestinationImpl(this);
        this.actions = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    private final List<NavDeepLink> getDeepLinks() {
        return this.impl.getDeepLinks$navigation_common_release();
    }

    private static Object getDeepLinks$delegate(NavDestination navDestination) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navDestination.impl, NavDestinationImpl.class, "deepLinks", "getDeepLinks$navigation_common_release()Ljava/util/List;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String getDisplayName(@NotNull NavContext navContext, int i) {
        return INSTANCE.getDisplayName(navContext, i);
    }

    @NotNull
    public static final InterfaceC6830h getHierarchy(@NotNull NavDestination navDestination) {
        return INSTANCE.getHierarchy(navDestination);
    }

    private final String getIdName() {
        return this.impl.getIdName();
    }

    private static Object getIdName$delegate(NavDestination navDestination) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(navDestination.impl, NavDestinationImpl.class, "idName", "getIdName$navigation_common_release()Ljava/lang/String;", 0);
        AbstractC5832m.f9223a.getClass();
        return mutablePropertyReference0Impl;
    }

    private static Object getRoute$delegate(NavDestination navDestination) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(navDestination.impl, NavDestinationImpl.class, "route", "getRoute$navigation_common_release()Ljava/lang/String;", 0);
        AbstractC5832m.f9223a.getClass();
        return mutablePropertyReference0Impl;
    }

    @JvmStatic
    public static final <T> boolean hasRoute(@NotNull NavDestination navDestination, @NotNull InterfaceC6779c interfaceC6779c) {
        return INSTANCE.hasRoute(navDestination, interfaceC6779c);
    }

    @JvmStatic
    @NotNull
    public static final <C> Class<? extends C> parseClassFromName(@NotNull Context context, @NotNull String str, @NotNull Class<? extends C> cls) {
        return INSTANCE.parseClassFromName(context, str, cls);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <C> Class<? extends C> parseClassFromNameInternal(@NotNull Context context, @NotNull String str, @NotNull Class<? extends C> cls) {
        return INSTANCE.parseClassFromNameInternal(context, str, cls);
    }

    private final void setIdName(String str) {
        this.impl.setIdName$navigation_common_release(str);
    }

    public final void addArgument(@NotNull String argumentName, @NotNull NavArgument argument) {
        AbstractC5830k.m5330g(argumentName, "argumentName");
        AbstractC5830k.m5330g(argument, "argument");
        this.impl.addArgument$navigation_common_release(argumentName, argument);
    }

    public final void addDeepLink(@NotNull String uriPattern) {
        AbstractC5830k.m5330g(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle addInDefaultArgs(@Nullable Bundle args) {
        return this.impl.addInDefaultArgs$navigation_common_release(args);
    }

    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto Ldf
        L5:
            r1 = 0
            if (r9 == 0) goto Le0
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Le
            goto Le0
        Le:
            java.util.List r2 = r8.getDeepLinks()
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List r3 = r9.getDeepLinks()
            boolean r2 = kotlin.jvm.internal.AbstractC5830k.m5325b(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            int r3 = r3.size()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r4 = r4.size()
            if (r3 != r4) goto L5f
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            kotlin.collections.c0 r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            z6.h r3 = p214z6.AbstractC6833k.m6493t(r3)
            z6.a r3 = (p214z6.C6823a) r3
            java.util.Iterator r3 = r3.iterator()
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = kotlin.jvm.internal.AbstractC5830k.m5325b(r5, r4)
            if (r4 != 0) goto L3a
            goto L5f
        L5d:
            r3 = r0
            goto L60
        L5f:
            r3 = r1
        L60:
            java.util.Map r4 = r8.getArguments()
            int r4 = r4.size()
            java.util.Map r5 = r9.getArguments()
            int r5 = r5.size()
            if (r4 != r5) goto Lc0
            java.util.Map r4 = r8.getArguments()
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r4, r5)
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.collections.r r4 = kotlin.collections.AbstractC5805t.m5223c0(r4)
            java.lang.Object r4 = r4.f9198b
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L8d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbe
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lc0
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.AbstractC5830k.m5325b(r6, r5)
            if (r5 == 0) goto Lc0
            goto L8d
        Lbe:
            r4 = r0
            goto Lc1
        Lc0:
            r4 = r1
        Lc1:
            int r5 = r8.getId()
            int r6 = r9.getId()
            if (r5 != r6) goto Le0
            java.lang.String r5 = r8.getRoute()
            java.lang.String r9 = r9.getRoute()
            boolean r9 = kotlin.jvm.internal.AbstractC5830k.m5325b(r5, r9)
            if (r9 == 0) goto Le0
            if (r2 == 0) goto Le0
            if (r3 == 0) goto Le0
            if (r4 == 0) goto Le0
        Ldf:
            return r0
        Le0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String fillInLabel(@NotNull Context context, @Nullable Bundle bundle) {
        Map<String, Object> mapM5147A;
        String strValueOf;
        AbstractC5830k.m5330g(context, "context");
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        if (bundle == null || (mapM5147A = SavedStateReader.m13678toMapimpl(SavedStateReader.m13597constructorimpl(bundle))) == null) {
            mapM5147A = AbstractC5785e0.m5147A();
        }
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null || !mapM5147A.containsKey(strGroup)) {
                throw new IllegalArgumentException(("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
            }
            matcher.appendReplacement(stringBuffer, "");
            NavArgument navArgument = getArguments().get(strGroup);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            NavType<Integer> navType = NavType.ReferenceType;
            if (AbstractC5830k.m5325b(type, navType)) {
                AbstractC5830k.m5327d(bundle);
                Integer num = navType.get(bundle, strGroup);
                AbstractC5830k.m5328e(num, "null cannot be cast to non-null type kotlin.Int");
                strValueOf = context.getString(num.intValue());
            } else {
                AbstractC5830k.m5327d(type);
                AbstractC5830k.m5327d(bundle);
                strValueOf = String.valueOf(type.get(bundle, strGroup));
            }
            AbstractC5830k.m5327d(strValueOf);
            stringBuffer.append(strValueOf);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Nullable
    public final NavAction getAction(@IdRes int id) {
        NavAction navAction = this.actions.getIsEmpty() ? null : this.actions.get(id);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph != null) {
            return navGraph.getAction(id);
        }
        return null;
    }

    @NotNull
    public final Map<String, NavArgument> getArguments() {
        return AbstractC5785e0.m5156J(this.impl.getArguments$navigation_common_release());
    }

    @IdRes
    public final int getId() {
        return this.impl.getId();
    }

    @Nullable
    public final CharSequence getLabel() {
        return this.label;
    }

    @NotNull
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    @Nullable
    public final NavGraph getParent() {
        return this.parent;
    }

    @Nullable
    public final String getRoute() {
        return this.impl.getRoute();
    }

    public boolean hasDeepLink(@NotNull Uri deepLink) {
        AbstractC5830k.m5330g(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    public int hashCode() {
        int id = getId() * 31;
        String route = getRoute();
        int iHashCode = id + (route != null ? route.hashCode() : 0);
        for (NavDeepLink navDeepLink : getDeepLinks()) {
            int i = iHashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = (i + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArrayKt.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = (navAction.getDestinationId() + (iHashCode * 31)) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            int iHashCode4 = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            iHashCode = defaultArguments != null ? SavedStateReader.m13600contentDeepHashCodeimpl(SavedStateReader.m13597constructorimpl(defaultArguments)) + (iHashCode4 * 31) : iHashCode4;
        }
        for (String str : getArguments().keySet()) {
            int iM903d = AbstractC0584a.m903d(iHashCode * 31, 31, str);
            NavArgument navArgument = getArguments().get(str);
            iHashCode = iM903d + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC5830k.m5330g(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common_release(navDeepLinkRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final DeepLinkMatch matchRoute(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.matchRoute$navigation_common_release(route);
    }

    @CallSuper
    public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C2829R.styleable.Navigator);
        AbstractC5830k.m5329f(typedArrayObtainAttributes, "obtainAttributes(...)");
        setRoute(typedArrayObtainAttributes.getString(C2829R.styleable.Navigator_route));
        if (typedArrayObtainAttributes.hasValue(C2829R.styleable.Navigator_android_id)) {
            setId(typedArrayObtainAttributes.getResourceId(C2829R.styleable.Navigator_android_id, 0));
            setIdName(INSTANCE.getDisplayName(new NavContext(context), getId()));
        }
        this.label = typedArrayObtainAttributes.getText(C2829R.styleable.Navigator_android_label);
        typedArrayObtainAttributes.recycle();
    }

    public final void putAction(@IdRes int actionId, @IdRes int destId) {
        putAction(actionId, new NavAction(destId, null, null, 6, null));
    }

    public final void removeAction(@IdRes int actionId) {
        this.actions.remove(actionId);
    }

    public final void removeArgument(@NotNull String argumentName) {
        AbstractC5830k.m5330g(argumentName, "argumentName");
        this.impl.removeArgument$navigation_common_release(argumentName);
    }

    public final void setId(@IdRes int i) {
        this.impl.setId$navigation_common_release(i);
    }

    public final void setLabel(@Nullable CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(@Nullable NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(@Nullable String str) {
        this.impl.setRoute$navigation_common_release(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (getIdName() == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(getId()));
        } else {
            sb.append(getIdName());
        }
        sb.append(")");
        String route = getRoute();
        if (route != null && !AbstractC5855p.m5382P(route)) {
            sb.append(" route=");
            sb.append(getRoute());
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    public final void addDeepLink(@NotNull NavDeepLink navDeepLink) {
        AbstractC5830k.m5330g(navDeepLink, "navDeepLink");
        this.impl.addDeepLink$navigation_common_release(navDeepLink);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @kotlin.jvm.JvmOverloads
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] buildDeepLinkIds(@org.jetbrains.annotations.Nullable androidx.navigation.NavDestination r6) {
        /*
            r5 = this;
            kotlin.collections.p r0 = new kotlin.collections.p
            r0.<init>()
            r1 = r5
        L6:
            androidx.navigation.NavGraph r2 = r1.parent
            if (r6 == 0) goto Ld
            androidx.navigation.NavGraph r3 = r6.parent
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L23
            androidx.navigation.NavGraph r3 = r6.parent
            kotlin.jvm.internal.AbstractC5830k.m5327d(r3)
            int r4 = r1.getId()
            androidx.navigation.NavDestination r3 = r3.findNode(r4)
            if (r3 != r1) goto L23
            r0.addFirst(r1)
            goto L3b
        L23:
            if (r2 == 0) goto L2f
            int r3 = r2.getStartDestinationId()
            int r4 = r1.getId()
            if (r3 == r4) goto L32
        L2f:
            r0.addFirst(r1)
        L32:
            boolean r1 = kotlin.jvm.internal.AbstractC5830k.m5325b(r2, r6)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            if (r2 != 0) goto L6b
        L3b:
            java.util.List r6 = kotlin.collections.AbstractC5805t.m5217D0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.AbstractC5806u.m5277p(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r6.next()
            androidx.navigation.NavDestination r1 = (androidx.navigation.NavDestination) r1
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4e
        L66:
            int[] r6 = kotlin.collections.AbstractC5805t.m5216C0(r0)
            return r6
        L6b:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.buildDeepLinkIds(androidx.navigation.NavDestination):int[]");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getDisplayName() {
        String idName = getIdName();
        return idName == null ? String.valueOf(getId()) : idName;
    }

    public boolean hasDeepLink(@NotNull NavDeepLinkRequest deepLinkRequest) {
        AbstractC5830k.m5330g(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(@NotNull String route, @Nullable Bundle arguments) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.hasRoute$navigation_common_release(route, arguments);
    }

    public final void putAction(@IdRes int actionId, @NotNull NavAction action) {
        AbstractC5830k.m5330g(action, "action");
        if (supportsActions()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.put(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(@NotNull Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()));
        AbstractC5830k.m5330g(navigator, "navigator");
    }
}
