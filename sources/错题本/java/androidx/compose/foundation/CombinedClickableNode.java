package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u00017Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJx\u0010\u001d\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u0004*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0014ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0014ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u000f\u0010(\u001a\u00020\u0004H\u0014¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010+R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, m5110d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "Lkotlin/Function0;", "Ld6/s;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "", "hapticFeedbackEnabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "enabled", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "<init>", "(Lr6/a;Ljava/lang/String;Lr6/a;Lr6/a;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/internal/e;)V", "resetKeyPressState", "()V", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "clickPointerInput", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lh6/c;)Ljava/lang/Object;", "update-nSzSaCc", "(Lr6/a;Ljava/lang/String;Lr6/a;Lr6/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;)V", "update", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyDownEvent", "onClickKeyUpEvent-ZmokQxo", "onClickKeyUpEvent", "onCancelKeyInput", "onReset", "Ljava/lang/String;", "Lr6/a;", "Z", "getHapticFeedbackEnabled", "()Z", "setHapticFeedbackEnabled", "(Z)V", "Landroidx/collection/MutableLongObjectMap;", "Lkotlinx/coroutines/w0;", "longKeyPressJobs", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "doubleKeyClickStates", "DoubleKeyClickState", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n+ 2 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1327:1\n397#2,3:1328\n354#2,6:1331\n364#2,3:1338\n367#2,9:1342\n400#2:1351\n397#2,3:1352\n354#2,6:1355\n364#2,3:1362\n367#2,9:1366\n400#2:1375\n1399#3:1337\n1270#3:1341\n1399#3:1361\n1270#3:1365\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n*L\n948#1:1328,3\n948#1:1331,6\n948#1:1338,3\n948#1:1342,9\n948#1:1351\n952#1:1352,3\n952#1:1355,6\n952#1:1362,3\n952#1:1366,9\n952#1:1375\n948#1:1337\n948#1:1341\n952#1:1361\n952#1:1365\n*E\n"})
/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {

    @NotNull
    private final MutableLongObjectMap<DoubleKeyClickState> doubleKeyClickStates;
    private boolean hapticFeedbackEnabled;

    @NotNull
    private final MutableLongObjectMap<InterfaceC6013w0> longKeyPressJobs;

    @Nullable
    private InterfaceC6469a onDoubleClick;

    @Nullable
    private InterfaceC6469a onLongClick;

    @Nullable
    private String onLongClickLabel;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "", "Lkotlinx/coroutines/w0;", "job", "<init>", "(Lkotlinx/coroutines/w0;)V", "Lkotlinx/coroutines/w0;", "getJob", "()Lkotlinx/coroutines/w0;", "", "doubleTapMinTimeMillisElapsed", "Z", "getDoubleTapMinTimeMillisElapsed", "()Z", "setDoubleTapMinTimeMillisElapsed", "(Z)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;

        @NotNull
        private final InterfaceC6013w0 job;

        public DoubleKeyClickState(@NotNull InterfaceC6013w0 interfaceC6013w0) {
            this.job = interfaceC6013w0;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        @NotNull
        public final InterfaceC6013w0 getJob() {
            return this.job;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z8) {
            this.doubleTapMinTimeMillisElapsed = z8;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/PressGestureScope;Landroidx/compose/ui/geometry/Offset;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", m5303f = "Clickable.kt", m5304i = {}, m5305l = {770}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4 */
    public static final class C07644 extends SuspendLambda implements InterfaceC6474f {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C07644(InterfaceC5631c<? super C07644> interfaceC5631c) {
            super(3, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6474f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m6808invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m10451unboximpl(), (InterfaceC5631c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m6808invoked4ec7I(PressGestureScope pressGestureScope, long j7, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C07644 c07644 = CombinedClickableNode.this.new C07644(interfaceC5631c);
            c07644.L$0 = pressGestureScope;
            c07644.J$0 = j7;
            return c07644.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j7 = this.J$0;
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode combinedClickableNode = CombinedClickableNode.this;
                    this.label = 1;
                    if (combinedClickableNode.m6720handlePressInteractiond4ec7I(pressGestureScope, j7, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    public /* synthetic */ CombinedClickableNode(InterfaceC6469a interfaceC6469a, String str, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, boolean z8, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z9, String str2, Role role, AbstractC5824e abstractC5824e) {
        this(interfaceC6469a, str, interfaceC6469a2, interfaceC6469a3, z8, mutableInteractionSource, indicationNodeFactory, z9, str2, role);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void resetKeyPressState() {
        /*
            r24 = this;
            r0 = r24
            androidx.collection.MutableLongObjectMap<kotlinx.coroutines.w0> r1 = r0.longKeyPressJobs
            java.lang.Object[] r2 = r1.values
            long[] r3 = r1.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            kotlinx.coroutines.w0 r10 = (kotlinx.coroutines.InterfaceC6013w0) r10
            r10.cancel(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.clear()
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState> r1 = r0.doubleKeyClickStates
            java.lang.Object[] r2 = r1.values
            long[] r3 = r1.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La5
            r6 = r14
        L71:
            r7 = r3[r6]
            long r9 = ~r7
            long r9 = r9 << r21
            long r9 = r9 & r7
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto La0
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r14
        L84:
            if (r10 >= r9) goto L9e
            long r22 = r7 & r18
            int r15 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r15 >= 0) goto L9a
            int r15 = r6 << 3
            int r15 = r15 + r10
            r15 = r2[r15]
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r15 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r15
            kotlinx.coroutines.w0 r15 = r15.getJob()
            r15.cancel(r5)
        L9a:
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto L84
        L9e:
            if (r9 != r13) goto La5
        La0:
            if (r6 == r4) goto La5
            int r6 = r6 + 1
            goto L71
        La5:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode.resetKeyPressState():void");
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new InterfaceC6469a() { // from class: androidx.compose.foundation.CombinedClickableNode.applyAdditionalSemantics.1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    InterfaceC6469a interfaceC6469a = CombinedClickableNode.this.onLongClick;
                    if (interfaceC6469a != null) {
                        interfaceC6469a.invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    @Nullable
    public Object clickPointerInput(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, (!getEnabled() || this.onDoubleClick == null) ? null : new InterfaceC6471c() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m6806invokek4lQ0M(((Offset) obj).m10451unboximpl());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m6806invokek4lQ0M(long j7) {
                InterfaceC6469a interfaceC6469a = CombinedClickableNode.this.onDoubleClick;
                if (interfaceC6469a != null) {
                    interfaceC6469a.invoke();
                }
            }
        }, (!getEnabled() || this.onLongClick == null) ? null : new InterfaceC6471c() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.3
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m6807invokek4lQ0M(((Offset) obj).m10451unboximpl());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m6807invokek4lQ0M(long j7) {
                InterfaceC6469a interfaceC6469a = CombinedClickableNode.this.onLongClick;
                if (interfaceC6469a != null) {
                    interfaceC6469a.invoke();
                }
                if (CombinedClickableNode.this.getHapticFeedbackEnabled()) {
                    ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalHapticFeedback())).mo11406performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m11418getLongPress5zf0vsI());
                }
            }
        }, new C07644(null), new InterfaceC6471c() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.5
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m6809invokek4lQ0M(((Offset) obj).m10451unboximpl());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m6809invokek4lQ0M(long j7) {
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode.this.getOnClick().invoke();
                }
            }
        }, interfaceC5631c);
        return objDetectTapGestures == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectTapGestures : C5443s.f8405a;
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
    public boolean mo6721onClickKeyDownEventZmokQxo(@NotNull KeyEvent event) {
        boolean z8;
        long jM11763getKeyZmokQxo = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
        if (this.onLongClick == null || this.longKeyPressJobs.get(jM11763getKeyZmokQxo) != null) {
            z8 = false;
        } else {
            this.longKeyPressJobs.set(jM11763getKeyZmokQxo, AbstractC6014x.m5651v(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3));
            z8 = true;
        }
        DoubleKeyClickState doubleKeyClickState = this.doubleKeyClickStates.get(jM11763getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                doubleKeyClickState.getJob().cancel(null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.remove(jM11763getKeyZmokQxo);
                    return z8;
                }
            } else {
                this.doubleKeyClickStates.remove(jM11763getKeyZmokQxo);
            }
        }
        return z8;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public boolean mo6722onClickKeyUpEventZmokQxo(@NotNull KeyEvent event) {
        InterfaceC6469a interfaceC6469a;
        long jM11763getKeyZmokQxo = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
        boolean z8 = false;
        if (this.longKeyPressJobs.get(jM11763getKeyZmokQxo) != null) {
            InterfaceC6013w0 interfaceC6013w0 = this.longKeyPressJobs.get(jM11763getKeyZmokQxo);
            if (interfaceC6013w0 != null) {
                if (interfaceC6013w0.isActive()) {
                    interfaceC6013w0.cancel(null);
                } else {
                    z8 = true;
                }
            }
            this.longKeyPressJobs.remove(jM11763getKeyZmokQxo);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.get(jM11763getKeyZmokQxo) != null) {
                if (!z8 && (interfaceC6469a = this.onDoubleClick) != null) {
                    interfaceC6469a.invoke();
                }
                this.doubleKeyClickStates.remove(jM11763getKeyZmokQxo);
                return true;
            }
            if (!z8) {
                this.doubleKeyClickStates.set(jM11763getKeyZmokQxo, new DoubleKeyClickState(AbstractC6014x.m5651v(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, jM11763getKeyZmokQxo, null), 3)));
                return true;
            }
        } else if (!z8) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        resetKeyPressState();
    }

    public final void setHapticFeedbackEnabled(boolean z8) {
        this.hapticFeedbackEnabled = z8;
    }

    /* renamed from: update-nSzSaCc, reason: not valid java name */
    public final void m6805updatenSzSaCc(@NotNull InterfaceC6469a onClick, @Nullable String onLongClickLabel, @Nullable InterfaceC6469a onLongClick, @Nullable InterfaceC6469a onDoubleClick, @Nullable MutableInteractionSource interactionSource, @Nullable IndicationNodeFactory indicationNodeFactory, boolean enabled, @Nullable String onClickLabel, @Nullable Role role) {
        boolean z8;
        if (!AbstractC5830k.m5325b(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            z8 = true;
        } else {
            z8 = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z8 = true;
        }
        this.onDoubleClick = onDoubleClick;
        boolean z9 = getEnabled() == enabled ? z8 : true;
        m6726updateCommonQzZPfjk(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
        if (z9) {
            resetPointerInputHandler();
        }
    }

    private CombinedClickableNode(InterfaceC6469a interfaceC6469a, String str, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, boolean z8, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z9, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z9, str2, role, interfaceC6469a, null);
        this.onLongClickLabel = str;
        this.onLongClick = interfaceC6469a2;
        this.onDoubleClick = interfaceC6469a3;
        this.hapticFeedbackEnabled = z8;
        this.longKeyPressJobs = LongObjectMapKt.mutableLongObjectMapOf();
        this.doubleKeyClickStates = LongObjectMapKt.mutableLongObjectMapOf();
    }
}
