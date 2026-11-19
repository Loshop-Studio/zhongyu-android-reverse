package androidx.compose.p011ui.focus;

import android.os.Trace;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.BeyondBoundsLayout;
import androidx.compose.p011ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p011ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.node.ObserverModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNodeKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001[Be\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\"\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b(\u0010&J\u000f\u0010+\u001a\u00020\u000eH\u0000¢\u0006\u0004\b*\u0010\u001cJ\u000f\u0010-\u001a\u00020\u000eH\u0000¢\u0006\u0004\b,\u0010\u001cJ\u000f\u0010/\u001a\u00020\u000eH\u0000¢\u0006\u0004\b.\u0010\u001cJ\u001f\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0000¢\u0006\u0004\b.\u00102J\u000f\u00104\u001a\u00020\u0014H\u0000¢\u0006\u0004\b3\u0010\u0016J\u001b\u00109\u001a\u00020\u000e2\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b7\u00108JN\u0010?\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\u00102\u001d\u0010<\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0002\b;H\u0082\bø\u0001\u0000¢\u0006\u0004\b=\u0010>RF\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR\u0016\u0010B\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u0010E\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010\u0016R0\u0010\u0007\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00068\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR$\u0010V\u001a\u0002052\u0006\u0010I\u001a\u0002058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u00108R\u0013\u0010Z\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "previous", "current", "Ld6/s;", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(ILr6/e;Lr6/c;Lkotlin/jvm/internal/e;)V", "", "requestFocus", "()Z", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "requestFocus-3ESFkO8", "(I)Z", "onObservedReadsChanged", "()V", "onAttach", "onDetach", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "()Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusRequester;", "block", "fetchCustomEnter-aToIllA$ui_release", "(ILr6/c;)V", "fetchCustomEnter", "fetchCustomExit-aToIllA$ui_release", "fetchCustomExit", "commitFocusState$ui_release", "commitFocusState", "invalidateFocus$ui_release", "invalidateFocus", "dispatchFocusCallbacks$ui_release", "dispatchFocusCallbacks", "previousState", "newState", "(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", "isInitialized$ui_release", "isInitialized", "Landroidx/compose/ui/focus/FocusStateImpl;", "initialFocusState", "initializeFocusState$ui_release", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "initializeFocusState", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Lkotlin/ExtensionFunctionType;", "enterOrExit", "fetchCustomEnterOrExit-ULY8qGw", "(ILr6/c;Lr6/e;)V", "fetchCustomEnterOrExit", "Lr6/e;", "Lr6/c;", "isProcessingCustomExit", "Z", "isProcessingCustomEnter", "committedFocusState", "Landroidx/compose/ui/focus/FocusStateImpl;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "value", "I", "getFocusability-LCbbffg", "()I", "setFocusability-josRg5g", "(I)V", "", "previouslyFocusedChildHash", "getPreviouslyFocusedChildHash", "setPreviouslyFocusedChildHash", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "focusState", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 10 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,433:1\n232#1,19:613\n232#1,19:632\n119#2:434\n123#2:536\n119#2:537\n127#2:658\n119#2:659\n127#2:735\n119#2:736\n119#2:827\n119#2:897\n247#3,5:435\n90#3:440\n91#3,8:446\n437#3,6:454\n447#3,2:461\n449#3,8:466\n457#3,9:477\n466#3,8:489\n100#3,7:497\n258#3,2:538\n90#3:540\n91#3,8:546\n260#3:554\n261#3,2:556\n437#3,12:558\n449#3,8:573\n457#3,9:584\n466#3,8:596\n264#3:604\n100#3,7:605\n265#3:612\n258#3,2:660\n90#3:662\n91#3,8:668\n260#3:676\n261#3,2:678\n437#3,12:680\n449#3,8:695\n457#3,9:706\n466#3,8:718\n264#3:726\n100#3,7:727\n265#3:734\n258#3,2:737\n90#3:739\n91#3,8:745\n260#3:753\n261#3,2:755\n437#3,12:757\n449#3,8:772\n457#3,9:783\n466#3,8:795\n264#3:803\n100#3,7:804\n265#3:811\n247#3,5:828\n90#3:833\n91#3,8:839\n437#3,6:847\n447#3,2:854\n449#3,8:859\n457#3,9:870\n466#3,8:882\n100#3,7:890\n298#3,6:898\n179#3:904\n180#3:910\n181#3,3:914\n184#3,6:918\n304#3:924\n437#3,6:925\n447#3,2:932\n449#3,17:937\n466#3,8:957\n305#3:965\n190#3,8:966\n306#3:974\n56#4,5:441\n56#4,5:541\n76#4,7:651\n56#4,5:663\n56#4,5:740\n56#4,5:834\n56#4,5:905\n246#5:460\n246#5:555\n246#5:677\n246#5:754\n246#5:853\n246#5:931\n240#6,3:463\n243#6,3:486\n240#6,3:570\n243#6,3:593\n240#6,3:692\n243#6,3:715\n240#6,3:769\n243#6,3:792\n240#6,3:856\n243#6,3:879\n240#6,3:934\n243#6,3:954\n1101#7:474\n1083#7,2:475\n1101#7:581\n1083#7,2:582\n1101#7:703\n1083#7,2:704\n1101#7:780\n1083#7,2:781\n1101#7:867\n1083#7,2:868\n1101#7:911\n1083#7,2:912\n1#8:504\n1#8:514\n1#8:529\n1#8:820\n26#9,5:505\n52#10,4:510\n56#10,4:517\n48#10,8:521\n56#10,4:532\n48#10,8:812\n56#10,4:823\n641#11,2:515\n641#11,2:530\n641#11,2:821\n519#11:917\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n269#1:613,19\n293#1:632,19\n79#1:434\n221#1:536\n221#1:537\n341#1:658\n341#1:659\n352#1:735\n352#1:736\n382#1:827\n396#1:897\n79#1:435,5\n79#1:440\n79#1:446,8\n79#1:454,6\n79#1:461,2\n79#1:466,8\n79#1:477,9\n79#1:489,8\n79#1:497,7\n221#1:538,2\n221#1:540\n221#1:546,8\n221#1:554\n221#1:556,2\n221#1:558,12\n221#1:573,8\n221#1:584,9\n221#1:596,8\n221#1:604\n221#1:605,7\n221#1:612\n341#1:660,2\n341#1:662\n341#1:668,8\n341#1:676\n341#1:678,2\n341#1:680,12\n341#1:695,8\n341#1:706,9\n341#1:718,8\n341#1:726\n341#1:727,7\n341#1:734\n352#1:737,2\n352#1:739\n352#1:745,8\n352#1:753\n352#1:755,2\n352#1:757,12\n352#1:772,8\n352#1:783,9\n352#1:795,8\n352#1:803\n352#1:804,7\n352#1:811\n382#1:828,5\n382#1:833\n382#1:839,8\n382#1:847,6\n382#1:854,2\n382#1:859,8\n382#1:870,9\n382#1:882,8\n382#1:890,7\n396#1:898,6\n396#1:904\n396#1:910\n396#1:914,3\n396#1:918,6\n396#1:924\n396#1:925,6\n396#1:932,2\n396#1:937,17\n396#1:957,8\n396#1:965\n396#1:966,8\n396#1:974\n79#1:441,5\n221#1:541,5\n303#1:651,7\n341#1:663,5\n352#1:740,5\n382#1:834,5\n396#1:905,5\n79#1:460\n221#1:555\n341#1:677\n352#1:754\n382#1:853\n396#1:931\n79#1:463,3\n79#1:486,3\n221#1:570,3\n221#1:593,3\n341#1:692,3\n341#1:715,3\n352#1:769,3\n352#1:792,3\n382#1:856,3\n382#1:879,3\n396#1:934,3\n396#1:954,3\n79#1:474\n79#1:475,2\n221#1:581\n221#1:582,2\n341#1:703\n341#1:704,2\n352#1:780\n352#1:781,2\n382#1:867\n382#1:868,2\n396#1:911\n396#1:912,2\n117#1:514\n205#1:529\n412#1:820\n107#1:505,5\n117#1:510,4\n117#1:517,4\n205#1:521,8\n205#1:532,4\n412#1:812,8\n412#1:823,4\n117#1:515,2\n205#1:530,2\n412#1:821,2\n396#1:917\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;

    @Nullable
    private FocusStateImpl committedFocusState;
    private int focusability;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;

    @Nullable
    private final InterfaceC6471c onDispatchEventsCompleted;

    @Nullable
    private final InterfaceC6473e onFocusChange;
    private int previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    @StabilityInferred(parameters = 1)
    @Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "create", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;

        @NotNull
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object other) {
            return other == this;
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        public void update(@NotNull FocusTargetNode node) {
        }

        @Override // androidx.compose.p011ui.node.ModifierNodeElement
        @NotNull
        /* renamed from: create */
        public FocusTargetNode getNode() {
            return new FocusTargetNode(0, null, null, 7, null);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c, AbstractC5824e abstractC5824e) {
        this(i, interfaceC6473e, interfaceC6471c);
    }

    /* renamed from: fetchCustomEnterOrExit-ULY8qGw, reason: not valid java name */
    private final void m10357fetchCustomEnterOrExitULY8qGw(int focusDirection, InterfaceC6471c block, InterfaceC6473e enterOrExit) {
        Object objFetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(focusDirection, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
        int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        enterOrExit.invoke(objFetchFocusProperties$ui_release, cancelIndicatingFocusBoundaryScope);
        int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
        if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
            block.invoke(FocusRequester.INSTANCE.getCancel());
        } else {
            if (generation == generation2 && (!ComposeUiFlags.isTrackFocusEnabled || activeFocusTargetNode == activeFocusTargetNode2 || activeFocusTargetNode2 == null)) {
                return;
            }
            block.invoke(FocusRequester.INSTANCE.getRedirect$ui_release());
        }
    }

    private static final boolean initializeFocusState$hasActiveChild(FocusTargetNode focusTargetNode) {
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) AbstractC1923c.m1046j(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & iM12314constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM12314constructorimpl) != 0) {
                        Modifier.Node nodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.isInitialized$ui_release()) {
                                    int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return true;
                                    }
                                    if (i != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i8 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector2.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
        return false;
    }

    private static final boolean initializeFocusState$isInActiveSubTree(FocusTargetNode focusTargetNode) {
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        Modifier.Node nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.isInitialized$ui_release()) {
                                    int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                    if (i != 1 && i != 2) {
                                        if (i == 3) {
                                            return true;
                                        }
                                        if (i != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return false;
                                }
                            } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i8 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return false;
    }

    public static /* synthetic */ void initializeFocusState$ui_release$default(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl, int i, Object obj) {
        if ((i & 1) != 0) {
            focusStateImpl = null;
        }
        focusTargetNode.initializeFocusState$ui_release(focusStateImpl);
    }

    public final void commitFocusState$ui_release() {
        FocusStateImpl uncommittedFocusState = FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if (uncommittedFocusState == null) {
            throw AbstractC1923c.m1053q("committing a node that was not updated in the current transaction");
        }
        this.committedFocusState = uncommittedFocusState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void dispatchFocusCallbacks$ui_release() {
        NodeChain nodes;
        InterfaceC6473e interfaceC6473e;
        FocusStateImpl focusStateImpl = this.committedFocusState;
        if (focusStateImpl == null) {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        FocusStateImpl focusState = getFocusState();
        if (focusStateImpl != focusState && (interfaceC6473e = this.onFocusChange) != null) {
            interfaceC6473e.invoke(focusStateImpl, focusState);
        }
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(4096);
        int iM12314constructorimpl2 = NodeKind.m12314constructorimpl(1024);
        Modifier.Node node = getNode();
        int i = iM12314constructorimpl | iM12314constructorimpl2;
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & iM12314constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iM12314constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNodePop;
                                    focusEventModifierNode.onFocusEvent(FocusEventModifierNodeKt.getFocusState(focusEventModifierNode));
                                } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i8 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        InterfaceC6471c interfaceC6471c = this.onDispatchEventsCompleted;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(this);
        }
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m10358fetchCustomEnteraToIllA$ui_release(int focusDirection, @NotNull InterfaceC6471c block) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(focusDirection, null);
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                block.invoke(FocusRequester.INSTANCE.getCancel());
            } else if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                block.invoke(FocusRequester.INSTANCE.getRedirect$ui_release());
            }
            this.isProcessingCustomEnter = false;
        } catch (Throwable th) {
            this.isProcessingCustomEnter = false;
            throw th;
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m10359fetchCustomExitaToIllA$ui_release(int focusDirection, @NotNull InterfaceC6471c block) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(focusDirection, null);
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                block.invoke(FocusRequester.INSTANCE.getCancel());
            } else if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                block.invoke(FocusRequester.INSTANCE.getRedirect$ui_release());
            }
            this.isProcessingCustomExit = false;
        } catch (Throwable th) {
            this.isProcessingCustomExit = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @NotNull
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.setCanFocus(Focusability.m10370canFocusimpl$ui_release(getFocusability(), this));
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(2048);
        int iM12314constructorimpl2 = NodeKind.m12314constructorimpl(1024);
        Modifier.Node node = getNode();
        int i = iM12314constructorimpl | iM12314constructorimpl2;
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & iM12314constructorimpl2) != 0) {
                            return focusPropertiesImpl;
                        }
                        if ((node2.getKindSet() & iM12314constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNodePop).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i8 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return focusPropertiesImpl;
    }

    @Nullable
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.p011ui.focus.FocusTargetModifierNode
    /* renamed from: getFocusability-LCbbffg, reason: from getter */
    public int getFocusability() {
        return this.focusability;
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void initializeFocusState$ui_release(@Nullable FocusStateImpl initialFocusState) {
        if (isInitialized$ui_release()) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
        try {
            if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            if (initialFocusState == null) {
                initialFocusState = (initializeFocusState$isInActiveSubTree(this) && initializeFocusState$hasActiveChild(this)) ? FocusStateImpl.ActiveParent : FocusStateImpl.Inactive;
            }
            setFocusState(initialFocusState);
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        } catch (Throwable th) {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
            throw th;
        }
    }

    public final void invalidateFocus$ui_release() {
        if (!isInitialized$ui_release()) {
            initializeFocusState$ui_release$default(this, null, 1, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ObserverModifierNodeKt.observeReads(this, new InterfaceC6469a() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m10360invoke();
                    return C5443s.f8405a;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m10360invoke() {
                    ref$ObjectRef.element = this.fetchFocusProperties$ui_release();
                }
            });
            T t8 = ref$ObjectRef.element;
            if (t8 == 0) {
                AbstractC5830k.m5339p("focusProperties");
                throw null;
            }
            if (((FocusProperties) t8).getCanFocus()) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        }
    }

    public final boolean isInitialized$ui_release() {
        return ComposeUiFlags.isTrackFocusEnabled || this.committedFocusState != null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.invalidateFocusTarget(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        int i = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            focusOwner.mo10335clearFocusI7lrPNg(true, true, false, FocusDirection.INSTANCE.m10324getExitdhqQ8s());
            if (ComposeUiFlags.isTrackFocusEnabled) {
                focusOwner.scheduleInvalidationForOwner();
            } else {
                FocusTargetNodeKt.invalidateFocusTarget(this);
            }
        } else if (i == 3 && !ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
            try {
                if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                    focusTransactionManagerRequireTransactionManager.cancelTransaction();
                }
                focusTransactionManagerRequireTransactionManager.beginTransaction();
                setFocusState(FocusStateImpl.Inactive);
                focusTransactionManagerRequireTransactionManager.commitTransaction();
            } catch (Throwable th) {
                focusTransactionManagerRequireTransactionManager.commitTransaction();
                throw th;
            }
        }
        this.committedFocusState = null;
    }

    @Override // androidx.compose.p011ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            invalidateFocus$ui_release();
            return;
        }
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            dispatchFocusCallbacks$ui_release();
        }
    }

    @Override // androidx.compose.p011ui.focus.FocusTargetModifierNode
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @ReplaceWith(expression = "this.requestFocus()", imports = {}))
    public /* synthetic */ boolean requestFocus() {
        return mo10353requestFocus3ESFkO8(FocusDirection.INSTANCE.m10323getEnterdhqQ8s());
    }

    @Override // androidx.compose.p011ui.focus.FocusTargetModifierNode
    /* renamed from: requestFocus-3ESFkO8 */
    public boolean mo10353requestFocus3ESFkO8(int focusDirection) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zPerformRequestFocus = false;
            if (!fetchFocusProperties$ui_release().getCanFocus()) {
                Trace.endSection();
                return false;
            }
            if (ComposeUiFlags.isTrackFocusEnabled) {
                int i = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m10365performCustomRequestFocusMxy_nc0(this, focusDirection).ordinal()];
                if (i == 1) {
                    zPerformRequestFocus = FocusTransactionsKt.performRequestFocus(this);
                } else if (i == 2) {
                    zPerformRequestFocus = true;
                } else if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
                InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m10361invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m10361invoke() {
                        if (this.this$0.getNode().getIsAttached()) {
                            this.this$0.dispatchFocusCallbacks$ui_release();
                        }
                    }
                };
                try {
                    if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                        focusTransactionManagerRequireTransactionManager.cancelTransaction();
                    }
                    focusTransactionManagerRequireTransactionManager.beginTransaction();
                    focusTransactionManagerRequireTransactionManager.cancellationListener.add(interfaceC6469a);
                    int i8 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m10365performCustomRequestFocusMxy_nc0(this, focusDirection).ordinal()];
                    if (i8 == 1) {
                        zPerformRequestFocus = FocusTransactionsKt.performRequestFocus(this);
                    } else if (i8 == 2) {
                        zPerformRequestFocus = true;
                    } else if (i8 != 3 && i8 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } finally {
                    focusTransactionManagerRequireTransactionManager.commitTransaction();
                }
            }
            return zPerformRequestFocus;
        } finally {
            Trace.endSection();
        }
    }

    public void setFocusState(@NotNull FocusStateImpl focusStateImpl) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl);
    }

    @Override // androidx.compose.p011ui.focus.FocusTargetModifierNode
    /* renamed from: setFocusability-josRg5g */
    public void mo10354setFocusabilityjosRg5g(int i) {
        if (Focusability.m10373equalsimpl0(this.focusability, i)) {
            return;
        }
        this.focusability = i;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            if (getIsAttached() && isInitialized$ui_release()) {
                onObservedReadsChanged();
                return;
            }
            return;
        }
        if (getIsAttached() && this == DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode() && !Focusability.m10370canFocusimpl$ui_release(this.focusability, this)) {
            FocusTransactionsKt.clearFocus(this, true, true);
        }
    }

    public final void setPreviouslyFocusedChildHash(int i) {
        this.previouslyFocusedChildHash = i;
    }

    public /* synthetic */ FocusTargetNode(int i, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? Focusability.INSTANCE.m10377getAlwaysLCbbffg() : i, (i8 & 2) != 0 ? null : interfaceC6473e, (i8 & 4) != 0 ? null : interfaceC6471c, null);
    }

    @Override // androidx.compose.p011ui.focus.FocusTargetModifierNode
    @NotNull
    public FocusStateImpl getFocusState() {
        FocusStateImpl uncommittedFocusState;
        FocusOwner focusOwner;
        FocusTargetNode activeFocusTargetNode;
        NodeChain nodes;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            if (focusTransactionManager != null && (uncommittedFocusState = focusTransactionManager.getUncommittedFocusState(this)) != null) {
                return uncommittedFocusState;
            }
            FocusStateImpl focusStateImpl = this.committedFocusState;
            return focusStateImpl == null ? FocusStateImpl.Inactive : focusStateImpl;
        }
        if (getIsAttached() && (activeFocusTargetNode = (focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner()).getActiveFocusTargetNode()) != null) {
            if (this == activeFocusTargetNode) {
                return focusOwner.getIsFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active;
            }
            if (activeFocusTargetNode.getIsAttached()) {
                int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
                if (!activeFocusTargetNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent = activeFocusTargetNode.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
                while (layoutNodeRequireLayoutNode != null) {
                    if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                                Modifier.Node nodePop = parent;
                                MutableVector mutableVector = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) nodePop)) {
                                            return FocusStateImpl.ActiveParent;
                                        }
                                    } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i = 0;
                                        for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nodePop = delegate;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector.add(nodePop);
                                                        nodePop = null;
                                                    }
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(mutableVector);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                    parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
                }
            }
            return FocusStateImpl.Inactive;
        }
        return FocusStateImpl.Inactive;
    }

    private FocusTargetNode(int i, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c) {
        this.onFocusChange = interfaceC6473e;
        this.onDispatchEventsCompleted = interfaceC6471c;
        this.focusability = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final void dispatchFocusCallbacks$ui_release(@NotNull FocusState previousState, @NotNull FocusState newState) {
        NodeChain nodes;
        InterfaceC6473e interfaceC6473e;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (!AbstractC5830k.m5325b(previousState, newState) && (interfaceC6473e = this.onFocusChange) != null) {
            interfaceC6473e.invoke(previousState, newState);
        }
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(4096);
        int iM12314constructorimpl2 = NodeKind.m12314constructorimpl(1024);
        Modifier.Node node = getNode();
        int i = iM12314constructorimpl | iM12314constructorimpl2;
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & iM12314constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iM12314constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNodePop;
                                    if (activeFocusTargetNode == focusOwner.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(newState);
                                    }
                                } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i8 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        InterfaceC6471c interfaceC6471c = this.onDispatchEventsCompleted;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(this);
        }
    }
}
