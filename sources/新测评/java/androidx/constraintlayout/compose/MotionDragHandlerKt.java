package androidx.constraintlayout.compose;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.C2831xe3d9cdbd;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.constraintlayout.motion.widget.Key;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(m13557d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\fH\u0082@¢\u0006\u0002\u0010\u0012\u001a$\u0010\u0013\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¨\u0006\u001b"}, m13558d2 = {"detectDragGesturesWhenNeeded", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onAcceptFirstDown", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "change", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "motionPointerInput", "Landroidx/compose/ui/Modifier;", "key", "", Key.MOTIONPROGRESS, "Landroidx/compose/runtime/MutableFloatState;", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "constraintlayout-compose_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMotionDragHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionDragHandler.kt\nandroidx/constraintlayout/compose/MotionDragHandlerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,195:1\n135#2:196\n*S KotlinDebug\n*F\n+ 1 MotionDragHandler.kt\nandroidx/constraintlayout/compose/MotionDragHandlerKt\n*L\n55#1:196\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionDragHandlerKt {

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", m13596f = "MotionDragHandler.kt", m13597i = {0, 1, 1, 1}, m13598l = {166, 174, 183}, m13599m = "invokeSuspend", m13600n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop"}, m13601s = {"L$0", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 */
    public static final class C31872 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Boolean> $onAcceptFirstDown;
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31872(Function1<? super Offset, Boolean> function1, Function1<? super Offset, Unit> function12, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C31872> continuation) {
            super(2, continuation);
            this.$onAcceptFirstDown = function1;
            this.$onDragStart = function12;
            this.$onDrag = function2;
            this.$onDragCancel = function0;
            this.$onDragEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31872 c31872 = new C31872(this.$onAcceptFirstDown, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            c31872.L$0 = obj;
            return c31872;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C31872) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
        
            if (r12 == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[PHI: r1 r4 r5 r8 r12
          0x0096: PHI (r1v5 kotlin.jvm.internal.Ref$LongRef) = (r1v4 kotlin.jvm.internal.Ref$LongRef), (r1v12 kotlin.jvm.internal.Ref$LongRef) binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r4v8 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r4v7 androidx.compose.ui.input.pointer.PointerInputChange)
          (r4v11 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r5v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r5v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r5v10 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r8v3 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) = 
          (r8v2 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2)
          (r8v6 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2)
         binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r12v8 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:24:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionDragHandlerKt.C31872.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWhenNeeded(PointerInputScope pointerInputScope, Function1<? super Offset, Boolean> function1, Function1<? super Offset, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C31872(function1, function12, function2, function02, function0, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    @ExperimentalMotionApi
    public static final Modifier motionPointerInput(Modifier modifier, final Object obj, final MutableFloatState mutableFloatState, final MotionMeasurer motionMeasurer) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("motionPointerInput");
                inspectorInfo.getProperties().set("key", obj);
                inspectorInfo.getProperties().set(Key.MOTIONPROGRESS, mutableFloatState);
                inspectorInfo.getProperties().set("measurer", motionMeasurer);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt.motionPointerInput.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(146198586);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(146198586, i10, -1, "androidx.constraintlayout.compose.motionPointerInput.<anonymous> (MotionDragHandler.kt:61)");
                }
                if (!motionMeasurer.getTransition().hasOnSwipe()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifier2;
                }
                boolean zChanged = composer.changed(obj);
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                MutableFloatState mutableFloatState2 = mutableFloatState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new TransitionHandler(motionMeasurer2, mutableFloatState2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TransitionHandler transitionHandler = (TransitionHandler) objRememberedValue;
                boolean zChanged2 = composer.changed(obj);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = ChannelKt.Channel$default(-1, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Channel channel = (Channel) objRememberedValue2;
                Object obj2 = obj;
                boolean zChangedInstance = composer.changedInstance(transitionHandler) | composer.changedInstance(channel);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new MotionDragHandlerKt$motionPointerInput$2$1$1(transitionHandler, channel, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.LaunchedEffect(obj2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
                Object obj3 = obj;
                boolean zChangedInstance2 = composer.changedInstance(transitionHandler) | composer.changedInstance(channel);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new MotionDragHandlerKt$motionPointerInput$2$2$1(transitionHandler, channel, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierThen = modifier2.then(new SuspendPointerInputElement(obj3, null, null, new C2831xe3d9cdbd((Function2) objRememberedValue4), 6, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        });
    }
}
