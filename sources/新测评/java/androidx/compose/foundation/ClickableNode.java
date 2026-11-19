package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
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

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014JL\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rø\u0001\u0000¢\u0006\u0002\b\u0018J\u0012\u0010\u0019\u001a\u00020\u000e*\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m13558d2 = {"Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "onClickKeyDownEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyUpEvent", "onClickKeyUpEvent-ZmokQxo", "update", "update-QzZPfjk", "clickPointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable = 0;

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", m13596f = "Clickable.kt", m13597i = {}, m13598l = {696}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.ClickableNode$clickPointerInput$2 */
    public static final class C11392 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C11392(Continuation<? super C11392> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m17237invoked4ec7I(pressGestureScope, offset.m20745unboximpl(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m17237invoked4ec7I(PressGestureScope pressGestureScope, long j10, Continuation<? super Unit> continuation) {
            C11392 c11392 = ClickableNode.this.new C11392(continuation);
            c11392.L$0 = pressGestureScope;
            c11392.J$0 = j10;
            return c11392.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode clickableNode = ClickableNode.this;
                    this.label = 1;
                    if (clickableNode.m17156handlePressInteractiond4ec7I(pressGestureScope, j10, this) == coroutine_suspended) {
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

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z9, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z9, str, role, function0);
    }

    public static /* synthetic */ Object clickPointerInput$suspendImpl(ClickableNode clickableNode, PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, clickableNode.new C11392(null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.ClickableNode.clickPointerInput.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m17238invokek4lQ0M(offset.m20745unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m17238invokek4lQ0M(long j10) {
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode.this.getOnClick().invoke();
                }
            }
        }, continuation);
        return objDetectTapAndPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return clickPointerInput$suspendImpl(this, pointerInputScope, continuation);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo17157onClickKeyDownEventZmokQxo(KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public final boolean mo17158onClickKeyUpEventZmokQxo(KeyEvent event) {
        getOnClick().invoke();
        return true;
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m17236updateQzZPfjk(MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role, Function0<Unit> onClick) {
        m17162updateCommonQzZPfjk(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
    }

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z9, String str, Role role, Function0<Unit> function0) {
        super(mutableInteractionSource, indicationNodeFactory, z9, str, role, function0, null);
    }
}
