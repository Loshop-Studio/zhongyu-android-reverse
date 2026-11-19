package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1", m17801f = "NavigationDrawer.kt", m17802l = {1146}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NavigationDrawerKt$Scrim$dismissDrawer$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10559a $onClose;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$dismissDrawer$1$1(InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super NavigationDrawerKt$Scrim$dismissDrawer$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$onClose = interfaceC10559a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        NavigationDrawerKt$Scrim$dismissDrawer$1$1 navigationDrawerKt$Scrim$dismissDrawer$1$1 = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(this.$onClose, interfaceC9324c);
        navigationDrawerKt$Scrim$dismissDrawer$1$1.L$0 = obj;
        return navigationDrawerKt$Scrim$dismissDrawer$1$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((NavigationDrawerKt$Scrim$dismissDrawer$1$1) create(pointerInputScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final InterfaceC10559a interfaceC10559a = this.$onClose;
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1.1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m22290invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m22290invokek4lQ0M(long j10) {
                    interfaceC10559a.invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, interfaceC10570l, this, 7, null) == objM17291f) {
                return objM17291f;
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
