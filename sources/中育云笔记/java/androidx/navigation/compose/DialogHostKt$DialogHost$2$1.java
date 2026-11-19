package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", m26211f = "DialogHost.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DialogHostKt$DialogHost$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ State<Set<NavBackStackEntry>> $transitionInProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogHostKt$DialogHost$2$1(State<? extends Set<NavBackStackEntry>> state, DialogNavigator dialogNavigator, SnapshotStateList<NavBackStackEntry> snapshotStateList, InterfaceC11588c<? super DialogHostKt$DialogHost$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$transitionInProgress$delegate = state;
        this.$dialogNavigator = dialogNavigator;
        this.$dialogsToDispose = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new DialogHostKt$DialogHost$2$1(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        Set<NavBackStackEntry> setDialogHost$lambda$1 = DialogHostKt.DialogHost$lambda$1(this.$transitionInProgress$delegate);
        DialogNavigator dialogNavigator = this.$dialogNavigator;
        SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
        for (NavBackStackEntry navBackStackEntry : setDialogHost$lambda$1) {
            if (!((List) dialogNavigator.getBackStack$navigation_compose_release().getValue()).contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                dialogNavigator.onTransitionComplete$navigation_compose_release(navBackStackEntry);
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((DialogHostKt$DialogHost$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
