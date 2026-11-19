package androidx.navigation.compose;

import android.view.LifecycleOwner;
import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aN\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aÜ\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\u0018\u001a\u009a\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2(\b\u0002\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\u001c\u001aÁ\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010!\u001a\u0017\u0012\u0004\u0012\u00020\u001f\u0012\r\u0012\u000b\u0012\u0002\b\u00030 ¢\u0006\u0002\b\u00190\u001e2$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2(\b\u0002\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\"\u001a½\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020#2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010!\u001a\u0017\u0012\u0004\u0012\u00020\u001f\u0012\r\u0012\u000b\u0012\u0002\b\u00030 ¢\u0006\u0002\b\u00190\u001e2$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2(\b\u0002\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010$\u001a)\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010'\u001a·\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010(\u001aõ\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\n2(\b\u0002\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0007¢\u0006\u0002\b\u0019¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010)\u001a#\u0010,\u001a\u0004\u0018\u00010\u0012*\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b,\u0010-\u001a#\u0010.\u001a\u0004\u0018\u00010\u0014*\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\u0004\u0018\u00010\u0012*\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b0\u0010-\u001a#\u00101\u001a\u0004\u0018\u00010\u0014*\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b1\u0010/\u001a#\u00102\u001a\u0004\u0018\u00010\u001a*\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b2\u00103¨\u0006<²\u0006\u0012\u00105\u001a\b\u0012\u0004\u0012\u00020\u0011048\nX\u008a\u0084\u0002²\u0006\u000e\u00107\u001a\u0002068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u0002088\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011048\nX\u008a\u0084\u0002²\u0006\u0012\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0011048\nX\u008a\u0084\u0002"}, m5110d2 = {"Landroidx/navigation/NavHostController;", "navController", "", "startDestination", "Landroidx/compose/ui/Modifier;", "modifier", "route", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builder", "NavHost", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/jvm/JvmSuppressWildcards;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V", "Ly6/c;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "typeMap", "(Landroidx/navigation/NavHostController;Ly6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ly6/c;Ljava/util/Map;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V", "", "(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ly6/c;Ljava/util/Map;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavDestination;", "scope", "createEnterTransition", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;", "createExitTransition", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;", "createPopEnterTransition", "createPopExitTransition", "createSizeTransform", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/SizeTransform;", "", "currentBackStack", "", "progress", "", "inPredictiveBack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 NavController.kt\nandroidx/navigation/NavControllerKt__NavControllerKt\n+ 4 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProviderKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 9 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n*L\n1#1,777:1\n1225#2,3:778\n1228#2,3:783\n1225#2,6:786\n1225#2,6:792\n1225#2,3:798\n1228#2,3:803\n1225#2,6:806\n1225#2,6:812\n1225#2,3:818\n1228#2,3:823\n1225#2,6:826\n1225#2,6:832\n1225#2,3:838\n1228#2,3:843\n1225#2,6:846\n1225#2,6:852\n1225#2,3:858\n1228#2,3:863\n1225#2,6:866\n1225#2,6:872\n1225#2,6:878\n1225#2,6:884\n1225#2,6:892\n1225#2,6:898\n1225#2,6:904\n1225#2,6:910\n1225#2,6:916\n1225#2,6:922\n1225#2,6:928\n1225#2,6:934\n1225#2,6:940\n1225#2,6:946\n1225#2,6:952\n1225#2,6:958\n1225#2,6:964\n1225#2,6:970\n1225#2,6:976\n1225#2,6:982\n658#3:781\n658#3:801\n658#3:821\n675#3:841\n692#3:861\n40#4:782\n40#4:802\n40#4:822\n58#4:842\n76#4:862\n77#5:890\n84#6:891\n84#6:988\n81#7:989\n81#7:993\n107#7,2:994\n81#7:1001\n81#7:1005\n79#8:990\n112#8,2:991\n64#9,5:996\n64#9,5:1006\n774#10:1002\n865#10,2:1003\n744#11,7:1011\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n95#1:778,3\n95#1:783,3\n133#1:786,6\n136#1:792,6\n147#1:798,3\n147#1:803,3\n190#1:806,6\n196#1:812,6\n215#1:818,3\n215#1:823,3\n262#1:826,6\n268#1:832,6\n287#1:838,3\n287#1:843,3\n334#1:846,6\n340#1:852,6\n359#1:858,3\n359#1:863,3\n421#1:866,6\n424#1:872,6\n469#1:878,6\n475#1:884,6\n511#1:892,6\n512#1:898,6\n513#1:904,6\n540#1:910,6\n551#1:916,6\n561#1:922,6\n564#1:928,6\n578#1:934,6\n594#1:940,6\n602#1:946,6\n608#1:952,6\n618#1:958,6\n623#1:964,6\n656#1:970,6\n681#1:976,6\n709#1:982,6\n96#1:781\n148#1:801\n216#1:821\n288#1:841\n360#1:861\n96#1:782\n148#1:802\n216#1:822\n288#1:842\n360#1:862\n492#1:890\n506#1:891\n726#1:988\n509#1:989\n512#1:993\n512#1:994,2\n548#1:1001\n551#1:1005\n511#1:990\n511#1:991,2\n543#1:996,5\n603#1:1006,5\n553#1:1002\n553#1:1003,2\n661#1:1011,7\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(androidx.navigation.NavHostController r19, java.lang.String r20, androidx.compose.p011ui.Modifier r21, java.lang.String r22, p152r6.InterfaceC6471c r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$1(NavHostController navHostController, String str, Modifier modifier, String str2, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        NavHost(navHostController, str, modifier, str2, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$11$lambda$10(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$13(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, int i8, int i9, Composer composer, int i10) {
        NavHost(navHostController, str, modifier, alignment, str2, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, interfaceC6471c6, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8), i9);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$15$lambda$14(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$17$lambda$16(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$19(NavHostController navHostController, InterfaceC6779c interfaceC6779c, Modifier modifier, Alignment alignment, InterfaceC6779c interfaceC6779c2, Map map, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, int i8, int i9, Composer composer, int i10) {
        NavHost(navHostController, interfaceC6779c, modifier, alignment, interfaceC6779c2, (Map<InterfaceC6793q, NavType<?>>) map, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, interfaceC6471c6, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8), i9);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$21$lambda$20(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$23$lambda$22(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$25(NavHostController navHostController, Object obj, Modifier modifier, Alignment alignment, InterfaceC6779c interfaceC6779c, Map map, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, int i8, int i9, Composer composer, int i10) {
        NavHost(navHostController, obj, modifier, alignment, interfaceC6779c, (Map<InterfaceC6793q, NavType<?>>) map, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, interfaceC6471c6, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8), i9);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$26(NavHostController navHostController, NavGraph navGraph, Modifier modifier, int i, int i8, Composer composer, int i9) {
        NavHost(navHostController, navGraph, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$28$lambda$27(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$3$lambda$2(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$30$lambda$29(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$31(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, int i, int i8, Composer composer, int i9) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$33$lambda$32(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$35$lambda$34(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$37(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, int i, int i8, Composer composer, int i9) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$38(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NavHost$lambda$43(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavHost$lambda$44(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavHost$lambda$48$lambda$47(NavHostController navHostController, LifecycleOwner lifecycleOwner, DisposableEffectScope disposableEffectScope) {
        navHostController.setLifecycleOwner(lifecycleOwner);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$48$lambda$47$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    private static final List<NavBackStackEntry> NavHost$lambda$49(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition NavHost$lambda$5$lambda$4(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List NavHost$lambda$52$lambda$51(State state) {
        List<NavBackStackEntry> listNavHost$lambda$49 = NavHost$lambda$49(state);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNavHost$lambda$49) {
            if (AbstractC5830k.m5325b(((NavBackStackEntry) obj).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$53(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition NavHost$lambda$58$lambda$57(ComposeNavigator composeNavigator, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, MutableState mutableState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
        AbstractC5830k.m5328e(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        EnterTransition enterTransition = null;
        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHost$lambda$43(mutableState)) {
            Iterator it = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EnterTransition enterTransitionCreatePopEnterTransition = createPopEnterTransition((NavDestination) it.next(), animatedContentTransitionScope);
                if (enterTransitionCreatePopEnterTransition != null) {
                    enterTransition = enterTransitionCreatePopEnterTransition;
                    break;
                }
            }
            return enterTransition == null ? (EnterTransition) interfaceC6471c.invoke(animatedContentTransitionScope) : enterTransition;
        }
        Iterator it2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            EnterTransition enterTransitionCreateEnterTransition = createEnterTransition((NavDestination) it2.next(), animatedContentTransitionScope);
            if (enterTransitionCreateEnterTransition != null) {
                enterTransition = enterTransitionCreateEnterTransition;
                break;
            }
        }
        return enterTransition == null ? (EnterTransition) interfaceC6471c2.invoke(animatedContentTransitionScope) : enterTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition NavHost$lambda$62$lambda$61(ComposeNavigator composeNavigator, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, MutableState mutableState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getDestination();
        AbstractC5830k.m5328e(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        ExitTransition exitTransition = null;
        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHost$lambda$43(mutableState)) {
            Iterator it = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ExitTransition exitTransitionCreatePopExitTransition = createPopExitTransition((NavDestination) it.next(), animatedContentTransitionScope);
                if (exitTransitionCreatePopExitTransition != null) {
                    exitTransition = exitTransitionCreatePopExitTransition;
                    break;
                }
            }
            return exitTransition == null ? (ExitTransition) interfaceC6471c.invoke(animatedContentTransitionScope) : exitTransition;
        }
        Iterator it2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ExitTransition exitTransitionCreateExitTransition = createExitTransition((NavDestination) it2.next(), animatedContentTransitionScope);
            if (exitTransitionCreateExitTransition != null) {
                exitTransition = exitTransitionCreateExitTransition;
                break;
            }
        }
        return exitTransition == null ? (ExitTransition) interfaceC6471c2.invoke(animatedContentTransitionScope) : exitTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SizeTransform NavHost$lambda$65$lambda$64(InterfaceC6471c interfaceC6471c, AnimatedContentTransitionScope animatedContentTransitionScope) {
        SizeTransform sizeTransformCreateSizeTransform;
        NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
        AbstractC5830k.m5328e(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        Iterator it = NavDestination.INSTANCE.getHierarchy((ComposeNavigator.Destination) destination).iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeTransformCreateSizeTransform = null;
                break;
            }
            sizeTransformCreateSizeTransform = createSizeTransform((NavDestination) it.next(), animatedContentTransitionScope);
            if (sizeTransformCreateSizeTransform != null) {
                break;
            }
        }
        if (sizeTransformCreateSizeTransform != null) {
            return sizeTransformCreateSizeTransform;
        }
        if (interfaceC6471c != null) {
            return (SizeTransform) interfaceC6471c.invoke(animatedContentTransitionScope);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavHost$lambda$69$lambda$68(final State state, final ComposeNavigator composeNavigator, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$69$lambda$68$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Iterator it = NavHostKt.NavHost$lambda$53(state).iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$7(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, int i, int i8, Composer composer, int i9) {
        NavHost(navHostController, str, modifier, alignment, str2, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform NavHost$lambda$75$lambda$74(MutableObjectFloatMap mutableObjectFloatMap, ComposeNavigator composeNavigator, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, State state, MutableState mutableState, AnimatedContentTransitionScope animatedContentTransitionScope) {
        float f;
        if (!NavHost$lambda$53(state).contains(animatedContentTransitionScope.getInitialState())) {
            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
        }
        String id = ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId();
        int iFindKeyIndex = mutableObjectFloatMap.findKeyIndex(id);
        if (iFindKeyIndex >= 0) {
            f = mutableObjectFloatMap.values[iFindKeyIndex];
        } else {
            mutableObjectFloatMap.set(id, 0.0f);
            f = 0.0f;
        }
        if (!AbstractC5830k.m5325b(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId())) {
            f = (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHost$lambda$43(mutableState)) ? f - 1.0f : f + 1.0f;
        }
        mutableObjectFloatMap.set(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), f);
        return new ContentTransform((EnterTransition) interfaceC6471c.invoke(animatedContentTransitionScope), (ExitTransition) interfaceC6471c2.invoke(animatedContentTransitionScope), f, (SizeTransform) interfaceC6471c3.invoke(animatedContentTransitionScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$79(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, int i, int i8, Composer composer, int i9) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s NavHost$lambda$80(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, int i, int i8, Composer composer, int i9) {
        NavHost(navHostController, navGraph, modifier, alignment, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition NavHost$lambda$9$lambda$8(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }

    private static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC6471c enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC6471c enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition();
            if (enterTransition$navigation_compose_release2 != null) {
                return (EnterTransition) enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition()) == null) {
            return null;
        }
        return (EnterTransition) enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC6471c exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC6471c exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition();
            if (exitTransition$navigation_compose_release2 != null) {
                return (ExitTransition) exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition()) == null) {
            return null;
        }
        return (ExitTransition) exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC6471c popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC6471c popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return (EnterTransition) popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition()) == null) {
            return null;
        }
        return (EnterTransition) popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC6471c popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC6471c popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition();
            if (popExitTransition$navigation_compose_release2 != null) {
                return (ExitTransition) popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition()) == null) {
            return null;
        }
        return (ExitTransition) popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final SizeTransform createSizeTransform(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        InterfaceC6471c sizeTransform$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            InterfaceC6471c sizeTransform$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform();
            if (sizeTransform$navigation_compose_release2 != null) {
                return (SizeTransform) sizeTransform$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform()) == null) {
            return null;
        }
        return (SizeTransform) sizeTransform$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r25, final java.lang.String r26, androidx.compose.p011ui.Modifier r27, androidx.compose.p011ui.Alignment r28, java.lang.String r29, p152r6.InterfaceC6471c r30, p152r6.InterfaceC6471c r31, p152r6.InterfaceC6471c r32, p152r6.InterfaceC6471c r33, final p152r6.InterfaceC6471c r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, r6.c, r6.c, r6.c, r6.c, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@org.jetbrains.annotations.NotNull final androidx.navigation.NavHostController r27, @org.jetbrains.annotations.NotNull final java.lang.String r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Alignment r30, @org.jetbrains.annotations.Nullable java.lang.String r31, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r32, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r33, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r34, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r36, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, r6.c, r6.c, r6.c, r6.c, r6.c, r6.c, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@org.jetbrains.annotations.NotNull androidx.navigation.NavHostController r29, @org.jetbrains.annotations.NotNull p207y6.InterfaceC6779c r30, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Alignment r32, @org.jetbrains.annotations.Nullable p207y6.InterfaceC6779c r33, @org.jetbrains.annotations.Nullable java.util.Map<p207y6.InterfaceC6793q, androidx.navigation.NavType<?>> r34, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r36, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r37, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r38, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r39, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, y6.c, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, y6.c, java.util.Map, r6.c, r6.c, r6.c, r6.c, r6.c, r6.c, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@org.jetbrains.annotations.NotNull androidx.navigation.NavHostController r29, @org.jetbrains.annotations.NotNull java.lang.Object r30, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Alignment r32, @org.jetbrains.annotations.Nullable p207y6.InterfaceC6779c r33, @org.jetbrains.annotations.Nullable java.util.Map<p207y6.InterfaceC6793q, androidx.navigation.NavType<?>> r34, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r36, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r37, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r38, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r39, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, y6.c, java.util.Map, r6.c, r6.c, r6.c, r6.c, r6.c, r6.c, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(androidx.navigation.NavHostController r14, androidx.navigation.NavGraph r15, androidx.compose.p011ui.Modifier r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            r1 = r18
            r0 = -957014592(0xffffffffc6f51dc0, float:-31374.875)
            r2 = r17
            androidx.compose.runtime.Composer r11 = r2.startRestartGroup(r0)
            r2 = r19 & 1
            if (r2 == 0) goto L12
            r2 = r1 | 6
            goto L22
        L12:
            r2 = r1 & 6
            if (r2 != 0) goto L21
            boolean r2 = r11.changedInstance(r14)
            if (r2 == 0) goto L1e
            r2 = 4
            goto L1f
        L1e:
            r2 = 2
        L1f:
            r2 = r2 | r1
            goto L22
        L21:
            r2 = r1
        L22:
            r3 = r19 & 2
            if (r3 == 0) goto L29
            r2 = r2 | 48
            goto L39
        L29:
            r3 = r1 & 48
            if (r3 != 0) goto L39
            boolean r3 = r11.changedInstance(r15)
            if (r3 == 0) goto L36
            r3 = 32
            goto L38
        L36:
            r3 = 16
        L38:
            r2 = r2 | r3
        L39:
            r3 = r19 & 4
            if (r3 == 0) goto L42
            r2 = r2 | 384(0x180, float:5.38E-43)
        L3f:
            r4 = r16
            goto L54
        L42:
            r4 = r1 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L3f
            r4 = r16
            boolean r5 = r11.changed(r4)
            if (r5 == 0) goto L51
            r5 = 256(0x100, float:3.59E-43)
            goto L53
        L51:
            r5 = 128(0x80, float:1.8E-43)
        L53:
            r2 = r2 | r5
        L54:
            r5 = r2 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L66
            boolean r5 = r11.getSkipping()
            if (r5 != 0) goto L61
            goto L66
        L61:
            r11.skipToGroupEnd()
        L64:
            r6 = r4
            goto L90
        L66:
            if (r3 == 0) goto L6b
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p011ui.Modifier.INSTANCE
            r4 = r3
        L6b:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L77
            r3 = -1
            java.lang.String r5 = "androidx.navigation.compose.NavHost (NavHost.kt:393)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r3, r5)
        L77:
            r12 = r2 & 1022(0x3fe, float:1.432E-42)
            r13 = 504(0x1f8, float:7.06E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r14
            r3 = r15
            NavHost(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L64
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L64
        L90:
            androidx.compose.runtime.ScopeUpdateScope r7 = r11.endRestartGroup()
            if (r7 == 0) goto La3
            androidx.lifecycle.compose.d r0 = new androidx.lifecycle.compose.d
            r5 = 1
            r2 = r14
            r4 = r15
            r3 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r0)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r23, final androidx.navigation.NavGraph r24, androidx.compose.p011ui.Modifier r25, androidx.compose.p011ui.Alignment r26, p152r6.InterfaceC6471c r27, p152r6.InterfaceC6471c r28, p152r6.InterfaceC6471c r29, p152r6.InterfaceC6471c r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, r6.c, r6.c, r6.c, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@org.jetbrains.annotations.NotNull final androidx.navigation.NavHostController r34, @org.jetbrains.annotations.NotNull final androidx.navigation.NavGraph r35, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Alignment r37, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r38, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r39, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r40, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r41, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, r6.c, r6.c, r6.c, r6.c, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }
}
