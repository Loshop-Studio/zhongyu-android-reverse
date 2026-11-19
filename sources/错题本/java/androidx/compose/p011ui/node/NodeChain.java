package androidx.compose.p011ui.node;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.ModifierInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001d\u0010\u0012J?\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J=\u0010*\u001a\u00020\b\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b(\u0010)J,\u0010*\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b¢\u0006\u0004\b.\u0010)J$\u0010*\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b¢\u0006\u0004\b.\u0010/J$\u00101\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b¢\u0006\u0004\b0\u0010/J=\u00103\u001a\u00020\b\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b2\u0010)J,\u00103\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b¢\u0006\u0004\b4\u0010)J$\u00103\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b¢\u0006\u0004\b4\u0010/J+\u00107\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0080\bø\u0001\u0000¢\u0006\u0004\b5\u00106J+\u00109\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001f\u0018\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00106J\u001e\u0010<\u001a\u00020#2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 H\u0000ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020#2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b=\u0010;J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020-H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020-2\u0006\u0010C\u001a\u00020-H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u0012JG\u0010N\u001a\u00060MR\u00020\u00002\u0006\u00109\u001a\u00020-2\u0006\u0010G\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020I0H2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010S\u001a\u00020\b2\u0006\u0010P\u001a\u00020-2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJC\u0010U\u001a\u00020\b2\u0006\u0010G\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020I0H2\u0006\u00107\u001a\u00020-2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0002¢\u0006\u0004\bX\u0010EJ\u0017\u0010Y\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0002¢\u0006\u0004\bY\u0010EJ\u001f\u0010\\\u001a\u00020-2\u0006\u0010Z\u001a\u00020I2\u0006\u0010[\u001a\u00020-H\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00020-2\u0006\u0010W\u001a\u00020-2\u0006\u0010[\u001a\u00020-H\u0002¢\u0006\u0004\b^\u0010_J'\u0010b\u001a\u00020\b2\u0006\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020I2\u0006\u0010W\u001a\u00020-H\u0002¢\u0006\u0004\bb\u0010cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010d\u001a\u0004\be\u0010fR\u001a\u0010h\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR$\u0010m\u001a\u00020Q2\u0006\u0010l\u001a\u00020Q8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u00107\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010q\u001a\u0004\br\u0010BR$\u00109\u001a\u00020-2\u0006\u0010l\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u0010q\u001a\u0004\bs\u0010BR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010v\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u001c\u0010w\u001a\b\u0018\u00010MR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010yR\u0014\u0010|\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0082\u0001"}, m5110d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "Ld6/s;", "useLogger$ui_release", "(Landroidx/compose/ui/node/NodeChain$Logger;)V", "useLogger", "Landroidx/compose/ui/Modifier;", "m", "updateFrom$ui_release", "(Landroidx/compose/ui/Modifier;)V", "updateFrom", "resetState$ui_release", "()V", "resetState", "syncCoordinators", "markAsAttached", "runAttachLifecycle", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "markAsDetached$ui_release", "markAsDetached", "runDetachLifecycle$ui_release", "runDetachLifecycle", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/NodeKind;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lkotlin/Function1;", "", "block", "firstFromHead-aLcG6gQ$ui_release", "(ILr6/c;)Ljava/lang/Object;", "firstFromHead", "headToTail-aLcG6gQ$ui_release", "(ILr6/c;)V", "headToTail", "", "mask", "Landroidx/compose/ui/Modifier$Node;", "headToTail$ui_release", "(Lr6/c;)V", "headToTailExclusive$ui_release", "headToTailExclusive", "tailToHead-aLcG6gQ$ui_release", "tailToHead", "tailToHead$ui_release", "tail-H91voCI$ui_release", "(I)Ljava/lang/Object;", "tail", "head-H91voCI$ui_release", "head", "has-H91voCI$ui_release", "(I)Z", "has", "has$ui_release", "", "toString", "()Ljava/lang/String;", "padChain", "()Landroidx/compose/ui/Modifier$Node;", "paddedHead", "trimChain", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "syncAggregateChildKindSet", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "after", "shouldAttachOnInsert", "Landroidx/compose/ui/node/NodeChain$Differ;", "getDiffer", "(Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/NodeChain$Differ;", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "propagateCoordinator", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V", "structuralUpdate", "(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "node", "detachAndRemoveNode", "removeNode", "element", "parent", "createAndInsertNodeAsChild", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "insertChild", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "prev", "next", "updateNode", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "<set-?>", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui_release", "getHead$ui_release", "current", "Landroidx/compose/runtime/collection/MutableVector;", "buffer", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/NodeChain$Logger;", "isUpdating$ui_release", "()Z", "isUpdating", "getAggregateChildKindSet", "()I", "aggregateChildKindSet", "Differ", "Logger", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,807:1\n712#1,6:861\n683#1,6:867\n683#1,6:873\n691#1,3:880\n694#1,3:886\n712#1,6:889\n712#1,6:895\n662#1,6:908\n683#1,3:914\n668#1,2:917\n671#1,2:962\n686#1,3:964\n673#1:967\n663#1:968\n666#1,2:969\n683#1,3:971\n668#1,2:974\n671#1,2:1019\n686#1,3:1021\n673#1:1024\n683#1,6:1025\n703#1,12:1031\n715#1,3:1086\n709#1:1089\n712#1,6:1090\n699#1,16:1096\n715#1,3:1155\n709#1:1158\n700#1:1159\n662#1,6:1160\n683#1,3:1166\n668#1,2:1169\n671#1,2:1214\n686#1,3:1216\n673#1:1219\n663#1:1220\n691#1,6:1221\n56#2,5:808\n56#2,5:813\n56#2,5:818\n76#2,7:826\n76#2,7:835\n76#2,7:842\n76#2,7:850\n56#2,5:903\n1101#3:823\n1083#3,2:824\n1083#3,2:858\n1084#3:879\n1101#3:939\n1083#3,2:940\n1101#3:996\n1083#3,2:997\n1101#3:1063\n1083#3,2:1064\n1101#3:1132\n1083#3,2:1133\n1101#3:1191\n1083#3,2:1192\n472#4:833\n472#4:834\n472#4:849\n472#4:857\n472#4:883\n641#4,2:884\n1#5:860\n83#6:901\n246#7:902\n246#7:925\n246#7:982\n246#7:1049\n246#7:1118\n246#7:1177\n437#8,6:919\n447#8,2:926\n449#8,8:931\n457#8,9:942\n466#8,8:954\n437#8,6:976\n447#8,2:983\n449#8,8:988\n457#8,9:999\n466#8,8:1011\n437#8,6:1043\n447#8,2:1050\n449#8,8:1055\n457#8,9:1066\n466#8,8:1078\n437#8,6:1112\n447#8,2:1119\n449#8,8:1124\n457#8,9:1135\n466#8,8:1147\n437#8,6:1171\n447#8,2:1178\n449#8,8:1183\n457#8,9:1194\n466#8,8:1206\n240#9,3:928\n243#9,3:951\n240#9,3:985\n243#9,3:1008\n240#9,3:1052\n243#9,3:1075\n240#9,3:1121\n243#9,3:1144\n240#9,3:1180\n243#9,3:1203\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n226#1:861,6\n285#1:867,6\n302#1:873,6\n327#1:880,3\n327#1:886,3\n366#1:889,6\n370#1:895,6\n657#1:908,6\n657#1:914,3\n657#1:917,2\n657#1:962,2\n657#1:964,3\n657#1:967\n657#1:968\n662#1:969,2\n662#1:971,3\n662#1:974,2\n662#1:1019,2\n662#1:1021,3\n662#1:1024\n667#1:1025,6\n699#1:1031,12\n699#1:1086,3\n699#1:1089\n704#1:1090,6\n720#1:1096,16\n720#1:1155,3\n720#1:1158\n720#1:1159\n727#1:1160,6\n727#1:1166,3\n727#1:1169,2\n727#1:1214,2\n727#1:1216,3\n727#1:1219\n727#1:1220\n743#1:1221,6\n69#1:808,5\n77#1:813,5\n85#1:818,5\n131#1:826,7\n161#1:835,7\n162#1:842,7\n191#1:850,7\n599#1:903,5\n121#1:823\n121#1:824,2\n203#1:858,2\n325#1:879\n657#1:939\n657#1:940,2\n662#1:996\n662#1:997,2\n699#1:1063\n699#1:1064,2\n720#1:1132\n720#1:1133,2\n727#1:1191\n727#1:1192,2\n132#1:833\n133#1:834\n183#1:849\n195#1:857\n360#1:883\n360#1:884,2\n420#1:901\n420#1:902\n657#1:925\n662#1:982\n699#1:1049\n720#1:1118\n727#1:1177\n657#1:919,6\n657#1:926,2\n657#1:931,8\n657#1:942,9\n657#1:954,8\n662#1:976,6\n662#1:983,2\n662#1:988,8\n662#1:999,9\n662#1:1011,8\n699#1:1043,6\n699#1:1050,2\n699#1:1055,8\n699#1:1066,9\n699#1:1078,8\n720#1:1112,6\n720#1:1119,2\n720#1:1124,8\n720#1:1135,9\n720#1:1147,8\n727#1:1171,6\n727#1:1178,2\n727#1:1183,8\n727#1:1194,9\n727#1:1206,8\n657#1:928,3\n657#1:951,3\n662#1:985,3\n662#1:1008,3\n699#1:1052,3\n699#1:1075,3\n720#1:1121,3\n720#1:1144,3\n727#1:1180,3\n727#1:1203,3\n*E\n"})
/* loaded from: classes2.dex */
public final class NodeChain {
    public static final int $stable = 8;

    @Nullable
    private MutableVector<Modifier.Element> buffer;

    @Nullable
    private Differ cachedDiffer;

    @Nullable
    private MutableVector<Modifier.Element> current;

    @NotNull
    private Modifier.Node head;

    @NotNull
    private final InnerNodeCoordinator innerCoordinator;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private Logger logger;

    @NotNull
    private NodeCoordinator outerCoordinator;

    @NotNull
    private final Modifier.Node tail;

    @Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, m5110d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "Landroidx/compose/ui/Modifier$Node;", "node", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V", "oldIndex", "newIndex", "areItemsTheSame", "(II)Z", "Ld6/s;", "insert", "(I)V", "atIndex", "remove", "(II)V", "same", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", "I", "getOffset", "()I", "setOffset", "Landroidx/compose/runtime/collection/MutableVector;", "getBefore", "()Landroidx/compose/runtime/collection/MutableVector;", "setBefore", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getAfter", "setAfter", "Z", "getShouldAttachOnInsert", "()Z", "setShouldAttachOnInsert", "(Z)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,807:1\n472#2:808\n472#2:809\n472#2:810\n472#2:811\n472#2:814\n472#2:815\n83#3:812\n246#4:813\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n434#1:808\n441#1:809\n442#1:810\n467#1:811\n483#1:814\n484#1:815\n468#1:812\n468#1:813\n*E\n"})
    public final class Differ implements DiffCallback {

        @NotNull
        private MutableVector<Modifier.Element> after;

        @NotNull
        private MutableVector<Modifier.Element> before;

        @NotNull
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(@NotNull Modifier.Node node, int i, @NotNull MutableVector<Modifier.Element> mutableVector, @NotNull MutableVector<Modifier.Element> mutableVector2, boolean z8) {
            this.node = node;
            this.offset = i;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z8;
        }

        @Override // androidx.compose.p011ui.node.DiffCallback
        public boolean areItemsTheSame(int oldIndex, int newIndex) {
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i = this.offset;
            return NodeChainKt.actionForModifiers(mutableVector.content[oldIndex + i], this.after.content[i + newIndex]) != 0;
        }

        @NotNull
        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        @NotNull
        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        @NotNull
        public final Modifier.Node getNode() {
            return this.node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        @Override // androidx.compose.p011ui.node.DiffCallback
        public void insert(int newIndex) {
            int i = this.offset + newIndex;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.content[i], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i, i, this.after.content[i], node, this.node);
            }
            if (!this.shouldAttachOnInsert) {
                this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            Modifier.Node child$ui_release = this.node.getChild();
            AbstractC5830k.m5327d(child$ui_release);
            NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator();
            AbstractC5830k.m5327d(coordinator$ui_release);
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), layoutModifierNodeAsLayoutModifierNode);
                this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy());
                layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
            } else {
                this.node.updateCoordinator$ui_release(coordinator$ui_release);
            }
            this.node.markAsAttached$ui_release();
            this.node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(this.node);
        }

        @Override // androidx.compose.p011ui.node.DiffCallback
        public void remove(int atIndex, int oldIndex) {
            Modifier.Node child$ui_release = this.node.getChild();
            AbstractC5830k.m5327d(child$ui_release);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(oldIndex, mutableVector.content[this.offset + oldIndex], child$ui_release);
            }
            if ((NodeKind.m12314constructorimpl(2) & child$ui_release.getKindSet()) != 0) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator();
                AbstractC5830k.m5327d(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped();
                AbstractC5830k.m5327d(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // androidx.compose.p011ui.node.DiffCallback
        public void same(int oldIndex, int newIndex) {
            Modifier.Node child$ui_release = this.node.getChild();
            AbstractC5830k.m5327d(child$ui_release);
            this.node = child$ui_release;
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i = this.offset;
            Modifier.Element element = mutableVector.content[i + oldIndex];
            Modifier.Element element2 = this.after.content[i + newIndex];
            if (AbstractC5830k.m5325b(element, element2)) {
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i8 = this.offset;
                    logger.nodeReused(i8 + oldIndex, i8 + newIndex, element, element2, this.node);
                    return;
                }
                return;
            }
            NodeChain.this.updateNode(element, element2, this.node);
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i9 = this.offset;
                logger2.nodeUpdated(i9 + oldIndex, i9 + newIndex, element, element2, this.node);
            }
        }

        public final void setAfter(@NotNull MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setBefore(@NotNull MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setNode(@NotNull Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setShouldAttachOnInsert(boolean z8) {
            this.shouldAttachOnInsert = z8;
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b`\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u000fJ7\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "", "index", "Landroidx/compose/ui/Modifier$Element;", "prev", "next", "Landroidx/compose/ui/Modifier$Node;", "node", "Ld6/s;", "linearDiffAborted", "(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "oldIndex", "newIndex", "nodeUpdated", "(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "nodeReused", "atIndex", "element", "child", "inserted", "nodeInserted", "(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)V", "nodeRemoved", "(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Logger {
        void linearDiffAborted(int index, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);

        void nodeInserted(int atIndex, int newIndex, @NotNull Modifier.Element element, @NotNull Modifier.Node child, @NotNull Modifier.Node inserted);

        void nodeRemoved(int oldIndex, @NotNull Modifier.Element element, @NotNull Modifier.Node node);

        void nodeReused(int oldIndex, int newIndex, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);

        void nodeUpdated(int oldIndex, int newIndex, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);
    }

    public NodeChain(@NotNull LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node parent) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).getNode();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(backwardsCompatNode, parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet();
    }

    private final Differ getDiffer(Modifier.Node head, int offset, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after, boolean shouldAttachOnInsert) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(head);
        differ.setOffset(offset);
        differ.setBefore(before);
        differ.setAfter(after);
        differ.setShouldAttachOnInsert(shouldAttachOnInsert);
        return differ;
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node parent) {
        Modifier.Node child$ui_release = parent.getChild();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        parent.setChild$ui_release(node);
        node.setParent$ui_release(parent);
        return node;
    }

    private final Modifier.Node padChain() {
        if (!(this.head != NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChainKt.SentinelHead);
        NodeChainKt.SentinelHead.setChild$ui_release(node);
        return NodeChainKt.SentinelHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(Modifier.Node start, NodeCoordinator coordinator) {
        for (Modifier.Node parent$ui_release = start.getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
            if (parent$ui_release == NodeChainKt.SentinelHead) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                coordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((NodeKind.m12314constructorimpl(2) & parent$ui_release.getKindSet()) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(coordinator);
            }
        }
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild();
        Modifier.Node parent$ui_release = node.getParent();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        AbstractC5830k.m5327d(parent$ui_release);
        return parent$ui_release;
    }

    private final void structuralUpdate(int offset, MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after, Modifier.Node tail, boolean shouldAttachOnInsert) {
        MyersDiffKt.executeDiff(before.getSize() - offset, after.getSize() - offset, getDiffer(tail, offset, before, after, shouldAttachOnInsert));
        syncAggregateChildKindSet();
    }

    private final void syncAggregateChildKindSet() {
        int kindSet$ui_release = 0;
        for (Modifier.Node parent$ui_release = this.tail.getParent(); parent$ui_release != null && parent$ui_release != NodeChainKt.SentinelHead; parent$ui_release = parent$ui_release.getParent()) {
            kindSet$ui_release |= parent$ui_release.getKindSet();
            parent$ui_release.setAggregateChildKindSet$ui_release(kindSet$ui_release);
        }
    }

    private final Modifier.Node trimChain(Modifier.Node paddedHead) {
        if (!(paddedHead == NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        Modifier.Node child$ui_release = NodeChainKt.SentinelHead.getChild();
        if (child$ui_release == null) {
            child$ui_release = this.tail;
        }
        child$ui_release.setParent$ui_release(null);
        NodeChainKt.SentinelHead.setChild$ui_release(null);
        NodeChainKt.SentinelHead.setAggregateChildKindSet$ui_release(-1);
        NodeChainKt.SentinelHead.updateCoordinator$ui_release(null);
        if (!(child$ui_release != NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        return child$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        if ((prev instanceof ModifierNodeElement) && (next instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) next, node);
            if (node.getIsAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
            return;
        }
        ((BackwardsCompatNode) node).setElement(next);
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(node);
        } else {
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final <T> T m12269firstFromHeadaLcG6gQ$ui_release(int type, InterfaceC6471c block) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    AbstractC5830k.m5338o();
                    throw null;
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: getHead$ui_release, reason: from getter */
    public final Modifier.Node getHead() {
        return this.head;
    }

    @NotNull
    /* renamed from: getInnerCoordinator$ui_release, reason: from getter */
    public final InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @NotNull
    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return EmptyList.INSTANCE;
        }
        int i = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head = getHead();
        while (head != null && head != getTail()) {
            NodeCoordinator coordinator$ui_release = head.getCoordinator();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            OwnedLayer layer = coordinator$ui_release.getLayer();
            OwnedLayer layer2 = this.innerCoordinator.getLayer();
            Modifier.Node child$ui_release = head.getChild();
            if (child$ui_release != this.tail || head.getCoordinator() == child$ui_release.getCoordinator()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.add(new ModifierInfo(mutableVector.content[i], coordinator$ui_release, layer));
            head = head.getChild();
            i++;
        }
        return mutableVector2.asMutableList();
    }

    @NotNull
    /* renamed from: getOuterCoordinator$ui_release, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    @NotNull
    /* renamed from: getTail$ui_release, reason: from getter */
    public final Modifier.Node getTail() {
        return this.tail;
    }

    public final boolean has$ui_release(int mask) {
        return (mask & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m12270hasH91voCI$ui_release(int type) {
        return (type & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final <T> T m12271headH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    AbstractC5830k.m5338o();
                    throw null;
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int mask, @NotNull InterfaceC6471c block) {
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
    public final <T> void m12272headToTailaLcG6gQ$ui_release(int type, InterfaceC6471c block) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    AbstractC5830k.m5338o();
                    throw null;
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@NotNull InterfaceC6471c block) {
        for (Modifier.Node head = getHead(); head != null && head != getTail(); head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final boolean isUpdating$ui_release() {
        return NodeChainKt.SentinelHead.getChild() != null;
    }

    public final void markAsAttached() {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.reset$ui_release();
            }
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        NodeCoordinator wrapped$ui_release = this.outerCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        while (wrapped$ui_release != innerNodeCoordinator) {
            wrapped$ui_release.onAttach();
            wrapped$ui_release = wrapped$ui_release.getWrapped();
            AbstractC5830k.m5327d(wrapped$ui_release);
        }
        innerNodeCoordinator.onAttach();
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.runAttachLifecycle$ui_release();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                NodeKindKt.autoInvalidateInsertedNode(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                NodeKindKt.autoInvalidateUpdatedNode(head);
            }
            head.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.runDetachLifecycle$ui_release();
            }
        }
        NodeCoordinator wrappedBy$ui_release = this.innerCoordinator;
        NodeCoordinator nodeCoordinator = this.outerCoordinator;
        while (wrappedBy$ui_release != nodeCoordinator) {
            wrappedBy$ui_release.onDetach();
            wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy();
            AbstractC5830k.m5327d(wrappedBy$ui_release);
        }
        nodeCoordinator.onDetach();
    }

    public final void syncCoordinators() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator();
                    AbstractC5830k.m5328e(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(layoutModifierNodeAsLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, layoutModifierNodeAsLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    /* renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final <T> T m12273tailH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    AbstractC5830k.m5338o();
                    throw null;
                }
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int mask, @NotNull InterfaceC6471c block) {
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
    public final <T> void m12274tailToHeadaLcG6gQ$ui_release(int type, InterfaceC6471c block) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    AbstractC5830k.m5338o();
                    throw null;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
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
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFrom$ui_release(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.Modifier r18) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui_release(@Nullable Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(@NotNull InterfaceC6471c block) {
        for (Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            block.invoke(tail);
        }
    }

    public final void headToTail$ui_release(@NotNull InterfaceC6471c block) {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }
}
