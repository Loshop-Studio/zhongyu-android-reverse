package androidx.compose.material3;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1", m26211f = "NavigationDrawer.android.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(DrawerState drawerState, DrawerPredictiveBackState drawerPredictiveBackState, InterfaceC11588c<? super NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$drawerState = drawerState;
        this.$drawerPredictiveBackState = drawerPredictiveBackState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(this.$drawerState, this.$drawerPredictiveBackState, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (this.$drawerState.isClosed()) {
            this.$drawerPredictiveBackState.clear();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
