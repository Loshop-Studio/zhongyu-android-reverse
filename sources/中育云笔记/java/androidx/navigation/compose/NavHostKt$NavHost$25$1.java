package androidx.navigation.compose;

import androidx.activity.BackEventCompat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", m26211f = "NavHost.kt", m26212l = {523}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$25$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ State<List<NavBackStackEntry>> $currentBackStack$delegate;
    final /* synthetic */ MutableState<Boolean> $inPredictiveBack$delegate;
    final /* synthetic */ MutableFloatState $progress$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$25$1(ComposeNavigator composeNavigator, State<? extends List<NavBackStackEntry>> state, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState, InterfaceC11588c<? super NavHostKt$NavHost$25$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$composeNavigator = composeNavigator;
        this.$currentBackStack$delegate = state;
        this.$progress$delegate = mutableFloatState;
        this.$inPredictiveBack$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.$composeNavigator, this.$currentBackStack$delegate, this.$progress$delegate, this.$inPredictiveBack$delegate, interfaceC11588c);
        navHostKt$NavHost$25$1.L$0 = obj;
        return navHostKt$NavHost$25$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        NavBackStackEntry navBackStackEntry;
        NavBackStackEntry navBackStackEntry2;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = (InterfaceC11594c) this.L$0;
                if (NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() > 1) {
                    this.$progress$delegate.setFloatValue(0.0f);
                    navBackStackEntry = (NavBackStackEntry) AbstractC10947g0.m23957z0(NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate));
                    ComposeNavigator composeNavigator = this.$composeNavigator;
                    AbstractC9979u.m20291d(navBackStackEntry);
                    composeNavigator.prepareForTransition(navBackStackEntry);
                    this.$composeNavigator.prepareForTransition((NavBackStackEntry) NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).get(NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() - 2));
                } else {
                    navBackStackEntry = null;
                }
                final State<List<NavBackStackEntry>> state = this.$currentBackStack$delegate;
                final MutableState<Boolean> mutableState = this.$inPredictiveBack$delegate;
                final MutableFloatState mutableFloatState = this.$progress$delegate;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.navigation.compose.NavHostKt$NavHost$25$1.1
                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((BackEventCompat) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }

                    public final Object emit(BackEventCompat backEventCompat, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        if (NavHostKt.NavHost$lambda$38(state).size() > 1) {
                            NavHostKt.NavHost$lambda$44(mutableState, true);
                            mutableFloatState.setFloatValue(backEventCompat.getProgress());
                        }
                        return C10786q.f26013a;
                    }
                };
                this.L$0 = navBackStackEntry;
                this.label = 1;
                if (interfaceC11594c.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
                navBackStackEntry2 = navBackStackEntry;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navBackStackEntry2 = (NavBackStackEntry) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            if (NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() > 1) {
                NavHostKt.NavHost$lambda$44(this.$inPredictiveBack$delegate, false);
                ComposeNavigator composeNavigator2 = this.$composeNavigator;
                AbstractC9979u.m20291d(navBackStackEntry2);
                composeNavigator2.popBackStack(navBackStackEntry2, false);
            }
        } catch (CancellationException unused) {
            if (NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() > 1) {
                NavHostKt.NavHost$lambda$44(this.$inPredictiveBack$delegate, false);
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11594c interfaceC11594c, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((NavHostKt$NavHost$25$1) create(interfaceC11594c, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
