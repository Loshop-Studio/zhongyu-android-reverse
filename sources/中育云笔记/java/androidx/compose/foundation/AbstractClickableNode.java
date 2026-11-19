package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.focus.Focusability;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.key.KeyInputModifierNode;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerEventType;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import sd.AbstractC11117h;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {
    private long centerOffset;
    private final MutableLongObjectMap<PressInteraction.Press> currentKeyPressInteractions;
    private boolean enabled;
    private final FocusableNode focusableNode;
    private HoverInteraction.Enter hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;
    private InterfaceC9529a onClick;
    private String onClickLabel;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;
    private final Object traverseKey;
    private MutableInteractionSource userProvidedInteractionSource;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(AbstractC9972n abstractC9972n) {
            this();
        }

        private TraverseKey() {
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC9529a);
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
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3, null);
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
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3, null);
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
            AbstractC9979u.m20291d(mutableInteractionSource);
            DelegatableNode delegatableNodeCreate = indicationNodeFactory.create(mutableInteractionSource);
            delegate(delegatableNodeCreate);
            this.indicationNode = delegatableNodeCreate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            if (r19 == 0) goto L8
            r0.initializeIndicationAndInteractionSourceIfNeeded()
            return
        L8:
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r0.interactionSource
            if (r1 == 0) goto L62
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r0.currentKeyPressInteractions
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L62
            r4 = 0
            r5 = r4
        L19:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L33:
            if (r10 >= r8) goto L5b
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L57
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
            sd.i0 r12 = r0.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1 r15 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1
            r13 = 0
            r15.<init>(r0, r11, r13)
            r16 = 3
            r17 = 0
            r14 = 0
            sd.AbstractC11109f.m24706d(r12, r13, r14, r15, r16, r17)
        L57:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L33
        L5b:
            if (r8 != r9) goto L62
        L5d:
            if (r5 == r3) goto L62
            int r5 = r5 + 1
            goto L19
        L62:
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r0.currentKeyPressInteractions
            r1.clear()
            r0.onCancelKeyInput()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.onFocusChange(boolean):void");
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            AbstractC9979u.m20291d(role);
            SemanticsPropertiesKt.m32747setRolekuIjeqM(semanticsPropertyReceiver, role.m32727unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new InterfaceC9529a() { // from class: androidx.compose.foundation.AbstractClickableNode.applySemantics.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
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

    public abstract Object clickPointerInput(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c);

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

    public final InterfaceC9529a getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    public final Object m26916handlePressInteractiond4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (objM20748e = AbstractC10006d.m20748e(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j10, mutableInteractionSource, this, null), interfaceC11588c)) != AbstractC11725a.m25952f()) ? C10786q.f26013a : objM20748e;
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

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
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
    public abstract boolean mo26917onClickKeyDownEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo26918onClickKeyUpEventZmokQxo(KeyEvent keyEvent);

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

    @Override // androidx.compose.p014ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo26919onKeyEventZmokQxo(KeyEvent keyEvent) {
        boolean z10;
        initializeIndicationAndInteractionSourceIfNeeded();
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        if (this.enabled && ClickableKt.m26997isPressZmokQxo(keyEvent)) {
            if (this.currentKeyPressInteractions.containsKey(jM31959getKeyZmokQxo)) {
                z10 = false;
            } else {
                PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
                this.currentKeyPressInteractions.set(jM31959getKeyZmokQxo, press);
                if (this.interactionSource != null) {
                    AbstractC11117h.m24726d(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                }
                z10 = true;
            }
            return mo26917onClickKeyDownEventZmokQxo(keyEvent) || z10;
        }
        if (this.enabled && ClickableKt.m26995isClickZmokQxo(keyEvent)) {
            PressInteraction.Press pressRemove = this.currentKeyPressInteractions.remove(jM31959getKeyZmokQxo);
            if (pressRemove != null) {
                if (this.interactionSource != null) {
                    AbstractC11117h.m24726d(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2(this, pressRemove, null), 3, null);
                }
                mo26918onClickKeyUpEventZmokQxo(keyEvent);
            }
            if (pressRemove != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        long jM33678getCenterozmzZPI = IntSizeKt.m33678getCenterozmzZPI(j10);
        float fM33629getXimpl = IntOffset.m33629getXimpl(jM33678getCenterozmzZPI);
        float fM33630getYimpl = IntOffset.m33630getYimpl(jM33678getCenterozmzZPI);
        this.centerOffset = Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33629getXimpl) << 32) | (Float.floatToRawIntBits(fM33630getYimpl) & 4294967295L));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && pointerEventPass == PointerEventPass.Main) {
            int iM32046getType7fucELk = pointerEvent.m32046getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m32053equalsimpl0(iM32046getType7fucELk, companion.m32057getEnter7fucELk())) {
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
            } else if (PointerEventType.m32053equalsimpl0(iM32046getType7fucELk, companion.m32058getExit7fucELk())) {
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3
                @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    Object objClickPointerInput = this.this$0.clickPointerInput(pointerInputScope, interfaceC11588c);
                    return objClickPointerInput == AbstractC11725a.m25952f() ? objClickPointerInput : C10786q.f26013a;
                }
            }));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        }
    }

    @Override // androidx.compose.p014ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo26921onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    public final C10786q resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* renamed from: updateCommon-QzZPfjk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m26922updateCommonQzZPfjk(androidx.compose.foundation.interaction.MutableInteractionSource r3, androidx.compose.foundation.IndicationNodeFactory r4, boolean r5, java.lang.String r6, androidx.compose.p014ui.semantics.Role r7, p181hd.InterfaceC9529a r8) {
        /*
            r2 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r2.userProvidedInteractionSource
            boolean r0 = kotlin.jvm.internal.AbstractC9979u.m20289b(r0, r3)
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
            boolean r0 = kotlin.jvm.internal.AbstractC9979u.m20289b(r0, r4)
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
            androidx.compose.p014ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
            r2.enabled = r5
        L37:
            java.lang.String r4 = r2.onClickLabel
            boolean r4 = kotlin.jvm.internal.AbstractC9979u.m20289b(r4, r6)
            if (r4 != 0) goto L44
            r2.onClickLabel = r6
            androidx.compose.p014ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
        L44:
            androidx.compose.ui.semantics.Role r4 = r2.role
            boolean r4 = kotlin.jvm.internal.AbstractC9979u.m20289b(r4, r7)
            if (r4 != 0) goto L51
            r2.role = r7
            androidx.compose.p014ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.m26922updateCommonQzZPfjk(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, java.lang.String, androidx.compose.ui.semantics.Role, hd.a):void");
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z10;
        this.onClick = interfaceC9529a;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.Companion.m30575getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = LongObjectMapKt.mutableLongObjectMapOf();
        this.centerOffset = Offset.Companion.m30653getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = TraverseKey;
    }
}
