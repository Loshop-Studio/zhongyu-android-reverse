package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.OutlineKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LookaheadScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.AbstractC5809x;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p204y1.AbstractC6768a;

@ExperimentalSharedTransitionApi
@Metadata(m5109d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u0002:\u0004\u009a\u0001\u009b\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0011\u001a\u00020\b*\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001f\u001a\u00020\u0013*\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 JK\u0010+\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,Jc\u00103\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010&\u001a\u00020%2\u0006\u00102\u001a\u0002012\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020*H\u0016¢\u0006\u0004\b3\u00104JK\u00106\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u00105\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020*H\u0016¢\u0006\u0004\b6\u00107JU\u00109\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u00105\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020*H\u0000¢\u0006\u0004\b8\u00107J\u0017\u0010<\u001a\u00020*2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020!2\u0006\u0010?\u001a\u00020>H\u0017¢\u0006\u0004\b@\u0010AJ\u0017\u0010G\u001a\u00020D2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010L\u001a\u00020D2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020D2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bM\u0010KJ\u0017\u0010S\u001a\u00020D2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020D2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bT\u0010RJ\u000f\u0010X\u001a\u00020DH\u0000¢\u0006\u0004\bV\u0010WJ9\u0010_\u001a\u00020D2\u0006\u0010C\u001a\u00020Y2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020D0Z2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020D0\u0016H\u0000¢\u0006\u0004\b]\u0010^J\u0017\u0010b\u001a\u00020D2\u0006\u0010C\u001a\u00020>H\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020DH\u0002¢\u0006\u0004\bc\u0010WJw\u0010h\u001a\u00020\u0013\"\u0004\b\u0000\u0010d*\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010e2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0Z2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\u0006\u0010g\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020*H\u0002¢\u0006\u0004\bh\u0010iJO\u0010l\u001a\u00020H2\u0006\u0010+\u001a\u00020Y2\u0006\u0010k\u001a\u00020j2\u0006\u0010(\u001a\u00020'2\u0006\u0010g\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\fH\u0003¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020Y2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020DH\u0002¢\u0006\u0004\bp\u0010WR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010q\u001a\u0004\br\u0010sR$\u0010u\u001a\u00020\f2\u0006\u0010t\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR+\u0010{\u001a\u00020\f2\u0006\u0010t\u001a\u00020\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010x\"\u0004\b|\u0010}R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020D0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR!\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020D0Z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0080\u0001R)\u0010\u0081\u0001\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u0087\u0001\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0082\u0001\u001a\u0006\b\u0088\u0001\u0010\u0084\u0001\"\u0006\b\u0089\u0001\u0010\u0086\u0001R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020O0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u0010\u008e\u0001\u001a\u000f\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020Y0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0093\u0001\u001a\u00020\b*\u00030\u0090\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0084\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u009c\u0001"}, m5110d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Lkotlinx/coroutines/v;", "coroutineScope", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/v;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "", "includeMotionFrameOfReference", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localLookaheadPositionOf", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/Modifier;", "skipToLookaheadSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "renderInOverlay", "", "zIndexInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "clipInOverlayDuringTransition", "renderInSharedTransitionScopeOverlay", "(Landroidx/compose/ui/Modifier;Lr6/a;FLr6/e;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "sharedContentState", "Landroidx/compose/animation/AnimatedVisibilityScope;", "animatedVisibilityScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "placeHolderSize", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "sharedElement", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "resizeMode", "sharedBounds", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$ResizeMode;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "visible", "sharedElementWithCallerManagedVisibility", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "sharedBoundsWithCallerManagedVisibility$animation_release", "sharedBoundsWithCallerManagedVisibility", "Landroidx/compose/ui/graphics/Shape;", "clipShape", "OverlayClip", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "key", "rememberSharedContentState", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "scope", "Ld6/s;", "drawInOverlay$animation_release", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "drawInOverlay", "Landroidx/compose/animation/SharedElementInternalState;", "sharedElementState", "onStateRemoved$animation_release", "(Landroidx/compose/animation/SharedElementInternalState;)V", "onStateRemoved", "onStateAdded$animation_release", "onStateAdded", "Landroidx/compose/animation/LayerRenderer;", "renderer", "onLayerRendererCreated$animation_release", "(Landroidx/compose/animation/LayerRenderer;)V", "onLayerRendererCreated", "onLayerRendererRemoved$animation_release", "onLayerRendererRemoved", "onDispose$animation_release", "()V", "onDispose", "Landroidx/compose/animation/SharedElement;", "Lkotlin/Function1;", "onValueChangedForScope", "block", "observeReads$animation_release", "(Landroidx/compose/animation/SharedElement;Lr6/c;Lr6/a;)V", "observeReads", "clearObservation$animation_release", "(Ljava/lang/Object;)V", "clearObservation", "updateTransitionActiveness", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/Transition;", "parentTransition", "renderOnlyWhenVisible", "sharedBoundsImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lr6/c;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "rememberSharedElementState", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;", "sharedElementsFor", "(Ljava/lang/Object;)Landroidx/compose/animation/SharedElement;", "observeIsAnimating", "Lkotlinx/coroutines/v;", "getCoroutineScope", "()Lkotlinx/coroutines/v;", "<set-?>", "disposed", "Z", "getDisposed$animation_release", "()Z", "isTransitionActive$delegate", "Landroidx/compose/runtime/MutableState;", "isTransitionActive", "setTransitionActive", "(Z)V", "observeAnimatingBlock", "Lr6/a;", "Lr6/c;", "root", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getRoot$animation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setRoot$animation_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "nullableLookaheadRoot", "getNullableLookaheadRoot$animation_release", "setNullableLookaheadRoot$animation_release", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "renderers", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/collection/MutableScatterMap;", "sharedElements", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "getLookaheadRoot$animation_release", "lookaheadRoot", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getObserverForTest$animation_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observerForTest", "Companion", "ShapeBasedClip", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1221:1\n85#2:1222\n113#2,2:1223\n1247#3,6:1225\n1247#3,6:1308\n385#4:1231\n357#4,4:1232\n329#4,6:1236\n339#4,3:1243\n342#4,9:1247\n361#4:1256\n386#4:1257\n357#4,4:1258\n329#4,6:1262\n339#4,3:1269\n342#4,9:1273\n361#4:1282\n357#4,4:1283\n329#4,6:1287\n339#4,3:1294\n342#4,9:1298\n361#4:1307\n1399#5:1242\n1270#5:1246\n1399#5:1268\n1270#5:1272\n1399#5:1293\n1270#5:1297\n1#6:1314\n1002#7,2:1315\n350#7,7:1323\n34#8,6:1317\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n673#1:1222\n673#1:1223,2\n875#1:1225,6\n992#1:1308,6\n887#1:1231\n887#1:1232,4\n887#1:1236,6\n887#1:1243,3\n887#1:1247,9\n887#1:1256\n887#1:1257\n891#1:1258,4\n891#1:1262,6\n891#1:1269,3\n891#1:1273,9\n891#1:1282\n894#1:1283,4\n894#1:1287,6\n894#1:1294,3\n894#1:1298,9\n894#1:1307\n887#1:1242\n887#1:1246\n891#1:1268\n891#1:1272\n894#1:1293\n894#1:1297\n1040#1:1315,2\n1070#1:1323,7\n1045#1:1317,6\n*E\n"})
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final InterfaceC5429e SharedTransitionObserver$delegate = AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new InterfaceC6469a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2
        @Override // p152r6.InterfaceC6469a
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new InterfaceC6471c() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC6469a) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(InterfaceC6469a interfaceC6469a) {
                    interfaceC6469a.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });
    private final /* synthetic */ LookaheadScope $$delegate_0;

    @NotNull
    private final InterfaceC6009v coroutineScope;
    private boolean disposed;

    @Nullable
    private LayoutCoordinates nullableLookaheadRoot;
    public LayoutCoordinates root;

    /* renamed from: isTransitionActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isTransitionActive = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private final InterfaceC6469a observeAnimatingBlock = new InterfaceC6469a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m6623invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6623invoke() {
            MutableScatterMap mutableScatterMap = this.this$0.sharedElements;
            Object[] objArr = mutableScatterMap.keys;
            Object[] objArr2 = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i << 3) + i9;
                            Object obj = objArr[i10];
                            if (((SharedElement) objArr2[i10]).isAnimating()) {
                                return;
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }
    };

    @NotNull
    private final InterfaceC6471c updateTransitionActiveness = new InterfaceC6471c() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness.1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SharedTransitionScope) obj);
            return C5443s.f8405a;
        }

        public final void invoke(SharedTransitionScope sharedTransitionScope) {
            SharedTransitionScopeImpl.this.updateTransitionActiveness();
        }
    };

    @NotNull
    private final SnapshotStateList<LayerRenderer> renderers = SnapshotStateKt.mutableStateListOf();

    @NotNull
    private final MutableScatterMap<Object, SharedElement> sharedElements = new MutableScatterMap<>(0, 1, null);

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m5110d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver$delegate", "Ld6/e;", "getSharedTransitionObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SnapshotStateObserver getSharedTransitionObserver() {
            return (SnapshotStateObserver) SharedTransitionScopeImpl.SharedTransitionObserver$delegate.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/graphics/Shape;)V", "getClipShape", "()Landroidx/compose/ui/graphics/Shape;", "path", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "sharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {

        @NotNull
        private final Shape clipShape;

        @NotNull
        private final Path path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(@NotNull Shape shape) {
            this.clipShape = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        @NotNull
        public Path getClipPath(@NotNull SharedTransitionScope.SharedContentState sharedContentState, @NotNull Rect bounds, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo6813createOutlinePq9zytI(bounds.m10474getSizeNHjbRc(), layoutDirection, density));
            this.path.mo10577translatek4lQ0M(bounds.m10476getTopLeftF1C5BW0());
            return this.path;
        }

        @NotNull
        public final Shape getClipShape() {
            return this.clipShape;
        }
    }

    public SharedTransitionScopeImpl(@NotNull LookaheadScope lookaheadScope, @NotNull InterfaceC6009v interfaceC6009v) {
        this.coroutineScope = interfaceC6009v;
        this.$$delegate_0 = lookaheadScope;
    }

    private final void observeIsAnimating() {
        if (this.disposed) {
            return;
        }
        INSTANCE.getSharedTransitionObserver().observeReads(this, this.updateTransitionActiveness, this.observeAnimatingBlock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final SharedElementInternalState rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z8, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f, boolean z9, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2066772852, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, z8, overlayClip, z9, sharedContentState, f);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedElementInternalState sharedElementInternalState = (SharedElementInternalState) objRememberedValue;
        sharedContentState.setInternalState$animation_release(sharedElementInternalState);
        sharedElementInternalState.setSharedElement(sharedElement);
        sharedElementInternalState.setRenderOnlyWhenVisible(z8);
        sharedElementInternalState.setBoundsAnimation(boundsAnimation);
        sharedElementInternalState.setPlaceHolderSize(placeHolderSize);
        sharedElementInternalState.setOverlayClip(overlayClip);
        sharedElementInternalState.setZIndex(f);
        sharedElementInternalState.setRenderInOverlayDuringTransition(z9);
        sharedElementInternalState.setUserState(sharedContentState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedElementInternalState;
    }

    private void setTransitionActive(boolean z8) {
        this.isTransitionActive.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Modifier sharedBoundsImpl(Modifier modifier, final SharedTransitionScope.SharedContentState sharedContentState, final Transition<T> transition, final InterfaceC6471c interfaceC6471c, final BoundsTransform boundsTransform, final SharedTransitionScope.PlaceHolderSize placeHolderSize, final boolean z8, final boolean z9, final float f, final SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC6474f() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                Transition transitionRememberTransition;
                Composer composer2 = composer;
                composer.startReplaceGroup(-1843478929);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843478929, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:915)");
                }
                Object key = sharedContentState.getKey();
                composer.startMovableGroup(-359689844, key);
                SharedTransitionScopeImpl sharedTransitionScopeImpl = this;
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = sharedTransitionScopeImpl.sharedElementsFor(key);
                    composer.updateRememberedValue(objRememberedValue);
                }
                SharedElement sharedElement = (SharedElement) objRememberedValue;
                composer.startMovableGroup(-359686031, transition);
                boolean z10 = false;
                if (transition != null) {
                    composer.startReplaceGroup(1734686048);
                    Transition<T> transition2 = transition;
                    String string = key.toString();
                    InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
                    boolean zChanged = composer.changed(transition2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = transition2.getCurrentState();
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    if (transition2.isSeeking()) {
                        objRememberedValue2 = transition2.getCurrentState();
                    }
                    composer.startReplaceGroup(1329676753);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                    }
                    Boolean bool = (Boolean) interfaceC6471c2.invoke(objRememberedValue2);
                    bool.getClass();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    Object targetState = transition2.getTargetState();
                    composer.startReplaceGroup(1329676753);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                    }
                    Boolean bool2 = (Boolean) interfaceC6471c2.invoke(targetState);
                    bool2.getClass();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    transitionRememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition2, bool, bool2, string, composer2, 0);
                    composer2 = composer2;
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1734936683);
                    InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
                    AbstractC5830k.m5328e(interfaceC6471c3, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                    AbstractC5835p.m5354c(1, interfaceC6471c3);
                    Boolean bool3 = (Boolean) interfaceC6471c3.invoke(C5443s.f8405a);
                    boolean zBooleanValue = bool3.booleanValue();
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        if (sharedElement.getCurrentBounds() == null) {
                            z10 = zBooleanValue;
                        } else if (!zBooleanValue) {
                            z10 = true;
                        }
                        objRememberedValue3 = new MutableTransitionState(Boolean.valueOf(z10));
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                    mutableTransitionState.setTargetState$animation_core_release(bool3);
                    transitionRememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, null, composer, MutableTransitionState.$stable, 2);
                    composer.endReplaceGroup();
                }
                composer.startMovableGroup(-359623378, Boolean.valueOf(this.isTransitionActive()));
                Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transitionRememberTransition, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), null, composer2, 0, 2);
                composer.endMovableGroup();
                boolean zChanged2 = composer.changed(transitionRememberTransition);
                SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this;
                BoundsTransform boundsTransform2 = boundsTransform;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new BoundsAnimation(sharedTransitionScopeImpl2, transitionRememberTransition, deferredAnimationCreateDeferredAnimation, boundsTransform2);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                BoundsAnimation boundsAnimation = (BoundsAnimation) objRememberedValue4;
                boundsAnimation.updateAnimation(deferredAnimationCreateDeferredAnimation, boundsTransform);
                composer.endMovableGroup();
                SharedElementInternalState sharedElementInternalStateRememberSharedElementState = this.rememberSharedElementState(sharedElement, boundsAnimation, placeHolderSize, z8, sharedContentState, overlayClip, f, z9, composer, 0);
                composer.endMovableGroup();
                Modifier modifierThen = modifier2.then(new SharedBoundsNodeElement(sharedElementInternalStateRememberSharedElementState));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    /* renamed from: sharedBoundsWithCallerManagedVisibility$animation_release$default */
    public static /* synthetic */ Modifier m928x75365d0b(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z8, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z9, float f, SharedTransitionScope.OverlayClip overlayClip, int i, Object obj) {
        if ((i & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i & 8) != 0) {
            placeHolderSize = SharedTransitionScope.PlaceHolderSize.INSTANCE.getContentSize();
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation_release(modifier, sharedContentState, z8, boundsTransform2, placeHolderSize, (i & 16) != 0 ? true : z9, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement sharedElementsFor(Object key) {
        SharedElement sharedElement = this.sharedElements.get(key);
        if (sharedElement != null) {
            return sharedElement;
        }
        SharedElement sharedElement2 = new SharedElement(key, this);
        this.sharedElements.set(key, sharedElement2);
        return sharedElement2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateTransitionActiveness() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness():void");
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public SharedTransitionScope.OverlayClip OverlayClip(@NotNull Shape clipShape) {
        return new ShapeBasedClip(clipShape);
    }

    public final void clearObservation$animation_release(@NotNull Object scope) {
        INSTANCE.getSharedTransitionObserver().clear(scope);
    }

    public final void drawInOverlay$animation_release(@NotNull ContentDrawScope scope) {
        SnapshotStateList<LayerRenderer> snapshotStateList = this.renderers;
        if (snapshotStateList.size() > 1) {
            AbstractC5809x.m5289Q(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t8, T t9) {
                    LayerRenderer layerRenderer = (LayerRenderer) t8;
                    LayerRenderer layerRenderer2 = (LayerRenderer) t9;
                    return AbstractC6768a.m6441f(Float.valueOf((layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.getZIndex()), Float.valueOf((layerRenderer2.getZIndex() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        SnapshotStateList<LayerRenderer> snapshotStateList2 = this.renderers;
        int size = snapshotStateList2.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList2.get(i).drawInOverlay(scope);
        }
    }

    @NotNull
    public final InterfaceC6009v getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: getDisposed$animation_release, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    @NotNull
    public final LayoutCoordinates getLookaheadRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // androidx.compose.p011ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(placementScope);
    }

    @Nullable
    /* renamed from: getNullableLookaheadRoot$animation_release, reason: from getter */
    public final LayoutCoordinates getNullableLookaheadRoot() {
        return this.nullableLookaheadRoot;
    }

    @NotNull
    public final SnapshotStateObserver getObserverForTest$animation_release() {
        return INSTANCE.getSharedTransitionObserver();
    }

    @NotNull
    public final LayoutCoordinates getRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.root;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        AbstractC5830k.m5339p("root");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive.getValue()).booleanValue();
    }

    @Override // androidx.compose.p011ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public long mo6622localLookaheadPositionOfauaQtc(@NotNull LayoutCoordinates layoutCoordinates, @NotNull LayoutCoordinates layoutCoordinates2, long j7, boolean z8) {
        return this.$$delegate_0.mo6622localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j7, z8);
    }

    public final void observeReads$animation_release(@NotNull SharedElement scope, @NotNull InterfaceC6471c onValueChangedForScope, @NotNull InterfaceC6469a block) {
        if (this.disposed) {
            return;
        }
        INSTANCE.getSharedTransitionObserver().observeReads(scope, onValueChangedForScope, block);
    }

    public final void onDispose$animation_release() {
        INSTANCE.getSharedTransitionObserver().clear(this);
        this.disposed = true;
    }

    public final void onLayerRendererCreated$animation_release(@NotNull LayerRenderer renderer) {
        this.renderers.add(renderer);
    }

    public final void onLayerRendererRemoved$animation_release(@NotNull LayerRenderer renderer) {
        this.renderers.remove(renderer);
    }

    public final void onStateAdded$animation_release(@NotNull SharedElementInternalState sharedElementState) {
        SharedElement sharedElement = sharedElementState.getSharedElement();
        sharedElement.addState(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        Iterator<LayerRenderer> it = this.renderers.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            LayerRenderer next = it.next();
            SharedElementInternalState sharedElementInternalState = next instanceof SharedElementInternalState ? (SharedElementInternalState) next : null;
            if (AbstractC5830k.m5325b(sharedElementInternalState != null ? sharedElementInternalState.getSharedElement() : null, sharedElementState.getSharedElement())) {
                break;
            } else {
                i++;
            }
        }
        if (i == this.renderers.size() - 1 || i == -1) {
            this.renderers.add(sharedElementState);
        } else {
            this.renderers.add(i + 1, sharedElementState);
        }
    }

    public final void onStateRemoved$animation_release(@NotNull SharedElementInternalState sharedElementState) {
        SharedElement sharedElement = sharedElementState.getSharedElement();
        sharedElement.removeState(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        this.renderers.remove(sharedElementState);
        if (sharedElement.getStates().isEmpty()) {
            AbstractC6014x.m5651v(sharedElement.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1(sharedElement, null), 3);
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @Composable
    @NotNull
    public SharedTransitionScope.SharedContentState rememberSharedContentState(@NotNull Object obj, @Nullable Composer composer, int i) {
        composer.startReplaceGroup(799702514);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(799702514, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:874)");
        }
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SharedTransitionScope.SharedContentState(obj);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedTransitionScope.SharedContentState sharedContentState = (SharedTransitionScope.SharedContentState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sharedContentState;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier renderInSharedTransitionScopeOverlay(@NotNull Modifier modifier, @NotNull InterfaceC6469a interfaceC6469a, float f, @NotNull InterfaceC6473e interfaceC6473e) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, interfaceC6469a, f, interfaceC6473e));
    }

    public final void setNullableLookaheadRoot$animation_release(@Nullable LayoutCoordinates layoutCoordinates) {
        this.nullableLookaheadRoot = layoutCoordinates;
    }

    public final void setRoot$animation_release(@NotNull LayoutCoordinates layoutCoordinates) {
        this.root = layoutCoordinates;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier sharedBounds(@NotNull Modifier modifier, @NotNull final SharedTransitionScope.SharedContentState sharedContentState, @NotNull final AnimatedVisibilityScope animatedVisibilityScope, @NotNull final EnterTransition enterTransition, @NotNull final ExitTransition exitTransition, @NotNull BoundsTransform boundsTransform, @NotNull final SharedTransitionScope.ResizeMode resizeMode, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z8, float f, @NotNull SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new InterfaceC6471c() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.1
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, false, z8, f, overlayClip), null, new InterfaceC6474f() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                Modifier modifierCreateContentScaleModifier;
                composer.startReplaceGroup(-419341573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-419341573, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:736)");
                }
                Transition<EnterExitState> transition = animatedVisibilityScope.getTransition();
                EnterTransition enterTransition2 = enterTransition;
                ExitTransition exitTransition2 = exitTransition;
                boolean zChangedInstance = composer.changedInstance(sharedContentState);
                final SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public final Boolean invoke() {
                            return Boolean.valueOf(sharedContentState2.isMatchFound());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transition, enterTransition2, exitTransition2, (InterfaceC6469a) objRememberedValue, "enter/exit for " + sharedContentState.getKey(), composer, 0, 0);
                if (resizeMode instanceof ScaleToBoundsImpl) {
                    composer.startReplaceGroup(-805568624);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) resizeMode;
                    boolean zChangedInstance2 = composer.changedInstance(sharedContentState);
                    final SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new InterfaceC6469a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                            {
                                super(0);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public final Boolean invoke() {
                                return Boolean.valueOf(sharedContentState3.isMatchFound());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    modifierCreateContentScaleModifier = SkipToLookaheadNodeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (InterfaceC6469a) objRememberedValue2);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-804951414);
                    composer.endReplaceGroup();
                    modifierCreateContentScaleModifier = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifierCreateModifier.then(modifierCreateContentScaleModifier);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    @NotNull
    public final Modifier sharedBoundsWithCallerManagedVisibility$animation_release(@NotNull Modifier modifier, @NotNull SharedTransitionScope.SharedContentState sharedContentState, final boolean z8, @NotNull BoundsTransform boundsTransform, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z9, float f, @NotNull SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new InterfaceC6471c() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(C5443s c5443s) {
                return Boolean.valueOf(z8);
            }
        }, boundsTransform, placeHolderSize, false, z9, f, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier sharedElement(@NotNull Modifier modifier, @NotNull SharedTransitionScope.SharedContentState sharedContentState, @NotNull AnimatedVisibilityScope animatedVisibilityScope, @NotNull BoundsTransform boundsTransform, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z8, float f, @NotNull SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new InterfaceC6471c() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedElement.1
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, true, z8, f, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier sharedElementWithCallerManagedVisibility(@NotNull Modifier modifier, @NotNull SharedTransitionScope.SharedContentState sharedContentState, final boolean z8, @NotNull BoundsTransform boundsTransform, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z9, float f, @NotNull SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new InterfaceC6471c() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedElementWithCallerManagedVisibility.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(C5443s c5443s) {
                return Boolean.valueOf(z8);
            }
        }, boundsTransform, placeHolderSize, true, z9, f, overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier skipToLookaheadSize(@NotNull Modifier modifier) {
        return modifier.then(new SkipToLookaheadElement(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.p011ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }
}
