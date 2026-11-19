package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.hapticfeedback.HapticFeedback;
import androidx.compose.p013ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    private final MutableLongObjectMap<DoubleKeyClickState> doubleKeyClickStates;
    private boolean hapticFeedbackEnabled;
    private final MutableLongObjectMap<InterfaceC9212n> longKeyPressJobs;
    private InterfaceC10559a onDoubleClick;
    private InterfaceC10559a onLongClick;
    private String onLongClickLabel;

    @StabilityInferred(parameters = 0)
    public static final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;
        private final InterfaceC9212n job;

        public DoubleKeyClickState(InterfaceC9212n interfaceC9212n) {
            this.job = interfaceC9212n;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        public final InterfaceC9212n getJob() {
            return this.job;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z10) {
            this.doubleTapMinTimeMillisElapsed = z10;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", m17801f = "Clickable.kt", m17802l = {770}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4 */
    public static final class C11734 extends SuspendLambda implements InterfaceC10575q {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C11734(InterfaceC9324c<? super C11734> interfaceC9324c) {
            super(3, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m20402invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m24045unboximpl(), (InterfaceC9324c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m20402invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C11734 c11734 = CombinedClickableNode.this.new C11734(interfaceC9324c);
            c11734.L$0 = pressGestureScope;
            c11734.J$0 = j10;
            return c11734.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode combinedClickableNode = CombinedClickableNode.this;
                    this.label = 1;
                    if (combinedClickableNode.m20314handlePressInteractiond4ec7I(pressGestureScope, j10, this) == objM17291f) {
                        return objM17291f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public /* synthetic */ CombinedClickableNode(InterfaceC10559a interfaceC10559a, String str, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str2, Role role, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a, str, interfaceC10559a2, interfaceC10559a3, z10, mutableInteractionSource, indicationNodeFactory, z11, str2, role);
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
            androidx.collection.MutableLongObjectMap<kotlinx.coroutines.n> r1 = r0.longKeyPressJobs
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
            kotlinx.coroutines.n r12 = (kotlinx.coroutines.InterfaceC9212n) r12
            kotlinx.coroutines.InterfaceC9212n.a.m16777a(r12, r10, r13, r10)
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
            kotlinx.coroutines.n r12 = r12.getJob()
            kotlinx.coroutines.InterfaceC9212n.a.m16777a(r12, r10, r13, r10)
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
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new InterfaceC10559a() { // from class: androidx.compose.foundation.CombinedClickableNode.applyAdditionalSemantics.1
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    InterfaceC10559a interfaceC10559a = CombinedClickableNode.this.onLongClick;
                    if (interfaceC10559a != null) {
                        interfaceC10559a.invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, (!getEnabled() || this.onDoubleClick == null) ? null : new InterfaceC10570l() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20400invokek4lQ0M(((Offset) obj).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m20400invokek4lQ0M(long j10) {
                InterfaceC10559a interfaceC10559a = CombinedClickableNode.this.onDoubleClick;
                if (interfaceC10559a != null) {
                    interfaceC10559a.invoke();
                }
            }
        }, (!getEnabled() || this.onLongClick == null) ? null : new InterfaceC10570l() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.3
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20401invokek4lQ0M(((Offset) obj).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m20401invokek4lQ0M(long j10) {
                InterfaceC10559a interfaceC10559a = CombinedClickableNode.this.onLongClick;
                if (interfaceC10559a != null) {
                    interfaceC10559a.invoke();
                }
                if (CombinedClickableNode.this.getHapticFeedbackEnabled()) {
                    ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalHapticFeedback())).mo25000performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m25012getLongPress5zf0vsI());
                }
            }
        }, new C11734(null), new InterfaceC10570l() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.5
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20403invokek4lQ0M(((Offset) obj).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m20403invokek4lQ0M(long j10) {
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode.this.getOnClick().invoke();
                }
            }
        }, interfaceC9324c);
        return objDetectTapGestures == AbstractC9434a.m17291f() ? objDetectTapGestures : C8736p.f16368a;
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
    public boolean mo20315onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        boolean z10;
        long jM25357getKeyZmokQxo = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
        if (this.onLongClick == null || this.longKeyPressJobs.get(jM25357getKeyZmokQxo) != null) {
            z10 = false;
        } else {
            this.longKeyPressJobs.set(jM25357getKeyZmokQxo, AbstractC8839h.m14861d(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, null));
            z10 = true;
        }
        DoubleKeyClickState doubleKeyClickState = this.doubleKeyClickStates.get(jM25357getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                InterfaceC9212n.a.m16777a(doubleKeyClickState.getJob(), null, 1, null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.remove(jM25357getKeyZmokQxo);
                    return z10;
                }
            } else {
                this.doubleKeyClickStates.remove(jM25357getKeyZmokQxo);
            }
        }
        return z10;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public boolean mo20316onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        InterfaceC10559a interfaceC10559a;
        long jM25357getKeyZmokQxo = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
        boolean z10 = false;
        if (this.longKeyPressJobs.get(jM25357getKeyZmokQxo) != null) {
            InterfaceC9212n interfaceC9212n = this.longKeyPressJobs.get(jM25357getKeyZmokQxo);
            if (interfaceC9212n != null) {
                if (interfaceC9212n.isActive()) {
                    InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
                } else {
                    z10 = true;
                }
            }
            this.longKeyPressJobs.remove(jM25357getKeyZmokQxo);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.get(jM25357getKeyZmokQxo) != null) {
                if (!z10 && (interfaceC10559a = this.onDoubleClick) != null) {
                    interfaceC10559a.invoke();
                }
                this.doubleKeyClickStates.remove(jM25357getKeyZmokQxo);
            } else if (!z10) {
                this.doubleKeyClickStates.set(jM25357getKeyZmokQxo, new DoubleKeyClickState(AbstractC8839h.m14861d(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, jM25357getKeyZmokQxo, null), 3, null)));
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
    public final void m20399updatenSzSaCc(InterfaceC10559a interfaceC10559a, String str, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str2, Role role) {
        boolean z11;
        if (!AbstractC9133u.m16128b(this.onLongClickLabel, str)) {
            this.onLongClickLabel = str;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.onLongClick == null) != (interfaceC10559a2 == null)) {
            disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            z11 = true;
        } else {
            z11 = false;
        }
        this.onLongClick = interfaceC10559a2;
        if ((this.onDoubleClick == null) != (interfaceC10559a3 == null)) {
            z11 = true;
        }
        this.onDoubleClick = interfaceC10559a3;
        boolean z12 = getEnabled() == z10 ? z11 : true;
        m20320updateCommonQzZPfjk(mutableInteractionSource, indicationNodeFactory, z10, str2, role, interfaceC10559a);
        if (z12) {
            resetPointerInputHandler();
        }
    }

    private CombinedClickableNode(InterfaceC10559a interfaceC10559a, String str, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z11, str2, role, interfaceC10559a, null);
        this.onLongClickLabel = str;
        this.onLongClick = interfaceC10559a2;
        this.onDoubleClick = interfaceC10559a3;
        this.hapticFeedbackEnabled = z10;
        this.longKeyPressJobs = LongObjectMapKt.mutableLongObjectMapOf();
        this.doubleKeyClickStates = LongObjectMapKt.mutableLongObjectMapOf();
    }
}
