package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.common.C4066R;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.serialization.RouteSerializerKt;
import androidx.savedstate.SavedStateReader;
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
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.SerializersKt;

@Metadata(m13557d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u0000 h2\u00020\u0001:\u0003fghB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0017J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010@\u001a\u00020A2\u0006\u0010D\u001a\u00020EH\u0016J\u000e\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020\u0003J\u000e\u0010F\u001a\u00020/2\u0006\u0010H\u001a\u00020\"J\u0012\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010:\u001a\u00020\u0003H\u0007J\u0012\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010L\u001a\u00020EH\u0017J\u0014\u0010M\u001a\u00020N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0000H\u0007J \u0010P\u001a\u00020A2\u0006\u0010:\u001a\u00020\u00032\u000e\u0010)\u001a\n\u0018\u00010Qj\u0004\u0018\u0001`RH\u0007J\b\u0010S\u001a\u00020AH\u0017J\u0012\u0010T\u001a\u0004\u0018\u00010(2\b\b\u0001\u00105\u001a\u000204J\u001a\u0010U\u001a\u00020/2\b\b\u0001\u0010V\u001a\u0002042\b\b\u0001\u0010W\u001a\u000204J\u0018\u0010U\u001a\u00020/2\b\b\u0001\u0010V\u001a\u0002042\u0006\u0010X\u001a\u00020(J\u0010\u0010Y\u001a\u00020/2\b\b\u0001\u0010V\u001a\u000204J\u0016\u0010Z\u001a\u00020/2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020+J\u000e\u0010]\u001a\u00020/2\u0006\u0010[\u001a\u00020\u0003J \u0010^\u001a\n\u0018\u00010Qj\u0004\u0018\u0001`R2\u000e\u0010_\u001a\n\u0018\u00010Qj\u0004\u0018\u0001`RH\u0007J \u0010`\u001a\u0004\u0018\u00010\u00032\u0006\u00100\u001a\u0002012\u000e\u0010a\u001a\n\u0018\u00010Qj\u0004\u0018\u0001`RJ\b\u0010b\u001a\u00020\u0003H\u0016J\u0013\u0010c\u001a\u00020A2\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010e\u001a\u000204H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u0005*\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b$\u0010%*\u0004\b#\u0010\u0017R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020+0*8F¢\u0006\u0006\u001a\u0004\b,\u0010-R&\u00105\u001a\u0002042\b\b\u0001\u0010\r\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R/\u0010:\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b<\u0010\n\"\u0004\b=\u0010\u0005*\u0004\b;\u0010\u0017R\u0014\u0010>\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\n¨\u0006i"}, m13558d2 = {"Landroidx/navigation/NavDestination;", "", "navigatorName", "", "<init>", "(Ljava/lang/String;)V", "navigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "getNavigatorName", "()Ljava/lang/String;", "impl", "Landroidx/navigation/internal/NavDestinationImpl;", "value", "Landroidx/navigation/NavGraph;", "parent", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "<set-?>", "idName", "getIdName$delegate", "(Landroidx/navigation/NavDestination;)Ljava/lang/Object;", "getIdName", "setIdName", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "deepLinks", "", "Landroidx/navigation/NavDeepLink;", "getDeepLinks$delegate", "getDeepLinks", "()Ljava/util/List;", "actions", "Landroidx/collection/SparseArrayCompat;", "Landroidx/navigation/NavAction;", "arguments", "", "Landroidx/navigation/NavArgument;", "getArguments", "()Ljava/util/Map;", "onInflate", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "", "id", "getId", "()I", "setId", "(I)V", "route", "getRoute$delegate", "getRoute", "setRoute", "displayName", "getDisplayName", "hasDeepLink", "", "deepLink", "Landroid/net/Uri;", "deepLinkRequest", "Landroidx/navigation/NavDeepLinkRequest;", "addDeepLink", "uriPattern", "navDeepLink", "matchRoute", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "navDeepLinkRequest", "buildDeepLinkIds", "", "previousDestination", "hasRoute", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "supportsActions", "getAction", "putAction", "actionId", "destId", "action", "removeAction", "addArgument", "argumentName", "argument", "removeArgument", "addInDefaultArgs", "args", "fillInLabel", "bundle", "toString", "equals", "other", "hashCode", "ClassType", "DeepLinkMatch", "Companion", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavDestination.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,515:1\n233#2,3:516\n1557#3:519\n1628#3,3:520\n1863#3,2:529\n1863#3,2:534\n1#4:523\n90#5:524\n90#5:532\n1228#6,2:525\n1228#6,2:527\n32#7:531\n33#7:533\n*S KotlinDebug\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination\n*L\n138#1:516,3\n224#1:519\n224#1:520,3\n402#1:529,2\n412#1:534,2\n331#1:524\n410#1:532\n383#1:525,2\n387#1:527,2\n407#1:531\n407#1:533\n*E\n"})
/* loaded from: classes3.dex */
public class NavDestination {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private final SparseArrayCompat<NavAction> actions;
    private final NavDestinationImpl impl;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m13558d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "value", "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface ClassType {
        Class<?> value();
    }

    @Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\t0\u0007\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\t0\u0007H\u0005J:\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\t0\u0007\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\t0\u0007H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007J\u0019\u0010\u001c\u001a\u00020\u001d\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u0001*\u00020\u0017H\u0087\bJ$\u0010\u001c\u001a\u00020\u001d\"\b\b\u0000\u0010\u001e*\u00020\u0001*\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u001fH\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, m13558d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "<init>", "()V", "classes", "", "", "Ljava/lang/Class;", "parseClassFromName", "C", "context", "Landroid/content/Context;", HintConstants.AUTOFILL_HINT_NAME, "expectedClassType", "parseClassFromNameInternal", "getDisplayName", "Landroidx/navigation/internal/NavContext;", "id", "", "createRoute", "route", "hierarchy", "Lkotlin/sequences/Sequence;", "Landroidx/navigation/NavDestination;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "hasRoute", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination _get_hierarchy_$lambda$1(NavDestination it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getParent();
        }

        @JvmStatic
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String createRoute(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String getDisplayName(NavContext context, int id) {
            Intrinsics.checkNotNullParameter(context, "context");
            return id <= 16777215 ? String.valueOf(id) : context.getResourceName(id);
        }

        public final Sequence<NavDestination> getHierarchy(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return SequencesKt.generateSequence(navDestination, (Function1<? super NavDestination, ? extends NavDestination>) new Function1() { // from class: androidx.navigation.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavDestination.Companion._get_hierarchy_$lambda$1((NavDestination) obj);
                }
            });
        }

        @JvmStatic
        public final /* synthetic */ <T> boolean hasRoute(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return hasRoute(navDestination, Reflection.getOrCreateKotlinClass(Object.class));
        }

        @JvmStatic
        public final <C> Class<? extends C> parseClassFromName(Context context, String name, Class<? extends C> expectedClassType) {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
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
                } catch (ClassNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
            Intrinsics.checkNotNull(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <C> Class<? extends C> parseClassFromNameInternal(Context context, String name, Class<? extends C> expectedClassType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        private Companion() {
        }

        @JvmStatic
        public final <T> boolean hasRoute(NavDestination navDestination, KClass<T> route) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            Intrinsics.checkNotNullParameter(route, "route");
            return RouteSerializerKt.generateHashCode(SerializersKt.serializer(route)) == navDestination.getId();
        }
    }

    @Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m13558d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "isExactDeepLink", "", "matchingPathSegments", "", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "hasMatchingArgs", "arguments", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nNavDestination.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n90#2:516\n90#2:518\n1863#3:517\n1864#3:519\n*S KotlinDebug\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n80#1:516\n100#1:518\n98#1:517\n98#1:519\n*E\n"})
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination destination, Bundle bundle, boolean z9, int i10, boolean z10, int i11) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z9;
            this.matchingPathSegments = i10;
            this.hasMatchingAction = z10;
            this.mimeTypeMatchLevel = i11;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(Bundle arguments) {
            Bundle bundle;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Bundle bundleM24084constructorimpl = SavedStateReader.m24084constructorimpl(arguments);
                Intrinsics.checkNotNull(str);
                if (!SavedStateReader.m24085containsimpl(bundleM24084constructorimpl, str)) {
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
        public int compareTo(DeepLinkMatch other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z9 = this.isExactDeepLink;
            if (z9 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z9 && other.isExactDeepLink) {
                return -1;
            }
            int i10 = this.matchingPathSegments - other.matchingPathSegments;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
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
                int iM24164sizeimpl = SavedStateReader.m24164sizeimpl(SavedStateReader.m24084constructorimpl(bundle));
                Bundle bundle2 = other.matchingArgs;
                Intrinsics.checkNotNull(bundle2);
                int iM24164sizeimpl2 = iM24164sizeimpl - SavedStateReader.m24164sizeimpl(SavedStateReader.m24084constructorimpl(bundle2));
                if (iM24164sizeimpl2 > 0) {
                    return 1;
                }
                if (iM24164sizeimpl2 < 0) {
                    return -1;
                }
            }
            boolean z10 = this.hasMatchingAction;
            if (z10 && !other.hasMatchingAction) {
                return 1;
            }
            if (z10 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    public NavDestination(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.impl = new NavDestinationImpl(this);
        this.actions = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    private final List<NavDeepLink> getDeepLinks() {
        return this.impl.getDeepLinks$navigation_common_release();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String getDisplayName(NavContext navContext, int i10) {
        return INSTANCE.getDisplayName(navContext, i10);
    }

    public static final Sequence<NavDestination> getHierarchy(NavDestination navDestination) {
        return INSTANCE.getHierarchy(navDestination);
    }

    private final String getIdName() {
        return this.impl.getIdName();
    }

    @JvmStatic
    public static final <T> boolean hasRoute(NavDestination navDestination, KClass<T> kClass) {
        return INSTANCE.hasRoute(navDestination, kClass);
    }

    @JvmStatic
    public static final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromName(context, str, cls);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromNameInternal(context, str, cls);
    }

    private final void setIdName(String str) {
        this.impl.setIdName$navigation_common_release(str);
    }

    public final void addArgument(String argumentName, NavArgument argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.impl.addArgument$navigation_common_release(argumentName, argument);
    }

    public final void addDeepLink(String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle addInDefaultArgs(Bundle args) {
        return this.impl.addInDefaultArgs$navigation_common_release(args);
    }

    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[EDGE_INSN: B:31:0x00ae->B:32:0x00af BREAK  A[LOOP:1: B:23:0x007b->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lce
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lce
        Ld:
            java.util.List r2 = r8.getDeepLinks()
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List r3 = r9.getDeepLinks()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            int r3 = r3.size()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r4 = r4.size()
            if (r3 != r4) goto L5c
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            kotlin.collections.IntIterator r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.asSequence(r3)
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)
            if (r4 != 0) goto L37
            goto L5c
        L5a:
            r3 = r0
            goto L5d
        L5c:
            r3 = r1
        L5d:
            java.util.Map r4 = r8.getArguments()
            int r4 = r4.size()
            java.util.Map r5 = r9.getArguments()
            int r5 = r5.size()
            if (r4 != r5) goto Lae
            java.util.Map r4 = r8.getArguments()
            kotlin.sequences.Sequence r4 = kotlin.collections.MapsKt.asSequence(r4)
            java.util.Iterator r4 = r4.iterator()
        L7b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lae
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r5 == 0) goto Lae
            goto L7b
        Lac:
            r4 = r0
            goto Laf
        Lae:
            r4 = r1
        Laf:
            int r5 = r8.getId()
            int r6 = r9.getId()
            if (r5 != r6) goto Lce
            java.lang.String r5 = r8.getRoute()
            java.lang.String r9 = r9.getRoute()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)
            if (r9 == 0) goto Lce
            if (r2 == 0) goto Lce
            if (r3 == 0) goto Lce
            if (r4 == 0) goto Lce
            return r0
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public final String fillInLabel(Context context, Bundle bundle) {
        Map<String, Object> mapEmptyMap;
        String strValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        if (bundle == null || (mapEmptyMap = SavedStateReader.m24165toMapimpl(SavedStateReader.m24084constructorimpl(bundle))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null || !mapEmptyMap.containsKey(strGroup)) {
                throw new IllegalArgumentException(("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + Typography.quote).toString());
            }
            matcher.appendReplacement(stringBuffer, "");
            NavArgument navArgument = getArguments().get(strGroup);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            NavType<Integer> navType = NavType.ReferenceType;
            if (Intrinsics.areEqual(type, navType)) {
                Intrinsics.checkNotNull(bundle);
                Integer num = navType.get(bundle, strGroup);
                Intrinsics.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
                strValueOf = context.getString(num.intValue());
            } else {
                Intrinsics.checkNotNull(type);
                Intrinsics.checkNotNull(bundle);
                strValueOf = String.valueOf(type.get(bundle, strGroup));
            }
            Intrinsics.checkNotNull(strValueOf);
            stringBuffer.append(strValueOf);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

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

    public final Map<String, NavArgument> getArguments() {
        return MapsKt.toMap(this.impl.getArguments$navigation_common_release());
    }

    @IdRes
    public final int getId() {
        return this.impl.getId();
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.impl.getRoute();
    }

    public boolean hasDeepLink(Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    public int hashCode() {
        int id = getId() * 31;
        String route = getRoute();
        int iHashCode = id + (route != null ? route.hashCode() : 0);
        for (NavDeepLink navDeepLink : getDeepLinks()) {
            int i10 = iHashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = (i10 + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArrayKt.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = ((iHashCode * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            iHashCode = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null) {
                iHashCode = (iHashCode * 31) + SavedStateReader.m24087contentDeepHashCodeimpl(SavedStateReader.m24084constructorimpl(defaultArguments));
            }
        }
        for (String str : getArguments().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str.hashCode()) * 31;
            NavArgument navArgument = getArguments().get(str);
            iHashCode = iHashCode4 + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common_release(navDeepLinkRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final DeepLinkMatch matchRoute(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.matchRoute$navigation_common_release(route);
    }

    @CallSuper
    public void onInflate(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C4066R.styleable.Navigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        setRoute(typedArrayObtainAttributes.getString(C4066R.styleable.Navigator_route));
        int i10 = C4066R.styleable.Navigator_android_id;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            setId(typedArrayObtainAttributes.getResourceId(i10, 0));
            setIdName(INSTANCE.getDisplayName(new NavContext(context), getId()));
        }
        this.label = typedArrayObtainAttributes.getText(C4066R.styleable.Navigator_android_label);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void putAction(@IdRes int actionId, @IdRes int destId) {
        putAction(actionId, new NavAction(destId, null, null, 6, null));
    }

    public final void removeAction(@IdRes int actionId) {
        this.actions.remove(actionId);
    }

    public final void removeArgument(String argumentName) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        this.impl.removeArgument$navigation_common_release(argumentName);
    }

    public final void setId(@IdRes int i10) {
        this.impl.setId$navigation_common_release(i10);
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(String str) {
        this.impl.setRoute$navigation_common_release(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

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
        if (route != null && !StringsKt.isBlank(route)) {
            sb.append(" route=");
            sb.append(getRoute());
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        this.impl.addDeepLink$navigation_common_release(navDeepLink);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @kotlin.jvm.JvmOverloads
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] buildDeepLinkIds(androidx.navigation.NavDestination r6) {
        /*
            r5 = this;
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r5
        L6:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.navigation.NavGraph r2 = r1.parent
            if (r6 == 0) goto L10
            androidx.navigation.NavGraph r3 = r6.parent
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L26
            androidx.navigation.NavGraph r3 = r6.parent
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = r1.getId()
            androidx.navigation.NavDestination r3 = r3.findNode(r4)
            if (r3 != r1) goto L26
            r0.addFirst(r1)
            goto L3e
        L26:
            if (r2 == 0) goto L32
            int r3 = r2.getStartDestinationId()
            int r4 = r1.getId()
            if (r3 == r4) goto L35
        L32:
            r0.addFirst(r1)
        L35:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r1 == 0) goto L3c
            goto L3e
        L3c:
            if (r2 != 0) goto L6e
        L3e:
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r6.next()
            androidx.navigation.NavDestination r1 = (androidx.navigation.NavDestination) r1
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L51
        L69:
            int[] r6 = kotlin.collections.CollectionsKt.toIntArray(r0)
            return r6
        L6e:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.buildDeepLinkIds(androidx.navigation.NavDestination):int[]");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        String idName = getIdName();
        return idName == null ? String.valueOf(getId()) : idName;
    }

    public boolean hasDeepLink(NavDeepLinkRequest deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(String route, Bundle arguments) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.hasRoute$navigation_common_release(route, arguments);
    }

    public final void putAction(@IdRes int actionId, NavAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
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
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
