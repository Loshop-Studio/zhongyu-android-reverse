package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.focus.Focusability;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.key.KeyInputModifierNode;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\b \u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001sBE\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0011*\u00020\u0015H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0011*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJP\u0010\u001d\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0004ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0011¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0011H\u0004¢\u0006\u0004\b!\u0010\u001fJ(\u0010*\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020\u0011¢\u0006\u0004\b+\u0010\u001fJ\u0018\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H$ø\u0001\u0000¢\u0006\u0004\b1\u0010/J\u001a\u00104\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H$ø\u0001\u0000¢\u0006\u0004\b3\u0010/J\u000f\u00105\u001a\u00020\u0011H\u0014¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00107\u001a\u00020\n2\u0006\u0010-\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b6\u0010/J\u0011\u00108\u001a\u00020\u0011*\u00020\u0018¢\u0006\u0004\b8\u0010\u001aJ\u0011\u00109\u001a\u0004\u0018\u00010\u0011H\u0004¢\u0006\u0004\b9\u0010:J\u001f\u0010@\u001a\u00020\u0011*\u00020;2\u0006\u0010=\u001a\u00020<H\u0084@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020\nH\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0011H\u0002¢\u0006\u0004\bF\u0010\u001fJ\u000f\u0010G\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010BJ\u000f\u0010H\u001a\u00020\u0011H\u0002¢\u0006\u0004\bH\u0010\u001fJ\u000f\u0010I\u001a\u00020\u0011H\u0002¢\u0006\u0004\bI\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010KR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010LR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010MR$\u0010\u000b\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010BR0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010BR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020_0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010h\u001a\u00020<8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010j\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010JR\u0016\u0010k\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010OR\u001a\u0010m\u001a\u00020l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0011\u0010r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bq\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, m5110d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "Ld6/s;", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "clickPointerInput", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "updateCommon-QzZPfjk", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;)V", "updateCommon", "onAttach", "()V", "onDetach", "disposeInteractions", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onClickKeyDownEvent-ZmokQxo", "onClickKeyDownEvent", "onClickKeyUpEvent-ZmokQxo", "onClickKeyUpEvent", "onCancelKeyInput", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "applySemantics", "resetPointerInputHandler", "()Ld6/s;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLh6/c;)Ljava/lang/Object;", "handlePressInteraction", "shouldLazilyCreateIndication", "()Z", "isFocused", "onFocusChange", "(Z)V", "initializeIndicationAndInteractionSourceIfNeeded", "delayPressInteraction", "emitHoverEnter", "emitHoverExit", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/IndicationNodeFactory;", "Ljava/lang/String;", "Landroidx/compose/ui/semantics/Role;", "<set-?>", "Z", "getEnabled", "Lr6/a;", "getOnClick", "()Lr6/a;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "Landroidx/compose/foundation/FocusableNode;", "focusableNode", "Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "indicationNode", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/collection/MutableLongObjectMap;", "currentKeyPressInteractions", "Landroidx/collection/MutableLongObjectMap;", "centerOffset", "J", "userProvidedInteractionSource", "lazilyCreateIndication", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "TraverseKey", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1327:1\n1#2:1328\n397#3,3:1329\n354#3,6:1332\n364#3,3:1339\n367#3,9:1343\n400#3:1352\n397#3,3:1353\n354#3,6:1356\n364#3,3:1363\n367#3,9:1367\n400#3:1376\n1399#4:1338\n1270#4:1342\n1399#4:1362\n1270#4:1366\n159#5:1377\n30#6:1378\n53#7,3:1379\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n1102#1:1329,3\n1102#1:1332,6\n1102#1:1339,3\n1102#1:1343,9\n1102#1:1352\n1118#1:1353,3\n1118#1:1356,6\n1118#1:1363,3\n1118#1:1367,9\n1118#1:1376\n1102#1:1338\n1102#1:1342\n1118#1:1362\n1118#1:1366\n1146#1:1377\n1146#1:1378\n1146#1:1379,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {
    private long centerOffset;

    @NotNull
    private final MutableLongObjectMap<PressInteraction.Press> currentKeyPressInteractions;
    private boolean enabled;

    @NotNull
    private final FocusableNode focusableNode;

    @Nullable
    private HoverInteraction.Enter hoverInteraction;

    @Nullable
    private DelegatableNode indicationNode;

    @Nullable
    private IndicationNodeFactory indicationNodeFactory;

    @Nullable
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;

    @NotNull
    private InterfaceC6469a onClick;

    @Nullable
    private String onClickLabel;

    @Nullable
    private SuspendingPointerInputModifierNode pointerInputNode;

    @Nullable
    private PressInteraction.Press pressInteraction;

    @Nullable
    private Role role;
    private final boolean shouldAutoInvalidate;

    @NotNull
    private final Object traverseKey;

    @Nullable
    private MutableInteractionSource userProvidedInteractionSource;

    /* renamed from: TraverseKey, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "()V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.foundation.AbstractClickableNode$TraverseKey, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z8, String str, Role role, InterfaceC6469a interfaceC6469a, AbstractC5824e abstractC5824e) {
        this(mutableInteractionSource, indicationNodeFactory, z8, str, role, interfaceC6469a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return ClickableKt.hasScrollableContainer(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3);
            }
            this.hoverInteraction = enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3);
            }
            this.hoverInteraction = null;
        }
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.indicationNode == null && (indicationNodeFactory = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = InteractionSourceKt.MutableInteractionSource();
            }
            this.focusableNode.update(this.interactionSource);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            AbstractC5830k.m5327d(mutableInteractionSource);
            DelegatableNode delegatableNodeCreate = indicationNodeFactory.create(mutableInteractionSource);
            delegate(delegatableNodeCreate);
            this.indicationNode = delegatableNodeCreate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(boolean r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L6
            r13.initializeIndicationAndInteractionSourceIfNeeded()
            return
        L6:
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = r13.interactionSource
            if (r14 == 0) goto L5c
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r14 = r13.currentKeyPressInteractions
            java.lang.Object[] r0 = r14.values
            long[] r14 = r14.metadata
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L5c
            r2 = 0
            r3 = r2
        L17:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L57
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L31:
            if (r8 >= r6) goto L55
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L51
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            androidx.compose.foundation.interaction.PressInteraction$Press r9 = (androidx.compose.foundation.interaction.PressInteraction.Press) r9
            kotlinx.coroutines.v r10 = r13.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1 r11 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1
            r12 = 0
            r11.<init>(r13, r9, r12)
            r9 = 3
            kotlinx.coroutines.AbstractC6014x.m5651v(r10, r12, r12, r11, r9)
        L51:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L31
        L55:
            if (r6 != r7) goto L5c
        L57:
            if (r3 == r1) goto L5c
            int r3 = r3 + 1
            goto L17
        L5c:
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r14 = r13.currentKeyPressInteractions
            r14.clear()
            r13.onCancelKeyInput()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.onFocusChange(boolean):void");
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    public void applyAdditionalSemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public final void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            AbstractC5830k.m5327d(role);
            SemanticsPropertiesKt.m12551setRolekuIjeqM(semanticsPropertyReceiver, role.getValue());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new InterfaceC6469a() { // from class: androidx.compose.foundation.AbstractClickableNode.applySemantics.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                AbstractClickableNode.this.getOnClick().invoke();
                return Boolean.TRUE;
            }
        });
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    @Nullable
    public abstract Object clickPointerInput(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void disposeInteractions() {
        /*
            r15 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r15.interactionSource
            if (r0 == 0) goto L68
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r15.pressInteraction
            if (r1 == 0) goto L10
            androidx.compose.foundation.interaction.PressInteraction$Cancel r2 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r2.<init>(r1)
            r0.tryEmit(r2)
        L10:
            androidx.compose.foundation.interaction.HoverInteraction$Enter r1 = r15.hoverInteraction
            if (r1 == 0) goto L1c
            androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r2.<init>(r1)
            r0.tryEmit(r2)
        L1c:
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r15.currentKeyPressInteractions
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L68
            r4 = 0
            r5 = r4
        L29:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L63
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L43:
            if (r10 >= r8) goto L61
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
            androidx.compose.foundation.interaction.PressInteraction$Cancel r12 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r12.<init>(r11)
            r0.tryEmit(r12)
        L5d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L43
        L61:
            if (r8 != r9) goto L68
        L63:
            if (r5 == r3) goto L68
            int r5 = r5 + 1
            goto L29
        L68:
            r0 = 0
            r15.pressInteraction = r0
            r15.hoverInteraction = r0
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r15.currentKeyPressInteractions
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.disposeInteractions():void");
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final InterfaceC6469a getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.p011ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Nullable
    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    public final Object m6720handlePressInteractiond4ec7I(@NotNull PressGestureScope pressGestureScope, long j7, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (objM5637h = AbstractC6014x.m5637h(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j7, mutableInteractionSource, this, null), interfaceC5631c)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? C5443s.f8405a : objM5637h;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    public void onCancelKeyInput() {
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (enter = this.hoverInteraction) != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    /* renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo6721onClickKeyDownEventZmokQxo(@NotNull KeyEvent event);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo6722onClickKeyUpEventZmokQxo(@NotNull KeyEvent event);

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[RETURN] */
    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6723onKeyEventZmokQxo(@org.jetbrains.annotations.NotNull android.view.KeyEvent r10) {
        /*
            r9 = this;
            r9.initializeIndicationAndInteractionSourceIfNeeded()
            long r0 = androidx.compose.p011ui.input.key.KeyEvent_androidKt.m11763getKeyZmokQxo(r10)
            boolean r2 = r9.enabled
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L45
            boolean r2 = androidx.compose.foundation.ClickableKt.m6786access$isPressZmokQxo(r10)
            if (r2 == 0) goto L45
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r9.currentKeyPressInteractions
            boolean r2 = r2.containsKey(r0)
            if (r2 != 0) goto L3b
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r7 = r9.centerOffset
            r2.<init>(r7, r5)
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r7 = r9.currentKeyPressInteractions
            r7.set(r0, r2)
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r9.interactionSource
            if (r0 == 0) goto L39
            kotlinx.coroutines.v r0 = r9.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1 r1 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1
            r1.<init>(r9, r2, r5)
            kotlinx.coroutines.AbstractC6014x.m5651v(r0, r5, r5, r1, r3)
        L39:
            r0 = r4
            goto L3c
        L3b:
            r0 = r6
        L3c:
            boolean r10 = r9.mo6721onClickKeyDownEventZmokQxo(r10)
            if (r10 != 0) goto L6e
            if (r0 == 0) goto L6f
            goto L6e
        L45:
            boolean r2 = r9.enabled
            if (r2 == 0) goto L6f
            boolean r2 = androidx.compose.foundation.ClickableKt.m6785access$isClickZmokQxo(r10)
            if (r2 == 0) goto L6f
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r9.currentKeyPressInteractions
            java.lang.Object r0 = r2.remove(r0)
            androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
            if (r0 == 0) goto L6c
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r9.interactionSource
            if (r1 == 0) goto L69
            kotlinx.coroutines.v r1 = r9.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2 r2 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2
            r2.<init>(r9, r0, r5)
            kotlinx.coroutines.AbstractC6014x.m5651v(r1, r5, r5, r2, r3)
        L69:
            r9.mo6722onClickKeyUpEventZmokQxo(r10)
        L6c:
            if (r0 == 0) goto L6f
        L6e:
            return r4
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.mo6723onKeyEventZmokQxo(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo6724onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        long jM13482getCenterozmzZPI = IntSizeKt.m13482getCenterozmzZPI(bounds);
        float fM13433getXimpl = IntOffset.m13433getXimpl(jM13482getCenterozmzZPI);
        float fM13434getYimpl = IntOffset.m13434getYimpl(jM13482getCenterozmzZPI);
        this.centerOffset = Offset.m10433constructorimpl((Float.floatToRawIntBits(fM13433getXimpl) << 32) | (Float.floatToRawIntBits(fM13434getYimpl) & 4294967295L));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && pass == PointerEventPass.Main) {
            int type = pointerEvent.getType();
            PointerEventType.Companion companion = PointerEventType.INSTANCE;
            if (PointerEventType.m11857equalsimpl0(type, companion.m11861getEnter7fucELk())) {
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
            } else if (PointerEventType.m11857equalsimpl0(type, companion.m11862getExit7fucELk())) {
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3
                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    Object objClickPointerInput = this.this$0.clickPointerInput(pointerInputScope, interfaceC5631c);
                    return objClickPointerInput == CoroutineSingletons.COROUTINE_SUSPENDED ? objClickPointerInput : C5443s.f8405a;
                }
            }));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo6724onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo6725onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        return false;
    }

    @Nullable
    public final C5443s resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* renamed from: updateCommon-QzZPfjk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6726updateCommonQzZPfjk(@org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r3, @org.jetbrains.annotations.Nullable androidx.compose.foundation.IndicationNodeFactory r4, boolean r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.semantics.Role r7, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6469a r8) {
        /*
            r2 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r2.userProvidedInteractionSource
            boolean r0 = kotlin.jvm.internal.AbstractC5830k.m5325b(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.disposeInteractions()
            r2.userProvidedInteractionSource = r3
            r2.interactionSource = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            androidx.compose.foundation.IndicationNodeFactory r0 = r2.indicationNodeFactory
            boolean r0 = kotlin.jvm.internal.AbstractC5830k.m5325b(r0, r4)
            if (r0 != 0) goto L1e
            r2.indicationNodeFactory = r4
            r3 = r1
        L1e:
            boolean r4 = r2.enabled
            if (r4 == r5) goto L37
            if (r5 == 0) goto L2a
            androidx.compose.foundation.FocusableNode r4 = r2.focusableNode
            r2.delegate(r4)
            goto L32
        L2a:
            androidx.compose.foundation.FocusableNode r4 = r2.focusableNode
            r2.undelegate(r4)
            r2.disposeInteractions()
        L32:
            androidx.compose.p011ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
            r2.enabled = r5
        L37:
            java.lang.String r4 = r2.onClickLabel
            boolean r4 = kotlin.jvm.internal.AbstractC5830k.m5325b(r4, r6)
            if (r4 != 0) goto L44
            r2.onClickLabel = r6
            androidx.compose.p011ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
        L44:
            androidx.compose.ui.semantics.Role r4 = r2.role
            boolean r4 = kotlin.jvm.internal.AbstractC5830k.m5325b(r4, r7)
            if (r4 != 0) goto L51
            r2.role = r7
            androidx.compose.p011ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
        L51:
            r2.onClick = r8
            boolean r4 = r2.lazilyCreateIndication
            boolean r5 = r2.shouldLazilyCreateIndication()
            if (r4 == r5) goto L68
            boolean r4 = r2.shouldLazilyCreateIndication()
            r2.lazilyCreateIndication = r4
            if (r4 != 0) goto L68
            androidx.compose.ui.node.DelegatableNode r4 = r2.indicationNode
            if (r4 != 0) goto L68
            goto L69
        L68:
            r1 = r3
        L69:
            if (r1 == 0) goto L7e
            androidx.compose.ui.node.DelegatableNode r3 = r2.indicationNode
            if (r3 != 0) goto L73
            boolean r4 = r2.lazilyCreateIndication
            if (r4 != 0) goto L7e
        L73:
            if (r3 == 0) goto L78
            r2.undelegate(r3)
        L78:
            r3 = 0
            r2.indicationNode = r3
            r2.initializeIndicationAndInteractionSourceIfNeeded()
        L7e:
            androidx.compose.foundation.FocusableNode r3 = r2.focusableNode
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.interactionSource
            r3.update(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.m6726updateCommonQzZPfjk(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, java.lang.String, androidx.compose.ui.semantics.Role, r6.a):void");
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z8, String str, Role role, InterfaceC6469a interfaceC6469a) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z8;
        this.onClick = interfaceC6469a;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.INSTANCE.m10379getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = LongObjectMapKt.mutableLongObjectMapOf();
        this.centerOffset = Offset.INSTANCE.m10457getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = INSTANCE;
    }
}
