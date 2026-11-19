package androidx.compose.runtime.changelist;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0003J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u0003J\u0015\u00100\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u0003J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\u0003J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\u0003J\u001d\u00107\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J%\u00107\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u00106\u001a\u0002052\u0006\u0010:\u001a\u000209¢\u0006\u0004\b7\u0010;J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u001d¢\u0006\u0004\b=\u0010)J)\u0010B\u001a\u00020\b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\b0>2\u0006\u0010A\u001a\u00020?¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bE\u0010.J@\u0010K\u001a\u00020\b\"\u0004\b\u0000\u0010F\"\u0004\b\u0001\u0010G2\u0006\u0010\u0013\u001a\u00028\u00012\u001d\u0010J\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0H¢\u0006\u0002\bI¢\u0006\u0004\bK\u0010LJ\u001d\u0010O\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001d¢\u0006\u0004\bO\u0010PJ%\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u001d¢\u0006\u0004\bU\u0010)J\u0015\u0010V\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\bV\u0010)J\u001d\u0010Y\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0W¢\u0006\u0004\bY\u0010ZJ\u001b\u0010]\u001a\u00020\b2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0[¢\u0006\u0004\b]\u0010^J\u001d\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\ba\u0010bJ%\u0010e\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0c2\u0006\u0010d\u001a\u00020_¢\u0006\u0004\be\u0010fJ/\u0010l\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020i2\u0006\u00106\u001a\u00020k2\u0006\u0010Q\u001a\u00020k¢\u0006\u0004\bl\u0010mJ%\u0010p\u001a\u00020\b2\u0006\u0010A\u001a\u00020n2\u0006\u0010j\u001a\u00020i2\u0006\u0010o\u001a\u00020k¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\b¢\u0006\u0004\br\u0010\u0003J!\u0010t\u001a\u00020\b2\u0006\u0010s\u001a\u00020\u00002\n\b\u0002\u0010d\u001a\u0004\u0018\u00010_¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u00020v2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0011\u0010\u007f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0080\u0001"}, m5110d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "Ld6/s;", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingChanges", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/RememberObserverHolder;", "value", "pushRemember", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "pushRememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "pushStartResumingScope", "pushEndResumingScope", "", "", "groupSlotIndex", "pushUpdateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "pushUpdateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "pushAppendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "pushTrimValues", "(I)V", "pushResetSlots", "pushDeactivateCurrentGroup", "data", "pushUpdateAuxData", "(Ljava/lang/Object;)V", "pushEnsureRootStarted", "pushEnsureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", TypedValues.TransitionType.S_FROM, "pushInsertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", TypedValues.CycleType.S_WAVE_OFFSET, "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "pushEndCompositionScope", "(Lr6/c;Landroidx/compose/runtime/Composition;)V", "node", "pushUseNode", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "pushUpdateNode", "(Ljava/lang/Object;Lr6/e;)V", "removeFrom", "moveCount", "pushRemoveNode", "(II)V", TypedValues.TransitionType.S_TO, "pushMoveNode", "(III)V", "distance", "pushAdvanceSlotsBy", "pushUps", "", "nodes", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "pushSideEffect", "(Lr6/a;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "pushDetermineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "effectiveNodeIndex", "pushCopyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", TypedValues.Custom.S_REFERENCE, "pushReleaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "pushEndMovableContentPlacement", "changeList", "pushExecuteOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "", "linePrefix", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "getSize", "()I", "size", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 8 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 27 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 28 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 29 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,331:1\n202#2,4:332\n207#2,2:337\n202#2,4:339\n207#2,2:344\n202#2,4:346\n207#2,2:351\n202#2,4:353\n207#2,2:358\n202#2,4:360\n359#2:375\n356#2:376\n207#2,2:378\n202#2,4:380\n359#2:398\n356#2:399\n207#2,2:401\n202#2,4:403\n207#2,2:411\n202#2,4:413\n359#2:427\n356#2:428\n207#2,2:430\n202#2,4:432\n207#2,2:437\n202#2,4:439\n207#2,2:444\n202#2,4:446\n207#2,2:454\n202#2,4:456\n207#2,2:463\n202#2,4:465\n359#2:479\n356#2:480\n207#2,2:482\n202#2,4:484\n207#2,2:490\n202#2,4:492\n207#2,2:500\n202#2,4:502\n356#2:520\n207#2,2:525\n202#2,4:527\n356#2:550\n207#2,2:556\n202#2,4:558\n359#2:572\n356#2:573\n207#2,2:575\n202#2,4:577\n359#2:591\n356#2:592\n207#2,2:594\n202#2,4:596\n207#2,2:601\n202#2,4:603\n207#2,2:608\n202#2,4:610\n207#2,2:616\n202#2,4:618\n207#2,2:624\n202#2,4:626\n207#2,2:634\n202#2,4:636\n207#2,2:643\n202#2,4:645\n207#2,2:651\n153#3:336\n172#4:343\n192#5:350\n212#6:357\n299#7:364\n302#7:365\n370#8,9:366\n379#8:377\n370#8,9:389\n379#8:400\n370#8,9:418\n379#8:429\n370#8,9:470\n379#8:481\n387#8,10:510\n397#8,4:521\n410#8,11:539\n421#8,5:551\n370#8,9:563\n379#8:574\n370#8,9:582\n379#8:593\n342#9,4:384\n348#9:388\n232#10,4:407\n260#11:417\n399#12:436\n428#13:443\n607#14,4:450\n639#15:460\n642#15:461\n645#15:462\n457#16:469\n496#17:488\n499#17:489\n532#18,4:496\n557#19,4:506\n583#20:531\n580#20,7:532\n112#21:562\n70#22:581\n89#23:600\n134#24:607\n775#25:614\n778#25:615\n810#26:622\n807#26:623\n838#27:630\n841#27:631\n847#27:632\n844#27:633\n907#28:640\n910#28:641\n913#28:642\n944#29:649\n947#29:650\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n91#1:332,4\n91#1:337,2\n95#1:339,4\n95#1:344,2\n99#1:346,4\n99#1:351,2\n103#1:353,4\n103#1:358,2\n107#1:360,4\n109#1:375\n109#1:376\n107#1:378,2\n114#1:380,4\n116#1:398\n116#1:399\n114#1:401,2\n121#1:403,4\n121#1:411,2\n127#1:413,4\n127#1:427\n127#1:428\n127#1:430,2\n139#1:432,4\n139#1:437,2\n147#1:439,4\n147#1:444,2\n163#1:446,4\n163#1:454,2\n169#1:456,4\n169#1:463,2\n182#1:465,4\n182#1:479\n182#1:480\n182#1:482,2\n186#1:484,4\n186#1:490,2\n203#1:492,4\n203#1:500,2\n210#1:502,4\n211#1:520\n210#1:525,2\n216#1:527,4\n217#1:550\n216#1:556,2\n222#1:558,4\n222#1:572\n222#1:573\n222#1:575,2\n226#1:577,4\n226#1:591\n226#1:592\n226#1:594,2\n231#1:596,4\n231#1:601,2\n236#1:603,4\n236#1:608,2\n240#1:610,4\n240#1:616,2\n252#1:618,4\n252#1:624,2\n270#1:626,4\n270#1:634,2\n290#1:636,4\n290#1:643,2\n308#1:645,4\n308#1:651,2\n91#1:336\n95#1:343\n99#1:350\n103#1:357\n108#1:364\n109#1:365\n109#1:366,9\n109#1:377\n116#1:389,9\n116#1:400\n127#1:418,9\n127#1:429\n182#1:470,9\n182#1:481\n211#1:510,10\n211#1:521,4\n217#1:539,11\n217#1:551,5\n222#1:563,9\n222#1:574\n226#1:582,9\n226#1:593\n115#1:384,4\n116#1:388\n122#1:407,4\n127#1:417\n139#1:436\n147#1:443\n164#1:450,4\n171#1:460\n173#1:461\n175#1:462\n182#1:469\n188#1:488\n190#1:489\n205#1:496,4\n211#1:506,4\n217#1:531\n217#1:532,7\n222#1:562\n226#1:581\n231#1:600\n236#1:607\n242#1:614\n244#1:615\n254#1:622\n256#1:623\n272#1:630\n274#1:631\n276#1:632\n278#1:633\n292#1:640\n294#1:641\n296#1:642\n310#1:649\n312#1:650\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @NotNull
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i, Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
    }

    public final int getSize() {
        return this.operations.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        operationsM10170constructorimpl.intArgs[operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts()] = distance;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushAppendValue(@NotNull Anchor anchor, @Nullable Object value) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations.WriteScope.m10179setObjects4uCC6AY(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), anchor, Operation.ObjectParameter.m10147constructorimpl(1), value);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushCopyNodesToNewAnchorLocation(@NotNull List<? extends Object> nodes, @NotNull IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m10179setObjects4uCC6AY(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(1), nodes, Operation.ObjectParameter.m10147constructorimpl(0), effectiveNodeIndex);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(@Nullable MovableContentState resolvedState, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference from, @NotNull MovableContentStateReference to) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations.WriteScope.m10180setObjectsOGa0p1M(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), resolvedState, Operation.ObjectParameter.m10147constructorimpl(1), parentContext, Operation.ObjectParameter.m10147constructorimpl(3), to, Operation.ObjectParameter.m10147constructorimpl(2), from);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(@NotNull IntRef effectiveNodeIndexOut, @NotNull Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m10179setObjects4uCC6AY(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), effectiveNodeIndexOut, Operation.ObjectParameter.m10147constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushDowns(@NotNull Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), nodes);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushEndCompositionScope(@NotNull InterfaceC6471c action, @NotNull Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m10179setObjects4uCC6AY(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), action, Operation.ObjectParameter.m10147constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEndResumingScope(@NotNull RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushEnsureGroupStarted(@NotNull Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), anchor);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(@NotNull ChangeList changeList, @Nullable IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations.WriteScope.m10179setObjects4uCC6AY(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), changeList, Operation.ObjectParameter.m10147constructorimpl(1), effectiveNodeIndex);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    public final void pushInsertSlots(@NotNull Anchor anchor, @NotNull SlotTable from) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations.WriteScope.m10179setObjects4uCC6AY(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), anchor, Operation.ObjectParameter.m10147constructorimpl(1), from);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        operationsM10170constructorimpl.intArgs[operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts()] = offset;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        int ints = operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM10170constructorimpl.intArgs;
        iArr[ints + 1] = to;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushReleaseMovableGroupAtCurrent(@NotNull ControlledComposition composition, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference reference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations.WriteScope.m10181setObjectst7hvbck(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), composition, Operation.ObjectParameter.m10147constructorimpl(1), parentContext, Operation.ObjectParameter.m10147constructorimpl(2), reference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushRemember(@NotNull RememberObserverHolder value) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), value);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(@NotNull RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        int ints = operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM10170constructorimpl.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(@NotNull InterfaceC6469a effect) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), effect);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushStartResumingScope(@NotNull RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushTrimValues(int count) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        operationsM10170constructorimpl.intArgs[operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushUpdateAnchoredValue(@Nullable Object value, @NotNull Anchor anchor, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        Operations.WriteScope.m10179setObjects4uCC6AY(operationsM10170constructorimpl, Operation.ObjectParameter.m10147constructorimpl(0), value, Operation.ObjectParameter.m10147constructorimpl(1), anchor);
        operationsM10170constructorimpl.intArgs[operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushUpdateAuxData(@Nullable Object data) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m10178setObjectDKhxnng(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), data);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final <T, V> void pushUpdateNode(V value, @NotNull InterfaceC6473e block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        int iM10147constructorimpl = Operation.ObjectParameter.m10147constructorimpl(0);
        int iM10147constructorimpl2 = Operation.ObjectParameter.m10147constructorimpl(1);
        AbstractC5830k.m5328e(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        AbstractC5835p.m5354c(2, block);
        Operations.WriteScope.m10179setObjects4uCC6AY(operationsM10170constructorimpl, iM10147constructorimpl, value, iM10147constructorimpl2, block);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushUpdateValue(@Nullable Object value, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        Operations.WriteScope.m10178setObjectDKhxnng(operationsM10170constructorimpl, Operation.ObjectParameter.m10147constructorimpl(0), value);
        operationsM10170constructorimpl.intArgs[operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUps(int count) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations operationsM10170constructorimpl = Operations.WriteScope.m10170constructorimpl(operations);
        operationsM10170constructorimpl.intArgs[operationsM10170constructorimpl.intArgsSize - operationsM10170constructorimpl.opCodes[operationsM10170constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushUseNode(@Nullable Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String linePrefix) {
        StringBuilder sbM97v = AbstractC0037f.m97v("ChangeList instance containing ");
        sbM97v.append(getSize());
        sbM97v.append(" operations");
        if (sbM97v.length() > 0) {
            sbM97v.append(":\n");
            sbM97v.append(this.operations.toDebugString(linePrefix));
        }
        String string = sbM97v.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    public final void pushInsertSlots(@NotNull Anchor anchor, @NotNull SlotTable from, @NotNull FixupList fixups) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m10181setObjectst7hvbck(Operations.WriteScope.m10170constructorimpl(operations), Operation.ObjectParameter.m10147constructorimpl(0), anchor, Operation.ObjectParameter.m10147constructorimpl(1), from, Operation.ObjectParameter.m10147constructorimpl(2), fixups);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }
}
