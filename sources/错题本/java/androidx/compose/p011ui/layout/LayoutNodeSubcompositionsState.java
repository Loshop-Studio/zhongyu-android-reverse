package androidx.compose.p011ui.layout;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.SubcomposeLayoutState;
import androidx.compose.p011ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.LayoutNodeKt;
import androidx.compose.p011ui.node.LookaheadDelegate;
import androidx.compose.p011ui.node.LookaheadPassDelegate;
import androidx.compose.p011ui.node.MeasurePassDelegate;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.TraversableNodeKt;
import androidx.compose.p011ui.platform.SubcompositionKt;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003yz{B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ,\u0010\"\u001a\u00020!2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b¢\u0006\u0002\b\u001f¢\u0006\u0004\b\"\u0010#J*\u0010%\u001a\u00020$2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ4\u0010\u0014\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0004\b\u0014\u0010)J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b\u0014\u0010,JD\u00105\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0004\b5\u00106J'\u00109\u001a\u0004\u0018\u00010\r2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u000200H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\nJ\u0013\u0010?\u001a\u00020\b*\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\nJ(\u0010F\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\u001e2\u000e\b\u0004\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0082\b¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\bH\u0010IJ)\u0010M\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00162\b\b\u0002\u0010L\u001a\u00020\u0016H\u0002¢\u0006\u0004\bM\u0010NJ\u001e\u0010O\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0082\b¢\u0006\u0004\bO\u0010PJ2\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0004\bQ\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR$\u0010S\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010`R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010dR\u0018\u0010g\u001a\u00060fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u00060iR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010l\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010dR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010p\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020$0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010dR\u001c\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010`R\u0016\u0010u\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010`R\u0014\u0010w\u001a\u00020v8\u0002X\u0082D¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006|"}, m5110d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "Ld6/s;", "onReuse", "()V", "onDeactivate", "onRelease", "", "slotId", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lr6/e;)Ljava/util/List;", "", "startIndex", "disposeOrReuseStartingFromIndex", "(I)V", "makeSureStateIsConsistent", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "(Lr6/e;)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lr6/e;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren", "node", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lr6/e;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "nodeState", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;)V", "Landroidx/compose/runtime/ReusableComposition;", "existing", "container", "", "reuseContent", "Landroidx/compose/runtime/CompositionContext;", "parent", ComposeNavigator.NAME, "subcomposeInto", "(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lr6/e;)Landroidx/compose/runtime/ReusableComposition;", "foldedChildren", "index", "getSlotIdAtIndex", "(Ljava/util/List;I)Ljava/lang/Object;", "deactivate", "markActiveNodesAsReused", "(Z)V", "disposeCurrentNodes", "resetLayoutState", "(Landroidx/compose/ui/node/LayoutNode;)V", "takeNodeFromReusables", "(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;", "disposeUnusedSlotsInApproach", "result", "placeChildrenBlock", "createMeasureResult", "(Landroidx/compose/ui/layout/MeasureResult;Lr6/a;)Landroidx/compose/ui/layout/MeasureResult;", "createNodeAt", "(I)Landroidx/compose/ui/node/LayoutNode;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move", "(III)V", "ignoreRemeasureRequests", "(Lr6/a;)V", "approachSubcompose", "Landroidx/compose/ui/node/LayoutNode;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "value", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "currentIndex", "I", "currentApproachIndex", "Landroidx/collection/MutableScatterMap;", "nodeToNodeState", "Landroidx/collection/MutableScatterMap;", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "approachMeasureScope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "precomposeMap", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableSlotIdsSet", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "approachPrecomposeSlotHandleMap", "Landroidx/compose/runtime/collection/MutableVector;", "approachComposedSlotIds", "Landroidx/compose/runtime/collection/MutableVector;", "reusableCount", "precomposedCount", "", "NoIntrinsicsMessage", "Ljava/lang/String;", "ApproachMeasureScopeImpl", "NodeState", "Scope", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1037:1\n898#1:1066\n898#1:1078\n898#1:1188\n898#1:1193\n1101#2:1038\n1083#2,2:1039\n56#3,5:1041\n65#3,5:1047\n102#3,5:1053\n102#3,5:1120\n102#3,5:1125\n102#3,5:1130\n102#3,5:1202\n683#4:1046\n683#4:1058\n842#4:1136\n844#4,4:1150\n848#4:1160\n683#4:1161\n1#5:1052\n1#5:1059\n1#5:1135\n1#5:1162\n1#5:1187\n602#6,6:1060\n609#6:1071\n602#6,6:1072\n609#6:1083\n602#6,8:1084\n1149#7,4:1067\n1149#7,4:1079\n1149#7,2:1092\n1151#7,2:1118\n1149#7,4:1189\n1149#7,4:1194\n1149#7,4:1198\n372#8,3:1094\n329#8,6:1097\n339#8,3:1104\n342#8,9:1108\n375#8:1117\n329#8,6:1137\n339#8,3:1144\n342#8,2:1148\n345#8,6:1154\n372#8,3:1163\n329#8,6:1166\n339#8,3:1173\n342#8,9:1177\n375#8:1186\n1399#9:1103\n1270#9:1107\n1399#9:1143\n1270#9:1147\n1399#9:1172\n1270#9:1176\n34#10,6:1207\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n511#1:1066\n585#1:1078\n891#1:1188\n894#1:1193\n427#1:1038\n427#1:1039,2\n456#1:1041,5\n469#1:1047,5\n480#1:1053,5\n653#1:1120,5\n659#1:1125,5\n663#1:1130,5\n985#1:1202,5\n466#1:1046\n500#1:1058\n767#1:1136\n767#1:1150,4\n767#1:1160\n811#1:1161\n466#1:1052\n500#1:1059\n811#1:1162\n510#1:1060,6\n510#1:1071\n572#1:1072,6\n572#1:1083\n613#1:1084,8\n511#1:1067,4\n585#1:1079,4\n637#1:1092,2\n637#1:1118,2\n891#1:1189,4\n894#1:1194,4\n898#1:1198,4\n638#1:1094,3\n638#1:1097,6\n638#1:1104,3\n638#1:1108,9\n638#1:1117\n767#1:1137,6\n767#1:1144,3\n767#1:1148,2\n767#1:1154,6\n879#1:1163,3\n879#1:1166,6\n879#1:1173,3\n879#1:1177,9\n879#1:1186\n638#1:1103\n638#1:1107\n767#1:1143\n767#1:1147\n879#1:1172\n879#1:1176\n1007#1:1207,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;

    @Nullable
    private CompositionContext compositionContext;
    private int currentApproachIndex;
    private int currentIndex;
    private int precomposedCount;
    private int reusableCount;

    @NotNull
    private final LayoutNode root;

    @NotNull
    private SubcomposeSlotReusePolicy slotReusePolicy;

    @NotNull
    private final MutableScatterMap<LayoutNode, NodeState> nodeToNodeState = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private final MutableScatterMap<Object, LayoutNode> slotIdToNode = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private final Scope scope = new Scope();

    @NotNull
    private final ApproachMeasureScopeImpl approachMeasureScope = new ApproachMeasureScopeImpl();

    @NotNull
    private final MutableScatterMap<Object, LayoutNode> precomposeMap = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);

    @NotNull
    private final MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> approachPrecomposeSlotHandleMap = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private final MutableVector<Object> approachComposedSlotIds = new MutableVector<>(new Object[16], 0);

    @NotNull
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    @Metadata(m5109d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jl\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u0005*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u0005*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u0016*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u0016*\u00020 H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u001f\u001a\u00020\u0016*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\u0017\u0010(\u001a\u00020%*\u00020$H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020 *\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\"J\u0017\u0010*\u001a\u00020 *\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001eJ\u0014\u0010.\u001a\u00020-*\u00020,H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020$*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010'J\u0017\u00104\u001a\u00020\u001a*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u001a*\u00020 H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00103J\u001a\u00104\u001a\u00020\u001a*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J2\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u00108\u001a\u0004\u0018\u0001072\u0011\u0010;\u001a\r\u0012\u0004\u0012\u00020\r09¢\u0006\u0002\b:H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010F\u001a\u00020E8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, m5110d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lr6/c;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "(IILjava/util/Map;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "", "slotId", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lr6/e;)Ljava/util/List;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public ApproachMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.p011ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
        @NotNull
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.p011ui.layout.MeasureScope
        @NotNull
        public MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull InterfaceC6471c placementBlock) {
            return this.$$delegate_0.layout(width, height, alignmentLines, placementBlock);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo6896roundToPxR2X_6o(long j7) {
            return this.$$delegate_0.mo6896roundToPxR2X_6o(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo6897roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo6897roundToPx0680j_4(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.p011ui.layout.SubcomposeMeasureScope
        @NotNull
        public List<Measurable> subcompose(@Nullable Object slotId, @NotNull InterfaceC6473e content) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(slotId);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.approachSubcompose(slotId, content) : layoutNode.getChildMeasurables$ui_release();
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo6898toDpGaN1DYA(long j7) {
            return this.$$delegate_0.mo6898toDpGaN1DYA(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo6899toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo6899toDpu2uoSUM(f);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo6901toDpSizekrfVVM(long j7) {
            return this.$$delegate_0.mo6901toDpSizekrfVVM(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo6902toPxR2X_6o(long j7) {
            return this.$$delegate_0.mo6902toPxR2X_6o(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo6903toPx0680j_4(float f) {
            return this.$$delegate_0.mo6903toPx0680j_4(f);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        @NotNull
        public Rect toRect(@NotNull DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo6904toSizeXkaWNTQ(long j7) {
            return this.$$delegate_0.mo6904toSizeXkaWNTQ(j7);
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo6905toSp0xMU5do(float f) {
            return this.$$delegate_0.mo6905toSp0xMU5do(f);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo6906toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo6906toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.p011ui.layout.MeasureScope
        @NotNull
        public MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @Nullable InterfaceC6471c rulers, @NotNull InterfaceC6471c placementBlock) {
            return this.$$delegate_0.layout(width, height, alignmentLines, rulers, placementBlock);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo6900toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo6900toDpu2uoSUM(i);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo6907toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo6907toSpkPz2Gy4(i);
        }
    }

    @Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\f\u0010\rJg\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00061"}, m5110d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "", "slotId", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lr6/e;)Ljava/util/List;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lr6/c;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "", "density", "F", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "", "isLookingAhead", "()Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1037:1\n361#2:1038\n362#2,2:1042\n365#2:1045\n56#3,3:1039\n60#3:1044\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n*L\n935#1:1038\n935#1:1042,2\n935#1:1045\n935#1:1039,3\n935#1:1044\n*E\n"})
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;

        @NotNull
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.p011ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
        @NotNull
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.p011ui.layout.MeasureScope
        @NotNull
        public MeasureResult layout(final int width, final int height, @NotNull final Map<AlignmentLine, Integer> alignmentLines, @Nullable final InterfaceC6471c rulers, @NotNull final InterfaceC6471c placementBlock) {
            if (!((width & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & height) == 0)) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.p011ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return alignmentLines;
                }

                @Override // androidx.compose.p011ui.layout.MeasureResult
                /* renamed from: getHeight, reason: from getter */
                public int get$height() {
                    return height;
                }

                @Override // androidx.compose.p011ui.layout.MeasureResult
                /* renamed from: getRulers, reason: from getter */
                public InterfaceC6471c get$rulers() {
                    return rulers;
                }

                @Override // androidx.compose.p011ui.layout.MeasureResult
                /* renamed from: getWidth, reason: from getter */
                public int get$width() {
                    return width;
                }

                @Override // androidx.compose.p011ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadDelegate lookaheadDelegate;
                    if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) == null) {
                        placementBlock.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                    } else {
                        placementBlock.invoke(lookaheadDelegate.getPlacementScope());
                    }
                }
            };
        }

        public void setDensity(float f) {
            this.density = f;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.p011ui.layout.SubcomposeMeasureScope
        @NotNull
        public List<Measurable> subcompose(@Nullable Object slotId, @NotNull InterfaceC6473e content) {
            return LayoutNodeSubcompositionsState.this.subcompose(slotId, content);
        }
    }

    public LayoutNodeSubcompositionsState(@NotNull LayoutNode layoutNode, @NotNull SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> approachSubcompose(Object slotId, InterfaceC6473e content) {
        if (!(this.approachComposedSlotIds.getSize() >= this.currentApproachIndex)) {
            InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int size = this.approachComposedSlotIds.getSize();
        int i = this.currentApproachIndex;
        if (size == i) {
            this.approachComposedSlotIds.add(slotId);
        } else {
            this.approachComposedSlotIds.set(i, slotId);
        }
        this.currentApproachIndex++;
        if (!this.precomposeMap.contains(slotId)) {
            this.approachPrecomposeSlotHandleMap.set(slotId, precompose(slotId, content));
            if (this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                this.root.requestLookaheadRelayout$ui_release(true);
            } else {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, false, 6, null);
            }
        }
        LayoutNode layoutNode = this.precomposeMap.get(slotId);
        if (layoutNode != null) {
            List<MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
            int size2 = childDelegates$ui_release.size();
            for (int i8 = 0; i8 < size2; i8++) {
                childDelegates$ui_release.get(i8).markDetachedFromParentLookaheadPass$ui_release();
            }
            if (childDelegates$ui_release != null) {
                return childDelegates$ui_release;
            }
        }
        return EmptyList.INSTANCE;
    }

    private final MeasureResult createMeasureResult(final MeasureResult result, final InterfaceC6469a placeChildrenBlock) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasureResult.1
            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return result.getAlignmentLines();
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getHeight */
            public int get$height() {
                return result.get$height();
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getRulers */
            public InterfaceC6471c get$rulers() {
                return result.get$rulers();
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getWidth */
            public int get$width() {
                return result.get$width();
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public void placeChildren() {
                placeChildrenBlock.invoke();
            }
        };
    }

    private final LayoutNode createNodeAt(int index) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(index, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void disposeCurrentNodes() {
        /*
            r15 = this;
            androidx.compose.ui.node.LayoutNode r0 = r15.root
            r1 = 1
            androidx.compose.p011ui.node.LayoutNode.access$setIgnoreRemeasureRequests$p(r0, r1)
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r1 = r15.nodeToNodeState
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L53
            r5 = r4
        L13:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4e
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L48
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r11 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r11
            androidx.compose.runtime.ReusableComposition r11 = r11.getComposition()
            if (r11 == 0) goto L48
            r11.dispose()
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L4c:
            if (r8 != r9) goto L53
        L4e:
            if (r5 == r3) goto L53
            int r5 = r5 + 1
            goto L13
        L53:
            androidx.compose.ui.node.LayoutNode r1 = r15.root
            r1.removeAll$ui_release()
            androidx.compose.p011ui.node.LayoutNode.access$setIgnoreRemeasureRequests$p(r0, r4)
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r0 = r15.nodeToNodeState
            r0.clear()
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r0 = r15.slotIdToNode
            r0.clear()
            r15.precomposedCount = r4
            r15.reusableCount = r4
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r0 = r15.precomposeMap
            r0.clear()
            r15.makeSureStateIsConsistent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.layout.LayoutNodeSubcompositionsState.disposeCurrentNodes():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInApproach() {
        MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> mutableScatterMap = this.approachPrecomposeSlotHandleMap;
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
                        Object obj = mutableScatterMap.keys[i10];
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i10];
                        int iIndexOf = this.approachComposedSlotIds.indexOf(obj);
                        if (iIndexOf < 0 || iIndexOf >= this.currentApproachIndex) {
                            precomposedSlotHandle.dispose();
                            mutableScatterMap.removeValueAt(i10);
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

    private final Object getSlotIdAtIndex(List<LayoutNode> foldedChildren, int index) {
        NodeState nodeState = this.nodeToNodeState.get(foldedChildren.get(index));
        AbstractC5830k.m5327d(nodeState);
        return nodeState.getSlotId();
    }

    private final void ignoreRemeasureRequests(InterfaceC6469a block) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        block.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    private final void markActiveNodesAsReused(boolean deactivate) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = foldedChildren$ui_release.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i = 0; i < size; i++) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui_release.get(i);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        if (deactivate) {
                            ReusableComposition composition = nodeState.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            nodeState.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null));
                        } else {
                            nodeState.setActive(false);
                        }
                        nodeState.setSlotId(SubcomposeLayoutKt.ReusedSlotId);
                    }
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.slotIdToNode.clear();
        }
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int from, int to, int count) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(from, to, count);
        layoutNode.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i8, int i9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i9 = 1;
        }
        layoutNodeSubcompositionsState.move(i, i8, i9);
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final ReusableComposition subcomposeInto(ReusableComposition existing, LayoutNode container, boolean reuseContent, CompositionContext parent, InterfaceC6473e composable) {
        if (existing == null || existing.getDisposed()) {
            existing = SubcompositionKt.createSubcomposition(container, parent);
        }
        if (reuseContent) {
            existing.setContentWithReuse(composable);
            return existing;
        }
        existing.setContent(composable);
        return existing;
    }

    private final LayoutNode takeNodeFromReusables(Object slotId) {
        int i;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = foldedChildren$ui_release.size() - this.precomposedCount;
        int i8 = size - this.reusableCount;
        int i9 = size - 1;
        int i10 = i9;
        while (true) {
            if (i10 < i8) {
                i = -1;
                break;
            }
            if (AbstractC5830k.m5325b(getSlotIdAtIndex(foldedChildren$ui_release, i10), slotId)) {
                i = i10;
                break;
            }
            i10--;
        }
        if (i == -1) {
            while (i9 >= i8) {
                NodeState nodeState = this.nodeToNodeState.get(foldedChildren$ui_release.get(i9));
                AbstractC5830k.m5327d(nodeState);
                NodeState nodeState2 = nodeState;
                if (nodeState2.getSlotId() == SubcomposeLayoutKt.ReusedSlotId || this.slotReusePolicy.areCompatible(slotId, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(slotId);
                    i10 = i9;
                    i = i10;
                    break;
                }
                i9--;
            }
            i10 = i9;
        }
        if (i == -1) {
            return null;
        }
        if (i10 != i8) {
            move(i10, i8, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = foldedChildren$ui_release.get(i8);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        AbstractC5830k.m5327d(nodeState3);
        NodeState nodeState4 = nodeState3;
        nodeState4.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null));
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    @NotNull
    public final MeasurePolicy createMeasurePolicy(@NotNull final InterfaceC6473e block) {
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasurePolicy.1
            @Override // androidx.compose.p011ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo6545measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j7) {
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult measureResult = (MeasureResult) block.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m13245boximpl(j7));
                    final int i = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.p011ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return measureResult.getAlignmentLines();
                        }

                        @Override // androidx.compose.p011ui.layout.MeasureResult
                        /* renamed from: getHeight */
                        public int get$height() {
                            return measureResult.get$height();
                        }

                        @Override // androidx.compose.p011ui.layout.MeasureResult
                        /* renamed from: getRulers */
                        public InterfaceC6471c get$rulers() {
                            return measureResult.get$rulers();
                        }

                        @Override // androidx.compose.p011ui.layout.MeasureResult
                        /* renamed from: getWidth */
                        public int get$width() {
                            return measureResult.get$width();
                        }

                        @Override // androidx.compose.p011ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentIndex = i;
                            measureResult.placeChildren();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentApproachIndex = 0;
                final MeasureResult measureResult2 = (MeasureResult) block.invoke(LayoutNodeSubcompositionsState.this.approachMeasureScope, Constraints.m13245boximpl(j7));
                final int i8 = LayoutNodeSubcompositionsState.this.currentApproachIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.p011ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResult2.getAlignmentLines();
                    }

                    @Override // androidx.compose.p011ui.layout.MeasureResult
                    /* renamed from: getHeight */
                    public int get$height() {
                        return measureResult2.get$height();
                    }

                    @Override // androidx.compose.p011ui.layout.MeasureResult
                    /* renamed from: getRulers */
                    public InterfaceC6471c get$rulers() {
                        return measureResult2.get$rulers();
                    }

                    @Override // androidx.compose.p011ui.layout.MeasureResult
                    /* renamed from: getWidth */
                    public int get$width() {
                        return measureResult2.get$width();
                    }

                    @Override // androidx.compose.p011ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentApproachIndex = i8;
                        measureResult2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInApproach();
                    }
                };
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int startIndex) {
        boolean z8 = false;
        this.reusableCount = 0;
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = (foldedChildren$ui_release.size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(foldedChildren$ui_release, i));
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            boolean z9 = false;
            while (size >= startIndex) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui_release.get(size);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    AbstractC5830k.m5327d(nodeState);
                    NodeState nodeState2 = nodeState;
                    Object slotId = nodeState2.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState2.getActive()) {
                            resetLayoutState(layoutNode);
                            nodeState2.setActive(false);
                            z9 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        ReusableComposition composition = nodeState2.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui_release(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            z8 = z9;
        }
        if (z8) {
            Snapshot.INSTANCE.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void forceRecomposeChildren() {
        /*
            r14 = this;
            androidx.compose.ui.node.LayoutNode r0 = r14.root
            java.util.List r0 = r0.getFoldedChildren$ui_release()
            int r0 = r0.size()
            int r1 = r14.reusableCount
            if (r1 == r0) goto L68
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r0 = r14.nodeToNodeState
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r10 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r10
            r11 = 1
            r10.setForceRecompose(r11)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L1b
        L56:
            androidx.compose.ui.node.LayoutNode r0 = r14.root
            boolean r0 = r0.getMeasurePending$ui_release()
            if (r0 != 0) goto L68
            androidx.compose.ui.node.LayoutNode r1 = r14.root
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            androidx.compose.p011ui.node.LayoutNode.requestRemeasure$ui_release$default(r1, r2, r3, r4, r5, r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.layout.LayoutNodeSubcompositionsState.forceRecomposeChildren():void");
    }

    @Nullable
    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    @NotNull
    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui_release().size();
        if (!(this.nodeToNodeState.get_size() == size)) {
            InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.get_size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            StringBuilder sbM94s = AbstractC0037f.m94s(size, "Incorrect state. Total children ", ". Reusable children ");
            sbM94s.append(this.reusableCount);
            sbM94s.append(". Precomposed children ");
            sbM94s.append(this.precomposedCount);
            InlineClassHelperKt.throwIllegalArgumentException(sbM94s.toString());
        }
        if (this.precomposeMap.get_size() == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.get_size());
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    @NotNull
    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(@Nullable final Object slotId, @NotNull InterfaceC6473e content) {
        if (!this.root.isAttached()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(slotId)) {
            this.approachPrecomposeSlotHandleMap.remove(slotId);
            MutableScatterMap<Object, LayoutNode> mutableScatterMap = this.precomposeMap;
            LayoutNode layoutNodeTakeNodeFromReusables = mutableScatterMap.get(slotId);
            if (layoutNodeTakeNodeFromReusables == null) {
                layoutNodeTakeNodeFromReusables = takeNodeFromReusables(slotId);
                if (layoutNodeTakeNodeFromReusables != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNodeTakeNodeFromReusables), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeTakeNodeFromReusables = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                mutableScatterMap.set(slotId, layoutNodeTakeNodeFromReusables);
            }
            subcompose(layoutNodeTakeNodeFromReusables, slotId, content);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.remove(slotId);
                if (layoutNode != null) {
                    if (!(LayoutNodeSubcompositionsState.this.precomposedCount > 0)) {
                        InlineClassHelperKt.throwIllegalStateException("No pre-composed items to dispose");
                    }
                    int iIndexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
                    if (!(iIndexOf >= LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount)) {
                        InlineClassHelperKt.throwIllegalStateException("Item is not in pre-composed item range");
                    }
                    LayoutNodeSubcompositionsState.this.reusableCount++;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    layoutNodeSubcompositionsState.precomposedCount--;
                    int size = (LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) - LayoutNodeSubcompositionsState.this.reusableCount;
                    LayoutNodeSubcompositionsState.this.move(iIndexOf, size, 1);
                    LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(size);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                List<LayoutNode> children$ui_release;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(slotId);
                if (layoutNode == null || (children$ui_release = layoutNode.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo12059premeasure0kLqBqw(int index, long constraints) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(slotId);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return;
                }
                int size = layoutNode.getChildren$ui_release().size();
                if (index < 0 || index >= size) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + index + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode.isPlaced()) {
                    InlineClassHelperKt.throwIllegalArgumentException("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode).mo12375measureAndLayout0kLqBqw(layoutNode.getChildren$ui_release().get(index), constraints);
                layoutNode2.ignoreRemeasureRequests = false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void traverseDescendants(Object key, InterfaceC6471c block) {
                NodeChain nodes;
                Modifier.Node head;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(slotId);
                if (layoutNode == null || (nodes = layoutNode.getNodes()) == null || (head = nodes.getHead()) == null) {
                    return;
                }
                TraversableNodeKt.traverseDescendants(head, key, block);
            }
        };
    }

    public final void setCompositionContext(@Nullable CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(@NotNull SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.p011ui.layout.Measurable> subcompose(@org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r14) {
        /*
            r12 = this;
            r12.makeSureStateIsConsistent()
            androidx.compose.ui.node.LayoutNode r0 = r12.root
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r0 == r4) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r0 == r4) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r0 != r4) goto L1c
            goto L1e
        L1c:
            r4 = r2
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 != 0) goto L27
            java.lang.String r4 = "subcompose can only be used inside the measure or layout blocks"
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalStateException(r4)
        L27:
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r4 = r12.slotIdToNode
            java.lang.Object r5 = r4.get(r13)
            if (r5 != 0) goto L5d
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r5 = r12.precomposeMap
            java.lang.Object r5 = r5.remove(r13)
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p011ui.node.LayoutNode) r5
            if (r5 == 0) goto L4e
            int r6 = r12.precomposedCount
            if (r6 <= 0) goto L3f
            r6 = r3
            goto L40
        L3f:
            r6 = r2
        L40:
            if (r6 != 0) goto L47
            java.lang.String r6 = "Check failed."
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalStateException(r6)
        L47:
            int r6 = r12.precomposedCount
            int r6 = r6 + (-1)
            r12.precomposedCount = r6
            goto L5a
        L4e:
            androidx.compose.ui.node.LayoutNode r5 = r12.takeNodeFromReusables(r13)
            if (r5 != 0) goto L5a
            int r5 = r12.currentIndex
            androidx.compose.ui.node.LayoutNode r5 = r12.createNodeAt(r5)
        L5a:
            r4.set(r13, r5)
        L5d:
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p011ui.node.LayoutNode) r5
            androidx.compose.ui.node.LayoutNode r4 = r12.root
            java.util.List r4 = r4.getFoldedChildren$ui_release()
            int r6 = r12.currentIndex
            java.lang.Object r4 = kotlin.collections.AbstractC5805t.m5230j0(r6, r4)
            if (r4 == r5) goto La0
            androidx.compose.ui.node.LayoutNode r4 = r12.root
            java.util.List r4 = r4.getFoldedChildren$ui_release()
            int r7 = r4.indexOf(r5)
            int r4 = r12.currentIndex
            if (r7 < r4) goto L7c
            r2 = r3
        L7c:
            if (r2 != 0) goto L94
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Key \""
            r2.<init>(r4)
            r2.append(r13)
            java.lang.String r4 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalArgumentException(r2)
        L94:
            int r8 = r12.currentIndex
            if (r8 == r7) goto La0
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            move$default(r6, r7, r8, r9, r10, r11)
            goto La1
        La0:
            r6 = r12
        La1:
            int r2 = r6.currentIndex
            int r2 = r2 + r3
            r6.currentIndex = r2
            r12.subcompose(r5, r13, r14)
            if (r0 == r1) goto Lb5
            androidx.compose.ui.node.LayoutNode$LayoutState r13 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r0 != r13) goto Lb0
            goto Lb5
        Lb0:
            java.util.List r13 = r5.getChildLookaheadMeasurables$ui_release()
            return r13
        Lb5:
            java.util.List r13 = r5.getChildMeasurables$ui_release()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.layout.LayoutNodeSubcompositionsState.subcompose(java.lang.Object, r6.e):java.util.List");
    }

    @Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B0\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR-\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 ¨\u0006/"}, m5110d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "slotId", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/runtime/ReusableComposition;", "composition", "<init>", "(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/ReusableComposition;)V", "Ljava/lang/Object;", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "Lr6/e;", "getContent", "()Lr6/e;", "setContent", "(Lr6/e;)V", "Landroidx/compose/runtime/ReusableComposition;", "getComposition", "()Landroidx/compose/runtime/ReusableComposition;", "setComposition", "(Landroidx/compose/runtime/ReusableComposition;)V", "", "forceRecompose", "Z", "getForceRecompose", "()Z", "setForceRecompose", "(Z)V", "forceReuse", "getForceReuse", "setForceReuse", "Landroidx/compose/runtime/MutableState;", "activeState", "Landroidx/compose/runtime/MutableState;", "getActiveState", "()Landroidx/compose/runtime/MutableState;", "setActiveState", "(Landroidx/compose/runtime/MutableState;)V", "value", "getActive", "setActive", "active", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class NodeState {

        @NotNull
        private MutableState<Boolean> activeState;

        @Nullable
        private ReusableComposition composition;

        @NotNull
        private InterfaceC6473e content;
        private boolean forceRecompose;
        private boolean forceReuse;

        @Nullable
        private Object slotId;

        public NodeState(@Nullable Object obj, @NotNull InterfaceC6473e interfaceC6473e, @Nullable ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = interfaceC6473e;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        @NotNull
        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        @Nullable
        public final ReusableComposition getComposition() {
            return this.composition;
        }

        @NotNull
        public final InterfaceC6473e getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        @Nullable
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActive(boolean z8) {
            this.activeState.setValue(Boolean.valueOf(z8));
        }

        public final void setActiveState(@NotNull MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposition(@Nullable ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(@NotNull InterfaceC6473e interfaceC6473e) {
            this.content = interfaceC6473e;
        }

        public final void setForceRecompose(boolean z8) {
            this.forceRecompose = z8;
        }

        public final void setForceReuse(boolean z8) {
            this.forceReuse = z8;
        }

        public final void setSlotId(@Nullable Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, InterfaceC6473e interfaceC6473e, ReusableComposition reusableComposition, int i, AbstractC5824e abstractC5824e) {
            this(obj, interfaceC6473e, (i & 4) != 0 ? null : reusableComposition);
        }
    }

    private final void subcompose(LayoutNode node, Object slotId, InterfaceC6473e content) {
        MutableScatterMap<LayoutNode, NodeState> mutableScatterMap = this.nodeToNodeState;
        NodeState nodeState = mutableScatterMap.get(node);
        if (nodeState == null) {
            NodeState nodeState2 = new NodeState(slotId, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m12025getLambda1$ui_release(), null, 4, null);
            mutableScatterMap.set(node, nodeState2);
            nodeState = nodeState2;
        }
        NodeState nodeState3 = nodeState;
        ReusableComposition composition = nodeState3.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState3.getContent() != content || hasInvalidations || nodeState3.getForceRecompose()) {
            nodeState3.setContent(content);
            subcompose(node, nodeState3);
            nodeState3.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode node, final NodeState nodeState) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            LayoutNode layoutNode = this.root;
            layoutNode.ignoreRemeasureRequests = true;
            final InterfaceC6473e content = nodeState.getContent();
            ReusableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext != null) {
                nodeState.setComposition(subcomposeInto(composition, node, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new InterfaceC6473e() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C5443s.f8405a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i) {
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1750409193, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:522)");
                        }
                        boolean active = nodeState.getActive();
                        InterfaceC6473e interfaceC6473e = content;
                        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(active));
                        boolean zChanged = composer.changed(active);
                        if (active) {
                            interfaceC6473e.invoke(composer, 0);
                        } else {
                            composer.deactivateToEndGroup(zChanged);
                        }
                        composer.endReusableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                })));
                nodeState.setForceReuse(false);
                layoutNode.ignoreRemeasureRequests = false;
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                return;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
