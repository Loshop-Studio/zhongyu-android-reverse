package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable = 0;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", m26211f = "Clickable.kt", m26212l = {696}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableNode$clickPointerInput$2 */
    public static final class C11982 extends SuspendLambda implements InterfaceC9545q {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C11982(InterfaceC11588c<? super C11982> interfaceC11588c) {
            super(3, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m26999invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m30647unboximpl(), (InterfaceC11588c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m26999invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C11982 c11982 = ClickableNode.this.new C11982(interfaceC11588c);
            c11982.L$0 = pressGestureScope;
            c11982.J$0 = j10;
            return c11982.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode clickableNode = ClickableNode.this;
                    this.label = 1;
                    if (clickableNode.m26916handlePressInteractiond4ec7I(pressGestureScope, j10, this) == objM25952f) {
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

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC9529a);
    }

    public static /* synthetic */ Object clickPointerInput$suspendImpl(ClickableNode clickableNode, PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, clickableNode.new C11982(null), new InterfaceC9540l() { // from class: androidx.compose.foundation.ClickableNode.clickPointerInput.3
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27000invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m27000invokek4lQ0M(long j10) {
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode.this.getOnClick().invoke();
                }
            }
        }, interfaceC11588c);
        return objDetectTapAndPress == AbstractC11725a.m25952f() ? objDetectTapAndPress : C10786q.f26013a;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return clickPointerInput$suspendImpl(this, pointerInputScope, interfaceC11588c);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo26917onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public final boolean mo26918onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        getOnClick().invoke();
        return true;
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m26998updateQzZPfjk(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a) {
        m26922updateCommonQzZPfjk(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC9529a);
    }

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a) {
        super(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC9529a, null);
    }
}
