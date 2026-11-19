package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable = 0;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", m17801f = "Clickable.kt", m17802l = {696}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableNode$clickPointerInput$2 */
    public static final class C11682 extends SuspendLambda implements InterfaceC10575q {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C11682(InterfaceC9324c<? super C11682> interfaceC9324c) {
            super(3, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m20397invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m24045unboximpl(), (InterfaceC9324c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m20397invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C11682 c11682 = ClickableNode.this.new C11682(interfaceC9324c);
            c11682.L$0 = pressGestureScope;
            c11682.J$0 = j10;
            return c11682.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j10 = this.J$0;
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode clickableNode = ClickableNode.this;
                    this.label = 1;
                    if (clickableNode.m20314handlePressInteractiond4ec7I(pressGestureScope, j10, this) == objM17291f) {
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

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC10559a interfaceC10559a, AbstractC9126n abstractC9126n) {
        this(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC10559a);
    }

    public static /* synthetic */ Object clickPointerInput$suspendImpl(ClickableNode clickableNode, PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, clickableNode.new C11682(null), new InterfaceC10570l() { // from class: androidx.compose.foundation.ClickableNode.clickPointerInput.3
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20398invokek4lQ0M(((Offset) obj).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m20398invokek4lQ0M(long j10) {
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode.this.getOnClick().invoke();
                }
            }
        }, interfaceC9324c);
        return objDetectTapAndPress == AbstractC9434a.m17291f() ? objDetectTapAndPress : C8736p.f16368a;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return clickPointerInput$suspendImpl(this, pointerInputScope, interfaceC9324c);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo20315onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public final boolean mo20316onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        getOnClick().invoke();
        return true;
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m20396updateQzZPfjk(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC10559a interfaceC10559a) {
        m20320updateCommonQzZPfjk(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC10559a);
    }

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC10559a interfaceC10559a) {
        super(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC10559a, null);
    }
}
