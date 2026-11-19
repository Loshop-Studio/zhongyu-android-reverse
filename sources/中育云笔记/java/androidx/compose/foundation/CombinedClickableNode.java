package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.hapticfeedback.HapticFeedback;
import androidx.compose.p014ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    private final MutableLongObjectMap<DoubleKeyClickState> doubleKeyClickStates;
    private boolean hapticFeedbackEnabled;
    private final MutableLongObjectMap<InterfaceC10045g> longKeyPressJobs;
    private InterfaceC9529a onDoubleClick;
    private InterfaceC9529a onLongClick;
    private String onLongClickLabel;

    @StabilityInferred(parameters = 0)
    public static final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;
        private final InterfaceC10045g job;

        public DoubleKeyClickState(InterfaceC10045g interfaceC10045g) {
            this.job = interfaceC10045g;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        public final InterfaceC10045g getJob() {
            return this.job;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z10) {
            this.doubleTapMinTimeMillisElapsed = z10;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", m26211f = "Clickable.kt", m26212l = {770}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4 */
    public static final class C12034 extends SuspendLambda implements InterfaceC9545q {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C12034(InterfaceC11588c<? super C12034> interfaceC11588c) {
            super(3, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m27004invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m30647unboximpl(), (InterfaceC11588c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m27004invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C12034 c12034 = CombinedClickableNode.this.new C12034(interfaceC11588c);
            c12034.L$0 = pressGestureScope;
            c12034.J$0 = j10;
            return c12034.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode combinedClickableNode = CombinedClickableNode.this;
                    this.label = 1;
                    if (combinedClickableNode.m26916handlePressInteractiond4ec7I(pressGestureScope, j10, this) == objM25952f) {
                        return objM25952f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    public /* synthetic */ CombinedClickableNode(InterfaceC9529a interfaceC9529a, String str, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str2, Role role, AbstractC9972n abstractC9972n) {
        this(interfaceC9529a, str, interfaceC9529a2, interfaceC9529a3, z10, mutableInteractionSource, indicationNodeFactory, z11, str2, role);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void resetKeyPressState() {
        /*
            r24 = this;
            r0 = r24
            androidx.collection.MutableLongObjectMap<kotlinx.coroutines.g> r1 = r0.longKeyPressJobs
            java.lang.Object[] r2 = r1.values
            long[] r3 = r1.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = 0
            r13 = 1
            r14 = 8
            r15 = 0
            if (r4 < 0) goto L4d
            r5 = r15
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L18:
            r7 = r3[r5]
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r7
            long r11 = r11 << r9
            long r11 = r11 & r7
            long r11 = r11 & r20
            int r6 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r6 == 0) goto L48
            int r6 = r5 - r4
            int r6 = ~r6
            int r6 = r6 >>> 31
            int r6 = 8 - r6
            r11 = r15
        L30:
            if (r11 >= r6) goto L46
            long r22 = r7 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto L42
            int r12 = r5 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            kotlinx.coroutines.g r12 = (kotlinx.coroutines.InterfaceC10045g) r12
            kotlinx.coroutines.InterfaceC10045g.a.m20900a(r12, r10, r13, r10)
        L42:
            long r7 = r7 >> r14
            int r11 = r11 + 1
            goto L30
        L46:
            if (r6 != r14) goto L56
        L48:
            if (r5 == r4) goto L56
            int r5 = r5 + 1
            goto L18
        L4d:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L56:
            r1.clear()
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState> r1 = r0.doubleKeyClickStates
            java.lang.Object[] r2 = r1.values
            long[] r3 = r1.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L99
            r5 = r15
        L65:
            r6 = r3[r5]
            long r11 = ~r6
            long r11 = r11 << r9
            long r11 = r11 & r6
            long r11 = r11 & r20
            int r8 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r8 == 0) goto L94
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r11 = r15
        L78:
            if (r11 >= r8) goto L92
            long r22 = r6 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto L8e
            int r12 = r5 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r12 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r12
            kotlinx.coroutines.g r12 = r12.getJob()
            kotlinx.coroutines.InterfaceC10045g.a.m20900a(r12, r10, r13, r10)
        L8e:
            long r6 = r6 >> r14
            int r11 = r11 + 1
            goto L78
        L92:
            if (r8 != r14) goto L99
        L94:
            if (r5 == r4) goto L99
            int r5 = r5 + 1
            goto L65
        L99:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode.resetKeyPressState():void");
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new InterfaceC9529a() { // from class: androidx.compose.foundation.CombinedClickableNode.applyAdditionalSemantics.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    InterfaceC9529a interfaceC9529a = CombinedClickableNode.this.onLongClick;
                    if (interfaceC9529a != null) {
                        interfaceC9529a.invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, (!getEnabled() || this.onDoubleClick == null) ? null : new InterfaceC9540l() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27002invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m27002invokek4lQ0M(long j10) {
                InterfaceC9529a interfaceC9529a = CombinedClickableNode.this.onDoubleClick;
                if (interfaceC9529a != null) {
                    interfaceC9529a.invoke();
                }
            }
        }, (!getEnabled() || this.onLongClick == null) ? null : new InterfaceC9540l() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.3
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27003invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m27003invokek4lQ0M(long j10) {
                InterfaceC9529a interfaceC9529a = CombinedClickableNode.this.onLongClick;
                if (interfaceC9529a != null) {
                    interfaceC9529a.invoke();
                }
                if (CombinedClickableNode.this.getHapticFeedbackEnabled()) {
                    ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalHapticFeedback())).mo31602performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m31614getLongPress5zf0vsI());
                }
            }
        }, new C12034(null), new InterfaceC9540l() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.5
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27005invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m27005invokek4lQ0M(long j10) {
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode.this.getOnClick().invoke();
                }
            }
        }, interfaceC11588c);
        return objDetectTapGestures == AbstractC11725a.m25952f() ? objDetectTapGestures : C10786q.f26013a;
    }

    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void onCancelKeyInput() {
        resetKeyPressState();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public boolean mo26917onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        boolean z10;
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        if (this.onLongClick == null || this.longKeyPressJobs.get(jM31959getKeyZmokQxo) != null) {
            z10 = false;
        } else {
            this.longKeyPressJobs.set(jM31959getKeyZmokQxo, AbstractC11117h.m24726d(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, null));
            z10 = true;
        }
        DoubleKeyClickState doubleKeyClickState = this.doubleKeyClickStates.get(jM31959getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                InterfaceC10045g.a.m20900a(doubleKeyClickState.getJob(), null, 1, null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.remove(jM31959getKeyZmokQxo);
                    return z10;
                }
            } else {
                this.doubleKeyClickStates.remove(jM31959getKeyZmokQxo);
            }
        }
        return z10;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public boolean mo26918onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        InterfaceC9529a interfaceC9529a;
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        boolean z10 = false;
        if (this.longKeyPressJobs.get(jM31959getKeyZmokQxo) != null) {
            InterfaceC10045g interfaceC10045g = this.longKeyPressJobs.get(jM31959getKeyZmokQxo);
            if (interfaceC10045g != null) {
                if (interfaceC10045g.isActive()) {
                    InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
                } else {
                    z10 = true;
                }
            }
            this.longKeyPressJobs.remove(jM31959getKeyZmokQxo);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.get(jM31959getKeyZmokQxo) != null) {
                if (!z10 && (interfaceC9529a = this.onDoubleClick) != null) {
                    interfaceC9529a.invoke();
                }
                this.doubleKeyClickStates.remove(jM31959getKeyZmokQxo);
            } else if (!z10) {
                this.doubleKeyClickStates.set(jM31959getKeyZmokQxo, new DoubleKeyClickState(AbstractC11117h.m24726d(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, jM31959getKeyZmokQxo, null), 3, null)));
            }
        } else if (!z10) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        resetKeyPressState();
    }

    public final void setHapticFeedbackEnabled(boolean z10) {
        this.hapticFeedbackEnabled = z10;
    }

    /* renamed from: update-nSzSaCc, reason: not valid java name */
    public final void m27001updatenSzSaCc(InterfaceC9529a interfaceC9529a, String str, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str2, Role role) {
        boolean z11;
        if (!AbstractC9979u.m20289b(this.onLongClickLabel, str)) {
            this.onLongClickLabel = str;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.onLongClick == null) != (interfaceC9529a2 == null)) {
            disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            z11 = true;
        } else {
            z11 = false;
        }
        this.onLongClick = interfaceC9529a2;
        if ((this.onDoubleClick == null) != (interfaceC9529a3 == null)) {
            z11 = true;
        }
        this.onDoubleClick = interfaceC9529a3;
        boolean z12 = getEnabled() == z10 ? z11 : true;
        m26922updateCommonQzZPfjk(mutableInteractionSource, indicationNodeFactory, z10, str2, role, interfaceC9529a);
        if (z12) {
            resetPointerInputHandler();
        }
    }

    private CombinedClickableNode(InterfaceC9529a interfaceC9529a, String str, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z11, str2, role, interfaceC9529a, null);
        this.onLongClickLabel = str;
        this.onLongClick = interfaceC9529a2;
        this.onDoubleClick = interfaceC9529a3;
        this.hapticFeedbackEnabled = z10;
        this.longKeyPressJobs = LongObjectMapKt.mutableLongObjectMapOf();
        this.doubleKeyClickStates = LongObjectMapKt.mutableLongObjectMapOf();
    }
}
