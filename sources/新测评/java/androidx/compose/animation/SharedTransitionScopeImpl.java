package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.OutlineKt;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LookaheadScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.exifinterface.media.ExifInterface;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@ExperimentalSharedTransitionApi
@Metadata(m13557d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0004\u0083\u0001\u0084\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0015\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020*H\u0000¢\u0006\u0002\b8J\u0015\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020:H\u0000¢\u0006\u0002\b;J\b\u0010<\u001a\u00020\u001dH\u0002J7\u0010=\u001a\u00020\u001d2\u0006\u00107\u001a\u00020+2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001d0-2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000¢\u0006\u0002\b@J\r\u0010A\u001a\u00020\u001dH\u0000¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020$H\u0000¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020$H\u0000¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0000¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020*H\u0017¢\u0006\u0002\u0010QJM\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\nH\u0003¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020+2\u0006\u0010P\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J3\u0010`\u001a\u00020a*\u00020\u00142\u0006\u0010b\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020a2\b\b\u0002\u0010d\u001a\u00020\nH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\be\u0010fJ>\u0010g\u001a\u00020h*\u00020h2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010[\u001a\u00020\\2\u001a\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020l\u0012\u0006\u0012\u0004\u0018\u00010m0jH\u0016J\\\u0010n\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016Jp\u0010y\u001a\u00020h\"\u0004\b\u0000\u0010z*\u00020h2\u0006\u0010Y\u001a\u00020O2\u000e\u0010{\u001a\n\u0012\u0004\u0012\u0002Hz\u0018\u00010|2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u0002Hz\u0012\u0004\u0012\u00020\n0-2\u0006\u0010u\u001a\u00020v2\b\b\u0002\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0002JS\u0010~\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010}\u001a\u00020\n2\b\b\u0002\u0010u\u001a\u00020v2\b\b\u0002\u0010V\u001a\u00020W2\b\b\u0002\u0010]\u001a\u00020\n2\b\b\u0002\u0010[\u001a\u00020\\2\b\b\u0002\u0010Z\u001a\u000203H\u0000¢\u0006\u0002\b\u007fJD\u0010S\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010o\u001a\u00020p2\u0006\u0010u\u001a\u00020v2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016JE\u0010\u0080\u0001\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010}\u001a\u00020\n2\u0006\u0010u\u001a\u00020v2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016J\r\u0010\u0081\u0001\u001a\u00020h*\u00020hH\u0016J\u000e\u0010\u0082\u0001\u001a\u00020\u0014*\u00020\u0014H\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0014X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u001aR\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u00020\u0014*\u00020/X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0085\u0001"}, m13558d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "disposed", "getDisposed$animation_release", "()Z", "isTransitionActive", "setTransitionActive", "(Z)V", "isTransitionActive$delegate", "Landroidx/compose/runtime/MutableState;", "lookaheadRoot", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLookaheadRoot$animation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "nullableLookaheadRoot", "getNullableLookaheadRoot$animation_release", "setNullableLookaheadRoot$animation_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "observeAnimatingBlock", "Lkotlin/Function0;", "", "observerForTest", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getObserverForTest$animation_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "renderers", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/LayerRenderer;", "root", "getRoot$animation_release", "setRoot$animation_release", "sharedElements", "Landroidx/collection/MutableScatterMap;", "", "Landroidx/compose/animation/SharedElement;", "updateTransitionActiveness", "Lkotlin/Function1;", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "OverlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "clearObservation", "scope", "clearObservation$animation_release", "drawInOverlay", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawInOverlay$animation_release", "observeIsAnimating", "observeReads", "onValueChangedForScope", "block", "observeReads$animation_release", "onDispose", "onDispose$animation_release", "onLayerRendererCreated", "renderer", "onLayerRendererCreated$animation_release", "onLayerRendererRemoved", "onLayerRendererRemoved$animation_release", "onStateAdded", "sharedElementState", "Landroidx/compose/animation/SharedElementInternalState;", "onStateAdded$animation_release", "onStateRemoved", "onStateRemoved$animation_release", "rememberSharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "key", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "rememberSharedElementState", "sharedElement", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderOnlyWhenVisible", "sharedContentState", "clipInOverlayDuringTransition", "zIndexInOverlay", "", "renderInOverlayDuringTransition", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;", "sharedElementsFor", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "sourceCoordinates", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "renderInSharedTransitionScopeOverlay", "Landroidx/compose/ui/Modifier;", "renderInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "sharedBounds", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "resizeMode", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "sharedBoundsImpl", ExifInterface.GPS_DIRECTION_TRUE, "parentTransition", "Landroidx/compose/animation/core/Transition;", "visible", "sharedBoundsWithCallerManagedVisibility", "sharedBoundsWithCallerManagedVisibility$animation_release", "sharedElementWithCallerManagedVisibility", "skipToLookaheadSize", "toLookaheadCoordinates", "Companion", "ShapeBasedClip", "animation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1221:1\n85#2:1222\n113#2,2:1223\n1247#3,6:1225\n1247#3,6:1308\n385#4:1231\n357#4,4:1232\n329#4,6:1236\n339#4,3:1243\n342#4,9:1247\n361#4:1256\n386#4:1257\n357#4,4:1258\n329#4,6:1262\n339#4,3:1269\n342#4,9:1273\n361#4:1282\n357#4,4:1283\n329#4,6:1287\n339#4,3:1294\n342#4,9:1298\n361#4:1307\n1399#5:1242\n1270#5:1246\n1399#5:1268\n1270#5:1272\n1399#5:1293\n1270#5:1297\n1#6:1314\n1002#7,2:1315\n350#7,7:1323\n34#8,6:1317\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n673#1:1222\n673#1:1223,2\n875#1:1225,6\n992#1:1308,6\n887#1:1231\n887#1:1232,4\n887#1:1236,6\n887#1:1243,3\n887#1:1247,9\n887#1:1256\n887#1:1257\n891#1:1258,4\n891#1:1262,6\n891#1:1269,3\n891#1:1273,9\n891#1:1282\n894#1:1283,4\n894#1:1287,6\n894#1:1294,3\n894#1:1298,9\n894#1:1307\n887#1:1242\n887#1:1246\n891#1:1268\n891#1:1272\n894#1:1293\n894#1:1297\n1040#1:1315,2\n1070#1:1323,7\n1045#1:1317,6\n*E\n"})
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<SnapshotStateObserver> SharedTransitionObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SnapshotStateObserver>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                    invoke2((Function0<Unit>) function0);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Function0<Unit> function0) {
                    function0.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });
    private final /* synthetic */ LookaheadScope $$delegate_0;
    private final CoroutineScope coroutineScope;
    private boolean disposed;
    private LayoutCoordinates nullableLookaheadRoot;
    public LayoutCoordinates root;

    /* renamed from: isTransitionActive$delegate, reason: from kotlin metadata */
    private final MutableState isTransitionActive = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final Function0<Unit> observeAnimatingBlock = new Function0<Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableScatterMap mutableScatterMap = this.this$0.sharedElements;
            Object[] objArr = mutableScatterMap.keys;
            Object[] objArr2 = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            if (((SharedElement) objArr2[i13]).isAnimating()) {
                                return;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }
    };
    private final Function1<SharedTransitionScope, Unit> updateTransitionActiveness = new Function1<SharedTransitionScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness.1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedTransitionScope sharedTransitionScope) {
            invoke2(sharedTransitionScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SharedTransitionScope sharedTransitionScope) {
            SharedTransitionScopeImpl.this.updateTransitionActiveness();
        }
    };
    private final SnapshotStateList<LayerRenderer> renderers = SnapshotStateKt.mutableStateListOf();
    private final MutableScatterMap<Object, SharedElement> sharedElements = new MutableScatterMap<>(0, 1, null);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m13558d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;", "", "()V", "SharedTransitionObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSharedTransitionObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver$delegate", "Lkotlin/Lazy;", "animation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SnapshotStateObserver getSharedTransitionObserver() {
            return (SnapshotStateObserver) SharedTransitionScopeImpl.SharedTransitionObserver$delegate.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m13558d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/graphics/Shape;)V", "getClipShape", "()Landroidx/compose/ui/graphics/Shape;", "path", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "sharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        private final Shape clipShape;
        private final Path path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(Shape shape) {
            this.clipShape = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect bounds, LayoutDirection layoutDirection, Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo17246createOutlinePq9zytI(bounds.m20768getSizeNHjbRc(), layoutDirection, density));
            this.path.mo20871translatek4lQ0M(bounds.m20770getTopLeftF1C5BW0());
            return this.path;
        }

        public final Shape getClipShape() {
            return this.clipShape;
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
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
    public final SharedElementInternalState rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z9, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f10, boolean z10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2066772852, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, z9, overlayClip, z10, sharedContentState, f10);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedElementInternalState sharedElementInternalState = (SharedElementInternalState) objRememberedValue;
        sharedContentState.setInternalState$animation_release(sharedElementInternalState);
        sharedElementInternalState.setSharedElement(sharedElement);
        sharedElementInternalState.setRenderOnlyWhenVisible(z9);
        sharedElementInternalState.setBoundsAnimation(boundsAnimation);
        sharedElementInternalState.setPlaceHolderSize(placeHolderSize);
        sharedElementInternalState.setOverlayClip(overlayClip);
        sharedElementInternalState.setZIndex(f10);
        sharedElementInternalState.setRenderInOverlayDuringTransition(z10);
        sharedElementInternalState.setUserState(sharedContentState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedElementInternalState;
    }

    private void setTransitionActive(boolean z9) {
        this.isTransitionActive.setValue(Boolean.valueOf(z9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Modifier sharedBoundsImpl(Modifier modifier, final SharedTransitionScope.SharedContentState sharedContentState, final Transition<T> transition, final Function1<? super T, Boolean> function1, final BoundsTransform boundsTransform, final SharedTransitionScope.PlaceHolderSize placeHolderSize, final boolean z9, final boolean z10, final float f10, final SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                Transition transitionRememberTransition;
                Composer composer2 = composer;
                composer.startReplaceGroup(-1843478929);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843478929, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:915)");
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
                boolean z11 = false;
                if (transition != null) {
                    composer.startReplaceGroup(1734686048);
                    Transition<T> transition2 = transition;
                    String string = key.toString();
                    Function1<T, Boolean> function12 = function1;
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
                    Boolean boolInvoke = function12.invoke(objRememberedValue2);
                    boolInvoke.booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    Object targetState = transition2.getTargetState();
                    composer.startReplaceGroup(1329676753);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                    }
                    Boolean boolInvoke2 = function12.invoke(targetState);
                    boolInvoke2.booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    transitionRememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition2, boolInvoke, boolInvoke2, string, composer2, 0);
                    composer2 = composer2;
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1734936683);
                    Function function = function1;
                    Intrinsics.checkNotNull(function, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                    Boolean bool = (Boolean) ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function, 1)).invoke(Unit.INSTANCE);
                    boolean zBooleanValue = bool.booleanValue();
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        if (sharedElement.getCurrentBounds() == null) {
                            z11 = zBooleanValue;
                        } else if (!zBooleanValue) {
                            z11 = true;
                        }
                        objRememberedValue3 = new MutableTransitionState(Boolean.valueOf(z11));
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                    mutableTransitionState.setTargetState$animation_core_release(bool);
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
                SharedElementInternalState sharedElementInternalStateRememberSharedElementState = this.rememberSharedElementState(sharedElement, boundsAnimation, placeHolderSize, z9, sharedContentState, overlayClip, f10, z10, composer, 0);
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
    public static /* synthetic */ Modifier m1041x75365d0b(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z9, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z10, float f10, SharedTransitionScope.OverlayClip overlayClip, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i10 & 8) != 0) {
            placeHolderSize = SharedTransitionScope.PlaceHolderSize.INSTANCE.getContentSize();
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation_release(modifier, sharedContentState, z9, boundsTransform2, placeHolderSize, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? 0.0f : f10, (i10 & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
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
    public SharedTransitionScope.OverlayClip OverlayClip(Shape clipShape) {
        return new ShapeBasedClip(clipShape);
    }

    public final void clearObservation$animation_release(Object scope) {
        INSTANCE.getSharedTransitionObserver().clear(scope);
    }

    public final void drawInOverlay$animation_release(ContentDrawScope scope) {
        SnapshotStateList<LayerRenderer> snapshotStateList = this.renderers;
        if (snapshotStateList.size() > 1) {
            CollectionsKt.sortWith(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    LayerRenderer layerRenderer = (LayerRenderer) t10;
                    LayerRenderer layerRenderer2 = (LayerRenderer) t11;
                    return ComparisonsKt.compareValues(Float.valueOf((layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.getZIndex()), Float.valueOf((layerRenderer2.getZIndex() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        SnapshotStateList<LayerRenderer> snapshotStateList2 = this.renderers;
        int size = snapshotStateList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList2.get(i10).drawInOverlay(scope);
        }
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: getDisposed$animation_release, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public final LayoutCoordinates getLookaheadRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // androidx.compose.p013ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(placementScope);
    }

    /* renamed from: getNullableLookaheadRoot$animation_release, reason: from getter */
    public final LayoutCoordinates getNullableLookaheadRoot() {
        return this.nullableLookaheadRoot;
    }

    public final SnapshotStateObserver getObserverForTest$animation_release() {
        return INSTANCE.getSharedTransitionObserver();
    }

    public final LayoutCoordinates getRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.root;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive.getValue()).booleanValue();
    }

    @Override // androidx.compose.p013ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public long mo17064localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j10, boolean z9) {
        return this.$$delegate_0.mo17064localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j10, z9);
    }

    public final void observeReads$animation_release(SharedElement scope, Function1<? super SharedElement, Unit> onValueChangedForScope, Function0<Unit> block) {
        if (this.disposed) {
            return;
        }
        INSTANCE.getSharedTransitionObserver().observeReads(scope, onValueChangedForScope, block);
    }

    public final void onDispose$animation_release() {
        INSTANCE.getSharedTransitionObserver().clear(this);
        this.disposed = true;
    }

    public final void onLayerRendererCreated$animation_release(LayerRenderer renderer) {
        this.renderers.add(renderer);
    }

    public final void onLayerRendererRemoved$animation_release(LayerRenderer renderer) {
        this.renderers.remove(renderer);
    }

    public final void onStateAdded$animation_release(SharedElementInternalState sharedElementState) {
        SharedElement sharedElement = sharedElementState.getSharedElement();
        sharedElement.addState(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        Iterator<LayerRenderer> it = this.renderers.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            LayerRenderer next = it.next();
            SharedElementInternalState sharedElementInternalState = next instanceof SharedElementInternalState ? (SharedElementInternalState) next : null;
            if (Intrinsics.areEqual(sharedElementInternalState != null ? sharedElementInternalState.getSharedElement() : null, sharedElementState.getSharedElement())) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == this.renderers.size() - 1 || i10 == -1) {
            this.renderers.add(sharedElementState);
        } else {
            this.renderers.add(i10 + 1, sharedElementState);
        }
    }

    public final void onStateRemoved$animation_release(SharedElementInternalState sharedElementState) {
        SharedElement sharedElement = sharedElementState.getSharedElement();
        sharedElement.removeState(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        this.renderers.remove(sharedElementState);
        if (sharedElement.getStates().isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(sharedElement.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1(sharedElement, null), 3, null);
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @Composable
    public SharedTransitionScope.SharedContentState rememberSharedContentState(Object obj, Composer composer, int i10) {
        composer.startReplaceGroup(799702514);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(799702514, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:874)");
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
    public Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, Function0<Boolean> function0, float f10, Function2<? super LayoutDirection, ? super Density, ? extends Path> function2) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, function0, f10, function2));
    }

    public final void setNullableLookaheadRoot$animation_release(LayoutCoordinates layoutCoordinates) {
        this.nullableLookaheadRoot = layoutCoordinates;
    }

    public final void setRoot$animation_release(LayoutCoordinates layoutCoordinates) {
        this.root = layoutCoordinates;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedBounds(Modifier modifier, final SharedTransitionScope.SharedContentState sharedContentState, final AnimatedVisibilityScope animatedVisibilityScope, final EnterTransition enterTransition, final ExitTransition exitTransition, BoundsTransform boundsTransform, final SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z9, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new Function1<EnterExitState, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, false, z9, f10, overlayClip), null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                Modifier modifierCreateContentScaleModifier;
                composer.startReplaceGroup(-419341573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-419341573, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:736)");
                }
                Transition<EnterExitState> transition = animatedVisibilityScope.getTransition();
                EnterTransition enterTransition2 = enterTransition;
                ExitTransition exitTransition2 = exitTransition;
                boolean zChangedInstance = composer.changedInstance(sharedContentState);
                final SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(sharedContentState2.isMatchFound());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transition, enterTransition2, exitTransition2, (Function0) objRememberedValue, "enter/exit for " + sharedContentState.getKey(), composer, 0, 0);
                if (resizeMode instanceof ScaleToBoundsImpl) {
                    composer.startReplaceGroup(-805568624);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) resizeMode;
                    boolean zChangedInstance2 = composer.changedInstance(sharedContentState);
                    final SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(sharedContentState3.isMatchFound());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    modifierCreateContentScaleModifier = SkipToLookaheadNodeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (Function0) objRememberedValue2);
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

    public final Modifier sharedBoundsWithCallerManagedVisibility$animation_release(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, final boolean z9, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z10, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new Function1<Unit, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Unit unit) {
                return Boolean.valueOf(z9);
            }
        }, boundsTransform, placeHolderSize, false, z10, f10, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElement(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z9, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new Function1<EnterExitState, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedElement.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, true, z9, f10, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, final boolean z9, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z10, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new Function1<Unit, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedElementWithCallerManagedVisibility.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Unit unit) {
                return Boolean.valueOf(z9);
            }
        }, boundsTransform, placeHolderSize, true, z10, f10, overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier skipToLookaheadSize(Modifier modifier) {
        return modifier.then(new SkipToLookaheadElement(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.p013ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }
}
