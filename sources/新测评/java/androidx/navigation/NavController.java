package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavControllerImpl;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(m13557d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u009f\u00012\u00020\u0001:\u0006\u009d\u0001\u009e\u0001\u009f\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u00102\u001a\u000603R\u00020\u00002\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020605H\u0000¢\u0006\u0002\b7J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010=\u001a\u00020\u0019H\u0017J\u001a\u0010=\u001a\u00020\u00192\b\b\u0001\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0019H\u0017J\"\u0010=\u001a\u00020\u00192\b\b\u0001\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u0019H\u0017J\"\u0010=\u001a\u00020\u00192\u0006\u0010B\u001a\u00020C2\u0006\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0019H\u0007J'\u0010=\u001a\u00020\u0019\"\n\b\u0000\u0010D\u0018\u0001*\u00020\u00012\u0006\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0019H\u0087\bJ2\u0010=\u001a\u00020\u0019\"\b\b\u0000\u0010D*\u00020\u00012\f\u0010B\u001a\b\u0012\u0004\u0012\u0002HD0E2\u0006\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0019H\u0007J1\u0010=\u001a\u00020\u0019\"\b\b\u0000\u0010D*\u00020\u00012\u0006\u0010B\u001a\u0002HD2\u0006\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010FJ$\u0010G\u001a\u00020\u00192\b\b\u0001\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0019H\u0003J\u0010\u0010H\u001a\u00020\u00192\u0006\u0010B\u001a\u00020CH\u0007J\u0012\u0010H\u001a\u00020\u00192\b\b\u0001\u0010>\u001a\u00020?H\u0007J\u0015\u0010H\u001a\u00020\u0019\"\n\b\u0000\u0010D\u0018\u0001*\u00020\u0001H\u0087\bJ \u0010H\u001a\u00020\u0019\"\b\b\u0000\u0010D*\u00020\u00012\f\u0010B\u001a\b\u0012\u0004\u0012\u0002HD0EH\u0007J\u001f\u0010H\u001a\u00020\u0019\"\b\b\u0000\u0010D*\u00020\u00012\u0006\u0010B\u001a\u0002HDH\u0007¢\u0006\u0002\u0010IJ\b\u0010J\u001a\u00020\u0019H\u0017J\b\u0010K\u001a\u00020\u0019H\u0002J\b\u0010L\u001a\u00020\u0019H\u0002J\u0012\u0010\u0016\u001a\u0002092\b\b\u0001\u0010U\u001a\u00020?H\u0017J\"\u0010\u0016\u001a\u0002092\b\b\u0001\u0010U\u001a\u00020?2\u000e\u0010V\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`XH\u0017J \u0010\u0016\u001a\u0002092\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010V\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`XH\u0017J\r\u0010Y\u001a\u00020\u0019H\u0000¢\u0006\u0002\bZJ\u0012\u0010[\u001a\u00020\u00192\b\u0010\\\u001a\u0004\u0018\u00010]H\u0017J\u0010\u0010[\u001a\u00020\u00192\u0006\u0010^\u001a\u00020_H\u0007J3\u0010[\u001a\u00020\u00192\u0006\u0010`\u001a\u00020a2\u0014\u0010b\u001a\u0010\u0012\f\u0012\n\u0018\u00010Wj\u0004\u0018\u0001`X0c2\u0006\u0010d\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010C2\u0006\u0010`\u001a\u00020aH\u0002J \u0010j\u001a\u0004\u0018\u0001062\b\b\u0001\u0010>\u001a\u00020?2\n\b\u0002\u0010k\u001a\u0004\u0018\u000106H\u0007J,\u0010l\u001a\u0004\u0018\u000106*\u0002062\b\b\u0001\u0010>\u001a\u00020?2\u0006\u0010m\u001a\u00020\u00192\n\b\u0002\u0010k\u001a\u0004\u0018\u000106H\u0007J\u0012\u0010j\u001a\u0004\u0018\u0001062\u0006\u0010B\u001a\u00020CH\u0007J\u0012\u0010n\u001a\u0002092\b\b\u0001\u0010o\u001a\u00020?H\u0017J\"\u0010n\u001a\u0002092\b\b\u0001\u0010o\u001a\u00020?2\u000e\u0010b\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`XH\u0017J,\u0010n\u001a\u0002092\b\b\u0001\u0010o\u001a\u00020?2\u000e\u0010b\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`X2\b\u0010p\u001a\u0004\u0018\u00010qH\u0017J6\u0010n\u001a\u0002092\b\b\u0001\u0010o\u001a\u00020?2\u000e\u0010b\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`X2\b\u0010p\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010sH\u0017J\u0010\u0010n\u001a\u0002092\u0006\u0010`\u001a\u00020tH\u0017J\u001a\u0010n\u001a\u0002092\u0006\u0010`\u001a\u00020t2\b\u0010p\u001a\u0004\u0018\u00010qH\u0017J$\u0010n\u001a\u0002092\u0006\u0010`\u001a\u00020t2\b\u0010p\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010sH\u0017J\u0010\u0010n\u001a\u0002092\u0006\u0010^\u001a\u00020_H\u0017J\u001a\u0010n\u001a\u0002092\u0006\u0010^\u001a\u00020_2\b\u0010p\u001a\u0004\u0018\u00010qH\u0017J$\u0010n\u001a\u0002092\u0006\u0010^\u001a\u00020_2\b\u0010p\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010sH\u0017J!\u0010u\u001a\u0002092\u0006\u0010^\u001a\u00020_2\n\u0010b\u001a\u00060Wj\u0002`XH\u0000¢\u0006\u0002\bvJ4\u0010n\u001a\u0002092\u0006\u0010w\u001a\u0002062\u000e\u0010b\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`X2\b\u0010p\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010sH\u0003J\u0010\u0010n\u001a\u0002092\u0006\u0010x\u001a\u00020yH\u0017J\u001a\u0010n\u001a\u0002092\u0006\u0010x\u001a\u00020y2\b\u0010p\u001a\u0004\u0018\u00010qH\u0017J\u0018\u0010n\u001a\u0002092\u0006\u0010x\u001a\u00020y2\u0006\u0010r\u001a\u00020sH\u0017J)\u0010n\u001a\u0002092\u0006\u0010B\u001a\u00020C2\u0017\u0010z\u001a\u0013\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u0002090{¢\u0006\u0002\b}H\u0007J(\u0010n\u001a\u0002092\u0006\u0010B\u001a\u00020C2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010q2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010sH\u0007J8\u0010n\u001a\u000209\"\b\b\u0000\u0010D*\u00020\u00012\u0006\u0010B\u001a\u0002HD2\u0017\u0010z\u001a\u0013\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u0002090{¢\u0006\u0002\b}H\u0007¢\u0006\u0002\u0010~J7\u0010n\u001a\u000209\"\b\b\u0000\u0010D*\u00020\u00012\u0006\u0010B\u001a\u0002HD2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010q2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010sH\u0007¢\u0006\u0002\u0010\u007fJ\n\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016J\u0010\u0010A\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`XH\u0017J\u001a\u0010\u0082\u0001\u001a\u0002092\u000f\u0010\u0083\u0001\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`XH\u0017J\u0013\u0010\u0084\u0001\u001a\u0002092\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0017J\u0012\u0010\u0087\u0001\u001a\u0002092\u0007\u0010\u0088\u0001\u001a\u00020'H\u0017J\u0012\u0010\u0089\u0001\u001a\u0002092\u0007\u0010\u008a\u0001\u001a\u00020\u0019H\u0017J\t\u0010\u008b\u0001\u001a\u000209H\u0002J\u0013\u0010\u008c\u0001\u001a\u0002092\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0017J\u0015\u0010\u008f\u0001\u001a\u00030\u0090\u00012\t\b\u0001\u0010\u0091\u0001\u001a\u00020?H\u0016J\u0013\u0010\u0092\u0001\u001a\u00020!2\b\b\u0001\u0010>\u001a\u00020?H\u0016J\u000f\u0010\u0092\u0001\u001a\u00020!2\u0006\u0010B\u001a\u00020CJ\u0016\u0010\u0092\u0001\u001a\u00020!\"\n\b\u0000\u0010D\u0018\u0001*\u00020\u0001H\u0086\bJ\u001f\u0010\u0092\u0001\u001a\u00020!\"\b\b\u0000\u0010D*\u00020\u00012\f\u0010B\u001a\b\u0012\u0004\u0012\u0002HD0EJ\u001f\u0010\u0092\u0001\u001a\u00020!\"\b\b\u0000\u0010D*\u00020\u00012\u0006\u0010B\u001a\u0002HD¢\u0006\u0003\u0010\u0093\u0001R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020,8V@WX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u0010M\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001b\u0010P\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bQ\u0010RR\u0016\u0010g\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0019\u0010\u0094\u0001\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020!0\u0098\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009b\u0001\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u0096\u0001¨\u0006 \u0001"}, m13558d2 = {"Landroidx/navigation/NavController;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "impl", "Landroidx/navigation/internal/NavControllerImpl;", "navContext", "Landroidx/navigation/internal/NavContext;", "getNavContext$navigation_runtime_release", "()Landroidx/navigation/internal/NavContext;", "activity", "Landroid/app/Activity;", "inflater", "Landroidx/navigation/NavInflater;", "graph", "Landroidx/navigation/NavGraph;", "getGraph", "()Landroidx/navigation/NavGraph;", "setGraph", "(Landroidx/navigation/NavGraph;)V", "deepLinkHandled", "", "getDeepLinkHandled$navigation_runtime_release", "()Z", "setDeepLinkHandled$navigation_runtime_release", "(Z)V", "currentBackStack", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getCurrentBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "visibleEntries", "getVisibleEntries", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "value", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "createNavControllerNavigatorState", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "createNavControllerNavigatorState$navigation_runtime_release", "addOnDestinationChangedListener", "", "listener", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "removeOnDestinationChangedListener", "popBackStack", "destinationId", "", "inclusive", "saveState", "route", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "(Ljava/lang/Object;ZZ)Z", "popBackStackInternal", "clearBackStack", "(Ljava/lang/Object;)Z", "navigateUp", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "destinationCountOnBackStack", "getDestinationCountOnBackStack", "()I", "navInflater", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater$delegate", "Lkotlin/Lazy;", "graphResId", "startDestinationArgs", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "checkDeepLinkHandled", "checkDeepLinkHandled$navigation_runtime_release", "handleDeepLink", "intent", "Landroid/content/Intent;", "request", "Landroidx/navigation/NavDeepLinkRequest;", "deepLink", "", "args", "", "newTask", "([I[Landroid/os/Bundle;Z)Z", "findInvalidDestinationDisplayNameInDeepLink", "currentDestination", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "findDestination", "matchingDest", "findDestinationComprehensive", "searchChildren", "navigate", "resId", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "Landroid/net/Uri;", "writeIntent", "writeIntent$navigation_runtime_release", "node", "directions", "Landroidx/navigation/NavDirections;", "builder", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "createDeepLink", "Landroidx/navigation/NavDeepLinkBuilder;", "restoreState", "navState", "setLifecycleOwner", "owner", "Landroidx/lifecycle/LifecycleOwner;", "setOnBackPressedDispatcher", "dispatcher", "enableOnBackPressed", "enabled", "updateOnBackPressedCallbackEnabled", "setViewModelStore", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "navGraphId", "getBackStackEntry", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/Flow;", "getCurrentBackStackEntryFlow", "()Lkotlinx/coroutines/flow/Flow;", "previousBackStackEntry", "getPreviousBackStackEntry", "OnDestinationChangedListener", "NavControllerNavigatorState", "Companion", "navigation-runtime_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,1206:1\n233#1:1417\n245#1:1418\n238#1:1419\n183#2,2:1207\n2163#2,2:1420\n27#3:1209\n46#3:1210\n32#3,4:1211\n31#3,7:1221\n27#3:1234\n46#3:1235\n32#3,4:1236\n31#3,7:1246\n27#3:1260\n46#3:1261\n32#3,4:1262\n31#3,7:1272\n27#3:1285\n46#3:1286\n32#3,4:1287\n31#3,7:1297\n27#3:1306\n46#3:1307\n32#3,4:1308\n31#3,7:1318\n27#3:1327\n46#3:1328\n32#3,4:1329\n31#3,7:1339\n27#3:1348\n46#3:1349\n32#3,4:1350\n31#3,7:1360\n27#3:1369\n46#3:1370\n32#3,4:1371\n31#3,7:1381\n27#3:1393\n46#3:1394\n32#3,4:1395\n31#3,7:1405\n126#4:1215\n153#4,3:1216\n126#4:1240\n153#4,3:1241\n126#4:1266\n153#4,3:1267\n126#4:1291\n153#4,3:1292\n126#4:1312\n153#4,3:1313\n126#4:1333\n153#4,3:1334\n126#4:1354\n153#4,3:1355\n126#4:1375\n153#4,3:1376\n126#4:1399\n153#4,3:1400\n37#5,2:1219\n37#5,2:1244\n37#5,2:1270\n37#5,2:1295\n37#5,2:1316\n37#5,2:1337\n37#5,2:1358\n37#5,2:1379\n37#5,2:1403\n1#6:1228\n1#6:1230\n1#6:1253\n1#6:1255\n1#6:1279\n1#6:1304\n1#6:1325\n1#6:1346\n1#6:1367\n1#6:1388\n1#6:1412\n106#7:1229\n106#7:1254\n106#7:1280\n106#7:1282\n106#7:1283\n106#7:1284\n106#7:1305\n106#7:1326\n106#7:1347\n106#7:1368\n106#7:1389\n106#7:1391\n106#7:1392\n106#7:1413\n106#7:1415\n90#7:1416\n1872#8,3:1231\n1782#8,4:1256\n46#9:1281\n46#9:1390\n46#9:1414\n*S KotlinDebug\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavController\n*L\n-1#1:1417\n-1#1:1418\n-1#1:1419\n71#1:1207,2\n658#1:1420,2\n359#1:1209\n359#1:1210\n359#1:1211,4\n359#1:1221,7\n384#1:1234\n384#1:1235\n384#1:1236,4\n384#1:1246,7\n524#1:1260\n524#1:1261\n524#1:1262,4\n524#1:1272,7\n563#1:1285\n563#1:1286\n563#1:1287,4\n563#1:1297,7\n609#1:1306\n609#1:1307\n609#1:1308,4\n609#1:1318,7\n617#1:1327\n617#1:1328\n617#1:1329,4\n617#1:1339,7\n860#1:1348\n860#1:1349\n860#1:1350,4\n860#1:1360,7\n865#1:1369\n865#1:1370\n865#1:1371,4\n865#1:1381,7\n1045#1:1393\n1045#1:1394\n1045#1:1395,4\n1045#1:1405,7\n359#1:1215\n359#1:1216,3\n384#1:1240\n384#1:1241,3\n524#1:1266\n524#1:1267,3\n563#1:1291\n563#1:1292,3\n609#1:1312\n609#1:1313,3\n617#1:1333\n617#1:1334,3\n860#1:1354\n860#1:1355,3\n865#1:1375\n865#1:1376,3\n1045#1:1399\n1045#1:1400,3\n359#1:1219,2\n384#1:1244,2\n524#1:1270,2\n563#1:1295,2\n609#1:1316,2\n617#1:1337,2\n860#1:1358,2\n865#1:1379,2\n1045#1:1403,2\n359#1:1228\n384#1:1253\n524#1:1279\n563#1:1304\n609#1:1325\n617#1:1346\n860#1:1367\n865#1:1388\n1045#1:1412\n359#1:1229\n384#1:1254\n524#1:1280\n527#1:1282\n544#1:1283\n560#1:1284\n563#1:1305\n609#1:1326\n617#1:1347\n860#1:1368\n865#1:1389\n867#1:1391\n956#1:1392\n1045#1:1413\n1047#1:1415\n1056#1:1416\n365#1:1231,3\n428#1:1256,4\n524#1:1281\n865#1:1390\n1045#1:1414\n*E\n"})
/* loaded from: classes3.dex */
public class NavController {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private Activity activity;
    private final Context context;
    private boolean deepLinkHandled;
    private boolean enableOnBackPressedCallback;
    private final NavControllerImpl impl;
    private NavInflater inflater;
    private final NavContext navContext;

    /* renamed from: navInflater$delegate, reason: from kotlin metadata */
    private final Lazy navInflater;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean deepLinkSaveState = true;

    @Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m13558d2 = {"Landroidx/navigation/NavController$Companion;", "", "<init>", "()V", "KEY_DEEP_LINK_IDS", "", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_INTENT", "deepLinkSaveState", "", "enableDeepLinkSaveState", "", "saveState", "navigation-runtime_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @JvmStatic
        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean saveState) {
            NavController.deepLinkSaveState = saveState;
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0090\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, m13558d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "navigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "getNavigator", "()Landroidx/navigation/Navigator;", "push", "", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "addInternal", "createBackStackEntry", "destination", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "pop", "popUpTo", "saveState", "", "popWithTransition", "markTransitionComplete", "entry", "prepareForTransition", "navigation-runtime_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit markTransitionComplete$lambda$1(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry) {
            super.markTransitionComplete(navBackStackEntry);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit pop$lambda$0(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z9) {
            super.pop(navBackStackEntry, z9);
            return Unit.INSTANCE;
        }

        public final void addInternal(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle arguments) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return this.this$0.impl.createBackStackEntry$navigation_runtime_release(destination, arguments);
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(final NavBackStackEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.this$0.impl.markTransitionComplete$navigation_runtime_release(this, entry, new Function0() { // from class: androidx.navigation.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.markTransitionComplete$lambda$1(this.f2015a, entry);
                }
            });
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(final NavBackStackEntry popUpTo, final boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            this.this$0.impl.pop$navigation_runtime_release(this, popUpTo, saveState, new Function0() { // from class: androidx.navigation.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.pop$lambda$0(this.f2045a, popUpTo, saveState);
                }
            });
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry popUpTo, boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, saveState);
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(NavBackStackEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.prepareForTransition(entry);
            this.this$0.impl.prepareForTransition$navigation_runtime_release(entry);
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            this.this$0.impl.push$navigation_runtime_release(this, backStackEntry);
        }
    }

    @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m13558d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "navigation-runtime_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController controller, NavDestination destination, Bundle arguments);
    }

    public NavController(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.impl = new NavControllerImpl(this, new Function0() { // from class: androidx.navigation.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavController.impl$lambda$0(this.f1990a);
            }
        });
        this.navContext = new NavContext(context);
        Iterator it = SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) new Function1() { // from class: androidx.navigation.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavController.activity$lambda$1((Context) obj);
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new NavGraphNavigator(this.impl.get_navigatorProvider$navigation_runtime_release()));
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new ActivityNavigator(this.context));
        this.navInflater = LazyKt.lazy(new Function0() { // from class: androidx.navigation.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavController.navInflater_delegate$lambda$10(this.f2012a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context activity$lambda$1(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @JvmStatic
    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z9) {
        INSTANCE.enableDeepLinkSaveState(z9);
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i10, NavDestination navDestination, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i11 & 2) != 0) {
            navDestination = null;
        }
        return navController.findDestination(i10, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$default(NavController navController, NavDestination navDestination, int i10, boolean z9, NavDestination navDestination2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i11 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.findDestinationComprehensive(navDestination, i10, z9, navDestination2);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] deepLink) {
        return this.impl.m2110x7b9ea851(deepLink);
    }

    private final int getDestinationCountOnBackStack() {
        ArrayDeque<NavBackStackEntry> backQueue$navigation_runtime_release = this.impl.getBackQueue$navigation_runtime_release();
        int i10 = 0;
        if (backQueue$navigation_runtime_release != null && backQueue$navigation_runtime_release.isEmpty()) {
            return 0;
        }
        Iterator<NavBackStackEntry> it = backQueue$navigation_runtime_release.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof NavGraph) && (i10 = i10 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21(NavDestination navDestination, NavController navController, NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.anim(new Function1() { // from class: androidx.navigation.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavController.handleDeepLink$lambda$21$lambda$18((AnimBuilder) obj);
            }
        });
        if (navDestination instanceof NavGraph) {
            Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
            while (true) {
                if (it.hasNext()) {
                    NavDestination next = it.next();
                    NavDestination currentDestination = navController.getCurrentDestination();
                    if (Intrinsics.areEqual(next, currentDestination != null ? currentDestination.getParent() : null)) {
                        break;
                    }
                } else if (deepLinkSaveState) {
                    navOptions.popUpTo(NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId(), new Function1() { // from class: androidx.navigation.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavController.handleDeepLink$lambda$21$lambda$20((PopUpToBuilder) obj);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21$lambda$18(AnimBuilder anim) {
        Intrinsics.checkNotNullParameter(anim, "$this$anim");
        anim.setEnter(0);
        anim.setExit(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21$lambda$20(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit impl$lambda$0(NavController navController) {
        navController.updateOnBackPressedCallbackEnabled();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavInflater navInflater_delegate$lambda$10(NavController navController) {
        NavInflater navInflater = navController.inflater;
        return navInflater == null ? new NavInflater(navController.context, navController.impl.get_navigatorProvider$navigation_runtime_release()) : navInflater;
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            navOptions = null;
        }
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z9, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return navController.popBackStack(str, z9, z10);
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        return this.impl.popBackStackInternal$navigation_runtime_release(destinationId, inclusive, saveState);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i10, boolean z9, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return navController.popBackStackInternal(i10, z9, z10);
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        Pair[] pairArr;
        int i10 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        Intrinsics.checkNotNull(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        Intrinsics.checkNotNull(intArray);
        List<Integer> mutableList = ArraysKt.toMutableList(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        if (mutableList.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) CollectionsKt.removeLast(mutableList)).intValue();
        if (parcelableArrayList != null) {
        }
        NavDestination navDestinationFindDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), iIntValue, false, null, 4, null);
        if (navDestinationFindDestinationComprehensive$default instanceof NavGraph) {
            iIntValue = NavGraph.INSTANCE.findStartDestination((NavGraph) navDestinationFindDestinationComprehensive$default).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || iIntValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilderCreateDeepLink = createDeepLink();
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.m13565to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM24170constructorimpl = SavedStateWriter.m24170constructorimpl(bundleBundleOf);
        Intrinsics.checkNotNull(intent);
        SavedStateWriter.m24194putParcelableimpl(bundleM24170constructorimpl, KEY_DEEP_LINK_INTENT, intent);
        Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle != null) {
            SavedStateWriter.m24174putAllimpl(bundleM24170constructorimpl, bundle);
        }
        navDeepLinkBuilderCreateDeepLink.setArguments(bundleBundleOf);
        for (Object obj : mutableList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            navDeepLinkBuilderCreateDeepLink.addDestination(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        navDeepLinkBuilderCreateDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        Pair[] pairArr;
        Bundle bundleAddInDefaultArgs;
        NavDestination currentDestination = getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id) {
                Map mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                    for (Map.Entry entry : mapEmptyMap.entrySet()) {
                        arrayList.add(TuplesKt.m13565to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Bundle bundleM24170constructorimpl = SavedStateWriter.m24170constructorimpl(bundleBundleOf);
                Activity activity = this.activity;
                if (activity != null) {
                    Intrinsics.checkNotNull(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        Intrinsics.checkNotNull(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            Intrinsics.checkNotNull(activity3);
                            Intent intent = activity3.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                            SavedStateWriter.m24194putParcelableimpl(bundleM24170constructorimpl, KEY_DEEP_LINK_INTENT, intent);
                            NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
                            Activity activity4 = this.activity;
                            Intrinsics.checkNotNull(activity4);
                            Intent intent2 = activity4.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent2), true, true, topGraph$navigation_runtime_release);
                            if ((deepLinkMatchMatchDeepLinkComprehensive != null ? deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs() : null) != null && (bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs())) != null) {
                                SavedStateWriter.m24174putAllimpl(bundleM24170constructorimpl, bundleAddInDefaultArgs);
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundleBundleOf).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.impl.addOnDestinationChangedListener$navigation_runtime_release(listener);
    }

    public final boolean checkDeepLinkHandled$navigation_runtime_release() {
        Activity activity;
        if (this.deepLinkHandled || (activity = this.activity) == null) {
            return false;
        }
        Intrinsics.checkNotNull(activity);
        return handleDeepLink(activity.getIntent());
    }

    @MainThread
    public final boolean clearBackStack(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release(route);
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    public final NavControllerNavigatorState createNavControllerNavigatorState$navigation_runtime_release(Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return new NavControllerNavigatorState(this, navigator);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean enabled) {
        this.enableOnBackPressedCallback = enabled;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@IdRes int destinationId, NavDestination matchingDest) {
        return this.impl.findDestination$navigation_runtime_release(destinationId, matchingDest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestinationComprehensive(NavDestination navDestination, @IdRes int i10, boolean z9, NavDestination navDestination2) {
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        return this.impl.findDestinationComprehensive$navigation_runtime_release(navDestination, i10, z9, navDestination2);
    }

    public NavBackStackEntry getBackStackEntry(@IdRes int destinationId) {
        return this.impl.getBackStackEntry$navigation_runtime_release(destinationId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final StateFlow<List<NavBackStackEntry>> getCurrentBackStack() {
        return this.impl.getCurrentBackStack$navigation_runtime_release();
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.impl.getCurrentBackStackEntry$navigation_runtime_release();
    }

    public final Flow<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return FlowKt.asSharedFlow(this.impl.get_currentBackStackEntryFlow$navigation_runtime_release());
    }

    public NavDestination getCurrentDestination() {
        return this.impl.getCurrentDestination$navigation_runtime_release();
    }

    /* renamed from: getDeepLinkHandled$navigation_runtime_release, reason: from getter */
    public final boolean getDeepLinkHandled() {
        return this.deepLinkHandled;
    }

    @MainThread
    public NavGraph getGraph() {
        return this.impl.getGraph$navigation_runtime_release();
    }

    /* renamed from: getNavContext$navigation_runtime_release, reason: from getter */
    public final NavContext getNavContext() {
        return this.navContext;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater.getValue();
    }

    public NavigatorProvider getNavigatorProvider() {
        return this.impl.get_navigatorProvider();
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        return this.impl.getPreviousBackStackEntry$navigation_runtime_release();
    }

    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int navGraphId) {
        return this.impl.getViewModelStoreOwner$navigation_runtime_release(navGraphId);
    }

    public final StateFlow<List<NavBackStackEntry>> getVisibleEntries() {
        return this.impl.getVisibleEntries$navigation_runtime_release();
    }

    @MainThread
    public boolean handleDeepLink(Intent intent) {
        int[] intArray;
        Pair[] pairArr;
        NavGraph topGraph$navigation_runtime_release;
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive;
        Pair[] pairArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
            } catch (Exception e10) {
                Log.e(NavControllerImpl.TAG, "handleDeepLink() could not extract deepLink from " + intent, e10);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS) : null;
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList2.add(TuplesKt.m13565to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m24170constructorimpl(bundleBundleOf);
        Bundle bundle2 = extras != null ? extras.getBundle(KEY_DEEP_LINK_EXTRAS) : null;
        if (bundle2 != null) {
            SavedStateWriter.m24174putAllimpl(SavedStateWriter.m24170constructorimpl(bundleBundleOf), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (deepLinkMatchMatchDeepLinkComprehensive = (topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release()).matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent), true, true, topGraph$navigation_runtime_release)) != null) {
            NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
            int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
            Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
            if (bundleAddInDefaultArgs != null) {
                SavedStateWriter.m24174putAllimpl(SavedStateWriter.m24170constructorimpl(bundleBundleOf), bundleAddInDefaultArgs);
            }
            intArray = iArrBuildDeepLinkIds$default;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strFindInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(intArray);
        if (strFindInvalidDestinationDisplayNameInDeepLink != null) {
            androidx.navigation.internal.Log.INSTANCE.m2091i(NavControllerImpl.TAG, "Could not find destination " + strFindInvalidDestinationDisplayNameInDeepLink + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        SavedStateWriter.m24194putParcelableimpl(SavedStateWriter.m24170constructorimpl(bundleBundleOf), KEY_DEEP_LINK_INTENT, intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i10 = 0; i10 < length; i10++) {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                    arrayList3.add(TuplesKt.m13565to((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            Bundle bundleM24170constructorimpl = SavedStateWriter.m24170constructorimpl(bundleBundleOf2);
            SavedStateWriter.m24174putAllimpl(bundleM24170constructorimpl, bundleBundleOf);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i10)) != null) {
                SavedStateWriter.m24174putAllimpl(bundleM24170constructorimpl, bundle);
            }
            bundleArr[i10] = bundleBundleOf2;
        }
        int flags = intent.getFlags();
        int i11 = 268435456 & flags;
        if (i11 == 0 || (flags & 32768) != 0) {
            return handleDeepLink(intArray, bundleArr, i11 != 0);
        }
        intent.addFlags(32768);
        TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(intent);
        Intrinsics.checkNotNullExpressionValue(taskStackBuilderAddNextIntentWithParentStack, "addNextIntentWithParentStack(...)");
        taskStackBuilderAddNextIntentWithParentStack.startActivities();
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @MainThread
    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null ? tryRelaunchUpToExplicitStack() : tryRelaunchUpToGeneratedStack();
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(T route, boolean z9) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStack$default(this, (Object) route, z9, false, 4, (Object) null);
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.impl.removeOnDestinationChangedListener$navigation_runtime_release(listener);
    }

    @CallSuper
    public void restoreState(Bundle navState) {
        if (navState != null) {
            navState.setClassLoader(this.context.getClassLoader());
        }
        this.impl.restoreState$navigation_runtime_release(navState);
        if (navState != null) {
            Boolean boolM24096getBooleanOrNullimpl = SavedStateReader.m24096getBooleanOrNullimpl(SavedStateReader.m24084constructorimpl(navState), KEY_DEEP_LINK_HANDLED);
            this.deepLinkHandled = boolM24096getBooleanOrNullimpl != null ? boolM24096getBooleanOrNullimpl.booleanValue() : false;
        }
    }

    @CallSuper
    public Bundle saveState() {
        Pair[] pairArr;
        Bundle bundleSaveState$navigation_runtime_release = this.impl.saveState$navigation_runtime_release();
        if (this.deepLinkHandled) {
            if (bundleSaveState$navigation_runtime_release == null) {
                Map mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                    for (Map.Entry entry : mapEmptyMap.entrySet()) {
                        arrayList.add(TuplesKt.m13565to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundleSaveState$navigation_runtime_release = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m24170constructorimpl(bundleSaveState$navigation_runtime_release);
            }
            SavedStateWriter.m24176putBooleanimpl(SavedStateWriter.m24170constructorimpl(bundleSaveState$navigation_runtime_release), KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundleSaveState$navigation_runtime_release;
    }

    public final void setDeepLinkHandled$navigation_runtime_release(boolean z9) {
        this.deepLinkHandled = z9;
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.impl.setGraph$navigation_runtime_release(graph);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.impl.setLifecycleOwner$navigation_runtime_release(owner);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(NavigatorProvider value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.impl.setNavigatorProvider$navigation_runtime_release(value);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (Intrinsics.areEqual(dispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.impl.getLifecycleOwner();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = dispatcher;
        dispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.impl.getLifecycleObserver());
        lifecycle.addObserver(this.impl.getLifecycleObserver());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(ViewModelStore viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        this.impl.setViewModelStore$navigation_runtime_release(viewModelStore);
    }

    public final void writeIntent$navigation_runtime_release(NavDeepLinkRequest request, Bundle args) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(args, "args");
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        SavedStateWriter.m24194putParcelableimpl(SavedStateWriter.m24170constructorimpl(args), KEY_DEEP_LINK_INTENT, intent);
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            navOptions = null;
        }
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navController.navigate((NavController) obj, navOptions, extras);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, boolean z9, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return navController.popBackStack(Reflection.getOrCreateKotlinClass(Object.class), z9, z10);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int destinationId) {
        return this.impl.clearBackStack$navigation_runtime_release(destinationId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.findDestination$navigation_runtime_release(route);
    }

    public final NavBackStackEntry getBackStackEntry(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release(route);
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(T route, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(String route, boolean z9) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStack$default(this, route, z9, false, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int graphResId) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(graphResId), null);
    }

    @MainThread
    public final /* synthetic */ <T> boolean clearBackStack() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return clearBackStack((KClass) Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> NavBackStackEntry getBackStackEntry() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getBackStackEntry((KClass) Reflection.getOrCreateKotlinClass(Object.class));
    }

    @JvmOverloads
    @MainThread
    public final void navigate(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(KClass<T> route, boolean z9) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStack$default(this, (KClass) route, z9, false, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int graphResId, Bundle startDestinationArgs) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(graphResId), startDestinationArgs);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, KClass kClass, boolean z9, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return navController.popBackStack(kClass, z9, z10);
    }

    @MainThread
    public final <T> boolean clearBackStack(KClass<T> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release((KClass) route);
    }

    public final <T> NavBackStackEntry getBackStackEntry(KClass<T> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release((KClass) route);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(String route, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @MainThread
    public boolean popBackStack() {
        return this.impl.popBackStack$navigation_runtime_release();
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph, Bundle startDestinationArgs) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.impl.setGraph$navigation_runtime_release(graph, startDestinationArgs);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z9, boolean z10, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return navController.popBackStack((NavController) obj, z9, z10);
    }

    @MainThread
    public final <T> boolean clearBackStack(T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release((NavControllerImpl) route);
    }

    public final <T> NavBackStackEntry getBackStackEntry(T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release((NavControllerImpl) route);
    }

    @MainThread
    public void navigate(@IdRes int resId) {
        navigate(resId, (Bundle) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive) {
        return this.impl.popBackStack$navigation_runtime_release(destinationId, inclusive);
    }

    @MainThread
    public void navigate(@IdRes int resId, Bundle args) {
        navigate(resId, args, (NavOptions) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        return this.impl.popBackStack$navigation_runtime_release(destinationId, inclusive, saveState);
    }

    @MainThread
    public void navigate(@IdRes int resId, Bundle args, NavOptions navOptions) {
        navigate(resId, args, navOptions, (Navigator.Extras) null);
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(String route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.popBackStack$navigation_runtime_release(route, inclusive, saveState);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void navigate(@androidx.annotation.IdRes int r11, android.os.Bundle r12, androidx.navigation.NavOptions r13, androidx.navigation.Navigator.Extras r14) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @JvmOverloads
    @MainThread
    public final /* synthetic */ <T> boolean popBackStack(boolean inclusive, boolean saveState) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return popBackStack((KClass) Reflection.getOrCreateKotlinClass(Object.class), inclusive, saveState);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(KClass<T> route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.popBackStack$navigation_runtime_release((KClass) route, inclusive, saveState);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(T route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.popBackStack$navigation_runtime_release((NavControllerImpl) route, inclusive, saveState);
    }

    @JvmOverloads
    @MainThread
    public final /* synthetic */ <T> boolean popBackStack(boolean z9) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return popBackStack((KClass) Reflection.getOrCreateKotlinClass(Object.class), z9, false);
    }

    @MainThread
    public final boolean handleDeepLink(NavDeepLinkRequest request) {
        Pair[] pairArr;
        Pair[] pairArr2;
        Intrinsics.checkNotNullParameter(request, "request");
        NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(request, true, true, topGraph$navigation_runtime_release);
        if (deepLinkMatchMatchDeepLinkComprehensive == null) {
            return false;
        }
        NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
        int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.m13565to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM24170constructorimpl = SavedStateWriter.m24170constructorimpl(bundleBundleOf);
        Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
        if (bundleAddInDefaultArgs != null) {
            SavedStateWriter.m24174putAllimpl(bundleM24170constructorimpl, bundleAddInDefaultArgs);
        }
        int length = iArrBuildDeepLinkIds$default.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i10 = 0; i10 < length; i10++) {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                    arrayList2.add(TuplesKt.m13565to((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m24174putAllimpl(SavedStateWriter.m24170constructorimpl(bundleBundleOf2), bundleBundleOf);
            bundleArr[i10] = bundleBundleOf2;
        }
        return handleDeepLink(iArrBuildDeepLinkIds$default, bundleArr, true);
    }

    @MainThread
    public void navigate(Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions);
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.impl.navigate$navigation_runtime_release(request);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.impl.navigate$navigation_runtime_release(request, navOptions);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.impl.navigate$navigation_runtime_release(request, navOptions, navigatorExtras);
    }

    @MainThread
    private final void navigate(NavDestination node, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        this.impl.navigate$navigation_runtime_release(node, args, navOptions, navigatorExtras);
    }

    @MainThread
    public void navigate(NavDirections directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDirections directions, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(NavDirections directions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        Intrinsics.checkNotNullParameter(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    @MainThread
    public final void navigate(String route, Function1<? super NavOptionsBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.impl.navigate$navigation_runtime_release(route, builder);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(String route, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.impl.navigate$navigation_runtime_release(route, navOptions, navigatorExtras);
    }

    @MainThread
    public final <T> void navigate(T route, Function1<? super NavOptionsBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.impl.navigate$navigation_runtime_release((NavControllerImpl) route, builder);
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(T route, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.impl.navigate$navigation_runtime_release((NavControllerImpl) route, navOptions, navigatorExtras);
    }

    @MainThread
    private final boolean handleDeepLink(int[] deepLink, Bundle[] args, boolean newTask) {
        NavDestination navDestinationFindNode;
        NavGraph navGraph;
        int i10 = 0;
        if (newTask) {
            if (!this.impl.getBackQueue$navigation_runtime_release().isEmpty()) {
                NavGraph navGraph2 = this.impl.get_graph();
                Intrinsics.checkNotNull(navGraph2);
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            while (i10 < deepLink.length) {
                int i11 = deepLink[i10];
                int i12 = i10 + 1;
                Bundle bundle = args[i10];
                final NavDestination navDestinationFindDestination$default = findDestination$default(this, i11, null, 2, null);
                if (navDestinationFindDestination$default != null) {
                    navigate(navDestinationFindDestination$default, bundle, NavOptionsBuilderKt.navOptions(new Function1() { // from class: androidx.navigation.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NavController.handleDeepLink$lambda$21(navDestinationFindDestination$default, this, (NavOptionsBuilder) obj);
                        }
                    }), (Navigator.Extras) null);
                    i10 = i12;
                } else {
                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.getDisplayName(this.navContext, i11) + " cannot be found from the current destination " + getCurrentDestination());
                }
            }
            this.deepLinkHandled = true;
            return true;
        }
        NavGraph navGraph3 = this.impl.get_graph();
        int length = deepLink.length;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = deepLink[i13];
            Bundle bundle2 = args[i13];
            if (i13 == 0) {
                navDestinationFindNode = this.impl.get_graph();
            } else {
                Intrinsics.checkNotNull(navGraph3);
                navDestinationFindNode = navGraph3.findNode(i14);
            }
            if (navDestinationFindNode != null) {
                if (i13 != deepLink.length - 1) {
                    if (navDestinationFindNode instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navDestinationFindNode;
                            Intrinsics.checkNotNull(navGraph);
                            if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                        }
                        navGraph3 = navGraph;
                    }
                } else {
                    NavOptions.Builder builder = new NavOptions.Builder();
                    NavGraph navGraph4 = this.impl.get_graph();
                    Intrinsics.checkNotNull(navGraph4);
                    navigate(navDestinationFindNode, bundle2, NavOptions.Builder.setPopUpTo$default(builder, navGraph4.getId(), true, false, 4, (Object) null).setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
                }
            } else {
                throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.getDisplayName(this.navContext, i14) + " cannot be found in graph " + navGraph3);
            }
        }
        this.deepLinkHandled = true;
        return true;
    }
}
