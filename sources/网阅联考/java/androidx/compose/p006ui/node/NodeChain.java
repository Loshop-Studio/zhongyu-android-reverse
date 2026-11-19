package androidx.compose.p006ui.node;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.ModifierInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002deB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0019J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0010H\u0002J\r\u0010+\u001a\u00020&H\u0000¢\u0006\u0002\b,J\u0010\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0010H\u0002JE\u0010/\u001a\u0004\u0018\u0001H0\"\u0006\b\u0000\u00100\u0018\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u0002H0022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u00020\u001904H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b5\u00106J0\u00107\u001a\u00060\rR\u00020\u00002\u0006\u0010#\u001a\u00020\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J!\u0010=\u001a\u00020\u00192\n\u00101\u001a\u0006\u0012\u0002\b\u000302H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\u0015\u0010=\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0006H\u0000¢\u0006\u0002\bAJ.\u0010\u0011\u001a\u0004\u0018\u0001H0\"\u0006\b\u0000\u00100\u0018\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u0002H002H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020&2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&04H\u0080\bø\u0001\u0000¢\u0006\u0002\bEJC\u0010D\u001a\u00020&\"\u0006\b\u0000\u00100\u0018\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u0002H0022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u00020&04H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bF\u0010GJ-\u0010D\u001a\u00020&2\u0006\u0010@\u001a\u00020\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&04H\u0080\bø\u0001\u0000¢\u0006\u0002\bEJ%\u0010H\u001a\u00020&2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&04H\u0080\bø\u0001\u0000¢\u0006\u0002\bIJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020&H\u0002J\u0010\u0010L\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0010H\u0002J\u0018\u0010M\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u0010H\u0002J\r\u0010P\u001a\u00020&H\u0000¢\u0006\u0002\bQJ<\u0010R\u001a\u00020&2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010S\u001a\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010T\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0010H\u0002J\b\u0010U\u001a\u00020&H\u0002J.\u0010#\u001a\u0004\u0018\u0001H0\"\u0006\b\u0000\u00100\u0018\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u0002H002H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bV\u0010CJ%\u0010W\u001a\u00020&2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&04H\u0080\bø\u0001\u0000¢\u0006\u0002\bXJC\u0010W\u001a\u00020&\"\u0006\b\u0000\u00100\u0018\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u0002H0022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u00020&04H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bY\u0010GJ-\u0010W\u001a\u00020&2\u0006\u0010@\u001a\u00020\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&04H\u0080\bø\u0001\u0000¢\u0006\u0002\bXJ\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020&H\u0002J\u0015\u0010]\u001a\u00020&2\u0006\u0010^\u001a\u00020_H\u0000¢\u0006\u0002\b`J \u0010a\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0010H\u0002J\u0017\u0010b\u001a\u00020&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0002\bcR\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0018\u00010\rR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006f"}, m5175d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "aggregateChildKindSet", "", "getAggregateChildKindSet", "()I", "buffer", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "current", "<set-?>", "Landroidx/compose/ui/Modifier$Node;", "head", "getHead$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "isUpdating", "", "()Z", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "logger", "Landroidx/compose/ui/node/NodeChain$Logger;", "Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "tail", "getTail$ui_release", "attach", "", "performInvalidations", "createAndInsertNodeAsParent", "element", "child", "detach", "detach$ui_release", "detachAndRemoveNode", "node", "firstFromHead", ExifInterface.GPS_DIRECTION_TRUE, "type", "Landroidx/compose/ui/node/NodeKind;", "block", "Lkotlin/Function1;", "firstFromHead-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getDiffer", "before", "after", "getModifierInfo", "", "Landroidx/compose/ui/layout/ModifierInfo;", "has", "has-H91voCI$ui_release", "(I)Z", "mask", "has$ui_release", "head-H91voCI$ui_release", "(I)Ljava/lang/Object;", "headToTail", "headToTail$ui_release", "headToTail-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "headToTailExclusive", "headToTailExclusive$ui_release", "insertParent", "padChain", "removeNode", "replaceNode", "prev", "next", "resetState", "resetState$ui_release", "structuralUpdate", "beforeSize", "afterSize", "syncCoordinators", "tail-H91voCI$ui_release", "tailToHead", "tailToHead$ui_release", "tailToHead-aLcG6gQ$ui_release", "toString", "", "trimChain", "updateFrom", "m", "Landroidx/compose/ui/Modifier;", "updateFrom$ui_release", "updateNodeAndReplaceIfNeeded", "useLogger", "useLogger$ui_release", "Differ", "Logger", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,753:1\n635#1,6:765\n643#1,3:772\n646#1,3:778\n666#1,6:781\n612#1,8:787\n635#1,3:795\n620#1,2:798\n613#1,12:800\n638#1,3:812\n625#1:815\n615#1:816\n618#1,2:817\n635#1,3:819\n620#1,5:822\n638#1,3:827\n625#1:830\n635#1,6:831\n657#1,15:837\n666#1,6:852\n651#1,21:858\n612#1,8:879\n635#1,3:887\n620#1,2:890\n613#1,12:892\n638#1,3:904\n625#1:907\n615#1:908\n643#1,6:909\n1162#2:754\n1182#2:755\n1161#2,2:756\n1162#2:771\n523#3:758\n523#3:759\n523#3:760\n523#3:761\n523#3:775\n728#3,2:776\n1#4:762\n69#5:763\n196#6:764\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n268#1:765,6\n297#1:772,3\n297#1:778,3\n308#1:781,6\n605#1:787,8\n605#1:795,3\n605#1:798,2\n605#1:800,12\n605#1:812,3\n605#1:815\n605#1:816\n612#1:817,2\n612#1:819,3\n612#1:822,5\n612#1:827,3\n612#1:830\n619#1:831,6\n651#1:837,15\n658#1:852,6\n674#1:858,21\n681#1:879,8\n681#1:887,3\n681#1:890,2\n681#1:892,12\n681#1:904,3\n681#1:907\n681#1:908\n697#1:909,6\n100#1:754\n101#1:755\n101#1:756,2\n295#1:771\n112#1:758\n113#1:759\n175#1:760\n190#1:761\n299#1:775\n299#1:776,2\n243#1:763\n243#1:764\n*E\n"})
/* loaded from: classes.dex */
public final class NodeChain {
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    @Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, m5175d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "node", "Landroidx/compose/ui/Modifier$Node;", "aggregateChildKindSet", "", "before", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "after", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;)V", "getAfter", "()Landroidx/compose/runtime/collection/MutableVector;", "setAfter", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getAggregateChildKindSet", "()I", "setAggregateChildKindSet", "(I)V", "getBefore", "setBefore", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", "areItemsTheSame", "", "oldIndex", "newIndex", "insert", "", "atIndex", "remove", "same", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,753:1\n523#2:754\n523#2:755\n523#2:756\n523#2:757\n523#2:758\n523#2:759\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n350#1:754\n355#1:755\n358#1:756\n365#1:757\n371#1:758\n372#1:759\n*E\n"})
    public final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private int aggregateChildKindSet;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        final /* synthetic */ NodeChain this$0;

        public Differ(NodeChain nodeChain, Modifier.Node node, int i4, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after) {
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(before, "before");
            Intrinsics.checkNotNullParameter(after, "after");
            this.this$0 = nodeChain;
            this.node = node;
            this.aggregateChildKindSet = i4;
            this.before = before;
            this.after = after;
        }

        @Override // androidx.compose.p006ui.node.DiffCallback
        public boolean areItemsTheSame(int oldIndex, int newIndex) {
            return NodeChainKt.actionForModifiers(this.before.getContent()[oldIndex], this.after.getContent()[newIndex]) != 0;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        @Override // androidx.compose.p006ui.node.DiffCallback
        public void insert(int atIndex, int newIndex) {
            Modifier.Node node = this.node;
            this.node = this.this$0.createAndInsertNodeAsParent(this.after.getContent()[newIndex], node);
            if (!(!r0.getIsAttached())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            Logger logger = this.this$0.logger;
            if (logger != null) {
                logger.nodeInserted(atIndex, newIndex, this.after.getContent()[newIndex], node, this.node);
            }
            int kindSet = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet;
            this.node.setAggregateChildKindSet$ui_release(kindSet);
        }

        @Override // androidx.compose.p006ui.node.DiffCallback
        public void remove(int oldIndex) {
            Modifier.Node parent = this.node.getParent();
            Intrinsics.checkNotNull(parent);
            this.node = parent;
            Logger logger = this.this$0.logger;
            if (logger != null) {
                logger.nodeRemoved(oldIndex, this.before.getContent()[oldIndex], this.node);
            }
            this.node = this.this$0.detachAndRemoveNode(this.node);
        }

        @Override // androidx.compose.p006ui.node.DiffCallback
        public void same(int oldIndex, int newIndex) {
            Modifier.Node parent = this.node.getParent();
            Intrinsics.checkNotNull(parent);
            this.node = parent;
            Modifier.Element element = this.before.getContent()[oldIndex];
            Modifier.Element element2 = this.after.getContent()[newIndex];
            if (Intrinsics.areEqual(element, element2)) {
                Logger logger = this.this$0.logger;
                if (logger != null) {
                    logger.nodeReused(oldIndex, newIndex, element, element2, this.node);
                }
            } else {
                Modifier.Node node = this.node;
                this.node = this.this$0.updateNodeAndReplaceIfNeeded(element, element2, node);
                Logger logger2 = this.this$0.logger;
                if (logger2 != null) {
                    logger2.nodeUpdated(oldIndex, newIndex, element, element2, node, this.node);
                }
            }
            int kindSet = this.aggregateChildKindSet | this.node.getKindSet();
            this.aggregateChildKindSet = kindSet;
            this.node.setAggregateChildKindSet$ui_release(kindSet);
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            Intrinsics.checkNotNullParameter(mutableVector, "<set-?>");
            this.after = mutableVector;
        }

        public final void setAggregateChildKindSet(int i4) {
            this.aggregateChildKindSet = i4;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            Intrinsics.checkNotNullParameter(mutableVector, "<set-?>");
            this.before = mutableVector;
        }

        public final void setNode(Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "<set-?>");
            this.node = node;
        }
    }

    @Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J8\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m5175d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "linearDiffAborted", "", "index", "", "prev", "Landroidx/compose/ui/Modifier$Element;", "next", "node", "Landroidx/compose/ui/Modifier$Node;", "nodeInserted", "atIndex", "newIndex", "element", "child", "inserted", "nodeRemoved", "oldIndex", "nodeReused", "nodeUpdated", "before", "after", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Logger {
        void linearDiffAborted(int index, Modifier.Element prev, Modifier.Element next, Modifier.Node node);

        void nodeInserted(int atIndex, int newIndex, Modifier.Element element, Modifier.Node child, Modifier.Node inserted);

        void nodeRemoved(int oldIndex, Modifier.Element element, Modifier.Node node);

        void nodeReused(int oldIndex, int newIndex, Modifier.Element prev, Modifier.Element next, Modifier.Node node);

        void nodeUpdated(int oldIndex, int newIndex, Modifier.Element prev, Modifier.Element next, Modifier.Node before, Modifier.Node after);
    }

    public NodeChain(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        Modifier.Node tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsParent(Modifier.Element element, Modifier.Node child) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!(!backwardsCompatNode.getIsAttached())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertParent(backwardsCompatNode, child);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.detach$ui_release();
        }
        return removeNode(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet();
    }

    private final Differ getDiffer(Modifier.Node tail, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(this, tail, tail.getAggregateChildKindSet(), before, after);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(tail);
        differ.setAggregateChildKindSet(tail.getAggregateChildKindSet());
        differ.setBefore(before);
        differ.setAfter(after);
        return differ;
    }

    private final Modifier.Node insertParent(Modifier.Node node, Modifier.Node child) {
        Modifier.Node parent = child.getParent();
        if (parent != null) {
            parent.setChild$ui_release(node);
            node.setParent$ui_release(parent);
        }
        child.setParent$ui_release(node);
        node.setChild$ui_release(child);
        return node;
    }

    private final boolean isUpdating() {
        return this.head == NodeChainKt.SentinelHead;
    }

    private final void padChain() {
        if (!(this.head != NodeChainKt.SentinelHead)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChainKt.SentinelHead);
        NodeChainKt.SentinelHead.setChild$ui_release(node);
        this.head = NodeChainKt.SentinelHead;
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child = node.getChild();
        Modifier.Node parent = node.getParent();
        if (child != null) {
            child.setParent$ui_release(parent);
            node.setChild$ui_release(null);
        }
        if (parent != null) {
            parent.setChild$ui_release(child);
            node.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(child);
        return child;
    }

    private final Modifier.Node replaceNode(Modifier.Node prev, Modifier.Node next) {
        Modifier.Node parent = prev.getParent();
        if (parent != null) {
            next.setParent$ui_release(parent);
            parent.setChild$ui_release(next);
            prev.setParent$ui_release(null);
        }
        Modifier.Node child = prev.getChild();
        if (child != null) {
            next.setChild$ui_release(child);
            child.setParent$ui_release(next);
            prev.setChild$ui_release(null);
        }
        next.updateCoordinator$ui_release(prev.getCoordinator());
        return next;
    }

    private final void structuralUpdate(MutableVector<Modifier.Element> before, int beforeSize, MutableVector<Modifier.Element> after, int afterSize, Modifier.Node tail) {
        MyersDiffKt.executeDiff(beforeSize, afterSize, getDiffer(tail, before, after));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private final void syncCoordinators() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (LayoutModifierNode parent = this.tail.getParent(); parent != 0; parent = parent.getParent()) {
            if (((NodeKind.m10773constructorimpl(2) & parent.getKindSet()) != 0) && (parent instanceof LayoutModifierNode)) {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.checkNotNull(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(parent);
                    if (layoutModifierNode != parent) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, parent);
                    parent.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    private final void trimChain() {
        if (!(this.head == NodeChainKt.SentinelHead)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node child = NodeChainKt.SentinelHead.getChild();
        if (child == null) {
            child = this.tail;
        }
        this.head = child;
        child.setParent$ui_release(null);
        NodeChainKt.SentinelHead.setChild$ui_release(null);
        if (!(this.head != NodeChainKt.SentinelHead)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node updateNodeAndReplaceIfNeeded(Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        if (!(prev instanceof ModifierNodeElement) || !(next instanceof ModifierNodeElement)) {
            if (!(node instanceof BackwardsCompatNode)) {
                throw new IllegalStateException("Unknown Modifier.Node type".toString());
            }
            ((BackwardsCompatNode) node).setElement(next);
            if (node.getIsAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
            return node;
        }
        ModifierNodeElement modifierNodeElement = (ModifierNodeElement) next;
        Modifier.Node nodeUpdateUnsafe = NodeChainKt.updateUnsafe(modifierNodeElement, node);
        if (nodeUpdateUnsafe == node) {
            if (modifierNodeElement.getAutoInvalidate()) {
                if (nodeUpdateUnsafe.getIsAttached()) {
                    NodeKindKt.autoInvalidateUpdatedNode(nodeUpdateUnsafe);
                } else {
                    nodeUpdateUnsafe.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                }
            }
            return nodeUpdateUnsafe;
        }
        if (!(!nodeUpdateUnsafe.getIsAttached())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        nodeUpdateUnsafe.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.detach$ui_release();
        }
        return replaceNode(node, nodeUpdateUnsafe);
    }

    public final void attach(boolean performInvalidations) {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if (!head.getIsAttached()) {
                head.attach$ui_release();
                if (performInvalidations) {
                    if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                        NodeKindKt.autoInvalidateInsertedNode(head);
                    }
                    if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                        NodeKindKt.autoInvalidateUpdatedNode(head);
                    }
                }
                head.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
                head.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
            }
        }
    }

    public final void detach$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.detach$ui_release();
            }
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m10735firstFromHeadaLcG6gQ$ui_release(int type, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Modifier.Node head = getHead(); head != null; head = ((Modifier.Node) head).getChild()) {
            if ((((Modifier.Node) head).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                if (block.invoke(head).booleanValue()) {
                    return (T) head;
                }
            }
            if ((((Modifier.Node) head).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: getHead$ui_release, reason: from getter */
    public final Modifier.Node getHead() {
        return this.head;
    }

    /* renamed from: getInnerCoordinator$ui_release, reason: from getter */
    public final InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i4 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head = getHead();
        while (head != null && head != getTail()) {
            NodeCoordinator coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            mutableVector2.add(new ModifierInfo(mutableVector.getContent()[i4], coordinator, coordinator.getLayer()));
            head = head.getChild();
            i4++;
        }
        return mutableVector2.asMutableList();
    }

    /* renamed from: getOuterCoordinator$ui_release, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* renamed from: getTail$ui_release, reason: from getter */
    public final Modifier.Node getTail() {
        return this.tail;
    }

    public final boolean has$ui_release(int mask) {
        return (mask & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m10736hasH91voCI$ui_release(int type) {
        return (type & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m10737headH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Object obj = (T) getHead(); obj != null; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
            if ((((Modifier.Node) obj).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int mask, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if ((head.getKindSet() & mask) != 0) {
                block.invoke(head);
            }
            if ((head.getAggregateChildKindSet() & mask) == 0) {
                return;
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m10738headToTailaLcG6gQ$ui_release(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    block.invoke(head);
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head = getHead(); head != null && head != getTail(); head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void resetState$ui_release() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return;
        }
        int size = mutableVector.getSize();
        Modifier.Node parent = this.tail.getParent();
        for (int i4 = size - 1; parent != null && i4 >= 0; i4--) {
            if (parent.getIsAttached()) {
                parent.reset$ui_release();
                parent.detach$ui_release();
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m10739tailH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) == 0) {
            return null;
        }
        for (Object obj = (T) getTail(); obj != null; obj = (T) ((Modifier.Node) obj).getParent()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int mask, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if ((tail.getKindSet() & mask) != 0) {
                block.invoke(tail);
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m10740tailToHeadaLcG6gQ$ui_release(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    block.invoke(tail);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head = head.getChild();
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void updateFrom$ui_release(Modifier m4) {
        boolean z3;
        Logger logger;
        Intrinsics.checkNotNullParameter(m4, "m");
        padChain();
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            mutableVector = new MutableVector<>(new Modifier.Element[0], 0);
        }
        MutableVector<Modifier.Element> mutableVector2 = mutableVector;
        MutableVector<Modifier.Element> mutableVector3 = this.buffer;
        if (mutableVector3 == null) {
            mutableVector3 = new MutableVector<>(new Modifier.Element[16], 0);
        }
        MutableVector<Modifier.Element> mutableVectorFillVector = NodeChainKt.fillVector(m4, mutableVector3);
        if (mutableVectorFillVector.getSize() == mutableVector2.getSize()) {
            int size = mutableVector2.getSize();
            Modifier.Node parent = this.tail.getParent();
            int i4 = size - 1;
            int kindSet = 0;
            z3 = false;
            while (true) {
                if (parent == null || i4 < 0) {
                    break;
                }
                Modifier.Element element = mutableVector2.getContent()[i4];
                Modifier.Element element2 = mutableVectorFillVector.getContent()[i4];
                int iActionForModifiers = NodeChainKt.actionForModifiers(element, element2);
                if (iActionForModifiers != 0) {
                    if (iActionForModifiers == 1) {
                        Modifier.Node nodeUpdateNodeAndReplaceIfNeeded = updateNodeAndReplaceIfNeeded(element, element2, parent);
                        Logger logger2 = this.logger;
                        if (logger2 != null) {
                            logger2.nodeUpdated(i4, i4, element, element2, parent, nodeUpdateNodeAndReplaceIfNeeded);
                        }
                        parent = nodeUpdateNodeAndReplaceIfNeeded;
                    } else if (iActionForModifiers == 2 && (logger = this.logger) != null) {
                        logger.nodeReused(i4, i4, element, element2, parent);
                    }
                    if (!parent.getIsAttached()) {
                        z3 = true;
                    }
                    kindSet |= parent.getKindSet();
                    parent.setAggregateChildKindSet$ui_release(kindSet);
                    parent = parent.getParent();
                    i4--;
                } else {
                    Logger logger3 = this.logger;
                    if (logger3 != null) {
                        logger3.linearDiffAborted(i4, element, element2, parent);
                    }
                    i4++;
                    parent = parent.getChild();
                }
            }
            int i5 = i4;
            Modifier.Node node = parent;
            if (i5 > 0) {
                if ((node != null ? 1 : 0) == 0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                structuralUpdate(mutableVector2, i5, mutableVectorFillVector, i5, node);
                kindSet = 1;
                z3 = true;
            }
        } else {
            if (mutableVector2.getSize() == 0) {
                int size2 = mutableVectorFillVector.getSize() - 1;
                Modifier.Node nodeCreateAndInsertNodeAsParent = this.tail;
                while (true) {
                    Modifier.Node node2 = nodeCreateAndInsertNodeAsParent;
                    if (size2 < 0) {
                        break;
                    }
                    Modifier.Element element3 = mutableVectorFillVector.getContent()[size2];
                    nodeCreateAndInsertNodeAsParent = createAndInsertNodeAsParent(element3, node2);
                    Logger logger4 = this.logger;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, size2, element3, node2, nodeCreateAndInsertNodeAsParent);
                    }
                    kindSet |= nodeCreateAndInsertNodeAsParent.getKindSet();
                    nodeCreateAndInsertNodeAsParent.setAggregateChildKindSet$ui_release(kindSet);
                    size2--;
                }
            } else if (mutableVectorFillVector.getSize() == 0) {
                int size3 = mutableVector2.getSize() - 1;
                Modifier.Node parent2 = this.tail.getParent();
                while (parent2 != null && size3 >= 0) {
                    Logger logger5 = this.logger;
                    if (logger5 != null) {
                        logger5.nodeRemoved(size3, mutableVector2.getContent()[size3], parent2);
                    }
                    Modifier.Node parent3 = parent2.getParent();
                    detachAndRemoveNode(parent2);
                    size3--;
                    parent2 = parent3;
                }
                z3 = false;
                kindSet = 1;
            } else {
                structuralUpdate(mutableVector2, mutableVector2.getSize(), mutableVectorFillVector, mutableVectorFillVector.getSize(), this.tail);
            }
            kindSet = 1;
            z3 = true;
        }
        this.current = mutableVectorFillVector;
        mutableVector2.clear();
        this.buffer = mutableVector2;
        trimChain();
        if (kindSet != 0) {
            syncCoordinators();
        }
        if (z3 && this.layoutNode.isAttached()) {
            attach(true);
        }
    }

    public final void useLogger$ui_release(Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            block.invoke(tail);
        }
    }

    public final void headToTail$ui_release(Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }
}
