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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

@Metadata(m13557d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/Bu\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\b\u0010\u001e\u001a\u00020\u0005H\u0014J\u001a\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0014ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0014ø\u0001\u0000¢\u0006\u0004\b%\u0010#J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0002Jv\u0010(\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\b)J\f\u0010*\u001a\u00020\u0005*\u00020+H\u0016J\u0012\u0010,\u001a\u00020\u0005*\u00020-H\u0096@¢\u0006\u0002\u0010.R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m13558d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "onClick", "Lkotlin/Function0;", "", "onLongClickLabel", "", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "onClickLabel", "role", "Landroidx/compose/ui/semantics/Role;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "doubleKeyClickStates", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "getHapticFeedbackEnabled", "()Z", "setHapticFeedbackEnabled", "(Z)V", "longKeyPressJobs", "Lkotlinx/coroutines/Job;", "onCancelKeyInput", "onClickKeyDownEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyUpEvent", "onClickKeyUpEvent-ZmokQxo", "onReset", "resetKeyPressState", "update", "update-nSzSaCc", "applyAdditionalSemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "clickPointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DoubleKeyClickState", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n+ 2 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1327:1\n397#2,3:1328\n354#2,6:1331\n364#2,3:1338\n367#2,9:1342\n400#2:1351\n397#2,3:1352\n354#2,6:1355\n364#2,3:1362\n367#2,9:1366\n400#2:1375\n1399#3:1337\n1270#3:1341\n1399#3:1361\n1270#3:1365\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickableNode\n*L\n948#1:1328,3\n948#1:1331,6\n948#1:1338,3\n948#1:1342,9\n948#1:1351\n952#1:1352,3\n952#1:1355,6\n952#1:1362,3\n952#1:1366,9\n952#1:1375\n948#1:1337\n948#1:1341\n952#1:1361\n952#1:1365\n*E\n"})
/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    private final MutableLongObjectMap<DoubleKeyClickState> doubleKeyClickStates;
    private boolean hapticFeedbackEnabled;
    private final MutableLongObjectMap<Job> longKeyPressJobs;
    private Function0<Unit> onDoubleClick;
    private Function0<Unit> onLongClick;
    private String onLongClickLabel;

    @StabilityInferred(parameters = 0)
    @Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m13558d2 = {"Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "doubleTapMinTimeMillisElapsed", "", "getDoubleTapMinTimeMillisElapsed", "()Z", "setDoubleTapMinTimeMillisElapsed", "(Z)V", "getJob", "()Lkotlinx/coroutines/Job;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;
        private final Job job;

        public DoubleKeyClickState(Job job) {
            this.job = job;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        public final Job getJob() {
            return this.job;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z9) {
            this.doubleTapMinTimeMillisElapsed = z9;
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", m13596f = "Clickable.kt", m13597i = {}, m13598l = {770}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4 */
    public static final class C11444 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C11444(Continuation<? super C11444> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m17242invoked4ec7I(pressGestureScope, offset.m20745unboximpl(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m17242invoked4ec7I(PressGestureScope pressGestureScope, long j10, Continuation<? super Unit> continuation) {
            C11444 c11444 = CombinedClickableNode.this.new C11444(continuation);
            c11444.L$0 = pressGestureScope;
            c11444.J$0 = j10;
            return c11444.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode combinedClickableNode = CombinedClickableNode.this;
                    this.label = 1;
                    if (combinedClickableNode.m17156handlePressInteractiond4ec7I(pressGestureScope, j10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CombinedClickableNode(Function0 function0, String str, Function0 function02, Function0 function03, boolean z9, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str2, Role role, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, str, function02, function03, z9, mutableInteractionSource, indicationNodeFactory, z10, str2, role);
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
            androidx.collection.MutableLongObjectMap<kotlinx.coroutines.Job> r1 = r0.longKeyPressJobs
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
            kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r12, r10, r13, r10)
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
            kotlinx.coroutines.Job r12 = r12.getJob()
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r12, r10, r13, r10)
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
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.CombinedClickableNode.applyAdditionalSemantics.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    Function0 function0 = CombinedClickableNode.this.onLongClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, (!getEnabled() || this.onDoubleClick == null) ? null : new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m17240invokek4lQ0M(offset.m20745unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m17240invokek4lQ0M(long j10) {
                Function0 function0 = CombinedClickableNode.this.onDoubleClick;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }, (!getEnabled() || this.onLongClick == null) ? null : new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m17241invokek4lQ0M(offset.m20745unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m17241invokek4lQ0M(long j10) {
                Function0 function0 = CombinedClickableNode.this.onLongClick;
                if (function0 != null) {
                    function0.invoke();
                }
                if (CombinedClickableNode.this.getHapticFeedbackEnabled()) {
                    ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(CombinedClickableNode.this, CompositionLocalsKt.getLocalHapticFeedback())).mo21698performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m21710getLongPress5zf0vsI());
                }
            }
        }, new C11444(null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickableNode.clickPointerInput.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m17243invokek4lQ0M(offset.m20745unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m17243invokek4lQ0M(long j10) {
                if (CombinedClickableNode.this.getEnabled()) {
                    CombinedClickableNode.this.getOnClick().invoke();
                }
            }
        }, continuation);
        return objDetectTapGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures : Unit.INSTANCE;
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
    public boolean mo17157onClickKeyDownEventZmokQxo(KeyEvent event) {
        boolean z9;
        long jM22055getKeyZmokQxo = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
        if (this.onLongClick == null || this.longKeyPressJobs.get(jM22055getKeyZmokQxo) != null) {
            z9 = false;
        } else {
            this.longKeyPressJobs.set(jM22055getKeyZmokQxo, BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, null));
            z9 = true;
        }
        DoubleKeyClickState doubleKeyClickState = this.doubleKeyClickStates.get(jM22055getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                Job.DefaultImpls.cancel$default(doubleKeyClickState.getJob(), (CancellationException) null, 1, (Object) null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.remove(jM22055getKeyZmokQxo);
                    return z9;
                }
            } else {
                this.doubleKeyClickStates.remove(jM22055getKeyZmokQxo);
            }
        }
        return z9;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public boolean mo17158onClickKeyUpEventZmokQxo(KeyEvent event) {
        Function0<Unit> function0;
        long jM22055getKeyZmokQxo = KeyEvent_androidKt.m22055getKeyZmokQxo(event);
        boolean z9 = false;
        if (this.longKeyPressJobs.get(jM22055getKeyZmokQxo) != null) {
            Job job = this.longKeyPressJobs.get(jM22055getKeyZmokQxo);
            if (job != null) {
                if (job.isActive()) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                } else {
                    z9 = true;
                }
            }
            this.longKeyPressJobs.remove(jM22055getKeyZmokQxo);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.get(jM22055getKeyZmokQxo) != null) {
                if (!z9 && (function0 = this.onDoubleClick) != null) {
                    function0.invoke();
                }
                this.doubleKeyClickStates.remove(jM22055getKeyZmokQxo);
            } else if (!z9) {
                this.doubleKeyClickStates.set(jM22055getKeyZmokQxo, new DoubleKeyClickState(BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, jM22055getKeyZmokQxo, null), 3, null)));
            }
        } else if (!z9) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        resetKeyPressState();
    }

    public final void setHapticFeedbackEnabled(boolean z9) {
        this.hapticFeedbackEnabled = z9;
    }

    /* renamed from: update-nSzSaCc, reason: not valid java name */
    public final void m17239updatenSzSaCc(Function0<Unit> onClick, String onLongClickLabel, Function0<Unit> onLongClick, Function0<Unit> onDoubleClick, MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role) {
        boolean z9;
        if (!Intrinsics.areEqual(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            z9 = true;
        } else {
            z9 = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z9 = true;
        }
        this.onDoubleClick = onDoubleClick;
        boolean z10 = getEnabled() == enabled ? z9 : true;
        m17162updateCommonQzZPfjk(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
        if (z10) {
            resetPointerInputHandler();
        }
    }

    private CombinedClickableNode(Function0<Unit> function0, String str, Function0<Unit> function02, Function0<Unit> function03, boolean z9, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z10, str2, role, function0, null);
        this.onLongClickLabel = str;
        this.onLongClick = function02;
        this.onDoubleClick = function03;
        this.hapticFeedbackEnabled = z9;
        this.longKeyPressJobs = LongObjectMapKt.mutableLongObjectMapOf();
        this.doubleKeyClickStates = LongObjectMapKt.mutableLongObjectMapOf();
    }
}
