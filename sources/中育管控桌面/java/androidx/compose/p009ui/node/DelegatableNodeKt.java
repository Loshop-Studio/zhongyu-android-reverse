package androidx.compose.p009ui.node;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.GraphicsContext;
import androidx.compose.p009ui.internal.InlineClassHelperKt;
import androidx.compose.p009ui.layout.LayoutCoordinates;
import androidx.compose.p009ui.semantics.SemanticsInfo;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a\"\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a5\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0007H\u0000\u001aA\u0010\u0013\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006*\u00020\u001a2\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\"\u0010\u001b\u001a\u00020\u0001*\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\n\u0010\u001e\u001a\u00020\u0005*\u00020\u0002\u001a3\u0010\u001f\u001a\u0004\u0018\u0001H\f\"\n\b\u0000\u0010\f\u0018\u0001*\u00020 *\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010#\u001a\u00020$H\u0000\u001a\u0016\u0010%\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u001a\n\u0010&\u001a\u00020\u0005*\u00020\u0002\u001a\"\u0010'\u001a\u00020(*\u00020\u00022\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\n\u0010+\u001a\u00020,*\u00020\u0002\u001a\n\u0010-\u001a\u00020.*\u00020\u0002\u001a\n\u0010/\u001a\u000200*\u00020\u0002\u001a\n\u00101\u001a\u000202*\u00020\u0002\u001a\f\u00103\u001a\u00020\u001a*\u00020\u0002H\u0000\u001a\f\u00104\u001a\u000205*\u00020\u0002H\u0000\u001a\f\u00106\u001a\u000207*\u00020\u0002H\u0000\u001aK\u00108\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a3\u00108\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aK\u0010<\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b=\u0010;\u001a1\u0010<\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aA\u0010>\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a)\u0010>\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aA\u0010A\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bB\u0010@\u001a)\u0010A\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001a3\u0010A\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aM\u0010C\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aK\u0010G\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bH\u0010;\u001aA\u0010I\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bJ\u0010@\u001aK\u0010K\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bL\u0010;\u001aK\u0010M\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bN\u0010;\u001a1\u0010M\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, m7880d2 = {"isDelegationRoot", "", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "zOrder", "ancestors", "", ExifInterface.GPS_DIRECTION_TRUE, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "asLayoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind", "kind", "block", "Lkotlin/Function1;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "getChildren", "Landroidx/compose/ui/node/LayoutNode;", "has", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "nearestAncestor", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "mask", "", "pop", "requestAutofill", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireDensity", "Landroidx/compose/ui/unit/Density;", "requireGraphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutNode", "requireOwner", "Landroidx/compose/ui/node/Owner;", "requireSemanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "visitAncestors", "includeSelf", "visitAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-Y-YKmho", "visitLocalAncestors", "visitLocalAncestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitLocalDescendants", "visitLocalDescendants-6rFNWt0", "visitSelfAndAncestors", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndChildren", "visitSelfAndChildren-Y-YKmho", "visitSelfAndLocalDescendants", "visitSelfAndLocalDescendants-6rFNWt0", "visitSubtree", "visitSubtree-Y-YKmho", "visitSubtreeIf", "visitSubtreeIf-Y-YKmho", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,478:1\n209#1:517\n210#1,10:523\n209#1:543\n210#1,6:549\n437#1,6:555\n447#1,2:562\n449#1,8:567\n457#1,9:578\n466#1,8:590\n217#1,3:598\n202#1,8:601\n210#1,6:614\n437#1,6:620\n447#1,2:627\n449#1,8:632\n457#1,9:643\n466#1,8:655\n217#1,3:663\n222#1:666\n223#1,4:672\n437#1,6:676\n447#1,2:683\n449#1,8:688\n457#1,9:699\n466#1,8:711\n228#1,3:719\n90#1:722\n91#1,8:728\n437#1,6:736\n447#1,2:743\n449#1,8:748\n457#1,9:759\n466#1,8:771\n100#1,7:779\n90#1,9:786\n437#1,12:795\n449#1,8:810\n457#1,9:821\n466#1,8:833\n100#1,7:841\n90#1:848\n91#1,8:854\n437#1,6:864\n447#1,2:871\n449#1,8:876\n457#1,9:887\n466#1,8:899\n100#1,7:907\n247#1,5:914\n90#1:919\n91#1,8:925\n437#1,6:933\n447#1,2:940\n449#1,8:945\n457#1,9:956\n466#1,8:968\n100#1,7:976\n247#1,5:983\n90#1:988\n91#1,8:994\n437#1,6:1002\n447#1,2:1009\n449#1,8:1014\n457#1,9:1025\n466#1,8:1037\n100#1,7:1045\n148#1:1052\n149#1:1058\n150#1,3:1062\n153#1:1066\n154#1,9:1068\n437#1,6:1077\n447#1,2:1084\n449#1,17:1089\n466#1,8:1109\n163#1,6:1117\n148#1,2:1123\n150#1,3:1128\n153#1:1132\n154#1,9:1134\n437#1,12:1143\n449#1,17:1158\n466#1,8:1178\n163#1,6:1186\n437#1,6:1192\n447#1,2:1199\n449#1,8:1204\n457#1,9:1215\n466#1,8:1227\n148#1:1235\n149#1:1241\n150#1,3:1245\n153#1:1249\n154#1,9:1251\n437#1,6:1260\n447#1,2:1267\n449#1,8:1272\n457#1,9:1283\n466#1,8:1295\n163#1,6:1303\n437#1,6:1309\n447#1,2:1316\n449#1,8:1321\n457#1,9:1332\n466#1,8:1344\n148#1,2:1352\n150#1,3:1357\n153#1:1361\n154#1,9:1363\n437#1,6:1372\n447#1,2:1379\n449#1,8:1384\n457#1,9:1395\n466#1,8:1407\n163#1,6:1415\n179#1:1421\n180#1:1427\n181#1,3:1431\n184#1,6:1435\n437#1,6:1441\n447#1,2:1448\n449#1,8:1453\n457#1,9:1464\n466#1,8:1476\n190#1,8:1484\n179#1,2:1492\n181#1,9:1497\n437#1,12:1506\n449#1,8:1521\n457#1,9:1532\n466#1,8:1544\n190#1,8:1552\n179#1:1560\n180#1:1566\n181#1,3:1570\n184#1,6:1574\n437#1,6:1580\n447#1,2:1587\n449#1,8:1592\n457#1,9:1603\n466#1,8:1615\n190#1,8:1623\n179#1,2:1631\n181#1,9:1636\n437#1,12:1645\n449#1,8:1660\n457#1,9:1671\n466#1,8:1683\n190#1,8:1691\n56#2,5:479\n56#2,5:484\n56#2,5:498\n56#2,5:508\n56#2,5:518\n56#2,5:533\n56#2,5:538\n56#2,5:544\n56#2,5:609\n56#2,5:667\n56#2,5:723\n56#2,5:849\n56#2,5:920\n56#2,5:989\n56#2,5:1053\n56#2,5:1236\n56#2,5:1422\n56#2,5:1561\n76#2,7:1699\n76#2,7:1706\n56#2,5:1713\n56#2,5:1719\n447#3,9:489\n519#3:506\n44#3:507\n519#3:516\n519#3:1065\n44#3:1067\n519#3:1131\n44#3:1133\n519#3:1248\n44#3:1250\n519#3:1360\n44#3:1362\n519#3:1434\n519#3:1573\n516#3:1739\n1101#4:503\n1083#4,2:504\n1101#4:513\n1083#4,2:514\n1101#4:575\n1083#4,2:576\n1101#4:640\n1083#4,2:641\n1101#4:696\n1083#4,2:697\n1101#4:756\n1083#4,2:757\n1101#4:818\n1083#4,2:819\n1101#4:884\n1083#4,2:885\n1101#4:953\n1083#4,2:954\n1101#4:1022\n1083#4,2:1023\n1101#4:1059\n1083#4,2:1060\n1101#4:1125\n1083#4,2:1126\n1101#4:1212\n1083#4,2:1213\n1101#4:1242\n1083#4,2:1243\n1101#4:1280\n1083#4,2:1281\n1101#4:1329\n1083#4,2:1330\n1101#4:1354\n1083#4,2:1355\n1101#4:1392\n1083#4,2:1393\n1101#4:1428\n1083#4,2:1429\n1101#4:1461\n1083#4,2:1462\n1101#4:1494\n1083#4,2:1495\n1101#4:1529\n1083#4,2:1530\n1101#4:1567\n1083#4,2:1568\n1101#4:1600\n1083#4,2:1601\n1101#4:1633\n1083#4,2:1634\n1101#4:1668\n1083#4,2:1669\n1101#4:1733\n1083#4,2:1734\n246#5:561\n246#5:626\n246#5:682\n246#5:742\n246#5:862\n246#5:863\n246#5:870\n246#5:939\n246#5:1008\n246#5:1083\n246#5:1198\n246#5:1266\n246#5:1315\n246#5:1378\n246#5:1447\n246#5:1586\n246#5:1725\n246#5:1727\n246#5:1728\n246#5:1732\n240#6,3:564\n243#6,3:587\n240#6,3:629\n243#6,3:652\n240#6,3:685\n243#6,3:708\n240#6,3:745\n243#6,3:768\n240#6,3:807\n243#6,3:830\n240#6,3:873\n243#6,3:896\n240#6,3:942\n243#6,3:965\n240#6,3:1011\n243#6,3:1034\n240#6,3:1086\n243#6,3:1106\n240#6,3:1155\n243#6,3:1175\n240#6,3:1201\n243#6,3:1224\n240#6,3:1269\n243#6,3:1292\n240#6,3:1318\n243#6,3:1341\n240#6,3:1381\n243#6,3:1404\n240#6,3:1450\n243#6,3:1473\n240#6,3:1518\n243#6,3:1541\n240#6,3:1589\n243#6,3:1612\n240#6,3:1657\n243#6,3:1680\n240#6,3:1729\n243#6,3:1736\n83#7:1718\n83#7:1724\n83#7:1726\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n202#1:517\n202#1:523,10\n235#1:543\n235#1:549,6\n235#1:555,6\n235#1:562,2\n235#1:567,8\n235#1:578,9\n235#1:590,8\n235#1:598,3\n240#1:601,8\n240#1:614,6\n240#1:620,6\n240#1:627,2\n240#1:632,8\n240#1:643,9\n240#1:655,8\n240#1:663,3\n245#1:666\n245#1:672,4\n245#1:676,6\n245#1:683,2\n245#1:688,8\n245#1:699,9\n245#1:711,8\n245#1:719,3\n251#1:722\n251#1:728,8\n251#1:736,6\n251#1:743,2\n251#1:748,8\n251#1:759,9\n251#1:771,8\n251#1:779,7\n251#1:786,9\n251#1:795,12\n251#1:810,8\n251#1:821,9\n251#1:833,8\n251#1:841,7\n259#1:848\n259#1:854,8\n262#1:864,6\n262#1:871,2\n262#1:876,8\n262#1:887,9\n262#1:899,8\n259#1:907,7\n269#1:914,5\n269#1:919\n269#1:925,8\n269#1:933,6\n269#1:940,2\n269#1:945,8\n269#1:956,9\n269#1:968,8\n269#1:976,7\n277#1:983,5\n277#1:988\n277#1:994,8\n277#1:1002,6\n277#1:1009,2\n277#1:1014,8\n277#1:1025,9\n277#1:1037,8\n277#1:1045,7\n287#1:1052\n287#1:1058\n287#1:1062,3\n287#1:1066\n287#1:1068,9\n287#1:1077,6\n287#1:1084,2\n287#1:1089,17\n287#1:1109,8\n287#1:1117,6\n287#1:1123,2\n287#1:1128,3\n287#1:1132\n287#1:1134,9\n287#1:1143,12\n287#1:1158,17\n287#1:1178,8\n287#1:1186,6\n294#1:1192,6\n294#1:1199,2\n294#1:1204,8\n294#1:1215,9\n294#1:1227,8\n295#1:1235\n295#1:1241\n295#1:1245,3\n295#1:1249\n295#1:1251,9\n295#1:1260,6\n295#1:1267,2\n295#1:1272,8\n295#1:1283,9\n295#1:1295,8\n295#1:1303,6\n294#1:1309,6\n294#1:1316,2\n294#1:1321,8\n294#1:1332,9\n294#1:1344,8\n295#1:1352,2\n295#1:1357,3\n295#1:1361\n295#1:1363,9\n295#1:1372,6\n295#1:1379,2\n295#1:1384,8\n295#1:1395,9\n295#1:1407,8\n295#1:1415,6\n303#1:1421\n303#1:1427\n303#1:1431,3\n303#1:1435,6\n304#1:1441,6\n304#1:1448,2\n304#1:1453,8\n304#1:1464,9\n304#1:1476,8\n303#1:1484,8\n303#1:1492,2\n303#1:1497,9\n304#1:1506,12\n304#1:1521,8\n304#1:1532,9\n304#1:1544,8\n303#1:1552,8\n313#1:1560\n313#1:1566\n313#1:1570,3\n313#1:1574,6\n314#1:1580,6\n314#1:1587,2\n314#1:1592,8\n314#1:1603,9\n314#1:1615,8\n313#1:1623,8\n313#1:1631,2\n313#1:1636,9\n314#1:1645,12\n314#1:1660,8\n314#1:1671,9\n314#1:1683,8\n313#1:1691,8\n90#1:479,5\n110#1:484,5\n148#1:498,5\n179#1:508,5\n202#1:518,5\n209#1:533,5\n222#1:538,5\n235#1:544,5\n240#1:609,5\n245#1:667,5\n251#1:723,5\n259#1:849,5\n269#1:920,5\n277#1:989,5\n287#1:1053,5\n295#1:1236,5\n303#1:1422,5\n313#1:1561,5\n328#1:1699,7\n336#1:1706,7\n370#1:1713,5\n374#1:1719,5\n140#1:489,9\n152#1:506\n153#1:507\n183#1:516\n287#1:1065\n287#1:1067\n287#1:1131\n287#1:1133\n295#1:1248\n295#1:1250\n295#1:1360\n295#1:1362\n303#1:1434\n313#1:1573\n476#1:1739\n149#1:503\n149#1:504,2\n180#1:513\n180#1:514,2\n235#1:575\n235#1:576,2\n240#1:640\n240#1:641,2\n245#1:696\n245#1:697,2\n251#1:756\n251#1:757,2\n251#1:818\n251#1:819,2\n262#1:884\n262#1:885,2\n269#1:953\n269#1:954,2\n277#1:1022\n277#1:1023,2\n287#1:1059\n287#1:1060,2\n287#1:1125\n287#1:1126,2\n294#1:1212\n294#1:1213,2\n295#1:1242\n295#1:1243,2\n295#1:1280\n295#1:1281,2\n294#1:1329\n294#1:1330,2\n295#1:1354\n295#1:1355,2\n295#1:1392\n295#1:1393,2\n303#1:1428\n303#1:1429,2\n304#1:1461\n304#1:1462,2\n303#1:1494\n303#1:1495,2\n304#1:1529\n304#1:1530,2\n313#1:1567\n313#1:1568,2\n314#1:1600\n314#1:1601,2\n313#1:1633\n313#1:1634,2\n314#1:1668\n314#1:1669,2\n456#1:1733\n456#1:1734,2\n235#1:561\n240#1:626\n245#1:682\n251#1:742\n260#1:862\n261#1:863\n262#1:870\n269#1:939\n277#1:1008\n287#1:1083\n294#1:1198\n295#1:1266\n294#1:1315\n295#1:1378\n304#1:1447\n314#1:1586\n395#1:1725\n402#1:1727\n442#1:1728\n449#1:1732\n235#1:564,3\n235#1:587,3\n240#1:629,3\n240#1:652,3\n245#1:685,3\n245#1:708,3\n251#1:745,3\n251#1:768,3\n251#1:807,3\n251#1:830,3\n262#1:873,3\n262#1:896,3\n269#1:942,3\n269#1:965,3\n277#1:1011,3\n277#1:1034,3\n287#1:1086,3\n287#1:1106,3\n287#1:1155,3\n287#1:1175,3\n294#1:1201,3\n294#1:1224,3\n295#1:1269,3\n295#1:1292,3\n294#1:1318,3\n294#1:1341,3\n295#1:1381,3\n295#1:1404,3\n304#1:1450,3\n304#1:1473,3\n304#1:1518,3\n304#1:1541,3\n314#1:1589,3\n314#1:1612,3\n314#1:1657,3\n314#1:1680,3\n448#1:1729,3\n448#1:1736,3\n373#1:1718\n395#1:1724\n402#1:1726\n*E\n"})
/* loaded from: classes2.dex */
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean z6) {
        MutableVector<LayoutNode> children = getChildren(requireLayoutNode(node), z6);
        int size = children.getSize() - 1;
        LayoutNode[] layoutNodeArr = children.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes().getHead());
                size--;
            }
        }
    }

    /* renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m15365ancestors64DMado(DelegatableNode delegatableNode, int i6) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i6) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i6) != 0) {
                        for (Modifier.Node nodePop = parent; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m15509constructorimpl(2) & node.getKindSet()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    delegate$ui_release = (!(delegate$ui_release instanceof DelegatingNode) || (NodeKind.m15509constructorimpl(2) & delegate$ui_release.getKindSet()) == 0) ? delegate$ui_release.getChild() : ((DelegatingNode) delegate$ui_release).getDelegate();
                }
            }
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m15366dispatchForKind6rFNWt0(Modifier.Node node, int i6, Function1<? super T, Unit> function1) {
        while (node != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            function1.invoke(node);
            node = pop(null);
        }
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode layoutNode, boolean z6) {
        return z6 ? layoutNode.getZSortedChildren() : layoutNode.get_children$ui_release();
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m15367has64DMado(DelegatableNode delegatableNode, int i6) {
        return (delegatableNode.getNode().getAggregateChildKindSet() & i6) != 0;
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().getIsAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i6) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i6) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i6) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m15368nearestAncestor64DMado(DelegatableNode delegatableNode, int i6) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Object parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i6) != 0) {
                while (parent != null) {
                    if ((((Modifier.Node) parent).getKindSet() & i6) != 0) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        return (T) parent;
                    }
                    parent = (T) ((Modifier.Node) parent).getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? (T) null : (T) nodes.getTail();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }

    public static final void requestAutofill(DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui_release();
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m15369requireCoordinator64DMado(DelegatableNode delegatableNode, int i6) {
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != delegatableNode || !NodeKindKt.m15518getIncludeSelfInTraversalH91voCI(i6)) {
            return coordinator;
        }
        NodeCoordinator wrapped = coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m15369requireCoordinator64DMado(delegatableNode, NodeKind.m15509constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super Modifier.Node, Unit> function1) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z6 ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i6) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i6) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i6, boolean z6, Function1 function1, int i7, Object obj) {
        NodeChain nodes;
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z6 ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i6) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i6) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m15370visitAncestorsYYKmho(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super T, Unit> function1) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z6 ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i6) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i6) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m15371visitAncestorsYYKmho$default(DelegatableNode delegatableNode, int i6, boolean z6, Function1 function1, int i7, Object obj) {
        NodeChain nodes;
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z6 ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i6) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i6) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i6) == 0) {
                addLayoutNodeChildren(mutableVector, child2, z6);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & i6) != 0) {
                        function1.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m15372visitChildrenYYKmho(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & i6) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z6);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & i6) != 0) {
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m15373visitChildrenYYKmho$default(DelegatableNode delegatableNode, int i6, boolean z6, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & i6) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z6);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & i6) != 0) {
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i6, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i6) != 0) {
                function1.invoke(parent);
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m15374visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i6, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i6) != 0) {
                for (Modifier.Node nodePop = parent; nodePop != null; nodePop = pop(null)) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    function1.invoke(nodePop);
                }
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i6) == 0) {
            return;
        }
        if (!z6) {
            node = node.getChild();
        }
        while (node != null) {
            if ((node.getKindSet() & i6) != 0) {
                function1.invoke(node);
            }
            node = node.getChild();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i6, boolean z6, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i6) == 0) {
            return;
        }
        if (!z6) {
            node = node.getChild();
        }
        while (node != null) {
            if ((node.getKindSet() & i6) != 0) {
                function1.invoke(node);
            }
            node = node.getChild();
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m15375visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i6, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i6) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i6) != 0) {
                    for (Modifier.Node nodePop = child; nodePop != null; nodePop = pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        function1.invoke(nodePop);
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m15376visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i6, int i7, Function1<? super T, Unit> function1) {
        NodeChain nodes;
        Modifier.Node node = delegatableNode.getNode();
        int i8 = i6 | i7;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i8) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i8) != 0) {
                        if (node2 != node && (node2.getKindSet() & i7) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & i6) != 0) {
                            for (Modifier.Node nodePop = node2; nodePop != null; nodePop = pop(null)) {
                                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                                function1.invoke(nodePop);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m15377visitSelfAndChildrenYYKmho(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super T, Unit> function1) {
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            function1.invoke(node);
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & i6) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z6);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & i6) != 0) {
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m15378visitSelfAndChildrenYYKmho$default(DelegatableNode delegatableNode, int i6, boolean z6, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            function1.invoke(node);
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & i6) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z6);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & i6) != 0) {
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m15379visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i6, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i6) != 0) {
            while (node != null) {
                if ((node.getKindSet() & i6) != 0) {
                    for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        function1.invoke(nodePop);
                    }
                }
                node = node.getChild();
            }
        }
    }

    /* renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m15380visitSubtreeYYKmho(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i6) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i6) != 0) {
                        for (Modifier.Node nodePop = child2; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z6);
        }
    }

    /* renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m15381visitSubtreeYYKmho$default(DelegatableNode delegatableNode, int i6, boolean z6, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i6) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i6) != 0) {
                        for (Modifier.Node nodePop = child2; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(nodePop);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z6);
        }
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super Modifier.Node, Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i6) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i6) == 0 || function1.invoke(child2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z6);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m15382visitSubtreeIfYYKmho(DelegatableNode delegatableNode, int i6, boolean z6, Function1<? super T, Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i6) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i6) != 0) {
                        for (Modifier.Node nodePop = child2; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!function1.invoke(nodePop).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z6);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m15383visitSubtreeIfYYKmho$default(DelegatableNode delegatableNode, int i6, boolean z6, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z6);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i6) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i6) != 0) {
                        for (Modifier.Node nodePop = child2; nodePop != null; nodePop = pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!((Boolean) function1.invoke(nodePop)).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z6);
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i6, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i6) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i6) != 0) {
                    function1.invoke(child);
                }
            }
        }
    }
}
